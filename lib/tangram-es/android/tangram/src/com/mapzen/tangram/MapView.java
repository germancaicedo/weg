package com.mapzen.tangram;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class MapView extends FrameLayout {

    protected GLSurfaceView glSurfaceView;
    protected AsyncTask<Void, Void, MapController> getMapTask;

    public MapView(Context context) {

        super(context);

        configureGLSurfaceView();

    }

    public MapView(Context context, AttributeSet attrs) {

        super(context, attrs);

        configureGLSurfaceView();

    }

    /**
     * Interface for receiving a {@code MapController} once it is ready to be used
     */
    public interface OnMapReadyCallback {

        /**
         * Called when the map is ready to be used
         * @param mapController A non-null {@code MapController} instance for this {@code MapView}
         */
        void onMapReady(MapController mapController);

    }

    /**
     * Construct a {@code MapController} asynchronously; may only be called from the UI thread
     * @param callback The object to receive the resulting MapController in a callback;
     * the callback will be made on the UI thread
     * @param sceneFilePath Location of the YAML scene file within the asset bundle
     */
    public void getMapAsync(@NonNull final OnMapReadyCallback callback,
                            @NonNull final String sceneFilePath) {

        final Context context = getContext();

        if (getMapTask != null) {
            getMapTask.cancel(true);
        }

        getMapTask = new AsyncTask<Void, Void, MapController>() {

            @Override
            protected MapController doInBackground(Void... params) {
                return new MapController(context, sceneFilePath);
            }

            @Override
            protected void onPostExecute(MapController map) {
                map.setView(glSurfaceView);
                addView(glSurfaceView);
                callback.onMapReady(map);
            }

        }.execute();

    }

    protected void configureGLSurfaceView() {

        glSurfaceView = new GLSurfaceView(getContext());
        glSurfaceView.setEGLContextClientVersion(2);
        glSurfaceView.setPreserveEGLContextOnPause(true);
        glSurfaceView.setEGLConfigChooser(new ConfigChooser(8, 8, 8, 0, 16, 0));

    }

    /**
     * You must call this method from the parent Activity/Fragment's corresponding method.
     */
    public void onCreate(Bundle savedInstanceState) {

    }

    /**
     * You must call this method from the parent Activity/Fragment's corresponding method.
     */
    public void onResume() {

    }

    /**
     * You must call this method from the parent Activity/Fragment's corresponding method.
     */
    public void onPause() {

    }

    /**
     * You must call this method from the parent Activity/Fragment's corresponding method.
     */
    public void onDestroy() {

        if (getMapTask != null) {
            getMapTask.cancel(true);
        }

    }

    /**
     * You must call this method from the parent Activity/Fragment's corresponding method.
     */
    public void onLowMemory() {

    }

}

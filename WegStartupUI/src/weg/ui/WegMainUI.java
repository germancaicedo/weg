/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weg.ui;

/**
 *
 * @author Maurice
 */
public class WegMainUI extends javax.swing.JFrame {

    /**
     * Creates new form WegMainUI
     */
    public WegMainUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelStatus = new javax.swing.JPanel();
        jButtonSettings = new javax.swing.JButton();
        jButtonAbout = new javax.swing.JButton();
        jPanelGPS = new javax.swing.JPanel();
        jLabelLongitude = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelGPSFix = new javax.swing.JLabel();
        jLabelGpsFixIndicator = new javax.swing.JLabel();
        jLabelNumSatData = new javax.swing.JLabel();
        jLabelLatiData = new javax.swing.JLabel();
        jLabelLatData = new javax.swing.JLabel();
        jLabelNumSatellites1 = new javax.swing.JLabel();
        jLabelUTC = new javax.swing.JLabel();
        jLabelUTC1 = new javax.swing.JLabel();
        jLabelLocalTime = new javax.swing.JLabel();
        jLabelLocalTimeData = new javax.swing.JLabel();
        jButtonGotoTangram = new javax.swing.JButton();
        jPanelCamera = new javax.swing.JPanel();
        jButtonGotoCamera = new javax.swing.JButton();
        jPanel4TempBaro = new javax.swing.JPanel();
        jLabelTemerature = new javax.swing.JLabel();
        jLabelBarometer = new javax.swing.JLabel();
        jPanelGpsDirection = new javax.swing.JPanel();
        jLabelCompass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelStatus.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));
        jPanelStatus.setPreferredSize(new java.awt.Dimension(400, 200));

        jButtonSettings.setText("Settings");
        jButtonSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSettingsActionPerformed(evt);
            }
        });

        jButtonAbout.setText("About");
        jButtonAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelStatusLayout = new javax.swing.GroupLayout(jPanelStatus);
        jPanelStatus.setLayout(jPanelStatusLayout);
        jPanelStatusLayout.setHorizontalGroup(
            jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonSettings)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                .addComponent(jButtonAbout)
                .addContainerGap())
        );
        jPanelStatusLayout.setVerticalGroup(
            jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSettings)
                    .addComponent(jButtonAbout))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jPanelGPS.setBorder(javax.swing.BorderFactory.createTitledBorder("GPS"));

        jLabelLongitude.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelLongitude.setText("Latitude:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Longitude: ");

        jLabelGPSFix.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelGPSFix.setText("GPS Fixed");

        jLabelGpsFixIndicator.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelGpsFixIndicator.setForeground(new java.awt.Color(51, 153, 0));
        jLabelGpsFixIndicator.setText("•");

        jLabelNumSatData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNumSatData.setText("99");

        jLabelLatiData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelLatiData.setText("N 2307.1256");

        jLabelLatData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelLatData.setText("E 12016.4438");

        jLabelNumSatellites1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNumSatellites1.setText("Satellites: ");

        jLabelUTC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelUTC.setText("UTC:");

        jLabelUTC1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelUTC1.setText("064951.000");

        jLabelLocalTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelLocalTime.setText("Local Time: ");

        jLabelLocalTimeData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelLocalTimeData.setText("Tue Oct 15 12:19:40 ");

        jButtonGotoTangram.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButtonGotoTangram.setText("MAP");
        jButtonGotoTangram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGotoTangramActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelGPSLayout = new javax.swing.GroupLayout(jPanelGPS);
        jPanelGPS.setLayout(jPanelGPSLayout);
        jPanelGPSLayout.setHorizontalGroup(
            jPanelGPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGPSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGPSLayout.createSequentialGroup()
                        .addComponent(jLabelLongitude, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelLatiData, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelGPSLayout.createSequentialGroup()
                        .addGroup(jPanelGPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelGPSLayout.createSequentialGroup()
                                .addComponent(jLabelUTC)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelUTC1))
                            .addGroup(jPanelGPSLayout.createSequentialGroup()
                                .addComponent(jLabelLocalTime)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelLocalTimeData)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelGPSLayout.createSequentialGroup()
                        .addGroup(jPanelGPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelGPSLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelLatData))
                            .addGroup(jPanelGPSLayout.createSequentialGroup()
                                .addComponent(jLabelGPSFix)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelGpsFixIndicator))
                            .addGroup(jPanelGPSLayout.createSequentialGroup()
                                .addComponent(jLabelNumSatellites1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelNumSatData)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGotoTangram)
                        .addGap(36, 36, 36))))
        );
        jPanelGPSLayout.setVerticalGroup(
            jPanelGPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGPSLayout.createSequentialGroup()
                .addGroup(jPanelGPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGPSLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelGPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLongitude)
                            .addComponent(jLabelLatiData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelGPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabelLatData))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelGPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelGPSFix)
                            .addComponent(jLabelGpsFixIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelGPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNumSatellites1)
                            .addComponent(jLabelNumSatData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGPSLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGotoTangram, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanelGPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUTC)
                    .addComponent(jLabelUTC1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelGPSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLocalTime)
                    .addComponent(jLabelLocalTimeData))
                .addContainerGap())
        );

        jPanelCamera.setBorder(javax.swing.BorderFactory.createTitledBorder("Camera"));
        jPanelCamera.setPreferredSize(new java.awt.Dimension(350, 100));

        jButtonGotoCamera.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonGotoCamera.setText("Camera");

        javax.swing.GroupLayout jPanelCameraLayout = new javax.swing.GroupLayout(jPanelCamera);
        jPanelCamera.setLayout(jPanelCameraLayout);
        jPanelCameraLayout.setHorizontalGroup(
            jPanelCameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCameraLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButtonGotoCamera)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCameraLayout.setVerticalGroup(
            jPanelCameraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCameraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonGotoCamera, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4TempBaro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Temperature"), "Temperature / Barometer"));
        jPanel4TempBaro.setPreferredSize(new java.awt.Dimension(350, 100));

        jLabelTemerature.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTemerature.setText("999 F");

        jLabelBarometer.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelBarometer.setText("9999 R");

        javax.swing.GroupLayout jPanel4TempBaroLayout = new javax.swing.GroupLayout(jPanel4TempBaro);
        jPanel4TempBaro.setLayout(jPanel4TempBaroLayout);
        jPanel4TempBaroLayout.setHorizontalGroup(
            jPanel4TempBaroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4TempBaroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTemerature)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jLabelBarometer)
                .addGap(43, 43, 43))
        );
        jPanel4TempBaroLayout.setVerticalGroup(
            jPanel4TempBaroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4TempBaroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4TempBaroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTemerature, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelBarometer, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        jPanelGpsDirection.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Direction", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabelCompass.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelCompass.setText("NE");

        javax.swing.GroupLayout jPanelGpsDirectionLayout = new javax.swing.GroupLayout(jPanelGpsDirection);
        jPanelGpsDirection.setLayout(jPanelGpsDirectionLayout);
        jPanelGpsDirectionLayout.setHorizontalGroup(
            jPanelGpsDirectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGpsDirectionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCompass)
                .addGap(133, 133, 133))
        );
        jPanelGpsDirectionLayout.setVerticalGroup(
            jPanelGpsDirectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGpsDirectionLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabelCompass)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelGPS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4TempBaro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCamera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelGpsDirection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelCamera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4TempBaro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelGPS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelGpsDirection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSettingsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSettingsActionPerformed

    private void jButtonAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAboutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAboutActionPerformed

    private void jButtonGotoTangramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGotoTangramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGotoTangramActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WegMainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WegMainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WegMainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WegMainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WegMainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbout;
    private javax.swing.JButton jButtonGotoCamera;
    private javax.swing.JButton jButtonGotoTangram;
    private javax.swing.JButton jButtonSettings;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBarometer;
    private javax.swing.JLabel jLabelCompass;
    private javax.swing.JLabel jLabelGPSFix;
    private javax.swing.JLabel jLabelGpsFixIndicator;
    private javax.swing.JLabel jLabelLatData;
    private javax.swing.JLabel jLabelLatiData;
    private javax.swing.JLabel jLabelLocalTime;
    private javax.swing.JLabel jLabelLocalTimeData;
    private javax.swing.JLabel jLabelLongitude;
    private javax.swing.JLabel jLabelNumSatData;
    private javax.swing.JLabel jLabelNumSatellites1;
    private javax.swing.JLabel jLabelTemerature;
    private javax.swing.JLabel jLabelUTC;
    private javax.swing.JLabel jLabelUTC1;
    private javax.swing.JPanel jPanel4TempBaro;
    private javax.swing.JPanel jPanelCamera;
    private javax.swing.JPanel jPanelGPS;
    private javax.swing.JPanel jPanelGpsDirection;
    private javax.swing.JPanel jPanelStatus;
    // End of variables declaration//GEN-END:variables
}

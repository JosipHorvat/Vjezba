/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author Josip
 */
public class Kalkulator extends javax.swing.JFrame {

    /**
     * Creates new form Kalkulator
     */
    public Kalkulator() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtFieldKonzola = new javax.swing.JTextField();
        btnOSAM = new javax.swing.JButton();
        btnSEDAM = new javax.swing.JButton();
        btnZBRAJANJE = new javax.swing.JButton();
        btnDEVET = new javax.swing.JButton();
        btnPET = new javax.swing.JButton();
        btnCETIRI = new javax.swing.JButton();
        btnMNOZENJE = new javax.swing.JButton();
        btnSEST = new javax.swing.JButton();
        btnDVA = new javax.swing.JButton();
        btnJEDAN = new javax.swing.JButton();
        btnDIJELJENJE = new javax.swing.JButton();
        btnJEDNAKO = new javax.swing.JButton();
        btnTOCKA = new javax.swing.JButton();
        btnNULA = new javax.swing.JButton();
        btnTRI = new javax.swing.JButton();
        btnODUZIMANJE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator");
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        txtFieldKonzola.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtFieldKonzola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldKonzolaActionPerformed(evt);
            }
        });

        btnOSAM.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnOSAM.setText("8");
        btnOSAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOSAMActionPerformed(evt);
            }
        });

        btnSEDAM.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSEDAM.setText("7");
        btnSEDAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSEDAMActionPerformed(evt);
            }
        });

        btnZBRAJANJE.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnZBRAJANJE.setText("+");
        btnZBRAJANJE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZBRAJANJEActionPerformed(evt);
            }
        });

        btnDEVET.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDEVET.setText("9");
        btnDEVET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDEVETActionPerformed(evt);
            }
        });

        btnPET.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPET.setText("5");
        btnPET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPETActionPerformed(evt);
            }
        });

        btnCETIRI.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCETIRI.setText("4");
        btnCETIRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCETIRIActionPerformed(evt);
            }
        });

        btnMNOZENJE.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnMNOZENJE.setText("X");
        btnMNOZENJE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMNOZENJEActionPerformed(evt);
            }
        });

        btnSEST.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSEST.setText("6");
        btnSEST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSESTActionPerformed(evt);
            }
        });

        btnDVA.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDVA.setText("2");
        btnDVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDVAActionPerformed(evt);
            }
        });

        btnJEDAN.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnJEDAN.setText("1");
        btnJEDAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJEDANActionPerformed(evt);
            }
        });

        btnDIJELJENJE.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDIJELJENJE.setText("/");
        btnDIJELJENJE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDIJELJENJEActionPerformed(evt);
            }
        });

        btnJEDNAKO.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnJEDNAKO.setText("=");
        btnJEDNAKO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJEDNAKOActionPerformed(evt);
            }
        });

        btnTOCKA.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnTOCKA.setText(".");
        btnTOCKA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTOCKAActionPerformed(evt);
            }
        });

        btnNULA.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnNULA.setText("0");
        btnNULA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNULAActionPerformed(evt);
            }
        });

        btnTRI.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnTRI.setText("3");
        btnTRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTRIActionPerformed(evt);
            }
        });

        btnODUZIMANJE.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnODUZIMANJE.setText("-");
        btnODUZIMANJE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnODUZIMANJEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldKonzola)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSEDAM)
                                .addGap(18, 18, 18)
                                .addComponent(btnOSAM)
                                .addGap(18, 18, 18)
                                .addComponent(btnDEVET)
                                .addGap(18, 18, 18)
                                .addComponent(btnODUZIMANJE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnJEDAN)
                                .addGap(18, 18, 18)
                                .addComponent(btnDVA)
                                .addGap(18, 18, 18)
                                .addComponent(btnTRI)
                                .addGap(18, 18, 18)
                                .addComponent(btnDIJELJENJE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNULA)
                                .addGap(18, 18, 18)
                                .addComponent(btnTOCKA)
                                .addGap(18, 18, 18)
                                .addComponent(btnJEDNAKO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCETIRI)
                                .addGap(18, 18, 18)
                                .addComponent(btnPET)
                                .addGap(18, 18, 18)
                                .addComponent(btnSEST)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnZBRAJANJE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMNOZENJE))))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFieldKonzola, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnZBRAJANJE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOSAM)
                    .addComponent(btnDEVET)
                    .addComponent(btnSEDAM)
                    .addComponent(btnODUZIMANJE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPET)
                    .addComponent(btnMNOZENJE)
                    .addComponent(btnSEST)
                    .addComponent(btnCETIRI))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDVA)
                    .addComponent(btnDIJELJENJE)
                    .addComponent(btnJEDAN)
                    .addComponent(btnTRI))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTOCKA)
                    .addComponent(btnNULA)
                    .addComponent(btnJEDNAKO))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Konzola gdje se vidi rezultat racunanja
    private void txtFieldKonzolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldKonzolaActionPerformed
      
    }//GEN-LAST:event_txtFieldKonzolaActionPerformed
    // BUTTONI KOJI SE ISPISUJU NA KONZOLU JEDNOM KAD SU KLIKNUTI
    private void btnNULAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNULAActionPerformed
     
      txtFieldKonzola.setText("0");
    }//GEN-LAST:event_btnNULAActionPerformed

    private void btnTOCKAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTOCKAActionPerformed
      txtFieldKonzola.setText(".");
    }//GEN-LAST:event_btnTOCKAActionPerformed

    private void btnJEDNAKOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJEDNAKOActionPerformed
      txtFieldKonzola.setText("=");
    }//GEN-LAST:event_btnJEDNAKOActionPerformed

    private void btnJEDANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJEDANActionPerformed
       txtFieldKonzola.setText("1");
    }//GEN-LAST:event_btnJEDANActionPerformed

    private void btnDVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDVAActionPerformed
       txtFieldKonzola.setText("2");
    }//GEN-LAST:event_btnDVAActionPerformed

    private void btnTRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTRIActionPerformed
       txtFieldKonzola.setText("3");
    }//GEN-LAST:event_btnTRIActionPerformed

    private void btnDIJELJENJEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDIJELJENJEActionPerformed
       txtFieldKonzola.setText("/");
    }//GEN-LAST:event_btnDIJELJENJEActionPerformed

    private void btnCETIRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCETIRIActionPerformed
       txtFieldKonzola.setText("4");
    }//GEN-LAST:event_btnCETIRIActionPerformed

    private void btnPETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPETActionPerformed
       txtFieldKonzola.setText("5");
    }//GEN-LAST:event_btnPETActionPerformed

    private void btnSESTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSESTActionPerformed
        txtFieldKonzola.setText("6");
    }//GEN-LAST:event_btnSESTActionPerformed

    private void btnMNOZENJEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMNOZENJEActionPerformed
       txtFieldKonzola.setText("*");
    }//GEN-LAST:event_btnMNOZENJEActionPerformed

    private void btnSEDAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSEDAMActionPerformed
        txtFieldKonzola.setText("7");
    }//GEN-LAST:event_btnSEDAMActionPerformed

    private void btnOSAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOSAMActionPerformed
        txtFieldKonzola.setText("8");
    }//GEN-LAST:event_btnOSAMActionPerformed

    private void btnDEVETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDEVETActionPerformed
         txtFieldKonzola.setText("9");
    }//GEN-LAST:event_btnDEVETActionPerformed

    private void btnODUZIMANJEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnODUZIMANJEActionPerformed
         txtFieldKonzola.setText("-");
    }//GEN-LAST:event_btnODUZIMANJEActionPerformed

    private void btnZBRAJANJEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZBRAJANJEActionPerformed
         txtFieldKonzola.setText("+");
    }//GEN-LAST:event_btnZBRAJANJEActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCETIRI;
    private javax.swing.JButton btnDEVET;
    private javax.swing.JButton btnDIJELJENJE;
    private javax.swing.JButton btnDVA;
    private javax.swing.JButton btnJEDAN;
    private javax.swing.JButton btnJEDNAKO;
    private javax.swing.JButton btnMNOZENJE;
    private javax.swing.JButton btnNULA;
    private javax.swing.JButton btnODUZIMANJE;
    private javax.swing.JButton btnOSAM;
    private javax.swing.JButton btnPET;
    private javax.swing.JButton btnSEDAM;
    private javax.swing.JButton btnSEST;
    private javax.swing.JButton btnTOCKA;
    private javax.swing.JButton btnTRI;
    private javax.swing.JButton btnZBRAJANJE;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField txtFieldKonzola;
    // End of variables declaration//GEN-END:variables
}

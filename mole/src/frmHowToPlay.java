public class frmHowToPlay extends javax.swing.JFrame {
    int intPoints;
    //declare variable to store points
    int intWeight;
    //declare variable to store weight
    boolean hasGlasses;
    //declare variable to store whether user has glasses
    boolean hasFlowers;
    //declare variable to store whether user has flowers
    public frmHowToPlay() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblLine1 = new javax.swing.JLabel();
        lblLine6 = new javax.swing.JLabel();
        lblLine2 = new javax.swing.JLabel();
        lblLine3 = new javax.swing.JLabel();
        lblLine4 = new javax.swing.JLabel();
        lblLine5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        btnBack.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnBack.setText("Back to garden");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(10, 10, 127, 27);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("How to Play");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 40, 137, 34);

        lblLine1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblLine1.setText("Enter the name of the element that matches the displayed");
        getContentPane().add(lblLine1);
        lblLine1.setBounds(50, 100, 400, 21);

        lblLine6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblLine6.setText("dictionary (up to barium). Happy moleing!");
        getContentPane().add(lblLine6);
        lblLine6.setBounds(50, 240, 400, 40);

        lblLine2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblLine2.setText("element symbol to earn points! Points can be spent in the");
        getContentPane().add(lblLine2);
        lblLine2.setBounds(50, 120, 400, 40);

        lblLine3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblLine3.setText("store grow and buy accessories for your mole. When your");
        getContentPane().add(lblLine3);
        lblLine3.setBounds(50, 150, 400, 40);

        lblLine4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblLine4.setText("mole becomes heavier, more points will be earned. If you get");
        getContentPane().add(lblLine4);
        lblLine4.setBounds(50, 180, 400, 40);

        lblLine5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblLine5.setText("stuck, you can search up element symbols/names in the mole");
        getContentPane().add(lblLine5);
        lblLine5.setBounds(50, 210, 400, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        frmHome frmHome = new frmHome();
        //initalize home JFrame
        frmHome.intPoints = intPoints;
        //transfers points variable
        frmHome.lblPoints.setText("Points: " + intPoints);
        //updates points label in home JFrame
        frmHome.intWeight = intWeight;
        //transfers weight variable
        frmHome.lblWeight.setText(intWeight + " lbs");
        //updates weight label in home JFrame 
        frmHome.hasGlasses = hasGlasses;
        //transfers glasses variable
        if (hasGlasses == true){
            frmHome.lblSunglasses.setVisible(true);
            //shows glasses in home JFrame
        }
        frmHome.hasFlowers = hasFlowers;
        if (hasFlowers == true){
            frmHome.lblFlowers.setVisible(true);
            //shows flowers in home JFrame
        }
        frmHome.setVisible(true);
        //shows home JFrame
        this.dispose();
        //closes home window
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(frmHowToPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHowToPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHowToPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHowToPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHowToPlay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLine1;
    private javax.swing.JLabel lblLine2;
    private javax.swing.JLabel lblLine3;
    private javax.swing.JLabel lblLine4;
    private javax.swing.JLabel lblLine5;
    private javax.swing.JLabel lblLine6;
    // End of variables declaration//GEN-END:variables
}

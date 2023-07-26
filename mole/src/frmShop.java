import java.awt.Color;
public class frmShop extends javax.swing.JFrame {
    final int WORM_PRICE = 1;
    //declare constant worm price
    final int GLASSES_PRICE = 100;
    //declare constant glasses price
    final int LOTTERY_PRICE = 5;
    //declare constant lottery ticket price
    final int FLOWERS_PRICE = 1000;
    //declare constant flowers price
    int intPoints;
    //declare variable to store points
    int intWeight;
    //declare variable to store weight
    boolean hasGlasses;
    //declare variable to store whether user has glasses
    boolean hasFlowers;
    //declare variable to store whether user has flowers   
    public frmShop() {        
        initComponents();
        lblFeedback1.setText("");       
        lblFeedback2.setText("");
        lblFeedback3.setText("");
        lblFeedback4.setText("");
        //reset feedback labels
        btnWorm.setText(WORM_PRICE + " Point");
        //display price of worm
        btnGlasses.setText(GLASSES_PRICE + " Points");
        //display price of glasses
        btnLottery.setText(LOTTERY_PRICE + " Points");
        //display price of lottery ticket
        btnFlowers.setText(FLOWERS_PRICE + " Points");
        //display price of flowers
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        btnWorm = new javax.swing.JButton();
        lblWormPic = new javax.swing.JLabel();
        lblWorm = new javax.swing.JLabel();
        btnGlasses = new javax.swing.JButton();
        lblGlassesPic = new javax.swing.JLabel();
        lblGlasses = new javax.swing.JLabel();
        btnLottery = new javax.swing.JButton();
        lblLotteryPic = new javax.swing.JLabel();
        lblTicket = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblPoints = new javax.swing.JLabel();
        lblFeedback1 = new javax.swing.JLabel();
        lblFeedback2 = new javax.swing.JLabel();
        lblFeedback3 = new javax.swing.JLabel();
        btnFlowers = new javax.swing.JButton();
        lblFlowersPic = new javax.swing.JLabel();
        lblFlowers = new javax.swing.JLabel();
        lblFeedback4 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnWorm.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnWorm.setText("1 point");
        btnWorm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWormActionPerformed(evt);
            }
        });
        getContentPane().add(btnWorm, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        lblWormPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worm.png"))); // NOI18N
        getContentPane().add(lblWormPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        lblWorm.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblWorm.setText("Worm (+1 lbs)");
        getContentPane().add(lblWorm, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        btnGlasses.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnGlasses.setText("3 points");
        btnGlasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGlassesActionPerformed(evt);
            }
        });
        getContentPane().add(btnGlasses, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        lblGlassesPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/glasses-large.png"))); // NOI18N
        getContentPane().add(lblGlassesPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 100, -1));

        lblGlasses.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblGlasses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGlasses.setText("Glasses (x1.5 points)");
        getContentPane().add(lblGlasses, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        btnLottery.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnLottery.setText("5 points");
        btnLottery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLotteryActionPerformed(evt);
            }
        });
        getContentPane().add(btnLottery, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        lblLotteryPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ticket.png"))); // NOI18N
        getContentPane().add(lblLotteryPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        lblTicket.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblTicket.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTicket.setText("Lottery ticket");
        getContentPane().add(lblTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        btnBack.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnBack.setText("Back to garden");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblPoints.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        lblPoints.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPoints.setText("Points: 0");
        getContentPane().add(lblPoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        lblFeedback1.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        lblFeedback1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFeedback1.setText("feedback");
        getContentPane().add(lblFeedback1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 137, -1));

        lblFeedback2.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        lblFeedback2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFeedback2.setText("feedback");
        getContentPane().add(lblFeedback2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 130, -1));

        lblFeedback3.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        lblFeedback3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFeedback3.setText("feedback");
        getContentPane().add(lblFeedback3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 137, -1));

        btnFlowers.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnFlowers.setText("1000 points");
        btnFlowers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlowersActionPerformed(evt);
            }
        });
        getContentPane().add(btnFlowers, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        lblFlowersPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flowers.png"))); // NOI18N
        getContentPane().add(lblFlowersPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        lblFlowers.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblFlowers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFlowers.setText("Pretty flowers");
        getContentPane().add(lblFlowers, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        lblFeedback4.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        lblFeedback4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFeedback4.setText("feedback");
        getContentPane().add(lblFeedback4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGlassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGlassesActionPerformed
        if (hasGlasses == false){
            if (intPoints >= GLASSES_PRICE){
                intPoints = intPoints - GLASSES_PRICE;
                //subtract glasses price from points
                lblPoints.setText("Points: " + intPoints);
                //update points label
                lblFeedback2.setForeground(Color.green);
                //set feedback colour to green
                lblFeedback2.setText("Purchased!");
                //update feedback text
                hasGlasses = true;
                //stores that user has glasses
            }
            else{
                lblFeedback2.setForeground(Color.red);
                //set feedback colour to red
                lblFeedback2.setText("Not enough points!");
                //updates feedback text
            }
        }
        else{
            lblFeedback2.setForeground(Color.green);
            //set feedback colour to green
            lblFeedback2.setText("Already bought!");
            //updates feedback text
        }
    }//GEN-LAST:event_btnGlassesActionPerformed

    private void btnLotteryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLotteryActionPerformed
        if (intPoints >= LOTTERY_PRICE){
            intPoints = intPoints - LOTTERY_PRICE;
            //subtract price of lottery ticket from points           
            int intRandomNum = (int)Math.round(Math.random() * 9 + 1);
            //generate random number from 1-10
            if (intRandomNum == 1){
                lblFeedback3.setForeground(Color.green);
                //set feedback colour to green
                lblFeedback3.setText("You won!");
                //updates feedback text
                intPoints = intPoints + 50;  
                //adds points to user
            }
            else{
                lblFeedback3.setForeground(Color.red);
                //update feedback colour to red
                lblFeedback3.setText("You lost :~(");
                //updates feedback text
            }
            lblPoints.setText("Points: " + intPoints);
            //updates points label
        }
        else{
            lblFeedback3.setForeground(Color.red);
            //sets feedback colour to red
            lblFeedback3.setText("Not enough points!");
            //updates feedback text
        }
    }//GEN-LAST:event_btnLotteryActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        frmHome frmHome = new frmHome();
        //initialize JFrame for home
        frmHome.intPoints = intPoints;
        //transfers points variable
        frmHome.lblPoints.setText("Points: " + intPoints);
        //updates points label for home JFrame
        frmHome.intWeight = intWeight;
        //transfers weight variable
        frmHome.lblWeight.setText(intWeight + " lbs");
        //updates weight label for home JFrame       
        frmHome.hasGlasses = hasGlasses;
        //transfers glasses variable to home JFrame
        if (hasGlasses == true){
            frmHome.lblSunglasses.setVisible(true);
            //shows sunglasses in home JFrame
        }
        frmHome.hasFlowers = hasFlowers;
        //transfers flowers variable to home JFrame
        if (hasFlowers == true){
            frmHome.lblFlowers.setVisible(true);
            //shows flowers in home JFrame
        }
        frmHome.setVisible(true);
        //shows home JFrame
        this.dispose();
        //closes shop JFrame window
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnWormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWormActionPerformed
        if (intPoints >= WORM_PRICE){
            intPoints = intPoints - WORM_PRICE;
            //subtracts price of worm from points
            lblPoints.setText("Points: " + intPoints);
            //updates points label
            lblFeedback1.setForeground(Color.green);
            //sets feedback colour to green
            lblFeedback1.setText("Purchased!");
            //updates feedback text
            intWeight ++;
            //increases weight
        }
        else{
            lblFeedback1.setForeground(Color.red);
            //sets feedback colour to red
            lblFeedback1.setText("Not enough points!");
            //updates feedback label
        }
    }//GEN-LAST:event_btnWormActionPerformed

    private void btnFlowersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlowersActionPerformed
        if (hasFlowers == false){
            if (intPoints >= FLOWERS_PRICE){
                intPoints = intPoints - FLOWERS_PRICE;
                //subtracts price of flowers from points
                lblPoints.setText("Points: " + intPoints);
                //updates points label
                lblFeedback4.setForeground(Color.green);
                //sets feedback colour to green
                lblFeedback4.setText("Purchased!");
                //updates feedback text
                hasFlowers = true;
                //stores that user has flowers
            }
            else{
                lblFeedback4.setForeground(Color.red);
                //updates feedback colour to red
                lblFeedback4.setText("Not enough points!");
                //updates feedback text
            }
        }
        else{
            lblFeedback4.setForeground(Color.green);
            //updates feecback colour to green
            lblFeedback4.setText("Already bought!");
            //updates feedback text
        }
    }//GEN-LAST:event_btnFlowersActionPerformed

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
            java.util.logging.Logger.getLogger(frmShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmShop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFlowers;
    private javax.swing.JButton btnGlasses;
    private javax.swing.JButton btnLottery;
    private javax.swing.JButton btnWorm;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblFeedback1;
    private javax.swing.JLabel lblFeedback2;
    private javax.swing.JLabel lblFeedback3;
    private javax.swing.JLabel lblFeedback4;
    private javax.swing.JLabel lblFlowers;
    private javax.swing.JLabel lblFlowersPic;
    private javax.swing.JLabel lblGlasses;
    private javax.swing.JLabel lblGlassesPic;
    private javax.swing.JLabel lblLotteryPic;
    public javax.swing.JLabel lblPoints;
    private javax.swing.JLabel lblTicket;
    private javax.swing.JLabel lblWorm;
    private javax.swing.JLabel lblWormPic;
    // End of variables declaration//GEN-END:variables
}

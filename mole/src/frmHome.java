import java.awt.Color;
//import for colour presets
public class frmHome extends javax.swing.JFrame {
    static String [] symbolArr = {"H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "Cl", "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr", "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe", "Cs", "Ba"};
    //declare array containing symbols of elements in order
    static String [] nameArr = {"hydrogen", "helium", "lithium", "beryilium", "boron", "carbon", "nitrogen", "oxygen", "fluorine", "neon", "sodium", "magnesium", "aluminum", "silicon", "phosphorus", "chlorine", "argon", "potassium", "calcium", "scandium", "titanium", "vanadium", "chromium", "manganese", "iron", "cobalt", "nickel", "copper", "zinc", "gallium", "germanium", "arsenic", "selenium", "bromine", "krypton", "rubidium", "strontium", "yttrium", "zirconium", "niobium", "molybdenum", "technetium", "ruthenium", "rhodium", "palladium", "silver", "cadmium", "indium", "tin", "antimony", "tellurium", "iodine", "xenon", "caesium", "barium"};
    //declare array containing names of elements in order
    int intElementIndex = generate();
    //declare variable to store random element index
    /**
     * 
     * @return random index contained by symbolArr and nameArr
     */
    public static int generate(){
        int intElementIndex = (int)Math.round(Math.random() * (symbolArr.length - 1));
        //generate a random array index
        return intElementIndex;
        //return the index
    }
    int intPoints = 0;
    //declare variable to store points
    int intWeight = 10;
    //declare variable to store weight
    boolean hasGlasses = false;
    //declare variable to store if user has glasses
    boolean hasFlowers = false;
    //declare variable to store if user has flowers   
    public frmHome() {
        initComponents();
        lblPoints.setText("Points: " + intPoints);
        //update points label
        lblWeight.setText(intWeight + " lbs");
        //update weight label
        lblSymbol.setText("Symbol: " + symbolArr[intElementIndex]);
        //update symbol label
        lblFeedback.setText("");
        //reset feedback label
        if (hasGlasses == false){
            lblSunglasses.setVisible(false); 
            //hide sunglasses
        }
        else{
            lblSunglasses.setVisible(true); 
            //show sunglasses
        }
        if (hasFlowers == false){
            lblFlowers.setVisible(false);  
            //hide flowers
        }
        else{
            lblFlowers.setVisible(true); 
            //show flowers
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPoints = new javax.swing.JLabel();
        lblSunglasses = new javax.swing.JLabel();
        lblShoppingCart = new javax.swing.JLabel();
        lblBooks = new javax.swing.JLabel();
        btnShop = new javax.swing.JButton();
        lblMole = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();
        btnDictionary = new javax.swing.JButton();
        lblSymbol = new javax.swing.JLabel();
        lblFeedback = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnHowTo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblFlowers = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblWeight = new javax.swing.JLabel();
        lblScale = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        lblPoints.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        lblPoints.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPoints.setText("Points: 0");
        getContentPane().add(lblPoints);
        lblPoints.setBounds(373, 20, 100, 19);

        lblSunglasses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/glasses-small.png"))); // NOI18N
        getContentPane().add(lblSunglasses);
        lblSunglasses.setBounds(280, 210, 42, 17);

        lblShoppingCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shopping-cart.png"))); // NOI18N
        getContentPane().add(lblShoppingCart);
        lblShoppingCart.setBounds(310, 20, 60, 60);

        lblBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book-stack.png"))); // NOI18N
        getContentPane().add(lblBooks);
        lblBooks.setBounds(320, 100, 42, 17);

        btnShop.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnShop.setText("Shop");
        btnShop.setBorder(null);
        btnShop.setPreferredSize(new java.awt.Dimension(120, 25));
        btnShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShopActionPerformed(evt);
            }
        });
        getContentPane().add(btnShop);
        btnShop.setBounds(300, 20, 180, 60);

        lblMole.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mole.png"))); // NOI18N
        getContentPane().add(lblMole);
        lblMole.setBounds(200, 170, 100, 100);

        txtName.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName);
        txtName.setBounds(140, 300, 130, 30);

        btnEnter.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnter);
        btnEnter.setBounds(280, 300, 72, 30);

        btnDictionary.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnDictionary.setText("Mol Dictionary");
        btnDictionary.setBorder(null);
        btnDictionary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDictionaryActionPerformed(evt);
            }
        });
        getContentPane().add(btnDictionary);
        btnDictionary.setBounds(300, 90, 180, 40);

        lblSymbol.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        lblSymbol.setForeground(new java.awt.Color(255, 255, 255));
        lblSymbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSymbol.setText("Symbol: H");
        getContentPane().add(lblSymbol);
        lblSymbol.setBounds(200, 270, 100, 19);

        lblFeedback.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        lblFeedback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFeedback.setText("feedback");
        getContentPane().add(lblFeedback);
        lblFeedback.setBounds(150, 340, 190, 19);

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTitle.setText("MOLE SIMULATOR");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(20, 10, 260, 50);

        btnHowTo.setText("How to Play");
        btnHowTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHowToActionPerformed(evt);
            }
        });
        getContentPane().add(btnHowTo);
        btnHowTo.setBounds(10, 340, 100, 23);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFlowers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flowers.png"))); // NOI18N
        jPanel1.add(lblFlowers, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -20, 500, 240);

        jPanel2.setBackground(new java.awt.Color(155, 71, 19));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblWeight.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblWeight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWeight.setText("10 lbs");
        jPanel2.add(lblWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 100, 50));

        lblScale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weighing-machine.png"))); // NOI18N
        jPanel2.add(lblScale, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 250, 510, 160);

        jPanel3.setBackground(new java.awt.Color(102, 255, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 220, 510, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnDictionaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDictionaryActionPerformed
        frmDictionary frmDictionary = new frmDictionary();
        //initialize JFrame for dictionary 
        frmDictionary.intPoints = intPoints;
        //transfer points variable
        frmDictionary.intWeight = intWeight;
        //transfer weight variable
        frmDictionary.hasGlasses = hasGlasses;
        //transfer glasses variable
        frmDictionary.hasFlowers = hasFlowers;
        //transfer flowers variable
        frmDictionary.symbolArr = symbolArr;
        //transfer symbols array
        frmDictionary.nameArr = nameArr;
        //transfer names array       
        frmDictionary.setVisible(true);
        //show dictionary JFrame
        this.dispose();
        //close home JFrame
    }//GEN-LAST:event_btnDictionaryActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        String strUserEntry = txtName.getText();
        //read user input in text field
        if (strUserEntry.equals(nameArr[intElementIndex])){
            intElementIndex = generate();
            //generate new index
            lblSymbol.setText("Symbol: " + symbolArr[intElementIndex]);
            //update symbol label
            lblFeedback.setForeground(Color.green);
            //set feedback colour to green
            lblFeedback.setText("Correct!");
            //update feedback text
            if (hasGlasses == true){
                intPoints = intPoints + (int)(1.5 * 0.1 * intWeight);
                //add points (+1 for every 10 weight) and with 1.5 multiplier from having glasses
            }
            else{
                intPoints = intPoints + (int)(0.1 * intWeight);
                //add points (+1 for every 10 weight)
            }           
            lblPoints.setText("Points: " + intPoints);
            //update points label
            txtName.setText("");
            //reset name text field for input
        }
        else{
            lblFeedback.setForeground(Color.red);
            //set feedback colour to red
            lblFeedback.setText("Try again!");
            //update feedback text
            
        }
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShopActionPerformed
        frmShop frmShop = new frmShop();
        //initalize JFrame for shop
        frmShop.intPoints = intPoints;
        //transfer points variable
        frmShop.lblPoints.setText("Points: " + intPoints);
        //update points label in shop JFrame
        frmShop.intWeight = intWeight;
        //transfer weight variable
        frmShop.hasGlasses = hasGlasses;
        //transfer glasses variable
        frmShop.hasFlowers = hasFlowers;
        //transfer flowers variable
        frmShop.setVisible(true);
        //show shop JFrame
        this.dispose();
        //close home JFrame
    }//GEN-LAST:event_btnShopActionPerformed

    private void btnHowToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHowToActionPerformed
        frmHowToPlay frmHowToPlay = new frmHowToPlay();
        //initalize JFrame for tutorial
        frmHowToPlay.intPoints = intPoints;
        //transfer points variable
        frmHowToPlay.intWeight = intWeight;
        //transfer weight variable
        frmHowToPlay.hasGlasses = hasGlasses;
        //transfer glasses variable
        frmHowToPlay.hasFlowers = hasFlowers;
        //transfer flowers variable       
        frmHowToPlay.setVisible(true);
        //show tutorial JFrame
        this.dispose();
        //close home JFrame
    }//GEN-LAST:event_btnHowToActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        String strUserEntry = txtName.getText();
        //read user input in text field
        if (strUserEntry.equals(nameArr[intElementIndex])){
            intElementIndex = generate();
            //generate new index
            lblSymbol.setText("Symbol: " + symbolArr[intElementIndex]);
            //update symbol label
            lblFeedback.setForeground(Color.green);
            //set feedback colour to green
            lblFeedback.setText("Correct!");
            //update feedback text
            if (hasGlasses == true){
                intPoints = intPoints + (int)(1.5 * 0.1 * intWeight);
                //add points (+1 for every 10 weight) and with 1.5 multiplier from having glasses
            }
            else{
                intPoints = intPoints + (int)(0.1 * intWeight);
                //add points (+1 for every 10 weight)
            }           
            lblPoints.setText("Points: " + intPoints);
            //update points label
            txtName.setText("");
            //reset name text field for input
        }
        else{
            lblFeedback.setForeground(Color.red);
            //set feedback colour to red
            lblFeedback.setText("Try again!");
            //update feedback text
            
        }
    }//GEN-LAST:event_txtNameActionPerformed

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
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDictionary;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnHowTo;
    private javax.swing.JButton btnShop;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblBooks;
    private javax.swing.JLabel lblFeedback;
    public javax.swing.JLabel lblFlowers;
    private javax.swing.JLabel lblMole;
    public javax.swing.JLabel lblPoints;
    private javax.swing.JLabel lblScale;
    private javax.swing.JLabel lblShoppingCart;
    public javax.swing.JLabel lblSunglasses;
    private javax.swing.JLabel lblSymbol;
    private javax.swing.JLabel lblTitle;
    public javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}

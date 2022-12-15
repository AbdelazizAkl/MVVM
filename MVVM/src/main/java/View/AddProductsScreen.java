/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.ProductItem;
import ObserverPattern.Observer;
import ObserverPattern.Subject;
import ViewModel.AddProductViewModel;
import ViewModel.ViewProductViewModel;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author youssef
 */
public class AddProductsScreen extends javax.swing.JFrame implements Subject {

    private AddProductViewModel addProductViewModel = new AddProductViewModel();
    private ArrayList<ViewProductsScreen> observers = new ArrayList<>();
    private boolean state;
    private ViewProductViewModel VPVM;
    /**
     * Creates new form AddProductsScreen
     */
    public AddProductsScreen(ViewProductViewModel VPVM) {
        initComponents();
        this.setTitle("Add product"); 
        this.VPVM=VPVM;
//=======
        this.setTitle("Add product");
//>>>>>>> brrrr
    }

    public void attatch(ViewProductsScreen observer) {
        observers.add(observer);
    }

    public void setVisualState(boolean state) {
        this.state = state;
        this.setVisible(state);
        notifyAllObservers();
    }

    public boolean getVisualState() {
        if (state == true) {
            return true;
        } else {
            return false;
        }
    }

    public void notifyAllObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JComboBox<>();
        productImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setText("Enter id :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Enter price :");

        Add.setBackground(new java.awt.Color(0, 0, 0));
        Add.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        price.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setText("Select a product to add :");

        name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IPhone", "Macbook", "Airpods" }));
        name.setSelectedIndex(-1);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(139, 139, 139)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(productImage, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Add)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(productImage, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Add)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        setVisualState(false);
        notifyAllObservers();

    }//GEN-LAST:event_formWindowClosing

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        String productName = name.getItemAt(name.getSelectedIndex());
        String productId = id.getText();
        String productPrice = price.getText();
        boolean x = addProductViewModel.validateThenAdd(productName, productId, productPrice);
        if (x == true) {
            JOptionPane.showMessageDialog(null, "PRODUCT IS ADDED TO BAG SUCCESSFULLY");
            name.setSelectedIndex(-1);
            id.setText("");
            price.setText("");
//<<<<<<< HEAD
            VPVM.addProduct(new ProductItem(Integer.parseInt(productId),productName,Double.parseDouble(productPrice)));
//=======
            name.setSelectedIndex(-1);
            productImage.setIcon(new ImageIcon(""));
//>>>>>>> brrrr
        } else {
            JOptionPane.showMessageDialog(null, "INVALID INPUT!");
        }

    }//GEN-LAST:event_AddActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:

        if (name.getItemAt(name.getSelectedIndex()) == "IPhone") {
            ImageIcon product = new ImageIcon("phone.png");
            productImage.setIcon(product);
        } else if (name.getItemAt(name.getSelectedIndex()) == "Macbook") {
            ImageIcon product = new ImageIcon("laptop.png");
            productImage.setIcon(product);
        } else if (name.getItemAt(name.getSelectedIndex()) == "Airpods") {
            ImageIcon product = new ImageIcon("headphones.png");
            productImage.setIcon(product);
        }

    }//GEN-LAST:event_nameActionPerformed

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
            java.util.logging.Logger.getLogger(AddProductsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProductsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProductsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProductsScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProductsScreen(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> name;
    private javax.swing.JTextField price;
    private javax.swing.JLabel productImage;
    // End of variables declaration//GEN-END:variables

}

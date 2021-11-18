/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Neha
 */
public class ModifRestInfoJPan extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private RestaurantDirectory restaurantDirectory;
    private Restaurant restaurant;
    /**
     * Creates new form ModifyRestaurantInfoJPanel
     */
    public ModifRestInfoJPan(JPanel userProcessContainer, EcoSystem ecoSystem, RestaurantDirectory restaurantDirectory, Restaurant restaurant) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.restaurant = restaurant;
        this.restaurantDirectory = ecoSystem.getRestaurantDirectory();
        txtRestName.setText(restaurant.getRestaurantName());
        txtAddrss.setText(restaurant.getAddress());
        txtPhnNum.setText(restaurant.getPhoneNumber());
        manageNameTxt.setText(restaurant.getManagerName());
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPhnNum = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabl6 = new javax.swing.JLabel();
        manageNameTxt = new javax.swing.JTextField();
        txtAddrss = new javax.swing.JTextField();
        jLabl3 = new javax.swing.JLabel();
        jLabl2 = new javax.swing.JLabel();
        txtRestName = new javax.swing.JTextField();
        jLabl1 = new javax.swing.JLabel();
        goBackBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        createBtn.setText("Modify");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Phone Number*:");

        jLabl6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabl6.setText("Manager Name*:");

        jLabl3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabl3.setText("Address*:");

        jLabl2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabl2.setText("Restaurant Name*:");

        jLabl1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabl1.setText("Modify Restaurant");

        goBackBtn.setText("<Back");
        goBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(goBackBtn)
                        .addGap(68, 68, 68)
                        .addComponent(jLabl1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabl6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabl3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabl2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRestName, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddrss, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhnNum, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(257, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabl1)
                    .addComponent(goBackBtn))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRestName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabl2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabl3)
                    .addComponent(txtAddrss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabl6)
                    .addComponent(manageNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhnNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(39, 39, 39)
                .addComponent(createBtn)
                .addContainerGap(201, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        if(txtRestName.getText().isEmpty() || manageNameTxt.getText().isEmpty() ||
            txtPhnNum.getText().isEmpty() || txtAddrss.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields cannot be left empty");
            return;
        }

        boolean flag ;

        String phoneNumber = txtPhnNum.getText();

        if(phoneNumber.length() != 10) {
            JOptionPane.showMessageDialog(null, "PhoneNumber must be of 10 digits");
            return;
        }
        flag = phoneNumber.matches("^[0-9]+$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "Phone Number must have digits only");
            return;
        }
        for(Restaurant res : restaurantDirectory.getRestaurantDirectory()) {
            if(res.getPhoneNumber().equals(phoneNumber) && this.restaurant != res) {
                JOptionPane.showMessageDialog(null, "Phone Number already exists");
                return;
            }
        }

        String address = txtAddrss.getText();

        restaurant.setRestaurantName(txtRestName.getText());
        restaurant.setManagerName(manageNameTxt.getText());
        restaurant.setPhoneNumber(phoneNumber);
        restaurant.setAddress(address);

        JOptionPane.showMessageDialog(null, "Restaurant Updated");
    }//GEN-LAST:event_createBtnActionPerformed

    private void goBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageRestaurantInfoJPanel mrjp = (ManageRestaurantInfoJPanel) component;
        mrjp.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_goBackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createBtn;
    private javax.swing.JButton goBackBtn;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabl1;
    private javax.swing.JLabel jLabl2;
    private javax.swing.JLabel jLabl3;
    private javax.swing.JLabel jLabl6;
    private javax.swing.JTextField manageNameTxt;
    private javax.swing.JTextField txtAddrss;
    private javax.swing.JTextField txtPhnNum;
    private javax.swing.JTextField txtRestName;
    // End of variables declaration//GEN-END:variables
}
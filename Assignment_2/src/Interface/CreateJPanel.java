/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.CarModelList;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Pradnya
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
   private JPanel userMethodModel;
   private CarModelList carmodelList;

    CreateJPanel(JPanel userProcessContainer, CarModelList carinformationlist) {
       initComponents();
       this.userMethodModel=userProcessContainer;
       this.carmodelList=carinformationlist;
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnCreateCar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textYearOfMaking = new javax.swing.JTextField();
        textBrands = new javax.swing.JTextField();
        textMaxSeating = new javax.swing.JTextField();
        textSerialNum = new javax.swing.JTextField();
        textMinSeatings = new javax.swing.JTextField();
        textModelNo = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        rbofYesMaint = new javax.swing.JRadioButton();
        rbofNumMaintainance = new javax.swing.JRadioButton();
        rbofYesAvail = new javax.swing.JRadioButton();
        rbofNoAvail = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Ayuthaya", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD CAR");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCreateCar.setBackground(new java.awt.Color(255, 255, 255));
        btnCreateCar.setText("Create");
        btnCreateCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCarActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Brand:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Year of Manufacture:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Minimum Seats:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Maximum Seats:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Serial Number:");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Model Number:");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Available City:");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Maintainance Certificate:");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Availability:");

        textMinSeatings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMinSeatingsActionPerformed(evt);
            }
        });

        rbofYesMaint.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rbofYesMaint);
        rbofYesMaint.setForeground(new java.awt.Color(255, 255, 255));
        rbofYesMaint.setText("Yes");
        rbofYesMaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbofYesMaintActionPerformed(evt);
            }
        });

        rbofNumMaintainance.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rbofNumMaintainance);
        rbofNumMaintainance.setForeground(new java.awt.Color(255, 255, 255));
        rbofNumMaintainance.setText("No");

        rbofYesAvail.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbofYesAvail);
        rbofYesAvail.setForeground(new java.awt.Color(255, 255, 255));
        rbofYesAvail.setText("Yes");

        rbofNoAvail.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbofNoAvail);
        rbofNoAvail.setForeground(new java.awt.Color(255, 255, 255));
        rbofNoAvail.setText("No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(423, 423, 423)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(183, 183, 183)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textModelNo)
                                        .addComponent(textSerialNum)
                                        .addComponent(textBrands)
                                        .addComponent(textMaxSeating)
                                        .addComponent(textYearOfMaking)
                                        .addComponent(textMinSeatings)
                                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbofYesMaint)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbofNumMaintainance))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbofYesAvail)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbofNoAvail))
                                    .addComponent(btnCreateCar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(316, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textBrands, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textYearOfMaking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textMinSeatings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textMaxSeating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textSerialNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rbofYesMaint)
                    .addComponent(rbofNumMaintainance))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(rbofYesAvail)
                    .addComponent(rbofNoAvail))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnCreateCar))
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
           userMethodModel.remove(this);
           CardLayout layout = (CardLayout) userMethodModel.getLayout();
           layout.previous(userMethodModel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCarActionPerformed
        String brandName = "";
        String model_nos="";
        String availability_city="";
        
            
            if(textBrands.getText().equals("") || textModelNo.getText().equals("") || txtCity.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Fields cannot be empty");
            
            }
            else{
                 brandName = textBrands.getText();
                 model_nos = textModelNo.getText();
                 availability_city=txtCity.getText();
            }
        try{    
        int manufactured_year = (Integer.parseInt(textYearOfMaking.getText()));
        int min_seats = Integer.parseInt(textMinSeatings.getText());
        int max_seats = Integer.parseInt(textMaxSeating.getText());
        int serial_num = Integer.parseInt(textSerialNum.getText());
    
   
            
        
        
        
       if(buttonGroup2.getSelection()==null || buttonGroup1.getSelection()==null)
       { 
        JOptionPane.showMessageDialog(null, "Fields cannot be empty");
       }
       else {
        Car car = carmodelList.addCar();
        car.setBrnd(brandName);
        car.setManacyear(manufactured_year);
        car.setMaxSeating(max_seats);
        car.setMinSeating(min_seats);
        car.setSerialNo(serial_num);
        car.setModelNo(model_nos);
        car.setAvailbilityCity(availability_city);
        
         if(rbofYesAvail.isSelected()){
            car.setAvb(true);
        }else if(rbofNoAvail.isSelected()){
            car.setAvb(false);
                }
         
         if(rbofYesMaint.isSelected()){
            car.setMaint_cert(true);
        }else if(rbofNumMaintainance.isSelected()){
            car.setMaint_cert(false);
        }
        JOptionPane.showMessageDialog(null, "Car Added Successfully");
        
        
        textBrands.setText("");
        txtCity.setText("");
        textMaxSeating.setText("");
        textMinSeatings.setText("");
        textModelNo.setText("");
        textSerialNum.setText("");
        textYearOfMaking.setText("");
        }
        }catch(NumberFormatException c){ JOptionPane.showMessageDialog(null, "Enter Numeric value");}
        
        
    }//GEN-LAST:event_btnCreateCarActionPerformed

    private void textMinSeatingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMinSeatingsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMinSeatingsActionPerformed

    private void rbofYesMaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbofYesMaintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbofYesMaintActionPerformed

    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateCar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbofNoAvail;
    private javax.swing.JRadioButton rbofNumMaintainance;
    private javax.swing.JRadioButton rbofYesAvail;
    private javax.swing.JRadioButton rbofYesMaint;
    private javax.swing.JTextField textBrands;
    private javax.swing.JTextField textMaxSeating;
    private javax.swing.JTextField textMinSeatings;
    private javax.swing.JTextField textModelNo;
    private javax.swing.JTextField textSerialNum;
    private javax.swing.JTextField textYearOfMaking;
    private javax.swing.JTextField txtCity;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Model.Product;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author pradnyachacharkar
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    Product product;
    boolean verifyName = false;
    boolean verifyDOB = false;
    boolean verifyTelNo = false;
    boolean verifyEmailAddrss = false;
    boolean verifyBnkAccNo = false;
    boolean verifyUID = false;
    boolean verifySSN = false;
     
    public CreateJPanel(Product product) {
        initComponents();
        this.product=product;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSave = new javax.swing.JButton();
        lblEmailAddrss = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtEmailAddrss = new javax.swing.JTextField();
        lblLinkedIn = new javax.swing.JLabel();
        lblLisence = new javax.swing.JLabel();
        lblIPA = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        lblPhoto = new javax.swing.JLabel();
        lblUID1 = new javax.swing.JLabel();
        lblBnkAcctNo = new javax.swing.JLabel();
        txtBnkAccNo = new javax.swing.JTextField();
        txtGeodata = new javax.swing.JTextField();
        lblSSN = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblMobRecNo = new javax.swing.JLabel();
        txtHlthPlnNo = new javax.swing.JTextField();
        txtMedRecNo = new javax.swing.JTextField();
        txtLisence = new javax.swing.JTextField();
        txtLinkedIn = new javax.swing.JTextField();
        txtDeviceIDSN = new javax.swing.JTextField();
        txtIPA = new javax.swing.JTextField();
        lblHlthPlnNo = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblDeviceIDSN = new javax.swing.JLabel();
        lblGeodata = new javax.swing.JLabel();
        txtUID = new javax.swing.JTextField();
        lblTelNo = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        lblDOB = new javax.swing.JLabel();
        txtTelNo = new javax.swing.JTextField();
        lblFaxno = new javax.swing.JLabel();
        txtFaxNo = new javax.swing.JTextField();
        btnImageUpload = new javax.swing.JButton();
        imgLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(845, 746));
        setMinimumSize(new java.awt.Dimension(845, 746));
        setPreferredSize(new java.awt.Dimension(845, 746));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblEmailAddrss.setText("Email Addresses:");

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Profile");

        lblLinkedIn.setText("LinkedIn:");

        lblLisence.setText("Lisence number:");

        lblIPA.setText("Internet protocol addresses:");

        lblPhoto.setText("Photo:");

        lblUID1.setText("NUID:");

        lblBnkAcctNo.setText("Bank account number:");

        lblSSN.setText("Social Security number:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblMobRecNo.setText("Medical record number:");

        txtLinkedIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLinkedInActionPerformed(evt);
            }
        });

        lblHlthPlnNo.setText("Health plan beneficiary number");

        lblName.setText("Name:");

        lblDeviceIDSN.setText("Device serial numbers:");

        lblGeodata.setText("Address:");

        txtUID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUIDActionPerformed(evt);
            }
        });

        lblTelNo.setText("Telephone numbers:");

        lblDOB.setText("Date of birth:");

        lblFaxno.setText("FAX number:");

        btnImageUpload.setText("Upload");
        btnImageUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageUploadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBnkAcctNo)
                    .addComponent(lblFaxno)
                    .addComponent(lblSSN)
                    .addComponent(lblMobRecNo)
                    .addComponent(lblEmailAddrss)
                    .addComponent(lblHlthPlnNo)
                    .addComponent(lblName)
                    .addComponent(lblDeviceIDSN)
                    .addComponent(lblGeodata)
                    .addComponent(lblTelNo)
                    .addComponent(lblDOB)
                    .addComponent(lblLinkedIn)
                    .addComponent(lblLisence)
                    .addComponent(lblIPA)
                    .addComponent(lblPhoto)
                    .addComponent(lblUID1))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnImageUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(imgLabel))
                    .addComponent(txtBnkAccNo, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(txtFaxNo, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(txtGeodata, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(txtHlthPlnNo, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(txtMedRecNo, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(txtLisence, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(txtLinkedIn, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(txtDeviceIDSN, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(txtDOB, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(txtEmailAddrss, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(txtTelNo, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(txtSSN, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(txtIPA)
                    .addComponent(txtUID, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblBnkAcctNo, lblDOB, lblDeviceIDSN, lblEmailAddrss, lblFaxno, lblGeodata, lblHlthPlnNo, lblIPA, lblLinkedIn, lblLisence, lblMobRecNo, lblName, lblPhoto, lblSSN, lblTelNo, lblUID1});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtBnkAccNo, txtDOB, txtDeviceIDSN, txtEmailAddrss, txtFaxNo, txtGeodata, txtHlthPlnNo, txtIPA, txtLinkedIn, txtLisence, txtMedRecNo, txtName, txtSSN, txtTelNo, txtUID});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGeodata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGeodata))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDOB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFaxNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFaxno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailAddrss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailAddrss))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSSN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMedRecNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMobRecNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHlthPlnNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHlthPlnNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBnkAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBnkAcctNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLisence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLisence))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeviceIDSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDeviceIDSN))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLinkedIn)
                    .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIPA)
                    .addComponent(txtIPA, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImageUpload, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(lblPhoto)
                    .addComponent(imgLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUID1))
                .addGap(34, 34, 34)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtBnkAccNo, txtDOB, txtDeviceIDSN, txtEmailAddrss, txtFaxNo, txtGeodata, txtHlthPlnNo, txtIPA, txtLinkedIn, txtLisence, txtMedRecNo, txtName, txtSSN, txtTelNo, txtUID});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        
        
        if(txtName.getText().isEmpty())
        { 
            verifyName = true;
            
            JOptionPane.showMessageDialog(null,"Please enter name.");
        }
        if(txtDOB.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter Date of birth.");
            verifyDOB = true;
        }
            
        if(txtTelNo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter Telephone Number.");
            verifyTelNo = true;
        }
        if(txtEmailAddrss.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter Email Address.");
             verifyEmailAddrss = true;
        }
        if(txtBnkAccNo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter Bank account number");
             verifyBnkAccNo = true;
        } 
        if(txtSSN.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter SSN");
            verifySSN = true;
        } 
        
        String name = txtName.getText();
        if (!name.matches("^[A-Za-z]*$"))
        {
            JOptionPane.showMessageDialog(null,"Please enter letters only");
            verifyName = true;
        }
        
        String dob = txtDOB.getText();
        if (!dob.matches( "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$"))
        {
            JOptionPane.showMessageDialog(null,"Please enter correct date as mm/dd/yyyy.");
            verifyDOB = true;
        }
        
        String telno = txtTelNo.getText();
        if (!telno.matches("^[0-9]{10}$"))
        {
            JOptionPane.showMessageDialog(null,"Please enter ten digit telephone number");
            verifyTelNo = true;
        }
        
        String emailaddress = txtEmailAddrss.getText();
        if (!emailaddress.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\." + "[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$"))
        {
            JOptionPane.showMessageDialog(null,"Please enter valid email");
            verifyEmailAddrss = true;
        }
         
        String uid = txtUID.getText();
        if (!uid.matches("^[0-9]{9}$"))
        {
            JOptionPane.showMessageDialog(null,"Please enter valid NUID");
            verifyUID = true;
        }
        String ssn = txtSSN.getText();
        if (!ssn.matches("^[0-9]{9}$"))
        {
            JOptionPane.showMessageDialog(null,"Please enter valid SSN");
            verifySSN = true;
        }
        
        if(verifyName== false && verifyDOB== false && verifyTelNo== false && verifyEmailAddrss== false && verifyBnkAccNo== false && verifySSN== false)
        {
            product.setName(txtName.getText());
            product.setGeographicData(txtGeodata.getText());
            product.setDateOfBirth(txtDOB.getText());
            product.setTelephoneNum(txtTelNo.getText());
            product.setFaxNum(txtFaxNo.getText());
            product.setEmailAdrss(txtEmailAddrss.getText());
            product.setSSN(txtSSN.getText());
            product.setMedicalRcrdNum(txtMedRecNo.getText());
            product.setHealthPlanBeneficiaryNum(txtHlthPlnNo.getText());
            product.setBankAccNum(txtBnkAccNo.getText());
            product.setCertificateorlicenseNum(txtLisence.getText());
            product.setDeviceIdentifiersAndSerialNum(txtDeviceIDSN.getText());
            product.setLinkedIn(txtLinkedIn.getText());
            product.setInternetProtocolAddresses(txtIPA.getText());
            product.setUniqueIdentifyingNum(txtUID.getText());
            
            JOptionPane.showMessageDialog(null,"Details saved successfully.");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Details not saved, Please enter correct details");
        }
       
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtUIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUIDActionPerformed

    private void txtLinkedInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLinkedInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLinkedInActionPerformed

    private void btnImageUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageUploadActionPerformed
        // TODO add your handling code here:
        int myImage;
        JFileChooser imageUpload = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "png");
        imageUpload.setFileFilter(filter);
        myImage = imageUpload.showSaveDialog(null);       
    
        if (myImage == JFileChooser.APPROVE_OPTION) {
            File currentImage = imageUpload.getSelectedFile(); 
            product.setPhoto(currentImage);
            String[] imageArr = currentImage.toString().split("/");
            imgLabel.setText(imageArr[imageArr.length - 1]);
        }  
    }//GEN-LAST:event_btnImageUploadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImageUpload;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JLabel lblBnkAcctNo;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDeviceIDSN;
    private javax.swing.JLabel lblEmailAddrss;
    private javax.swing.JLabel lblFaxno;
    private javax.swing.JLabel lblGeodata;
    private javax.swing.JLabel lblHlthPlnNo;
    private javax.swing.JLabel lblIPA;
    private javax.swing.JLabel lblLinkedIn;
    private javax.swing.JLabel lblLisence;
    private javax.swing.JLabel lblMobRecNo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTelNo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUID1;
    private javax.swing.JTextField txtBnkAccNo;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtDeviceIDSN;
    private javax.swing.JTextField txtEmailAddrss;
    private javax.swing.JTextField txtFaxNo;
    private javax.swing.JTextField txtGeodata;
    private javax.swing.JTextField txtHlthPlnNo;
    private javax.swing.JTextField txtIPA;
    private javax.swing.JTextField txtLinkedIn;
    private javax.swing.JTextField txtLisence;
    private javax.swing.JTextField txtMedRecNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtTelNo;
    private javax.swing.JTextField txtUID;
    // End of variables declaration//GEN-END:variables
}

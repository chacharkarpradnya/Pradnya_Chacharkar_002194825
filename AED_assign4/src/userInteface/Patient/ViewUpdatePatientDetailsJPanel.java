/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package userInteface.Patient;

import business.VerifierString;
import business.Patient;
import java.awt.CardLayout;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author pradnya
 */
public class ViewUpdatePatientDetailsJPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form ViewPatientDetailsJPanel
     */
    private Patient patient;
    private JPanel userProcessContainer;
    private Boolean isEdit = Boolean.FALSE;
    
    public ViewUpdatePatientDetailsJPanel(JPanel upc, Patient patient, Boolean isEdit) {
        initComponents();
        this.userProcessContainer = upc;
        this.patient = patient;
        this.isEdit = isEdit;
        addVerifiers();
        populatePatientDetails();
        modifyTextFields(this.isEdit);
    }
    
    private void addVerifiers() {
        InputVerifier stringVerifier = new VerifierString();
        updatePrimaryDocNameJTextField.setInputVerifier(stringVerifier);
        prefferedPharmacyJTextField.setInputVerifier(stringVerifier);
    }
    
    private void populatePatientDetails() {
        updatePatientIDJTextField.setText(patient.getIdentifierPatient());
        updatePrimaryDocNameJTextField.setText(patient.getNameDoctor());
        prefferedPharmacyJTextField.setText(patient.getNamePharmacy());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updatePatientIDJLabel = new javax.swing.JLabel();
        updatePrimaryDocNameJLabel = new javax.swing.JLabel();
        updatePrefPharmacyJLabel = new javax.swing.JLabel();
        updatePatientIDJTextField = new javax.swing.JTextField();
        updatePrimaryDocNameJTextField = new javax.swing.JTextField();
        prefferedPharmacyJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        backJButton3 = new javax.swing.JButton();
        editJButton3 = new javax.swing.JButton();
        updateSaveJButton = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(500, 700));
        setPreferredSize(new java.awt.Dimension(500, 700));

        updatePatientIDJLabel.setText("Patient ID");

        updatePrimaryDocNameJLabel.setText("Primary Doctor Name");

        updatePrefPharmacyJLabel.setText("Preffered Pharmacy");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Details");

        backJButton3.setText("<< Back");
        backJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton3ActionPerformed(evt);
            }
        });

        editJButton3.setText("Edit");
        editJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJButton3ActionPerformed(evt);
            }
        });

        updateSaveJButton.setText("Save");
        updateSaveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSaveJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editJButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateSaveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updatePatientIDJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updatePrimaryDocNameJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updatePrefPharmacyJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(189, 189, 189)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prefferedPharmacyJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updatePrimaryDocNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updatePatientIDJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatePatientIDJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatePatientIDJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatePrimaryDocNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatePrimaryDocNameJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prefferedPharmacyJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatePrefPharmacyJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton3)
                    .addComponent(editJButton3)
                    .addComponent(updateSaveJButton))
                .addContainerGap(522, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJButton3ActionPerformed
        // TODO add your handling code here:
        modifyTextFields(true);
    }//GEN-LAST:event_editJButton3ActionPerformed
    
    private void modifyTextFields(Boolean isEdit) {
        if (isEdit) {
            updatePatientIDJTextField.setEnabled(true);
            updatePrimaryDocNameJTextField.setEnabled(true);
            prefferedPharmacyJTextField.setEnabled(true);
        } else {
            updatePatientIDJTextField.setEnabled(false);
            updatePrimaryDocNameJTextField.setEnabled(false);
            prefferedPharmacyJTextField.setEnabled(false);
        }
    }

    private void updateSaveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSaveJButtonActionPerformed
        // TODO add your handling code here:
        
        if (checkBlankInput()) {
            patient.setIdentifierPatient(updatePatientIDJTextField.getText());
            patient.setNameDoctor(updatePrimaryDocNameJTextField.getText());
            patient.setNamePharmacy(prefferedPharmacyJTextField.getText());
            JOptionPane.showMessageDialog(this, "Patient updated!!", "Update", 
                    JOptionPane.INFORMATION_MESSAGE);
            modifyTextFields(false);
        } else {
            JOptionPane.showMessageDialog(this, "Please enter correct values", 
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_updateSaveJButtonActionPerformed
    private Boolean checkBlankInput() {
        if (updatePatientIDJTextField.getText().length()==0
                || updatePrimaryDocNameJTextField.getText().length() == 0
                || prefferedPharmacyJTextField.getText().length() == 0) {
            return false;
        } else {
            return true;
        }
    }
    private void backJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton3ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton3ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton3;
    private javax.swing.JButton editJButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField prefferedPharmacyJTextField;
    private javax.swing.JLabel updatePatientIDJLabel;
    private javax.swing.JTextField updatePatientIDJTextField;
    private javax.swing.JLabel updatePrefPharmacyJLabel;
    private javax.swing.JLabel updatePrimaryDocNameJLabel;
    private javax.swing.JTextField updatePrimaryDocNameJTextField;
    private javax.swing.JButton updateSaveJButton;
    // End of variables declaration//GEN-END:variables
}

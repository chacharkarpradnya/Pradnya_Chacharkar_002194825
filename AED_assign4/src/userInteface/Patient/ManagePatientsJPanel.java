/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package userInteface.Patient;

import business.VerifierString;
import business.Patient;
import business.Person;
import business.PersonDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pradnya
 */
public class ManagePatientsJPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form managePatientsJJPanel
     */
    private PersonDirectory personDirectory;
    private JPanel userProcessContainer;
    
    public ManagePatientsJPanel(JPanel userProcessContainer, PersonDirectory personDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.personDirectory= personDirectory;
        ArrayList<Person> personList = personDirectory.getPersonHistory();
        populatePatientsTable(personList);
        InputVerifier stringVerifier = new VerifierString();
        patientSearchBoxJTextField.setInputVerifier(stringVerifier);
    }
    
    private void populatePatientsTable(ArrayList<Person> personList) {
        DefaultTableModel model = (DefaultTableModel) personsViewJTable.getModel();
        model.setRowCount(0);
        if(personList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "No Persons found. Please add Persons",
                    "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (Person person : personList) {
            Object[] row = new Object[3];
            row[0] = person;
            row[1]= person.getPersonsAge();
            if(person.getPatient()!=null)
            {
                row[2] = person.getPatient().getIdentifierPatient();
            }
            else
            {
                row[2] = "Patient Not Created";
            }
            
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        personsViewJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        editPatientJButton = new javax.swing.JButton();
        patientViewJButton = new javax.swing.JButton();
        patientDeleteJButton = new javax.swing.JButton();
        patientSearchBoxJTextField = new javax.swing.JTextField();
        patientSearchJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        patientRefreshJButton = new javax.swing.JButton();
        patientCreateJButton = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(500, 700));
        setPreferredSize(new java.awt.Dimension(500, 700));

        personsViewJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Patient Name", "Age", "Patient ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(personsViewJTable);
        if (personsViewJTable.getColumnModel().getColumnCount() > 0) {
            personsViewJTable.getColumnModel().getColumn(0).setResizable(false);
            personsViewJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Patients");

        editPatientJButton.setText("Edit Patient");
        editPatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPatientJButtonActionPerformed(evt);
            }
        });

        patientViewJButton.setText("View Patient");
        patientViewJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientViewJButtonActionPerformed(evt);
            }
        });

        patientDeleteJButton.setText("Delete Patient");
        patientDeleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientDeleteJButtonActionPerformed(evt);
            }
        });

        patientSearchJButton.setText("Search Patient");
        patientSearchJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientSearchJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        patientRefreshJButton.setText("Refresh");
        patientRefreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientRefreshJButtonActionPerformed(evt);
            }
        });

        patientCreateJButton.setText("Create Patient");
        patientCreateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientCreateJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(patientSearchJButton)
                        .addGap(18, 18, 18)
                        .addComponent(patientSearchBoxJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(patientRefreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(patientCreateJButton)
                        .addGap(18, 18, 18)
                        .addComponent(patientViewJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editPatientJButton)
                        .addGap(18, 18, 18)
                        .addComponent(patientDeleteJButton))
                    .addComponent(jScrollPane1))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientViewJButton)
                    .addComponent(editPatientJButton)
                    .addComponent(patientDeleteJButton)
                    .addComponent(backJButton)
                    .addComponent(patientCreateJButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientRefreshJButton)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(patientSearchJButton)
                        .addComponent(patientSearchBoxJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(465, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void patientViewJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientViewJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow= personsViewJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Person person=(Person) personsViewJTable.getValueAt(selectedRow, 0);
        /*pass userProcessContainer and Patient*/
        Patient patient= person.getPatient();
        if(patient!=null)
        {
            ViewUpdatePatientDetailsJPanel vupdJPanel=
                    new ViewUpdatePatientDetailsJPanel(userProcessContainer, patient,Boolean.FALSE);
            userProcessContainer.add("vupdJPanel", vupdJPanel);
            CardLayout layout=(CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Patient not created, "
                    + "Please create Patient first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_patientViewJButtonActionPerformed

    private void editPatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPatientJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow= personsViewJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person=(Person) personsViewJTable.getValueAt(selectedRow, 0);
        /*pass userProcessContainer and Patient*/
        Patient patient= person.getPatient();
        if(patient!=null)
        {
            ViewUpdatePatientDetailsJPanel vupdJPanel=
                    new ViewUpdatePatientDetailsJPanel(userProcessContainer, patient,Boolean.TRUE);
            userProcessContainer.add("vupdJPanel", vupdJPanel);
            CardLayout layout=(CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Patient not created, "
                    + "Please create Patient first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editPatientJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void patientDeleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientDeleteJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow= personsViewJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person=(Person) personsViewJTable.getValueAt(selectedRow, 0);
        Patient patient=person.getPatient();
        if(patient==null)
        {
            JOptionPane.showMessageDialog(this, "Patient not created. Cannot delete",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        /*Ask confirmation*/
        int flag= JOptionPane.showConfirmDialog(this, "Are you sure want to remove?",
                "Warning", JOptionPane.YES_NO_OPTION);
        if(flag==0)
        {
            person.setPatient(null);
            populatePatientsTable(personDirectory.getPersonHistory());
        }
    }//GEN-LAST:event_patientDeleteJButtonActionPerformed

    private void patientRefreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientRefreshJButtonActionPerformed
        // TODO add your handling code here:
        patientSearchBoxJTextField.setText("");
        populatePatientsTable(personDirectory.getPersonHistory());
    }//GEN-LAST:event_patientRefreshJButtonActionPerformed

    private void patientSearchJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientSearchJButtonActionPerformed
        // TODO add your handling code here:
        String key= patientSearchBoxJTextField.getText().trim();
        if(key.length()==0)
        {
            JOptionPane.showMessageDialog(this, "Please enter key.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        ArrayList<Person> searchPatients;
        searchPatients=personDirectory.searchPatient(key);
        populatePatientsTable(searchPatients);
    }//GEN-LAST:event_patientSearchJButtonActionPerformed

    private void patientCreateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientCreateJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow= personsViewJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person=(Person) personsViewJTable.getValueAt(selectedRow, 0);
        if(person.getPatient()!=null)
        {
            JOptionPane.showMessageDialog(this, "Paient already exists.","Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        CreatePatientJPanel cpJPanel= new CreatePatientJPanel(userProcessContainer, person);
        userProcessContainer.add("cpJPanel", cpJPanel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_patientCreateJButtonActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton editPatientJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton patientCreateJButton;
    private javax.swing.JButton patientDeleteJButton;
    private javax.swing.JButton patientRefreshJButton;
    private javax.swing.JTextField patientSearchBoxJTextField;
    private javax.swing.JButton patientSearchJButton;
    private javax.swing.JButton patientViewJButton;
    private javax.swing.JTable personsViewJTable;
    // End of variables declaration//GEN-END:variables
}

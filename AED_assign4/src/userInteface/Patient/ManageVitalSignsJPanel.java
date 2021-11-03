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
import business.VitalSign;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author pradnya
 */
public class ManageVitalSignsJPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form VitalSignManagerJJPanel
     */
    private PersonDirectory personDirectory;
    private JPanel userProcessContainer;
    
    public ManageVitalSignsJPanel(JPanel userProcessContainer, PersonDirectory personDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.personDirectory= personDirectory;
        InputVerifier stringVerifier = new VerifierString();
        searchPatientBoxJTextField.setInputVerifier(stringVerifier);
        ArrayList<Person> personList = personDirectory.getPersonHistory();
        populatePatientsTable(personList);
        populateVitalSignTable(null);
    }
    
    private void populatePatientsTable(ArrayList<Person> personList) {
        DefaultTableModel model = (DefaultTableModel) viewPatientsJTable.getModel();
        model.setRowCount(0);
        if(personList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "No Persons found. Please add Persons",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
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
    
    private void populateVitalSignTable(Person person) {
        
        DefaultTableModel model = (DefaultTableModel) viewPatientVitalSignsJTable.getModel();
        model.setRowCount(0);
        if (person != null) {
            int patientAge = person.getPersonsAge();
            ArrayList<VitalSign> vitalSignList = person.getPatient().getHistoryVitals().getHistory();
            
            if (vitalSignList.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No vital signs found. Please"
                        + " add vital signs", "Error", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            for (VitalSign vitalSign : vitalSignList) {
                Object[] row = new Object[2];
                row[0] = vitalSign;
                row[1] = VitalSignStatus(patientAge, vitalSign);
                model.addRow(row);
            }
        }
    }
    
    private String VitalSignStatus(int patientAge, VitalSign vitalSign) {
        String vitalSignStatus = "Normal";
        
        int respirationRate = vitalSign.getRateRespiratory();
        int heartRate = vitalSign.getRateHeart();
        int bloodPressure = vitalSign.getPressureBlood();
        float weight = vitalSign.getPersonWeight();
        
        /*Toddler*/
        if (patientAge >= 1 && patientAge <= 3) {
            if ((respirationRate < 20 || respirationRate > 30) /*Respiration Rate*/
                    || (heartRate < 80 || heartRate > 130) /*Heart Rate*/
                    || (bloodPressure < 80 || bloodPressure > 110) /*Blood Pressure*/
                    || (weight < 22 || weight > 31)) /*Weight*/ {
                vitalSignStatus = "Abnormal";
            }
        }
        /*Preschooler*/
        if (patientAge >= 4 && patientAge <= 5) {
            if ((respirationRate < 20 || respirationRate > 30)
                    || (heartRate < 80 || heartRate > 120)
                    || (bloodPressure < 80 || bloodPressure > 110)
                    || (weight < 31 || weight > 40)) {
                vitalSignStatus = "Abnormal";
            }
        }
        /*School Age*/
        if (patientAge >= 6 && patientAge <= 12) {
            if ((respirationRate < 20 || respirationRate > 30)
                    || (heartRate < 70 || heartRate > 110)
                    || (bloodPressure < 80 || bloodPressure > 120)
                    || (weight < 41 || weight > 92)) {
                vitalSignStatus = "Abnormal";
            }
        }
        /*Adolescent*/
        if (patientAge >= 13) {
            if ((respirationRate < 12 || respirationRate > 20)
                    || (heartRate < 55 || heartRate > 105)
                    || (bloodPressure < 110 || bloodPressure > 120)
                    || (weight < 110)) {
                vitalSignStatus = "Abnormal";
            }
        }
        return vitalSignStatus;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        displayPatientDetailsJButton = new javax.swing.JButton();
        editPatientVitalSignsJButton = new javax.swing.JButton();
        addPatientVitalSignsJButton = new javax.swing.JButton();
        deletePatientVitalSignJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewPatientsJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewPatientVitalSignsJTable = new javax.swing.JTable();
        viewPatientVitalSignJButton = new javax.swing.JButton();
        refreshPatientVitalSignsJButton = new javax.swing.JButton();
        searchPatientBoxJTextField = new javax.swing.JTextField();
        searchPatientVitalsJButton = new javax.swing.JButton();
        refreshPatientVitalsJButton = new javax.swing.JButton();
        showPatientChartJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(500, 700));
        setPreferredSize(new java.awt.Dimension(500, 700));

        displayPatientDetailsJButton.setText("Display Details");
        displayPatientDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayPatientDetailsJButtonActionPerformed(evt);
            }
        });

        editPatientVitalSignsJButton.setText("Edit Vital Signs");
        editPatientVitalSignsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPatientVitalSignsJButtonActionPerformed(evt);
            }
        });

        addPatientVitalSignsJButton.setText("Add Vital Sign");
        addPatientVitalSignsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientVitalSignsJButtonActionPerformed(evt);
            }
        });

        deletePatientVitalSignJButton.setText("Delete Vital Sign");
        deletePatientVitalSignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePatientVitalSignJButtonActionPerformed(evt);
            }
        });

        viewPatientsJTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(viewPatientsJTable);

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        viewPatientVitalSignsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Timestamp", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(viewPatientVitalSignsJTable);
        if (viewPatientVitalSignsJTable.getColumnModel().getColumnCount() > 0) {
            viewPatientVitalSignsJTable.getColumnModel().getColumn(0).setResizable(false);
            viewPatientVitalSignsJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        viewPatientVitalSignJButton.setText("View Vital Signs");
        viewPatientVitalSignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientVitalSignJButtonActionPerformed(evt);
            }
        });

        refreshPatientVitalSignsJButton.setText("Refresh Vital Sign");
        refreshPatientVitalSignsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshPatientVitalSignsJButtonActionPerformed(evt);
            }
        });

        searchPatientVitalsJButton.setText("Search Patient");
        searchPatientVitalsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPatientVitalsJButtonActionPerformed(evt);
            }
        });

        refreshPatientVitalsJButton.setText("Refresh Patients");
        refreshPatientVitalsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshPatientVitalsJButtonActionPerformed(evt);
            }
        });

        showPatientChartJButton.setText("Show Chart");
        showPatientChartJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPatientChartJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(refreshPatientVitalSignsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(viewPatientVitalSignJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editPatientVitalSignsJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showPatientChartJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addComponent(deletePatientVitalSignJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(backJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchPatientVitalsJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addPatientVitalSignsJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchPatientBoxJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(refreshPatientVitalsJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(displayPatientDetailsJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(58, 58, 58)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(displayPatientDetailsJButton)
                            .addComponent(addPatientVitalSignsJButton)
                            .addComponent(backJButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchPatientVitalsJButton)
                            .addComponent(refreshPatientVitalsJButton)
                            .addComponent(searchPatientBoxJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewPatientVitalSignJButton)
                            .addComponent(editPatientVitalSignsJButton)
                            .addComponent(deletePatientVitalSignJButton))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(refreshPatientVitalSignsJButton)
                            .addComponent(showPatientChartJButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(245, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void viewPatientVitalSignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientVitalSignJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewPatientVitalSignsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        VitalSign vitalSign = (VitalSign) viewPatientVitalSignsJTable.getValueAt(selectedRow, 0);
        ViewUpdateVitalSignsJPanel vuvsJPanel = new ViewUpdateVitalSignsJPanel(userProcessContainer,
                vitalSign, Boolean.FALSE);
        userProcessContainer.add("vuvsJPanel", vuvsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewPatientVitalSignJButtonActionPerformed

    private void editPatientVitalSignsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPatientVitalSignsJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewPatientVitalSignsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        VitalSign vitalSign = (VitalSign) viewPatientVitalSignsJTable.getValueAt(selectedRow, 0);
        
        ViewUpdateVitalSignsJPanel vuvsJPanel = new ViewUpdateVitalSignsJPanel(userProcessContainer,
                vitalSign, Boolean.TRUE);
        userProcessContainer.add("vuvsJPanel", vuvsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_editPatientVitalSignsJButtonActionPerformed

    private void addPatientVitalSignsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientVitalSignsJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewPatientsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person = (Person) viewPatientsJTable.getValueAt(selectedRow, 0);
        Patient patient= person.getPatient();
        if(patient!=null)
        {
            CreateVitalSignJPanel cvsJPanel = new CreateVitalSignJPanel(userProcessContainer, patient);
            userProcessContainer.add("cvsJPanel", cvsJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Patient not created, Please create"
                    + " Patient first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addPatientVitalSignsJButtonActionPerformed

    private void displayPatientDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayPatientDetailsJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewPatientsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person = (Person) viewPatientsJTable.getValueAt(selectedRow, 0);
        Patient patient= person.getPatient();
        if(patient!=null)
        {
            populateVitalSignTable(person);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Patient not created, Please create "
                    + "Patient first.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_displayPatientDetailsJButtonActionPerformed

    private void deletePatientVitalSignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePatientVitalSignJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewPatientsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.");
            return;
        }
        Person person = (Person) viewPatientsJTable.getValueAt(selectedRow, 0);
        Patient patient= person.getPatient();
        if(patient==null)
        {
            JOptionPane.showMessageDialog(this, "Patient not created, Please create"
                    + " Patient first.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        selectedRow = viewPatientVitalSignsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        VitalSign vitalSign = (VitalSign) viewPatientVitalSignsJTable.getValueAt(selectedRow, 0);
        
        int flag= JOptionPane.showConfirmDialog(this, "Are you sure want to remove?",
                "Warning", JOptionPane.YES_NO_OPTION);
        if(flag==0)
        {
            patient.getHistoryVitals().deleteVitalSign(vitalSign);
            refreshVialSigns();
        }
    }//GEN-LAST:event_deletePatientVitalSignJButtonActionPerformed

    private void refreshPatientVitalSignsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshPatientVitalSignsJButtonActionPerformed
        // TODO add your handling code here:
        refreshVialSigns();
    }//GEN-LAST:event_refreshPatientVitalSignsJButtonActionPerformed

    private void searchPatientVitalsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPatientVitalsJButtonActionPerformed
        // TODO add your handling code here:
        String key = searchPatientBoxJTextField.getText().trim();
        if(key.length()==0)
        {
            JOptionPane.showMessageDialog(this, "Please enter key.","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        /*Storing searched patients in an array to display in table.*/
        ArrayList<Person> searchPatients = personDirectory.searchPatient(key);
        populatePatientsTable(searchPatients);
    }//GEN-LAST:event_searchPatientVitalsJButtonActionPerformed

    private void refreshPatientVitalsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshPatientVitalsJButtonActionPerformed
        // TODO add your handling code here:
        searchPatientBoxJTextField.setText("");
        populatePatientsTable(personDirectory.getPersonHistory());
    }//GEN-LAST:event_refreshPatientVitalsJButtonActionPerformed

    private void showPatientChartJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPatientChartJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewPatientsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a patient from table.",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        createChart();
    }//GEN-LAST:event_showPatientChartJButtonActionPerformed
    private void refreshVialSigns() {
        int selectedRow = viewPatientsJTable.getSelectedRow();
        if (selectedRow < 0) {
            populateVitalSignTable(null);
        } else {
            Person person = (Person) viewPatientsJTable.getValueAt(selectedRow, 0);
            Patient patient= person.getPatient();
            if(patient!=null)
            {
                populateVitalSignTable(person);
            }
            else
            {
                populateVitalSignTable(null);
            }
        }
    }
    
    private void createChart()
    {
        DefaultCategoryDataset vitalSignDataset=new DefaultCategoryDataset();
        int selectedRow = viewPatientsJTable.getSelectedRow();
        Person person = (Person) viewPatientsJTable.getValueAt(selectedRow, 0);
        Patient patient= person.getPatient();
        if(patient==null)
        {
            JOptionPane.showMessageDialog(this, "Patient not created, Please create "
                    + "Patient first.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        ArrayList<VitalSign> vitalSignList = patient.getHistoryVitals().getHistory();
        /*At least 2 vital sign records needed to show chart */
        if (vitalSignList.isEmpty() || vitalSignList.size() == 1) {
            JOptionPane.showMessageDialog(this, "No vital signs or only one vital "
                    + "sign found. At least 2 vital sign records needed to show chart!", 
                    "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (VitalSign vitalSign : vitalSignList) {
            vitalSignDataset.addValue(vitalSign.getRateRespiratory(),"RR", vitalSign.getTimestamp());
            vitalSignDataset.addValue(vitalSign.getRateHeart(),"HR", vitalSign.getTimestamp());
            vitalSignDataset.addValue(vitalSign.getPressureBlood(),"BP", vitalSign.getTimestamp());
            vitalSignDataset.addValue(vitalSign.getPersonWeight(),"WT", vitalSign.getTimestamp());
        }
        
        JFreeChart vitalSignChart= ChartFactory.createBarChart3D("Vital Sign Chart", 
                "Time Stamp", "Rate", vitalSignDataset, PlotOrientation.VERTICAL, true, false, false);
        vitalSignChart.setBackgroundPaint(Color.white);
        CategoryPlot vitalSignChartPlot = vitalSignChart.getCategoryPlot();
        vitalSignChartPlot.setBackgroundPaint(Color.lightGray);
        
        CategoryAxis vitalSignDomainAxis = vitalSignChartPlot.getDomainAxis();
        vitalSignDomainAxis.setCategoryLabelPositions(
                CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
        );
        
        NumberAxis vitalSignRangeAxis = (NumberAxis) vitalSignChartPlot.getRangeAxis();
        vitalSignRangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        
        ChartFrame chartFrame = new ChartFrame("Chart", vitalSignChart);
        chartFrame.setVisible(true);
        chartFrame.setSize(500, 500);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPatientVitalSignsJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton deletePatientVitalSignJButton;
    private javax.swing.JButton displayPatientDetailsJButton;
    private javax.swing.JButton editPatientVitalSignsJButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshPatientVitalSignsJButton;
    private javax.swing.JButton refreshPatientVitalsJButton;
    private javax.swing.JTextField searchPatientBoxJTextField;
    private javax.swing.JButton searchPatientVitalsJButton;
    private javax.swing.JButton showPatientChartJButton;
    private javax.swing.JButton viewPatientVitalSignJButton;
    private javax.swing.JTable viewPatientVitalSignsJTable;
    private javax.swing.JTable viewPatientsJTable;
    // End of variables declaration//GEN-END:variables
}

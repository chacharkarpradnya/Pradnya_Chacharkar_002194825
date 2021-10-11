/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.CarModelList;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pradnya
 */
public class ViewJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJpanel
     */
    private JPanel userProsContainer;
    private CarModelList carListInfo;
    private int mfg_year;
    //private ArrayList<Car> totalavailable;
    
    ViewJpanel(JPanel userProsContainer, CarModelList carListInfo) {
        initComponents();
        lbltimestamp.setText(UpdateJPanel.Time);
        this.userProsContainer=userProsContainer;
        this.carListInfo=carListInfo;
       
       populateTable();   
       
       totalAvailable();
      
    }
    
    
    private void totalAvailable(){
        ArrayList<Car> totalavailable = new ArrayList<>();
        totalavailable = carListInfo.getTotalAvailable();
        
        
        ArrayList<Car> totalUnavailable = new ArrayList<>();
        totalUnavailable = carListInfo.getTotalUnAvailable();
        int total = totalavailable.size();
        
        String S = Integer.toString(total);
        
        int totalN = totalUnavailable.size();
        
        String SS = Integer.toString(totalN);
     
       textAvailTotal.setText(S);
       textUnvailTotal.setText(SS);
    }
    

    
     private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tableView.getModel(); 
        dtm.setRowCount(0);
        for (Car car : carListInfo.getListCar()){
            Object[] row = new Object[10];
            row[0] = car;
            row[1] = car.getManu_year();
            row[2]= car.getMaxNoseating();
            row[3]= car.getMinSeating();
            row[4]=car.getSerialNo();
            row[5]=car.getModelNo();
            row[6]=car.getAvailbilityCity();
            row[7]=car.isAvb();
            row[8]=car.isMaint_cert();
            row[9]=car.getCreatOn();
            dtm.addRow(row);
            
    }
    }
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        maintBtnGrp = new javax.swing.ButtonGroup();
        avaiBtnGrp = new javax.swing.ButtonGroup();
        jLb1 = new javax.swing.JLabel();
        buttnBck = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableView = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        buttnSrch = new javax.swing.JButton();
        btnDlt = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        textAvailTotal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        textUnvailTotal = new javax.swing.JTextField();
        btnFirstAvail = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbltimestamp = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setEnabled(false);

        jLb1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLb1.setText("VIEW CARS");

        buttnBck.setText("Back");
        buttnBck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttnBckActionPerformed(evt);
            }
        });

        tableView.setFont(new java.awt.Font("Devanagari MT", 1, 12)); // NOI18N
        tableView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand", "Manufactured Year", "Max_Seats", "Min_Seats", "Serial Number", "Model Number", "Available City", "Availability", "Maintainance Cert", "Created On"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableView);

        jLabel12.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Functionalities:");

        buttnSrch.setText("Custom Search");
        buttnSrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttnSrchActionPerformed(evt);
            }
        });

        btnDlt.setText("Delete");
        btnDlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDltActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total number of Available cars");

        textAvailTotal.setEnabled(false);
        textAvailTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAvailTotalActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Total number of Unavailable cars");

        textUnvailTotal.setEnabled(false);
        textUnvailTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUnvailTotalActionPerformed(evt);
            }
        });

        btnFirstAvail.setText("First Available Passenger Car");
        btnFirstAvail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstAvailActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Updated On:");

        lbltimestamp.setText("  ");

        jButton1.setText("Refresh Table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(358, 358, 358))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(292, 292, 292)
                                .addComponent(jLb1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textUnvailTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(buttnBck, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDlt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(205, 205, 205)
                                    .addComponent(textAvailTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                                .addGap(213, 213, 213))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttnSrch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFirstAvail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(lbltimestamp, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLb1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltimestamp)
                    .addComponent(buttnSrch)
                    .addComponent(btnFirstAvail))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(textAvailTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(textUnvailTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttnBck, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDlt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttnBckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttnBckActionPerformed
           userProsContainer.remove(this);
           CardLayout layout = (CardLayout) userProsContainer.getLayout();
           layout.previous(userProsContainer);
    }//GEN-LAST:event_buttnBckActionPerformed

    private void buttnSrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttnSrchActionPerformed
       SearchJPanel panel = new SearchJPanel(userProsContainer,carListInfo);
       userProsContainer.add("SearchJPanel", panel);
        CardLayout layout = (CardLayout) userProsContainer.getLayout();
        layout.next(userProsContainer);
       
    }//GEN-LAST:event_buttnSrchActionPerformed

    private void btnDltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDltActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableView.getSelectedRow();
        if(selectedRow>=0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int selectedDialog = JOptionPane.showConfirmDialog(null, "Are you sure?", "Warning", dialogButton);
            if (selectedDialog == JOptionPane.YES_OPTION){
                Car car = (Car) tableView.getValueAt(selectedRow, 0);
                carListInfo.deleteCar(car);
                populateTable();
                
            }
        }
        
    }//GEN-LAST:event_btnDltActionPerformed

    private void textAvailTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAvailTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAvailTotalActionPerformed

    private void textUnvailTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUnvailTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUnvailTotalActionPerformed

    private void btnFirstAvailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstAvailActionPerformed
        // TODO add your handling code here:
        
        ArrayList<Car> result = carListInfo.getFirstAvailable();
        if (result==null){
            JOptionPane.showMessageDialog(null, "Invalid Model Number");
        }
        else {
      DefaultTableModel dtm = (DefaultTableModel) tableView.getModel();
       dtm.setRowCount(0);
       for(Car car : result){
           Object[] row = new Object[10];
           row[0] = car;
            row[1] = car.getManu_year();
            row[2]= car.getMaxNoseating();
            row[3]= car.getMinSeating();
            row[4]=car.getSerialNo();
            row[5]=car.getModelNo();
            row[6]=car.getAvailbilityCity();
            row[7]=car.isAvb();
            row[8]=car.isMaint_cert();
            row[9]=car.getCreatOn();
            dtm.addRow(row);
     }
    } 
        
        
    }//GEN-LAST:event_btnFirstAvailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup avaiBtnGrp;
    private javax.swing.JButton btnDlt;
    private javax.swing.JButton btnFirstAvail;
    private javax.swing.JButton buttnBck;
    private javax.swing.JButton buttnSrch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLb1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltimestamp;
    private javax.swing.ButtonGroup maintBtnGrp;
    private javax.swing.JTable tableView;
    private javax.swing.JTextField textAvailTotal;
    private javax.swing.JTextField textUnvailTotal;
    // End of variables declaration//GEN-END:variables
}

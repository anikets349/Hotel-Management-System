package hotelmanagementsystem;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahul
 */
public class DriverStatus extends javax.swing.JFrame {

    /**
     * Creates new form DriverStatus
     */
    public DriverStatus() {
        setTitle("Reception | Driver Status");
        setLocation(350,210);
        initComponents();
        
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.stm.executeQuery("select * from c##aniket.employeec where job='Driver'");
            while(rs.next()){
                empID.addItem(rs.getString("EID"));
            }
            ResultSet rs1 = c.stm.executeQuery("select * from c##aniket.customerc");
            while(rs1.next()){
                custID.addItem(rs1.getString(2));
            }
        }catch(Exception e){}
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        loc = new javax.swing.JTextField();
        car_company = new javax.swing.JTextField();
        car_model = new javax.swing.JTextField();
        car_type = new javax.swing.JTextField();
        ShowDetails = new javax.swing.JButton();
        VehicleID = new javax.swing.JComboBox<>();
        avail = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        SetStatus = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        empID = new javax.swing.JComboBox<>();
        custID = new javax.swing.JComboBox<>();
        BackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("EID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel2.setText("VehicleID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        jLabel3.setText("Car Company");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel4.setText("Car Model");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel5.setText("Type");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel6.setText("Available");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 20));

        jLabel7.setText("Location");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locActionPerformed(evt);
            }
        });
        getContentPane().add(loc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 200, -1));

        car_company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                car_companyActionPerformed(evt);
            }
        });
        getContentPane().add(car_company, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 200, -1));

        car_model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                car_modelActionPerformed(evt);
            }
        });
        getContentPane().add(car_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 200, -1));

        car_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                car_typeActionPerformed(evt);
            }
        });
        getContentPane().add(car_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 200, -1));

        ShowDetails.setText("Show Details");
        ShowDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(ShowDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 100, -1));

        VehicleID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "501", "502", "503", "504", "505" }));
        getContentPane().add(VehicleID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 80, -1));

        avail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        getContentPane().add(avail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmanagementsystem/img/driver.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 410, 300));

        SetStatus.setText("Update Status");
        SetStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetStatusActionPerformed(evt);
            }
        });
        getContentPane().add(SetStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 90, -1));

        jLabel9.setText("Customer ID");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Driver Status");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 210, -1));

        getContentPane().add(empID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 90, -1));

        getContentPane().add(custID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 120, -1));

        BackBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BackBtn.setText("←");
        BackBtn.setOpaque(false);
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void locActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locActionPerformed

    private void car_companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_car_companyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_car_companyActionPerformed

    private void car_modelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_car_modelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_car_modelActionPerformed

    private void car_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_car_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_car_typeActionPerformed

    private void SetStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetStatusActionPerformed
        String eid = (String)empID.getSelectedItem();
        String vid = (String)VehicleID.getSelectedItem();
        String cid = (String)custID.getSelectedItem();
        String available = (String)avail.getSelectedItem();
        if (available == "Yes")
            available = "Y";
        else
            available = "N";      
        String location = loc.getText();
        Conn con = new Conn();
            String query = "insert into c##aniket.DRIVERSTATUSC values('"+eid+"','"+vid+"','"+cid+"','"+available+"','"+location+"')";
            try{
                con.stm.executeQuery(query);
                JOptionPane.showMessageDialog(this,"Driver Status Updated");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
    }//GEN-LAST:event_SetStatusActionPerformed

    private void ShowDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDetailsActionPerformed
        String vid = (String)VehicleID.getSelectedItem();
        try{
            Conn con = new Conn();
            String query = "Select * from c##aniket.VEHICLEC where VID='"+vid+"'";
            ResultSet rs = con.stm.executeQuery(query);
            rs.next();
            car_company.setText(rs.getString(3));
            car_model.setText(rs.getString(4));
            car_type.setText(rs.getString(5));
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
    }//GEN-LAST:event_ShowDetailsActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
               // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_CancelActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Reception().setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

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
            java.util.logging.Logger.getLogger(DriverStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DriverStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DriverStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DriverStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DriverStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton SetStatus;
    private javax.swing.JButton ShowDetails;
    private javax.swing.JComboBox<String> VehicleID;
    private javax.swing.JComboBox<String> avail;
    private javax.swing.JTextField car_company;
    private javax.swing.JTextField car_model;
    private javax.swing.JTextField car_type;
    private javax.swing.JComboBox<String> custID;
    private javax.swing.JComboBox<String> empID;
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
    private javax.swing.JTextField loc;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementsystem;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Aniket
 */
public class UpdateCheckIn extends javax.swing.JFrame {
    private String cID = "";
    private int depAmt = 0;
    private int roomPrice = 0;
    private int balAmt = 0; 
    /**
     * Creates new form UpdateCheckIn
     */
    public UpdateCheckIn() {
        setTitle("Reception | Update Check-In Status");
        setLocation(400,250);
        initComponents();
        roomNo.setEditable(false);
        name.setEditable(false);
        checkInDate.setEditable(false);
        amtBal.setEditable(false);
        amtPaid.setEditable(false);
        amtBeingPaid.setEditable(false);
        try{
            Conn con = new Conn();
            String query = "select ID_No from c##aniket.CUSTOMERC";
            ResultSet rs = con.stm.executeQuery(query);
            while(rs.next()){
                custID.addItem(rs.getString("ID_No"));
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "An error occured");
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

        Background = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        custID = new javax.swing.JComboBox<>();
        roomNo = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        checkInDate = new javax.swing.JTextField();
        amtPaid = new javax.swing.JTextField();
        amtBal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        amtBeingPaid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmanagementsystem/img/checkin.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 320, 320));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("CUSTOMER CHECK-IN STATUS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 240, -1));

        jLabel2.setText("Customer ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setText("Room Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel5.setText("Check-In Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel6.setText("Amount Paid");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel7.setText("Pending Amount");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        getContentPane().add(custID, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 57, 146, -1));

        roomNo.setColumns(5);
        getContentPane().add(roomNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 87, -1, -1));

        name.setColumns(10);
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 117, 146, -1));

        checkInDate.setColumns(8);
        getContentPane().add(checkInDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 147, 146, -1));

        amtPaid.setColumns(3);
        getContentPane().add(amtPaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 187, 62, -1));

        amtBal.setColumns(3);
        getContentPane().add(amtBal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 217, 60, -1));

        jButton1.setText("Load Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 266, 100, -1));

        jButton2.setText("Update Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 266, 110, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("+");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        amtBeingPaid.setColumns(3);
        getContentPane().add(amtBeingPaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 187, 60, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cID = (String)custID.getSelectedItem();
        int rNo = 0;
        
        try{
            Conn con = new Conn();
            ResultSet rs1 = con.stm.executeQuery("select * from c##aniket.CUSTOMERC where ID_NO='"+cID+"'");
            while(rs1.next()){
                rNo = Integer.parseInt(rs1.getString("ROOMNO"));
                roomNo.setText(rs1.getString("ROOMNO"));
                name.setText(rs1.getString("NAME"));
                checkInDate.setText(rs1.getString("CHECKIN_DATE"));
                depAmt = Integer.parseInt(rs1.getString("DEPOSIT_AMT"));
                amtPaid.setText(rs1.getString("DEPOSIT_AMT"));
            }
            ResultSet rs2 = con.stm.executeQuery("select * from c##aniket.ROOMC where ROOM_NO="+rNo);
            while(rs2.next()){
                roomPrice = Integer.parseInt(rs2.getString(("PRICE")));
                balAmt = roomPrice - depAmt;
                amtBal.setText(Integer.toString(balAmt));
            }
            if(balAmt>0){
                amtBeingPaid.setEditable(true);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "An error occured");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int extraAmt = Integer.parseInt(amtBeingPaid.getText());
        if(extraAmt<0 || extraAmt>balAmt){
            JOptionPane.showMessageDialog(this, "Invalid Amount");
            amtBeingPaid.setText("");
        }
        else{
            balAmt = balAmt - extraAmt;
            depAmt = depAmt + extraAmt;
            String query = "update c##aniket.CUSTOMERC set DEPOSIT_AMT="+depAmt+" where ID_NO='"+cID+"'";
            try{
                Conn con = new Conn();
                con.stm.executeQuery(query);
                amtPaid.setText(Integer.toString(depAmt));
                amtBal.setText(Integer.toString(balAmt));
                JOptionPane.showMessageDialog(this, "Deposit Amount Updated.");
                amtBeingPaid.setText("");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "An error occured while updating the details");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateCheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateCheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTextField amtBal;
    private javax.swing.JTextField amtBeingPaid;
    private javax.swing.JTextField amtPaid;
    private javax.swing.JTextField checkInDate;
    private javax.swing.JComboBox<String> custID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField name;
    private javax.swing.JTextField roomNo;
    // End of variables declaration//GEN-END:variables
}

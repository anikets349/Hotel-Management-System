/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementsystem;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author Rahul
 */
public class CheckOut extends javax.swing.JFrame {

    /**
     * Creates new form CheckOut
     */
    public CheckOut() {
        setTitle("Reception | Check Out");
        setLocation(350,250);
        initComponents();
        cout.setDate(new Date());
        try{
            Conn c = new Conn();
            ResultSet rs = c.stm.executeQuery("select * from c##aniket.customerc");
            while(rs.next()){
                c1.add(rs.getString(2));
            }
            rs.close();
        }catch  (Exception e){}
        
        
        
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
        t1 = new javax.swing.JTextField();
        Checkout = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        c1 = new java.awt.Choice();
        cin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cout = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Customer ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel2.setText("Room Number :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 20));

        t1.setText(" ");
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 160, -1));

        Checkout.setText("Checkout");
        Checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckoutActionPerformed(evt);
            }
        });
        getContentPane().add(Checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 96, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 75, -1));
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 160, -1));
        getContentPane().add(cin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 160, -1));

        jLabel3.setText("Check-In date :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel4.setText("Check-Out date:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));
        getContentPane().add(cout, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 160, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("CHECK OUT");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 19, 150, -1));

        jButton3.setText("Load Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 100, 20));

        BackBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BackBtn.setText("←");
        BackBtn.setOpaque(false);
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\New folder\\4th Sem\\DBMS\\Course Project\\HotelManagementSystem\\src\\hotelmanagementsystem\\img\\checkout1.jpg")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Reception().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckoutActionPerformed
        String room = t1.getText();
        String custid = (String)c1.getSelectedItem();
        String checkin = cin.getText();
        System.out.println(checkin);
        String indate = checkin.substring(0,10);
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
        Date date = cout.getDate();
        String checkout = dateFormat.format(date);
        
        
        DateFormat timeFormat = new SimpleDateFormat("kk:mm:ss");
        String time = timeFormat.format(new Date());
        
        System.out.println(room );
        System.out.println(custid );
        System.out.println(indate);
        System.out.println(checkout);
        Conn con = new Conn();

        String query = "insert into c##aniket.BOOKINGC values("+room+",'"+custid+"',to_date('"+indate+"','yyyy-mm-dd hh24:mi:ss'),to_date('"+checkout+" "+time+"','dd/mm/yyyy hh24:mi:ss'))";
        String query1 = "update c##aniket.roomc set AVAILABILITY='Y', CLEANING_STATUS='Dirty' where ROOM_NO="+room;
        try{
            con.stm.executeQuery(query1);
            con.stm.executeQuery(query);
            JOptionPane.showMessageDialog(this,"Checkout Successfull");
            
            
        }
        catch(Exception ae){
            JOptionPane.showMessageDialog(this, ae.getMessage());
        }
            /*String query = "insert into c##aniket.bookingc values("+room+",'"+custid+"',to_date('"+checkin+"','dd-mm-yyyy'),to_date('"+checkout+"','mm-dd-yyyy'))";
            c.stm.executeQuery(query);
            String query1 = "update c##aniket.roomc set AVAILABILITY='Y' and Cleaning_Status='Dirty' where roomno="+room;
            c.stm.executeQuery(query1);
            JOptionPane.showMessageDialog(this,"Check Out Successful");   */  
        
    }//GEN-LAST:event_CheckoutActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                String id = c1.getSelectedItem();
        Conn c = new Conn();
        try {
            ResultSet rs = c.stm.executeQuery("select * from c##aniket.customerc where Id_no = '"+id+"'");
            while(rs.next()){
                t1.setText(rs.getString("RoomNo"));
                cin.setText(rs.getString("CheckIn_Date"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CheckOut.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton Checkout;
    private java.awt.Choice c1;
    private javax.swing.JTextField cin;
    private com.toedter.calendar.JDateChooser cout;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}

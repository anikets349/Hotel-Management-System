/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author Rahul
 */
public class AddVehicle extends javax.swing.JFrame {

    /**
     * Creates new form AddVehicle
     */
    public AddVehicle() {
        setTitle("Admin | Add Vehicle");
        setLocation(350,250);
        initComponents();
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
        vid = new javax.swing.JTextField();
        regNo = new javax.swing.JTextField();
        company = new javax.swing.JTextField();
        model = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        AddVehicle = new javax.swing.JButton();
        type = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(350, 250, 500, 410));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Vehicle ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel2.setText("Registration Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel3.setText("Car Company");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel4.setText("Car Model");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel5.setText("Car Type");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));
        getContentPane().add(vid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 190, -1));
        getContentPane().add(regNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 190, -1));
        getContentPane().add(company, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 190, -1));
        getContentPane().add(model, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 190, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmanagementsystem/img/vehicle.jpg"))); // NOI18N
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 300, 170));

        AddVehicle.setText("Add Vehicle");
        AddVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddVehicleActionPerformed(evt);
            }
        });
        getContentPane().add(AddVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 320, -1));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedan", "Suv", "Hatchback", "Convertible" }));
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ADD A NEW VEHICLE");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 330, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddVehicleActionPerformed
        String vehicleId = vid.getText();
        String reg = regNo.getText();
        String carCompany = company.getText();
        String carModel = model.getText();
        String carType = (String)type.getSelectedItem();
        Conn con = new Conn();
            String query = "insert into c##aniket.VEHICLEC values('"+vehicleId+"','"+reg+"','"+carCompany+"','"+carModel+"','"+carType+"')";
            try{
                con.stm.executeQuery(query);
                JOptionPane.showMessageDialog(this,"New Vehicle Added");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
    }//GEN-LAST:event_AddVehicleActionPerformed

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
            java.util.logging.Logger.getLogger(AddVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddVehicle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddVehicle;
    private javax.swing.JTextField company;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField model;
    private javax.swing.JTextField regNo;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField vid;
    // End of variables declaration//GEN-END:variables
}

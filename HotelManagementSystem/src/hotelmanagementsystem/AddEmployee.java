/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author Aniket
 */
public class AddEmployee extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployee
     */
    public AddEmployee() {
        setTitle("Admin | Add Employee");
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

        AddLabel = new javax.swing.JLabel();
        Picture = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        DOB = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        Job = new javax.swing.JLabel();
        Salary = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        NameField = new javax.swing.JTextField();
        DOBField = new javax.swing.JTextField();
        SalaryField = new javax.swing.JTextField();
        PhoneField = new javax.swing.JTextField();
        IDField = new javax.swing.JTextField();
        GenderMale = new javax.swing.JRadioButton();
        GenderFemale = new javax.swing.JRadioButton();
        JobField = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AddLabel.setText("Add an Employee");

        Picture.setIcon(new javax.swing.ImageIcon("D:\\New folder\\4th Sem\\DBMS\\Course Project\\HotelManagementSystem\\src\\hotelmanagementsystem\\img\\employee.png")); // NOI18N

        Name.setText("Name");

        DOB.setText("DOB");

        Gender.setText("Gender");

        Job.setText("Job");

        Salary.setText("Salary");

        Phone.setText("Phone");

        ID.setText("ID no.");

        AddButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddButton.setText("Add Employee");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        NameField.setColumns(10);

        DOBField.setColumns(10);

        SalaryField.setColumns(10);

        PhoneField.setColumns(10);

        IDField.setColumns(10);

        GenderMale.setText("Male");
        GenderMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderMaleActionPerformed(evt);
            }
        });

        GenderFemale.setText("Female");

        JobField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reception", "Waiter", "Cook", "House Keeping", "Safety" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DOB)
                            .addComponent(Salary)
                            .addComponent(Phone)
                            .addComponent(ID)
                            .addComponent(Gender)
                            .addComponent(Job))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JobField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(IDField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PhoneField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SalaryField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AddButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(GenderMale, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GenderFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(NameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                .addComponent(DOBField, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addComponent(Name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Picture)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name)
                            .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AddLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DOB)
                            .addComponent(DOBField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Gender)
                            .addComponent(GenderMale)
                            .addComponent(GenderFemale))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Job)
                            .addComponent(JobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Salary)
                            .addComponent(SalaryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Phone)
                            .addComponent(PhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ID))
                        .addGap(18, 18, 18)
                        .addComponent(AddButton))
                    .addComponent(Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
        String name = NameField.getText();
        String dob = DOBField.getText();
        String sal = SalaryField.getText();
        String phno = PhoneField.getText();
        String id = IDField.getText();
        if(validateData(name,dob,id)){
            String gender = "";
            if(GenderMale.isSelected()){
                gender = "Male";
            }
            else if(GenderFemale.isSelected()){
                gender = "Female";
            }
            String job = (String)JobField.getSelectedItem();
            Conn con = new Conn();
            String query = "insert into c##aniket.EMPLOYEEC values('"+id+"','"+name+"',to_date('"+dob+"','dd-mm-yyyy'),'"+gender+"','"+job+"','"+Float.parseFloat(sal)+"','"+phno+"')";
            try{
                con.stm.executeQuery(query);
                JOptionPane.showMessageDialog(this,"New Employee Added");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }

    }//GEN-LAST:event_AddButtonActionPerformed

    private void GenderMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderMaleActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel AddLabel;
    private javax.swing.JLabel DOB;
    private javax.swing.JTextField DOBField;
    private javax.swing.JLabel Gender;
    private javax.swing.JRadioButton GenderFemale;
    private javax.swing.JRadioButton GenderMale;
    private javax.swing.JLabel ID;
    private javax.swing.JTextField IDField;
    private javax.swing.JLabel Job;
    private javax.swing.JComboBox<String> JobField;
    private javax.swing.JLabel Name;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel Phone;
    private javax.swing.JTextField PhoneField;
    private javax.swing.JLabel Picture;
    private javax.swing.JLabel Salary;
    private javax.swing.JTextField SalaryField;
    // End of variables declaration//GEN-END:variables

    private boolean validateData(String name,String dob,String id) {
       if(name.length()==0){
           JOptionPane.showMessageDialog(this,"Name cannot be left blank."); 
       }
       else if(dob.length()==0){
           JOptionPane.showMessageDialog(this,"DOB cannot be left blank."); 
       }
       else if(id.length()==0){
           JOptionPane.showMessageDialog(this,"ID cannot be left blank."); 
       }
       else{
         return true;  
       } 
       return false;
    }
}

package tesina;

/*
Alan
 */
import Tesina.Admin_Add;
import Tesina.Admin_Menu;
import Tesina.Creditos;
import javax.swing.JOptionPane;
import java.sql.*;

public class LogIn extends javax.swing.JFrame {

    public LogIn() {
        initComponents();
    }
    public String UserName;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Background = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jLabel_Title = new javax.swing.JLabel();
        jLabel_User = new javax.swing.JLabel();
        jTextField_User = new javax.swing.JTextField();
        jLabel_Password = new javax.swing.JLabel();
        jPasswordField_Password = new javax.swing.JPasswordField();
        jButton_Login = new javax.swing.JButton();
        jButton_Credits = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LogIn");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(500, 400));
        setLocationByPlatform(true);
        setResizable(false);

        jPanel_Background.setBackground(new java.awt.Color(51, 51, 51));

        jPanelHeader.setBackground(new java.awt.Color(102, 102, 102));

        jLabel_Title.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Title.setText("                 QR HELPER");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel_User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/User.png"))); // NOI18N

        jTextField_User.setBackground(new java.awt.Color(102, 102, 102));
        jTextField_User.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_User.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Usuario-Curp"));
        jTextField_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UserActionPerformed(evt);
            }
        });

        jLabel_Password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Lock.png"))); // NOI18N

        jPasswordField_Password.setBackground(new java.awt.Color(102, 102, 102));
        jPasswordField_Password.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField_Password.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Contraseña"));

        jButton_Login.setText("LogIn");
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });

        jButton_Credits.setText("Credits");
        jButton_Credits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CreditsActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("V 0.0.1");

        javax.swing.GroupLayout jPanel_BackgroundLayout = new javax.swing.GroupLayout(jPanel_Background);
        jPanel_Background.setLayout(jPanel_BackgroundLayout);
        jPanel_BackgroundLayout.setHorizontalGroup(
            jPanel_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_BackgroundLayout.createSequentialGroup()
                        .addGroup(jPanel_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_User)
                            .addComponent(jLabel_Password))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField_Password)
                            .addComponent(jTextField_User)))
                    .addGroup(jPanel_BackgroundLayout.createSequentialGroup()
                        .addComponent(jButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Credits, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel_BackgroundLayout.setVerticalGroup(
            jPanel_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BackgroundLayout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_User))
                .addGap(18, 18, 18)
                .addGroup(jPanel_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordField_Password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Credits, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
        // TODO add your handling code here:
        try {
            Admin_Menu menu_Admin = new Admin_Menu();
            menu_Admin.setVisible(false);
            User_QR user_QR = new User_QR();
            user_QR.setVisible(false);
            int var = 0;
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbqr", "root", "");
            String sqlString = "SELECT * FROM account WHERE account.Curp=? AND account.User_Password=?";
            PreparedStatement PST = connection.prepareStatement(sqlString);
            PST.setString(1, jTextField_User.getText());
            PST.setString(2, jPasswordField_Password.getText());
            ResultSet RS = PST.executeQuery();

            User_QR.jLabel_User.setText(jTextField_User.getText());
            Admin_Menu.jLabel_User.setText(jTextField_User.getText());
            UserName = jTextField_User.getText();

            String sqlString2 = "select * from admin where admin_name=? and admin_password=?";
            PreparedStatement PST2 = connection.prepareStatement(sqlString2);
            PST2.setString(1, jTextField_User.getText());
            PST2.setString(2, jPasswordField_Password.getText());
            ResultSet RS2 = PST2.executeQuery();

            if (RS2.next()) {
                var = 1;
            } else {
                jPasswordField_Password.setText("");
                jTextField_User.setText("");
            }
            if (RS.next()) {
                var = 2;
            } else {
                jPasswordField_Password.setText("");
                jTextField_User.setText("");
            }
            switch (var) {
                case 1:
                    //Admin
                    JOptionPane.showMessageDialog(this, "\nWelcome Admin #" + UserName);
                    menu_Admin.setVisible(true);
                    dispose();
                    break;
                case 2:
                    //User
                    JOptionPane.showMessageDialog(this, "\nWelcome");
                    user_QR.setVisible(true);
                    dispose();
                    break;
                default:
                    System.out.println("Error Switch");
            }
            var = 0;
            connection.close();
        } catch (SQLException e) {
            //Message if something goes wrong while conneting to the database
            System.out.println("Error while connecting to the database");
        }
    }//GEN-LAST:event_jButton_LoginActionPerformed

    private void jTextField_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UserActionPerformed

    private void jButton_CreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CreditsActionPerformed
        // TODO add your handling code here:
        Creditos creditos = new Creditos();
        creditos.show();
        dispose();
    }//GEN-LAST:event_jButton_CreditsActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Credits;
    private javax.swing.JButton jButton_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JLabel jLabel_User;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanel_Background;
    public static javax.swing.JPasswordField jPasswordField_Password;
    public static javax.swing.JTextField jTextField_User;
    // End of variables declaration//GEN-END:variables
}

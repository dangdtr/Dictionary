package AppFrame;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

/**
 * @author Fedora
 * @author Dell
 */
public class MenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form MenuFrame
     */
    public MenuFrame() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        appTitleJLabel = new javax.swing.JLabel();
        searchJButton = new javax.swing.JButton();
        addJButton = new javax.swing.JButton();
        removeJButton = new javax.swing.JButton();
        googleJButton = new javax.swing.JButton();
        menuTitleJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dictionary");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(85, 26, 139));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        appTitleJLabel.setFont(new java.awt.Font("UTM Daxline", Font.BOLD, 24)); // NOI18N
        appTitleJLabel.setForeground(new java.awt.Color(255, 255, 255));
        appTitleJLabel.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Image/book_icon.png")))); // NOI18N
        appTitleJLabel.setText("DICTIONARY ENGLISH - VIETNAMESE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 25, 12, 21);
        jPanel1.add(appTitleJLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 8);
        jPanel2.add(jPanel1, gridBagConstraints);

        searchJButton.setBackground(new java.awt.Color(153, 51, 255));
        searchJButton.setFont(new java.awt.Font("UTM Daxline", Font.BOLD, 18)); // NOI18N
        searchJButton.setForeground(new java.awt.Color(255, 255, 255));
        searchJButton.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Image/search_icon.png")))); // NOI18N
        searchJButton.setText("Search Word");
        searchJButton.addActionListener(this::searchJButtonActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 79;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 165, 0, 0);
        jPanel2.add(searchJButton, gridBagConstraints);

        addJButton.setBackground(new java.awt.Color(153, 51, 255));
        addJButton.setFont(new java.awt.Font("UTM Daxline", Font.BOLD, 18));
        addJButton.setForeground(new java.awt.Color(255, 255, 255));
        addJButton.setText("Add New Word");
        addJButton.addActionListener(this::addJButtonActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 82;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 165, 0, 0);
        jPanel2.add(addJButton, gridBagConstraints);

        removeJButton.setBackground(new java.awt.Color(153, 51, 255));
        removeJButton.setFont(new java.awt.Font("UTM Daxline", Font.BOLD, 18));
        removeJButton.setForeground(new java.awt.Color(255, 255, 255));
        removeJButton.setText("Remove Word");
        removeJButton.addActionListener(this::removeJButtonActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 91;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 165, 0, 0);
        jPanel2.add(removeJButton, gridBagConstraints);

        googleJButton.setBackground(new java.awt.Color(153, 51, 255));
        googleJButton.setFont(new java.awt.Font("UTM Daxline", Font.BOLD, 18));
        googleJButton.setForeground(new java.awt.Color(255, 255, 255));
        googleJButton.setText("Google Translate");
        googleJButton.addActionListener(this::googleJButtonActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 59;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 165, 29, 0);
        jPanel2.add(googleJButton, gridBagConstraints);

        menuTitleJLabel.setFont(new java.awt.Font("UTM Daxline", Font.BOLD, 24));
        menuTitleJLabel.setText("  MENU");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 246, 0, 0);
        jPanel2.add(menuTitleJLabel, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJButtonActionPerformed
        new searchFrame().setVisible(true);
    }//GEN-LAST:event_searchJButtonActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        new addFrame().setVisible(true);
    }//GEN-LAST:event_addJButtonActionPerformed

    private void removeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeJButtonActionPerformed
        new removeFrame().setVisible(true);
    }//GEN-LAST:event_removeJButtonActionPerformed

    private void googleJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_googleJButtonActionPerformed
        new ggFrame().setVisible(true);
    }//GEN-LAST:event_googleJButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MenuFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JLabel appTitleJLabel;
    private javax.swing.JButton googleJButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel menuTitleJLabel;
    private javax.swing.JButton removeJButton;
    private javax.swing.JButton searchJButton;
    // End of variables declaration//GEN-END:variables
}

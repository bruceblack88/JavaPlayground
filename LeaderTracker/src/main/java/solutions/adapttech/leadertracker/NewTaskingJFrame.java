/*
Bruce Black
Software Development
CSIS 505
Leader Tracker
July 4, 2021
 */
package solutions.adapttech.leadertracker;

import javax.swing.DefaultListModel;

/**
 *
 * @author bruceblack
 */
public class NewTaskingJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewTaskingJFrame
     */
    public NewTaskingJFrame() {
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

        taskingNumberJLabel = new javax.swing.JLabel();
        taskingNameJLabel = new javax.swing.JLabel();
        taskingLocationJLabel = new javax.swing.JLabel();
        taskingDueDateJLabel = new javax.swing.JLabel();
        taskingAssignedToJLabel = new javax.swing.JLabel();
        taskingNumberJTextField = new javax.swing.JTextField();
        taskingNameJTextField = new javax.swing.JTextField();
        locationJTextField = new javax.swing.JTextField();
        saveJButton = new javax.swing.JButton();
        HomeJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taskingJList = new javax.swing.JList<>();
        taskingDueDateJTextField = new javax.swing.JTextField();
        taskingAssignedToJTextField = new javax.swing.JTextField();
        deleteJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        taskingNumberJLabel.setText("Tasking Number:");

        taskingNameJLabel.setText("Tasking Name:");

        taskingLocationJLabel.setText("Tasking Location:");

        taskingDueDateJLabel.setText("Tasking Due Date:");

        taskingAssignedToJLabel.setText("Tasking Assigned To:");

        taskingNumberJTextField.setText("001");

        taskingNameJTextField.setText("tasking name");

        locationJTextField.setText("location");

        saveJButton.setText("Save");
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        HomeJButton.setText("Home");
        HomeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeJButtonActionPerformed(evt);
            }
        });

        taskingJList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(taskingJList);

        taskingDueDateJTextField.setText("YYYYMMDD");

        taskingAssignedToJTextField.setText("SSG Black, Bruce");

        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(taskingNumberJLabel)
                        .addGap(82, 82, 82)
                        .addComponent(taskingNumberJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(saveJButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(taskingNameJLabel)
                                .addComponent(taskingLocationJLabel)
                                .addComponent(taskingDueDateJLabel)
                                .addComponent(taskingAssignedToJLabel)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(locationJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(taskingNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(taskingDueDateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(taskingAssignedToJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HomeJButton))))))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteJButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(taskingNumberJLabel)
                            .addComponent(taskingNumberJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(taskingNameJLabel)
                            .addComponent(taskingNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(taskingLocationJLabel)
                            .addComponent(locationJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(taskingDueDateJLabel)
                            .addComponent(taskingDueDateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(taskingAssignedToJLabel)
                            .addComponent(taskingAssignedToJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveJButton)
                    .addComponent(HomeJButton)
                    .addComponent(deleteJButton))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeJButtonActionPerformed
        new HomeJFrame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeJButtonActionPerformed
    DefaultListModel mod = new DefaultListModel();
    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        taskingJList.setModel(mod);

        mod.addElement(taskingNumberJTextField.getText().trim());
        mod.addElement(taskingNameJTextField.getText().trim());
        mod.addElement(locationJTextField.getText().trim());
        mod.addElement(taskingDueDateJTextField.getText().trim());
        mod.addElement(taskingAssignedToJTextField.getText().trim());

    }//GEN-LAST:event_saveJButtonActionPerformed

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        taskingJList.setModel(mod);

        mod.removeElement(taskingNumberJTextField.getText().trim());
        mod.removeElement(taskingNameJTextField.getText().trim());
        mod.removeElement(locationJTextField.getText().trim());
        mod.removeElement(taskingDueDateJTextField.getText().trim());
        mod.removeElement(taskingAssignedToJTextField.getText().trim());

    }//GEN-LAST:event_deleteJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewTaskingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewTaskingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewTaskingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewTaskingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewTaskingJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeJButton;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField locationJTextField;
    private javax.swing.JButton saveJButton;
    private javax.swing.JLabel taskingAssignedToJLabel;
    private javax.swing.JTextField taskingAssignedToJTextField;
    private javax.swing.JLabel taskingDueDateJLabel;
    private javax.swing.JTextField taskingDueDateJTextField;
    private javax.swing.JList<String> taskingJList;
    private javax.swing.JLabel taskingLocationJLabel;
    private javax.swing.JLabel taskingNameJLabel;
    private javax.swing.JTextField taskingNameJTextField;
    private javax.swing.JLabel taskingNumberJLabel;
    private javax.swing.JTextField taskingNumberJTextField;
    // End of variables declaration//GEN-END:variables
}

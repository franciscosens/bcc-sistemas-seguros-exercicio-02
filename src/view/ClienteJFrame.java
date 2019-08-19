package view;

import bean.Cliente;
import dao.ClienteDAOQuestao01;
import dao.ClienteDAOQuestao02;
import dao.ClienteDAOQuestao03;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 * @author Francisco Lucas Sens e Patrick Krausss
 */
public class ClienteJFrame extends javax.swing.JFrame {

    private ClienteDAOQuestao01 daoQuestao01;
    private ClienteDAOQuestao02 daoQuestao02;
    private ClienteDAOQuestao03 daoQuestao03;

    public ClienteJFrame() {
        initComponents();
        daoQuestao01 = new ClienteDAOQuestao01();
        daoQuestao02 = new ClienteDAOQuestao02();
        daoQuestao03 = new ClienteDAOQuestao03();
        atualizarTabelaQuestao01();
        atualizarTabelaQuestao02();
        atualizarTabelaQuestao03();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableQuestao01 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldQuestao01 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldQuestao02 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableQuestao02 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableQuestao03 = new javax.swing.JTable();
        jTextFieldQuestao03 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableQuestao01.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableQuestao01);
        if (jTableQuestao01.getColumnModel().getColumnCount() > 0) {
            jTableQuestao01.getColumnModel().getColumn(0).setResizable(false);
            jTableQuestao01.getColumnModel().getColumn(1).setResizable(false);
            jTableQuestao01.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Busca permitindo SQL Injection");

        jTextFieldQuestao01.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldQuestao01.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldQuestao01KeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Busca com lista branca");

        jTextFieldQuestao02.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldQuestao02.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldQuestao02KeyPressed(evt);
            }
        });

        jTableQuestao02.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableQuestao02);
        if (jTableQuestao02.getColumnModel().getColumnCount() > 0) {
            jTableQuestao02.getColumnModel().getColumn(0).setResizable(false);
            jTableQuestao02.getColumnModel().getColumn(1).setResizable(false);
            jTableQuestao02.getColumnModel().getColumn(2).setResizable(false);
        }

        jTableQuestao03.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableQuestao03);
        if (jTableQuestao03.getColumnModel().getColumnCount() > 0) {
            jTableQuestao03.getColumnModel().getColumn(0).setResizable(false);
            jTableQuestao03.getColumnModel().getColumn(1).setResizable(false);
            jTableQuestao03.getColumnModel().getColumn(2).setResizable(false);
        }

        jTextFieldQuestao03.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldQuestao03.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldQuestao03KeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Busca com classe PreparedStatement");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldQuestao01)
                    .addComponent(jScrollPane1)
                    .addComponent(jTextFieldQuestao02)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                    .addComponent(jTextFieldQuestao03)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldQuestao01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldQuestao02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldQuestao03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldQuestao01KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQuestao01KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            atualizarTabelaQuestao01();
        }
    }//GEN-LAST:event_jTextFieldQuestao01KeyPressed

    private void jTextFieldQuestao02KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQuestao02KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            atualizarTabelaQuestao02();
        }
    }//GEN-LAST:event_jTextFieldQuestao02KeyPressed

    private void jTextFieldQuestao03KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQuestao03KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            atualizarTabelaQuestao03();
        }
    }//GEN-LAST:event_jTextFieldQuestao03KeyPressed

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
            java.util.logging.Logger.getLogger(ClienteJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableQuestao01;
    private javax.swing.JTable jTableQuestao02;
    private javax.swing.JTable jTableQuestao03;
    private javax.swing.JTextField jTextFieldQuestao01;
    private javax.swing.JTextField jTextFieldQuestao02;
    private javax.swing.JTextField jTextFieldQuestao03;
    // End of variables declaration//GEN-END:variables

    private void atualizarTabelaQuestao01() {
        try {
            List<Cliente> clientes = daoQuestao01.obterTodos(jTextFieldQuestao01.getText());
            DefaultTableModel dtm = (DefaultTableModel) jTableQuestao01.getModel();
            dtm.setRowCount(0);
            for (Cliente cliente : clientes) {
                dtm.addRow(new Object[]{
                    cliente.getId(),
                    cliente.getNome(),
                    cliente.getCpf()
                });
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void atualizarTabelaQuestao02() {
        try {
            List<Cliente> clientes = daoQuestao02.obterTodos(jTextFieldQuestao02.getText());
            DefaultTableModel dtm = (DefaultTableModel) jTableQuestao02.getModel();
            dtm.setRowCount(0);
            for (Cliente cliente : clientes) {
                dtm.addRow(new Object[]{
                    cliente.getId(),
                    cliente.getNome(),
                    cliente.getCpf()
                });
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void atualizarTabelaQuestao03() {
        try {
            List<Cliente> clientes = daoQuestao03.obterTodos(jTextFieldQuestao03.getText());
            DefaultTableModel dtm = (DefaultTableModel) jTableQuestao03.getModel();
            dtm.setRowCount(0);
            for (Cliente cliente : clientes) {
                dtm.addRow(new Object[]{
                    cliente.getId(),
                    cliente.getNome(),
                    cliente.getCpf()
                });
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

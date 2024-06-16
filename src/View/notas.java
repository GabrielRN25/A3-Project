package View;

import ClassCT.class_Notas;
import DB.NotasDb;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class notas extends javax.swing.JFrame {

    public notas() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/image/logo.png")).getImage());
        this.setResizable(false);
        listarNotas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraTop = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaNotas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        adicionarjbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setMinimumSize(null);

        barraTop.setBackground(new java.awt.Color(255, 51, 51));
        barraTop.setForeground(new java.awt.Color(255, 51, 51));

        title1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setText("Boletim Virtual");

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/5930366.png"))); // NOI18N
        image.setPreferredSize(new java.awt.Dimension(75, 80));

        javax.swing.GroupLayout barraTopLayout = new javax.swing.GroupLayout(barraTop);
        barraTop.setLayout(barraTopLayout);
        barraTopLayout.setHorizontalGroup(
            barraTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(title1)
                .addGap(240, 240, 240))
        );
        barraTopLayout.setVerticalGroup(
            barraTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraTopLayout.createSequentialGroup()
                .addGroup(barraTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barraTopLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(title1))
                    .addGroup(barraTopLayout.createSequentialGroup()
                        .addContainerGap(11, Short.MAX_VALUE)
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        title2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        title2.setText("Componente Curricular:");

        tabelaNotas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabelaNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Alunos", "A1", "A2", "A3", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Byte.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaNotasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaNotas);
        if (tabelaNotas.getColumnModel().getColumnCount() > 0) {
            tabelaNotas.getColumnModel().getColumn(0).setResizable(false);
            tabelaNotas.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabelaNotas.getColumnModel().getColumn(1).setResizable(false);
            tabelaNotas.getColumnModel().getColumn(2).setResizable(false);
            tabelaNotas.getColumnModel().getColumn(2).setPreferredWidth(50);
            tabelaNotas.getColumnModel().getColumn(3).setResizable(false);
            tabelaNotas.getColumnModel().getColumn(3).setPreferredWidth(50);
            tabelaNotas.getColumnModel().getColumn(4).setResizable(false);
            tabelaNotas.getColumnModel().getColumn(4).setPreferredWidth(50);
            tabelaNotas.getColumnModel().getColumn(5).setResizable(false);
            tabelaNotas.getColumnModel().getColumn(5).setPreferredWidth(70);
        }

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Página principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Soluções Computacionais");
        jLabel1.setPreferredSize(new java.awt.Dimension(190, 26));

        adicionarjbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adicionarjbutton.setText("ADICIONAR");
        adicionarjbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarjbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(adicionarjbutton)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(adicionarjbutton))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new notas().setVisible(true);
            }
        });
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tela t = new tela();
        this.dispose();
        t.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void adicionarjbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarjbuttonActionPerformed
        // TODO add your handling code here:
        addNotas d = new addNotas();
        this.dispose();
        d.setVisible(true);
    }//GEN-LAST:event_adicionarjbuttonActionPerformed

    private void tabelaNotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaNotasMouseClicked
       int select = tabelaNotas.getSelectedRow();
TableModel tableModel = tabelaNotas.getModel();

String id = tableModel.getValueAt(select,0).toString();
String nome = tableModel.getValueAt(select,1).toString();
String a1 = tableModel.getValueAt(select,2).toString();
String a2 = tableModel.getValueAt(select,3).toString();
String a3 = tableModel.getValueAt(select,4).toString();

 editar editar = new editar();
editar.setVisible(true);
this.dispose();
editar.pack();
editar.setLocationRelativeTo(null);
editar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

editar.editId.setText(id);
editar.editNome.setText(nome);
editar.editA1.setText(a1);
editar.editA2.setText(a2);
editar.editA3.setText(a3);

    }//GEN-LAST:event_tabelaNotasMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarjbutton;
    private javax.swing.JPanel barraTop;
    public javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaNotas;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables
private void listarNotas() {
        try {
            NotasDb objNotasDb = new NotasDb();

            DefaultTableModel model = (DefaultTableModel) tabelaNotas.getModel();
            model.setNumRows(0);

            ArrayList<class_Notas> lista = objNotasDb.pesquisar();

            for (int num = 0; num < lista.size(); num++) {

                model.addRow(new Object[]{
                    lista.get(num).getId(),
                    lista.get(num).getNome(),
                    lista.get(num).getA1(),
                    lista.get(num).getA2(),
                    lista.get(num).getA3(),
                    lista.get(num).getTotal()
                });

            }

        } catch (Exception erro) {
            JOptionPane.showInternalMessageDialog(null, "listarNotas" + erro);
        }
    }



}

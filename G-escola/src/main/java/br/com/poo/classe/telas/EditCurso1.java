
package br.com.poo.classe.telas;

import br.com.conexao.ConexaoDAO;
import br.com.poo.classe.Curso;
import br.com.poo.classe.Disciplina;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class EditCurso1 extends javax.swing.JFrame {

   ConexaoDAO banco = new ConexaoDAO();
    int posicao;
    public EditCurso1() {
        initComponents();
    }
    public void PegaPosicao(int posicao){
        this.posicao = posicao;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        boxTurno = new javax.swing.JComboBox<>();
        boxSituacao = new javax.swing.JComboBox<>();
        boxCargaHoraria = new javax.swing.JComboBox<>();
        campDescricao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        listDisciplinaAlocada = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campSigla = new javax.swing.JTextField();
        campNomeCurso = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(java.awt.Color.darkGray);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu Curso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(890, 530));
        jPanel2.setPreferredSize(new java.awt.Dimension(890, 530));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(java.awt.Color.darkGray);
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Turno:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 50, 60, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Situação:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Carga Horaria:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 51, -1, -1));

        boxTurno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        boxTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "Manhã", "Tarde", "Noite" }));
        jPanel3.add(boxTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 70, 100, -1));

        boxSituacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        boxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "Ativo", "Negado" }));
        jPanel3.add(boxSituacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 110, -1));

        boxCargaHoraria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        boxCargaHoraria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "1200", "500", "100", "2000", " " }));
        jPanel3.add(boxCargaHoraria, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 71, 100, -1));

        campDescricao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(campDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 137, 176, 160));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Descrição:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 117, -1, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 107, 490, 10));

        listDisciplinaAlocada.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listDisciplinaAlocada);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 137, 171, 158));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Disciplina(s) Alocada(s):");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 117, -1, -1));

        jTabbedPane1.addTab("Geral", jPanel3);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 136, 751, 339));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sigla:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 80, -1, -1));

        campSigla.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.add(campSigla, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 76, 80, 28));

        campNomeCurso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.add(campNomeCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 76, 284, 28));

        btnInserir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        jPanel2.add(btnInserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 481, 106, 29));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(910, 560));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        atualizaRegistro();
    }//GEN-LAST:event_btnInserirActionPerformed


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
            java.util.logging.Logger.getLogger(EditCurso1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCurso1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCurso1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCurso1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCurso1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCargaHoraria;
    private javax.swing.JComboBox<String> boxSituacao;
    private javax.swing.JComboBox<String> boxTurno;
    private javax.swing.JButton btnInserir;
    private javax.swing.JTextField campDescricao;
    private javax.swing.JTextField campNomeCurso;
    private javax.swing.JTextField campSigla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> listDisciplinaAlocada;
    // End of variables declaration//GEN-END:variables

    public void Atualizar(){
        
        Curso curso = banco.ListCurso().get(posicao);
        Disciplina disc = banco.ListDisciplinas().get(posicao);
        
        campNomeCurso.setText(curso.getNome());
        campSigla.setText(curso.getSigla());
        boxCargaHoraria.setToolTipText(curso.getCargaHoraria());
        boxSituacao.setToolTipText(curso.getSituacao());
        boxCargaHoraria.setToolTipText(curso.getCargaHoraria());
        campDescricao.setText(curso.getDiscricao());
        
        try{
            DefaultListModel defaultList = new DefaultListModel();
            for (int i = 0; i < curso.getDisciplina().size(); i++) {
                defaultList.addElement(curso.getDisciplina().get(i).getNome());
                listDisciplinaAlocada.setModel(defaultList);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Curso não possui disciplina");
        }
        
    }
    public void atualizaRegistro(){
        
        List <Curso> listCurso = null;
        listCurso = banco.ListCurso();
        
        Curso curso = listCurso.get(posicao);
        
        curso.setNome(campNomeCurso.getText());
        curso.setSigla(campSigla.getText());
        curso.setCargaHoraria(boxCargaHoraria.getItemAt(boxCargaHoraria.getSelectedIndex()));
        curso.setSituacao(boxSituacao.getItemAt(boxSituacao.getSelectedIndex()));
        curso.setTurno(boxTurno.getItemAt(boxTurno.getSelectedIndex()));
        curso.setDiscricao(campDescricao.getText());
        
        banco.save_update(curso);
        Atualizar();
        
    }

}

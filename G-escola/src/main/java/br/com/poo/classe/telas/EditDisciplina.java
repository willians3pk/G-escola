/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poo.classe.telas;

import br.com.conexao.ConexaoDAO;
import br.com.poo.classe.Curso;
import br.com.poo.classe.Disciplina;
import br.com.poo.classe.Professor;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class EditDisciplina extends javax.swing.JFrame {

    ConexaoDAO banco = new ConexaoDAO();
    private int posicao;
    
    public EditDisciplina() {
        initComponents();
    }

    public void PegaPosicao(int posicao){
        this.posicao = posicao;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        camp_nome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        camp_codigo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        box_nota = new javax.swing.JComboBox<>();
        box_avaliacao = new javax.swing.JComboBox<>();
        camp_sigla = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        camp_descricao = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        box_cargahoraria = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlistcursos = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlistprofessores1 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        camp_inforProfe = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        camp_InforCurso = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        btn_inserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.darkGray);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Disciplinas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 24), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(camp_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 630, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nome:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));
        jPanel1.add(camp_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 100, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Codigo:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(java.awt.Color.darkGray);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        box_nota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "Nota", "Conceito" }));
        jPanel3.add(box_nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 120, 20));

        box_avaliacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "Nota - Falta", "Nenhum", "Estagio", "Somente Falta", "Somente Nota" }));
        jPanel3.add(box_avaliacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 140, 20));
        jPanel3.add(camp_sigla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 230, 20));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sigla:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        camp_descricao.setColumns(20);
        camp_descricao.setRows(5);
        jScrollPane3.setViewportView(camp_descricao);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 430, 210));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Discrição:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nota-Conceito:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Avaliação:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

        box_cargahoraria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "60", "80", "50", "40", " " }));
        jPanel3.add(box_cargahoraria, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 170, 20));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Lista de Cursos:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

        jScrollPane1.setViewportView(jlistcursos);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 230, 80));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Carga Horaria:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

        jScrollPane2.setViewportView(jlistprofessores1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 230, 80));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Lista de Professores:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        jTabbedPane1.addTab("Geral", jPanel3);

        jPanel2.setBackground(java.awt.Color.darkGray);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        camp_inforProfe.setColumns(20);
        camp_inforProfe.setRows(5);
        jScrollPane4.setViewportView(camp_inforProfe);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 350, 180));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Informações do Professor:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        camp_InforCurso.setColumns(20);
        camp_InforCurso.setRows(5);
        jScrollPane5.setViewportView(camp_InforCurso);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 340, 180));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Informações do Cursos:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jTabbedPane1.addTab("tab2", jPanel2);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 790, 370));

        btn_inserir.setText("Inserir");
        btn_inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_inserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(900, 580));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserirActionPerformed
        Salvar();
    }//GEN-LAST:event_btn_inserirActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditDisciplina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_avaliacao;
    private javax.swing.JComboBox<String> box_cargahoraria;
    private javax.swing.JComboBox<String> box_nota;
    private javax.swing.JButton btn_inserir;
    private javax.swing.JTextArea camp_InforCurso;
    private javax.swing.JTextField camp_codigo;
    private javax.swing.JTextArea camp_descricao;
    private javax.swing.JTextArea camp_inforProfe;
    private javax.swing.JTextField camp_nome;
    private javax.swing.JTextField camp_sigla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> jlistcursos;
    private javax.swing.JList<String> jlistprofessores1;
    // End of variables declaration//GEN-END:variables


    public void Atualizar(){
           
        Disciplina disc = banco.ListDisciplinas().get(posicao);
        
        camp_codigo.setColumns(disc.getCodigo());
        camp_nome.setText(disc.getNome());
        camp_sigla.setText(disc.getSigla());
        camp_descricao.setText(disc.getDescricao());
        box_nota.setToolTipText(disc.getConceitoNota());
        box_avaliacao.setToolTipText(disc.getAvaliacao());
        camp_InforCurso.setText(disc.getCurso().toString());
        camp_inforProfe.setText(disc.getProfessor().toString());
        
        try {
            DefaultListModel model1 = new DefaultListModel();
            model1.addElement(disc.getProfessor().getNome());
            jlistprofessores1.setModel(model1); 
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Disciplina não contem um Professor!");
        }
        try {
            DefaultListModel model = new DefaultListModel();
            model.addElement(disc.getCurso().getNome());
            jlistcursos.setModel(model);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Disciplina nao contem um Curso!");
        }
        
        
    }
    public void Salvar(){
        List <Disciplina> listDisciplina = null;
        listDisciplina = banco.ListDisciplinas();
        
        Disciplina disc = listDisciplina.get(posicao);
        
        disc.setNome(camp_nome.getText());
        disc.setCargahorariaDisci(box_cargahoraria.getItemAt(box_cargahoraria.getSelectedIndex()));
        disc.setAvaliacao(box_avaliacao.getItemAt(box_avaliacao.getSelectedIndex()));
        disc.setConceitoNota(box_nota.getItemAt(box_nota.getSelectedIndex()));
        disc.setSigla(camp_sigla.getText());
        disc.setDescricao(camp_descricao.getText());
        
        banco.save_update(disc);
        Atualizar();
    }
    
}

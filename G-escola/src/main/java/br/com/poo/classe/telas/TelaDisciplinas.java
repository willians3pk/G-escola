package br.com.poo.classe.telas;

import br.com.conexao.ConexaoDAO;
import br.com.poo.classe.Curso;
import br.com.poo.classe.Disciplina;
import br.com.poo.classe.Turma;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class TelaDisciplinas extends javax.swing.JPanel {

    ConexaoDAO bancoSQL = new ConexaoDAO();

    public TelaDisciplinas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jPanel5 = new javax.swing.JPanel();
        boxDisciplina = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btn_adicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btn_inserir = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Disciplinas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 24), new java.awt.Color(255, 255, 0))); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(camp_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 630, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nome:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));
        add(camp_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 100, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Codigo:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 540, 190));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Discrição:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nota-Conceito:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Avaliação:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

        jTabbedPane1.addTab("Geral", jPanel3);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boxDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxDisciplinaActionPerformed(evt);
            }
        });
        jPanel5.add(boxDisciplina, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 370, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Disciplina:");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 60, -1));

        btn_adicionar.setText("Adicionar");
        btn_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionarActionPerformed(evt);
            }
        });
        jPanel5.add(btn_adicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 90, -1));

        jScrollPane1.setViewportView(jList1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 160, 200));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Turma:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, -1));

        jScrollPane2.setViewportView(jList2);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 170, 200));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Turmas Alocadas:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 130, -1));

        jButton1.setText("Remover");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 90, -1));

        jTabbedPane1.addTab("Alocação", jPanel5);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 790, 370));

        btn_inserir.setText("Inserir");
        btn_inserir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserirActionPerformed(evt);
            }
        });
        add(btn_inserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 490, 80, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserirActionPerformed
        CadastrarDisciplina();
        LimparCampos();
    }//GEN-LAST:event_btn_inserirActionPerformed

    private void btn_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionarActionPerformed
        AlocarTurma();
    }//GEN-LAST:event_btn_adicionarActionPerformed

    private void boxDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxDisciplinaActionPerformed
        List<Disciplina> listDisciplina = null;
        listDisciplina = bancoSQL.ListDisciplinas();
        Disciplina disciplina = listDisciplina.get(boxDisciplina.getSelectedIndex());
        
        try {
            DefaultListModel model3 = new DefaultListModel();
                for (int i = 0; i < disciplina.getTurma().size(); i++) {
                    model3.addElement(disciplina.getTurma().get(i).getNome());
                    jList2.setModel(model3);
                }
            
        } catch (Exception e) {
            System.out.println("erro "+e);
        }
    }//GEN-LAST:event_boxDisciplinaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Remover();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxDisciplina;
    private javax.swing.JComboBox<String> box_avaliacao;
    private javax.swing.JComboBox<String> box_nota;
    private javax.swing.JButton btn_adicionar;
    private javax.swing.JButton btn_inserir;
    private javax.swing.JTextField camp_codigo;
    private javax.swing.JTextArea camp_descricao;
    private javax.swing.JTextField camp_nome;
    private javax.swing.JTextField camp_sigla;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    private void CadastrarDisciplina() {

        if (camp_nome.getText().equals("") ) {
            JOptionPane.showMessageDialog(null, "Disciplina Precisa de um Nome!!");
        } else {
            Disciplina d = new Disciplina(camp_nome.getText(), camp_descricao.getText(), null, camp_sigla.getText(), box_nota.getItemAt(box_nota.getSelectedIndex()), box_avaliacao.getItemAt(box_avaliacao.getSelectedIndex()));
            bancoSQL.save(d);
        }
        Atualizar();

    }

    private void LimparCampos() {
        camp_nome.setText("");
        camp_descricao.setText("");
        camp_sigla.setText("");
        box_nota.setSelectedIndex(0);
        box_avaliacao.setSelectedIndex(0);
    }
        
    public void Atualizar(){

        try {
            
            DefaultListModel model = new DefaultListModel();
            for (Turma turma : bancoSQL.ListTurma()) {
                model.addElement(turma.getNome());
                jList1.setModel(model);
            }
            
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            for (Disciplina disciplina : bancoSQL.ListDisciplinas()) {
                modelo.addElement(disciplina.getNome());
                boxDisciplina.setModel(modelo);
            }
            
        } catch (Exception e) {
            System.out.println("Erro "+e);
        }
        
    }
    public void Remover(){
        List<Disciplina> listDisciplina = null;
        List<Turma> listTurma = null;
        
        listDisciplina = bancoSQL.ListDisciplinas();
        listTurma = bancoSQL.ListTurma();
        
        int posicao = jList2.getSelectedIndex();
        Disciplina disc = listDisciplina.get(boxDisciplina.getSelectedIndex());
        disc.getTurma().remove(disc.getTurma().get(posicao));
        
        bancoSQL.save_update(disc);
        Atualizar();
        
    }
    
    private void AlocarTurma(){
        
        
        List<Disciplina> listDisciplinas = null;
        listDisciplinas = bancoSQL.ListDisciplinas();
        
        List<Turma> listTurmas = null;
        listTurmas = bancoSQL.ListTurma();
        
        
        Turma      turma    = listTurmas.get(jList1.getSelectedIndex());
        Disciplina disc     = listDisciplinas.get(boxDisciplina.getSelectedIndex());
        disc.getTurma().add(turma);
        turma.setDisciplina(disc);
        
        bancoSQL.save_update(disc);
        bancoSQL.save_update(turma);
        
        DefaultListModel model = new DefaultListModel();
        for (Turma turma1 : disc.getTurma()) {
            model.addElement(turma1.getNome());
            jList2.setModel(model);
        }
        Atualizar();
    }
}

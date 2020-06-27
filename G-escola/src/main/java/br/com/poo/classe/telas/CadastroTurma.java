package br.com.poo.classe.telas;

import br.com.conexao.ConexaoDAO;
import br.com.poo.classe.Aluno;
import br.com.poo.classe.Turma;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class CadastroTurma extends javax.swing.JPanel {

    ConexaoDAO bancoSQL = new ConexaoDAO();

    public CadastroTurma() {
        initComponents();
        data();
    }
    public void data(){
    Date DataSistema = new Date();
    SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
    camp_dataInicio.setText(dataFormat.format(DataSistema));
    camp_ano.setText(dataFormat.format(DataSistema));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        boxDia = new javax.swing.JComboBox<>();
        boxPeriodo = new javax.swing.JComboBox<>();
        camp_dataFim = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        boxStatus = new javax.swing.JComboBox<>();
        boxGrade = new javax.swing.JComboBox<>();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        campDescricao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        camp_ano = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        boxAnoLetivo = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        boxHorarios = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        boxNome = new javax.swing.JComboBox<>();
        camp_dataInicio = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        boxTurma = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        btn_adicionar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btn_inserir = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Turmas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 255, 0))); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(java.awt.Color.darkGray);
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dia da Semana:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 131, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Periodo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 82, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Grade:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data do Fim:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 249, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Status:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data do Inicio:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 198, -1, -1));

        boxDia.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        boxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "Segunda Feira", "Terça Feira", "Quarta Feira", "Quinta Feira", "Sexta Feira", " " }));
        boxDia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        boxDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxDiaActionPerformed(evt);
            }
        });
        jPanel1.add(boxDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 151, 117, -1));

        boxPeriodo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        boxPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "Manhã", "Tarde ", "Noite" }));
        boxPeriodo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(boxPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 100, 117, -1));

        try {
            camp_dataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_dataFim.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        camp_dataFim.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        camp_dataFim.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel1.add(camp_dataFim, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 269, 87, -1));

        jLabel7.setText("Ano:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 189, -1, -1));

        boxStatus.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        boxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "Ativa", "Cancelada", "Inativa" }));
        boxStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(boxStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        boxGrade.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        boxGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "2020", "2021", " " }));
        boxGrade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(boxGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));
        jPanel1.add(jFormattedTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 330, 76, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 59, 657, 12));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 182, 336, 10));

        campDescricao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        campDescricao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(campDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 189, 358, 160));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Descrição:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, 20));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ano:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 198, -1, -1));

        try {
            camp_ano.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_ano.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        camp_ano.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        camp_ano.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel1.add(camp_ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 218, 78, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ano Letivo:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 82, -1, -1));

        boxAnoLetivo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        boxAnoLetivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "2020", " " }));
        boxAnoLetivo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(boxAnoLetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 100, 100, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 307, 340, 10));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Horarios:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 90, -1));

        boxHorarios.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        boxHorarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxHorarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(boxHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 100, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nome:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 50, -1));

        boxNome.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        boxNome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "1ª Ano \"A\"", "1ª Ano \"B\"", "1ª Ano \"C\"", "2ª Ano \"A\"", "2ª Ano \"B\"", "2ª Ano \"C\"", "3ªAno \"A\"", "3ªAno \"B\"", "3ªAno \"C\"" }));
        boxNome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(boxNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 140, -1));

        try {
            camp_dataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_dataInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        camp_dataInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        camp_dataInicio.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel1.add(camp_dataInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 90, -1));

        jTabbedPane1.addTab("Geral", jPanel1);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boxTurma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boxTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTurmaActionPerformed(evt);
            }
        });
        jPanel3.add(boxTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 388, 30));

        jScrollPane1.setViewportView(jList1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 190, -1));

        jScrollPane2.setViewportView(jList2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 200, -1));

        btn_adicionar.setText("Adicionar");
        btn_adicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_adicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 90, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Turma:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 50, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Alunos Cadastrados:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Alunos Alocados:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 120, -1));

        jButton1.setText("Remover");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 90, -1));

        jTabbedPane1.addTab("Alocação", jPanel3);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 740, 400));

        btn_inserir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_inserir.setText("Inserir");
        btn_inserir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserirActionPerformed(evt);
            }
        });
        add(btn_inserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserirActionPerformed
        CadastroTurma();
        LimparCampos();
    }//GEN-LAST:event_btn_inserirActionPerformed

    private void btn_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionarActionPerformed
        AlocarAluno();
    }//GEN-LAST:event_btn_adicionarActionPerformed

    private void boxDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxDiaActionPerformed

    private void boxTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTurmaActionPerformed
        List<Turma> listTurma = null;
        listTurma = bancoSQL.ListTurma();
        Turma turma = listTurma.get(boxTurma.getSelectedIndex());
        
        try {
            DefaultListModel model3 = new DefaultListModel();
                for (int i = 0; i < turma.getAluno().size(); i++) {
                    model3.addElement(turma.getAluno().get(i).getNome());
                    jList2.setModel(model3);
                }
            
        } catch (Exception e) {
            System.out.println("erro "+e);
        }
    }//GEN-LAST:event_boxTurmaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Remover();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxAnoLetivo;
    private javax.swing.JComboBox<String> boxDia;
    private javax.swing.JComboBox<String> boxGrade;
    private javax.swing.JComboBox<String> boxHorarios;
    private javax.swing.JComboBox<String> boxNome;
    private javax.swing.JComboBox<String> boxPeriodo;
    private javax.swing.JComboBox<String> boxStatus;
    private javax.swing.JComboBox<String> boxTurma;
    private javax.swing.JButton btn_adicionar;
    private javax.swing.JButton btn_inserir;
    private javax.swing.JTextField campDescricao;
    private javax.swing.JFormattedTextField camp_ano;
    private javax.swing.JFormattedTextField camp_dataFim;
    private javax.swing.JFormattedTextField camp_dataInicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    private void CadastroTurma() {
        if (boxPeriodo.getItemAt(boxPeriodo.getSelectedIndex()).equals("<Selecione>")) {
            JOptionPane.showMessageDialog(null, "Selecione o Periodo!");
        } else if (boxAnoLetivo.getItemAt(boxAnoLetivo.getSelectedIndex()).equals("<Selecione>")) {
            JOptionPane.showMessageDialog(null, "Selecione o Ano Letivo!");
        } else if (boxGrade.getItemAt(boxGrade.getSelectedIndex()).equals("<Selecione>")) {
            JOptionPane.showMessageDialog(null, "Selecione a Grade!");
        } else if (boxDia.getItemAt(boxDia.getSelectedIndex()).equals("<Selecione>")) {
            JOptionPane.showMessageDialog(null, "Selecione o Dia da Semana!");
        } else if (boxStatus.getItemAt(boxStatus.getSelectedIndex()).equals("<Selecione>")) {
            JOptionPane.showMessageDialog(null, "Selecione o Status!");
        } else {
            Turma t = new Turma(camp_ano.getText(), boxDia.getItemAt(boxDia.getSelectedIndex()), boxHorarios.getItemAt(boxHorarios.getSelectedIndex()),
                    boxGrade.getItemAt(boxGrade.getSelectedIndex()), camp_dataInicio.getText(), camp_dataFim.getText(), boxStatus.getItemAt(boxStatus.getSelectedIndex()),
                    boxAnoLetivo.getItemAt(boxAnoLetivo.getSelectedIndex()), boxPeriodo.getItemAt(boxPeriodo.getSelectedIndex()), campDescricao.getText());
            t.setNome(boxNome.getItemAt(boxNome.getSelectedIndex()));
            
            bancoSQL.save(t);
            Atualizar();
        }
    }

    private void LimparCampos() {
        camp_ano.getText();
        boxDia.setSelectedIndex(0);
        boxHorarios.setSelectedIndex(0);
        boxGrade.setSelectedIndex(0);
        //camp_dataInicio.setText("");
        camp_dataFim.setText("");
        camp_ano.setText("");
        boxStatus.setSelectedIndex(0);
        boxAnoLetivo.setSelectedIndex(0);
        boxPeriodo.setSelectedIndex(0);
        campDescricao.setText("");
        boxNome.getItemAt(0);
    }   

    public void Atualizar(){
        
        List<Turma> ListTurmas = null;
        ListTurmas = bancoSQL.ListTurma();
        
        List<Aluno> ListAluno = null;
        ListAluno = bancoSQL.listAluno();
        
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            for (Turma turma : ListTurmas) {
                model.addElement(turma.getNome());
                boxTurma.setModel(model);
            }
            DefaultListModel model1 = new DefaultListModel();
            for (Aluno aluno : ListAluno) {
                model1.addElement(aluno.getNome());
                jList1.setModel(model1);
            }
            
        } catch (Exception e) {
            System.out.println("Erro "+e);
        }
        
    }
    
    private void Remover(){
        List<Turma> listTurma = null;
        List<Aluno> listAluno = null;
        
        listTurma = bancoSQL.ListTurma();
        listAluno = bancoSQL.listAluno();
        
        int posicao = jList2.getSelectedIndex();
        
        Turma turma = listTurma.get(boxTurma.getSelectedIndex());
        turma.getAluno().remove(turma.getAluno().get(posicao));
        
        bancoSQL.save_update(turma);
        Atualizar();
        
    }
    private void AlocarAluno(){
        List <Turma> listTurma = null;
        listTurma = bancoSQL.ListTurma();
        Turma turma = listTurma.get(boxTurma.getSelectedIndex());
        
        List<Aluno> listAluno = null; 
        listAluno = bancoSQL.listAluno();
        Aluno aluno = listAluno.get(jList1.getSelectedIndex());
        
        turma.getAluno().add(aluno);
        aluno.setTurma(turma);
        
        bancoSQL.save_update(turma);
        bancoSQL.save_update(aluno);
        
        DefaultListModel model = new DefaultListModel();
        for (Aluno aluno1 : turma.getAluno()) {
            model.addElement(aluno1.getNome());
            jList2.setModel(model);
        }
        Atualizar();
        
    }
    
}

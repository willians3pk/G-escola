package br.com.poo.classe.telas;

import br.com.conexao.ConexaoDAO;
import br.com.poo.classe.Curso;
import br.com.poo.classe.Disciplina;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class CadastroCurso extends javax.swing.JPanel {

    ConexaoDAO session = new ConexaoDAO();

    public CadastroCurso() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        boxSituacao = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        boxCargaHoraria = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        camp_sigla = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        boxTurno = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        camp_descricao = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listDisciplinas1 = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        btn_adicionar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        boxCurso = new javax.swing.JComboBox<>();
        btn_remover = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        camp_nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_cadastrar = new javax.swing.JButton();

        setBackground(java.awt.Color.black);
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cursos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 24), new java.awt.Color(255, 255, 0))); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel1.setBackground(java.awt.Color.darkGray);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "Ativo", "Negado" }));
        jPanel1.add(boxSituacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 110, 20));

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Situação:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        boxCargaHoraria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "1200", "500", "100", "2000" }));
        jPanel1.add(boxCargaHoraria, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 120, 20));

        jLabel3.setBackground(java.awt.Color.white);
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Carga Horaria:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));
        jPanel1.add(camp_sigla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 320, -1));

        jLabel5.setBackground(java.awt.Color.white);
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sigla:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 50, 20));

        boxTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "Manhã", "Tarde", "Noite" }));
        jPanel1.add(boxTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 140, 20));

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Turno:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        jScrollPane2.setViewportView(camp_descricao);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 370, 150));

        jLabel7.setBackground(java.awt.Color.white);
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Descrição:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 90, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 670, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 310, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 310, 10));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newIcones/oops.gif"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 450));

        jTabbedPane1.addTab("Geral", jPanel1);

        jPanel2.setBackground(java.awt.Color.darkGray);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(jList2);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 180, 180));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Disciplinas Cadastrada:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 160, -1));

        jScrollPane3.setViewportView(listDisciplinas1);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 160, 180));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Disciplinas Alocadas:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, -1));

        btn_adicionar.setText("Adicionar");
        btn_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_adicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 130, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Curso:");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 50, 30));

        boxCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boxCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCursoActionPerformed(evt);
            }
        });
        jPanel2.add(boxCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 380, -1));

        btn_remover.setText("Remover");
        btn_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removerActionPerformed(evt);
            }
        });
        jPanel2.add(btn_remover, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 130, -1));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newIcones/oops.gif"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 510));

        jTabbedPane1.addTab("Alocação", jPanel2);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 740, 390));
        add(camp_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 460, 30));

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 60, 30));

        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });
        add(btn_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 480, 100, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionarActionPerformed
        Adicionar(); // adiciona uma disciplina no curso
    }//GEN-LAST:event_btn_adicionarActionPerformed

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        salvarCurso(); // salva o curso no banco de dados
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void boxCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCursoActionPerformed
        disciplinasCurso(); // mostra as disciplinas ja alocadas no curso
    }//GEN-LAST:event_boxCursoActionPerformed

    private void btn_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removerActionPerformed
        remover(); // remove a disciplina selecionada
    }//GEN-LAST:event_btn_removerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCargaHoraria;
    private javax.swing.JComboBox<String> boxCurso;
    private javax.swing.JComboBox<String> boxSituacao;
    private javax.swing.JComboBox<String> boxTurno;
    private javax.swing.JButton btn_adicionar;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_remover;
    private javax.swing.JTextPane camp_descricao;
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
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> listDisciplinas1;
    // End of variables declaration//GEN-END:variables

    public void Atualizar() {

        DefaultListModel model = new DefaultListModel();
        for (Disciplina listDisciplina : session.ListDisciplinas()) {
            model.addElement(listDisciplina.getNome());
            listDisciplinas1.setModel(model);           // adiciona na jList as disciplinas ja cadastradas
        }
        try {

            DefaultComboBoxModel model2 = new DefaultComboBoxModel();
            for (Curso curso : session.ListCurso()) {
                model2.addElement(curso.getNome());
                boxCurso.setModel(model2);              // adiciona na ComboBox os cursos ja cadastrados 
            }

        } catch (Exception e) {
            System.out.println("Erro " + e);
        }
        try {
            DefaultListModel model3 = new DefaultListModel();
            List<Curso> listCursos = null;

            listCursos = session.ListCurso();          // pega lista de Cursos do banco de dados
            Curso curso = listCursos.get(boxCurso.getSelectedIndex());  // pega a posicao do curso na ComboBox
            for (Disciplina disciplina : curso.getDisciplina()) {
                model3.addElement(disciplina.getNome());
                jList2.setModel(model3);                // adiciona na jList3 as disciplinas do curso selecionado
            }

        } catch (Exception e) {
        }

    }

    private void disciplinasCurso() {

        List<Curso> listCursos = null;
        listCursos = session.ListCurso();           // carrega os cursos cadastrados em uma lista
        Curso curso = listCursos.get(boxCurso.getSelectedIndex()); // pega a posicao do curso na lista e poem em uma variavel

        try {
            DefaultListModel model3 = new DefaultListModel();
            for (int i = 0; i < curso.getDisciplina().size(); i++) {
                model3.addElement(curso.getDisciplina().get(i).getNome());
                jList2.setModel(model3);            // adiciona na jList2 as disciplinas ja alocadas no curso
            }

        } catch (Exception e) {
            System.out.println("erro " + e);
        }

    }

    private void Adicionar() {

        List<Disciplina> listDisciplinas = session.ListDisciplinas();   // carrega as disciplinas do banco em uma Lista
        List<Curso>      listCursos      = session.ListCurso();         // carrega os cursos do banco em uma lista

        int posicao1 = boxCurso.getSelectedIndex();             // pega a posicao do curso na ComboBox
        int posicao2 = listDisciplinas1.getSelectedIndex();     // pega a posicao da disciplina na jList

        Curso curso = listCursos.get(posicao1);                 // pega a curso da lista do banco de dados e poem em uma variavel curso
        Disciplina disciplina = listDisciplinas.get(posicao2);  // pega a disciplina da lista do banco de dados e poem em uma variavel disciplina
        disciplina.setCurso(curso);

        curso.getDisciplina().add(disciplina);  // adiciona a disciplina no curso
        session.save_update(curso);             // Salva e Atualiza o curso 
        session.refresh(disciplina);

        DefaultListModel model = new DefaultListModel();
        for (Disciplina disci : curso.getDisciplina()) {
            model.addElement(disci.getNome());
            jList2.setModel(model);             // adiciona as disciplina do curso em uma jList 

        }

        Atualizar(); // atualiza a pagina
    }

    private void salvarCurso() {

        if (camp_nome.getText().equals("") || camp_sigla.getText().equals("")) {
            Menssagem();
        } else {
            // Transiente
            Curso curso = new Curso();
            curso.setNome(camp_nome.getText());
            curso.setSigla(camp_sigla.getText());
            curso.setCargaHoraria(boxCargaHoraria.getItemAt(boxCargaHoraria.getSelectedIndex()));
            curso.setSituacao(boxSituacao.getItemAt(boxSituacao.getSelectedIndex()));
            curso.setTurno(boxTurno.getItemAt(boxTurno.getSelectedIndex()));
            curso.setDiscricao(camp_descricao.getText());

            session.persist(curso); // persist no banco de dados
            LimparCampos();
        }
        Atualizar(); // atualiza a pagina

    }

    public void remover() {

        List<Disciplina> listDisciplinas = session.ListDisciplinas();
        List<Curso> listCursos = session.ListCurso();

        int posicao1 = boxCurso.getSelectedIndex();        // pega a posicao do curso na ComboBox
        int posicao2 = jList2.getSelectedIndex();          // pega a posicao da disciplina na jList de disciplinas alocadas

        Curso curso = listCursos.get(posicao1);             // pega o curso na lista do banco de dados e poem em uma variavel curso
        Disciplina disc = curso.getDisciplina().get(posicao2);// pega a disciplina da lista de disciplina do curso
        curso.getDisciplina().remove(disc);                 // remove a disciplina da lista do curso

        session.save_update(disc);
        session.save_update(curso);     // salva e Atualiza o curso

        Atualizar();    // atualiza a pagina
    }

    public void LimparCampos() {
        camp_nome.setText("");
        camp_sigla.setText("");
        boxCargaHoraria.setSelectedIndex(0);
        boxSituacao.setSelectedIndex(0);
        boxTurno.setSelectedIndex(0);
    }

    private void Menssagem() {
        JOptionPane.showMessageDialog(null, "Preencha os Campos Obrigatorios!!");
    }

}

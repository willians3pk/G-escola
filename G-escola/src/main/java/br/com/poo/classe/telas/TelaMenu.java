package br.com.poo.classe.telas;

import br.com.conexao.ConexaoDAO;
import br.com.poo.classe.Aluno;
import br.com.poo.classe.Curso;
import br.com.poo.classe.Disciplina;
import br.com.poo.classe.Professor;
import br.com.poo.classe.Turma;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaMenu extends javax.swing.JPanel {

    public TelaMenu() {
        initComponents();
    }
    ConexaoDAO session = new ConexaoDAO();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableAluno = new javax.swing.JTable();
        panelDisciplina = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtableDisciplina = new javax.swing.JTable();
        panelProfesor = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtableProfessor = new javax.swing.JTable();
        panelTurma = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtableTurma = new javax.swing.JTable();
        panelCurso = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableCurso = new javax.swing.JTable();

        setBackground(java.awt.Color.darkGray);
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu Edit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 255, 0))); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtableAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Contato", "Email"
            }
        ));
        jtableAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableAlunoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableAluno);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 86, 749, 116));

        panelPrincipal.addTab("Aluno", jPanel1);

        panelDisciplina.setBackground(new java.awt.Color(51, 51, 51));
        panelDisciplina.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtableDisciplina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Carga Horaria", "Sigla"
            }
        ));
        jtableDisciplina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableDisciplinaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtableDisciplina);

        panelDisciplina.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 85, 744, 126));

        panelPrincipal.addTab("Disciplina", panelDisciplina);

        panelProfesor.setBackground(java.awt.Color.darkGray);
        panelProfesor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtableProfessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Disciplina", "Contato"
            }
        ));
        jtableProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableProfessorMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jtableProfessor);

        panelProfesor.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 85, 735, 126));

        panelPrincipal.addTab("Professor", panelProfesor);

        panelTurma.setBackground(new java.awt.Color(51, 51, 51));
        panelTurma.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtableTurma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Ano Letivo", "Dia da Semana", "Código"
            }
        ));
        jtableTurma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableTurmaMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jtableTurma);

        panelTurma.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 86, 756, 120));

        panelPrincipal.addTab("Turma", panelTurma);

        panelCurso.setBackground(new java.awt.Color(51, 51, 51));
        panelCurso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtableCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Carga Hóraria", "Sigla", "Turno", "Situação"
            }
        ));
        jtableCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableCursoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtableCurso);

        panelCurso.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 88, 756, 126));

        panelPrincipal.addTab("Curso", panelCurso);

        add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 138, 784, 327));
    }// </editor-fold>//GEN-END:initComponents

    private void jtableDisciplinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableDisciplinaMouseClicked
        EditDisciplina telaEdit = new EditDisciplina();
        int posicao = jtableDisciplina.getSelectedRow();
        telaEdit.setVisible(true);
        telaEdit.PegaPosicao(posicao);
        telaEdit.Atualizar();
    }//GEN-LAST:event_jtableDisciplinaMouseClicked

    private void jtableAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableAlunoMouseClicked
        EditAluno1 telaEdit1 = new EditAluno1();
        int posicao1 = jtableAluno.getSelectedRow();
        telaEdit1.setVisible(true);
        telaEdit1.PegaPosicao(posicao1);
        telaEdit1.Atualizar();
    }//GEN-LAST:event_jtableAlunoMouseClicked

    private void jtableProfessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableProfessorMouseClicked
        EditProfessor1 telaEdit2 = new EditProfessor1();
        int posicao2 = jtableProfessor.getSelectedRow();
        telaEdit2.setVisible(true);
        telaEdit2.PegaPosicao(posicao2);
        telaEdit2.Atualizar();
    }//GEN-LAST:event_jtableProfessorMouseClicked

    private void jtableTurmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableTurmaMouseClicked
        EditTurma1 telaEdit3 = new EditTurma1();
        int posicao3 = jtableTurma.getSelectedRow();
        telaEdit3.setVisible(true);
        telaEdit3.PegaPosicao(posicao3);
        telaEdit3.Atualizar();
    }//GEN-LAST:event_jtableTurmaMouseClicked

    private void jtableCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableCursoMouseClicked
        EditCurso1 telaEdit4 = new EditCurso1();
        int posicao4 = jtableCurso.getSelectedRow();
        telaEdit4.setVisible(true);
        telaEdit4.PegaPosicao(posicao4);
        telaEdit4.Atualizar();
    }//GEN-LAST:event_jtableCursoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jtableAluno;
    private javax.swing.JTable jtableCurso;
    private javax.swing.JTable jtableDisciplina;
    private javax.swing.JTable jtableProfessor;
    private javax.swing.JTable jtableTurma;
    private javax.swing.JPanel panelCurso;
    private javax.swing.JPanel panelDisciplina;
    private javax.swing.JTabbedPane panelPrincipal;
    private javax.swing.JPanel panelProfesor;
    private javax.swing.JPanel panelTurma;
    // End of variables declaration//GEN-END:variables

    public void Atualizar() {
        DefaultTableModel tableDefault = (DefaultTableModel) jtableAluno.getModel();
        try {
            for (Aluno alunos : session.listAluno()) {
                tableDefault.addRow(new Object[]{alunos.getNome(), alunos.getCpf(), alunos.getTelefone(), alunos.getEmail()});
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "<Erro Ao popular a table Aluno>");
        }

        DefaultTableModel tableDefault1 = (DefaultTableModel) jtableDisciplina.getModel();
        try {
            for (Disciplina disciplinas : session.ListDisciplinas()) {
                tableDefault1.addRow(new Object[]{disciplinas.getNome(), disciplinas.getCargahorariaDisci(), disciplinas.getSigla()});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "<Erro Ao popular a table Disciplina>");
        }

        DefaultTableModel tableDefault2 = (DefaultTableModel) jtableProfessor.getModel();
        try {
            for (Professor professores : session.ListProfessor()) {
                tableDefault2.addRow(new Object[]{professores.getNome(), professores.getCpf(), professores.getDisciplina(), professores.getTelefone()});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "<Erro Ao popular a table Professor>");
        }

        DefaultTableModel tableDefault3 = (DefaultTableModel) jtableTurma.getModel();
        try {
            for (Turma turmas : session.ListTurma()) {
                tableDefault3.addRow(new Object[]{turmas.getNome(), turmas.getAnoLetivo(), turmas.getDiaSemana(), turmas.getCodigo()});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "<Erro Ao popular a table Turma>");
        }

        DefaultTableModel tableDefault4 = (DefaultTableModel) jtableCurso.getModel();
        try {
            for (Curso cursos : session.ListCurso()) {
                tableDefault4.addRow(new Object[]{cursos.getNome(), cursos.getCargaHoraria(), cursos.getSigla(), cursos.getTurno(), cursos.getSituacao()});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "<Erro Ao popular a table Disciplina>");
        }
    }

}

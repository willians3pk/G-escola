package br.com.poo.classe.telas;

import br.com.poo.classe.telascarregamento.TelaCarregamento;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

public class TelaPrincipal extends javax.swing.JFrame {

    int x, y;
    boolean clique = true;
    Color cor;

    TelaDisciplinas d = new TelaDisciplinas();
    CadastroAluno a = new CadastroAluno();
    CadastroCurso c = new CadastroCurso();
    CadastroProfessor p = new CadastroProfessor();
    CadastroTurma t = new CadastroTurma();
    TelaMenu tm = new TelaMenu();

    DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");

    public TelaPrincipal() {
        initComponents();
        jmenuLateral.setLocation(-110, 70);
        cor = new Color(240, 240, 240);
        data();
        AnimacaoLabel();
        AnimacaoCor();
        //hora();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        labelEvent = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblDataHora = new javax.swing.JLabel();
        areaTrabalho = new javax.swing.JDesktopPane();
        jlabelfundo = new javax.swing.JLabel();
        jmenuLateral = new javax.swing.JPanel();
        jpaneAluno = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpaneCadastro = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jaluno = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jcurso = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jdisciplina = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jprofessor = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jturma = new javax.swing.JLabel();
        jpesquisar = new javax.swing.JLabel();
        jpanePesquisar = new javax.swing.JPanel();
        jMenuEdit = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(java.awt.Color.black);
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelEvent.setBackground(new java.awt.Color(0, 0, 0));
        labelEvent.setFont(new java.awt.Font("Arial", 0, 27)); // NOI18N
        labelEvent.setForeground(new java.awt.Color(255, 255, 255));
        labelEvent.setText("Error 404 - Not Found");
        jPanel2.add(labelEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 270, 40));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 30, 30));

        lblDataHora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDataHora.setForeground(new java.awt.Color(255, 255, 255));
        lblDataHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataHora.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, java.awt.Color.darkGray));
        jPanel2.add(lblDataHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 180, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 70));

        areaTrabalho.setBackground(new java.awt.Color(255, 255, 255));
        areaTrabalho.setPreferredSize(new java.awt.Dimension(1100, 620));

        jlabelfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newIcones/104b22_bbbea42da725427da7d94d8a28df1b4d_mv2.gif"))); // NOI18N

        areaTrabalho.setLayer(jlabelfundo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout areaTrabalhoLayout = new javax.swing.GroupLayout(areaTrabalho);
        areaTrabalho.setLayout(areaTrabalhoLayout);
        areaTrabalhoLayout.setHorizontalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaTrabalhoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlabelfundo, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        areaTrabalhoLayout.setVerticalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaTrabalhoLayout.createSequentialGroup()
                .addComponent(jlabelfundo, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(areaTrabalho, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 890, 530));

        jmenuLateral.setBackground(java.awt.Color.black);
        jmenuLateral.setName(""); // NOI18N
        jmenuLateral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FocuMouse(evt);
            }
        });
        jmenuLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpaneAluno.setBackground(new java.awt.Color(255, 255, 255));
        jpaneAluno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu Light", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Academico");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jpaneAluno.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newIcones/FundoAcademico.png"))); // NOI18N
        jLabel3.setText("\n");
        jpaneAluno.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-26, -135, 260, 370));

        jmenuLateral.add(jpaneAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, 70));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newIcones/IconeCadastrar.png"))); // NOI18N
        jLabel2.setText("Cadastro");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jmenuLateral.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 130, 30));

        jpaneCadastro.setBackground(new java.awt.Color(255, 255, 255));
        jpaneCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpaneCadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jaluno.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jaluno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jaluno.setText("Aluno");
        jaluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jaluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jalunoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FocuMouse(evt);
            }
        });
        jPanel1.add(jaluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 30));

        jpaneCadastro.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcurso.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jcurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jcurso.setText("Curso");
        jcurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcursoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FocuMouse(evt);
            }
        });
        jPanel3.add(jcurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 30));

        jpaneCadastro.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 40));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jdisciplina.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jdisciplina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jdisciplina.setText("Disciplinas");
        jdisciplina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jdisciplina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdisciplinaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FocuMouse(evt);
            }
        });
        jPanel4.add(jdisciplina, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 30));

        jpaneCadastro.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 190, 40));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jprofessor.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jprofessor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jprofessor.setText("Professor");
        jprofessor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jprofessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jprofessorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FocuMouse(evt);
            }
        });
        jPanel5.add(jprofessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 30));

        jpaneCadastro.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 190, 40));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jturma.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jturma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jturma.setText("Turma");
        jturma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jturma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jturmaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FocuMouse(evt);
            }
        });
        jPanel6.add(jturma, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 30));

        jpaneCadastro.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 190, 40));

        jmenuLateral.add(jpaneCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 190, 0));

        jpesquisar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jpesquisar.setForeground(new java.awt.Color(255, 255, 255));
        jpesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newIcones/IconeEdit.png"))); // NOI18N
        jpesquisar.setText("Pesquisa");
        jpesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpesquisarMouseClicked(evt);
            }
        });
        jmenuLateral.add(jpesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 150, 40));

        jpanePesquisar.setBackground(new java.awt.Color(255, 255, 255));
        jpanePesquisar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenuEdit.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jMenuEdit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuEdit.setText("Menu ");
        jMenuEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuEditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuEditFocuMouse(evt);
            }
        });
        jpanePesquisar.add(jMenuEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, 20));
        jpanePesquisar.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, -1));

        jmenuLateral.add(jpanePesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 207, 190, 0));

        getContentPane().add(jmenuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 210, 530));

        setSize(new java.awt.Dimension(1100, 601));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FocuMouse(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FocuMouse
        if (evt.getSource() == jaluno) {
            jPanel1.setBackground(Color.YELLOW);
        } else {
            jPanel1.setBackground(cor);
        }
        if (evt.getSource() == jcurso) {
            jPanel3.setBackground(Color.YELLOW);
        } else {
            jPanel3.setBackground(cor);
        }
        if (evt.getSource() == jdisciplina) {
            jPanel4.setBackground(Color.YELLOW);
        } else {
            jPanel4.setBackground(cor);
        }
        if (evt.getSource() == jprofessor) {
            jPanel5.setBackground(Color.YELLOW);
        } else {
            jPanel5.setBackground(cor);
        }
        if (evt.getSource() == jturma) {
            jPanel6.setBackground(Color.YELLOW);
        } else {
            jPanel6.setBackground(cor);
        }

    }//GEN-LAST:event_FocuMouse

    private void jalunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jalunoMouseClicked
        final TelaCarregamento tela = new TelaCarregamento();

        Thread t = new Thread() {

            public void run() {

                try {
                    tela.setLocation(0, 0);
                    tela.setSize(890, 530);
                    tela.setVisible(true);
                    areaTrabalho.removeAll();
                    areaTrabalho.add(tela);
                    Thread.sleep(3000);
                    tela.setVisible(false);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }

                areaTrabalho.removeAll();
                a.setLocation(0, 0);
                a.setSize(890, 530);
                a.setVisible(true);
                areaTrabalho.add(a);


            }
        };
        t.start();
    }//GEN-LAST:event_jalunoMouseClicked

    private void jdisciplinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdisciplinaMouseClicked
        final TelaCarregamento tela = new TelaCarregamento();

        Thread t = new Thread() {

            public void run() {

                try {
                    tela.setLocation(0, 0);
                    tela.setSize(890, 530);
                    tela.setVisible(true);
                    areaTrabalho.removeAll();
                    areaTrabalho.add(tela);
                    Thread.sleep(3000);
                    tela.setVisible(false);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                areaTrabalho.removeAll();
                d.setLocation(0, 0);
                d.setSize(890, 530);
                d.setVisible(true);
                d.Atualizar();
                areaTrabalho.add(d);

            }
        };
        t.start();
    }//GEN-LAST:event_jdisciplinaMouseClicked

    private void jcursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcursoMouseClicked
        final TelaCarregamento tela = new TelaCarregamento();

        Thread t = new Thread() {

            public void run() {

                try {
                    tela.setLocation(0, 0);
                    tela.setSize(890, 530);
                    tela.setVisible(true);
                    areaTrabalho.removeAll();
                    areaTrabalho.add(tela);
                    Thread.sleep(3000);
                    tela.setVisible(false);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }

                areaTrabalho.removeAll();
                c.setLocation(0, 0);
                c.setSize(890, 530);
                c.setVisible(true);
                c.Atualizar();
                areaTrabalho.add(c);

            }
        };
        t.start();
    }//GEN-LAST:event_jcursoMouseClicked

    private void jprofessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jprofessorMouseClicked
        final TelaCarregamento tela = new TelaCarregamento();

        Thread t = new Thread() {

            public void run() {

                try {
                    tela.setLocation(0, 0);
                    tela.setSize(890, 530);
                    tela.setVisible(true);
                    areaTrabalho.removeAll();
                    areaTrabalho.add(tela);
                    Thread.sleep(3000);
                    tela.setVisible(false);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }

                areaTrabalho.removeAll();
                p.setLocation(0, 0);
                p.setSize(890, 530);
                p.setVisible(true);
                p.Atualizar();
                areaTrabalho.add(p);

            }
        };
        t.start();

    }//GEN-LAST:event_jprofessorMouseClicked

    private void jturmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jturmaMouseClicked
        final TelaCarregamento tela = new TelaCarregamento();

        Thread th = new Thread() {

            public void run() {

                try {
                    tela.setLocation(0, 0);
                    tela.setSize(890, 530);
                    tela.setVisible(true);
                    areaTrabalho.removeAll();
                    areaTrabalho.add(tela);
                    Thread.sleep(3000);
                    tela.setVisible(false);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }

                areaTrabalho.removeAll();
                t.setLocation(0, 0);
                t.setSize(890, 530);
                t.setVisible(true);
                t.Atualizar();
                areaTrabalho.add(t);

            }
        };
        th.start();
    }//GEN-LAST:event_jturmaMouseClicked


    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        menuCadastro();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jpesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpesquisarMouseClicked
        if (clique) {
            jpaneCadastro.setSize(190, 0);
            jpanePesquisar.setSize(190, 227);
            jpesquisar.setLocation(30, 170);
            clique = false;
        } else if (clique == false) {
            jpaneCadastro.setSize(190, 0);
            jpesquisar.setLocation(30, 170);
            jpanePesquisar.setSize(190, 0);
            jpesquisar.setLocation(30, 170);
            clique = true;
        }
    }//GEN-LAST:event_jpesquisarMouseClicked

    private void jMenuEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEditMouseClicked
        final TelaCarregamento tela = new TelaCarregamento();

        Thread t = new Thread() {

            public void run() {

                try {
                    tela.setLocation(0, 0);
                    tela.setSize(890, 530);
                    tela.setVisible(true);
                    areaTrabalho.removeAll();
                    areaTrabalho.add(tela);
                    Thread.sleep(3000);
                    tela.setVisible(false);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }

                tela.setVisible(false);
                areaTrabalho.removeAll();
                tm.setLocation(0, 0);
                tm.setSize(890, 530);
                tm.setVisible(true);
                tm.Atualizar();
                areaTrabalho.add(tm);

            }
        };
        t.start();
    }//GEN-LAST:event_jMenuEditMouseClicked

    private void jMenuEditFocuMouse(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEditFocuMouse

    }//GEN-LAST:event_jMenuEditFocuMouse

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        areaTrabalho.removeAll();
        jlabelfundo.setVisible(true);
        areaTrabalho.add(jlabelfundo);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane areaTrabalho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jMenuEdit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel jaluno;
    private javax.swing.JLabel jcurso;
    private javax.swing.JLabel jdisciplina;
    private javax.swing.JLabel jlabelfundo;
    private javax.swing.JPanel jmenuLateral;
    private javax.swing.JPanel jpaneAluno;
    private javax.swing.JPanel jpaneCadastro;
    private javax.swing.JPanel jpanePesquisar;
    private javax.swing.JLabel jpesquisar;
    private javax.swing.JLabel jprofessor;
    private javax.swing.JLabel jturma;
    private javax.swing.JLabel labelEvent;
    private javax.swing.JLabel lblDataHora;
    // End of variables declaration//GEN-END:variables

    private void telaCarregamento() {

        TelaCarregamento tela = new TelaCarregamento();
        new Thread() {

            @Override
            public void run() {

                tela.setLocation(0, 0);
                tela.setSize(890, 530);
                tela.setVisible(true);
                areaTrabalho.removeAll();
                areaTrabalho.add(tela);

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                tela.setVisible(false);
            }
        }.start();

    }

    private void menuCadastro() {
        if (clique) {
            jpaneCadastro.setSize(190, 210);
            jpesquisar.setLocation(30, 380);
            clique = false;
        } else if (clique == false) {
            jpaneCadastro.setSize(190, 0);
            jpesquisar.setLocation(30, 170);
            clique = true;
        }
    }

    public void AnimacaoCor() {
        new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 8; i++) {

                    switch (i) {
                        case 1:
                            labelEvent.setForeground(Color.BLUE);
                             {
                                try {
                                    Thread.sleep(600);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            break;
                        case 2:
                            labelEvent.setForeground(Color.ORANGE);
                             {
                                try {
                                    Thread.sleep(600);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            break;
                        case 3:
                            labelEvent.setForeground(Color.GREEN);
                             {
                                try {
                                    Thread.sleep(600);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            break;
                        case 4:
                            labelEvent.setForeground(Color.RED);
                             {
                                try {
                                    Thread.sleep(600);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            break;
                        case 5:
                            labelEvent.setForeground(Color.PINK);
                             {
                                try {
                                    Thread.sleep(600);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            break;
                        case 6:
                            labelEvent.setForeground(Color.cyan);
                             {
                                try {
                                    Thread.sleep(600);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            break;
                        case 7:
                            labelEvent.setForeground(Color.white);
                             {
                                try {
                                    Thread.sleep(600);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            break;
                        case 8:
                            i = 1;
                    }

                }
            }
        }.start();
    }

    public void AnimacaoLabel() {
//--------------------------Animação Label------------------------------------\\        
        new Thread() {
            @Override
            public void run() {
                int x = 260;
                int y = labelEvent.getLocation().y;
                while (true) {
                    x--;
                    if (x < -200) {
                        x = 260;
                    }
                    labelEvent.setLocation(x, y);
                    try {
                        sleep(13);
                    } catch (Exception erro) {
                        System.out.println("Erro txtEvent: " + erro);
                    }
                }
            }

        }.start();
    }
//--------------------------DATA E HORA NA LABEL------------------------------\\    

    public void data() {
        //-------------Data----------------\\
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        lblDataHora.setText(formato.format(dataSistema));
    }

    /**
     * public void hora(){ Thread relogioThread = new Thread(new
     * TelaPrincipal.horaThread()); relogioThread.start(); }
     *
     * //---------------------Funcionando mas Buga o
     * panelLateral--------------------\\ class horaThread implements Runnable{
     *
     * @Override public void run() { while(true){
     * lblHora.setText(formatoHora.format(new Date())); try{ Thread.sleep(1000);
     * }catch(InterruptedException ex){ System.out.println("Erro ao carregar
     * Thread da Hora" + ex); } } } }*
     */
}

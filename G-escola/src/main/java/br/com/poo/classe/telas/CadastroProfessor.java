package br.com.poo.classe.telas;

import br.com.conexao.ConexaoDAO;
import br.com.poo.classe.Disciplina;
import br.com.poo.classe.Endereco;
import br.com.poo.classe.Professor;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class CadastroProfessor extends javax.swing.JPanel {
    
    boolean clique;
    public CadastroProfessor() {
        initComponents();
        Atualizar();
        clique = false;
    }
    ConexaoDAO bancoSQL = new ConexaoDAO();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadastrar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campContato = new javax.swing.JFormattedTextField();
        campNascimento = new javax.swing.JFormattedTextField();
        campCpf = new javax.swing.JFormattedTextField();
        campNome = new javax.swing.JTextField();
        campEmail = new javax.swing.JTextField();
        boxSexo = new javax.swing.JComboBox<>();
        checkImprimir = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campRua = new javax.swing.JTextField();
        campCidade = new javax.swing.JTextField();
        campEstado = new javax.swing.JTextField();
        campNumero = new javax.swing.JTextField();
        campBairro = new javax.swing.JTextField();
        numeroProfessorCadastrado = new javax.swing.JLabel();
        panelList = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jlistProfessor = new javax.swing.JList<>();
        jLabel17 = new javax.swing.JLabel();
        lblList = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        boxProfessor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(java.awt.Color.black);
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro Professor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 255, 0))); // NOI18N
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, 120, 30));

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(java.awt.Color.black);
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(java.awt.Color.black);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome Completo:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, 20));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contato:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E-Mail:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Data de Nascimento:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sexo:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        try {
            campContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(campContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 120, -1));

        try {
            campNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(campNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 60, -1));

        try {
            campCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(campCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 160, -1));
        jPanel2.add(campNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 338, -1));
        jPanel2.add(campEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 330, -1));

        boxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        jPanel2.add(boxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 100, -1));

        checkImprimir.setBackground(new java.awt.Color(0, 0, 0));
        checkImprimir.setForeground(new java.awt.Color(255, 255, 255));
        checkImprimir.setText("Imprimir txt");
        jPanel2.add(checkImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 540, 177));

        jPanel3.setBackground(java.awt.Color.black);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Rua:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estado:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cidade:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Bairro:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Numero:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));
        jPanel3.add(campRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 254, -1));
        jPanel3.add(campCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 105, -1));
        jPanel3.add(campEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 44, -1));
        jPanel3.add(campNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 91, -1));
        jPanel3.add(campBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 170, -1));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 185, 540, 150));

        numeroProfessorCadastrado.setForeground(new java.awt.Color(255, 255, 255));
        numeroProfessorCadastrado.setText("Nenhum professor cadastrado");
        jPanel4.add(numeroProfessorCadastrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 316, -1, -1));

        panelList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlistProfessor.setBackground(new java.awt.Color(0, 0, 0));
        jlistProfessor.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jlistProfessor.setForeground(new java.awt.Color(255, 255, 255));
        jlistProfessor.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jlistProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane4.setViewportView(jlistProfessor);

        panelList.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 200, 230));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Professores Cadastrado:");
        panelList.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, -1));

        jPanel4.add(panelList, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, 300, 250));

        lblList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblList.setForeground(new java.awt.Color(255, 255, 0));
        lblList.setText("Hide");
        lblList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblListMouseClicked(evt);
            }
        });
        jPanel4.add(lblList, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 40, 30));

        jTabbedPane1.addTab("Geral", jPanel4);

        jPanel5.setBackground(java.awt.Color.black);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Professor:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 31, 110, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Disciplinas:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 200, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Disciplinas Alocadas:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 150, -1));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 9, 774, 10));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 774, 10));

        boxProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxProfessorActionPerformed(evt);
            }
        });
        jPanel5.add(boxProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 350, -1));

        jScrollPane1.setViewportView(jList1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 170, 170));

        jScrollPane2.setViewportView(jList2);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 180, 180));

        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        jScrollPane3.setViewportView(jList3);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 148, 180, 180));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Turma:");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 140, -1));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newIcones/181778743000202.gif"))); // NOI18N
        jLabel16.setText("jLabel16");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 560, 140));

        jButton2.setText("Remover");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        jTabbedPane1.addTab("Alocacão", jPanel5);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 840, 370));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (campNome.getText().equals("") & campEmail.getText().equals("")
                & campRua.getText().equals("") & campBairro.getText().equals("")
                & campCidade.getText().equals("") & campEstado.getText().equals("")
                & campNumero.getText().equals("") & campNascimento.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos de Cadastro!!!");
        } else {
//-------------------------NOVO PROF E END------------------------------------\\
            Professor prof = new Professor();
            Endereco end = new Endereco();

//---------------------------PROFESSOR----------------------------------------\\
            prof.setNome(campNome.getText());
            prof.setCpf(campCpf.getText());
            prof.setDataNascimento(campNascimento.getText());
            prof.setEmail(campEmail.getText());
            prof.setTelefone(campContato.getText());
            String Sexo = (String) boxSexo.getSelectedItem();
            if (Sexo.equals("Masculino")) {
                prof.setSexo("Masculino");
            } else {
                prof.setSexo("Feminino");
            }
//-----------------------------------Endereço---------------------------------\\
            end.setBairro(campBairro.getText());
            end.setEstado(campEstado.getText());
            end.setCidade(campCidade.getText());
            end.setNumeroCasa(campNumero.getText());
            end.setRua(campRua.getText());

//-------------------------------PASSA END PRO PROF---------------------------\\
            prof.setEndereco(end);
//----------------------------------------------------------------------------\\
            try {
                bancoSQL.save(end);
                bancoSQL.save(prof); //ADICIONA NO BANCO DE DADOS
            } catch (Exception ex) {
                Logger.getLogger(CadastroAluno.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            if (checkImprimir.isSelected()) {
                prof.SalvarBlocoNotas();
            } // SALVA BLOCO DE NOTAS NA AREA DE TRABALHO

            numeroProfessorCadastrado.setText("Quant.Cadastrados: " + bancoSQL.ListProfessor().size()); //ATUALIZA O NUMERO DE CADASTRADOS
            campNome.requestFocus();// Volta o Cursor do mouse:

            //------------------- Limpar todos os Campos ----------------------------------
            Limpar(); // LIMPA OS CAMPOS: 
            Atualizar();

        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AlocarDisciplina();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void boxProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxProfessorActionPerformed
        disciplinasAlocadas();
    }//GEN-LAST:event_boxProfessorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Remover();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lblListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblListMouseClicked
        if(clique){
            lblList.setLocation(590, 150);
            panelList.setLocation(650, 40);
            //lblList.setText("Hide");
            clique = false;
        }else if(clique == false){
            lblList.setLocation(800, 150);
            panelList.setLocation(850, 40);
            //lblList.setText("Show");
            clique = true;
        }
    }//GEN-LAST:event_lblListMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxProfessor;
    private javax.swing.JComboBox<String> boxSexo;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JTextField campBairro;
    private javax.swing.JTextField campCidade;
    private javax.swing.JFormattedTextField campContato;
    private javax.swing.JFormattedTextField campCpf;
    private javax.swing.JTextField campEmail;
    private javax.swing.JTextField campEstado;
    private javax.swing.JFormattedTextField campNascimento;
    private javax.swing.JTextField campNome;
    private javax.swing.JTextField campNumero;
    private javax.swing.JTextField campRua;
    private javax.swing.JCheckBox checkImprimir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JList<String> jList3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> jlistProfessor;
    private javax.swing.JLabel lblList;
    private javax.swing.JLabel numeroProfessorCadastrado;
    private javax.swing.JPanel panelList;
    // End of variables declaration//GEN-END:variables

    public void Atualizar() {
        
        List<Professor> ListProfessores = bancoSQL.ListProfessor();         // Carrega as Disciplinas do Banco para uma Lista
        List<Disciplina> ListDisciplinas = bancoSQL.ListDisciplinas();      // Carrega os professores cadastrados para uma Lista
        
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            for (Professor prof : ListProfessores) {
                model.addElement(prof.getNome());
                boxProfessor.setModel(model);       // Atualiza a ComboBox professores com professores cadastrados
            }
            DefaultListModel model2 = new DefaultListModel();
            for (Disciplina disc : ListDisciplinas) {
                model2.addElement(disc.getNome());
                jList1.setModel(model2);            // Atualiza a jList1 com disciplinas cadastradas no banco de dados
            }
            
            int posicao = boxProfessor.getSelectedIndex();      // pega a posicao do professor na ComboBox
            Professor professor = ListProfessores.get(posicao); // pega o professor da ComboBox
            
            for (Disciplina disc : professor.getDisciplina()) {
                DefaultListModel model3 = new DefaultListModel();
                model3.addElement(disc.getNome());
                jList3.setModel(model3);                        // Atualiza a jList3 com Disciplinas Alocadas ao Professor
                
                for (int i = 0; i < disc.getTurma().size(); i++) {
                    DefaultListModel model4 = new DefaultListModel();
                    model4.addElement(disc.getTurma().get(i).getNome());
                    jList2.setModel(model4);                    // Atualiza a jList2 com Turmas da Disciplina alocada
                }
            }
            DefaultListModel model5 = new DefaultListModel();
            for(Professor prof1 : bancoSQL.ListProfessor()){
                model5.addElement(prof1.getNome());
                jlistProfessor.setModel(model5);                //Atualiza jlistProfessor com professores
            }
        } catch (Exception e) {
            System.out.println("Erro " + e);
        }
        numeroProfessorCadastrado.setText("Professores Cadastrados: "+ ListProfessores.size());

    }

    private void AlocarDisciplina(){
        
        List<Professor> ListProfessores = bancoSQL.ListProfessor();
        List<Disciplina> ListDisciplinas = bancoSQL.ListDisciplinas();
        
        Professor   prof    = ListProfessores.get(boxProfessor.getSelectedIndex());
        Disciplina  disc    = ListDisciplinas.get(jList1.getSelectedIndex());
        prof.getDisciplina().add(disc);
        disc.setProfessor(prof);
        
        bancoSQL.save_update(prof);
        
        
        for (Disciplina disci : prof.getDisciplina()) {
            DefaultListModel model = new DefaultListModel();
            model.addElement(disci.getNome());
            jList3.setModel(model);                 // Atualiza a jList2 com Turmas da Disciplina alocada
            
            for (int i = 0; i < disci.getTurma().size(); i++) {
                DefaultListModel model1 = new DefaultListModel();
                model1.addElement(disci.getTurma().get(i).getNome());
                jList2.setModel(model1);            // Atualiza a jList2 com Turmas da Disciplina alocada
                
            }
        }
        disciplinasAlocadas();
        Atualizar();
    }
    
    public void disciplinasAlocadas(){
        
        List<Professor> listProfessor = null;
        listProfessor = bancoSQL.ListProfessor();
        Professor prof = listProfessor.get(boxProfessor.getSelectedIndex());
        
        try {
            DefaultListModel model3 = new DefaultListModel();
                for (int i = 0; i < prof.getDisciplina().size(); i++) {
                    model3.addElement(prof.getDisciplina().get(i).getNome());
                    jList3.setModel(model3);
                }
            
        } catch (Exception e) {
            System.out.println("erro "+e);
        }
    }
    
    private void Remover(){
        
        List <Professor> listProfessor = null;
        List <Disciplina> listDisciplina = null;
        
        listProfessor = bancoSQL.ListProfessor();
        listDisciplina = bancoSQL.ListDisciplinas();
        
        int posicao = jList3.getSelectedIndex();                                // Pega a posição da Disciplina na jList3
        Professor prof = listProfessor.get(boxProfessor.getSelectedIndex());    // Pega o Professor da ComboBox
        prof.getDisciplina().remove(prof.getDisciplina().get(posicao));         // Remove a disciplina da Lista de professor
        
        bancoSQL.save_update(prof);
        
        Atualizar();
    }
    
    private void Limpar() {
        campRua.setText("");
        campBairro.setText("");
        campCidade.setText("");
        campEstado.setText("");
        campNumero.setText("");
        campNome.setText("");
        campCpf.setText("");
        campContato.setText("");
        campNascimento.setText("");
        campEmail.setText("");
    }
}

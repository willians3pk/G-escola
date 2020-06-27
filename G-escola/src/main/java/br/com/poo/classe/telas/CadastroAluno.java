package br.com.poo.classe.telas;

import br.com.conexao.ConexaoDAO;
import br.com.poo.classe.Aluno;
import br.com.poo.classe.Endereco;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastroAluno extends javax.swing.JPanel {

    ConexaoDAO bancoSQL = new ConexaoDAO();

    public CadastroAluno() {
        initComponents();
        NumeroCadastrado.setText("Quant.Cadastrados: " + bancoSQL.listAluno().size());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        camp_Nome = new javax.swing.JTextField();
        camp_DataNascimento = new javax.swing.JFormattedTextField();
        camp_Cpf = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        camp_Contato = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        camp_Email = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        box_Sexo = new javax.swing.JComboBox();
        box_Imprimir = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        camp_Rua = new javax.swing.JTextField();
        camp_Cidade = new javax.swing.JTextField();
        camp_Bairro = new javax.swing.JTextField();
        camp_Estado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        camp_Numero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_Cadastrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        camp_Nome1 = new javax.swing.JTextField();
        camp_DataNascimento1 = new javax.swing.JFormattedTextField();
        camp_Cpf1 = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        camp_Contato1 = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        camp_Email1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        box_Sexo1 = new javax.swing.JComboBox();
        box_Imprimir1 = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        camp_Rua1 = new javax.swing.JTextField();
        camp_Cidade1 = new javax.swing.JTextField();
        camp_Bairro1 = new javax.swing.JTextField();
        camp_Estado1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        camp_Numero1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        NumeroCadastrado1 = new javax.swing.JLabel();
        btn_Cadastrar1 = new javax.swing.JButton();
        NumeroCadastrado = new javax.swing.JLabel();

        setBackground(java.awt.Color.darkGray);
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro Aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 36), java.awt.Color.white)); // NOI18N
        setPreferredSize(new java.awt.Dimension(890, 530));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(java.awt.Color.black);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 16), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(camp_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 314, -1));

        try {
            camp_DataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_DataNascimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(camp_DataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 70, -1));

        try {
            camp_Cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(camp_Cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 160, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nome Completo:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Data de Nascimento:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contato:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        try {
            camp_Contato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(camp_Contato, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 100, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Cpf:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("E-Mail:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        jPanel3.add(camp_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 310, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Sexo:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 40, 20));

        box_Sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        box_Sexo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(box_Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 160, 20));

        box_Imprimir.setBackground(new java.awt.Color(0, 0, 0));
        box_Imprimir.setForeground(new java.awt.Color(255, 255, 255));
        box_Imprimir.setText("Imprimir txt");
        jPanel3.add(box_Imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 110, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 590, 199));

        jPanel4.setBackground(java.awt.Color.black);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 16), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(camp_Rua, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 54, 270, -1));
        jPanel4.add(camp_Cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 104, 128, -1));
        jPanel4.add(camp_Bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 54, 125, -1));

        camp_Estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camp_EstadoActionPerformed(evt);
            }
        });
        jPanel4.add(camp_Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 100, 40, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Rua:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 34, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cidade:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 85, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bairro:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 34, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Estado:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 85, -1, -1));
        jPanel4.add(camp_Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 104, 68, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Numero:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 85, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 590, 153));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 810, 390));

        btn_Cadastrar.setText("Cadastrar");
        btn_Cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastrarActionPerformed(evt);
            }
        });
        add(btn_Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 120, 30));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro Aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 24), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(890, 530));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(java.awt.Color.darkGray);
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(java.awt.Color.darkGray);
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 16), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(camp_Nome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 314, -1));

        try {
            camp_DataNascimento1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        camp_DataNascimento1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel6.add(camp_DataNascimento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 70, -1));

        try {
            camp_Cpf1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel6.add(camp_Cpf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 160, -1));

        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Nome Completo:");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Data de Nascimento:");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Contato:");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        try {
            camp_Contato1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel6.add(camp_Contato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 100, -1));

        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Cpf:");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("E-Mail:");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        jPanel6.add(camp_Email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 310, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Sexo:");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 40, 20));

        box_Sexo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        jPanel6.add(box_Sexo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 160, 20));

        box_Imprimir1.setBackground(new java.awt.Color(51, 51, 51));
        box_Imprimir1.setForeground(new java.awt.Color(255, 255, 255));
        box_Imprimir1.setText("Imprimir txt");
        jPanel6.add(box_Imprimir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 110, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 590, 199));

        jPanel7.setBackground(java.awt.Color.darkGray);
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 0, 16), new java.awt.Color(153, 153, 153))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(51, 51, 51));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(camp_Rua1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 54, 270, -1));
        jPanel7.add(camp_Cidade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 104, 128, -1));
        jPanel7.add(camp_Bairro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 54, 125, -1));
        jPanel7.add(camp_Estado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 104, 37, -1));

        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Rua:");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 34, -1, -1));

        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Cidade:");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 85, -1, -1));

        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Bairro:");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 34, -1, -1));

        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Estado:");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 85, -1, -1));
        jPanel7.add(camp_Numero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 104, 68, -1));

        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Numero:");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 85, -1, -1));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 530, 153));

        NumeroCadastrado1.setForeground(new java.awt.Color(204, 204, 204));
        NumeroCadastrado1.setText("Nenhum Aluno cadastrado");
        jPanel5.add(NumeroCadastrado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 250, 20));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 810, 390));

        btn_Cadastrar1.setText("Cadastrar");
        btn_Cadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cadastrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Cadastrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 120, 30));

        NumeroCadastrado.setForeground(new java.awt.Color(255, 255, 255));
        NumeroCadastrado.setText("Nenhum Aluno cadastrado");
        jPanel1.add(NumeroCadastrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 240, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastrarActionPerformed
        Cadastrar();
    }//GEN-LAST:event_btn_CadastrarActionPerformed

    private void btn_Cadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cadastrar1ActionPerformed
        
    }//GEN-LAST:event_btn_Cadastrar1ActionPerformed

    private void camp_EstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camp_EstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camp_EstadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NumeroCadastrado;
    private javax.swing.JLabel NumeroCadastrado1;
    private javax.swing.JCheckBox box_Imprimir;
    private javax.swing.JCheckBox box_Imprimir1;
    private javax.swing.JComboBox box_Sexo;
    private javax.swing.JComboBox box_Sexo1;
    private javax.swing.JButton btn_Cadastrar;
    private javax.swing.JButton btn_Cadastrar1;
    private javax.swing.JTextField camp_Bairro;
    private javax.swing.JTextField camp_Bairro1;
    private javax.swing.JTextField camp_Cidade;
    private javax.swing.JTextField camp_Cidade1;
    private javax.swing.JFormattedTextField camp_Contato;
    private javax.swing.JFormattedTextField camp_Contato1;
    private javax.swing.JFormattedTextField camp_Cpf;
    private javax.swing.JFormattedTextField camp_Cpf1;
    private javax.swing.JFormattedTextField camp_DataNascimento;
    private javax.swing.JFormattedTextField camp_DataNascimento1;
    private javax.swing.JTextField camp_Email;
    private javax.swing.JTextField camp_Email1;
    private javax.swing.JTextField camp_Estado;
    private javax.swing.JTextField camp_Estado1;
    private javax.swing.JTextField camp_Nome;
    private javax.swing.JTextField camp_Nome1;
    private javax.swing.JTextField camp_Numero;
    private javax.swing.JTextField camp_Numero1;
    private javax.swing.JTextField camp_Rua;
    private javax.swing.JTextField camp_Rua1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables

    private void Cadastrar(){
        
        if (camp_Nome.getText().equals("") & camp_Email.getText().equals("")
                & camp_Rua.getText().equals("") & camp_Bairro.getText().equals("")
                & camp_Cidade.getText().equals("") & camp_Estado.getText().equals("")
                & camp_Numero.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos de Cadastro!!!");
        } else {

            
            //------ CRIA NOVO ALUNO ------
            Endereco end = new Endereco(camp_Rua.getText(), camp_Bairro.getText(), camp_Cidade.getText(), camp_Estado.getText(), camp_Numero.getText());
            Aluno aluno = new Aluno(camp_Nome.getText(), camp_Cpf.getText(), camp_Contato.getText(), camp_DataNascimento.getText(), camp_Email.getText(), end);

            String Sexo = (String) box_Sexo.getSelectedItem();
            if (Sexo.equals("Femenino")) {
                aluno.setSexo("Femenino");
            } else if (Sexo.equals("Masculino")) {
                aluno.setSexo("Masculino");
            }

            try {
                bancoSQL.save(end);
                bancoSQL.save(aluno); //ADICIONA NO BANCO DE DADOS
            } catch (Exception ex) {
                Logger.getLogger(CadastroAluno.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

            if (box_Imprimir.isSelected()) {
                aluno.SalvarBlocoNotas();
            } // SALVA BLOCO DE NOTAS NA AREA DE TRABALHO

            NumeroCadastrado.setText("Quant.Cadastrados: " + bancoSQL.listAluno().size()); //ATUALIZA O NUMERO DE CADASTRADOS
            camp_Nome.requestFocus();// Volta o Cursor do mouse:

            //------------------- Limpar todos os Campos ----------------------------------
            Limpar(); // LIMPA OS CAMPOS:
        }
    }
    
    private void Limpar() {
        camp_Rua.setText(""); 
        camp_Bairro.setText("");
        camp_Cidade.setText("");
        camp_Estado.setText("");
        camp_Numero.setText("");
        camp_Nome.setText(""); 
        camp_Cpf.setText("");
        camp_Contato.setText("");
        camp_DataNascimento.setText("");
        camp_Email.setText("");
    }
}

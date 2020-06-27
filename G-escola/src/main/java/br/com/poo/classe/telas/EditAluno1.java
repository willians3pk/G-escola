package br.com.poo.classe.telas;

import br.com.conexao.ConexaoDAO;
import br.com.poo.classe.Aluno;
import br.com.poo.classe.Endereco;
import java.util.List;

public class EditAluno1 extends javax.swing.JFrame {

    ConexaoDAO banco = new ConexaoDAO();
    private int posicao;

    public EditAluno1() {
        initComponents();
    }

    public void PegaPosicao(int posicao) {
        this.posicao = posicao;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        boxSexo = new javax.swing.JComboBox<>();
        campEmail = new javax.swing.JTextField();
        campNome1 = new javax.swing.JTextField();
        campCpf = new javax.swing.JFormattedTextField();
        campContato = new javax.swing.JFormattedTextField();
        campNascimento = new javax.swing.JFormattedTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campRua = new javax.swing.JTextField();
        campEstado = new javax.swing.JTextField();
        campCidade = new javax.swing.JTextField();
        campBairro = new javax.swing.JTextField();
        campNumero = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.darkGray);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edit Aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(java.awt.Color.darkGray);
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contato:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data de Nascimento:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E-Mail:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sexo:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        boxSexo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        boxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "Masculino", "Feminino", " " }));
        jPanel2.add(boxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));
        jPanel2.add(campEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 390, -1));
        jPanel2.add(campNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 372, -1));
        jPanel2.add(campCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 146, -1));
        jPanel2.add(campContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 146, -1));

        campNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campNascimentoActionPerformed(evt);
            }
        });
        jPanel2.add(campNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 142, -1));

        jTabbedPane1.addTab("Dados Pessoais", jPanel2);

        jPanel6.setBackground(java.awt.Color.darkGray);
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Rua:");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cidade:");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estado:");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Numero:");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Bairro:");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        jPanel6.add(campRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 310, -1));
        jPanel6.add(campEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 100, -1));
        jPanel6.add(campCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 200, -1));
        jPanel6.add(campBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 200, -1));
        jPanel6.add(campNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 100, -1));

        jTabbedPane1.addTab("Endereço", jPanel6);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 119, 730, 310));

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        jPanel1.add(btnInserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 440, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(844, 526));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campNascimentoActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        Salvar();
    }//GEN-LAST:event_btnInserirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditAluno1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxSexo;
    private javax.swing.JButton btnInserir;
    private javax.swing.JTextField campBairro;
    private javax.swing.JTextField campCidade;
    private javax.swing.JFormattedTextField campContato;
    private javax.swing.JFormattedTextField campCpf;
    private javax.swing.JTextField campEmail;
    private javax.swing.JTextField campEstado;
    private javax.swing.JFormattedTextField campNascimento;
    private javax.swing.JTextField campNome1;
    private javax.swing.JTextField campNumero;
    private javax.swing.JTextField campRua;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    public void Atualizar() {

        Aluno aluno = banco.listAluno().get(posicao);

        campCpf.setText(aluno.getCpf());
        campEmail.setText(aluno.getEmail());
        campNome1.setText(aluno.getNome());
        campNascimento.setText(aluno.getDataNascimento());
        campContato.setText(aluno.getTelefone());
        boxSexo.setToolTipText(aluno.getSexo());
        campBairro.setText(aluno.getEndereco().getBairro());
        campRua.setText(aluno.getEndereco().getRua());
        campCidade.setText(aluno.getEndereco().getCidade());
        campEstado.setText(aluno.getEndereco().getEstado());
        campNumero.setText(aluno.getEndereco().getNumeroCasa());
    }

    public void Salvar() {
        
        List<Aluno> listAluno = null;
        List<Endereco> listEndereco = null;

        listEndereco = banco.ListEndereco();
        listAluno = banco.listAluno();

        Aluno aluno = banco.listAluno().get(posicao);
        Endereco end = aluno.getEndereco();

        end.setBairro(campBairro.getText());
        end.setCidade(campCidade.getText());
        end.setEstado(campEstado.getText());
        end.setRua(campRua.getText());
        end.setNumeroCasa(campNumero.getText());

        aluno.setNome(campNome1.getText());
        aluno.setCpf(campCpf.getText());
        aluno.setDataNascimento(campNascimento.getText());
        aluno.setEmail(campEmail.getText());
        aluno.setTelefone(campContato.getText());
        aluno.setEndereco(end);
        String sexo = (String) boxSexo.getSelectedItem();
        if (sexo.equals("Masculino")) {
            aluno.setSexo("Masculino");
        } else {
            aluno.setSexo("Feminino");
        }

        banco.save_update(end);
        banco.save_update(aluno);

        Atualizar();
        
    }

}

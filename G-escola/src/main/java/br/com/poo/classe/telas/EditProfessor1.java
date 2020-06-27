/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poo.classe.telas;

import br.com.conexao.ConexaoDAO;
import br.com.poo.classe.Endereco;
import br.com.poo.classe.Professor;
import br.com.poo.classe.Turma;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ALEXANDRE
 */
public class EditProfessor1 extends javax.swing.JFrame {

    ConexaoDAO banco = new ConexaoDAO();
    int posicao;
    public EditProfessor1() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campCpf = new javax.swing.JFormattedTextField();
        campContato = new javax.swing.JFormattedTextField();
        campNascimento = new javax.swing.JFormattedTextField();
        campNome1 = new javax.swing.JTextField();
        campEmail = new javax.swing.JTextField();
        campRua = new javax.swing.JTextField();
        campBairro = new javax.swing.JTextField();
        campNumero = new javax.swing.JTextField();
        campCidade = new javax.swing.JTextField();
        campEstado = new javax.swing.JTextField();
        boxSexo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTurmaAlocada = new javax.swing.JList<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        campNome = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(890, 530));
        setResizable(false);

        jPanel2.setBackground(java.awt.Color.darkGray);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu Professor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 0))); // NOI18N

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(java.awt.Color.darkGray);
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 37, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contato:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 158, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E-Mail:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 219, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sexo:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rua:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 37, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bairro:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cidade:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 219, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Numero:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 158, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Estado:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 280, 190, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Data de Nascimento:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 342, -1, -1));
        jPanel3.add(campCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 123, 230, -1));
        jPanel3.add(campContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 181, 230, -1));
        jPanel3.add(campNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 365, 122, -1));
        jPanel3.add(campNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 62, 230, -1));
        jPanel3.add(campEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 242, 230, -1));
        jPanel3.add(campRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 62, 190, -1));
        jPanel3.add(campBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 123, 190, -1));

        campNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campNumeroActionPerformed(evt);
            }
        });
        jPanel3.add(campNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 181, 82, -1));
        jPanel3.add(campCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 242, 140, -1));
        jPanel3.add(campEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 299, 60, -1));

        boxSexo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        boxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "Masculino", "Feminino" }));
        jPanel3.add(boxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 303, 150, -1));

        listTurmaAlocada.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listTurmaAlocada);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 123, 175, 161));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Tuma(s) Alocada(s):");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 100, -1, -1));

        jTabbedPane1.addTab("Dados do Professor(a)", jPanel3);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nome:");

        btnInserir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(campNome, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(campNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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

        setSize(new java.awt.Dimension(908, 565));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campNumeroActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        Salvar();
    }//GEN-LAST:event_btnInserirActionPerformed

  
    public static void main(String args[]) {
   
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProfessor1().setVisible(true);
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
    private javax.swing.JTextField campNome;
    private javax.swing.JTextField campNome1;
    private javax.swing.JTextField campNumero;
    private javax.swing.JTextField campRua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> listTurmaAlocada;
    // End of variables declaration//GEN-END:variables

     public void Atualizar(){
        Professor prof = banco.ListProfessor().get(posicao);
        Turma turma = (Turma) banco.ListTurma().get(posicao);
        
        campNome.setText(prof.getNome());
        campCpf.setText(prof.getCpf());
        campEmail.setText(prof.getEmail());
        campNome1.setText(prof.getNome());
        campNascimento.setText(prof.getDataNascimento());
        campContato.setText(prof.getTelefone());
        boxSexo.setToolTipText(prof.getSexo());
        campBairro.setText(prof.getEndereco().getBairro());
        campRua.setText(prof.getEndereco().getRua());
        campCidade.setText(prof.getEndereco().getCidade());
        campEstado.setText(prof.getEndereco().getEstado());
        campNumero.setText(prof.getEndereco().getNumeroCasa());
        
        try{
            DefaultListModel defaultList = new DefaultListModel();
            
            for (int i = 0; i < prof.getDisciplina().size(); i++) {
                defaultList.addElement(prof.getDisciplina().get(i).getTurma().get(i).getNome());
                listTurmaAlocada.setModel(defaultList);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Professor não possui Turma!");
        }
    }
     
    public void Salvar(){
        List<Professor> listProfessor = null;
        List<Endereco> listEndereco = null;
        
        listProfessor = banco.ListProfessor();
        listEndereco = banco.ListEndereco();
        
        Professor prof = listProfessor.get(posicao);
        Endereco end = prof.getEndereco();
        
            prof.setNome(campNome1.getText());
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
            
            end.setBairro(campBairro.getText());
            end.setEstado(campEstado.getText());
            end.setCidade(campCidade.getText());
            end.setNumeroCasa(campNumero.getText());
            end.setRua(campRua.getText());
            prof.setEndereco(end);
            
            banco.save_update(end);
            banco.save_update(prof);
            Atualizar();
    } 
}


package br.com.poo.classe.telas;

import br.com.conexao.ConexaoDAO;
import br.com.poo.classe.Aluno;
import br.com.poo.classe.Turma;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class EditTurma1 extends javax.swing.JFrame {

    
    ConexaoDAO banco = new ConexaoDAO();
    int posicao;
    public EditTurma1() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        boxNome = new javax.swing.JComboBox<>();
        boxPerildo = new javax.swing.JComboBox<>();
        boxAnoLetivo = new javax.swing.JComboBox<>();
        boxGrade = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        boxDiaSemana = new javax.swing.JComboBox<>();
        boxStatus = new javax.swing.JComboBox<>();
        campDescricao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAlunoAlocado = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        campNomeTurma = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(java.awt.Color.darkGray);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu Turma", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(java.awt.Color.darkGray);
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Perildo:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 41, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ano Letivo:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 41, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Grade:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 41, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nome:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dia da Semana:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 112, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Status:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 112, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Descrição:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 181, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Aluno(s) Alocado(s):");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        boxNome.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        boxNome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "1ª Ano \"A\"", "1ª Ano \"B\"", "1ª Ano \"C\"", "2ª Ano \"A\"", "2ª Ano \"B\"", "2ª Ano \"C\"", "3ªAno \"A\"", "3ªAno \"B\"", "3ªAno \"C\"" }));
        jPanel3.add(boxNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 140, -1));

        boxPerildo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        boxPerildo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "Manhã", "Tarde ", "Noite" }));
        jPanel3.add(boxPerildo, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 61, -1, -1));

        boxAnoLetivo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        boxAnoLetivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "2020", " " }));
        jPanel3.add(boxAnoLetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 61, -1, -1));

        boxGrade.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        boxGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "2020", "2021", " ", " " }));
        jPanel3.add(boxGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 61, -1, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 163, 703, 12));

        boxDiaSemana.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        boxDiaSemana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "Segunda Feira", "Terça Feira", "Quarta Feira", "Quinta Feira", "Sexta Feira" }));
        jPanel3.add(boxDiaSemana, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 132, -1, -1));

        boxStatus.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        boxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "Ativa", "Cancelada", "Inativa" }));
        boxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxStatusActionPerformed(evt);
            }
        });
        jPanel3.add(boxStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 132, -1, -1));

        campDescricao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(campDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 201, 197, 106));

        listAlunoAlocado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listAlunoAlocado.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listAlunoAlocado);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 252, 110));

        jTabbedPane1.addTab("Geral", jPanel3);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 117, 704, 360));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Turma:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 50, 20));
        jPanel2.add(campNomeTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 480, 40));

        btnInserir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        jPanel2.add(btnInserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 480, 130, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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

        setSize(new java.awt.Dimension(900, 560));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxStatusActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        Salvar();
    }//GEN-LAST:event_btnInserirActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditTurma1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxAnoLetivo;
    private javax.swing.JComboBox<String> boxDiaSemana;
    private javax.swing.JComboBox<String> boxGrade;
    private javax.swing.JComboBox<String> boxNome;
    private javax.swing.JComboBox<String> boxPerildo;
    private javax.swing.JComboBox<String> boxStatus;
    private javax.swing.JButton btnInserir;
    private javax.swing.JTextField campDescricao;
    private javax.swing.JTextField campNomeTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> listAlunoAlocado;
    // End of variables declaration//GEN-END:variables

    public void Atualizar(){
        Turma turma = banco.ListTurma().get(posicao);
        Aluno aluno = banco.listAluno().get(posicao);
        
        boxAnoLetivo.setToolTipText(turma.getAnoLetivo());
        boxDiaSemana.setToolTipText(turma.getDiaSemana());
        boxGrade.setToolTipText(turma.getGrade());
        boxNome.setToolTipText(turma.getNome());
        boxPerildo.setToolTipText(turma.getPeriodo());
        boxStatus.setToolTipText(turma.getStatus());
        campDescricao.setText(turma.getDescriçao());
        campNomeTurma.setText(turma.getNome());
        
        try{
            DefaultListModel defaultList = new DefaultListModel();
            for (int i = 0; i < turma.getAluno().size(); i++) {
                defaultList.addElement(turma.getAluno().get(i).getNome());
                listAlunoAlocado.setModel(defaultList);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Turma não possui aluno");
        }
    }
    
    public void Salvar(){
        List<Turma> listTurma = null;
        listTurma = banco.ListTurma();
        
        Turma turma = listTurma.get(posicao);
        
        turma.setNome(boxNome.getItemAt(boxNome.getSelectedIndex()));
        turma.setAnoLetivo(boxAnoLetivo.getItemAt(boxAnoLetivo.getSelectedIndex()));
        turma.setDiaSemana(boxDiaSemana.getItemAt(boxDiaSemana.getSelectedIndex()));
        turma.setGrade(boxGrade.getItemAt(boxGrade.getSelectedIndex()));
        turma.setStatus(boxStatus.getItemAt(boxStatus.getSelectedIndex()));
        turma.setPeriodo(boxPerildo.getItemAt(boxPerildo.getSelectedIndex()));
        turma.setDescriçao(campDescricao.getText());
        
        banco.save_update(turma);
        Atualizar();
    }
    
}

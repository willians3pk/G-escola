
package br.com.poo.classe.telascarregamento;


public class Carregamento extends javax.swing.JFrame {

    public Carregamento() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        obj = new javax.swing.JProgressBar();
        label = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        obj.setBackground(new java.awt.Color(255, 255, 255));
        obj.setForeground(new java.awt.Color(255, 255, 0));
        obj.setIndeterminate(true);
        getContentPane().add(obj, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 670, -1));

        label.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 0));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("Carregando...");
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 230, 50));

        lblFundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newIcones/gif-404.gif"))); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 580));

        setSize(new java.awt.Dimension(791, 578));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carregamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel label;
    private javax.swing.JLabel lblFundo;
    public javax.swing.JProgressBar obj;
    // End of variables declaration//GEN-END:variables
}

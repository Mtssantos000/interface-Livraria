
package Interface;



/**
 *
 * @author Matheus Santos
 */
public class Principal extends javax.swing.JFrame {
            
           /*Cad_Lista_Livro p1 = new Cad_Lista_Livro();
            Cliente c1 = new Cliente();
           Cliente c1 = new Cliente();
            Novo_Livro d1 = new Novo_Livro();
            Novo_Livro l1 = new Novo_Livro();
            Novo_Livro r1 = new Novo_Livro();
           */
            
            public void telacadLivro(){
                Cad_Lista_Livro telacadlivro = new Cad_Lista_Livro();
                VISOR.add(telacadlivro);
                telacadlivro.setVisible(true);
               
              
                
                //telacadlivro.dispose();
                //System.exit(0);
            }
            
            public void telacadCliente(){
               
                Cadastro_Cliente telacadcliente = new Cadastro_Cliente();
                VISOR.add(telacadcliente);
                telacadcliente.setVisible(true);
            }
            
            
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
       
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        VISOR = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        bMenuLivro = new javax.swing.JMenu();
        jMenuItemCadastralivro = new javax.swing.JMenuItem();
        bMenuCliente = new javax.swing.JMenu();
        BMenuItemCliente = new javax.swing.JMenuItem();
        bMenuSair = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");
        setResizable(false);

        VISOR.setPreferredSize(new java.awt.Dimension(640, 310));

        javax.swing.GroupLayout VISORLayout = new javax.swing.GroupLayout(VISOR);
        VISOR.setLayout(VISORLayout);
        VISORLayout.setHorizontalGroup(
            VISORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        VISORLayout.setVerticalGroup(
            VISORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(VISOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VISOR, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
        );

        bMenuLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pilha-de-livros2.png"))); // NOI18N
        bMenuLivro.setText("Livro");

        jMenuItemCadastralivro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItemCadastralivro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItemCadastralivro.setText("Cadastrar Livro");
        jMenuItemCadastralivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastralivroActionPerformed(evt);
            }
        });
        bMenuLivro.add(jMenuItemCadastralivro);

        jMenuBar1.add(bMenuLivro);

        bMenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cliente (2).png"))); // NOI18N
        bMenuCliente.setText("Cliente");

        BMenuItemCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        BMenuItemCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BMenuItemCliente.setText("Cliente");
        BMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMenuItemClienteActionPerformed(evt);
            }
        });
        bMenuCliente.add(BMenuItemCliente);

        jMenuBar1.add(bMenuCliente);

        bMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/sair2.png"))); // NOI18N
        bMenuSair.setText("Sair");
        bMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMenuSairActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        bMenuSair.add(jMenuItem1);

        jMenuBar1.add(bMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenuSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bMenuSairActionPerformed

    private void jMenuItemCadastralivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastralivroActionPerformed
        // TODO add your handling code here:
         telacadLivro();
    }//GEN-LAST:event_jMenuItemCadastralivroActionPerformed

    private void BMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMenuItemClienteActionPerformed
        // TODO add your handling code here:
       telacadCliente();

    }//GEN-LAST:event_BMenuItemClienteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BMenuItemCliente;
    private javax.swing.JDesktopPane VISOR;
    private javax.swing.JMenu bMenuCliente;
    private javax.swing.JMenu bMenuLivro;
    private javax.swing.JMenu bMenuSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemCadastralivro;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

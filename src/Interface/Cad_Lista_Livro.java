
package Interface;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Cad_Lista_Livro extends javax.swing.JInternalFrame {
        ArrayList<Livro>ListaLivro;

   
        
        public void LoadTabelaLivros(){
        //--------CARREGAR A TABELA DE ACORDO COM A LISTA DE PRODUTOS-------------------------
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Titulo","Autor","Tipo","ID","Valor"},0);
        
        //---------PERCORRER AS LINHAS DE PRODUTOS----------
        for(int i=0; i<ListaLivro.size();i++){
            Object [] linha = new Object[]{ListaLivro.get(i).getTitulo(),
                                            ListaLivro.get(i).getAutor(), 
                                            ListaLivro.get(i).getGenero(),
                                            ListaLivro.get(i).getId(),
                                            ListaLivro.get(i).getValor()};
                                            
            modelo.addRow(linha);
        }
        
        //----------MUDAR O MODELO DA TABELA--------
        TableLivros.setModel(modelo);
        
    }
    public void remover(){
    int index =TableLivros.getSelectedRow();
        if(index >=0 && index<ListaLivro.size()){
            ListaLivro.remove(index);
        }
        LoadTabelaLivros();
        }
    
    public Cad_Lista_Livro() {
        initComponents();
        ListaLivro=new ArrayList();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ReceberTitu = new javax.swing.JTextField();
        ReceberAutor = new javax.swing.JTextField();
        ReceberTipo = new javax.swing.JTextField();
        BotaoEnviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableLivros = new javax.swing.JTable();
        ReceberValorr = new javax.swing.JTextField();
        BotaoExcluir = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        Receberrd = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Titulo");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Autor:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Tipo:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("ID:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Valor");

        ReceberTitu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceberTituActionPerformed(evt);
            }
        });

        BotaoEnviar.setText("Enviar");
        BotaoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEnviarActionPerformed(evt);
            }
        });

        TableLivros.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        TableLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Autor", "Tipo", "ID", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableLivros);

        ReceberValorr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceberValorrActionPerformed(evt);
            }
        });

        BotaoExcluir.setText("Excluir");
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Receberrd)
                    .addComponent(ReceberValorr)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(BotaoEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(6, 6, 6))
                    .addComponent(ReceberTitu)
                    .addComponent(ReceberAutor)
                    .addComponent(ReceberTipo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2)
                        .addComponent(ReceberTitu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ReceberAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ReceberTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Receberrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ReceberValorr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoEnviar)
                            .addComponent(BotaoExcluir)
                            .addComponent(jButtonSair)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ReceberAutor, ReceberTipo, ReceberTitu, ReceberValorr, Receberrd});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReceberTituActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceberTituActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReceberTituActionPerformed

    private void BotaoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEnviarActionPerformed
        // TODO add your handling code here:
        double valor = Double.parseDouble(ReceberValorr.getText());
        int id = Integer.parseInt(Receberrd.getText());
        
        Livro ObjLivro = new Livro(ReceberTitu.getText(),ReceberAutor.getText(),ReceberTipo.getText(),id,valor);
        ListaLivro.add(ObjLivro);
        LoadTabelaLivros();   
        
    }//GEN-LAST:event_BotaoEnviarActionPerformed

    private void ReceberValorrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceberValorrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReceberValorrActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        // TODO add your handling code here:
        remover();
        
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

     public ArrayList<Livro> getListaLivro() {
        return ListaLivro;
    }

    public void setListaLivro(ArrayList<Livro> ListaLivro) {
        this.ListaLivro = ListaLivro;
    }

    public JButton getBotaoEnviar() {
        return BotaoEnviar;
    }

    public void setBotaoEnviar(JButton BotaoEnviar) {
        this.BotaoEnviar = BotaoEnviar;
    }

    public JTextField getReceberAutor() {
        return ReceberAutor;
    }

    public void setReceberAutor(JTextField ReceberAutor) {
        this.ReceberAutor = ReceberAutor;
    }

    

    public JTextField getReceberTipo() {
        return ReceberTipo;
    }

    public void setReceberTipo(JTextField ReceberTipo) {
        this.ReceberTipo = ReceberTipo;
    }

    public JTextField getReceberTitu() {
        return ReceberTitu;
    }

    public void setReceberTitu(JTextField ReceberTitu) {
        this.ReceberTitu = ReceberTitu;
    }

    public JTextField getReceberValorr() {
        return ReceberValorr;
    }

    public void setReceberValorr(JTextField ReceberValorr) {
        this.ReceberValorr = ReceberValorr;
    }

    public JTable getTableLivros() {
        return TableLivros;
    }

    public void setTableLivros(JTable TableLivros) {
        this.TableLivros = TableLivros;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEnviar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JTextField ReceberAutor;
    private javax.swing.JTextField ReceberTipo;
    private javax.swing.JTextField ReceberTitu;
    private javax.swing.JTextField ReceberValorr;
    private javax.swing.JTextField Receberrd;
    private javax.swing.JTable TableLivros;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

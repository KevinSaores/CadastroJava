/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Categoria;
import model.bean.Produto;
import model.dao.CategoriaDAO;
import model.dao.ProdutoDAO;

/**
 *
 * @author Administrador
 */
public class viewCadastro extends javax.swing.JFrame {
    private DefaultTableModel dtmProdutos;
    /**
     * Creates new form viewCadastro
     */
    public viewCadastro() {
        initComponents();
        dtmProdutos = (DefaultTableModel) jTableProdutos.getModel();
        preencherComboBoxCategorias();
        preencherTabelaProduto();
    }
    private void preencherTabelaProduto(){
        ProdutoDAO pDAO = new ProdutoDAO();
        int idProduto = 0;
        String desProduto = "";
        int quantidade = 0;
        double valor = 0.0d;
        int idCategoria = 0;
        dtmProdutos.setRowCount(0);//reseta a tabela (limpa)
        for(Produto p : pDAO.findAll()){
            idProduto = p.getIdProduto();
            desProduto = p.getDescricao();
            quantidade = p.getQtd();
            valor = p.getValor();
            idCategoria = p.getCategoria().getIdCategoria();
            Object[] dados = {idProduto,desProduto,quantidade,valor,idCategoria};
            dtmProdutos.addRow(dados);
        }
    }
    private void preencherTabelaProduto(int idCategoria){
        ProdutoDAO pDAO = new ProdutoDAO();
        int idProduto = 0;
        String desProduto = "";
        int quantidade = 0;
        double valor = 0.0d;
        dtmProdutos.setRowCount(0);//reseta a tabela (limpa)
        for(Produto p : pDAO.findAll(idCategoria)){
            idProduto = p.getIdProduto();
            desProduto = p.getDescricao();
            quantidade = p.getQtd();
            valor = p.getValor();
            idCategoria = p.getCategoria().getIdCategoria();
            Object[] dados = {idProduto,desProduto,quantidade,valor,idCategoria};
            dtmProdutos.addRow(dados);
        }
    }
    private void preencherComboBoxCategorias(){
        CategoriaDAO catDao = new CategoriaDAO();
        for (Categoria cat : catDao.findAll()) { 
            jComboBoxCategorias.addItem(cat);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldQtd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonExcluir = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jTextFieldDesc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxCategorias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro", 0, 0, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Quantidade");

        jTextFieldQtd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldQtd.setForeground(new java.awt.Color(0, 0, 102));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Categorias");

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(0, 0, 102));
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jButtonExcluir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonExcluirKeyPressed(evt);
            }
        });

        jButtonAtualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonAtualizar.setForeground(new java.awt.Color(0, 0, 102));
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });
        jButtonAtualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonAtualizarKeyPressed(evt);
            }
        });

        jButtonCadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCadastrar.setForeground(new java.awt.Color(0, 0, 102));
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        jButtonCadastrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonCadastrarKeyPressed(evt);
            }
        });

        jTextFieldDesc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldDesc.setForeground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Descrição");

        jTextFieldValor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldValor.setForeground(new java.awt.Color(0, 0, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Valor");

        jComboBoxCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldDesc)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonCadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAtualizar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonExcluir)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldQtd))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonAtualizar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTableProdutos.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jTableProdutos.setForeground(new java.awt.Color(0, 0, 102));
        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descrição", "Quantidade", "Valor", "Id Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class
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
        jTableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutosMouseClicked(evt);
            }
        });
        jTableProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableProdutosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProdutos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        salvar();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed
    private void salvar(){
        String desc = jTextFieldDesc.getText();
        int qtd = Integer.parseInt(jTextFieldQtd.getText());
        double valor = Double.parseDouble(jTextFieldValor.getText());
        Categoria categoria = new Categoria();
        categoria.setIdCategoria(1);
        Produto p = new Produto();
        ProdutoDAO dao = new ProdutoDAO();
        p.setDescricao(desc);
        p.setQtd(qtd);
        p.setValor(valor);
        p.setCategoria(categoria);
        dao.save(p);
        preencherTabelaProduto();
        limpaCampos();
    }
    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        atualizar();
    }//GEN-LAST:event_jButtonAtualizarActionPerformed
    private void atualizar(){
        
    }
    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_jButtonExcluirActionPerformed
    private void limpaCampos() {
        jTextFieldDesc.setText("");
        jTextFieldQtd.setText("");
        jTextFieldValor.setText("");
        jTextFieldDesc.requestFocus();
    } 
    private void excluir(){
        int linhaSelecionada = jTableProdutos.getSelectedRow();
        if (linhaSelecionada != -1) {
            int id = (int) dtmProdutos.getValueAt(linhaSelecionada, 0);
            
            Produto p = new Produto();
            ProdutoDAO dao = new ProdutoDAO();
            p.setIdProduto(id);
            
            dao.dell(p);
            preencherTabelaProduto();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um aluno para excluir");
        }
    }
    private void jButtonCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCadastrarKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER){
            salvar();
        }
    }//GEN-LAST:event_jButtonCadastrarKeyPressed

    private void jButtonAtualizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAtualizarKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER){
            atualizar();
        }
    }//GEN-LAST:event_jButtonAtualizarKeyPressed

    private void jButtonExcluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonExcluirKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER){
            excluir();
        }
    }//GEN-LAST:event_jButtonExcluirKeyPressed

    private void jComboBoxCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriasActionPerformed
        Categoria cat = new Categoria();
            //casting de (categotia)
            cat = (Categoria)jComboBoxCategorias.getSelectedItem();
        if(cat.getIdCategoria() == 0){
            preencherTabelaProduto();
        }else{
            //JOptionPane.showMessageDialog(null, todas);
            preencherTabelaProduto(cat.getIdCategoria());
        }
    }//GEN-LAST:event_jComboBoxCategoriasActionPerformed

    private void jTableProdutosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableProdutosKeyReleased
        
    }//GEN-LAST:event_jTableProdutosKeyReleased

    private void jTableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutosMouseClicked
        int linhaSelecionade = jTableProdutos.getSelectedRow();
        String desc;
        String qtd;
        String valor;
        if(linhaSelecionade != -1){
            desc = dtmProdutos.getValueAt(linhaSelecionade, 1).toString();
            qtd = dtmProdutos.getValueAt(linhaSelecionade, 2).toString();
            valor = dtmProdutos.getValueAt(linhaSelecionade, 3).toString();
            
            
            jTextFieldDesc.setText(desc);
            jTextFieldQtd.setText(qtd);
            jTextFieldValor.setText(valor);
        }
        focusrequest();
    }//GEN-LAST:event_jTableProdutosMouseClicked

    private void focusrequest(){
        if(jTableProdutos.getSelectedColumn() == 1){
            jTextFieldDesc.requestFocus();
        }else if(jTableProdutos.getSelectedColumn() == 2){
            jTextFieldQtd.requestFocus();
        }else if(jTableProdutos.getSelectedColumn() == 3){
            jTextFieldValor.requestFocus();
        } 
    }
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
            java.util.logging.Logger.getLogger(viewCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JComboBox<Object> jComboBoxCategorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTextField jTextFieldDesc;
    private javax.swing.JTextField jTextFieldQtd;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}

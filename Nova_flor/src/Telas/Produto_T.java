/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;
import DAO.ProdutoDAO;
import JavaBeans.Produto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lucas
 */
public class Produto_T extends javax.swing.JFrame {

    /**
     * Creates new form Produto_T
     */
    public int cod;
    //Metodo Listar
     public void Listar(){
        try {
            //1º Executar o Select
            ProdutoDAO dao = new ProdutoDAO();
            
            List<Produto> listaProd = dao.ListarProdutos();
            
            //2ºColocar os dados na tabela
            
            DefaultTableModel modelo = (DefaultTableModel)Tabela_Prod.getModel();
            modelo.setNumRows(0);
            
            for(Produto prod : listaProd){
                modelo.addRow(new Object[]{
                    prod.getCod_prod(),
                    prod.getNome(),
                    prod.getPreco()
                    });
            }
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public Produto_T() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Painel_Cadastro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Nome_prod = new javax.swing.JTextField();
        txt_preco_prod = new javax.swing.JTextField();
        btn_cadastrar_prod = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_limpar = new javax.swing.JButton();
        Painel_Editar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_Prod = new javax.swing.JTable();
        btn_Excluir = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Produtos");

        Painel_Cadastro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Cadastrar Produto");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Nome");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Preço");

        btn_cadastrar_prod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cadastrar_prod.setText("Cadastrar");
        btn_cadastrar_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrar_prodActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_limpar.setText("Limpar dados");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Painel_CadastroLayout = new javax.swing.GroupLayout(Painel_Cadastro);
        Painel_Cadastro.setLayout(Painel_CadastroLayout);
        Painel_CadastroLayout.setHorizontalGroup(
            Painel_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_CadastroLayout.createSequentialGroup()
                .addGroup(Painel_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_CadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Painel_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Painel_CadastroLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_Nome_prod))
                            .addGroup(Painel_CadastroLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Painel_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Painel_CadastroLayout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_cadastrar_prod))
                                    .addComponent(txt_preco_prod)))))
                    .addGroup(Painel_CadastroLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel2)
                        .addGap(0, 109, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_CadastroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_limpar)))
                .addContainerGap())
        );

        Painel_CadastroLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_cadastrar_prod, jButton2});

        Painel_CadastroLayout.setVerticalGroup(
            Painel_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_CadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(btn_limpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Nome_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_preco_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cadastrar_prod)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Painel_Editar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Tabela_Prod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tabela_Prod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Preço"
            }
        ));
        Tabela_Prod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela_ProdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela_Prod);

        btn_Excluir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Excluir.setText("Excluir");
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });

        btn_Editar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Editar.setText("Editar");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Painel_EditarLayout = new javax.swing.GroupLayout(Painel_Editar);
        Painel_Editar.setLayout(Painel_EditarLayout);
        Painel_EditarLayout.setHorizontalGroup(
            Painel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_EditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_EditarLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btn_Excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(btn_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(138, 138, 138)))
                .addContainerGap())
        );
        Painel_EditarLayout.setVerticalGroup(
            Painel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_EditarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Editar)
                    .addComponent(btn_Excluir))
                .addContainerGap(221, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Painel_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Painel_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Painel_Cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrar_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrar_prodActionPerformed

        //Botão Cadastrar Produto

        //Verifica se algum campo esta vazio !
        if(!txt_Nome_prod.getText().isEmpty() || !txt_preco_prod.getText().isEmpty()){
            try {
                //1º Guardar os dados do formulario em um obj Produto

                Produto prod = new Produto();
                prod.setNome(txt_Nome_prod.getText());
                prod.setPreco(Float.parseFloat(txt_preco_prod.getText()));

                //2º passo Criar um prod do tipo DAO
                ProdutoDAO dao = new ProdutoDAO();
                dao.CadastraProduto(prod);

                JOptionPane.showMessageDialog(null,"Cadastro Realizado Com Sucesso");

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null,"Erro Ao Cadastrar ! " +erro);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Algum Campo está vazio Tente de novo ! ");
        }
    }//GEN-LAST:event_btn_cadastrar_prodActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Listar();
    }//GEN-LAST:event_formWindowActivated

    private void Tabela_ProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela_ProdMouseClicked
        // Pegando dados 
        cod = Integer.parseInt(Tabela_Prod.getValueAt(Tabela_Prod.getSelectedRow(), 0).toString());
        
        txt_Nome_prod.setText(Tabela_Prod.getValueAt(Tabela_Prod.getSelectedRow(), 1).toString());
        txt_preco_prod.setText(Tabela_Prod.getValueAt(Tabela_Prod.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_Tabela_ProdMouseClicked

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        // Botão Editar:
        

//Verifica se algum campo esta vazio !
        if(!txt_Nome_prod.getText().isEmpty() || !txt_preco_prod.getText().isEmpty()){
            try {
                //1º Guardar os dados do formulario em um obj Produto

                Produto prod = new Produto();
                prod.setCod_prod(cod);
                prod.setNome(txt_Nome_prod.getText());
                prod.setPreco(Float.parseFloat(txt_preco_prod.getText()));

                //2º passo Criar um prod do tipo DAO
                ProdutoDAO dao = new ProdutoDAO();
                dao.AlterarProduto(prod);

                JOptionPane.showMessageDialog(null,"Alterado Com Sucesso");

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null,"Erro Ao Alterar ! " +erro);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Algum Campo está vazio Tente de novo ! ");
        }
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed
        // Botão Excluir:
        try {
                //1º Guardar os dados do formulario em um obj Produto

                Produto prod = new Produto();
                prod.setCod_prod(cod);
                

                //2º passo Criar um prod do tipo DAO
                ProdutoDAO dao = new ProdutoDAO();
                dao.ExcluirProduto(prod);

                JOptionPane.showMessageDialog(null,"Excluido Com Sucesso");

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null,"Erro Ao Excluir ! " +erro);
            }
    }//GEN-LAST:event_btn_ExcluirActionPerformed

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        // Limpar todos os campos
        txt_Nome_prod.setText(null);
        txt_preco_prod.setText(null);
    }//GEN-LAST:event_btn_limparActionPerformed

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
            java.util.logging.Logger.getLogger(Produto_T.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produto_T.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produto_T.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produto_T.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produto_T().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel_Cadastro;
    private javax.swing.JPanel Painel_Editar;
    private javax.swing.JTable Tabela_Prod;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JButton btn_cadastrar_prod;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_Nome_prod;
    private javax.swing.JTextField txt_preco_prod;
    // End of variables declaration//GEN-END:variables
}

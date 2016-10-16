/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import DAO.ServicoDAO;
import JavaBeans.Servico;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lucas
 */
public class Servico_T extends javax.swing.JFrame {
    public int cod;
    /**
     * Creates new form Servico
     */
    
    public void Listar(){
        try {
            //1º Executar o Select
            ServicoDAO dao = new ServicoDAO();
            
            List<Servico> listaServ = dao.ListarServicos();
            
            //2ºColocar os dados na tabela
            
            DefaultTableModel modelo = (DefaultTableModel)Tabela_Servico.getModel();
            modelo.setNumRows(0);
            
            for(Servico serv : listaServ){
                modelo.addRow(new Object[]{
                    serv.getCod_servico(),
                    serv.getTipo_servico(),
                    serv.getPreco_servico()
                    });
            }
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public Servico_T() {
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
        txt_Nome = new javax.swing.JTextField();
        txt_preco = new javax.swing.JTextField();
        btn_cadastrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_limpar = new javax.swing.JButton();
        Painel_Editar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_Servico = new javax.swing.JTable();
        btn_Excluir = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        menu = new javax.swing.JLabel();
        menu1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Serviços");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Serviços");

        Painel_Cadastro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Cadastrar Serviço");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Nome");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Preço");

        btn_cadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
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
                                .addComponent(txt_Nome))
                            .addGroup(Painel_CadastroLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Painel_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Painel_CadastroLayout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_cadastrar))
                                    .addComponent(txt_preco)))))
                    .addGroup(Painel_CadastroLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel2)
                        .addGap(0, 109, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_CadastroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_limpar)))
                .addContainerGap())
        );
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
                    .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cadastrar)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Painel_Editar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Tabela_Servico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tabela_Servico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Preço"
            }
        ));
        Tabela_Servico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela_ServicoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela_Servico);

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
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(Painel_EditarLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(btn_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Editar)
                .addGap(121, 121, 121))
        );
        Painel_EditarLayout.setVerticalGroup(
            Painel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_EditarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Painel_EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Editar))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        menu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menu.setText("Menu");
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });

        menu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu1.setText("Menu");
        menu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Painel_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Painel_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(458, 458, 458)
                    .addComponent(menu)
                    .addContainerGap(458, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Painel_Cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(239, 239, 239)
                    .addComponent(menu)
                    .addContainerGap(239, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed

        //Botão Cadastrar Produto

        //Verifica se algum campo esta vazio !
        if(!txt_Nome.getText().isEmpty() || !txt_preco.getText().isEmpty()){
            try {
                //1º Guardar os dados do formulario em um obj Produto

                Servico serv = new Servico();
                serv.setTipo_servico(txt_Nome.getText());
                serv.setPreco_servico(Float.parseFloat(txt_preco.getText()));

                //2º passo Criar um prod do tipo DAO
                ServicoDAO dao = new ServicoDAO();
                dao.CadastraServico(serv);

                JOptionPane.showMessageDialog(null,"Cadastro Realizado Com Sucesso");

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null,"Erro Ao Cadastrar ! " +erro);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Algum Campo está vazio Tente de novo ! ");
        }
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        // Limpar todos os campos
        txt_Nome.setText(null);
        txt_preco.setText(null);
    }//GEN-LAST:event_btn_limparActionPerformed

    private void Tabela_ServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela_ServicoMouseClicked
        // Pegando dados
        cod = Integer.parseInt(Tabela_Servico.getValueAt(Tabela_Servico.getSelectedRow(), 0).toString());

        txt_Nome.setText(Tabela_Servico.getValueAt(Tabela_Servico.getSelectedRow(), 1).toString());
        txt_preco.setText(Tabela_Servico.getValueAt(Tabela_Servico.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_Tabela_ServicoMouseClicked

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed
        // Botão Excluir:

        
        if(!txt_Nome.getText().isEmpty() || !txt_preco.getText().isEmpty()){
        int resposta = JOptionPane.showConfirmDialog(null,"Você realmente quer excluir este Serviço ?");

        if(resposta == JOptionPane.YES_OPTION){
            try {
                //1º Guardar os dados do formulario em um obj Produto

                Servico serv = new Servico();
                serv.setCod_servico(cod);

                //2º passo Criar um prod do tipo DAO
                ServicoDAO dao = new ServicoDAO();
                dao.ExcluirServico(serv);

                JOptionPane.showMessageDialog(null,"Excluido Com Sucesso");

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null,"Erro Ao Excluir ! " +erro);
            }
        }
        }
         else
            JOptionPane.showMessageDialog(null,"Selecione algum serviço");
    }//GEN-LAST:event_btn_ExcluirActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        // Botão Editar:

        //Verifica se algum campo esta vazio !
        if(!txt_Nome.getText().isEmpty() || !txt_preco.getText().isEmpty()){
            try {
                //1º Guardar os dados do formulario em um obj Produto

                Servico serv = new Servico();
                serv.setCod_servico(cod);
                serv.setTipo_servico(txt_Nome.getText());
                serv.setPreco_servico(Float.parseFloat(txt_preco.getText()));

                //2º passo Criar um prod do tipo DAO
                ServicoDAO dao = new ServicoDAO();
                dao.AlterarServico(serv);

                JOptionPane.showMessageDialog(null,"Alterado Com Sucesso");

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null,"Erro Ao Alterar ! " +erro);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Selecione o serviço para edita-lo! ");
        }
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Listar();
    }//GEN-LAST:event_formWindowActivated

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        // TODO add your handling code here:
        Menu e = new Menu();
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuMouseClicked

    private void menu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu1MouseClicked
        // TODO add your handling code here:
        Menu e = new Menu();
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu1MouseClicked

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
            java.util.logging.Logger.getLogger(Servico_T.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servico_T.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servico_T.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servico_T.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servico_T().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel_Cadastro;
    private javax.swing.JPanel Painel_Editar;
    private javax.swing.JTable Tabela_Servico;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel menu1;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JTextField txt_preco;
    // End of variables declaration//GEN-END:variables
}

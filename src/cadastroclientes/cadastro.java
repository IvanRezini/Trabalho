/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroclientes;

/**
 *
 * @author Aluno
 */
public class cadastro extends javax.swing.JPanel {

    /**
     * Creates new form cadastro
     */
    public cadastro() {
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

        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        lbTitolo = new javax.swing.JLabel();
        lbNomeEmpresa = new javax.swing.JLabel();
        lbCnpj = new javax.swing.JLabel();
        cpNomeEmpresa = new javax.swing.JTextField();
        cpFormatadoCnpj = new javax.swing.JFormattedTextField();
        lbIscricao = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        cpIscricaoEstadual = new javax.swing.JTextField();
        cpFormatadoData = new javax.swing.JFormattedTextField();
        lbCidade = new javax.swing.JLabel();
        lbEstado = new javax.swing.JLabel();
        cpSelectEstado = new javax.swing.JComboBox<>();
        cpCidade = new javax.swing.JTextField();
        lbCep = new javax.swing.JLabel();
        cpFormatadoCep = new javax.swing.JFormattedTextField();
        lbBairro = new javax.swing.JLabel();
        cpBairro = new javax.swing.JTextField();
        lbEnderecoNumero = new javax.swing.JLabel();
        cpEnderecoNumero = new javax.swing.JTextField();
        lbContatos = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        CpFormatadoTelefone = new javax.swing.JFormattedTextField();
        lbCelularEmpresa = new javax.swing.JLabel();
        cpFormatadoCelularEmpresa = new javax.swing.JFormattedTextField();
        lbEmail = new javax.swing.JLabel();
        cpEmail = new javax.swing.JTextField();
        lbResponsavel = new javax.swing.JLabel();
        lbCpf = new javax.swing.JLabel();
        cpFormatadoCpf = new javax.swing.JFormattedTextField();
        lbRenda = new javax.swing.JLabel();
        cpRenda = new javax.swing.JTextField();
        cpFormatadoCelularResponsavel = new javax.swing.JFormattedTextField();
        lbCelularResponsavel = new javax.swing.JLabel();
        lbLinkFace = new javax.swing.JLabel();
        lbLinkInsta = new javax.swing.JLabel();
        CpLinkFace = new javax.swing.JTextField();
        CpLinkInsta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        jTextField1.setText("jTextField1");

        lbTitolo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTitolo.setText("Cadastre sua empresa aqui");

        lbNomeEmpresa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNomeEmpresa.setText("Nome");

        lbCnpj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbCnpj.setText("CNPJ");

        cpNomeEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpNomeEmpresaActionPerformed(evt);
            }
        });

        lbIscricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbIscricao.setText("Iscriçao estadual");

        lbData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbData.setText("Data");

        lbCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbCidade.setText("Cidade");

        lbEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbEstado.setText("Estado");

        cpSelectEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cpSelectEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cpSelectEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpSelectEstadoActionPerformed(evt);
            }
        });

        lbCep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbCep.setText("Cep");

        lbBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbBairro.setText("Bairro");

        lbEnderecoNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbEnderecoNumero.setText("N°");

        lbContatos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbContatos.setText("Contatos");

        lbTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbTelefone.setText("Telefone");

        lbCelularEmpresa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbCelularEmpresa.setText("Celular");

        lbEmail.setFont(lbEmail.getFont().deriveFont(lbEmail.getFont().getSize()+3f));
        lbEmail.setText("Email");

        lbResponsavel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbResponsavel.setText("Responsavel");

        lbCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbCpf.setText("Cpf");

        cpFormatadoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpFormatadoCpfActionPerformed(evt);
            }
        });

        lbRenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbRenda.setText("Renda");

        lbCelularResponsavel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbCelularResponsavel.setText("Celular");

        lbLinkFace.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbLinkFace.setText("Link Facebook");

        lbLinkInsta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbLinkInsta.setText("Link Instagram");

        jLabel1.setText("IvanRezini");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbIscricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cpIscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpFormatadoData, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbResponsavel)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbNomeEmpresa)
                            .addGap(18, 18, 18)
                            .addComponent(cpNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(57, 57, 57)
                            .addComponent(lbCnpj)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cpFormatadoCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbContatos)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbCpf)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cpFormatadoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbCelularResponsavel)
                                            .addGap(18, 18, 18)
                                            .addComponent(cpFormatadoCelularResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(65, 65, 65)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbLinkFace)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbRenda)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cpRenda, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(CpLinkFace, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(lbLinkInsta))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(CpLinkInsta, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addComponent(lbCep)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cpFormatadoCep, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbEstado)
                                    .addGap(18, 18, 18)
                                    .addComponent(cpSelectEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbCidade)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cpCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lbCelularEmpresa)
                                                .addComponent(lbBairro))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cpBairro)
                                                .addComponent(cpFormatadoCelularEmpresa)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbTelefone)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(CpFormatadoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbEmail)
                                    .addGap(62, 62, 62))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lbEnderecoNumero)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addComponent(cpEnderecoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(lbTitolo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTitolo)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNomeEmpresa)
                    .addComponent(cpFormatadoCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCnpj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIscricao)
                    .addComponent(cpFormatadoData, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbData)
                    .addComponent(cpIscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCidade)
                    .addComponent(lbEstado)
                    .addComponent(cpSelectEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCep)
                    .addComponent(cpFormatadoCep, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbBairro)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpEnderecoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEnderecoNumero))))
                .addGap(13, 13, 13)
                .addComponent(lbContatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefone)
                    .addComponent(CpFormatadoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCelularEmpresa)
                    .addComponent(cpFormatadoCelularEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail)
                    .addComponent(cpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(lbResponsavel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCpf)
                    .addComponent(cpFormatadoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRenda)
                    .addComponent(cpRenda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLinkFace)
                    .addComponent(lbLinkInsta))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CpLinkFace, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CpLinkInsta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpFormatadoCelularResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCelularResponsavel))))
                .addGap(121, 121, 121)
                .addComponent(jLabel1)
                .addContainerGap(7183, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cpNomeEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpNomeEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpNomeEmpresaActionPerformed

    private void cpSelectEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpSelectEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpSelectEstadoActionPerformed

    private void cpFormatadoCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpFormatadoCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpFormatadoCpfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField CpFormatadoTelefone;
    private javax.swing.JTextField CpLinkFace;
    private javax.swing.JTextField CpLinkInsta;
    private javax.swing.JTextField cpBairro;
    private javax.swing.JTextField cpCidade;
    private javax.swing.JTextField cpEmail;
    private javax.swing.JTextField cpEnderecoNumero;
    private javax.swing.JFormattedTextField cpFormatadoCelularEmpresa;
    private javax.swing.JFormattedTextField cpFormatadoCelularResponsavel;
    private javax.swing.JFormattedTextField cpFormatadoCep;
    private javax.swing.JFormattedTextField cpFormatadoCnpj;
    private javax.swing.JFormattedTextField cpFormatadoCpf;
    private javax.swing.JFormattedTextField cpFormatadoData;
    private javax.swing.JTextField cpIscricaoEstadual;
    private javax.swing.JTextField cpNomeEmpresa;
    private javax.swing.JTextField cpRenda;
    private javax.swing.JComboBox<String> cpSelectEstado;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCelularEmpresa;
    private javax.swing.JLabel lbCelularResponsavel;
    private javax.swing.JLabel lbCep;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbCnpj;
    private javax.swing.JLabel lbContatos;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEnderecoNumero;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbIscricao;
    private javax.swing.JLabel lbLinkFace;
    private javax.swing.JLabel lbLinkInsta;
    private javax.swing.JLabel lbNomeEmpresa;
    private javax.swing.JLabel lbRenda;
    private javax.swing.JLabel lbResponsavel;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbTitolo;
    // End of variables declaration//GEN-END:variables
}

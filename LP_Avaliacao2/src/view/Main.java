/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.AlunoDAO;
import javax.swing.JOptionPane;
import model.Aluno;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fatec
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        PopulaCombo();
    }

    public void PopulaCombo() {
        comboAluno.removeAllItems();
        comboAluno.addItem("Novo Aluno");
        new AlunoDAO().getAluno(comboAluno);
    }

    public void Limpar() {
        TextCPF.setText("");
        TextNome.setText("");
        TextData.setText("");
        TextPeso.setText("");
        TextAltura.setText("");
        TextIMC.setText("");
    }
    
    public Aluno getText()
    {
        Aluno a = new Aluno(TextCPF.getText(), TextNome.getText(), TextData.getText(), Integer.valueOf(TextPeso.getText()), Integer.valueOf(TextAltura.getText()));
        return a;
    }
    
    public void GravarDados()throws IOException
    {
        File f = new File("IMcs.txt");
        if (!f.exists()) {
            f.createNewFile();
        }
        Aluno a = getText();
        String dados = "Data do cálculo: " + java.time.LocalDate.now() + "\n"; 
        dados += "CPF: " + a.getCPF() + "\n";
        dados += "Nome: " + a.getNome() + "\n";
        dados += "IMC: " + a.IMC() + "\n";
        dados += "Interpretação do IMC: " + a.IMC_Interpretacao() + "\n";
        dados += "===========================================================";
        FileWriter fw = new FileWriter(f, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(dados);
        bw.newLine();
        bw.close();
         JOptionPane.showMessageDialog(null,"Dados gravados com sucesso!");
        //System.out.print(dados);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboAluno = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextCPF = new javax.swing.JTextField();
        TextNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextData = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextPeso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TextAltura = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TextIMC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnConfirma = new javax.swing.JButton();
        btnGravarIMC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboAluno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAlunoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Selecione o Aluno");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("CPF");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nome");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Data Nascimento");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Peso (KG)");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Altura (cm)");

        TextIMC.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("IMC");

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnConfirma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConfirma.setText("Cadastrar");
        btnConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaActionPerformed(evt);
            }
        });

        btnGravarIMC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGravarIMC.setText("Gravar IMC");
        btnGravarIMC.setActionCommand("");
        btnGravarIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarIMCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(TextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(TextData, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(TextPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(TextAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnGravarIMC))
                            .addComponent(jLabel7)
                            .addComponent(TextIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextData, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGravarIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAlunoActionPerformed
        // TODO add your handling code here:
        Limpar();
        btnExcluir.setEnabled(false);
        btnGravarIMC.setEnabled(false);
        btnConfirma.setText("Cadastrar");
        if (comboAluno.getSelectedIndex() > 0) {
            Aluno a = new Aluno("", comboAluno.getSelectedItem().toString(), "", 0, 0);
            new AlunoDAO().getAluno(a);
            
            TextCPF.setText(a.getCPF());
            TextNome.setText(a.getNome());
            TextData.setText(a.getData());
            TextPeso.setText(String.valueOf(a.getPeso()) );
            TextAltura.setText(String.valueOf(a.getAltura()));
            TextIMC.setText(String.valueOf(a.IMC()) );
            
            btnExcluir.setEnabled(true);
            btnGravarIMC.setEnabled(true);
            btnConfirma.setText("Atualizar");
        }
    }//GEN-LAST:event_comboAlunoActionPerformed

    private void btnConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaActionPerformed
        // TODO add your handling code here:
        Aluno a = getText();//new Aluno(TextCPF.getText(), TextNome.getText(), TextData.getText(), Integer.valueOf(TextPeso.getText()), Integer.valueOf(TextAltura.getText()));
        if(btnConfirma.getText() == "Cadastrar")
        {
            new AlunoDAO().setAluno(a);
            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");
            PopulaCombo();
            comboAluno.setSelectedItem(a.getNome());
        }
        else
        {
            Aluno b = getText();
            b.setNome(comboAluno.getSelectedItem().toString());
            new AlunoDAO().getAluno(b);
            a.setId(b.getId());
            new AlunoDAO().UpdateAluno(a);
            JOptionPane.showMessageDialog(null,"Dados Atualizados com sucesso!");
            PopulaCombo();
            comboAluno.setSelectedItem(a.getNome());
        }
    }//GEN-LAST:event_btnConfirmaActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        Aluno a = getText();
        new AlunoDAO().getAluno(a);
        new AlunoDAO().deleteAluno(a);
        JOptionPane.showMessageDialog(null,"Deletado com sucesso!");
        PopulaCombo();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnGravarIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarIMCActionPerformed
        try {
            // TODO add your handling code here:
            GravarDados();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao gravar os dados!");
        }
    }//GEN-LAST:event_btnGravarIMCActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextAltura;
    private javax.swing.JTextField TextCPF;
    private javax.swing.JTextField TextData;
    private javax.swing.JTextField TextIMC;
    private javax.swing.JTextField TextNome;
    private javax.swing.JTextField TextPeso;
    private javax.swing.JButton btnConfirma;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravarIMC;
    private javax.swing.JComboBox<String> comboAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}

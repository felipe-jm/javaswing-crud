package view;

import dao.MedicineDAO;
import javax.swing.JOptionPane;
import model.Medicine;
import table.MedicineTableModel;

public class MedicineView extends javax.swing.JFrame {

    // Instancia objeto do nosso Model
    Medicine medicine = new Medicine();
    // Instancia objeto de acesso aos dados do nosso model
    MedicineDAO medicineDAO = new MedicineDAO();

    // metodo construtor da View
    public MedicineView() {
        // inicializa os componentes visuais, adiciona listeners
        initComponents();
        // define tamanho da view
        setSize(945,530);
        // define posição relativa  a nulo. Isto impede a view de renderizar
        // no canto superior esquerdo da tela.
        setLocationRelativeTo(null);
        // Instancia um objeto de acesso ao Model Medicines, executa a listagem
        // de objetos e retorna para oconstrutor de MedicineTableModel, que é
        // renderizados na tabela
        tbMedicines.setModel(new MedicineTableModel(new MedicineDAO().list()));
        // desabilita botão de delete
        btnDelete.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfCode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfDescription = new javax.swing.JTextField();
        tfComposition = new javax.swing.JTextField();
        tfPrice = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMedicines = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        tfCode.setEditable(false);
        tfCode.setBackground(new java.awt.Color(204, 204, 204));
        tfCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodeActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Medicine");
        setResizable(false);

        jLabel1.setText("Name");

        jLabel2.setText("Description");

        jLabel3.setText("Composition");

        jLabel4.setText("Price");

        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        tbMedicines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbMedicines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMedicinesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbMedicines);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Search by Name:");

        tfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchActionPerformed(evt);
            }
        });
        tfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSearchKeyPressed(evt);
            }
        });

        jLabel6.setText("Code");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(100, 100, 100)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfComposition, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel6))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tfComposition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete)
                    .addComponent(btnSave)
                    .addComponent(btnClear))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    // Cria ou atualizado um remédio
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // se o nome ou preço estiver vazio, entao
        if (tfName.getText().isEmpty() || tfPrice.getText().isEmpty()) {
            // exibe um popup para pedir nome e preço
            JOptionPane.showMessageDialog(null, "Please enter the Name and Price fields", "Warning!", JOptionPane.WARNING_MESSAGE);
        } else {
            // Se não há nenhum código no TextField de código então será criado um novo remédio
            if (tfCode.getText().isEmpty()) {
                // Criar novo
                medicine.setName(tfName.getText());
                medicine.setDescription(tfDescription.getText());
                medicine.setComposition(tfComposition.getText());
                medicine.setPrice(Double.parseDouble(tfPrice.getText()));
                medicineDAO.create(medicine);
            } else {
                // Atualizar existente
                medicine.setCode(Integer.parseInt(tfCode.getText()));
                medicine.setName(tfName.getText());
                medicine.setDescription(tfDescription.getText());
                medicine.setComposition(tfComposition.getText());
                medicine.setPrice(Double.parseDouble(tfPrice.getText()));
                medicineDAO.update(medicine);
            }    
            // atualiza tabela de medicines na tela e limpa campos
            tbMedicines.setModel(new MedicineTableModel(new MedicineDAO().list()));
            tfCode.setText(null);
            tfName.setText(null);
            tfDescription.setText(null);
            tfComposition.setText(null);
            tfPrice.setText(null);
            tfSearch.setText(null);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tfCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodeActionPerformed

    // Preenche os inputs com os valores do remédio selecionado na tabela
    private void tbMedicinesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMedicinesMouseClicked
        tfCode.setText(tbMedicines.getValueAt(tbMedicines.getSelectedRow(), MedicineTableModel.MEDICINE_CODE_COL).toString());
        tfName.setText(tbMedicines.getValueAt(tbMedicines.getSelectedRow(), MedicineTableModel.MEDICINE_NAME_COL).toString());
        tfDescription.setText(tbMedicines.getValueAt(tbMedicines.getSelectedRow(), MedicineTableModel.MEDICINE_DESCRIPTION_COL).toString());
        tfComposition.setText(tbMedicines.getValueAt(tbMedicines.getSelectedRow(), MedicineTableModel.MEDICINE_COMPOSITION_COL).toString());
        tfPrice.setText(tbMedicines.getValueAt(tbMedicines.getSelectedRow(), MedicineTableModel.MEDICINE_PRICE_COL).toString());
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_tbMedicinesMouseClicked

    // Limpa todos os campos
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        tbMedicines.setModel(new MedicineTableModel(new MedicineDAO().list()));
        tfCode.setText(null);
        tfName.setText(null);
        tfDescription.setText(null);
        tfComposition.setText(null);
        tfPrice.setText(null);
        tfSearch.setText(null);
        btnDelete.setEnabled(false);
    }//GEN-LAST:event_btnClearActionPerformed

    // Deleta um remédio selecionado
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // Aciona uma janela para confirmar a exclusão do remédio
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure?", "Medicine - Deletion", JOptionPane.YES_NO_OPTION);
        if (choice == 0) {
            // Se a exclusão foi confirmada o remédio é excluído
            int code = Integer.parseInt(tfCode.getText());
            medicineDAO.delete(code);
            tbMedicines.setModel(new MedicineTableModel(new MedicineDAO().list()));
            tfCode.setText(null);
            tfName.setText(null);
            tfDescription.setText(null);
            tfComposition.setText(null);
            tfPrice.setText(null);
            tfSearch.setText(null);
            btnDelete.setEnabled(false);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSearchActionPerformed

    // Preenche a tabela de acordo com os resultados da pesquisa
    private void tfSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyPressed
        String search = tfSearch.getText();
        tbMedicines.setModel(new MedicineTableModel(new MedicineDAO().searchByName(search)));
    }//GEN-LAST:event_tfSearchKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbMedicines;
    private javax.swing.JTextField tfCode;
    private javax.swing.JTextField tfComposition;
    private javax.swing.JTextField tfDescription;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPrice;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}

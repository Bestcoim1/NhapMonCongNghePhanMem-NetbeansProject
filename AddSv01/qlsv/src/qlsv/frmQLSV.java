package qlsv;

import javax.swing.JOptionPane;

public class frmQLSV extends javax.swing.JFrame {


    public frmQLSV() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void clearForm() {

        txtMaSV.setText("");
        txtHodem.setText("");
        txtTenSV.setText("");
        txtTelSV.setText("");
        txtEmailSV.setText("");

        txtMaSV.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        txtHodem = new javax.swing.JTextField();
        txtTelSV = new javax.swing.JTextField();
        txtEmailSV = new javax.swing.JTextField();
        txtTenSV = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý sinh viên");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ SINH VIÊN");

        jLabel2.setText("Mã SV");

        jLabel3.setText("Họ đệm");

        jLabel4.setText("Số điện thoại");

        jLabel5.setText("Email");

        jLabel6.setText("Tên SV");

        txtHodem.addActionListener(this::txtHodemActionPerformed);

        txtEmailSV.addActionListener(this::txtEmailSVActionPerformed);

        btnAdd.setText("THÊM SINH VIÊN");
        btnAdd.addActionListener(this::btnAddActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(435, 435, 435))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelSV, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHodem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addComponent(txtEmailSV, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(144, 144, 144))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(txtHodem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmailSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailSVActionPerformed

    private void txtHodemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHodemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHodemActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    String maSVRaw = txtMaSV.getText().trim();
    String hoDem = txtHodem.getText().trim();
    String tenSV = txtTenSV.getText().trim();
    String telSV = txtTelSV.getText().trim();
    String emailSV = txtEmailSV.getText().trim();

    if (maSVRaw.isEmpty()
            || hoDem.isEmpty()
            || tenSV.isEmpty()
            || telSV.isEmpty()
            || emailSV.isEmpty()) {

        JOptionPane.showMessageDialog(
                this,
                "Vui lòng nhập đầy đủ thông tin sinh viên!"
        );

        return;
    }
if (!maSVRaw.matches("\\d{1,3}")) {

    JOptionPane.showMessageDialog(
            this,
            "Mã sinh viên chỉ được nhập số từ 1 đến 999!"
    );

    txtMaSV.requestFocus();
    return;
}    
int maSo = Integer.parseInt(maSVRaw);
if (maSo == 0) {

    JOptionPane.showMessageDialog(
            this,
            "Mã sinh viên phải từ 1 đến 999!"
    );

    txtMaSV.requestFocus();
    return;
}
if (!hoDem.matches("[\\p{L}\\s]+")) {

    JOptionPane.showMessageDialog(
            this,
            "Họ đệm chỉ được chứa chữ cái!"
    );

    txtHodem.requestFocus();
    return;
}
if (!tenSV.matches("[\\p{L}\\s]+")) {

    JOptionPane.showMessageDialog(
            this,
            "Tên sinh viên chỉ được chứa chữ cái!"
    );

    txtTenSV.requestFocus();
    return;
}
if (!telSV.matches("\\d+")) {

    JOptionPane.showMessageDialog(
            this,
            "Số điện thoại chỉ được chứa chữ số!"
    );

    txtTelSV.requestFocus();
    return;
}
if (!emailSV.matches(
        "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {

    JOptionPane.showMessageDialog(this, """
                                        Email kh\u00f4ng \u0111\u00fang \u0111\u1ecbnh d\u1ea1ng!
                                        V\u00ed d\u1ee5: sinhvien@gmail.com""");

    txtEmailSV.requestFocus();
    return;
}
    SV sv = new SV(
            maSVRaw,
            hoDem,
            tenSV,
            telSV,
            emailSV
    );

    DAOSV dao = new DAOSV();
        int result = dao.addSV(sv);

    // Bước 6: Xử lý kết quả trả về
    if (result == 1) {

        JOptionPane.showMessageDialog(
                this,
                "Thêm sinh viên thành công!"
        );

        clearForm();

    } else if (result == 0) {

        JOptionPane.showMessageDialog(
                this,
                "Mã sinh viên đã tồn tại!"
        );

    } else {

        JOptionPane.showMessageDialog(this, """
                                            Kh\u00f4ng th\u1ec3 th\u00eam sinh vi\u00ean.
                                            Vui l\u00f2ng ki\u1ec3m tra k\u1ebft n\u1ed1i c\u01a1 s\u1edf d\u1eef li\u1ec7u!""");
    } 
    }//GEN-LAST:event_btnAddActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new frmQLSV().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtEmailSV;
    private javax.swing.JTextField txtHodem;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtTelSV;
    private javax.swing.JTextField txtTenSV;
    // End of variables declaration//GEN-END:variables
}

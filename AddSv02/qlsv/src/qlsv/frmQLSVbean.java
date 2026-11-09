package qlsv;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class frmQLSVbean extends javax.swing.JFrame {
    private final String url =
        "jdbc:mysql://localhost:3306/qlsv";

private final String username = "root";
private final String password = "truong10012006";
    private Connection getConnection()
        throws ClassNotFoundException, SQLException {

    Class.forName("com.mysql.cj.jdbc.Driver");

    return DriverManager.getConnection(
            url,
            username,
            password
    );
}
    public frmQLSVbean() {
     initComponents();

    scrSV.setVisible(false);

    pack();
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
    
   private void loadTable() {

    DefaultTableModel model =
            (DefaultTableModel) tblSV.getModel();

    model.setRowCount(0);

    String sql =
            "SELECT masv, hodem, tensv, telsv, emailsv "
            + "FROM sv ORDER BY masv";

    int stt = 1;

    try (
        Connection conn = getConnection();
        PreparedStatement ps =
                conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery()
    ) {

        while (rs.next()) {

            SV sv = new SV(
                    rs.getString("masv"),
                    rs.getString("hodem"),
                    rs.getString("tensv"),
                    rs.getString("telsv"),
                    rs.getString("emailsv")
            );

            model.addRow(new Object[]{
                stt,
                sv.getMaSV(),
                sv.getHodem(),
                sv.getTenSV(),
                sv.getTelSV(),
                sv.getEmailSV()
            });

            stt++;
        }

    } catch (ClassNotFoundException | SQLException e) {

        e.printStackTrace();

        JOptionPane.showMessageDialog(
                this,
                "Không thể tải danh sách sinh viên!"
        );
    }
}
    private void refreshTableIfVisible() {

    if (scrSV.isVisible()) {
        loadTable();
    }
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
        btnSearch = new javax.swing.JButton();
        scrSV = new javax.swing.JScrollPane();
        tblSV = new javax.swing.JTable();

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

        btnAdd.setText("LƯU THÔNG TIN SINH VIÊN");
        btnAdd.addActionListener(this::btnAddActionPerformed);

        btnSearch.setText("TRA CỨU THÔNG TIN SINH VIÊN");
        btnSearch.addActionListener(this::btnSearchActionPerformed);

        tblSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã SV", "Họ Đệm", "Tên SV", "SĐT", "Email"
            }
        ));
        scrSV.setViewportView(tblSV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHodem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelSV, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailSV, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrSV, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch)))
                        .addGap(11, 11, 11)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrSV, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
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


    // 1. Lấy dữ liệu từ giao diện
    String maSVRaw = txtMaSV.getText().trim();
    String hoDem = txtHodem.getText().trim();
    String tenSV = txtTenSV.getText().trim();
    String telSV = txtTelSV.getText().trim();
    String emailSV = txtEmailSV.getText().trim();

    // 2. Kiểm tra các trường bắt buộc
    if (maSVRaw.isEmpty()
            || hoDem.isEmpty()
            || tenSV.isEmpty()) {

        JOptionPane.showMessageDialog(
                this,
                "Thiếu thông tin Mã, Họ đệm hoặc Tên sinh viên!"
        );

        return;
    }

    // 3. Mã SV phải là số từ 1 đến 3 chữ số
    if (!maSVRaw.matches("\\d{1,3}")) {

        JOptionPane.showMessageDialog(
                this,
                "Mã sinh viên chỉ được nhập số từ 1 đến 999!"
        );

        txtMaSV.requestFocus();
        return;
    }

    // 4. Chuyển mã sang số
    int maSo = Integer.parseInt(maSVRaw);

    if (maSo == 0) {

        JOptionPane.showMessageDialog(
                this,
                "Mã sinh viên phải từ 1 đến 999!"
        );

        txtMaSV.requestFocus();
        return;
    }

    // 5. Chuẩn hóa mã: 13 -> SV013
    String maSV = String.format("SV%03d", maSo);

    // 6. Kiểm tra họ đệm
    if (!hoDem.matches("[\\p{L}\\s]+")) {

        JOptionPane.showMessageDialog(
                this,
                "Họ đệm chỉ được chứa chữ cái!"
        );

        txtHodem.requestFocus();
        return;
    }

    // 7. Kiểm tra tên
    if (!tenSV.matches("[\\p{L}\\s]+")) {

        JOptionPane.showMessageDialog(
                this,
                "Tên sinh viên chỉ được chứa chữ cái!"
        );

        txtTenSV.requestFocus();
        return;
    }

    // 8. Kiểm tra SĐT nếu người dùng có nhập
    if (!telSV.isEmpty()
            && !telSV.matches("\\d+")) {

        JOptionPane.showMessageDialog(
                this,
                "Số điện thoại chỉ được chứa chữ số!"
        );

        txtTelSV.requestFocus();
        return;
    }

    // 9. Kiểm tra email nếu người dùng có nhập
    if (!emailSV.isEmpty()
            && !emailSV.matches(
                    "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {

        JOptionPane.showMessageDialog(
                this,
                "Email không đúng định dạng!\n"
                + "Ví dụ: sinhvien@gmail.com"
        );

        txtEmailSV.requestFocus();
        return;
    }

    // 10. Đóng gói dữ liệu vào thực thể SV
    SV sv;
        sv = new SV(
                maSV,
                hoDem,
                tenSV,
                telSV,
                emailSV
        );
    String sqlCheck =
        "SELECT 1 FROM sv WHERE masv = ?";

    String sqlInsert =
        "INSERT INTO sv "
        + "(masv, hodem, tensv, telsv, emailsv) "
        + "VALUES (?, ?, ?, ?, ?)";

    String sqlUpdate =
        "UPDATE sv SET "
        + "hodem = ?, "
        + "tensv = ?, "
        + "telsv = ?, "
        + "emailsv = ? "
        + "WHERE masv = ?";
        try (
    Connection conn = getConnection();
    PreparedStatement psCheck =
            conn.prepareStatement(sqlCheck)
) {

    psCheck.setString(1, sv.getMaSV());

    try (ResultSet rs = psCheck.executeQuery()) {

        if (rs.next()) {
            try (
    PreparedStatement psUpdate =
            conn.prepareStatement(sqlUpdate)
) {

    psUpdate.setString(1, sv.getHodem());
    psUpdate.setString(2, sv.getTenSV());
    psUpdate.setString(3, sv.getTelSV());
    psUpdate.setString(4, sv.getEmailSV());
    psUpdate.setString(5, sv.getMaSV());

    int rows = psUpdate.executeUpdate();

    if (rows > 0) {

        JOptionPane.showMessageDialog(
                this,
                "Cập nhật thông tin sinh viên thành công!"
        );

        refreshTableIfVisible();
        clearForm();
    }
}

            // UPDATE

        } else {
            try (
    PreparedStatement psInsert =
            conn.prepareStatement(sqlInsert)
) {

    psInsert.setString(1, sv.getMaSV());
    psInsert.setString(2, sv.getHodem());
    psInsert.setString(3, sv.getTenSV());
    psInsert.setString(4, sv.getTelSV());
    psInsert.setString(5, sv.getEmailSV());

    int rows = psInsert.executeUpdate();

    if (rows > 0) {

        JOptionPane.showMessageDialog(
                this,
                "Thêm sinh viên thành công!"
        );

        refreshTableIfVisible();
        clearForm();
    }
}

            // INSERT
        }
    }

} catch (ClassNotFoundException | SQLException e) {


    JOptionPane.showMessageDialog(
            this,
            "Không thể lưu thông tin sinh viên.\n"
            + "Vui lòng kiểm tra kết nối cơ sở dữ liệu!"
    );
}
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        loadTable();
        scrSV.setVisible(true);
   
    getContentPane().revalidate();
    getContentPane().repaint();

    pack();
    setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSearchActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new frmQLSVbean().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane scrSV;
    private javax.swing.JTable tblSV;
    private javax.swing.JTextField txtEmailSV;
    private javax.swing.JTextField txtHodem;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtTelSV;
    private javax.swing.JTextField txtTenSV;
    // End of variables declaration//GEN-END:variables
}
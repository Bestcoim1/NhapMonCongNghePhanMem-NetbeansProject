package qlsv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOSV {

    private final String url =
            "jdbc:mysql://localhost:3306/qlsv";

    private final String username = "root";

    private final String password =
            "truong10012006";


    private Connection getConnection()
            throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection(
                url,
                username,
                password
        );
    }

    public List<SV> getAllSV() {

    List<SV> danhSach = new ArrayList<>();

    String sql = "SELECT * FROM sv";

    try (
        Connection conn = getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery()
    ) {

        while (rs.next()) {

            String maSV = rs.getString("masv");
            String hoDem = rs.getString("hodem");
            String tenSV = rs.getString("tensv");
            String telSV = rs.getString("telsv");
            String emailSV = rs.getString("emailsv");

            SV sv = new SV(
                    maSV,
                    hoDem,
                    tenSV,
                    telSV,
                    emailSV
            );

            danhSach.add(sv);
        }

    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }

    return danhSach;
}

    public int saveSV(SV sv) {

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

                // Mã SV đã tồn tại → UPDATE

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
                        return 2;
                    }
                }

            } else {

                // Mã SV chưa tồn tại → INSERT

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
                        return 1;
                    }
                }
            }
        }

    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }
    return -1;
}
}
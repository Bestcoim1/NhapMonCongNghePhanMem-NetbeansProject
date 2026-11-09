package qlsv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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


    public int addSV(SV sv) {

        String sqlCheck =
                "SELECT 1 FROM sv WHERE masv = ?";

        String sqlInsert =
                "INSERT INTO sv "
                + "(masv, hodem, tensv, telsv, emailsv) "
                + "VALUES (?, ?, ?, ?, ?)";

        try (
            Connection conn = getConnection();
            PreparedStatement psCheck =
                    conn.prepareStatement(sqlCheck)
        ) {

            psCheck.setString(1, sv.getMaSV());

            try (ResultSet rs = psCheck.executeQuery()) {

                if (rs.next()) {
                    return 0;
                }
            }

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

        } catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();
        }

        return -1;
    }
}
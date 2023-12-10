package db;

import java.sql.*;


public class DBConnect {
    String url = "jdbc:mysql://localhost:3306/qlda";
    String user = "root";
    String pass = "";
    Connection connect;

    static DBConnect install;

    //kết nối với MySQL
    private DBConnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static DBConnect getInstance() {
        if (install == null) install = new DBConnect();
        return install;
    }

    //tạo đối tượng statement
    public Statement getStatement() {
        if (connect == null) return null;
        try {
            return connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            return null;
        }
    }

    private void connect() throws SQLException, ClassNotFoundException {
        if (connect == null || connect.isClosed()) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(url, user, pass);
        }
    }

    public Connection get() {
        try {
            connect();
            return connect;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) throws SQLException {
//        Statement statement = DBConnect.getInstance().getStatement();
//        if(statement != null)
//            try {
//                ResultSet rs = statement.executeQuery("select * from user");
//                rs.last();
//                System.out.println(rs.getRow());
//                rs.beforeFirst();
//                while (rs.next()) {
//                    System.out.println(rs.getInt(1) + " -- " + rs.getString(2));
//                }
//            } catch (SQLException e) {
//                throw new RuntimeException(e);
//            }
//        else {
//            System.out.println("no connection");
//        }


        // Chuẩn bị và thực thi stored procedure
        CallableStatement callableStatement = getInstance().get().prepareCall("{call getAllUser()}", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//
//        // Đặt các tham số cho stored procedure
//        callableStatement.setString(1, "tham_so_1");
//        callableStatement.setInt(2, 123);
        callableStatement.execute();
        ResultSet rs = callableStatement.getResultSet();
        rs.last();
        System.out.println(rs.getRow());
        rs.beforeFirst();
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " -- " + rs.getString(2));
        }

        System.out.println("Stored procedure đã được thực hiện thành công.");
    }
}

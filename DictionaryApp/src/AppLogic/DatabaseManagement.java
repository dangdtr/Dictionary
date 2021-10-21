package AppLogic;

import java.sql.*;

public class DatabaseManagement {

    private static Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:res/defaul/data.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    private static Connection connectForUser() {
        // SQLite connection string
        String url = "jdbc:sqlite:res/modify/data.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static boolean checkWord(String word) {
        String sqlSearch = "SELECT * FROM av WHERE word LIKE ?";

        try {
            Connection conn = connectForUser();

            PreparedStatement ps  = conn.prepareStatement(sqlSearch);
            ps.setString(1, word);
            ResultSet rs = ps.executeQuery();
            String res = "";

            while (rs.next()) {
                String meaning = rs.getString("word");
                res = meaning;
            }
            if (res.isEmpty()) return false;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }
    public void dictionarySearcherList(String keyWord){
        String sqlSearch = "SELECT word FROM av WHERE word LIKE ?";

        try {
            Connection conn = connect();

            PreparedStatement ps  = conn.prepareStatement(sqlSearch);
            ps.setString(1,keyWord + "%");
            ResultSet rs    = ps.executeQuery();


            while (rs.next()) {
                String meaning = rs.getString("mean");

                System.out.println(rs.getString("word"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public void dictionarySearcher(String word){
        String sqlSearch = "SELECT * FROM av WHERE word LIKE ?";

        try {
            Connection conn = connectForUser();

            PreparedStatement ps  = conn.prepareStatement(sqlSearch);
            ps.setString(1, word);
            ResultSet rs = ps.executeQuery();


            while (rs.next()) {
                String meaning = rs.getString("mean");

                System.out.println(rs.getString("word") +  "\r\n\t" +
                        rs.getString("pro") + "\t" + rs.getString("mean"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void insertWord(String word, String pro, String mean) {
        String sqlInsert = "INSERT INTO av (word, pro, mean) VALUES (?, ?, ?)";

        try {
            Connection conn = connectForUser();
            PreparedStatement ps  = conn.prepareStatement(sqlInsert);
            ps.setString(1,word);
            ps.setString(2,pro);
            ps.setString(3,mean);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void removeWord(String word) {
        String sqlRemove = "DELETE FROM av WHERE word = ?";

        try {
            Connection conn = connectForUser();
            PreparedStatement ps  = conn.prepareStatement(sqlRemove);

            ps.setString(1,word);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     *
     * @param word Sửa từ nào.
     * @param pro Sửa cai gi.
     * @param mean Su cai gi.
     */
    public static void editWord(String word, String pro, String mean) {
        //Vì cái db set là NOT NULL nên
        //Khi chuỗi edit nào rỗng nó vi phạm ràng buộc NOT NULL của các cột
        //SQLite sẽ khôi phục -> không thực  hiện

        String sqlEdit = "REPLACE INTO av (word, pro, mean) VALUES(?, ?, ?)";

        try {
            Connection conn = connectForUser();
            PreparedStatement ps  = conn.prepareStatement(sqlEdit);

            ps.setString(1,word);
            ps.setString(2,pro);
            ps.setString(3,mean);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DatabaseManagement app = new DatabaseManagement();
        app.dictionarySearcher("cat");
        app.editWord("cat", "woof", "yeu");
        app.insertWord("cattt", "meow", "ghet cho");
        app.dictionarySearcher("cat");
        app.dictionarySearcher("cattt");
        if (checkWord("dangnhat")) System.out.println("co");
        else System.out.println("ko");
    }
}
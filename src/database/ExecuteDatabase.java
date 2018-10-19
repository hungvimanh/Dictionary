package database;

import com.app.Application;
import static com.app.Application.words;
import java.sql.Statement;
import com.object.Word;
import java.sql.SQLException;

public class ExecuteDatabase {

    AcessDatabase acessDatabase = new AcessDatabase();

    public String maxId() {
        String id = "'" + String.valueOf(Application.words.get(words.size() - 1).getWord_id() + 1) + "'";
        return id;
    }

    public boolean deleteElement(String word) {
        try {
            word = "'" + word + "'";
            Statement stmt = AcessDatabase.collectionDatabase().createStatement();
            stmt.executeUpdate("delete from data where word = " + word);
            stmt.close();
            AcessDatabase.collectionDatabase().close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean updateElement(int id, String word, String detail) {
        try {
            Statement stmt = AcessDatabase.collectionDatabase().createStatement();

            String id1 = "'" + id + "'";
            String word1 = "'" + word + "'";
            String detail1 = "'" + detail + "'";
            stmt.executeUpdate("UPDATE data SET word = " + word1 + " where idx = " + id1);
            stmt.executeUpdate("UPDATE data SET detail = " + detail1 + " where idx = " + id1);
            stmt.close();
            AcessDatabase.collectionDatabase().close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean insertElement(Word dictionary) {
        try {
            Statement stmt = AcessDatabase.collectionDatabase().createStatement();
            String word = "'" + dictionary.getWord_taget() + "'";
            String detail = "'" + dictionary.getWord_explain() + "'";
            String id = maxId();
            stmt.executeUpdate("insert into data values (" + id + "," + word + "," + detail + ")");
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}

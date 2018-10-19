package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.object.Word;
import java.util.Collections;
import java.util.Comparator;

public class AcessDatabase {
    
    public static Connection collectionDatabase() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:data/database.db");
        return con;
    }

    public static ArrayList<Word> readDatabase() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        ArrayList<Word> words = new ArrayList<>();
        Statement state = collectionDatabase().createStatement();
        String sql = "select * from data;";
        ResultSet rs = state.executeQuery(sql);
        while (rs.next()) {
            Word dict = new Word(rs.getInt(1), rs.getString(2), rs.getString(3));
            words.add(dict);
        }
        Collections.sort(words, new AcessDatabase.ComparatorImpl());
        return words;
    }

    private static class ComparatorImpl implements Comparator<Word> {

        public ComparatorImpl() {
        }

        @Override
        public int compare(Word w1, Word w2) {
            return w1.getWord_taget().compareTo(w2.getWord_taget());
        }
    }
}

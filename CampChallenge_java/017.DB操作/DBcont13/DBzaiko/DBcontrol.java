/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBzaiko;

import java.sql.*;

/**
 *
 * @author issei
 */
public class DBcontrol {
    
    private String driver;
    private String url;
    private String user;
    private String password;
    private Connection db_con;
    private Statement db_st;
    private ResultSet resultset;
     /**
     * コンストラクタ
     * @param driver ドライバー
     * @param url URL
     * @param user ユーザー名
     * @param password パスワード
     */
    
 
    /**
     * 引数なしのコンストラクタ
     * 既定値を使用する
     */
    public DBcontrol() {
        driver = "com.mysql.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/Challenge_db";
        user = "Issei";
        password = "myNameIsTsuboki";
    }
 
    /**
     * データベースへの接続を行う
     */
    public synchronized void open() throws Exception {
        Class.forName(driver);
        db_con = DriverManager.getConnection(url, user, password);
        db_st = db_con.createStatement();
    }
 
    /**
     * SQL 文を実行した結果の ResultSet を返す
     * @param sql SQL 文
     */
    public ResultSet getResultSet(String sql) throws Exception {
        if ( db_st.execute(sql) ) {
            return db_st.getResultSet();
        }
        return null;
    }
    public ResultSet itiran() throws Exception {
        db_st.execute("select * from zaikoShouhin");
        return db_st.getResultSet();
    }
    public ResultSet search(String sql) throws Exception {
        if ( db_st.execute(sql) ) {
            return db_st.getResultSet();
        }
        return null;
    }
 
    /**
     * SQL 文の実行
     * @param sql SQL 文
     */
    public void execute(String sql) throws Exception {
        db_st.execute(sql);
    }
 
    /**
     * データベースへのコネクションのクローズ
     */
    public synchronized void close() throws Exception {
        if ( resultset != null ) resultset.close();
        if ( db_st != null ) db_st.close();
        if ( db_con != null ) db_con.close();
    }
}

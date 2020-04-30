package sloth.zhang;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 11:05 2019/11/8
 * @Modificd By;
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
class Db {
    protected Connection conn;//连接
    protected PreparedStatement psmt;//预编译
    protected ResultSet rs;//结果集
    private final String URL="jdbc:mysql://127.0.0.1:3306/test";
    private final String UNAME="root";
    private final String PSW="root";

    //连接数据库
    public void getConn(){
//加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
//获得链接
            conn=DriverManager.getConnection(URL,UNAME, PSW);
        } catch (Exception e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    //关闭连接
    public void closeAll(){
        try {
            if(conn!=null){
                conn.close();
            }
            if(psmt!=null){
                psmt.close();
            }
            if(rs!=null){
                rs.close();
            }
        } catch (SQLException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    //查询操作
    public void extQuery(String sql,Object...obj){
        try {
            psmt =conn.prepareStatement(sql);//查询sql语句
            for(int i=0;i<obj.length;i++){
                psmt.setObject((i+1), obj[i]);
            }
            rs=psmt.executeQuery();
        } catch (SQLException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    //更新操作
    public void extUpdate(String sql, Object...obj){
        try {
            psmt = conn.prepareStatement(sql);
            for(int i=0; i<obj.length;i++){
                psmt.setObject((i+1), obj[i]);
            }
            psmt.executeUpdate();
        } catch (SQLException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

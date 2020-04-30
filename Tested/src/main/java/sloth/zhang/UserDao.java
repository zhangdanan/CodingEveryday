package sloth.zhang;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 11:04 2019/11/8
 * @Modificd By;
 */

import java.sql.SQLException;



public class UserDao extends Db{
    public boolean LoginCheck(String uname,String psw){
        User a = new User();
        boolean flag = true;

//获取链接
        getConn();

//执行sql语句
        String sql = "select * from auser where name = ? and psw = ?";

        extQuery(sql, uname,psw);
        try {
            if (rs.next()) {
                a.setName(uname);
                a.setPassword(psw);
                flag = true;
            }else{
                flag = false;
            }
        } catch (SQLException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        return flag;
    }
}

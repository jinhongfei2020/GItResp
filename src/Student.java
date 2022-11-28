import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Student {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public  int  upd(String sql,Object ...objs){
        int num = 0;
        try {

            ps = con.prepareStatement(sql);
            for (int i = 0; i<objs.length ; i++){
                ps.setObject(i+1,objs[i]);
            }
            num = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return num;
    }


}

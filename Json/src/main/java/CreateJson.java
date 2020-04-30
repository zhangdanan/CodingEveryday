import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 21:36 2020/4/30
 * @Modificd By;
 */
public class CreateJson {
    public static void main(String[] args) throws JSONException {
         PutJSONObject();
         CreateJsonByMap();
         CreateJsonByBean();
    }

    public static void PutJSONObject() throws JSONException {
        JSONObject zhangsan=new JSONObject();
        Object null1=null;
        zhangsan.put("age",22);
        zhangsan.put("car",false);
        zhangsan.put("name","张亚楠");
        zhangsan.put("birthday","2020-04-30");
        zhangsan.put("like",new String[]{"听歌","运动"});
        zhangsan.put("hotel",null1);
        System.out.println(zhangsan.toString());
    }

    public static void CreateJsonByMap(){
        Map<String,Object> zhangsan=new HashMap <String, Object>();
        Object null1=null;
        zhangsan.put("age",22);
        zhangsan.put("car",false);
        zhangsan.put("name","张亚楠");
        zhangsan.put("birthday","2020-04-30");
        zhangsan.put("like",new String[]{"听歌","运动"});
        zhangsan.put("hotel",null1);
        System.out.println(new JSONObject(zhangsan));
    }

    public static void CreateJsonByBean(){
        User user=new User();
        user.setAge(22);
        user.setBirthday("2020-04-30");
        user.setCar(false);
        user.setName("zhangdanan");
        System.out.println(new JSONObject(user));
    }

}

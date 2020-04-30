import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


import java.io.*;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 21:56 2020/4/30
 * @Modificd By;
 */
public class ReadJson {
    //读取json文件
    public static String readJsonFile(String fileName) {
            String jsonStr = "";
            try {
                File jsonFile = new File(fileName);
                FileReader fileReader = new FileReader(jsonFile);
                Reader reader = new InputStreamReader(new FileInputStream(jsonFile),"utf-8");
                int ch = 0;
                StringBuffer sb = new StringBuffer();
                while ((ch = reader.read()) != -1) {
                    sb.append((char) ch);
                }
                fileReader.close();
                reader.close();
                jsonStr = sb.toString();
                return jsonStr;
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }


        public static void main(String[] args) {
            String path = ReadJson.class.getClassLoader().getResource("data/user.json").getPath();
            String s = readJsonFile(path);
            JSONObject jobj = JSON.parseObject(s);
            JSONArray user = jobj.getJSONArray("RECORDS");//构建JSONArray数组
            for (int i = 0 ; i < user.size();i++){
                JSONObject key = (JSONObject)user.get(i);
                String name = (String)key.get("name");
                String street = (String)key.get("street");
                String age=((String)key.get("age"));
                String phone=((String)key.get("phone"));
                System.out.println(name);
                System.out.println(street);
                System.out.println(age);
                System.out.println(phone);
            }
        }
    }


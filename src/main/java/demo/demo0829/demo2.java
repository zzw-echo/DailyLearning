package demo.demo0829;

import java.io.*;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/8/29 19:32
 */
public class demo2 {
    public static void main(String[] args) {
        String fileName = "d:\\readme.md";
        try {
            File file = new File(fileName);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s;
            while ((s = br.readLine())!=null){
                System.out.println(s);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

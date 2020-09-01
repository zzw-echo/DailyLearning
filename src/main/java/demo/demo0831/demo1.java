package demo.demo0831;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/8/31 14:27
 */
public class demo1 {
    public boolean isValid(String s) {
        for(int i=0;i<s.length()/2;i++){
            s = s.replace("()","").replace("[]","").replace("{}","");
        }
        if(s.length() > 0){
            return false;
        }else{
            return true;
        }

    
    }
}

package demo.demo0904;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/4 0:51
 */
public class demo1 {

    public static void main(String[] args) {
//        StringBuffer sbf = new StringBuffer();
//        sbf.append("aa");
//        sbf.append("bbb");
//        sbf.append("cc");
//
//        StringBuffer sbf2 = sbf;
//
//        System.out.println(sbf2 == sbf);
//
//        sbf2.append("dd");
//        System.out.println(sbf2 == sbf);
//        System.out.println(sbf);
//        System.out.println(sbf2);

//        String a = new String("aaa");
//        String b = "aaa";
//        System.out.println(a == b);

//        String a = "aaa";
//        String b = a;
//        System.out.println(a == b);
//        b += "bb";
//        System.out.println(a == b);

        int a = 111;
        int b = a;
        b++;


        System.out.println(a == b);

        String c = "aaa";
        String d = c;
        d+="cc";
        System.out.println(c == d);
        

        StringBuffer sbf = new StringBuffer("aaa");
        StringBuffer sbf2 = sbf;
        sbf2.append("bb");
        System.out.println(sbf == sbf2);


//        Integer a = new Integer(1);
//        Integer b = a;
//        System.out.println(a == b);
//        b++;
//        System.out.println(a == b);


    }
}

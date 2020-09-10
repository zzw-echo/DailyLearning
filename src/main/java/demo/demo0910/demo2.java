package demo.demo0910;

/**
 * 作者 ： 张泽文
 * 邮箱 ： zzw.me@qq.com
 * 时间 ： 2020/9/10 19:33
 */
public class demo2 {

//    public static void main(String[] args) {
//        Node g = new Node("G", null);
//        Node f = new Node("F", g);
//        Node e = new Node("E", f);
//        Node d = new Node("D", e);
//        Node c = new Node("C", d);
//        Node b = new Node("B", c);
//        Node a = new Node("A", b);
//        Node start;
//        start = a;
//        while (start != null) {
//            System.out.println(start.val);
//            start = start.next;
//        }
//        reverseNM(a, 3, 6);
//        start = a;
//        while (start != null) {
//            System.out.println(start.val);
//            start = start.next;
//        }
//    }

    public static void reverseNM(Node node, int n, int m) {

        int index = 1;

        while (index < n - 1) {
            node = node.next;
            index++;
        }
        Node beforeNode = node;
        node = node.next;
        index++;

        Node NNode = node;

        Node nextNode = node.next;

        while (index < m) {
            nextNode.next = node;
            node = nextNode;
            index++;
            nextNode = nextNode.next;
        }

        beforeNode.next = node;
        NNode.next = node.next;

    }

    public static class Node {
        String val;
        Node next = null;

        public Node(String val) {
            this.val = val;
        }

        public Node(String val, Node next) {
            this.val = val;
            this.next = next;
        }
    }


}

/**
 * Created by zhangzewen on 2020/7/1
 */
public class BiTreeDeep {

    public static int get_node_layer(Node node, int value, int L){
        int i = -1;
        if (node != null){
            if (node.getValue() == value){
                return L;
            }
            if (((i = get_node_layer(node.getLeft(),value,L+1))!= -1)){
                return i;
            }
            if (((i = get_node_layer(node.getRight(),value,L+1))!= -1)){
                return i;
            }
        }
        return i;
    }





}

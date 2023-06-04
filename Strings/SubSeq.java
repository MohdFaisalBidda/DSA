package Strings;
import java.util.ArrayList;

public class SubSeq{
    public static void main(String[] args) {
        System.out.println(subSeqRetAscii("","abc"));
        // subSeqAscii("","abc");
    }

    public static void subSeq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch =up.charAt(0);
        subSeq(p+ch,up.substring(1));
        subSeq(p,up.substring(1));
    }

    public static ArrayList<String> subSeqRet(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch =up.charAt(0);

        ArrayList<String> left = subSeqRet(p+ch,up.substring(1));
        ArrayList<String> right = subSeqRet(p,up.substring(1));

        left.addAll(right);
        return left;
    }


    public static void subSeqAscii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch =up.charAt(0);
        subSeqAscii(p+ch,up.substring(1));
        subSeqAscii(p,up.substring(1));
        subSeqAscii(p+(ch+0),up.substring(1));
    }


    public static ArrayList<String> subSeqRetAscii(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch =up.charAt(0);

        ArrayList<String> first = subSeqRetAscii(p+ch,up.substring(1));
        ArrayList<String> second = subSeqRetAscii(p,up.substring(1));
        ArrayList<String> third = subSeqRetAscii(p+(ch+0),up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
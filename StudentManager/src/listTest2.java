import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class listTest2 {
    public static void main(String[] args){
        List<String> str = new ArrayList<>();
//        line =
//        list.add(line);

        int len = 0;
//        StringBuffer str = new StringBuffer("");

        File file = new File("test1.txt");
//        List<String> list = new ArrayList<>();
//        String filepath = "test1.txt";

//        list.add("a");
//        list.add("b");
//        list.add("c");


        try{
            FileInputStream is = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader in = new BufferedReader(isr);
            String line = null;
            while( (line = in.readLine()) != null){
                String[] words = line.split(" ");

                for(int i = 0; i < words.length; i++){
//                    try{
                        System.out.println(words[i]);
//                    } catch(ArrayIndexOutOfBoundsException e){

//                    }
                }
//                if(len != 0){
//
////                    str.add("\r\n" + line);
//                }else{
//                    str.add(line);
//                }
//                len++;
            }
            in.close();
            is.close();
        }catch (IOException e){
            e.printStackTrace();
        }


        System.out.println(str);
    }
}

class Student{
    private String a;
    private String b;

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }
}

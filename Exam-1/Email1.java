import java.io.*;
import java.util.*;

public class Email1 {    
    static ArrayList<String> key= new ArrayList<String>();
    static ArrayList<String[]> val= new ArrayList<String[]>();

    public static void  email1(String em) throws Exception{

        
        String fileName = "C:\\Users\\Manisha\\Desktop\\ADS_2\\Exam-1\\emails.txt";
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        int vcount=0;
        String line;
        while((line  = br.readLine())  != null) {
            String[] arr = line.split(";",2);
            if(arr.length>1) {
                key.add(arr[0]);
                val.add(arr[1].split(";"));
            }
            else {
                key.add(arr[0]);
                val.add(null);
            }
            vcount++;
        }
        System.out.println("No of vertices:"+vcount);
    }


    public static void main(String [] args)throws Exception 
    {
        email1("emails");
        Graph g = new Graph(key.size());
        int count  =0;
        for(int i=0;i<key.size();i++) {
            if(val.get(i)!=null) {
                for(int j=0; j<val.get(i).length;j++) {
                    int  k=Integer.parseInt(key.get(i));
                    int  v=Integer.parseInt(val.get(i)[j]);
                     g.addEdge(k,v);
                    count++;
                }
            }
        }
        System.out.println("No of edges:"+count);
    }
}

import java.io.*;
import java.util.*;
/**
 * @class Wordnet
 * Consists of hypernym(), main()
 */
public class WordNet {    
    /**
     * Creating arraylist of key and value
     */
    static ArrayList<String> key= new ArrayList<String>();
    static ArrayList<String[]> val= new ArrayList<String[]>();
    
    //connects the edges of one vertex to the other
    public static void hypernym(String hyp) throws Exception{

        
        String fileName = "C:\\Users\\Manisha\\Desktop\\ADS_2\\Module_1\\wordnet\\hypernyms.txt";
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        int vcount=0;
        String line;
        while((line  = br.readLine())  != null) {
            String[] strarr = line.split(",",2);
            if(strarr.length>1) {
                key.add(strarr[0]);
                val.add(strarr[1].split(","));
            }
            else {
                key.add(strarr[0]);
                val.add(null);
            }
            vcount++;
        }
        System.out.println("No of vertices:"+vcount);
       // System.out.println(hm);
    }

    //*
    public static void main(String [] args)throws Exception 
    {
        hypernym("hypernyms");
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

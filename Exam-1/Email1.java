import java.io.*;
import java.util.*;

public class Email1 { 
    Digraph d;
    d=new diagraph(logs.size()); 
    HashMap<String , integer> email2= new HashMap<>();
    ArrayList<Integer ,Integer> val= new ArrayList[]>();

    public static void email1(String em) throws Exception{
        String fileName = "C:\\Users\\Manisha\\Desktop\\ADS_2\\Exam-1\\emails.txt";
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        int vcount=0;
        String line;
        while((line  = br.readLine())  != null) {
            String[] arr = line.split(";");
            int e= Integer.parseInt(arr[0]);
             email2.put(e,arr[1]);
        }
    
    }
    ArrayList<Integer[]> logs = new ArrayList<>();

    void emailLogs() throws FileNotFoundException {
        File f = new File(yourfilename);
        Scanner s = new Scanner(f);
        while (s.hasNextLine()) {
            String[] s1 = s.nextLine().split(",");
            String[] s2 = s1[0].split(" ");
            String[] s3 = s1[1].split(" ");
            Integer[] a = new Integer[2];
            a[0] = Integer.parseInt(s2[1]);
            a[1] = Integer.parseInt(s3[s3.length - 1]);
            logs.add(a);
        }
        System.out.println(Arrays.toString(logs.get(0)));

    }
    public void addedge(){
        email1();
        emailLogs();
        d=new diagraph(logs.size());
        for(int i=0;i<logs.size();i++){
            for(int j:logs.get(i)){
                d.addedge(i,j);
            }
        }
        
    }
        
import java.io.*; 
public class wordnet{
    public static  void hypernym() throws Exception{
    String fileName = "C:\\Users\\Manisha\\Desktop\\ADS_2\\Module_1\\wordnet\\hypernyms.txt";
    File file  =  new File(fileName);
    FileReader  obj = new  FileReader(file);
    BufferedReader obj1 = new BufferedReader(obj);
    String line;
    while((line = obj1.readLine()) != null ){
    String[] arr= line.split(",");
    for(int j=0;j<arr.length;j++){

       System.out.println(arr[j]);

      }
    }
  }
 

public static  void synset() throws Exception{
  String fileName = "C:\\Users\\Manisha\\Desktop\\ADS_2\\Module_1\\wordnet\\synsets3.txt";
  File file  =  new File(fileName);
  FileReader  obj = new  FileReader(file);
  BufferedReader obj1 = new BufferedReader(obj);
  String line;
  while((line = obj1.readLine()) != null ){
    String[] arr= line.split(",");
    for(int j=0;j<arr.length;j++){

    System.out.println(arr[j]);
  }
  }
}
    public static void main(String[] args) throws Exception {
  
    hypernym();
    synset();
    }

}



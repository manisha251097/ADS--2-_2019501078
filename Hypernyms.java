import java.io.*; 
public class Hypernyms 
{ 
  public static void main(String[] args) throws Exception  { 
    String fileName = "C:\\Users\\Manisha\\Desktop\\ADS_2\\Module_1\\wordnet\\hypernyms.txt";
File file  =  new File(fileName);
FileReader  obj = new  FileReader(file);
BufferedReader obj1 = new BufferedReader(obj);
String line;
int i=0;
while((line = obj1.readLine()) != null ){
  if(i==5) break;
  String[] arr= line.split(",");
  for(int j=0;j<arr.length;j++){

    System.out.println(arr[j]);
  }
  i++;
}
  }

} 
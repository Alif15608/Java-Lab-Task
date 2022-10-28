import java.io.*;  

public class GetFileInfo{
  public static void main(String[] args) {
    try {
      File myObj = new File("Alif.txt");
      System.out.println("File name: " + myObj.getName());
      System.out.println("Absolute path: " + myObj.getAbsolutePath());
      System.out.println("Writeable: " + myObj.canWrite());
      System.out.println("Readable " + myObj.canRead());
      System.out.println("File size in bytes " + myObj.length()); 
    } catch (Exception e) {
      System.out.println("An error occured !");
      e.printStackTrace();
    }
  }
}
import java.io.*;  // Import the File class
import java.util.Scanner;

public class ReadFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("Alif.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
	  
	  // Reading with file reader,
	  System.out.println("###########################");
	  System.out.println("---Reading with file reader----");
	  System.out.println("###########################");
	  FileReader fr= new FileReader("Example.txt");
	  // read from FileReader till the end of file 
	  int ch;
        while ((ch=fr.read())!=-1) 
            System.out.print((char)ch); 
        // close the file 
        fr.close(); 
	  
    } catch (FileNotFoundException e) {
      System.out.println("There is no file at given name");
    }
	catch (IOException e) {
      System.out.println("An IO error occured");
    }
  }
}
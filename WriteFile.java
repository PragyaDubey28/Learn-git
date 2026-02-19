
import java.io.FileWriter;
import java.io.IOException;

class WriteFile {
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("ParagraphWrite.txt");
            fw.write("Hello I am Pragya Dubey ");
            fw.close();
            System.out.println("Data written suffessfullly");
        }catch (IOException e){
            System.out.println("Error");
        }
    }
}
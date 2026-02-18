import java.io.File;
import java.io.IOException;

 
class CreateFile {
    public static void main(String[] args){
        try{
            File f = new File("Create.txt");
            if(f.createNewFile()) {
            
        System.out.println("File Created");
            

            }else{
                System.out.println("File already exists");
        }
    }catch (IOException e)  {
       System.out.println("Error occurred");
    }
} 
}

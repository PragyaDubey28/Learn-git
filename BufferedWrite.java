import java.io.*;

class BufferedWrite {
     public static void main(String[] args) throws Exception{
        BufferedWriter bw = new BufferedWriter(new FileWriter("info.txt"));

        bw.write("Java is powerfull");
            bw.newLine();
            bw.write("File handling is easy");
            bw.close();
        
     }
}

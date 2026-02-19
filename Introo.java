import java.io.*;

class Introo {
     public static void main(String[] args) throws Exception{
        BufferedWriter bw = new BufferedWriter(new FileWriter("info.txt"));


        bw.write("Name_______\nAge___\nRollno_____");
        //  bw.newLine();
        // bw.write("Age");
        //  bw.newLine();
        // bw.write("Rollno_____");
        //  bw.newLine();
        // bw.write("Address_______");
        //  bw.newLine();
            bw.newLine();
           
            bw.close();
        
     }
}


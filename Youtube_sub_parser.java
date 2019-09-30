import java.io.*;
import java.util.Scanner;

public class parser {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("src/input.txt");
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/Result.txt"));
        String st = "";
        while((st = br.readLine()) != null){
            if(sb.length()!=0 && sb.charAt(sb.length()-1) != ' '){
                sb.append(st+" ");
            }
            else{
                sb.append(st);
            }
            if(sb.length() == 0){
                continue;
            }
            if(sb.charAt(sb.length()-1) == '.'){
                System.out.println(sb);
                bw.write("- "+sb.toString()+"\n");
                sb = new StringBuilder("");
            }
            //System.out.println(st);
        }
        bw.close();
        br.close();
    }
}
//alt enter
//alt shift f10

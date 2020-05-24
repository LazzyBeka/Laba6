import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Encoder {

    public void encode(String text,String encoded, char code) throws IOException {
        FileInputStream finall = new FileInputStream(text);
        FileOutputStream end = new FileOutputStream(encoded);
        CustomOutputFilter outputFilter = new CustomOutputFilter(end);
        int j = -1;
        while ((j=finall.read())!=-1){
            System.out.print((char) (j+(int)code));
            outputFilter.write(j,code);
        }
        outputFilter.close();
    }
    public void decode(String text,String encoded, char code) throws IOException {
        FileInputStream finall = new FileInputStream(text);
        FileOutputStream end = new FileOutputStream(encoded);
        CustomOutputFilter outputFilter = new CustomOutputFilter(end);
        int j = -1;
        while ((j=finall.read())!=-1){
            System.out.print((char) (j-(int)code));
            outputFilter.write(j,-code);
        }
        outputFilter.close();
    }
}

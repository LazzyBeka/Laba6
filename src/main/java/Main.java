
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Encoder encoder = new Encoder();
        encoder.encode("text.txt","encoded.txt",'i');
        encoder.decode("encoded.txt","decoded.txt",'i');
    }
}

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class CustomOutputFilter extends FilterOutputStream {
    public CustomOutputFilter(OutputStream out) {
        super(out);
    }

    public void write(int b,int code) throws IOException {
        super.write(b+code);
    }
}

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EncoderTest {

    @Test
    void encode() throws IOException {
        Encoder encoder = new Encoder();
        encoder.encode("text.txt", "encoded.txt", 'i');
        InputStreamReader f = new InputStreamReader(new FileInputStream("encoded.txt"), StandardCharsets.ISO_8859_1);
        Scanner scan = new Scanner(f);
        String expected = "±ОХХ";
        String actual = "";
        while (scan.hasNextLine()) {
            actual += scan.nextLine();
        }
        f.close();
        assertEquals(expected, actual);
    }

    @Test
    void decode() throws IOException {
        Encoder encoder = new Encoder();
        encoder.decode("encoded.txt", "decoded.txt", 'i');
        InputStreamReader f = new InputStreamReader(new FileInputStream("decoded.txt"), StandardCharsets.ISO_8859_1);
        Scanner scan = new Scanner(f);
        String expected = "Hell";
        String actual = "";
        while (scan.hasNextLine()) {
            actual += scan.nextLine();
        }
        f.close();
        assertEquals(expected, actual);
    }
}
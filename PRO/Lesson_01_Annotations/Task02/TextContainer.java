package task02;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface SaveTo{
    String path();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Saver{
}

@SaveTo(path = "D:\\temp\\file.txt")
public class TextContainer {
    String text = "Some Text";

    @Saver
    public void save(String path) throws IOException {
        FileWriter writer = new FileWriter(path);
        try {
            writer.write(text);
        }finally {
            writer.close();
        }
    }
}

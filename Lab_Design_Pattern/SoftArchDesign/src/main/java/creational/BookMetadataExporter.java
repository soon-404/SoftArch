package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.PrintStream;
;

public abstract class BookMetadataExporter extends BookCollection {


    BookMetadataFormatter formatter;
    {
        try {
            formatter = createFormat();
        } catch (ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
    }

    public void add(Book b) {
        formatter.append(b);
    }

    public abstract BookMetadataFormatter createFormat() throws ParserConfigurationException, IOException;

    public void export(PrintStream stream) {
        stream.print(formatter.getMetadataString());
    }
}

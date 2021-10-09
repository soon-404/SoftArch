package creational;

import javax.xml.parsers.ParserConfigurationException;

public class JSONBookMetadataExporter extends BookMetadataExporter{
    @Override
    public BookMetadataFormatter createFormat() throws ParserConfigurationException {
        return new JSONBookMetadataFormatter();
    }
}

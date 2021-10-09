package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONObject bookObj;
    private JSONArray bookArray;
    private JSONObject bookInnerObj;
    private JSONArray authorArray;

    public JSONBookMetadataFormatter(){
        reset();
    }

    public BookMetadataFormatter reset() {
        try {
            bookObj = new JSONObject();
            bookArray = new JSONArray();

            bookObj.put(Book.class.getSimpleName() + "s", bookArray);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        try {
            authorArray = new JSONArray();
            bookInnerObj = new JSONObject();
            bookInnerObj.put(Book.Metadata.ISBN.value, b.getISBN());
            for (String author : b.getAuthors()) {
                authorArray.add(author);
            }
            bookInnerObj.put(Book.Metadata.AUTHORS.value, authorArray);
            bookInnerObj.put(Book.Metadata.TITLE.value, b.getTitle());
            bookInnerObj.put(Book.Metadata.PUBLISHER.value, b.getPublisher());
            bookArray.add(bookInnerObj);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public String getMetadataString() {
        return bookObj.toJSONString();
    }
}

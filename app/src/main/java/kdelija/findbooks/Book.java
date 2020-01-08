package kdelija.findbooks;

public class Book {
    private String mUrl;
    private String mTitle;
    private String mDate;
    private String mAuthor;

    public Book(String url, String title, String date, String author){
        mUrl = url;
        mTitle = title;
        mDate = date;
        mAuthor = author;
    }

    public String getmUrl() {
        return mUrl;
    }
    public String getmTitle() {
        return mTitle;
    }
    public String getmDate() {
        return mDate;
    }
    public String getmAuthor() {
        return mAuthor;
    }
}

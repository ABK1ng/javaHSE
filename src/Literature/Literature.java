package Literature;

//Task 5

import java.util.Comparator;

public class Literature  {
    private String literatureSourceCode;
    private String typeLiterature;
    private String bookName;
    private int yearPublishing;
    private String publishersName;
    private int numberPages;
    private String author;

    public Literature(String literatureSourceCode, String typeLiterature, String bookName, int yearPublishing, String publishersName) {
        this.literatureSourceCode = literatureSourceCode;
        this.typeLiterature = typeLiterature;
        this.bookName = bookName;
        this.yearPublishing = yearPublishing;
        this.publishersName = publishersName;
    }

    public String getLiteratureSourceCode() {
        return literatureSourceCode;
    }

    public void setLiteratureSourceCode(String literatureSourceCode) {
        this.literatureSourceCode = literatureSourceCode;
    }

    public String getTypeLiterature() {
        return typeLiterature;
    }

    public void setTypeLiterature(String typeLiterature) {
        this.typeLiterature = typeLiterature;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public String getPublishersName() {
        return publishersName;
    }

    public void setPublishersName(String publishersName) {
        this.publishersName = publishersName;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Literature{" +
                "literatureSourceCode='" + literatureSourceCode + '\'' +
                ", typeLiterature='" + typeLiterature + '\'' +
                ", bookName='" + bookName + '\'' +
                ", yearPublishing=" + yearPublishing +
                ", publishersName='" + publishersName + '\'' +
                ", numberPages=" + numberPages +
                ", author='" + author + '\'' +
                '}';
    }

}

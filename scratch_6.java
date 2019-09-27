import java.util.*;
import java.lang.*;
import java.io.*;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (getTitle() != null ? !getTitle().equals(book.getTitle()) : book.getTitle() != null) return false;
        if (getAuthor() != null ? !getAuthor().equals(book.getAuthor()) : book.getAuthor() != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = getTitle() != null ? getTitle().hashCode() : 0;
        result = 31 * result + (getAuthor() != null ? getAuthor().hashCode() : 0);
        return result;
    }

    public LinkedList<Book> createBookCollectionLinkedList() {
        Book book = new Book("Title","Author");
        LinkedList<Book> bookCollectionLinkedList = new LinkedList<Book>();
        for(int n = 0; n < 6000000; n++) {
            bookCollectionLinkedList.add(book);
        }
        return bookCollectionLinkedList;
    }

    public ArrayList<Book> createBookCollectionArrayList() {
        Book book = new Book("Title","Author");
        ArrayList<Book> bookCollectionArrayList = new ArrayList<Book>();
        for(int n = 0; n < 6000000; n++) {
            bookCollectionArrayList.add(book);
        }
        return bookCollectionArrayList;
    }
}

class BookStore implements Comparable<BookStore> {
    private Integer bookStoreNum;

    public BookStore(Integer bookStoreNum) {
        this.bookStoreNum = bookStoreNum;
    }

    public Integer getBookStoreNum() {
        return this.bookStoreNum;
    }

    @Override
    public int compareTo(BookStore o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookStore)) return false;

        BookStore bookStore = (BookStore) o;

        if (getBookStoreNum() != null ? !getBookStoreNum().equals(bookStore.getBookStoreNum()) : bookStore.getBookStoreNum() != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return getBookStoreNum() != null ? getBookStoreNum().hashCode() : 0;
    }
}

class MapCreating {
    public HashMap<BookStore,Book> createBookCollectionHashMap() {
        HashMap<BookStore,Book> bookCollectionHashMap = new HashMap<BookStore,Book>();
        Book bookHashMap = new Book("Title","Author");

        for(int n=0; n<=5999999; n++){
            BookStore bookStore = new BookStore(n);
            bookCollectionHashMap.put(bookStore,bookHashMap);
        }
        return bookCollectionHashMap;
    }

    public TreeMap<BookStore,Book> createBookCollectionTreeMap() {
        TreeMap<BookStore,Book> bookCollectionTreeMap = new TreeMap<BookStore,Book>();
        Book bookTreeMap = new Book("Title","Author");

        for(int n=0; n<=5999999; n++){
            BookStore anotherBookStore = new BookStore(n);
            bookCollectionTreeMap.put(anotherBookStore,bookTreeMap);
        }
        return bookCollectionTreeMap;
    }
}

class BookCollectionSpeedTest {
    public static void main (String[] args) {

        // ArrayList speed test

        Book paper = new Book("Title","Author");
        ArrayList<Book> bookCollectionArrayList = paper.createBookCollectionArrayList();
        System.out.println("ARRAY LIST\nQuantity of elements: " + bookCollectionArrayList.size());

        Long begin = System.currentTimeMillis();
        Long beginNano = System.nanoTime();
        bookCollectionArrayList.get(0);
        Long end = System.currentTimeMillis();
        Long endNano = System.nanoTime();
        System.out.println("Displaying first element has taken: " + (end - begin) + " ms -> " + (endNano - beginNano) + " ns");

        begin = System.currentTimeMillis();
        beginNano = System.nanoTime();
        bookCollectionArrayList.get(bookCollectionArrayList.size()-1);
        end = System.currentTimeMillis();
        endNano = System.nanoTime();
        System.out.println("Displaying last element has taken: " + (end - begin) + " ms -> " + (endNano - beginNano) + " ns");

        begin = System.currentTimeMillis();
        beginNano = System.nanoTime();
        bookCollectionArrayList.remove(0);
        end = System.currentTimeMillis();
        endNano = System.nanoTime();
        System.out.println("Removing first element has taken: " + (end - begin) + " ms -> " + (endNano - beginNano) + " ns");

        begin = System.currentTimeMillis();
        beginNano = System.nanoTime();
        bookCollectionArrayList.remove(bookCollectionArrayList.size()-1);
        end = System.currentTimeMillis();
        endNano = System.nanoTime();
        System.out.println("Removing last element has taken: " + (end - begin) + " ms -> " + (endNano - beginNano) + " ns");

        begin = System.currentTimeMillis();
        beginNano = System.nanoTime();
        bookCollectionArrayList.add(0, paper);
        end = System.currentTimeMillis();
        endNano = System.nanoTime();
        System.out.println("Adding element at the beginning of the collection has taken: " + (end - begin) + " ms -> " + (endNano - beginNano) + " ns");

        begin = System.currentTimeMillis();
        beginNano = System.nanoTime();
        bookCollectionArrayList.add(bookCollectionArrayList.size()-1, paper);
        end = System.currentTimeMillis();
        endNano = System.nanoTime();
        System.out.println("Adding element at the end of the collection has taken: " + (end - begin) + " ms -> " + (endNano - beginNano) + " ns\n");


        // LinkedList speed test

        Book book = new Book("Title","Author");
        LinkedList<Book> bookCollectionList = book.createBookCollectionLinkedList();
        System.out.println("LINKED LIST\nQuantity of elements: " + bookCollectionList.size());

        begin = System.currentTimeMillis();
        beginNano = System.nanoTime();
        bookCollectionList.get(0);
        end = System.currentTimeMillis();
        endNano = System.nanoTime();
        System.out.println("Displaying first element has taken: " + (end - begin) + " ms -> " + (endNano - beginNano) + " ns");

        begin = System.currentTimeMillis();
        beginNano = System.nanoTime();
        bookCollectionList.get(bookCollectionArrayList.size()-1);
        end = System.currentTimeMillis();
        endNano = System.nanoTime();
        System.out.println("Displaying last element has taken: " + (end - begin) + " ms -> " + (endNano - beginNano) + " ns");

        begin = System.currentTimeMillis();
        beginNano = System.nanoTime();
        bookCollectionList.remove(0);
        end = System.currentTimeMillis();
        endNano = System.nanoTime();
        System.out.println("Removing first element has taken: " + (end - begin) + " ms -> " + (endNano - beginNano) + " ns");

        begin = System.currentTimeMillis();
        beginNano = System.nanoTime();
        bookCollectionList.remove(bookCollectionList.size()-1);
        end = System.currentTimeMillis();
        endNano = System.nanoTime();
        System.out.println("Removing last element has taken: " + (end - begin) + " ms -> " + (endNano - beginNano) + " ns");

        begin = System.currentTimeMillis();
        beginNano = System.nanoTime();
        bookCollectionList.add(0, book);
        end = System.currentTimeMillis();
        endNano = System.nanoTime();
        System.out.println("Adding element at the beginning of the collection has taken: " + (end - begin) + " ms -> " + (endNano - beginNano) + " ns");

        begin = System.currentTimeMillis();
        beginNano = System.nanoTime();
        bookCollectionList.add(bookCollectionList.size()-1, book);
        end = System.currentTimeMillis();
        endNano = System.nanoTime();
        System.out.println("Adding element at the end of the collection has taken: " + (end - begin) + " ms -> " + (endNano - beginNano) + " ns\n");


        //HashMap speed test

        MapCreating hashMap = new MapCreating();
        HashMap<BookStore,Book> bookCollectionHashMap = hashMap.createBookCollectionHashMap();
        System.out.println("HASH MAP\nQuantity of elements: " + bookCollectionHashMap.size());

        begin = System.nanoTime();
        bookCollectionHashMap.get(0);
        end = System.nanoTime();
        System.out.println("Displaying first entry of the collection has taken: " + (end - begin) + " ns");

        begin = System.nanoTime();
        bookCollectionHashMap.get(5999999);
        end = System.nanoTime();
        System.out.println("Displaying last entry of the collection has taken: " + (end - begin) + " ns");

        begin = System.nanoTime();
        bookCollectionHashMap.remove(0);
        end = System.nanoTime();
        System.out.println("Removing first element has taken: " + (end - begin) + " ns");

        begin = System.nanoTime();
        bookCollectionHashMap.remove(5999999);
        end = System.nanoTime();
        System.out.println("Removing last element has taken: " + (end - begin) + " ns");

        BookStore BookStore1 = new BookStore(6000000);
        begin = System.nanoTime();
        bookCollectionHashMap.put(BookStore1, book);
        end = System.nanoTime();
        System.out.println("Adding new entry to the collection has taken: " + (end - begin) + " ns\n");


        // TreeMap speed test

        MapCreating treeMap = new MapCreating();
        TreeMap<BookStore,Book> bookCollectionTreeMap = treeMap.createBookCollectionTreeMap();
        System.out.println("TREE MAP\nQuantity of elements: " + bookCollectionTreeMap.size());

        begin = System.nanoTime();
        bookCollectionTreeMap.get(0);
        end = System.nanoTime();
        System.out.println("Displaying first entry of the collection has taken: " + (end - begin) + " ns");

        begin = System.nanoTime();
        bookCollectionTreeMap.get(5999999);
        end = System.nanoTime();
        System.out.println("Displaying last entry of the collection has taken: " + (end - begin) + " ns");

        begin = System.nanoTime();
        bookCollectionTreeMap.remove(0);
        end = System.nanoTime();
        System.out.println("Removing first element has taken: " + (end - begin) + " ns");

        begin = System.nanoTime();
        bookCollectionTreeMap.remove(5999999);
        end = System.nanoTime();
        System.out.println("Removing last element has taken: " + (end - begin) + " ns");

        BookStore BookStore2 = new BookStore(6000000);
        begin = System.nanoTime();
        bookCollectionTreeMap.put(BookStore2, book);
        end = System.nanoTime();
        System.out.println("Adding new entry to the collection has taken: " + (end - begin) + " ns");
    }
}
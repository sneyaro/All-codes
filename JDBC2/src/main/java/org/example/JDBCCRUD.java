package org.example;
import java.sql.*;
import java.util.*;
import java.sql.ResultSet;

public class JDBCCRUD {
    static class Book {
        private int id;
        private String bookName;
        private String author;
        private String year_publication;

        public Book(int id, String bookName, String author, String yearPublication) {
            this.id = id;
            this.bookName = bookName;
            this.author = author;
            this.year_publication = yearPublication;
        }

        public int getId() {
            return id;
        }

        public String getBookName() {
            return bookName;
        }

        public String getAuthor() {
            return author;
        }

        public String getYearPublication() {
            return year_publication;
        }
    }

    public static void main(String[] args) throws Exception {
        String url ="jdbc:mysql://localhost:3306/p10";
        String username ="root";
        String password ="student";
        String sqlquery = "select * from Library1";

        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlquery);

        List<Book> books = new ArrayList<>();
        while(resultSet.next()) {
            int id = resultSet.getInt("id");
            String bookName = resultSet.getString("bookName");
            String author = resultSet.getString("author");
            String year_publication = resultSet.getString("year_publication");

            Book book = new Book(id, bookName, author, year_publication);
            books.add(book);
        }
        for(Book book : books) {
            System.out.println("id : " + book.getId());
            System.out.println("book name : " + book.getBookName());
            System.out.println("author: " + book.getAuthor());
            System.out.println("year of publication: " + book.getYearPublication());
            System.out.println();
        }
        statement.close();
        connection.close();
    }
}


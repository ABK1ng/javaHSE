package Literature;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Menu {
    List <Literature> list;
    BufferedReader reader;

    public Menu() {
        this.list = new ArrayList<>();
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void start() {
        while (true) {
            String num = null;
            System.out.println("Меню Библеотеки");
            System.out.println("1.Добавления книги в библеотеку");
            System.out.println("2.Посмотреть библеотеку");
            System.out.println("0.Выход");

            try  {
                System.out.print("\nВыберете кнопку: ");
                num = this.reader.readLine();
                System.out.println();
            } catch (IOException e) {
                System.out.println(e.getStackTrace() + e.getMessage());
            }

            switch (num) {
                case "1":
                    addBook();
                    break;
                case "2":
                    bibleWiewer();
                    break;
                case "0":
                    try {
                        reader.close();
                    } catch (IOException e) {
                        System.out.println("Ошмбка при закрытие потока!!!");
                    }
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nТакой кнопки нету. Попробуйте заново");
                    goToMenu();
                    break;

            }

        }
    }

    public void bibleWiewer() {
        System.out.println("Просмотр библеотеки.");
        if (list.size() == 0) System.out.println("Библеотека пуста!!!");

        for (Literature b: this.list) {
            System.out.println(b.toString());
            System.out.println();
        }

        goToMenu();
    }

    public void addBook() {
        System.out.println("Добавления книги в библеотеку.");
        List <Literature> list = this.list;
        list.add(createBook());

        System.out.println("\nВы добавили книгу!!!");
        goToMenu();
    }

    private Literature createBook() {
        String literatureSourceCode = null;
        String typeLiterature = null;
        String bookName = null;
        int yearPublishing = 0;
        String publishersName = null;
        int numberPages = 0;
        String author = null;

        try {
            System.out.print("Введите код источника литературы: ");
            literatureSourceCode = reader.readLine();
            System.out.print("Введите тип литературы: ");
            typeLiterature = reader.readLine();
            System.out.print("Введите название: ");
            bookName = reader.readLine();
            System.out.print("Введите год издательства: ");
            yearPublishing = Integer.parseInt(reader.readLine());
            System.out.print("Введите название издательства: ");
            publishersName = reader.readLine();
            System.out.print("Введите количество страниц: ");
            numberPages = Integer.parseInt(reader.readLine());
            System.out.print("Введите автора: ");
            author = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }

        Literature book = new Literature(literatureSourceCode, typeLiterature, bookName, yearPublishing, publishersName);
        book.setNumberPages(numberPages);
        book.setAuthor(author);



        return book;
    }

    private void goToMenu() {
        try {
            System.out.print("Нажмити любую кнопку чтоб выйти в меню: ");
            String str = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
        System.out.println();
    }
}
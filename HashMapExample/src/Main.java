import java.util.HashMap;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // System.out.printf("Hello and welcome!");
        var books = new HashMap<String, Book>();
        books.put("Пожар", new Book("Пожар", 50, "Распутин_В."));
        books.put("Компромисс", new Book("Компромисс", 70, "Довлатов_C."));
        books.put("В списках не значился", new Book("В списках не значился", 80, "Васильев_Б."));

        pairsOfValues(books);
        enumerOfNames(books);
        enumerOfValuesOfBooks(books);
    }

     static void pairsOfValues(HashMap<String,Book> books) {  // out the pairs of Values
        for (var item : books.entrySet()) {
            System.out.println(item.getKey() + item.getValue());   // books.get(item).toString()
        }
    }

       static void enumerOfNames(HashMap<String,Book> books) {   // out the keys of books
            for (var item : books.keySet()) { System.out.print(item +", "); }
            System.out.println();
    }

    static void enumerOfValuesOfBooks(HashMap<String,Book> books) {   // out the Values Of Books
        for (var item : books.values()) {
            System.out.println(item.name +" "+item.cost+" "+item.author);
        }
    }

}
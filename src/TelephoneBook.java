import java.util.*;

public class TelephoneBook {
    
    Map<String, List<String>> telephoneBook = new HashMap<>();


    public void add (String surname, List<String> phoneNumber){
        telephoneBook.put(surname, phoneNumber);
    }

    public void get (String surname){
        System.out.println(surname + " " + telephoneBook.get(surname));
    }

    public void test () {
        System.out.println(telephoneBook);
    }
}


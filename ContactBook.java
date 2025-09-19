import java.util.*;

public class ContactBook {
    static class Contact {
        String name, phone;
        Contact(String n, String p) { name = n; phone = p; }
        public String toString() { return name + " - " + phone; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Contact> contacts = new ArrayList<>();
        while(true) {
            System.out.println("1:Add 2:List 3:Exit");
            String choice = sc.nextLine();
            if (choice.equals("1")) {
                System.out.print("Name: "); String n = sc.nextLine();
                System.out.print("Phone: "); String p = sc.nextLine();
                contacts.add(new Contact(n, p));
                System.out.println("Added.");
            } else if (choice.equals("2")) {
                if (contacts.isEmpty()) System.out.println("No contacts.");
                else contacts.forEach(System.out::println);
            } else if (choice.equals("3")) {
                System.out.println("Bye!"); break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}

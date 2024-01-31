
import java.util.Scanner;

public class Project {
    public static void main(String args[]) {
        char r;
        do {
            Scanner obj1 = new Scanner(System.in);
            System.out.println("-----------------Library Management System-----------------");
            System.out.println("Press 1 to add Book ");
            System.out.println("Press 2 to Issue a Book ");
            System.out.println("Press 3 to Return a Book ");
            System.out.println("Press 4 to Print Complete Issue Detail ");
            System.out.println("Press 5 to Exit ");
            System.out.println("Enter user choice");
            int a = obj1.nextInt();
            Library aa = new Library();
            switch (a) {
                case 1:
                    aa.add();
                    break;
                case 2:
                    aa.iss();
                    break;
                case 3:
                    aa.ret();
                    break;
                case 4:
                    aa.Detail();
                    break;
                case 5:
                    aa.Exit();
                    break;
                default:
                    System.out.print("Invalid Number");
            }

            System.out.println("You want to select next option Y/N ");
            r = obj1.next().charAt(0);
        } while (r == 'Y' || r == 'y');

        if (r == 'N' || r == 'n') {
            Library x = new Library();
            x.Exit();
        }
    }
}

class Library {
    static String str, b, date;
    static int a, c;

    void add() {
        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter book name, Prize, and Book_no");
        str = obj2.nextLine();
        float Price = obj2.nextFloat();
        int Bookno = obj2.nextInt();
        System.out.println("Your Detail is ");
        System.out.println("Book name : "+str);
        System.out.println("Book Price : "+Price);
        System.out.println("Book_no : "+Bookno);
        
        
    }

    void iss() {
        Scanner obj3 = new Scanner(System.in);
        System.out.println("Book name");
        str = obj3.nextLine();
        System.out.println("Book_Id");
        a = obj3.nextInt();
        obj3.nextLine();
        System.out.println("ISSUE DATE");
        b = obj3.nextLine();
        System.out.println("Total number of books issue");
        c = obj3.nextInt();
        obj3.nextLine();
        System.out.print("RETURN BOOK DATE");
        date = obj3.nextLine();
    }

    int getid() {
        return a;
    }

    void ret() {
        Scanner c = new Scanner(System.in);
        System.out.print(" Enter Student name & Book_id ");
        String name = c.nextLine();
        int Book_id = c.nextInt();
        if (a == Book_id) {
            System.out.println("Total Details ");
            System.out.println("Book name :" + Library.str);
            System.out.println("Book id :" + Library.a);
            System.out.println("ISSUE DATE: " + Library.b);
            System.out.println("Total number of books issue:" + Library.c);
            System.out.println("Book Return Date: " + Library.date);
        } else {
            System.out.println("Wrong ID, Please enter a valid ID");
        }
    }

    void Detail() {
        System.out.println("Book name :" + Library.str);
        System.out.println("Book id :" + Library.a);
        System.out.println("ISSUE DATE: " + Library.b);
        System.out.println("Total number of books issue:" + Library.c);
        System.out.println("Book Return Date: " + Library.date);
    }

    void Exit() {
        System.exit(0);
    }
}

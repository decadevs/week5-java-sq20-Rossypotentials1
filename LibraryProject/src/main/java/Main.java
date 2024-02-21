import org.example.model.LibraryUser;
import org.example.services.Queue;
import org.example.services.impl.LibUserPriorityQueue;
import org.example.services.impl.LibraryServiceImpl;

public class Main {
    public static void main(String[] args) {

        //Instantiation of the Library Service Method
        LibraryServiceImpl libraryService = new LibraryServiceImpl();

        //First Implementation
        Queue<LibraryUser> userPriorityQueue = new LibUserPriorityQueue();

        System.out.println("Attending to Library Users based on Library User Priority");
        System.out.println("=========================================================");
       String service = libraryService.borrowBook(99,userPriorityQueue);
       String service1 = libraryService.borrowBook(3,userPriorityQueue);
       String service2 = libraryService.borrowBook(3,userPriorityQueue);
       String service3 = libraryService.borrowBook(3,userPriorityQueue);
        System.out.println(service);
        System.out.println(service1);
        System.out.println(service2);
        System.out.println(service3);



        //Second Implementation
        System.out.println();
        System.out.println("=================================================================");
        libraryService.fcfc();



//        Queue<LibraryUser> firstComeFirstServe = new LibUserFcFs();
//        String fcfc1 = libraryService.assignBook(3,firstComeFirstServe);
//        String fcfc2 = libraryService.assignBook(2,firstComeFirstServe);
//        String fcfc3 = libraryService.assignBook(1,firstComeFirstServe);
//        String fcfc4 = libraryService.assignBook(5,firstComeFirstServe);
//        String fcfc5 = libraryService.assignBook(4,firstComeFirstServe);
//
//        System.out.println(fcfc1);
//        System.out.println(fcfc2);
//        System.out.println(fcfc3);
//        System.out.println(fcfc4);
//        System.out.println(fcfc5);




    }
}

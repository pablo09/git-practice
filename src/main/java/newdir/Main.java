/**
 * Created by Admin on 16.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to my app/. MASTER");
        printHelp();
        printHelp();
        stopServer();
        cleanup();
    }

    public static void printInfo() {
        System.out.println("----------------------------");
        System.out.println("This is Git practice project. It's great, isn't it?");
        System.out.println("----------------------------");
    }

    public static void printHelp() {
        //TODO Create another class for HelpPrinter
    }

    public static void cleanup() {
        closeStreams();
        System.out.println("Cleaning...");
        System.out.println("Cleaning...");
    }

    public static void stopServer() {
        System.out.println("Stopping server...");
        System.out.println("Stopping server...");
    }

    public static void closeStreams() {
        System.out.println("Closing streams...");
        System.out.println("Closing streams...");
        System.out.println("Closing streams...");
    }

    public static void test1() {
        System.out.println("Test1 in progress...");
    }

    public static void test2() {
        System.out.println("Test2 in progress");
    }

    public static void test3() {
        System.out.println("Test in progress");
    }

    public static void test4() {
        System.out.println("Test in progress");
    }

    public static void test5() {
        System.out.println("Test in progress");
    }

    public static void test6() {
        System.out.println("Test in progress");

    }

    public static void test() {
        System.out.println("Test in progress");
    }
}

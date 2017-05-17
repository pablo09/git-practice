/**
 * Created by Admin on 16.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to my app/. MASTER123");
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

    private void test1() {}

    private void test2() {}
    private void test() {}
    private void test4() {}


}

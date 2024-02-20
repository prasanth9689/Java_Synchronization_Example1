//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String args[])
    {
        Sender sender = new Sender();
        ThreadedSend s1 = new ThreadedSend("Hi\t", sender);
        ThreadedSend s2 = new ThreadedSend("Bye\t", sender);

        // Start two threads of ThreadedSend type
        s1.start();
        s2.start();

        // wait for threads to end
        try {
            s1.join();
            s2.join();
        }
        catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}
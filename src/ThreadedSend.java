// Class for send a message using Threads
 class ThreadedSend extends Thread{
    private String message;

    Sender sender;

    // Receives a message object and a string
    // Message to be sent
    ThreadedSend(String msg, Sender object)
    {
        message = msg;
        sender = object;
    }

    public void run(){
        // Only one thread can send a message
        // at a time.
        synchronized (sender){
            // synchronizing the send object
            sender.send(message);
        }
    }
}

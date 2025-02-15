import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> S;

    public MessagingService() {
        this.S  = new ArrayList<>();
    }
    
    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            this.S.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return this.S;
    }
}

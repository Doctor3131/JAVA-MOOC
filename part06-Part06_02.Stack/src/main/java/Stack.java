import java.util.ArrayList;

public class Stack {
    private ArrayList<String> S; 
    
    public Stack() {
        this.S = new ArrayList<>(); 
    }

    public boolean isEmpty() {
        return this.S.size() == 0;             
    }

    public void add(String value) {
        this.S.add(value);
    } 

    public ArrayList<String> values() {
        return this.S;
    }

    public String take() {
        String data = S.get(S.size() - 1);
        S.remove(data);
        return data;
    }
}

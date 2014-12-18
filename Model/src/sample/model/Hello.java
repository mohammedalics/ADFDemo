package sample.model;

public class Hello {
    int id; 
    String name; 
    
    public Hello() {
        super();
    }
    public String sayHi(String input) {
        return "Hi " + input; 
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

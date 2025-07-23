package collections;

class Data {
    private Integer number;
    private String name;

    Data(int _number, String _name) {
        this.number = _number;
        this.name = _name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}

public class CustomClass {
    public static void main(String[] args) {
        Data data1 = new Data(1,"Kartikey");
        Data data2 = new Data(2,"Kartik");

        data1.setName("Kartik");
        System.out.println(data1.getName());
    }
}

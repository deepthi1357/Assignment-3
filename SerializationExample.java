import java.io.*;

class Customer implements Serializable {
    private int id;
    private String name;
    private String contactNo;
    private String address;

    public Customer(int id, String name, String contactNo, String address) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getAddress() {
        return address;
    }
}
public class SerializationExample {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "John Doe", "1234567890", "123 Main St");

        try (FileOutputStream fileOut = new FileOutputStream("JavaObject.txt");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(customer);
            System.out.println("Customer object serialized and saved to JavaObject.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

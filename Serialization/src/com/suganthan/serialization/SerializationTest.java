package com.suganthan.serialization;

import java.io.*;

/**
 * Created by msuganthan on 3/6/17.
 */
public class SerializationTest {
    public static void main(String[] args) throws IOException{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.txt"));
        out.writeObject(new Person(1, new Address(1)));
    }

}

class Person implements Serializable {
    Person(int id, Address address) {
        this.id = id;
        this.address = address;
    }
    int id;
    transient Address address;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", address=" + address +
                '}';
    }


    private void writeObject(ObjectOutputStream outputStream) throws IOException{
        outputStream.defaultWriteObject();
        outputStream.writeInt(address.getId());
    }
}

class Address {
    Address(int id) {
        this.id = id;
    }
    int id;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                '}';
    }

}


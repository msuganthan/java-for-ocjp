package com.suganthan.externalization;

import java.io.*;

public class ExternalizationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("test2.txt"));
        Employee employee1 = new Employee();
        employee1.setId(1);
        outputStream.writeObject(employee1);

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("test2.txt"));
        Employee employee2 = (Employee) inputStream.readObject();
        System.out.println(employee2);
    }
}

class Employee implements Externalizable{

    public Employee(){

    }

    int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException{
        System.out.println("Called writeExternal");
        objectOutput.writeInt(this.getId());
    }

    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        System.out.println("Called readExternal");
        id = objectInput.readInt();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                '}';
    }
}
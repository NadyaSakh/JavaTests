package lesson2_0;

import java.util.Arrays;

/**
 * Создать классы, определить в классах параметрический и копирующий конструкторы,
 * сеттеры, геттеры и метод toString().
 *
 * Содать класс Customer c полями: id, familyName, name, patronymicName,
 * address, creditCardNumber (6 цифр), bankAccountNumber (6 цифр).
 * Во втором классе создать массив объектов Customer.
 * Создать методы, возвращающие строковый массив:
 * - ФИО покупателей, разделенных пробелом, в алфавитном порядке;
 * - фио покупателей, разделенных пробелом, у которых номер кредитной карточки находится
 * в заданном интервале.
 */
class Customer {
    private int id;
    private static int nextId = 1;
    private String familyName;
    private String name;
    private String patronymicName;
    private String address;
    private long creditCardNumber;
    private long bankAccountNumber;

    // конструкторы
    public Customer(String familyName, String name, String patronymicName,
                    String address, long creditCardNumber, long bankAccountNumber) {
        this.familyName = familyName;
        this.name = name;
        this.patronymicName = patronymicName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
        nextId();
    }

    public Customer() {
        this.familyName = "";
        this.name = "";
        this.patronymicName = "";
        this.address = "";
        this.creditCardNumber = 0;
        this.bankAccountNumber = 0;
        nextId();
    }

    // setters
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getName() {
        return name;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public String getAddress() {
        return address;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }


    public String toString() {
        String res;
        res = id + "," + familyName + "," + name + "," + patronymicName + "," +
                address + "," + creditCardNumber + "," + bankAccountNumber;
        return res;
    }

    public void nextId() {
        id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    String getFio() {
        String res;
        res = familyName + " " + name + " " + patronymicName;
        return res;
    }

}

public class Solution2_0 {
    private Customer[] customers;

    public Solution2_0(Customer[] customers) {
        this.customers = customers;
    }

    public Solution2_0() {
        this.customers = new Customer[]{};
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public String[] sortCustomersByFIO() {
        String[] customerList = new String[customers.length];
        for (int i = 0; i < customers.length; i++) {
            customerList[i] = customers[i].getFio();
        }
        Arrays.sort(customerList);
        return customerList;
    }

    public String[] getCustomersFromCardInterval(int minValue, int maxValue) {
        String[] customerList = new String[100];
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getCreditCardNumber() >= minValue &&
                    customers[i].getCreditCardNumber() <= maxValue) {
                customerList[i] = customers[i].getFio();
            }
        }
        return customerList;
    }
}

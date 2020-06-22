package lesson2_0;

import org.junit.*;


public class CustomerTest {
    private static Customer customer;
    private static Customer customer1;

    @BeforeClass
    public static void setUpCustomers() throws Exception {
        customer = new Customer("Nedbaylova", "Elena", "Alexseevna",
                "Mira st. 28-21", 123000, 123001);
        customer1 = new Customer("Pytin", "Irina", "Alexandrovna",
                "Mira st. 28-21", 123700, 123701);
    }

    @Test
    public void testToString(){
        String actual = customer.toString();
        Assert.assertTrue("Result must contain family name.", actual.contains("Nedbaylova"));
        Assert.assertTrue("Result must contain name.", actual.contains("Elena"));
        Assert.assertTrue("Result must contain patronymic name.",actual.contains("Alexseevna"));
        Assert.assertTrue("Result must contain address.", actual.contains("Mira st. 28-21"));
        Assert.assertTrue("Result must contain credit card number",
                actual.contains(String.valueOf(123000)));
        Assert.assertTrue("Result must contain bank account number",
                actual.contains(String.valueOf(123001)));
        Assert.assertTrue("Result must contain id", actual.contains(String.valueOf(1)));
    }

    @Test
    public void testNextId(){
        int actualId1 = customer.getId();
        int actualId2 = customer1.getId();
        int expectedId1 = 1;
        int expectedId2 = 2;
        Assert.assertEquals("Id must be equal to 1.", expectedId1,  actualId1);
        Assert.assertEquals("Id must be equal to 2.", expectedId2,  actualId2);
    }

    @AfterClass
    public static void cleanUpCustomer() {
        customer = null;
        customer1 = null;
    }
}
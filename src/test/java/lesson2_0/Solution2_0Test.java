package lesson2_0;

import org.junit.*;

import java.util.Arrays;

public class Solution2_0Test {
    private Solution2_0 solution2_0;

    @Before
    public void setUp() throws Exception {
        Customer customer = new Customer("Sakharova", "Nadya", "Alexseevna",
                "Mira st. 28-21", 123000, 123001);
        Customer customer1 = new Customer("Alehin", "Alexey", "Gennadyevich",
                "Mira st. 28-21", 123123, 123111);
        Customer customer2 = new Customer("Sakharova", "Natalya", "Valeryevna",
                "Mira st. 28-21", 123500, 123501);
        Customer customer3 = new Customer("Isaev", "Evgeniy", "Sergeevich",
                "Frunze 121 30", 123600, 123601);
        Customer customer4 = new Customer("Isaeva", "Irina", "Alexandrovna",
                "Mira st. 28-21", 123700, 123701);
        Customer[] customers = new Customer[]{customer, customer1, customer2, customer3, customer4};
        solution2_0 = new Solution2_0(customers);
    }

    @Test
    public void testSortCustomersByFIO() {
        String[] actualCustomers = solution2_0.sortCustomersByFIO();
        String[] expectedCustomers = new String[]{"Alehin Alexey Gennadyevich",
                "Isaev Evgeniy Sergeevich","Isaeva Irina Alexandrovna",
                "Sakharova Nadya Alexseevna", "Sakharova Natalya Valeryevna"};

            for (int i = 0; i < expectedCustomers.length; i++){
                Assert.assertEquals("Customer FIO array not equal to expected. " +
                                "Probably your array is not sorted.",
                        expectedCustomers[i], actualCustomers[i]);
            }
    }

    @Test
    public void testGetCustomersFromCardInterval() {
        int startOfInterval = 123500;
        int endOfInterval = 900000;
        String[] actualCustomers = solution2_0.getCustomersFromCardInterval(startOfInterval, endOfInterval);
        String[] expectedCustomers = new String[]{"Sakharova Natalya Valeryevna",
                "Isaev Evgeniy Sergeevich", "Isaeva Irina Alexandrovna"};

        for(String customerFIO: expectedCustomers){
            Assert.assertTrue("Result array not contain all customers.",
                    Arrays.asList(actualCustomers).contains(customerFIO));
        }
    }

    @Test
    public void testNoCustomersInSuchCardInterval() {
        int startOfInterval = 500000;
        int endOfInterval = 900000;
        String[] actualCustomers = solution2_0.getCustomersFromCardInterval(startOfInterval, endOfInterval);
        boolean empty = true;
        for (Object ob : actualCustomers) {
            if (ob != null) {
                empty = false;
                break;
            }
        }
        Assert.assertTrue(empty);
    }

    @Test
    public void testGetCustomersNotNull(){
        Customer[] actualCustomers = solution2_0.getCustomers();
        Assert.assertNotNull(actualCustomers);
    }
}
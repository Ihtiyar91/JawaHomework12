import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    Repository repo = new Repository();
    Manager manager = new Manager(repo);
    Ticket item1 = new Ticket(1,3000,"KZN" , "DME",80);
    Ticket item2 = new Ticket(2,7000,"SVO" , "KZN",240);
    Ticket item3 = new Ticket(3,5000,"EGO" , "DME",202);
    Ticket item4 = new Ticket(4,4000,"KZN" , "EGO",300);
    Ticket item5 = new Ticket(5,3000,"KZN" , "SVO",154);
    Ticket item6 = new Ticket(6,2000,"KZN" , "DME",90);
    @Test
    public void shouldRemoveIDTickets() {
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        repo.removeId(item2.getId());
        Ticket[] expected = {item1, item3};
        Ticket[] actual = repo.getSetTicket();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldOneTickets() {
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        Ticket[] expected = {item1};
        Ticket[] actual = manager.findAll("KZN","DME");

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldAllTickets() {
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        Ticket[] expected = {item6,item1};
        Ticket[] actual = manager.findAll("KZN","DME");

        Assertions.assertArrayEquals(expected, actual);
    }
}


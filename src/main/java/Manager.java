import java.util.Arrays;

public class Manager {
    private Repository repo;

    public Manager(Repository repo) {
        this.repo = repo;
    }
    public Ticket[] findAll(String from, String to) {
        return repo.getSetTicket();
    }
    public void add(Ticket ticket) {
        repo.add(ticket);
    }
    public Ticket[] searchBy(String text) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : repo.getSetTicket()) {
            if (matches(ticket, text)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = ticket;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }

    public boolean matches(Ticket ticket, String search) {

        return ticket.getFrom().contains(search);
    }
}

public class Ticket implements Comparable<Ticket> {
    private int id;
    private int price;
    private String from;
    private String to;
    private int traveltime;

    public Ticket(int id, int price, String from, String to, int traveltime) {
        this.id = id;
        this.price = price;
        this.from = from;
        this.to = to;
        this.traveltime = traveltime;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }


    public int getTraveltime() {
        return traveltime;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setTraveltime(int traveltime) {
        this.traveltime = traveltime;
    }

    @Override
    public int compareTo(Ticket o) {
        if (this.price < o.price) {
            return -1;
        } else if (this.price > o.price) {
            return 1;
        } else {
            return 0;
        }
    }
}
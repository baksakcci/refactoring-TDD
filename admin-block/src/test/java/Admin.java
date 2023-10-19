public class Admin {
    private Status status;

    public Admin() {
        this.status = Status.UNBLOCK;
    }

    public Status getStatus() {
        return this.status;
    }

    public Status blocking() {
        this.status = Status.BLOCK;
        return this.status;
    }
}

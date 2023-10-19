package org.example;

public class Admin {
    private Status status;

    public Admin() {
        this.status = Status.UNBLOCK;
    }

    public Status getStatus() {
        return this.status;
    }

    public Status blocking() throws IllegalAccessException {
        if (this.status == Status.BLOCK) {
            throw new IllegalAccessException("이미 차단되었습니다.");
        }
        this.status = Status.BLOCK;
        return this.status;
    }

    public Status unblocking() {
        this.status = Status.UNBLOCK;
        return this.status;
    }
}

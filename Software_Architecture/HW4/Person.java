package Software_Architecture.HW4;

import java.util.UUID;

public class Person {
    private UUID id;
    private String FIO;
    private String cardNumber;
    private long hashPass;
    private String login;

    public Person(String fio, long hashPass, String login) {
        this.id = UUID.randomUUID();
        this.FIO = fio;
        this.hashPass = hashPass;
        this.login = login;
    }

    public UUID getId() {
        return id;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFio(String fio) {
        this.FIO = FIO;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getHashPass() {
        return hashPass;
    }

    public void setHashPass(long hashPass) {
        this.hashPass = hashPass;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}

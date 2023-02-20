package banque;

import java.time.LocalDateTime;

public final class Client {

    private String name;
    private String firstName;
    private LocalDateTime birthDayDate;
    private LocalDateTime openDateFirstBank;

    // ******************************  CONSTRUCTEURS ******************************************
    public Client(String name, String firstName, LocalDateTime birthDayDate) {

        this.setName(name);
        this.setFirstName(firstName);
        this.setBirthDayDate(birthDayDate);
        this.setOpenDateFirstBank(LocalDateTime.now());
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDateTime getBirthDayDate() {
        return birthDayDate;
    }

    void setBirthDayDate(LocalDateTime birthDayDate) {
        this.birthDayDate = birthDayDate;
    }

    public LocalDateTime getOpenDateFirstBank() {
        return openDateFirstBank;
    }

    void setOpenDateFirstBank(LocalDateTime openDateFirstBank) {
        this.openDateFirstBank = openDateFirstBank;
    }

}


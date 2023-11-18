package clubmanagement;

import java.time.LocalDate;

public class Membership {
    private Person member;
    private LocalDate registrationDate;

    public Membership(Person member, LocalDate registrationDate) {
        this.member = member;
        this.registrationDate = registrationDate;
    }

    // Getter and Setter methods
    public Person getMember() {
        return member;
    }

    public void setMember(Person member) {
        this.member = member;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "Membership{" +
                "member=" + member +
                ", registrationDate=" + registrationDate +
                '}';
    }
}


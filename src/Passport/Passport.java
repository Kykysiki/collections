package Passport;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private final int number;
    private final String lastName;
    private final String name;

    private final String middleName;
    private final LocalDate localeDate;

    public Passport(int number, String lastName, String name, String middleName, LocalDate localeDate) {
        this.number = number;
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.localeDate = localeDate;
    }

    public int getNumber() {
        return number;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getLocaleDate() {
        return localeDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}

package models.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

    public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate dueDate;
    private double amount;

    public Installment(LocalDate dueDate, double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return dueDate.format(fmt) + " - " + String.format("%.2f", amount);
    }
}

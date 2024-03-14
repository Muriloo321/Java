package models.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

    private Integer number;
    private LocalDate date;
    private double totalValue;

    private List<Installment> installmentList = new ArrayList<>();

    public Contract(Integer number, LocalDate date, double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public List<Installment> getInstallmentList() {
        return installmentList;
    }
}

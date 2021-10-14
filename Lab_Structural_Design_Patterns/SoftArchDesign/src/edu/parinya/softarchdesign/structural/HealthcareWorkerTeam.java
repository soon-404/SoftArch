package edu.parinya.softarchdesign.structural;

import java.util.ArrayList;

public class HealthcareWorkerTeam implements HealthcareServiceable{

    private ArrayList<HealthcareServiceable> members = new ArrayList<>();
    public void addMember(HealthcareServiceable name) {
        members.add(name);
    }

    public void removeMember(HealthcareServiceable name) {
        members.remove(name);
    }

    @Override
    public void service() {
        for (HealthcareServiceable person : members) {
            person.service();
        }
    }

    @Override
    public double getPrice()
    {
        double price = 0;
        for (HealthcareServiceable person : members) {
            price += person.getPrice();
        }
        return price;
    }
}

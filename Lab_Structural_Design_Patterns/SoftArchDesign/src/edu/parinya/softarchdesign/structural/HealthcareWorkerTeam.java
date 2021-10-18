package edu.parinya.softarchdesign.structural;

import java.util.Set;
import java.util.LinkedHashSet;

public class HealthcareWorkerTeam implements HealthcareServiceable{

    private Set<HealthcareServiceable> members = new LinkedHashSet<HealthcareServiceable>();
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

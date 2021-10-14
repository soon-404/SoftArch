package edu.parinya.softarchdesign.structural;

public abstract class HealthcareWorkerDecorator extends HealthcareWorker{
    protected HealthcareServiceable work;

    public HealthcareWorkerDecorator(HealthcareWorker worker) {
        super(worker);
        this.work = worker;
    }
    @Override
    public void service() {
        work.service();
    }

    @Override
    public double getPrice() {
        return work.getPrice();
    }


}

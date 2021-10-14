package edu.parinya.softarchdesign.structural;

public class TimeLoggingHealthcareWorker extends HealthcareWorkerDecorator{
    public TimeLoggingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
        System.out.println("Decorate " + worker.getName() +  " with TimeLogging.");
    }

    @Override
    public void service() {
        System.out.print("Thu Oct 14 00:57:26 ICT 2021: ");
        super.service();
    }
}

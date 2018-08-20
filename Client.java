package test;

import java.util.Date;

public class Client extends Person {

    private int idClient;
    private Date registrationDate;
    private boolean vip;
    private static int clientCounter;

    public Client(Date registrationDate, boolean vip) {
        this.idClient = ++clientCounter;
        this.registrationDate = registrationDate;
        this.vip = vip;
    }

    public int getIdClient() {
        return idClient;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        //first we print the parent attributes of the parent class
        //after that we print the child attributes of the child class
        return super.toString() + " Client{" + "idClient=" + idClient + ", registrationDate=" + registrationDate + ", vip=" + vip + '}';
    }
}

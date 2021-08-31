package model;

public abstract class Document {
    protected int ID;
    protected String producer;
    protected int releaseNumber;

    public Document(int ID, String producer, int releaseNumber) {
        this.ID = ID;
        this.producer = producer;
        this.releaseNumber = releaseNumber;
    }

    public int getID() {
        return ID;
    }

    public abstract double calcualateCost();

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getProducer(String s) {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getReleaseNumber(String s) {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }
}


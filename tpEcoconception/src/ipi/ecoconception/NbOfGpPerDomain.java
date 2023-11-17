package ipi.ecoconception;

public class NbOfGpPerDomain {
    private String domain;
    private int numberOfGoodPractices;

    public NbOfGpPerDomain(String domain, int numberOfGoodPractices) {
        this.domain = domain; 
        this.numberOfGoodPractices = numberOfGoodPractices;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getNumberOfGoodPractices() {
        return numberOfGoodPractices;
    }

    public void setNumberOfGoodPractices(int numberOfGoodPractices) {
        this.numberOfGoodPractices = numberOfGoodPractices;
    }
}


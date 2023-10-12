public class TransactionClass {

    private  int routingNumber;
    private  int Cutomerid;
    private  long transactionid;

    private  double transactionAmount;

    public TransactionClass(int routingNumber, int cutomerid, long transactionid, double transactionAmount) {
        this.routingNumber = routingNumber;
        Cutomerid = cutomerid;
        this.transactionid = transactionid;
        this.transactionAmount = transactionAmount;
    }

    public int getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(int routingNumber) {
        this.routingNumber = routingNumber;
    }

    public int getCutomerid() {
        return Cutomerid;
    }

    public void setCutomerid(int cutomerid) {
        Cutomerid = cutomerid;
    }

    public long getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(long transactionid) {
        this.transactionid = transactionid;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    @Override
    public String toString() {
        return "TransactionClass{" +
                "routingNumber=" + routingNumber +
                ", Cutomerid=" + Cutomerid +
                ", transactionid=" + transactionid +
                ", transactionAmount=" + transactionAmount +
                '}';
    }
}

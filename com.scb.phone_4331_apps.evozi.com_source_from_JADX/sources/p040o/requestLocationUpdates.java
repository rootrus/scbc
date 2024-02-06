package p040o;

/* renamed from: o.requestLocationUpdates */
public enum requestLocationUpdates {
    TRANSFER("TRANSFER"),
    BILLPAYMENT("BILLPAYMENT"),
    TOPUP("TOPUP"),
    DISPLAY("DISPLAY");
    
    public final String function;

    private requestLocationUpdates(String str) {
        this.function = str;
    }
}

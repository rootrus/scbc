package p040o;

/* renamed from: o.PayNowApi */
public enum PayNowApi {
    RECEIVED("RECEIVED"),
    ISSUED("ISSUED");
    
    private String status;

    private PayNowApi(String str) {
        this.status = str;
    }
}

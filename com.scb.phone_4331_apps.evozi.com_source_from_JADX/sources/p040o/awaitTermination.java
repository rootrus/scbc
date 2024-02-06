package p040o;

/* renamed from: o.awaitTermination */
public enum awaitTermination {
    ENABLED("ENABLED"),
    DISABLED("DISABLED"),
    HIDDEN("HIDDEN");
    
    public final String type;

    private awaitTermination(String str) {
        this.type = str;
    }
}

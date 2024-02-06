package p040o;

/* renamed from: o.getCurrentSessionId */
public enum getCurrentSessionId {
    ITEM(1),
    LOADING(2),
    HEADER(3),
    FOOTER(4);
    
    public final int viewType;

    private getCurrentSessionId(int i) {
        this.viewType = i;
    }
}

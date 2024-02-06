package p040o;

/* renamed from: o.getPc */
public enum getPc {
    NO_PROMPTPAY(1),
    NO_RTP(2),
    HAVE_PROMPTPAY_WITH_RTP(3);
    
    private int type;

    private getPc(int i) {
        this.type = i;
    }

    public static getPc MediaBrowserCompat$CustomActionResultReceiver(int i) {
        getPc getpc = NO_PROMPTPAY;
        if (getpc.type == i) {
            return getpc;
        }
        getPc getpc2 = NO_RTP;
        if (getpc2.type == i) {
            return getpc2;
        }
        getPc getpc3 = HAVE_PROMPTPAY_WITH_RTP;
        return getpc3.type == i ? getpc3 : getpc;
    }
}

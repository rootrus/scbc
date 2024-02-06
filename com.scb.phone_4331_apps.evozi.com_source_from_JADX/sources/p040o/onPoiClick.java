package p040o;

/* renamed from: o.onPoiClick */
public enum onPoiClick {
    NO_PROMPTPAY(1),
    NO_RTP(2),
    HAVE_PROMPTPAY_WITH_RTP(3),
    PROMPT_PAY_QR_EDIT(4),
    PROMPT_PAY_QR_SUCCESS(5);
    
    public int type;

    private onPoiClick(int i) {
        this.type = i;
    }

    public static onPoiClick MediaBrowserCompat$CustomActionResultReceiver(int i) {
        onPoiClick onpoiclick = NO_PROMPTPAY;
        if (onpoiclick.type == i) {
            return onpoiclick;
        }
        onPoiClick onpoiclick2 = NO_RTP;
        if (onpoiclick2.type == i) {
            return onpoiclick2;
        }
        onPoiClick onpoiclick3 = HAVE_PROMPTPAY_WITH_RTP;
        if (onpoiclick3.type == i) {
            return onpoiclick3;
        }
        onPoiClick onpoiclick4 = PROMPT_PAY_QR_EDIT;
        if (onpoiclick4.type == i) {
            return onpoiclick4;
        }
        onPoiClick onpoiclick5 = PROMPT_PAY_QR_SUCCESS;
        return onpoiclick5.type == i ? onpoiclick5 : onpoiclick;
    }
}

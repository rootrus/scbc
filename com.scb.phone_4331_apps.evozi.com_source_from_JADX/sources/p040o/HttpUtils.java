package p040o;

/* renamed from: o.HttpUtils */
public final /* synthetic */ class HttpUtils implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ HttpUtils MediaBrowserCompat$CustomActionResultReceiver = new HttpUtils();

    private /* synthetic */ HttpUtils() {
    }

    public final Object write(Object obj) {
        setCurrentItemInternal setcurrentiteminternal = (setCurrentItemInternal) obj;
        return Boolean.valueOf(setcurrentiteminternal.getStatus() != null && "1000".equals(setcurrentiteminternal.getStatus().write()));
    }
}

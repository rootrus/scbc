package p040o;

/* renamed from: o.IOUtils */
public final /* synthetic */ class IOUtils implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ IOUtils write = new IOUtils();

    private /* synthetic */ IOUtils() {
    }

    public final Object write(Object obj) {
        setCurrentItemInternal setcurrentiteminternal = (setCurrentItemInternal) obj;
        return Boolean.valueOf(setcurrentiteminternal.getStatus() != null && "1000".equals(setcurrentiteminternal.getStatus().write()));
    }
}

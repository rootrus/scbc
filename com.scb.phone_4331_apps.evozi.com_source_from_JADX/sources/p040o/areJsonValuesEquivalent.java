package p040o;

/* renamed from: o.areJsonValuesEquivalent */
public final /* synthetic */ class areJsonValuesEquivalent implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ areJsonValuesEquivalent read = new areJsonValuesEquivalent();

    private /* synthetic */ areJsonValuesEquivalent() {
    }

    public final Object write(Object obj) {
        setCurrentItemInternal setcurrentiteminternal = (setCurrentItemInternal) obj;
        return Boolean.valueOf(setcurrentiteminternal.getStatus() != null && "1000".equals(setcurrentiteminternal.getStatus().write()));
    }
}

package p040o;

/* renamed from: o.MemoryHelper */
public final /* synthetic */ class MemoryHelper implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ registerNewObjectListener read;

    public /* synthetic */ MemoryHelper(registerNewObjectListener registernewobjectlistener) {
        this.read = registernewobjectlistener;
    }

    public final void IconCompatParcelizer(Object obj) {
        registerNewObjectListener registernewobjectlistener = this.read;
        C10897getEPC getepc = new C10897getEPC(registernewobjectlistener, (Throwable) obj);
        if (registernewobjectlistener.RatingCompat != null) {
            getepc.IconCompatParcelizer(registernewobjectlistener.RatingCompat);
        }
    }
}

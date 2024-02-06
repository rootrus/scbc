package p040o;

/* renamed from: o.dZ */
public final /* synthetic */ class C4272dZ implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ C4300dt read;

    public /* synthetic */ C4272dZ(C4300dt dtVar) {
        this.read = dtVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4300dt dtVar = this.read;
        C4287dl dlVar = C4287dl.IconCompatParcelizer;
        if (dtVar.RatingCompat != null) {
            dlVar.IconCompatParcelizer(dtVar.RatingCompat);
        }
    }
}

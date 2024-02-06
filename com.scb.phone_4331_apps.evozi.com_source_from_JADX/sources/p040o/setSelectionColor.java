package p040o;

/* renamed from: o.setSelectionColor */
public final /* synthetic */ class setSelectionColor implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ C4114bu read;

    public /* synthetic */ setSelectionColor(C4114bu buVar) {
        this.read = buVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4114bu buVar = this.read;
        boolean z = true;
        if (buVar.RatingCompat != null) {
            buVar.RatingCompat.aj_();
        }
        NullPointerException nullPointerException = NullPointerException.write;
        if (buVar.RatingCompat == null) {
            z = false;
        }
        if (z) {
            nullPointerException.IconCompatParcelizer(buVar.RatingCompat);
        }
    }
}

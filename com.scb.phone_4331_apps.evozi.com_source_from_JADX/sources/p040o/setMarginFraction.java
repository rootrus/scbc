package p040o;

/* renamed from: o.setMarginFraction */
public final /* synthetic */ class setMarginFraction implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ getStringValues write;

    public /* synthetic */ setMarginFraction(getStringValues getstringvalues) {
        this.write = getstringvalues;
    }

    public final void IconCompatParcelizer(Object obj) {
        getStringValues getstringvalues = this.write;
        setWidth setwidth = (setWidth) obj;
        boolean z = true;
        if (getstringvalues.RatingCompat != null) {
            getstringvalues.RatingCompat.aj_();
        }
        DPAndroidException dPAndroidException = new DPAndroidException(setwidth);
        if (getstringvalues.RatingCompat == null) {
            z = false;
        }
        if (z) {
            dPAndroidException.IconCompatParcelizer(getstringvalues.RatingCompat);
        }
    }
}

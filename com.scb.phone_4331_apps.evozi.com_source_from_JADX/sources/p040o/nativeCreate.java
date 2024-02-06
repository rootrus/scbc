package p040o;

/* renamed from: o.nativeCreate */
public final /* synthetic */ class nativeCreate implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ setBoolValue read;

    public /* synthetic */ nativeCreate(setBoolValue setboolvalue) {
        this.read = setboolvalue;
    }

    public final void IconCompatParcelizer(Object obj) {
        setBoolValue setboolvalue = this.read;
        boolean z = true;
        if (setboolvalue.RatingCompat != null) {
            setboolvalue.RatingCompat.aj_();
        }
        nativeLoadFromString nativeloadfromstring = nativeLoadFromString.write;
        if (setboolvalue.RatingCompat == null) {
            z = false;
        }
        if (z) {
            nativeloadfromstring.IconCompatParcelizer(setboolvalue.RatingCompat);
        }
    }
}

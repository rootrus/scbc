package p040o;

/* renamed from: o.ba */
public final /* synthetic */ class C9867ba implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ getOCRDescription MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C9867ba(getOCRDescription getocrdescription) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getocrdescription;
    }

    public final void IconCompatParcelizer(Object obj) {
        getOCRDescription getocrdescription = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = true;
        if (getocrdescription.RatingCompat != null) {
            getocrdescription.RatingCompat.aj_();
        }
        getPropertyType getpropertytype = getPropertyType.IconCompatParcelizer;
        if (getocrdescription.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getpropertytype.IconCompatParcelizer(getocrdescription.RatingCompat);
        }
    }
}

package p040o;

/* renamed from: o.setTitleFormatter */
public final /* synthetic */ class setTitleFormatter implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ C4114bu MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setTitleFormatter(C4114bu buVar) {
        this.MediaBrowserCompat$CustomActionResultReceiver = buVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4114bu buVar = this.MediaBrowserCompat$CustomActionResultReceiver;
        Boolean bool = (Boolean) obj;
        boolean z = true;
        if (buVar.RatingCompat != null) {
            buVar.RatingCompat.aj_();
        }
        if (bool.booleanValue()) {
            setUserInstructionMessageTextSize setuserinstructionmessagetextsize = setUserInstructionMessageTextSize.write;
            if (buVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setuserinstructionmessagetextsize.IconCompatParcelizer(buVar.RatingCompat);
                return;
            }
            return;
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

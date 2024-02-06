package p040o;

/* renamed from: o.setZoomInMessage */
public final /* synthetic */ class setZoomInMessage implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ getSteadyMessage write;

    public /* synthetic */ setZoomInMessage(getSteadyMessage getsteadymessage) {
        this.write = getsteadymessage;
    }

    public final void IconCompatParcelizer(Object obj) {
        getSteadyMessage getsteadymessage = this.write;
        boolean z = true;
        if (getsteadymessage.RatingCompat != null) {
            getsteadymessage.RatingCompat.aj_();
        }
        inject_captureController inject_capturecontroller = inject_captureController.MediaBrowserCompat$CustomActionResultReceiver;
        if (getsteadymessage.RatingCompat == null) {
            z = false;
        }
        if (z) {
            inject_capturecontroller.IconCompatParcelizer(getsteadymessage.RatingCompat);
        }
    }
}

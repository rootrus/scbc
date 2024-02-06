package p040o;

/* renamed from: o.setZoomOutMessage */
public final /* synthetic */ class setZoomOutMessage implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ getSteadyMessage read;

    public /* synthetic */ setZoomOutMessage(getSteadyMessage getsteadymessage) {
        this.read = getsteadymessage;
    }

    public final void IconCompatParcelizer(Object obj) {
        getSteadyMessage getsteadymessage = this.read;
        boolean z = true;
        if (getsteadymessage.RatingCompat != null) {
            getsteadymessage.RatingCompat.aj_();
        }
        setHoldSteadyDelay setholdsteadydelay = setHoldSteadyDelay.write;
        if (getsteadymessage.RatingCompat == null) {
            z = false;
        }
        if (z) {
            setholdsteadydelay.IconCompatParcelizer(getsteadymessage.RatingCompat);
        }
    }
}

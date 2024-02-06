package p040o;

/* renamed from: o.fZ */
public final /* synthetic */ class C4413fZ implements Runnable {
    private final /* synthetic */ C4419fc MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C4413fZ(C4419fc fcVar) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fcVar;
    }

    public final void run() {
        C4419fc fcVar = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = true;
        if (fcVar.RatingCompat != null) {
            C4407fS fSVar = C4407fS.IconCompatParcelizer;
            if (fcVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                fSVar.IconCompatParcelizer(fcVar.RatingCompat);
            }
            fcVar.MediaDescriptionCompat = null;
        }
    }
}

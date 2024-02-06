package p040o;

import p040o.getTextSize;

/* renamed from: o.isRefocusBeforeCaptureEnabled */
public final /* synthetic */ class isRefocusBeforeCaptureEnabled implements Runnable {
    private final /* synthetic */ getTextSize.C46725 MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ isRefocusBeforeCaptureEnabled(getTextSize.C46725 r1) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
    }

    public final void run() {
        getTextSize gettextsize = getTextSize.this;
        setCriteriaMet setcriteriamet = setCriteriaMet.MediaBrowserCompat$CustomActionResultReceiver;
        if (gettextsize.RatingCompat != null) {
            setcriteriamet.IconCompatParcelizer(gettextsize.RatingCompat);
        }
    }
}

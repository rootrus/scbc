package p040o;

import p040o.showTextMessage;

/* renamed from: o.hX */
public final /* synthetic */ class C4737hX implements Runnable {
    private final /* synthetic */ showTextMessage.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C4737hX(showTextMessage.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
    }

    public final void run() {
        showTextMessage showtextmessage = showTextMessage.this;
        hideProgressBar hideprogressbar = hideProgressBar.MediaBrowserCompat$ItemReceiver;
        if (showtextmessage.RatingCompat != null) {
            hideprogressbar.IconCompatParcelizer(showtextmessage.RatingCompat);
        }
    }
}

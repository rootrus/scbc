package p040o;

import com.scb.phone.view.activity.prelogin.PinLoginActivity;

/* renamed from: o.getLeftArrowMask */
public final /* synthetic */ class getLeftArrowMask implements Runnable {
    private final /* synthetic */ PinLoginActivity MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getLeftArrowMask(PinLoginActivity pinLoginActivity) {
        this.MediaBrowserCompat$ItemReceiver = pinLoginActivity;
    }

    public final void run() {
        PinLoginActivity pinLoginActivity = this.MediaBrowserCompat$ItemReceiver;
        pinLoginActivity.MediaBrowserCompat$SearchResultReceiver.dismiss();
        pinLoginActivity.presenter.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
    }
}

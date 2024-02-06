package p040o;

import com.scb.phone.data.network.service.DirectDebitService;

/* renamed from: o.ho$MediaBrowserCompat$ItemReceiver */
public final class ho$MediaBrowserCompat$ItemReceiver {
    public final DirectDebitService MediaBrowserCompat$CustomActionResultReceiver;

    private ho$MediaBrowserCompat$ItemReceiver() {
    }

    @HmlPinActivity
    public ho$MediaBrowserCompat$ItemReceiver(DirectDebitService directDebitService) {
        onGetStartedClick.write((Object) directDebitService, "directDebitService");
        this.MediaBrowserCompat$CustomActionResultReceiver = directDebitService;
    }
}

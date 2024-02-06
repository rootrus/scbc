package p040o;

import com.scb.phone.view.activity.ndid.IdpShareInformationActivity;

/* renamed from: o.setMinimumDate */
public final /* synthetic */ class setMinimumDate implements Runnable {
    private final /* synthetic */ IdpShareInformationActivity MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setMinimumDate(IdpShareInformationActivity idpShareInformationActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = idpShareInformationActivity;
    }

    public final void run() {
        this.MediaBrowserCompat$CustomActionResultReceiver.read();
    }
}

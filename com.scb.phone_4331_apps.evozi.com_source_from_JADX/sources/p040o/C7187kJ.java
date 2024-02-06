package p040o;

import com.scb.phone.view.activity.cardmanagement.deejungtransfer.DeejungTransferLandingActivity;
import org.jmrtd.cbeff.ISO781611;

/* renamed from: o.kJ */
public final /* synthetic */ class C7187kJ implements Runnable {
    private final /* synthetic */ DeejungTransferLandingActivity MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C7187kJ(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        this.MediaBrowserCompat$ItemReceiver = deejungTransferLandingActivity;
    }

    public final void run() {
        this.MediaBrowserCompat$ItemReceiver.scrollView.fullScroll(ISO781611.BIOMETRIC_SUBTYPE_TAG);
    }
}

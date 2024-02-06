package p040o;

import com.scb.phone.view.fragment.demo.ntb.NTBLifestyleLandingFragment;

/* renamed from: o.editOperatingAccount */
public final /* synthetic */ class editOperatingAccount implements Runnable {
    private final /* synthetic */ NTBLifestyleLandingFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ editOperatingAccount(NTBLifestyleLandingFragment nTBLifestyleLandingFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = nTBLifestyleLandingFragment;
    }

    public final void run() {
        this.MediaBrowserCompat$CustomActionResultReceiver.staticTapToRetry.setVisibility(8);
    }
}

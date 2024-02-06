package p040o;

import com.scb.phone.view.fragment.demo.ntb.NTBLifestyleLandingFragment;

/* renamed from: o.checkPrerequisite */
public final /* synthetic */ class checkPrerequisite implements Runnable {
    private final /* synthetic */ NTBLifestyleLandingFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ checkPrerequisite(NTBLifestyleLandingFragment nTBLifestyleLandingFragment) {
        this.MediaBrowserCompat$ItemReceiver = nTBLifestyleLandingFragment;
    }

    public final void run() {
        NTBLifestyleLandingFragment nTBLifestyleLandingFragment = this.MediaBrowserCompat$ItemReceiver;
        nTBLifestyleLandingFragment.staticLoadingImageView.clearAnimation();
        nTBLifestyleLandingFragment.staticLoadingImageView.setVisibility(8);
    }
}

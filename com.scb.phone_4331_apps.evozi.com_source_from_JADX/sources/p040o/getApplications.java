package p040o;

import android.widget.LinearLayout;
import com.scb.phone.view.fragment.demo.ntb.NTBLifestyleLandingFragment;

/* renamed from: o.getApplications */
public final /* synthetic */ class getApplications implements Runnable {
    private final /* synthetic */ NTBLifestyleLandingFragment read;

    public /* synthetic */ getApplications(NTBLifestyleLandingFragment nTBLifestyleLandingFragment) {
        this.read = nTBLifestyleLandingFragment;
    }

    public final void run() {
        NTBLifestyleLandingFragment nTBLifestyleLandingFragment = this.read;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) nTBLifestyleLandingFragment.staticTapToRetry.getLayoutParams();
        layoutParams.height = nTBLifestyleLandingFragment.setItemInvoker();
        nTBLifestyleLandingFragment.staticTapToRetry.setLayoutParams(layoutParams);
        nTBLifestyleLandingFragment.staticTapToRetry.setVisibility(0);
    }
}

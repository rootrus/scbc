package p040o;

import android.animation.ObjectAnimator;
import android.widget.LinearLayout;
import com.scb.phone.view.fragment.demo.ntb.NTBLifestyleLandingFragment;

/* renamed from: o.deleteOperatingAccount */
public final /* synthetic */ class deleteOperatingAccount implements Runnable {
    private final /* synthetic */ NTBLifestyleLandingFragment write;

    public /* synthetic */ deleteOperatingAccount(NTBLifestyleLandingFragment nTBLifestyleLandingFragment) {
        this.write = nTBLifestyleLandingFragment;
    }

    public final void run() {
        NTBLifestyleLandingFragment nTBLifestyleLandingFragment = this.write;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) nTBLifestyleLandingFragment.staticLoadingImageView.getLayoutParams();
        layoutParams.height = nTBLifestyleLandingFragment.setItemInvoker();
        nTBLifestyleLandingFragment.staticLoadingImageView.setLayoutParams(layoutParams);
        nTBLifestyleLandingFragment.staticLoadingImageView.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nTBLifestyleLandingFragment.staticLoadingImageView, "alpha", new float[]{0.3f, 1.0f, 0.3f});
        ofFloat.setDuration(1500);
        ofFloat.setRepeatCount(-1);
        ofFloat.start();
    }
}

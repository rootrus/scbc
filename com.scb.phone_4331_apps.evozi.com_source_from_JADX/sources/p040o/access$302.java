package p040o;

import android.content.Context;
import com.scb.phone.view.activity.BaseActivity$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.investment.onboarding.FundOnboardingSuccessActivity;

/* renamed from: o.access$302 */
public final /* synthetic */ class access$302 implements BaseActivity$MediaBrowserCompat$CustomActionResultReceiver {
    private final /* synthetic */ FundOnboardingSuccessActivity write;

    public /* synthetic */ access$302(FundOnboardingSuccessActivity fundOnboardingSuccessActivity) {
        this.write = fundOnboardingSuccessActivity;
    }

    public final void write() {
        HomeActivity.write((Context) this.write, true);
    }
}

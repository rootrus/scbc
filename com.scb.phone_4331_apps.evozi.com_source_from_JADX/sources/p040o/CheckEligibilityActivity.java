package p040o;

import java.io.Serializable;

/* renamed from: o.CheckEligibilityActivity */
public abstract class CheckEligibilityActivity<R> implements NtbDiscoverFundFilterListActivity<R>, Serializable {
    private final int arity;

    public CheckEligibilityActivity(int i) {
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String MediaBrowserCompat$CustomActionResultReceiver = FundOnboardingLandingActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(this);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "Reflection.renderLambdaToString(this)");
        return MediaBrowserCompat$CustomActionResultReceiver;
    }
}

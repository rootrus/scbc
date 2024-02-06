package p040o;

import p040o.HmlPromptPayVerificationActivity;

/* renamed from: o.HmlNTBSelectAccountActivity */
public abstract class HmlNTBSelectAccountActivity implements HmlPromptPayVerificationActivity.IconCompatParcelizer {
    private final HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver<?> IconCompatParcelizer;

    public HmlNTBSelectAccountActivity(HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver<?> hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver, "key");
        this.IconCompatParcelizer = hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver;
    }

    public <E extends HmlPromptPayVerificationActivity.IconCompatParcelizer> E IconCompatParcelizer(HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver<E> hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver, "key");
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver, "key");
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) MediaBrowserCompat$ItemReceiver(), (Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver)) {
            return null;
        }
        return this;
    }

    public final HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver<?> MediaBrowserCompat$ItemReceiver() {
        return this.IconCompatParcelizer;
    }

    public <R> R read(R r, BaseDiscoverFundFilterActivity<? super R, ? super HmlPromptPayVerificationActivity.IconCompatParcelizer, ? extends R> baseDiscoverFundFilterActivity) {
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "operation");
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "operation");
        return baseDiscoverFundFilterActivity.MediaBrowserCompat$CustomActionResultReceiver(r, this);
    }

    public HmlPromptPayVerificationActivity read(HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver<?> hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver, "key");
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver, "key");
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) MediaBrowserCompat$ItemReceiver(), (Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver) ? HmlPromptPayAboutActivity.IconCompatParcelizer : this;
    }

    public HmlPromptPayVerificationActivity MediaBrowserCompat$ItemReceiver(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity2 = this;
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        return hmlPromptPayVerificationActivity != HmlPromptPayAboutActivity.IconCompatParcelizer ? (HmlPromptPayVerificationActivity) hmlPromptPayVerificationActivity.read(hmlPromptPayVerificationActivity2, C6894x2375c6f.write) : hmlPromptPayVerificationActivity2;
    }
}

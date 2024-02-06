package p040o;

import java.io.Serializable;
import p040o.HmlPromptPayVerificationActivity;

/* renamed from: o.HmlPromptPayAboutActivity */
public final class HmlPromptPayAboutActivity implements HmlPromptPayVerificationActivity, Serializable {
    public static final HmlPromptPayAboutActivity IconCompatParcelizer = new HmlPromptPayAboutActivity();

    public final <E extends HmlPromptPayVerificationActivity.IconCompatParcelizer> E IconCompatParcelizer(HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver<E> hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver, "key");
        return null;
    }

    public final HmlPromptPayVerificationActivity MediaBrowserCompat$ItemReceiver(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        return hmlPromptPayVerificationActivity;
    }

    public final int hashCode() {
        return 0;
    }

    public final <R> R read(R r, BaseDiscoverFundFilterActivity<? super R, ? super HmlPromptPayVerificationActivity.IconCompatParcelizer, ? extends R> baseDiscoverFundFilterActivity) {
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "operation");
        return r;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    private HmlPromptPayAboutActivity() {
    }

    private final Object readResolve() {
        return IconCompatParcelizer;
    }

    public final HmlPromptPayVerificationActivity read(HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver<?> hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver, "key");
        return this;
    }
}

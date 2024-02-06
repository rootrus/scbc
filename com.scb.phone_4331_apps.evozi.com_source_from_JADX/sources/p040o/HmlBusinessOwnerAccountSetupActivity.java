package p040o;

import java.io.Serializable;

/* renamed from: o.HmlBusinessOwnerAccountSetupActivity */
public final class HmlBusinessOwnerAccountSetupActivity<T> implements HmlVerifyEmailActivity<T>, Serializable {
    private FundActionsSuccessActivity<? extends T> IconCompatParcelizer;
    private Object read = HmlVerifyPhoneReviewActivity.IconCompatParcelizer;

    public HmlBusinessOwnerAccountSetupActivity(FundActionsSuccessActivity<? extends T> fundActionsSuccessActivity) {
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.IconCompatParcelizer = fundActionsSuccessActivity;
    }

    public final T MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.read == HmlVerifyPhoneReviewActivity.IconCompatParcelizer) {
            FundActionsSuccessActivity<? extends T> fundActionsSuccessActivity = this.IconCompatParcelizer;
            if (fundActionsSuccessActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            this.read = fundActionsSuccessActivity.invoke();
            this.IconCompatParcelizer = null;
        }
        return this.read;
    }

    private final Object writeReplace() {
        return new HmlUserInfoActivity(MediaBrowserCompat$CustomActionResultReceiver());
    }

    public final String toString() {
        return this.read != HmlVerifyPhoneReviewActivity.IconCompatParcelizer ? String.valueOf(MediaBrowserCompat$CustomActionResultReceiver()) : "Lazy value not initialized yet.";
    }
}

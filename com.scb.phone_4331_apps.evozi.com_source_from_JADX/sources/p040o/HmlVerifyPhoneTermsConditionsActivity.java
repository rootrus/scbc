package p040o;

import java.io.Serializable;

/* renamed from: o.HmlVerifyPhoneTermsConditionsActivity */
public final class HmlVerifyPhoneTermsConditionsActivity<T> implements HmlVerifyEmailActivity<T>, Serializable {
    private final Object IconCompatParcelizer;
    private FundActionsSuccessActivity<? extends T> MediaBrowserCompat$CustomActionResultReceiver;
    private volatile Object write;

    public /* synthetic */ HmlVerifyPhoneTermsConditionsActivity(FundActionsSuccessActivity fundActionsSuccessActivity) {
        this(fundActionsSuccessActivity, (Object) null);
    }

    private HmlVerifyPhoneTermsConditionsActivity(FundActionsSuccessActivity<? extends T> fundActionsSuccessActivity, Object obj) {
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaBrowserCompat$CustomActionResultReceiver = fundActionsSuccessActivity;
        this.write = HmlVerifyPhoneReviewActivity.IconCompatParcelizer;
        this.IconCompatParcelizer = this;
    }

    public final T MediaBrowserCompat$CustomActionResultReceiver() {
        T t;
        T t2 = this.write;
        if (t2 != HmlVerifyPhoneReviewActivity.IconCompatParcelizer) {
            return t2;
        }
        synchronized (this.IconCompatParcelizer) {
            t = this.write;
            if (t == HmlVerifyPhoneReviewActivity.IconCompatParcelizer) {
                FundActionsSuccessActivity fundActionsSuccessActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (fundActionsSuccessActivity == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                t = fundActionsSuccessActivity.invoke();
                this.write = t;
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
            }
        }
        return t;
    }

    private final Object writeReplace() {
        return new HmlUserInfoActivity(MediaBrowserCompat$CustomActionResultReceiver());
    }

    public final String toString() {
        return this.write != HmlVerifyPhoneReviewActivity.IconCompatParcelizer ? String.valueOf(MediaBrowserCompat$CustomActionResultReceiver()) : "Lazy value not initialized yet.";
    }
}

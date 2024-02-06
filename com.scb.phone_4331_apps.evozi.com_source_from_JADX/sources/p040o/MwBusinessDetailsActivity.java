package p040o;

import p040o.HmlPromptPayVerificationActivity;

/* renamed from: o.MwBusinessDetailsActivity */
public abstract class MwBusinessDetailsActivity extends HmlNTBSelectAccountActivity implements HmlNTBPromptPayNotFoundActivity_ViewBinding {
    public abstract void IconCompatParcelizer(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, Runnable runnable);

    public boolean write(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        return true;
    }

    public final <E extends HmlPromptPayVerificationActivity.IconCompatParcelizer> E IconCompatParcelizer(HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver<E> hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver, "key");
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver, "key");
        E e = null;
        if (!(hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver instanceof onContactCallCenterClicked)) {
            return HmlNTBPromptPayNotFoundActivity_ViewBinding.write == hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver ? this : e;
        }
        HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver<?> MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver();
        onGetStartedClick.write((Object) MediaBrowserCompat$ItemReceiver, "key");
        if (!(MediaBrowserCompat$ItemReceiver == ((onContactCallCenterClicked) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver) || MediaBrowserCompat$ItemReceiver == null)) {
            return e;
        }
        HmlPromptPayVerificationActivity.IconCompatParcelizer iconCompatParcelizer = this;
        onGetStartedClick.write((Object) iconCompatParcelizer, "element");
        E e2 = (HmlPromptPayVerificationActivity.IconCompatParcelizer) e.invoke(iconCompatParcelizer);
        return !(e2 instanceof HmlPromptPayVerificationActivity.IconCompatParcelizer) ? e : e2;
    }

    public final HmlPromptPayVerificationActivity read(HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver<?> hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver) {
        HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity;
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver, "key");
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver, "key");
        if (hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver instanceof onContactCallCenterClicked) {
            HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver<?> MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver();
            onGetStartedClick.write((Object) MediaBrowserCompat$ItemReceiver, "key");
            if (MediaBrowserCompat$ItemReceiver == ((onContactCallCenterClicked) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver) || MediaBrowserCompat$ItemReceiver == null) {
                HmlPromptPayVerificationActivity.IconCompatParcelizer iconCompatParcelizer = this;
                onGetStartedClick.write((Object) iconCompatParcelizer, "element");
                FundFactSheetActivity fundFactSheetActivity = null;
                if (((HmlPromptPayVerificationActivity.IconCompatParcelizer) fundFactSheetActivity.invoke(iconCompatParcelizer)) != null) {
                    hmlPromptPayVerificationActivity = HmlPromptPayAboutActivity.IconCompatParcelizer;
                    return hmlPromptPayVerificationActivity;
                }
            }
            hmlPromptPayVerificationActivity = this;
            return hmlPromptPayVerificationActivity;
        }
        return HmlNTBPromptPayNotFoundActivity_ViewBinding.write == hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver ? HmlPromptPayAboutActivity.IconCompatParcelizer : this;
    }

    public MwBusinessDetailsActivity() {
        super(HmlNTBPromptPayNotFoundActivity_ViewBinding.write);
    }

    public void read(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, Runnable runnable) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        onGetStartedClick.write((Object) runnable, "block");
        IconCompatParcelizer(hmlPromptPayVerificationActivity, runnable);
    }

    public final <T> HmlNTBPromptPayNotFoundActivity<T> write(HmlNTBPromptPayNotFoundActivity<? super T> hmlNTBPromptPayNotFoundActivity) {
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "continuation");
        return new saveSlipButton<>(this, hmlNTBPromptPayNotFoundActivity);
    }

    public final void MediaBrowserCompat$ItemReceiver(HmlNTBPromptPayNotFoundActivity<?> hmlNTBPromptPayNotFoundActivity) {
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "continuation");
        Object obj = ((saveSlipButton) hmlNTBPromptPayNotFoundActivity)._reusableCancellableContinuation;
        if (!(obj instanceof MailingAddressReviewActivity)) {
            obj = null;
        }
        MailingAddressReviewActivity mailingAddressReviewActivity = (MailingAddressReviewActivity) obj;
        if (mailingAddressReviewActivity != null) {
            MwCurrentUserEwalletActivity mwCurrentUserEwalletActivity = (MwCurrentUserEwalletActivity) mailingAddressReviewActivity._parentHandle;
            if (mwCurrentUserEwalletActivity != null) {
                mwCurrentUserEwalletActivity.MediaBrowserCompat$CustomActionResultReceiver();
            }
            mailingAddressReviewActivity._parentHandle = MwOnBoardSuccessActivity_ViewBinding.IconCompatParcelizer;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        onGetStartedClick.write((Object) this, "$this$classSimpleName");
        String simpleName = getClass().getSimpleName();
        onGetStartedClick.IconCompatParcelizer((Object) simpleName, "this::class.java.simpleName");
        sb.append(simpleName);
        sb.append('@');
        onGetStartedClick.write((Object) this, "$this$hexAddress");
        String hexString = Integer.toHexString(System.identityHashCode(this));
        onGetStartedClick.IconCompatParcelizer((Object) hexString, "Integer.toHexString(System.identityHashCode(this))");
        sb.append(hexString);
        return sb.toString();
    }
}

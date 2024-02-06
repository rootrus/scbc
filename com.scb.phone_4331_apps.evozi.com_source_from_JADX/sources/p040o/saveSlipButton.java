package p040o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.saveSlipButton */
public final class saveSlipButton<T> extends onReturnHomeClick<T> implements HmlNTBDocumentSubmissionActivity, HmlNTBPromptPayNotFoundActivity<T> {
    public static final AtomicReferenceFieldUpdater MediaBrowserCompat$CustomActionResultReceiver = AtomicReferenceFieldUpdater.newUpdater(saveSlipButton.class, Object.class, "_reusableCancellableContinuation");
    public Object IconCompatParcelizer = onCreateQRCodeButtonClick.IconCompatParcelizer;
    public final HmlNTBPromptPayNotFoundActivity<T> MediaBrowserCompat$ItemReceiver;
    private final HmlNTBDocumentSubmissionActivity MediaMetadataCompat;
    public volatile Object _reusableCancellableContinuation;
    public final MwBusinessDetailsActivity read;
    public final Object write;

    public final HmlPromptPayVerificationActivity getContext() {
        return this.MediaBrowserCompat$ItemReceiver.getContext();
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public saveSlipButton(MwBusinessDetailsActivity mwBusinessDetailsActivity, HmlNTBPromptPayNotFoundActivity<? super T> hmlNTBPromptPayNotFoundActivity) {
        super(0);
        onGetStartedClick.write((Object) mwBusinessDetailsActivity, "dispatcher");
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "continuation");
        this.read = mwBusinessDetailsActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlNTBPromptPayNotFoundActivity;
        HmlNTBPromptPayNotFoundActivity<T> hmlNTBPromptPayNotFoundActivity2 = this.MediaBrowserCompat$ItemReceiver;
        this.MediaMetadataCompat = (HmlNTBDocumentSubmissionActivity) (!(hmlNTBPromptPayNotFoundActivity2 instanceof HmlNTBDocumentSubmissionActivity) ? null : hmlNTBPromptPayNotFoundActivity2);
        this.write = EkycSuccessActivity.IconCompatParcelizer(getContext());
        this._reusableCancellableContinuation = null;
    }

    public final HmlNTBDocumentSubmissionActivity getCallerFrame() {
        return this.MediaMetadataCompat;
    }

    public final Object MediaBrowserCompat$ItemReceiver() {
        Object obj = this.IconCompatParcelizer;
        if (MwChangeCasaSuccessActivity.write()) {
            if (!(obj != onCreateQRCodeButtonClick.IconCompatParcelizer)) {
                throw new AssertionError();
            }
        }
        this.IconCompatParcelizer = onCreateQRCodeButtonClick.IconCompatParcelizer;
        return obj;
    }

    public final HmlNTBPromptPayNotFoundActivity<T> write() {
        return this;
    }

    public final void resumeWith(Object obj) {
        HmlPromptPayVerificationActivity context;
        Object MediaBrowserCompat$ItemReceiver2;
        boolean z;
        onReturnHomeClick IconCompatParcelizer2;
        HmlPromptPayVerificationActivity context2 = this.MediaBrowserCompat$ItemReceiver.getContext();
        Throwable IconCompatParcelizer3 = HmlVerifyIdentifyActivity.IconCompatParcelizer(obj);
        Object merchantWalletDetailActivity_ViewBinding = IconCompatParcelizer3 != null ? new MerchantWalletDetailActivity_ViewBinding(IconCompatParcelizer3) : obj;
        if (this.read.write(context2)) {
            this.IconCompatParcelizer = merchantWalletDetailActivity_ViewBinding;
            this.MediaDescriptionCompat = 0;
            this.read.IconCompatParcelizer(context2, this);
            return;
        }
        handleTextChange handletextchange = handleTextChange.write;
        MwCreateQrActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver2 = handleTextChange.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer >= MwCreateQrActivity_ViewBinding.read(true)) {
            this.IconCompatParcelizer = merchantWalletDetailActivity_ViewBinding;
            this.MediaDescriptionCompat = 0;
            MediaBrowserCompat$CustomActionResultReceiver2.write(this);
            return;
        }
        onReturnHomeClick onreturnhomeclick = this;
        MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer += MwCreateQrActivity_ViewBinding.read(true);
        try {
            context = getContext();
            MediaBrowserCompat$ItemReceiver2 = EkycSuccessActivity.MediaBrowserCompat$ItemReceiver(context, this.write);
            this.MediaBrowserCompat$ItemReceiver.resumeWith(obj);
            HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            EkycSuccessActivity.IconCompatParcelizer(context, MediaBrowserCompat$ItemReceiver2);
            do {
                BaseLivenessCheckActivity_ViewBinding<onReturnHomeClick<?>> baseLivenessCheckActivity_ViewBinding = MediaBrowserCompat$CustomActionResultReceiver2.read;
                if (baseLivenessCheckActivity_ViewBinding == null || (IconCompatParcelizer2 = baseLivenessCheckActivity_ViewBinding.IconCompatParcelizer()) == null) {
                    z = false;
                    continue;
                } else {
                    IconCompatParcelizer2.run();
                    z = true;
                    continue;
                }
            } while (z);
        } catch (Throwable th) {
            try {
                onreturnhomeclick.MediaBrowserCompat$CustomActionResultReceiver(th, (Throwable) null);
            } catch (Throwable th2) {
                MediaBrowserCompat$CustomActionResultReceiver2.read();
                throw th2;
            }
        }
        MediaBrowserCompat$CustomActionResultReceiver2.read();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DispatchedContinuation[");
        sb.append(this.read);
        sb.append(", ");
        sb.append(AlertController$RecycleListView.IconCompatParcelizer((HmlNTBPromptPayNotFoundActivity<?>) this.MediaBrowserCompat$ItemReceiver));
        sb.append(']');
        return sb.toString();
    }
}

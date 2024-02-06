package p040o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;

/* renamed from: o.MailingAddressReviewActivity */
public class MailingAddressReviewActivity<T> extends onReturnHomeClick<T> implements MailingAddressReviewOTPActivity<T>, HmlNTBDocumentSubmissionActivity {
    private static final AtomicIntegerFieldUpdater IconCompatParcelizer;
    private static final AtomicReferenceFieldUpdater MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlNTBPromptPayNotFoundActivity<T> MediaBrowserCompat$ItemReceiver;
    public volatile int _decision = 0;
    public volatile Object _parentHandle = null;
    public volatile Object _state = GoodToKnowActivity_ViewBinding.IconCompatParcelizer;
    private final HmlPromptPayVerificationActivity write;

    static {
        Class<MailingAddressReviewActivity> cls = MailingAddressReviewActivity.class;
        IconCompatParcelizer = AtomicIntegerFieldUpdater.newUpdater(cls, "_decision");
        MediaBrowserCompat$CustomActionResultReceiver = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_state");
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* access modifiers changed from: protected */
    public String read() {
        return "CancellableContinuation";
    }

    public final HmlNTBPromptPayNotFoundActivity<T> write() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MailingAddressReviewActivity(HmlNTBPromptPayNotFoundActivity<? super T> hmlNTBPromptPayNotFoundActivity, int i) {
        super(i);
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "delegate");
        this.MediaBrowserCompat$ItemReceiver = hmlNTBPromptPayNotFoundActivity;
        this.write = hmlNTBPromptPayNotFoundActivity.getContext();
    }

    public HmlPromptPayVerificationActivity getContext() {
        return this.write;
    }

    public HmlNTBDocumentSubmissionActivity getCallerFrame() {
        HmlNTBPromptPayNotFoundActivity<T> hmlNTBPromptPayNotFoundActivity = this.MediaBrowserCompat$ItemReceiver;
        if (!(hmlNTBPromptPayNotFoundActivity instanceof HmlNTBDocumentSubmissionActivity)) {
            hmlNTBPromptPayNotFoundActivity = null;
        }
        return (HmlNTBDocumentSubmissionActivity) hmlNTBPromptPayNotFoundActivity;
    }

    public final void IconCompatParcelizer(Object obj, Throwable th) {
        onGetStartedClick.write((Object) th, "cause");
        if (obj instanceof MoneyOutActivity) {
            FundFactSheetActivity fundFactSheetActivity = null;
            try {
                fundFactSheetActivity.invoke(th);
            } catch (Throwable th2) {
                HmlPromptPayVerificationActivity context = getContext();
                StringBuilder sb = new StringBuilder();
                sb.append("Exception in cancellation handler for ");
                sb.append(this);
                AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(context, (Throwable) new CompletionHandlerException(sb.toString(), th2));
            }
        }
    }

    public Throwable IconCompatParcelizer(clickManagePin clickmanagepin) {
        onGetStartedClick.write((Object) clickmanagepin, "parent");
        return clickmanagepin.MediaDescriptionCompat();
    }

    public final Object MediaBrowserCompat$CustomActionResultReceiver() {
        clickManagePin clickmanagepin;
        MediaBrowserCompat$MediaItem();
        if (MediaMetadataCompat()) {
            return HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED;
        }
        Object obj = this._state;
        if (obj instanceof MerchantWalletDetailActivity_ViewBinding) {
            throw NdidSelectIdpActivity.MediaBrowserCompat$CustomActionResultReceiver(((MerchantWalletDetailActivity_ViewBinding) obj).IconCompatParcelizer, this);
        } else if (this.MediaDescriptionCompat == 1 && (clickmanagepin = (clickManagePin) getContext().IconCompatParcelizer(clickManagePin.write)) != null && !clickmanagepin.write()) {
            Throwable MediaDescriptionCompat = clickmanagepin.MediaDescriptionCompat();
            IconCompatParcelizer(obj, MediaDescriptionCompat);
            throw NdidSelectIdpActivity.MediaBrowserCompat$CustomActionResultReceiver(MediaDescriptionCompat, this);
        } else if (obj instanceof MediaImagePreviewActivity_ViewBinding) {
            return ((MediaImagePreviewActivity_ViewBinding) obj).MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            if (obj instanceof MoneyOutActivity) {
                return null;
            }
            return obj;
        }
    }

    public void resumeWith(Object obj) {
        MailingAddressReviewOTPActivity mailingAddressReviewOTPActivity = this;
        onGetStartedClick.write((Object) mailingAddressReviewOTPActivity, "caller");
        Throwable IconCompatParcelizer2 = HmlVerifyIdentifyActivity.IconCompatParcelizer(obj);
        if (IconCompatParcelizer2 != null) {
            obj = new MerchantWalletDetailActivity_ViewBinding(NdidSelectIdpActivity.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2, mailingAddressReviewOTPActivity));
        }
        IconCompatParcelizer(obj, this.MediaDescriptionCompat);
    }

    private static void MediaBrowserCompat$ItemReceiver(FundFactSheetActivity<? super Throwable, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("It's prohibited to register multiple handlers, tried to register ");
        sb.append(fundFactSheetActivity);
        sb.append(", already has ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }

    public final void IconCompatParcelizer(Object obj) {
        onGetStartedClick.write(obj, "token");
        if (MwChangeCasaSuccessActivity.write()) {
            if (!(obj == MailingAddressLandingActivity.write)) {
                throw new AssertionError();
            }
        }
        MediaBrowserCompat$CustomActionResultReceiver(this.MediaDescriptionCompat);
    }

    public final void read(MwBusinessDetailsActivity mwBusinessDetailsActivity, T t) {
        onGetStartedClick.write((Object) mwBusinessDetailsActivity, "$this$resumeUndispatched");
        HmlNTBPromptPayNotFoundActivity<T> hmlNTBPromptPayNotFoundActivity = this.MediaBrowserCompat$ItemReceiver;
        MwBusinessDetailsActivity mwBusinessDetailsActivity2 = null;
        if (!(hmlNTBPromptPayNotFoundActivity instanceof saveSlipButton)) {
            hmlNTBPromptPayNotFoundActivity = null;
        }
        saveSlipButton saveslipbutton = (saveSlipButton) hmlNTBPromptPayNotFoundActivity;
        if (saveslipbutton != null) {
            mwBusinessDetailsActivity2 = saveslipbutton.read;
        }
        IconCompatParcelizer((Object) t, mwBusinessDetailsActivity2 == mwBusinessDetailsActivity ? 2 : this.MediaDescriptionCompat);
    }

    public final <T> T read(Object obj) {
        if (obj instanceof MediaImagePreviewActivity_ViewBinding) {
            return ((MediaImagePreviewActivity_ViewBinding) obj).MediaBrowserCompat$CustomActionResultReceiver;
        }
        if (obj instanceof MoneyOutActivity) {
            return null;
        }
        return obj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(read());
        sb.append('(');
        sb.append(AlertController$RecycleListView.IconCompatParcelizer((HmlNTBPromptPayNotFoundActivity<?>) this.MediaBrowserCompat$ItemReceiver));
        sb.append("){");
        sb.append(this._state);
        sb.append("}@");
        onGetStartedClick.write((Object) this, "$this$hexAddress");
        String hexString = Integer.toHexString(System.identityHashCode(this));
        onGetStartedClick.IconCompatParcelizer((Object) hexString, "Integer.toHexString(System.identityHashCode(this))");
        sb.append(hexString);
        return sb.toString();
    }

    private boolean read(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof onGMBClick)) {
                return false;
            }
            z = obj instanceof MailingAddressDetailsActivity;
        } while (!MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(this, obj, new MailingAddressInputActivity(this, th, z)));
        if (z) {
            try {
                ((MailingAddressDetailsActivity) obj).read(th);
            } catch (Throwable th2) {
                HmlPromptPayVerificationActivity context = getContext();
                StringBuilder sb = new StringBuilder();
                sb.append("Exception in cancellation handler for ");
                sb.append(this);
                AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(context, (Throwable) new CompletionHandlerException(sb.toString(), th2));
            }
        }
        MediaBrowserCompat$SearchResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver(0);
        return true;
    }

    private final boolean MediaMetadataCompat() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!IconCompatParcelizer.compareAndSet(this, 0, 1));
        return true;
    }

    public final void IconCompatParcelizer(FundFactSheetActivity<? super Throwable, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        onGetStartedClick.write((Object) fundFactSheetActivity, "handler");
        Throwable th = null;
        MailingAddressDetailsActivity mailingAddressDetailsActivity = null;
        while (true) {
            Object obj = this._state;
            if (obj instanceof GoodToKnowActivity_ViewBinding) {
                if (mailingAddressDetailsActivity == null) {
                    mailingAddressDetailsActivity = fundFactSheetActivity instanceof MailingAddressDetailsActivity ? (MailingAddressDetailsActivity) fundFactSheetActivity : new MwLandingActivity_ViewBinding(fundFactSheetActivity);
                }
                if (MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(this, obj, mailingAddressDetailsActivity)) {
                    return;
                }
            } else if (obj instanceof MailingAddressDetailsActivity) {
                MediaBrowserCompat$ItemReceiver(fundFactSheetActivity, obj);
            } else if (obj instanceof MailingAddressInputActivity) {
                if (!MerchantWalletDetailActivity_ViewBinding.read.compareAndSet((MailingAddressInputActivity) obj, 0, 1)) {
                    MediaBrowserCompat$ItemReceiver(fundFactSheetActivity, obj);
                }
                if (!(obj instanceof MerchantWalletDetailActivity_ViewBinding)) {
                    obj = null;
                }
                try {
                    MerchantWalletDetailActivity_ViewBinding merchantWalletDetailActivity_ViewBinding = (MerchantWalletDetailActivity_ViewBinding) obj;
                    if (merchantWalletDetailActivity_ViewBinding != null) {
                        th = merchantWalletDetailActivity_ViewBinding.IconCompatParcelizer;
                    }
                    fundFactSheetActivity.invoke(th);
                    return;
                } catch (Throwable th2) {
                    HmlPromptPayVerificationActivity context = getContext();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Exception in cancellation handler for ");
                    sb.append(this);
                    AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(context, (Throwable) new CompletionHandlerException(sb.toString(), th2));
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final MailingAddressInputActivity IconCompatParcelizer(Object obj, int i) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof onGMBClick)) {
                if (obj2 instanceof MailingAddressInputActivity) {
                    MailingAddressInputActivity mailingAddressInputActivity = (MailingAddressInputActivity) obj2;
                    if (MailingAddressInputActivity.MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(mailingAddressInputActivity, 0, 1)) {
                        return mailingAddressInputActivity;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Already resumed, but proposed with update ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            }
        } while (!MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(this, obj2, obj));
        MediaBrowserCompat$SearchResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver(i);
        return null;
    }

    public final Object IconCompatParcelizer(T t, Object obj) {
        Object obj2;
        T t2;
        do {
            obj2 = this._state;
            if (obj2 instanceof onGMBClick) {
                if (obj == null) {
                    t2 = t;
                } else {
                    t2 = new MediaImagePreviewActivity_ViewBinding(obj, t);
                }
            } else if (!(obj2 instanceof MediaImagePreviewActivity_ViewBinding)) {
                return null;
            } else {
                MediaImagePreviewActivity_ViewBinding mediaImagePreviewActivity_ViewBinding = (MediaImagePreviewActivity_ViewBinding) obj2;
                if (mediaImagePreviewActivity_ViewBinding.read != obj) {
                    return null;
                }
                if (MwChangeCasaSuccessActivity.write()) {
                    if (!(mediaImagePreviewActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver == t)) {
                        throw new AssertionError();
                    }
                }
                return MailingAddressLandingActivity.write;
            }
        } while (!MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(this, obj2, t2));
        MediaBrowserCompat$SearchResultReceiver();
        return MailingAddressLandingActivity.write;
    }

    public final Object MediaBrowserCompat$ItemReceiver(Throwable th) {
        Object obj;
        onGetStartedClick.write((Object) th, "exception");
        do {
            obj = this._state;
            if (!(obj instanceof onGMBClick)) {
                return null;
            }
        } while (!MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(this, obj, new MerchantWalletDetailActivity_ViewBinding(th)));
        MediaBrowserCompat$SearchResultReceiver();
        return MailingAddressLandingActivity.write;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if ((((p040o.saveSlipButton) r0)._reusableCancellableContinuation != null) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void MediaBrowserCompat$SearchResultReceiver() {
        /*
            r4 = this;
            o.HmlNTBPromptPayNotFoundActivity<T> r0 = r4.MediaBrowserCompat$ItemReceiver
            boolean r1 = r0 instanceof p040o.saveSlipButton
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0014
            o.saveSlipButton r0 = (p040o.saveSlipButton) r0
            java.lang.Object r0 = r0._reusableCancellableContinuation
            if (r0 == 0) goto L_0x0010
            r0 = r2
            goto L_0x0011
        L_0x0010:
            r0 = r3
        L_0x0011:
            if (r0 == 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r2 = r3
        L_0x0015:
            if (r2 != 0) goto L_0x0026
            java.lang.Object r0 = r4._parentHandle
            o.MwCurrentUserEwalletActivity r0 = (p040o.MwCurrentUserEwalletActivity) r0
            if (r0 == 0) goto L_0x0020
            r0.MediaBrowserCompat$CustomActionResultReceiver()
        L_0x0020:
            o.MwOnBoardSuccessActivity_ViewBinding r0 = p040o.MwOnBoardSuccessActivity_ViewBinding.IconCompatParcelizer
            o.MwCurrentUserEwalletActivity r0 = (p040o.MwCurrentUserEwalletActivity) r0
            r4._parentHandle = r0
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.MailingAddressReviewActivity.MediaBrowserCompat$SearchResultReceiver():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void MediaBrowserCompat$CustomActionResultReceiver(int r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4._decision
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0018
            if (r0 != r1) goto L_0x000a
            r1 = r2
            goto L_0x0021
        L_0x000a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            throw r5
        L_0x0018:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = IconCompatParcelizer
            r3 = 2
            boolean r0 = r0.compareAndSet(r4, r2, r3)
            if (r0 == 0) goto L_0x0000
        L_0x0021:
            if (r1 == 0) goto L_0x0024
            return
        L_0x0024:
            p040o.AlertController$RecycleListView.write(r4, (int) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.MailingAddressReviewActivity.MediaBrowserCompat$CustomActionResultReceiver(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bc, code lost:
        if ((((p040o.saveSlipButton) r2)._reusableCancellableContinuation != null) != false) goto L_0x00c0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void MediaBrowserCompat$MediaItem() {
        /*
            r7 = this;
            java.lang.Object r0 = r7._state
            boolean r0 = r0 instanceof p040o.onGMBClick
            r1 = 1
            r0 = r0 ^ r1
            int r2 = r7.MediaDescriptionCompat
            if (r2 == 0) goto L_0x000c
            goto L_0x0077
        L_0x000c:
            o.HmlNTBPromptPayNotFoundActivity<T> r2 = r7.MediaBrowserCompat$ItemReceiver
            boolean r3 = r2 instanceof p040o.saveSlipButton
            r4 = 0
            if (r3 != 0) goto L_0x0014
            r2 = r4
        L_0x0014:
            o.saveSlipButton r2 = (p040o.saveSlipButton) r2
            if (r2 == 0) goto L_0x0077
            r3 = r7
            o.MailingAddressReviewOTPActivity r3 = (p040o.MailingAddressReviewOTPActivity) r3
            java.lang.String r5 = "continuation"
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r5)
        L_0x0020:
            java.lang.Object r5 = r2._reusableCancellableContinuation
            o.EkycOtpActivity r6 = p040o.onCreateQRCodeButtonClick.MediaBrowserCompat$CustomActionResultReceiver
            if (r5 != r6) goto L_0x0031
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = p040o.saveSlipButton.MediaBrowserCompat$CustomActionResultReceiver
            o.EkycOtpActivity r6 = p040o.onCreateQRCodeButtonClick.MediaBrowserCompat$CustomActionResultReceiver
            boolean r5 = r5.compareAndSet(r2, r6, r3)
            if (r5 == 0) goto L_0x0020
            goto L_0x0043
        L_0x0031:
            if (r5 != 0) goto L_0x0034
            goto L_0x0043
        L_0x0034:
            boolean r3 = r5 instanceof java.lang.Throwable
            if (r3 == 0) goto L_0x005a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = p040o.saveSlipButton.MediaBrowserCompat$CustomActionResultReceiver
            boolean r2 = r3.compareAndSet(r2, r5, r4)
            if (r2 == 0) goto L_0x004c
            r4 = r5
            java.lang.Throwable r4 = (java.lang.Throwable) r4
        L_0x0043:
            if (r4 == 0) goto L_0x0077
            if (r0 != 0) goto L_0x004a
            r7.read((java.lang.Throwable) r4)
        L_0x004a:
            r0 = r1
            goto L_0x0077
        L_0x004c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x005a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Inconsistent state "
            r0.append(r1)
            r0.append(r5)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x0077:
            if (r0 == 0) goto L_0x007a
            return
        L_0x007a:
            java.lang.Object r0 = r7._parentHandle
            o.MwCurrentUserEwalletActivity r0 = (p040o.MwCurrentUserEwalletActivity) r0
            if (r0 == 0) goto L_0x0081
            return
        L_0x0081:
            o.HmlNTBPromptPayNotFoundActivity<T> r0 = r7.MediaBrowserCompat$ItemReceiver
            o.HmlPromptPayVerificationActivity r0 = r0.getContext()
            o.clickManagePin$read r2 = p040o.clickManagePin.write
            o.HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver r2 = (p040o.HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver) r2
            o.HmlPromptPayVerificationActivity$IconCompatParcelizer r0 = r0.IconCompatParcelizer(r2)
            o.clickManagePin r0 = (p040o.clickManagePin) r0
            if (r0 == 0) goto L_0x00cb
            r0.RatingCompat()
            o.MaintenanceActivity_ViewBinding r2 = new o.MaintenanceActivity_ViewBinding
            r2.<init>(r0, r7)
            o.MerchantWalletDetailActivity r2 = (p040o.MerchantWalletDetailActivity) r2
            o.FundFactSheetActivity r2 = (p040o.FundFactSheetActivity) r2
            o.MwCurrentUserEwalletActivity r0 = r0.IconCompatParcelizer(r1, r1, r2)
            r7._parentHandle = r0
            java.lang.Object r2 = r7._state
            boolean r2 = r2 instanceof p040o.onGMBClick
            r2 = r2 ^ r1
            if (r2 == 0) goto L_0x00cb
            o.HmlNTBPromptPayNotFoundActivity<T> r2 = r7.MediaBrowserCompat$ItemReceiver
            boolean r3 = r2 instanceof p040o.saveSlipButton
            r4 = 0
            if (r3 == 0) goto L_0x00bf
            o.saveSlipButton r2 = (p040o.saveSlipButton) r2
            java.lang.Object r2 = r2._reusableCancellableContinuation
            if (r2 == 0) goto L_0x00bb
            r2 = r1
            goto L_0x00bc
        L_0x00bb:
            r2 = r4
        L_0x00bc:
            if (r2 == 0) goto L_0x00bf
            goto L_0x00c0
        L_0x00bf:
            r1 = r4
        L_0x00c0:
            if (r1 != 0) goto L_0x00cb
            r0.MediaBrowserCompat$CustomActionResultReceiver()
            o.MwOnBoardSuccessActivity_ViewBinding r0 = p040o.MwOnBoardSuccessActivity_ViewBinding.IconCompatParcelizer
            o.MwCurrentUserEwalletActivity r0 = (p040o.MwCurrentUserEwalletActivity) r0
            r7._parentHandle = r0
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.MailingAddressReviewActivity.MediaBrowserCompat$MediaItem():void");
    }

    public final boolean IconCompatParcelizer() {
        return this._state instanceof onGMBClick;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(java.lang.Throwable r6) {
        /*
            r5 = this;
            java.lang.String r0 = "cause"
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r0)
            int r1 = r5.MediaDescriptionCompat
            r2 = 1
            if (r1 != 0) goto L_0x003b
            o.HmlNTBPromptPayNotFoundActivity<T> r1 = r5.MediaBrowserCompat$ItemReceiver
            boolean r3 = r1 instanceof p040o.saveSlipButton
            r4 = 0
            if (r3 != 0) goto L_0x0012
            r1 = r4
        L_0x0012:
            o.saveSlipButton r1 = (p040o.saveSlipButton) r1
            if (r1 == 0) goto L_0x003b
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r0)
        L_0x0019:
            java.lang.Object r0 = r1._reusableCancellableContinuation
            o.EkycOtpActivity r3 = p040o.onCreateQRCodeButtonClick.MediaBrowserCompat$CustomActionResultReceiver
            boolean r3 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r0, (java.lang.Object) r3)
            if (r3 == 0) goto L_0x002e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p040o.saveSlipButton.MediaBrowserCompat$CustomActionResultReceiver
            o.EkycOtpActivity r3 = p040o.onCreateQRCodeButtonClick.MediaBrowserCompat$CustomActionResultReceiver
            boolean r0 = r0.compareAndSet(r1, r3, r6)
            if (r0 == 0) goto L_0x0019
            goto L_0x003c
        L_0x002e:
            boolean r3 = r0 instanceof java.lang.Throwable
            if (r3 == 0) goto L_0x0033
            goto L_0x003c
        L_0x0033:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = p040o.saveSlipButton.MediaBrowserCompat$CustomActionResultReceiver
            boolean r0 = r3.compareAndSet(r1, r0, r4)
            if (r0 == 0) goto L_0x0019
        L_0x003b:
            r2 = 0
        L_0x003c:
            if (r2 == 0) goto L_0x003f
            return
        L_0x003f:
            r5.read((java.lang.Throwable) r6)
            r5.MediaBrowserCompat$SearchResultReceiver()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.MailingAddressReviewActivity.write(java.lang.Throwable):void");
    }

    public final Object MediaBrowserCompat$ItemReceiver() {
        return this._state;
    }
}

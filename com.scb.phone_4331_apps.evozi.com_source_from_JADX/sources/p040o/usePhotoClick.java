package p040o;

import p040o.HmlVerifyIdentifyActivity;

/* renamed from: o.usePhotoClick */
final class usePhotoClick<T> extends MwManageWalletActivity_ViewBinding<onDoneNicknameClick> {
    private final MailingAddressReviewActivity<T> write;

    public final /* synthetic */ Object invoke(Object obj) {
        IconCompatParcelizer((Throwable) obj);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public usePhotoClick(onDoneNicknameClick ondonenicknameclick, MailingAddressReviewActivity<? super T> mailingAddressReviewActivity) {
        super(ondonenicknameclick);
        onGetStartedClick.write((Object) ondonenicknameclick, "job");
        onGetStartedClick.write((Object) mailingAddressReviewActivity, "continuation");
        this.write = mailingAddressReviewActivity;
    }

    public final void IconCompatParcelizer(Throwable th) {
        Object obj;
        onDoneNicknameClick ondonenicknameclick = (onDoneNicknameClick) this.IconCompatParcelizer;
        while (true) {
            obj = ondonenicknameclick._state;
            if (!(obj instanceof BaseNtbInstructionActivity)) {
                break;
            }
            ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) ondonenicknameclick);
        }
        if (MwChangeCasaSuccessActivity.write() && !(!(obj instanceof MwManageReceivingAccountActivity))) {
            throw new AssertionError();
        } else if (obj instanceof MerchantWalletDetailActivity_ViewBinding) {
            Throwable th2 = ((MerchantWalletDetailActivity_ViewBinding) obj).IconCompatParcelizer;
            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) th2, "exception");
            this.write.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th2)));
        } else {
            Object read = MwOnBoardSuccessActivity.read(obj);
            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
            this.write.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(read));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResumeAwaitOnCompletion[");
        sb.append(this.write);
        sb.append(']');
        return sb.toString();
    }
}

package p040o;

/* renamed from: o.editPinLocation */
public final class editPinLocation<T> extends BaseNtbInstructionActivity_ViewBinding<T> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public editPinLocation(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, HmlNTBPromptPayNotFoundActivity<? super T> hmlNTBPromptPayNotFoundActivity) {
        super(hmlPromptPayVerificationActivity, hmlNTBPromptPayNotFoundActivity);
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "uCont");
    }

    public final void IconCompatParcelizer(Object obj) {
        Object write = AlertController$RecycleListView.write(obj, this.MediaDescriptionCompat);
        HmlPromptPayVerificationActivity context = this.MediaDescriptionCompat.getContext();
        Object MediaBrowserCompat$ItemReceiver = EkycSuccessActivity.MediaBrowserCompat$ItemReceiver(context, (Object) null);
        try {
            this.MediaDescriptionCompat.resumeWith(write);
            HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        } finally {
            EkycSuccessActivity.IconCompatParcelizer(context, MediaBrowserCompat$ItemReceiver);
        }
    }
}

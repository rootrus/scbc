package p040o;

/* renamed from: o.MaintenanceActivity_ViewBinding */
public final class MaintenanceActivity_ViewBinding extends clickManageShopInfo<clickManagePin> {
    private MailingAddressReviewActivity<?> write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaintenanceActivity_ViewBinding(clickManagePin clickmanagepin, MailingAddressReviewActivity<?> mailingAddressReviewActivity) {
        super(clickmanagepin);
        onGetStartedClick.write((Object) clickmanagepin, "parent");
        onGetStartedClick.write((Object) mailingAddressReviewActivity, "child");
        this.write = mailingAddressReviewActivity;
    }

    public final void IconCompatParcelizer(Throwable th) {
        MailingAddressReviewActivity<?> mailingAddressReviewActivity = this.write;
        mailingAddressReviewActivity.write(mailingAddressReviewActivity.IconCompatParcelizer((clickManagePin) this.IconCompatParcelizer));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChildContinuation[");
        sb.append(this.write);
        sb.append(']');
        return sb.toString();
    }

    public final /* synthetic */ Object invoke(Object obj) {
        MailingAddressReviewActivity<?> mailingAddressReviewActivity = this.write;
        mailingAddressReviewActivity.write(mailingAddressReviewActivity.IconCompatParcelizer((clickManagePin) this.IconCompatParcelizer));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

package p040o;

/* renamed from: o.MailingAddressReviewOTPActivity */
public interface MailingAddressReviewOTPActivity<T> extends HmlNTBPromptPayNotFoundActivity<T> {

    @HmlSetNTBPinActivity
    /* renamed from: o.MailingAddressReviewOTPActivity$write */
    public static final class write {
    }

    Object IconCompatParcelizer(T t, Object obj);

    void IconCompatParcelizer(Object obj);

    void IconCompatParcelizer(FundFactSheetActivity<? super Throwable, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity);

    boolean IconCompatParcelizer();

    Object MediaBrowserCompat$ItemReceiver(Throwable th);

    void read(MwBusinessDetailsActivity mwBusinessDetailsActivity, T t);
}

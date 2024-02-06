package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setRetryOk$MediaBrowserCompat$CustomActionResultReceiver */
final class setRetryOk$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ setRetryOk write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    setRetryOk$MediaBrowserCompat$CustomActionResultReceiver(setRetryOk setretryok) {
        super(1);
        this.write = setretryok;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "errorDisplay");
        this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new Runnable(this) {
            private /* synthetic */ setRetryOk$MediaBrowserCompat$CustomActionResultReceiver write;

            {
                this.write = r1;
            }

            public final void run() {
                setRetryOk setretryok = this.write.write;
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C53674.MediaBrowserCompat$CustomActionResultReceiver;
                if (setretryok.RatingCompat != null) {
                    iconCompatParcelizer.IconCompatParcelizer(setretryok.RatingCompat);
                }
            }
        }));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

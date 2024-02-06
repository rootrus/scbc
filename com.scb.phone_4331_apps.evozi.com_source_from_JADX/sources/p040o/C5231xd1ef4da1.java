package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.requestWasSuccessful$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5231xd1ef4da1 extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ requestWasSuccessful MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5231xd1ef4da1(requestWasSuccessful requestwassuccessful) {
        super(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = requestwassuccessful;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "error");
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new Runnable(this) {
            private /* synthetic */ C5231xd1ef4da1 MediaBrowserCompat$ItemReceiver;

            {
                this.MediaBrowserCompat$ItemReceiver = r1;
            }

            public final void run() {
                requestWasSuccessful requestwassuccessful = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C52333.MediaBrowserCompat$CustomActionResultReceiver;
                if (requestwassuccessful.RatingCompat != null) {
                    iconCompatParcelizer.IconCompatParcelizer(requestwassuccessful.RatingCompat);
                }
            }
        }));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

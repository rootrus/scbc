package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getVerticalMovementGuidance$MediaBrowserCompat$ItemReceiver */
public final class getVerticalMovementGuidance$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ getVerticalMovementGuidance MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getVerticalMovementGuidance$MediaBrowserCompat$ItemReceiver(getVerticalMovementGuidance getverticalmovementguidance) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = getverticalmovementguidance;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "e");
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new Runnable(this) {
            private /* synthetic */ getVerticalMovementGuidance$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;

            {
                this.MediaBrowserCompat$ItemReceiver = r1;
            }

            public final void run() {
                getVerticalMovementGuidance getverticalmovementguidance = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C46882.IconCompatParcelizer;
                if (getverticalmovementguidance.RatingCompat != null) {
                    iconCompatParcelizer.IconCompatParcelizer(getverticalmovementguidance.RatingCompat);
                }
            }
        }));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

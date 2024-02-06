package p040o;

import p040o.CustomAdvertisingIdClient;
import p040o.writeUInt64NoTag;

/* renamed from: o.CustomAdvertisingIdClient$b$MediaBrowserCompat$ItemReceiver */
public final class CustomAdvertisingIdClient$b$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ CustomAdvertisingIdClient.C3280b MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomAdvertisingIdClient$b$MediaBrowserCompat$ItemReceiver(CustomAdvertisingIdClient.C3280b bVar) {
        super(0);
        this.MediaBrowserCompat$CustomActionResultReceiver = bVar;
    }

    public final /* synthetic */ Object invoke() {
        CustomAdvertisingIdClient.C3280b.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
        CustomAdvertisingIdClient.C3280b bVar = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C97024.MediaBrowserCompat$ItemReceiver;
        if (bVar.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(bVar.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

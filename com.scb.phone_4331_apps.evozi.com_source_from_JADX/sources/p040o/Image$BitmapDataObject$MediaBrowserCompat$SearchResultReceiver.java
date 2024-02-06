package p040o;

import p040o.Image;
import p040o.access$2300;

/* renamed from: o.Image$BitmapDataObject$MediaBrowserCompat$SearchResultReceiver */
public final class Image$BitmapDataObject$MediaBrowserCompat$SearchResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ Image.BitmapDataObject MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Image$BitmapDataObject$MediaBrowserCompat$SearchResultReceiver(Image.BitmapDataObject bitmapDataObject) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = bitmapDataObject;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "throwable");
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

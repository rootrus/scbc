package p040o;

import p040o.access$2300;

/* renamed from: o.setImageFilePath$MediaBrowserCompat$MediaItem */
public final class setImageFilePath$MediaBrowserCompat$MediaItem extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ setImageFilePath read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setImageFilePath$MediaBrowserCompat$MediaItem(setImageFilePath setimagefilepath) {
        super(1);
        this.read = setimagefilepath;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "throwable");
        setImageFilePath setimagefilepath = this.read;
        setimagefilepath.MediaBrowserCompat$ItemReceiver(setimagefilepath.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

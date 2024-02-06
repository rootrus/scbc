package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setImageFileHeight$MediaBrowserCompat$MediaItem */
public final class setImageFileHeight$MediaBrowserCompat$MediaItem extends CheckEligibilityActivity implements FundFactSheetActivity<zzuk, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ setImageFileHeight IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setImageFileHeight$MediaBrowserCompat$MediaItem(setImageFileHeight setimagefileheight) {
        super(1);
        this.IconCompatParcelizer = setimagefileheight;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        onGetStartedClick.write((Object) (zzuk) obj, "it");
        setImageFileHeight.m3154x50fd9e4a(this.IconCompatParcelizer);
        setImageFileHeight setimagefileheight = this.IconCompatParcelizer;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C101452.MediaBrowserCompat$CustomActionResultReceiver;
        if (setimagefileheight.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(setimagefileheight.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

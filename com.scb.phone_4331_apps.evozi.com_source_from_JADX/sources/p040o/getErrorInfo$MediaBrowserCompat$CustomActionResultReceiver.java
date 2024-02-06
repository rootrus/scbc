package p040o;

import p040o.getErrorInfo;
import p040o.writeUInt64NoTag;
import p040o.zzct;

/* renamed from: o.getErrorInfo$MediaBrowserCompat$CustomActionResultReceiver */
public final class getErrorInfo$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<ActivityTransitionResult, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ getErrorInfo MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getErrorInfo$MediaBrowserCompat$CustomActionResultReceiver(getErrorInfo geterrorinfo) {
        super(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = geterrorinfo;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final ActivityTransitionResult activityTransitionResult = (ActivityTransitionResult) obj;
        onGetStartedClick.write((Object) activityTransitionResult, "hmlBusinessOwnerStatus");
        TabLayout MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        zzct.zza zza = zzct.zza.BUSINESS_OWNER;
        onGetStartedClick.write((Object) zza, "type");
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(zza);
        getErrorInfo.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        getErrorInfo geterrorinfo = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<IdCaptureModule_RttiExceptionResponseDeserializer_Factory>() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                getErrorInfo$write$MediaBrowserCompat$ItemReceiver geterrorinfo_write_mediabrowsercompat_itemreceiver = getErrorInfo.write.Companion;
                ((IdCaptureModule_RttiExceptionResponseDeserializer_Factory) obj).MediaBrowserCompat$CustomActionResultReceiver(getErrorInfo$write$MediaBrowserCompat$ItemReceiver.read(activityTransitionResult.read), activityTransitionResult.MediaBrowserCompat$CustomActionResultReceiver);
            }
        };
        if (geterrorinfo.RatingCompat != null) {
            r1.IconCompatParcelizer(geterrorinfo.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

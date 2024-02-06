package p040o;

import java.util.List;
import p040o.C7534ua;
import p040o.writeUInt64NoTag;

/* renamed from: o.IFaceDetector$MediaBrowserCompat$SearchResultReceiver */
public final class IFaceDetector$MediaBrowserCompat$SearchResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<onCameraIdle, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ IFaceDetector IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IFaceDetector$MediaBrowserCompat$SearchResultReceiver(IFaceDetector iFaceDetector) {
        super(1);
        this.IconCompatParcelizer = iFaceDetector;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final onCameraIdle oncameraidle = (onCameraIdle) obj;
        onGetStartedClick.write((Object) oncameraidle, "response");
        IFaceDetector.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
        IFaceDetector iFaceDetector = this.IconCompatParcelizer;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<C7534ua.write>(this) {
            private /* synthetic */ IFaceDetector$MediaBrowserCompat$SearchResultReceiver IconCompatParcelizer;

            {
                this.IconCompatParcelizer = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                onCameraIdle oncameraidle = oncameraidle;
                onGetStartedClick.write((Object) oncameraidle, "domain");
                String str = oncameraidle.ParcelableVolumeInfo;
                String str2 = oncameraidle.IconCompatParcelizer;
                String str3 = oncameraidle.MediaBrowserCompat$ItemReceiver;
                String str4 = oncameraidle.write;
                String str5 = oncameraidle.MediaBrowserCompat$MediaItem;
                String str6 = oncameraidle.MediaDescriptionCompat;
                double d = oncameraidle.MediaBrowserCompat$CustomActionResultReceiver;
                double d2 = oncameraidle.RatingCompat;
                double d3 = oncameraidle.read;
                List<String> list = oncameraidle.MediaMetadataCompat;
                getTimestamp gettimestamp = r4;
                List<String> list2 = list;
                getTimestamp gettimestamp2 = new getTimestamp(str, str2, str3, str4, str5, str6, d, d2, d3, list2, oncameraidle.f2904x50fd9e4a, oncameraidle.MediaBrowserCompat$SearchResultReceiver);
                ((C7534ua.write) obj).read(gettimestamp, IFaceDetector.IconCompatParcelizer(this.IconCompatParcelizer.IconCompatParcelizer));
            }
        };
        if (iFaceDetector.RatingCompat != null) {
            r1.IconCompatParcelizer(iFaceDetector.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

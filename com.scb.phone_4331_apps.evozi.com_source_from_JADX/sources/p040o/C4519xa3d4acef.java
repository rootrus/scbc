package p040o;

import p040o.OnDeviceIdExtractor_Factory;
import p040o.getCityFieldName;
import p040o.writeUInt64NoTag;

/* renamed from: o.getCityFieldName$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver */
final class C4519xa3d4acef extends CheckEligibilityActivity implements FundFactSheetActivity<onCircleClick, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ getCityFieldName.IconCompatParcelizer read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4519xa3d4acef(getCityFieldName.IconCompatParcelizer iconCompatParcelizer) {
        super(1);
        this.read = iconCompatParcelizer;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final onCircleClick oncircleclick = (onCircleClick) obj;
        onGetStartedClick.write((Object) oncircleclick, "it");
        getCityFieldName.RatingCompat(getCityFieldName.this);
        getCityFieldName getcityfieldname = getCityFieldName.this;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<OnDeviceIdExtractor_Factory.write>(this) {
            private /* synthetic */ C4519xa3d4acef read;

            {
                this.read = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                OnDeviceIdExtractor_Factory.write write = (OnDeviceIdExtractor_Factory.write) obj;
                write.read(this.read.read.IconCompatParcelizer());
                getCityFieldName.IconCompatParcelizer iconCompatParcelizer = this.read.read;
                immediateFailedFuture read2 = getCityFieldName.this.MediaMetadataCompat.read((String) null, oncircleclick, iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(), true, (String) null);
                read2.MediaBrowserCompat$CustomActionResultReceiver = true;
                write.write(read2);
            }
        };
        if (getcityfieldname.RatingCompat != null) {
            r1.IconCompatParcelizer(getcityfieldname.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

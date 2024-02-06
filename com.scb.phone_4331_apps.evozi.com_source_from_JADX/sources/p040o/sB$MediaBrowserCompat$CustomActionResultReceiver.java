package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.sB$MediaBrowserCompat$CustomActionResultReceiver */
final class sB$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<panoramaId, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ C7426sB IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    sB$MediaBrowserCompat$CustomActionResultReceiver(C7426sB sBVar) {
        super(1);
        this.IconCompatParcelizer = sBVar;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final panoramaId panoramaid = (panoramaId) obj;
        C7426sB sBVar = this.IconCompatParcelizer;
        boolean z = true;
        if (sBVar.RatingCompat != null) {
            sBVar.RatingCompat.aj_();
        }
        C7426sB sBVar2 = this.IconCompatParcelizer;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth.setContentView>(this) {
            private /* synthetic */ sB$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;

            {
                this.MediaBrowserCompat$ItemReceiver = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((getTopLeftCornerWidth.setContentView) obj).read(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.write.read(panoramaid));
            }
        };
        if (sBVar2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            r1.IconCompatParcelizer(sBVar2.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

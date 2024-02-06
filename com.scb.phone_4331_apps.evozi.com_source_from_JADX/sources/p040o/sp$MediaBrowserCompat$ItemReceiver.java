package p040o;

import p040o.ServerProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.sp$MediaBrowserCompat$ItemReceiver */
public final class sp$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<getProjection, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ C5417sp MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sp$MediaBrowserCompat$ItemReceiver(C5417sp spVar) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = spVar;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        onGetStartedClick.write((Object) (getProjection) obj, "it");
        C5417sp spVar = this.MediaBrowserCompat$ItemReceiver;
        writeUInt64NoTag.IconCompatParcelizer r0 = new writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C70684.read>(this) {
            private /* synthetic */ sp$MediaBrowserCompat$ItemReceiver write;

            {
                this.write = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ServerProjectProvider.C70684.read read = (ServerProjectProvider.C70684.read) obj;
                read.aj_();
                read.write(C5417sp.MediaBrowserCompat$CustomActionResultReceiver(this.write.MediaBrowserCompat$ItemReceiver), C5417sp.read(this.write.MediaBrowserCompat$ItemReceiver));
            }
        };
        if (spVar.RatingCompat != null) {
            r0.IconCompatParcelizer(spVar.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getIndexFields$MediaBrowserCompat$CustomActionResultReceiver */
final class getIndexFields$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ C10840getIndexFields read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    getIndexFields$MediaBrowserCompat$CustomActionResultReceiver(C10840getIndexFields getindexfields) {
        super(1);
        this.read = getindexfields;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "throwable");
        C10840getIndexFields getindexfields = this.read;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<proxyGetIPassportDetector>(this) {
            private /* synthetic */ getIndexFields$MediaBrowserCompat$CustomActionResultReceiver write;

            {
                this.write = r1;
            }

            public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
                this.write.read.MediaBrowserCompat$ItemReceiver(this.write.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
        };
        if (getindexfields.RatingCompat != null) {
            r1.IconCompatParcelizer(getindexfields.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

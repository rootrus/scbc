package p040o;

import p040o.Iterables;
import p040o.writeUInt64NoTag;
import p040o.zzl;

/* renamed from: o.getFirstPassThresholdUniform$MediaBrowserCompat$ItemReceiver */
public final class getFirstPassThresholdUniform$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<zzl.zzb, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ getFirstPassThresholdUniform write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getFirstPassThresholdUniform$MediaBrowserCompat$ItemReceiver(getFirstPassThresholdUniform getfirstpassthresholduniform) {
        super(1);
        this.write = getfirstpassthresholduniform;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        zzl.zzb zzb = (zzl.zzb) obj;
        onGetStartedClick.write((Object) zzb, "etbNoActiveCASA");
        getFirstPassThresholdUniform.read(this.write);
        this.write.write.MediaBrowserCompat$CustomActionResultReceiver(Iterables.C35284.ETB_WELCOME_ABOARD.name());
        boolean z = true;
        if (!zzb.MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
            final long j = zzb.MediaBrowserCompat$CustomActionResultReceiver.get(0).AppCompatViewInflater;
            getFirstPassThresholdUniform getfirstpassthresholduniform = this.write;
            writeUInt64NoTag.IconCompatParcelizer r4 = new writeUInt64NoTag.IconCompatParcelizer<getCvv>() {
                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((getCvv) obj).MediaBrowserCompat$CustomActionResultReceiver(j);
                }
            };
            if (getfirstpassthresholduniform.RatingCompat == null) {
                z = false;
            }
            if (z) {
                r4.IconCompatParcelizer(getfirstpassthresholduniform.RatingCompat);
            }
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

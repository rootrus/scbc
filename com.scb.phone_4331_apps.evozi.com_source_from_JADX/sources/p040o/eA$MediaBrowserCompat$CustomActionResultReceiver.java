package p040o;

import p040o.getProjectAsync;
import p040o.writeUInt64NoTag;

/* renamed from: o.eA$MediaBrowserCompat$CustomActionResultReceiver */
public final class eA$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<setBoundsBias, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ C4323eA write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eA$MediaBrowserCompat$CustomActionResultReceiver(C4323eA eAVar) {
        super(1);
        this.write = eAVar;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        setBoundsBias setboundsbias = (setBoundsBias) obj;
        onGetStartedClick.write((Object) setboundsbias, "limitUsage");
        this.write.IconCompatParcelizer = setboundsbias.MediaBrowserCompat$MediaItem.doubleValue();
        C4323eA eAVar = this.write;
        eAVar.MediaBrowserCompat$CustomActionResultReceiver(eAVar.MediaBrowserCompat$SearchResultReceiver);
        C4323eA eAVar2 = this.write;
        writeUInt64NoTag.IconCompatParcelizer r0 = new writeUInt64NoTag.IconCompatParcelizer<getProjectAsync.write>(this) {
            private /* synthetic */ eA$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer;

            {
                this.IconCompatParcelizer = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                getProjectAsync.write write = (getProjectAsync.write) obj;
                write.ay_();
                getOutput unused = this.IconCompatParcelizer.write.MediaMetadataCompat;
                String write2 = getOutput.write(Double.valueOf(this.IconCompatParcelizer.write.IconCompatParcelizer));
                onGetStartedClick.IconCompatParcelizer((Object) write2, "transformFund(limit)");
                write.write(write2);
            }
        };
        if (eAVar2.RatingCompat != null) {
            r0.IconCompatParcelizer(eAVar2.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

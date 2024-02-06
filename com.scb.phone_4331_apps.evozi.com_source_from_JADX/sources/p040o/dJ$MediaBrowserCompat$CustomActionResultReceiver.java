package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.dJ$MediaBrowserCompat$CustomActionResultReceiver */
public final class dJ$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<zzuk, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ C4252dJ write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dJ$MediaBrowserCompat$CustomActionResultReceiver(C4252dJ dJVar) {
        super(1);
        this.write = dJVar;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        onGetStartedClick.write((Object) (zzuk) obj, "it");
        C4252dJ dJVar = this.write;
        writeUInt64NoTag.IconCompatParcelizer r0 = new writeUInt64NoTag.IconCompatParcelizer<IdRegion$MediaBrowserCompat$ItemReceiver>(this) {
            private /* synthetic */ dJ$MediaBrowserCompat$CustomActionResultReceiver write;

            {
                this.write = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                IdRegion$MediaBrowserCompat$ItemReceiver idRegion$MediaBrowserCompat$ItemReceiver = (IdRegion$MediaBrowserCompat$ItemReceiver) obj;
                idRegion$MediaBrowserCompat$ItemReceiver.aj_();
                idRegion$MediaBrowserCompat$ItemReceiver.RatingCompat();
                this.write.write.write = false;
            }
        };
        if (dJVar.RatingCompat != null) {
            r0.IconCompatParcelizer(dJVar.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

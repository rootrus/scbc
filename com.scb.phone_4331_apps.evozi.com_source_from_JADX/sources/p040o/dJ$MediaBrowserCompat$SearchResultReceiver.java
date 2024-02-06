package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.dJ$MediaBrowserCompat$SearchResultReceiver */
final class dJ$MediaBrowserCompat$SearchResultReceiver extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ C4252dJ MediaBrowserCompat$ItemReceiver;
    final /* synthetic */ String write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    dJ$MediaBrowserCompat$SearchResultReceiver(C4252dJ dJVar, String str) {
        super(0);
        this.MediaBrowserCompat$ItemReceiver = dJVar;
        this.write = str;
    }

    public final /* synthetic */ Object invoke() {
        C4252dJ dJVar = this.MediaBrowserCompat$ItemReceiver;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<IdRegion$MediaBrowserCompat$ItemReceiver>(this) {
            private /* synthetic */ dJ$MediaBrowserCompat$SearchResultReceiver read;

            {
                this.read = r1;
            }

            public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((IdRegion$MediaBrowserCompat$ItemReceiver) obj).IconCompatParcelizer(this.read.write);
            }
        };
        if (dJVar.RatingCompat != null) {
            r1.IconCompatParcelizer(dJVar.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

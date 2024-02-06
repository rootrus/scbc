package p040o;

import java.util.List;
import p040o.CrashlyticsReport;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeProcess$MediaBrowserCompat$ItemReceiver */
final class nativeProcess$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<getUserNavigationEnabled, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ nativeProcess write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    nativeProcess$MediaBrowserCompat$ItemReceiver(nativeProcess nativeprocess) {
        super(1);
        this.write = nativeprocess;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final getUserNavigationEnabled getusernavigationenabled = (getUserNavigationEnabled) obj;
        onGetStartedClick.write((Object) getusernavigationenabled, "result");
        nativeProcess nativeprocess = this.write;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C50514.IconCompatParcelizer;
        boolean z = false;
        if (nativeprocess.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(nativeprocess.RatingCompat);
        }
        List<StreetViewPanoramaOptions> list = getusernavigationenabled.read;
        onGetStartedClick.IconCompatParcelizer((Object) list, "result.billPaymentBillerList");
        if (!list.isEmpty()) {
            nativeProcess nativeprocess2 = this.write;
            getStreetViewPanoramaCamera getstreetviewpanoramacamera = getusernavigationenabled.IconCompatParcelizer;
            onGetStartedClick.IconCompatParcelizer((Object) getstreetviewpanoramacamera, "result.billPaymentBillerPagination");
            String str = getstreetviewpanoramacamera.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) str, "result.billPaymentBillerPagination.scrollId");
            nativeProcess.IconCompatParcelizer(nativeprocess2, str);
            nativeProcess nativeprocess3 = this.write;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<C1152x3c012820>(this) {
                private /* synthetic */ nativeProcess$MediaBrowserCompat$ItemReceiver write;

                {
                    this.write = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    List<CrashlyticsReport.Session.Event.Application.Execution> MediaBrowserCompat$ItemReceiver = this.write.write.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(getusernavigationenabled.read, this.write.write.MediaMetadataCompat.setCheckable());
                    onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "billPaymentBillerDisplay…ctor.userProfileLanguage)");
                    ((C1152x3c012820) obj).read(MediaBrowserCompat$ItemReceiver);
                }
            };
            if (nativeprocess3.RatingCompat != null) {
                z = true;
            }
            if (z) {
                r1.IconCompatParcelizer(nativeprocess3.RatingCompat);
            }
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

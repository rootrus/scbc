package p040o;

import java.util.Collection;
import java.util.List;
import p040o.CrashlyticsReport;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeProcess$MediaBrowserCompat$CustomActionResultReceiver */
final class nativeProcess$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<getUserNavigationEnabled, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ nativeProcess read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    nativeProcess$MediaBrowserCompat$CustomActionResultReceiver(nativeProcess nativeprocess) {
        super(1);
        this.read = nativeprocess;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final getUserNavigationEnabled getusernavigationenabled = (getUserNavigationEnabled) obj;
        onGetStartedClick.write((Object) getusernavigationenabled, "result");
        nativeProcess.write(this.read);
        nativeProcess nativeprocess = this.read;
        getStreetViewPanoramaCamera getstreetviewpanoramacamera = getusernavigationenabled.IconCompatParcelizer;
        onGetStartedClick.IconCompatParcelizer((Object) getstreetviewpanoramacamera, "result.billPaymentBillerPagination");
        String str = getstreetviewpanoramacamera.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.IconCompatParcelizer((Object) str, "result.billPaymentBillerPagination.scrollId");
        nativeProcess.IconCompatParcelizer(nativeprocess, str);
        nativeProcess nativeprocess2 = this.read;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<C1152x3c012820>() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                getStreetViewPanoramaCamera getstreetviewpanoramacamera = getusernavigationenabled.IconCompatParcelizer;
                onGetStartedClick.IconCompatParcelizer((Object) getstreetviewpanoramacamera, "result.billPaymentBillerPagination");
                ((C1152x3c012820) obj).write(String.valueOf(getstreetviewpanoramacamera.read));
            }
        };
        boolean z = true;
        if (nativeprocess2.RatingCompat != null) {
            r1.IconCompatParcelizer(nativeprocess2.RatingCompat);
        }
        Collection collection = getusernavigationenabled.read;
        if (collection == null || collection.isEmpty()) {
            nativeProcess nativeprocess3 = this.read;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C50493.MediaBrowserCompat$CustomActionResultReceiver;
            if (nativeprocess3.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(nativeprocess3.RatingCompat);
            }
        } else {
            nativeProcess nativeprocess4 = this.read;
            writeUInt64NoTag.IconCompatParcelizer r12 = new writeUInt64NoTag.IconCompatParcelizer<C1152x3c012820>(this) {
                private /* synthetic */ nativeProcess$MediaBrowserCompat$CustomActionResultReceiver write;

                {
                    this.write = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    List<CrashlyticsReport.Session.Event.Application.Execution> MediaBrowserCompat$ItemReceiver = this.write.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(getusernavigationenabled.read, this.write.read.MediaMetadataCompat.setCheckable());
                    onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "billPaymentBillerDisplay…ctor.userProfileLanguage)");
                    ((C1152x3c012820) obj).read(MediaBrowserCompat$ItemReceiver);
                }
            };
            if (nativeprocess4.RatingCompat == null) {
                z = false;
            }
            if (z) {
                r12.IconCompatParcelizer(nativeprocess4.RatingCompat);
            }
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

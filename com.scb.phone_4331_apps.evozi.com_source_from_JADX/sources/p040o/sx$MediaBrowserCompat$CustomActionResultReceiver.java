package p040o;

import java.util.Collection;
import java.util.List;
import p040o.CrashlyticsReport;
import p040o.writeUInt64NoTag;

/* renamed from: o.sx$MediaBrowserCompat$CustomActionResultReceiver */
final class sx$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<getUserNavigationEnabled, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ C7481sx write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    sx$MediaBrowserCompat$CustomActionResultReceiver(C7481sx sxVar) {
        super(1);
        this.write = sxVar;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final getUserNavigationEnabled getusernavigationenabled = (getUserNavigationEnabled) obj;
        onGetStartedClick.write((Object) getusernavigationenabled, "result");
        C7481sx.MediaBrowserCompat$CustomActionResultReceiver(this.write);
        C7481sx sxVar = this.write;
        getStreetViewPanoramaCamera getstreetviewpanoramacamera = getusernavigationenabled.IconCompatParcelizer;
        onGetStartedClick.IconCompatParcelizer((Object) getstreetviewpanoramacamera, "result.billPaymentBillerPagination");
        String str = getstreetviewpanoramacamera.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.IconCompatParcelizer((Object) str, "result.billPaymentBillerPagination.scrollId");
        C7481sx.write(sxVar, str);
        C7481sx sxVar2 = this.write;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<C1152x3c012820>() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                getStreetViewPanoramaCamera getstreetviewpanoramacamera = getusernavigationenabled.IconCompatParcelizer;
                onGetStartedClick.IconCompatParcelizer((Object) getstreetviewpanoramacamera, "result.billPaymentBillerPagination");
                ((C1152x3c012820) obj).write(String.valueOf(getstreetviewpanoramacamera.read));
            }
        };
        boolean z = true;
        if (sxVar2.RatingCompat != null) {
            r1.IconCompatParcelizer(sxVar2.RatingCompat);
        }
        Collection collection = getusernavigationenabled.read;
        if (collection == null || collection.isEmpty()) {
            C7481sx sxVar3 = this.write;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C74885.write;
            if (sxVar3.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(sxVar3.RatingCompat);
            }
        } else {
            C7481sx sxVar4 = this.write;
            writeUInt64NoTag.IconCompatParcelizer r12 = new writeUInt64NoTag.IconCompatParcelizer<C1152x3c012820>(this) {
                private /* synthetic */ sx$MediaBrowserCompat$CustomActionResultReceiver write;

                {
                    this.write = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    List<CrashlyticsReport.Session.Event.Application.Execution> MediaBrowserCompat$ItemReceiver = this.write.write.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(getusernavigationenabled.read, this.write.write.MediaDescriptionCompat.setCheckable());
                    onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "billPaymentBillerDisplay…ctor.userProfileLanguage)");
                    ((C1152x3c012820) obj).read(MediaBrowserCompat$ItemReceiver);
                }
            };
            if (sxVar4.RatingCompat == null) {
                z = false;
            }
            if (z) {
                r12.IconCompatParcelizer(sxVar4.RatingCompat);
            }
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

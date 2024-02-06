package p040o;

import p040o.QuickExtractorAgent;
import p040o.writeUInt64NoTag;

/* renamed from: o.IKtaSessionIdProviderFactory$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3452x3c3405c4 extends CheckEligibilityActivity implements FundFactSheetActivity<C3085x7c929f5b, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ IKtaSessionIdProviderFactory MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3452x3c3405c4(IKtaSessionIdProviderFactory iKtaSessionIdProviderFactory) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = iKtaSessionIdProviderFactory;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final C3085x7c929f5b autoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal = (C3085x7c929f5b) obj;
        onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal, "searchCountryDisplay");
        IKtaSessionIdProviderFactory iKtaSessionIdProviderFactory = this.MediaBrowserCompat$ItemReceiver;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<QuickExtractorAgent.C70202>() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((QuickExtractorAgent.C70202) obj).MediaBrowserCompat$CustomActionResultReceiver(autoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.MediaBrowserCompat$CustomActionResultReceiver);
            }
        };
        if (iKtaSessionIdProviderFactory.RatingCompat != null) {
            r1.IconCompatParcelizer(iKtaSessionIdProviderFactory.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

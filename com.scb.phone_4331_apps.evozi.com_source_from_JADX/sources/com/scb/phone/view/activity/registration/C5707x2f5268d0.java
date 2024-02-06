package com.scb.phone.view.activity.registration;

import p040o.C3085x7c929f5b;
import p040o.C3452x3c3405c4;
import p040o.CheckEligibilityActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.IKtaSessionIdProviderFactory;
import p040o.Suppliers;
import p040o.getForwardList;
import p040o.getForwardList$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.activity.registration.RegistrationCountrySearchActivity$MediaBrowserCompat$ItemReceiver */
final class C5707x2f5268d0 extends CheckEligibilityActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ RegistrationCountrySearchActivity MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5707x2f5268d0(RegistrationCountrySearchActivity registrationCountrySearchActivity) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = registrationCountrySearchActivity;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        onGetStartedClick.write((Object) str, "keyword");
        IKtaSessionIdProviderFactory iKtaSessionIdProviderFactory = this.MediaBrowserCompat$ItemReceiver.presenter;
        if (iKtaSessionIdProviderFactory == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onGetStartedClick.write((Object) str, "keyword");
        C3085x7c929f5b autoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal = iKtaSessionIdProviderFactory.read;
        getForwardList getforwardlist = iKtaSessionIdProviderFactory.IconCompatParcelizer;
        FundFactSheetActivity iKtaSessionIdProviderFactory$MediaBrowserCompat$CustomActionResultReceiver = new C3452x3c3405c4(iKtaSessionIdProviderFactory);
        Suppliers.SupplierOfInstance.write write = new Suppliers.SupplierOfInstance.write(str, autoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.write);
        boolean z = str.length() == 0;
        onGetStartedClick.write((Object) iKtaSessionIdProviderFactory$MediaBrowserCompat$CustomActionResultReceiver, "onSuccess");
        onGetStartedClick.write((Object) write, "request");
        getforwardlist.IconCompatParcelizer.read(iKtaSessionIdProviderFactory$MediaBrowserCompat$CustomActionResultReceiver, getForwardList$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, write, new getForwardList.IconCompatParcelizer(getforwardlist, z), getforwardlist.MediaBrowserCompat$ItemReceiver);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

package com.scb.phone.view.fragment.search;

import android.text.InputFilter;
import android.widget.EditText;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Log;
import p040o.C5184qk;
import p040o.CheckEligibilityActivity;
import p040o.FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;

final class SequentialSearchFragment$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<EditText, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ SequentialSearchFragment read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SequentialSearchFragment$MediaBrowserCompat$ItemReceiver(SequentialSearchFragment sequentialSearchFragment) {
        super(1);
        this.read = sequentialSearchFragment;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        EditText editText = (EditText) obj;
        onGetStartedClick.write((Object) editText, "$receiver");
        C5184qk qkVar = this.read.presenter;
        if (qkVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        AutoValue_CrashlyticsReport_Session_Event_Log autoValue_CrashlyticsReport_Session_Event_Log = qkVar.MediaDescriptionCompat;
        if (autoValue_CrashlyticsReport_Session_Event_Log == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("searchType");
        }
        if (autoValue_CrashlyticsReport_Session_Event_Log.IconCompatParcelizer()) {
            editText.setFilters((InputFilter[]) new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment[]{new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment("[^\\u0E01-\\u0E39\\u0E40-\\u0E4C]")});
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

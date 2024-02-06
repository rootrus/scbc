package com.scb.phone.view.adapter.investment.discover;

import com.scb.phone.view.adapter.easycash.viewholder.C5749xa68e6725;
import com.scb.phone.view.fragment.investment.onboarding.FundOnboardingTermsAndConditionsFragment;
import java.util.ArrayList;
import org.json.JSONObject;
import p040o.dump;
import p040o.show;

public final class DiscoverFundFilterListAdapter$MediaBrowserCompat$ItemReceiver implements dump {
    private final /* synthetic */ FundOnboardingTermsAndConditionsFragment.read MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ JSONObject MediaBrowserCompat$ItemReceiver;

    private DiscoverFundFilterListAdapter$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ DiscoverFundFilterListAdapter$MediaBrowserCompat$ItemReceiver(FundOnboardingTermsAndConditionsFragment.read read, JSONObject jSONObject) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read;
        this.MediaBrowserCompat$ItemReceiver = jSONObject;
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        FundOnboardingTermsAndConditionsFragment.read read = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str = (String) obj;
        JSONObject optJSONObject = this.MediaBrowserCompat$ItemReceiver.optJSONObject(str);
        ArrayList arrayList = new ArrayList();
        new show(optJSONObject.keys()).read(new C5749xa68e6725(optJSONObject, arrayList));
        read.write.put(str, arrayList);
    }
}

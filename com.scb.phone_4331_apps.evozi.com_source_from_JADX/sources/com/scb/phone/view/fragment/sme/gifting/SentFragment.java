package com.scb.phone.view.fragment.sme.gifting;

import com.scb.phone.R;
import com.scb.phone.view.adapter.sme.gifting.GiftingBaseListAdapter;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_User;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.calculateMortgageLoan;

public class SentFragment extends GiftingFragment implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    /* access modifiers changed from: protected */
    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return R.string.gifts_sent_empty_msg;
    }

    /* access modifiers changed from: protected */
    public final GiftingBaseListAdapter MediaBrowserCompat$CustomActionResultReceiver(List<AutoValue_CrashlyticsReport_Session_User> list) {
        return new calculateMortgageLoan(getContext(), list, this);
    }
}

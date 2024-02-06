package com.scb.phone.view.fragment.investment.purchase;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import p040o.InstallIdProvider;

public class PurchasedTabFragment extends BaseTabFragment {
    /* access modifiers changed from: protected */
    public final String write() {
        return "LIST_PURCHASED";
    }

    public static PurchasedTabFragment MediaBrowserCompat$CustomActionResultReceiver(List<InstallIdProvider> list) {
        PurchasedTabFragment purchasedTabFragment = new PurchasedTabFragment();
        if (list != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("LIST_PURCHASED", (ArrayList) list);
            bundle.putString("extra_search_type", "purchased");
            purchasedTabFragment.setArguments(bundle);
        }
        return purchasedTabFragment;
    }
}

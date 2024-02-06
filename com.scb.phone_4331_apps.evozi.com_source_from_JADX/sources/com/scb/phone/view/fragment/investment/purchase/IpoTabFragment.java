package com.scb.phone.view.fragment.investment.purchase;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import p040o.InstallIdProvider;

public class IpoTabFragment extends BaseTabFragment {
    /* access modifiers changed from: protected */
    public final String write() {
        return "LIST_IPO";
    }

    public static IpoTabFragment MediaBrowserCompat$CustomActionResultReceiver(List<InstallIdProvider> list) {
        IpoTabFragment ipoTabFragment = new IpoTabFragment();
        if (list != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("LIST_IPO", (ArrayList) list);
            bundle.putString("extra_search_type", "IPO");
            ipoTabFragment.setArguments(bundle);
        }
        return ipoTabFragment;
    }
}

package com.scb.phone.view.fragment.investment.purchase;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import p040o.InstallIdProvider;

public class OthersTabFragment extends BaseTabFragment {
    /* access modifiers changed from: protected */
    public final String write() {
        return "LIST_OTHERS";
    }

    public static OthersTabFragment read(List<InstallIdProvider> list) {
        OthersTabFragment othersTabFragment = new OthersTabFragment();
        if (list != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("LIST_OTHERS", (ArrayList) list);
            bundle.putString("extra_search_type", "others");
            othersTabFragment.setArguments(bundle);
        }
        return othersTabFragment;
    }
}

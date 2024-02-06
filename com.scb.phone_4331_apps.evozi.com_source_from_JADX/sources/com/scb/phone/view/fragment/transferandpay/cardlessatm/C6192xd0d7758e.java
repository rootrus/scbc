package com.scb.phone.view.fragment.transferandpay.cardlessatm;

import android.os.Bundle;
import java.util.ArrayList;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.fragment.transferandpay.cardlessatm.CardlessCreditCardSelectorFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6192xd0d7758e {
    private C6192xd0d7758e() {
    }

    public /* synthetic */ C6192xd0d7758e(byte b) {
        this();
    }

    public static CardlessCreditCardSelectorFragment MediaBrowserCompat$ItemReceiver(ArrayList<String> arrayList, boolean z) {
        onGetStartedClick.write((Object) arrayList, "allowTags");
        CardlessCreditCardSelectorFragment cardlessCreditCardSelectorFragment = new CardlessCreditCardSelectorFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("EXTRA_ALLOW_TAGS", arrayList);
        bundle.putBoolean("EXTRA_PARENT_TRANSPARENT_BACKGROUND", z);
        cardlessCreditCardSelectorFragment.setArguments(bundle);
        return cardlessCreditCardSelectorFragment;
    }
}

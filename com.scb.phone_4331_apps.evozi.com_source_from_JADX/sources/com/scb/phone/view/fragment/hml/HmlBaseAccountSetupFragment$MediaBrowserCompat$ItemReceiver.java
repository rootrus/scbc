package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.List;
import p040o.getSessionIdFromSessionFile;
import p040o.onGetStartedClick;

public final class HmlBaseAccountSetupFragment$MediaBrowserCompat$ItemReceiver implements AdapterView.OnItemSelectedListener {
    private /* synthetic */ List MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ Spinner read;
    private /* synthetic */ HmlBaseAccountSetupFragment write;

    public final void onNothingSelected(AdapterView<?> adapterView) {
        onGetStartedClick.write((Object) adapterView, "parent");
    }

    HmlBaseAccountSetupFragment$MediaBrowserCompat$ItemReceiver(HmlBaseAccountSetupFragment hmlBaseAccountSetupFragment, List list, Spinner spinner) {
        this.write = hmlBaseAccountSetupFragment;
        this.MediaBrowserCompat$ItemReceiver = list;
        this.read = spinner;
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        onGetStartedClick.write((Object) adapterView, "parent");
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        T t = this.write.presenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getSessionIdFromSessionFile.read read2 = (getSessionIdFromSessionFile.read) this.MediaBrowserCompat$ItemReceiver.get(i);
        Spinner spinner = this.read;
        Spinner spinner2 = this.write.receivingAccountSpinner;
        if (spinner2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("receivingAccountSpinner");
        }
        boolean MediaBrowserCompat$ItemReceiver2 = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) spinner, (Object) spinner2);
        onGetStartedClick.write((Object) read2, "accountSelected");
        if (MediaBrowserCompat$ItemReceiver2) {
            t.read = read2;
        } else {
            t.MediaMetadataCompat = read2;
        }
    }
}

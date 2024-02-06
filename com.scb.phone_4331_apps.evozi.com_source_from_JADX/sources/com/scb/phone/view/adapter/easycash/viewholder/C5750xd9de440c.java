package com.scb.phone.view.adapter.easycash.viewholder;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import p040o.AppData;
import p040o.getPerformPaymentWithReferer;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.adapter.easycash.viewholder.BusinessAndMaritalInfoSpouseSelectorViewHolder$MediaBrowserCompat$ItemReceiver */
public final class C5750xd9de440c implements AdapterView.OnItemSelectedListener {
    private /* synthetic */ getPerformPaymentWithReferer.write MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ AppData read;

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    public C5750xd9de440c(AppData appData, getPerformPaymentWithReferer.write write) {
        this.read = appData;
        this.MediaBrowserCompat$CustomActionResultReceiver = write;
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        if (i < this.read.IconCompatParcelizer.size()) {
            AppData appData = this.read;
            String str = appData.IconCompatParcelizer.get(i);
            onGetStartedClick.write((Object) str, "<set-?>");
            appData.RatingCompat = str;
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
        }
    }
}

package com.scb.phone.view.activity.cardmanagement;

import android.view.View;
import android.widget.AdapterView;
import java.util.List;
import p040o.FirebaseOptions;
import p040o.getMaxResults;
import p040o.getMaxResults$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

/* renamed from: com.scb.phone.view.activity.cardmanagement.AmortizationMerchantsActivity$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5565xa3698148 implements AdapterView.OnItemSelectedListener {
    private /* synthetic */ AmortizationMerchantsActivity IconCompatParcelizer;

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    C5565xa3698148(AmortizationMerchantsActivity amortizationMerchantsActivity) {
        this.IconCompatParcelizer = amortizationMerchantsActivity;
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        getMaxResults getmaxresults = this.IconCompatParcelizer.presenter;
        if (getmaxresults == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        List<FirebaseOptions> list = getmaxresults.read;
        if (list != null) {
            writeUInt64NoTag.IconCompatParcelizer getmaxresults_mediabrowsercompat_customactionresultreceiver = new getMaxResults$MediaBrowserCompat$CustomActionResultReceiver(list, i);
            if (getmaxresults.RatingCompat != null) {
                getmaxresults_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(getmaxresults.RatingCompat);
            }
        }
    }
}

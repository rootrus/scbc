package com.scb.phone.view.adapter.deposit;

import android.view.View;

class FatcaQuestionnaireAdapter$MediaBrowserCompat$ItemReceiver implements View.OnClickListener {
    private /* synthetic */ FatcaQuestionnaireAdapter IconCompatParcelizer;
    private final String MediaBrowserCompat$ItemReceiver;
    private final int write;

    public FatcaQuestionnaireAdapter$MediaBrowserCompat$ItemReceiver(FatcaQuestionnaireAdapter fatcaQuestionnaireAdapter, int i, String str) {
        this.IconCompatParcelizer = fatcaQuestionnaireAdapter;
        this.write = i;
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final void onClick(View view) {
        this.IconCompatParcelizer.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(this.write, this.MediaBrowserCompat$ItemReceiver);
    }
}

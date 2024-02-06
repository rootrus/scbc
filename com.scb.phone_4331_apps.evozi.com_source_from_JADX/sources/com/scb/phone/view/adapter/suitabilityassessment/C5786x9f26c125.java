package com.scb.phone.view.adapter.suitabilityassessment;

import android.widget.RadioGroup;

/* renamed from: com.scb.phone.view.adapter.suitabilityassessment.QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder$MediaBrowserCompat$CustomActionResultReceiver */
final class C5786x9f26c125 implements RadioGroup.OnCheckedChangeListener {
    private /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ C5785xb7dc0f35 read;

    C5786x9f26c125(C5785xb7dc0f35 questionnaireRecyclerViewAdapter$MediaBrowserCompat$CustomActionResultReceiver, int i) {
        this.read = questionnaireRecyclerViewAdapter$MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.read.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, i);
    }
}

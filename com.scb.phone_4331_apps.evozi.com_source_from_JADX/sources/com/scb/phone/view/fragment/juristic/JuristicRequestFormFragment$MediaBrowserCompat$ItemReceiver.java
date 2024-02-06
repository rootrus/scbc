package com.scb.phone.view.fragment.juristic;

import android.view.View;

final class JuristicRequestFormFragment$MediaBrowserCompat$ItemReceiver implements View.OnFocusChangeListener {
    private /* synthetic */ JuristicRequestFormFragment write;

    JuristicRequestFormFragment$MediaBrowserCompat$ItemReceiver(JuristicRequestFormFragment juristicRequestFormFragment) {
        this.write = juristicRequestFormFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        if (!z) {
            JuristicRequestFormFragment.MediaBrowserCompat$CustomActionResultReceiver(this.write);
        }
    }
}

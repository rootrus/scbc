package com.scb.phone.view.fragment.easycash.landing;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import p040o.onStart;

public class EasycashLandingEmptyFragment_ViewBinding extends EasycashBaseLandingFragment_ViewBinding {
    private EasycashLandingEmptyFragment MediaBrowserCompat$CustomActionResultReceiver;

    public EasycashLandingEmptyFragment_ViewBinding(EasycashLandingEmptyFragment easycashLandingEmptyFragment, View view) {
        super(easycashLandingEmptyFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = easycashLandingEmptyFragment;
        easycashLandingEmptyFragment.errorText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.easycash_empty_text, "field 'errorText'", TextView.class);
        easycashLandingEmptyFragment.errorDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.easycash_empty_description, "field 'errorDescription'", TextView.class);
    }

    public final void read() {
        EasycashLandingEmptyFragment easycashLandingEmptyFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (easycashLandingEmptyFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            easycashLandingEmptyFragment.errorText = null;
            easycashLandingEmptyFragment.errorDescription = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

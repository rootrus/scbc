package com.scb.phone.view.fragment.easycash.salesheets;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class EasycashSalesheetEmptyFragment_ViewBinding extends BaseFragment_ViewBinding {
    private EasycashSalesheetEmptyFragment MediaBrowserCompat$ItemReceiver;

    public EasycashSalesheetEmptyFragment_ViewBinding(EasycashSalesheetEmptyFragment easycashSalesheetEmptyFragment, View view) {
        super(easycashSalesheetEmptyFragment, view);
        this.MediaBrowserCompat$ItemReceiver = easycashSalesheetEmptyFragment;
        easycashSalesheetEmptyFragment.errorText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.easycash_empty_text, "field 'errorText'", TextView.class);
        easycashSalesheetEmptyFragment.errorDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.easycash_empty_description, "field 'errorDescription'", TextView.class);
    }

    public final void read() {
        EasycashSalesheetEmptyFragment easycashSalesheetEmptyFragment = this.MediaBrowserCompat$ItemReceiver;
        if (easycashSalesheetEmptyFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            easycashSalesheetEmptyFragment.errorText = null;
            easycashSalesheetEmptyFragment.errorDescription = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

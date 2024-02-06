package com.scb.phone.view.fragment.accountsummary;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import p040o.onStart;

public class SmeLoanFragment_ViewBinding extends BaseCardFragment_ViewBinding {
    private SmeLoanFragment MediaBrowserCompat$CustomActionResultReceiver;

    public SmeLoanFragment_ViewBinding(SmeLoanFragment smeLoanFragment, View view) {
        super(smeLoanFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = smeLoanFragment;
        smeLoanFragment.smeLoanTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.my_loans_text_view, "field 'smeLoanTextView'", TextView.class);
    }

    public final void read() {
        SmeLoanFragment smeLoanFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (smeLoanFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            smeLoanFragment.smeLoanTextView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

package com.scb.phone.view.fragment.closeaccount;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class CloseAccountSelectionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CloseAccountSelectionFragment MediaBrowserCompat$CustomActionResultReceiver;

    public CloseAccountSelectionFragment_ViewBinding(CloseAccountSelectionFragment closeAccountSelectionFragment, View view) {
        super(closeAccountSelectionFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = closeAccountSelectionFragment;
        closeAccountSelectionFragment.accountSourceTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title_custom_account_source, "field 'accountSourceTitle'", TextView.class);
        closeAccountSelectionFragment.accountSourceSubtitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_subtitle_custom_account_source, "field 'accountSourceSubtitle'", TextView.class);
    }

    public final void read() {
        CloseAccountSelectionFragment closeAccountSelectionFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (closeAccountSelectionFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            closeAccountSelectionFragment.accountSourceTitle = null;
            closeAccountSelectionFragment.accountSourceSubtitle = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

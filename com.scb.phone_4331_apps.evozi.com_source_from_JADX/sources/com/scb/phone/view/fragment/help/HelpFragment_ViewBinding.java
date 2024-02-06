package com.scb.phone.view.fragment.help;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class HelpFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HelpFragment MediaBrowserCompat$ItemReceiver;

    public HelpFragment_ViewBinding(HelpFragment helpFragment, View view) {
        super(helpFragment, view);
        this.MediaBrowserCompat$ItemReceiver = helpFragment;
        helpFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.help_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
    }

    public final void read() {
        HelpFragment helpFragment = this.MediaBrowserCompat$ItemReceiver;
        if (helpFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            helpFragment.mRecyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

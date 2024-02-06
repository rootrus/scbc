package com.scb.phone.view.fragment.hml;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class HmlAboutFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HmlAboutFragment write;

    public HmlAboutFragment_ViewBinding(HmlAboutFragment hmlAboutFragment, View view) {
        super(hmlAboutFragment, view);
        this.write = hmlAboutFragment;
        hmlAboutFragment.recycler = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_about, "field 'recycler'", RecyclerView.class);
    }

    public final void read() {
        HmlAboutFragment hmlAboutFragment = this.write;
        if (hmlAboutFragment != null) {
            this.write = null;
            hmlAboutFragment.recycler = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

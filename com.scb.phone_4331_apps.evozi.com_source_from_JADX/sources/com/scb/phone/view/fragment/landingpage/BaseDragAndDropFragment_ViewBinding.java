package com.scb.phone.view.fragment.landingpage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class BaseDragAndDropFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BaseDragAndDropFragment MediaBrowserCompat$CustomActionResultReceiver;

    public BaseDragAndDropFragment_ViewBinding(BaseDragAndDropFragment baseDragAndDropFragment, View view) {
        super(baseDragAndDropFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = baseDragAndDropFragment;
        baseDragAndDropFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.base_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
    }

    public void read() {
        BaseDragAndDropFragment baseDragAndDropFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (baseDragAndDropFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            baseDragAndDropFragment.mRecyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

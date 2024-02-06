package com.scb.phone.view.fragment.search;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ClearableFullWidthEditText;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class SequentialSearchFragment_ViewBinding extends BaseFragment_ViewBinding {
    private SequentialSearchFragment write;

    public SequentialSearchFragment_ViewBinding(SequentialSearchFragment sequentialSearchFragment, View view) {
        super(sequentialSearchFragment, view);
        this.write = sequentialSearchFragment;
        sequentialSearchFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_sequential_search, "field 'recyclerView'", RecyclerView.class);
        sequentialSearchFragment.viewNoItem = onStart.IconCompatParcelizer(view, R.id.view_no_item, "field 'viewNoItem'");
        sequentialSearchFragment.textSearchHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.search_header, "field 'textSearchHeader'", TextView.class);
        sequentialSearchFragment.viewSearchBox = (ClearableFullWidthEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cet_search, "field 'viewSearchBox'", ClearableFullWidthEditText.class);
    }

    public final void read() {
        SequentialSearchFragment sequentialSearchFragment = this.write;
        if (sequentialSearchFragment != null) {
            this.write = null;
            sequentialSearchFragment.recyclerView = null;
            sequentialSearchFragment.viewNoItem = null;
            sequentialSearchFragment.textSearchHeader = null;
            sequentialSearchFragment.viewSearchBox = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

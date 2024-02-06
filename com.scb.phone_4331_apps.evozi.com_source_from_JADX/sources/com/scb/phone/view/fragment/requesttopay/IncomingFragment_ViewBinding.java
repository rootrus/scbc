package com.scb.phone.view.fragment.requesttopay;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import p040o.onStart;

public class IncomingFragment_ViewBinding extends BaseRequestToPayFragment_ViewBinding {
    private IncomingFragment IconCompatParcelizer;

    public IncomingFragment_ViewBinding(IncomingFragment incomingFragment, View view) {
        super(incomingFragment, view);
        this.IconCompatParcelizer = incomingFragment;
        incomingFragment.emptyIncomingTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.no_incoming_request_textview, "field 'emptyIncomingTextView'", TextView.class);
        incomingFragment.incomingRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.incoming_recycler_view, "field 'incomingRecyclerView'", RecyclerView.class);
    }

    public final void read() {
        IncomingFragment incomingFragment = this.IconCompatParcelizer;
        if (incomingFragment != null) {
            this.IconCompatParcelizer = null;
            incomingFragment.emptyIncomingTextView = null;
            incomingFragment.incomingRecyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

package com.scb.phone.view.fragment.requesttopay;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class OutgoingFragment_ViewBinding extends BaseRequestToPayFragment_ViewBinding {
    private OutgoingFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public OutgoingFragment_ViewBinding(final OutgoingFragment outgoingFragment, View view) {
        super(outgoingFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = outgoingFragment;
        outgoingFragment.emptyOutgoingTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.no_outgoing_request_textview, "field 'emptyOutgoingTextView'", TextView.class);
        outgoingFragment.outgoingRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.outgoing_recycler_view, "field 'outgoingRecyclerView'", RecyclerView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_new_request, "method 'onNewRequestClick'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OutgoingFragment.this.onNewRequestClick();
            }
        });
    }

    public final void read() {
        OutgoingFragment outgoingFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (outgoingFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            outgoingFragment.emptyOutgoingTextView = null;
            outgoingFragment.outgoingRecyclerView = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

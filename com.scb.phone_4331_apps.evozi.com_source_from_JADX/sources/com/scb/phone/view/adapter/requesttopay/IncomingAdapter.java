package com.scb.phone.view.adapter.requesttopay;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.C3092xce3d994b;
import p040o.getDonationDocument;
import p040o.onStart;

public final class IncomingAdapter extends RecyclerView.IconCompatParcelizer {
    public read MediaBrowserCompat$ItemReceiver;
    public List<C3092xce3d994b.C30931> read;
    public boolean write = false;

    @FunctionalInterface
    public interface IconCompatParcelizer {
        void MediaBrowserCompat$CustomActionResultReceiver(boolean z);
    }

    public interface read {
        void write(int i);
    }

    public class IncomingHolder_ViewBinding implements Unbinder {
        private IncomingHolder MediaBrowserCompat$CustomActionResultReceiver;

        public IncomingHolder_ViewBinding(IncomingHolder incomingHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = incomingHolder;
            incomingHolder.container = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.container_relative_layout, "field 'container'", LinearLayout.class);
            incomingHolder.NameTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.name_outgoing_textview, "field 'NameTextView'", TextView.class);
            incomingHolder.ProxyNumberTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pxoxy_number_outgoing_textview, "field 'ProxyNumberTextView'", TextView.class);
            incomingHolder.DueDateTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.due_date_outgoing_textview, "field 'DueDateTextView'", TextView.class);
            incomingHolder.AmountTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_outgoing_textview, "field 'AmountTextView'", TextView.class);
            incomingHolder.StatusTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.status_outgoing_textview, "field 'StatusTextView'", TextView.class);
        }

        public final void read() {
            IncomingHolder incomingHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (incomingHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                incomingHolder.container = null;
                incomingHolder.NameTextView = null;
                incomingHolder.ProxyNumberTextView = null;
                incomingHolder.DueDateTextView = null;
                incomingHolder.AmountTextView = null;
                incomingHolder.StatusTextView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public IncomingAdapter(read read2) {
        this.MediaBrowserCompat$ItemReceiver = read2;
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new IncomingHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83512131493577, viewGroup, false));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        if (setcontentview instanceof IncomingHolder) {
            IncomingHolder incomingHolder = (IncomingHolder) setcontentview;
            C3092xce3d994b.C30931 r0 = this.read.get(i);
            incomingHolder.NameTextView.setText(r0.MediaBrowserCompat$ItemReceiver);
            incomingHolder.ProxyNumberTextView.setText(r0.write);
            incomingHolder.DueDateTextView.setText(r0.IconCompatParcelizer);
            incomingHolder.AmountTextView.setText(r0.read);
            incomingHolder.StatusTextView.setText(r0.MediaMetadataCompat);
            incomingHolder.container.setOnClickListener(new getDonationDocument(this, i));
        }
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    public class IncomingHolder extends RecyclerView.setContentView {
        @BindView
        TextView AmountTextView;
        @BindView
        TextView DueDateTextView;
        @BindView
        TextView NameTextView;
        @BindView
        TextView ProxyNumberTextView;
        @BindView
        TextView StatusTextView;
        @BindView
        LinearLayout container;

        public IncomingHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}

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
import p040o.ETBService;
import p040o.onStart;
import p040o.setOffset;

public final class OutgoingAdapter extends RecyclerView.IconCompatParcelizer {
    public read MediaBrowserCompat$ItemReceiver;
    public List<setOffset> read;
    public boolean write = false;

    public interface read {
        void read(int i);
    }

    public class OutgoingHolder_ViewBinding implements Unbinder {
        private OutgoingHolder MediaBrowserCompat$CustomActionResultReceiver;

        public OutgoingHolder_ViewBinding(OutgoingHolder outgoingHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = outgoingHolder;
            outgoingHolder.container = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.container_relative_layout, "field 'container'", LinearLayout.class);
            outgoingHolder.NameTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.name_outgoing_textview, "field 'NameTextView'", TextView.class);
            outgoingHolder.ProxyNumberTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pxoxy_number_outgoing_textview, "field 'ProxyNumberTextView'", TextView.class);
            outgoingHolder.DueDateTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.due_date_outgoing_textview, "field 'DueDateTextView'", TextView.class);
            outgoingHolder.AmountTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_outgoing_textview, "field 'AmountTextView'", TextView.class);
            outgoingHolder.StatusTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.status_outgoing_textview, "field 'StatusTextView'", TextView.class);
        }

        public final void read() {
            OutgoingHolder outgoingHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (outgoingHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                outgoingHolder.container = null;
                outgoingHolder.NameTextView = null;
                outgoingHolder.ProxyNumberTextView = null;
                outgoingHolder.DueDateTextView = null;
                outgoingHolder.AmountTextView = null;
                outgoingHolder.StatusTextView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public OutgoingAdapter(read read2) {
        this.MediaBrowserCompat$ItemReceiver = read2;
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new OutgoingHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83512131493577, viewGroup, false));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        if (setcontentview instanceof OutgoingHolder) {
            OutgoingHolder outgoingHolder = (OutgoingHolder) setcontentview;
            setOffset setoffset = this.read.get(i);
            outgoingHolder.NameTextView.setText(setoffset.MediaBrowserCompat$CustomActionResultReceiver);
            outgoingHolder.ProxyNumberTextView.setText(setoffset.write);
            outgoingHolder.DueDateTextView.setText(setoffset.IconCompatParcelizer);
            outgoingHolder.AmountTextView.setText(setoffset.MediaBrowserCompat$ItemReceiver);
            outgoingHolder.StatusTextView.setText(setoffset.MediaBrowserCompat$MediaItem);
            outgoingHolder.container.setOnClickListener(new ETBService(this, i));
        }
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    public class OutgoingHolder extends RecyclerView.setContentView {
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

        public OutgoingHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}

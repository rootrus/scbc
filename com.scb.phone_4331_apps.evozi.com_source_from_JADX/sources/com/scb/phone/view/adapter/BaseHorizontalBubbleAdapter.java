package com.scb.phone.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.ArrayList;
import java.util.List;
import p040o.getICheckDeserializerRtti;
import p040o.onStart;
import p040o.setBarColorWhenSelected;

public class BaseHorizontalBubbleAdapter extends RecyclerView.IconCompatParcelizer {
    public int MediaBrowserCompat$ItemReceiver = -1;
    private IconCompatParcelizer read;
    public List<Integer> write = new ArrayList();

    public interface IconCompatParcelizer {
        void IconCompatParcelizer(int i);
    }

    public class SelectedItemHolder_ViewBinding implements Unbinder {
        private SelectedItemHolder IconCompatParcelizer;

        public SelectedItemHolder_ViewBinding(SelectedItemHolder selectedItemHolder, View view) {
            this.IconCompatParcelizer = selectedItemHolder;
            selectedItemHolder.amount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_text_view, "field 'amount'", TextView.class);
            selectedItemHolder.container = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_container_relative_layout, "field 'container'", RelativeLayout.class);
        }

        public final void read() {
            SelectedItemHolder selectedItemHolder = this.IconCompatParcelizer;
            if (selectedItemHolder != null) {
                this.IconCompatParcelizer = null;
                selectedItemHolder.amount = null;
                selectedItemHolder.container = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public BaseHorizontalBubbleAdapter(List<Integer> list, IconCompatParcelizer iconCompatParcelizer) {
        this.write = list;
        this.read = iconCompatParcelizer;
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new SelectedItemHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82312131493457, viewGroup, false));
        }
        if (i != 2) {
            return new C5722x80667d3b(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82302131493456, viewGroup, false));
        }
        return new BaseHorizontalBubbleAdapter$MediaBrowserCompat$ItemReceiver(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82322131493458, viewGroup, false));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        SelectedItemHolder selectedItemHolder = (SelectedItemHolder) setcontentview;
        selectedItemHolder.amount.setText(String.valueOf(this.write.get(i)));
        if (!(setcontentview instanceof BaseHorizontalBubbleAdapter$MediaBrowserCompat$ItemReceiver)) {
            selectedItemHolder.container.setOnClickListener(new setBarColorWhenSelected(this, i));
        }
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    public final /* synthetic */ void write(int i, View view) {
        if (this.MediaBrowserCompat$ItemReceiver != i) {
            this.MediaBrowserCompat$ItemReceiver = i;
            this.IconCompatParcelizer.write();
            IconCompatParcelizer iconCompatParcelizer = this.read;
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.IconCompatParcelizer(i);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaBrowserCompat$ItemReceiver = 0;
        this.IconCompatParcelizer.write();
    }

    public final void write(String str) {
        this.MediaBrowserCompat$ItemReceiver = this.write.indexOf(Integer.valueOf(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str).intValue()));
        this.IconCompatParcelizer.write();
    }

    public final int write() {
        int i = this.MediaBrowserCompat$ItemReceiver;
        if (i < 0 || MediaBrowserCompat$CustomActionResultReceiver(i) == 2) {
            return -1;
        }
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final Double MediaBrowserCompat$ItemReceiver() {
        int i = this.MediaBrowserCompat$ItemReceiver;
        return Double.valueOf(i >= 0 ? (double) this.write.get(i).intValue() : 0.0d);
    }

    class SelectedItemHolder extends RecyclerView.setContentView {
        @BindView
        TextView amount;
        @BindView
        RelativeLayout container;

        SelectedItemHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}

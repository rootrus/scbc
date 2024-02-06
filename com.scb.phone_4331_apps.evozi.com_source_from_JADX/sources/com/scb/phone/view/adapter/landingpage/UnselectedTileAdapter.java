package com.scb.phone.view.adapter.landingpage;

import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.ArrayList;
import java.util.List;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.getBytesForLog;
import p040o.getDebitResetOtpConfirm;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class UnselectedTileAdapter extends RecyclerView.IconCompatParcelizer<Holder> {
    /* access modifiers changed from: private */
    public final SparseBooleanArray MediaBrowserCompat$ItemReceiver = new SparseBooleanArray();
    private final write MediaBrowserCompat$MediaItem = new write() {
        public final void write(boolean z, int i) {
            UnselectedTileAdapter.this.MediaBrowserCompat$ItemReceiver.put(i, z);
            UnselectedTileAdapter.this.read.MediaBrowserCompat$CustomActionResultReceiver(UnselectedTileAdapter.this.MediaBrowserCompat$CustomActionResultReceiver());
        }
    };
    /* access modifiers changed from: private */
    public final read read;
    public final List<getBytesForLog> write = new ArrayList();

    public interface read {
        void MediaBrowserCompat$CustomActionResultReceiver(List<getBytesForLog> list);
    }

    public interface write {
        void write(boolean z, int i);
    }

    public class Holder_ViewBinding implements Unbinder {
        private Holder write;

        public Holder_ViewBinding(Holder holder, View view) {
            this.write = holder;
            holder.text1 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_1, "field 'text1'", TextView.class);
            holder.text2 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_2, "field 'text2'", TextView.class);
            holder.backgroundImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_background, "field 'backgroundImageView'", ImageView.class);
            holder.checkImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_check, "field 'checkImageView'", ImageView.class);
        }

        public final void read() {
            Holder holder = this.write;
            if (holder != null) {
                this.write = null;
                holder.text1 = null;
                holder.text2 = null;
                holder.backgroundImageView = null;
                holder.checkImageView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        Holder holder = (Holder) setcontentview;
        getBytesForLog getbytesforlog = this.write.get(i);
        boolean z = this.MediaBrowserCompat$ItemReceiver.get(i);
        holder.setHasDecor = z;
        holder.text1.setText(getbytesforlog.write);
        holder.text2.setText(getbytesforlog.MediaBrowserCompat$CustomActionResultReceiver);
        holder.text1.setTextColor(setLastBaselineToBottomHeight.read(holder.write.getContext(), getbytesforlog.MediaBrowserCompat$ItemReceiver));
        holder.text2.setTextColor(setLastBaselineToBottomHeight.read(holder.write.getContext(), getbytesforlog.MediaBrowserCompat$ItemReceiver));
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$ItemReceiver(holder.backgroundImageView.getContext(), (int) R.color.f66182131099773, holder.backgroundImageView, getbytesforlog.read);
        holder.checkImageView.setSelected(z);
    }

    public UnselectedTileAdapter(read read2) {
        this.read = read2;
    }

    public final List<getBytesForLog> MediaBrowserCompat$CustomActionResultReceiver() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.write.size(); i++) {
            if (this.MediaBrowserCompat$ItemReceiver.get(i)) {
                arrayList.add(this.write.get(i));
            }
        }
        return arrayList;
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    public static class Holder extends RecyclerView.setContentView {
        @BindView
        ImageView backgroundImageView;
        @BindView
        public ImageView checkImageView;
        public boolean setHasDecor;
        @BindView
        TextView text1;
        @BindView
        TextView text2;

        public Holder(ViewGroup viewGroup, write write) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f91042131494331, viewGroup, false));
            ButterKnife.IconCompatParcelizer(this, this.write);
            this.write.setOnClickListener(new getDebitResetOtpConfirm(this, write));
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new Holder(viewGroup, this.MediaBrowserCompat$MediaItem);
    }
}

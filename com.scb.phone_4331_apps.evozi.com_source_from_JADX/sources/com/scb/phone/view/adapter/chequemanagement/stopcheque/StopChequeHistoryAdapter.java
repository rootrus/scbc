package com.scb.phone.view.adapter.chequemanagement.stopcheque;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.CycleDetector;
import p040o.onStart;

public final class StopChequeHistoryAdapter extends RecyclerView.IconCompatParcelizer<ViewHolder> {
    public List<CycleDetector> read;
    private boolean write = false;

    @FunctionalInterface
    public interface IconCompatParcelizer {
        void MediaBrowserCompat$ItemReceiver(boolean z);
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = viewHolder;
            viewHolder.tvStopChequeNo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_stop_cheque_no, "field 'tvStopChequeNo'", TextView.class);
            viewHolder.tvStopChequeDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_stop_cheque_date, "field 'tvStopChequeDate'", TextView.class);
        }

        public final void read() {
            ViewHolder viewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (viewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                viewHolder.tvStopChequeNo = null;
                viewHolder.tvStopChequeDate = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        ViewHolder viewHolder = (ViewHolder) setcontentview;
        CycleDetector cycleDetector = this.read.get(i);
        if (cycleDetector != null) {
            viewHolder.tvStopChequeNo.setText(cycleDetector.IconCompatParcelizer);
            viewHolder.tvStopChequeDate.setText(cycleDetector.read);
        }
    }

    public StopChequeHistoryAdapter(List<CycleDetector> list) {
        this.read = list;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return this.read.get(i) == null ? 0 : 1;
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    static class ViewHolder extends RecyclerView.setContentView {
        @BindView
        TextView tvStopChequeDate;
        @BindView
        TextView tvStopChequeNo;

        public ViewHolder(View view, int i) {
            super(view);
            if (i == 1) {
                ButterKnife.IconCompatParcelizer(this, view);
            }
        }
    }

    public final void IconCompatParcelizer(boolean z, IconCompatParcelizer iconCompatParcelizer) {
        if (this.write != z) {
            this.write = z;
            if (z) {
                this.read.add((Object) null);
                this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.read.size() - 1, 1);
            } else {
                List<CycleDetector> list = this.read;
                list.remove(list.size() - 1);
                this.IconCompatParcelizer.write(this.read.size(), 1);
            }
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(z);
            }
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83992131493625, viewGroup, false), i);
        }
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83912131493617, viewGroup, false), i);
    }
}

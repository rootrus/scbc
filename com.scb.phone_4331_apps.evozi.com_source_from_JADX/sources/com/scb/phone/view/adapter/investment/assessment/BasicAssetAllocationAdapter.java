package com.scb.phone.view.adapter.investment.assessment;

import android.content.Context;
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
import p040o.onStart;
import p040o.populateEventDeviceData;

public final class BasicAssetAllocationAdapter extends RecyclerView.IconCompatParcelizer<BaaHolder> {
    private Context MediaBrowserCompat$ItemReceiver;
    private List<populateEventDeviceData.read> read;

    public class BaaHolder_ViewBinding implements Unbinder {
        private BaaHolder MediaBrowserCompat$CustomActionResultReceiver;

        public BaaHolder_ViewBinding(BaaHolder baaHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = baaHolder;
            baaHolder.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.asset_plan_text, "field 'title'", TextView.class);
            baaHolder.weightText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.asset_weight_text, "field 'weightText'", TextView.class);
        }

        public final void read() {
            BaaHolder baaHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (baaHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                baaHolder.title = null;
                baaHolder.weightText = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        BaaHolder baaHolder = (BaaHolder) setcontentview;
        populateEventDeviceData.read read2 = this.read.get(i);
        baaHolder.title.setText(read2.MediaBrowserCompat$ItemReceiver);
        baaHolder.weightText.setText(read2.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public BasicAssetAllocationAdapter(Context context, List<populateEventDeviceData.read> list) {
        this.MediaBrowserCompat$ItemReceiver = context;
        this.read = list;
        MediaBrowserCompat$ItemReceiver(true);
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    public final long MediaBrowserCompat$ItemReceiver(int i) {
        return (long) this.read.get(i).MediaBrowserCompat$ItemReceiver.hashCode();
    }

    static class BaaHolder extends RecyclerView.setContentView {
        @BindView
        TextView title;
        @BindView
        TextView weightText;

        BaaHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new BaaHolder(LayoutInflater.from(this.MediaBrowserCompat$ItemReceiver).inflate(R.layout.f82292131493455, viewGroup, false));
    }
}

package com.scb.phone.view.adapter.investment.scbs;

import android.graphics.Color;
import android.graphics.PorterDuff;
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
import java.util.List;
import p040o.getUserDataFileForSession;
import p040o.onStart;

public final class PieChartLegendAdapter extends RecyclerView.IconCompatParcelizer<ChartEntryViewHolder> {
    private List<getUserDataFileForSession> MediaBrowserCompat$ItemReceiver;

    public class ChartEntryViewHolder_ViewBinding implements Unbinder {
        private ChartEntryViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public ChartEntryViewHolder_ViewBinding(ChartEntryViewHolder chartEntryViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = chartEntryViewHolder;
            chartEntryViewHolder.titleText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_entry_title_text, "field 'titleText'", TextView.class);
            chartEntryViewHolder.percentageText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_percentage_text, "field 'percentageText'", TextView.class);
            chartEntryViewHolder.circleIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_circle_icon, "field 'circleIcon'", ImageView.class);
        }

        public final void read() {
            ChartEntryViewHolder chartEntryViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (chartEntryViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                chartEntryViewHolder.titleText = null;
                chartEntryViewHolder.percentageText = null;
                chartEntryViewHolder.circleIcon = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        ChartEntryViewHolder chartEntryViewHolder = (ChartEntryViewHolder) setcontentview;
        getUserDataFileForSession getuserdatafileforsession = this.MediaBrowserCompat$ItemReceiver.get(i);
        chartEntryViewHolder.titleText.setText(getuserdatafileforsession.MediaBrowserCompat$ItemReceiver);
        chartEntryViewHolder.percentageText.setText(getuserdatafileforsession.MediaBrowserCompat$CustomActionResultReceiver);
        chartEntryViewHolder.circleIcon.setColorFilter(Color.parseColor(getuserdatafileforsession.IconCompatParcelizer), PorterDuff.Mode.SRC_IN);
    }

    public PieChartLegendAdapter(List<getUserDataFileForSession> list) {
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public class ChartEntryViewHolder extends RecyclerView.setContentView {
        @BindView
        ImageView circleIcon;
        @BindView
        TextView percentageText;
        @BindView
        TextView titleText;

        public ChartEntryViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new ChartEntryViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f91852131494412, viewGroup, false));
    }
}

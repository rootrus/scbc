package com.scb.phone.view.adapter.devicesettings;

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
import java.util.List;
import p040o.C10872writeSessionOs;
import p040o.C6485x62801acb;
import p040o.getTcVersion;
import p040o.onStart;
import p040o.validateL3;
import p040o.validateSPMV;

public final class DeviceSettingsAdapter extends validateL3 {
    public C6485x62801acb MediaBrowserCompat$ItemReceiver;
    public List<C10872writeSessionOs> read;
    private final boolean write;

    public final long IconCompatParcelizer(int i) {
        return (long) i;
    }

    public final int read(int i) {
        return 0;
    }

    public final RecyclerView.setContentView read(ViewGroup viewGroup, int i) {
        return null;
    }

    public final long write(int i) {
        return (long) i;
    }

    public final void write(RecyclerView.setContentView setcontentview, int i, int i2) {
    }

    public class ParentViewHolder_ViewBinding implements Unbinder {
        private ParentViewHolder MediaBrowserCompat$ItemReceiver;

        public ParentViewHolder_ViewBinding(ParentViewHolder parentViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = parentViewHolder;
            parentViewHolder.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.device_settings_title, "field 'title'", TextView.class);
            parentViewHolder.date = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.device_settings_date, "field 'date'", TextView.class);
            parentViewHolder.delete = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.device_settings_relative_layout, "field 'delete'", RelativeLayout.class);
            parentViewHolder.divider = onStart.IconCompatParcelizer(view, R.id.device_settings_divider_view, "field 'divider'");
            parentViewHolder.fullDivider = onStart.IconCompatParcelizer(view, R.id.device_settings_full_divider_view, "field 'fullDivider'");
        }

        public final void read() {
            ParentViewHolder parentViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (parentViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                parentViewHolder.title = null;
                parentViewHolder.date = null;
                parentViewHolder.delete = null;
                parentViewHolder.divider = null;
                parentViewHolder.fullDivider = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public DeviceSettingsAdapter(C6485x62801acb fragmentBuilder_BindBaseInvestmentSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver, List<C10872writeSessionOs> list, boolean z) {
        this.read = list;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindBaseInvestmentSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver;
        MediaBrowserCompat$ItemReceiver(true);
        this.write = z;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        return this.read.size();
    }

    public final RecyclerView.setContentView write(ViewGroup viewGroup, int i) {
        return new ParentViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82642131493490, viewGroup, false));
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview, int i) {
        if (setcontentview instanceof ParentViewHolder) {
            ParentViewHolder parentViewHolder = (ParentViewHolder) setcontentview;
            StringBuilder sb = new StringBuilder();
            sb.append(this.read.get(i).MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(" ");
            sb.append(this.read.get(i).MediaBrowserCompat$SearchResultReceiver);
            String obj = sb.toString();
            boolean z = this.read.get(i).IconCompatParcelizer;
            parentViewHolder.title.setText(obj);
            parentViewHolder.date.setText(this.read.get(i).RatingCompat);
            if ((!z || !this.write) && z) {
                parentViewHolder.delete.setVisibility(8);
            } else {
                parentViewHolder.delete.setOnClickListener(new getTcVersion(this, i, obj));
            }
            if (i == this.read.size() - 1) {
                parentViewHolder.divider.setVisibility(8);
                parentViewHolder.fullDivider.setVisibility(0);
                return;
            }
            parentViewHolder.divider.setVisibility(0);
            parentViewHolder.fullDivider.setVisibility(8);
        }
    }

    /* renamed from: a_ */
    public final boolean mo20940a_(RecyclerView.setContentView setcontentview) {
        return setcontentview instanceof ParentViewHolder;
    }

    public static class ParentViewHolder extends validateSPMV {
        @BindView
        TextView date;
        @BindView
        RelativeLayout delete;
        @BindView
        View divider;
        @BindView
        View fullDivider;
        @BindView
        TextView title;

        public ParentViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}

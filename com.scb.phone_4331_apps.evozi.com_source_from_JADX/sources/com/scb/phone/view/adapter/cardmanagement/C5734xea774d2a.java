package com.scb.phone.view.adapter.cardmanagement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.adapter.cardmanagement.ExportCardStatementSelectionAdapter;
import java.util.List;
import p040o.AnalyticsConnector;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.adapter.cardmanagement.ExportCardStatementSelectionAdapter$MediaBrowserCompat$ItemReceiver */
public final class C5734xea774d2a extends RecyclerView.IconCompatParcelizer<RecyclerView.setContentView> {
    ExportCardStatementSelectionAdapter.read MediaBrowserCompat$ItemReceiver;
    private final int read;
    private final List<AnalyticsConnector.AnalyticsConnectorListener> write;

    public C5734xea774d2a(List<AnalyticsConnector.AnalyticsConnectorListener> list, int i) {
        this.write = list;
        this.read = i;
    }

    /* renamed from: com.scb.phone.view.adapter.cardmanagement.ExportCardStatementSelectionAdapter$MediaBrowserCompat$ItemReceiver$read */
    public enum read {
        ;

        private read(String str) {
        }
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90572131494284, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
        ExportCardStatementSelectionAdapter.MonthViewHolder monthViewHolder = new ExportCardStatementSelectionAdapter.MonthViewHolder(inflate);
        monthViewHolder.AlertController$RecycleListView = this.MediaBrowserCompat$ItemReceiver;
        return monthViewHolder;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return read.ITEM.ordinal();
    }

    public final int IconCompatParcelizer() {
        List<AnalyticsConnector.AnalyticsConnectorListener> list = this.write;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        List<AnalyticsConnector.AnalyticsConnectorListener> list;
        AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener;
        Context context;
        onGetStartedClick.write((Object) setcontentview, "holder");
        if ((setcontentview instanceof ExportCardStatementSelectionAdapter.MonthViewHolder) && (list = this.write) != null && (analyticsConnectorListener = list.get(i)) != null) {
            ExportCardStatementSelectionAdapter.MonthViewHolder monthViewHolder = (ExportCardStatementSelectionAdapter.MonthViewHolder) setcontentview;
            int i2 = this.read;
            onGetStartedClick.write((Object) analyticsConnectorListener, "display");
            String str = analyticsConnectorListener.IconCompatParcelizer;
            View view = monthViewHolder.write;
            if (view != null && (context = view.getContext()) != null) {
                CheckBox checkBox = monthViewHolder.ckbMonth;
                if (checkBox == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("ckbMonth");
                }
                checkBox.setEnabled(analyticsConnectorListener.write);
                CheckBox checkBox2 = monthViewHolder.ckbMonth;
                if (checkBox2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("ckbMonth");
                }
                checkBox2.setChecked(analyticsConnectorListener.MediaBrowserCompat$ItemReceiver);
                TextView textView = monthViewHolder.tvMonth;
                if (textView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvMonth");
                }
                textView.setText(analyticsConnectorListener.read);
                TextView textView2 = monthViewHolder.tvMonth;
                if (textView2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvMonth");
                }
                textView2.setTextColor(ExportCardStatementSelectionAdapter.MonthViewHolder.read(context, analyticsConnectorListener.write));
                TextView textView3 = monthViewHolder.tvMonth;
                if (textView3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvMonth");
                }
                textView3.setOnClickListener(new ExportCardStatementSelectionAdapter.MonthViewHolder.read(monthViewHolder));
                CheckBox checkBox3 = monthViewHolder.ckbMonth;
                if (checkBox3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("ckbMonth");
                }
                if (checkBox3.isEnabled()) {
                    CheckBox checkBox4 = monthViewHolder.ckbMonth;
                    if (checkBox4 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("ckbMonth");
                    }
                    checkBox4.setOnCheckedChangeListener(new C5735x15fc6bb7(monthViewHolder, analyticsConnectorListener, i2, str));
                }
            }
        }
    }
}

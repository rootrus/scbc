package com.scb.phone.view.adapter.cardmanagement;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.scb.phone.view.adapter.cardmanagement.ExportCardStatementSelectionAdapter;
import java.util.List;
import p040o.AnalyticsConnector;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.adapter.cardmanagement.ExportCardStatementSelectionAdapter$MonthViewHolder$MediaBrowserCompat$ItemReceiver */
final class C5735x15fc6bb7 implements CompoundButton.OnCheckedChangeListener {
    private /* synthetic */ ExportCardStatementSelectionAdapter.MonthViewHolder IconCompatParcelizer;
    private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ AnalyticsConnector.AnalyticsConnectorListener read;
    private /* synthetic */ int write;

    C5735x15fc6bb7(ExportCardStatementSelectionAdapter.MonthViewHolder monthViewHolder, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener, int i, String str) {
        this.IconCompatParcelizer = monthViewHolder;
        this.read = analyticsConnectorListener;
        this.write = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        List write2;
        List write3 = ExportCardStatementSelectionAdapter.RatingCompat;
        if ((write3 != null ? write3.size() : 0) < this.write) {
            this.read.MediaBrowserCompat$ItemReceiver = z;
            ExportCardStatementSelectionAdapter.read read2 = this.IconCompatParcelizer.AlertController$RecycleListView;
            if (read2 != null) {
                read2.MediaBrowserCompat$CustomActionResultReceiver(this.read);
            }
            boolean z2 = this.read.MediaBrowserCompat$ItemReceiver;
            if (z2) {
                List write4 = ExportCardStatementSelectionAdapter.RatingCompat;
                if (write4 != null) {
                    write4.add(String.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver));
                }
            } else if (!z2 && (write2 = ExportCardStatementSelectionAdapter.RatingCompat) != null) {
                write2.remove(String.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver));
            }
        } else {
            List write5 = ExportCardStatementSelectionAdapter.RatingCompat;
            Boolean valueOf = write5 != null ? Boolean.valueOf(write5.contains(String.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver))) : null;
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) valueOf, (Object) Boolean.TRUE)) {
                CheckBox checkBox = this.IconCompatParcelizer.ckbMonth;
                if (checkBox == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("ckbMonth");
                }
                checkBox.setChecked(false);
                this.read.MediaBrowserCompat$ItemReceiver = false;
                List write6 = ExportCardStatementSelectionAdapter.RatingCompat;
                if (write6 != null) {
                    write6.remove(String.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver));
                }
            } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) valueOf, (Object) Boolean.FALSE)) {
                ExportCardStatementSelectionAdapter.read read3 = this.IconCompatParcelizer.AlertController$RecycleListView;
                if (read3 != null) {
                    read3.IconCompatParcelizer(Integer.valueOf(this.write));
                }
                CheckBox checkBox2 = this.IconCompatParcelizer.ckbMonth;
                if (checkBox2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("ckbMonth");
                }
                checkBox2.setChecked(false);
            }
        }
    }
}

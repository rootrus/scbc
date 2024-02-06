package com.scb.phone.view.adapter.investment.discover;

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
import p040o.ContentFrameLayout;
import p040o.CrashlyticsUncaughtExceptionHandler;
import p040o.getDeejungTransferInstallmentsConfirmation;
import p040o.onStart;

public final class DiscoverFundsListAdapter extends RecyclerView.IconCompatParcelizer<SuggestedFundHolder> {

    public class SuggestedFundHolder_ViewBinding implements Unbinder {
        private SuggestedFundHolder IconCompatParcelizer;

        public SuggestedFundHolder_ViewBinding(SuggestedFundHolder suggestedFundHolder, View view) {
            this.IconCompatParcelizer = suggestedFundHolder;
            suggestedFundHolder.fundName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_name_text_view, "field 'fundName'", TextView.class);
            suggestedFundHolder.fundDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_description_text_view, "field 'fundDescription'", TextView.class);
            suggestedFundHolder.riskLevel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.risk_level_text_view, "field 'riskLevel'", TextView.class);
            suggestedFundHolder.riskDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.risk_description_text_view, "field 'riskDescription'", TextView.class);
            suggestedFundHolder.asOfDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.as_of_date_text_view, "field 'asOfDate'", TextView.class);
            suggestedFundHolder.nav = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.nav_text_view, "field 'nav'", TextView.class);
            suggestedFundHolder.change = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.change_text_view, "field 'change'", TextView.class);
            suggestedFundHolder.separator = onStart.IconCompatParcelizer(view, R.id.separator_view, "field 'separator'");
        }

        public final void read() {
            SuggestedFundHolder suggestedFundHolder = this.IconCompatParcelizer;
            if (suggestedFundHolder != null) {
                this.IconCompatParcelizer = null;
                suggestedFundHolder.fundName = null;
                suggestedFundHolder.fundDescription = null;
                suggestedFundHolder.riskLevel = null;
                suggestedFundHolder.riskDescription = null;
                suggestedFundHolder.asOfDate = null;
                suggestedFundHolder.nav = null;
                suggestedFundHolder.change = null;
                suggestedFundHolder.separator = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List, o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment, android.content.res.Resources$Theme, android.content.res.Resources] */
    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        SuggestedFundHolder suggestedFundHolder = (SuggestedFundHolder) setcontentview;
        ? r0 = 0;
        CrashlyticsUncaughtExceptionHandler.CrashListener crashListener = (CrashlyticsUncaughtExceptionHandler.CrashListener) r0.get(i);
        int size = r0.size();
        suggestedFundHolder.fundName.setText(crashListener.RatingCompat);
        suggestedFundHolder.fundDescription.setText(crashListener.MediaBrowserCompat$ItemReceiver);
        suggestedFundHolder.riskLevel.setText(crashListener.MediaSessionCompat$ResultReceiverWrapper);
        suggestedFundHolder.riskLevel.setTextColor(ContentFrameLayout.write(r0, crashListener.MediaBrowserCompat$MediaItem, r0));
        suggestedFundHolder.riskLevel.setBackgroundResource(crashListener.MediaBrowserCompat$SearchResultReceiver);
        suggestedFundHolder.riskDescription.setText(crashListener.MediaMetadataCompat);
        suggestedFundHolder.asOfDate.setText(crashListener.read);
        suggestedFundHolder.nav.setText(crashListener.MediaDescriptionCompat);
        suggestedFundHolder.change.setText(crashListener.IconCompatParcelizer);
        suggestedFundHolder.change.setTextColor(ContentFrameLayout.write(r0, crashListener.MediaBrowserCompat$CustomActionResultReceiver, r0));
        suggestedFundHolder.separator.setVisibility(i < size + -1 ? 0 : 4);
        suggestedFundHolder.AlertController$RecycleListView.setOnClickListener(new getDeejungTransferInstallmentsConfirmation(r0, i));
    }

    public final int IconCompatParcelizer() {
        List list = null;
        return list.size();
    }

    public static class SuggestedFundHolder extends RecyclerView.setContentView {
        View AlertController$RecycleListView;
        @BindView
        TextView asOfDate;
        @BindView
        TextView change;
        @BindView
        TextView fundDescription;
        @BindView
        TextView fundName;
        @BindView
        TextView nav;
        @BindView
        TextView riskDescription;
        @BindView
        TextView riskLevel;
        @BindView
        View separator;

        SuggestedFundHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            this.AlertController$RecycleListView = view;
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new SuggestedFundHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f81682131493394, viewGroup, false));
    }
}

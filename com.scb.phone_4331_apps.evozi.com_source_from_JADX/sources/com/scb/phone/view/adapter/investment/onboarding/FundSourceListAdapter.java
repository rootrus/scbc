package com.scb.phone.view.adapter.investment.onboarding;

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
import p040o.FragmentBuilder_BindCardlessWithdrawAmountFragment;
import p040o.getCrashlyticsInstallId;
import p040o.getTempLimitCriteria;
import p040o.onStart;

public final class FundSourceListAdapter extends RecyclerView.IconCompatParcelizer<FundSourceHolder> {
    public final FragmentBuilder_BindCardlessWithdrawAmountFragment MediaBrowserCompat$ItemReceiver;
    public List<getCrashlyticsInstallId> read;

    public class FundSourceHolder_ViewBinding implements Unbinder {
        private FundSourceHolder MediaBrowserCompat$CustomActionResultReceiver;

        public FundSourceHolder_ViewBinding(FundSourceHolder fundSourceHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = fundSourceHolder;
            fundSourceHolder.textSource = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_source, "field 'textSource'", TextView.class);
            fundSourceHolder.layoutSource = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_source, "field 'layoutSource'", LinearLayout.class);
        }

        public final void read() {
            FundSourceHolder fundSourceHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (fundSourceHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                fundSourceHolder.textSource = null;
                fundSourceHolder.layoutSource = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        FundSourceHolder fundSourceHolder = (FundSourceHolder) setcontentview;
        if (fundSourceHolder instanceof FundSourceHolder) {
            fundSourceHolder.textSource.setText(this.read.get(i).MediaBrowserCompat$CustomActionResultReceiver);
            fundSourceHolder.layoutSource.setOnClickListener(new getTempLimitCriteria(this, i));
        }
    }

    public FundSourceListAdapter(List<getCrashlyticsInstallId> list, FragmentBuilder_BindCardlessWithdrawAmountFragment fragmentBuilder_BindCardlessWithdrawAmountFragment) {
        this.read = list;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindCardlessWithdrawAmountFragment;
    }

    public final int IconCompatParcelizer() {
        List<getCrashlyticsInstallId> list = this.read;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public class FundSourceHolder extends RecyclerView.setContentView {
        @BindView
        LinearLayout layoutSource;
        @BindView
        TextView textSource;

        public FundSourceHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new FundSourceHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82972131493523, viewGroup, false));
    }
}

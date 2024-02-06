package com.scb.phone.view.adapter.investment.purchase;

import android.content.Context;
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
import p040o.FragmentBuilder_BindChequeSuccessFragment;
import p040o.InstallIdProvider;
import p040o.getCardlessInfo;
import p040o.onStart;

public final class FundSearchListAdapter extends RecyclerView.IconCompatParcelizer<FundHolder> {
    public FragmentBuilder_BindChequeSuccessFragment MediaBrowserCompat$ItemReceiver;
    private Context read;
    public List<InstallIdProvider> write;

    public class FundHolder_ViewBinding implements Unbinder {
        private FundHolder IconCompatParcelizer;

        public FundHolder_ViewBinding(FundHolder fundHolder, View view) {
            this.IconCompatParcelizer = fundHolder;
            fundHolder.container = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_search_item_container, "field 'container'", RelativeLayout.class);
            fundHolder.mFundCode = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_code, "field 'mFundCode'", TextView.class);
            fundHolder.mFundDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_description, "field 'mFundDescription'", TextView.class);
        }

        public final void read() {
            FundHolder fundHolder = this.IconCompatParcelizer;
            if (fundHolder != null) {
                this.IconCompatParcelizer = null;
                fundHolder.container = null;
                fundHolder.mFundCode = null;
                fundHolder.mFundDescription = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        FundHolder fundHolder = (FundHolder) setcontentview;
        InstallIdProvider installIdProvider = FundSearchListAdapter.this.write.get(i);
        fundHolder.mFundCode.setText(installIdProvider.MediaBrowserCompat$ItemReceiver);
        fundHolder.mFundDescription.setText(installIdProvider.MediaBrowserCompat$SearchResultReceiver);
        fundHolder.container.setOnClickListener(new getCardlessInfo(this, i));
    }

    public FundSearchListAdapter(Context context, List<InstallIdProvider> list, FragmentBuilder_BindChequeSuccessFragment fragmentBuilder_BindChequeSuccessFragment) {
        this.read = context;
        this.write = list;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindChequeSuccessFragment;
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    class FundHolder extends RecyclerView.setContentView {
        @BindView
        RelativeLayout container;
        @BindView
        TextView mFundCode;
        @BindView
        TextView mFundDescription;

        FundHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new FundHolder(LayoutInflater.from(this.read).inflate(R.layout.f82952131493521, viewGroup, false));
    }
}

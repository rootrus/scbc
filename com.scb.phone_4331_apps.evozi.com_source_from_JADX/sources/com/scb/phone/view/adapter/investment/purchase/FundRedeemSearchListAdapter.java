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
import p040o.CardlessATMService;
import p040o.FragmentBuilder_BindCloseAccountReviewFragment;
import p040o.getOsDisplayVersionString;
import p040o.onStart;

public final class FundRedeemSearchListAdapter extends RecyclerView.IconCompatParcelizer<FundHolder> {
    public FragmentBuilder_BindCloseAccountReviewFragment MediaBrowserCompat$ItemReceiver;
    private Context read;
    public List<getOsDisplayVersionString> write;

    public class FundHolder_ViewBinding implements Unbinder {
        private FundHolder MediaBrowserCompat$ItemReceiver;

        public FundHolder_ViewBinding(FundHolder fundHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = fundHolder;
            fundHolder.container = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_redeem_search_item_container, "field 'container'", RelativeLayout.class);
            fundHolder.mFundCode = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_code, "field 'mFundCode'", TextView.class);
            fundHolder.mFundDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_description, "field 'mFundDescription'", TextView.class);
            fundHolder.mFundNav = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_nav, "field 'mFundNav'", TextView.class);
            fundHolder.mFundAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_available_amount, "field 'mFundAmount'", TextView.class);
            fundHolder.mFundUnits = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_available_units, "field 'mFundUnits'", TextView.class);
        }

        public final void read() {
            FundHolder fundHolder = this.MediaBrowserCompat$ItemReceiver;
            if (fundHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                fundHolder.container = null;
                fundHolder.mFundCode = null;
                fundHolder.mFundDescription = null;
                fundHolder.mFundNav = null;
                fundHolder.mFundAmount = null;
                fundHolder.mFundUnits = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        FundHolder fundHolder = (FundHolder) setcontentview;
        getOsDisplayVersionString getosdisplayversionstring = FundRedeemSearchListAdapter.this.write.get(i);
        fundHolder.mFundDescription.setVisibility(0);
        fundHolder.mFundDescription.setText(getosdisplayversionstring.MediaBrowserCompat$MediaItem);
        fundHolder.mFundCode.setText(getosdisplayversionstring.MediaSessionCompat$ResultReceiverWrapper);
        fundHolder.mFundNav.setText(getosdisplayversionstring.RatingCompat);
        fundHolder.mFundAmount.setText(getosdisplayversionstring.MediaBrowserCompat$ItemReceiver);
        fundHolder.mFundUnits.setText(getosdisplayversionstring.read);
        fundHolder.container.setOnClickListener(new CardlessATMService(this, i));
    }

    public FundRedeemSearchListAdapter(Context context, List<getOsDisplayVersionString> list, FragmentBuilder_BindCloseAccountReviewFragment fragmentBuilder_BindCloseAccountReviewFragment) {
        this.read = context;
        this.write = list;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindCloseAccountReviewFragment;
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    class FundHolder extends RecyclerView.setContentView {
        @BindView
        RelativeLayout container;
        @BindView
        TextView mFundAmount;
        @BindView
        TextView mFundCode;
        @BindView
        TextView mFundDescription;
        @BindView
        TextView mFundNav;
        @BindView
        TextView mFundUnits;

        FundHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new FundHolder(LayoutInflater.from(this.read).inflate(R.layout.f82942131493520, viewGroup, false));
    }
}

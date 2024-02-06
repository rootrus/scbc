package com.scb.phone.view.adapter.investment.fundswitch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.ArrayList;
import java.util.List;
import p040o.DataTransportState;
import p040o.FragmentBuilder_BindCloseAccountSelectionOwnSelectedFragment;
import p040o.onStart;
import p040o.sendEStatementToEmail;
import p040o.waitForAutomaticDataCollectionEnabled;

public final class FundSwitchSearchListAdapter extends RecyclerView.IconCompatParcelizer<FundHolder> {
    public List<waitForAutomaticDataCollectionEnabled> MediaBrowserCompat$ItemReceiver;
    private Context MediaDescriptionCompat;
    public FragmentBuilder_BindCloseAccountSelectionOwnSelectedFragment read;
    public List<DataTransportState> write = new ArrayList();

    public class FundHolder_ViewBinding implements Unbinder {
        private FundHolder MediaBrowserCompat$CustomActionResultReceiver;

        public FundHolder_ViewBinding(FundHolder fundHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = fundHolder;
            fundHolder.container = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_redeem_search_item_container, "field 'container'", RelativeLayout.class);
            fundHolder.mFundCode = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_code, "field 'mFundCode'", TextView.class);
            fundHolder.mFundDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_description, "field 'mFundDescription'", TextView.class);
            fundHolder.mFundNav = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_nav, "field 'mFundNav'", TextView.class);
            fundHolder.mFundAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_available_amount, "field 'mFundAmount'", TextView.class);
            fundHolder.mFundUnits = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_available_units, "field 'mFundUnits'", TextView.class);
            fundHolder.availableUnitsContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_available_units_container, "field 'availableUnitsContainer'", LinearLayout.class);
            fundHolder.NavTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_nav_title, "field 'NavTitle'", TextView.class);
            fundHolder.navTitleSpace = onStart.IconCompatParcelizer(view, R.id.fund_nav_title_space, "field 'navTitleSpace'");
        }

        public final void read() {
            FundHolder fundHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (fundHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                fundHolder.container = null;
                fundHolder.mFundCode = null;
                fundHolder.mFundDescription = null;
                fundHolder.mFundNav = null;
                fundHolder.mFundAmount = null;
                fundHolder.mFundUnits = null;
                fundHolder.availableUnitsContainer = null;
                fundHolder.NavTitle = null;
                fundHolder.navTitleSpace = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        FundHolder fundHolder = (FundHolder) setcontentview;
        if (FundSwitchSearchListAdapter.this.write != null) {
            DataTransportState dataTransportState = FundSwitchSearchListAdapter.this.write.get(i);
            fundHolder.mFundDescription.setVisibility(0);
            fundHolder.mFundDescription.setText(dataTransportState.MediaBrowserCompat$MediaItem);
            fundHolder.mFundCode.setText(dataTransportState.MediaSessionCompat$ResultReceiverWrapper);
            fundHolder.mFundNav.setText(dataTransportState.RatingCompat);
            fundHolder.mFundAmount.setText(dataTransportState.MediaBrowserCompat$ItemReceiver);
            fundHolder.mFundUnits.setText(dataTransportState.read);
        } else {
            waitForAutomaticDataCollectionEnabled waitforautomaticdatacollectionenabled = FundSwitchSearchListAdapter.this.MediaBrowserCompat$ItemReceiver.get(i);
            fundHolder.mFundDescription.setVisibility(8);
            fundHolder.mFundCode.setText(waitforautomaticdatacollectionenabled.RatingCompat);
            fundHolder.mFundNav.setText(waitforautomaticdatacollectionenabled.read);
            fundHolder.mFundAmount.setVisibility(8);
            fundHolder.availableUnitsContainer.setVisibility(8);
            fundHolder.NavTitle.setVisibility(8);
            fundHolder.navTitleSpace.setVisibility(8);
        }
        fundHolder.container.setOnClickListener(new sendEStatementToEmail(this, i));
    }

    public FundSwitchSearchListAdapter(Context context, FragmentBuilder_BindCloseAccountSelectionOwnSelectedFragment fragmentBuilder_BindCloseAccountSelectionOwnSelectedFragment) {
        this.MediaDescriptionCompat = context;
        this.read = fragmentBuilder_BindCloseAccountSelectionOwnSelectedFragment;
    }

    public final int IconCompatParcelizer() {
        List list = this.write;
        if (list == null) {
            list = this.MediaBrowserCompat$ItemReceiver;
        }
        return list.size();
    }

    class FundHolder extends RecyclerView.setContentView {
        @BindView
        TextView NavTitle;
        @BindView
        LinearLayout availableUnitsContainer;
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
        @BindView
        View navTitleSpace;

        FundHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new FundHolder(LayoutInflater.from(this.MediaDescriptionCompat).inflate(R.layout.f82942131493520, viewGroup, false));
    }
}

package com.scb.phone.view.fragment.investment.redeem;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.investment.purchase.FundRedeemSearchListAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.List;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.FragmentBuilder_BindCloseAccountReviewFragment;
import p040o.forEachMultiply;
import p040o.getOsDisplayVersionString;

public class FundRedeemSearchListFragment extends BaseFragment implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer, FragmentBuilder_BindCloseAccountReviewFragment {
    private FundRedeemSearchListAdapter IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver = "";
    @BindView
    RelativeLayout mContainerRelativeLayout;
    @BindView
    TextView mEmptyCenterTitle;
    @BindView
    TextView mEmptyDescription;
    @BindView
    ImageView mEmptyImage;
    @BindView
    TextView mEmptyTitle;
    @BindView
    RecyclerView mRecyclerView;
    @BindView
    TextView mShowMessages;

    public static FundRedeemSearchListFragment IconCompatParcelizer(List<getOsDisplayVersionString> list) {
        FundRedeemSearchListFragment fundRedeemSearchListFragment = new FundRedeemSearchListFragment();
        if (list != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("LIST_REDEEM_SEARCH", (ArrayList) list);
            fundRedeemSearchListFragment.setArguments(bundle);
        }
        return fundRedeemSearchListFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87622131493989, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        if (getArguments() == null) {
            this.mEmptyTitle.setText(getResources().getString(R.string.custom_empty_title));
            this.mEmptyDescription.setText(getResources().getString(R.string.custom_empty_description));
            this.mContainerRelativeLayout.setVisibility(0);
            this.mEmptyImage.setVisibility(0);
            this.mShowMessages.setVisibility(8);
            this.mRecyclerView.setVisibility(8);
        } else if (getArguments().getParcelableArrayList("LIST_REDEEM_SEARCH").size() == 0) {
            write(getResources().getString(R.string.redeem_fund_not_found));
        } else {
            MediaBrowserCompat$CustomActionResultReceiver(getArguments().getParcelableArrayList("LIST_REDEEM_SEARCH"));
        }
        return inflate;
    }

    private void MediaBrowserCompat$ItemReceiver(List<getOsDisplayVersionString> list) {
        getContext();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.mRecyclerView.setNestedScrollingEnabled(false);
        FundRedeemSearchListAdapter fundRedeemSearchListAdapter = new FundRedeemSearchListAdapter(getContext(), list, this);
        this.IconCompatParcelizer = fundRedeemSearchListAdapter;
        this.mRecyclerView.setAdapter(fundRedeemSearchListAdapter);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<getOsDisplayVersionString> list) {
        if (list.size() == 0) {
            write(getResources().getString(R.string.redeem_fund_not_found));
            return;
        }
        this.mContainerRelativeLayout.setVisibility(8);
        this.mShowMessages.setVisibility(8);
        this.mRecyclerView.setVisibility(0);
        FundRedeemSearchListAdapter fundRedeemSearchListAdapter = this.IconCompatParcelizer;
        if (fundRedeemSearchListAdapter == null) {
            MediaBrowserCompat$ItemReceiver(list);
            return;
        }
        fundRedeemSearchListAdapter.write = null;
        fundRedeemSearchListAdapter.write = list;
        fundRedeemSearchListAdapter.IconCompatParcelizer.write();
    }

    public final void Keep() {
        this.mContainerRelativeLayout.setVisibility(8);
        this.mShowMessages.setVisibility(8);
        this.mRecyclerView.setVisibility(8);
        super.Keep();
    }

    public final void read(getOsDisplayVersionString getosdisplayversionstring) {
        forEachMultiply foreachmultiply = new forEachMultiply();
        foreachmultiply.write(this.MediaBrowserCompat$CustomActionResultReceiver, getosdisplayversionstring.MediaSessionCompat$ResultReceiverWrapper, getosdisplayversionstring.MediaDescriptionCompat);
        if (getActivity() != null) {
            foreachmultiply.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "mfsearchredeem_fundclicked");
        }
        Intent intent = new Intent();
        intent.putExtra("com.scb.phone.REDEEM_FUND_SEARCH_SELECTED", getosdisplayversionstring);
        getActivity().setResult(-1, intent);
        getActivity().finish();
    }

    private void write(String str) {
        this.mEmptyTitle.setVisibility(8);
        this.mEmptyCenterTitle.setVisibility(0);
        this.mEmptyDescription.setVisibility(8);
        this.mContainerRelativeLayout.setVisibility(0);
        this.mShowMessages.setVisibility(8);
        this.mRecyclerView.setVisibility(8);
        this.mEmptyImage.setVisibility(8);
        this.mEmptyCenterTitle.setText(str);
    }
}

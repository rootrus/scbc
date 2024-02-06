package com.scb.phone.view.fragment.investment.purchase;

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
import com.scb.phone.view.adapter.investment.purchase.FundSearchListAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.List;
import p040o.FragmentBuilder_BindChequeSuccessFragment;
import p040o.InstallIdProvider;
import p040o.forEachMultiply;

public abstract class BaseTabFragment extends BaseFragment implements FragmentBuilder_BindChequeSuccessFragment {
    private FundSearchListAdapter IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver = "";
    private String MediaBrowserCompat$MediaItem = "";
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

    /* access modifiers changed from: protected */
    public abstract String write();

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87622131493989, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        if (getArguments() != null) {
            this.MediaBrowserCompat$MediaItem = getArguments().getString("extra_search_type", "");
            ArrayList parcelableArrayList = getArguments().getParcelableArrayList(write());
            if (parcelableArrayList != null) {
                if (parcelableArrayList.isEmpty()) {
                    IconCompatParcelizer(getResources().getString(R.string.fund_not_found));
                } else {
                    write(parcelableArrayList);
                }
                return inflate;
            }
        }
        this.mEmptyTitle.setText(getResources().getString(R.string.custom_empty_title));
        this.mEmptyDescription.setText(getResources().getString(R.string.custom_empty_description));
        this.mContainerRelativeLayout.setVisibility(0);
        this.mEmptyImage.setVisibility(0);
        this.mShowMessages.setVisibility(8);
        this.mRecyclerView.setVisibility(8);
        return inflate;
    }

    public final void write(List<InstallIdProvider> list) {
        if (list.size() == 0) {
            IconCompatParcelizer(getResources().getString(R.string.fund_search_no_results));
            return;
        }
        this.mContainerRelativeLayout.setVisibility(8);
        this.mShowMessages.setVisibility(8);
        this.mRecyclerView.setVisibility(0);
        FundSearchListAdapter fundSearchListAdapter = this.IconCompatParcelizer;
        if (fundSearchListAdapter == null) {
            IconCompatParcelizer(list);
            return;
        }
        fundSearchListAdapter.write = null;
        fundSearchListAdapter.write = list;
        fundSearchListAdapter.IconCompatParcelizer.write();
    }

    private void IconCompatParcelizer(List<InstallIdProvider> list) {
        getContext();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.mRecyclerView.setNestedScrollingEnabled(false);
        FundSearchListAdapter fundSearchListAdapter = new FundSearchListAdapter(getContext(), list, this);
        this.IconCompatParcelizer = fundSearchListAdapter;
        this.mRecyclerView.setAdapter(fundSearchListAdapter);
    }

    public final void Keep() {
        this.mContainerRelativeLayout.setVisibility(8);
        this.mShowMessages.setVisibility(8);
        this.mRecyclerView.setVisibility(8);
        super.Keep();
    }

    private void IconCompatParcelizer(String str) {
        this.mEmptyTitle.setVisibility(8);
        this.mEmptyCenterTitle.setVisibility(0);
        this.mEmptyDescription.setVisibility(8);
        this.mContainerRelativeLayout.setVisibility(0);
        this.mShowMessages.setVisibility(8);
        this.mRecyclerView.setVisibility(8);
        this.mEmptyImage.setVisibility(8);
        this.mEmptyCenterTitle.setText(str);
    }

    public final void IconCompatParcelizer(InstallIdProvider installIdProvider) {
        String str;
        forEachMultiply foreachmultiply = new forEachMultiply();
        String str2 = this.MediaBrowserCompat$MediaItem;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str4 = installIdProvider.MediaBrowserCompat$ItemReceiver;
        if (!(str4 == null || str4.length() == 0)) {
            str = installIdProvider.MediaBrowserCompat$ItemReceiver;
        } else {
            str = installIdProvider.IconCompatParcelizer;
        }
        foreachmultiply.read("fund", str);
        foreachmultiply.read("keyword", str3);
        foreachmultiply.read("tab", str2);
        if (getActivity() != null) {
            foreachmultiply.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "mfsearchpurchase_fundclicked");
        }
        Intent intent = new Intent();
        intent.putExtra("com.scb.phone.PURCHASE_FUND_SEARCH_SELECTED", installIdProvider);
        getActivity().setResult(-1, intent);
        getActivity().finish();
    }
}

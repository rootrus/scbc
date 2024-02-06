package com.scb.phone.view.fragment.investment.funddetails;

import android.os.Bundle;
import android.os.Parcelable;
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
import com.scb.phone.view.adapter.investment.funddetails.DividendSummaryAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.List;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.getCurrentTimeMillis;
import p040o.validateGER;

public class DividendTabFragment extends BaseFragment implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    private DividendSummaryAdapter MediaBrowserCompat$CustomActionResultReceiver;
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

    public static DividendTabFragment IconCompatParcelizer(List<getCurrentTimeMillis> list) {
        DividendTabFragment dividendTabFragment = new DividendTabFragment();
        if (list != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("com.scb.phone.FUND_DIVIDEND_LIST", (ArrayList) list);
            dividendTabFragment.setArguments(bundle);
        }
        return dividendTabFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87562131493983, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        if (getArguments() != null) {
            ArrayList parcelableArrayList = getArguments().getParcelableArrayList("com.scb.phone.FUND_DIVIDEND_LIST");
            if (parcelableArrayList == null) {
                MediaMetadataCompat();
            } else if (parcelableArrayList.size() == 0) {
                this.mEmptyTitle.setVisibility(8);
                this.mEmptyCenterTitle.setVisibility(0);
                this.mEmptyCenterTitle.setText(getResources().getString(R.string.custom_empty_no_dividend));
                this.mEmptyDescription.setVisibility(8);
                this.mContainerRelativeLayout.setVisibility(0);
                this.mShowMessages.setVisibility(8);
                this.mRecyclerView.setVisibility(8);
                this.mEmptyImage.setVisibility(8);
            } else {
                this.mContainerRelativeLayout.setVisibility(8);
                this.mShowMessages.setVisibility(8);
                this.mRecyclerView.setVisibility(0);
                DividendSummaryAdapter dividendSummaryAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (dividendSummaryAdapter == null) {
                    getContext();
                    this.mRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
                    this.mRecyclerView.setNestedScrollingEnabled(false);
                    validateGER validateger = new validateGER((Parcelable) null);
                    DividendSummaryAdapter dividendSummaryAdapter2 = new DividendSummaryAdapter(getContext(), parcelableArrayList, validateger);
                    this.MediaBrowserCompat$CustomActionResultReceiver = dividendSummaryAdapter2;
                    this.mRecyclerView.setAdapter(validateger.MediaBrowserCompat$ItemReceiver((RecyclerView.IconCompatParcelizer) dividendSummaryAdapter2));
                    validateger.IconCompatParcelizer(this.mRecyclerView);
                } else {
                    dividendSummaryAdapter.MediaBrowserCompat$ItemReceiver = null;
                    dividendSummaryAdapter.MediaBrowserCompat$ItemReceiver = parcelableArrayList;
                    dividendSummaryAdapter.IconCompatParcelizer.write();
                }
            }
        } else {
            MediaMetadataCompat();
        }
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    private void MediaMetadataCompat() {
        this.mEmptyTitle.setText(getResources().getString(R.string.ltf_divided_empty_title));
        this.mEmptyDescription.setText(getResources().getString(R.string.ltf_divided_empty_description));
        this.mContainerRelativeLayout.setVisibility(0);
        this.mEmptyImage.setVisibility(0);
        this.mShowMessages.setVisibility(8);
        this.mRecyclerView.setVisibility(8);
    }
}

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
import com.scb.phone.view.adapter.investment.funddetails.LtfSummaryAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.List;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.DataCollectionArbiter;
import p040o.validateGER;

public class LtfTabFragment extends BaseFragment implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    private LtfSummaryAdapter MediaBrowserCompat$CustomActionResultReceiver;
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

    public static LtfTabFragment read(List<DataCollectionArbiter> list, String str) {
        LtfTabFragment ltfTabFragment = new LtfTabFragment();
        if (list != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("com.scb.phone.FUND_LTF_LIST", (ArrayList) list);
            bundle.putString("EXTRA_FUND_TYPE", str);
            ltfTabFragment.setArguments(bundle);
        }
        return ltfTabFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87572131493984, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        if (getArguments() != null) {
            ArrayList parcelableArrayList = getArguments().getParcelableArrayList("com.scb.phone.FUND_LTF_LIST");
            String string = getArguments().getString("EXTRA_FUND_TYPE");
            if (parcelableArrayList == null) {
                RatingCompat();
            } else if (parcelableArrayList.size() == 0) {
                this.mEmptyTitle.setVisibility(8);
                this.mEmptyCenterTitle.setVisibility(0);
                this.mEmptyCenterTitle.setText(getResources().getString(R.string.custom_empty_no_transactions));
                this.mEmptyDescription.setVisibility(8);
                this.mContainerRelativeLayout.setVisibility(0);
                this.mShowMessages.setVisibility(8);
                this.mRecyclerView.setVisibility(8);
                this.mEmptyImage.setVisibility(8);
            } else {
                this.mContainerRelativeLayout.setVisibility(8);
                this.mShowMessages.setVisibility(8);
                this.mRecyclerView.setVisibility(0);
                LtfSummaryAdapter ltfSummaryAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (ltfSummaryAdapter == null) {
                    getContext();
                    this.mRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
                    this.mRecyclerView.setNestedScrollingEnabled(false);
                    validateGER validateger = new validateGER((Parcelable) null);
                    LtfSummaryAdapter ltfSummaryAdapter2 = new LtfSummaryAdapter(getContext(), parcelableArrayList, string, validateger);
                    this.MediaBrowserCompat$CustomActionResultReceiver = ltfSummaryAdapter2;
                    this.mRecyclerView.setAdapter(validateger.MediaBrowserCompat$ItemReceiver((RecyclerView.IconCompatParcelizer) ltfSummaryAdapter2));
                    validateger.IconCompatParcelizer(this.mRecyclerView);
                } else {
                    ltfSummaryAdapter.MediaBrowserCompat$ItemReceiver = null;
                    ltfSummaryAdapter.MediaBrowserCompat$ItemReceiver = parcelableArrayList;
                    ltfSummaryAdapter.IconCompatParcelizer.write();
                }
            }
        } else {
            RatingCompat();
        }
        return inflate;
    }

    private void RatingCompat() {
        this.mEmptyTitle.setText(getResources().getString(R.string.ltf_divided_empty_title));
        this.mEmptyDescription.setText(getResources().getString(R.string.ltf_divided_empty_description));
        this.mContainerRelativeLayout.setVisibility(0);
        this.mEmptyImage.setVisibility(0);
        this.mShowMessages.setVisibility(8);
        this.mRecyclerView.setVisibility(8);
    }
}

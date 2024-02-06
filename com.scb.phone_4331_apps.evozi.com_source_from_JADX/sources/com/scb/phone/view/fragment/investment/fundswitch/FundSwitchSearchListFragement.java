package com.scb.phone.view.fragment.investment.fundswitch;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.investment.fundswitch.FundSwitchSearchListAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.List;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.DataTransportState;
import p040o.FragmentBuilder_BindCloseAccountSelectionOwnSelectedFragment;
import p040o.forEachMultiply;
import p040o.waitForAutomaticDataCollectionEnabled;

public class FundSwitchSearchListFragement extends BaseFragment implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer, FragmentBuilder_BindCloseAccountSelectionOwnSelectedFragment {
    private FundSwitchSearchListAdapter IconCompatParcelizer;
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

    public static FundSwitchSearchListFragement MediaBrowserCompat$ItemReceiver(List<DataTransportState> list, List<waitForAutomaticDataCollectionEnabled> list2) {
        FundSwitchSearchListFragement fundSwitchSearchListFragement = new FundSwitchSearchListFragement();
        Bundle bundle = new Bundle();
        if (list != null) {
            bundle.putParcelableArrayList("LIST_SWITCH_OUT_SEARCH", (ArrayList) list);
        }
        if (list2 != null) {
            bundle.putParcelableArrayList("LIST_SWITCH_IN_SEARCH", (ArrayList) list2);
        }
        fundSwitchSearchListFragement.setArguments(bundle);
        return fundSwitchSearchListFragement;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            r7 = 0
            r0 = 2131493989(0x7f0c0465, float:1.8611474E38)
            android.view.View r5 = r5.inflate(r0, r6, r7)
            butterknife.ButterKnife.IconCompatParcelizer(r4, r5)
            android.os.Bundle r6 = r4.getArguments()
            r0 = 8
            if (r6 == 0) goto L_0x007b
            android.os.Bundle r6 = r4.getArguments()
            java.lang.String r1 = "LIST_SWITCH_OUT_SEARCH"
            java.util.ArrayList r6 = r6.getParcelableArrayList(r1)
            android.os.Bundle r1 = r4.getArguments()
            java.lang.String r2 = "LIST_SWITCH_IN_SEARCH"
            java.util.ArrayList r1 = r1.getParcelableArrayList(r2)
            r2 = 1
            if (r6 == 0) goto L_0x0036
            int r3 = r6.size()
            if (r3 == 0) goto L_0x0034
            r4.read(r6)
            goto L_0x0036
        L_0x0034:
            r6 = r2
            goto L_0x0037
        L_0x0036:
            r6 = r7
        L_0x0037:
            if (r1 == 0) goto L_0x0044
            int r6 = r1.size()
            if (r6 == 0) goto L_0x0045
            r4.MediaBrowserCompat$ItemReceiver((java.util.List<p040o.waitForAutomaticDataCollectionEnabled>) r1)
            r2 = r7
            goto L_0x0045
        L_0x0044:
            r2 = r6
        L_0x0045:
            if (r2 == 0) goto L_0x00af
            android.widget.TextView r6 = r4.mEmptyTitle
            r6.setVisibility(r0)
            android.widget.TextView r6 = r4.mEmptyCenterTitle
            r6.setVisibility(r7)
            android.widget.TextView r6 = r4.mEmptyCenterTitle
            android.content.res.Resources r1 = r4.getResources()
            r2 = 2131757654(0x7f100a56, float:1.914625E38)
            java.lang.String r1 = r1.getString(r2)
            r6.setText(r1)
            android.widget.TextView r6 = r4.mEmptyDescription
            r6.setVisibility(r0)
            android.widget.RelativeLayout r6 = r4.mContainerRelativeLayout
            r6.setVisibility(r7)
            android.widget.TextView r6 = r4.mShowMessages
            r6.setVisibility(r0)
            androidx.recyclerview.widget.RecyclerView r6 = r4.mRecyclerView
            r6.setVisibility(r0)
            android.widget.ImageView r6 = r4.mEmptyImage
            r6.setVisibility(r0)
            goto L_0x00af
        L_0x007b:
            android.widget.TextView r6 = r4.mEmptyTitle
            android.content.res.Resources r1 = r4.getResources()
            r2 = 2131756802(0x7f100702, float:1.9144522E38)
            java.lang.String r1 = r1.getString(r2)
            r6.setText(r1)
            android.widget.TextView r6 = r4.mEmptyDescription
            android.content.res.Resources r1 = r4.getResources()
            r2 = 2131756799(0x7f1006ff, float:1.9144516E38)
            java.lang.String r1 = r1.getString(r2)
            r6.setText(r1)
            android.widget.RelativeLayout r6 = r4.mContainerRelativeLayout
            r6.setVisibility(r7)
            android.widget.ImageView r6 = r4.mEmptyImage
            r6.setVisibility(r7)
            android.widget.TextView r6 = r4.mShowMessages
            r6.setVisibility(r0)
            androidx.recyclerview.widget.RecyclerView r6 = r4.mRecyclerView
            r6.setVisibility(r0)
        L_0x00af:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.investment.fundswitch.FundSwitchSearchListFragement.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onDestroy() {
        super.onDestroy();
    }

    private void IconCompatParcelizer(List<DataTransportState> list) {
        getContext();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.mRecyclerView.setNestedScrollingEnabled(false);
        FundSwitchSearchListAdapter fundSwitchSearchListAdapter = new FundSwitchSearchListAdapter(getContext(), this);
        this.IconCompatParcelizer = fundSwitchSearchListAdapter;
        this.mRecyclerView.setAdapter(fundSwitchSearchListAdapter);
        FundSwitchSearchListAdapter fundSwitchSearchListAdapter2 = this.IconCompatParcelizer;
        fundSwitchSearchListAdapter2.write = null;
        fundSwitchSearchListAdapter2.MediaBrowserCompat$ItemReceiver = null;
        fundSwitchSearchListAdapter2.write = list;
        fundSwitchSearchListAdapter2.IconCompatParcelizer.write();
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(List<waitForAutomaticDataCollectionEnabled> list) {
        getContext();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.mRecyclerView.setNestedScrollingEnabled(false);
        FundSwitchSearchListAdapter fundSwitchSearchListAdapter = new FundSwitchSearchListAdapter(getContext(), this);
        this.IconCompatParcelizer = fundSwitchSearchListAdapter;
        this.mRecyclerView.setAdapter(fundSwitchSearchListAdapter);
        FundSwitchSearchListAdapter fundSwitchSearchListAdapter2 = this.IconCompatParcelizer;
        fundSwitchSearchListAdapter2.MediaBrowserCompat$ItemReceiver = null;
        fundSwitchSearchListAdapter2.write = null;
        fundSwitchSearchListAdapter2.MediaBrowserCompat$ItemReceiver = list;
        fundSwitchSearchListAdapter2.IconCompatParcelizer.write();
    }

    private void MediaBrowserCompat$MediaItem() {
        this.mEmptyTitle.setVisibility(8);
        this.mEmptyCenterTitle.setVisibility(0);
        this.mEmptyCenterTitle.setText(getResources().getString(R.string.fund_search_no_results));
        this.mEmptyDescription.setVisibility(8);
        this.mContainerRelativeLayout.setVisibility(0);
        this.mShowMessages.setVisibility(8);
        this.mRecyclerView.setVisibility(8);
        this.mEmptyImage.setVisibility(8);
    }

    public final void read(List<DataTransportState> list) {
        if (list.size() == 0) {
            MediaBrowserCompat$MediaItem();
            return;
        }
        this.mContainerRelativeLayout.setVisibility(8);
        this.mShowMessages.setVisibility(8);
        this.mRecyclerView.setVisibility(0);
        FundSwitchSearchListAdapter fundSwitchSearchListAdapter = this.IconCompatParcelizer;
        if (fundSwitchSearchListAdapter == null) {
            IconCompatParcelizer(list);
            return;
        }
        fundSwitchSearchListAdapter.write = null;
        fundSwitchSearchListAdapter.MediaBrowserCompat$ItemReceiver = null;
        fundSwitchSearchListAdapter.write = list;
        fundSwitchSearchListAdapter.IconCompatParcelizer.write();
    }

    public final void MediaBrowserCompat$ItemReceiver(List<waitForAutomaticDataCollectionEnabled> list) {
        if (list.size() == 0) {
            MediaBrowserCompat$MediaItem();
            return;
        }
        this.mContainerRelativeLayout.setVisibility(8);
        this.mShowMessages.setVisibility(8);
        this.mRecyclerView.setVisibility(0);
        FundSwitchSearchListAdapter fundSwitchSearchListAdapter = this.IconCompatParcelizer;
        if (fundSwitchSearchListAdapter == null) {
            MediaBrowserCompat$CustomActionResultReceiver(list);
            return;
        }
        fundSwitchSearchListAdapter.MediaBrowserCompat$ItemReceiver = null;
        fundSwitchSearchListAdapter.write = null;
        fundSwitchSearchListAdapter.MediaBrowserCompat$ItemReceiver = list;
        fundSwitchSearchListAdapter.IconCompatParcelizer.write();
    }

    public final void Keep() {
        this.mContainerRelativeLayout.setVisibility(8);
        this.mShowMessages.setVisibility(8);
        this.mRecyclerView.setVisibility(8);
        super.Keep();
    }

    public final void write(DataTransportState dataTransportState) {
        forEachMultiply foreachmultiply = new forEachMultiply();
        foreachmultiply.write(this.MediaBrowserCompat$CustomActionResultReceiver, dataTransportState.MediaSessionCompat$ResultReceiverWrapper, dataTransportState.MediaDescriptionCompat);
        if (getActivity() != null) {
            foreachmultiply.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "mfsearchswitchout_fundclicked");
        }
        Intent intent = new Intent();
        intent.putExtra("com.scb.phone.SWITCH_FUND_SEARCH_SELECTED", dataTransportState);
        getActivity().setResult(-1, intent);
        getActivity().finish();
    }

    public final void MediaBrowserCompat$ItemReceiver(waitForAutomaticDataCollectionEnabled waitforautomaticdatacollectionenabled) {
        forEachMultiply foreachmultiply = new forEachMultiply();
        foreachmultiply.write(this.MediaBrowserCompat$CustomActionResultReceiver, waitforautomaticdatacollectionenabled.RatingCompat, waitforautomaticdatacollectionenabled.MediaBrowserCompat$ItemReceiver);
        if (getActivity() != null) {
            foreachmultiply.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "mfsearchswitchin_fundclicked");
        }
        Intent intent = new Intent();
        intent.putExtra("com.scb.phone.SWITCH_FUND_SEARCH_SELECTED", waitforautomaticdatacollectionenabled);
        getActivity().setResult(-1, intent);
        getActivity().finish();
    }
}

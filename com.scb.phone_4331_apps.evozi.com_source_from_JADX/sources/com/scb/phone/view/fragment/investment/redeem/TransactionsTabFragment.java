package com.scb.phone.view.fragment.investment.redeem;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.BaseActivity$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.adapter.investment.InvestmentDetailsTransactionAdapter;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.ActivityBuilder_BindReviewActivity;
import p040o.ActivityBuilder_BindReviewInfoErrorActivity;
import p040o.ActivityBuilder_BindReviewRedemptionActivity;
import p040o.ActivityBuilder_BindRewardSearchActivity;
import p040o.ActivityBuilder_BindRewardSearchResultActivity;
import p040o.AlertController$RecycleListView;
import p040o.CrashlyticsCore;
import p040o.FragmentBuilder_BindBondNoAccountsErrorFragment;
import p040o.HmlPinActivity;
import p040o.getCropTetragon;
import p040o.getMicrAmount;
import p040o.setChildDrawingOrderCallback;

public abstract class TransactionsTabFragment extends BaseFragment implements getMicrAmount.RatingCompat, FragmentBuilder_BindBondNoAccountsErrorFragment {
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
    @HmlPinActivity
    public getCropTetragon presenter;

    /* access modifiers changed from: protected */
    public abstract String MediaBrowserCompat$CustomActionResultReceiver();

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88182131494045, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        getContext();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.mRecyclerView.setNestedScrollingEnabled(false);
        this.MediaBrowserCompat$ItemReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_INVESTMENT_DETAILS")).subscribe(new ActivityBuilder_BindReviewRedemptionActivity(this), ActivityBuilder_BindRewardSearchActivity.MediaBrowserCompat$CustomActionResultReceiver);
        return inflate;
    }

    public final void read(List<CrashlyticsCore.C32473> list) {
        this.mRecyclerView.setVisibility(0);
        this.mRecyclerView.setAdapter(new InvestmentDetailsTransactionAdapter(getContext(), list, this));
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void write() {
        this.mEmptyTitle.setVisibility(8);
        this.mEmptyCenterTitle.setVisibility(0);
        this.mEmptyCenterTitle.setText(MediaBrowserCompat$CustomActionResultReceiver());
        this.mEmptyDescription.setVisibility(8);
        this.mContainerRelativeLayout.setVisibility(0);
        this.mShowMessages.setVisibility(8);
        this.mRecyclerView.setVisibility(8);
        this.mEmptyImage.setVisibility(8);
    }

    public final void Keep() {
        this.mContainerRelativeLayout.setVisibility(8);
        this.mShowMessages.setVisibility(8);
        this.mRecyclerView.setVisibility(8);
        super.Keep();
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        CustomDialog MediaBrowserCompat$ItemReceiver = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.investment_transaction_fund_cancel_title).MediaBrowserCompat$ItemReceiver(getString(R.string.investment_transaction_fund_cancel_description));
        CustomDialog IconCompatParcelizer = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.delete), new ActivityBuilder_BindReviewActivity(this, i));
        IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read.getString(R.string.permission_deny), ActivityBuilder_BindReviewInfoErrorActivity.read).show();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        FragmentActivity activity = getActivity();
        if (getUserVisibleHint() && activity != null) {
            AlertController$RecycleListView.write((Activity) activity, (int) R.id.view_group_root, (int) R.drawable.ic_check_circle_white_24dp, getString(R.string.fund_cancel_success_message), (int) R.color.f67402131099896);
        }
    }

    public final void read(String str) {
        FragmentActivity activity = getActivity();
        if (getUserVisibleHint() && activity != null) {
            AlertController$RecycleListView.write((Activity) activity, (int) R.id.view_group_root, (int) R.drawable.ic_error_white_24dp, str, (int) R.color.f66062131099761);
        }
    }

    public final void read() {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).write((BaseActivity$MediaBrowserCompat$CustomActionResultReceiver) new ActivityBuilder_BindRewardSearchResultActivity(this));
        }
    }

    public static /* synthetic */ void write(TransactionsTabFragment transactionsTabFragment) {
        getCropTetragon getcroptetragon = transactionsTabFragment.presenter;
        if (getcroptetragon.RatingCompat != null) {
            getcroptetragon.RatingCompat.Keep();
        }
        getcroptetragon.read.MediaBrowserCompat$ItemReceiver();
        getcroptetragon.read.IconCompatParcelizer(new getCropTetragon.write(getcroptetragon, (byte) 0));
    }
}

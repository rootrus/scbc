package com.scb.phone.view.fragment.loan;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.loan.SmeLoanDetailCommercialItemAdapter;
import com.scb.phone.view.adapter.loan.SmeLoanDetailLgItemAdapter;
import com.scb.phone.view.adapter.loan.SmeLoanDetailPnItemAdapter;
import com.scb.phone.view.custom.common.CustomBillsToPay;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.Collections;
import java.util.List;
import p040o.ActivityBuilder_ContributeETBSaleSheetAccountTypeActivity;
import p040o.Futures;
import p040o.HmlPinActivity;
import p040o.ZSYR2K;
import p040o.getPercentBlackPixels;
import p040o.logAppStats;
import p040o.validateGER;

public class SmeLoanDetailFragment extends BaseFragment implements getPercentBlackPixels.write {
    private read IconCompatParcelizer;
    public Futures.ChainingListenableFuture MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    CustomBillsToPay mCustomBillsToPay;
    @HmlPinActivity
    public logAppStats mPresenter;
    @BindView
    LinearLayout mSmeLoanBillToPayLinearLayout;
    @BindView
    LinearLayout mSmeLoanDetailEmptyStateLinearLayout;
    @BindView
    TextView mSmeLoanDetailEmptyStateMessageTextView;
    @BindView
    LinearLayout mSmeLoanDetailListLinearLayout;
    @BindView
    RecyclerView mSmeLoanDetailRecyclerView;
    @BindView
    TextView mSmeLoanDetailTotalLabelTextView;

    public interface read {
        void MediaBrowserCompat$ItemReceiver(Futures.C34051 r1);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89942131494221, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.mPresenter.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    public final void IconCompatParcelizer(Futures.ChainingListenableFuture chainingListenableFuture) {
        this.mSmeLoanBillToPayLinearLayout.setVisibility(0);
        this.mCustomBillsToPay.setIconDrawable(chainingListenableFuture.MediaBrowserCompat$CustomActionResultReceiver, (int) R.drawable.ic_loan_detail_default);
        if (chainingListenableFuture.setHasDecor) {
            this.mCustomBillsToPay.setCompletedTextVisibility(0);
            this.mCustomBillsToPay.setDueDateVisibility(8);
            this.mCustomBillsToPay.setAmountTitleTextVisibility(8);
            this.mCustomBillsToPay.setAmountVisibility(8);
            this.mCustomBillsToPay.setCompletedText(chainingListenableFuture.PlaybackStateCompat$CustomAction);
            this.mCustomBillsToPay.setPayButtonVisibility(8);
            return;
        }
        this.mCustomBillsToPay.setDueDate(chainingListenableFuture.MediaBrowserCompat$SearchResultReceiver);
        this.mCustomBillsToPay.setAmountTitle(getString(R.string.amount_due));
        this.mCustomBillsToPay.setAmountValue(chainingListenableFuture.MediaDescriptionCompat);
        this.mCustomBillsToPay.setPayButtonVisibility(0);
        this.mCustomBillsToPay.setOnCustomBillsToPayClickListener(new ActivityBuilder_ContributeETBSaleSheetAccountTypeActivity(this));
        this.mCustomBillsToPay.setAmountTitleTextVisibility(0);
        this.mCustomBillsToPay.setAmountVisibility(0);
        this.mCustomBillsToPay.setDueDateVisibility(0);
        this.mCustomBillsToPay.setCompletedTextVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.mSmeLoanBillToPayLinearLayout.setVisibility(8);
    }

    public final void write() {
        this.mSmeLoanDetailEmptyStateLinearLayout.setVisibility(0);
        this.mSmeLoanDetailEmptyStateMessageTextView.setText(getString(R.string.sme_loan_detail_empty_note_state_message));
        this.mSmeLoanDetailListLinearLayout.setVisibility(8);
    }

    public final void read() {
        this.mSmeLoanDetailEmptyStateLinearLayout.setVisibility(0);
        this.mSmeLoanDetailEmptyStateMessageTextView.setText(getString(R.string.sme_loan_detail_empty_letter_of_guarantee_state_message));
        this.mSmeLoanDetailListLinearLayout.setVisibility(8);
    }

    public final void write(Futures.ChainingListenableFuture chainingListenableFuture) {
        this.mSmeLoanDetailEmptyStateLinearLayout.setVisibility(8);
        this.mSmeLoanDetailListLinearLayout.setVisibility(0);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        validateGER validateger = new validateGER((Parcelable) null);
        RecyclerView.IconCompatParcelizer MediaBrowserCompat$ItemReceiver = validateger.MediaBrowserCompat$ItemReceiver((RecyclerView.IconCompatParcelizer) new SmeLoanDetailCommercialItemAdapter(getContext(), validateger, Collections.singletonList(chainingListenableFuture)));
        this.mSmeLoanDetailRecyclerView.setLayoutManager(linearLayoutManager);
        this.mSmeLoanDetailRecyclerView.setAdapter(MediaBrowserCompat$ItemReceiver);
    }

    public final void write(List<Futures.C34115> list) {
        this.mSmeLoanDetailEmptyStateLinearLayout.setVisibility(8);
        this.mSmeLoanDetailListLinearLayout.setVisibility(0);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        validateGER validateger = new validateGER((Parcelable) null);
        RecyclerView.IconCompatParcelizer MediaBrowserCompat$ItemReceiver = validateger.MediaBrowserCompat$ItemReceiver((RecyclerView.IconCompatParcelizer) new SmeLoanDetailPnItemAdapter(getContext(), validateger, list));
        this.mSmeLoanDetailRecyclerView.setLayoutManager(linearLayoutManager);
        this.mSmeLoanDetailRecyclerView.setAdapter(MediaBrowserCompat$ItemReceiver);
    }

    public final void IconCompatParcelizer(List<Futures.ChainingListenableFuture.C34131> list) {
        this.mSmeLoanDetailEmptyStateLinearLayout.setVisibility(8);
        this.mSmeLoanDetailListLinearLayout.setVisibility(0);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        validateGER validateger = new validateGER((Parcelable) null);
        RecyclerView.IconCompatParcelizer MediaBrowserCompat$ItemReceiver = validateger.MediaBrowserCompat$ItemReceiver((RecyclerView.IconCompatParcelizer) new SmeLoanDetailLgItemAdapter(getContext(), validateger, list));
        this.mSmeLoanDetailRecyclerView.setLayoutManager(linearLayoutManager);
        this.mSmeLoanDetailRecyclerView.setAdapter(MediaBrowserCompat$ItemReceiver);
    }

    public final void write(String str) {
        this.mSmeLoanDetailTotalLabelTextView.setText(getString(R.string.sme_loan_detail_total_label, str));
        this.mSmeLoanDetailTotalLabelTextView.setVisibility(0);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.mSmeLoanDetailTotalLabelTextView.setVisibility(4);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof read) {
            this.IconCompatParcelizer = (read) context;
        }
    }

    public static /* synthetic */ void write(SmeLoanDetailFragment smeLoanDetailFragment) {
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("loanproduct", "commercial_loan")};
        if (smeLoanDetailFragment.getActivity() != null) {
            ((BaseActivity) smeLoanDetailFragment.getActivity()).scbAnalytics.write("loan_paybutton", zsyr2kArr);
        }
        read read2 = smeLoanDetailFragment.IconCompatParcelizer;
        if (read2 != null) {
            Futures.ChainingListenableFuture chainingListenableFuture = smeLoanDetailFragment.MediaBrowserCompat$CustomActionResultReceiver;
            Futures.C34051 MediaBrowserCompat$CustomActionResultReceiver2 = Futures.C34051.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver2.read = chainingListenableFuture.read;
            MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$Token = chainingListenableFuture.MediaBrowserCompat$ItemReceiver;
            MediaBrowserCompat$CustomActionResultReceiver2.AppCompatDialogFragment = chainingListenableFuture.MediaDescriptionCompat;
            MediaBrowserCompat$CustomActionResultReceiver2.PlaybackStateCompat$CustomAction = chainingListenableFuture.ParcelableVolumeInfo;
            read2.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver2);
        }
    }
}

package com.scb.phone.view.fragment.bulktransfer;

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
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.bulktransfer.BulkTransferOtpActivity;
import com.scb.phone.view.activity.bulktransfer.BulkTransferSuccessActivity;
import com.scb.phone.view.adapter.bulktransfer.RecipientsReviewAdapter;
import com.scb.phone.view.custom.bulktransfer.CustomEffectiveDate;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.C1422x86f1bdff;
import p040o.ComputingConcurrentHashMap;
import p040o.HmlPinActivity;
import p040o.SimpleTimeLimiter;
import p040o.setDaemon;
import p040o.withUnregisteredFid;

public class BulkTransferReviewFragment extends BaseFragment implements C1422x86f1bdff {
    @BindView
    protected CustomTransferAndPayItem amount;
    @HmlPinActivity
    public withUnregisteredFid bulkTransferReviewPresenter;
    @BindView
    protected TextView groupHeader;
    @BindView
    protected RecyclerView recipients;
    @BindView
    protected CustomEffectiveDate scheduleEffectiveDate;
    @BindView
    protected LinearLayout scheduleLayoutContainer;
    @BindView
    protected CustomTransferAndPaySource source;
    @BindView
    protected CustomTransferAndPayItem totalAmount;
    @BindView
    protected CustomTransferAndPayItem totalFee;

    public final void write(String str) {
    }

    public static BulkTransferReviewFragment write(Parcelable parcelable) {
        BulkTransferReviewFragment bulkTransferReviewFragment = new BulkTransferReviewFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_REVIEW_DISPLAY", parcelable);
        bulkTransferReviewFragment.setArguments(bundle);
        return bulkTransferReviewFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f85902131493817, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        RecyclerView recyclerView = this.recipients;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.bulkTransferReviewPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.bulkTransferReviewPresenter.MediaBrowserCompat$CustomActionResultReceiver((SimpleTimeLimiter) getArguments().getParcelable("com.scb.phone.EXTRA_REVIEW_DISPLAY"));
        return inflate;
    }

    public final void write(SimpleTimeLimiter simpleTimeLimiter) {
        this.groupHeader.setText(simpleTimeLimiter.MediaBrowserCompat$MediaItem);
        this.source.setSourceName(simpleTimeLimiter.MediaBrowserCompat$ItemReceiver);
        this.source.setAccountNumber(simpleTimeLimiter.IconCompatParcelizer);
        this.source.setAvatar(simpleTimeLimiter.MediaBrowserCompat$CustomActionResultReceiver);
        this.recipients.setNestedScrollingEnabled(false);
        this.recipients.setAdapter(new RecipientsReviewAdapter(simpleTimeLimiter.MediaDescriptionCompat));
        this.amount.setValue(simpleTimeLimiter.MediaBrowserCompat$SearchResultReceiver);
        this.totalFee.setValue(simpleTimeLimiter.MediaSessionCompat$Token);
        this.totalAmount.setValue(simpleTimeLimiter.MediaSessionCompat$QueueItem);
        this.totalAmount.mDividerView.setVisibility(8);
    }

    @OnClick
    public void onConfirmButtonClicked() {
        withUnregisteredFid withunregisteredfid = this.bulkTransferReviewPresenter;
        if (withunregisteredfid.RatingCompat != null) {
            withunregisteredfid.RatingCompat.AlertController$RecycleListView();
        }
        ComputingConcurrentHashMap.C31941 read = ComputingConcurrentHashMap.C31941.read();
        read.MediaBrowserCompat$ItemReceiver = withunregisteredfid.IconCompatParcelizer.f2784x50fd9e4a;
        withunregisteredfid.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(read, (String) null, (String) null);
        withunregisteredfid.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new withUnregisteredFid.IconCompatParcelizer(withunregisteredfid, (byte) 0));
    }

    public final void IconCompatParcelizer(setDaemon setdaemon) {
        BulkTransferSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), setdaemon);
    }

    public final void MediaBrowserCompat$ItemReceiver(SimpleTimeLimiter simpleTimeLimiter) {
        BulkTransferOtpActivity.MediaBrowserCompat$ItemReceiver(getContext(), simpleTimeLimiter);
        getActivity().finish();
    }

    public final void read(String str) {
        this.scheduleLayoutContainer.setVisibility(0);
        this.scheduleEffectiveDate.setEffectiveDate(str);
        this.totalFee.scheduleFeeText.setVisibility(0);
        this.totalAmount.scheduleFeeText.setVisibility(0);
    }
}

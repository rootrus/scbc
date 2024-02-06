package com.scb.phone.view.fragment.scheduledtransaction;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.adapter.bulktransfer.RecipientsReviewAdapter;
import com.scb.phone.view.custom.bulktransfer.CustomEffectiveDate;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.ActivityBuilder_ContributePurchaseReviewActivity;
import p040o.ActivityBuilder_ContributeRegistrationActivity;
import p040o.BufferedQuickMrzExtractor;
import p040o.C5055nb;
import p040o.HmlPinActivity;
import p040o.ImmutableSortedMap;
import p040o.SimpleTimeLimiter;
import p040o.proxyGetICheckDeserializerRtti;
import p040o.writeUInt64NoTag;

public class ScheduleBulkTransferFragment extends BaseFragment implements proxyGetICheckDeserializerRtti.ParcelableVolumeInfo {
    private SimpleTimeLimiter IconCompatParcelizer;
    @BindView
    protected CustomTransferAndPayItem amount;
    @BindView
    protected CustomEffectiveDate effectiveDate;
    @BindView
    protected TextView groupHeader;
    @BindView
    protected TextView groupId;
    @BindView
    protected RecyclerView recipients;
    @BindView
    protected TextView refId;
    @HmlPinActivity
    public C5055nb scheduleBulkTransferPresenter;
    @BindView
    protected CustomTransferAndPaySource source;
    @BindView
    protected CustomTransferAndPayItem totalAmount;
    @BindView
    protected CustomTransferAndPayItem totalFee;

    public static ScheduleBulkTransferFragment MediaBrowserCompat$CustomActionResultReceiver(Parcelable parcelable) {
        ScheduleBulkTransferFragment scheduleBulkTransferFragment = new ScheduleBulkTransferFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_REVIEW_DISPLAY", parcelable);
        scheduleBulkTransferFragment.setArguments(bundle);
        return scheduleBulkTransferFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f89722131494199, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        RecyclerView recyclerView = this.recipients;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.IconCompatParcelizer = (SimpleTimeLimiter) getArguments().getParcelable("com.scb.phone.EXTRA_REVIEW_DISPLAY");
        this.scheduleBulkTransferPresenter.MediaBrowserCompat$ItemReceiver(this);
        C5055nb nbVar = this.scheduleBulkTransferPresenter;
        BufferedQuickMrzExtractor.C31321 r2 = new writeUInt64NoTag.IconCompatParcelizer() {
            public final void IconCompatParcelizer(Object obj) {
                ((proxyGetICheckDeserializerRtti.ParcelableVolumeInfo) obj).IconCompatParcelizer(SimpleTimeLimiter.this);
            }
        };
        if (nbVar.RatingCompat != null) {
            z = true;
        }
        if (z) {
            r2.IconCompatParcelizer(nbVar.RatingCompat);
        }
        return inflate;
    }

    public final void IconCompatParcelizer(SimpleTimeLimiter simpleTimeLimiter) {
        this.groupHeader.setText(simpleTimeLimiter.MediaBrowserCompat$MediaItem);
        this.groupId.setText(String.format(getString(R.string.group_id), new Object[]{simpleTimeLimiter.RatingCompat}));
        this.refId.setText(String.format(getString(R.string.reference_id), new Object[]{simpleTimeLimiter.ParcelableVolumeInfo}));
        this.effectiveDate.setEffectiveDate(simpleTimeLimiter.MediaMetadataCompat);
        this.source.setSourceName(simpleTimeLimiter.MediaBrowserCompat$ItemReceiver);
        this.source.setAccountNumber(simpleTimeLimiter.IconCompatParcelizer);
        this.source.setAvatar(simpleTimeLimiter.MediaBrowserCompat$CustomActionResultReceiver);
        this.recipients.setAdapter(new RecipientsReviewAdapter(simpleTimeLimiter.MediaDescriptionCompat));
        this.amount.setValue(simpleTimeLimiter.MediaBrowserCompat$SearchResultReceiver);
        this.totalFee.setValue(simpleTimeLimiter.MediaSessionCompat$Token);
        this.totalFee.scheduleFeeText.setVisibility(0);
        this.totalAmount.setValue(simpleTimeLimiter.MediaSessionCompat$QueueItem);
        this.totalAmount.mDividerView.setVisibility(8);
        this.totalAmount.scheduleFeeText.setVisibility(0);
    }

    public final void IconCompatParcelizer() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(201);
            activity.finish();
        }
    }

    @OnClick
    public void onConfirmButtonClicked() {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.schedule_details_delete_007).IconCompatParcelizer((int) R.string.schedule_details_delete_008);
        CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.ntb_yes), new ActivityBuilder_ContributeRegistrationActivity(this));
        IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.ntb_no), ActivityBuilder_ContributePurchaseReviewActivity.read).show();
    }

    public final /* synthetic */ void write() {
        C5055nb nbVar = this.scheduleBulkTransferPresenter;
        String str = this.IconCompatParcelizer.ParcelableVolumeInfo;
        if (nbVar.RatingCompat != null) {
            nbVar.RatingCompat.AlertController$RecycleListView();
        }
        nbVar.write.IconCompatParcelizer(new ImmutableSortedMap.Values(str, (String) null));
        nbVar.write.IconCompatParcelizer(new C5055nb.IconCompatParcelizer(nbVar, (byte) 0));
    }

    public void onDestroy() {
        this.scheduleBulkTransferPresenter.onDestroy();
        super.onDestroy();
    }
}

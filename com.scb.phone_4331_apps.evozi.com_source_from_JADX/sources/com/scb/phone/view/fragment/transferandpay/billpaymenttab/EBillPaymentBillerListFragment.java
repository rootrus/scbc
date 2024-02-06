package com.scb.phone.view.fragment.transferandpay.billpaymenttab;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.transferandpay.billpayment.RtpEBillPaymentDetailActivity;
import com.scb.phone.view.adapter.transferandpay.EBillAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.ActivityBuilder_ExportStatementSuccessfulActivity;
import p040o.ActivityBuilder_FriendsRegistrationActivity;
import p040o.C7085x54efaba5;
import p040o.C7429sD;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ServerProjectProvider;
import p040o.getTopLeftCornerWidth$MediaSessionCompat$QueueItem;
import p040o.setTapText;

public class EBillPaymentBillerListFragment extends BaseFragment implements FragmentBuilder_BindCcSofBillPaymentOnlyFragment, getTopLeftCornerWidth$MediaSessionCompat$QueueItem {
    public EBillAdapter IconCompatParcelizer;
    private C7085x54efaba5 MediaBrowserCompat$CustomActionResultReceiver;
    private ServerProjectProvider.C70695.read MediaBrowserCompat$MediaItem;
    private Handler MediaDescriptionCompat;
    private boolean MediaMetadataCompat = false;
    @HmlPinActivity
    public C7429sD eBillPaymentPresenter;
    @BindView
    RelativeLayout mEmptyCard;
    @BindView
    TextView mEmptyDescription;
    @BindView
    ImageView mEmptyImage;
    @BindView
    TextView mEmptyTitle;
    @BindView
    RecyclerView mRecyclerView;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87232131493950, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.eBillPaymentPresenter.MediaBrowserCompat$ItemReceiver(this);
        if (!this.MediaMetadataCompat) {
            this.eBillPaymentPresenter.IconCompatParcelizer(false);
        }
        return inflate;
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z && !this.MediaMetadataCompat && this.eBillPaymentPresenter != null) {
            this.MediaMetadataCompat = true;
        }
    }

    public final void read(int i) {
        C7429sD sDVar = this.eBillPaymentPresenter;
        List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder> list = sDVar.write;
        sDVar.read((list == null || list.size() <= i) ? null : sDVar.write.get(i));
    }

    public final void write(List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder> list) {
        if (this.IconCompatParcelizer == null) {
            EBillAdapter eBillAdapter = new EBillAdapter(getContext(), list, this);
            this.IconCompatParcelizer = eBillAdapter;
            this.mRecyclerView.setAdapter(eBillAdapter);
            this.mRecyclerView.setVisibility(0);
            getContext();
            this.mRecyclerView.setLayoutManager(new LinearLayoutManager());
            this.mRecyclerView.setNestedScrollingEnabled(false);
            return;
        }
        Handler handler = new Handler();
        this.MediaDescriptionCompat = handler;
        handler.postDelayed(new ActivityBuilder_ExportStatementSuccessfulActivity(this, list), 400);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.mRecyclerView.setVisibility(8);
        this.mEmptyTitle.setText(getResources().getString(R.string.custom_empty_title));
        this.mEmptyTitle.setGravity(3);
        this.mEmptyDescription.setText(getResources().getString(R.string.custom_empty_description));
        this.mEmptyCard.setVisibility(0);
        this.mEmptyImage.setVisibility(0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.mRecyclerView.setVisibility(8);
        this.mEmptyImage.setVisibility(8);
        this.mEmptyTitle.setText(getResources().getString(R.string.no_ebill));
        this.mEmptyTitle.setGravity(1);
        this.mEmptyDescription.setText("");
        this.mEmptyCard.setVisibility(0);
    }

    public final void IconCompatParcelizer(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder) {
        this.eBillPaymentPresenter.read(builder);
    }

    public final void write(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder) {
        ServerProjectProvider.C70695.read read = this.MediaBrowserCompat$MediaItem;
        if (read != null) {
            read.MediaBrowserCompat$ItemReceiver(builder);
        }
    }

    public final void read(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder) {
        Intent intent = new Intent(getContext(), RtpEBillPaymentDetailActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_EBILL_PAYMENT_DISPLAY", builder);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @OnClick
    public void onEmptyLayoutClick() {
        this.mEmptyCard.setVisibility(8);
        this.eBillPaymentPresenter.IconCompatParcelizer(true);
    }

    public void onDestroy() {
        Handler handler = this.MediaDescriptionCompat;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        this.MediaDescriptionCompat = null;
        this.eBillPaymentPresenter.onDestroy();
        super.onDestroy();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (parentFragment instanceof ServerProjectProvider.C70695.read)) {
            this.MediaBrowserCompat$MediaItem = (ServerProjectProvider.C70695.read) parentFragment;
        }
        if (parentFragment != null && (parentFragment instanceof C7085x54efaba5)) {
            C7085x54efaba5 serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver = (C7085x54efaba5) parentFragment;
            this.MediaBrowserCompat$CustomActionResultReceiver = serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver;
            if (serverProjectProvider$5$MediaBrowserCompat$CustomActionResultReceiver.write() != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver.write().write(new ActivityBuilder_FriendsRegistrationActivity(this));
            }
        }
    }
}

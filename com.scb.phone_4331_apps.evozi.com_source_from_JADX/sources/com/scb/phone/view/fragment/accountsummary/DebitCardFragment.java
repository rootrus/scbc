package com.scb.phone.view.fragment.accountsummary;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.debitatm.DebitCardDetailActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.BulkTransferDeepLinkActivity;
import p040o.CheckCaptureModule;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.NTBTileService;
import p040o.ZTRMV;
import p040o.getBannerTiles;
import p040o.getDynamicTiles;
import p040o.getETBCheckActiveCASA;
import p040o.getIdps;
import p040o.getStaticTileList;
import p040o.loadFromFile;
import p040o.setChildDrawingOrderCallback;
import p040o.setTapText;

public class DebitCardFragment extends BaseFragment implements CheckCaptureModule.C6375a.IconCompatParcelizer {
    private BulkTransferDeepLinkActivity IconCompatParcelizer;
    private ZTRMV MediaBrowserCompat$CustomActionResultReceiver = new ZTRMV();
    private BulkTransferDeepLinkActivity MediaBrowserCompat$MediaItem;
    private BulkTransferDeepLinkActivity MediaBrowserCompat$SearchResultReceiver;
    private BulkTransferDeepLinkActivity MediaDescriptionCompat;
    @BindView
    ConstraintLayout csLayoutCard;
    @BindView
    ConstraintLayout csLayoutParent;
    @HmlPinActivity
    public loadFromFile debitCardPresenter;
    @BindView
    ImageView ivDebit;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f85502131493777, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.MediaBrowserCompat$ItemReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_SWIPE_REFRESH")).subscribe(new getDynamicTiles(this), getIdps.MediaBrowserCompat$ItemReceiver);
        this.MediaBrowserCompat$SearchResultReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_HOME_ACTIVITY_REFRESH")).subscribe(new getBannerTiles(this), getIdps.MediaBrowserCompat$ItemReceiver);
        this.MediaBrowserCompat$MediaItem = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_REGISTERED_ACCOUNTS_UPDATED")).subscribe(new getStaticTileList(this), getIdps.MediaBrowserCompat$ItemReceiver);
        this.IconCompatParcelizer = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_LOCK_CARD_REFRESH")).subscribe(new NTBTileService(this), getIdps.MediaBrowserCompat$ItemReceiver);
        this.MediaDescriptionCompat = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_NICKNAME_CHANGED")).subscribe(new getETBCheckActiveCASA(this), getIdps.MediaBrowserCompat$ItemReceiver);
        this.debitCardPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.debitCardPresenter.write();
        return inflate;
    }

    public void onDestroy() {
        loadFromFile loadfromfile = this.debitCardPresenter;
        if (loadfromfile != null) {
            loadfromfile.onDestroy();
        }
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$SearchResultReceiver;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaBrowserCompat$SearchResultReceiver.dispose();
        }
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity2 = this.MediaBrowserCompat$MediaItem;
        if (bulkTransferDeepLinkActivity2 != null && !bulkTransferDeepLinkActivity2.isDisposed()) {
            this.MediaBrowserCompat$MediaItem.dispose();
        }
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity3 = this.IconCompatParcelizer;
        if (bulkTransferDeepLinkActivity3 != null && !bulkTransferDeepLinkActivity3.isDisposed()) {
            this.IconCompatParcelizer.dispose();
        }
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity4 = this.MediaDescriptionCompat;
        if (bulkTransferDeepLinkActivity4 != null && !bulkTransferDeepLinkActivity4.isDisposed()) {
            this.MediaDescriptionCompat.dispose();
        }
        super.onDestroy();
    }

    public final void read(String str) {
        this.csLayoutParent.setVisibility(0);
        getContext();
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.default_debit_card, this.ivDebit, str);
        ZTRMV ztrmv = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getActivity() != null) {
            ztrmv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "debit_atm_card_summary");
        }
    }

    public final void write() {
        this.csLayoutParent.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void navigateToDebitCardDetail() {
        Intent MediaBrowserCompat$CustomActionResultReceiver2 = DebitCardDetailActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(MediaBrowserCompat$CustomActionResultReceiver2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

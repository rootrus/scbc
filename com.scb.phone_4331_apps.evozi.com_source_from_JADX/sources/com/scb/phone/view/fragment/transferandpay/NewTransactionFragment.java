package com.scb.phone.view.fragment.transferandpay;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.getEventDeviceSize;
import p040o.getOccupationInfo;
import p040o.getTopLeftCornerWidth$AlertController$RecycleListView;
import p040o.writeInt32NoTag;

public class NewTransactionFragment extends BaseFragment implements ViewTreeObserver.OnGlobalLayoutListener, getTopLeftCornerWidth$AlertController$RecycleListView {
    @BindView
    ImageView mOverlayNewTransfer;
    @BindView
    RelativeLayout mRootView;
    @BindView
    TabLayout mTabLayout;
    @BindView
    NoSwipeViewPager mTabPager;
    @BindView
    LinearLayout mTutorialContainer;
    @HmlPinActivity
    public getEventDeviceSize newTransactionPresenter;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88652131494092, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.newTransactionPresenter.MediaBrowserCompat$ItemReceiver(this);
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(getString(R.string.transfer_pay_title));
        getOccupationInfo getoccupationinfo = new getOccupationInfo(getChildFragmentManager(), getContext());
        this.mTabPager.setPagingEnabled(false);
        this.mTabPager.setOffscreenPageLimit(2);
        this.mTabPager.setAdapter(getoccupationinfo);
        this.mTabLayout.setupWithViewPager(this.mTabPager);
        this.mRootView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        return inflate;
    }

    public void onDestroy() {
        this.newTransactionPresenter.onDestroy();
        super.onDestroy();
    }

    public final void setTransitioning() {
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(getString(R.string.transfer_pay_title));
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onTutorialClicked() {
        this.mOverlayNewTransfer.setVisibility(8);
        this.mTutorialContainer.setVisibility(8);
        this.mTabPager.setVisibility(0);
    }

    public void onGlobalLayout() {
        this.mRootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getEventDeviceSize geteventdevicesize = this.newTransactionPresenter;
        if (!geteventdevicesize.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper()) {
            geteventdevicesize.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.ActionMenuItemView();
            writeInt32NoTag writeint32notag = writeInt32NoTag.write;
            if (geteventdevicesize.RatingCompat != null) {
                writeint32notag.IconCompatParcelizer(geteventdevicesize.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$ItemReceiver(getContext(), this.mRootView, this.mOverlayNewTransfer);
        this.mTutorialContainer.setVisibility(0);
        this.mTabPager.setVisibility(4);
    }
}

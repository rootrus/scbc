package com.scb.phone.view.fragment.ccrredemption.product;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.adapter.ccrredemption.product.OPRRewardTiersAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.Barrier;
import p040o.C4283discover;
import p040o.HmlPinActivity;
import p040o.eagerInDefaultApp;
import p040o.enableComplexMapKeySerialization;
import p040o.isBarcodeRead;
import p040o.postMailingAddressDetails;
import p040o.setPrettyPrinting;

public class OPRRewardsTabFragment extends BaseFragment implements isBarcodeRead, ViewPager.MediaMetadataCompat {
    private BroadcastReceiver IconCompatParcelizer = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            int read;
            String stringExtra = intent.getStringExtra("OPRStatusRewardsLandingActivity.SelectedTier");
            if (stringExtra != null) {
                String unused = OPRRewardsTabFragment.this.MediaBrowserCompat$SearchResultReceiver = stringExtra;
                setPrettyPrinting setprettyprinting = OPRRewardsTabFragment.this.presenter;
                List<C4283discover> list = OPRRewardsTabFragment.this.tiersAdapter.MediaBrowserCompat$ItemReceiver;
                if (list != null && !list.isEmpty() && (read = setPrettyPrinting.read(list, stringExtra)) != -1) {
                    enableComplexMapKeySerialization enablecomplexmapkeyserialization = new enableComplexMapKeySerialization(list, read);
                    if (setprettyprinting.RatingCompat != null) {
                        enablecomplexmapkeyserialization.IconCompatParcelizer(setprettyprinting.RatingCompat);
                    }
                }
            }
        }
    };
    private eagerInDefaultApp MediaBrowserCompat$CustomActionResultReceiver;
    /* access modifiers changed from: private */
    public String MediaBrowserCompat$SearchResultReceiver = "";
    private postMailingAddressDetails RatingCompat;
    @HmlPinActivity
    public setPrettyPrinting presenter;
    @BindView
    RecyclerView rcvTiers;
    @BindView
    ViewGroup rewardsErrorLayout;
    @BindView
    ViewGroup rewardsRootLayout;
    @HmlPinActivity
    public OPRRewardTiersAdapter tiersAdapter;
    @BindView
    ImageView txvErrorIcon;
    @BindView
    TextView txvErrorMessage;
    @BindView
    TextView txvErrorTitle;
    @BindView
    ViewGroup viewGroupProgress;
    @BindView
    ViewPager viewPagerRewards;

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public static OPRRewardsTabFragment MediaDescriptionCompat() {
        return new OPRRewardsTabFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88782131494105, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.MediaBrowserCompat$CustomActionResultReceiver = (eagerInDefaultApp) getActivity().getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.product.OPRStatusRewardsLandingActivity.OPR_LANDING_DTO");
        RecyclerView recyclerView = this.rcvTiers;
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        this.rcvTiers.setAdapter(this.tiersAdapter);
        this.tiersAdapter.read = this;
        postMailingAddressDetails postmailingaddressdetails = new postMailingAddressDetails(getActivity().getSupportFragmentManager());
        this.RatingCompat = postmailingaddressdetails;
        this.viewPagerRewards.setAdapter(postmailingaddressdetails);
        this.viewPagerRewards.addOnPageChangeListener(this);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.presenter.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        Barrier.MediaBrowserCompat$CustomActionResultReceiver(getContext()).IconCompatParcelizer(this.IconCompatParcelizer, new IntentFilter("OPRStatusRewardsLandingActivity.RedeemAction"));
        return inflate;
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z && this.presenter != null && this.MediaBrowserCompat$CustomActionResultReceiver != null && this.rewardsErrorLayout.getVisibility() == 0) {
            this.presenter.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(List<C4283discover> list, int i) {
        this.rewardsErrorLayout.setVisibility(8);
        this.rewardsRootLayout.setVisibility(0);
        OPRRewardTiersAdapter oPRRewardTiersAdapter = this.tiersAdapter;
        oPRRewardTiersAdapter.MediaBrowserCompat$ItemReceiver = list;
        oPRRewardTiersAdapter.write = i;
        oPRRewardTiersAdapter.IconCompatParcelizer.write();
        postMailingAddressDetails postmailingaddressdetails = this.RatingCompat;
        postmailingaddressdetails.read = list;
        postmailingaddressdetails.notifyDataSetChanged();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.txvErrorIcon.setImageResource(R.drawable.ic_generic_error);
        this.txvErrorTitle.setText(R.string.oops);
        this.rewardsRootLayout.setVisibility(8);
        this.rewardsErrorLayout.setVisibility(0);
        this.txvErrorMessage.setText(getString(R.string.no_rewards_error));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        this.viewPagerRewards.setCurrentItem(i);
    }

    public void onPageSelected(int i) {
        OPRRewardTiersAdapter oPRRewardTiersAdapter = this.tiersAdapter;
        if (oPRRewardTiersAdapter.write != i) {
            oPRRewardTiersAdapter.write = i;
            oPRRewardTiersAdapter.IconCompatParcelizer.write();
        }
        this.rcvTiers.MediaBrowserCompat$CustomActionResultReceiver(i);
    }

    public void onDestroy() {
        Barrier.MediaBrowserCompat$CustomActionResultReceiver(getContext()).IconCompatParcelizer(this.IconCompatParcelizer);
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void IconCompatParcelizer() {
        this.viewGroupProgress.setVisibility(8);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.viewGroupProgress.setVisibility(0);
        this.rewardsRootLayout.setVisibility(8);
    }

    public final String write() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }
}

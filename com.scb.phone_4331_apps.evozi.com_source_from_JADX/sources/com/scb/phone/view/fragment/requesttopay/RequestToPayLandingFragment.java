package com.scb.phone.view.fragment.requesttopay;

import android.animation.Animator;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.ActivityBuilder_ContributePreregisteredMobileActivity;
import p040o.ActivityBuilder_ContributePrivacyCSentActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.ZSYR2K;
import p040o.getUnsubcribeRequest;
import p040o.setChildDrawingOrderCallback;

public class RequestToPayLandingFragment extends BaseFragment implements ViewTreeObserver.OnGlobalLayoutListener {
    private Animator.AnimatorListener IconCompatParcelizer;
    private BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
    /* access modifiers changed from: private */
    public String MediaDescriptionCompat;
    private boolean RatingCompat;
    @BindView
    ImageView mOverlayRequestMoneyTutorialImageView;
    @BindView
    RelativeLayout mRequestMoneyTutorialContainer;
    @BindView
    RelativeLayout mRootView;
    @BindView
    TabLayout tabLayout;
    @BindView
    ViewPager tabPager;
    @BindView
    TextView tvRequestToPayTutorial;

    public static RequestToPayLandingFragment MediaBrowserCompat$CustomActionResultReceiver(boolean z, String str) {
        RequestToPayLandingFragment requestToPayLandingFragment = new RequestToPayLandingFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("BUNDLE_SHOW_TUTORIAL", z);
        bundle.putString("source", str);
        requestToPayLandingFragment.setArguments(bundle);
        return requestToPayLandingFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89462131494173, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        String AbsActionBarView = AbsActionBarView();
        this.MediaDescriptionCompat = AbsActionBarView;
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("source", AbsActionBarView), new ZSYR2K("subtype", "outgoing")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("rtp_landing", zsyr2kArr);
        }
        IntentFilter intentFilter = new IntentFilter("com.scb.phone/BROADCAST_END_REQUEST_MONEY_TUTORIAL");
        intentFilter.addAction("com.scb.phone/BROADCAST_END_EBILL_SUBSCRIPTION_TUTORIAL");
        this.MediaBrowserCompat$CustomActionResultReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getActivity(), intentFilter).subscribe(new ActivityBuilder_ContributePreregisteredMobileActivity(this), ActivityBuilder_ContributePrivacyCSentActivity.MediaBrowserCompat$ItemReceiver);
        this.mRootView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.tabPager.setAdapter(new getUnsubcribeRequest(getFragmentManager(), getContext(), AbsActionBarView()));
        this.tabPager.addOnPageChangeListener(new ViewPager.MediaMetadataCompat() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                if (i == 0) {
                    RequestToPayLandingFragment requestToPayLandingFragment = RequestToPayLandingFragment.this;
                    ZSYR2K[] zsyr2kArr = {new ZSYR2K("source", requestToPayLandingFragment.MediaDescriptionCompat), new ZSYR2K("subtype", "outgoing")};
                    if (requestToPayLandingFragment.getActivity() != null) {
                        ((BaseActivity) requestToPayLandingFragment.getActivity()).scbAnalytics.write("rtp_landing", zsyr2kArr);
                    }
                } else if (i == 1) {
                    RequestToPayLandingFragment requestToPayLandingFragment2 = RequestToPayLandingFragment.this;
                    ZSYR2K[] zsyr2kArr2 = {new ZSYR2K("source", requestToPayLandingFragment2.MediaDescriptionCompat), new ZSYR2K("subtype", "incoming")};
                    if (requestToPayLandingFragment2.getActivity() != null) {
                        ((BaseActivity) requestToPayLandingFragment2.getActivity()).scbAnalytics.write("rtp_landing", zsyr2kArr2);
                    }
                }
            }
        });
        this.tabLayout.setupWithViewPager(this.tabPager);
        Bundle arguments = getArguments();
        this.RatingCompat = false;
        if (arguments != null) {
            this.RatingCompat = arguments.getBoolean("BUNDLE_SHOW_TUTORIAL", false);
        }
        if (!this.RatingCompat) {
            this.mOverlayRequestMoneyTutorialImageView.setVisibility(8);
            this.mRequestMoneyTutorialContainer.setVisibility(8);
        }
        this.IconCompatParcelizer = new Animator.AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                RequestToPayLandingFragment.MediaBrowserCompat$ItemReceiver(RequestToPayLandingFragment.this);
            }
        };
        this.tvRequestToPayTutorial.setText(getString(R.string.request_to_pay_tutorial_new));
        return inflate;
    }

    public void onGlobalLayout() {
        this.mRootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (this.RatingCompat) {
            FragmentBuilder_BindDepositSelectorFragment.read(getContext(), this.mRootView, this.mOverlayRequestMoneyTutorialImageView);
        }
    }

    public void onDestroy() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
        }
        super.onDestroy();
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(RequestToPayLandingFragment requestToPayLandingFragment) {
        requestToPayLandingFragment.mOverlayRequestMoneyTutorialImageView.setVisibility(8);
        requestToPayLandingFragment.mRequestMoneyTutorialContainer.setVisibility(8);
    }

    public static /* synthetic */ void write(RequestToPayLandingFragment requestToPayLandingFragment) {
        requestToPayLandingFragment.mOverlayRequestMoneyTutorialImageView.animate().setDuration(300).alpha(BitmapDescriptorFactory.HUE_RED).setListener(requestToPayLandingFragment.IconCompatParcelizer);
        requestToPayLandingFragment.mRequestMoneyTutorialContainer.animate().setDuration(300).alpha(BitmapDescriptorFactory.HUE_RED).setListener(requestToPayLandingFragment.IconCompatParcelizer);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onTutorialClicked() {
        this.mOverlayRequestMoneyTutorialImageView.setVisibility(8);
        this.mRequestMoneyTutorialContainer.setVisibility(8);
        if (getActivity() != null) {
            Intent intent = new Intent();
            intent.setAction("com.scb.phone/BROADCAST_END_REQUEST_MONEY_TUTORIAL");
            getActivity().sendBroadcast(intent);
        }
    }
}

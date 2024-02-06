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
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scb.phone.R;
import com.scb.phone.view.activity.profilemanagement.promptpay.PromptPayTermsAndConditionsLandingActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.ActivityBuilder_ContributePrivacyCSentActivity;
import p040o.ActivityBuilder_ContributePrivacyManagementLandingActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C5110op;
import p040o.C5113oq;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.MapsInitializer;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getDocumentFramingError$MediaBrowserCompat$ItemReceiver;
import p040o.setChildDrawingOrderCallback;
import p040o.setTapText;

public class RequireRequestToPayFragment extends BaseFragment implements getDocumentFramingError$MediaBrowserCompat$ItemReceiver, ViewTreeObserver.OnGlobalLayoutListener {
    private Animator.AnimatorListener IconCompatParcelizer;
    private BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$SearchResultReceiver;
    private MapsInitializer MediaDescriptionCompat;
    @HmlPinActivity
    public C5113oq goManagePromptPayPresenter;
    @BindView
    ImageView mOverlayRequestMoneyTutorialImageView;
    @BindView
    RelativeLayout mRequestMoneyTutotrialContainer;
    @BindView
    RelativeLayout mRootView;
    @BindView
    TextView tvDetail;
    @BindView
    TextView tvHeaderDetail;

    public static RequireRequestToPayFragment IconCompatParcelizer(boolean z, MapsInitializer mapsInitializer) {
        RequireRequestToPayFragment requireRequestToPayFragment = new RequireRequestToPayFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("BUNDLE_SHOW_TUTORIAL", z);
        bundle.putString("BUNDLE_SOURCE_REQUEST_LANDING_TYPE", mapsInitializer.type);
        requireRequestToPayFragment.setArguments(bundle);
        return requireRequestToPayFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89512131494178, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        IntentFilter intentFilter = new IntentFilter("com.scb.phone/BROADCAST_END_REQUEST_MONEY_TUTORIAL");
        intentFilter.addAction("com.scb.phone/BROADCAST_END_EBILL_SUBSCRIPTION_TUTORIAL");
        intentFilter.addAction("com.scb.phone/BROADCAST_END_PROMPTPAY_QR_TUTORIAL");
        this.MediaBrowserCompat$CustomActionResultReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getActivity(), intentFilter).subscribe(new ActivityBuilder_ContributePrivacyManagementLandingActivity(this), ActivityBuilder_ContributePrivacyCSentActivity.MediaBrowserCompat$ItemReceiver);
        this.mRootView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.goManagePromptPayPresenter.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        this.MediaBrowserCompat$SearchResultReceiver = false;
        if (arguments != null) {
            this.MediaBrowserCompat$SearchResultReceiver = arguments.getBoolean("BUNDLE_SHOW_TUTORIAL", false);
            MapsInitializer MediaBrowserCompat$ItemReceiver = MapsInitializer.MediaBrowserCompat$ItemReceiver(arguments.getString("BUNDLE_SOURCE_REQUEST_LANDING_TYPE", MapsInitializer.REQUEST_MONEY.type));
            this.MediaDescriptionCompat = MediaBrowserCompat$ItemReceiver;
            if (MediaBrowserCompat$ItemReceiver == MapsInitializer.EBILL_SUBSCRIPTION) {
                this.tvDetail.setText(getString(R.string.request_to_pay_ebill_detail));
                this.tvHeaderDetail.setText(getString(R.string.request_to_pay_is_required_ebill));
            } else {
                this.tvDetail.setText(getString(R.string.request_to_pay_prompt_pay_is_required_detail_new));
                this.tvHeaderDetail.setText(getString(R.string.request_to_pay_is_required_new));
            }
        }
        if (!this.MediaBrowserCompat$SearchResultReceiver) {
            this.mOverlayRequestMoneyTutorialImageView.setVisibility(8);
            this.mRequestMoneyTutotrialContainer.setVisibility(8);
        }
        this.IconCompatParcelizer = new Animator.AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                RequireRequestToPayFragment.MediaBrowserCompat$CustomActionResultReceiver(RequireRequestToPayFragment.this);
            }
        };
        return inflate;
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onRequestToPaySettingsClick() {
        C5113oq oqVar = this.goManagePromptPayPresenter;
        C5110op opVar = C5110op.MediaBrowserCompat$ItemReceiver;
        if (oqVar.RatingCompat != null) {
            opVar.IconCompatParcelizer(oqVar.RatingCompat);
        }
    }

    public final void read() {
        Intent write = PromptPayTermsAndConditionsLandingActivity.write(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                write = setTapText.write(activity, write).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(write.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(write, 6002);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        r0 = (com.scb.phone.view.activity.promptpay.PromptPayQRActivity) getActivity();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r3, int r4, android.content.Intent r5) {
        /*
            r2 = this;
            r0 = 6002(0x1772, float:8.41E-42)
            if (r3 != r0) goto L_0x0061
            o.MapsInitializer r0 = r2.MediaDescriptionCompat
            o.MapsInitializer r1 = p040o.MapsInitializer.REQUEST_MONEY
            if (r0 != r1) goto L_0x0020
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            boolean r0 = r0 instanceof com.scb.phone.view.activity.requesttopay.RequestToPayActivity
            if (r0 == 0) goto L_0x0020
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            com.scb.phone.view.activity.requesttopay.RequestToPayActivity r0 = (com.scb.phone.view.activity.requesttopay.RequestToPayActivity) r0
            o.AppstatsThresholdReachedListener r0 = r0.moneyActionPresenter
            if (r0 == 0) goto L_0x0061
            r0.read()
            goto L_0x0061
        L_0x0020:
            o.MapsInitializer r0 = r2.MediaDescriptionCompat
            o.MapsInitializer r1 = p040o.MapsInitializer.EBILL_SUBSCRIPTION
            if (r0 != r1) goto L_0x0041
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            boolean r0 = r0 instanceof com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionActivity
            if (r0 == 0) goto L_0x0041
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionActivity r0 = (com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionActivity) r0
            o.getViewBoundariesImage r1 = r0.eBillSubscriptionPresenter
            if (r1 == 0) goto L_0x0061
            r1.MediaBrowserCompat$CustomActionResultReceiver()
            o.getViewBoundariesImage r0 = r0.eBillSubscriptionPresenter
            r0.MediaBrowserCompat$ItemReceiver()
            goto L_0x0061
        L_0x0041:
            o.MapsInitializer r0 = r2.MediaDescriptionCompat
            o.MapsInitializer r1 = p040o.MapsInitializer.PROMPTPAY_QR
            if (r0 != r1) goto L_0x0061
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            boolean r0 = r0 instanceof com.scb.phone.view.activity.promptpay.PromptPayQRActivity
            if (r0 == 0) goto L_0x0061
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            com.scb.phone.view.activity.promptpay.PromptPayQRActivity r0 = (com.scb.phone.view.activity.promptpay.PromptPayQRActivity) r0
            o.p$1 r1 = r0.promptPayQRPresenter
            if (r1 == 0) goto L_0x0061
            r1.MediaBrowserCompat$ItemReceiver()
            o.p$1 r0 = r0.promptPayQRPresenter
            r0.IconCompatParcelizer()
        L_0x0061:
            super.onActivityResult(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.requesttopay.RequireRequestToPayFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onGlobalLayout() {
        this.mRootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (this.MediaBrowserCompat$SearchResultReceiver) {
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

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RequireRequestToPayFragment requireRequestToPayFragment) {
        requireRequestToPayFragment.mOverlayRequestMoneyTutorialImageView.setVisibility(8);
        requireRequestToPayFragment.mRequestMoneyTutotrialContainer.setVisibility(8);
    }

    public static /* synthetic */ void IconCompatParcelizer(RequireRequestToPayFragment requireRequestToPayFragment) {
        requireRequestToPayFragment.mOverlayRequestMoneyTutorialImageView.animate().setDuration(300).alpha(BitmapDescriptorFactory.HUE_RED).setListener(requireRequestToPayFragment.IconCompatParcelizer);
        requireRequestToPayFragment.mRequestMoneyTutotrialContainer.animate().setDuration(300).alpha(BitmapDescriptorFactory.HUE_RED).setListener(requireRequestToPayFragment.IconCompatParcelizer);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onTutorialClicked() {
        this.mOverlayRequestMoneyTutorialImageView.setVisibility(8);
        this.mRequestMoneyTutotrialContainer.setVisibility(8);
        if (getActivity() != null) {
            Intent intent = new Intent();
            intent.setAction("com.scb.phone/BROADCAST_END_REQUEST_MONEY_TUTORIAL");
            getActivity().sendBroadcast(intent);
        }
    }
}

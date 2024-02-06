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
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.ActivityBuilder_ContributePrepaidTravelTopupLandingActivity;
import p040o.ActivityBuilder_ContributePrivacyCSentActivity;
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

public class RequirePromptPayFragment extends BaseFragment implements getDocumentFramingError$MediaBrowserCompat$ItemReceiver, ViewTreeObserver.OnGlobalLayoutListener {
    private BulkTransferDeepLinkActivity IconCompatParcelizer;
    private Animator.AnimatorListener MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$MediaItem;
    private MapsInitializer MediaMetadataCompat;
    @BindView
    DefaultButton buttonPromptPaySettings;
    @BindView
    TextView descriptionTextView;
    @HmlPinActivity
    public C5113oq goManagePromptPayPresenter;
    @BindView
    ImageView mOverlayRequestMoneyTutorialImageView;
    @BindView
    RelativeLayout mRequestMoneyTutotrialContainer;
    @BindView
    RelativeLayout mRootView;

    public static RequirePromptPayFragment IconCompatParcelizer(boolean z, MapsInitializer mapsInitializer) {
        RequirePromptPayFragment requirePromptPayFragment = new RequirePromptPayFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("BUNDLE_SHOW_TUTORIAL", z);
        bundle.putString("BUNDLE_SOURCE_REQUEST_LANDING_TYPE", mapsInitializer.type);
        requirePromptPayFragment.setArguments(bundle);
        return requirePromptPayFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89502131494177, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        IntentFilter intentFilter = new IntentFilter("com.scb.phone/BROADCAST_END_REQUEST_MONEY_TUTORIAL");
        intentFilter.addAction("com.scb.phone/BROADCAST_END_EBILL_SUBSCRIPTION_TUTORIAL");
        intentFilter.addAction("com.scb.phone/BROADCAST_END_PROMPTPAY_QR_TUTORIAL");
        this.IconCompatParcelizer = setChildDrawingOrderCallback.IconCompatParcelizer(getActivity(), intentFilter).subscribe(new ActivityBuilder_ContributePrepaidTravelTopupLandingActivity(this), ActivityBuilder_ContributePrivacyCSentActivity.MediaBrowserCompat$ItemReceiver);
        this.mRootView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.goManagePromptPayPresenter.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.MediaBrowserCompat$MediaItem = arguments.getBoolean("BUNDLE_SHOW_TUTORIAL", false);
            this.MediaMetadataCompat = MapsInitializer.MediaBrowserCompat$ItemReceiver(arguments.getString("BUNDLE_SOURCE_REQUEST_LANDING_TYPE", MapsInitializer.REQUEST_MONEY.type));
        }
        if (!this.MediaBrowserCompat$MediaItem) {
            this.mOverlayRequestMoneyTutorialImageView.setVisibility(8);
            this.mRequestMoneyTutotrialContainer.setVisibility(8);
        }
        if (C61703.MediaBrowserCompat$ItemReceiver[this.MediaMetadataCompat.ordinal()] != 1) {
            this.buttonPromptPaySettings.setText(getString(R.string.request_to_pay_settings));
            this.descriptionTextView.setText(getString(R.string.request_to_pay_prompt_pay_is_required_detail_new));
        } else {
            this.buttonPromptPaySettings.setText(getString(R.string.manage_scb_promptpay));
            this.descriptionTextView.setText(getString(R.string.promptpay_qr_prompt_pay_is_required_detail));
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = new Animator.AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                RequirePromptPayFragment.MediaBrowserCompat$CustomActionResultReceiver(RequirePromptPayFragment.this);
            }
        };
        return inflate;
    }

    /* renamed from: com.scb.phone.view.fragment.requesttopay.RequirePromptPayFragment$3 */
    static /* synthetic */ class C61703 {
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                o.MapsInitializer[] r0 = p040o.MapsInitializer.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$ItemReceiver = r0
                o.MapsInitializer r1 = p040o.MapsInitializer.PROMPTPAY_QR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.MapsInitializer r1 = p040o.MapsInitializer.EBILL_SUBSCRIPTION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.MapsInitializer r1 = p040o.MapsInitializer.REQUEST_MONEY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.requesttopay.RequirePromptPayFragment.C61703.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onPromptPaySettingsClick() {
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
            o.MapsInitializer r0 = r2.MediaMetadataCompat
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
            o.MapsInitializer r0 = r2.MediaMetadataCompat
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
            o.MapsInitializer r0 = r2.MediaMetadataCompat
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
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.requesttopay.RequirePromptPayFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onGlobalLayout() {
        this.mRootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (this.MediaBrowserCompat$MediaItem) {
            FragmentBuilder_BindDepositSelectorFragment.read(getContext(), this.mRootView, this.mOverlayRequestMoneyTutorialImageView);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mOverlayRequestMoneyTutorialImageView.getLayoutParams();
            layoutParams.width = this.mRootView.getWidth();
            this.mOverlayRequestMoneyTutorialImageView.setLayoutParams(layoutParams);
        }
    }

    public void onDestroy() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.IconCompatParcelizer;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.IconCompatParcelizer.dispose();
        }
        super.onDestroy();
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RequirePromptPayFragment requirePromptPayFragment) {
        requirePromptPayFragment.mOverlayRequestMoneyTutorialImageView.setVisibility(8);
        requirePromptPayFragment.mRequestMoneyTutotrialContainer.setVisibility(8);
    }

    public static /* synthetic */ void MediaBrowserCompat$ItemReceiver(RequirePromptPayFragment requirePromptPayFragment) {
        requirePromptPayFragment.mOverlayRequestMoneyTutorialImageView.animate().setDuration(300).alpha(BitmapDescriptorFactory.HUE_RED).setListener(requirePromptPayFragment.MediaBrowserCompat$CustomActionResultReceiver);
        requirePromptPayFragment.mRequestMoneyTutotrialContainer.animate().setDuration(300).alpha(BitmapDescriptorFactory.HUE_RED).setListener(requirePromptPayFragment.MediaBrowserCompat$CustomActionResultReceiver);
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

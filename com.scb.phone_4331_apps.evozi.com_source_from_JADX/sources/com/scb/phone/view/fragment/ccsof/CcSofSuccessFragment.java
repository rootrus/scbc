package com.scb.phone.view.fragment.ccsof;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.PurchaseSuccessFragment;
import com.scb.phone.view.fragment.PurchaseSuccessFragment$MediaBrowserCompat$ItemReceiver;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import p040o.BankingServicesDeepLinkActivity;
import p040o.CheckEligibilityActivity;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingCheckedFuture;
import p040o.FragmentBuilder_BindDirectDebitTermsAndConditionsFragment;
import p040o.FundActionsSuccessActivity;
import p040o.HmlETBLandingActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.ZTBSV;
import p040o.ZTRMM;
import p040o.getUserId;
import p040o.onGetStartedClick;
import p040o.standardStartAndWait;

public final class CcSofSuccessFragment extends PurchaseSuccessFragment {
    public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer((byte) 0);
    private final HmlVerifyEmailActivity MediaBrowserCompat$MediaItem;
    private ZTRMM MediaMetadataCompat;

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver() {
    }

    public final /* synthetic */ void MediaBrowserCompat$MediaItem(String str) {
    }

    public final void read(standardStartAndWait standardstartandwait) {
    }

    static final class read<T> implements DebitCardMarketConductDeepLinkActivity<Uri> {
        private /* synthetic */ boolean read;
        private /* synthetic */ CcSofSuccessFragment write;

        read(CcSofSuccessFragment ccSofSuccessFragment, boolean z) {
            this.write = ccSofSuccessFragment;
            this.read = z;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            this.write.IconCompatParcelizer(((Uri) obj).toString(), this.read);
        }
    }

    public CcSofSuccessFragment() {
        FundActionsSuccessActivity write2 = new write(this);
        onGetStartedClick.write((Object) write2, "initializer");
        this.MediaBrowserCompat$MediaItem = new HmlVerifyPhoneTermsConditionsActivity(write2);
    }

    public final /* synthetic */ void write(ForwardingCheckedFuture.SimpleForwardingCheckedFuture simpleForwardingCheckedFuture, boolean z, boolean z2) {
        standardStartAndWait standardstartandwait = (standardStartAndWait) simpleForwardingCheckedFuture;
        if (standardstartandwait != null) {
            PurchaseSuccessFragment$MediaBrowserCompat$ItemReceiver purchaseSuccessFragment$MediaBrowserCompat$ItemReceiver = new PurchaseSuccessFragment$MediaBrowserCompat$ItemReceiver(this.themesSlipPresenter);
            PurchaseSuccessFragment.PurchaseScreenshotDisplay purchaseScreenshotDisplay = new PurchaseSuccessFragment.PurchaseScreenshotDisplay(R.layout.f91692131494396, standardstartandwait.IconCompatParcelizer(String.valueOf(Calendar.getInstance().getTimeInMillis())), standardstartandwait, z, this.componentFactory, z2);
            purchaseScreenshotDisplay.IconCompatParcelizer = true;
            this.IconCompatParcelizer = DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDirectDebitTermsAndConditionsFragment(purchaseSuccessFragment$MediaBrowserCompat$ItemReceiver, purchaseScreenshotDisplay, getContext())).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new read(this, z), new CcSofSuccessFragment$MediaBrowserCompat$ItemReceiver(this));
        }
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.MediaMetadataCompat = new ZTRMM();
        MediaSessionCompat$ResultReceiverWrapper();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        ArrayList arrayList = null;
        standardStartAndWait standardstartandwait = arguments != null ? (standardStartAndWait) arguments.getParcelable("EXTRA_CC_SOF_KEY_SUCCESS") : null;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arrayList = arguments2.getParcelableArrayList("EXTRA_ITEM_DEEP_LINK_BUTTON_DISPLAY_LIST");
        }
        this.presenter.read(standardstartandwait, (List<getUserId>) arrayList);
        ZTRMM ztrmm = this.MediaMetadataCompat;
        if (ztrmm == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
        }
        ztrmm.read("source", "deeplink");
        ZTRMM ztrmm2 = this.MediaMetadataCompat;
        if (ztrmm2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
        }
        ztrmm2.read("subtype", (String) this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver());
        ZTRMM ztrmm3 = this.MediaMetadataCompat;
        if (ztrmm3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
        }
        ZTBSV ztbsv = ztrmm3;
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "partner_payment_slip");
        }
    }

    public final void IconCompatParcelizer() {
        super.IconCompatParcelizer();
    }

    public final void onDestroyView() {
        this.presenter.onDestroy();
        super.onDestroyView();
    }

    public final void onShareSlipButtonClick() {
        super.onShareSlipButtonClick();
        ZTRMM ztrmm = this.MediaMetadataCompat;
        if (ztrmm == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
        }
        ztrmm.read("source", "deeplink");
        ZTRMM ztrmm2 = this.MediaMetadataCompat;
        if (ztrmm2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
        }
        ztrmm2.read("subtype", (String) this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver());
        ZTRMM ztrmm3 = this.MediaMetadataCompat;
        if (ztrmm3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
        }
        ZTBSV ztbsv = ztrmm3;
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "partner_payment_share_slip_action");
        }
    }

    static final class write extends CheckEligibilityActivity implements FundActionsSuccessActivity<String> {
        private /* synthetic */ CcSofSuccessFragment write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(CcSofSuccessFragment ccSofSuccessFragment) {
            super(0);
            this.write = ccSofSuccessFragment;
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.write.getArguments();
            if (arguments != null) {
                return arguments.getString("EXTRA_CC_SOF_KEY_SUCCESS_PARTNER_SUBTYPE_CODE");
            }
            return null;
        }
    }
}

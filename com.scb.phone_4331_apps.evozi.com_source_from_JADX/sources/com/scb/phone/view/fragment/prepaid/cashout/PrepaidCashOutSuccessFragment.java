package com.scb.phone.view.fragment.prepaid.cashout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.PurchaseSuccessFragment;
import com.scb.phone.view.fragment.PurchaseSuccessFragment$MediaBrowserCompat$ItemReceiver;
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
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.IFaceDetectionResult;
import p040o.IFaceDetectionResult$MediaBrowserCompat$ItemReceiver;
import p040o.ZTBSV;
import p040o.getKernelIDDstAtop;
import p040o.getUserId;
import p040o.onGetStartedClick;
import p040o.standardStartAndWait;
import p040o.writeUInt64NoTag;

public final class PrepaidCashOutSuccessFragment extends PurchaseSuccessFragment {
    public static final read MediaBrowserCompat$CustomActionResultReceiver = new read((byte) 0);
    private final HmlVerifyEmailActivity MediaDescriptionCompat;
    private standardStartAndWait MediaMetadataCompat;
    @HmlPinActivity
    public IFaceDetectionResult successPresenter;

    static final class IconCompatParcelizer<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
        private /* synthetic */ PrepaidCashOutSuccessFragment write;

        IconCompatParcelizer(PrepaidCashOutSuccessFragment prepaidCashOutSuccessFragment) {
            this.write = prepaidCashOutSuccessFragment;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            this.write.write((Throwable) obj);
        }
    }

    public PrepaidCashOutSuccessFragment() {
        FundActionsSuccessActivity fundActionsSuccessActivity = write.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaDescriptionCompat = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public final /* synthetic */ void IconCompatParcelizer(ForwardingCheckedFuture.SimpleForwardingCheckedFuture simpleForwardingCheckedFuture, boolean z, boolean z2) {
        IconCompatParcelizer((standardStartAndWait) simpleForwardingCheckedFuture, z, z2);
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        IFaceDetectionResult iFaceDetectionResult = this.successPresenter;
        if (iFaceDetectionResult == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("successPresenter");
        }
        iFaceDetectionResult.MediaBrowserCompat$ItemReceiver(this);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.MediaMetadataCompat = arguments != null ? (standardStartAndWait) arguments.getParcelable("PREPAID_CASH_OUT_KEY_SUCCESS") : null;
        IFaceDetectionResult iFaceDetectionResult = this.successPresenter;
        if (iFaceDetectionResult == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("successPresenter");
        }
        iFaceDetectionResult.MediaBrowserCompat$ItemReceiver(this);
        standardStartAndWait standardstartandwait = this.MediaMetadataCompat;
        if (standardstartandwait != null) {
            IFaceDetectionResult iFaceDetectionResult2 = this.successPresenter;
            if (iFaceDetectionResult2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("successPresenter");
            }
            onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
            writeUInt64NoTag.IconCompatParcelizer iFaceDetectionResult$MediaBrowserCompat$ItemReceiver = new IFaceDetectionResult$MediaBrowserCompat$ItemReceiver(standardstartandwait);
            if (iFaceDetectionResult2.RatingCompat != null) {
                iFaceDetectionResult$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(iFaceDetectionResult2.RatingCompat);
            }
        }
    }

    public final void read(standardStartAndWait standardstartandwait) {
        onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
        this.presenter.read(standardstartandwait, (List<getUserId>) null);
    }

    public final void MediaBrowserCompat$ItemReceiver(standardStartAndWait standardstartandwait, boolean z, boolean z2) {
        if (standardstartandwait != null) {
            PurchaseSuccessFragment$MediaBrowserCompat$ItemReceiver purchaseSuccessFragment$MediaBrowserCompat$ItemReceiver = new PurchaseSuccessFragment$MediaBrowserCompat$ItemReceiver(this.themesSlipPresenter);
            PurchaseSuccessFragment.PurchaseScreenshotDisplay purchaseScreenshotDisplay = new PurchaseSuccessFragment.PurchaseScreenshotDisplay(R.layout.f91692131494396, standardstartandwait.IconCompatParcelizer(String.valueOf(Calendar.getInstance().getTimeInMillis())), standardstartandwait, z, this.componentFactory, z2);
            purchaseScreenshotDisplay.IconCompatParcelizer = true;
            this.IconCompatParcelizer = DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDirectDebitTermsAndConditionsFragment(purchaseSuccessFragment$MediaBrowserCompat$ItemReceiver, purchaseScreenshotDisplay, getContext())).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new PrepaidCashOutSuccessFragment$MediaBrowserCompat$ItemReceiver(this, z), new IconCompatParcelizer(this));
            ZTBSV ztbsv = (getKernelIDDstAtop) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
            if (getActivity() != null) {
                ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "planetscb_cashout_slip_screen");
            }
        }
    }

    public final void onDestroyView() {
        IFaceDetectionResult iFaceDetectionResult = this.successPresenter;
        if (iFaceDetectionResult == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("successPresenter");
        }
        iFaceDetectionResult.onDestroy();
        super.onDestroyView();
    }

    static final class write extends CheckEligibilityActivity implements FundActionsSuccessActivity<getKernelIDDstAtop> {
        public static final write MediaBrowserCompat$CustomActionResultReceiver = new write();

        write() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new getKernelIDDstAtop();
        }
    }

    public final void IconCompatParcelizer() {
        ZTBSV ztbsv = (getKernelIDDstAtop) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "planetscb_cashout_return");
        }
        super.IconCompatParcelizer();
    }
}

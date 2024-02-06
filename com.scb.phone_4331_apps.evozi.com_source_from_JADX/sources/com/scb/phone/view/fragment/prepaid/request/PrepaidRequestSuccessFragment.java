package com.scb.phone.view.fragment.prepaid.request;

import android.net.Uri;
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
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingCheckedFuture;
import p040o.FragmentBuilder_BindDirectDebitTermsAndConditionsFragment;
import p040o.FundActionsSuccessActivity;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.ZTBSV;
import p040o.getKernelIDDstAtop;
import p040o.getUserId;
import p040o.onExtractionComplete;
import p040o.onGetStartedClick;
import p040o.standardStartAndWait;
import p040o.writeUInt64NoTag;

public final class PrepaidRequestSuccessFragment extends PurchaseSuccessFragment {
    public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer((byte) 0);
    private final HmlVerifyEmailActivity MediaBrowserCompat$MediaItem;
    private standardStartAndWait RatingCompat;
    @HmlPinActivity
    public onExtractionComplete successPresenter;

    static final class read<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
        private /* synthetic */ PrepaidRequestSuccessFragment MediaBrowserCompat$CustomActionResultReceiver;

        read(PrepaidRequestSuccessFragment prepaidRequestSuccessFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = prepaidRequestSuccessFragment;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            this.MediaBrowserCompat$CustomActionResultReceiver.write((Throwable) obj);
        }
    }

    static final class write<T> implements DebitCardMarketConductDeepLinkActivity<Uri> {
        private /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ PrepaidRequestSuccessFragment write;

        write(PrepaidRequestSuccessFragment prepaidRequestSuccessFragment, boolean z) {
            this.write = prepaidRequestSuccessFragment;
            this.MediaBrowserCompat$ItemReceiver = z;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            this.write.IconCompatParcelizer(((Uri) obj).toString(), this.MediaBrowserCompat$ItemReceiver);
        }
    }

    public PrepaidRequestSuccessFragment() {
        FundActionsSuccessActivity fundActionsSuccessActivity = PrepaidRequestSuccessFragment$MediaBrowserCompat$ItemReceiver.read;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaBrowserCompat$MediaItem = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public final /* synthetic */ void IconCompatParcelizer(ForwardingCheckedFuture.SimpleForwardingCheckedFuture simpleForwardingCheckedFuture, boolean z, boolean z2) {
        IconCompatParcelizer((standardStartAndWait) simpleForwardingCheckedFuture, z, z2);
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        onExtractionComplete onextractioncomplete = this.successPresenter;
        if (onextractioncomplete == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("successPresenter");
        }
        onextractioncomplete.MediaBrowserCompat$ItemReceiver(this);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.RatingCompat = arguments != null ? (standardStartAndWait) arguments.getParcelable("com.scb.phone.view.fragment.prepaid.request.PrepaidRequestSuccessFragment.KEY_SUCCESS") : null;
        onExtractionComplete onextractioncomplete = this.successPresenter;
        if (onextractioncomplete == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("successPresenter");
        }
        onextractioncomplete.MediaBrowserCompat$ItemReceiver(this);
        standardStartAndWait standardstartandwait = this.RatingCompat;
        if (standardstartandwait != null) {
            onExtractionComplete onextractioncomplete2 = this.successPresenter;
            if (onextractioncomplete2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("successPresenter");
            }
            onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new onExtractionComplete.IconCompatParcelizer(standardstartandwait);
            if (onextractioncomplete2.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(onextractioncomplete2.RatingCompat);
            }
        }
    }

    public final void read(standardStartAndWait standardstartandwait) {
        onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
        this.presenter.read(standardstartandwait, (List<getUserId>) null);
    }

    public final void MediaBrowserCompat$ItemReceiver(standardStartAndWait standardstartandwait, boolean z, boolean z2) {
        if (standardstartandwait != null) {
            this.IconCompatParcelizer = DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDirectDebitTermsAndConditionsFragment(new PurchaseSuccessFragment$MediaBrowserCompat$ItemReceiver(), new PurchaseSuccessFragment.PurchaseScreenshotDisplay(R.layout.f91692131494396, standardstartandwait.IconCompatParcelizer(String.valueOf(Calendar.getInstance().getTimeInMillis())), standardstartandwait, z, this.componentFactory, z2), getContext())).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new write(this, z), new read(this));
            ZTBSV ztbsv = (getKernelIDDstAtop) this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver();
            if (getActivity() != null) {
                ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "planetscb_request_slip_screen");
            }
        }
    }

    public final void onDestroyView() {
        onExtractionComplete onextractioncomplete = this.successPresenter;
        if (onextractioncomplete == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("successPresenter");
        }
        onextractioncomplete.onDestroy();
        super.onDestroyView();
    }

    public final void IconCompatParcelizer() {
        ZTBSV ztbsv = (getKernelIDDstAtop) this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "planetscb_return_account_summary_request");
        }
        super.IconCompatParcelizer();
    }
}

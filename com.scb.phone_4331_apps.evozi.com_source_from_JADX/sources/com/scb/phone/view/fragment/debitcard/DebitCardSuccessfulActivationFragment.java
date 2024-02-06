package com.scb.phone.view.fragment.debitcard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.fragment.PurchaseSuccessFragment;
import java.util.Calendar;
import java.util.List;
import p040o.BankingServicesDeepLinkActivity;
import p040o.CaptureGuidance;
import p040o.DebitCardResetOtpActivity;
import p040o.Field;
import p040o.ForwardingCheckedFuture;
import p040o.ForwardingListenableFuture;
import p040o.FragmentBuilder_BindDirectDebitTermsAndConditionsFragment;
import p040o.FragmentBuilder_BindEBillSelectedFragment;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.Iterables;
import p040o.getPageIndex;
import p040o.getRectangle;
import p040o.getUserId;
import p040o.logEventNoInterceptor;
import p040o.nativeSetPageIndex;
import p040o.nativeSetRectangle;
import p040o.nativeSetToken;
import p040o.postMHMCDetailCalculation;
import p040o.postNcbConsent;
import p040o.proxyGetIIdExtractionServerRtti;
import p040o.setPageIndex;
import p040o.standardStartAndWait;

public class DebitCardSuccessfulActivationFragment extends PurchaseSuccessFragment implements proxyGetIIdExtractionServerRtti {
    @HmlPinActivity
    public CaptureGuidance debitCardSuccessfulActivationPresenter;
    @BindView
    TextView tvRemark;

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver() {
    }

    public final /* synthetic */ void MediaBrowserCompat$MediaItem(String str) {
    }

    public final int MediaSessionCompat$QueueItem() {
        return R.layout.f86282131493855;
    }

    public static DebitCardSuccessfulActivationFragment RatingCompat() {
        return new DebitCardSuccessfulActivationFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ButterKnife.IconCompatParcelizer(this, onCreateView);
        this.debitCardSuccessfulActivationPresenter.MediaBrowserCompat$ItemReceiver(this);
        CaptureGuidance captureGuidance = this.debitCardSuccessfulActivationPresenter;
        captureGuidance.IconCompatParcelizer.read(DebitCardResetOtpActivity.zip(captureGuidance.IconCompatParcelizer.write.read(), captureGuidance.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.write(), new nativeSetToken(captureGuidance)), new setPageIndex(captureGuidance), new getRectangle(captureGuidance));
        return onCreateView;
    }

    public final void read(standardStartAndWait standardstartandwait) {
        this.presenter.read(standardstartandwait, (List<getUserId>) null);
        CaptureGuidance captureGuidance = this.debitCardSuccessfulActivationPresenter;
        captureGuidance.write(standardstartandwait != null, new getPageIndex(captureGuidance, standardstartandwait));
    }

    public void onDestroy() {
        this.debitCardSuccessfulActivationPresenter.onDestroy();
        super.onDestroy();
    }

    public final void RatingCompat(String str) {
        this.tvRemark.setVisibility(0);
        this.tvRemark.setText(str);
    }

    public final void MediaBrowserCompat$ItemReceiver(standardStartAndWait standardstartandwait, boolean z, boolean z2) {
        CaptureGuidance captureGuidance = this.debitCardSuccessfulActivationPresenter;
        nativeSetPageIndex nativesetpageindex = new nativeSetPageIndex(captureGuidance, z, z2);
        if (captureGuidance.RatingCompat != null) {
            nativesetpageindex.IconCompatParcelizer(captureGuidance.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z, standardStartAndWait standardstartandwait, boolean z2) {
        this.IconCompatParcelizer = DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDirectDebitTermsAndConditionsFragment(new read(), new IconCompatParcelizer(standardstartandwait.IconCompatParcelizer(String.valueOf(Calendar.getInstance().getTimeInMillis())), standardstartandwait, z, this.componentFactory, z2), getContext())).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new postMHMCDetailCalculation(this, z), new postNcbConsent(this));
    }

    public final void MediaBrowserCompat$MediaItem() {
        mo15340x50fd9e4a(false);
    }

    public static class IconCompatParcelizer extends PurchaseSuccessFragment.PurchaseScreenshotDisplay {
        public IconCompatParcelizer(String str, standardStartAndWait standardstartandwait, boolean z, Iterables.C352414 r11, boolean z2) {
            super(R.layout.f91942131494421, str, standardstartandwait, z, r11, z2);
        }
    }

    public static class read extends FragmentBuilder_BindEBillSelectedFragment<PurchaseSuccessFragment.PurchaseScreenshotDisplay> {
        public final /* synthetic */ void write(ForwardingListenableFuture.SimpleForwardingListenableFuture simpleForwardingListenableFuture, View view) {
            PurchaseSuccessFragment.PurchaseScreenshotDisplay purchaseScreenshotDisplay = (PurchaseSuccessFragment.PurchaseScreenshotDisplay) simpleForwardingListenableFuture;
            ButterKnife.IconCompatParcelizer(purchaseScreenshotDisplay, view);
            purchaseScreenshotDisplay.read(view);
        }
    }

    @OnClick
    public void onClickReturnButton() {
        CaptureGuidance captureGuidance = this.debitCardSuccessfulActivationPresenter;
        if (captureGuidance.RatingCompat != null) {
            captureGuidance.RatingCompat.AlertController$RecycleListView();
        }
        logEventNoInterceptor logeventnointerceptor = captureGuidance.MediaBrowserCompat$SearchResultReceiver;
        logeventnointerceptor.read(logeventnointerceptor.read(), new nativeSetRectangle(captureGuidance), new Field(captureGuidance));
    }

    public final /* synthetic */ void IconCompatParcelizer(ForwardingCheckedFuture.SimpleForwardingCheckedFuture simpleForwardingCheckedFuture, boolean z, boolean z2) {
        CaptureGuidance captureGuidance = this.debitCardSuccessfulActivationPresenter;
        nativeSetPageIndex nativesetpageindex = new nativeSetPageIndex(captureGuidance, z, z2);
        if (captureGuidance.RatingCompat != null) {
            nativesetpageindex.IconCompatParcelizer(captureGuidance.RatingCompat);
        }
    }
}

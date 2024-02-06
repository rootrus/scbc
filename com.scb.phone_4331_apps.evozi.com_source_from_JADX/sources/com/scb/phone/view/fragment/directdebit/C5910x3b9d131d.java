package com.scb.phone.view.fragment.directdebit;

import android.view.View;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.view.fragment.PurchaseSuccessFragment;
import p040o.ForwardingListenableFuture;
import p040o.FragmentBuilder_BindEBillSelectedFragment;
import p040o.onGetStartedClick;
import p040o.setExitButtonEnabled;

/* renamed from: com.scb.phone.view.fragment.directdebit.DirectDebitSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5910x3b9d131d extends FragmentBuilder_BindEBillSelectedFragment<PurchaseSuccessFragment.PurchaseScreenshotDisplay> {
    public final /* synthetic */ void write(ForwardingListenableFuture.SimpleForwardingListenableFuture simpleForwardingListenableFuture, View view) {
        PurchaseSuccessFragment.PurchaseScreenshotDisplay purchaseScreenshotDisplay = (PurchaseSuccessFragment.PurchaseScreenshotDisplay) simpleForwardingListenableFuture;
        onGetStartedClick.write((Object) purchaseScreenshotDisplay, "display");
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        ButterKnife.IconCompatParcelizer(purchaseScreenshotDisplay, view);
        ButterKnife.IconCompatParcelizer(this, view);
        purchaseScreenshotDisplay.read(view);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5910x3b9d131d(setExitButtonEnabled setexitbuttonenabled) {
        super(setexitbuttonenabled);
        onGetStartedClick.write((Object) setexitbuttonenabled, "themesSlipPresenter");
    }
}

package com.scb.phone.view.fragment;

import android.view.View;
import butterknife.ButterKnife;
import com.scb.phone.view.fragment.PurchaseSuccessFragment;
import p040o.ForwardingListenableFuture;
import p040o.FragmentBuilder_BindEBillSelectedFragment;
import p040o.setExitButtonEnabled;

public class PurchaseSuccessFragment$MediaBrowserCompat$ItemReceiver extends FragmentBuilder_BindEBillSelectedFragment<PurchaseSuccessFragment.PurchaseScreenshotDisplay> {
    public final /* synthetic */ void write(ForwardingListenableFuture.SimpleForwardingListenableFuture simpleForwardingListenableFuture, View view) {
        PurchaseSuccessFragment.PurchaseScreenshotDisplay purchaseScreenshotDisplay = (PurchaseSuccessFragment.PurchaseScreenshotDisplay) simpleForwardingListenableFuture;
        ButterKnife.IconCompatParcelizer(purchaseScreenshotDisplay, view);
        purchaseScreenshotDisplay.read(view);
    }

    public PurchaseSuccessFragment$MediaBrowserCompat$ItemReceiver() {
    }

    public PurchaseSuccessFragment$MediaBrowserCompat$ItemReceiver(setExitButtonEnabled setexitbuttonenabled) {
        super(setexitbuttonenabled);
    }
}

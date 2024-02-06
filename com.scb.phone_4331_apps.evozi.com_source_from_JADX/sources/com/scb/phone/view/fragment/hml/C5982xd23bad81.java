package com.scb.phone.view.fragment.hml;

import p040o.DebitCardResetOtpActivity;
import p040o.HmlPinActivity;
import p040o.IExtractionServer;
import p040o.getVariantAsync;

/* renamed from: com.scb.phone.view.fragment.hml.HmlConsumerETBPersonalInfoFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5982xd23bad81 implements getVariantAsync {
    private final IExtractionServer.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    private final String MediaBrowserCompat$ItemReceiver;

    private C5982xd23bad81() {
    }

    @HmlPinActivity
    public C5982xd23bad81(IExtractionServer.IconCompatParcelizer iconCompatParcelizer, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final DebitCardResetOtpActivity<String> MediaBrowserCompat$CustomActionResultReceiver() {
        IExtractionServer.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
        return iconCompatParcelizer.IconCompatParcelizer.getDonationDocument(this.MediaBrowserCompat$ItemReceiver);
    }
}

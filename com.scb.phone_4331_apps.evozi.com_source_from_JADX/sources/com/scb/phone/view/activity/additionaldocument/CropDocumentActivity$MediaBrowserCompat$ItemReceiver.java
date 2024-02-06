package com.scb.phone.view.activity.additionaldocument;

import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.SettingsController;
import p040o.onGetStartedClick;
import p040o.zzvb;

final class CropDocumentActivity$MediaBrowserCompat$ItemReceiver<T> implements DebitCardMarketConductDeepLinkActivity<zzvb> {
    private /* synthetic */ CropDocumentActivity MediaBrowserCompat$ItemReceiver;

    CropDocumentActivity$MediaBrowserCompat$ItemReceiver(CropDocumentActivity cropDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = cropDocumentActivity;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        zzvb zzvb = (zzvb) obj;
        SettingsController settingsController = this.MediaBrowserCompat$ItemReceiver.presenter;
        if (settingsController == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        settingsController.read(zzvb.read);
    }
}

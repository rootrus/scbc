package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import p040o.DeviceServiceResponse;
import p040o.HmlPinActivity;
import p040o.LogFileManager;
import p040o.PassportCaptureActivity;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

public final class HmlNTBExternalAuthenticationDeepLinkActivity extends HmlBaseDeepLinkActivity implements PassportCaptureActivity {
    @HmlPinActivity
    public DeviceServiceResponse presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean setOverlayMode() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void ActionMenuPresenter$OverflowMenuButton() {
        super.ActionMenuPresenter$OverflowMenuButton();
        DeviceServiceResponse deviceServiceResponse = this.presenter;
        if (deviceServiceResponse == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        deviceServiceResponse.MediaBrowserCompat$ItemReceiver(this);
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        DeviceServiceResponse deviceServiceResponse = this.presenter;
        if (deviceServiceResponse == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = DeviceServiceResponse.write.read;
        if (deviceServiceResponse.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(deviceServiceResponse.RatingCompat);
        }
    }

    public final void MediaSessionCompat$ResultReceiverWrapper(LogFileManager.DirectoryProvider directoryProvider) {
        DeviceServiceResponse deviceServiceResponse = this.presenter;
        if (deviceServiceResponse == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = DeviceServiceResponse.write.read;
        if (deviceServiceResponse.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(deviceServiceResponse.RatingCompat);
        }
    }

    public final void read() {
        finish();
    }
}

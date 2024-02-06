package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import com.scb.phone.view.activity.transferandpay.ScanPaymentActivity;
import p040o.DetectedDocumentBoundary;
import p040o.HmlPinActivity;
import p040o.IdParameters;
import p040o.getIdType;

public class ScanCameraDeepLinkActivity extends BaseDeepLinkActivity implements IdParameters {
    @HmlPinActivity
    public getIdType iDeviceCompatibilityHelper;
    @HmlPinActivity
    public DetectedDocumentBoundary presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final int MediaSessionCompat$Token() {
        return 3;
    }

    /* access modifiers changed from: protected */
    public final void ActionMenuPresenter$OverflowMenuButton() {
        super.ActionMenuPresenter$OverflowMenuButton();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if ((r6.length() == 0) != false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(android.content.Intent r5, java.lang.String r6) {
        /*
            r4 = this;
            o.DetectedDocumentBoundary r5 = r4.presenter
            o.getIdType r0 = r4.iDeviceCompatibilityHelper
            boolean r0 = r0.read()
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L_0x001a
            r3 = r6
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0017
            r3 = r1
            goto L_0x0018
        L_0x0017:
            r3 = r2
        L_0x0018:
            if (r3 == 0) goto L_0x001c
        L_0x001a:
            if (r0 == 0) goto L_0x0030
        L_0x001c:
            o.DetectedDocumentBoundary$read r0 = new o.DetectedDocumentBoundary$read
            r0.<init>(r6)
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r6 = r5.RatingCompat
            if (r6 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r1 = r2
        L_0x0029:
            if (r1 == 0) goto L_0x0030
            T r5 = r5.RatingCompat
            r0.IconCompatParcelizer(r5)
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.deeplink.ScanCameraDeepLinkActivity.IconCompatParcelizer(android.content.Intent, java.lang.String):void");
    }

    public final void IconCompatParcelizer(String str) {
        Intent intent = getIntent();
        boolean z = false;
        if (intent != null && intent.getBooleanExtra("BANKING_SERVICE_TILE_TAG", false)) {
            z = true;
        }
        Intent intent2 = new Intent(this, ScanPaymentActivity.class);
        if (!z) {
            intent2.setAction("ACTION_DEEP_LINK_SCAN");
        }
        intent2.putExtra("QR_DATA", str);
        read(intent2);
    }
}

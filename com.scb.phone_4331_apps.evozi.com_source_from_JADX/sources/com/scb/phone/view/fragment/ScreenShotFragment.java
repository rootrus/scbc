package com.scb.phone.view.fragment;

import p040o.ForwardingCheckedFuture;
import p040o.ForwardingCheckedFuture.SimpleForwardingCheckedFuture;
import p040o.getLeftEdgeTearHeight;
import p040o.onCheckBoxClick;
import p040o.verifyRedeem;

public abstract class ScreenShotFragment<T extends ForwardingCheckedFuture.SimpleForwardingCheckedFuture> extends BaseFragment implements getLeftEdgeTearHeight {
    /* access modifiers changed from: protected */
    public abstract void IconCompatParcelizer(T t, boolean z, boolean z2);

    public static void MediaSessionCompat$Token() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onPermissionDenied", new Object[0]);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public static void m3376x50fd9e4a() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onNeverAskAgain", new Object[0]);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        verifyRedeem.MediaBrowserCompat$CustomActionResultReceiver(this, i, iArr);
    }

    public void write(T t, boolean z, boolean z2) {
        IconCompatParcelizer(t, z, z2);
    }
}

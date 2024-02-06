package com.scb.phone.view.fragment.hml;

import android.view.View;
import p040o.ClsFileOutputStream;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

final class HmlBaseOnlineSuccessFragment$MediaBrowserCompat$ItemReceiver implements View.OnClickListener {
    private /* synthetic */ HmlBaseOnlineSuccessFragment MediaBrowserCompat$CustomActionResultReceiver;

    HmlBaseOnlineSuccessFragment$MediaBrowserCompat$ItemReceiver(HmlBaseOnlineSuccessFragment hmlBaseOnlineSuccessFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlBaseOnlineSuccessFragment;
    }

    public final void onClick(View view) {
        T t = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        ClsFileOutputStream.C31751 r0 = new writeUInt64NoTag.IconCompatParcelizer() {
            public final void IconCompatParcelizer(Object obj) {
                ((CheckCaptureModule_GetIExtractionServerRttiFactory) obj).read(getSessionEventSize.this.IconCompatParcelizer, true);
            }
        };
        if (t.RatingCompat != null) {
            r0.IconCompatParcelizer(t.RatingCompat);
        }
    }
}

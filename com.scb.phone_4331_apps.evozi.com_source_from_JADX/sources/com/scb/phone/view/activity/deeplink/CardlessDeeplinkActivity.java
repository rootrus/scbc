package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import com.scb.phone.view.activity.transferandpay.cardlessatm.CardlessATMTutorialActivity;
import p040o.C5034x57dda53d;
import p040o.GoodToKnowActivity;
import p040o.HmlPinActivity;
import p040o.IdCaptureModule_GetLookAndFeelParametersFactory;
import p040o.nativeIsGuidanceAvailable;
import p040o.nativeIsGuidanceAvailable$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

public final class CardlessDeeplinkActivity extends BaseDeepLinkActivity implements IdCaptureModule_GetLookAndFeelParametersFactory {
    @HmlPinActivity
    public nativeIsGuidanceAvailable presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void ActionMenuPresenter$OverflowMenuButton() {
        nativeIsGuidanceAvailable nativeisguidanceavailable = this.presenter;
        if (nativeisguidanceavailable == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        nativeisguidanceavailable.MediaBrowserCompat$ItemReceiver(this);
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        nativeIsGuidanceAvailable nativeisguidanceavailable = this.presenter;
        if (nativeisguidanceavailable == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (str == null) {
            str = "";
        }
        onGetStartedClick.write((Object) str, "deepLinkId");
        boolean z = false;
        if (nativeisguidanceavailable.MediaBrowserCompat$ItemReceiver.write.read() != null) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C5034x57dda53d.MediaBrowserCompat$ItemReceiver;
            if (nativeisguidanceavailable.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(nativeisguidanceavailable.RatingCompat);
            }
        } else if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, "cards", true) || GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, "deposits", true)) {
            onGetStartedClick.write((Object) str, "link");
            writeUInt64NoTag.IconCompatParcelizer nativeisguidanceavailable_mediabrowsercompat_itemreceiver = new nativeIsGuidanceAvailable$MediaBrowserCompat$ItemReceiver(str);
            if (nativeisguidanceavailable.RatingCompat != null) {
                z = true;
            }
            if (z) {
                nativeisguidanceavailable_mediabrowsercompat_itemreceiver.IconCompatParcelizer(nativeisguidanceavailable.RatingCompat);
            }
        } else {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = C5034x57dda53d.MediaBrowserCompat$ItemReceiver;
            if (nativeisguidanceavailable.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(nativeisguidanceavailable.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        mo14210S_();
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "link");
        read(CardlessATMTutorialActivity.MediaBrowserCompat$CustomActionResultReceiver(this, "deeplink", str));
    }
}

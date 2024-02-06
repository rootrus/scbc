package com.scb.phone.view.activity.hml;

import p040o.C4261dN;
import p040o.ForegroundLinearLayout;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.LinkedListMultimap;
import p040o.getWscClientIp;
import p040o.getWscClientIp$MediaBrowserCompat$MediaItem;
import p040o.onGetStartedClick;

public final class HmlVerifyPhoneValidateOtpActivity extends HmlVerifyPhoneActivity {
    public static final write MediaBrowserCompat$SearchResultReceiver = new write((byte) 0);

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void write(String str, String str2) {
        onGetStartedClick.write((Object) str, "tokenUUID");
        onGetStartedClick.write((Object) str2, "otp");
        getWscClientIp getwscclientip = this.presenter;
        onGetStartedClick.write((Object) str2, "tokenUuid");
        onGetStartedClick.write((Object) str, "otp");
        if (getwscclientip.RatingCompat != null) {
            getwscclientip.RatingCompat.AlertController$RecycleListView();
        }
        LinkedListMultimap.C35722 r3 = getwscclientip.read;
        FundActionsSuccessActivity mediaDescriptionCompat = new getWscClientIp.MediaDescriptionCompat(getwscclientip);
        FundFactSheetActivity getwscclientip_mediabrowsercompat_mediaitem = new getWscClientIp$MediaBrowserCompat$MediaItem(getwscclientip);
        onGetStartedClick.write((Object) mediaDescriptionCompat, "onSuccess");
        onGetStartedClick.write((Object) getwscclientip_mediabrowsercompat_mediaitem, "onError");
        onGetStartedClick.write((Object) str, "otp");
        onGetStartedClick.write((Object) str2, "tokenUuid");
        ForegroundLinearLayout foregroundLinearLayout = r3.MediaDescriptionCompat;
        foregroundLinearLayout.write(foregroundLinearLayout.IconCompatParcelizer(str2, str), new LinkedListMultimap.C35722.write(getwscclientip_mediabrowsercompat_mediaitem, mediaDescriptionCompat));
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final C4261dN.read mo33965x50fd9e4a() {
        return C4261dN.read.LOANORIGINATION;
    }
}

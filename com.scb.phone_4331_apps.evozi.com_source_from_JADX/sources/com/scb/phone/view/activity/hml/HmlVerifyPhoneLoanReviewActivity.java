package com.scb.phone.view.activity.hml;

import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.LinkedListMultimap;
import p040o.TextRecognizer;
import p040o.getWscClientIp;
import p040o.onGetStartedClick;

public final class HmlVerifyPhoneLoanReviewActivity extends HmlVerifyPhoneActivity {
    public static final write MediaDescriptionCompat = new write((byte) 0);

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
        Boolean bool = this.MediaBrowserCompat$MediaItem;
        onGetStartedClick.IconCompatParcelizer((Object) bool, "isNcbAccepted");
        boolean booleanValue = bool.booleanValue();
        onGetStartedClick.write((Object) str2, "otp");
        onGetStartedClick.write((Object) str, "tokenUuid");
        if (getwscclientip.RatingCompat != null) {
            getwscclientip.RatingCompat.AlertController$RecycleListView();
        }
        LinkedListMultimap.C35722 r4 = getwscclientip.read;
        FundActionsSuccessActivity read = new getWscClientIp.read(getwscclientip);
        FundFactSheetActivity iconCompatParcelizer = new getWscClientIp.IconCompatParcelizer(getwscclientip);
        onGetStartedClick.write((Object) read, "onSuccess");
        onGetStartedClick.write((Object) iconCompatParcelizer, "onError");
        onGetStartedClick.write((Object) str2, "otp");
        onGetStartedClick.write((Object) str, "tokenUuid");
        TextRecognizer.Builder builder = r4.MediaBrowserCompat$CustomActionResultReceiver;
        builder.write(builder.MediaBrowserCompat$CustomActionResultReceiver(str, str2, booleanValue), new LinkedListMultimap.C35722.read(iconCompatParcelizer, read));
    }
}

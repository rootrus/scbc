package p040o;

import p040o.Image;

/* renamed from: o.getMinFillFraction */
public final /* synthetic */ class getMinFillFraction implements FundFactSheetActivity {
    private final /* synthetic */ getLegacySharedPrefs MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Image.FriendI read;

    public /* synthetic */ getMinFillFraction(Image.FriendI friendI, getLegacySharedPrefs getlegacysharedprefs) {
        this.read = friendI;
        this.MediaBrowserCompat$CustomActionResultReceiver = getlegacysharedprefs;
    }

    public final Object invoke(Object obj) {
        Image.FriendI friendI = this.read;
        getLegacySharedPrefs getlegacysharedprefs = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = true;
        if (friendI.RatingCompat != null) {
            friendI.RatingCompat.aj_();
        }
        DocumentDetectionResult documentDetectionResult = new DocumentDetectionResult(friendI, getlegacysharedprefs);
        if (friendI.RatingCompat == null) {
            z = false;
        }
        if (z) {
            documentDetectionResult.IconCompatParcelizer(friendI.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

package p040o;

import p040o.Image;
import p040o.Onboarding;

/* renamed from: o.setMaxFillFraction */
public final /* synthetic */ class setMaxFillFraction implements FundFactSheetActivity {
    private final /* synthetic */ String read;
    private final /* synthetic */ Image.FriendI write;

    public /* synthetic */ setMaxFillFraction(Image.FriendI friendI, String str) {
        this.write = friendI;
        this.read = str;
    }

    public final Object invoke(Object obj) {
        Image.FriendI friendI = this.write;
        String str = this.read;
        Onboarding.C37193 r6 = (Onboarding.C37193) obj;
        boolean z = true;
        if (friendI.RatingCompat != null) {
            friendI.RatingCompat.aj_();
        }
        friendI.read = r6.read;
        DetectionSettings detectionSettings = new DetectionSettings(friendI, str);
        if (friendI.RatingCompat == null) {
            z = false;
        }
        if (z) {
            detectionSettings.IconCompatParcelizer(friendI.RatingCompat);
        }
        friendI.MediaBrowserCompat$CustomActionResultReceiver(0);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

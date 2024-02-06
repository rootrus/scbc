package p040o;

import p040o.Image;

/* renamed from: o.getMaxFillFraction */
public final /* synthetic */ class getMaxFillFraction implements FundFactSheetActivity {
    private final /* synthetic */ Image.FriendI read;

    public /* synthetic */ getMaxFillFraction(Image.FriendI friendI) {
        this.read = friendI;
    }

    public final Object invoke(Object obj) {
        Image.FriendI friendI = this.read;
        getCenterPoint getcenterpoint = new getCenterPoint(friendI, (Throwable) obj);
        if (friendI.RatingCompat != null) {
            getcenterpoint.IconCompatParcelizer(friendI.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

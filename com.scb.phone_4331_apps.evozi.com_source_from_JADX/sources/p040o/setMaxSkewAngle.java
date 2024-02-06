package p040o;

import p040o.Image;

/* renamed from: o.setMaxSkewAngle */
public final /* synthetic */ class setMaxSkewAngle implements FundFactSheetActivity {
    private final /* synthetic */ Image.FriendI read;

    public /* synthetic */ setMaxSkewAngle(Image.FriendI friendI) {
        this.read = friendI;
    }

    public final Object invoke(Object obj) {
        Image.FriendI friendI = this.read;
        boolean z = true;
        if (friendI.RatingCompat != null) {
            friendI.RatingCompat.aj_();
        }
        imageWriteToFile imagewritetofile = imageWriteToFile.read;
        if (friendI.RatingCompat == null) {
            z = false;
        }
        if (z) {
            imagewritetofile.IconCompatParcelizer(friendI.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

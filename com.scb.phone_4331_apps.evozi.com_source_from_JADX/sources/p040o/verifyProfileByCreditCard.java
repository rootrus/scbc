package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.easycash.loaninformation.EasycashFeaturesCardInformationFragment;
import p040o.Image;

/* renamed from: o.verifyProfileByCreditCard */
public final /* synthetic */ class verifyProfileByCreditCard implements DialogInterface.OnClickListener {
    private final /* synthetic */ EasycashFeaturesCardInformationFragment write;

    public /* synthetic */ verifyProfileByCreditCard(EasycashFeaturesCardInformationFragment easycashFeaturesCardInformationFragment) {
        this.write = easycashFeaturesCardInformationFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EasycashFeaturesCardInformationFragment easycashFeaturesCardInformationFragment = this.write;
        Image.FriendI friendI = easycashFeaturesCardInformationFragment.presenter;
        getLegacySharedPrefs MediaDescriptionCompat = easycashFeaturesCardInformationFragment.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat();
        if (friendI.RatingCompat != null) {
            friendI.RatingCompat.AlertController$RecycleListView();
        }
        friendI.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new getMinFillFraction(friendI, MediaDescriptionCompat), new getTargetFramePaddingPercent(friendI), MediaDescriptionCompat.MediaDescriptionCompat, "REFERRAL_UNSECURED");
        dialogInterface.dismiss();
    }
}

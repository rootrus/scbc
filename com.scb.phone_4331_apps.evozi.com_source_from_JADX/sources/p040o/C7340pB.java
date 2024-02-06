package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.easycash.EasycashNCBConsentActivity;
import p040o.Image;

/* renamed from: o.pB */
public final /* synthetic */ class C7340pB implements DialogInterface.OnClickListener {
    private final /* synthetic */ EasycashNCBConsentActivity read;

    public /* synthetic */ C7340pB(EasycashNCBConsentActivity easycashNCBConsentActivity) {
        this.read = easycashNCBConsentActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        getBitsPerChannel getbitsperchannel = this.read.presenter;
        boolean z = true;
        getbitsperchannel.MediaBrowserCompat$ItemReceiver = true;
        Image.ImageFileRep imageFileRep = Image.ImageFileRep.MediaBrowserCompat$CustomActionResultReceiver;
        if (getbitsperchannel.RatingCompat == null) {
            z = false;
        }
        if (z) {
            imageFileRep.IconCompatParcelizer(getbitsperchannel.RatingCompat);
        }
        dialogInterface.dismiss();
    }
}

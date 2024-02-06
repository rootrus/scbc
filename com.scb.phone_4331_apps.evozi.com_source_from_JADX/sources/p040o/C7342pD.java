package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.easycash.EasycashNCBConsentActivity;
import p040o.Image;

/* renamed from: o.pD */
public final /* synthetic */ class C7342pD implements DialogInterface.OnClickListener {
    private final /* synthetic */ EasycashNCBConsentActivity MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C7342pD(EasycashNCBConsentActivity easycashNCBConsentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = easycashNCBConsentActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        getBitsPerChannel getbitsperchannel = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
        boolean z = false;
        getbitsperchannel.MediaBrowserCompat$ItemReceiver = false;
        Image.ImageFileRep imageFileRep = Image.ImageFileRep.MediaBrowserCompat$CustomActionResultReceiver;
        if (getbitsperchannel.RatingCompat != null) {
            z = true;
        }
        if (z) {
            imageFileRep.IconCompatParcelizer(getbitsperchannel.RatingCompat);
        }
        dialogInterface.dismiss();
    }
}

package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.debitcard.DebitCardRequestInputFragment;

/* renamed from: o.EasycashMHMCDetailService */
public final /* synthetic */ class EasycashMHMCDetailService implements DialogInterface.OnClickListener {
    private final /* synthetic */ DebitCardRequestInputFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ EasycashMHMCDetailService(DebitCardRequestInputFragment debitCardRequestInputFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardRequestInputFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        nativeConfigure nativeconfigure = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
        nativeconfigure.MediaMetadataCompat.write.write(nativeconfigure.MediaDescriptionCompat);
        nativeGetConfidence nativegetconfidence = nativeGetConfidence.write;
        if (nativeconfigure.RatingCompat != null) {
            nativegetconfidence.IconCompatParcelizer(nativeconfigure.RatingCompat);
        }
    }
}

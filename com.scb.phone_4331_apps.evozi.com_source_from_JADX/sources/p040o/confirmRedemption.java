package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.cardmanagement.deejungtransfer.DeejungTransferLandingBottomFragment;

/* renamed from: o.confirmRedemption */
public final /* synthetic */ class confirmRedemption implements DialogInterface.OnClickListener {
    private final /* synthetic */ constrainedMultiset MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ DeejungTransferLandingBottomFragment read;

    public /* synthetic */ confirmRedemption(DeejungTransferLandingBottomFragment deejungTransferLandingBottomFragment, constrainedMultiset constrainedmultiset) {
        this.read = deejungTransferLandingBottomFragment;
        this.MediaBrowserCompat$ItemReceiver = constrainedmultiset;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DeejungTransferLandingBottomFragment deejungTransferLandingBottomFragment = this.read;
        String str = null;
        boolean z = false;
        if (this.MediaBrowserCompat$ItemReceiver == constrainedMultiset.MIN_OR_FULL_NEWTENOR) {
            KotlinDetector kotlinDetector = deejungTransferLandingBottomFragment.presenter;
            String str2 = deejungTransferLandingBottomFragment.MediaBrowserCompat$MediaItem;
            getAddress6 getaddress6 = deejungTransferLandingBottomFragment.MediaBrowserCompat$CustomActionResultReceiver;
            if (!(getaddress6 == null || getaddress6.MediaBrowserCompat$ItemReceiver() == null)) {
                z = true;
            }
            if (z) {
                str = deejungTransferLandingBottomFragment.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver().MediaSessionCompat$Token;
            }
            kotlinDetector.MediaBrowserCompat$ItemReceiver(str2, str, deejungTransferLandingBottomFragment.IconCompatParcelizer.MediaDescriptionCompat, true);
            return;
        }
        KotlinDetector kotlinDetector2 = deejungTransferLandingBottomFragment.presenter;
        normalize normalize = deejungTransferLandingBottomFragment.MediaDescriptionCompat;
        String str3 = deejungTransferLandingBottomFragment.MediaBrowserCompat$MediaItem;
        getAddress6 getaddress62 = deejungTransferLandingBottomFragment.MediaBrowserCompat$CustomActionResultReceiver;
        if (!(getaddress62 == null || getaddress62.MediaBrowserCompat$ItemReceiver() == null)) {
            z = true;
        }
        if (z) {
            str = deejungTransferLandingBottomFragment.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver().MediaSessionCompat$Token;
        }
        kotlinDetector2.IconCompatParcelizer(normalize, str3, str, deejungTransferLandingBottomFragment.IconCompatParcelizer.MediaDescriptionCompat, true);
    }
}

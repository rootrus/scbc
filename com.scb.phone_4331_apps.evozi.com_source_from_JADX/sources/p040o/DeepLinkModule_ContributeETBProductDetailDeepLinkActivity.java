package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.ebillsubscription.EBillSubscriptionDetailFragment;
import p040o.ImagePerfectionProfile;

/* renamed from: o.DeepLinkModule_ContributeETBProductDetailDeepLinkActivity */
public final /* synthetic */ class DeepLinkModule_ContributeETBProductDetailDeepLinkActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ EBillSubscriptionDetailFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ DeepLinkModule_ContributeETBProductDetailDeepLinkActivity(EBillSubscriptionDetailFragment eBillSubscriptionDetailFragment) {
        this.MediaBrowserCompat$ItemReceiver = eBillSubscriptionDetailFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EBillSubscriptionDetailFragment eBillSubscriptionDetailFragment = this.MediaBrowserCompat$ItemReceiver;
        ImagePerfectionProfile.UseTargetFrameCrop useTargetFrameCrop = eBillSubscriptionDetailFragment.EBillSubscriptionDetailPresenter;
        access$1600 access_1600 = eBillSubscriptionDetailFragment.IconCompatParcelizer;
        if (!useTargetFrameCrop.write) {
            boolean z = true;
            useTargetFrameCrop.write = true;
            if (useTargetFrameCrop.RatingCompat == null) {
                z = false;
            }
            if (z) {
                useTargetFrameCrop.RatingCompat.AlertController$RecycleListView();
            }
            recordExpirationTime write = recordExpirationTime.write();
            write.IconCompatParcelizer = access_1600.IconCompatParcelizer;
            write.read = access_1600.PlaybackStateCompat;
            write.write = access_1600.PlaybackStateCompat$CustomAction;
            write.MediaMetadataCompat = access_1600.Keep;
            write.MediaBrowserCompat$ItemReceiver = access_1600.MediaBrowserCompat$MediaItem;
            write.MediaBrowserCompat$CustomActionResultReceiver = access_1600.MediaMetadataCompat;
            useTargetFrameCrop.IconCompatParcelizer.read(write);
            useTargetFrameCrop.IconCompatParcelizer.IconCompatParcelizer(new C9765x8112e4b2(useTargetFrameCrop, (byte) 0));
        }
    }
}

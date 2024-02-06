package p040o;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.activity.cardmanagement.deejungtransfer.DeejungTermsAndConditionsActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.cardmanagement.deejungtransfer.DeejungTransferMinFullReviewFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;

/* renamed from: o.getCardRefFromDeepLinkId */
public final /* synthetic */ class getCardRefFromDeepLinkId implements BaseFragment.write {
    private final /* synthetic */ DeejungTransferMinFullReviewFragment write;

    public /* synthetic */ getCardRefFromDeepLinkId(DeejungTransferMinFullReviewFragment deejungTransferMinFullReviewFragment) {
        this.write = deejungTransferMinFullReviewFragment;
    }

    public final void MediaBrowserCompat$ItemReceiver(Context context) {
        String str;
        DeejungTransferMinFullReviewFragment deejungTransferMinFullReviewFragment = this.write;
        deserializeToDate deserializetodate = deejungTransferMinFullReviewFragment.presenter;
        if (deejungTransferMinFullReviewFragment.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat.endsWith("SPD")) {
            toLongArray tolongarray = deserializetodate.read;
            String MediaBrowserCompat$CustomActionResultReceiver = AbstractMultimap.MediaBrowserCompat$CustomActionResultReceiver("SPEEDY_CASH", (String) null);
            onGetStartedClick.write((Object) MediaBrowserCompat$CustomActionResultReceiver, "path");
            str = getICheckDeserializerRtti.read(MediaBrowserCompat$CustomActionResultReceiver, tolongarray.read);
            onGetStartedClick.IconCompatParcelizer((Object) str, "Utilities.transformAssetUrl(path, baseStaticURL)");
        } else {
            toLongArray tolongarray2 = deserializetodate.read;
            String MediaBrowserCompat$CustomActionResultReceiver2 = AbstractMultimap.MediaBrowserCompat$CustomActionResultReceiver("DEEJUNG_TRANSFER", (String) null);
            onGetStartedClick.write((Object) MediaBrowserCompat$CustomActionResultReceiver2, "path");
            str = getICheckDeserializerRtti.read(MediaBrowserCompat$CustomActionResultReceiver2, tolongarray2.read);
            onGetStartedClick.IconCompatParcelizer((Object) str, "Utilities.transformAssetUrl(path, baseStaticURL)");
        }
        Intent IconCompatParcelizer = DeejungTermsAndConditionsActivity.IconCompatParcelizer(context, str);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        DeejungTransferMinFullReviewFragment.write(deejungTransferMinFullReviewFragment, IconCompatParcelizer);
    }
}

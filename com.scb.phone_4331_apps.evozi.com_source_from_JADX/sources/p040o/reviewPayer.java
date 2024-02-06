package p040o;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.activity.cardmanagement.deejungtransfer.DeejungTermsAndConditionsActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.cardmanagement.deejungtransfer.DeejungTransferInstallmentReviewBottomFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;

/* renamed from: o.reviewPayer */
public final /* synthetic */ class reviewPayer implements BaseFragment.write {
    private final /* synthetic */ DeejungTransferInstallmentReviewBottomFragment IconCompatParcelizer;

    public /* synthetic */ reviewPayer(DeejungTransferInstallmentReviewBottomFragment deejungTransferInstallmentReviewBottomFragment) {
        this.IconCompatParcelizer = deejungTransferInstallmentReviewBottomFragment;
    }

    public final void MediaBrowserCompat$ItemReceiver(Context context) {
        String str;
        DeejungTransferInstallmentReviewBottomFragment deejungTransferInstallmentReviewBottomFragment = this.IconCompatParcelizer;
        DefaultDateTypeAdapter defaultDateTypeAdapter = deejungTransferInstallmentReviewBottomFragment.presenter;
        if (deejungTransferInstallmentReviewBottomFragment.IconCompatParcelizer.MediaBrowserCompat$MediaItem.endsWith("SPD")) {
            toLongArray tolongarray = defaultDateTypeAdapter.read;
            String MediaBrowserCompat$CustomActionResultReceiver = AbstractMultimap.MediaBrowserCompat$CustomActionResultReceiver("SPEEDY_CASH", (String) null);
            onGetStartedClick.write((Object) MediaBrowserCompat$CustomActionResultReceiver, "path");
            str = getICheckDeserializerRtti.read(MediaBrowserCompat$CustomActionResultReceiver, tolongarray.read);
            onGetStartedClick.IconCompatParcelizer((Object) str, "Utilities.transformAssetUrl(path, baseStaticURL)");
        } else {
            toLongArray tolongarray2 = defaultDateTypeAdapter.read;
            String MediaBrowserCompat$CustomActionResultReceiver2 = AbstractMultimap.MediaBrowserCompat$CustomActionResultReceiver("DEEJUNG_TRANSFER", (String) null);
            onGetStartedClick.write((Object) MediaBrowserCompat$CustomActionResultReceiver2, "path");
            str = getICheckDeserializerRtti.read(MediaBrowserCompat$CustomActionResultReceiver2, tolongarray2.read);
            onGetStartedClick.IconCompatParcelizer((Object) str, "Utilities.transformAssetUrl(path, baseStaticURL)");
        }
        Intent IconCompatParcelizer2 = DeejungTermsAndConditionsActivity.IconCompatParcelizer(context, str);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        DeejungTransferInstallmentReviewBottomFragment.IconCompatParcelizer(deejungTransferInstallmentReviewBottomFragment, IconCompatParcelizer2);
    }
}

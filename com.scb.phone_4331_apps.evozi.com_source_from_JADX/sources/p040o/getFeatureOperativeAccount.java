package p040o;

import android.content.DialogInterface;
import android.content.Intent;
import com.scb.phone.view.activity.debitcard.reset.DebitCardResetPinActivity;
import com.scb.phone.view.fragment.debitatm.DebitCardServiceTabFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;

/* renamed from: o.getFeatureOperativeAccount */
public final /* synthetic */ class getFeatureOperativeAccount implements DialogInterface.OnClickListener {
    private final /* synthetic */ boolean read;
    private final /* synthetic */ DebitCardServiceTabFragment write;

    public /* synthetic */ getFeatureOperativeAccount(DebitCardServiceTabFragment debitCardServiceTabFragment, boolean z) {
        this.write = debitCardServiceTabFragment;
        this.read = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DebitCardServiceTabFragment debitCardServiceTabFragment = this.write;
        boolean z = this.read;
        if (debitCardServiceTabFragment.getContext() != null && debitCardServiceTabFragment.IconCompatParcelizer != null) {
            Intent read2 = DebitCardResetPinActivity.read(debitCardServiceTabFragment.getContext(), debitCardServiceTabFragment.IconCompatParcelizer.MediaBrowserCompat$MediaItem, z);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            DebitCardServiceTabFragment.MediaBrowserCompat$ItemReceiver(debitCardServiceTabFragment, read2);
        }
    }
}

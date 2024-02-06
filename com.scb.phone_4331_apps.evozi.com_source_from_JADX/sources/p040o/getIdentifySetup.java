package p040o;

import android.text.TextUtils;
import com.scb.phone.view.fragment.easycash.BaseEasycashReferralSendFragment;
import p040o.PhenotypeFlag;

/* renamed from: o.getIdentifySetup */
public final /* synthetic */ class getIdentifySetup implements getActivateChequeVerification {
    private final /* synthetic */ BaseEasycashReferralSendFragment read;

    public /* synthetic */ getIdentifySetup(BaseEasycashReferralSendFragment baseEasycashReferralSendFragment) {
        this.read = baseEasycashReferralSendFragment;
    }

    public final boolean IconCompatParcelizer(String str) {
        boolean z;
        ICheckDetector iCheckDetector = this.read.MediaBrowserCompat$CustomActionResultReceiver;
        iCheckDetector.write = str;
        boolean z2 = false;
        if (!TextUtils.isEmpty(str)) {
            PhenotypeFlag.zza zza = iCheckDetector.MediaMetadataCompat;
            if (str == null) {
                z = false;
            } else {
                z = zza.IconCompatParcelizer.matcher(str).matches();
            }
            if (z) {
                z2 = true;
            }
        }
        iCheckDetector.read = z2;
        return z2;
    }
}

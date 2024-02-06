package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.scb.phone.view.fragment.prepaid.traveltab.C6126x44f05478;

/* renamed from: o.findPublicSuffix */
public final class findPublicSuffix extends constrainedSetMultimap<C6126x44f05478, parseDevice> {
    public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
        String str = ((C6126x44f05478) obj).MediaBrowserCompat$CustomActionResultReceiver;
        if (((str.hashCode() != -724272124 || !str.equals("QR_PURCHASE_MC_SOURCE")) ? (char) 65535 : 0) != 0) {
            return new parseDevice("QR_PURCHASE_VISA_SOURCE");
        }
        return new parseDevice("QR_PURCHASE_MC_SOURCE");
    }

    @HmlPinActivity
    public findPublicSuffix(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }
}

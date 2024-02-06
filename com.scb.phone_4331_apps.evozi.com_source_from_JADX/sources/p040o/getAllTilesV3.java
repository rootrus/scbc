package p040o;

import android.net.Uri;
import com.scb.phone.view.fragment.closeaccount.CloseAccountSuccessFragment;
import p040o.JsonTreeWriter;

/* renamed from: o.getAllTilesV3 */
public final /* synthetic */ class getAllTilesV3 implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ CloseAccountSuccessFragment IconCompatParcelizer;
    private final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getAllTilesV3(CloseAccountSuccessFragment closeAccountSuccessFragment, boolean z) {
        this.IconCompatParcelizer = closeAccountSuccessFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        CloseAccountSuccessFragment closeAccountSuccessFragment = this.IconCompatParcelizer;
        boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
        newFactory newfactory = closeAccountSuccessFragment.presenter;
        String obj2 = ((Uri) obj).toString();
        boolean z2 = true;
        if (z) {
            locationString locationstring = new locationString(obj2);
            if (newfactory.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                locationstring.IconCompatParcelizer(newfactory.RatingCompat);
                return;
            }
            return;
        }
        JsonTreeWriter.C35581 r5 = JsonTreeWriter.C35581.read;
        if (newfactory.RatingCompat == null) {
            z2 = false;
        }
        if (z2) {
            r5.IconCompatParcelizer(newfactory.RatingCompat);
        }
    }
}

package p040o;

import android.util.Log;
import com.scb.phone.view.fragment.closeaccount.CloseAccountSuccessFragment;

/* renamed from: o.getStaticTilesV9 */
public final /* synthetic */ class getStaticTilesV9 implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ CloseAccountSuccessFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getStaticTilesV9(CloseAccountSuccessFragment closeAccountSuccessFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = closeAccountSuccessFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        newFactory newfactory = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
        Log.e("CloseAcctSuccessPres", "onSaveScreenshotError: ", (Throwable) obj);
        ObjectTypeAdapter objectTypeAdapter = ObjectTypeAdapter.read;
        if (newfactory.RatingCompat != null) {
            objectTypeAdapter.IconCompatParcelizer(newfactory.RatingCompat);
        }
    }
}

package p040o;

import com.scb.phone.view.fragment.transferandpay.AnyTransferHistoryFragment;
import java.util.ArrayList;
import java.util.List;
import p040o.newListMultimap;
import p040o.zzdy;

/* renamed from: o.getWrappedCursor */
public final /* synthetic */ class getWrappedCursor implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ AnyTransferHistoryFragment.IconCompatParcelizer read;

    public /* synthetic */ getWrappedCursor(AnyTransferHistoryFragment.IconCompatParcelizer iconCompatParcelizer) {
        this.read = iconCompatParcelizer;
    }

    public final Object write(Object obj) {
        List list;
        parseLayers parselayers = (parseLayers) obj;
        isUidGoogleSigned isuidgooglesigned = this.read.read;
        List<zzdy.zze> MediaBrowserCompat$CustomActionResultReceiver = isuidgooglesigned.MediaBrowserCompat$CustomActionResultReceiver(parselayers);
        if (parselayers == null || parselayers.MediaBrowserCompat$CustomActionResultReceiver == null || !"1000".equalsIgnoreCase(parselayers.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.read) || parselayers.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver == null || parselayers.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
            list = new ArrayList();
        } else {
            list = isuidgooglesigned.MediaBrowserCompat$CustomActionResultReceiver(parselayers.MediaBrowserCompat$CustomActionResultReceiver);
        }
        return DebitCardResetOtpActivity.just(new newListMultimap.write(MediaBrowserCompat$CustomActionResultReceiver, list));
    }
}

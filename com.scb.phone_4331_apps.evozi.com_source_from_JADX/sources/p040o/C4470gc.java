package p040o;

import com.scb.phone.view.activity.transferandpay.PullSlipActivity$MediaBrowserCompat$ItemReceiver;
import java.util.List;

/* renamed from: o.gc */
public final /* synthetic */ class C4470gc implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ C4746he read;

    public /* synthetic */ C4470gc(C4746he heVar, String str) {
        this.read = heVar;
        this.IconCompatParcelizer = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4746he heVar = this.read;
        String str = this.IconCompatParcelizer;
        heVar.write = heVar.MediaMetadataCompat.IconCompatParcelizer((PullSlipActivity$MediaBrowserCompat$ItemReceiver) obj);
        List<setSimulator> list = heVar.MediaBrowserCompat$MediaItem.get(str);
        List<setSimulator> list2 = heVar.write.MediaBrowserCompat$CustomActionResultReceiver;
        if (list2 != null && !list2.isEmpty()) {
            list.addAll(list2);
            heVar.MediaBrowserCompat$MediaItem.put(str, list);
        }
        heVar.write.MediaBrowserCompat$CustomActionResultReceiver = list;
        if (heVar.MediaBrowserCompat$ItemReceiver.RatingCompat.equals(str)) {
            C4702gg ggVar = new C4702gg(heVar);
            if (heVar.RatingCompat != null) {
                ggVar.IconCompatParcelizer(heVar.RatingCompat);
            }
        }
    }
}

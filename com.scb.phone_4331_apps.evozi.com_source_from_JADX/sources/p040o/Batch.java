package p040o;

import com.scb.phone.view.activity.partner.PartnerDiscoverWebViewActivity;
import java.util.ArrayList;
import p040o.LinkedHashTreeMap;

/* renamed from: o.Batch */
public final class Batch implements OPRStatusRewardsLandingActivity_ViewBinding<BatchResultToken> {
    private static final Batch MediaBrowserCompat$ItemReceiver = new Batch();

    public static Batch MediaBrowserCompat$ItemReceiver() {
        return MediaBrowserCompat$ItemReceiver;
    }

    public final /* synthetic */ Object get() {
        return new BatchResultToken();
    }

    /* renamed from: o.Batch$Builder */
    public final class Builder extends FragmentBuilder_BindSummaryFragment {
        public static PartnerDiscoverWebViewActivity.write MediaBrowserCompat$ItemReceiver(LinkedHashTreeMap.Node node) {
            String str;
            int i = node.MediaBrowserCompat$MediaItem;
            ArrayList arrayList = new ArrayList();
            if (i <= 0 || node.RatingCompat == null || node.RatingCompat.size() <= 0) {
                str = "";
            } else {
                str = node.RatingCompat.get(0).MediaBrowserCompat$ItemReceiver;
                for (LinkedHashTreeMap.Node next : node.RatingCompat) {
                    String str2 = next.MediaBrowserCompat$ItemReceiver;
                    String str3 = next.MediaMetadataCompat;
                    String str4 = next.MediaDescriptionCompat;
                    String str5 = next.write;
                    String str6 = next.read;
                    String str7 = next.MediaBrowserCompat$SearchResultReceiver;
                    String str8 = next.MediaBrowserCompat$CustomActionResultReceiver;
                    String str9 = next.IconCompatParcelizer;
                    new ArrayList();
                    arrayList.add(new PartnerDiscoverWebViewActivity.write(str2, str3, str4, str5, str6, str7, str8, str9));
                }
            }
            return new PartnerDiscoverWebViewActivity.write(str, node.MediaMetadataCompat, node.MediaDescriptionCompat, node.write, node.read, node.MediaBrowserCompat$SearchResultReceiver, node.MediaBrowserCompat$CustomActionResultReceiver, node.IconCompatParcelizer);
        }
    }
}

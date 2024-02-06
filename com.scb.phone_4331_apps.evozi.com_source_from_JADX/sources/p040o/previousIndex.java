package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import okhttp3.internal.cache.DiskLruCache;
import p040o.zzca;

/* renamed from: o.previousIndex */
public final /* synthetic */ class previousIndex implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ setFilterByAuthorizedAccounts MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ previousIndex(setFilterByAuthorizedAccounts setfilterbyauthorizedaccounts) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setfilterbyauthorizedaccounts;
    }

    public final Object write(Object obj) {
        ContentGroup contentGroup = (ContentGroup) ((SingleDataEntity) obj).getData();
        if (contentGroup == null) {
            return null;
        }
        boolean equals = DiskLruCache.VERSION_1.equals(contentGroup.write);
        String str = contentGroup.read;
        String str2 = contentGroup.IconCompatParcelizer;
        String str3 = contentGroup.MediaBrowserCompat$ItemReceiver;
        double d = 0.0d;
        double doubleValue = str3 != null ? Double.valueOf(str3).doubleValue() : 0.0d;
        String str4 = contentGroup.MediaBrowserCompat$MediaItem;
        double doubleValue2 = str4 != null ? Double.valueOf(str4).doubleValue() : 0.0d;
        String str5 = contentGroup.MediaMetadataCompat;
        double doubleValue3 = str5 != null ? Double.valueOf(str5).doubleValue() : 0.0d;
        String str6 = contentGroup.MediaBrowserCompat$CustomActionResultReceiver;
        if (str6 != null) {
            d = Double.valueOf(str6).doubleValue();
        }
        return new zzca.zzd(equals, str, str2, doubleValue, doubleValue2, doubleValue3, d);
    }
}

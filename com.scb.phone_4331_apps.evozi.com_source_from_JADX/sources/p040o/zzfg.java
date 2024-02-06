package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.zztx;

/* renamed from: o.zzfg */
public final /* synthetic */ class zzfg implements DirectDebitDeepLinkActivity {
    public /* synthetic */ zzfg(zzp zzp) {
    }

    public final Object write(Object obj) {
        clearComposition clearcomposition = (clearComposition) ((SingleDataEntity) obj).getData();
        readStringList readstringlist = clearcomposition.RatingCompat == Parser.OPR ? readStringList.OPR : readStringList.NORMAL;
        zztx.zzc zzc = new zztx.zzc();
        zzc.MediaBrowserCompat$MediaItem = clearcomposition.MediaMetadataCompat;
        zzc.MediaMetadataCompat = readstringlist;
        zzc.IconCompatParcelizer = clearcomposition.MediaBrowserCompat$CustomActionResultReceiver;
        zzc.MediaBrowserCompat$ItemReceiver = clearcomposition.read;
        zzc.read = clearcomposition.write;
        zzc.MediaBrowserCompat$CustomActionResultReceiver = clearcomposition.MediaBrowserCompat$ItemReceiver;
        zzc.MediaBrowserCompat$SearchResultReceiver = clearcomposition.MediaBrowserCompat$MediaItem;
        zzc.write = clearcomposition.IconCompatParcelizer;
        return zzc;
    }
}

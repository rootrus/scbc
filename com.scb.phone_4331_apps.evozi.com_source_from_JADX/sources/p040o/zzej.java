package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: o.zzej */
public final /* synthetic */ class zzej implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zzej MediaBrowserCompat$ItemReceiver = new zzej();

    private /* synthetic */ zzej() {
    }

    public final Object write(Object obj) {
        return (LottieFrameInfo) ((SingleDataEntity) obj).getData();
    }

    /* renamed from: o.zzej$zza */
    public final /* synthetic */ class zza implements DirectDebitDeepLinkActivity {
        public static final /* synthetic */ zza MediaBrowserCompat$ItemReceiver = new zza();

        private /* synthetic */ zza() {
        }

        public final Object write(Object obj) {
            isReversed isreversed = (isReversed) ((SingleDataEntity) obj).getData();
            onGetStartedClick.write((Object) isreversed, "entity");
            boolean MediaBrowserCompat$ItemReceiver2 = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) isreversed.write, (Object) DiskLruCache.VERSION_1);
            List<getColors> list = isreversed.MediaBrowserCompat$CustomActionResultReceiver;
            List arrayList = new ArrayList();
            if (list != null) {
                for (getColors next : list) {
                    arrayList.add(new FusedLocationProviderApi(next.MediaBrowserCompat$ItemReceiver, next.MediaBrowserCompat$CustomActionResultReceiver, next.read, onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) next.write, (Object) DiskLruCache.VERSION_1)));
                }
            }
            return new DetectedActivity(MediaBrowserCompat$ItemReceiver2, arrayList);
        }
    }
}

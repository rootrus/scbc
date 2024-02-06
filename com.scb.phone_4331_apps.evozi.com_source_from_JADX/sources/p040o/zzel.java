package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.List;

/* renamed from: o.zzel */
public final /* synthetic */ class zzel implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zzel MediaBrowserCompat$CustomActionResultReceiver = new zzel();

    private /* synthetic */ zzel() {
    }

    public final Object write(Object obj) {
        return (List) ((SingleDataEntity) obj).getData();
    }

    /* renamed from: o.zzel$zza */
    public final /* synthetic */ class zza implements DirectDebitDeepLinkActivity {
        private final /* synthetic */ zzjv MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ zza(zzjv zzjv) {
            this.MediaBrowserCompat$ItemReceiver = zzjv;
        }

        public final Object write(Object obj) {
            return this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat.read((List) obj);
        }
    }
}

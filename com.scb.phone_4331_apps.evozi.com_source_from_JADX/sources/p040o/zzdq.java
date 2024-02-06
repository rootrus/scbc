package p040o;

import java.util.List;
import p040o.zzev;

/* renamed from: o.zzdq */
public final /* synthetic */ class zzdq implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ getLooper read;

    public /* synthetic */ zzdq(getLooper getlooper) {
        this.read = getlooper;
    }

    public final Object write(Object obj) {
        return this.read.MediaBrowserCompat$ItemReceiver((setCurrentItemInternal) obj);
    }

    /* renamed from: o.zzdq$zza */
    public final class zza {
        public List<zzev.zzb> MediaBrowserCompat$ItemReceiver;

        /* renamed from: o.zzdq$zza$write */
        public static final class write {
            public List<zzev.zzb> read;
        }

        public /* synthetic */ zza(write write2, byte b) {
            this(write2);
        }

        private zza(write write2) {
            this.MediaBrowserCompat$ItemReceiver = write2.read;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza = (zza) obj;
            List<zzev.zzb> list = this.MediaBrowserCompat$ItemReceiver;
            if (list != null) {
                return list.equals(zza.MediaBrowserCompat$ItemReceiver);
            }
            if (zza.MediaBrowserCompat$ItemReceiver != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            List<zzev.zzb> list = this.MediaBrowserCompat$ItemReceiver;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }
    }
}

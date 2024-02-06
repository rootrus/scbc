package p040o;

import java.util.List;
import p040o.zztx;

/* renamed from: o.zzl */
public final class zzl extends FragmentBuilder_BindSummaryFragment {

    /* renamed from: o.zzl$zzb */
    public final class zzb {
        public final List<PlacePhotoMetadataResult> MediaBrowserCompat$CustomActionResultReceiver;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof zzb) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((zzb) obj).MediaBrowserCompat$CustomActionResultReceiver);
            }
            return true;
        }

        public final int hashCode() {
            List<PlacePhotoMetadataResult> list = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ETBNoActiveCASA(staticTileList=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public zzb(List<? extends PlacePhotoMetadataResult> list) {
            onGetStartedClick.write((Object) list, "staticTileList");
            this.MediaBrowserCompat$CustomActionResultReceiver = list;
        }
    }

    public static zztx.zza MediaBrowserCompat$CustomActionResultReceiver(enableOrDisableHardwareLayer enableordisablehardwarelayer) {
        onGetStartedClick.write((Object) enableordisablehardwarelayer, "entity");
        return new zztx.zza(enableordisablehardwarelayer.MediaBrowserCompat$CustomActionResultReceiver, enableordisablehardwarelayer.write, enableordisablehardwarelayer.MediaBrowserCompat$ItemReceiver, enableordisablehardwarelayer.IconCompatParcelizer);
    }
}

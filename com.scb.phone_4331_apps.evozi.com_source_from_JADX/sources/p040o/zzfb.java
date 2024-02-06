package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.DiscoverFundPerformanceActivity;
import p040o.HmlMoaActivity;
import p040o.zzcb;

/* renamed from: o.zzfb */
public final /* synthetic */ class zzfb implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ setAppOptOut write;

    public /* synthetic */ zzfb(setAppOptOut setappoptout) {
        this.write = setappoptout;
    }

    /* renamed from: o.zzfb$zza */
    public final class zza {
        public final List<C6960x24be0e72> read;
        public final List<zzcb.zzh.zzb> write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza = (zza) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write);
        }

        public final int hashCode() {
            List<C6960x24be0e72> list = this.read;
            int i = 0;
            int hashCode = list != null ? list.hashCode() : 0;
            List<zzcb.zzh.zzb> list2 = this.write;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EasycashFeatureOperativeAccount(display=");
            sb.append(this.read);
            sb.append(", referenceAccounts=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public zza(List<? extends C6960x24be0e72> list, List<zzcb.zzh.zzb> list2) {
            onGetStartedClick.write((Object) list, "display");
            onGetStartedClick.write((Object) list2, "referenceAccounts");
            this.read = list;
            this.write = list2;
        }
    }

    public final Object write(Object obj) {
        List list;
        BindView bindView = (BindView) obj;
        onGetStartedClick.write((Object) bindView, "entity");
        List<BindAnim> list2 = bindView.IconCompatParcelizer;
        if (list2 != null) {
            Iterable<BindAnim> iterable = list2;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (BindAnim bindAnim : iterable) {
                arrayList.add(new HmlMoaActivity.write.C10783write(bindAnim.MediaBrowserCompat$ItemReceiver, bindAnim.write, bindAnim.read, bindAnim.IconCompatParcelizer, bindAnim.MediaMetadataCompat, bindAnim.MediaDescriptionCompat, bindAnim.MediaBrowserCompat$CustomActionResultReceiver));
            }
            list = (List) arrayList;
        } else {
            list = HmlNationalIdActivity.IconCompatParcelizer;
        }
        return new DiscoverFundPerformanceActivity.read(list);
    }
}

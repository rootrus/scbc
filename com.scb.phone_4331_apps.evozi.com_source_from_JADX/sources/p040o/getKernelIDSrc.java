package p040o;

import java.util.List;
import p040o.zzxc;

/* renamed from: o.getKernelIDSrc */
public final class getKernelIDSrc {
    public List<zzxc.zzb> write;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof getKernelIDSrc) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((getKernelIDSrc) obj).write);
        }
        return true;
    }

    public final int hashCode() {
        List<zzxc.zzb> list = this.write;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BankingAgentsCache(agents=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    private getKernelIDSrc(List<zzxc.zzb> list) {
        onGetStartedClick.write((Object) list, "agents");
        this.write = list;
    }

    @HmlPinActivity
    public getKernelIDSrc() {
        this(HmlNationalIdActivity.IconCompatParcelizer);
    }
}

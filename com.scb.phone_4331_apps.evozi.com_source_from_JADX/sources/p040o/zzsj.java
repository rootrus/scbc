package p040o;

import java.util.List;

/* renamed from: o.zzsj */
public class zzsj extends zzuk {
    public List<zzvo> MediaBrowserCompat$CustomActionResultReceiver;
    public zzvm MediaBrowserCompat$ItemReceiver;
    public boolean read;
    public Double write;

    public static zzsj MediaBrowserCompat$ItemReceiver() {
        return new zzsj();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzsj zzsj = (zzsj) obj;
        if (this.read != zzsj.read) {
            return false;
        }
        Double d = this.write;
        if (d == null ? zzsj.write != null : !d.equals(zzsj.write)) {
            return false;
        }
        List<zzvo> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list == null ? zzsj.MediaBrowserCompat$CustomActionResultReceiver != null : !list.equals(zzsj.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        zzvm zzvm = this.MediaBrowserCompat$ItemReceiver;
        zzvm zzvm2 = zzsj.MediaBrowserCompat$ItemReceiver;
        if (zzvm != null) {
            return zzvm.equals(zzvm2);
        }
        if (zzvm2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Double d = this.write;
        int i = 0;
        int hashCode = d != null ? d.hashCode() : 0;
        List<zzvo> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = list != null ? list.hashCode() : 0;
        zzvm zzvm = this.MediaBrowserCompat$ItemReceiver;
        if (zzvm != null) {
            i = zzvm.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + i) * 31) + (this.read ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DepositSummaryList{grandTotalSummary=");
        sb.append(this.write);
        sb.append(", mDepositSummaryList=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", ad=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", isTotalFromAllAccounts=");
        sb.append(this.read);
        sb.append('}');
        return sb.toString();
    }
}

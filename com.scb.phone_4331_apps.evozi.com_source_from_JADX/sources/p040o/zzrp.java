package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.zzrp */
public final class zzrp {
    @SerializedName("errorCount")
    public Integer MediaBrowserCompat$ItemReceiver;
    @SerializedName("isDelayOn")
    public Boolean read;
    @SerializedName("errorDateTime")
    public Long write;

    public zzrp() {
        this((Boolean) null, (Integer) null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzrp)) {
            return false;
        }
        zzrp zzrp = (zzrp) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzrp.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzrp.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzrp.write);
    }

    public final int hashCode() {
        Boolean bool = this.read;
        int i = 0;
        int hashCode = bool != null ? bool.hashCode() : 0;
        Integer num = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = num != null ? num.hashCode() : 0;
        Long l = this.write;
        if (l != null) {
            i = l.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DelayLoading(isDelayOn=");
        sb.append(this.read);
        sb.append(", errorCount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", errorDateTime=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    private zzrp(Boolean bool, Integer num, Long l) {
        this.read = bool;
        this.MediaBrowserCompat$ItemReceiver = num;
        this.write = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzrp(Boolean bool, Integer num, int i) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? 0 : num, (Long) null);
    }
}

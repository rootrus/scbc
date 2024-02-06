package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.zzwm */
public final class zzwm {
    @SerializedName("maxDelay")
    public Integer MediaBrowserCompat$ItemReceiver;
    @SerializedName("resetDuration")
    public Integer read;
    @SerializedName("isUseDelay")
    public Boolean write;

    public /* synthetic */ zzwm() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwm)) {
            return false;
        }
        zzwm zzwm = (zzwm) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzwm.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzwm.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzwm.write);
    }

    public final int hashCode() {
        Integer num = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = num != null ? num.hashCode() : 0;
        Integer num2 = this.read;
        int hashCode2 = num2 != null ? num2.hashCode() : 0;
        Boolean bool = this.write;
        if (bool != null) {
            i = bool.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AppConfigImproveLoading(maxDelay=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", resetDuration=");
        sb.append(this.read);
        sb.append(", isUseDelay=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public zzwm(Integer num, Integer num2, Boolean bool) {
        this.MediaBrowserCompat$ItemReceiver = num;
        this.read = num2;
        this.write = bool;
    }
}

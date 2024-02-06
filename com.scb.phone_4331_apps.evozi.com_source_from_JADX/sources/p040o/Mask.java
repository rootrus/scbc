package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.Mask */
public final class Mask {
    @SerializedName("nickname")
    private final String IconCompatParcelizer;
    @SerializedName("accountNo")
    private final String read;
    @SerializedName("sortSequence")
    private final Integer write;

    /* renamed from: o.Mask$MaskMode */
    public class MaskMode {
        @SerializedName("sortSequence")
        public int MediaBrowserCompat$ItemReceiver;
        @SerializedName("percent")
        public double read;
        @SerializedName("assetType")
        public setOnPageChangeListener write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mask)) {
            return false;
        }
        Mask mask = (Mask) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) mask.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) mask.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) mask.IconCompatParcelizer);
    }

    public final int hashCode() {
        Integer num = this.write;
        int i = 0;
        int hashCode = num != null ? num.hashCode() : 0;
        String str = this.read;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvestmentDetailsDepositEntity(sortSequence=");
        sb.append(this.write);
        sb.append(", accountNo=");
        sb.append(this.read);
        sb.append(", nickname=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}

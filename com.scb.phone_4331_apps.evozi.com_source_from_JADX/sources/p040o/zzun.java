package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.zzun */
public final class zzun {
    @SerializedName("nickname")
    public String IconCompatParcelizer;
    @SerializedName("cardMask")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("cardRefNo")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("sortSequence")
    Integer read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzun)) {
            return false;
        }
        zzun zzun = (zzun) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzun.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzun.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzun.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzun.IconCompatParcelizer);
    }

    public final int hashCode() {
        Integer num = this.read;
        int i = 0;
        int hashCode = num != null ? num.hashCode() : 0;
        String str = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DebitAccountItem(sortSequence=");
        sb.append(this.read);
        sb.append(", cardRefNo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", cardMask=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", nickname=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public zzun(Integer num, String str, String str2, String str3) {
        this.read = num;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.IconCompatParcelizer = str3;
    }

    public zzun() {
        this(0, "", "", "");
    }
}

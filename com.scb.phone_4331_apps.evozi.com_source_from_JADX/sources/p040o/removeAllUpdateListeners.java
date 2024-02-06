package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.removeAllUpdateListeners */
public final class removeAllUpdateListeners {
    @SerializedName("image")
    public String IconCompatParcelizer;
    @SerializedName("text")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("type")
    public String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof removeAllUpdateListeners)) {
            return false;
        }
        removeAllUpdateListeners removeallupdatelisteners = (removeAllUpdateListeners) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) removeallupdatelisteners.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) removeallupdatelisteners.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) removeallupdatelisteners.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ThirdPartyFooterEntity(type=");
        sb.append(this.write);
        sb.append(", text=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", image=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    private removeAllUpdateListeners(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "type");
        onGetStartedClick.write((Object) str2, "text");
        onGetStartedClick.write((Object) str3, "image");
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.IconCompatParcelizer = str3;
    }

    public removeAllUpdateListeners() {
        this("", "", "");
    }
}

package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.AnimatableIntegerValue */
public final class AnimatableIntegerValue {
    @SerializedName("description")
    public final String IconCompatParcelizer;
    @SerializedName("code")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("isicCode")
    private final String read;
    @SerializedName("occupationGroup")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimatableIntegerValue)) {
            return false;
        }
        AnimatableIntegerValue animatableIntegerValue = (AnimatableIntegerValue) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) animatableIntegerValue.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) animatableIntegerValue.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) animatableIntegerValue.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) animatableIntegerValue.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OccupationEntity(code=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", description=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", isicCode=");
        sb.append(this.read);
        sb.append(", occupationGroup=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public AnimatableIntegerValue(String str, String str2, String str3, String str4) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
        this.write = str4;
    }
}

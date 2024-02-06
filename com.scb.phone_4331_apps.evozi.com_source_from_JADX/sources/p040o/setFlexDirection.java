package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setFlexDirection */
public final class setFlexDirection {
    @SerializedName("label")
    public final String IconCompatParcelizer;
    @SerializedName("value")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("type")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setFlexDirection)) {
            return false;
        }
        setFlexDirection setflexdirection = (setFlexDirection) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setflexdirection.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setflexdirection.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setflexdirection.write);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ItemEntity(label=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", value=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", type=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}

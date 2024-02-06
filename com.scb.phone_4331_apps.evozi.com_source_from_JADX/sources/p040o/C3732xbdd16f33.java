package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.PointKeyframeAnimation$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3732xbdd16f33 {
    @SerializedName("imageName")
    public final String IconCompatParcelizer;
    @SerializedName("documentId")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3732xbdd16f33)) {
            return false;
        }
        C3732xbdd16f33 pointKeyframeAnimation$MediaBrowserCompat$CustomActionResultReceiver = (C3732xbdd16f33) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) pointKeyframeAnimation$MediaBrowserCompat$CustomActionResultReceiver.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) pointKeyframeAnimation$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Upload(documentId=");
        sb.append(this.write);
        sb.append(", imageName=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}

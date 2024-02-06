package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.MergePathsContent$1$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3654x569b5c3d {
    @SerializedName("code")
    public final String IconCompatParcelizer;
    @SerializedName("flag")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3654x569b5c3d)) {
            return false;
        }
        C3654x569b5c3d mergePathsContent$1$MediaBrowserCompat$CustomActionResultReceiver = (C3654x569b5c3d) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) mergePathsContent$1$MediaBrowserCompat$CustomActionResultReceiver.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) mergePathsContent$1$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
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
        sb.append("PrivilegedProfession(flag=");
        sb.append(this.write);
        sb.append(", code=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}

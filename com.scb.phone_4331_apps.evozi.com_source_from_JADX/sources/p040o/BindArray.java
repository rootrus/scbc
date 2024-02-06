package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.BindArray */
public final class BindArray {
    @SerializedName("documentId")
    final String IconCompatParcelizer;
    @SerializedName("imageName")
    final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindArray)) {
            return false;
        }
        BindArray bindArray = (BindArray) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) bindArray.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) bindArray.write);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UploadEntity(documentId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", imageName=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}

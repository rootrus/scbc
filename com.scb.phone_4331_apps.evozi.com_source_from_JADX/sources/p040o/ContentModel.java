package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ContentModel */
public final class ContentModel {
    @SerializedName("maxAmount")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("minAmount")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentModel)) {
            return false;
        }
        ContentModel contentModel = (ContentModel) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) contentModel.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) contentModel.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlBusinessValidationEntity(minAmount=");
        sb.append(this.write);
        sb.append(", maxAmount=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

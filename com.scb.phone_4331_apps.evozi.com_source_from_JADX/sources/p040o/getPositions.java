package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getPositions */
public final class getPositions {
    @SerializedName("marketplaceStoreUrlAmount")
    public final ContentModel read;
    @SerializedName("marketplaceProductUrlAmount")
    public final ContentModel write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getPositions)) {
            return false;
        }
        getPositions getpositions = (getPositions) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getpositions.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getpositions.write);
    }

    public final int hashCode() {
        ContentModel contentModel = this.read;
        int i = 0;
        int hashCode = contentModel != null ? contentModel.hashCode() : 0;
        ContentModel contentModel2 = this.write;
        if (contentModel2 != null) {
            i = contentModel2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlBusinessValidationConfigEntity(marketplaceStoreUrl=");
        sb.append(this.read);
        sb.append(", marketplaceProductUrl=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}

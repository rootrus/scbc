package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.AnimatablePointValue */
public final class AnimatablePointValue {
    @SerializedName("documentCode")
    public final String IconCompatParcelizer;
    @SerializedName("documentDesc")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("sortSequence")
    public final int write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimatablePointValue)) {
            return false;
        }
        AnimatablePointValue animatablePointValue = (AnimatablePointValue) obj;
        return this.write == animatablePointValue.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) animatablePointValue.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) animatablePointValue.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        int i = this.write;
        String str = this.IconCompatParcelizer;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return (((i * 31) + hashCode) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SupportingDocumentEntity(sortSequence=");
        sb.append(this.write);
        sb.append(", documentType=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", documentDesc=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

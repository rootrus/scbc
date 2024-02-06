package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ShapeKeyframeAnimation */
public final class ShapeKeyframeAnimation {
    @SerializedName("applicationUuid")
    private final String IconCompatParcelizer;
    @SerializedName("productType")
    private final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShapeKeyframeAnimation)) {
            return false;
        }
        ShapeKeyframeAnimation shapeKeyframeAnimation = (ShapeKeyframeAnimation) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) shapeKeyframeAnimation.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) shapeKeyframeAnimation.read);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlDocumentValidationRequest(applicationUuid=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", productType=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public ShapeKeyframeAnimation(String str, String str2) {
        onGetStartedClick.write((Object) str, "applicationUuid");
        onGetStartedClick.write((Object) str2, "productType");
        this.IconCompatParcelizer = str;
        this.read = str2;
    }
}

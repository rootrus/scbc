package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.PngProcessingException */
public final class PngProcessingException extends LoopingViewPager {
    @SerializedName("cardRefNo")
    public final String IconCompatParcelizer;
    @SerializedName("productType")
    public final ImageProcessingException MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("cardMask")
    public final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PngProcessingException)) {
            return false;
        }
        PngProcessingException pngProcessingException = (PngProcessingException) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) pngProcessingException.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) pngProcessingException.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) pngProcessingException.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        ImageProcessingException imageProcessingException = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (imageProcessingException != null) {
            i = imageProcessingException.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidAccountEntity(cardRefNo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", cardMask=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", productType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

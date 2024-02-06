package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.JpegProcessingException */
public final class JpegProcessingException {
    @SerializedName("cardRefNo")
    private final String IconCompatParcelizer;
    @SerializedName("sortSequence")
    private final Integer MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("nickname")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("productType")
    private final BufferBoundsException read;
    @SerializedName("cardMask")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JpegProcessingException)) {
            return false;
        }
        JpegProcessingException jpegProcessingException = (JpegProcessingException) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) jpegProcessingException.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) jpegProcessingException.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) jpegProcessingException.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) jpegProcessingException.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) jpegProcessingException.read);
    }

    public final int hashCode() {
        Integer num = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = num != null ? num.hashCode() : 0;
        String str = this.IconCompatParcelizer;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        BufferBoundsException bufferBoundsException = this.read;
        if (bufferBoundsException != null) {
            i = bufferBoundsException.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidCardEntity(sortSequence=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", cardRefNo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", cardMask=");
        sb.append(this.write);
        sb.append(", nickname=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", productType=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}

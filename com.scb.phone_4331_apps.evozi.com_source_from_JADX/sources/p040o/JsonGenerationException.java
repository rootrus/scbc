package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.JsonGenerationException */
public final class JsonGenerationException {
    @SerializedName("cardMask")
    public final String IconCompatParcelizer;
    @SerializedName("productType")
    public final PINBlockException MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("cardType")
    public final PINBlockException MediaBrowserCompat$ItemReceiver;
    @SerializedName("cardStatus")
    private final String MediaDescriptionCompat;
    @SerializedName("sortSequence")
    public final int read;
    @SerializedName("cardRefNo")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonGenerationException)) {
            return false;
        }
        JsonGenerationException jsonGenerationException = (JsonGenerationException) obj;
        return this.read == jsonGenerationException.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) jsonGenerationException.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) jsonGenerationException.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) jsonGenerationException.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) jsonGenerationException.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) jsonGenerationException.MediaDescriptionCompat);
    }

    public final int hashCode() {
        int i = this.read;
        String str = this.write;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        PINBlockException pINBlockException = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = pINBlockException != null ? pINBlockException.hashCode() : 0;
        PINBlockException pINBlockException2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = pINBlockException2 != null ? pINBlockException2.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode4 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaDescriptionCompat;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return (((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnregisteredCardEntity(sortSequence=");
        sb.append(this.read);
        sb.append(", cardRefNo=");
        sb.append(this.write);
        sb.append(", cardType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", productType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", cardMask=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", cardStatus=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(")");
        return sb.toString();
    }
}

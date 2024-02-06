package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.SimpleLottieValueCallback */
public final class SimpleLottieValueCallback extends setCurrentItemInternal {
    @SerializedName("path")
    private final String IconCompatParcelizer;
    @SerializedName("content")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("contentSource")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleLottieValueCallback)) {
            return false;
        }
        SimpleLottieValueCallback simpleLottieValueCallback = (SimpleLottieValueCallback) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) simpleLottieValueCallback.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) simpleLottieValueCallback.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) simpleLottieValueCallback.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrivacyConsentContentEntity(contentSource=");
        sb.append(this.write);
        sb.append(", path=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", content=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final onCircleClick read() {
        onGroundOverlayClick ongroundoverlayclick = onGroundOverlayClick.STATIC_CONTENT;
        try {
            String str = this.write;
            if (str == null) {
                str = "";
            }
            ongroundoverlayclick = onGroundOverlayClick.valueOf(str);
        } catch (IllegalArgumentException unused) {
        }
        return new onCircleClick(ongroundoverlayclick, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}

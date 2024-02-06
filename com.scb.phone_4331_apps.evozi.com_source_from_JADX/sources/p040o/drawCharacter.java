package p040o;

import com.google.gson.annotations.SerializedName;
import p040o.Layer;

/* renamed from: o.drawCharacter */
public final class drawCharacter {
    @SerializedName("investmentInfo")
    public final Layer.LayerType IconCompatParcelizer;
    @SerializedName("personalInfo")
    public final drawCharacterFromFont MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drawCharacter)) {
            return false;
        }
        drawCharacter drawcharacter = (drawCharacter) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) drawcharacter.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) drawcharacter.IconCompatParcelizer);
    }

    public final int hashCode() {
        drawCharacterFromFont drawcharacterfromfont = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = drawcharacterfromfont != null ? drawcharacterfromfont.hashCode() : 0;
        Layer.LayerType layerType = this.IconCompatParcelizer;
        if (layerType != null) {
            i = layerType.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ReviewInfoEntity(personalInfo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", investmentInfo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}

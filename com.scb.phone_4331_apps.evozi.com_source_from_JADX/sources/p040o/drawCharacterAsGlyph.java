package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.drawCharacterAsGlyph */
public final class drawCharacterAsGlyph {
    @SerializedName("addressFormatted")
    public List<String> MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof drawCharacterAsGlyph) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) ((drawCharacterAsGlyph) obj).MediaBrowserCompat$ItemReceiver);
        }
        return true;
    }

    public final int hashCode() {
        List<String> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RegisteredAddressEntity(addressFormatted=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}

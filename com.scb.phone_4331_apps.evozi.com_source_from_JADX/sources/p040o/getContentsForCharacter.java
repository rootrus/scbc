package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getContentsForCharacter */
public final class getContentsForCharacter {
    @SerializedName("level")
    public final List<getTextLineWidthForGlyphs> write;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof getContentsForCharacter) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((getContentsForCharacter) obj).write);
        }
        return true;
    }

    public final int hashCode() {
        List<getTextLineWidthForGlyphs> list = this.write;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SCBSRiskLevelEntity(levels=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}

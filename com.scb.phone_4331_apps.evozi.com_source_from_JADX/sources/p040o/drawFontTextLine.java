package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.drawFontTextLine */
public final class drawFontTextLine {
    @SerializedName("stage")
    public final String write;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof drawFontTextLine) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((drawFontTextLine) obj).write);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.write;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SCBSRegistrationStageEntity(stage=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}

package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.parseInteger */
public final class parseInteger {
    @SerializedName("data")
    private final ColorParser read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof parseInteger) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((parseInteger) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        ColorParser colorParser = this.read;
        if (colorParser != null) {
            return colorParser.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LandingPopupInfoDataEntity(data=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}

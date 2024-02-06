package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.fromJson */
public final class fromJson {
    @SerializedName("billers")
    public final List<fromJsonInputStream> IconCompatParcelizer;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof fromJson) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((fromJson) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        List<fromJsonInputStream> list = this.IconCompatParcelizer;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DirectDebitBillerDataLocalizedEntity(billers=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}

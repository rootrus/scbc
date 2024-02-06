package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setMaxAngle */
public final class setMaxAngle {
    @SerializedName("listOfValue")
    public final List<String> IconCompatParcelizer;
    @SerializedName("fieldFlag")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setMaxAngle)) {
            return false;
        }
        setMaxAngle setmaxangle = (setMaxAngle) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setmaxangle.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setmaxangle.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<String> list = this.IconCompatParcelizer;
        if (list != null) {
            i = list.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FieldListEntity(fieldFlag=");
        sb.append(this.write);
        sb.append(", listOfValue=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}

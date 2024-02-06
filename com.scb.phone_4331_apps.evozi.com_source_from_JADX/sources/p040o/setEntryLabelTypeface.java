package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setEntryLabelTypeface */
public final class setEntryLabelTypeface {
    @SerializedName("length")
    public final List<String> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("fieldFlag")
    public final String read;
    @SerializedName("label")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setEntryLabelTypeface)) {
            return false;
        }
        setEntryLabelTypeface setentrylabeltypeface = (setEntryLabelTypeface) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setentrylabeltypeface.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setentrylabeltypeface.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setentrylabeltypeface.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        List<String> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FieldEntity(fieldFlag=");
        sb.append(this.read);
        sb.append(", label=");
        sb.append(this.write);
        sb.append(", length=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setRepeatCount */
public final class setRepeatCount {
    @SerializedName("cardList")
    public final List<updateBitmap> read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof setRepeatCount) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((setRepeatCount) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        List<updateBitmap> list = this.read;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DebitCardActivationEntity(cardList=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}

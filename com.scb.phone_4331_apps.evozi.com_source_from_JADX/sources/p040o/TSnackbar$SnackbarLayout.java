package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.TSnackbar$SnackbarLayout */
public final class TSnackbar$SnackbarLayout {
    @SerializedName("privacyList")
    public final List<BlankDummyActivity> IconCompatParcelizer;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TSnackbar$SnackbarLayout) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((TSnackbar$SnackbarLayout) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        List<BlankDummyActivity> list = this.IconCompatParcelizer;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrivacyListEntity(privacyList=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}

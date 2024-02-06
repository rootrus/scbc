package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.MissingLibraryException */
public final class MissingLibraryException extends setCurrentItemInternal {
    @SerializedName("loanList")
    public final List<setDescription> IconCompatParcelizer;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof MissingLibraryException) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((MissingLibraryException) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        List<setDescription> list = this.IconCompatParcelizer;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnregisteredLoanListEntity(loanList=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}

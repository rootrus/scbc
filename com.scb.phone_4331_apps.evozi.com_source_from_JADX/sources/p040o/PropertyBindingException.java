package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.PropertyBindingException */
public final class PropertyBindingException extends setCurrentItemInternal {
    @SerializedName("debitCardList")
    public final List<RuntimeJsonMappingException> MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof PropertyBindingException) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) ((PropertyBindingException) obj).MediaBrowserCompat$ItemReceiver);
        }
        return true;
    }

    public final int hashCode() {
        List<RuntimeJsonMappingException> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnregisteredDebitListEntity(debitCardList=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}

package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.Comparator;
import java.util.List;

/* renamed from: o.Action */
public final class Action {
    @SerializedName("totalMaxQuantity")
    public final String IconCompatParcelizer;
    @SerializedName("documents")
    public final List<verifyDrawable> read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) action.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) action.IconCompatParcelizer);
    }

    public final int hashCode() {
        List<verifyDrawable> list = this.read;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        String str = this.IconCompatParcelizer;
        if (str != null) {
            i = str.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DocumentUploadsEntity(documents=");
        sb.append(this.read);
        sb.append(", totalMaxQuantity=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: o.Action$IconCompatParcelizer */
    public static final class IconCompatParcelizer<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Comparable valueOf = Integer.valueOf(((verifyDrawable) t).MediaBrowserCompat$CustomActionResultReceiver);
            Comparable valueOf2 = Integer.valueOf(((verifyDrawable) t2).MediaBrowserCompat$CustomActionResultReceiver);
            if (valueOf == valueOf2) {
                return 0;
            }
            if (valueOf == null) {
                return -1;
            }
            if (valueOf2 == null) {
                return 1;
            }
            return valueOf.compareTo(valueOf2);
        }
    }
}

package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.Comparator;
import java.util.List;

/* renamed from: o.drawGlyph */
public final class drawGlyph {
    @SerializedName("accounts")
    public final List<getStartProgress> MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof drawGlyph) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((drawGlyph) obj).MediaBrowserCompat$CustomActionResultReceiver);
        }
        return true;
    }

    public final int hashCode() {
        List<getStartProgress> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RegistrationAccountsEntity(accounts=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: o.drawGlyph$read */
    public static final class read<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Comparable valueOf = Integer.valueOf(((setTypeFilter) t).RatingCompat);
            Comparable valueOf2 = Integer.valueOf(((setTypeFilter) t2).RatingCompat);
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

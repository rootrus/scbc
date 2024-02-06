package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getTimeRemapping */
public final class getTimeRemapping {
    @SerializedName("objectives")
    public final List<read> IconCompatParcelizer;

    /* renamed from: o.getTimeRemapping$read */
    public static final class read {
        @SerializedName("sortSequence")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("label")
        public final String MediaBrowserCompat$ItemReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read read = (read) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) read.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) read.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ObjectiveEntity(sortSequence=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", label=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof getTimeRemapping) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((getTimeRemapping) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        List<read> list = this.IconCompatParcelizer;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvestmentObjectivesEntity(objectives=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}

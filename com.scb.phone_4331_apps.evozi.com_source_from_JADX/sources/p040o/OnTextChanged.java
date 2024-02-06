package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.OnTextChanged */
public class OnTextChanged {
    @SerializedName("refreshCacheOnResumeInMinutes")
    public long write;

    /* renamed from: o.OnTextChanged$Callback */
    public final class Callback {
        @SerializedName("tcLatestVersion")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("tcAcceptRequired")
        public final String read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Callback)) {
                return false;
            }
            Callback callback = (Callback) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) callback.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) callback.read);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.read;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TcVersionEntity(tcLatestVersion=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", tcAcceptRequired=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this.write != ((OnTextChanged) obj).write) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.write;
        return (int) (j ^ (j >>> 32));
    }
}

package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.OnPageChange */
public class OnPageChange {
    @SerializedName("SCB_CONNECT_DEEPLINK")
    public String MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.OnPageChange$Callback */
    public final class Callback {
        @SerializedName("urlEN")
        public final String IconCompatParcelizer;
        @SerializedName("urlTH")
        public final String MediaBrowserCompat$CustomActionResultReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Callback)) {
                return false;
            }
            Callback callback = (Callback) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) callback.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) callback.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AppConfigUrlEntity(urlEN=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", urlTH=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }
    }
}

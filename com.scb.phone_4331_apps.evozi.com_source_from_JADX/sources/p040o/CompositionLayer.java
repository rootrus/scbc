package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.CompositionLayer */
public class CompositionLayer {
    @SerializedName("fundSource")
    public drawLayer MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.CompositionLayer$1 */
    public final class C31931 {
        @SerializedName("accountNo")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("name")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("payType")
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31931)) {
                return false;
            }
            C31931 r3 = (C31931) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            String str = this.write;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PurchasePaymentDetailsEntity(payType=");
            sb.append(this.write);
            sb.append(", accountNo=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", name=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }
    }
}

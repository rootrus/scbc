package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.Interners */
public class Interners {
    @SerializedName("proxyId")
    public String IconCompatParcelizer;
    @SerializedName("proxyType")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("annotation")
    public paddedPartition<String> MediaBrowserCompat$ItemReceiver = new paddedPartition<>();
    @SerializedName("rtpRef")
    public String RatingCompat;
    @SerializedName("amountCurrency")
    public String read;
    @SerializedName("amount")
    public String write;

    /* renamed from: o.Interners$WeakInterner */
    public final class WeakInterner {
        @SerializedName("referenceNumber")
        private String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("productName")
        private String write;

        /* renamed from: o.Interners$WeakInterner$InternReference */
        public final class InternReference {
            @SerializedName("paymentId")
            public String write;
        }

        public WeakInterner() {
            this((byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WeakInterner)) {
                return false;
            }
            WeakInterner weakInterner = (WeakInterner) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) weakInterner.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) weakInterner.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.write;
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
            sb.append("CardlessWithdrawVerificationSubProductRequest(productName=");
            sb.append(this.write);
            sb.append(", referenceNumber=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public WeakInterner(String str, String str2) {
            this.write = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        }

        private /* synthetic */ WeakInterner(byte b) {
            this((String) null, (String) null);
        }
    }

    /* renamed from: o.Interners$InternerFunction */
    public final class InternerFunction {
        @SerializedName("number")
        private final String MediaBrowserCompat$CustomActionResultReceiver;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof InternerFunction) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((InternerFunction) obj).MediaBrowserCompat$CustomActionResultReceiver);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SubDepositRequest(number=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public InternerFunction(String str) {
            onGetStartedClick.write((Object) str, "number");
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }
    }
}

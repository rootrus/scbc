package p040o;

import com.google.gson.annotations.SerializedName;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* renamed from: o.ImmutableSet */
public final class ImmutableSet {
    @SerializedName("mobileNo")
    private final String MediaBrowserCompat$CustomActionResultReceiver;

    /* renamed from: o.ImmutableSet$ArrayImmutableSet */
    public final class ArrayImmutableSet {
        @SerializedName("transactionToken")
        private final String MediaBrowserCompat$CustomActionResultReceiver;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof ArrayImmutableSet) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((ArrayImmutableSet) obj).MediaBrowserCompat$CustomActionResultReceiver);
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
            sb.append("PurchasePaymentConfirmationRequest(transactionToken=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public ArrayImmutableSet(String str) {
            onGetStartedClick.write((Object) str, "transactionToken");
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }
    }

    /* renamed from: o.ImmutableSet$Builder */
    public final class Builder {
        @SerializedName("loginModuleId")
        private final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("moduleId")
        private final String read;

        public Builder() {
            this((String) null, (String) null, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) builder.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) builder.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.read;
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
            sb.append("RegistrationLandingConfRequest(moduleId=");
            sb.append(this.read);
            sb.append(", loginModuleId=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        private Builder(String str, String str2) {
            this.read = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        private /* synthetic */ Builder(String str, String str2, int i) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        static {
            new Builder("SCBDP", (String) null, 2);
            new Builder((String) null, "FEMobile", 1);
        }
    }

    public ImmutableSet(String str) {
        onGetStartedClick.write((Object) str, "mobileNo");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    /* renamed from: o.ImmutableSet$TransformedImmutableSet */
    public final class TransformedImmutableSet {
        @SerializedName("imageHeight")
        public final RequestBody IconCompatParcelizer;
        @SerializedName("signature")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("imageWidth")
        public final RequestBody MediaBrowserCompat$ItemReceiver;
        @SerializedName("timestamp")
        public final String MediaMetadataCompat;
        @SerializedName("imageFormat")
        public final RequestBody read;
        @SerializedName("imageData")
        public final MultipartBody.Part write;

        /* renamed from: o.ImmutableSet$TransformedImmutableSet$1 */
        public final class C35081 {
            @SerializedName("tcAcceptVersion")
            private final int MediaBrowserCompat$ItemReceiver;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C35081) && this.MediaBrowserCompat$ItemReceiver == ((C35081) obj).MediaBrowserCompat$ItemReceiver;
                }
                return true;
            }

            public final int hashCode() {
                return this.MediaBrowserCompat$ItemReceiver;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("RegistrationTcAcceptRequest(tcAcceptVersion=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(")");
                return sb.toString();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransformedImmutableSet)) {
                return false;
            }
            TransformedImmutableSet transformedImmutableSet = (TransformedImmutableSet) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) transformedImmutableSet.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) transformedImmutableSet.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) transformedImmutableSet.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) transformedImmutableSet.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) transformedImmutableSet.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) transformedImmutableSet.MediaMetadataCompat);
        }

        public final int hashCode() {
            RequestBody requestBody = this.read;
            int i = 0;
            int hashCode = requestBody != null ? requestBody.hashCode() : 0;
            MultipartBody.Part part = this.write;
            int hashCode2 = part != null ? part.hashCode() : 0;
            RequestBody requestBody2 = this.IconCompatParcelizer;
            int hashCode3 = requestBody2 != null ? requestBody2.hashCode() : 0;
            RequestBody requestBody3 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode4 = requestBody3 != null ? requestBody3.hashCode() : 0;
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode5 = str != null ? str.hashCode() : 0;
            String str2 = this.MediaMetadataCompat;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("VerifyByFaceRequest(imageFormat=");
            sb.append(this.read);
            sb.append(", imageData=");
            sb.append(this.write);
            sb.append(", imageHeight=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", imageWidth=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", imageHash=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", timestamp=");
            sb.append(this.MediaMetadataCompat);
            sb.append(")");
            return sb.toString();
        }

        public TransformedImmutableSet(RequestBody requestBody, MultipartBody.Part part, RequestBody requestBody2, RequestBody requestBody3, String str, String str2) {
            onGetStartedClick.write((Object) requestBody, "imageFormat");
            onGetStartedClick.write((Object) part, "imageData");
            this.read = requestBody;
            this.write = part;
            this.IconCompatParcelizer = requestBody2;
            this.MediaBrowserCompat$ItemReceiver = requestBody3;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.MediaMetadataCompat = str2;
        }

        /* renamed from: o.ImmutableSet$TransformedImmutableSet$read */
        public static final class read implements findFragmentByWho {
            private final /* synthetic */ zzo read;

            private read() {
            }

            public /* synthetic */ read(zzo zzo) {
                this.read = zzo;
            }

            public final Object IconCompatParcelizer(Object obj) {
                return zzo.write((addAnimatorListener) obj);
            }
        }
    }

    /* renamed from: o.ImmutableSet$SerializedForm */
    public class SerializedForm {
        @SerializedName("transactionToken")
        private String write;

        public SerializedForm(String str) {
            this.write = str;
        }
    }
}

package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;

/* renamed from: o.Utils */
public final class Utils {
    @SerializedName("imageURL")
    public String IconCompatParcelizer;
    @SerializedName("QRstring")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("header")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("type")
    public String RatingCompat;
    @SerializedName("description")
    public String read;
    @SerializedName("title")
    public String write;

    public Utils() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Utils)) {
            return false;
        }
        Utils utils = (Utils) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) utils.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) utils.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) utils.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) utils.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) utils.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) utils.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.RatingCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.write;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaymentInfoEntity(imageURL=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", header=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", description=");
        sb.append(this.read);
        sb.append(", type=");
        sb.append(this.RatingCompat);
        sb.append(", title=");
        sb.append(this.write);
        sb.append(", QRstring=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    private Utils(String str, String str2, String str3, String str4, String str5, String str6) {
        this.IconCompatParcelizer = null;
        this.MediaBrowserCompat$ItemReceiver = null;
        this.read = null;
        this.RatingCompat = null;
        this.write = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
    }

    /* renamed from: o.Utils$2 */
    public final class C39312 implements Parcelable {
        public static final Utils$2$MediaBrowserCompat$ItemReceiver CREATOR = new Utils$2$MediaBrowserCompat$ItemReceiver((byte) 0);
        public final String read;
        public final String write;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C39312)) {
                return false;
            }
            C39312 r3 = (C39312) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write);
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.write;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("JuristicRequestFormResponseDisplay(email=");
            sb.append(this.read);
            sb.append(", transactionDateTime=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public C39312(String str, String str2) {
            onGetStartedClick.write((Object) str, Scopes.EMAIL);
            this.read = str;
            this.write = str2;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C39312(android.os.Parcel r2) {
            /*
                r1 = this;
                java.lang.String r0 = "parcel"
                p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r0)
                java.lang.String r0 = "$this$readStringNonNull"
                p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r0)
                java.lang.String r0 = r2.readString()
                if (r0 != 0) goto L_0x0012
                java.lang.String r0 = ""
            L_0x0012:
                java.lang.String r2 = r2.readString()
                r1.<init>(r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.Utils.C39312.<init>(android.os.Parcel):void");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.read);
            parcel.writeString(this.write);
        }
    }

    private /* synthetic */ Utils(byte b) {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    }
}

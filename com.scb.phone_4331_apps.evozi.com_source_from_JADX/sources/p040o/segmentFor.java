package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.segmentFor */
public class segmentFor {
    @SerializedName("bondAccountNumber")
    private String IconCompatParcelizer;
    @SerializedName("mobileNoSMS")
    private String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("accountNo")
    private String MediaBrowserCompat$ItemReceiver;
    @SerializedName("fundCode")
    private String read;
    @SerializedName("amount")
    private String write;

    /* renamed from: o.segmentFor$write */
    public static final class write {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String read;
        public String write;
    }

    public /* synthetic */ segmentFor(write write2, byte b) {
        this(write2);
    }

    public static write read() {
        return new write();
    }

    private segmentFor(write write2) {
        this.MediaBrowserCompat$ItemReceiver = write2.IconCompatParcelizer;
        this.IconCompatParcelizer = write2.read;
        this.read = write2.MediaBrowserCompat$ItemReceiver;
        this.write = write2.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = write2.write;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        segmentFor segmentfor = (segmentFor) obj;
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str == null ? segmentfor.MediaBrowserCompat$ItemReceiver != null : !str.equals(segmentfor.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str2 = this.IconCompatParcelizer;
        if (str2 == null ? segmentfor.IconCompatParcelizer != null : !str2.equals(segmentfor.IconCompatParcelizer)) {
            return false;
        }
        String str3 = this.read;
        if (str3 == null ? segmentfor.read != null : !str3.equals(segmentfor.read)) {
            return false;
        }
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str4 == null ? segmentfor.MediaBrowserCompat$CustomActionResultReceiver != null : !str4.equals(segmentfor.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str5 = this.write;
        String str6 = segmentfor.write;
        if (str5 != null) {
            return str5.equals(str6);
        }
        if (str6 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BondPurchaseVerificationRequest{accountNo='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append(", bondAccountNumber='");
        sb.append(this.IconCompatParcelizer);
        sb.append('\'');
        sb.append(", fundCode='");
        sb.append(this.read);
        sb.append('\'');
        sb.append(", amount='");
        sb.append(this.write);
        sb.append('\'');
        sb.append(", mobileNoSMS='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}

package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getMaskAnimations */
public final class getMaskAnimations {
    @SerializedName("repaymentMethod")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("repaymentAccountNo")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("receivingAccountNo")
    private final String read;
    @SerializedName("applicationUuid")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getMaskAnimations)) {
            return false;
        }
        getMaskAnimations getmaskanimations = (getMaskAnimations) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getmaskanimations.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getmaskanimations.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getmaskanimations.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getmaskanimations.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlConfirmSetupRequest(applicationUuid=");
        sb.append(this.write);
        sb.append(", receivingAccount=");
        sb.append(this.read);
        sb.append(", repaymentAccount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", repaymentMethod=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getMaskAnimations(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "applicationUuid");
        onGetStartedClick.write((Object) str2, "receivingAccount");
        this.write = str;
        this.read = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
    }

    /* renamed from: o.getMaskAnimations$read */
    public static final class read {
        public final List<byte[]> IconCompatParcelizer;
        public int MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final int MediaBrowserCompat$MediaItem;
        public final int MediaBrowserCompat$SearchResultReceiver;
        public final String RatingCompat;
        public final byte[] read;
        public Object write;

        private read() {
        }

        public read(byte[] bArr, String str, List<byte[]> list, String str2) {
            this(bArr, str, list, str2, -1, -1);
        }

        public read(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
            int i3;
            this.read = bArr;
            if (bArr == null) {
                i3 = 0;
            } else {
                i3 = bArr.length << 3;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = i3;
            this.RatingCompat = str;
            this.IconCompatParcelizer = list;
            this.MediaBrowserCompat$ItemReceiver = str2;
            this.MediaBrowserCompat$MediaItem = i2;
            this.MediaBrowserCompat$SearchResultReceiver = i;
        }
    }
}

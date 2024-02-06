package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ForwardingCollection */
public final class ForwardingCollection extends standardContains {
    @SerializedName("encrypt")
    private String IconCompatParcelizer;
    @SerializedName("resetPinTokenId")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("e2eeS")
    private String read;
    @SerializedName("device")
    private String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForwardingCollection)) {
            return false;
        }
        ForwardingCollection forwardingCollection = (ForwardingCollection) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) forwardingCollection.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) forwardingCollection.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) forwardingCollection.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) forwardingCollection.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JuristicVerifyResetPinRequest(e2eeS=");
        sb.append(this.read);
        sb.append(", encrypt=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", device=");
        sb.append(this.write);
        sb.append(", resetPinTokenId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ForwardingCollection(String str, String str2, String str3, String str4) {
        super(str, str2, str3);
        onGetStartedClick.write((Object) str, "e2eeS");
        onGetStartedClick.write((Object) str2, "encrypt");
        onGetStartedClick.write((Object) str3, "device");
        onGetStartedClick.write((Object) str4, "resetPinTokenId");
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.write = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
    }
}

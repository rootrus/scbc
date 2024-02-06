package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.Registry$NoImageHeaderParserException */
public final class Registry$NoImageHeaderParserException extends setCurrentItemInternal {
    @SerializedName("cardMask")
    public String IconCompatParcelizer;
    @SerializedName("nickname")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("cardRefNo")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("sortSequence")
    public Integer read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Registry$NoImageHeaderParserException)) {
            return false;
        }
        Registry$NoImageHeaderParserException registry$NoImageHeaderParserException = (Registry$NoImageHeaderParserException) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) registry$NoImageHeaderParserException.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) registry$NoImageHeaderParserException.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) registry$NoImageHeaderParserException.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) registry$NoImageHeaderParserException.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        Integer num = this.read;
        int i = 0;
        int hashCode = num != null ? num.hashCode() : 0;
        String str = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DebitAccountItemEntity(sortSequence=");
        sb.append(this.read);
        sb.append(", cardRefNo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", cardMask=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", nickname=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

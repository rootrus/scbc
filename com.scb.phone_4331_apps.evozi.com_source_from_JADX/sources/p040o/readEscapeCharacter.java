package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.readEscapeCharacter */
public final class readEscapeCharacter {
    @SerializedName("type")
    public final String IconCompatParcelizer;
    @SerializedName("status")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("number")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("description")
    public final String read;
    @SerializedName("name")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof readEscapeCharacter)) {
            return false;
        }
        readEscapeCharacter readescapecharacter = (readEscapeCharacter) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) readescapecharacter.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) readescapecharacter.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) readescapecharacter.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) readescapecharacter.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) readescapecharacter.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BankAccountEntity(number=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", name=");
        sb.append(this.write);
        sb.append(", type=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", status=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", description=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}

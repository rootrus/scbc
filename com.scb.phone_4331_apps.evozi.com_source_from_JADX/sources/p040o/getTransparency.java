package p040o;

/* renamed from: o.getTransparency */
public final class getTransparency {
    public final String IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getTransparency)) {
            return false;
        }
        getTransparency gettransparency = (getTransparency) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) gettransparency.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) gettransparency.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) gettransparency.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) gettransparency.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) gettransparency.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DebitCardActivationVerification(accountNo=");
        sb.append(this.read);
        sb.append(", accountFromName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", cardMaskedNo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", oldCardMaskedNo=");
        sb.append(this.write);
        sb.append(", transactionToken=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public getTransparency(String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "accountNo");
        onGetStartedClick.write((Object) str2, "accountFromName");
        onGetStartedClick.write((Object) str3, "cardMaskedNo");
        onGetStartedClick.write((Object) str5, "transactionToken");
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.write = str4;
        this.IconCompatParcelizer = str5;
    }
}

package p040o;

/* renamed from: o.ringRead */
public final class ringRead {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final int MediaDescriptionCompat;
    public final writeInts MediaMetadataCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ringRead)) {
            return false;
        }
        ringRead ringread = (ringRead) obj;
        return this.MediaDescriptionCompat == ringread.MediaDescriptionCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ringread.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ringread.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ringread.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) ringread.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ringread.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) ringread.MediaMetadataCompat);
    }

    public final int hashCode() {
        int i = this.MediaDescriptionCompat;
        String str = this.read;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.write;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        writeInts writeints = this.MediaMetadataCompat;
        if (writeints != null) {
            i2 = writeints.hashCode();
        }
        return (((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressCardListDisplay(sortSequence=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", applicationId=");
        sb.append(this.read);
        sb.append(", accountNo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", cardRefNo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", cardMask=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", productName=");
        sb.append(this.write);
        sb.append(", productType=");
        sb.append(this.MediaMetadataCompat);
        sb.append(")");
        return sb.toString();
    }

    public ringRead(int i, String str, String str2, String str3, String str4, String str5, writeInts writeints) {
        onGetStartedClick.write((Object) str, "applicationId");
        this.MediaDescriptionCompat = i;
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
        this.write = str5;
        this.MediaMetadataCompat = writeints;
    }
}

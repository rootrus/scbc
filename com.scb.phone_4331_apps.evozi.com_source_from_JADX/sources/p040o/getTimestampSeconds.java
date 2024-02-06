package p040o;

/* renamed from: o.getTimestampSeconds */
public final class getTimestampSeconds {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public boolean MediaBrowserCompat$MediaItem;
    public final int MediaBrowserCompat$SearchResultReceiver;
    public final listFilesMatching MediaDescriptionCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getTimestampSeconds)) {
            return false;
        }
        getTimestampSeconds gettimestampseconds = (getTimestampSeconds) obj;
        return this.MediaBrowserCompat$SearchResultReceiver == gettimestampseconds.MediaBrowserCompat$SearchResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) gettimestampseconds.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) gettimestampseconds.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) gettimestampseconds.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) gettimestampseconds.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) gettimestampseconds.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) gettimestampseconds.MediaDescriptionCompat) && this.MediaBrowserCompat$MediaItem == gettimestampseconds.MediaBrowserCompat$MediaItem;
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$SearchResultReceiver;
        String str = this.IconCompatParcelizer;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        listFilesMatching listfilesmatching = this.MediaDescriptionCompat;
        if (listfilesmatching != null) {
            i2 = listfilesmatching.hashCode();
        }
        boolean z = this.MediaBrowserCompat$MediaItem;
        if (z) {
            z = true;
        }
        return (((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i2) * 31) + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlBusinessAccountDisplay(id=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", bankCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", bankLogo=");
        sb.append(this.write);
        sb.append(", bankAbbrev=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", accountNo=");
        sb.append(this.read);
        sb.append(", formattedAccount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", type=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", hasError=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(")");
        return sb.toString();
    }

    private getTimestampSeconds(int i, String str, String str2, String str3, String str4, String str5, listFilesMatching listfilesmatching, boolean z) {
        onGetStartedClick.write((Object) str, "bankCode");
        onGetStartedClick.write((Object) str2, "bankLogo");
        onGetStartedClick.write((Object) str3, "bankAbbrev");
        onGetStartedClick.write((Object) str4, "accountNo");
        onGetStartedClick.write((Object) str5, "formattedAccount");
        onGetStartedClick.write((Object) listfilesmatching, "type");
        this.MediaBrowserCompat$SearchResultReceiver = i;
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.read = str4;
        this.MediaBrowserCompat$ItemReceiver = str5;
        this.MediaDescriptionCompat = listfilesmatching;
        this.MediaBrowserCompat$MediaItem = false;
    }

    public /* synthetic */ getTimestampSeconds(int i, String str, String str2, String str3, String str4, String str5, listFilesMatching listfilesmatching) {
        this(i, str, str2, str3, str4, str5, listfilesmatching, false);
    }
}

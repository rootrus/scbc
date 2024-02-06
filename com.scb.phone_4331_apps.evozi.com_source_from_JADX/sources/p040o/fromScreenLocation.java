package p040o;

/* renamed from: o.fromScreenLocation */
public final class fromScreenLocation {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaDescriptionCompat;
    public final isUserNavigationEnabled MediaMetadataCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fromScreenLocation)) {
            return false;
        }
        fromScreenLocation fromscreenlocation = (fromScreenLocation) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fromscreenlocation.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fromscreenlocation.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) fromscreenlocation.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fromscreenlocation.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) fromscreenlocation.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fromscreenlocation.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fromscreenlocation.write);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaDescriptionCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        isUserNavigationEnabled isusernavigationenabled = this.MediaMetadataCompat;
        int hashCode5 = isusernavigationenabled != null ? isusernavigationenabled.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.write;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PortfolioDetails(disclaimer=");
        sb.append(this.read);
        sb.append(", disclaimerDate=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", symbolList=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", cashBalanceDisclaimer=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", securitiesAccountDetails=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", cardId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", billerAccountNo=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public fromScreenLocation(String str, String str2, String str3, String str4, isUserNavigationEnabled isusernavigationenabled, String str5, String str6) {
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.MediaDescriptionCompat = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
        this.MediaMetadataCompat = isusernavigationenabled;
        this.IconCompatParcelizer = str5;
        this.write = str6;
    }
}

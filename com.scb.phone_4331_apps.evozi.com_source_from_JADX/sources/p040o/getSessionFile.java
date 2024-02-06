package p040o;

import java.util.List;

/* renamed from: o.getSessionFile */
public final class getSessionFile {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    private final String MediaBrowserCompat$MediaItem;
    public final List<performUpdateApp> MediaBrowserCompat$SearchResultReceiver;
    private final String MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSessionFile)) {
            return false;
        }
        getSessionFile getsessionfile = (getSessionFile) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getsessionfile.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) getsessionfile.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getsessionfile.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getsessionfile.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getsessionfile.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getsessionfile.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) getsessionfile.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) getsessionfile.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) getsessionfile.MediaBrowserCompat$SearchResultReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$MediaItem;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.write;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.IconCompatParcelizer;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaDescriptionCompat;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaMetadataCompat;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        List<performUpdateApp> list = this.MediaBrowserCompat$SearchResultReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CreditPowerLandingDisplay(minimumIncome=");
        sb.append(this.read);
        sb.append(", minimumAmount=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", state=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", flowType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", productGroup=");
        sb.append(this.write);
        sb.append(", ncbConsent=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", monthlyIncome=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", repaymentAbility=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", tiles=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getSessionFile(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<performUpdateApp> list) {
        onGetStartedClick.write((Object) str, "minimumIncome");
        onGetStartedClick.write((Object) str2, "minimumAmount");
        onGetStartedClick.write((Object) str3, "state");
        onGetStartedClick.write((Object) str4, "flowType");
        onGetStartedClick.write((Object) str5, "productGroup");
        onGetStartedClick.write((Object) list, "tiles");
        this.read = str;
        this.MediaBrowserCompat$MediaItem = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
        this.write = str5;
        this.IconCompatParcelizer = str6;
        this.MediaDescriptionCompat = str7;
        this.MediaMetadataCompat = str8;
        this.MediaBrowserCompat$SearchResultReceiver = list;
    }
}

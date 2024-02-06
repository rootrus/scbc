package p040o;

/* renamed from: o.zzxa */
public final class zzxa {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final String f3006x50fd9e4a;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final double RatingCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzxa)) {
            return false;
        }
        zzxa zzxa = (zzxa) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) zzxa.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) zzxa.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f3006x50fd9e4a, (Object) zzxa.f3006x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzxa.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzxa.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzxa.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzxa.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzxa.read) && Double.compare(this.RatingCompat, zzxa.RatingCompat) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) zzxa.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) zzxa.MediaBrowserCompat$SearchResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaMetadataCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$MediaItem;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.f3006x50fd9e4a;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.write;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.read;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.RatingCompat);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        String str9 = this.MediaDescriptionCompat;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i2) * 31) + hashCode9) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BankingAgentTransaction(refId=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", timestamp=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", transactionType=");
        sb.append(this.f3006x50fd9e4a);
        sb.append(", accountNo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", agentCode=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", agentName=");
        sb.append(this.write);
        sb.append(", agentLogo=");
        sb.append(this.read);
        sb.append(", amount=");
        sb.append(this.RatingCompat);
        sb.append(", postingType=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", branchNo=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public zzxa(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, double d, String str9, String str10) {
        onGetStartedClick.write((Object) str, "refId");
        onGetStartedClick.write((Object) str2, "timestamp");
        onGetStartedClick.write((Object) str3, "transactionType");
        onGetStartedClick.write((Object) str4, "accountNo");
        onGetStartedClick.write((Object) str5, "accountName");
        onGetStartedClick.write((Object) str6, "agentCode");
        onGetStartedClick.write((Object) str7, "agentName");
        onGetStartedClick.write((Object) str8, "agentLogo");
        onGetStartedClick.write((Object) str9, "postingType");
        onGetStartedClick.write((Object) str10, "branchNo");
        this.MediaMetadataCompat = str;
        this.MediaBrowserCompat$MediaItem = str2;
        this.f3006x50fd9e4a = str3;
        this.IconCompatParcelizer = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = str5;
        this.MediaBrowserCompat$ItemReceiver = str6;
        this.write = str7;
        this.read = str8;
        this.RatingCompat = d;
        this.MediaDescriptionCompat = str9;
        this.MediaBrowserCompat$SearchResultReceiver = str10;
    }
}

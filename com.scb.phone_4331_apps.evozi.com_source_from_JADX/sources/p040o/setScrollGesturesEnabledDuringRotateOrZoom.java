package p040o;

/* renamed from: o.setScrollGesturesEnabledDuringRotateOrZoom */
public final class setScrollGesturesEnabledDuringRotateOrZoom {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String RatingCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setScrollGesturesEnabledDuringRotateOrZoom)) {
            return false;
        }
        setScrollGesturesEnabledDuringRotateOrZoom setscrollgesturesenabledduringrotateorzoom = (setScrollGesturesEnabledDuringRotateOrZoom) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setscrollgesturesenabledduringrotateorzoom.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setscrollgesturesenabledduringrotateorzoom.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setscrollgesturesenabledduringrotateorzoom.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setscrollgesturesenabledduringrotateorzoom.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setscrollgesturesenabledduringrotateorzoom.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setscrollgesturesenabledduringrotateorzoom.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setscrollgesturesenabledduringrotateorzoom.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) setscrollgesturesenabledduringrotateorzoom.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setscrollgesturesenabledduringrotateorzoom.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setscrollgesturesenabledduringrotateorzoom.RatingCompat);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaDescriptionCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$MediaItem;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.write;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.IconCompatParcelizer;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaMetadataCompat;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.RatingCompat;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TopUpRepeatResponse(accountFrom=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", serviceNumber=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", amount=");
        sb.append(this.read);
        sb.append(", billerLogo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", billerName=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", billerAccountNumber=");
        sb.append(this.write);
        sb.append(", billerId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", billerType=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", ref1Label=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", ref2Label=");
        sb.append(this.RatingCompat);
        sb.append(")");
        return sb.toString();
    }

    public setScrollGesturesEnabledDuringRotateOrZoom(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        onGetStartedClick.write((Object) str2, "serviceNumber");
        onGetStartedClick.write((Object) str4, "billerLogo");
        onGetStartedClick.write((Object) str5, "billerName");
        onGetStartedClick.write((Object) str6, "billerAccountNumber");
        onGetStartedClick.write((Object) str7, "billerId");
        onGetStartedClick.write((Object) str8, "billerType");
        onGetStartedClick.write((Object) str9, "ref1Label");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaDescriptionCompat = str2;
        this.read = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
        this.MediaBrowserCompat$MediaItem = str5;
        this.write = str6;
        this.IconCompatParcelizer = str7;
        this.MediaBrowserCompat$SearchResultReceiver = str8;
        this.MediaMetadataCompat = str9;
        this.RatingCompat = str10;
    }
}

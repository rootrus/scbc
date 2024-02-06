package p040o;

/* renamed from: o.listSessionBeginFiles */
public final class listSessionBeginFiles extends getUserMetadata {
    public final String IconCompatParcelizer;
    public final boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final listSessionBeginFiles$MediaBrowserCompat$ItemReceiver f2888x50fd9e4a;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final boolean MediaSessionCompat$Token;
    public final String RatingCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof listSessionBeginFiles)) {
            return false;
        }
        listSessionBeginFiles listsessionbeginfiles = (listSessionBeginFiles) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) listsessionbeginfiles.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) listsessionbeginfiles.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) listsessionbeginfiles.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) listsessionbeginfiles.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) listsessionbeginfiles.read) && this.MediaBrowserCompat$CustomActionResultReceiver == listsessionbeginfiles.MediaBrowserCompat$CustomActionResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) listsessionbeginfiles.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) listsessionbeginfiles.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) listsessionbeginfiles.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) listsessionbeginfiles.MediaBrowserCompat$MediaItem) && this.MediaSessionCompat$Token == listsessionbeginfiles.MediaSessionCompat$Token && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2888x50fd9e4a, (Object) listsessionbeginfiles.f2888x50fd9e4a);
    }

    public final int hashCode() {
        String str = this.MediaMetadataCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaDescriptionCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        String str6 = this.RatingCompat;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.write;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaBrowserCompat$MediaItem;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        boolean z3 = this.MediaSessionCompat$Token;
        if (!z3) {
            z2 = z3;
        }
        listSessionBeginFiles$MediaBrowserCompat$ItemReceiver listsessionbeginfiles_mediabrowsercompat_itemreceiver = this.f2888x50fd9e4a;
        if (listsessionbeginfiles_mediabrowsercompat_itemreceiver != null) {
            i = listsessionbeginfiles_mediabrowsercompat_itemreceiver.hashCode();
        }
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (z ? 1 : 0)) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (z2 ? 1 : 0)) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlPersonalInfoDisplay(nameEn=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", firstName=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", lastName=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", mobileNo=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", email=");
        sb.append(this.read);
        sb.append(", isEmailEnabled=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", mailing=");
        sb.append(this.RatingCompat);
        sb.append(", income=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", expiryDate=");
        sb.append(this.write);
        sb.append(", laserCode=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", requireThName=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", spouseInfo=");
        sb.append(this.f2888x50fd9e4a);
        sb.append(")");
        return sb.toString();
    }

    public listSessionBeginFiles(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, String str9, boolean z2, listSessionBeginFiles$MediaBrowserCompat$ItemReceiver listsessionbeginfiles_mediabrowsercompat_itemreceiver) {
        onGetStartedClick.write((Object) str, "nameEn");
        onGetStartedClick.write((Object) str4, "mobileNo");
        onGetStartedClick.write((Object) str6, "mailing");
        this.MediaMetadataCompat = str;
        this.IconCompatParcelizer = str2;
        this.MediaDescriptionCompat = str3;
        this.MediaBrowserCompat$SearchResultReceiver = str4;
        this.read = str5;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        this.RatingCompat = str6;
        this.MediaBrowserCompat$ItemReceiver = str7;
        this.write = str8;
        this.MediaBrowserCompat$MediaItem = str9;
        this.MediaSessionCompat$Token = z2;
        this.f2888x50fd9e4a = listsessionbeginfiles_mediabrowsercompat_itemreceiver;
    }
}

package p040o;

import com.google.android.gms.common.Scopes;

/* renamed from: o.trimOpenSessions */
public final class trimOpenSessions {
    public final listSortedSessionBeginFiles IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final boolean MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompat$QueueItem;
    public final String MediaSessionCompat$Token;
    public final String RatingCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trimOpenSessions)) {
            return false;
        }
        trimOpenSessions trimopensessions = (trimOpenSessions) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) trimopensessions.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) trimopensessions.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) trimopensessions.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) trimopensessions.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) trimopensessions.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) trimopensessions.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) trimopensessions.MediaSessionCompat$Token) && this.MediaBrowserCompat$MediaItem == trimopensessions.MediaBrowserCompat$MediaItem && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) trimopensessions.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) trimopensessions.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) trimopensessions.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) trimopensessions.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaMetadataCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaDescriptionCompat;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaSessionCompat$Token;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        boolean z = this.MediaBrowserCompat$MediaItem;
        if (z) {
            z = true;
        }
        String str8 = this.RatingCompat;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaSessionCompat$QueueItem;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        listSortedSessionBeginFiles listsortedsessionbeginfiles = this.IconCompatParcelizer;
        if (listsortedsessionbeginfiles != null) {
            i = listsortedsessionbeginfiles.hashCode();
        }
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (z ? 1 : 0)) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlContactInfoDisplay(mobileNumber=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", dateOfBirth=");
        sb.append(this.write);
        sb.append(", email=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", mailingAddress=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", homeAddress=");
        sb.append(this.read);
        sb.append(", monthlyIncome=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", photosAttached=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", isPhotoAttachedIconVisible=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", maritalStatus=");
        sb.append(this.RatingCompat);
        sb.append(", residentType=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", educationLevel=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", citizenId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public trimOpenSessions(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, listSortedSessionBeginFiles listsortedsessionbeginfiles) {
        onGetStartedClick.write((Object) str, "mobileNumber");
        onGetStartedClick.write((Object) str2, "dateOfBirth");
        onGetStartedClick.write((Object) str3, Scopes.EMAIL);
        onGetStartedClick.write((Object) str4, "mailingAddress");
        onGetStartedClick.write((Object) str6, "monthlyIncome");
        onGetStartedClick.write((Object) str7, "photosAttached");
        onGetStartedClick.write((Object) str8, "maritalStatus");
        onGetStartedClick.write((Object) str9, "residentType");
        onGetStartedClick.write((Object) str10, "educationLevel");
        onGetStartedClick.write((Object) listsortedsessionbeginfiles, "citizenId");
        this.MediaMetadataCompat = str;
        this.write = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.MediaBrowserCompat$SearchResultReceiver = str4;
        this.read = str5;
        this.MediaDescriptionCompat = str6;
        this.MediaSessionCompat$Token = str7;
        this.MediaBrowserCompat$MediaItem = z;
        this.RatingCompat = str8;
        this.MediaSessionCompat$QueueItem = str9;
        this.MediaBrowserCompat$CustomActionResultReceiver = str10;
        this.IconCompatParcelizer = listsortedsessionbeginfiles;
    }
}

package p040o;

import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import p040o.zzca;
import p040o.zzjx;

/* renamed from: o.ActivityTransitionEvent */
public final class ActivityTransitionEvent {
    @SerializedName("income")
    private final String IconCompatParcelizer;
    @SerializedName("citizenId")
    private final zzca.zzf MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("applicationUuid")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("mobileNo")
    private final String MediaBrowserCompat$MediaItem;
    @SerializedName("mailingAddress")
    private final zzca.zzc.zza MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("thaiLastName")

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final String f2668x50fd9e4a;
    @SerializedName("spouseInfo")
    private getTransitionType MediaDescriptionCompat;
    @SerializedName("maritalStatus")
    private final zzjx.zzc MediaMetadataCompat;
    @SerializedName("thaiFirstName")
    private final String MediaSessionCompat$Token;
    @SerializedName("residentType")
    private final zzjx.zzc RatingCompat;
    @SerializedName("email")
    private final String read;
    @SerializedName("educationLevel")
    private final zzjx.zzc write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) activityTransitionEvent.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) activityTransitionEvent.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2668x50fd9e4a, (Object) activityTransitionEvent.f2668x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) activityTransitionEvent.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) activityTransitionEvent.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) activityTransitionEvent.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) activityTransitionEvent.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) activityTransitionEvent.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) activityTransitionEvent.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) activityTransitionEvent.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) activityTransitionEvent.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) activityTransitionEvent.MediaDescriptionCompat);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaSessionCompat$Token;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.f2668x50fd9e4a;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$MediaItem;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.IconCompatParcelizer;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        zzca.zzc.zza zza = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode7 = zza != null ? zza.hashCode() : 0;
        zzjx.zzc zzc = this.MediaMetadataCompat;
        int hashCode8 = zzc != null ? zzc.hashCode() : 0;
        zzjx.zzc zzc2 = this.RatingCompat;
        int hashCode9 = zzc2 != null ? zzc2.hashCode() : 0;
        zzjx.zzc zzc3 = this.write;
        int hashCode10 = zzc3 != null ? zzc3.hashCode() : 0;
        zzca.zzf zzf = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode11 = zzf != null ? zzf.hashCode() : 0;
        getTransitionType gettransitiontype = this.MediaDescriptionCompat;
        if (gettransitiontype != null) {
            i = gettransitiontype.hashCode();
        }
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlBusinessOwnerCustomerContactInfoRequest(applicationUuid=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", thaiFirstName=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", thaiLastName=");
        sb.append(this.f2668x50fd9e4a);
        sb.append(", mobileNo=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", email=");
        sb.append(this.read);
        sb.append(", income=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", mailingAddress=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", maritalStatus=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", residentType=");
        sb.append(this.RatingCompat);
        sb.append(", educationLevel=");
        sb.append(this.write);
        sb.append(", citizenId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", spouseInfo=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(")");
        return sb.toString();
    }

    public ActivityTransitionEvent(String str, String str2, String str3, String str4, String str5, String str6, zzca.zzc.zza zza, zzjx.zzc zzc, zzjx.zzc zzc2, zzjx.zzc zzc3, zzca.zzf zzf, getTransitionType gettransitiontype) {
        onGetStartedClick.write((Object) str, "applicationUuid");
        onGetStartedClick.write((Object) str4, "mobileNo");
        onGetStartedClick.write((Object) str5, Scopes.EMAIL);
        onGetStartedClick.write((Object) str6, "income");
        onGetStartedClick.write((Object) zza, "mailingAddress");
        onGetStartedClick.write((Object) zzc, "maritalStatus");
        onGetStartedClick.write((Object) zzc2, "residentType");
        onGetStartedClick.write((Object) zzc3, "educationLevel");
        onGetStartedClick.write((Object) zzf, "citizenId");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaSessionCompat$Token = str2;
        this.f2668x50fd9e4a = str3;
        this.MediaBrowserCompat$MediaItem = str4;
        this.read = str5;
        this.IconCompatParcelizer = str6;
        this.MediaBrowserCompat$SearchResultReceiver = zza;
        this.MediaMetadataCompat = zzc;
        this.RatingCompat = zzc2;
        this.write = zzc3;
        this.MediaBrowserCompat$CustomActionResultReceiver = zzf;
        this.MediaDescriptionCompat = gettransitiontype;
    }
}

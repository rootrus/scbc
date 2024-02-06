package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.PathContent */
public final class PathContent {
    @SerializedName("citizenId")
    public final createPolygonPath IconCompatParcelizer;
    @SerializedName("educationLevel")
    public final setVertex MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("income")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("mobileNo")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("maritalStatus")
    public final setVertex MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("name")
    public final String MediaDescriptionCompat;
    @SerializedName("thaiFirstName")
    public final String MediaMetadataCompat;
    @SerializedName("thaiLastName")
    public final String MediaSessionCompat$ResultReceiverWrapper;
    @SerializedName("residentType")
    public final setVertex RatingCompat;
    @SerializedName("email")
    public final String read;
    @SerializedName("mailingAddress")
    public final PolystarContent write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathContent)) {
            return false;
        }
        PathContent pathContent = (PathContent) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) pathContent.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) pathContent.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) pathContent.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) pathContent.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) pathContent.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) pathContent.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) pathContent.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) pathContent.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) pathContent.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) pathContent.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) pathContent.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaDescriptionCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaMetadataCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$MediaItem;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        PolystarContent polystarContent = this.write;
        int hashCode7 = polystarContent != null ? polystarContent.hashCode() : 0;
        setVertex setvertex = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode8 = setvertex != null ? setvertex.hashCode() : 0;
        setVertex setvertex2 = this.RatingCompat;
        int hashCode9 = setvertex2 != null ? setvertex2.hashCode() : 0;
        setVertex setvertex3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode10 = setvertex3 != null ? setvertex3.hashCode() : 0;
        createPolygonPath createpolygonpath = this.IconCompatParcelizer;
        if (createpolygonpath != null) {
            i = createpolygonpath.hashCode();
        }
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomerContactEntity(name=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", thaiFirstName=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", thaiLastName=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", mobileNo=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", email=");
        sb.append(this.read);
        sb.append(", income=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", mailingAddress=");
        sb.append(this.write);
        sb.append(", maritalStatus=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", residentType=");
        sb.append(this.RatingCompat);
        sb.append(", educationLevel=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", citizenId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}

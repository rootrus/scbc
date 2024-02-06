package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.findByObject */
public final class findByObject {
    @SerializedName("addressNumber")
    public final String IconCompatParcelizer;
    @SerializedName("district")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("province")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("village")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("soi")
    public final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("subdistrict")
    public final String MediaDescriptionCompat;
    @SerializedName("road")
    public final String MediaMetadataCompat;
    @SerializedName("postalCode")
    public final String read;
    @SerializedName("moo")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof findByObject)) {
            return false;
        }
        findByObject findbyobject = (findByObject) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) findbyobject.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) findbyobject.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) findbyobject.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) findbyobject.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) findbyobject.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) findbyobject.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) findbyobject.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) findbyobject.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) findbyobject.read);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$MediaItem;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaMetadataCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaDescriptionCompat;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.read;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StandAloneAddressEntity(addressNumber=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", moo=");
        sb.append(this.write);
        sb.append(", village=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", soi=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", road=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", subdistrict=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", district=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", province=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", postalCode=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}

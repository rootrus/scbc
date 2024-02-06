package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setFlexWrap */
public final class setFlexWrap {
    @SerializedName("subModel")
    private final String IconCompatParcelizer;
    @SerializedName("bookPrice")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("model")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("yearOfManufacture")
    private final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("vehicleTypeCode")
    private final String MediaMetadataCompat;
    @SerializedName("vehicleKey")
    private final String read;
    @SerializedName("brand")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setFlexWrap)) {
            return false;
        }
        setFlexWrap setflexwrap = (setFlexWrap) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setflexwrap.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setflexwrap.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setflexwrap.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setflexwrap.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setflexwrap.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setflexwrap.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) setflexwrap.MediaBrowserCompat$SearchResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaMetadataCompat;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SequentialCarDetailEntity(bookPrice=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", brand=");
        sb.append(this.write);
        sb.append(", model=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", subModel=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", vehicleKey=");
        sb.append(this.read);
        sb.append(", vehicleTypeCode=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", yearOfManufacture=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

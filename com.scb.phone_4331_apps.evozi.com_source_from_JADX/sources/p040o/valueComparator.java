package p040o;

import com.google.gson.annotations.SerializedName;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* renamed from: o.valueComparator */
public final class valueComparator {
    @SerializedName("imageCropCoordinateY")
    public final RequestBody IconCompatParcelizer;
    @SerializedName("imageCropCoordinateX")
    public final RequestBody MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("imageData")
    public final MultipartBody.Part MediaBrowserCompat$ItemReceiver;
    @SerializedName("imageFormat")
    public final RequestBody MediaBrowserCompat$MediaItem;
    @SerializedName("imageHeight")
    public final RequestBody MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("imageWidth")
    public final RequestBody MediaDescriptionCompat;
    @SerializedName("ndidType")
    public final RequestBody MediaMetadataCompat;
    @SerializedName("requestId")
    public final RequestBody MediaSessionCompat$Token;
    @SerializedName("timestamp")
    public final String ParcelableVolumeInfo;
    @SerializedName("signature")
    public final String RatingCompat;
    @SerializedName("imageCropWidth")
    public final RequestBody read;
    @SerializedName("imageCropHeight")
    public final RequestBody write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof valueComparator)) {
            return false;
        }
        valueComparator valuecomparator = (valueComparator) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) valuecomparator.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) valuecomparator.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) valuecomparator.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) valuecomparator.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) valuecomparator.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) valuecomparator.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) valuecomparator.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) valuecomparator.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) valuecomparator.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) valuecomparator.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) valuecomparator.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) valuecomparator.ParcelableVolumeInfo);
    }

    public final int hashCode() {
        RequestBody requestBody = this.MediaMetadataCompat;
        int i = 0;
        int hashCode = requestBody != null ? requestBody.hashCode() : 0;
        RequestBody requestBody2 = this.MediaSessionCompat$Token;
        int hashCode2 = requestBody2 != null ? requestBody2.hashCode() : 0;
        RequestBody requestBody3 = this.MediaBrowserCompat$MediaItem;
        int hashCode3 = requestBody3 != null ? requestBody3.hashCode() : 0;
        MultipartBody.Part part = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = part != null ? part.hashCode() : 0;
        RequestBody requestBody4 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode5 = requestBody4 != null ? requestBody4.hashCode() : 0;
        RequestBody requestBody5 = this.MediaDescriptionCompat;
        int hashCode6 = requestBody5 != null ? requestBody5.hashCode() : 0;
        RequestBody requestBody6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode7 = requestBody6 != null ? requestBody6.hashCode() : 0;
        RequestBody requestBody7 = this.IconCompatParcelizer;
        int hashCode8 = requestBody7 != null ? requestBody7.hashCode() : 0;
        RequestBody requestBody8 = this.read;
        int hashCode9 = requestBody8 != null ? requestBody8.hashCode() : 0;
        RequestBody requestBody9 = this.write;
        int hashCode10 = requestBody9 != null ? requestBody9.hashCode() : 0;
        String str = this.RatingCompat;
        int hashCode11 = str != null ? str.hashCode() : 0;
        String str2 = this.ParcelableVolumeInfo;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LivenessCheckRequest(ndidType=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", requestId=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", imageFormat=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", imageData=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", imageHeight=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", imageWidth=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", imageCropCoordinateX=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", imageCropCoordinateY=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", imageCropWidth=");
        sb.append(this.read);
        sb.append(", imageCropHeight=");
        sb.append(this.write);
        sb.append(", imageHash=");
        sb.append(this.RatingCompat);
        sb.append(", timestamp=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(")");
        return sb.toString();
    }

    public valueComparator(RequestBody requestBody, RequestBody requestBody2, RequestBody requestBody3, MultipartBody.Part part, RequestBody requestBody4, RequestBody requestBody5, RequestBody requestBody6, RequestBody requestBody7, RequestBody requestBody8, RequestBody requestBody9, String str, String str2) {
        onGetStartedClick.write((Object) requestBody, "ndidType");
        onGetStartedClick.write((Object) requestBody3, "imageFormat");
        onGetStartedClick.write((Object) part, "imageData");
        onGetStartedClick.write((Object) requestBody4, "imageHeight");
        onGetStartedClick.write((Object) requestBody5, "imageWidth");
        onGetStartedClick.write((Object) requestBody6, "imageCropCoordinateX");
        onGetStartedClick.write((Object) requestBody7, "imageCropCoordinateY");
        onGetStartedClick.write((Object) requestBody8, "imageCropWidth");
        onGetStartedClick.write((Object) requestBody9, "imageCropHeight");
        this.MediaMetadataCompat = requestBody;
        this.MediaSessionCompat$Token = requestBody2;
        this.MediaBrowserCompat$MediaItem = requestBody3;
        this.MediaBrowserCompat$ItemReceiver = part;
        this.MediaBrowserCompat$SearchResultReceiver = requestBody4;
        this.MediaDescriptionCompat = requestBody5;
        this.MediaBrowserCompat$CustomActionResultReceiver = requestBody6;
        this.IconCompatParcelizer = requestBody7;
        this.read = requestBody8;
        this.write = requestBody9;
        this.RatingCompat = str;
        this.ParcelableVolumeInfo = str2;
    }
}

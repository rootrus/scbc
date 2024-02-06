package p040o;

import com.google.gson.annotations.SerializedName;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* renamed from: o.expireAfterAccess */
public final class expireAfterAccess {
    @SerializedName("imageCropCoordinateY")
    public final RequestBody IconCompatParcelizer;
    @SerializedName("imageData")
    public final MultipartBody.Part MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("imageCropHeight")
    public final RequestBody MediaBrowserCompat$ItemReceiver;
    @SerializedName("imageFormat")
    public final RequestBody MediaBrowserCompat$MediaItem;
    @SerializedName("imageHeight")
    public final RequestBody MediaDescriptionCompat;
    @SerializedName("imageWidth")
    public final RequestBody MediaMetadataCompat;
    @SerializedName("imageCropCoordinateX")
    public final RequestBody read;
    @SerializedName("imageCropWidth")
    public final RequestBody write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof expireAfterAccess)) {
            return false;
        }
        expireAfterAccess expireafteraccess = (expireAfterAccess) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) expireafteraccess.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) expireafteraccess.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) expireafteraccess.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) expireafteraccess.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) expireafteraccess.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) expireafteraccess.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) expireafteraccess.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) expireafteraccess.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        RequestBody requestBody = this.MediaBrowserCompat$MediaItem;
        int i = 0;
        int hashCode = requestBody != null ? requestBody.hashCode() : 0;
        MultipartBody.Part part = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = part != null ? part.hashCode() : 0;
        RequestBody requestBody2 = this.MediaDescriptionCompat;
        int hashCode3 = requestBody2 != null ? requestBody2.hashCode() : 0;
        RequestBody requestBody3 = this.MediaMetadataCompat;
        int hashCode4 = requestBody3 != null ? requestBody3.hashCode() : 0;
        RequestBody requestBody4 = this.read;
        int hashCode5 = requestBody4 != null ? requestBody4.hashCode() : 0;
        RequestBody requestBody5 = this.IconCompatParcelizer;
        int hashCode6 = requestBody5 != null ? requestBody5.hashCode() : 0;
        RequestBody requestBody6 = this.write;
        int hashCode7 = requestBody6 != null ? requestBody6.hashCode() : 0;
        RequestBody requestBody7 = this.MediaBrowserCompat$ItemReceiver;
        if (requestBody7 != null) {
            i = requestBody7.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TouchPointLivenessCheckRequest(imageFormat=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", imageData=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", imageHeight=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", imageWidth=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", imageCropCoordinateX=");
        sb.append(this.read);
        sb.append(", imageCropCoordinateY=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", imageCropWidth=");
        sb.append(this.write);
        sb.append(", imageCropHeight=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public expireAfterAccess(RequestBody requestBody, MultipartBody.Part part, RequestBody requestBody2, RequestBody requestBody3, RequestBody requestBody4, RequestBody requestBody5, RequestBody requestBody6, RequestBody requestBody7) {
        onGetStartedClick.write((Object) requestBody, "imageFormat");
        onGetStartedClick.write((Object) part, "imageData");
        onGetStartedClick.write((Object) requestBody2, "imageHeight");
        onGetStartedClick.write((Object) requestBody3, "imageWidth");
        onGetStartedClick.write((Object) requestBody4, "imageCropCoordinateX");
        onGetStartedClick.write((Object) requestBody5, "imageCropCoordinateY");
        onGetStartedClick.write((Object) requestBody6, "imageCropWidth");
        onGetStartedClick.write((Object) requestBody7, "imageCropHeight");
        this.MediaBrowserCompat$MediaItem = requestBody;
        this.MediaBrowserCompat$CustomActionResultReceiver = part;
        this.MediaDescriptionCompat = requestBody2;
        this.MediaMetadataCompat = requestBody3;
        this.read = requestBody4;
        this.IconCompatParcelizer = requestBody5;
        this.write = requestBody6;
        this.MediaBrowserCompat$ItemReceiver = requestBody7;
    }

    /* renamed from: o.expireAfterAccess$write */
    public static final class write implements findFragmentByWho {
        private final /* synthetic */ setNonInteraction IconCompatParcelizer;

        private write() {
        }

        public /* synthetic */ write(setNonInteraction setnoninteraction) {
            this.IconCompatParcelizer = setnoninteraction;
        }

        public final Object IconCompatParcelizer(Object obj) {
            Utils utils = (Utils) obj;
            return new setOnIndoorStateChangeListener(utils.IconCompatParcelizer, utils.MediaBrowserCompat$ItemReceiver, utils.read, utils.RatingCompat, utils.write, utils.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }
}

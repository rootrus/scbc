package p040o;

/* renamed from: o.HttpMethod */
public final class HttpMethod {
    public final int IconCompatParcelizer;
    public final int MediaBrowserCompat$CustomActionResultReceiver;
    public final int MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final int RatingCompat;
    public final int read;
    public final int write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpMethod)) {
            return false;
        }
        HttpMethod httpMethod = (HttpMethod) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) httpMethod.MediaBrowserCompat$SearchResultReceiver) && this.IconCompatParcelizer == httpMethod.IconCompatParcelizer && this.RatingCompat == httpMethod.RatingCompat && this.write == httpMethod.write && this.MediaBrowserCompat$ItemReceiver == httpMethod.MediaBrowserCompat$ItemReceiver && this.read == httpMethod.read && this.MediaBrowserCompat$CustomActionResultReceiver == httpMethod.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$SearchResultReceiver;
        return ((((((((((((str != null ? str.hashCode() : 0) * 31) + this.IconCompatParcelizer) * 31) + this.RatingCompat) * 31) + this.write) * 31) + this.MediaBrowserCompat$ItemReceiver) * 31) + this.read) * 31) + this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TouchPointLivenessModel(imagePath=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", imageHeight=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", imageWidth=");
        sb.append(this.RatingCompat);
        sb.append(", imageCropWidth=");
        sb.append(this.write);
        sb.append(", imageCropHeight=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", imageCropCoordinateX=");
        sb.append(this.read);
        sb.append(", imageCropCoordinateY=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public HttpMethod(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        onGetStartedClick.write((Object) str, "imagePath");
        this.MediaBrowserCompat$SearchResultReceiver = str;
        this.IconCompatParcelizer = i;
        this.RatingCompat = i2;
        this.write = i3;
        this.MediaBrowserCompat$ItemReceiver = i4;
        this.read = i5;
        this.MediaBrowserCompat$CustomActionResultReceiver = i6;
    }
}

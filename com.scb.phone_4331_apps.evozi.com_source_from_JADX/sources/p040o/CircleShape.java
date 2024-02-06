package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.CircleShape */
public final class CircleShape {
    @SerializedName("businessRegistrationNo")
    public final getPosition IconCompatParcelizer;
    @SerializedName("marketplaceUrl")
    public final getSkewAngle MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("businessOnLease")
    public final getPosition MediaBrowserCompat$ItemReceiver;
    @SerializedName("validationConfig")
    public final getPositions read;
    @SerializedName("businessUrl")
    public final getPosition write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CircleShape)) {
            return false;
        }
        CircleShape circleShape = (CircleShape) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) circleShape.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) circleShape.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) circleShape.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) circleShape.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) circleShape.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        getPositions getpositions = this.read;
        int i = 0;
        int hashCode = getpositions != null ? getpositions.hashCode() : 0;
        getPosition getposition = this.IconCompatParcelizer;
        int hashCode2 = getposition != null ? getposition.hashCode() : 0;
        getPosition getposition2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = getposition2 != null ? getposition2.hashCode() : 0;
        getPosition getposition3 = this.write;
        int hashCode4 = getposition3 != null ? getposition3.hashCode() : 0;
        getSkewAngle getskewangle = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getskewangle != null) {
            i = getskewangle.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlBusinessURLInfoEntity(validationConfig=");
        sb.append(this.read);
        sb.append(", businessRegistrationNo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", businessOnLease=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", businessUrl=");
        sb.append(this.write);
        sb.append(", marketplaceUrl=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

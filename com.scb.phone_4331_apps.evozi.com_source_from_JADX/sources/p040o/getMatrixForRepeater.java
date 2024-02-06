package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getMatrixForRepeater */
public final class getMatrixForRepeater {
    @SerializedName("application")
    public final setIsDiscrete IconCompatParcelizer;
    @SerializedName("simulator")
    public final FontCharacter MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getMatrixForRepeater)) {
            return false;
        }
        getMatrixForRepeater getmatrixforrepeater = (getMatrixForRepeater) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getmatrixforrepeater.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getmatrixforrepeater.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        setIsDiscrete setisdiscrete = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = setisdiscrete != null ? setisdiscrete.hashCode() : 0;
        FontCharacter fontCharacter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fontCharacter != null) {
            i = fontCharacter.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlLandingEntity(application=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", simulator=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

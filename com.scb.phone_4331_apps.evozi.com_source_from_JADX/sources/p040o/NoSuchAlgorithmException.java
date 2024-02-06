package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.NoSuchAlgorithmException */
public final class NoSuchAlgorithmException extends setCurrentItemInternal {
    @SerializedName("securitiesList")
    private final JsonProcessingException read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof NoSuchAlgorithmException) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((NoSuchAlgorithmException) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        JsonProcessingException jsonProcessingException = this.read;
        if (jsonProcessingException != null) {
            return jsonProcessingException.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SecuritiesEntity(securitiesList=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}

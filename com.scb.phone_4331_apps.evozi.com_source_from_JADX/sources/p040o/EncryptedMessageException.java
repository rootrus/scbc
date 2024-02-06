package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.EncryptedMessageException */
public final class EncryptedMessageException {
    @SerializedName("currentAddress")
    public final Registry$NoModelLoaderAvailableException write;

    public EncryptedMessageException() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof EncryptedMessageException) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((EncryptedMessageException) obj).write);
        }
        return true;
    }

    public final int hashCode() {
        Registry$NoModelLoaderAvailableException registry$NoModelLoaderAvailableException = this.write;
        if (registry$NoModelLoaderAvailableException != null) {
            return registry$NoModelLoaderAvailableException.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserAddressEntity(currentAddress=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    private EncryptedMessageException(Registry$NoModelLoaderAvailableException registry$NoModelLoaderAvailableException) {
        this.write = null;
    }

    private /* synthetic */ EncryptedMessageException(byte b) {
        this((Registry$NoModelLoaderAvailableException) null);
    }
}

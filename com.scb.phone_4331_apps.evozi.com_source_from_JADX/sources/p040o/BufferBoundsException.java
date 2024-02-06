package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.BufferBoundsException */
public final class BufferBoundsException {
    @SerializedName("code")
    private final String IconCompatParcelizer;
    @SerializedName("description")
    private final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BufferBoundsException)) {
            return false;
        }
        BufferBoundsException bufferBoundsException = (BufferBoundsException) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) bufferBoundsException.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) bufferBoundsException.read);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductTypeEntity(code=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", description=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}

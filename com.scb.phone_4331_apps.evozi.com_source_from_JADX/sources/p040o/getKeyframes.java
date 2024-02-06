package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getKeyframes */
public final class getKeyframes {
    @SerializedName("minIncome")
    public final int IconCompatParcelizer;
    @SerializedName("customerContactInfo")
    public final MutablePair MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("applicationUuid")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getKeyframes)) {
            return false;
        }
        getKeyframes getkeyframes = (getKeyframes) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getkeyframes.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getkeyframes.MediaBrowserCompat$CustomActionResultReceiver) && this.IconCompatParcelizer == getkeyframes.IconCompatParcelizer;
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        MutablePair mutablePair = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (mutablePair != null) {
            i = mutablePair.hashCode();
        }
        return (((hashCode * 31) + i) * 31) + this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NTBContactInfoDataEntity(applicationUuid=");
        sb.append(this.read);
        sb.append(", customerContactInfo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", minIncome=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}

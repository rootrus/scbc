package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.standardHashCode */
public final class standardHashCode {
    @SerializedName("EN")
    private final standardLastIndexOf MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("TH")
    private final standardLastIndexOf write;

    public standardHashCode() {
        this((standardLastIndexOf) null, (standardLastIndexOf) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof standardHashCode)) {
            return false;
        }
        standardHashCode standardhashcode = (standardHashCode) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) standardhashcode.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) standardhashcode.write);
    }

    public final int hashCode() {
        standardLastIndexOf standardlastindexof = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = standardlastindexof != null ? standardlastindexof.hashCode() : 0;
        standardLastIndexOf standardlastindexof2 = this.write;
        if (standardlastindexof2 != null) {
            i = standardlastindexof2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Addresses(addressEN=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", addressTH=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    private standardHashCode(standardLastIndexOf standardlastindexof, standardLastIndexOf standardlastindexof2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = standardlastindexof;
        this.write = standardlastindexof2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ standardHashCode(standardLastIndexOf standardlastindexof, standardLastIndexOf standardlastindexof2, int i) {
        this((i & 1) != 0 ? null : standardlastindexof, (i & 2) != 0 ? null : standardlastindexof2);
    }
}

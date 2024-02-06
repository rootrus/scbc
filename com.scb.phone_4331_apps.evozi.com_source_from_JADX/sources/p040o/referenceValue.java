package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.referenceValue */
public final class referenceValue {
    @SerializedName("workingCapital")
    private final String IconCompatParcelizer;
    @SerializedName("businessExpansion")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof referenceValue)) {
            return false;
        }
        referenceValue referencevalue = (referenceValue) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) referencevalue.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) referencevalue.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlLoanPurposeRequest(businessExpansion=");
        sb.append(this.write);
        sb.append(", workingCapital=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public referenceValue(String str, String str2) {
        onGetStartedClick.write((Object) str, "businessExpansion");
        onGetStartedClick.write((Object) str2, "workingCapital");
        this.write = str;
        this.IconCompatParcelizer = str2;
    }
}

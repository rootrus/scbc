package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.createSubset */
public final class createSubset {
    @SerializedName("answerSection3")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("answerSection2")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createSubset)) {
            return false;
        }
        createSubset createsubset = (createSubset) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) createsubset.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) createsubset.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SuitabilitiesValidationRequest(answerSection2=");
        sb.append(this.write);
        sb.append(", answerSection3=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public createSubset(String str, String str2) {
        onGetStartedClick.write((Object) str, "answerSection2");
        onGetStartedClick.write((Object) str2, "answerSection3");
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }
}

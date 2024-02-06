package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.BlankDummyActivity */
public final class BlankDummyActivity extends setCurrentItemInternal {
    @SerializedName("additionalMetaData")
    public final LocalizationActivity IconCompatParcelizer;
    @SerializedName("privacyType")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("sortSequence")
    public final int MediaBrowserCompat$ItemReceiver;
    @SerializedName("label")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlankDummyActivity)) {
            return false;
        }
        BlankDummyActivity blankDummyActivity = (BlankDummyActivity) obj;
        return this.MediaBrowserCompat$ItemReceiver == blankDummyActivity.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) blankDummyActivity.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) blankDummyActivity.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) blankDummyActivity.IconCompatParcelizer);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$ItemReceiver;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        LocalizationActivity localizationActivity = this.IconCompatParcelizer;
        if (localizationActivity != null) {
            i2 = localizationActivity.hashCode();
        }
        return (((((i * 31) + hashCode) * 31) + hashCode2) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrivacyEntity(sortSequence=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", privacyType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", label=");
        sb.append(this.write);
        sb.append(", additionalMetaData=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}

package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.AnimatablePathValue */
public final class AnimatablePathValue {
    @SerializedName("companyName")
    public final String IconCompatParcelizer;
    @SerializedName("customerGroupCode")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("companyPhone")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("workAddress")
    public final PolystarContent MediaBrowserCompat$MediaItem;
    @SerializedName("sourceOfIncome")
    public final AnimatableTextFrame MediaDescriptionCompat;
    @SerializedName("occupation")
    public final AnimatableIntegerValue MediaMetadataCompat;
    @SerializedName("companyId")
    public final String read;
    @SerializedName("employmentExperience")
    public final packageinfo write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimatablePathValue)) {
            return false;
        }
        AnimatablePathValue animatablePathValue = (AnimatablePathValue) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) animatablePathValue.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) animatablePathValue.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) animatablePathValue.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) animatablePathValue.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) animatablePathValue.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) animatablePathValue.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) animatablePathValue.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) animatablePathValue.write);
    }

    public final int hashCode() {
        AnimatableIntegerValue animatableIntegerValue = this.MediaMetadataCompat;
        int i = 0;
        int hashCode = animatableIntegerValue != null ? animatableIntegerValue.hashCode() : 0;
        AnimatableTextFrame animatableTextFrame = this.MediaDescriptionCompat;
        int hashCode2 = animatableTextFrame != null ? animatableTextFrame.hashCode() : 0;
        String str = this.read;
        int hashCode3 = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode4 = str2 != null ? str2.hashCode() : 0;
        PolystarContent polystarContent = this.MediaBrowserCompat$MediaItem;
        int hashCode5 = polystarContent != null ? polystarContent.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode7 = str4 != null ? str4.hashCode() : 0;
        packageinfo r8 = this.write;
        if (r8 != null) {
            i = r8.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OccupationInfoEntity(occupation=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", sourceOfIncome=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", companyId=");
        sb.append(this.read);
        sb.append(", companyName=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", workAddress=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", companyPhone=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", customerGroupCode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", experience=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public AnimatablePathValue(AnimatableIntegerValue animatableIntegerValue, AnimatableTextFrame animatableTextFrame, String str, String str2, PolystarContent polystarContent, String str3, String str4, packageinfo r9) {
        onGetStartedClick.write((Object) animatableTextFrame, "sourceOfIncome");
        onGetStartedClick.write((Object) r9, "experience");
        this.MediaMetadataCompat = animatableIntegerValue;
        this.MediaDescriptionCompat = animatableTextFrame;
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$MediaItem = polystarContent;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.write = r9;
    }
}

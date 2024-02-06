package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.skipToEndOfBlockComment */
public final class skipToEndOfBlockComment {
    @SerializedName("classificationId")
    public final String IconCompatParcelizer;
    @SerializedName("descriptionTH")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("code")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("remarksEN")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("sortSequence")
    public final int MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("schemeId")
    public final String MediaDescriptionCompat;
    @SerializedName("remarksTH")
    public final String RatingCompat;
    @SerializedName("parentId")
    public final String read;
    @SerializedName("descriptionEN")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skipToEndOfBlockComment)) {
            return false;
        }
        skipToEndOfBlockComment skiptoendofblockcomment = (skipToEndOfBlockComment) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) skiptoendofblockcomment.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) skiptoendofblockcomment.MediaBrowserCompat$ItemReceiver) && this.MediaBrowserCompat$SearchResultReceiver == skiptoendofblockcomment.MediaBrowserCompat$SearchResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) skiptoendofblockcomment.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) skiptoendofblockcomment.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) skiptoendofblockcomment.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) skiptoendofblockcomment.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) skiptoendofblockcomment.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) skiptoendofblockcomment.read);
    }

    public final int hashCode() {
        String str = this.MediaDescriptionCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = this.MediaBrowserCompat$SearchResultReceiver;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.RatingCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$MediaItem;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.IconCompatParcelizer;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.read;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + i2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CategoryEntity(schemeId=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", code=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", sortSequence=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", descriptionTH=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", descriptionEN=");
        sb.append(this.write);
        sb.append(", remarksTH=");
        sb.append(this.RatingCompat);
        sb.append(", remarksEN=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", classificationId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", parentId=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}

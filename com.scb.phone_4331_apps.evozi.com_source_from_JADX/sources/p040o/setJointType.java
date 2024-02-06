package p040o;

import java.util.List;

/* renamed from: o.setJointType */
public final class setJointType {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    private final String MediaBrowserCompat$MediaItem;
    private final String MediaBrowserCompat$SearchResultReceiver;
    public final Integer MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final String RatingCompat;
    public final List<setEndCap> read;
    public final setClickable write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setJointType)) {
            return false;
        }
        setJointType setjointtype = (setJointType) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setjointtype.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) setjointtype.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setjointtype.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setjointtype.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setjointtype.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setjointtype.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setjointtype.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setjointtype.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setjointtype.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setjointtype.RatingCompat);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$MediaItem;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        Integer num = this.MediaDescriptionCompat;
        int hashCode3 = num != null ? num.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaMetadataCompat;
        int hashCode7 = str6 != null ? str6.hashCode() : 0;
        setClickable setclickable = this.write;
        int hashCode8 = setclickable != null ? setclickable.hashCode() : 0;
        List<setEndCap> list = this.read;
        int hashCode9 = list != null ? list.hashCode() : 0;
        String str7 = this.RatingCompat;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CSentInquiry(consentSessionId=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", consentSessionTransactionId=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", sequence=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", consentType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", consentSubType=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", consentVersion=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", webUrl=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", contentUrl=");
        sb.append(this.write);
        sb.append(", listContentScopes=");
        sb.append(this.read);
        sb.append(", label=");
        sb.append(this.RatingCompat);
        sb.append(")");
        return sb.toString();
    }

    public setJointType(String str, String str2, Integer num, String str3, String str4, String str5, String str6, setClickable setclickable, List<setEndCap> list, String str7) {
        onGetStartedClick.write((Object) str3, "consentType");
        onGetStartedClick.write((Object) str7, "label");
        this.MediaBrowserCompat$MediaItem = str;
        this.MediaBrowserCompat$SearchResultReceiver = str2;
        this.MediaDescriptionCompat = num;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.IconCompatParcelizer = str4;
        this.MediaBrowserCompat$ItemReceiver = str5;
        this.MediaMetadataCompat = str6;
        this.write = setclickable;
        this.read = list;
        this.RatingCompat = str7;
    }
}

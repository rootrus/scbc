package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setDividerDrawableHorizontal */
public class setDividerDrawableHorizontal {
    @SerializedName("effectiveDate")
    public String IconCompatParcelizer;
    @SerializedName("createdDate")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("endDate")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("scheduleDetailId")
    public int MediaBrowserCompat$MediaItem;
    @SerializedName("scheduleType")
    public String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("scheduleMainId")
    public String MediaDescriptionCompat;
    @SerializedName("sortSequence")
    public int MediaMetadataCompat;
    @SerializedName("subFunction")
    public String MediaSessionCompat$ResultReceiverWrapper;
    @SerializedName("verificationRequest")
    public setDividerDrawableVertical MediaSessionCompat$Token;
    @SerializedName("verificationResponse")
    public FlexboxLayout ParcelableVolumeInfo;
    @SerializedName("startDate")
    public String RatingCompat;
    @SerializedName("function")
    public setOnPageChangeListener read;
    @SerializedName("dayOfMonth")
    public int write;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setDividerDrawableHorizontal setdividerdrawablehorizontal = (setDividerDrawableHorizontal) obj;
        if (this.MediaMetadataCompat != setdividerdrawablehorizontal.MediaMetadataCompat || this.MediaBrowserCompat$MediaItem != setdividerdrawablehorizontal.MediaBrowserCompat$MediaItem || this.write != setdividerdrawablehorizontal.write) {
            return false;
        }
        String str = this.MediaDescriptionCompat;
        if (str == null ? setdividerdrawablehorizontal.MediaDescriptionCompat != null : !str.equals(setdividerdrawablehorizontal.MediaDescriptionCompat)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str2 == null ? setdividerdrawablehorizontal.MediaBrowserCompat$SearchResultReceiver != null : !str2.equals(setdividerdrawablehorizontal.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        setOnPageChangeListener setonpagechangelistener = this.read;
        if (setonpagechangelistener == null ? setdividerdrawablehorizontal.read != null : !setonpagechangelistener.equals(setdividerdrawablehorizontal.read)) {
            return false;
        }
        String str3 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str3 == null ? setdividerdrawablehorizontal.MediaSessionCompat$ResultReceiverWrapper != null : !str3.equals(setdividerdrawablehorizontal.MediaSessionCompat$ResultReceiverWrapper)) {
            return false;
        }
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str4 == null ? setdividerdrawablehorizontal.MediaBrowserCompat$CustomActionResultReceiver != null : !str4.equals(setdividerdrawablehorizontal.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str5 = this.RatingCompat;
        if (str5 == null ? setdividerdrawablehorizontal.RatingCompat != null : !str5.equals(setdividerdrawablehorizontal.RatingCompat)) {
            return false;
        }
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        if (str6 == null ? setdividerdrawablehorizontal.MediaBrowserCompat$ItemReceiver != null : !str6.equals(setdividerdrawablehorizontal.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str7 = this.IconCompatParcelizer;
        if (str7 == null ? setdividerdrawablehorizontal.IconCompatParcelizer != null : !str7.equals(setdividerdrawablehorizontal.IconCompatParcelizer)) {
            return false;
        }
        setDividerDrawableVertical setdividerdrawablevertical = this.MediaSessionCompat$Token;
        if (setdividerdrawablevertical == null ? setdividerdrawablehorizontal.MediaSessionCompat$Token != null : !setdividerdrawablevertical.equals(setdividerdrawablehorizontal.MediaSessionCompat$Token)) {
            return false;
        }
        FlexboxLayout flexboxLayout = this.ParcelableVolumeInfo;
        FlexboxLayout flexboxLayout2 = setdividerdrawablehorizontal.ParcelableVolumeInfo;
        if (flexboxLayout != null) {
            return flexboxLayout.equals(flexboxLayout2);
        }
        if (flexboxLayout2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.MediaMetadataCompat;
        String str = this.MediaDescriptionCompat;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        int i3 = this.MediaBrowserCompat$MediaItem;
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        setOnPageChangeListener setonpagechangelistener = this.read;
        int hashCode3 = setonpagechangelistener != null ? setonpagechangelistener.hashCode() : 0;
        String str3 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        int i4 = this.write;
        String str5 = this.RatingCompat;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode7 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.IconCompatParcelizer;
        int hashCode8 = str7 != null ? str7.hashCode() : 0;
        setDividerDrawableVertical setdividerdrawablevertical = this.MediaSessionCompat$Token;
        int hashCode9 = setdividerdrawablevertical != null ? setdividerdrawablevertical.hashCode() : 0;
        FlexboxLayout flexboxLayout = this.ParcelableVolumeInfo;
        if (flexboxLayout != null) {
            i2 = flexboxLayout.hashCode();
        }
        return (((((((((((((((((((((((i * 31) + hashCode) * 31) + i3) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i4) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i2;
    }
}

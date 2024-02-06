package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import p040o.BinaryImagesConverter;

/* renamed from: o.isLeaf */
public final class isLeaf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new isLeaf$MediaBrowserCompat$ItemReceiver();
    public String IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver;
    public NativeFileUtils MediaBrowserCompat$MediaItem;
    public BinaryImagesConverter.FileIdStrategy MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public BinaryImagesConverter.FileIdStrategy RatingCompat;
    public String read;
    public String write;

    public isLeaf() {
        this((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isLeaf)) {
            return false;
        }
        isLeaf isleaf = (isLeaf) obj;
        return this.MediaBrowserCompat$CustomActionResultReceiver == isleaf.MediaBrowserCompat$CustomActionResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) isleaf.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) isleaf.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) isleaf.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) isleaf.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) isleaf.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) isleaf.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) isleaf.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) isleaf.MediaDescriptionCompat) && this.MediaBrowserCompat$ItemReceiver == isleaf.MediaBrowserCompat$ItemReceiver;
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        BinaryImagesConverter.FileIdStrategy fileIdStrategy = this.RatingCompat;
        int i = 0;
        int hashCode = fileIdStrategy != null ? fileIdStrategy.hashCode() : 0;
        BinaryImagesConverter.FileIdStrategy fileIdStrategy2 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode2 = fileIdStrategy2 != null ? fileIdStrategy2.hashCode() : 0;
        NativeFileUtils nativeFileUtils = this.MediaBrowserCompat$MediaItem;
        int hashCode3 = nativeFileUtils != null ? nativeFileUtils.hashCode() : 0;
        String str = this.IconCompatParcelizer;
        int hashCode4 = str != null ? str.hashCode() : 0;
        String str2 = this.MediaMetadataCompat;
        int hashCode5 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode6 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode7 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaDescriptionCompat;
        if (str5 != null) {
            i = str5.hashCode();
        }
        boolean z3 = this.MediaBrowserCompat$ItemReceiver;
        if (!z3) {
            z2 = z3;
        }
        return ((((((((((((((((((z ? 1 : 0) * true) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i) * 31) + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ThirdPartyBodyDisplay(isSeparatorVisible=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", paddingTop=");
        sb.append(this.RatingCompat);
        sb.append(", paddingBottom=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", type=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", label=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", value=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", description=");
        sb.append(this.read);
        sb.append(", image=");
        sb.append(this.write);
        sb.append(", qrString=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", isHiddenInSlip=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(this.MediaBrowserCompat$CustomActionResultReceiver ? 1 : 0);
        parcel.writeString(this.RatingCompat.name());
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver.name());
        parcel.writeString(this.MediaBrowserCompat$MediaItem.name());
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.read);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver ? 1 : 0);
    }

    public isLeaf(boolean z, BinaryImagesConverter.FileIdStrategy fileIdStrategy, BinaryImagesConverter.FileIdStrategy fileIdStrategy2, NativeFileUtils nativeFileUtils, String str, String str2, String str3, String str4, String str5, boolean z2) {
        onGetStartedClick.write((Object) fileIdStrategy, "paddingTop");
        onGetStartedClick.write((Object) fileIdStrategy2, "paddingBottom");
        onGetStartedClick.write((Object) nativeFileUtils, "type");
        onGetStartedClick.write((Object) str, "label");
        onGetStartedClick.write((Object) str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        onGetStartedClick.write((Object) str3, "description");
        onGetStartedClick.write((Object) str4, "image");
        onGetStartedClick.write((Object) str5, "qrString");
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        this.RatingCompat = fileIdStrategy;
        this.MediaBrowserCompat$SearchResultReceiver = fileIdStrategy2;
        this.MediaBrowserCompat$MediaItem = nativeFileUtils;
        this.IconCompatParcelizer = str;
        this.MediaMetadataCompat = str2;
        this.read = str3;
        this.write = str4;
        this.MediaDescriptionCompat = str5;
        this.MediaBrowserCompat$ItemReceiver = z2;
    }

    private /* synthetic */ isLeaf(byte b) {
        this(false, BinaryImagesConverter.FileIdStrategy.SMALL, BinaryImagesConverter.FileIdStrategy.SMALL, NativeFileUtils.TEXT, "", "", "", "", "", false);
    }
}

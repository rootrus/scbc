package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import org.bouncycastle.i18n.MessageBundle;

/* renamed from: o.isCrashed */
public final class isCrashed implements ForwardingListenableFuture, Parcelable {
    public static final Parcelable.Creator CREATOR = new IconCompatParcelizer();
    private final String IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    private final int MediaBrowserCompat$SearchResultReceiver;
    private final String MediaDescriptionCompat;
    public final String read;
    public final String write;

    /* renamed from: o.isCrashed$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new isCrashed(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new isCrashed[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeInt(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
    }

    public isCrashed(String str, String str2, String str3, int i, String str4, String str5, String str6) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) str2, "description");
        onGetStartedClick.write((Object) str3, "imagePath");
        onGetStartedClick.write((Object) str4, "adsId");
        onGetStartedClick.write((Object) str5, "adsName");
        onGetStartedClick.write((Object) str6, "deepLinkUrl");
        this.MediaDescriptionCompat = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.IconCompatParcelizer = str3;
        this.MediaBrowserCompat$SearchResultReceiver = i;
        this.write = str4;
        this.MediaBrowserCompat$ItemReceiver = str5;
        this.read = str6;
    }

    public final String IconCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    public /* synthetic */ isCrashed(String str, int i, String str2, String str3, String str4) {
        this("", "", str, i, str2, str3, str4);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        return this.IconCompatParcelizer;
    }

    public final int read() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isCrashed)) {
            return false;
        }
        isCrashed iscrashed = (isCrashed) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) iscrashed.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) iscrashed.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) iscrashed.IconCompatParcelizer) && this.MediaBrowserCompat$SearchResultReceiver == iscrashed.MediaBrowserCompat$SearchResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) iscrashed.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) iscrashed.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) iscrashed.read);
    }

    public final int hashCode() {
        String str = this.MediaDescriptionCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        int i2 = this.MediaBrowserCompat$SearchResultReceiver;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.read;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i2) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PartnerHighlightDisplay(title=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", description=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", imagePath=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", placeholderPath=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", adsId=");
        sb.append(this.write);
        sb.append(", adsName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", deepLinkUrl=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}

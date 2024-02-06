package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.registerAnalyticsListener */
public final class registerAnalyticsListener implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IconCompatParcelizer();
    public final Boolean IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    /* renamed from: o.registerAnalyticsListener$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Boolean bool;
            onGetStartedClick.write((Object) parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            return new registerAnalyticsListener(readString, readString2, bool, parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new registerAnalyticsListener[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof registerAnalyticsListener)) {
            return false;
        }
        registerAnalyticsListener registeranalyticslistener = (registerAnalyticsListener) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) registeranalyticslistener.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) registeranalyticslistener.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) registeranalyticslistener.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) registeranalyticslistener.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) registeranalyticslistener.write);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        Boolean bool = this.IconCompatParcelizer;
        int hashCode3 = bool != null ? bool.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlOutcomeResubmissionDisplay(date=");
        sb.append(this.read);
        sb.append(", state=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", isRequireConsent=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", documentType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", subConsentType=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean z;
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        Boolean bool = this.IconCompatParcelizer;
        if (bool != null) {
            parcel.writeInt(1);
            z = bool.booleanValue();
        } else {
            z = false;
        }
        parcel.writeInt(z ? 1 : 0);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.write);
    }

    public registerAnalyticsListener(String str, String str2, Boolean bool, String str3, String str4) {
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.IconCompatParcelizer = bool;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.write = str4;
    }
}

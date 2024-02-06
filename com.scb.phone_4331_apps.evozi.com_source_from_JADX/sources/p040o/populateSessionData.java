package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.populateSessionData */
public final class populateSessionData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new write();
    public List<String> IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$SearchResultReceiver;
    public Double MediaMetadataCompat;
    public String read;
    public String write;

    /* renamed from: o.populateSessionData$write */
    public static final class write implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new populateSessionData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        public final Object[] newArray(int i) {
            return new populateSessionData[i];
        }
    }

    public populateSessionData() {
        this((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof populateSessionData)) {
            return false;
        }
        populateSessionData populatesessiondata = (populateSessionData) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) populatesessiondata.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) populatesessiondata.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) populatesessiondata.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) populatesessiondata.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) populatesessiondata.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) populatesessiondata.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) populatesessiondata.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        Double d = this.MediaMetadataCompat;
        int hashCode4 = d != null ? d.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        List<String> list = this.IconCompatParcelizer;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DiscoverFundDisplay(fundCode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", fundName=");
        sb.append(this.write);
        sb.append(", brokerShortName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", yield=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", yieldFormatted=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", asOfDate=");
        sb.append(this.read);
        sb.append(", tags=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        Double d = this.MediaMetadataCompat;
        if (d != null) {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.read);
        parcel.writeStringList(this.IconCompatParcelizer);
    }

    public populateSessionData(String str, String str2, String str3, Double d, String str4, String str5, List<String> list) {
        onGetStartedClick.write((Object) str, "fundCode");
        onGetStartedClick.write((Object) str2, "fundName");
        onGetStartedClick.write((Object) str3, "brokerShortName");
        onGetStartedClick.write((Object) str4, "yieldFormatted");
        onGetStartedClick.write((Object) str5, "asOfDate");
        onGetStartedClick.write((Object) list, "tags");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.MediaMetadataCompat = d;
        this.MediaBrowserCompat$SearchResultReceiver = str4;
        this.read = str5;
        this.IconCompatParcelizer = list;
    }

    public /* synthetic */ populateSessionData(byte b) {
        this("", "", "", (Double) null, "", "", HmlNationalIdActivity.IconCompatParcelizer);
    }
}

package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.setCrashlyticsDataCollectionEnabled */
public final class setCrashlyticsDataCollectionEnabled implements Parcelable {
    public static final Parcelable.Creator CREATOR = new write();
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final boolean MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final double MediaBrowserCompat$SearchResultReceiver;
    public final String MediaDescriptionCompat;
    public final List<grantDataCollectionPermission> read;
    public final String write;

    /* renamed from: o.setCrashlyticsDataCollectionEnabled$write */
    public static final class write implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            onGetStartedClick.write((Object) parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            double readDouble = parcel.readDouble();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList2.add((grantDataCollectionPermission) grantDataCollectionPermission.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            return new setCrashlyticsDataCollectionEnabled(readString, readString2, readDouble, readString3, readString4, z, readString5, arrayList);
        }

        public final Object[] newArray(int i) {
            return new setCrashlyticsDataCollectionEnabled[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setCrashlyticsDataCollectionEnabled)) {
            return false;
        }
        setCrashlyticsDataCollectionEnabled setcrashlyticsdatacollectionenabled = (setCrashlyticsDataCollectionEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setcrashlyticsdatacollectionenabled.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setcrashlyticsdatacollectionenabled.write) && Double.compare(this.MediaBrowserCompat$SearchResultReceiver, setcrashlyticsdatacollectionenabled.MediaBrowserCompat$SearchResultReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setcrashlyticsdatacollectionenabled.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setcrashlyticsdatacollectionenabled.MediaBrowserCompat$MediaItem) && this.MediaBrowserCompat$ItemReceiver == setcrashlyticsdatacollectionenabled.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setcrashlyticsdatacollectionenabled.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setcrashlyticsdatacollectionenabled.read);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$SearchResultReceiver);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        String str3 = this.MediaDescriptionCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$MediaItem;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        if (z) {
            z = true;
        }
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        List<grantDataCollectionPermission> list = this.read;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + i2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (z ? 1 : 0)) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TopItemDisplay(fundCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", shortBrokerName=");
        sb.append(this.write);
        sb.append(", yield=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", yieldFormatted=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", yieldDate=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", otherChannelFlag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", assetType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", tags=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.write);
        parcel.writeDouble(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver ? 1 : 0);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        List<grantDataCollectionPermission> list = this.read;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (grantDataCollectionPermission writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }

    public setCrashlyticsDataCollectionEnabled(String str, String str2, double d, String str3, String str4, boolean z, String str5, List<grantDataCollectionPermission> list) {
        onGetStartedClick.write((Object) str, "fundCode");
        onGetStartedClick.write((Object) str2, "shortBrokerName");
        onGetStartedClick.write((Object) str3, "yieldFormatted");
        onGetStartedClick.write((Object) str4, "yieldDate");
        onGetStartedClick.write((Object) str5, "assetType");
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.MediaBrowserCompat$SearchResultReceiver = d;
        this.MediaDescriptionCompat = str3;
        this.MediaBrowserCompat$MediaItem = str4;
        this.MediaBrowserCompat$ItemReceiver = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = str5;
        this.read = list;
    }
}

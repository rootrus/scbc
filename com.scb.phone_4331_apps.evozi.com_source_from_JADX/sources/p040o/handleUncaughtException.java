package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p040o.CrashlyticsController;

/* renamed from: o.handleUncaughtException */
public final class handleUncaughtException implements Parcelable {
    public static final Parcelable.Creator CREATOR = new write();
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final List<loadInBackground> MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final List<CrashlyticsController.C322720> write;

    /* renamed from: o.handleUncaughtException$write */
    public static final class write implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            onGetStartedClick.write((Object) parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ArrayList arrayList2 = null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add((loadInBackground) parcel.readParcelable(handleUncaughtException.class.getClassLoader()));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (readInt2 != 0) {
                    arrayList2.add((CrashlyticsController.C322720) parcel.readParcelable(handleUncaughtException.class.getClassLoader()));
                    readInt2--;
                }
            }
            return new handleUncaughtException(readString, readString2, arrayList, arrayList2, parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new handleUncaughtException[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof handleUncaughtException)) {
            return false;
        }
        handleUncaughtException handleuncaughtexception = (handleUncaughtException) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) handleuncaughtexception.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) handleuncaughtexception.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) handleuncaughtexception.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) handleuncaughtexception.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) handleuncaughtexception.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        List<loadInBackground> list = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = list != null ? list.hashCode() : 0;
        List<CrashlyticsController.C322720> list2 = this.write;
        int hashCode4 = list2 != null ? list2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlOutcomeCounterDisplay(date=");
        sb.append(this.read);
        sb.append(", hourRemark=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", offersList=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", offerDetailsList=");
        sb.append(this.write);
        sb.append(", headerBackground=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.read);
        parcel.writeString(this.IconCompatParcelizer);
        List<loadInBackground> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (loadInBackground writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
        } else {
            parcel.writeInt(0);
        }
        List<CrashlyticsController.C322720> list2 = this.write;
        if (list2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (CrashlyticsController.C322720 writeParcelable2 : list2) {
                parcel.writeParcelable(writeParcelable2, i);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public handleUncaughtException(String str, String str2, List<? extends loadInBackground> list, List<CrashlyticsController.C322720> list2, String str3) {
        onGetStartedClick.write((Object) str2, "hourRemark");
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$ItemReceiver = list;
        this.write = list2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
    }
}

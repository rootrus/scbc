package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: o.initializeAllApis$MediaBrowserCompat$ItemReceiver */
public final class initializeAllApis$MediaBrowserCompat$ItemReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        String str;
        boolean z;
        ArrayList arrayList;
        Parcel parcel2 = parcel;
        onGetStartedClick.write((Object) parcel2, "in");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        String readString9 = parcel.readString();
        String readString10 = parcel.readString();
        String readString11 = parcel.readString();
        String readString12 = parcel.readString();
        String readString13 = parcel.readString();
        String readString14 = parcel.readString();
        String readString15 = parcel.readString();
        boolean z2 = parcel.readInt() != 0;
        boolean z3 = parcel.readInt() != 0;
        int readInt = parcel.readInt();
        String readString16 = parcel.readString();
        int readInt2 = parcel.readInt();
        String readString17 = parcel.readString();
        String readString18 = parcel.readString();
        if (parcel.readInt() != 0) {
            int readInt3 = parcel.readInt();
            z = z2;
            ArrayList arrayList2 = new ArrayList(readInt3);
            while (true) {
                str = readString13;
                if (readInt3 == 0) {
                    break;
                }
                arrayList2.add((isDataCollectionDefaultEnabled) isDataCollectionDefaultEnabled.CREATOR.createFromParcel(parcel2));
                readInt3--;
                readString13 = str;
            }
            arrayList = arrayList2;
        } else {
            z = z2;
            str = readString13;
            arrayList = null;
        }
        return new initializeAllApis(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, str, readString14, readString15, z, z3, readInt, readString16, readInt2, readString17, readString18, arrayList);
    }

    public final Object[] newArray(int i) {
        return new initializeAllApis[i];
    }
}

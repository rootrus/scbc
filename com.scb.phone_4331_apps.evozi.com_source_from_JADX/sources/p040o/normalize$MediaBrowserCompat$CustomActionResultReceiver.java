package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p040o.FirebaseApp;

/* renamed from: o.normalize$MediaBrowserCompat$CustomActionResultReceiver */
public final class normalize$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        onGetStartedClick.write((Object) parcel2, "in");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        ArrayList arrayList = null;
        Double valueOf = parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null;
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        Double valueOf2 = parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null;
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        String readString9 = parcel.readString();
        String readString10 = parcel.readString();
        String readString11 = parcel.readString();
        String readString12 = parcel.readString();
        String readString13 = parcel.readString();
        Double valueOf3 = parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null;
        String readString14 = parcel.readString();
        String readString15 = parcel.readString();
        String readString16 = parcel.readString();
        String readString17 = parcel.readString();
        String readString18 = parcel.readString();
        FirebaseApp.UiExecutor uiExecutor = (FirebaseApp.UiExecutor) parcel2.readParcelable(normalize.class.getClassLoader());
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((FirebaseException) FirebaseException.CREATOR.createFromParcel(parcel2));
                readInt--;
                readString11 = readString11;
            }
        }
        return new normalize(readString, readString2, readString3, valueOf, readString4, readString5, readString6, valueOf2, readString7, readString8, readString9, readString10, readString11, readString12, readString13, valueOf3, readString14, readString15, readString16, readString17, readString18, uiExecutor, arrayList);
    }

    public final Object[] newArray(int i) {
        return new normalize[i];
    }
}

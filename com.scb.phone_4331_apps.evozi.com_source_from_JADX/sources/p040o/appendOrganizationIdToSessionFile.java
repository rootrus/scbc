package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.appendOrganizationIdToSessionFile */
public final class appendOrganizationIdToSessionFile implements Parcelable {
    public static final Parcelable.Creator CREATOR = new write();
    public List<doOpenSession> IconCompatParcelizer;
    public List<access$1900> write;

    /* renamed from: o.appendOrganizationIdToSessionFile$write */
    public static final class write implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            onGetStartedClick.write((Object) parcel, "in");
            ArrayList arrayList2 = null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add((access$1900) access$1900.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (readInt2 != 0) {
                    arrayList2.add((doOpenSession) doOpenSession.CREATOR.createFromParcel(parcel));
                    readInt2--;
                }
            }
            return new appendOrganizationIdToSessionFile(arrayList, arrayList2);
        }

        public final Object[] newArray(int i) {
            return new appendOrganizationIdToSessionFile[i];
        }
    }

    public appendOrganizationIdToSessionFile() {
        this((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof appendOrganizationIdToSessionFile)) {
            return false;
        }
        appendOrganizationIdToSessionFile appendorganizationidtosessionfile = (appendOrganizationIdToSessionFile) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) appendorganizationidtosessionfile.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) appendorganizationidtosessionfile.IconCompatParcelizer);
    }

    public final int hashCode() {
        List<access$1900> list = this.write;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<doOpenSession> list2 = this.IconCompatParcelizer;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DepositProductInfoDisplay(accountDisplayList=");
        sb.append(this.write);
        sb.append(", productList=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        List<access$1900> list = this.write;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (access$1900 writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        List<doOpenSession> list2 = this.IconCompatParcelizer;
        if (list2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (doOpenSession writeToParcel2 : list2) {
                writeToParcel2.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }

    public appendOrganizationIdToSessionFile(List<access$1900> list, List<doOpenSession> list2) {
        this.write = list;
        this.IconCompatParcelizer = list2;
    }

    private /* synthetic */ appendOrganizationIdToSessionFile(byte b) {
        this((List<access$1900>) null, (List<doOpenSession>) null);
    }
}

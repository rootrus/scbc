package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception */
public final class C3080xc2f5febc implements Parcelable {
    public static final Parcelable.Creator<C3080xc2f5febc> CREATOR = new Parcelable.Creator<C3080xc2f5febc>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C3080xc2f5febc(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C3080xc2f5febc[i];
        }
    };
    public int IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$ItemReceiver;
    public List<getBaseAddress> write;

    public final int describeContents() {
        return 0;
    }

    /* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception$Builder */
    public final class Builder implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C3084x16ae07af();
        private final int IconCompatParcelizer;
        public final boolean MediaBrowserCompat$CustomActionResultReceiver;
        public final List<setFrames> MediaBrowserCompat$ItemReceiver;
        public final String read;
        public final int write;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            return this.write == builder.write && this.MediaBrowserCompat$CustomActionResultReceiver == builder.MediaBrowserCompat$CustomActionResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) builder.read) && this.IconCompatParcelizer == builder.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) builder.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            int i = this.write;
            boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (z) {
                z = true;
            }
            String str = this.read;
            int i2 = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            int i3 = this.IconCompatParcelizer;
            List<setFrames> list = this.MediaBrowserCompat$ItemReceiver;
            if (list != null) {
                i2 = list.hashCode();
            }
            return (((((((i * 31) + (z ? 1 : 0)) * 31) + hashCode) * 31) + i3) * 31) + i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HistoryDisplay(totalCount=");
            sb.append(this.write);
            sb.append(", endOfListFlag=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", remark=");
            sb.append(this.read);
            sb.append(", pagingOffset=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", transactions=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeInt(this.write);
            parcel.writeInt(this.MediaBrowserCompat$CustomActionResultReceiver ? 1 : 0);
            parcel.writeString(this.read);
            parcel.writeInt(this.IconCompatParcelizer);
            List<setFrames> list = this.MediaBrowserCompat$ItemReceiver;
            parcel.writeInt(list.size());
            for (setFrames writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, 0);
            }
        }

        public Builder(int i, boolean z, String str, int i2, List<setFrames> list) {
            onGetStartedClick.write((Object) str, "remark");
            onGetStartedClick.write((Object) list, "transactions");
            this.write = i;
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
            this.read = str;
            this.IconCompatParcelizer = i2;
            this.MediaBrowserCompat$ItemReceiver = list;
        }
    }

    public C3080xc2f5febc(String str, String str2, int i, List<getBaseAddress> list) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.IconCompatParcelizer = i;
        this.write = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeInt(this.IconCompatParcelizer);
        parcel.writeTypedList(this.write);
    }

    protected C3080xc2f5febc(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readInt();
        this.write = parcel.createTypedArrayList(getBaseAddress.CREATOR);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3080xc2f5febc autoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception = (C3080xc2f5febc) obj;
        AddNewCurrencyActivity_ViewBinding addNewCurrencyActivity_ViewBinding = new AddNewCurrencyActivity_ViewBinding();
        int i = this.IconCompatParcelizer;
        int i2 = autoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.IconCompatParcelizer;
        if (addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) {
            if (i != i2) {
                z = false;
            }
            addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = z;
        }
        return addNewCurrencyActivity_ViewBinding.read(this.MediaBrowserCompat$ItemReceiver, autoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.MediaBrowserCompat$ItemReceiver).read(this.MediaBrowserCompat$CustomActionResultReceiver, autoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.MediaBrowserCompat$CustomActionResultReceiver).read(this.write, autoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.write).MediaBrowserCompat$ItemReceiver;
    }

    public final int hashCode() {
        DetailsTabHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver2 = new DetailsTabHolder_ViewBinding((byte) 0).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        MediaBrowserCompat$CustomActionResultReceiver2.read = (MediaBrowserCompat$CustomActionResultReceiver2.read * 37) + this.IconCompatParcelizer;
        return MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver(this.write).read;
    }
}

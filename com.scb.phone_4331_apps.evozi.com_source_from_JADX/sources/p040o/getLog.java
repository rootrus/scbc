package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Device;

/* renamed from: o.getLog */
public final class getLog implements Parcelable {
    public static final Parcelable.Creator CREATOR = new getLog$MediaBrowserCompat$CustomActionResultReceiver();
    private final List<read> MediaBrowserCompat$CustomActionResultReceiver;
    public final getRam MediaBrowserCompat$ItemReceiver;
    public final List<AutoValue_CrashlyticsReport_Session_Device.Builder> read;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getLog)) {
            return false;
        }
        getLog getlog = (getLog) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getlog.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getlog.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getlog.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getlog.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        List<read> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<AutoValue_CrashlyticsReport_Session_Device.Builder> list2 = this.read;
        int hashCode2 = list2 != null ? list2.hashCode() : 0;
        String str = this.write;
        int hashCode3 = str != null ? str.hashCode() : 0;
        getRam getram = this.MediaBrowserCompat$ItemReceiver;
        if (getram != null) {
            i = getram.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidRequestLandingDisplay(existingPrepaidCardList=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", prepaidCardTypeList=");
        sb.append(this.read);
        sb.append(", remark=");
        sb.append(this.write);
        sb.append(", mailingAddress=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        List<read> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        parcel.writeInt(list.size());
        for (read writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        List<AutoValue_CrashlyticsReport_Session_Device.Builder> list2 = this.read;
        parcel.writeInt(list2.size());
        for (AutoValue_CrashlyticsReport_Session_Device.Builder writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, 0);
        }
        parcel.writeString(this.write);
        this.MediaBrowserCompat$ItemReceiver.writeToParcel(parcel, 0);
    }

    public getLog(List<read> list, List<AutoValue_CrashlyticsReport_Session_Device.Builder> list2, String str, getRam getram) {
        onGetStartedClick.write((Object) list, "existingPrepaidCardList");
        onGetStartedClick.write((Object) list2, "prepaidCardTypeList");
        onGetStartedClick.write((Object) str, "remark");
        onGetStartedClick.write((Object) getram, "mailingAddress");
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.read = list2;
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = getram;
    }

    /* renamed from: o.getLog$read */
    public static final class read implements Parcelable {
        public static final Parcelable.Creator CREATOR = new IconCompatParcelizer();
        private final String IconCompatParcelizer;
        private final String MediaBrowserCompat$CustomActionResultReceiver;
        private final List<String> MediaBrowserCompat$ItemReceiver;
        private final AutoValue_CrashlyticsReport_Session_Device.C30661 MediaDescriptionCompat;
        private final String read;
        private final String write;

        /* renamed from: o.getLog$read$IconCompatParcelizer */
        public static final class IconCompatParcelizer implements Parcelable.Creator {
            public final Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "in");
                return new read(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), (AutoValue_CrashlyticsReport_Session_Device.C30661) parcel.readParcelable(read.class.getClassLoader()));
            }

            public final Object[] newArray(int i) {
                return new read[i];
            }
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.read);
            parcel.writeString(this.write);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeStringList(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeParcelable(this.MediaDescriptionCompat, i);
        }

        public read(String str, String str2, String str3, String str4, List<String> list, AutoValue_CrashlyticsReport_Session_Device.C30661 r7) {
            onGetStartedClick.write((Object) str, "cardRefNo");
            onGetStartedClick.write((Object) str2, "cardMask");
            onGetStartedClick.write((Object) str3, "cardStatus");
            onGetStartedClick.write((Object) str4, "prepaidCardType");
            onGetStartedClick.write((Object) list, "allowTag");
            onGetStartedClick.write((Object) r7, "productType");
            this.read = str;
            this.write = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
            this.IconCompatParcelizer = str4;
            this.MediaBrowserCompat$ItemReceiver = list;
            this.MediaDescriptionCompat = r7;
        }
    }
}

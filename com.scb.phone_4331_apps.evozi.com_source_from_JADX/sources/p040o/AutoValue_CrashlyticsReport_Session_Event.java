package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.AutoValue_CrashlyticsReport_Session_Event */
public final class AutoValue_CrashlyticsReport_Session_Event implements Parcelable {
    public static final Parcelable.Creator CREATOR = new read();
    public final List<String> IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;

    /* renamed from: o.AutoValue_CrashlyticsReport_Session_Event$read */
    public static final class read implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new AutoValue_CrashlyticsReport_Session_Event(parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new AutoValue_CrashlyticsReport_Session_Event[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoValue_CrashlyticsReport_Session_Event)) {
            return false;
        }
        AutoValue_CrashlyticsReport_Session_Event autoValue_CrashlyticsReport_Session_Event = (AutoValue_CrashlyticsReport_Session_Event) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) autoValue_CrashlyticsReport_Session_Event.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) autoValue_CrashlyticsReport_Session_Event.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) autoValue_CrashlyticsReport_Session_Event.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) autoValue_CrashlyticsReport_Session_Event.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        List<String> list = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidTravelCardDisplay(allowTag=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", availableConversionLimit=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", availableTopUpLimitAmount=");
        sb.append(this.read);
        sb.append(", thbEquivalentAmount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeStringList(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }

    /* renamed from: o.AutoValue_CrashlyticsReport_Session_Event$Builder */
    public final class Builder implements Parcelable {
        public static final Parcelable.Creator CREATOR = new IconCompatParcelizer();
        public final List<C3071x65de3bd5> IconCompatParcelizer;
        public final String MediaBrowserCompat$ItemReceiver;
        public final List<AutoValue_CrashlyticsReport_Session_Event_Application> read;
        public final List<AutoValue_CrashlyticsReport_Session_Event_Application> write;

        /* renamed from: o.AutoValue_CrashlyticsReport_Session_Event$Builder$IconCompatParcelizer */
        public static final class IconCompatParcelizer implements Parcelable.Creator {
            public final Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "in");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add((AutoValue_CrashlyticsReport_Session_Event_Application) AutoValue_CrashlyticsReport_Session_Event_Application.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                while (readInt2 != 0) {
                    arrayList2.add((AutoValue_CrashlyticsReport_Session_Event_Application) AutoValue_CrashlyticsReport_Session_Event_Application.CREATOR.createFromParcel(parcel));
                    readInt2--;
                }
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                while (readInt3 != 0) {
                    arrayList3.add((C3071x65de3bd5) C3071x65de3bd5.CREATOR.createFromParcel(parcel));
                    readInt3--;
                }
                return new Builder(readString, arrayList, arrayList2, arrayList3);
            }

            public final Object[] newArray(int i) {
                return new Builder[i];
            }
        }

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
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) builder.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) builder.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) builder.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) builder.IconCompatParcelizer);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            List<AutoValue_CrashlyticsReport_Session_Event_Application> list = this.write;
            int hashCode2 = list != null ? list.hashCode() : 0;
            List<AutoValue_CrashlyticsReport_Session_Event_Application> list2 = this.read;
            int hashCode3 = list2 != null ? list2.hashCode() : 0;
            List<C3071x65de3bd5> list3 = this.IconCompatParcelizer;
            if (list3 != null) {
                i = list3.hashCode();
            }
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PrepaidTravelConversionLandingDisplay(cardRefNo=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", fromWallet=");
            sb.append(this.write);
            sb.append(", toWallet=");
            sb.append(this.read);
            sb.append(", fxRate=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            List<AutoValue_CrashlyticsReport_Session_Event_Application> list = this.write;
            parcel.writeInt(list.size());
            for (AutoValue_CrashlyticsReport_Session_Event_Application writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, 0);
            }
            List<AutoValue_CrashlyticsReport_Session_Event_Application> list2 = this.read;
            parcel.writeInt(list2.size());
            for (AutoValue_CrashlyticsReport_Session_Event_Application writeToParcel2 : list2) {
                writeToParcel2.writeToParcel(parcel, 0);
            }
            List<C3071x65de3bd5> list3 = this.IconCompatParcelizer;
            parcel.writeInt(list3.size());
            for (C3071x65de3bd5 writeToParcel3 : list3) {
                writeToParcel3.writeToParcel(parcel, 0);
            }
        }

        public Builder(String str, List<AutoValue_CrashlyticsReport_Session_Event_Application> list, List<AutoValue_CrashlyticsReport_Session_Event_Application> list2, List<C3071x65de3bd5> list3) {
            onGetStartedClick.write((Object) str, "cardRefNo");
            onGetStartedClick.write((Object) list, "fromWallet");
            onGetStartedClick.write((Object) list2, "toWallet");
            onGetStartedClick.write((Object) list3, "fxRate");
            this.MediaBrowserCompat$ItemReceiver = str;
            this.write = list;
            this.read = list2;
            this.IconCompatParcelizer = list3;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event(List<String> list, String str, String str2, String str3) {
        onGetStartedClick.write((Object) list, "allowTag");
        onGetStartedClick.write((Object) str, "availableConversionLimit");
        onGetStartedClick.write((Object) str2, "availableTopUpLimitAmount");
        onGetStartedClick.write((Object) str3, "thbEquivalentAmount");
        this.IconCompatParcelizer = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
    }
}

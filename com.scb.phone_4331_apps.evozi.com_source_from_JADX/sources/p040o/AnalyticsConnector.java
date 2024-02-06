package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.AnalyticsConnector */
public final class AnalyticsConnector {
    public final AnalyticsConnectorImpl IconCompatParcelizer;
    public final getProjectId write;

    /* renamed from: o.AnalyticsConnector$AnalyticsConnectorHandle */
    public final class AnalyticsConnectorHandle implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C3011xe3849e99();
        public List<AnalyticsConnectorListener> IconCompatParcelizer;
        public Integer read;
        public String write;

        public AnalyticsConnectorHandle() {
            this((byte) 0);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnalyticsConnectorHandle)) {
                return false;
            }
            AnalyticsConnectorHandle analyticsConnectorHandle = (AnalyticsConnectorHandle) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) analyticsConnectorHandle.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) analyticsConnectorHandle.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) analyticsConnectorHandle.IconCompatParcelizer);
        }

        public final int hashCode() {
            Integer num = this.read;
            int i = 0;
            int hashCode = num != null ? num.hashCode() : 0;
            String str = this.write;
            int hashCode2 = str != null ? str.hashCode() : 0;
            List<AnalyticsConnectorListener> list = this.IconCompatParcelizer;
            if (list != null) {
                i = list.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AvailableCycleItemDisplay(maxSelectCycle=");
            sb.append(this.read);
            sb.append(", year=");
            sb.append(this.write);
            sb.append(", months=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            Integer num = this.read;
            if (num != null) {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.write);
            List<AnalyticsConnectorListener> list = this.IconCompatParcelizer;
            if (list != null) {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                for (AnalyticsConnectorListener writeToParcel : list) {
                    writeToParcel.writeToParcel(parcel, 0);
                }
                return;
            }
            parcel.writeInt(0);
        }

        public AnalyticsConnectorHandle(Integer num, String str, List<AnalyticsConnectorListener> list) {
            this.read = num;
            this.write = str;
            this.IconCompatParcelizer = list;
        }

        public /* synthetic */ AnalyticsConnectorHandle(byte b) {
            this((Integer) null, (String) null, (List<AnalyticsConnectorListener>) null);
        }
    }

    /* renamed from: o.AnalyticsConnector$AnalyticsConnectorListener */
    public final class AnalyticsConnectorListener implements Parcelable {
        public static final Parcelable.Creator CREATOR = new read();
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public boolean MediaBrowserCompat$ItemReceiver;
        public String read;
        public boolean write;

        /* renamed from: o.AnalyticsConnector$AnalyticsConnectorListener$read */
        public static final class read implements Parcelable.Creator {
            public final Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "in");
                return new AnalyticsConnectorListener(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            public final Object[] newArray(int i) {
                return new AnalyticsConnectorListener[i];
            }
        }

        public AnalyticsConnectorListener() {
            this((byte) 0);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnalyticsConnectorListener)) {
                return false;
            }
            AnalyticsConnectorListener analyticsConnectorListener = (AnalyticsConnectorListener) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) analyticsConnectorListener.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) analyticsConnectorListener.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) analyticsConnectorListener.MediaBrowserCompat$CustomActionResultReceiver) && this.write == analyticsConnectorListener.write && this.MediaBrowserCompat$ItemReceiver == analyticsConnectorListener.MediaBrowserCompat$ItemReceiver;
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.read;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str3 != null) {
                i = str3.hashCode();
            }
            boolean z = this.write;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            boolean z3 = this.MediaBrowserCompat$ItemReceiver;
            if (!z3) {
                z2 = z3;
            }
            return (((((((hashCode * 31) + hashCode2) * 31) + i) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CycleMonthDisplay(monthNumber=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", month=");
            sb.append(this.read);
            sb.append(", year=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", enabled=");
            sb.append(this.write);
            sb.append(", isChecked=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.read);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeInt(this.write ? 1 : 0);
            parcel.writeInt(this.MediaBrowserCompat$ItemReceiver ? 1 : 0);
        }

        public AnalyticsConnectorListener(String str, String str2, String str3, boolean z, boolean z2) {
            this.IconCompatParcelizer = str;
            this.read = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
            this.write = z;
            this.MediaBrowserCompat$ItemReceiver = z2;
        }

        public /* synthetic */ AnalyticsConnectorListener(byte b) {
            this((String) null, (String) null, (String) null, false, false);
        }
    }

    public AnalyticsConnector(getProjectId getprojectid, AnalyticsConnectorImpl analyticsConnectorImpl) {
        this.write = getprojectid;
        this.IconCompatParcelizer = analyticsConnectorImpl;
    }
}

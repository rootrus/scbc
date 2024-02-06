package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.QueueFileLogStore */
public final class QueueFileLogStore {
    public String MediaBrowserCompat$ItemReceiver;
    public String write;

    /* renamed from: o.QueueFileLogStore$1 */
    public final class C37461 implements Parcelable {
        public static final read CREATOR = new read((byte) 0);
        public final int read;
        public final List<LogBytes> write;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37461)) {
                return false;
            }
            C37461 r3 = (C37461) obj;
            return this.read == r3.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write);
        }

        public final int hashCode() {
            int i = this.read;
            List<LogBytes> list = this.write;
            return (i * 31) + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MerchantWalletSweepTransactionDisplay(lastPage=");
            sb.append(this.read);
            sb.append(", list=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public C37461(int i, List<LogBytes> list) {
            this.read = i;
            this.write = list;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C37461(Parcel parcel) {
            this(parcel.readInt(), parcel.createTypedArrayList(LogBytes.CREATOR));
            onGetStartedClick.write((Object) parcel, "parcel");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeInt(this.read);
            parcel.writeTypedList(this.write);
        }

        /* renamed from: o.QueueFileLogStore$1$read */
        public static final class read implements Parcelable.Creator<C37461> {
            private read() {
            }

            public /* synthetic */ read(byte b) {
                this();
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "parcel");
                return new C37461(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C37461[i];
            }
        }
    }

    /* renamed from: o.QueueFileLogStore$LogBytes */
    public final class LogBytes implements Parcelable {
        public static final read CREATOR = new read((byte) 0);
        public boolean IconCompatParcelizer;
        private final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String read;
        private final String write;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LogBytes)) {
                return false;
            }
            LogBytes logBytes = (LogBytes) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) logBytes.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) logBytes.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) logBytes.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) logBytes.MediaBrowserCompat$ItemReceiver) && this.IconCompatParcelizer == logBytes.IconCompatParcelizer;
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.read;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.write;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$ItemReceiver;
            if (str4 != null) {
                i = str4.hashCode();
            }
            boolean z = this.IconCompatParcelizer;
            if (z) {
                z = true;
            }
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i) * 31) + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MerchantWalletSweepTransactionItemDisplay(id=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", amount=");
            sb.append(this.read);
            sb.append(", status=");
            sb.append(this.write);
            sb.append(", timestamp=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", expanded=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public LogBytes(String str, String str2, String str3, String str4, boolean z) {
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.read = str2;
            this.write = str3;
            this.MediaBrowserCompat$ItemReceiver = str4;
            this.IconCompatParcelizer = z;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public LogBytes(Parcel parcel) {
            this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 1);
            onGetStartedClick.write((Object) parcel, "parcel");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.read);
            parcel.writeString(this.write);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeInt(this.IconCompatParcelizer ? 1 : 0);
        }

        /* renamed from: o.QueueFileLogStore$LogBytes$read */
        public static final class read implements Parcelable.Creator<LogBytes> {
            private read() {
            }

            public /* synthetic */ read(byte b) {
                this();
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "parcel");
                return new LogBytes(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new LogBytes[i];
            }
        }
    }

    public QueueFileLogStore(String str, String str2) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
    }
}

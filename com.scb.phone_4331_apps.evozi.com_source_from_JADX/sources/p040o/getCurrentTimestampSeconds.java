package p040o;

/* renamed from: o.getCurrentTimestampSeconds */
public final class getCurrentTimestampSeconds {
    public final C4543x83a7f79 MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final write read;
    public final getCurrentTimestampSeconds$MediaBrowserCompat$ItemReceiver write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCurrentTimestampSeconds)) {
            return false;
        }
        getCurrentTimestampSeconds getcurrenttimestampseconds = (getCurrentTimestampSeconds) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getcurrenttimestampseconds.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getcurrenttimestampseconds.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getcurrenttimestampseconds.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getcurrenttimestampseconds.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        write write2 = this.read;
        int hashCode2 = write2 != null ? write2.hashCode() : 0;
        getCurrentTimestampSeconds$MediaBrowserCompat$ItemReceiver getcurrenttimestampseconds_mediabrowsercompat_itemreceiver = this.write;
        int hashCode3 = getcurrenttimestampseconds_mediabrowsercompat_itemreceiver != null ? getcurrenttimestampseconds_mediabrowsercompat_itemreceiver.hashCode() : 0;
        C4543x83a7f79 getcurrenttimestampseconds_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getcurrenttimestampseconds_mediabrowsercompat_customactionresultreceiver != null) {
            i = getcurrenttimestampseconds_mediabrowsercompat_customactionresultreceiver.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BusinessProfileDetailsDisplay(businessName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", contact=");
        sb.append(this.read);
        sb.append(", privilegedProfession=");
        sb.append(this.write);
        sb.append(", businessExperience=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getCurrentTimestampSeconds(String str, write write2, getCurrentTimestampSeconds$MediaBrowserCompat$ItemReceiver getcurrenttimestampseconds_mediabrowsercompat_itemreceiver, C4543x83a7f79 getcurrenttimestampseconds_mediabrowsercompat_customactionresultreceiver) {
        onGetStartedClick.write((Object) write2, "contact");
        onGetStartedClick.write((Object) getcurrenttimestampseconds_mediabrowsercompat_itemreceiver, "privilegedProfession");
        onGetStartedClick.write((Object) getcurrenttimestampseconds_mediabrowsercompat_customactionresultreceiver, "businessExperience");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = write2;
        this.write = getcurrenttimestampseconds_mediabrowsercompat_itemreceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = getcurrenttimestampseconds_mediabrowsercompat_customactionresultreceiver;
    }

    /* renamed from: o.getCurrentTimestampSeconds$write */
    public static final class write {
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write write = (write) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) write.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) write.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Contact(companyPhone=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", businessAddress=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public write(String str, String str2) {
            this.MediaBrowserCompat$ItemReceiver = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        }
    }
}

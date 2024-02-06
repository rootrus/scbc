package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setManufacturer */
public final class setManufacturer implements Parcelable {
    public static final Parcelable.Creator<setManufacturer> CREATOR = new read();
    private final String IconCompatParcelizer;
    private final String MediaBrowserCompat$ItemReceiver;
    private final String read;
    private final String write;

    public final int describeContents() {
        return 0;
    }

    public setManufacturer(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "txnDate");
        onGetStartedClick.write((Object) str2, "txnAmount");
        onGetStartedClick.write((Object) str3, "txnDebitCreditFlag");
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.IconCompatParcelizer = str3;
        this.read = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public setManufacturer(android.os.Parcel r6) {
        /*
            r5 = this;
            java.lang.String r0 = "source"
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r0)
            java.lang.String r0 = "$this$readStringNonNull"
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r0)
            java.lang.String r1 = r6.readString()
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x0013
            r1 = r2
        L_0x0013:
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r0)
            java.lang.String r3 = r6.readString()
            if (r3 != 0) goto L_0x001d
            r3 = r2
        L_0x001d:
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r0)
            java.lang.String r4 = r6.readString()
            if (r4 != 0) goto L_0x0027
            r4 = r2
        L_0x0027:
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r0)
            java.lang.String r6 = r6.readString()
            if (r6 != 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r2 = r6
        L_0x0032:
            r5.<init>(r1, r3, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setManufacturer.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "dest");
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
    }

    /* renamed from: o.setManufacturer$write */
    public static final class write implements findFragmentByWho {
        private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
        private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
        private final /* synthetic */ GooglePlayServicesUtilLight read;
        private final /* synthetic */ int write;

        private write() {
        }

        public /* synthetic */ write(GooglePlayServicesUtilLight googlePlayServicesUtilLight, int i, int i2, String str) {
            this.read = googlePlayServicesUtilLight;
            this.write = i;
            this.MediaBrowserCompat$CustomActionResultReceiver = i2;
            this.MediaBrowserCompat$ItemReceiver = str;
        }

        public final Object IconCompatParcelizer(Object obj) {
            return this.read.read(this.write, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, (PlacePhotoMetadataResult) obj);
        }
    }

    /* renamed from: o.setManufacturer$read */
    public static final class read implements Parcelable.Creator<setManufacturer> {
        read() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "source");
            return new setManufacturer(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setManufacturer[i];
        }
    }
}

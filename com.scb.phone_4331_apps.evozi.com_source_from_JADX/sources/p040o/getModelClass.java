package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.getModelClass */
public final class getModelClass extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<getModelClass> CREATOR = new write();
    public final String IconCompatParcelizer;
    public final List<isSimulator> MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;

    public final int describeContents() {
        return 0;
    }

    public getModelClass(String str, String str2, String str3, List<isSimulator> list) {
        onGetStartedClick.write((Object) str, "currentDate");
        onGetStartedClick.write((Object) str2, "pointRemarkError");
        onGetStartedClick.write((Object) str3, "pointTrapezoidError");
        onGetStartedClick.write((Object) list, "prepaidCardList");
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public getModelClass(android.os.Parcel r5) {
        /*
            r4 = this;
            java.lang.String r0 = "source"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
            java.lang.String r0 = "$this$readStringNonNull"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
            java.lang.String r1 = r5.readString()
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x0013
            r1 = r2
        L_0x0013:
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
            java.lang.String r3 = r5.readString()
            if (r3 != 0) goto L_0x001d
            r3 = r2
        L_0x001d:
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
            java.lang.String r0 = r5.readString()
            if (r0 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r2 = r0
        L_0x0028:
            android.os.Parcelable$Creator<o.isSimulator> r0 = p040o.isSimulator.CREATOR
            java.util.ArrayList r5 = r5.createTypedArrayList(r0)
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L_0x0036
            o.HmlNationalIdActivity r5 = p040o.HmlNationalIdActivity.IconCompatParcelizer
            java.util.List r5 = (java.util.List) r5
        L_0x0036:
            r4.<init>(r1, r3, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getModelClass.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "dest");
        parcel.writeString(this.read);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeTypedList(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* renamed from: o.getModelClass$read */
    public static final class read implements getAllowReturnTransitionOverlap {
        private final /* synthetic */ GooglePlayServicesUtilLight MediaBrowserCompat$CustomActionResultReceiver;

        private read() {
        }

        public /* synthetic */ read(GooglePlayServicesUtilLight googlePlayServicesUtilLight) {
            this.MediaBrowserCompat$CustomActionResultReceiver = googlePlayServicesUtilLight;
        }

        public final boolean write(Object obj) {
            return ((PlacePhotoMetadataResult) obj).MediaSessionCompat$Token <= this.MediaBrowserCompat$CustomActionResultReceiver.write;
        }
    }

    /* renamed from: o.getModelClass$write */
    public static final class write implements Parcelable.Creator<getModelClass> {
        write() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "source");
            return new getModelClass(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getModelClass[i];
        }
    }
}

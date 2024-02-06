package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.access$1500 */
public final class access$1500 extends remainingCapacity implements Parcelable {
    public static final access$1500$MediaBrowserCompat$CustomActionResultReceiver CREATOR = new access$1500$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public List<access$2400> MediaBrowserCompat$ItemReceiver;
    public List<String> read;

    public final int describeContents() {
        return 0;
    }

    public access$1500(String str, String str2, List<access$2400> list, List<String> list2) {
        onGetStartedClick.write((Object) str, "header");
        onGetStartedClick.write((Object) str2, "descriptionHeader");
        onGetStartedClick.write((Object) list, "eligibilityItemDisplays");
        onGetStartedClick.write((Object) list2, "descriptionList");
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.MediaBrowserCompat$ItemReceiver = list;
        this.read = list2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public access$1500(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
            java.lang.String r0 = "$this$readStringNonNull"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
            java.lang.String r1 = r4.readString()
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x0013
            r1 = r2
        L_0x0013:
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
            java.lang.String r0 = r4.readString()
            if (r0 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r2 = r0
        L_0x001e:
            o.access$2400$IconCompatParcelizer r0 = p040o.access$2400.CREATOR
            android.os.Parcelable$Creator r0 = (android.os.Parcelable.Creator) r0
            java.util.ArrayList r0 = r4.createTypedArrayList(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x002e
            o.HmlNationalIdActivity r0 = p040o.HmlNationalIdActivity.IconCompatParcelizer
            java.util.List r0 = (java.util.List) r0
        L_0x002e:
            java.util.ArrayList r4 = r4.createStringArrayList()
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x003a
            o.HmlNationalIdActivity r4 = p040o.HmlNationalIdActivity.IconCompatParcelizer
            java.util.List r4 = (java.util.List) r4
        L_0x003a:
            r3.<init>(r1, r2, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.access$1500.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeTypedList(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeStringList(this.read);
    }
}

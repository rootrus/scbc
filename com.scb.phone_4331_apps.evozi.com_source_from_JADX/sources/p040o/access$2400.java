package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.access$2400 */
public final class access$2400 implements Parcelable {
    public static final IconCompatParcelizer CREATOR = new IconCompatParcelizer((byte) 0);
    public String IconCompatParcelizer;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public access$2400(String str, String str2) {
        onGetStartedClick.write((Object) str, "imageUrl");
        onGetStartedClick.write((Object) str2, "description");
        this.IconCompatParcelizer = str;
        this.write = str2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public access$2400(android.os.Parcel r4) {
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
            java.lang.String r4 = r4.readString()
            if (r4 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r2 = r4
        L_0x001e:
            r3.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.access$2400.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.write);
    }

    /* renamed from: o.access$2400$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator<access$2400> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new access$2400(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new access$2400[i];
        }
    }
}

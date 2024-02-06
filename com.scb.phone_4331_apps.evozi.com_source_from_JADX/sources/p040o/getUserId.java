package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getUserId */
public final class getUserId implements Parcelable {
    public static final read CREATOR = new read((byte) 0);
    public final String IconCompatParcelizer;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public getUserId(String str, String str2) {
        onGetStartedClick.write((Object) str, "label");
        onGetStartedClick.write((Object) str2, "deepLink");
        this.IconCompatParcelizer = str;
        this.write = str2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public getUserId(android.os.Parcel r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: p040o.getUserId.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.write);
    }

    /* renamed from: o.getUserId$read */
    public static final class read implements Parcelable.Creator<getUserId> {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new getUserId(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getUserId[i];
        }
    }
}

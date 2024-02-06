package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.zzct;

/* renamed from: o.trimSessionFiles */
public final class trimSessionFiles implements Parcelable {
    public static final read CREATOR = new read((byte) 0);
    public final zzct.zza MediaBrowserCompat$CustomActionResultReceiver;

    public final int describeContents() {
        return 0;
    }

    public trimSessionFiles(zzct.zza zza) {
        this.MediaBrowserCompat$CustomActionResultReceiver = zza;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        Enum enumR = this.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) parcel, "$this$writeEnum");
        parcel.writeInt(enumR != null ? enumR.ordinal() : -1);
    }

    /* renamed from: o.trimSessionFiles$read */
    public static final class read implements Parcelable.Creator<trimSessionFiles> {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new trimSessionFiles(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new trimSessionFiles[i];
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public trimSessionFiles(android.os.Parcel r2) {
        /*
            r1 = this;
            java.lang.String r0 = "parcel"
            p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r0)
            int r2 = r2.readInt()
            if (r2 < 0) goto L_0x0012
            o.zzct$zza[] r0 = p040o.zzct.zza.values()
            r2 = r0[r2]
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            java.lang.Enum r2 = (java.lang.Enum) r2
            o.zzct$zza r2 = (p040o.zzct.zza) r2
            r1.<init>((p040o.zzct.zza) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.trimSessionFiles.<init>(android.os.Parcel):void");
    }
}

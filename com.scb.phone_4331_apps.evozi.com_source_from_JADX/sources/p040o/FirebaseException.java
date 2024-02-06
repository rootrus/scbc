package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.FirebaseException */
public final class FirebaseException implements Parcelable {
    public static final Parcelable.Creator CREATOR = new read();
    public systemExit IconCompatParcelizer;
    public FirebaseApp$$Lambda$1 read;

    /* renamed from: o.FirebaseException$read */
    public static final class read implements Parcelable.Creator {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: o.FirebaseApp$$Lambda$1} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object createFromParcel(android.os.Parcel r4) {
            /*
                r3 = this;
                java.lang.String r0 = "in"
                p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
                int r0 = r4.readInt()
                r1 = 0
                if (r0 == 0) goto L_0x0015
                android.os.Parcelable$Creator r0 = p040o.systemExit.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r4)
                o.systemExit r0 = (p040o.systemExit) r0
                goto L_0x0016
            L_0x0015:
                r0 = r1
            L_0x0016:
                int r2 = r4.readInt()
                if (r2 == 0) goto L_0x0025
                android.os.Parcelable$Creator r1 = p040o.FirebaseApp$$Lambda$1.CREATOR
                java.lang.Object r4 = r1.createFromParcel(r4)
                r1 = r4
                o.FirebaseApp$$Lambda$1 r1 = (p040o.FirebaseApp$$Lambda$1) r1
            L_0x0025:
                o.FirebaseException r4 = new o.FirebaseException
                r4.<init>(r0, r1)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.FirebaseException.read.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        public final Object[] newArray(int i) {
            return new FirebaseException[i];
        }
    }

    public FirebaseException() {
        this((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirebaseException)) {
            return false;
        }
        FirebaseException firebaseException = (FirebaseException) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) firebaseException.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) firebaseException.read);
    }

    public final int hashCode() {
        systemExit systemexit = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = systemexit != null ? systemexit.hashCode() : 0;
        FirebaseApp$$Lambda$1 firebaseApp$$Lambda$1 = this.read;
        if (firebaseApp$$Lambda$1 != null) {
            i = firebaseApp$$Lambda$1.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransactionResponseDisplay(unbillInfo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", instPaymentInfo=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        systemExit systemexit = this.IconCompatParcelizer;
        if (systemexit != null) {
            parcel.writeInt(1);
            systemexit.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        FirebaseApp$$Lambda$1 firebaseApp$$Lambda$1 = this.read;
        if (firebaseApp$$Lambda$1 != null) {
            parcel.writeInt(1);
            firebaseApp$$Lambda$1.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public FirebaseException(systemExit systemexit, FirebaseApp$$Lambda$1 firebaseApp$$Lambda$1) {
        this.IconCompatParcelizer = systemexit;
        this.read = firebaseApp$$Lambda$1;
    }

    public /* synthetic */ FirebaseException(byte b) {
        this((systemExit) null, (FirebaseApp$$Lambda$1) null);
    }
}

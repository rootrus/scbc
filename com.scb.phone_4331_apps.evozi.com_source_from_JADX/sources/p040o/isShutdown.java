package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.LottieDrawable;

/* renamed from: o.isShutdown */
public final class isShutdown implements Parcelable {
    public static final Parcelable.Creator<isShutdown> CREATOR = new IconCompatParcelizer();
    public final double IconCompatParcelizer;
    public final double MediaBrowserCompat$CustomActionResultReceiver;
    public final double MediaBrowserCompat$ItemReceiver;
    public final double read;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isShutdown)) {
            return false;
        }
        isShutdown isshutdown = (isShutdown) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) isshutdown.write) && Double.compare(this.IconCompatParcelizer, isshutdown.IconCompatParcelizer) == 0 && Double.compare(this.MediaBrowserCompat$ItemReceiver, isshutdown.MediaBrowserCompat$ItemReceiver) == 0 && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, isshutdown.MediaBrowserCompat$CustomActionResultReceiver) == 0 && Double.compare(this.read, isshutdown.read) == 0;
    }

    public final int hashCode() {
        String str = this.write;
        int hashCode = str != null ? str.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.IconCompatParcelizer);
        long doubleToLongBits2 = Double.doubleToLongBits(this.MediaBrowserCompat$ItemReceiver);
        int i = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
        long doubleToLongBits4 = Double.doubleToLongBits(this.read);
        return (((((((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + i) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("QrBScanCDisplay(accountNumber=");
        sb.append(this.write);
        sb.append(", limitAmount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", minAmount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", maxAmount=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", limitStepSize=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public isShutdown(String str, double d, double d2, double d3, double d4) {
        onGetStartedClick.write((Object) str, "accountNumber");
        this.write = str;
        this.IconCompatParcelizer = d;
        this.MediaBrowserCompat$ItemReceiver = d2;
        this.MediaBrowserCompat$CustomActionResultReceiver = d3;
        this.read = d4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public isShutdown(android.os.Parcel r12) {
        /*
            r11 = this;
            java.lang.String r0 = "source"
            p040o.onGetStartedClick.write((java.lang.Object) r12, (java.lang.String) r0)
            java.lang.String r0 = "$this$readStringNonNull"
            p040o.onGetStartedClick.write((java.lang.Object) r12, (java.lang.String) r0)
            java.lang.String r0 = r12.readString()
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = ""
        L_0x0012:
            r2 = r0
            java.lang.Class r0 = java.lang.Double.TYPE
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r12.readValue(r0)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Double"
            if (r0 == 0) goto L_0x0074
            java.lang.Double r0 = (java.lang.Double) r0
            double r3 = r0.doubleValue()
            java.lang.Class r0 = java.lang.Double.TYPE
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r12.readValue(r0)
            if (r0 == 0) goto L_0x006e
            java.lang.Double r0 = (java.lang.Double) r0
            double r5 = r0.doubleValue()
            java.lang.Class r0 = java.lang.Double.TYPE
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r12.readValue(r0)
            if (r0 == 0) goto L_0x0068
            java.lang.Double r0 = (java.lang.Double) r0
            double r7 = r0.doubleValue()
            java.lang.Class r0 = java.lang.Double.TYPE
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r12 = r12.readValue(r0)
            if (r12 == 0) goto L_0x0062
            java.lang.Double r12 = (java.lang.Double) r12
            double r9 = r12.doubleValue()
            r1 = r11
            r1.<init>(r2, r3, r5, r7, r9)
            return
        L_0x0062:
            kotlin.TypeCastException r12 = new kotlin.TypeCastException
            r12.<init>(r1)
            throw r12
        L_0x0068:
            kotlin.TypeCastException r12 = new kotlin.TypeCastException
            r12.<init>(r1)
            throw r12
        L_0x006e:
            kotlin.TypeCastException r12 = new kotlin.TypeCastException
            r12.<init>(r1)
            throw r12
        L_0x0074:
            kotlin.TypeCastException r12 = new kotlin.TypeCastException
            r12.<init>(r1)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.isShutdown.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "dest");
        parcel.writeString(this.write);
        parcel.writeValue(Double.valueOf(this.IconCompatParcelizer));
        parcel.writeValue(Double.valueOf(this.MediaBrowserCompat$ItemReceiver));
        parcel.writeValue(Double.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver));
        parcel.writeValue(Double.valueOf(this.read));
    }

    /* renamed from: o.isShutdown$read */
    public static final class read implements findFragmentByWho {
        private read() {
        }

        public /* synthetic */ read(setShowCancelButton setshowcancelbutton) {
        }

        public final Object IconCompatParcelizer(Object obj) {
            return setShowCancelButton.write((LottieDrawable.C36131) obj);
        }
    }

    /* renamed from: o.isShutdown$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator<isShutdown> {
        IconCompatParcelizer() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "source");
            return new isShutdown(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new isShutdown[i];
        }
    }
}

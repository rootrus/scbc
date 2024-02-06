package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.sameThreadExecutor */
public final class sameThreadExecutor implements Parcelable {
    public static final write CREATOR = new write((byte) 0);
    public final double IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    private final double MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final String MediaDescriptionCompat;
    public final double RatingCompat;
    public final String read;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sameThreadExecutor)) {
            return false;
        }
        sameThreadExecutor samethreadexecutor = (sameThreadExecutor) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) samethreadexecutor.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) samethreadexecutor.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) samethreadexecutor.MediaDescriptionCompat) && Double.compare(this.RatingCompat, samethreadexecutor.RatingCompat) == 0 && Double.compare(this.IconCompatParcelizer, samethreadexecutor.IconCompatParcelizer) == 0 && Double.compare(this.MediaBrowserCompat$MediaItem, samethreadexecutor.MediaBrowserCompat$MediaItem) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) samethreadexecutor.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) samethreadexecutor.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) samethreadexecutor.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaDescriptionCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.RatingCompat);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.IconCompatParcelizer);
        int i3 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.MediaBrowserCompat$MediaItem);
        int i4 = (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BankingAgentDisplay(code=");
        sb.append(this.write);
        sb.append(", logo=");
        sb.append(this.read);
        sb.append(", name=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", minAmount=");
        sb.append(this.RatingCompat);
        sb.append(", maxAmount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", limitPerDay=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", minAmountText=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", maxAmountText=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", limitPerDayText=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public sameThreadExecutor(String str, String str2, String str3, double d, double d2, double d3, String str4, String str5, String str6) {
        onGetStartedClick.write((Object) str, "code");
        onGetStartedClick.write((Object) str2, "logo");
        onGetStartedClick.write((Object) str3, "name");
        onGetStartedClick.write((Object) str4, "minAmountText");
        onGetStartedClick.write((Object) str5, "maxAmountText");
        onGetStartedClick.write((Object) str6, "limitPerDayText");
        this.write = str;
        this.read = str2;
        this.MediaDescriptionCompat = str3;
        this.RatingCompat = d;
        this.IconCompatParcelizer = d2;
        this.MediaBrowserCompat$MediaItem = d3;
        this.MediaBrowserCompat$SearchResultReceiver = str4;
        this.MediaBrowserCompat$ItemReceiver = str5;
        this.MediaBrowserCompat$CustomActionResultReceiver = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public sameThreadExecutor(android.os.Parcel r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "parcel"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r1 = "$this$readStringNonNull"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r18.readString()
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x0016
            r5 = r3
            goto L_0x0017
        L_0x0016:
            r5 = r2
        L_0x0017:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r18.readString()
            if (r2 != 0) goto L_0x0022
            r6 = r3
            goto L_0x0023
        L_0x0022:
            r6 = r2
        L_0x0023:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r18.readString()
            if (r2 != 0) goto L_0x002e
            r7 = r3
            goto L_0x002f
        L_0x002e:
            r7 = r2
        L_0x002f:
            double r8 = r18.readDouble()
            double r10 = r18.readDouble()
            double r12 = r18.readDouble()
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r18.readString()
            if (r2 != 0) goto L_0x0046
            r14 = r3
            goto L_0x0047
        L_0x0046:
            r14 = r2
        L_0x0047:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r18.readString()
            if (r2 != 0) goto L_0x0052
            r15 = r3
            goto L_0x0053
        L_0x0052:
            r15 = r2
        L_0x0053:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r0 = r18.readString()
            if (r0 != 0) goto L_0x005f
            r16 = r3
            goto L_0x0061
        L_0x005f:
            r16 = r0
        L_0x0061:
            r4 = r17
            r4.<init>(r5, r6, r7, r8, r10, r12, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.sameThreadExecutor.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.write);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeDouble(this.RatingCompat);
        parcel.writeDouble(this.IconCompatParcelizer);
        parcel.writeDouble(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* renamed from: o.sameThreadExecutor$write */
    public static final class write implements Parcelable.Creator<sameThreadExecutor> {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new sameThreadExecutor(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new sameThreadExecutor[i];
        }
    }
}

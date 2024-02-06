package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getExitingScheduledExecutorService */
public final class getExitingScheduledExecutorService implements Parcelable {
    public static final write CREATOR = new write((byte) 0);
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final double MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String RatingCompat;
    public final String read;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getExitingScheduledExecutorService)) {
            return false;
        }
        getExitingScheduledExecutorService getexitingscheduledexecutorservice = (getExitingScheduledExecutorService) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) getexitingscheduledexecutorservice.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getexitingscheduledexecutorservice.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getexitingscheduledexecutorservice.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getexitingscheduledexecutorservice.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getexitingscheduledexecutorservice.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getexitingscheduledexecutorservice.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) getexitingscheduledexecutorservice.MediaMetadataCompat) && Double.compare(this.MediaDescriptionCompat, getexitingscheduledexecutorservice.MediaDescriptionCompat) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) getexitingscheduledexecutorservice.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) getexitingscheduledexecutorservice.MediaBrowserCompat$SearchResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$MediaItem;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaMetadataCompat;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.MediaDescriptionCompat);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        String str8 = this.RatingCompat;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i2) * 31) + hashCode8) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BankingAgentReviewDisplay(postingType=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", accountName=");
        sb.append(this.write);
        sb.append(", accountNumber=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountNumberMasked=");
        sb.append(this.read);
        sb.append(", agentCode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", agentLogo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", agentName=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", amount=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", amountText=");
        sb.append(this.RatingCompat);
        sb.append(", tokenId=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getExitingScheduledExecutorService(String str, String str2, String str3, String str4, String str5, String str6, String str7, double d, String str8, String str9) {
        onGetStartedClick.write((Object) str, "postingType");
        onGetStartedClick.write((Object) str2, "accountName");
        onGetStartedClick.write((Object) str3, "accountNumber");
        onGetStartedClick.write((Object) str4, "accountNumberMasked");
        onGetStartedClick.write((Object) str5, "agentCode");
        onGetStartedClick.write((Object) str6, "agentLogo");
        onGetStartedClick.write((Object) str7, "agentName");
        onGetStartedClick.write((Object) str8, "amountText");
        onGetStartedClick.write((Object) str9, "tokenId");
        this.MediaBrowserCompat$MediaItem = str;
        this.write = str2;
        this.IconCompatParcelizer = str3;
        this.read = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = str5;
        this.MediaBrowserCompat$ItemReceiver = str6;
        this.MediaMetadataCompat = str7;
        this.MediaDescriptionCompat = d;
        this.RatingCompat = str8;
        this.MediaBrowserCompat$SearchResultReceiver = str9;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public getExitingScheduledExecutorService(android.os.Parcel r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "parcel"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r1 = "$this$readStringNonNull"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r17.readString()
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x0016
            r5 = r3
            goto L_0x0017
        L_0x0016:
            r5 = r2
        L_0x0017:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r17.readString()
            if (r2 != 0) goto L_0x0022
            r6 = r3
            goto L_0x0023
        L_0x0022:
            r6 = r2
        L_0x0023:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r17.readString()
            if (r2 != 0) goto L_0x002e
            r7 = r3
            goto L_0x002f
        L_0x002e:
            r7 = r2
        L_0x002f:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r17.readString()
            if (r2 != 0) goto L_0x003a
            r8 = r3
            goto L_0x003b
        L_0x003a:
            r8 = r2
        L_0x003b:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r17.readString()
            if (r2 != 0) goto L_0x0046
            r9 = r3
            goto L_0x0047
        L_0x0046:
            r9 = r2
        L_0x0047:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r17.readString()
            if (r2 != 0) goto L_0x0052
            r10 = r3
            goto L_0x0053
        L_0x0052:
            r10 = r2
        L_0x0053:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r17.readString()
            if (r2 != 0) goto L_0x005e
            r11 = r3
            goto L_0x005f
        L_0x005e:
            r11 = r2
        L_0x005f:
            double r12 = r17.readDouble()
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r17.readString()
            if (r2 != 0) goto L_0x006e
            r14 = r3
            goto L_0x006f
        L_0x006e:
            r14 = r2
        L_0x006f:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r0 = r17.readString()
            if (r0 != 0) goto L_0x007a
            r15 = r3
            goto L_0x007b
        L_0x007a:
            r15 = r0
        L_0x007b:
            r4 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getExitingScheduledExecutorService.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeDouble(this.MediaDescriptionCompat);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
    }

    /* renamed from: o.getExitingScheduledExecutorService$write */
    public static final class write implements Parcelable.Creator<getExitingScheduledExecutorService> {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new getExitingScheduledExecutorService(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getExitingScheduledExecutorService[i];
        }
    }
}

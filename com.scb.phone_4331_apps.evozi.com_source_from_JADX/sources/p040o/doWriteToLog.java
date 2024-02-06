package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.QueueFile;

/* renamed from: o.doWriteToLog */
public final class doWriteToLog extends remainingCapacity implements Parcelable {
    public static final doWriteToLog$MediaBrowserCompat$CustomActionResultReceiver CREATOR = new doWriteToLog$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    private final QueueFile.ElementInputStream MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final String MediaDescriptionCompat;
    public final openLogFile MediaMetadataCompat;
    private final String MediaSessionCompat$ResultReceiverWrapper;
    private final int MediaSessionCompat$Token;
    public final String RatingCompat;
    public final String read;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doWriteToLog)) {
            return false;
        }
        doWriteToLog dowritetolog = (doWriteToLog) obj;
        return this.MediaSessionCompat$Token == dowritetolog.MediaSessionCompat$Token && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) dowritetolog.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) dowritetolog.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) dowritetolog.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) dowritetolog.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) dowritetolog.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) dowritetolog.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) dowritetolog.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) dowritetolog.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) dowritetolog.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) dowritetolog.MediaMetadataCompat);
    }

    public final int hashCode() {
        int i = this.MediaSessionCompat$Token;
        String str = this.MediaBrowserCompat$SearchResultReceiver;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaDescriptionCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.RatingCompat;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.read;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        QueueFile.ElementInputStream elementInputStream = this.MediaBrowserCompat$MediaItem;
        int hashCode9 = elementInputStream != null ? elementInputStream.hashCode() : 0;
        openLogFile openlogfile = this.MediaMetadataCompat;
        if (openlogfile != null) {
            i2 = openlogfile.hashCode();
        }
        return (((((((((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MerchantWalletDetailDisplay(pageNumber=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", walletId=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", walletBalance=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", walletStatus=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", nickname=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", productType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", shopName=");
        sb.append(this.RatingCompat);
        sb.append(", linkedAccountNumber=");
        sb.append(this.read);
        sb.append(", ownerName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", owner=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", transactions=");
        sb.append(this.MediaMetadataCompat);
        sb.append(")");
        return sb.toString();
    }

    public doWriteToLog(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, QueueFile.ElementInputStream elementInputStream, openLogFile openlogfile) {
        onGetStartedClick.write((Object) str2, "walletBalance");
        this.MediaSessionCompat$Token = i;
        this.MediaBrowserCompat$SearchResultReceiver = str;
        this.MediaDescriptionCompat = str2;
        this.MediaSessionCompat$ResultReceiverWrapper = str3;
        this.IconCompatParcelizer = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = str5;
        this.RatingCompat = str6;
        this.read = str7;
        this.MediaBrowserCompat$ItemReceiver = str8;
        this.MediaBrowserCompat$MediaItem = elementInputStream;
        this.MediaMetadataCompat = openlogfile;
    }

    public doWriteToLog() {
        this(0, (String) null, "", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (QueueFile.ElementInputStream) null, (openLogFile) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public doWriteToLog(android.os.Parcel r14) {
        /*
            r13 = this;
            java.lang.String r0 = "parcel"
            p040o.onGetStartedClick.write((java.lang.Object) r14, (java.lang.String) r0)
            int r2 = r14.readInt()
            java.lang.String r3 = r14.readString()
            java.lang.String r0 = "$this$readStringNonNull"
            p040o.onGetStartedClick.write((java.lang.Object) r14, (java.lang.String) r0)
            java.lang.String r0 = r14.readString()
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = ""
        L_0x001a:
            r4 = r0
            java.lang.String r5 = r14.readString()
            java.lang.String r6 = r14.readString()
            java.lang.String r7 = r14.readString()
            java.lang.String r8 = r14.readString()
            java.lang.String r9 = r14.readString()
            java.lang.String r10 = r14.readString()
            java.lang.Class<o.QueueFile$ElementInputStream> r0 = p040o.QueueFile.ElementInputStream.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r14.readParcelable(r0)
            r11 = r0
            o.QueueFile$ElementInputStream r11 = (p040o.QueueFile.ElementInputStream) r11
            java.lang.Class<o.openLogFile> r0 = p040o.openLogFile.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r14.readParcelable(r0)
            r12 = r0
            o.openLogFile r12 = (p040o.openLogFile) r12
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            int r14 = r14.readInt()
            r0 = 1
            if (r14 == r0) goto L_0x0059
            r0 = 0
        L_0x0059:
            r13.write = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.doWriteToLog.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeParcelable(this.MediaBrowserCompat$MediaItem, i);
        parcel.writeParcelable(this.MediaMetadataCompat, i);
        parcel.writeInt(this.write ? 1 : 0);
    }
}

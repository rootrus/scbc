package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.immediateFailedFuture */
public final class immediateFailedFuture implements Parcelable {
    public static final immediateFailedFuture$MediaBrowserCompat$ItemReceiver CREATOR = new immediateFailedFuture$MediaBrowserCompat$ItemReceiver((byte) 0);
    public final String IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final boolean MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String RatingCompat;
    public final boolean read;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public immediateFailedFuture(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3) {
        onGetStartedClick.write((Object) str, "tag");
        this.MediaBrowserCompat$SearchResultReceiver = str;
        this.MediaDescriptionCompat = str2;
        this.MediaMetadataCompat = str3;
        this.write = str4;
        this.RatingCompat = str5;
        this.MediaBrowserCompat$MediaItem = str6;
        this.IconCompatParcelizer = str7;
        this.MediaBrowserCompat$ItemReceiver = z;
        this.read = z2;
        this.MediaBrowserCompat$CustomActionResultReceiver = z3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ immediateFailedFuture(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, int i) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, z, z2, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public immediateFailedFuture(android.os.Parcel r13) {
        /*
            r12 = this;
            java.lang.String r0 = "parcel"
            p040o.onGetStartedClick.write((java.lang.Object) r13, (java.lang.String) r0)
            java.lang.String r0 = "$this$readStringNonNull"
            p040o.onGetStartedClick.write((java.lang.Object) r13, (java.lang.String) r0)
            java.lang.String r0 = r13.readString()
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = ""
        L_0x0012:
            r2 = r0
            java.lang.String r3 = r13.readString()
            java.lang.String r4 = r13.readString()
            java.lang.String r5 = r13.readString()
            java.lang.String r6 = r13.readString()
            java.lang.String r7 = r13.readString()
            java.lang.String r8 = r13.readString()
            byte r0 = r13.readByte()
            r1 = 1
            r9 = 0
            if (r0 == 0) goto L_0x0035
            r0 = r1
            goto L_0x0036
        L_0x0035:
            r0 = r9
        L_0x0036:
            byte r10 = r13.readByte()
            if (r10 == 0) goto L_0x003e
            r10 = r1
            goto L_0x003f
        L_0x003e:
            r10 = r9
        L_0x003f:
            byte r13 = r13.readByte()
            if (r13 == 0) goto L_0x0047
            r11 = r1
            goto L_0x0048
        L_0x0047:
            r11 = r9
        L_0x0048:
            r1 = r12
            r9 = r0
            r1.<init>((java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (boolean) r9, (boolean) r10, (boolean) r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.immediateFailedFuture.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.write);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeByte(this.MediaBrowserCompat$ItemReceiver ? (byte) 1 : 0);
        parcel.writeByte(this.read ? (byte) 1 : 0);
        parcel.writeByte(this.MediaBrowserCompat$CustomActionResultReceiver ? (byte) 1 : 0);
    }
}

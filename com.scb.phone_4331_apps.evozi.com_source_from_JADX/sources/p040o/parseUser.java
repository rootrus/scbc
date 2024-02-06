package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.parseUser */
public final class parseUser implements Parcelable {
    public static final IconCompatParcelizer CREATOR = new IconCompatParcelizer((byte) 0);
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    private final String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final String MediaMetadataCompat;
    private final String RatingCompat;
    public final String read;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public parseUser(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        onGetStartedClick.write((Object) str, "transferType");
        onGetStartedClick.write((Object) str3, "accountTo");
        onGetStartedClick.write((Object) str4, "accountToName");
        onGetStartedClick.write((Object) str7, "bankCode");
        onGetStartedClick.write((Object) str9, "bankLogo");
        this.MediaBrowserCompat$SearchResultReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.IconCompatParcelizer = str3;
        this.MediaBrowserCompat$MediaItem = str4;
        this.write = str5;
        this.read = str6;
        this.MediaBrowserCompat$ItemReceiver = str7;
        this.MediaMetadataCompat = str8;
        this.RatingCompat = str9;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public parseUser(android.os.Parcel r14) {
        /*
            r13 = this;
            java.lang.String r0 = "parcel"
            p040o.onGetStartedClick.write((java.lang.Object) r14, (java.lang.String) r0)
            java.lang.String r0 = "$this$readStringNonNull"
            p040o.onGetStartedClick.write((java.lang.Object) r14, (java.lang.String) r0)
            java.lang.String r1 = r14.readString()
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x0014
            r4 = r2
            goto L_0x0015
        L_0x0014:
            r4 = r1
        L_0x0015:
            java.lang.String r5 = r14.readString()
            p040o.onGetStartedClick.write((java.lang.Object) r14, (java.lang.String) r0)
            java.lang.String r1 = r14.readString()
            if (r1 != 0) goto L_0x0024
            r6 = r2
            goto L_0x0025
        L_0x0024:
            r6 = r1
        L_0x0025:
            p040o.onGetStartedClick.write((java.lang.Object) r14, (java.lang.String) r0)
            java.lang.String r1 = r14.readString()
            if (r1 != 0) goto L_0x0030
            r7 = r2
            goto L_0x0031
        L_0x0030:
            r7 = r1
        L_0x0031:
            java.lang.String r8 = r14.readString()
            java.lang.String r9 = r14.readString()
            p040o.onGetStartedClick.write((java.lang.Object) r14, (java.lang.String) r0)
            java.lang.String r1 = r14.readString()
            if (r1 != 0) goto L_0x0044
            r10 = r2
            goto L_0x0045
        L_0x0044:
            r10 = r1
        L_0x0045:
            java.lang.String r11 = r14.readString()
            p040o.onGetStartedClick.write((java.lang.Object) r14, (java.lang.String) r0)
            java.lang.String r14 = r14.readString()
            if (r14 != 0) goto L_0x0054
            r12 = r2
            goto L_0x0055
        L_0x0054:
            r12 = r14
        L_0x0055:
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.parseUser.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.write);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.RatingCompat);
    }

    /* renamed from: o.parseUser$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator<parseUser> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new parseUser(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new parseUser[i];
        }
    }
}

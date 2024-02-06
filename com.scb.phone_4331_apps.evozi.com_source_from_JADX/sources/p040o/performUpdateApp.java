package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040o.CommonUtils;

/* renamed from: o.performUpdateApp */
public final class performUpdateApp extends remainingCapacity implements Parcelable {
    public static final IconCompatParcelizer CREATOR = new IconCompatParcelizer((byte) 0);
    public final Boolean IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final Boolean MediaBrowserCompat$MediaItem;
    public final Boolean MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public Boolean f2919x50fd9e4a;
    public Boolean MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompat$QueueItem;
    public final String MediaSessionCompat$ResultReceiverWrapper;
    private final Integer MediaSessionCompat$Token;
    public final String ParcelableVolumeInfo;
    public final String RatingCompat;
    public final List<CommonUtils.C31811> read;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof performUpdateApp)) {
            return false;
        }
        performUpdateApp performupdateapp = (performUpdateApp) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) performupdateapp.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) performupdateapp.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) performupdateapp.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) performupdateapp.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) performupdateapp.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) performupdateapp.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) performupdateapp.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) performupdateapp.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) performupdateapp.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) performupdateapp.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) performupdateapp.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) performupdateapp.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) performupdateapp.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2919x50fd9e4a, (Object) performupdateapp.f2919x50fd9e4a);
    }

    public final int hashCode() {
        Integer num = this.MediaSessionCompat$Token;
        int i = 0;
        int hashCode = num != null ? num.hashCode() : 0;
        String str = this.MediaMetadataCompat;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.ParcelableVolumeInfo;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaSessionCompat$QueueItem;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        Boolean bool = this.IconCompatParcelizer;
        int hashCode7 = bool != null ? bool.hashCode() : 0;
        Boolean bool2 = this.MediaDescriptionCompat;
        int hashCode8 = bool2 != null ? bool2.hashCode() : 0;
        Boolean bool3 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode9 = bool3 != null ? bool3.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode10 = str6 != null ? str6.hashCode() : 0;
        List<CommonUtils.C31811> list = this.read;
        int hashCode11 = list != null ? list.hashCode() : 0;
        Boolean bool4 = this.MediaBrowserCompat$MediaItem;
        int hashCode12 = bool4 != null ? bool4.hashCode() : 0;
        String str7 = this.RatingCompat;
        int hashCode13 = str7 != null ? str7.hashCode() : 0;
        Boolean bool5 = this.f2919x50fd9e4a;
        if (bool5 != null) {
            i = bool5.hashCode();
        }
        return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CreditPowerTileDisplay(sortSequence=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", logo=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", productType=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", flowType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", productGroup=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", name=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", enabled=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", isSelected=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", isSecured=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", creditAmount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", details=");
        sb.append(this.read);
        sb.append(", isReferral=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", minimumIncome=");
        sb.append(this.RatingCompat);
        sb.append(", validateEnable=");
        sb.append(this.f2919x50fd9e4a);
        sb.append(")");
        return sb.toString();
    }

    public performUpdateApp(Integer num, String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, Boolean bool3, String str6, List<? extends CommonUtils.C31811> list, Boolean bool4, String str7, Boolean bool5) {
        this.MediaSessionCompat$Token = num;
        this.MediaMetadataCompat = str;
        this.MediaSessionCompat$ResultReceiverWrapper = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.ParcelableVolumeInfo = str4;
        this.MediaSessionCompat$QueueItem = str5;
        this.IconCompatParcelizer = bool;
        this.MediaDescriptionCompat = bool2;
        this.MediaBrowserCompat$SearchResultReceiver = bool3;
        this.MediaBrowserCompat$ItemReceiver = str6;
        this.read = list;
        this.MediaBrowserCompat$MediaItem = bool4;
        this.RatingCompat = str7;
        this.f2919x50fd9e4a = bool5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public performUpdateApp(android.os.Parcel r20) {
        /*
            r19 = this;
            r0 = r20
            java.lang.String r1 = "parcel"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Object r1 = r0.readValue(r1)
            boolean r2 = r1 instanceof java.lang.Integer
            r3 = 0
            if (r2 != 0) goto L_0x0017
            r1 = r3
        L_0x0017:
            r5 = r1
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.String r6 = r20.readString()
            java.lang.String r7 = r20.readString()
            java.lang.String r8 = r20.readString()
            java.lang.String r9 = r20.readString()
            java.lang.String r10 = r20.readString()
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Object r1 = r0.readValue(r1)
            boolean r2 = r1 instanceof java.lang.Boolean
            if (r2 != 0) goto L_0x003d
            r1 = r3
        L_0x003d:
            r11 = r1
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Object r1 = r0.readValue(r1)
            boolean r2 = r1 instanceof java.lang.Boolean
            if (r2 != 0) goto L_0x004f
            r1 = r3
        L_0x004f:
            r12 = r1
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Object r1 = r0.readValue(r1)
            boolean r2 = r1 instanceof java.lang.Boolean
            if (r2 != 0) goto L_0x0061
            r1 = r3
        L_0x0061:
            r13 = r1
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            java.lang.String r14 = r20.readString()
            android.os.Parcelable$Creator<o.CommonUtils$1> r1 = p040o.CommonUtils.C31811.CREATOR
            java.util.ArrayList r1 = r0.createTypedArrayList(r1)
            r15 = r1
            java.util.List r15 = (java.util.List) r15
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Object r1 = r0.readValue(r1)
            boolean r2 = r1 instanceof java.lang.Boolean
            if (r2 != 0) goto L_0x0080
            r1 = r3
        L_0x0080:
            r16 = r1
            java.lang.Boolean r16 = (java.lang.Boolean) r16
            java.lang.String r17 = r20.readString()
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Object r0 = r0.readValue(r1)
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 != 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r3 = r0
        L_0x0098:
            r18 = r3
            java.lang.Boolean r18 = (java.lang.Boolean) r18
            r4 = r19
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.performUpdateApp.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeValue(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeValue(this.IconCompatParcelizer);
        parcel.writeValue(this.MediaDescriptionCompat);
        parcel.writeValue(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeTypedList(this.read);
        parcel.writeValue(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.RatingCompat);
        parcel.writeValue(this.f2919x50fd9e4a);
    }

    /* renamed from: o.performUpdateApp$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator<performUpdateApp> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new performUpdateApp(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new performUpdateApp[i];
        }
    }
}

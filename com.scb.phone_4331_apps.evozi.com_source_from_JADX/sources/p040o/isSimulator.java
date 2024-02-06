package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Device;

/* renamed from: o.isSimulator */
public final class isSimulator extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<isSimulator> CREATOR = new read();
    private final String AlertController$RecycleListView;
    private final int AppCompatDelegateImpl$ListMenuDecorView;
    private final int AppCompatDialogFragment;
    public final String IconCompatParcelizer;
    private final int Keep;
    public final List<String> MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String f2878x50fd9e4a;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompat$QueueItem;
    public final String MediaSessionCompat$ResultReceiverWrapper;
    private final int MediaSessionCompat$Token;
    public final AutoValue_CrashlyticsReport_Session_Device.C30661 ParcelableVolumeInfo;
    private final String PlaybackStateCompat;
    private final String PlaybackStateCompat$CustomAction;
    public final String RatingCompat;
    public final String read;
    private final List<setManufacturer> setHasDecor;

    public final int describeContents() {
        return 0;
    }

    public isSimulator(int i, String str, AutoValue_CrashlyticsReport_Session_Device.C30661 r14, String str2, String str3, String str4, List<String> list, String str5, String str6, String str7, String str8, String str9, int i2, int i3, int i4, String str10, String str11, String str12, List<setManufacturer> list2, boolean z, String str13, String str14) {
        String str15 = str3;
        List<String> list3 = list;
        String str16 = str7;
        String str17 = str12;
        List<setManufacturer> list4 = list2;
        String str18 = str13;
        String str19 = str14;
        onGetStartedClick.write((Object) r14, "productType");
        onGetStartedClick.write((Object) str2, "cardRefNo");
        onGetStartedClick.write((Object) str15, "cardMask");
        onGetStartedClick.write((Object) list3, "allowTag");
        onGetStartedClick.write((Object) str16, "prepaidBalance");
        onGetStartedClick.write((Object) str17, "billerId");
        onGetStartedClick.write((Object) list4, "transactions");
        onGetStartedClick.write((Object) str18, "prepaidCardType");
        onGetStartedClick.write((Object) str19, "filterMonthNo");
        this.Keep = i;
        this.MediaBrowserCompat$MediaItem = str;
        this.ParcelableVolumeInfo = r14;
        this.RatingCompat = str2;
        this.IconCompatParcelizer = str15;
        this.MediaBrowserCompat$SearchResultReceiver = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = list3;
        this.AlertController$RecycleListView = str5;
        this.PlaybackStateCompat = str6;
        this.MediaSessionCompat$QueueItem = str16;
        this.read = str8;
        this.MediaSessionCompat$ResultReceiverWrapper = str9;
        this.AppCompatDelegateImpl$ListMenuDecorView = i2;
        this.AppCompatDialogFragment = i3;
        this.MediaSessionCompat$Token = i4;
        this.PlaybackStateCompat$CustomAction = str10;
        this.MediaDescriptionCompat = str11;
        this.MediaBrowserCompat$ItemReceiver = str17;
        this.setHasDecor = list4;
        this.f2878x50fd9e4a = str18;
        this.MediaMetadataCompat = str19;
        this.write = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public isSimulator(android.os.Parcel r27) {
        /*
            r26 = this;
            r0 = r27
            java.lang.String r1 = "source"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            int r3 = r27.readInt()
            java.lang.String r1 = "$this$readStringNonNull"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r27.readString()
            java.lang.String r4 = ""
            if (r2 != 0) goto L_0x001a
            r5 = r4
            goto L_0x001b
        L_0x001a:
            r5 = r2
        L_0x001b:
            java.lang.Class<o.AutoValue_CrashlyticsReport_Session_Device$1> r2 = p040o.AutoValue_CrashlyticsReport_Session_Device.C30661.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            android.os.Parcelable r2 = r0.readParcelable(r2)
            o.AutoValue_CrashlyticsReport_Session_Device$1 r2 = (p040o.AutoValue_CrashlyticsReport_Session_Device.C30661) r2
            if (r2 != 0) goto L_0x002e
            o.AutoValue_CrashlyticsReport_Session_Device$1 r2 = new o.AutoValue_CrashlyticsReport_Session_Device$1
            r2.<init>(r0)
        L_0x002e:
            r6 = r2
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r27.readString()
            if (r2 != 0) goto L_0x003a
            r7 = r4
            goto L_0x003b
        L_0x003a:
            r7 = r2
        L_0x003b:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r27.readString()
            if (r2 != 0) goto L_0x0046
            r8 = r4
            goto L_0x0047
        L_0x0046:
            r8 = r2
        L_0x0047:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r27.readString()
            if (r2 != 0) goto L_0x0052
            r9 = r4
            goto L_0x0053
        L_0x0052:
            r9 = r2
        L_0x0053:
            java.util.ArrayList r2 = r27.createStringArrayList()
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x005f
            o.HmlNationalIdActivity r2 = p040o.HmlNationalIdActivity.IconCompatParcelizer
            java.util.List r2 = (java.util.List) r2
        L_0x005f:
            r10 = r2
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r27.readString()
            if (r2 != 0) goto L_0x006b
            r11 = r4
            goto L_0x006c
        L_0x006b:
            r11 = r2
        L_0x006c:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r27.readString()
            if (r2 != 0) goto L_0x0077
            r12 = r4
            goto L_0x0078
        L_0x0077:
            r12 = r2
        L_0x0078:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r27.readString()
            if (r2 != 0) goto L_0x0083
            r13 = r4
            goto L_0x0084
        L_0x0083:
            r13 = r2
        L_0x0084:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r27.readString()
            if (r2 != 0) goto L_0x008f
            r14 = r4
            goto L_0x0090
        L_0x008f:
            r14 = r2
        L_0x0090:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r27.readString()
            if (r2 != 0) goto L_0x009b
            r15 = r4
            goto L_0x009c
        L_0x009b:
            r15 = r2
        L_0x009c:
            int r16 = r27.readInt()
            int r17 = r27.readInt()
            int r18 = r27.readInt()
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r27.readString()
            if (r2 != 0) goto L_0x00b4
            r19 = r4
            goto L_0x00b6
        L_0x00b4:
            r19 = r2
        L_0x00b6:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r27.readString()
            if (r2 != 0) goto L_0x00c2
            r20 = r4
            goto L_0x00c4
        L_0x00c2:
            r20 = r2
        L_0x00c4:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r27.readString()
            if (r2 != 0) goto L_0x00d0
            r21 = r4
            goto L_0x00d2
        L_0x00d0:
            r21 = r2
        L_0x00d2:
            android.os.Parcelable$Creator<o.setManufacturer> r2 = p040o.setManufacturer.CREATOR
            java.util.ArrayList r2 = r0.createTypedArrayList(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x00e0
            o.HmlNationalIdActivity r2 = p040o.HmlNationalIdActivity.IconCompatParcelizer
            java.util.List r2 = (java.util.List) r2
        L_0x00e0:
            r22 = r2
            int r2 = r27.readInt()
            r23 = r4
            r4 = 1
            if (r4 != r2) goto L_0x00ee
            r24 = r4
            goto L_0x00f1
        L_0x00ee:
            r2 = 0
            r24 = r2
        L_0x00f1:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r27.readString()
            if (r2 != 0) goto L_0x00fd
            r25 = r23
            goto L_0x00ff
        L_0x00fd:
            r25 = r2
        L_0x00ff:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r0 = r27.readString()
            if (r0 != 0) goto L_0x010a
            r0 = r23
        L_0x010a:
            r2 = r26
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r24
            r23 = r25
            r24 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.isSimulator.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "dest");
        parcel.writeInt(this.Keep);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeParcelable(this.ParcelableVolumeInfo, 0);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeStringList(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.AlertController$RecycleListView);
        parcel.writeString(this.PlaybackStateCompat);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeInt(this.AppCompatDelegateImpl$ListMenuDecorView);
        parcel.writeInt(this.AppCompatDialogFragment);
        parcel.writeInt(this.MediaSessionCompat$Token);
        parcel.writeString(this.PlaybackStateCompat$CustomAction);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeTypedList(this.setHasDecor);
        parcel.writeInt(this.write ? 1 : 0);
        parcel.writeString(this.f2878x50fd9e4a);
        parcel.writeString(this.MediaMetadataCompat);
    }

    /* renamed from: o.isSimulator$read */
    public static final class read implements Parcelable.Creator<isSimulator> {
        read() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "source");
            return new isSimulator(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new isSimulator[i];
        }
    }
}

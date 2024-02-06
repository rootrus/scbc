package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.Lazy */
public final class Lazy extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<Lazy> CREATOR = new write();
    public final int AlertController$RecycleListView;
    private final String AppCompatActivity;
    private final int AppCompatDialogFragment;
    public final String[] IconCompatParcelizer;
    private final String Keep;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public CrashlyticsRegistrar MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public Throwable f2750x50fd9e4a;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompat$QueueItem;
    public final String MediaSessionCompat$ResultReceiverWrapper;
    public final String MediaSessionCompat$Token;
    public final String ParcelableVolumeInfo;
    private final String PlaybackStateCompat;
    private final String PlaybackStateCompat$CustomAction;
    public final buildCrashlytics RatingCompat;
    public final String read;
    private final String setContentView;
    private final String setHasDecor;

    public final int describeContents() {
        return 0;
    }

    public Lazy(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, buildCrashlytics buildcrashlytics, String[] strArr, int i2, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z, String str16) {
        onGetStartedClick.write((Object) strArr, "allowTag");
        this.AppCompatDialogFragment = i;
        this.MediaBrowserCompat$MediaItem = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.PlaybackStateCompat$CustomAction = str3;
        this.Keep = str4;
        this.setHasDecor = str5;
        this.PlaybackStateCompat = str6;
        this.setContentView = str7;
        this.AppCompatActivity = str8;
        this.RatingCompat = buildcrashlytics;
        this.IconCompatParcelizer = strArr;
        this.AlertController$RecycleListView = i2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str9;
        this.MediaSessionCompat$QueueItem = str10;
        this.MediaSessionCompat$ResultReceiverWrapper = str11;
        this.read = str12;
        this.ParcelableVolumeInfo = str13;
        this.MediaMetadataCompat = str14;
        this.MediaSessionCompat$Token = str15;
        this.MediaDescriptionCompat = str16;
        this.write = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Lazy(android.os.Parcel r25) {
        /*
            r24 = this;
            r0 = r25
            java.lang.String r1 = "source"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            int r3 = r25.readInt()
            java.lang.String r4 = r25.readString()
            java.lang.String r5 = r25.readString()
            java.lang.String r6 = r25.readString()
            java.lang.String r7 = r25.readString()
            java.lang.String r8 = r25.readString()
            java.lang.String r9 = r25.readString()
            java.lang.String r10 = r25.readString()
            java.lang.String r11 = r25.readString()
            java.lang.Class<o.buildCrashlytics> r1 = p040o.buildCrashlytics.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r0.readParcelable(r1)
            r12 = r1
            o.buildCrashlytics r12 = (p040o.buildCrashlytics) r12
            java.lang.String[] r1 = r25.createStringArray()
            r2 = 0
            if (r1 != 0) goto L_0x0041
            java.lang.String[] r1 = new java.lang.String[r2]
        L_0x0041:
            r13 = r1
            int r14 = r25.readInt()
            java.lang.String r15 = r25.readString()
            java.lang.String r16 = r25.readString()
            java.lang.String r17 = r25.readString()
            java.lang.String r18 = r25.readString()
            java.lang.String r19 = r25.readString()
            java.lang.String r20 = r25.readString()
            java.lang.String r21 = r25.readString()
            int r1 = r25.readInt()
            r2 = 1
            if (r2 != r1) goto L_0x006c
            r22 = r2
            goto L_0x006e
        L_0x006c:
            r22 = 0
        L_0x006e:
            java.lang.String r23 = r25.readString()
            r2 = r24
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.Lazy.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "dest");
        parcel.writeInt(this.AppCompatDialogFragment);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.PlaybackStateCompat$CustomAction);
        parcel.writeString(this.Keep);
        parcel.writeString(this.setHasDecor);
        parcel.writeString(this.PlaybackStateCompat);
        parcel.writeString(this.setContentView);
        parcel.writeString(this.AppCompatActivity);
        parcel.writeParcelable(this.RatingCompat, 0);
        parcel.writeStringArray(this.IconCompatParcelizer);
        parcel.writeInt(this.AlertController$RecycleListView);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.read);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeInt(this.write ? 1 : 0);
        parcel.writeString(this.MediaDescriptionCompat);
    }

    /* renamed from: o.Lazy$write */
    public static final class write implements Parcelable.Creator<Lazy> {
        write() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "source");
            return new Lazy(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Lazy[i];
        }
    }
}

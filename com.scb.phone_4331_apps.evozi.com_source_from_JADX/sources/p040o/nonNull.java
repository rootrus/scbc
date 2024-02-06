package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040o.LogFileManager;

/* renamed from: o.nonNull */
public final class nonNull implements Parcelable {
    public static final Parcelable.Creator<nonNull> CREATOR = new nonNull$MediaBrowserCompat$CustomActionResultReceiver();
    public final Integer IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final List<String> MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public Integer MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final String f2901x50fd9e4a;
    public final String MediaDescriptionCompat;
    public Integer MediaMetadataCompat;
    private final String MediaSessionCompat$ResultReceiverWrapper;
    private final String ParcelableVolumeInfo;
    public final LogFileManager.NoopLogStore RatingCompat;
    public final String read;
    public final Integer write;

    public final int describeContents() {
        return 0;
    }

    public nonNull(LogFileManager.NoopLogStore noopLogStore, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Integer num4, List<String> list, String str6, String str7) {
        this.RatingCompat = noopLogStore;
        this.MediaSessionCompat$ResultReceiverWrapper = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.read = str3;
        this.ParcelableVolumeInfo = str4;
        this.f2901x50fd9e4a = str5;
        this.MediaMetadataCompat = num;
        this.MediaBrowserCompat$SearchResultReceiver = num2;
        this.IconCompatParcelizer = num3;
        this.write = num4;
        this.MediaBrowserCompat$ItemReceiver = list;
        this.MediaBrowserCompat$MediaItem = str6;
        this.MediaDescriptionCompat = str7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public nonNull(android.os.Parcel r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "source"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.Class<o.LogFileManager$NoopLogStore> r1 = p040o.LogFileManager.NoopLogStore.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r0.readParcelable(r1)
            r3 = r1
            o.LogFileManager$NoopLogStore r3 = (p040o.LogFileManager.NoopLogStore) r3
            java.lang.String r4 = r17.readString()
            java.lang.String r5 = r17.readString()
            java.lang.String r6 = r17.readString()
            java.lang.String r7 = r17.readString()
            java.lang.String r8 = r17.readString()
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Object r1 = r0.readValue(r1)
            r9 = r1
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Object r1 = r0.readValue(r1)
            r10 = r1
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Object r1 = r0.readValue(r1)
            r11 = r1
            java.lang.Integer r11 = (java.lang.Integer) r11
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Object r1 = r0.readValue(r1)
            r12 = r1
            java.lang.Integer r12 = (java.lang.Integer) r12
            java.util.ArrayList r1 = r17.createStringArrayList()
            r13 = r1
            java.util.List r13 = (java.util.List) r13
            java.lang.String r14 = r17.readString()
            java.lang.String r15 = r17.readString()
            r2 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.nonNull.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "dest");
        parcel.writeParcelable(this.RatingCompat, 0);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.f2901x50fd9e4a);
        parcel.writeValue(this.MediaMetadataCompat);
        parcel.writeValue(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeValue(this.IconCompatParcelizer);
        parcel.writeValue(this.write);
        parcel.writeStringList(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaDescriptionCompat);
    }

    /* renamed from: o.nonNull$read */
    public static final class read implements findFragmentByWho {
        private read() {
        }

        public /* synthetic */ read(hasResolution hasresolution) {
        }

        public final Object IconCompatParcelizer(Object obj) {
            return hasResolution.MediaBrowserCompat$CustomActionResultReceiver((getParentId) obj);
        }
    }
}

package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.LogFileManager */
public final class LogFileManager extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<LogFileManager> CREATOR = new read();
    private final boolean IconCompatParcelizer;
    private final boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final boolean MediaBrowserCompat$ItemReceiver;
    private final boolean read;

    public final int describeContents() {
        return 0;
    }

    public LogFileManager(boolean z, boolean z2, boolean z3, boolean z4) {
        this.read = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = z2;
        this.MediaBrowserCompat$ItemReceiver = z3;
        this.IconCompatParcelizer = z4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LogFileManager(Parcel parcel) {
        this(Byte.valueOf(parcel.readByte()).equals(1), Byte.valueOf(parcel.readByte()).equals(1), Byte.valueOf(parcel.readByte()).equals(1), Byte.valueOf(parcel.readByte()).equals(1));
        onGetStartedClick.write((Object) parcel, "source");
    }

    /* renamed from: o.LogFileManager$1 */
    public class C35981 extends remainingCapacity implements Parcelable {
        public static final Parcelable.Creator<C35981> CREATOR = new Parcelable.Creator<C35981>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C35981(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C35981[i];
            }
        };
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String MediaBrowserCompat$SearchResultReceiver;
        public String MediaDescriptionCompat;
        public String RatingCompat;
        public String read;

        public int describeContents() {
            return 0;
        }

        protected C35981(Parcel parcel) {
            this.MediaBrowserCompat$ItemReceiver = parcel.readString();
            this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
            this.RatingCompat = parcel.readString();
            this.MediaDescriptionCompat = parcel.readString();
            this.read = parcel.readString();
            this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
            this.IconCompatParcelizer = parcel.readString();
        }

        public C35981() {
        }

        public static C35981 MediaBrowserCompat$CustomActionResultReceiver() {
            return new C35981();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.RatingCompat);
            parcel.writeString(this.MediaDescriptionCompat);
            parcel.writeString(this.read);
            parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
            parcel.writeString(this.IconCompatParcelizer);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35981)) {
                return false;
            }
            C35981 r4 = (C35981) obj;
            return new AddNewCurrencyActivity_ViewBinding().read(this.MediaBrowserCompat$ItemReceiver, r4.MediaBrowserCompat$ItemReceiver).read(this.MediaBrowserCompat$CustomActionResultReceiver, r4.MediaBrowserCompat$CustomActionResultReceiver).read(this.RatingCompat, r4.RatingCompat).read(this.MediaDescriptionCompat, r4.MediaDescriptionCompat).read(this.read, r4.read).read(this.MediaBrowserCompat$SearchResultReceiver, r4.MediaBrowserCompat$SearchResultReceiver).read(this.IconCompatParcelizer, r4.IconCompatParcelizer).MediaBrowserCompat$ItemReceiver;
        }

        public int hashCode() {
            return new DetailsTabHolder_ViewBinding((byte) 0).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver).MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat).MediaBrowserCompat$CustomActionResultReceiver(this.MediaDescriptionCompat).MediaBrowserCompat$CustomActionResultReceiver(this.read).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$SearchResultReceiver).MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer).read;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "dest");
        parcel.writeByte(this.read ? (byte) 1 : 0);
        parcel.writeByte(this.MediaBrowserCompat$CustomActionResultReceiver ? (byte) 1 : 0);
        parcel.writeByte(this.MediaBrowserCompat$ItemReceiver ? (byte) 1 : 0);
        parcel.writeByte(this.IconCompatParcelizer ? (byte) 1 : 0);
    }

    /* renamed from: o.LogFileManager$read */
    public static final class read implements Parcelable.Creator<LogFileManager> {
        read() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "source");
            return new LogFileManager(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LogFileManager[i];
        }
    }

    /* renamed from: o.LogFileManager$DirectoryProvider */
    public final class DirectoryProvider extends remainingCapacity implements Parcelable {
        public static final Parcelable.Creator<DirectoryProvider> CREATOR = new IconCompatParcelizer();
        private final String ActionMenuItemView;
        private final LogFileManager AlertController$RecycleListView;
        private final String AppCompatActivity;
        private final boolean AppCompatDelegateImpl$ListMenuDecorView;
        private final String AppCompatDialogFragment;
        private final String AppCompatViewInflater;
        public final String IconCompatParcelizer;
        private final String Keep;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final getWorkingFileForSession MediaBrowserCompat$MediaItem;
        public final String MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public final setLogFile f2754x50fd9e4a;
        public final String MediaDescriptionCompat;
        public final String MediaMetadataCompat;
        public final boolean MediaSessionCompat$QueueItem;
        public final PlaceAutocompleteFragment MediaSessionCompat$ResultReceiverWrapper;
        private final closeLogFile MediaSessionCompat$Token;
        private final String ParcelableVolumeInfo;
        private final int PlaybackStateCompat;
        private final String PlaybackStateCompat$CustomAction;
        public final String RatingCompat;
        public final boolean read;
        private final String setBackgroundResource;
        private final String setCheckable;
        private final List<getLogString> setChecked;
        private final String setContentView;
        private final int setExpandedFormat;
        private final String setHasDecor;
        private final String setPadding;
        private final String setShortcut;

        public final int describeContents() {
            return 0;
        }

        public DirectoryProvider(String str, int i, boolean z, boolean z2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, PlaceAutocompleteFragment placeAutocompleteFragment, String str12, String str13, String str14, String str15, List<getLogString> list, String str16, int i2, String str17, String str18, String str19, setLogFile setlogfile, closeLogFile closelogfile, LogFileManager logFileManager, getWorkingFileForSession getworkingfileforsession, String str20, boolean z3) {
            this.PlaybackStateCompat$CustomAction = str;
            this.setExpandedFormat = i;
            this.MediaSessionCompat$QueueItem = z;
            this.AppCompatDelegateImpl$ListMenuDecorView = z2;
            this.RatingCompat = str2;
            this.setShortcut = str3;
            this.ActionMenuItemView = str4;
            this.AppCompatActivity = str5;
            this.AppCompatDialogFragment = str6;
            this.setPadding = str7;
            this.setCheckable = str8;
            this.setBackgroundResource = str9;
            this.setContentView = str10;
            this.Keep = str11;
            this.MediaSessionCompat$ResultReceiverWrapper = placeAutocompleteFragment;
            this.MediaBrowserCompat$CustomActionResultReceiver = str12;
            this.MediaBrowserCompat$ItemReceiver = str13;
            this.MediaBrowserCompat$SearchResultReceiver = str14;
            this.AppCompatViewInflater = str15;
            this.setChecked = list;
            this.setHasDecor = str16;
            this.PlaybackStateCompat = i2;
            this.ParcelableVolumeInfo = str17;
            this.MediaMetadataCompat = str18;
            this.MediaDescriptionCompat = str19;
            this.f2754x50fd9e4a = setlogfile;
            this.MediaSessionCompat$Token = closelogfile;
            this.AlertController$RecycleListView = logFileManager;
            this.MediaBrowserCompat$MediaItem = getworkingfileforsession;
            this.IconCompatParcelizer = str20;
            this.read = z3;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DirectoryProvider(android.os.Parcel r35) {
            /*
                r34 = this;
                r0 = r35
                java.lang.String r1 = "source"
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r3 = r35.readString()
                int r4 = r35.readInt()
                byte r1 = r35.readByte()
                r5 = 1
                if (r1 != r5) goto L_0x0018
                r1 = r5
                goto L_0x0019
            L_0x0018:
                r1 = 0
            L_0x0019:
                byte r6 = r35.readByte()
                if (r6 != r5) goto L_0x0021
                r6 = r5
                goto L_0x0022
            L_0x0021:
                r6 = 0
            L_0x0022:
                java.lang.String r7 = r35.readString()
                java.lang.String r8 = r35.readString()
                java.lang.String r9 = r35.readString()
                java.lang.String r10 = r35.readString()
                java.lang.String r11 = r35.readString()
                java.lang.String r12 = r35.readString()
                java.lang.String r13 = r35.readString()
                java.lang.String r14 = r35.readString()
                java.lang.String r15 = r35.readString()
                java.lang.String r16 = r35.readString()
                java.lang.String r2 = "$this$readStringNonNull"
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r2)
                java.lang.String r2 = r35.readString()
                if (r2 != 0) goto L_0x0057
                java.lang.String r2 = ""
            L_0x0057:
                o.PlaceAutocompleteFragment r18 = p040o.PlaceAutocompleteFragment.MediaBrowserCompat$ItemReceiver(r2)
                java.lang.String r19 = r35.readString()
                java.lang.String r20 = r35.readString()
                java.lang.String r21 = r35.readString()
                java.lang.String r22 = r35.readString()
                android.os.Parcelable$Creator<o.getLogString> r2 = p040o.getLogString.CREATOR
                java.util.ArrayList r2 = r0.createTypedArrayList(r2)
                r23 = r2
                java.util.List r23 = (java.util.List) r23
                java.lang.String r24 = r35.readString()
                int r25 = r35.readInt()
                java.lang.String r26 = r35.readString()
                java.lang.String r27 = r35.readString()
                java.lang.String r28 = r35.readString()
                java.lang.Class<o.setLogFile> r2 = p040o.setLogFile.class
                java.lang.ClassLoader r2 = r2.getClassLoader()
                android.os.Parcelable r2 = r0.readParcelable(r2)
                r29 = r2
                o.setLogFile r29 = (p040o.setLogFile) r29
                java.lang.Class<o.closeLogFile> r2 = p040o.closeLogFile.class
                java.lang.ClassLoader r2 = r2.getClassLoader()
                android.os.Parcelable r2 = r0.readParcelable(r2)
                r30 = r2
                o.closeLogFile r30 = (p040o.closeLogFile) r30
                java.lang.Class<o.LogFileManager> r2 = p040o.LogFileManager.class
                java.lang.ClassLoader r2 = r2.getClassLoader()
                android.os.Parcelable r2 = r0.readParcelable(r2)
                r31 = r2
                o.LogFileManager r31 = (p040o.LogFileManager) r31
                java.lang.Class<o.getWorkingFileForSession> r2 = p040o.getWorkingFileForSession.class
                java.lang.ClassLoader r2 = r2.getClassLoader()
                android.os.Parcelable r2 = r0.readParcelable(r2)
                r32 = r2
                o.getWorkingFileForSession r32 = (p040o.getWorkingFileForSession) r32
                java.lang.String r33 = r35.readString()
                byte r0 = r35.readByte()
                if (r0 != r5) goto L_0x00cd
                r0 = r5
                goto L_0x00ce
            L_0x00cd:
                r0 = 0
            L_0x00ce:
                r2 = r34
                r5 = r1
                r17 = r18
                r18 = r19
                r19 = r20
                r20 = r21
                r21 = r22
                r22 = r23
                r23 = r24
                r24 = r25
                r25 = r26
                r26 = r27
                r27 = r28
                r28 = r29
                r29 = r30
                r30 = r31
                r31 = r32
                r32 = r33
                r33 = r0
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.LogFileManager.DirectoryProvider.<init>(android.os.Parcel):void");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            String str;
            onGetStartedClick.write((Object) parcel, "dest");
            parcel.writeString(this.PlaybackStateCompat$CustomAction);
            parcel.writeInt(this.setExpandedFormat);
            parcel.writeByte(this.MediaSessionCompat$QueueItem ? (byte) 1 : 0);
            parcel.writeByte(this.AppCompatDelegateImpl$ListMenuDecorView ? (byte) 1 : 0);
            parcel.writeString(this.RatingCompat);
            parcel.writeString(this.setShortcut);
            parcel.writeString(this.ActionMenuItemView);
            parcel.writeString(this.AppCompatActivity);
            parcel.writeString(this.AppCompatDialogFragment);
            parcel.writeString(this.setPadding);
            parcel.writeString(this.setCheckable);
            parcel.writeString(this.setBackgroundResource);
            parcel.writeString(this.setContentView);
            parcel.writeString(this.Keep);
            PlaceAutocompleteFragment placeAutocompleteFragment = this.MediaSessionCompat$ResultReceiverWrapper;
            if (placeAutocompleteFragment != null) {
                str = placeAutocompleteFragment.code;
            } else {
                str = null;
            }
            parcel.writeString(str);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
            parcel.writeString(this.AppCompatViewInflater);
            parcel.writeTypedList(this.setChecked);
            parcel.writeString(this.setHasDecor);
            parcel.writeInt(this.PlaybackStateCompat);
            parcel.writeString(this.ParcelableVolumeInfo);
            parcel.writeString(this.MediaMetadataCompat);
            parcel.writeString(this.MediaDescriptionCompat);
            parcel.writeParcelable(this.f2754x50fd9e4a, i);
            parcel.writeParcelable(this.MediaSessionCompat$Token, i);
            parcel.writeParcelable(this.AlertController$RecycleListView, i);
            parcel.writeParcelable(this.MediaBrowserCompat$MediaItem, i);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeByte(this.read ? (byte) 1 : 0);
        }

        /* renamed from: o.LogFileManager$DirectoryProvider$IconCompatParcelizer */
        public static final class IconCompatParcelizer implements Parcelable.Creator<DirectoryProvider> {
            IconCompatParcelizer() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "source");
                return new DirectoryProvider(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new DirectoryProvider[i];
            }
        }
    }

    /* renamed from: o.LogFileManager$NoopLogStore */
    public final class NoopLogStore implements Parcelable {
        public static final IconCompatParcelizer CREATOR = new IconCompatParcelizer((byte) 0);
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String read;

        public final int describeContents() {
            return 0;
        }

        public NoopLogStore(String str, String str2) {
            this.read = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public NoopLogStore(Parcel parcel) {
            this(parcel.readString(), parcel.readString());
            onGetStartedClick.write((Object) parcel, "parcel");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.read);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        }

        /* renamed from: o.LogFileManager$NoopLogStore$IconCompatParcelizer */
        public static final class IconCompatParcelizer implements Parcelable.Creator<NoopLogStore> {
            private IconCompatParcelizer() {
            }

            public /* synthetic */ IconCompatParcelizer(byte b) {
                this();
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "parcel");
                return new NoopLogStore(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new NoopLogStore[i];
            }
        }
    }
}

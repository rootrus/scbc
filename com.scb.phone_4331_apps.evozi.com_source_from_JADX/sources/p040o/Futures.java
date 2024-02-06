package p040o;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

/* renamed from: o.Futures */
public final class Futures extends TypeAdapter implements addKernel {
    private validateDAGRecurse MediaBrowserCompat$CustomActionResultReceiver;
    private Gson read;
    private validateCycle write;

    /* renamed from: o.Futures$MappingCheckedFuture */
    public final /* synthetic */ class MappingCheckedFuture {
        public static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[zzwd.values().length];
            MediaBrowserCompat$ItemReceiver = iArr;
            iArr[zzwd.CAMERA.ordinal()] = 1;
            MediaBrowserCompat$ItemReceiver[zzwd.GALLERY.ordinal()] = 2;
            MediaBrowserCompat$ItemReceiver[zzwd.FILE_STORAGE.ordinal()] = 3;
            int[] iArr2 = new int[zzwf.values().length];
            write = iArr2;
            iArr2[zzwf.NATIVE.ordinal()] = 1;
            write[zzwf.KOFAX.ordinal()] = 2;
        }
    }

    /* renamed from: o.Futures$3 */
    public abstract class C34093 {
        private C34093() {
        }

        public /* synthetic */ C34093(byte b) {
            this();
        }
    }

    /* renamed from: o.Futures$ListenableFutureAdapter */
    public final class ListenableFutureAdapter extends C34093 {
        public final Drawable IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final Drawable read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenableFutureAdapter)) {
                return false;
            }
            ListenableFutureAdapter listenableFutureAdapter = (ListenableFutureAdapter) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) listenableFutureAdapter.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) listenableFutureAdapter.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) listenableFutureAdapter.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            Drawable drawable = this.read;
            int i = 0;
            int hashCode = drawable != null ? drawable.hashCode() : 0;
            Drawable drawable2 = this.IconCompatParcelizer;
            int hashCode2 = drawable2 != null ? drawable2.hashCode() : 0;
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str != null) {
                i = str.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ResourceInstructionDisplay(iconTop=");
            sb.append(this.read);
            sb.append(", iconBottom=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", text=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ ListenableFutureAdapter(Drawable drawable, String str) {
            this(drawable, (Drawable) null, str);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ListenableFutureAdapter(Drawable drawable, Drawable drawable2, String str) {
            super((byte) 0);
            onGetStartedClick.write((Object) str, "text");
            this.read = drawable;
            this.IconCompatParcelizer = drawable2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }
    }

    /* renamed from: o.Futures$2 */
    public final class C34072 extends remainingCapacity implements Parcelable {
        public static final Parcelable.Creator<C34072> CREATOR = new Parcelable.Creator<C34072>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C34072(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C34072[i];
            }
        };
        public int IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String read;

        public final int describeContents() {
            return 0;
        }

        public static C34072 MediaBrowserCompat$ItemReceiver() {
            return new C34072();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.read);
            parcel.writeInt(this.IconCompatParcelizer);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        }

        public C34072() {
        }

        protected C34072(Parcel parcel) {
            this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
            this.read = parcel.readString();
            this.IconCompatParcelizer = parcel.readInt();
            this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C34072)) {
                return false;
            }
            C34072 r5 = (C34072) obj;
            if (this.IconCompatParcelizer != r5.IconCompatParcelizer) {
                return false;
            }
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str == null ? r5.MediaBrowserCompat$CustomActionResultReceiver != null : !str.equals(r5.MediaBrowserCompat$CustomActionResultReceiver)) {
                return false;
            }
            String str2 = this.read;
            if (str2 == null ? r5.read != null : !str2.equals(r5.read)) {
                return false;
            }
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            if (str3 != null) {
                return str3.equals(r5.MediaBrowserCompat$ItemReceiver);
            }
            if (r5.MediaBrowserCompat$ItemReceiver != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i;
            int i2;
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i3 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            String str2 = this.read;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            if (str3 != null) {
                i3 = str3.hashCode();
            }
            return (((((i * 31) + i2) * 31) + i3) * 31) + this.IconCompatParcelizer;
        }
    }

    /* renamed from: o.Futures$5 */
    public final class C34115 implements Parcelable {
        public static final Parcelable.Creator<C34115> CREATOR = new Parcelable.Creator<C34115>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C34115(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C34115[i];
            }
        };
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        private String MediaBrowserCompat$MediaItem;
        public String MediaBrowserCompat$SearchResultReceiver;
        public String MediaDescriptionCompat;
        private int MediaMetadataCompat;
        public String RatingCompat;
        public String read;
        public String write;

        public final int describeContents() {
            return 0;
        }

        public C34115(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.read = str;
            this.MediaMetadataCompat = i;
            this.IconCompatParcelizer = str2;
            this.MediaBrowserCompat$SearchResultReceiver = str3;
            this.write = str4;
            this.MediaBrowserCompat$ItemReceiver = str5;
            this.MediaBrowserCompat$CustomActionResultReceiver = str6;
            this.MediaDescriptionCompat = str7;
            this.MediaBrowserCompat$MediaItem = str8;
            this.RatingCompat = str9;
        }

        protected C34115(Parcel parcel) {
            this.read = parcel.readString();
            this.MediaMetadataCompat = parcel.readInt();
            this.IconCompatParcelizer = parcel.readString();
            this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
            this.write = parcel.readString();
            this.MediaBrowserCompat$ItemReceiver = parcel.readString();
            this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
            this.MediaDescriptionCompat = parcel.readString();
            this.MediaBrowserCompat$MediaItem = parcel.readString();
            this.RatingCompat = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.read);
            parcel.writeInt(this.MediaMetadataCompat);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
            parcel.writeString(this.write);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.MediaDescriptionCompat);
            parcel.writeString(this.MediaBrowserCompat$MediaItem);
            parcel.writeString(this.RatingCompat);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C34115 r5 = (C34115) obj;
            if (this.MediaMetadataCompat != r5.MediaMetadataCompat) {
                return false;
            }
            String str = this.read;
            if (str == null ? r5.read != null : !str.equals(r5.read)) {
                return false;
            }
            String str2 = this.IconCompatParcelizer;
            if (str2 == null ? r5.IconCompatParcelizer != null : !str2.equals(r5.IconCompatParcelizer)) {
                return false;
            }
            String str3 = this.MediaBrowserCompat$SearchResultReceiver;
            if (str3 == null ? r5.MediaBrowserCompat$SearchResultReceiver != null : !str3.equals(r5.MediaBrowserCompat$SearchResultReceiver)) {
                return false;
            }
            String str4 = this.write;
            if (str4 == null ? r5.write != null : !str4.equals(r5.write)) {
                return false;
            }
            String str5 = this.MediaBrowserCompat$ItemReceiver;
            if (str5 == null ? r5.MediaBrowserCompat$ItemReceiver != null : !str5.equals(r5.MediaBrowserCompat$ItemReceiver)) {
                return false;
            }
            String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str6 == null ? r5.MediaBrowserCompat$CustomActionResultReceiver != null : !str6.equals(r5.MediaBrowserCompat$CustomActionResultReceiver)) {
                return false;
            }
            String str7 = this.MediaDescriptionCompat;
            if (str7 == null ? r5.MediaDescriptionCompat != null : !str7.equals(r5.MediaDescriptionCompat)) {
                return false;
            }
            String str8 = this.MediaBrowserCompat$MediaItem;
            if (str8 == null ? r5.MediaBrowserCompat$MediaItem != null : !str8.equals(r5.MediaBrowserCompat$MediaItem)) {
                return false;
            }
            String str9 = this.RatingCompat;
            String str10 = r5.RatingCompat;
            if (str9 != null) {
                return str9.equals(str10);
            }
            if (str10 != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            int i2 = this.MediaMetadataCompat;
            String str2 = this.IconCompatParcelizer;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.write;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode6 = str6 != null ? str6.hashCode() : 0;
            String str7 = this.MediaDescriptionCompat;
            int hashCode7 = str7 != null ? str7.hashCode() : 0;
            String str8 = this.MediaBrowserCompat$MediaItem;
            int hashCode8 = str8 != null ? str8.hashCode() : 0;
            String str9 = this.RatingCompat;
            if (str9 != null) {
                i = str9.hashCode();
            }
            return (((((((((((((((((hashCode * 31) + i2) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
        }
    }

    /* renamed from: o.Futures$ChainingListenableFuture */
    public final class ChainingListenableFuture extends remainingCapacity implements Parcelable {
        public static final Parcelable.Creator<ChainingListenableFuture> CREATOR = new Parcelable.Creator<ChainingListenableFuture>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new ChainingListenableFuture(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new ChainingListenableFuture[i];
            }
        };
        public String ActionMenuItemView;
        public Integer AlertController$RecycleListView;
        public String AppCompatActivity;
        public String AppCompatDelegateImpl$ListMenuDecorView;
        public int AppCompatDialogFragment;
        private BigDecimal AppCompatViewInflater;
        public String IconCompatParcelizer;
        public Integer Keep;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String MediaBrowserCompat$MediaItem;
        public String MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public String f2712x50fd9e4a;
        public String MediaDescriptionCompat;
        public String MediaMetadataCompat;
        public List<C34131> MediaSessionCompat$QueueItem;
        public List<C34115> MediaSessionCompat$ResultReceiverWrapper;
        public String MediaSessionCompat$Token;
        public String ParcelableVolumeInfo;
        public String PlaybackStateCompat;
        public String PlaybackStateCompat$CustomAction;
        public String RatingCompat;
        public String read;
        public String setBackgroundResource;
        private int setCheckable;
        public String setChecked;
        public String setContentView;
        public String setExpandedFormat;
        public boolean setHasDecor;

        public final int describeContents() {
            return 0;
        }

        /* renamed from: o.Futures$ChainingListenableFuture$1 */
        public final class C34131 implements Parcelable {
            public static final Parcelable.Creator<C34131> CREATOR = new Parcelable.Creator<C34131>() {
                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return new C34131(parcel);
                }

                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new C34131[i];
                }
            };
            public String IconCompatParcelizer;
            public String MediaBrowserCompat$CustomActionResultReceiver;
            public String MediaBrowserCompat$ItemReceiver;
            public String MediaBrowserCompat$MediaItem;
            public String MediaBrowserCompat$SearchResultReceiver;

            /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
            private String f2713x50fd9e4a;
            public String MediaDescriptionCompat;
            public String MediaMetadataCompat;
            private int MediaSessionCompat$ResultReceiverWrapper;
            public String ParcelableVolumeInfo;
            public String RatingCompat;
            public String read;
            public List<makeListenable> write;

            public final int describeContents() {
                return 0;
            }

            public C34131(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<makeListenable> list, String str10, String str11) {
                this.MediaSessionCompat$ResultReceiverWrapper = i;
                this.MediaBrowserCompat$ItemReceiver = str;
                this.MediaDescriptionCompat = str2;
                this.MediaMetadataCompat = str3;
                this.IconCompatParcelizer = str4;
                this.MediaBrowserCompat$MediaItem = str5;
                this.read = str6;
                this.MediaBrowserCompat$CustomActionResultReceiver = str7;
                this.ParcelableVolumeInfo = str8;
                this.RatingCompat = str9;
                this.write = list;
                this.MediaBrowserCompat$SearchResultReceiver = str10;
                this.f2713x50fd9e4a = str11;
            }

            protected C34131(Parcel parcel) {
                this.MediaSessionCompat$ResultReceiverWrapper = parcel.readInt();
                this.MediaBrowserCompat$ItemReceiver = parcel.readString();
                this.MediaDescriptionCompat = parcel.readString();
                this.MediaMetadataCompat = parcel.readString();
                this.IconCompatParcelizer = parcel.readString();
                this.MediaBrowserCompat$MediaItem = parcel.readString();
                this.read = parcel.readString();
                this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
                this.ParcelableVolumeInfo = parcel.readString();
                this.RatingCompat = parcel.readString();
                this.write = parcel.createTypedArrayList(makeListenable.CREATOR);
                this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
                this.f2713x50fd9e4a = parcel.readString();
            }

            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.MediaSessionCompat$ResultReceiverWrapper);
                parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
                parcel.writeString(this.MediaDescriptionCompat);
                parcel.writeString(this.MediaMetadataCompat);
                parcel.writeString(this.IconCompatParcelizer);
                parcel.writeString(this.MediaBrowserCompat$MediaItem);
                parcel.writeString(this.read);
                parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
                parcel.writeString(this.ParcelableVolumeInfo);
                parcel.writeString(this.RatingCompat);
                parcel.writeTypedList(this.write);
                parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
                parcel.writeString(this.f2713x50fd9e4a);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                C34131 r5 = (C34131) obj;
                if (this.MediaSessionCompat$ResultReceiverWrapper != r5.MediaSessionCompat$ResultReceiverWrapper) {
                    return false;
                }
                String str = this.MediaBrowserCompat$ItemReceiver;
                if (str == null ? r5.MediaBrowserCompat$ItemReceiver != null : !str.equals(r5.MediaBrowserCompat$ItemReceiver)) {
                    return false;
                }
                String str2 = this.MediaDescriptionCompat;
                if (str2 == null ? r5.MediaDescriptionCompat != null : !str2.equals(r5.MediaDescriptionCompat)) {
                    return false;
                }
                String str3 = this.MediaMetadataCompat;
                if (str3 == null ? r5.MediaMetadataCompat != null : !str3.equals(r5.MediaMetadataCompat)) {
                    return false;
                }
                String str4 = this.IconCompatParcelizer;
                if (str4 == null ? r5.IconCompatParcelizer != null : !str4.equals(r5.IconCompatParcelizer)) {
                    return false;
                }
                String str5 = this.MediaBrowserCompat$MediaItem;
                if (str5 == null ? r5.MediaBrowserCompat$MediaItem != null : !str5.equals(r5.MediaBrowserCompat$MediaItem)) {
                    return false;
                }
                String str6 = this.read;
                if (str6 == null ? r5.read != null : !str6.equals(r5.read)) {
                    return false;
                }
                String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (str7 == null ? r5.MediaBrowserCompat$CustomActionResultReceiver != null : !str7.equals(r5.MediaBrowserCompat$CustomActionResultReceiver)) {
                    return false;
                }
                String str8 = this.ParcelableVolumeInfo;
                if (str8 == null ? r5.ParcelableVolumeInfo != null : !str8.equals(r5.ParcelableVolumeInfo)) {
                    return false;
                }
                String str9 = this.RatingCompat;
                if (str9 == null ? r5.RatingCompat != null : !str9.equals(r5.RatingCompat)) {
                    return false;
                }
                List<makeListenable> list = this.write;
                if (list == null ? r5.write != null : !list.equals(r5.write)) {
                    return false;
                }
                String str10 = this.MediaBrowserCompat$SearchResultReceiver;
                if (str10 == null ? r5.MediaBrowserCompat$SearchResultReceiver != null : !str10.equals(r5.MediaBrowserCompat$SearchResultReceiver)) {
                    return false;
                }
                String str11 = this.f2713x50fd9e4a;
                String str12 = r5.f2713x50fd9e4a;
                if (str11 != null) {
                    return str11.equals(str12);
                }
                if (str12 != null) {
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                int i = this.MediaSessionCompat$ResultReceiverWrapper;
                String str = this.MediaBrowserCompat$ItemReceiver;
                int i2 = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.MediaDescriptionCompat;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.MediaMetadataCompat;
                int hashCode3 = str3 != null ? str3.hashCode() : 0;
                String str4 = this.IconCompatParcelizer;
                int hashCode4 = str4 != null ? str4.hashCode() : 0;
                String str5 = this.MediaBrowserCompat$MediaItem;
                int hashCode5 = str5 != null ? str5.hashCode() : 0;
                String str6 = this.read;
                int hashCode6 = str6 != null ? str6.hashCode() : 0;
                String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
                int hashCode7 = str7 != null ? str7.hashCode() : 0;
                String str8 = this.ParcelableVolumeInfo;
                int hashCode8 = str8 != null ? str8.hashCode() : 0;
                String str9 = this.RatingCompat;
                int hashCode9 = str9 != null ? str9.hashCode() : 0;
                List<makeListenable> list = this.write;
                int hashCode10 = list != null ? list.hashCode() : 0;
                String str10 = this.MediaBrowserCompat$SearchResultReceiver;
                int hashCode11 = str10 != null ? str10.hashCode() : 0;
                String str11 = this.f2713x50fd9e4a;
                if (str11 != null) {
                    i2 = str11.hashCode();
                }
                return (((((((((((((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + i2;
            }
        }

        public ChainingListenableFuture(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, Integer num2, String str12, String str13, boolean z, String str14, String str15, String str16, String str17, String str18, String str19, String str20, boolean z2) {
            this.AppCompatActivity = str;
            this.setBackgroundResource = str2;
            this.AppCompatDialogFragment = i;
            this.setContentView = str3;
            this.MediaBrowserCompat$ItemReceiver = str4;
            this.read = str5;
            this.MediaBrowserCompat$SearchResultReceiver = str6;
            this.MediaDescriptionCompat = str7;
            this.PlaybackStateCompat = str8;
            this.setChecked = str9;
            this.MediaSessionCompat$Token = str10;
            this.setExpandedFormat = str11;
            this.Keep = num;
            this.AlertController$RecycleListView = num2;
            this.f2712x50fd9e4a = str12;
            this.ParcelableVolumeInfo = str13;
            this.setHasDecor = z;
            this.MediaBrowserCompat$CustomActionResultReceiver = str14;
            this.PlaybackStateCompat$CustomAction = str15;
            this.IconCompatParcelizer = str16;
            this.MediaMetadataCompat = str17;
            this.RatingCompat = str18;
            this.MediaBrowserCompat$MediaItem = str19;
            this.AppCompatDelegateImpl$ListMenuDecorView = str20;
            this.write = z2;
        }

        public ChainingListenableFuture(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, Integer num2, String str11, String str12, String str13, String str14, int i2, List<C34115> list, boolean z) {
            this.AppCompatActivity = str;
            this.AppCompatDialogFragment = i;
            this.setContentView = str2;
            this.MediaBrowserCompat$ItemReceiver = str3;
            this.read = str4;
            this.MediaBrowserCompat$SearchResultReceiver = str5;
            this.MediaDescriptionCompat = str6;
            this.PlaybackStateCompat = str7;
            this.setChecked = str8;
            this.MediaSessionCompat$Token = str9;
            this.setExpandedFormat = str10;
            this.Keep = num;
            this.AlertController$RecycleListView = num2;
            this.f2712x50fd9e4a = str11;
            this.ParcelableVolumeInfo = str12;
            this.ActionMenuItemView = str13;
            this.MediaBrowserCompat$CustomActionResultReceiver = str14;
            this.setCheckable = i2;
            this.MediaSessionCompat$ResultReceiverWrapper = list;
            this.write = z;
        }

        public ChainingListenableFuture(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, Integer num2, BigDecimal bigDecimal, String str11, String str12, String str13, String str14, int i2, List<C34131> list, boolean z) {
            this.AppCompatActivity = str;
            this.AppCompatDialogFragment = i;
            this.setContentView = str2;
            this.MediaBrowserCompat$ItemReceiver = str3;
            this.read = str4;
            this.MediaBrowserCompat$SearchResultReceiver = str5;
            this.MediaDescriptionCompat = str6;
            this.PlaybackStateCompat = str7;
            this.setChecked = str8;
            this.MediaSessionCompat$Token = str9;
            this.setExpandedFormat = str10;
            this.Keep = num;
            this.AlertController$RecycleListView = num2;
            this.AppCompatViewInflater = bigDecimal;
            this.f2712x50fd9e4a = str11;
            this.ParcelableVolumeInfo = str12;
            this.ActionMenuItemView = str13;
            this.MediaBrowserCompat$CustomActionResultReceiver = str14;
            this.setCheckable = i2;
            this.MediaSessionCompat$QueueItem = list;
            this.write = z;
        }

        protected ChainingListenableFuture(Parcel parcel) {
            this.AppCompatActivity = parcel.readString();
            this.setBackgroundResource = parcel.readString();
            this.AppCompatDialogFragment = parcel.readInt();
            this.setContentView = parcel.readString();
            this.MediaBrowserCompat$ItemReceiver = parcel.readString();
            this.read = parcel.readString();
            this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
            this.MediaDescriptionCompat = parcel.readString();
            this.PlaybackStateCompat = parcel.readString();
            this.setChecked = parcel.readString();
            this.MediaSessionCompat$Token = parcel.readString();
            this.setExpandedFormat = parcel.readString();
            if (parcel.readByte() == 0) {
                this.Keep = null;
            } else {
                this.Keep = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readByte() == 0) {
                this.AlertController$RecycleListView = null;
            } else {
                this.AlertController$RecycleListView = Integer.valueOf(parcel.readInt());
            }
            this.f2712x50fd9e4a = parcel.readString();
            this.ParcelableVolumeInfo = parcel.readString();
            this.ActionMenuItemView = parcel.readString();
            this.setHasDecor = parcel.readByte() != 0;
            this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
            this.PlaybackStateCompat$CustomAction = parcel.readString();
            this.setCheckable = parcel.readInt();
            this.MediaSessionCompat$ResultReceiverWrapper = parcel.createTypedArrayList(C34115.CREATOR);
            this.MediaSessionCompat$QueueItem = parcel.createTypedArrayList(C34131.CREATOR);
            this.IconCompatParcelizer = parcel.readString();
            this.MediaMetadataCompat = parcel.readString();
            this.RatingCompat = parcel.readString();
            this.MediaBrowserCompat$MediaItem = parcel.readString();
            this.AppCompatDelegateImpl$ListMenuDecorView = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.AppCompatActivity);
            parcel.writeString(this.setBackgroundResource);
            parcel.writeInt(this.AppCompatDialogFragment);
            parcel.writeString(this.setContentView);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.read);
            parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
            parcel.writeString(this.MediaDescriptionCompat);
            parcel.writeString(this.PlaybackStateCompat);
            parcel.writeString(this.setChecked);
            parcel.writeString(this.MediaSessionCompat$Token);
            parcel.writeString(this.setExpandedFormat);
            if (this.Keep == null) {
                parcel.writeByte((byte) 0);
            } else {
                parcel.writeByte((byte) 1);
                parcel.writeInt(this.Keep.intValue());
            }
            if (this.AlertController$RecycleListView == null) {
                parcel.writeByte((byte) 0);
            } else {
                parcel.writeByte((byte) 1);
                parcel.writeInt(this.AlertController$RecycleListView.intValue());
            }
            parcel.writeString(this.f2712x50fd9e4a);
            parcel.writeString(this.ParcelableVolumeInfo);
            parcel.writeString(this.ActionMenuItemView);
            parcel.writeByte(this.setHasDecor ? (byte) 1 : 0);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.PlaybackStateCompat$CustomAction);
            parcel.writeInt(this.setCheckable);
            parcel.writeTypedList(this.MediaSessionCompat$ResultReceiverWrapper);
            parcel.writeTypedList(this.MediaSessionCompat$QueueItem);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.MediaMetadataCompat);
            parcel.writeString(this.RatingCompat);
            parcel.writeString(this.MediaBrowserCompat$MediaItem);
            parcel.writeString(this.AppCompatDelegateImpl$ListMenuDecorView);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ChainingListenableFuture chainingListenableFuture = (ChainingListenableFuture) obj;
            if (this.AppCompatDialogFragment != chainingListenableFuture.AppCompatDialogFragment || this.setHasDecor != chainingListenableFuture.setHasDecor || this.setCheckable != chainingListenableFuture.setCheckable) {
                return false;
            }
            String str = this.AppCompatActivity;
            if (str == null ? chainingListenableFuture.AppCompatActivity != null : !str.equals(chainingListenableFuture.AppCompatActivity)) {
                return false;
            }
            String str2 = this.setBackgroundResource;
            if (str2 == null ? chainingListenableFuture.setBackgroundResource != null : !str2.equals(chainingListenableFuture.setBackgroundResource)) {
                return false;
            }
            String str3 = this.setContentView;
            if (str3 == null ? chainingListenableFuture.setContentView != null : !str3.equals(chainingListenableFuture.setContentView)) {
                return false;
            }
            String str4 = this.MediaBrowserCompat$ItemReceiver;
            if (str4 == null ? chainingListenableFuture.MediaBrowserCompat$ItemReceiver != null : !str4.equals(chainingListenableFuture.MediaBrowserCompat$ItemReceiver)) {
                return false;
            }
            String str5 = this.read;
            if (str5 == null ? chainingListenableFuture.read != null : !str5.equals(chainingListenableFuture.read)) {
                return false;
            }
            String str6 = this.MediaBrowserCompat$SearchResultReceiver;
            if (str6 == null ? chainingListenableFuture.MediaBrowserCompat$SearchResultReceiver != null : !str6.equals(chainingListenableFuture.MediaBrowserCompat$SearchResultReceiver)) {
                return false;
            }
            String str7 = this.MediaDescriptionCompat;
            if (str7 == null ? chainingListenableFuture.MediaDescriptionCompat != null : !str7.equals(chainingListenableFuture.MediaDescriptionCompat)) {
                return false;
            }
            String str8 = this.PlaybackStateCompat;
            if (str8 == null ? chainingListenableFuture.PlaybackStateCompat != null : !str8.equals(chainingListenableFuture.PlaybackStateCompat)) {
                return false;
            }
            String str9 = this.setChecked;
            if (str9 == null ? chainingListenableFuture.setChecked != null : !str9.equals(chainingListenableFuture.setChecked)) {
                return false;
            }
            String str10 = this.MediaSessionCompat$Token;
            if (str10 == null ? chainingListenableFuture.MediaSessionCompat$Token != null : !str10.equals(chainingListenableFuture.MediaSessionCompat$Token)) {
                return false;
            }
            String str11 = this.setExpandedFormat;
            if (str11 == null ? chainingListenableFuture.setExpandedFormat != null : !str11.equals(chainingListenableFuture.setExpandedFormat)) {
                return false;
            }
            Integer num = this.Keep;
            if (num == null ? chainingListenableFuture.Keep != null : !num.equals(chainingListenableFuture.Keep)) {
                return false;
            }
            Integer num2 = this.AlertController$RecycleListView;
            if (num2 == null ? chainingListenableFuture.AlertController$RecycleListView != null : !num2.equals(chainingListenableFuture.AlertController$RecycleListView)) {
                return false;
            }
            BigDecimal bigDecimal = this.AppCompatViewInflater;
            if (bigDecimal == null ? chainingListenableFuture.AppCompatViewInflater != null : !bigDecimal.equals(chainingListenableFuture.AppCompatViewInflater)) {
                return false;
            }
            String str12 = this.f2712x50fd9e4a;
            if (str12 == null ? chainingListenableFuture.f2712x50fd9e4a != null : !str12.equals(chainingListenableFuture.f2712x50fd9e4a)) {
                return false;
            }
            String str13 = this.ParcelableVolumeInfo;
            if (str13 == null ? chainingListenableFuture.ParcelableVolumeInfo != null : !str13.equals(chainingListenableFuture.ParcelableVolumeInfo)) {
                return false;
            }
            String str14 = this.ActionMenuItemView;
            if (str14 == null ? chainingListenableFuture.ActionMenuItemView != null : !str14.equals(chainingListenableFuture.ActionMenuItemView)) {
                return false;
            }
            String str15 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str15 == null ? chainingListenableFuture.MediaBrowserCompat$CustomActionResultReceiver != null : !str15.equals(chainingListenableFuture.MediaBrowserCompat$CustomActionResultReceiver)) {
                return false;
            }
            String str16 = this.PlaybackStateCompat$CustomAction;
            if (str16 == null ? chainingListenableFuture.PlaybackStateCompat$CustomAction != null : !str16.equals(chainingListenableFuture.PlaybackStateCompat$CustomAction)) {
                return false;
            }
            List<C34115> list = this.MediaSessionCompat$ResultReceiverWrapper;
            if (list == null ? chainingListenableFuture.MediaSessionCompat$ResultReceiverWrapper != null : !list.equals(chainingListenableFuture.MediaSessionCompat$ResultReceiverWrapper)) {
                return false;
            }
            List<C34131> list2 = this.MediaSessionCompat$QueueItem;
            if (list2 == null ? chainingListenableFuture.MediaSessionCompat$QueueItem != null : !list2.equals(chainingListenableFuture.MediaSessionCompat$QueueItem)) {
                return false;
            }
            String str17 = this.IconCompatParcelizer;
            if (str17 == null ? chainingListenableFuture.IconCompatParcelizer != null : !str17.equals(chainingListenableFuture.IconCompatParcelizer)) {
                return false;
            }
            String str18 = this.MediaMetadataCompat;
            if (str18 == null ? chainingListenableFuture.MediaMetadataCompat != null : !str18.equals(chainingListenableFuture.MediaMetadataCompat)) {
                return false;
            }
            String str19 = this.RatingCompat;
            if (str19 == null ? chainingListenableFuture.RatingCompat != null : !str19.equals(chainingListenableFuture.RatingCompat)) {
                return false;
            }
            String str20 = this.MediaBrowserCompat$MediaItem;
            if (str20 == null ? chainingListenableFuture.MediaBrowserCompat$MediaItem != null : !str20.equals(chainingListenableFuture.MediaBrowserCompat$MediaItem)) {
                return false;
            }
            String str21 = this.AppCompatDelegateImpl$ListMenuDecorView;
            String str22 = chainingListenableFuture.AppCompatDelegateImpl$ListMenuDecorView;
            if (str21 != null) {
                return str21.equals(str22);
            }
            if (str22 != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            String str = this.AppCompatActivity;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.setBackgroundResource;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            int i = this.AppCompatDialogFragment;
            String str3 = this.setContentView;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.read;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode6 = str6 != null ? str6.hashCode() : 0;
            String str7 = this.MediaDescriptionCompat;
            int hashCode7 = str7 != null ? str7.hashCode() : 0;
            String str8 = this.PlaybackStateCompat;
            int hashCode8 = str8 != null ? str8.hashCode() : 0;
            String str9 = this.setChecked;
            int hashCode9 = str9 != null ? str9.hashCode() : 0;
            String str10 = this.MediaSessionCompat$Token;
            int hashCode10 = str10 != null ? str10.hashCode() : 0;
            String str11 = this.setExpandedFormat;
            int hashCode11 = str11 != null ? str11.hashCode() : 0;
            Integer num = this.Keep;
            int hashCode12 = num != null ? num.hashCode() : 0;
            Integer num2 = this.AlertController$RecycleListView;
            int hashCode13 = num2 != null ? num2.hashCode() : 0;
            BigDecimal bigDecimal = this.AppCompatViewInflater;
            int hashCode14 = bigDecimal != null ? bigDecimal.hashCode() : 0;
            String str12 = this.f2712x50fd9e4a;
            int hashCode15 = str12 != null ? str12.hashCode() : 0;
            String str13 = this.ParcelableVolumeInfo;
            int hashCode16 = str13 != null ? str13.hashCode() : 0;
            String str14 = this.ActionMenuItemView;
            int hashCode17 = str14 != null ? str14.hashCode() : 0;
            boolean z = this.setHasDecor;
            String str15 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode18 = str15 != null ? str15.hashCode() : 0;
            String str16 = this.PlaybackStateCompat$CustomAction;
            int hashCode19 = str16 != null ? str16.hashCode() : 0;
            int i2 = this.setCheckable;
            List<C34115> list = this.MediaSessionCompat$ResultReceiverWrapper;
            int hashCode20 = list != null ? list.hashCode() : 0;
            List<C34131> list2 = this.MediaSessionCompat$QueueItem;
            int hashCode21 = list2 != null ? list2.hashCode() : 0;
            String str17 = this.IconCompatParcelizer;
            int hashCode22 = str17 != null ? str17.hashCode() : 0;
            String str18 = this.MediaMetadataCompat;
            int hashCode23 = str18 != null ? str18.hashCode() : 0;
            String str19 = this.RatingCompat;
            int hashCode24 = str19 != null ? str19.hashCode() : 0;
            String str20 = this.MediaBrowserCompat$MediaItem;
            int hashCode25 = str20 != null ? str20.hashCode() : 0;
            String str21 = this.AppCompatDelegateImpl$ListMenuDecorView;
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + i) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + (z ? 1 : 0)) * 31) + hashCode18) * 31) + hashCode19) * 31) + i2) * 31) + hashCode20) * 31) + hashCode21) * 31) + hashCode22) * 31) + hashCode23) * 31) + hashCode24) * 31) + hashCode25) * 31) + (str21 != null ? str21.hashCode() : 0);
        }
    }

    public Futures(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.read = gson;
        this.write = validatecycle;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatedagrecurse;
    }

    /* renamed from: o.Futures$1 */
    public final class C34051 extends remainingCapacity implements Parcelable {
        public static final Parcelable.Creator<C34051> CREATOR = new Parcelable.Creator<C34051>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C34051(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C34051[i];
            }
        };
        public String ActionMenuItemView;
        public String AlertController$RecycleListView;
        public String AppCompatActivity;
        public String AppCompatDelegateImpl$ListMenuDecorView;
        public String AppCompatDialogFragment;
        public String AppCompatViewInflater;
        public String IconCompatParcelizer;
        public String Keep;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public int MediaBrowserCompat$MediaItem;
        public String MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public String f2711x50fd9e4a;
        public boolean MediaDescriptionCompat;
        public int MediaMetadataCompat;
        public String MediaSessionCompat$QueueItem;
        public String MediaSessionCompat$ResultReceiverWrapper;
        public String MediaSessionCompat$Token;
        public String ParcelableVolumeInfo;
        public String PlaybackStateCompat;
        public String PlaybackStateCompat$CustomAction;
        public String RatingCompat;
        public String read;
        public String setBackgroundResource;
        public Integer setCheckable;
        public String setChecked;
        public String setContentView;
        public String setExpandedFormat;
        public boolean setHasDecor;
        public String setItemInvoker;
        public String setPadding;
        public String setPopupCallback;

        public final int describeContents() {
            return 0;
        }

        protected C34051(Parcel parcel) {
            this.read = parcel.readString();
            this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
            this.AppCompatDialogFragment = parcel.readString();
            this.AppCompatDelegateImpl$ListMenuDecorView = parcel.readString();
            this.setExpandedFormat = parcel.readString();
            this.setPopupCallback = parcel.readString();
            this.PlaybackStateCompat = parcel.readString();
            if (parcel.readByte() == 0) {
                this.setCheckable = null;
            } else {
                this.setCheckable = Integer.valueOf(parcel.readInt());
            }
            this.MediaBrowserCompat$ItemReceiver = parcel.readString();
            this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
            this.ParcelableVolumeInfo = parcel.readString();
            this.AppCompatViewInflater = parcel.readString();
            this.RatingCompat = parcel.readString();
            this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
            this.MediaSessionCompat$QueueItem = parcel.readString();
            this.setItemInvoker = parcel.readString();
            this.MediaSessionCompat$Token = parcel.readString();
            this.MediaBrowserCompat$MediaItem = parcel.readInt();
            this.MediaMetadataCompat = parcel.readInt();
            boolean z = true;
            this.setHasDecor = parcel.readByte() != 0;
            this.AlertController$RecycleListView = parcel.readString();
            this.setChecked = parcel.readString();
            this.Keep = parcel.readString();
            this.setPadding = parcel.readString();
            this.IconCompatParcelizer = parcel.readString();
            this.MediaDescriptionCompat = parcel.readByte() == 0 ? false : z;
            this.ActionMenuItemView = parcel.readString();
            this.f2711x50fd9e4a = parcel.readString();
            this.PlaybackStateCompat$CustomAction = parcel.readString();
            this.setBackgroundResource = parcel.readString();
            this.setContentView = parcel.readString();
            this.AppCompatActivity = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.read);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.AppCompatDialogFragment);
            parcel.writeString(this.AppCompatDelegateImpl$ListMenuDecorView);
            parcel.writeString(this.setExpandedFormat);
            parcel.writeString(this.setPopupCallback);
            parcel.writeString(this.PlaybackStateCompat);
            if (this.setCheckable == null) {
                parcel.writeByte((byte) 0);
            } else {
                parcel.writeByte((byte) 1);
                parcel.writeInt(this.setCheckable.intValue());
            }
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
            parcel.writeString(this.ParcelableVolumeInfo);
            parcel.writeString(this.AppCompatViewInflater);
            parcel.writeString(this.RatingCompat);
            parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
            parcel.writeString(this.MediaSessionCompat$QueueItem);
            parcel.writeString(this.setItemInvoker);
            parcel.writeString(this.MediaSessionCompat$Token);
            parcel.writeInt(this.MediaBrowserCompat$MediaItem);
            parcel.writeInt(this.MediaMetadataCompat);
            parcel.writeByte(this.setHasDecor ? (byte) 1 : 0);
            parcel.writeString(this.AlertController$RecycleListView);
            parcel.writeString(this.setChecked);
            parcel.writeString(this.Keep);
            parcel.writeString(this.setPadding);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeByte(this.MediaDescriptionCompat ? (byte) 1 : 0);
            parcel.writeString(this.ActionMenuItemView);
            parcel.writeString(this.f2711x50fd9e4a);
            parcel.writeString(this.PlaybackStateCompat$CustomAction);
            parcel.writeString(this.setBackgroundResource);
            parcel.writeString(this.setContentView);
            parcel.writeString(this.AppCompatActivity);
        }

        public static C34051 MediaBrowserCompat$CustomActionResultReceiver() {
            return new C34051();
        }

        public C34051() {
        }
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        Gson gson = this.read;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonWriter.beginObject();
        validatedagrecurse.read(jsonWriter, 442);
        Class cls = Boolean.TYPE;
        Boolean valueOf = Boolean.valueOf(((remainingCapacity) obj).write);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        remainingCapacity remainingcapacity = new remainingCapacity();
        Gson gson = this.read;
        validateCycle validatecycle = this.write;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            remainingcapacity.IconCompatParcelizer(gson, jsonReader, validatecycle.write(jsonReader));
        }
        jsonReader.endObject();
        return remainingcapacity;
    }
}

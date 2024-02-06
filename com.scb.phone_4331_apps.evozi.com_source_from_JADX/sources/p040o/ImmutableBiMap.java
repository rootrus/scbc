package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.StreetViewPanoramaView;

/* renamed from: o.ImmutableBiMap */
public final class ImmutableBiMap {
    @SerializedName("cardRefNo")
    private final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ImmutableBiMap) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) ((ImmutableBiMap) obj).MediaBrowserCompat$ItemReceiver);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidCard(cardRefNo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: o.ImmutableBiMap$SerializedForm */
    public final class SerializedForm implements Parcelable {
        public static final Parcelable.Creator<SerializedForm> CREATOR = new read();
        @SerializedName("serverRandom")
        public final String IconCompatParcelizer;
        @SerializedName("encryptedPIN")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("pubKeyIndex")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("e2eeSid")
        public final String read;
        @SerializedName("cardNumber")
        public final String write;

        public final int describeContents() {
            return 0;
        }

        public SerializedForm(String str, String str2, String str3, String str4, String str5) {
            onGetStartedClick.write((Object) str, "cardNumber");
            onGetStartedClick.write((Object) str2, "encryptedPIN");
            onGetStartedClick.write((Object) str3, "e2eeSid");
            onGetStartedClick.write((Object) str4, "serverRandom");
            onGetStartedClick.write((Object) str5, "pubKeyIndex");
            this.write = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
            this.read = str3;
            this.IconCompatParcelizer = str4;
            this.MediaBrowserCompat$ItemReceiver = str5;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public SerializedForm(android.os.Parcel r9) {
            /*
                r8 = this;
                java.lang.String r0 = "source"
                p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r0)
                java.lang.String r0 = r9.readString()
                java.lang.String r1 = ""
                if (r0 != 0) goto L_0x000f
                r3 = r1
                goto L_0x0010
            L_0x000f:
                r3 = r0
            L_0x0010:
                java.lang.String r0 = r9.readString()
                if (r0 != 0) goto L_0x0018
                r4 = r1
                goto L_0x0019
            L_0x0018:
                r4 = r0
            L_0x0019:
                java.lang.String r0 = r9.readString()
                if (r0 != 0) goto L_0x0021
                r5 = r1
                goto L_0x0022
            L_0x0021:
                r5 = r0
            L_0x0022:
                java.lang.String r0 = r9.readString()
                if (r0 != 0) goto L_0x002a
                r6 = r1
                goto L_0x002b
            L_0x002a:
                r6 = r0
            L_0x002b:
                java.lang.String r9 = r9.readString()
                if (r9 != 0) goto L_0x0033
                r7 = r1
                goto L_0x0034
            L_0x0033:
                r7 = r9
            L_0x0034:
                r2 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.ImmutableBiMap.SerializedForm.<init>(android.os.Parcel):void");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "dest");
            parcel.writeString(this.write);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.read);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        }

        /* renamed from: o.ImmutableBiMap$SerializedForm$write */
        public static final class write implements findFragmentByWho {
            private final /* synthetic */ setHitType IconCompatParcelizer;

            private write() {
            }

            public /* synthetic */ write(setHitType sethittype) {
                this.IconCompatParcelizer = sethittype;
            }

            public final Object IconCompatParcelizer(Object obj) {
                supportsUri supportsuri = (supportsUri) obj;
                StreetViewPanoramaView.zza read = StreetViewPanoramaView.zza.read();
                read.write = supportsuri.MediaBrowserCompat$ItemReceiver;
                read.read = supportsuri.IconCompatParcelizer;
                read.MediaBrowserCompat$CustomActionResultReceiver = supportsuri.MediaBrowserCompat$CustomActionResultReceiver;
                read.RatingCompat = FragmentBuilder_BindSummaryFragment.write(supportsuri.read, (OffsetDateTime) null);
                read.MediaDescriptionCompat = supportsuri.MediaMetadataCompat;
                read.MediaMetadataCompat = supportsuri.MediaBrowserCompat$MediaItem;
                read.MediaBrowserCompat$MediaItem = supportsuri.MediaDescriptionCompat;
                read.MediaBrowserCompat$SearchResultReceiver = supportsuri.MediaBrowserCompat$SearchResultReceiver;
                read.MediaSessionCompat$Token = supportsuri.MediaSessionCompat$QueueItem;
                read.MediaSessionCompat$QueueItem = supportsuri.RatingCompat;
                read.Keep = supportsuri.MediaSessionCompat$Token;
                read.setHasDecor = supportsuri.AlertController$RecycleListView;
                read.AlertController$RecycleListView = supportsuri.setHasDecor;
                read.PlaybackStateCompat = supportsuri.Keep;
                read.AppCompatDialogFragment = supportsuri.setContentView;
                read.MediaBrowserCompat$ItemReceiver = supportsuri.write;
                read.ParcelableVolumeInfo = supportsuri.MediaSessionCompat$ResultReceiverWrapper;
                read.MediaSessionCompat$ResultReceiverWrapper = supportsuri.f2654x50fd9e4a;
                read.f2792x50fd9e4a = supportsuri.ParcelableVolumeInfo;
                read.PlaybackStateCompat$CustomAction = supportsuri.PlaybackStateCompat;
                read.AppCompatDelegateImpl$ListMenuDecorView = supportsuri.PlaybackStateCompat$CustomAction;
                return read;
            }
        }

        /* renamed from: o.ImmutableBiMap$SerializedForm$read */
        public static final class read implements Parcelable.Creator<SerializedForm> {
            read() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "source");
                return new SerializedForm(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SerializedForm[i];
            }
        }
    }

    public ImmutableBiMap(String str) {
        onGetStartedClick.write((Object) str, "cardRefNo");
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    /* renamed from: o.ImmutableBiMap$EmptyBiMap */
    public class EmptyBiMap {
        @SerializedName("depositList")
        public List<smear> MediaBrowserCompat$ItemReceiver;

        public static EmptyBiMap read() {
            return new EmptyBiMap();
        }
    }

    /* renamed from: o.ImmutableBiMap$Builder */
    public final class Builder {
        @SerializedName("cardRefNo")
        public final String IconCompatParcelizer;
        @SerializedName("prepaidCardType")
        private final String MediaBrowserCompat$CustomActionResultReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) builder.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) builder.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PrepaidRewardRequest(cardRefNo=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", prepaidCardType=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public Builder(String str, String str2) {
            onGetStartedClick.write((Object) str, "cardRefNo");
            onGetStartedClick.write((Object) str2, "prepaidCardType");
            this.IconCompatParcelizer = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        }
    }
}

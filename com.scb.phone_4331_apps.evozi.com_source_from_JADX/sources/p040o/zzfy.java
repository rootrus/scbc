package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.List;
import p040o.zzjx;

/* renamed from: o.zzfy */
public final /* synthetic */ class zzfy implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zzfy IconCompatParcelizer = new zzfy();

    /* renamed from: o.zzfy$zzc */
    public final class zzc {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public List<String> MediaBrowserCompat$ItemReceiver;
        public String read;
        public String write;
    }

    /* renamed from: o.zzfy$zza */
    public final class zza {
        public double IconCompatParcelizer;
        public double MediaBrowserCompat$CustomActionResultReceiver;
        public double MediaBrowserCompat$ItemReceiver;
        public double read;
        public double write;
    }

    /* renamed from: o.zzfy$zzb */
    public final class zzb {
        public List<zza> read;
    }

    private /* synthetic */ zzfy() {
    }

    /* renamed from: o.zzfy$zze */
    public final class zze {
        public final String MediaBrowserCompat$ItemReceiver;
        public final String read;
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zze)) {
                return false;
            }
            zze zze = (zze) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zze.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zze.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zze.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            String str = this.write;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.read;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlGenerateOTP(uuid=");
            sb.append(this.write);
            sb.append(", refId=");
            sb.append(this.read);
            sb.append(", email=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public zze(String str, String str2, String str3) {
            this.write = str;
            this.read = str2;
            this.MediaBrowserCompat$ItemReceiver = str3;
        }

        public /* synthetic */ zze(String str, String str2) {
            this(str, str2, (String) null);
        }
    }

    /* renamed from: o.zzfy$zzf */
    public final class zzf {
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final extractResult MediaBrowserCompat$ItemReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzf)) {
                return false;
            }
            zzf zzf = (zzf) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzf.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzf.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            extractResult extractresult = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = extractresult != null ? extractresult.hashCode() : 0;
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str != null) {
                i = str.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlLoanOfferStatus(applicationStatus=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", applicationUuid=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public zzf(extractResult extractresult, String str) {
            onGetStartedClick.write((Object) extractresult, "applicationStatus");
            onGetStartedClick.write((Object) str, "applicationUuid");
            this.MediaBrowserCompat$ItemReceiver = extractresult;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }
    }

    /* renamed from: o.zzfy$zzg */
    public final class zzg {
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final zzjx.zzd.zza read;
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzg)) {
                return false;
            }
            zzg zzg = (zzg) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzg.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzg.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzg.read);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.write;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            zzjx.zzd.zza zza = this.read;
            if (zza != null) {
                i = zza.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlLanding(applicationStatus=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", applicationUuid=");
            sb.append(this.write);
            sb.append(", simulator=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public zzg(String str, String str2, zzjx.zzd.zza zza) {
            onGetStartedClick.write((Object) zza, "simulator");
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.write = str2;
            this.read = zza;
        }
    }

    /* renamed from: o.zzfy$zzd */
    public enum zzd implements Parcelable {
        INITIAL,
        RESUBMIT,
        SUBMITTED,
        UNKNOWN;
        
        public static final write CREATOR = null;

        static {
            CREATOR = new write((byte) 0);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeInt(ordinal());
        }

        /* renamed from: o.zzfy$zzd$write */
        public static final class write implements Parcelable.Creator<zzd> {
            private write() {
            }

            public /* synthetic */ write(byte b) {
                this();
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "parcel");
                return zzd.values()[parcel.readInt()];
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new zzd[i];
            }
        }
    }

    public final Object write(Object obj) {
        setWebColorInner setwebcolorinner = (setWebColorInner) ((SingleDataEntity) obj).getData();
        zoomGesturesEnabled read = zoomGesturesEnabled.read();
        String str = setwebcolorinner.MediaBrowserCompat$SearchResultReceiver;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        read.MediaBrowserCompat$SearchResultReceiver = str;
        String str3 = setwebcolorinner.RatingCompat;
        if (str3 == null) {
            str3 = str2;
        }
        read.MediaDescriptionCompat = str3;
        String str4 = setwebcolorinner.MediaBrowserCompat$MediaItem;
        if (str4 != null) {
            str2 = str4;
        }
        read.MediaBrowserCompat$ItemReceiver = str2;
        read.read = setwebcolorinner.MediaBrowserCompat$ItemReceiver;
        read.MediaBrowserCompat$CustomActionResultReceiver = setwebcolorinner.MediaBrowserCompat$CustomActionResultReceiver;
        read.write = setwebcolorinner.write;
        return read;
    }
}

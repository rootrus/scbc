package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.io.IOException;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import org.threeten.p041bp.OffsetDateTime;
import p040o.AdvertisingIdClient;
import p040o.zzag;
import p040o.zzby;
import p040o.zzfo;

/* renamed from: o.zzbt */
public final /* synthetic */ class zzbt implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ BankingActionActivity MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.zzbt$zzd */
    public final class zzd {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String read;

        /* renamed from: o.zzbt$zzd$zzb */
        public final class zzb {
            public String IconCompatParcelizer;
            public String MediaBrowserCompat$CustomActionResultReceiver;
            public String MediaBrowserCompat$ItemReceiver;
            public int read;
            public String write;

            /* renamed from: o.zzbt$zzd$zzb$write */
            public static final class write {
                public String IconCompatParcelizer;
                public String MediaBrowserCompat$CustomActionResultReceiver;
                public int MediaBrowserCompat$ItemReceiver;
                public String read;
                public String write;
            }

            public /* synthetic */ zzb(write write2, byte b) {
                this(write2);
            }

            private zzb(write write2) {
                this.read = write2.MediaBrowserCompat$ItemReceiver;
                this.IconCompatParcelizer = write2.IconCompatParcelizer;
                this.MediaBrowserCompat$ItemReceiver = write2.write;
                this.write = write2.read;
                this.MediaBrowserCompat$CustomActionResultReceiver = write2.MediaBrowserCompat$CustomActionResultReceiver;
            }
        }

        public /* synthetic */ zzd(IconCompatParcelizer iconCompatParcelizer, byte b) {
            this(iconCompatParcelizer);
        }

        /* renamed from: o.zzbt$zzd$zza */
        public class zza {
            public String IconCompatParcelizer;
            public String MediaBrowserCompat$CustomActionResultReceiver;
            public String MediaBrowserCompat$ItemReceiver;
            public OffsetDateTime read;
            public String write;

            public zza(zzbt$zzd$zza$MediaBrowserCompat$ItemReceiver zzbt_zzd_zza_mediabrowsercompat_itemreceiver) {
                this.read = zzbt_zzd_zza_mediabrowsercompat_itemreceiver.write;
                this.MediaBrowserCompat$CustomActionResultReceiver = zzbt_zzd_zza_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
                this.write = zzbt_zzd_zza_mediabrowsercompat_itemreceiver.read;
                this.MediaBrowserCompat$ItemReceiver = zzbt_zzd_zza_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver;
                this.IconCompatParcelizer = zzbt_zzd_zza_mediabrowsercompat_itemreceiver.IconCompatParcelizer;
            }
        }

        private zzd(IconCompatParcelizer iconCompatParcelizer) {
            this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer.read;
            this.IconCompatParcelizer = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            this.read = iconCompatParcelizer.write;
        }

        /* renamed from: o.zzbt$zzd$IconCompatParcelizer */
        public static final class IconCompatParcelizer {
            public String MediaBrowserCompat$CustomActionResultReceiver;
            public List<String> MediaBrowserCompat$ItemReceiver;
            public String read;
            public String write;

            public /* synthetic */ IconCompatParcelizer(byte b) {
                this();
            }

            private IconCompatParcelizer() {
            }
        }
    }

    public /* synthetic */ zzbt(BankingActionActivity bankingActionActivity) {
        this.MediaBrowserCompat$ItemReceiver = bankingActionActivity;
    }

    /* renamed from: o.zzbt$zzf */
    public final class zzf {
        public boolean MediaBrowserCompat$CustomActionResultReceiver;
        public boolean MediaBrowserCompat$ItemReceiver;
        public boolean read;

        public /* synthetic */ zzf(zzbt$zzf$MediaBrowserCompat$ItemReceiver zzbt_zzf_mediabrowsercompat_itemreceiver, byte b) {
            this(zzbt_zzf_mediabrowsercompat_itemreceiver);
        }

        /* renamed from: o.zzbt$zzf$zzb */
        public final class zzb extends zzuk {
            public List<zzag.zzc> MediaBrowserCompat$ItemReceiver;

            /* renamed from: o.zzbt$zzf$zzb$IconCompatParcelizer */
            public static final class IconCompatParcelizer {
                public List<zzag.zzc> read;
            }

            public /* synthetic */ zzb(IconCompatParcelizer iconCompatParcelizer, byte b) {
                this(iconCompatParcelizer);
            }

            private zzb(IconCompatParcelizer iconCompatParcelizer) {
                this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.read;
            }
        }

        private zzf(zzbt$zzf$MediaBrowserCompat$ItemReceiver zzbt_zzf_mediabrowsercompat_itemreceiver) {
            this.MediaBrowserCompat$ItemReceiver = zzbt_zzf_mediabrowsercompat_itemreceiver.write;
            this.MediaBrowserCompat$CustomActionResultReceiver = zzbt_zzf_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver;
            this.read = zzbt_zzf_mediabrowsercompat_itemreceiver.IconCompatParcelizer;
        }

        /* renamed from: o.zzbt$zzf$zza */
        public class zza {
            @SerializedName("consentDocuments")
            public List<BillerAdapter$ItemViewHolder> MediaBrowserCompat$CustomActionResultReceiver;
            @SerializedName("introductionHtml")
            public String MediaBrowserCompat$ItemReceiver;
            @SerializedName("imagePath")
            public String read;

            public zza(IconCompatParcelizer iconCompatParcelizer) {
                this.read = iconCompatParcelizer.write;
                this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            }

            /* renamed from: o.zzbt$zzf$zza$IconCompatParcelizer */
            public static class IconCompatParcelizer {
                public List<BillerAdapter$ItemViewHolder> MediaBrowserCompat$CustomActionResultReceiver;
                public String MediaBrowserCompat$ItemReceiver;
                public String write;

                public zza MediaBrowserCompat$ItemReceiver() {
                    return new zza(this);
                }
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                zza zza = (zza) obj;
                String str = this.read;
                if (str == null ? zza.read != null : !str.equals(zza.read)) {
                    return false;
                }
                String str2 = this.MediaBrowserCompat$ItemReceiver;
                String str3 = zza.MediaBrowserCompat$ItemReceiver;
                if (str2 != null) {
                    return str2.equals(str3);
                }
                if (str3 != null) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                String str = this.read;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.MediaBrowserCompat$ItemReceiver;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                return (hashCode * 31) + i;
            }
        }
    }

    /* renamed from: o.zzbt$zza */
    public enum zza {
        SHOW_BANNER(DiskLruCache.VERSION_1),
        HIDE_BANNER("0");
        
        public String status;

        /* renamed from: o.zzbt$zza$zza  reason: collision with other inner class name */
        public final class C10761zza {
            public final String IconCompatParcelizer;
            public final List<setDataCollectionEnabled> read;
            public final String write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10761zza)) {
                    return false;
                }
                C10761zza zza = (C10761zza) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read);
            }

            public final int hashCode() {
                String str = this.write;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.IconCompatParcelizer;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                List<setDataCollectionEnabled> list = this.read;
                if (list != null) {
                    i = list.hashCode();
                }
                return (((hashCode * 31) + hashCode2) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("CommercialCalculation(loanAmount=");
                sb.append(this.write);
                sb.append(", duration=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", details=");
                sb.append(this.read);
                sb.append(")");
                return sb.toString();
            }

            public C10761zza(String str, String str2, List<? extends setDataCollectionEnabled> list) {
                onGetStartedClick.write((Object) str, "loanAmount");
                onGetStartedClick.write((Object) str2, "duration");
                this.write = str;
                this.IconCompatParcelizer = str2;
                this.read = list;
            }
        }

        private zza(String str) {
            this.status = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x002c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static p040o.zzbt.zza MediaBrowserCompat$ItemReceiver(java.lang.String r3) {
            /*
                int r0 = r3.hashCode()
                r1 = 1
                r2 = 48
                if (r0 == r2) goto L_0x0017
                r2 = 49
                if (r0 != r2) goto L_0x0021
                java.lang.String r0 = "1"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x0021
                r3 = r1
                goto L_0x0022
            L_0x0017:
                java.lang.String r0 = "0"
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x0021
                r3 = 0
                goto L_0x0022
            L_0x0021:
                r3 = -1
            L_0x0022:
                if (r3 == 0) goto L_0x002c
                if (r3 == r1) goto L_0x0029
                o.zzbt$zza r3 = HIDE_BANNER
                return r3
            L_0x0029:
                o.zzbt$zza r3 = SHOW_BANNER
                return r3
            L_0x002c:
                o.zzbt$zza r3 = HIDE_BANNER
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.zzbt.zza.MediaBrowserCompat$ItemReceiver(java.lang.String):o.zzbt$zza");
        }
    }

    /* renamed from: o.zzbt$zze */
    public final class zze {
        public Double IconCompatParcelizer;
        public Double MediaBrowserCompat$ItemReceiver;
        public List<zzd.zzb> write;

        public /* synthetic */ zze(zzbt$zze$MediaBrowserCompat$CustomActionResultReceiver zzbt_zze_mediabrowsercompat_customactionresultreceiver, byte b) {
            this(zzbt_zze_mediabrowsercompat_customactionresultreceiver);
        }

        private zze(zzbt$zze$MediaBrowserCompat$CustomActionResultReceiver zzbt_zze_mediabrowsercompat_customactionresultreceiver) {
            this.IconCompatParcelizer = zzbt_zze_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
            this.MediaBrowserCompat$ItemReceiver = zzbt_zze_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
            this.write = zzbt_zze_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        }

        /* renamed from: o.zzbt$zze$zza */
        public class zza {
            @SerializedName("occupation")
            public zzby.zzb.zza IconCompatParcelizer;
            @SerializedName("occupationGroup")
            public String MediaBrowserCompat$CustomActionResultReceiver;
            @SerializedName("customerGroupCode")
            public String MediaBrowserCompat$ItemReceiver;
            @SerializedName("sourceOfIncome")
            public isBuildingsEnabled MediaDescriptionCompat;
            @SerializedName("workAddress")
            public animateCamera MediaMetadataCompat;
            @SerializedName("companyPhone")
            public String read;
            @SerializedName("companyName")
            public String write;

            public zza(zzbt$zze$zza$MediaBrowserCompat$CustomActionResultReceiver zzbt_zze_zza_mediabrowsercompat_customactionresultreceiver) {
                this.IconCompatParcelizer = zzbt_zze_zza_mediabrowsercompat_customactionresultreceiver.read;
                this.MediaDescriptionCompat = zzbt_zze_zza_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$MediaItem;
                this.write = zzbt_zze_zza_mediabrowsercompat_customactionresultreceiver.write;
                this.MediaMetadataCompat = zzbt_zze_zza_mediabrowsercompat_customactionresultreceiver.MediaDescriptionCompat;
                this.read = zzbt_zze_zza_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
                this.MediaBrowserCompat$ItemReceiver = zzbt_zze_zza_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
                this.MediaBrowserCompat$CustomActionResultReceiver = zzbt_zze_zza_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
            }

            public static zzbt$zze$zza$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver() {
                return new IconCompatParcelizer();
            }

            /* renamed from: o.zzbt$zze$zza$IconCompatParcelizer */
            public static class IconCompatParcelizer extends zzbt$zze$zza$MediaBrowserCompat$CustomActionResultReceiver<zza, IconCompatParcelizer> {
                /* access modifiers changed from: protected */
                public final /* bridge */ /* synthetic */ zzbt$zze$zza$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer() {
                    return this;
                }

                public final zza write() {
                    return new zza(this);
                }
            }
        }
    }

    /* renamed from: o.zzbt$zzc */
    public final class zzc {
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;

        /* renamed from: o.zzbt$zzc$zza */
        public class zza {
            @SerializedName("consentDocuments")
            public List<BillerAdapter$ItemViewHolder> IconCompatParcelizer;
            @SerializedName("engFirstName")
            public String MediaBrowserCompat$CustomActionResultReceiver;
            @SerializedName("email")
            public String MediaBrowserCompat$ItemReceiver;
            @SerializedName("mailingAddress")
            public animateCamera MediaBrowserCompat$MediaItem;
            @SerializedName("name")
            public String MediaBrowserCompat$SearchResultReceiver;
            @SerializedName("engLastName")
            public String MediaDescriptionCompat;
            @SerializedName("requireEnglishName")
            public int MediaMetadataCompat;
            @SerializedName("mobilePhone")
            public String RatingCompat;
            @SerializedName("additionalConsent")
            public String read;
            @SerializedName("consentFlag")
            public String write;

            /* renamed from: o.zzbt$zzc$zza$IconCompatParcelizer */
            public static final class IconCompatParcelizer {
                public String IconCompatParcelizer;
                public String MediaBrowserCompat$CustomActionResultReceiver;
                public List<BillerAdapter$ItemViewHolder> MediaBrowserCompat$ItemReceiver;
                public animateCamera MediaBrowserCompat$MediaItem;
                public String MediaBrowserCompat$SearchResultReceiver;
                public int MediaDescriptionCompat;
                public String MediaMetadataCompat;
                public String RatingCompat;
                public String read;
                public String write;
            }

            public /* synthetic */ zza(IconCompatParcelizer iconCompatParcelizer, byte b) {
                this(iconCompatParcelizer);
            }

            private zza(IconCompatParcelizer iconCompatParcelizer) {
                this.MediaBrowserCompat$SearchResultReceiver = iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
                this.MediaMetadataCompat = iconCompatParcelizer.MediaDescriptionCompat;
                this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer.write;
                this.MediaDescriptionCompat = iconCompatParcelizer.RatingCompat;
                this.RatingCompat = iconCompatParcelizer.MediaMetadataCompat;
                this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                this.MediaBrowserCompat$MediaItem = iconCompatParcelizer.MediaBrowserCompat$MediaItem;
                this.IconCompatParcelizer = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                this.write = iconCompatParcelizer.IconCompatParcelizer;
                this.read = iconCompatParcelizer.read;
            }
        }
    }

    /* renamed from: o.zzbt$zzb */
    public final class zzb extends TypeAdapter implements addKernel {
        private validateDAGRecurse MediaBrowserCompat$CustomActionResultReceiver;
        private validateCycle MediaBrowserCompat$ItemReceiver;
        private Gson write;

        /* renamed from: o.zzbt$zzb$zza */
        public final class zza extends zzf.zza {
            public zzfo.zzd IconCompatParcelizer;

            public zza(IconCompatParcelizer iconCompatParcelizer) {
                super(iconCompatParcelizer);
                this.IconCompatParcelizer = iconCompatParcelizer.read;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                    return false;
                }
                zzfo.zzd zzd = this.IconCompatParcelizer;
                zzfo.zzd zzd2 = ((zza) obj).IconCompatParcelizer;
                if (zzd != null) {
                    return zzd.equals(zzd2);
                }
                if (zzd2 != null) {
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                int hashCode = super.hashCode();
                zzfo.zzd zzd = this.IconCompatParcelizer;
                return (hashCode * 31) + (zzd != null ? zzd.hashCode() : 0);
            }

            /* renamed from: o.zzbt$zzb$zza$IconCompatParcelizer */
            public static final class IconCompatParcelizer extends zzf.zza.IconCompatParcelizer {
                public zzfo.zzd read;

                public final /* synthetic */ zzf.zza MediaBrowserCompat$ItemReceiver() {
                    return new zza(this);
                }
            }
        }

        public zzb(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
            this.write = gson;
            this.MediaBrowserCompat$ItemReceiver = validatecycle;
            this.MediaBrowserCompat$CustomActionResultReceiver = validatedagrecurse;
        }

        public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
            if (obj == null) {
                jsonWriter.nullValue();
                return;
            }
            zzag.zza zza2 = (zzag.zza) obj;
            Gson gson = this.write;
            validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$CustomActionResultReceiver;
            jsonWriter.beginObject();
            if (zza2 != zza2.read) {
                validatedagrecurse.read(jsonWriter, 553);
                String str = zza2.read;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
            }
            if (zza2 != zza2.MediaBrowserCompat$ItemReceiver) {
                validatedagrecurse.read(jsonWriter, 87);
                String str2 = zza2.MediaBrowserCompat$ItemReceiver;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
            }
            jsonWriter.endObject();
        }

        public final Object read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                return null;
            }
            zzag.zza zza2 = new zzag.zza();
            Gson gson = this.write;
            validateCycle validatecycle = this.MediaBrowserCompat$ItemReceiver;
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                int write2 = validatecycle.write(jsonReader);
                boolean z = jsonReader.peek() != JsonToken.NULL;
                if (write2 != 92) {
                    if (write2 != 579) {
                        jsonReader.skipValue();
                    } else if (z) {
                        zza2.read = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        zza2.read = null;
                    }
                } else if (z) {
                    zza2.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    zza2.MediaBrowserCompat$ItemReceiver = null;
                }
                jsonReader.nextNull();
            }
            jsonReader.endObject();
            return zza2;
        }
    }

    public final Object write(Object obj) {
        AdvertisingIdClient.zza zza2 = (AdvertisingIdClient.zza) ((SingleDataEntity) obj).getData();
        newLatLngBoundsWithSize newlatlngboundswithsize = new newLatLngBoundsWithSize();
        newlatlngboundswithsize.MediaBrowserCompat$CustomActionResultReceiver = zza2.IconCompatParcelizer;
        newlatlngboundswithsize.IconCompatParcelizer = zza2.read;
        return DebitCardResetOtpActivity.just(newlatlngboundswithsize);
    }
}

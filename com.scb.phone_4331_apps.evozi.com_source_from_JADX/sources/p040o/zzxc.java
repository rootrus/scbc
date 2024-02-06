package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.zzxc */
public class zzxc {
    String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ zzxc() {
    }

    /* renamed from: o.zzxc$zzb */
    public final class zzb {
        public final String IconCompatParcelizer;
        public final double MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final double MediaBrowserCompat$MediaItem;
        private final int MediaBrowserCompat$SearchResultReceiver;
        private final int MediaMetadataCompat;
        public final double read;
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzb)) {
                return false;
            }
            zzb zzb = (zzb) obj;
            return this.MediaBrowserCompat$SearchResultReceiver == zzb.MediaBrowserCompat$SearchResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzb.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzb.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzb.IconCompatParcelizer) && Double.compare(this.MediaBrowserCompat$MediaItem, zzb.MediaBrowserCompat$MediaItem) == 0 && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, zzb.MediaBrowserCompat$CustomActionResultReceiver) == 0 && Double.compare(this.read, zzb.read) == 0 && this.MediaMetadataCompat == zzb.MediaMetadataCompat;
        }

        public final int hashCode() {
            int i = this.MediaBrowserCompat$SearchResultReceiver;
            String str = this.write;
            int i2 = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.IconCompatParcelizer;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$MediaItem);
            long doubleToLongBits2 = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
            int i3 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
            long doubleToLongBits3 = Double.doubleToLongBits(this.read);
            return (((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + i2) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + i3) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3))) * 31) + this.MediaMetadataCompat;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Agent(id=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", agentCode=");
            sb.append(this.write);
            sb.append(", agentLogo=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", agentName=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", minAmount=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", maxAmount=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", limitPerDay=");
            sb.append(this.read);
            sb.append(", sortOrder=");
            sb.append(this.MediaMetadataCompat);
            sb.append(")");
            return sb.toString();
        }

        public zzb(int i, String str, String str2, String str3, double d, double d2, double d3, int i2) {
            onGetStartedClick.write((Object) str, "agentCode");
            onGetStartedClick.write((Object) str3, "agentName");
            this.MediaBrowserCompat$SearchResultReceiver = i;
            this.write = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
            this.IconCompatParcelizer = str3;
            this.MediaBrowserCompat$MediaItem = d;
            this.MediaBrowserCompat$CustomActionResultReceiver = d2;
            this.read = d3;
            this.MediaMetadataCompat = i2;
        }
    }

    /* renamed from: o.zzxc$zzc */
    public final class zzc {
        public final int IconCompatParcelizer;
        public final OffsetDateTime MediaBrowserCompat$CustomActionResultReceiver;
        public final String read;
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzc)) {
                return false;
            }
            zzc zzc = (zzc) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzc.MediaBrowserCompat$CustomActionResultReceiver) && this.IconCompatParcelizer == zzc.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzc.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzc.write);
        }

        public final int hashCode() {
            OffsetDateTime offsetDateTime = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
            int i2 = this.IconCompatParcelizer;
            String str = this.read;
            int hashCode2 = str != null ? str.hashCode() : 0;
            String str2 = this.write;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (((((hashCode * 31) + i2) * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("QRBarcode(expiryDateTime=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", validDuration=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", qrCode=");
            sb.append(this.read);
            sb.append(", barcode=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public zzc(OffsetDateTime offsetDateTime, int i, String str, String str2) {
            onGetStartedClick.write((Object) str, "qrCode");
            onGetStartedClick.write((Object) str2, "barcode");
            this.MediaBrowserCompat$CustomActionResultReceiver = offsetDateTime;
            this.IconCompatParcelizer = i;
            this.read = str;
            this.write = str2;
        }
    }

    /* renamed from: o.zzxc$zzd */
    public final class zzd {
        public String IconCompatParcelizer;
        public String read;
        public List<zzxd> write;

        /* renamed from: o.zzxc$zzd$read */
        public static final class read {
            public String IconCompatParcelizer;
            public List<zzxd> MediaBrowserCompat$ItemReceiver;
            public String write;
        }

        public /* synthetic */ zzd(read read2, byte b) {
            this(read2);
        }

        private zzd(read read2) {
            this.write = read2.MediaBrowserCompat$ItemReceiver;
            this.read = read2.IconCompatParcelizer;
            this.IconCompatParcelizer = read2.write;
        }
    }

    public zzxc(String str, String str2) {
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzxc zzxc = (zzxc) obj;
        String str = this.IconCompatParcelizer;
        if (str == null ? zzxc.IconCompatParcelizer != null : !str.equals(zzxc.IconCompatParcelizer)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str3 = zzxc.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    /* renamed from: o.zzxc$zza */
    public final class zza extends TypeAdapter implements addKernel {
        private validateCycle MediaBrowserCompat$CustomActionResultReceiver;
        private validateDAGRecurse MediaBrowserCompat$ItemReceiver;
        private Gson write;

        public zza(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
            this.write = gson;
            this.MediaBrowserCompat$CustomActionResultReceiver = validatecycle;
            this.MediaBrowserCompat$ItemReceiver = validatedagrecurse;
        }

        public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
            if (obj == null) {
                jsonWriter.nullValue();
                return;
            }
            zzxc zzxc = (zzxc) obj;
            Gson gson = this.write;
            validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$ItemReceiver;
            jsonWriter.beginObject();
            if (zzxc != zzxc.IconCompatParcelizer) {
                validatedagrecurse.read(jsonWriter, 452);
                String str = zzxc.IconCompatParcelizer;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
            }
            if (zzxc != zzxc.MediaBrowserCompat$CustomActionResultReceiver) {
                validatedagrecurse.read(jsonWriter, CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA);
                String str2 = zzxc.MediaBrowserCompat$CustomActionResultReceiver;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
            }
            jsonWriter.endObject();
        }

        public final Object read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                return null;
            }
            zzxc zzxc = new zzxc();
            Gson gson = this.write;
            validateCycle validatecycle = this.MediaBrowserCompat$CustomActionResultReceiver;
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                int write2 = validatecycle.write(jsonReader);
                boolean z = jsonReader.peek() != JsonToken.NULL;
                if (write2 != 98) {
                    if (write2 != 354) {
                        jsonReader.skipValue();
                    } else if (z) {
                        zzxc.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        zzxc.IconCompatParcelizer = null;
                    }
                } else if (z) {
                    zzxc.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    zzxc.MediaBrowserCompat$CustomActionResultReceiver = null;
                }
                jsonReader.nextNull();
            }
            jsonReader.endObject();
            return zzxc;
        }
    }
}

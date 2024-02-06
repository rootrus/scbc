package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.bouncycastle.i18n.ErrorBundle;
import p040o.PolystarContent;

/* renamed from: o.zzin */
public final /* synthetic */ class zzin implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ getDisplayName MediaBrowserCompat$CustomActionResultReceiver;

    /* renamed from: o.zzin$zzb */
    public final class zzb {
        @SerializedName("penalty")
        private final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("normal")
        private final String read;
        @SerializedName("ceiling")
        private final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzb)) {
                return false;
            }
            zzb zzb = (zzb) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzb.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzb.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzb.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.write;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CalculationInterestRate(normal=");
            sb.append(this.read);
            sb.append(", ceiling=");
            sb.append(this.write);
            sb.append(", penalty=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }
    }

    public /* synthetic */ zzin(getDisplayName getdisplayname) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getdisplayname;
    }

    public final Object write(Object obj) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver((PolystarContent.C37331) obj);
    }

    /* renamed from: o.zzin$zzd */
    public final class zzd {
        public final String IconCompatParcelizer;
        public final List<clearConditionalUserProperty> MediaBrowserCompat$CustomActionResultReceiver;
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzd)) {
                return false;
            }
            zzd zzd = (zzd) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzd.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzd.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzd.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.write;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            List<clearConditionalUserProperty> list = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (list != null) {
                i = list.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EasycashLoanInfo(header=");
            sb.append(this.write);
            sb.append(", subHeader=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", item=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public zzd(String str, String str2, List<clearConditionalUserProperty> list) {
            onGetStartedClick.write((Object) str, "header");
            onGetStartedClick.write((Object) str2, "subHeader");
            this.write = str;
            this.IconCompatParcelizer = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = list;
        }
    }

    /* renamed from: o.zzin$zza */
    public final class zza {
        public final List<setDataCollectionEnabled> IconCompatParcelizer;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof zza) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((zza) obj).IconCompatParcelizer);
            }
            return true;
        }

        public final int hashCode() {
            List<setDataCollectionEnabled> list = this.IconCompatParcelizer;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EasycashMCMCCalculation(details=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public zza(List<? extends setDataCollectionEnabled> list) {
            onGetStartedClick.write((Object) list, ErrorBundle.DETAIL_ENTRY);
            this.IconCompatParcelizer = list;
        }
    }

    /* renamed from: o.zzin$zzc */
    public final class zzc {
        public final String IconCompatParcelizer;
        public final List<setDataCollectionEnabled> MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$SearchResultReceiver;
        public final String MediaDescriptionCompat;
        private final String MediaMetadataCompat;
        public final List<String> read;
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzc)) {
                return false;
            }
            zzc zzc = (zzc) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) zzc.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzc.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzc.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzc.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) zzc.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzc.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) zzc.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzc.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.MediaDescriptionCompat;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.write;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            List<String> list = this.read;
            int hashCode3 = list != null ? list.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode4 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaMetadataCompat;
            int hashCode5 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.IconCompatParcelizer;
            int hashCode6 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode7 = str6 != null ? str6.hashCode() : 0;
            List<setDataCollectionEnabled> list2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MHMCCalculation(minimumCreditLimit=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", maximumCreditLimit=");
            sb.append(this.write);
            sb.append(", availableDurations=");
            sb.append(this.read);
            sb.append(", loanAmount=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", sliderInterval=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", duration=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", monthlyPayment=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", details=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public zzc(String str, String str2, List<String> list, String str3, String str4, String str5, String str6, List<? extends setDataCollectionEnabled> list2) {
            onGetStartedClick.write((Object) str, "minimumCreditLimit");
            onGetStartedClick.write((Object) str2, "maximumCreditLimit");
            onGetStartedClick.write((Object) list, "availableDurations");
            onGetStartedClick.write((Object) str3, "loanAmount");
            onGetStartedClick.write((Object) str4, "sliderInterval");
            onGetStartedClick.write((Object) str5, "duration");
            onGetStartedClick.write((Object) str6, "monthlyPayment");
            onGetStartedClick.write((Object) list2, ErrorBundle.DETAIL_ENTRY);
            this.MediaDescriptionCompat = str;
            this.write = str2;
            this.read = list;
            this.MediaBrowserCompat$ItemReceiver = str3;
            this.MediaMetadataCompat = str4;
            this.IconCompatParcelizer = str5;
            this.MediaBrowserCompat$SearchResultReceiver = str6;
            this.MediaBrowserCompat$CustomActionResultReceiver = list2;
        }
    }
}

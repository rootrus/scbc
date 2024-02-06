package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.zzca;
import p040o.zzfk;
import p040o.zzjx;
import p040o.zzkf;

/* renamed from: o.zzcz */
public final /* synthetic */ class zzcz implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ enableUsingApkIndependentContext IconCompatParcelizer;

    /* renamed from: o.zzcz$zza */
    public final class zza {
        @SerializedName("applicationUuid")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("customerContactInfo")
        public final zzca.zzg.zza MediaBrowserCompat$ItemReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza = (zza) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zza.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            zzca.zzg.zza zza = this.MediaBrowserCompat$ItemReceiver;
            if (zza != null) {
                i = zza.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CustomerContactInfoRequest(applicationUuid=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", customerContactInfo=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: o.zzcz$zza$zza  reason: collision with other inner class name */
        public final class C10765zza {
            public final boolean IconCompatParcelizer;
            public final boolean MediaBrowserCompat$CustomActionResultReceiver;
            public final boolean MediaBrowserCompat$ItemReceiver;
            public final boolean read;
            public final boolean write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10765zza)) {
                    return false;
                }
                C10765zza zza = (C10765zza) obj;
                return this.MediaBrowserCompat$CustomActionResultReceiver == zza.MediaBrowserCompat$CustomActionResultReceiver && this.write == zza.write && this.MediaBrowserCompat$ItemReceiver == zza.MediaBrowserCompat$ItemReceiver && this.IconCompatParcelizer == zza.IconCompatParcelizer && this.read == zza.read;
            }

            public final int hashCode() {
                boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                boolean z3 = this.write;
                if (z3) {
                    z3 = true;
                }
                boolean z4 = this.MediaBrowserCompat$ItemReceiver;
                if (z4) {
                    z4 = true;
                }
                boolean z5 = this.IconCompatParcelizer;
                if (z5) {
                    z5 = true;
                }
                boolean z6 = this.read;
                if (!z6) {
                    z2 = z6;
                }
                return ((((((((z ? 1 : 0) * true) + (z3 ? 1 : 0)) * 31) + (z4 ? 1 : 0)) * 31) + (z5 ? 1 : 0)) * 31) + (z2 ? 1 : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("DocumentFeedback(isBlurry=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", isMissingBorder=");
                sb.append(this.write);
                sb.append(", isLowContrastBackground=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", isOverSaturated=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", isUnderSaturated=");
                sb.append(this.read);
                sb.append(")");
                return sb.toString();
            }

            public C10765zza(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
                this.MediaBrowserCompat$CustomActionResultReceiver = z;
                this.write = z2;
                this.MediaBrowserCompat$ItemReceiver = z3;
                this.IconCompatParcelizer = z4;
                this.read = z5;
            }
        }

        public zza(String str, zzca.zzg.zza zza) {
            onGetStartedClick.write((Object) str, "applicationUuid");
            onGetStartedClick.write((Object) zza, "customerContactInfo");
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.MediaBrowserCompat$ItemReceiver = zza;
        }
    }

    /* renamed from: o.zzcz$zzf */
    public final class zzf {
        public final zzb IconCompatParcelizer;
        public final zze.zza MediaBrowserCompat$CustomActionResultReceiver;
        public final zze.zza MediaBrowserCompat$ItemReceiver;
        public final zze.zza read;
        public final zzd.zzb write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzf)) {
                return false;
            }
            zzf zzf = (zzf) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzf.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzf.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzf.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzf.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzf.write);
        }

        public final int hashCode() {
            zzb zzb2 = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = zzb2 != null ? zzb2.hashCode() : 0;
            zze.zza zza2 = this.read;
            int hashCode2 = zza2 != null ? zza2.hashCode() : 0;
            zze.zza zza3 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode3 = zza3 != null ? zza3.hashCode() : 0;
            zze.zza zza4 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode4 = zza4 != null ? zza4.hashCode() : 0;
            zzd.zzb zzb3 = this.write;
            if (zzb3 != null) {
                i = zzb3.hashCode();
            }
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlBusinessURLInfo(validationConfig=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", businessRegistrationNo=");
            sb.append(this.read);
            sb.append(", businessOnLease=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", businessUrl=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", marketplaceUrl=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: o.zzcz$zzf$zza */
        public final class zza {
            public final boolean IconCompatParcelizer;
            public final zzcz$zzf$zza$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;
            public final boolean write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zza)) {
                    return false;
                }
                zza zza = (zza) obj;
                return this.IconCompatParcelizer == zza.IconCompatParcelizer && this.write == zza.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver);
            }

            public final int hashCode() {
                boolean z = this.IconCompatParcelizer;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                boolean z3 = this.write;
                if (!z3) {
                    z2 = z3;
                }
                zzcz$zzf$zza$MediaBrowserCompat$CustomActionResultReceiver zzcz_zzf_zza_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver;
                return ((((z ? 1 : 0) * true) + (z2 ? 1 : 0)) * 31) + (zzcz_zzf_zza_mediabrowsercompat_customactionresultreceiver != null ? zzcz_zzf_zza_mediabrowsercompat_customactionresultreceiver.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("HmlCheckPrerequisites(emailVerified=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", verifyKycFlag=");
                sb.append(this.write);
                sb.append(", actionForReceivingAccount=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(")");
                return sb.toString();
            }

            public zza(boolean z, boolean z2, zzcz$zzf$zza$MediaBrowserCompat$CustomActionResultReceiver zzcz_zzf_zza_mediabrowsercompat_customactionresultreceiver) {
                onGetStartedClick.write((Object) zzcz_zzf_zza_mediabrowsercompat_customactionresultreceiver, "actionForReceivingAccount");
                this.IconCompatParcelizer = z;
                this.write = z2;
                this.MediaBrowserCompat$ItemReceiver = zzcz_zzf_zza_mediabrowsercompat_customactionresultreceiver;
            }
        }

        public zzf(zzb zzb2, zze.zza zza2, zze.zza zza3, zze.zza zza4, zzd.zzb zzb3) {
            onGetStartedClick.write((Object) zzb2, "validationConfig");
            onGetStartedClick.write((Object) zza2, "businessRegistrationNo");
            onGetStartedClick.write((Object) zza3, "businessOnLease");
            onGetStartedClick.write((Object) zza4, "businessUrl");
            onGetStartedClick.write((Object) zzb3, "marketplaceUrl");
            this.IconCompatParcelizer = zzb2;
            this.read = zza2;
            this.MediaBrowserCompat$ItemReceiver = zza3;
            this.MediaBrowserCompat$CustomActionResultReceiver = zza4;
            this.write = zzb3;
        }

        /* renamed from: o.zzcz$zzf$zzb */
        public final class zzb {
            public final zzh MediaBrowserCompat$CustomActionResultReceiver;
            public final zzh MediaBrowserCompat$ItemReceiver;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zzb)) {
                    return false;
                }
                zzb zzb = (zzb) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzb.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzb.MediaBrowserCompat$ItemReceiver);
            }

            public final int hashCode() {
                zzh zzh = this.MediaBrowserCompat$CustomActionResultReceiver;
                int i = 0;
                int hashCode = zzh != null ? zzh.hashCode() : 0;
                zzh zzh2 = this.MediaBrowserCompat$ItemReceiver;
                if (zzh2 != null) {
                    i = zzh2.hashCode();
                }
                return (hashCode * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("HmlBusinessValidationConfig(marketplaceStoreUrl=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", marketplaceProductUrl=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(")");
                return sb.toString();
            }

            public zzb(zzh zzh, zzh zzh2) {
                onGetStartedClick.write((Object) zzh, "marketplaceStoreUrl");
                onGetStartedClick.write((Object) zzh2, "marketplaceProductUrl");
                this.MediaBrowserCompat$CustomActionResultReceiver = zzh;
                this.MediaBrowserCompat$ItemReceiver = zzh2;
            }
        }
    }

    /* renamed from: o.zzcz$zzh */
    public final class zzh implements Parcelable {
        public static final zzcz$zzh$MediaBrowserCompat$ItemReceiver CREATOR = new zzcz$zzh$MediaBrowserCompat$ItemReceiver((byte) 0);
        public final int MediaBrowserCompat$CustomActionResultReceiver;
        public final int MediaBrowserCompat$ItemReceiver;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzh)) {
                return false;
            }
            zzh zzh = (zzh) obj;
            return this.MediaBrowserCompat$CustomActionResultReceiver == zzh.MediaBrowserCompat$CustomActionResultReceiver && this.MediaBrowserCompat$ItemReceiver == zzh.MediaBrowserCompat$ItemReceiver;
        }

        public final int hashCode() {
            return (this.MediaBrowserCompat$CustomActionResultReceiver * 31) + this.MediaBrowserCompat$ItemReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlBusinessValidation(minAmount=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", maxAmount=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: o.zzcz$zzh$zza */
        public final class zza {
            private final String IconCompatParcelizer;
            public final String MediaBrowserCompat$CustomActionResultReceiver;
            public final String MediaBrowserCompat$ItemReceiver;
            public final String write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zza)) {
                    return false;
                }
                zza zza = (zza) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zza.MediaBrowserCompat$CustomActionResultReceiver);
            }

            public final int hashCode() {
                String str = this.write;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.IconCompatParcelizer;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.MediaBrowserCompat$ItemReceiver;
                int hashCode3 = str3 != null ? str3.hashCode() : 0;
                String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("HmlConsentDateTime(applicationDateTime=");
                sb.append(this.write);
                sb.append(", applicationId=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", approvalEstimatedTime=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", approvalEstimatedTimeDetail=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(")");
                return sb.toString();
            }

            public zza(String str, String str2, String str3, String str4) {
                this.write = str;
                this.IconCompatParcelizer = str2;
                this.MediaBrowserCompat$ItemReceiver = str3;
                this.MediaBrowserCompat$CustomActionResultReceiver = str4;
            }
        }

        public zzh(int i, int i2) {
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
            this.MediaBrowserCompat$ItemReceiver = i2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public zzh(Parcel parcel) {
            this(parcel.readInt(), parcel.readInt());
            onGetStartedClick.write((Object) parcel, "parcel");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeInt(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeInt(this.MediaBrowserCompat$ItemReceiver);
        }
    }

    public /* synthetic */ zzcz(enableUsingApkIndependentContext enableusingapkindependentcontext) {
        this.IconCompatParcelizer = enableusingapkindependentcontext;
    }

    public final Object write(Object obj) {
        return this.IconCompatParcelizer.write((jsonObjectToPoint) obj);
    }

    /* renamed from: o.zzcz$zzi */
    public final class zzi {
        public final Integer IconCompatParcelizer;
        public final boolean MediaBrowserCompat$CustomActionResultReceiver;
        public final List<read> MediaBrowserCompat$ItemReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzi)) {
                return false;
            }
            zzi zzi = (zzi) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzi.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzi.IconCompatParcelizer) && this.MediaBrowserCompat$CustomActionResultReceiver == zzi.MediaBrowserCompat$CustomActionResultReceiver;
        }

        public final int hashCode() {
            List<read> list = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = list != null ? list.hashCode() : 0;
            Integer num = this.IconCompatParcelizer;
            if (num != null) {
                i = num.hashCode();
            }
            boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (z) {
                z = true;
            }
            return (((hashCode * 31) + i) * 31) + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlCompanyListPage(list=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", nextPageNumber=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", hasMorePages=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public zzi(List<read> list, Integer num, boolean z) {
            onGetStartedClick.write((Object) list, "list");
            this.MediaBrowserCompat$ItemReceiver = list;
            this.IconCompatParcelizer = num;
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
        }

        /* renamed from: o.zzcz$zzi$read */
        public static final class read {
            public final String MediaBrowserCompat$CustomActionResultReceiver;
            public final String read;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof read)) {
                    return false;
                }
                read read2 = (read) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) read2.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) read2.MediaBrowserCompat$CustomActionResultReceiver);
            }

            public final int hashCode() {
                String str = this.read;
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
                sb.append("Company(companyId=");
                sb.append(this.read);
                sb.append(", companyName=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(")");
                return sb.toString();
            }

            public read(String str, String str2) {
                onGetStartedClick.write((Object) str, "companyId");
                onGetStartedClick.write((Object) str2, "companyName");
                this.read = str;
                this.MediaBrowserCompat$CustomActionResultReceiver = str2;
            }
        }

        /* renamed from: o.zzcz$zzi$zza */
        public final class zza {
            public final String IconCompatParcelizer;
            public final String MediaBrowserCompat$CustomActionResultReceiver;
            public final String MediaBrowserCompat$ItemReceiver;
            public final String MediaBrowserCompat$SearchResultReceiver;
            public final String MediaMetadataCompat;
            public final String RatingCompat;
            public final String read;
            public final zzfk.zza write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zza)) {
                    return false;
                }
                zza zza = (zza) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) zza.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zza.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) zza.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) zza.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write);
            }

            public final int hashCode() {
                String str = this.MediaBrowserCompat$SearchResultReceiver;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.MediaMetadataCompat;
                int hashCode3 = str3 != null ? str3.hashCode() : 0;
                String str4 = this.RatingCompat;
                int hashCode4 = str4 != null ? str4.hashCode() : 0;
                String str5 = this.read;
                int hashCode5 = str5 != null ? str5.hashCode() : 0;
                String str6 = this.IconCompatParcelizer;
                int hashCode6 = str6 != null ? str6.hashCode() : 0;
                String str7 = this.MediaBrowserCompat$ItemReceiver;
                int hashCode7 = str7 != null ? str7.hashCode() : 0;
                zzfk.zza zza = this.write;
                if (zza != null) {
                    i = zza.hashCode();
                }
                return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("HmlContactInfo(thaiTitle=");
                sb.append(this.MediaBrowserCompat$SearchResultReceiver);
                sb.append(", engTitle=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", thaiFirstName=");
                sb.append(this.MediaMetadataCompat);
                sb.append(", thaiLastName=");
                sb.append(this.RatingCompat);
                sb.append(", engFirstName=");
                sb.append(this.read);
                sb.append(", engLastName=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", dateOfBirth=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", citizenId=");
                sb.append(this.write);
                sb.append(")");
                return sb.toString();
            }

            public zza(String str, String str2, String str3, String str4, String str5, String str6, String str7, zzfk.zza zza) {
                onGetStartedClick.write((Object) str, "thaiTitle");
                onGetStartedClick.write((Object) str2, "engTitle");
                onGetStartedClick.write((Object) str3, "thaiFirstName");
                onGetStartedClick.write((Object) str4, "thaiLastName");
                onGetStartedClick.write((Object) str5, "engFirstName");
                onGetStartedClick.write((Object) str6, "engLastName");
                onGetStartedClick.write((Object) str7, "dateOfBirth");
                onGetStartedClick.write((Object) zza, "citizenId");
                this.MediaBrowserCompat$SearchResultReceiver = str;
                this.MediaBrowserCompat$CustomActionResultReceiver = str2;
                this.MediaMetadataCompat = str3;
                this.RatingCompat = str4;
                this.read = str5;
                this.IconCompatParcelizer = str6;
                this.MediaBrowserCompat$ItemReceiver = str7;
                this.write = zza;
            }
        }
    }

    /* renamed from: o.zzcz$zzb */
    public final class zzb {
        public final String IconCompatParcelizer;
        public final String read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzb)) {
                return false;
            }
            zzb zzb = (zzb) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzb.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzb.IconCompatParcelizer);
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DutyStampFee(rate=");
            sb.append(this.read);
            sb.append(", amount=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: o.zzcz$zzb$zza */
        public final class zza {
            public final String IconCompatParcelizer;
            public final setInfoWindowAdapter MediaBrowserCompat$CustomActionResultReceiver;
            public final String MediaBrowserCompat$ItemReceiver;
            public final List<String> MediaBrowserCompat$MediaItem;
            public final String read;
            public final String write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zza)) {
                    return false;
                }
                zza zza = (zza) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zza.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) zza.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer);
            }

            public final int hashCode() {
                setInfoWindowAdapter setinfowindowadapter = this.MediaBrowserCompat$CustomActionResultReceiver;
                int i = 0;
                int hashCode = setinfowindowadapter != null ? setinfowindowadapter.hashCode() : 0;
                String str = this.write;
                int hashCode2 = str != null ? str.hashCode() : 0;
                List<String> list = this.MediaBrowserCompat$MediaItem;
                int hashCode3 = list != null ? list.hashCode() : 0;
                String str2 = this.read;
                int hashCode4 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.MediaBrowserCompat$ItemReceiver;
                int hashCode5 = str3 != null ? str3.hashCode() : 0;
                String str4 = this.IconCompatParcelizer;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("HmlApplicationsOccupationInfo(experience=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", companyPhone=");
                sb.append(this.write);
                sb.append(", workAddress=");
                sb.append(this.MediaBrowserCompat$MediaItem);
                sb.append(", companyName=");
                sb.append(this.read);
                sb.append(", sourceOfIncome=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", occupation=");
                sb.append(this.IconCompatParcelizer);
                sb.append(")");
                return sb.toString();
            }

            public zza(setInfoWindowAdapter setinfowindowadapter, String str, List<String> list, String str2, String str3, String str4) {
                onGetStartedClick.write((Object) setinfowindowadapter, "experience");
                onGetStartedClick.write((Object) list, "workAddress");
                onGetStartedClick.write((Object) str3, "sourceOfIncome");
                onGetStartedClick.write((Object) str4, "occupation");
                this.MediaBrowserCompat$CustomActionResultReceiver = setinfowindowadapter;
                this.write = str;
                this.MediaBrowserCompat$MediaItem = list;
                this.read = str2;
                this.MediaBrowserCompat$ItemReceiver = str3;
                this.IconCompatParcelizer = str4;
            }
        }

        public zzb(String str, String str2) {
            onGetStartedClick.write((Object) str, "rate");
            onGetStartedClick.write((Object) str2, "amount");
            this.read = str;
            this.IconCompatParcelizer = str2;
        }
    }

    /* renamed from: o.zzcz$zzc */
    public enum zzc {
        DEFAULT,
        PENDING_PERSONAL_INFO,
        PENDING_BUSINESS_INFO,
        PENDING_DOC_UPLOAD,
        PENDING_NCB_CONSENT,
        PENDING_SUBMISSION,
        PENDING,
        PENDING_WITH_AIP,
        PENDING_LEADS_RESUBMIT,
        APPROVE,
        REJECT,
        ACCEPT,
        PROGRESS,
        PROGRESS_OFF_HOUR,
        SUCCESS;

        /* renamed from: o.zzcz$zzc$zza */
        public final class zza {
            public final String IconCompatParcelizer;
            public final List<BillerAdapter$ItemViewHolder> MediaBrowserCompat$CustomActionResultReceiver;
            public final zzb.zza MediaBrowserCompat$ItemReceiver;
            public final zzg MediaBrowserCompat$SearchResultReceiver;
            public final String MediaDescriptionCompat;
            public final int MediaMetadataCompat;
            public final zzb read;
            public final zzcz$zzc$zza$MediaBrowserCompat$CustomActionResultReceiver write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zza)) {
                    return false;
                }
                zza zza = (zza) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) zza.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) zza.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver) && this.MediaMetadataCompat == zza.MediaMetadataCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zza.MediaBrowserCompat$CustomActionResultReceiver);
            }

            public final int hashCode() {
                String str = this.IconCompatParcelizer;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.MediaDescriptionCompat;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                zzb zzb = this.read;
                int hashCode3 = zzb != null ? zzb.hashCode() : 0;
                zzg zzg = this.MediaBrowserCompat$SearchResultReceiver;
                int hashCode4 = zzg != null ? zzg.hashCode() : 0;
                zzb.zza zza = this.MediaBrowserCompat$ItemReceiver;
                int hashCode5 = zza != null ? zza.hashCode() : 0;
                int i2 = this.MediaMetadataCompat;
                zzcz$zzc$zza$MediaBrowserCompat$CustomActionResultReceiver zzcz_zzc_zza_mediabrowsercompat_customactionresultreceiver = this.write;
                int hashCode6 = zzcz_zzc_zza_mediabrowsercompat_customactionresultreceiver != null ? zzcz_zzc_zza_mediabrowsercompat_customactionresultreceiver.hashCode() : 0;
                List<BillerAdapter$ItemViewHolder> list = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (list != null) {
                    i = list.hashCode();
                }
                return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i2) * 31) + hashCode6) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("HmlApplications(applicationUuid=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", productType=");
                sb.append(this.MediaDescriptionCompat);
                sb.append(", customerContactInfo=");
                sb.append(this.read);
                sb.append(", requestedProduct=");
                sb.append(this.MediaBrowserCompat$SearchResultReceiver);
                sb.append(", occupationInfo=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", uploadedDocumentAmount=");
                sb.append(this.MediaMetadataCompat);
                sb.append(", mainOperatingAccount=");
                sb.append(this.write);
                sb.append(", consents=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(")");
                return sb.toString();
            }

            public zza(String str, String str2, zzb zzb, zzg zzg, zzb.zza zza, int i, zzcz$zzc$zza$MediaBrowserCompat$CustomActionResultReceiver zzcz_zzc_zza_mediabrowsercompat_customactionresultreceiver, List<BillerAdapter$ItemViewHolder> list) {
                onGetStartedClick.write((Object) zzb, "customerContactInfo");
                onGetStartedClick.write((Object) zzg, "requestedProduct");
                onGetStartedClick.write((Object) zza, "occupationInfo");
                this.IconCompatParcelizer = str;
                this.MediaDescriptionCompat = str2;
                this.read = zzb;
                this.MediaBrowserCompat$SearchResultReceiver = zzg;
                this.MediaBrowserCompat$ItemReceiver = zza;
                this.MediaMetadataCompat = i;
                this.write = zzcz_zzc_zza_mediabrowsercompat_customactionresultreceiver;
                this.MediaBrowserCompat$CustomActionResultReceiver = list;
            }
        }

        /* renamed from: o.zzcz$zzc$zzb */
        public final class zzb {
            public final String IconCompatParcelizer;
            public final String MediaBrowserCompat$CustomActionResultReceiver;
            public final String MediaBrowserCompat$ItemReceiver;
            public final double MediaBrowserCompat$MediaItem;
            public final List<String> MediaBrowserCompat$SearchResultReceiver;
            public final String MediaDescriptionCompat;
            public final List<String> MediaMetadataCompat;
            public final String MediaSessionCompat$QueueItem;
            public final String MediaSessionCompat$ResultReceiverWrapper;
            public final String MediaSessionCompat$Token;
            public final String ParcelableVolumeInfo;
            public final String RatingCompat;
            public final zzg.zza read;
            public final OffsetDateTime write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zzb)) {
                    return false;
                }
                zzb zzb = (zzb) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) zzb.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) zzb.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) zzb.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzb.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) zzb.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzb.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzb.MediaBrowserCompat$ItemReceiver) && Double.compare(this.MediaBrowserCompat$MediaItem, zzb.MediaBrowserCompat$MediaItem) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) zzb.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) zzb.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) zzb.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzb.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) zzb.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzb.read);
            }

            public final int hashCode() {
                String str = this.ParcelableVolumeInfo;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.MediaDescriptionCompat;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.MediaSessionCompat$Token;
                int hashCode3 = str3 != null ? str3.hashCode() : 0;
                String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
                int hashCode4 = str4 != null ? str4.hashCode() : 0;
                String str5 = this.MediaSessionCompat$QueueItem;
                int hashCode5 = str5 != null ? str5.hashCode() : 0;
                OffsetDateTime offsetDateTime = this.write;
                int hashCode6 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
                String str6 = this.MediaBrowserCompat$ItemReceiver;
                int hashCode7 = str6 != null ? str6.hashCode() : 0;
                long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$MediaItem);
                int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                List<String> list = this.MediaMetadataCompat;
                int hashCode8 = list != null ? list.hashCode() : 0;
                List<String> list2 = this.MediaBrowserCompat$SearchResultReceiver;
                int hashCode9 = list2 != null ? list2.hashCode() : 0;
                String str7 = this.RatingCompat;
                int hashCode10 = str7 != null ? str7.hashCode() : 0;
                String str8 = this.IconCompatParcelizer;
                int hashCode11 = str8 != null ? str8.hashCode() : 0;
                String str9 = this.MediaSessionCompat$ResultReceiverWrapper;
                int hashCode12 = str9 != null ? str9.hashCode() : 0;
                zzg.zza zza = this.read;
                if (zza != null) {
                    i = zza.hashCode();
                }
                return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i2) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("HmlApplicationsContactInfo(thaiTitle=");
                sb.append(this.ParcelableVolumeInfo);
                sb.append(", engTitle=");
                sb.append(this.MediaDescriptionCompat);
                sb.append(", thaiName=");
                sb.append(this.MediaSessionCompat$Token);
                sb.append(", engName=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", mobileNo=");
                sb.append(this.MediaSessionCompat$QueueItem);
                sb.append(", dateOfBirth=");
                sb.append(this.write);
                sb.append(", email=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", income=");
                sb.append(this.MediaBrowserCompat$MediaItem);
                sb.append(", mailingAddress=");
                sb.append(this.MediaMetadataCompat);
                sb.append(", homeAddress=");
                sb.append(this.MediaBrowserCompat$SearchResultReceiver);
                sb.append(", maritalStatus=");
                sb.append(this.RatingCompat);
                sb.append(", educationLevel=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", residentType=");
                sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
                sb.append(", citizenId=");
                sb.append(this.read);
                sb.append(")");
                return sb.toString();
            }

            public zzb(String str, String str2, String str3, String str4, String str5, OffsetDateTime offsetDateTime, String str6, double d, List<String> list, List<String> list2, String str7, String str8, String str9, zzg.zza zza) {
                String str10 = str3;
                String str11 = str5;
                OffsetDateTime offsetDateTime2 = offsetDateTime;
                String str12 = str6;
                List<String> list3 = list;
                String str13 = str7;
                String str14 = str8;
                String str15 = str9;
                zzg.zza zza2 = zza;
                onGetStartedClick.write((Object) str, "thaiTitle");
                onGetStartedClick.write((Object) str2, "engTitle");
                onGetStartedClick.write((Object) str10, "thaiName");
                onGetStartedClick.write((Object) str11, "mobileNo");
                onGetStartedClick.write((Object) offsetDateTime2, "dateOfBirth");
                onGetStartedClick.write((Object) str12, Scopes.EMAIL);
                onGetStartedClick.write((Object) list3, "mailingAddress");
                onGetStartedClick.write((Object) str13, "maritalStatus");
                onGetStartedClick.write((Object) str14, "educationLevel");
                onGetStartedClick.write((Object) str15, "residentType");
                onGetStartedClick.write((Object) zza2, "citizenId");
                this.ParcelableVolumeInfo = str;
                this.MediaDescriptionCompat = str2;
                this.MediaSessionCompat$Token = str10;
                this.MediaBrowserCompat$CustomActionResultReceiver = str4;
                this.MediaSessionCompat$QueueItem = str11;
                this.write = offsetDateTime2;
                this.MediaBrowserCompat$ItemReceiver = str12;
                this.MediaBrowserCompat$MediaItem = d;
                this.MediaMetadataCompat = list3;
                this.MediaBrowserCompat$SearchResultReceiver = list2;
                this.RatingCompat = str13;
                this.IconCompatParcelizer = str14;
                this.MediaSessionCompat$ResultReceiverWrapper = str15;
                this.read = zza2;
            }
        }
    }

    /* renamed from: o.zzcz$zzd */
    public final class zzd {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final int read;
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzd)) {
                return false;
            }
            zzd zzd = (zzd) obj;
            return this.read == zzd.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzd.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzd.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzd.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzd.write);
        }

        public final int hashCode() {
            int i = this.read;
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i2 = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.write;
            if (str4 != null) {
                i2 = str4.hashCode();
            }
            return (((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlBusinessAccount(id=");
            sb.append(this.read);
            sb.append(", bankCode=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", bankAbbrev=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", bankLogo=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", accountNo=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: o.zzcz$zzd$zza */
        public final class zza {
            public final Integer IconCompatParcelizer;
            public final int MediaBrowserCompat$CustomActionResultReceiver;
            public final zzjx.zza MediaBrowserCompat$ItemReceiver;
            public final isOperational MediaBrowserCompat$SearchResultReceiver;
            public final List<zzd> MediaDescriptionCompat;
            public final setMapStyle MediaMetadataCompat;
            public final zzkf.zza RatingCompat;
            public final zze read;
            public final String write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zza)) {
                    return false;
                }
                zza zza = (zza) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) zza.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) zza.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) zza.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) zza.MediaDescriptionCompat) && this.MediaBrowserCompat$CustomActionResultReceiver == zza.MediaBrowserCompat$CustomActionResultReceiver;
            }

            public final int hashCode() {
                isOperational isoperational = this.MediaBrowserCompat$SearchResultReceiver;
                int i = 0;
                int hashCode = isoperational != null ? isoperational.hashCode() : 0;
                zze zze = this.read;
                int hashCode2 = zze != null ? zze.hashCode() : 0;
                String str = this.write;
                int hashCode3 = str != null ? str.hashCode() : 0;
                zzkf.zza zza = this.RatingCompat;
                int hashCode4 = zza != null ? zza.hashCode() : 0;
                zzjx.zza zza2 = this.MediaBrowserCompat$ItemReceiver;
                int hashCode5 = zza2 != null ? zza2.hashCode() : 0;
                Integer num = this.IconCompatParcelizer;
                int hashCode6 = num != null ? num.hashCode() : 0;
                setMapStyle setmapstyle = this.MediaMetadataCompat;
                int hashCode7 = setmapstyle != null ? setmapstyle.hashCode() : 0;
                List<zzd> list = this.MediaDescriptionCompat;
                if (list != null) {
                    i = list.hashCode();
                }
                return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i) * 31) + this.MediaBrowserCompat$CustomActionResultReceiver;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("HmlBusinessInfo(validationConfig=");
                sb.append(this.MediaBrowserCompat$SearchResultReceiver);
                sb.append(", businessIndustry=");
                sb.append(this.read);
                sb.append(", businessType=");
                sb.append(this.write);
                sb.append(", storeType=");
                sb.append(this.RatingCompat);
                sb.append(", loanPurpose=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", netIncome=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", sourceOfIncome=");
                sb.append(this.MediaMetadataCompat);
                sb.append(", operatingAccount=");
                sb.append(this.MediaDescriptionCompat);
                sb.append(", minIncome=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(")");
                return sb.toString();
            }

            public zza(isOperational isoperational, zze zze, String str, zzkf.zza zza, zzjx.zza zza2, Integer num, setMapStyle setmapstyle, List<zzd> list, int i) {
                onGetStartedClick.write((Object) isoperational, "validationConfig");
                this.MediaBrowserCompat$SearchResultReceiver = isoperational;
                this.read = zze;
                this.write = str;
                this.RatingCompat = zza;
                this.MediaBrowserCompat$ItemReceiver = zza2;
                this.IconCompatParcelizer = num;
                this.MediaMetadataCompat = setmapstyle;
                this.MediaDescriptionCompat = list;
                this.MediaBrowserCompat$CustomActionResultReceiver = i;
            }
        }

        public zzd(int i, String str, String str2, String str3, String str4) {
            onGetStartedClick.write((Object) str, "bankCode");
            onGetStartedClick.write((Object) str2, "bankAbbrev");
            onGetStartedClick.write((Object) str3, "bankLogo");
            onGetStartedClick.write((Object) str4, "accountNo");
            this.read = i;
            this.MediaBrowserCompat$ItemReceiver = str;
            this.IconCompatParcelizer = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
            this.write = str4;
        }

        /* renamed from: o.zzcz$zzd$zzb */
        public final class zzb {
            public final boolean IconCompatParcelizer;
            public final List<String> MediaBrowserCompat$CustomActionResultReceiver;
            public final List<String> MediaBrowserCompat$ItemReceiver;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zzb)) {
                    return false;
                }
                zzb zzb = (zzb) obj;
                return this.IconCompatParcelizer == zzb.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzb.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzb.MediaBrowserCompat$CustomActionResultReceiver);
            }

            public final int hashCode() {
                boolean z = this.IconCompatParcelizer;
                if (z) {
                    z = true;
                }
                List<String> list = this.MediaBrowserCompat$ItemReceiver;
                int i = 0;
                int hashCode = list != null ? list.hashCode() : 0;
                List<String> list2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (list2 != null) {
                    i = list2.hashCode();
                }
                return ((((z ? 1 : 0) * true) + hashCode) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("HmlBusinessInfoMarketURL(enablingFlag=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", storeUrl=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", productUrl=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(")");
                return sb.toString();
            }

            public zzb(boolean z, List<String> list, List<String> list2) {
                this.IconCompatParcelizer = z;
                this.MediaBrowserCompat$ItemReceiver = list;
                this.MediaBrowserCompat$CustomActionResultReceiver = list2;
            }
        }
    }

    /* renamed from: o.zzcz$zzg */
    public final class zzg {
        public final write IconCompatParcelizer;
        public final double MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final FusedLocationProviderClient MediaBrowserCompat$MediaItem;
        public final List<Geofence> MediaBrowserCompat$SearchResultReceiver;
        public final double MediaDescriptionCompat;
        public Integer MediaMetadataCompat;
        public final OffsetDateTime ParcelableVolumeInfo;
        public String RatingCompat;
        public final String read;
        public final zzb write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzg)) {
                return false;
            }
            zzg zzg = (zzg) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) zzg.RatingCompat) && Double.compare(this.MediaDescriptionCompat, zzg.MediaDescriptionCompat) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzg.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzg.IconCompatParcelizer) && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, zzg.MediaBrowserCompat$CustomActionResultReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) zzg.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) zzg.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzg.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) zzg.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) zzg.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzg.write);
        }

        public final int hashCode() {
            String str = this.RatingCompat;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            long doubleToLongBits = Double.doubleToLongBits(this.MediaDescriptionCompat);
            int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            write write2 = this.IconCompatParcelizer;
            int hashCode3 = write2 != null ? write2.hashCode() : 0;
            long doubleToLongBits2 = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
            int i3 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
            OffsetDateTime offsetDateTime = this.ParcelableVolumeInfo;
            int hashCode4 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
            Integer num = this.MediaMetadataCompat;
            int hashCode5 = num != null ? num.hashCode() : 0;
            String str3 = this.read;
            int hashCode6 = str3 != null ? str3.hashCode() : 0;
            FusedLocationProviderClient fusedLocationProviderClient = this.MediaBrowserCompat$MediaItem;
            int hashCode7 = fusedLocationProviderClient != null ? fusedLocationProviderClient.hashCode() : 0;
            List<Geofence> list = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode8 = list != null ? list.hashCode() : 0;
            zzb zzb = this.write;
            if (zzb != null) {
                i = zzb.hashCode();
            }
            return (((((((((((((((((((hashCode * 31) + i2) * 31) + hashCode2) * 31) + hashCode3) * 31) + i3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlCalculateLoan(productType=");
            sb.append(this.RatingCompat);
            sb.append(", principal=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", duration=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", installment=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", annualInterest=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", repaymentStartDate=");
            sb.append(this.ParcelableVolumeInfo);
            sb.append(", repaymentDate=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", gracePeriod=");
            sb.append(this.read);
            sb.append(", productCatalogue=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", promotions=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", dutyStamp=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: o.zzcz$zzg$zza */
        public final class zza {
            public final OffsetDateTime IconCompatParcelizer;
            public final String MediaBrowserCompat$ItemReceiver;
            public final String read;
            public final OffsetDateTime write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zza)) {
                    return false;
                }
                zza zza = (zza) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer);
            }

            public final int hashCode() {
                String str = this.MediaBrowserCompat$ItemReceiver;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.read;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                OffsetDateTime offsetDateTime = this.write;
                int hashCode3 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
                OffsetDateTime offsetDateTime2 = this.IconCompatParcelizer;
                if (offsetDateTime2 != null) {
                    i = offsetDateTime2.hashCode();
                }
                return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("HmlCitizenId(number=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", laserCode=");
                sb.append(this.read);
                sb.append(", issueDate=");
                sb.append(this.write);
                sb.append(", expiryDate=");
                sb.append(this.IconCompatParcelizer);
                sb.append(")");
                return sb.toString();
            }

            public zza(String str, String str2, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2) {
                onGetStartedClick.write((Object) offsetDateTime2, "expiryDate");
                this.MediaBrowserCompat$ItemReceiver = str;
                this.read = str2;
                this.write = offsetDateTime;
                this.IconCompatParcelizer = offsetDateTime2;
            }
        }

        public zzg(String str, double d, String str2, write write2, double d2, OffsetDateTime offsetDateTime, Integer num, String str3, FusedLocationProviderClient fusedLocationProviderClient, List<Geofence> list, zzb zzb) {
            onGetStartedClick.write((Object) str, "productType");
            onGetStartedClick.write((Object) write2, "installment");
            onGetStartedClick.write((Object) offsetDateTime, "repaymentStartDate");
            this.RatingCompat = str;
            this.MediaDescriptionCompat = d;
            this.MediaBrowserCompat$ItemReceiver = str2;
            this.IconCompatParcelizer = write2;
            this.MediaBrowserCompat$CustomActionResultReceiver = d2;
            this.ParcelableVolumeInfo = offsetDateTime;
            this.MediaMetadataCompat = num;
            this.read = str3;
            this.MediaBrowserCompat$MediaItem = fusedLocationProviderClient;
            this.MediaBrowserCompat$SearchResultReceiver = list;
            this.write = zzb;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ zzg(String str, double d, String str2, write write2, double d2, OffsetDateTime offsetDateTime, Integer num, List list, zzb zzb, int i) {
            this((i & 1) != 0 ? zzjx.zza.zzb.GENERAL.name() : str, d, str2, write2, d2, offsetDateTime, num, (String) null, (FusedLocationProviderClient) null, list, zzb);
        }

        /* renamed from: o.zzcz$zzg$write */
        public static final class write {
            public final Double IconCompatParcelizer;
            public final String MediaBrowserCompat$CustomActionResultReceiver;
            public final String MediaBrowserCompat$ItemReceiver;
            public final String MediaBrowserCompat$SearchResultReceiver;
            public final Double read;
            public final Double write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof write)) {
                    return false;
                }
                write write2 = (write) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) write2.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) write2.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) write2.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) write2.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) write2.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) write2.IconCompatParcelizer);
            }

            public final int hashCode() {
                Double d = this.write;
                int i = 0;
                int hashCode = d != null ? d.hashCode() : 0;
                String str = this.MediaBrowserCompat$ItemReceiver;
                int hashCode2 = str != null ? str.hashCode() : 0;
                String str2 = this.MediaBrowserCompat$SearchResultReceiver;
                int hashCode3 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
                int hashCode4 = str3 != null ? str3.hashCode() : 0;
                Double d2 = this.read;
                int hashCode5 = d2 != null ? d2.hashCode() : 0;
                Double d3 = this.IconCompatParcelizer;
                if (d3 != null) {
                    i = d3.hashCode();
                }
                return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Installment(amount=");
                sb.append(this.write);
                sb.append(", frequency=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", unit=");
                sb.append(this.MediaBrowserCompat$SearchResultReceiver);
                sb.append(", perUnit=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", minAmount=");
                sb.append(this.read);
                sb.append(", maxAmount=");
                sb.append(this.IconCompatParcelizer);
                sb.append(")");
                return sb.toString();
            }

            public write(Double d, String str, String str2, String str3, Double d2, Double d3) {
                onGetStartedClick.write((Object) str2, "unit");
                onGetStartedClick.write((Object) str3, "perUnit");
                this.write = d;
                this.MediaBrowserCompat$ItemReceiver = str;
                this.MediaBrowserCompat$SearchResultReceiver = str2;
                this.MediaBrowserCompat$CustomActionResultReceiver = str3;
                this.read = d2;
                this.IconCompatParcelizer = d3;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ write(Double d, String str, String str2, String str3, int i) {
                this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : str, str2, str3, (Double) null, (Double) null);
            }
        }
    }

    /* renamed from: o.zzcz$zze */
    public final class zze {
        public final String IconCompatParcelizer;
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zze)) {
                return false;
            }
            zze zze = (zze) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zze.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zze.IconCompatParcelizer);
        }

        public final int hashCode() {
            String str = this.write;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlBusinessIndustry(isicCode=");
            sb.append(this.write);
            sb.append(", isicDesc=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public zze(String str, String str2) {
            this.write = str;
            this.IconCompatParcelizer = str2;
        }

        /* renamed from: o.zzcz$zze$zza */
        public final class zza {
            public final boolean MediaBrowserCompat$CustomActionResultReceiver;
            public final String write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zza)) {
                    return false;
                }
                zza zza = (zza) obj;
                return this.MediaBrowserCompat$CustomActionResultReceiver == zza.MediaBrowserCompat$CustomActionResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write);
            }

            public final int hashCode() {
                boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (z) {
                    z = true;
                }
                String str = this.write;
                return ((z ? 1 : 0) * true) + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("HmlBusinessInfoEnableField(enablingFlag=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", value=");
                sb.append(this.write);
                sb.append(")");
                return sb.toString();
            }

            public zza(boolean z, String str) {
                this.MediaBrowserCompat$CustomActionResultReceiver = z;
                this.write = str;
            }
        }
    }
}

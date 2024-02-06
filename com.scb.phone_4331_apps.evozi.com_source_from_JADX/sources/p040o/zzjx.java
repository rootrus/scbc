package p040o;

import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.zzct;
import p040o.zziu;

/* renamed from: o.zzjx */
public final /* synthetic */ class zzjx implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zzjx MediaBrowserCompat$ItemReceiver = new zzjx();

    /* renamed from: o.zzjx$zza */
    public final class zza {
        public final Boolean IconCompatParcelizer;
        public final Boolean read;

        /* renamed from: o.zzjx$zza$zzb */
        public enum zzb {
            GENERAL,
            TRAVEL
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza = (zza) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer);
        }

        public final int hashCode() {
            Boolean bool = this.read;
            int i = 0;
            int hashCode = bool != null ? bool.hashCode() : 0;
            Boolean bool2 = this.IconCompatParcelizer;
            if (bool2 != null) {
                i = bool2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlLoanPurpose(businessExpansion=");
            sb.append(this.read);
            sb.append(", workingCapital=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: o.zzjx$zza$zza  reason: collision with other inner class name */
        public final class C10770zza {
            public final boolean MediaBrowserCompat$CustomActionResultReceiver;
            public final boolean MediaBrowserCompat$ItemReceiver;
            public final boolean read;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10770zza)) {
                    return false;
                }
                C10770zza zza = (C10770zza) obj;
                return this.MediaBrowserCompat$ItemReceiver == zza.MediaBrowserCompat$ItemReceiver && this.MediaBrowserCompat$CustomActionResultReceiver == zza.MediaBrowserCompat$CustomActionResultReceiver && this.read == zza.read;
            }

            public final int hashCode() {
                boolean z = this.MediaBrowserCompat$ItemReceiver;
                boolean z2 = true;
                if (z) {
                    z = true;
                }
                boolean z3 = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (z3) {
                    z3 = true;
                }
                boolean z4 = this.read;
                if (!z4) {
                    z2 = z4;
                }
                return ((((z ? 1 : 0) * true) + (z3 ? 1 : 0)) * 31) + (z2 ? 1 : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("HmlNavigationFlags(skipDocumentUploadFlag=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", skipSelectMOAScreen=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", requireIssuerFlag=");
                sb.append(this.read);
                sb.append(")");
                return sb.toString();
            }

            public C10770zza(boolean z, boolean z2, boolean z3) {
                this.MediaBrowserCompat$ItemReceiver = z;
                this.MediaBrowserCompat$CustomActionResultReceiver = z2;
                this.read = z3;
            }
        }

        public zza(Boolean bool, Boolean bool2) {
            this.read = bool;
            this.IconCompatParcelizer = bool2;
        }
    }

    /* renamed from: o.zzjx$zze */
    public final class zze {
        public final String IconCompatParcelizer;
        public final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final removeActivityUpdates MediaBrowserCompat$MediaItem;
        public final String MediaDescriptionCompat;
        public final zza MediaMetadataCompat;
        public final removeActivityUpdates read;
        public final OffsetDateTime write;

        /* renamed from: o.zzjx$zze$IconCompatParcelizer */
        public enum IconCompatParcelizer {
            SUCCESS,
            PROGRESS,
            PROGRESS_OFF_HOUR
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zze)) {
                return false;
            }
            zze zze = (zze) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zze.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zze.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) zze.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zze.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) zze.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zze.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) zze.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zze.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            OffsetDateTime offsetDateTime = this.write;
            int hashCode2 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
            String str2 = this.MediaDescriptionCompat;
            int hashCode3 = str2 != null ? str2.hashCode() : 0;
            IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode4 = iconCompatParcelizer != null ? iconCompatParcelizer.hashCode() : 0;
            zza zza2 = this.MediaMetadataCompat;
            int hashCode5 = zza2 != null ? zza2.hashCode() : 0;
            removeActivityUpdates removeactivityupdates = this.read;
            int hashCode6 = removeactivityupdates != null ? removeactivityupdates.hashCode() : 0;
            removeActivityUpdates removeactivityupdates2 = this.MediaBrowserCompat$MediaItem;
            int hashCode7 = removeactivityupdates2 != null ? removeactivityupdates2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlSetupResult(applicationUuid=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", confirmDateTime=");
            sb.append(this.write);
            sb.append(", refId=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", confirmationStatus=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", selectedProduct=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", receivingAccount=");
            sb.append(this.read);
            sb.append(", repaymentAccount=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", email=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: o.zzjx$zze$zzb */
        public final class zzb {
            public final String MediaBrowserCompat$ItemReceiver;
            public final List<zzc> write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zzb)) {
                    return false;
                }
                zzb zzb = (zzb) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzb.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzb.write);
            }

            public final int hashCode() {
                String str = this.MediaBrowserCompat$ItemReceiver;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                List<zzc> list = this.write;
                if (list != null) {
                    i = list.hashCode();
                }
                return (hashCode * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("HmlRepayment(defaultOption=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", options=");
                sb.append(this.write);
                sb.append(")");
                return sb.toString();
            }

            public zzb(String str, List<zzc> list) {
                onGetStartedClick.write((Object) str, "defaultOption");
                onGetStartedClick.write((Object) list, "options");
                this.MediaBrowserCompat$ItemReceiver = str;
                this.write = list;
            }
        }

        /* renamed from: o.zzjx$zze$zzc */
        public final class zzc {
            public final String IconCompatParcelizer;
            public final List<String> MediaBrowserCompat$ItemReceiver;
            public final String read;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zzc)) {
                    return false;
                }
                zzc zzc = (zzc) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzc.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzc.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzc.MediaBrowserCompat$ItemReceiver);
            }

            public final int hashCode() {
                String str = this.read;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.IconCompatParcelizer;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                List<String> list = this.MediaBrowserCompat$ItemReceiver;
                if (list != null) {
                    i = list.hashCode();
                }
                return (((hashCode * 31) + hashCode2) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("HmlSetupAccount(accountNo=");
                sb.append(this.read);
                sb.append(", accountName=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", ruleName=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(")");
                return sb.toString();
            }

            public zzc(String str, String str2, List<String> list) {
                onGetStartedClick.write((Object) str, "accountNo");
                onGetStartedClick.write((Object) str2, "accountName");
                onGetStartedClick.write((Object) list, "ruleName");
                this.read = str;
                this.IconCompatParcelizer = str2;
                this.MediaBrowserCompat$ItemReceiver = list;
            }
        }

        /* renamed from: o.zzjx$zze$zza */
        public final class zza {
            public final IconCompatParcelizer IconCompatParcelizer;
            public final int MediaBrowserCompat$CustomActionResultReceiver;
            public final String MediaBrowserCompat$ItemReceiver;
            public final String MediaBrowserCompat$MediaItem;
            public final zzjx$zze$zza$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$SearchResultReceiver;

            /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
            public final OffsetDateTime f2997x50fd9e4a;
            public final String MediaDescriptionCompat;
            public final String MediaMetadataCompat;
            public final write MediaSessionCompat$ResultReceiverWrapper;
            public final List<ActivityTransitionRequest> MediaSessionCompat$Token;
            public final String ParcelableVolumeInfo;
            public final String RatingCompat;
            public final IconCompatParcelizer read;
            public final zzct.zza write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zza)) {
                    return false;
                }
                zza zza = (zza) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) zza.MediaBrowserCompat$MediaItem) && this.MediaBrowserCompat$CustomActionResultReceiver == zza.MediaBrowserCompat$CustomActionResultReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) zza.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) zza.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) zza.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) zza.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) zza.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2997x50fd9e4a, (Object) zza.f2997x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) zza.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) zza.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write);
            }

            public final int hashCode() {
                String str = this.MediaBrowserCompat$MediaItem;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                String str2 = this.MediaDescriptionCompat;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                zzjx$zze$zza$MediaBrowserCompat$CustomActionResultReceiver zzjx_zze_zza_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$SearchResultReceiver;
                int hashCode3 = zzjx_zze_zza_mediabrowsercompat_customactionresultreceiver != null ? zzjx_zze_zza_mediabrowsercompat_customactionresultreceiver.hashCode() : 0;
                write write2 = this.MediaSessionCompat$ResultReceiverWrapper;
                int hashCode4 = write2 != null ? write2.hashCode() : 0;
                IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
                int hashCode5 = iconCompatParcelizer != null ? iconCompatParcelizer.hashCode() : 0;
                IconCompatParcelizer iconCompatParcelizer2 = this.read;
                int hashCode6 = iconCompatParcelizer2 != null ? iconCompatParcelizer2.hashCode() : 0;
                String str3 = this.ParcelableVolumeInfo;
                int hashCode7 = str3 != null ? str3.hashCode() : 0;
                String str4 = this.RatingCompat;
                int hashCode8 = str4 != null ? str4.hashCode() : 0;
                OffsetDateTime offsetDateTime = this.f2997x50fd9e4a;
                int hashCode9 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
                String str5 = this.MediaMetadataCompat;
                int hashCode10 = str5 != null ? str5.hashCode() : 0;
                String str6 = this.MediaBrowserCompat$ItemReceiver;
                int hashCode11 = str6 != null ? str6.hashCode() : 0;
                List<ActivityTransitionRequest> list = this.MediaSessionCompat$Token;
                int hashCode12 = list != null ? list.hashCode() : 0;
                zzct.zza zza = this.write;
                if (zza != null) {
                    i = zza.hashCode();
                }
                return (((((((((((((((((((((((((hashCode * 31) + i2) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("HmlSetup(principal=");
                sb.append(this.MediaBrowserCompat$MediaItem);
                sb.append(", duration=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", installmentAmount=");
                sb.append(this.MediaDescriptionCompat);
                sb.append(", installment=");
                sb.append(this.MediaBrowserCompat$SearchResultReceiver);
                sb.append(", repaymentDate=");
                sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
                sb.append(", dutyStampFee=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", frontEndFee=");
                sb.append(this.read);
                sb.append(", transferFee=");
                sb.append(this.ParcelableVolumeInfo);
                sb.append(", netTransferAmount=");
                sb.append(this.RatingCompat);
                sb.append(", repaymentStartDate=");
                sb.append(this.f2997x50fd9e4a);
                sb.append(", productType=");
                sb.append(this.MediaMetadataCompat);
                sb.append(", email=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", promotion=");
                sb.append(this.MediaSessionCompat$Token);
                sb.append(", customerType=");
                sb.append(this.write);
                sb.append(")");
                return sb.toString();
            }

            public zza(String str, int i, String str2, zzjx$zze$zza$MediaBrowserCompat$CustomActionResultReceiver zzjx_zze_zza_mediabrowsercompat_customactionresultreceiver, write write2, IconCompatParcelizer iconCompatParcelizer, IconCompatParcelizer iconCompatParcelizer2, String str3, String str4, OffsetDateTime offsetDateTime, String str5, String str6, List<ActivityTransitionRequest> list, zzct.zza zza) {
                onGetStartedClick.write((Object) str, "principal");
                onGetStartedClick.write((Object) str2, "installmentAmount");
                onGetStartedClick.write((Object) zzjx_zze_zza_mediabrowsercompat_customactionresultreceiver, "installment");
                onGetStartedClick.write((Object) write2, "repaymentDate");
                onGetStartedClick.write((Object) iconCompatParcelizer, "dutyStampFee");
                onGetStartedClick.write((Object) str3, "transferFee");
                onGetStartedClick.write((Object) str4, "netTransferAmount");
                onGetStartedClick.write((Object) offsetDateTime, "repaymentStartDate");
                onGetStartedClick.write((Object) str5, "productType");
                onGetStartedClick.write((Object) list, "promotion");
                onGetStartedClick.write((Object) zza, "customerType");
                this.MediaBrowserCompat$MediaItem = str;
                this.MediaBrowserCompat$CustomActionResultReceiver = i;
                this.MediaDescriptionCompat = str2;
                this.MediaBrowserCompat$SearchResultReceiver = zzjx_zze_zza_mediabrowsercompat_customactionresultreceiver;
                this.MediaSessionCompat$ResultReceiverWrapper = write2;
                this.IconCompatParcelizer = iconCompatParcelizer;
                this.read = iconCompatParcelizer2;
                this.ParcelableVolumeInfo = str3;
                this.RatingCompat = str4;
                this.f2997x50fd9e4a = offsetDateTime;
                this.MediaMetadataCompat = str5;
                this.MediaBrowserCompat$ItemReceiver = str6;
                this.MediaSessionCompat$Token = list;
                this.write = zza;
            }

            /* renamed from: o.zzjx$zze$zza$IconCompatParcelizer */
            public static final class IconCompatParcelizer {
                public final double MediaBrowserCompat$ItemReceiver;
                public final String write;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof IconCompatParcelizer)) {
                        return false;
                    }
                    IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
                    return Double.compare(this.MediaBrowserCompat$ItemReceiver, iconCompatParcelizer.MediaBrowserCompat$ItemReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) iconCompatParcelizer.write);
                }

                public final int hashCode() {
                    long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$ItemReceiver);
                    int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    String str = this.write;
                    return (i * 31) + (str != null ? str.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DutyStampFee(rate=");
                    sb.append(this.MediaBrowserCompat$ItemReceiver);
                    sb.append(", amount=");
                    sb.append(this.write);
                    sb.append(")");
                    return sb.toString();
                }

                public IconCompatParcelizer(double d, String str) {
                    onGetStartedClick.write((Object) str, "amount");
                    this.MediaBrowserCompat$ItemReceiver = d;
                    this.write = str;
                }
            }

            /* renamed from: o.zzjx$zze$zza$write */
            public static final class write {
                public final String MediaBrowserCompat$CustomActionResultReceiver;
                private final int read;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof write)) {
                        return false;
                    }
                    write write = (write) obj;
                    return this.read == write.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) write.MediaBrowserCompat$CustomActionResultReceiver);
                }

                public final int hashCode() {
                    int i = this.read;
                    String str = this.MediaBrowserCompat$CustomActionResultReceiver;
                    return (i * 31) + (str != null ? str.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("RepaymentDate(code=");
                    sb.append(this.read);
                    sb.append(", description=");
                    sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                    sb.append(")");
                    return sb.toString();
                }

                public write(int i, String str) {
                    onGetStartedClick.write((Object) str, "description");
                    this.read = i;
                    this.MediaBrowserCompat$CustomActionResultReceiver = str;
                }
            }
        }

        public zze(String str, OffsetDateTime offsetDateTime, String str2, IconCompatParcelizer iconCompatParcelizer, zza zza2, removeActivityUpdates removeactivityupdates, removeActivityUpdates removeactivityupdates2, String str3) {
            onGetStartedClick.write((Object) offsetDateTime, "confirmDateTime");
            onGetStartedClick.write((Object) iconCompatParcelizer, "confirmationStatus");
            onGetStartedClick.write((Object) zza2, "selectedProduct");
            onGetStartedClick.write((Object) str3, Scopes.EMAIL);
            this.IconCompatParcelizer = str;
            this.write = offsetDateTime;
            this.MediaDescriptionCompat = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
            this.MediaMetadataCompat = zza2;
            this.read = removeactivityupdates;
            this.MediaBrowserCompat$MediaItem = removeactivityupdates2;
            this.MediaBrowserCompat$ItemReceiver = str3;
        }
    }

    private /* synthetic */ zzjx() {
    }

    public final Object write(Object obj) {
        return (getOuterRadius) ((SingleDataEntity) obj).getData();
    }

    /* renamed from: o.zzjx$zzb */
    public final class zzb {
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final zza MediaBrowserCompat$ItemReceiver;

        /* renamed from: o.zzjx$zzb$zza */
        public enum zza {
            GET_CODE,
            ENTER_CODE,
            VERIFIED
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzb)) {
                return false;
            }
            zzb zzb = (zzb) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzb.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzb.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            zza zza2 = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = zza2 != null ? zza2.hashCode() : 0;
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str != null) {
                i = str.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlPromptPayVerification(verificationStage=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", mobileNo=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public zzb(zza zza2, String str) {
            onGetStartedClick.write((Object) zza2, "verificationStage");
            onGetStartedClick.write((Object) str, "mobileNo");
            this.MediaBrowserCompat$ItemReceiver = zza2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }
    }

    /* renamed from: o.zzjx$zzd */
    public final class zzd {
        public final int IconCompatParcelizer;
        public final int MediaBrowserCompat$ItemReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzd)) {
                return false;
            }
            zzd zzd = (zzd) obj;
            return this.IconCompatParcelizer == zzd.IconCompatParcelizer && this.MediaBrowserCompat$ItemReceiver == zzd.MediaBrowserCompat$ItemReceiver;
        }

        public final int hashCode() {
            return (this.IconCompatParcelizer * 31) + this.MediaBrowserCompat$ItemReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlOperatingAccountDetails(minAmount=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", maxAmount=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: o.zzjx$zzd$zza */
        public final class zza {
            public final String IconCompatParcelizer;
            public final double MediaBrowserCompat$CustomActionResultReceiver;
            public final String MediaBrowserCompat$ItemReceiver;
            public final FusedLocationProviderClient MediaBrowserCompat$MediaItem;
            public final double MediaBrowserCompat$SearchResultReceiver;
            public final String MediaDescriptionCompat;
            public final double RatingCompat;
            public final List<zziu.zzb> read;
            public final boolean write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zza)) {
                    return false;
                }
                zza zza = (zza) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) zza.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver) && this.write == zza.write && Double.compare(this.MediaBrowserCompat$SearchResultReceiver, zza.MediaBrowserCompat$SearchResultReceiver) == 0 && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, zza.MediaBrowserCompat$CustomActionResultReceiver) == 0 && Double.compare(this.RatingCompat, zza.RatingCompat) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) zza.MediaBrowserCompat$MediaItem);
            }

            public final int hashCode() {
                String str = this.IconCompatParcelizer;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.MediaDescriptionCompat;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.MediaBrowserCompat$ItemReceiver;
                int hashCode3 = str3 != null ? str3.hashCode() : 0;
                boolean z = this.write;
                if (z) {
                    z = true;
                }
                long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$SearchResultReceiver);
                int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                long doubleToLongBits2 = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
                int i3 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
                long doubleToLongBits3 = Double.doubleToLongBits(this.RatingCompat);
                int i4 = (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
                List<zziu.zzb> list = this.read;
                int hashCode4 = list != null ? list.hashCode() : 0;
                FusedLocationProviderClient fusedLocationProviderClient = this.MediaBrowserCompat$MediaItem;
                if (fusedLocationProviderClient != null) {
                    i = fusedLocationProviderClient.hashCode();
                }
                return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (z ? 1 : 0)) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode4) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("HmlSimulator(imageUrl=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", title=");
                sb.append(this.MediaDescriptionCompat);
                sb.append(", description=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", gracePeriodHideFlag=");
                sb.append(this.write);
                sb.append(", minimumPrincipal=");
                sb.append(this.MediaBrowserCompat$SearchResultReceiver);
                sb.append(", maximumPrincipal=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", principalStepSize=");
                sb.append(this.RatingCompat);
                sb.append(", installmentFrequency=");
                sb.append(this.read);
                sb.append(", productCatalogue=");
                sb.append(this.MediaBrowserCompat$MediaItem);
                sb.append(")");
                return sb.toString();
            }

            public zza(String str, String str2, String str3, boolean z, double d, double d2, double d3, List<zziu.zzb> list, FusedLocationProviderClient fusedLocationProviderClient) {
                onGetStartedClick.write((Object) list, "installmentFrequency");
                onGetStartedClick.write((Object) fusedLocationProviderClient, "productCatalogue");
                this.IconCompatParcelizer = str;
                this.MediaDescriptionCompat = str2;
                this.MediaBrowserCompat$ItemReceiver = str3;
                this.write = z;
                this.MediaBrowserCompat$SearchResultReceiver = d;
                this.MediaBrowserCompat$CustomActionResultReceiver = d2;
                this.RatingCompat = d3;
                this.read = list;
                this.MediaBrowserCompat$MediaItem = fusedLocationProviderClient;
            }
        }

        public zzd(int i, int i2) {
            this.IconCompatParcelizer = i;
            this.MediaBrowserCompat$ItemReceiver = i2;
        }
    }

    /* renamed from: o.zzjx$zzc */
    public final class zzc {
        @SerializedName("code")
        public final String IconCompatParcelizer;
        @SerializedName("description")
        public final String MediaBrowserCompat$ItemReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzc)) {
                return false;
            }
            zzc zzc = (zzc) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzc.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzc.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlOptions(code=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", description=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public zzc(String str, String str2) {
            this.IconCompatParcelizer = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
        }
    }
}

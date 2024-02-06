package p040o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import com.scb.phone.view.activity.prepaid.C8902x24e4e8fb;
import java.util.List;
import p040o.GoogleApi;
import p040o.zzev;

/* renamed from: o.zzcb */
public final /* synthetic */ class zzcb implements DirectDebitDeepLinkActivity {

    /* renamed from: o.zzcb$zza */
    public final class zza {
        public final int IconCompatParcelizer;
        public final List<C10764zza> MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        private final String MediaDescriptionCompat;
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
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read) && this.IconCompatParcelizer == zza.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zza.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) zza.MediaDescriptionCompat);
        }

        public final int hashCode() {
            String str = this.write;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.read;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            int i2 = this.IconCompatParcelizer;
            List<C10764zza> list = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode3 = list != null ? list.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode4 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaDescriptionCompat;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return (((((((((hashCode * 31) + hashCode2) * 31) + i2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EasycashBusinessAndMaritalInfoSectionInfo(key=");
            sb.append(this.write);
            sb.append(", label=");
            sb.append(this.read);
            sb.append(", sequence=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", value=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", placeHolder=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", remark=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: o.zzcb$zza$zza  reason: collision with other inner class name */
        public final class C10764zza {
            public final boolean IconCompatParcelizer;
            public final List<String> MediaBrowserCompat$CustomActionResultReceiver;
            public final List<String> MediaBrowserCompat$ItemReceiver;
            public final int read;
            private final List<String> write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10764zza)) {
                    return false;
                }
                C10764zza zza = (C10764zza) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zza.MediaBrowserCompat$CustomActionResultReceiver) && this.IconCompatParcelizer == zza.IconCompatParcelizer && this.read == zza.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write);
            }

            public final int hashCode() {
                List<String> list = this.MediaBrowserCompat$ItemReceiver;
                int i = 0;
                int hashCode = list != null ? list.hashCode() : 0;
                List<String> list2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                int hashCode2 = list2 != null ? list2.hashCode() : 0;
                boolean z = this.IconCompatParcelizer;
                if (z) {
                    z = true;
                }
                int i2 = this.read;
                List<String> list3 = this.write;
                if (list3 != null) {
                    i = list3.hashCode();
                }
                return (((((((hashCode * 31) + hashCode2) * 31) + (z ? 1 : 0)) * 31) + i2) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("EasycashBusinessAndMaritalInfoValue(rawValue=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", displayValue=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", selectedOption=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", sequence=");
                sb.append(this.read);
                sb.append(", key=");
                sb.append(this.write);
                sb.append(")");
                return sb.toString();
            }

            public C10764zza(List<String> list, List<String> list2, boolean z, int i, List<String> list3) {
                onGetStartedClick.write((Object) list, "rawValue");
                onGetStartedClick.write((Object) list2, "displayValue");
                this.MediaBrowserCompat$ItemReceiver = list;
                this.MediaBrowserCompat$CustomActionResultReceiver = list2;
                this.IconCompatParcelizer = z;
                this.read = i;
                this.write = list3;
            }
        }

        public zza(String str, String str2, int i, List<C10764zza> list, String str3, String str4) {
            onGetStartedClick.write((Object) str, "key");
            onGetStartedClick.write((Object) str2, "label");
            onGetStartedClick.write((Object) list, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.write = str;
            this.read = str2;
            this.IconCompatParcelizer = i;
            this.MediaBrowserCompat$CustomActionResultReceiver = list;
            this.MediaBrowserCompat$ItemReceiver = str3;
            this.MediaDescriptionCompat = str4;
        }
    }

    /* renamed from: o.zzcb$zzb */
    public final class zzb {
        private final String IconCompatParcelizer;
        public final List<zza> MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final int read;
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzb)) {
                return false;
            }
            zzb zzb = (zzb) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzb.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzb.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzb.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzb.MediaBrowserCompat$CustomActionResultReceiver) && this.read == zzb.read;
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.write;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.IconCompatParcelizer;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            List<zza> list = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (list != null) {
                i = list.hashCode();
            }
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i) * 31) + this.read;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EasycashBusinessAndMaritalInfoComponent(key=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", label=");
            sb.append(this.write);
            sb.append(", remark=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", sectionInfo=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", sequence=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: o.zzcb$zzb$zza */
        public final class zza {
            public final String IconCompatParcelizer;
            public final String MediaBrowserCompat$CustomActionResultReceiver;
            public final String MediaBrowserCompat$ItemReceiver;
            public final String MediaDescriptionCompat;
            public final String MediaMetadataCompat;
            public final String RatingCompat;
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
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zza.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) zza.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) zza.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) zza.MediaDescriptionCompat);
            }

            public final int hashCode() {
                String str = this.MediaBrowserCompat$ItemReceiver;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.MediaMetadataCompat;
                int hashCode3 = str3 != null ? str3.hashCode() : 0;
                String str4 = this.RatingCompat;
                int hashCode4 = str4 != null ? str4.hashCode() : 0;
                String str5 = this.IconCompatParcelizer;
                int hashCode5 = str5 != null ? str5.hashCode() : 0;
                String str6 = this.read;
                int hashCode6 = str6 != null ? str6.hashCode() : 0;
                String str7 = this.write;
                int hashCode7 = str7 != null ? str7.hashCode() : 0;
                String str8 = this.MediaDescriptionCompat;
                if (str8 != null) {
                    i = str8.hashCode();
                }
                return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("CarCollateral(collateralCarBrand=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", collateralCarModel=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", collateralYearOfCarManufacture=");
                sb.append(this.MediaMetadataCompat);
                sb.append(", collateralCarSubModel=");
                sb.append(this.RatingCompat);
                sb.append(", collateralCarRegistrationNumber=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", collateralCarRegistrationProvinceTH=");
                sb.append(this.read);
                sb.append(", collateralCarRegistrationProvinceEN=");
                sb.append(this.write);
                sb.append(", collateralYearOfCarRegistration=");
                sb.append(this.MediaDescriptionCompat);
                sb.append(")");
                return sb.toString();
            }

            public zza(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
                onGetStartedClick.write((Object) str, "collateralCarBrand");
                onGetStartedClick.write((Object) str2, "collateralCarModel");
                onGetStartedClick.write((Object) str3, "collateralYearOfCarManufacture");
                onGetStartedClick.write((Object) str4, "collateralCarSubModel");
                onGetStartedClick.write((Object) str5, "collateralCarRegistrationNumber");
                onGetStartedClick.write((Object) str6, "collateralCarRegistrationProvinceTH");
                onGetStartedClick.write((Object) str7, "collateralCarRegistrationProvinceEN");
                onGetStartedClick.write((Object) str8, "collateralYearOfCarRegistration");
                this.MediaBrowserCompat$ItemReceiver = str;
                this.MediaBrowserCompat$CustomActionResultReceiver = str2;
                this.MediaMetadataCompat = str3;
                this.RatingCompat = str4;
                this.IconCompatParcelizer = str5;
                this.read = str6;
                this.write = str7;
                this.MediaDescriptionCompat = str8;
            }
        }

        public zzb(String str, String str2, String str3, List<zza> list, int i) {
            onGetStartedClick.write((Object) str, "key");
            onGetStartedClick.write((Object) str2, "label");
            onGetStartedClick.write((Object) list, "sectionInfo");
            this.MediaBrowserCompat$ItemReceiver = str;
            this.write = str2;
            this.IconCompatParcelizer = str3;
            this.MediaBrowserCompat$CustomActionResultReceiver = list;
            this.read = i;
        }
    }

    /* renamed from: o.zzcb$zzc */
    public final class zzc {
        public final zzb.zza IconCompatParcelizer;
        public final List<zzd> write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzc)) {
                return false;
            }
            zzc zzc = (zzc) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzc.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzc.write);
        }

        public final int hashCode() {
            zzb.zza zza2 = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = zza2 != null ? zza2.hashCode() : 0;
            List<zzd> list = this.write;
            if (list != null) {
                i = list.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CarCollateralPrefill(prefill=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", province=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: o.zzcb$zzc$zza */
        public final class zza {
            public final String IconCompatParcelizer;
            public final String MediaBrowserCompat$CustomActionResultReceiver;
            public final String MediaBrowserCompat$ItemReceiver;
            public final String MediaBrowserCompat$MediaItem;
            public final String MediaBrowserCompat$SearchResultReceiver;

            /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
            public final String f2985x50fd9e4a;
            public final String MediaDescriptionCompat;
            public final String MediaMetadataCompat;
            public final String MediaSessionCompat$ResultReceiverWrapper;
            public final String RatingCompat;
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
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2985x50fd9e4a, (Object) zza.f2985x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) zza.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) zza.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) zza.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) zza.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) zza.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zza.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) zza.MediaBrowserCompat$SearchResultReceiver);
            }

            public final int hashCode() {
                String str = this.f2985x50fd9e4a;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.RatingCompat;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.MediaBrowserCompat$ItemReceiver;
                int hashCode3 = str3 != null ? str3.hashCode() : 0;
                String str4 = this.MediaBrowserCompat$MediaItem;
                int hashCode4 = str4 != null ? str4.hashCode() : 0;
                String str5 = this.read;
                int hashCode5 = str5 != null ? str5.hashCode() : 0;
                String str6 = this.write;
                int hashCode6 = str6 != null ? str6.hashCode() : 0;
                String str7 = this.MediaMetadataCompat;
                int hashCode7 = str7 != null ? str7.hashCode() : 0;
                String str8 = this.IconCompatParcelizer;
                int hashCode8 = str8 != null ? str8.hashCode() : 0;
                String str9 = this.MediaDescriptionCompat;
                int hashCode9 = str9 != null ? str9.hashCode() : 0;
                String str10 = this.MediaSessionCompat$ResultReceiverWrapper;
                int hashCode10 = str10 != null ? str10.hashCode() : 0;
                String str11 = this.MediaBrowserCompat$CustomActionResultReceiver;
                int hashCode11 = str11 != null ? str11.hashCode() : 0;
                String str12 = this.MediaBrowserCompat$SearchResultReceiver;
                if (str12 != null) {
                    i = str12.hashCode();
                }
                return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("CreditPowerProduct(sortSequence=");
                sb.append(this.f2985x50fd9e4a);
                sb.append(", productType=");
                sb.append(this.RatingCompat);
                sb.append(", enable=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", minimumCreditLimit=");
                sb.append(this.MediaBrowserCompat$MediaItem);
                sb.append(", maximumCreditLimit=");
                sb.append(this.read);
                sb.append(", loanAmount=");
                sb.append(this.write);
                sb.append(", sliderInterval=");
                sb.append(this.MediaMetadataCompat);
                sb.append(", interestRate=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", monthlyPayment=");
                sb.append(this.MediaDescriptionCompat);
                sb.append(", tenor=");
                sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
                sb.append(", logo=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", productName=");
                sb.append(this.MediaBrowserCompat$SearchResultReceiver);
                sb.append(")");
                return sb.toString();
            }

            public zza(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
                onGetStartedClick.write((Object) str, "sortSequence");
                onGetStartedClick.write((Object) str2, "productType");
                onGetStartedClick.write((Object) str3, "enable");
                onGetStartedClick.write((Object) str4, "minimumCreditLimit");
                onGetStartedClick.write((Object) str5, "maximumCreditLimit");
                onGetStartedClick.write((Object) str6, "loanAmount");
                onGetStartedClick.write((Object) str7, "sliderInterval");
                onGetStartedClick.write((Object) str8, "interestRate");
                onGetStartedClick.write((Object) str9, "monthlyPayment");
                onGetStartedClick.write((Object) str11, "logo");
                onGetStartedClick.write((Object) str12, "productName");
                this.f2985x50fd9e4a = str;
                this.RatingCompat = str2;
                this.MediaBrowserCompat$ItemReceiver = str3;
                this.MediaBrowserCompat$MediaItem = str4;
                this.read = str5;
                this.write = str6;
                this.MediaMetadataCompat = str7;
                this.IconCompatParcelizer = str8;
                this.MediaDescriptionCompat = str9;
                this.MediaSessionCompat$ResultReceiverWrapper = str10;
                this.MediaBrowserCompat$CustomActionResultReceiver = str11;
                this.MediaBrowserCompat$SearchResultReceiver = str12;
            }
        }

        public zzc(zzb.zza zza2, List<zzd> list) {
            onGetStartedClick.write((Object) list, "province");
            this.IconCompatParcelizer = zza2;
            this.write = list;
        }
    }

    /* renamed from: o.zzcb$zzd */
    public final class zzd {
        public final String read;
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzd)) {
                return false;
            }
            zzd zzd = (zzd) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzd.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzd.read);
        }

        public final int hashCode() {
            String str = this.write;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.read;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Province(provinceNameTH=");
            sb.append(this.write);
            sb.append(", provinceNameEN=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: o.zzcb$zzd$zza */
        public final class zza {
            public final String IconCompatParcelizer;
            public final String MediaBrowserCompat$CustomActionResultReceiver;
            public final String MediaBrowserCompat$ItemReceiver;
            public final List<zzf> MediaBrowserCompat$MediaItem;
            public final String MediaDescriptionCompat;
            public final String MediaMetadataCompat;
            public final String RatingCompat;
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
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zza.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) zza.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) zza.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) zza.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) zza.MediaBrowserCompat$MediaItem);
            }

            public final int hashCode() {
                String str = this.MediaBrowserCompat$ItemReceiver;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.RatingCompat;
                int hashCode3 = str3 != null ? str3.hashCode() : 0;
                String str4 = this.IconCompatParcelizer;
                int hashCode4 = str4 != null ? str4.hashCode() : 0;
                String str5 = this.MediaDescriptionCompat;
                int hashCode5 = str5 != null ? str5.hashCode() : 0;
                String str6 = this.write;
                int hashCode6 = str6 != null ? str6.hashCode() : 0;
                String str7 = this.read;
                int hashCode7 = str7 != null ? str7.hashCode() : 0;
                String str8 = this.MediaMetadataCompat;
                int hashCode8 = str8 != null ? str8.hashCode() : 0;
                List<zzf> list = this.MediaBrowserCompat$MediaItem;
                if (list != null) {
                    i = list.hashCode();
                }
                return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("CreditPowerLanding(minimumIncome=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", minimumAmount=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", state=");
                sb.append(this.RatingCompat);
                sb.append(", flowType=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", productGroup=");
                sb.append(this.MediaDescriptionCompat);
                sb.append(", ncbConsent=");
                sb.append(this.write);
                sb.append(", monthlyIncome=");
                sb.append(this.read);
                sb.append(", repaymentAbility=");
                sb.append(this.MediaMetadataCompat);
                sb.append(", tiles=");
                sb.append(this.MediaBrowserCompat$MediaItem);
                sb.append(")");
                return sb.toString();
            }

            public zza(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<zzf> list) {
                onGetStartedClick.write((Object) str, "minimumIncome");
                onGetStartedClick.write((Object) str2, "minimumAmount");
                onGetStartedClick.write((Object) str3, "state");
                onGetStartedClick.write((Object) str4, "flowType");
                onGetStartedClick.write((Object) str5, "productGroup");
                onGetStartedClick.write((Object) list, "tiles");
                this.MediaBrowserCompat$ItemReceiver = str;
                this.MediaBrowserCompat$CustomActionResultReceiver = str2;
                this.RatingCompat = str3;
                this.IconCompatParcelizer = str4;
                this.MediaDescriptionCompat = str5;
                this.write = str6;
                this.read = str7;
                this.MediaMetadataCompat = str8;
                this.MediaBrowserCompat$MediaItem = list;
            }
        }

        public zzd(String str, String str2) {
            onGetStartedClick.write((Object) str, "provinceNameTH");
            onGetStartedClick.write((Object) str2, "provinceNameEN");
            this.write = str;
            this.read = str2;
        }
    }

    /* renamed from: o.zzcb$zzf */
    public final class zzf {
        public final Boolean IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$MediaItem;
        public final String MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public final Integer f2986x50fd9e4a;
        public final String MediaDescriptionCompat;
        public final Boolean MediaMetadataCompat;
        public final String MediaSessionCompat$Token;
        private final Boolean ParcelableVolumeInfo;
        public final String RatingCompat;
        public final List<setDataCollectionEnabled> read;
        public final Boolean write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzf)) {
                return false;
            }
            zzf zzf = (zzf) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2986x50fd9e4a, (Object) zzf.f2986x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) zzf.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) zzf.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzf.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) zzf.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) zzf.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzf.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) zzf.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) zzf.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzf.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzf.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzf.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) zzf.MediaBrowserCompat$MediaItem);
        }

        public final int hashCode() {
            Integer num = this.f2986x50fd9e4a;
            int i = 0;
            int hashCode = num != null ? num.hashCode() : 0;
            String str = this.MediaDescriptionCompat;
            int hashCode2 = str != null ? str.hashCode() : 0;
            String str2 = this.MediaSessionCompat$Token;
            int hashCode3 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode4 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.RatingCompat;
            int hashCode5 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode6 = str5 != null ? str5.hashCode() : 0;
            Boolean bool = this.IconCompatParcelizer;
            int hashCode7 = bool != null ? bool.hashCode() : 0;
            Boolean bool2 = this.ParcelableVolumeInfo;
            int hashCode8 = bool2 != null ? bool2.hashCode() : 0;
            Boolean bool3 = this.MediaMetadataCompat;
            int hashCode9 = bool3 != null ? bool3.hashCode() : 0;
            String str6 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode10 = str6 != null ? str6.hashCode() : 0;
            List<setDataCollectionEnabled> list = this.read;
            int hashCode11 = list != null ? list.hashCode() : 0;
            Boolean bool4 = this.write;
            int hashCode12 = bool4 != null ? bool4.hashCode() : 0;
            String str7 = this.MediaBrowserCompat$MediaItem;
            if (str7 != null) {
                i = str7.hashCode();
            }
            return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CreditPowerTile(sortSequence=");
            sb.append(this.f2986x50fd9e4a);
            sb.append(", logo=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", productType=");
            sb.append(this.MediaSessionCompat$Token);
            sb.append(", flowType=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", productGroup=");
            sb.append(this.RatingCompat);
            sb.append(", name=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", enabled=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", isSelected=");
            sb.append(this.ParcelableVolumeInfo);
            sb.append(", isSecured=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", creditAmount=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", details=");
            sb.append(this.read);
            sb.append(", isReferral=");
            sb.append(this.write);
            sb.append(", minimumIncome=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: o.zzcb$zzf$zza */
        public final class zza {
            public final String IconCompatParcelizer;
            public final List<zzf> MediaBrowserCompat$CustomActionResultReceiver;
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
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zza.MediaBrowserCompat$CustomActionResultReceiver);
            }

            public final int hashCode() {
                String str = this.IconCompatParcelizer;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.write;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.MediaBrowserCompat$ItemReceiver;
                int hashCode3 = str3 != null ? str3.hashCode() : 0;
                List<zzf> list = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (list != null) {
                    i = list.hashCode();
                }
                return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("EasycashCreditPowerLoanRequestResult(ncbConsent=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", monthlyIncome=");
                sb.append(this.write);
                sb.append(", repaymentAbility=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", product=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(")");
                return sb.toString();
            }

            public zza(String str, String str2, String str3, List<zzf> list) {
                this.IconCompatParcelizer = str;
                this.write = str2;
                this.MediaBrowserCompat$ItemReceiver = str3;
                this.MediaBrowserCompat$CustomActionResultReceiver = list;
            }
        }

        public zzf(Integer num, String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, Boolean bool3, String str6, List<? extends setDataCollectionEnabled> list, Boolean bool4, String str7) {
            this.f2986x50fd9e4a = num;
            this.MediaDescriptionCompat = str;
            this.MediaSessionCompat$Token = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
            this.RatingCompat = str4;
            this.MediaBrowserCompat$SearchResultReceiver = str5;
            this.IconCompatParcelizer = bool;
            this.ParcelableVolumeInfo = bool2;
            this.MediaMetadataCompat = bool3;
            this.MediaBrowserCompat$ItemReceiver = str6;
            this.read = list;
            this.write = bool4;
            this.MediaBrowserCompat$MediaItem = str7;
        }
    }

    /* renamed from: o.zzcb$zzh */
    public enum zzh {
        RECEIVING_ACCOUNT_ACCOUNT_DEBIT,
        RECEIVING_ACCOUNT_ACCOUNT,
        REPAYMENT_ACCOUNT_DIRECT_CASH,
        REPAYMENT_ACCOUNT_DIRECT_DEBIT,
        REPAYMENT_PLAN_FULL_MIN,
        STATEMENT_PAPER_ESTATEMENT;

        /* renamed from: o.zzcb$zzh$zzb */
        public final class zzb {
            public final String IconCompatParcelizer;
            public final String MediaBrowserCompat$CustomActionResultReceiver;
            public final String MediaBrowserCompat$ItemReceiver;
            private final String MediaBrowserCompat$MediaItem;
            private final String MediaDescriptionCompat;
            public final String read;
            public final String write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zzb)) {
                    return false;
                }
                zzb zzb = (zzb) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzb.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzb.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzb.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) zzb.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) zzb.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzb.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzb.read);
            }

            public final int hashCode() {
                String str = this.MediaBrowserCompat$ItemReceiver;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.IconCompatParcelizer;
                int hashCode3 = str3 != null ? str3.hashCode() : 0;
                String str4 = this.MediaBrowserCompat$MediaItem;
                int hashCode4 = str4 != null ? str4.hashCode() : 0;
                String str5 = this.MediaDescriptionCompat;
                int hashCode5 = str5 != null ? str5.hashCode() : 0;
                String str6 = this.write;
                int hashCode6 = str6 != null ? str6.hashCode() : 0;
                String str7 = this.read;
                if (str7 != null) {
                    i = str7.hashCode();
                }
                return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("EasyFeatureReferenceAccount(accountNo=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", accountType=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", accountTypeDesc=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", accountSubType=");
                sb.append(this.MediaBrowserCompat$MediaItem);
                sb.append(", accountSubTypeDesc=");
                sb.append(this.MediaDescriptionCompat);
                sb.append(", nickname=");
                sb.append(this.write);
                sb.append(", accountName=");
                sb.append(this.read);
                sb.append(")");
                return sb.toString();
            }

            public zzb(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
                onGetStartedClick.write((Object) str, "accountNo");
                onGetStartedClick.write((Object) str2, "accountType");
                onGetStartedClick.write((Object) str3, "accountTypeDesc");
                onGetStartedClick.write((Object) str4, "accountSubType");
                onGetStartedClick.write((Object) str5, "accountSubTypeDesc");
                onGetStartedClick.write((Object) str6, "nickname");
                onGetStartedClick.write((Object) str7, "accountName");
                this.MediaBrowserCompat$ItemReceiver = str;
                this.MediaBrowserCompat$CustomActionResultReceiver = str2;
                this.IconCompatParcelizer = str3;
                this.MediaBrowserCompat$MediaItem = str4;
                this.MediaDescriptionCompat = str5;
                this.write = str6;
                this.read = str7;
            }
        }

        /* renamed from: o.zzcb$zzh$zza */
        public final class zza extends zzi {
            public final String read;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public zza(List<onSharedPreferenceChanged> list, String str, String str2, zzh zzh, List<String> list2) {
                super(list, str2, zzh, list2);
                onGetStartedClick.write((Object) list, "accounts");
                onGetStartedClick.write((Object) str, "debitCardHeader");
                onGetStartedClick.write((Object) str2, "header");
                onGetStartedClick.write((Object) zzh, "componentType");
                onGetStartedClick.write((Object) list2, "remarks");
                this.read = str;
            }
        }
    }

    /* renamed from: o.zzcb$zzi */
    public class zzi extends C6960x24be0e72 {
        public final List<onSharedPreferenceChanged> write;

        /* renamed from: o.zzcb$zzi$zza */
        public abstract class zza extends C6960x24be0e72 {
            public final List<zzev.zza> MediaBrowserCompat$ItemReceiver;

            public /* synthetic */ zza(List list, String str, zzh zzh, List list2, byte b) {
                this(list, str, zzh, list2);
            }

            private zza(List<zzev.zza> list, String str, zzh zzh, List<String> list2) {
                super(str, zzh, list2);
                this.MediaBrowserCompat$ItemReceiver = list;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public zzi(List<onSharedPreferenceChanged> list, String str, zzh zzh, List<String> list2) {
            super(str, zzh, list2);
            onGetStartedClick.write((Object) list, "accounts");
            onGetStartedClick.write((Object) str, "header");
            onGetStartedClick.write((Object) zzh, "componentType");
            onGetStartedClick.write((Object) list2, "remarks");
            this.write = list;
        }
    }

    /* renamed from: o.zzcb$zzg */
    public final class zzg {
        @SerializedName("ncb")
        private final String write;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof zzg) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((zzg) obj).write);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.write;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EasycashCreditPowerConsent(ncb=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: o.zzcb$zzg$zza */
        public final class zza {
            public final String IconCompatParcelizer;
            public final String MediaBrowserCompat$CustomActionResultReceiver;
            public final String MediaBrowserCompat$ItemReceiver;
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
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zza.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer);
            }

            public final int hashCode() {
                String str = this.write;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.MediaBrowserCompat$ItemReceiver;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
                int hashCode3 = str3 != null ? str3.hashCode() : 0;
                String str4 = this.read;
                int hashCode4 = str4 != null ? str4.hashCode() : 0;
                String str5 = this.IconCompatParcelizer;
                if (str5 != null) {
                    i = str5.hashCode();
                }
                return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("EasycashDebitCard(cardImageUrl=");
                sb.append(this.write);
                sb.append(", cardMaskedNo=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", cardRefNo=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", nickName=");
                sb.append(this.read);
                sb.append(", productName=");
                sb.append(this.IconCompatParcelizer);
                sb.append(")");
                return sb.toString();
            }

            public zza(String str, String str2, String str3, String str4, String str5) {
                onGetStartedClick.write((Object) str, "cardImageUrl");
                onGetStartedClick.write((Object) str2, "cardMaskedNo");
                onGetStartedClick.write((Object) str3, "cardRefNo");
                onGetStartedClick.write((Object) str4, "nickName");
                onGetStartedClick.write((Object) str5, "productName");
                this.write = str;
                this.MediaBrowserCompat$ItemReceiver = str2;
                this.MediaBrowserCompat$CustomActionResultReceiver = str3;
                this.read = str4;
                this.IconCompatParcelizer = str5;
            }
        }
    }

    public /* synthetic */ zzcb(GoogleApi.Settings settings) {
    }

    /* renamed from: o.zzcb$zzj */
    public final class zzj extends zzi.zza {

        /* renamed from: o.zzcb$zzj$zza */
        public final class zza extends C6960x24be0e72 {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public zza(String str, zzh zzh, List<String> list) {
                super(str, zzh, list);
                onGetStartedClick.write((Object) str, "header");
                onGetStartedClick.write((Object) zzh, "componentType");
                onGetStartedClick.write((Object) list, "remarks");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public zzj(List<zzev.zza> list, String str, zzh zzh, List<String> list2) {
            super(list, str, zzh, list2, (byte) 0);
            onGetStartedClick.write((Object) list, "accounts");
            onGetStartedClick.write((Object) str, "header");
            onGetStartedClick.write((Object) zzh, "componentType");
            onGetStartedClick.write((Object) list2, "remarks");
        }
    }

    /* renamed from: o.zzcb$zzk */
    public final class zzk extends zzi.zza {

        /* renamed from: o.zzcb$zzk$zza */
        public final class zza extends C6960x24be0e72 {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public zza(String str, zzh zzh, List<String> list) {
                super(str, zzh, list);
                onGetStartedClick.write((Object) str, "header");
                onGetStartedClick.write((Object) zzh, "componentType");
                onGetStartedClick.write((Object) list, "remarks");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public zzk(List<zzev.zza> list, String str, zzh zzh, List<String> list2) {
            super(list, str, zzh, list2, (byte) 0);
            onGetStartedClick.write((Object) list, "accounts");
            onGetStartedClick.write((Object) str, "header");
            onGetStartedClick.write((Object) zzh, "componentType");
            onGetStartedClick.write((Object) list2, "remarks");
        }
    }

    /* renamed from: o.zzcb$zze */
    public final class zze extends C6959xc24751b1 {
        public final List<zzc.zza> IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$SearchResultReceiver;
        public final String MediaMetadataCompat;
        public final String read;
        public final String write;

        /* renamed from: o.zzcb$zze$zza */
        public final class zza {
            @SerializedName("duration")
            private final String IconCompatParcelizer;
            @SerializedName("creditAmount")
            private final String MediaBrowserCompat$CustomActionResultReceiver;
            @SerializedName("applicationId")
            private final String MediaBrowserCompat$ItemReceiver;
            @SerializedName("ncbTransactionId")
            private final String MediaBrowserCompat$MediaItem;
            @SerializedName("productType")
            private final String RatingCompat;
            @SerializedName("interestRate")
            private final String read;
            @SerializedName("monthlyPayment")
            private final String write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zza)) {
                    return false;
                }
                zza zza = (zza) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) zza.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) zza.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zza.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer);
            }

            public final int hashCode() {
                String str = this.RatingCompat;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.MediaBrowserCompat$ItemReceiver;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.MediaBrowserCompat$MediaItem;
                int hashCode3 = str3 != null ? str3.hashCode() : 0;
                String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
                int hashCode4 = str4 != null ? str4.hashCode() : 0;
                String str5 = this.write;
                int hashCode5 = str5 != null ? str5.hashCode() : 0;
                String str6 = this.read;
                int hashCode6 = str6 != null ? str6.hashCode() : 0;
                String str7 = this.IconCompatParcelizer;
                if (str7 != null) {
                    i = str7.hashCode();
                }
                return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("EasycashCreditPowerProduct(productType=");
                sb.append(this.RatingCompat);
                sb.append(", applicationId=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", ncbTransactionId=");
                sb.append(this.MediaBrowserCompat$MediaItem);
                sb.append(", creditAmount=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", monthlyPayment=");
                sb.append(this.write);
                sb.append(", interestRate=");
                sb.append(this.read);
                sb.append(", duration=");
                sb.append(this.IconCompatParcelizer);
                sb.append(")");
                return sb.toString();
            }
        }

        public final String MediaBrowserCompat$ItemReceiver() {
            return this.MediaMetadataCompat;
        }

        public final String write() {
            return this.MediaBrowserCompat$SearchResultReceiver;
        }

        public final List<zzc.zza> MediaBrowserCompat$CustomActionResultReceiver() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public zze(String str, String str2, String str3, String str4, String str5, String str6, List<zzc.zza> list) {
            super(str5, str6, list);
            onGetStartedClick.write((Object) str, "expectedMonthlyPayment");
            onGetStartedClick.write((Object) str2, "dateOfBirth");
            onGetStartedClick.write((Object) str4, "ncbAcceptedFlag");
            onGetStartedClick.write((Object) str5, "totalLoanAmount");
            onGetStartedClick.write((Object) str6, "totalMonthlyPayment");
            onGetStartedClick.write((Object) list, "product");
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.write = str2;
            this.read = str3;
            this.MediaBrowserCompat$ItemReceiver = str4;
            this.MediaMetadataCompat = str5;
            this.MediaBrowserCompat$SearchResultReceiver = str6;
            this.IconCompatParcelizer = list;
        }
    }

    public final Object write(Object obj) {
        String str;
        setCurrentItemInternal setcurrentiteminternal = (setCurrentItemInternal) obj;
        if ("9102".equalsIgnoreCase(setcurrentiteminternal.getStatus().write())) {
            str = "EXISTS";
        } else {
            str = "9101".equalsIgnoreCase(setcurrentiteminternal.getStatus().write()) ? "DOPA" : "SUCCESS";
        }
        return new C8902x24e4e8fb(str);
    }
}

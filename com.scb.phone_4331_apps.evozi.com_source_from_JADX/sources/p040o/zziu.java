package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.List;
import p040o.ActivityTransition;
import p040o.zzjx;

/* renamed from: o.zziu */
public final /* synthetic */ class zziu implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zziu IconCompatParcelizer = new zziu();

    private /* synthetic */ zziu() {
    }

    public final Object write(Object obj) {
        return (SimpleLottieValueCallback) ((SingleDataEntity) obj).getData();
    }

    /* renamed from: o.zziu$zzb */
    public final class zzb {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final List<zzjx.zzc> MediaBrowserCompat$ItemReceiver;
        public final String read;
        public final zzjx.zze.zzb write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzb)) {
                return false;
            }
            zzb zzb = (zzb) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzb.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzb.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzb.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzb.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzb.write);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.read;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            List<zzjx.zzc> list = this.MediaBrowserCompat$ItemReceiver;
            int hashCode4 = list != null ? list.hashCode() : 0;
            zzjx.zze.zzb zzb = this.write;
            if (zzb != null) {
                i = zzb.hashCode();
            }
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlInstallmentFrequency(code=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", description=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", defaultOption=");
            sb.append(this.read);
            sb.append(", options=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", repayment=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public zzb(String str, String str2, String str3, List<zzjx.zzc> list, zzjx.zze.zzb zzb) {
            onGetStartedClick.write((Object) str, "code");
            onGetStartedClick.write((Object) str2, "description");
            onGetStartedClick.write((Object) str3, "defaultOption");
            onGetStartedClick.write((Object) list, "options");
            this.IconCompatParcelizer = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
            this.read = str3;
            this.MediaBrowserCompat$ItemReceiver = list;
            this.write = zzb;
        }
    }

    /* renamed from: o.zziu$zza */
    public final class zza {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final Integer MediaBrowserCompat$MediaItem;
        public final ActivityRecognitionClient MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private final String f2994x50fd9e4a;
        public final Boolean MediaDescriptionCompat;
        public final List<ActivityRecognitionResult> MediaMetadataCompat;
        public final getTime MediaSessionCompat$Token;
        public final String ParcelableVolumeInfo;
        public final ActivityTransition.Builder RatingCompat;
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
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) zza.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zza.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) zza.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2994x50fd9e4a, (Object) zza.f2994x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) zza.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) zza.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) zza.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) zza.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) zza.MediaDescriptionCompat);
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            Integer num = this.MediaBrowserCompat$MediaItem;
            int hashCode3 = num != null ? num.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode4 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode5 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.ParcelableVolumeInfo;
            int hashCode6 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.f2994x50fd9e4a;
            int hashCode7 = str6 != null ? str6.hashCode() : 0;
            List<ActivityRecognitionResult> list = this.MediaMetadataCompat;
            int hashCode8 = list != null ? list.hashCode() : 0;
            ActivityTransition.Builder builder = this.RatingCompat;
            int hashCode9 = builder != null ? builder.hashCode() : 0;
            String str7 = this.write;
            int hashCode10 = str7 != null ? str7.hashCode() : 0;
            getTime gettime = this.MediaSessionCompat$Token;
            int hashCode11 = gettime != null ? gettime.hashCode() : 0;
            ActivityRecognitionClient activityRecognitionClient = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode12 = activityRecognitionClient != null ? activityRecognitionClient.hashCode() : 0;
            Boolean bool = this.MediaDescriptionCompat;
            if (bool != null) {
                i = bool.hashCode();
            }
            return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlLoanOffers(applicationDatetime=");
            sb.append(this.read);
            sb.append(", applicationStatus=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", offerAvailablePeriod=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", approvalEstimatedTime=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", approvalEstimatedTimeDetail=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", resubmissionExpiryDateTime=");
            sb.append(this.ParcelableVolumeInfo);
            sb.append(", offerExpiryDatetime=");
            sb.append(this.f2994x50fd9e4a);
            sb.append(", loanOffers=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", rejected=");
            sb.append(this.RatingCompat);
            sb.append(", backgroundPath=");
            sb.append(this.write);
            sb.append(", upsellConfig=");
            sb.append(this.MediaSessionCompat$Token);
            sb.append(", loanOfferConsent=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", isRequireConsent=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(")");
            return sb.toString();
        }

        public zza(String str, String str2, Integer num, String str3, String str4, String str5, String str6, List<ActivityRecognitionResult> list, ActivityTransition.Builder builder, String str7, getTime gettime, ActivityRecognitionClient activityRecognitionClient, Boolean bool) {
            onGetStartedClick.write((Object) str2, "applicationStatus");
            this.read = str;
            this.IconCompatParcelizer = str2;
            this.MediaBrowserCompat$MediaItem = num;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
            this.MediaBrowserCompat$ItemReceiver = str4;
            this.ParcelableVolumeInfo = str5;
            this.f2994x50fd9e4a = str6;
            this.MediaMetadataCompat = list;
            this.RatingCompat = builder;
            this.write = str7;
            this.MediaSessionCompat$Token = gettime;
            this.MediaBrowserCompat$SearchResultReceiver = activityRecognitionClient;
            this.MediaDescriptionCompat = bool;
        }
    }

    /* renamed from: o.zziu$zzc */
    public final class zzc implements Parcelable {
        public static final write CREATOR = new write((byte) 0);
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String read;
        public final String write;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzc)) {
                return false;
            }
            zzc zzc = (zzc) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzc.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzc.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzc.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzc.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzc.IconCompatParcelizer);
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
            sb.append("HmlOperatingAccount(id=");
            sb.append(this.write);
            sb.append(", bankCode=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", bankAbbrev=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", bankLogo=");
            sb.append(this.read);
            sb.append(", accountNo=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public zzc(String str, String str2, String str3, String str4, String str5) {
            onGetStartedClick.write((Object) str5, "accountNo");
            this.write = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
            this.read = str4;
            this.IconCompatParcelizer = str5;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public zzc(android.os.Parcel r8) {
            /*
                r7 = this;
                java.lang.String r0 = "parcel"
                p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r0)
                java.lang.String r2 = r8.readString()
                java.lang.String r3 = r8.readString()
                java.lang.String r4 = r8.readString()
                java.lang.String r5 = r8.readString()
                java.lang.String r8 = r8.readString()
                if (r8 != 0) goto L_0x001d
                java.lang.String r8 = ""
            L_0x001d:
                r6 = r8
                r1 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.zziu.zzc.<init>(android.os.Parcel):void");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public zzc(String str) {
            this((String) null, (String) null, (String) null, (String) null, str);
            onGetStartedClick.write((Object) str, "accountNo");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            if (parcel != null) {
                parcel.writeString(this.write);
            }
            if (parcel != null) {
                parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            }
            if (parcel != null) {
                parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            }
            if (parcel != null) {
                parcel.writeString(this.read);
            }
            if (parcel != null) {
                parcel.writeString(this.IconCompatParcelizer);
            }
        }

        /* renamed from: o.zziu$zzc$write */
        public static final class write implements Parcelable.Creator<zzc> {
            private write() {
            }

            public /* synthetic */ write(byte b) {
                this();
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "parcel");
                return new zzc(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new zzc[i];
            }
        }

        public static /* synthetic */ zzc IconCompatParcelizer(zzc zzc, String str) {
            String str2 = zzc.write;
            String str3 = zzc.MediaBrowserCompat$ItemReceiver;
            String str4 = zzc.MediaBrowserCompat$CustomActionResultReceiver;
            String str5 = zzc.read;
            onGetStartedClick.write((Object) str, "accountNo");
            return new zzc(str2, str3, str4, str5, str);
        }
    }

    /* renamed from: o.zziu$zzd */
    public final class zzd {
        public final zzui<String> MediaBrowserCompat$ItemReceiver;
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzd)) {
                return false;
            }
            zzd zzd = (zzd) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzd.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzd.write);
        }

        public final int hashCode() {
            zzui<String> zzui = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = zzui != null ? zzui.hashCode() : 0;
            String str = this.write;
            if (str != null) {
                i = str.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlNTBApplyLoanButton(name=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", deepLink=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public zzd(zzui<String> zzui, String str) {
            onGetStartedClick.write((Object) zzui, "name");
            onGetStartedClick.write((Object) str, "deepLink");
            this.MediaBrowserCompat$ItemReceiver = zzui;
            this.write = str;
        }
    }
}

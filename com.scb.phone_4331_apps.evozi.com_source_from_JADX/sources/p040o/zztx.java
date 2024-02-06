package p040o;

import com.scb.phone.domain.p036di.easycash.EasycashLoanFeatureInfoCaseModule;
import java.util.List;

/* renamed from: o.zztx */
public final class zztx implements OPRStatusRewardsLandingActivity_ViewBinding<getDetectedItems> {
    private final HmlReviewDocumentActivity<headSet> MediaBrowserCompat$CustomActionResultReceiver;
    private final EasycashLoanFeatureInfoCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    /* renamed from: o.zztx$zzb */
    public final class zzb {
        public List<zzd> IconCompatParcelizer;
        public boolean MediaBrowserCompat$CustomActionResultReceiver;
        public boolean MediaBrowserCompat$ItemReceiver;
        public List<zzd> MediaBrowserCompat$MediaItem;
        public String read;
        public boolean write;
    }

    /* renamed from: o.zztx$zzc */
    public final class zzc {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public int MediaBrowserCompat$MediaItem;
        public String MediaBrowserCompat$SearchResultReceiver;
        public readStringList MediaMetadataCompat;
        public String read;
        public String write;
    }

    /* renamed from: o.zztx$zzd */
    public final class zzd {
        public String IconCompatParcelizer;
        public getAction MediaBrowserCompat$CustomActionResultReceiver;
        public Boolean read;
    }

    /* renamed from: o.zztx$zza */
    public final class zza {
        public final Integer IconCompatParcelizer;
        public final Integer MediaBrowserCompat$CustomActionResultReceiver;
        public final Boolean read;
        public final Integer write;

        public zza() {
            this((byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza = (zza) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zza.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read);
        }

        public final int hashCode() {
            Integer num = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = num != null ? num.hashCode() : 0;
            Integer num2 = this.IconCompatParcelizer;
            int hashCode2 = num2 != null ? num2.hashCode() : 0;
            Integer num3 = this.write;
            int hashCode3 = num3 != null ? num3.hashCode() : 0;
            Boolean bool = this.read;
            if (bool != null) {
                i = bool.hashCode();
            }
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("QuotaLimit(maximumLimit=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", quotaLimit=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", stock=");
            sb.append(this.write);
            sb.append(", limitationFlag=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public zza(Integer num, Integer num2, Integer num3, Boolean bool) {
            this.MediaBrowserCompat$CustomActionResultReceiver = num;
            this.IconCompatParcelizer = num2;
            this.write = num3;
            this.read = bool;
        }

        private /* synthetic */ zza(byte b) {
            this(0, 0, 0, Boolean.FALSE);
        }
    }

    private zztx(EasycashLoanFeatureInfoCaseModule easycashLoanFeatureInfoCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<headSet> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = easycashLoanFeatureInfoCaseModule;
        this.write = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
    }

    public static zztx read(EasycashLoanFeatureInfoCaseModule easycashLoanFeatureInfoCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<headSet> hmlReviewDocumentActivity3) {
        return new zztx(easycashLoanFeatureInfoCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        getDetectedItems MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.write.get(), this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

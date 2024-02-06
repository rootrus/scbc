package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import java.util.List;
import p040o.zzrc;

/* renamed from: o.zzqj */
public final class zzqj implements OPRStatusRewardsLandingActivity_ViewBinding<TransformationChildLayout> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<C6897xeb950f47> MediaBrowserCompat$CustomActionResultReceiver;
    private final UseCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;

    /* renamed from: o.zzqj$zzd */
    public final class zzd {
        public String IconCompatParcelizer = "";
        public String MediaBrowserCompat$CustomActionResultReceiver = "";
        public String MediaBrowserCompat$ItemReceiver = "";
        public String MediaBrowserCompat$MediaItem = "";
        public String MediaBrowserCompat$SearchResultReceiver = "";
        public String MediaDescriptionCompat = "";
        public String MediaMetadataCompat = "";
        public String RatingCompat = "";
        public Integer read = 0;
        public String write = "";
    }

    /* renamed from: o.zzqj$zze */
    public final class zze {
        public final int IconCompatParcelizer;
        public final zzrc.zzd MediaBrowserCompat$ItemReceiver;
        public final List<zzc> read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zze)) {
                return false;
            }
            zze zze = (zze) obj;
            return this.IconCompatParcelizer == zze.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zze.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zze.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            int i = this.IconCompatParcelizer;
            List<zzc> list = this.read;
            int i2 = 0;
            int hashCode = list != null ? list.hashCode() : 0;
            zzrc.zzd zzd = this.MediaBrowserCompat$ItemReceiver;
            if (zzd != null) {
                i2 = zzd.hashCode();
            }
            return (((i * 31) + hashCode) * 31) + i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ECouponTransaction(numOfTransaction=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", eCouponTransactionData=");
            sb.append(this.read);
            sb.append(", eCouponTransactionPaginate=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public zze(int i, List<zzc> list, zzrc.zzd zzd) {
            onGetStartedClick.write((Object) list, "eCouponTransactionData");
            onGetStartedClick.write((Object) zzd, "eCouponTransactionPaginate");
            this.IconCompatParcelizer = i;
            this.read = list;
            this.MediaBrowserCompat$ItemReceiver = zzd;
        }
    }

    /* renamed from: o.zzqj$zzc */
    public final class zzc {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$MediaItem;
        public final String MediaBrowserCompat$SearchResultReceiver;
        public final String MediaDescriptionCompat;
        public final String MediaMetadataCompat;
        public final String read;
        public final int write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzc)) {
                return false;
            }
            zzc zzc = (zzc) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzc.MediaBrowserCompat$ItemReceiver) && this.write == zzc.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzc.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzc.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) zzc.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) zzc.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) zzc.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) zzc.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzc.IconCompatParcelizer);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            int i2 = this.write;
            String str2 = this.read;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaDescriptionCompat;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.MediaBrowserCompat$MediaItem;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.MediaMetadataCompat;
            int hashCode6 = str6 != null ? str6.hashCode() : 0;
            String str7 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode7 = str7 != null ? str7.hashCode() : 0;
            String str8 = this.IconCompatParcelizer;
            if (str8 != null) {
                i = str8.hashCode();
            }
            return (((((((((((((((hashCode * 31) + i2) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ECouponTransactionData(couponExpiry=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", couponTimeLimit=");
            sb.append(this.write);
            sb.append(", imageUrl=");
            sb.append(this.read);
            sb.append(", name=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", redemptionDate=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", refId=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", relationId=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", usedDate=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", itemCode=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public zzc(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            onGetStartedClick.write((Object) str, "couponExpiry");
            onGetStartedClick.write((Object) str2, "imageUrl");
            onGetStartedClick.write((Object) str3, "name");
            onGetStartedClick.write((Object) str4, "redemptionDate");
            onGetStartedClick.write((Object) str5, "refId");
            onGetStartedClick.write((Object) str6, "relationId");
            onGetStartedClick.write((Object) str7, "usedDate");
            onGetStartedClick.write((Object) str8, "itemCode");
            this.MediaBrowserCompat$ItemReceiver = str;
            this.write = i;
            this.read = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
            this.MediaDescriptionCompat = str4;
            this.MediaBrowserCompat$MediaItem = str5;
            this.MediaMetadataCompat = str6;
            this.MediaBrowserCompat$SearchResultReceiver = str7;
            this.IconCompatParcelizer = str8;
        }
    }

    /* renamed from: o.zzqj$zza */
    public final class zza extends zzuk {
        public List<DetailsTabHolder> MediaBrowserCompat$CustomActionResultReceiver;
        public ModifyQuickTopUpReviewActivity MediaBrowserCompat$ItemReceiver;
        public int write;

        public zza(int i, List<DetailsTabHolder> list, ModifyQuickTopUpReviewActivity modifyQuickTopUpReviewActivity) {
            this.write = i;
            this.MediaBrowserCompat$CustomActionResultReceiver = list;
            this.MediaBrowserCompat$ItemReceiver = modifyQuickTopUpReviewActivity;
        }
    }

    /* renamed from: o.zzqj$zzb */
    public final class zzb extends zzuk {
        public int MediaBrowserCompat$CustomActionResultReceiver;
        public int MediaBrowserCompat$ItemReceiver;
        public String MediaBrowserCompat$MediaItem;
        public Integer MediaBrowserCompat$SearchResultReceiver;
        public String MediaDescriptionCompat;
        public String RatingCompat;
        public String read;
        public int write;

        public zzb(String str, String str2, int i, int i2, int i3) {
            this.RatingCompat = str;
            this.MediaDescriptionCompat = str2;
            this.MediaBrowserCompat$ItemReceiver = i;
            this.MediaBrowserCompat$CustomActionResultReceiver = i2;
            this.write = i3;
        }
    }

    private zzqj(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C6897xeb950f47> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = useCaseModule;
        this.read = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
    }

    public static zzqj MediaBrowserCompat$ItemReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C6897xeb950f47> hmlReviewDocumentActivity3) {
        return new zzqj(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        TransformationChildLayout MediaBrowserCompat$SearchResultReceiver = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver(this.read.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (MediaBrowserCompat$SearchResultReceiver != null) {
            return MediaBrowserCompat$SearchResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

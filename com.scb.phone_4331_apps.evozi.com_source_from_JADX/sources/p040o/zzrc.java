package p040o;

import com.google.gson.annotations.SerializedName;
import com.scb.phone.domain.p036di.prepaid.activation.PrepaidActivationCaseModule;
import java.util.List;

/* renamed from: o.zzrc */
public final class zzrc implements OPRStatusRewardsLandingActivity_ViewBinding<PairwiseEquivalence> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final PrepaidActivationCaseModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final HmlReviewDocumentActivity<getListDelegate> write;

    /* renamed from: o.zzrc$zzb */
    public final class zzb {
        public double IconCompatParcelizer;
        public int MediaBrowserCompat$CustomActionResultReceiver;
        public int MediaBrowserCompat$ItemReceiver;
        public int read;
        public boolean write;
    }

    /* renamed from: o.zzrc$zzc */
    public final class zzc {
        public final String write;

        public zzc() {
            this((byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof zzc) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((zzc) obj).write);
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
            sb.append("MyECouponDeepLinkTransaction(cardRef=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public zzc(String str) {
            onGetStartedClick.write((Object) str, "cardRef");
            this.write = str;
        }

        private /* synthetic */ zzc(byte b) {
            this("");
        }
    }

    /* renamed from: o.zzrc$zza */
    public final class zza implements getExpirationYear {
        @SerializedName("id")
        private final int IconCompatParcelizer;
        @SerializedName("relationId")
        public final int MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("productType")
        private final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("code")
        private final String read;
        @SerializedName("name")
        public final String write;

        private zza(String str, String str2, String str3) {
            onGetStartedClick.write((Object) str, "name");
            onGetStartedClick.write((Object) str2, "code");
            onGetStartedClick.write((Object) str3, "productType");
            this.IconCompatParcelizer = 0;
            this.write = str;
            this.read = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = 0;
            this.MediaBrowserCompat$ItemReceiver = str3;
        }

        public final String MediaBrowserCompat$CustomActionResultReceiver() {
            return this.write;
        }

        public zza() {
            this("", "", "");
        }
    }

    /* renamed from: o.zzrc$zze */
    public final class zze extends GiftingActivity_ViewBinding {
        public zzb MediaBrowserCompat$ItemReceiver;

        public zze(List<getAction> list, zzb zzb) {
            super(list);
            this.MediaBrowserCompat$ItemReceiver = zzb;
        }
    }

    /* renamed from: o.zzrc$zzd */
    public final class zzd {
        public final int IconCompatParcelizer;
        public final int MediaBrowserCompat$CustomActionResultReceiver;
        public final boolean MediaBrowserCompat$ItemReceiver;
        public final boolean write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzd)) {
                return false;
            }
            zzd zzd = (zzd) obj;
            return this.IconCompatParcelizer == zzd.IconCompatParcelizer && this.MediaBrowserCompat$CustomActionResultReceiver == zzd.MediaBrowserCompat$CustomActionResultReceiver && this.MediaBrowserCompat$ItemReceiver == zzd.MediaBrowserCompat$ItemReceiver && this.write == zzd.write;
        }

        public final int hashCode() {
            int i = this.IconCompatParcelizer;
            int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            boolean z = this.MediaBrowserCompat$ItemReceiver;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            boolean z3 = this.write;
            if (!z3) {
                z2 = z3;
            }
            return (((((i * 31) + i2) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ECouponTransactionPaginate(currentPage=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", pageSize=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", hasNextPage=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", hasPreviousPage=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public zzd(int i, int i2, boolean z, boolean z2) {
            this.IconCompatParcelizer = i;
            this.MediaBrowserCompat$CustomActionResultReceiver = i2;
            this.MediaBrowserCompat$ItemReceiver = z;
            this.write = z2;
        }
    }

    private zzrc(PrepaidActivationCaseModule prepaidActivationCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getListDelegate> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = prepaidActivationCaseModule;
        this.read = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static zzrc MediaBrowserCompat$CustomActionResultReceiver(PrepaidActivationCaseModule prepaidActivationCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getListDelegate> hmlReviewDocumentActivity3) {
        return new zzrc(prepaidActivationCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        PairwiseEquivalence write2 = this.MediaBrowserCompat$CustomActionResultReceiver.write(this.read.get(), this.IconCompatParcelizer.get(), this.write.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

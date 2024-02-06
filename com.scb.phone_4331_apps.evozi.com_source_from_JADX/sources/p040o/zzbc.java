package p040o;

import com.google.android.gms.common.Scopes;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.AbstractMultimap;

/* renamed from: o.zzbc */
public final /* synthetic */ class zzbc implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ BankingAgentReviewActivity read;

    /* renamed from: o.zzbc$zzb */
    public final class zzb extends zzuk {
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String MediaBrowserCompat$MediaItem;
        public String MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public String f2981x50fd9e4a;
        public String MediaDescriptionCompat;
        public String MediaMetadataCompat;
        public String MediaSessionCompat$QueueItem;
        public String MediaSessionCompat$ResultReceiverWrapper;
        public String MediaSessionCompat$Token;
        public String ParcelableVolumeInfo;
        public String RatingCompat;
        public String read;
        public String write;
    }

    /* renamed from: o.zzbc$zze */
    public final class zze {
        public OffsetDateTime MediaBrowserCompat$ItemReceiver;
    }

    public /* synthetic */ zzbc(BankingAgentReviewActivity bankingAgentReviewActivity) {
        this.read = bankingAgentReviewActivity;
    }

    /* renamed from: o.zzbc$zzc */
    public final class zzc {
        public String IconCompatParcelizer;
        public String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzc)) {
                return false;
            }
            zzc zzc = (zzc) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzc.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzc.IconCompatParcelizer);
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
            sb.append("EligibilityItem(imageUrl=");
            sb.append(this.write);
            sb.append(", description=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public zzc(String str, String str2) {
            onGetStartedClick.write((Object) str2, "description");
            this.write = str;
            this.IconCompatParcelizer = str2;
        }
    }

    /* renamed from: o.zzbc$zzd */
    public final class zzd {
        public final String IconCompatParcelizer;
        public final List<String> MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final List<zzc> write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzd)) {
                return false;
            }
            zzd zzd = (zzd) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzd.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzd.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzd.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzd.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            List<zzc> list = this.write;
            int hashCode3 = list != null ? list.hashCode() : 0;
            List<String> list2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CheckEligibility(header=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", descriptionHeader=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", eligibilityItem=");
            sb.append(this.write);
            sb.append(", descriptionItem=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public zzd(String str, String str2, List<zzc> list, List<String> list2) {
            onGetStartedClick.write((Object) str, "header");
            onGetStartedClick.write((Object) str2, "descriptionHeader");
            onGetStartedClick.write((Object) list, "eligibilityItem");
            onGetStartedClick.write((Object) list2, "descriptionItem");
            this.IconCompatParcelizer = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
            this.write = list;
            this.MediaBrowserCompat$CustomActionResultReceiver = list2;
        }
    }

    /* renamed from: o.zzbc$zzf */
    public final class zzf {
        private final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        private final String MediaBrowserCompat$ItemReceiver;
        public final String read;
        private final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzf)) {
                return false;
            }
            zzf zzf = (zzf) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzf.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzf.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzf.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzf.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzf.read);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.write;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.read;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpdateEmailProfile(email=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", emailNotificationFlag=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", emailVerificationFlag=");
            sb.append(this.write);
            sb.append(", uuid=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", refId=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public zzf(String str, String str2, String str3, String str4, String str5) {
            onGetStartedClick.write((Object) str, Scopes.EMAIL);
            onGetStartedClick.write((Object) str2, "emailNotificationFlag");
            onGetStartedClick.write((Object) str3, "emailVerificationFlag");
            this.MediaBrowserCompat$ItemReceiver = str;
            this.IconCompatParcelizer = str2;
            this.write = str3;
            this.MediaBrowserCompat$CustomActionResultReceiver = str4;
            this.read = str5;
        }
    }

    public final void IconCompatParcelizer(Object obj) {
        BankingAgentReviewActivity bankingAgentReviewActivity = this.read;
        jsonToColor jsontocolor = (jsonToColor) obj;
        synchronized (bankingAgentReviewActivity) {
            bankingAgentReviewActivity.MediaBrowserCompat$MediaItem = AbstractMultimap.AsMap.AsMapEntries.SUCCESS;
            bankingAgentReviewActivity.ParcelableVolumeInfo.MediaBrowserCompat$MediaItem = jsontocolor.read;
            bankingAgentReviewActivity.MediaSessionCompat$Token.write(bankingAgentReviewActivity.ParcelableVolumeInfo);
        }
    }
}

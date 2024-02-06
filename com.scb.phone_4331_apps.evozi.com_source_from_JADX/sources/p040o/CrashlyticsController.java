package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import org.bouncycastle.i18n.MessageBundle;
import p040o.CrashlyticsReport;
import p040o.zzcz;
import p040o.zzfe;
import p040o.zzfy;

/* renamed from: o.CrashlyticsController */
public class CrashlyticsController extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<CrashlyticsController> CREATOR = new Parcelable.Creator<CrashlyticsController>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CrashlyticsController(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CrashlyticsController[i];
        }
    };
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;

    public int describeContents() {
        return 0;
    }

    /* renamed from: o.CrashlyticsController$19 */
    public final class C322519 {
        public boolean IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public Boolean MediaBrowserCompat$ItemReceiver;
        public String read;
        public String write;

        public C322519() {
            this((byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C322519)) {
                return false;
            }
            C322519 r3 = (C322519) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && this.IconCompatParcelizer == r3.IconCompatParcelizer;
        }

        public final int hashCode() {
            Boolean bool = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = bool != null ? bool.hashCode() : 0;
            String str = this.read;
            int hashCode2 = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode3 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.write;
            if (str3 != null) {
                i = str3.hashCode();
            }
            boolean z = this.IconCompatParcelizer;
            if (z) {
                z = true;
            }
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i) * 31) + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SpouseInfoForm(citizenshipIsThai=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", thaiFirstName=");
            sb.append(this.read);
            sb.append(", thaiLastName=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", citizenId=");
            sb.append(this.write);
            sb.append(", isMarried=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public C322519(Boolean bool, String str, String str2, String str3, boolean z) {
            this.MediaBrowserCompat$ItemReceiver = bool;
            this.read = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
            this.write = str3;
            this.IconCompatParcelizer = z;
        }

        public /* synthetic */ C322519(byte b) {
            this((Boolean) null, (String) null, (String) null, (String) null, false);
        }
    }

    /* renamed from: o.CrashlyticsController$AnySessionPartFileFilter */
    public final class AnySessionPartFileFilter {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$MediaItem;
        public final String MediaBrowserCompat$SearchResultReceiver;
        public final String MediaDescriptionCompat;
        public final String MediaMetadataCompat;
        public final String MediaSessionCompat$ResultReceiverWrapper;
        public final String ParcelableVolumeInfo;
        public final String RatingCompat;
        public final String read;
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnySessionPartFileFilter)) {
                return false;
            }
            AnySessionPartFileFilter anySessionPartFileFilter = (AnySessionPartFileFilter) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) anySessionPartFileFilter.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) anySessionPartFileFilter.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) anySessionPartFileFilter.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) anySessionPartFileFilter.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) anySessionPartFileFilter.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) anySessionPartFileFilter.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) anySessionPartFileFilter.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) anySessionPartFileFilter.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) anySessionPartFileFilter.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) anySessionPartFileFilter.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) anySessionPartFileFilter.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) anySessionPartFileFilter.MediaSessionCompat$ResultReceiverWrapper);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.write;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.RatingCompat;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode6 = str6 != null ? str6.hashCode() : 0;
            String str7 = this.MediaDescriptionCompat;
            int hashCode7 = str7 != null ? str7.hashCode() : 0;
            String str8 = this.MediaBrowserCompat$MediaItem;
            int hashCode8 = str8 != null ? str8.hashCode() : 0;
            String str9 = this.MediaMetadataCompat;
            int hashCode9 = str9 != null ? str9.hashCode() : 0;
            String str10 = this.ParcelableVolumeInfo;
            int hashCode10 = str10 != null ? str10.hashCode() : 0;
            String str11 = this.read;
            int hashCode11 = str11 != null ? str11.hashCode() : 0;
            String str12 = this.MediaSessionCompat$ResultReceiverWrapper;
            if (str12 != null) {
                i = str12.hashCode();
            }
            return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlDocumentKofaxTutorialDisplay(doCaptureImage=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", dontImage1=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", dontImage2=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", dontImage3=");
            sb.append(this.write);
            sb.append(", dontImage4=");
            sb.append(this.RatingCompat);
            sb.append(", dontImage5=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", dontImage6=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", dontImage7=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", dontImage8=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", dontImage9=");
            sb.append(this.ParcelableVolumeInfo);
            sb.append(", dontImage10=");
            sb.append(this.read);
            sb.append(", exampleImage=");
            sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
            sb.append(")");
            return sb.toString();
        }

        public AnySessionPartFileFilter(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
            onGetStartedClick.write((Object) str, "doCaptureImage");
            onGetStartedClick.write((Object) str2, "dontImage1");
            onGetStartedClick.write((Object) str3, "dontImage2");
            onGetStartedClick.write((Object) str4, "dontImage3");
            onGetStartedClick.write((Object) str5, "dontImage4");
            onGetStartedClick.write((Object) str6, "dontImage5");
            onGetStartedClick.write((Object) str7, "dontImage6");
            onGetStartedClick.write((Object) str8, "dontImage7");
            onGetStartedClick.write((Object) str9, "dontImage8");
            onGetStartedClick.write((Object) str10, "dontImage9");
            onGetStartedClick.write((Object) str11, "dontImage10");
            onGetStartedClick.write((Object) str12, "exampleImage");
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.IconCompatParcelizer = str2;
            this.MediaBrowserCompat$ItemReceiver = str3;
            this.write = str4;
            this.RatingCompat = str5;
            this.MediaBrowserCompat$SearchResultReceiver = str6;
            this.MediaDescriptionCompat = str7;
            this.MediaBrowserCompat$MediaItem = str8;
            this.MediaMetadataCompat = str9;
            this.ParcelableVolumeInfo = str10;
            this.read = str11;
            this.MediaSessionCompat$ResultReceiverWrapper = str12;
        }
    }

    /* renamed from: o.CrashlyticsController$BlockingCrashEventListener */
    public final class BlockingCrashEventListener {
        public final boolean MediaBrowserCompat$CustomActionResultReceiver;
        public final boolean read;
        public final boolean write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BlockingCrashEventListener)) {
                return false;
            }
            BlockingCrashEventListener blockingCrashEventListener = (BlockingCrashEventListener) obj;
            return this.write == blockingCrashEventListener.write && this.MediaBrowserCompat$CustomActionResultReceiver == blockingCrashEventListener.MediaBrowserCompat$CustomActionResultReceiver && this.read == blockingCrashEventListener.read;
        }

        public final int hashCode() {
            boolean z = this.write;
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
            sb.append("HmlQuickAnalysisDisplay(isBgSuccess=");
            sb.append(this.write);
            sb.append(", isLightSuccess=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", isCornerSuccess=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public BlockingCrashEventListener(boolean z, boolean z2, boolean z3) {
            this.write = z;
            this.MediaBrowserCompat$CustomActionResultReceiver = z2;
            this.read = z3;
        }
    }

    /* renamed from: o.CrashlyticsController$CodedOutputStreamWriteAction */
    public final class CodedOutputStreamWriteAction {
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CodedOutputStreamWriteAction)) {
                return false;
            }
            CodedOutputStreamWriteAction codedOutputStreamWriteAction = (CodedOutputStreamWriteAction) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) codedOutputStreamWriteAction.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) codedOutputStreamWriteAction.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
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
            sb.append("HmlDocumentKofaxInstructionDisplay(videoCover=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", videoUrl=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public CodedOutputStreamWriteAction(String str, String str2) {
            onGetStartedClick.write((Object) str, "videoCover");
            onGetStartedClick.write((Object) str2, "videoUrl");
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
        }
    }

    /* renamed from: o.CrashlyticsController$SendReportRunnable */
    public abstract class SendReportRunnable {
        private SendReportRunnable() {
        }

        public /* synthetic */ SendReportRunnable(byte b) {
            this();
        }
    }

    /* renamed from: o.CrashlyticsController$SessionPartFileFilter */
    public final class SessionPartFileFilter {
        public final SendReportRunnable IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$MediaItem;
        public final String MediaBrowserCompat$SearchResultReceiver;
        public final String MediaDescriptionCompat;
        public final String MediaMetadataCompat;
        public final String RatingCompat;
        public final String read;
        public final getNativeReportFiles write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionPartFileFilter)) {
                return false;
            }
            SessionPartFileFilter sessionPartFileFilter = (SessionPartFileFilter) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) sessionPartFileFilter.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) sessionPartFileFilter.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) sessionPartFileFilter.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) sessionPartFileFilter.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) sessionPartFileFilter.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) sessionPartFileFilter.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) sessionPartFileFilter.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) sessionPartFileFilter.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) sessionPartFileFilter.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) sessionPartFileFilter.read);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$SearchResultReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaDescriptionCompat;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaMetadataCompat;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.RatingCompat;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.MediaBrowserCompat$MediaItem;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode6 = str6 != null ? str6.hashCode() : 0;
            getNativeReportFiles getnativereportfiles = this.write;
            int hashCode7 = getnativereportfiles != null ? getnativereportfiles.hashCode() : 0;
            SendReportRunnable sendReportRunnable = this.IconCompatParcelizer;
            int hashCode8 = sendReportRunnable != null ? sendReportRunnable.hashCode() : 0;
            String str7 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode9 = str7 != null ? str7.hashCode() : 0;
            String str8 = this.read;
            if (str8 != null) {
                i = str8.hashCode();
            }
            return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PolicyInfoDisplay(productTypeIconUrl=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", partnerIconUrl=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", productTypeName=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", productName=");
            sb.append(this.RatingCompat);
            sb.append(", policyNo=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", effectiveDate=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", infoDetail=");
            sb.append(this.write);
            sb.append(", infoPayment=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", dataSource=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", insAcctId=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public SessionPartFileFilter(String str, String str2, String str3, String str4, String str5, String str6, getNativeReportFiles getnativereportfiles, SendReportRunnable sendReportRunnable, String str7, String str8) {
            onGetStartedClick.write((Object) str, "productTypeIconUrl");
            onGetStartedClick.write((Object) str2, "partnerIconUrl");
            onGetStartedClick.write((Object) str3, "productTypeName");
            onGetStartedClick.write((Object) str4, "productName");
            onGetStartedClick.write((Object) str5, "policyNo");
            onGetStartedClick.write((Object) str6, "effectiveDate");
            onGetStartedClick.write((Object) str7, "dataSource");
            onGetStartedClick.write((Object) str8, "insAcctId");
            this.MediaBrowserCompat$SearchResultReceiver = str;
            this.MediaDescriptionCompat = str2;
            this.MediaMetadataCompat = str3;
            this.RatingCompat = str4;
            this.MediaBrowserCompat$MediaItem = str5;
            this.MediaBrowserCompat$CustomActionResultReceiver = str6;
            this.write = getnativereportfiles;
            this.IconCompatParcelizer = sendReportRunnable;
            this.MediaBrowserCompat$ItemReceiver = str7;
            this.read = str8;
        }
    }

    /* renamed from: o.CrashlyticsController$ReportUploaderFilesProvider */
    public final class ReportUploaderFilesProvider {
        public final List<CrashlyticsReport.Builder> MediaBrowserCompat$CustomActionResultReceiver;
        public final String read;
        public final boolean write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReportUploaderFilesProvider)) {
                return false;
            }
            ReportUploaderFilesProvider reportUploaderFilesProvider = (ReportUploaderFilesProvider) obj;
            return this.write == reportUploaderFilesProvider.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) reportUploaderFilesProvider.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) reportUploaderFilesProvider.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            boolean z = this.write;
            if (z) {
                z = true;
            }
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            List<CrashlyticsReport.Builder> list = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (list != null) {
                i = list.hashCode();
            }
            return ((((z ? 1 : 0) * true) + hashCode) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlProductCatalogueDisplay(promoFlag=");
            sb.append(this.write);
            sb.append(", description=");
            sb.append(this.read);
            sb.append(", options=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public ReportUploaderFilesProvider(boolean z, String str, List<? extends CrashlyticsReport.Builder> list) {
            onGetStartedClick.write((Object) list, "options");
            this.write = z;
            this.read = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = list;
        }
    }

    /* renamed from: o.CrashlyticsController$16 */
    public final class C322216 {
        public final String IconCompatParcelizer;
        public final zzcz.zzb MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        private final boolean MediaBrowserCompat$MediaItem;
        public final List<CrashlyticsReport.FilesPayload.Builder> MediaBrowserCompat$SearchResultReceiver;
        private final boolean MediaMetadataCompat;
        public final String RatingCompat;
        public final String read;
        public final writeToCosFromFile write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C322216)) {
                return false;
            }
            C322216 r3 = (C322216) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) r3.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) r3.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && this.MediaBrowserCompat$MediaItem == r3.MediaBrowserCompat$MediaItem && this.MediaMetadataCompat == r3.MediaMetadataCompat;
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.read;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            writeToCosFromFile writetocosfromfile = this.write;
            int hashCode3 = writetocosfromfile != null ? writetocosfromfile.hashCode() : 0;
            String str3 = this.RatingCompat;
            int hashCode4 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.IconCompatParcelizer;
            int hashCode5 = str4 != null ? str4.hashCode() : 0;
            List<CrashlyticsReport.FilesPayload.Builder> list = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode6 = list != null ? list.hashCode() : 0;
            zzcz.zzb zzb = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (zzb != null) {
                i = zzb.hashCode();
            }
            boolean z = this.MediaBrowserCompat$MediaItem;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            boolean z3 = this.MediaMetadataCompat;
            if (!z3) {
                z2 = z3;
            }
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlSummaryDisplay(principal=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", duration=");
            sb.append(this.read);
            sb.append(", installment=");
            sb.append(this.write);
            sb.append(", repaymentDate=");
            sb.append(this.RatingCompat);
            sb.append(", annualInterest=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", promotion=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", dutyStamp=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", isNextButtonAtTheBottom=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", loanPersonalizationSectionVisible=");
            sb.append(this.MediaMetadataCompat);
            sb.append(")");
            return sb.toString();
        }

        private C322216(String str, String str2, writeToCosFromFile writetocosfromfile, String str3, String str4, List<CrashlyticsReport.FilesPayload.Builder> list, zzcz.zzb zzb, boolean z, boolean z2) {
            onGetStartedClick.write((Object) str, "principal");
            onGetStartedClick.write((Object) str2, "duration");
            onGetStartedClick.write((Object) writetocosfromfile, "installment");
            onGetStartedClick.write((Object) str3, "repaymentDate");
            onGetStartedClick.write((Object) str4, "annualInterest");
            this.MediaBrowserCompat$ItemReceiver = str;
            this.read = str2;
            this.write = writetocosfromfile;
            this.RatingCompat = str3;
            this.IconCompatParcelizer = str4;
            this.MediaBrowserCompat$SearchResultReceiver = list;
            this.MediaBrowserCompat$CustomActionResultReceiver = zzb;
            this.MediaBrowserCompat$MediaItem = true;
            this.MediaMetadataCompat = false;
        }

        public /* synthetic */ C322216(String str, String str2, writeToCosFromFile writetocosfromfile, String str3, String str4, List list, zzcz.zzb zzb) {
            this(str, str2, writetocosfromfile, str3, str4, list, zzb, true, false);
        }
    }

    /* renamed from: o.CrashlyticsController$20 */
    public final class C322720 implements Parcelable {
        public static final CrashlyticsController$20$MediaBrowserCompat$ItemReceiver CREATOR = new CrashlyticsController$20$MediaBrowserCompat$ItemReceiver((byte) 0);
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$MediaItem;
        public final String MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public final String f2691x50fd9e4a;
        public final String MediaDescriptionCompat;
        public final String MediaMetadataCompat;
        public final String MediaSessionCompat$QueueItem;
        public final String MediaSessionCompat$ResultReceiverWrapper;
        public final String MediaSessionCompat$Token;
        public final String ParcelableVolumeInfo;
        public final CrashlyticsReport.FilesPayload.Builder RatingCompat;
        public final String read;
        public final String write;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C322720)) {
                return false;
            }
            C322720 r3 = (C322720) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) r3.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) r3.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) r3.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) r3.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2691x50fd9e4a, (Object) r3.f2691x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) r3.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) r3.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) r3.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) r3.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) r3.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.read;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaDescriptionCompat;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaSessionCompat$QueueItem;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.write;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.MediaSessionCompat$ResultReceiverWrapper;
            int hashCode6 = str6 != null ? str6.hashCode() : 0;
            String str7 = this.MediaSessionCompat$Token;
            int hashCode7 = str7 != null ? str7.hashCode() : 0;
            String str8 = this.f2691x50fd9e4a;
            int hashCode8 = str8 != null ? str8.hashCode() : 0;
            String str9 = this.ParcelableVolumeInfo;
            int hashCode9 = str9 != null ? str9.hashCode() : 0;
            String str10 = this.MediaMetadataCompat;
            int hashCode10 = str10 != null ? str10.hashCode() : 0;
            String str11 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode11 = str11 != null ? str11.hashCode() : 0;
            CrashlyticsReport.FilesPayload.Builder builder = this.RatingCompat;
            int hashCode12 = builder != null ? builder.hashCode() : 0;
            String str12 = this.IconCompatParcelizer;
            int hashCode13 = str12 != null ? str12.hashCode() : 0;
            String str13 = this.MediaBrowserCompat$MediaItem;
            int hashCode14 = str13 != null ? str13.hashCode() : 0;
            String str14 = this.MediaBrowserCompat$CustomActionResultReceiver;
            return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + (str14 != null ? str14.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SelectedOfferDetailsDisplay(loanAmount=");
            sb.append(this.read);
            sb.append(", repaymentAmount=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", repaymentFrequency=");
            sb.append(this.MediaSessionCompat$QueueItem);
            sb.append(", duration=");
            sb.append(this.write);
            sb.append(", durationFrequency=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", startRepaymentDate=");
            sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
            sb.append(", stampFeeRate=");
            sb.append(this.MediaSessionCompat$Token);
            sb.append(", stampAmount=");
            sb.append(this.f2691x50fd9e4a);
            sb.append(", transferFee=");
            sb.append(this.ParcelableVolumeInfo);
            sb.append(", offerId=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", offerType=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", promotion=");
            sb.append(this.RatingCompat);
            sb.append(", frontEndFee=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", netAmountReceived=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", iconPath=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public C322720(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, CrashlyticsReport.FilesPayload.Builder builder, String str12, String str13, String str14) {
            String str15 = str10;
            onGetStartedClick.write((Object) str, "loanAmount");
            onGetStartedClick.write((Object) str2, "repaymentAmount");
            onGetStartedClick.write((Object) str3, "repaymentFrequency");
            onGetStartedClick.write((Object) str4, "duration");
            onGetStartedClick.write((Object) str5, "durationFrequency");
            onGetStartedClick.write((Object) str6, "startRepaymentDate");
            onGetStartedClick.write((Object) str15, "offerId");
            this.read = str;
            this.MediaDescriptionCompat = str2;
            this.MediaSessionCompat$QueueItem = str3;
            this.write = str4;
            this.MediaBrowserCompat$ItemReceiver = str5;
            this.MediaSessionCompat$ResultReceiverWrapper = str6;
            this.MediaSessionCompat$Token = str7;
            this.f2691x50fd9e4a = str8;
            this.ParcelableVolumeInfo = str9;
            this.MediaMetadataCompat = str15;
            this.MediaBrowserCompat$SearchResultReceiver = str11;
            this.RatingCompat = builder;
            this.IconCompatParcelizer = str12;
            this.MediaBrowserCompat$MediaItem = str13;
            this.MediaBrowserCompat$CustomActionResultReceiver = str14;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C322720(android.os.Parcel r21) {
            /*
                r20 = this;
                r0 = r21
                java.lang.String r1 = "parcel"
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r1 = "$this$readStringNonNull"
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r21.readString()
                java.lang.String r3 = ""
                if (r2 != 0) goto L_0x0016
                r5 = r3
                goto L_0x0017
            L_0x0016:
                r5 = r2
            L_0x0017:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r21.readString()
                if (r2 != 0) goto L_0x0022
                r6 = r3
                goto L_0x0023
            L_0x0022:
                r6 = r2
            L_0x0023:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r21.readString()
                if (r2 != 0) goto L_0x002e
                r7 = r3
                goto L_0x002f
            L_0x002e:
                r7 = r2
            L_0x002f:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r21.readString()
                if (r2 != 0) goto L_0x003a
                r8 = r3
                goto L_0x003b
            L_0x003a:
                r8 = r2
            L_0x003b:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r21.readString()
                if (r2 != 0) goto L_0x0046
                r9 = r3
                goto L_0x0047
            L_0x0046:
                r9 = r2
            L_0x0047:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r21.readString()
                if (r2 != 0) goto L_0x0052
                r10 = r3
                goto L_0x0053
            L_0x0052:
                r10 = r2
            L_0x0053:
                java.lang.String r11 = r21.readString()
                java.lang.String r12 = r21.readString()
                java.lang.String r13 = r21.readString()
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r1 = r21.readString()
                if (r1 != 0) goto L_0x006a
                r14 = r3
                goto L_0x006b
            L_0x006a:
                r14 = r1
            L_0x006b:
                java.lang.String r15 = r21.readString()
                java.lang.Class<o.CrashlyticsReport$FilesPayload$Builder> r1 = p040o.CrashlyticsReport.FilesPayload.Builder.class
                java.lang.ClassLoader r1 = r1.getClassLoader()
                android.os.Parcelable r1 = r0.readParcelable(r1)
                r16 = r1
                o.CrashlyticsReport$FilesPayload$Builder r16 = (p040o.CrashlyticsReport.FilesPayload.Builder) r16
                java.lang.String r17 = r21.readString()
                java.lang.String r18 = r21.readString()
                java.lang.String r19 = r21.readString()
                r4 = r20
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.CrashlyticsController.C322720.<init>(android.os.Parcel):void");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.read);
            parcel.writeString(this.MediaDescriptionCompat);
            parcel.writeString(this.MediaSessionCompat$QueueItem);
            parcel.writeString(this.write);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
            parcel.writeString(this.MediaSessionCompat$Token);
            parcel.writeString(this.f2691x50fd9e4a);
            parcel.writeString(this.ParcelableVolumeInfo);
            parcel.writeString(this.MediaMetadataCompat);
            parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
            parcel.writeParcelable(this.RatingCompat, i);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.MediaBrowserCompat$MediaItem);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* renamed from: o.CrashlyticsController$9 */
    public final class C32409 extends C32378 {
        private final setShortcutName IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;

        public /* synthetic */ C32409(String str) {
            this(str, setShortcutName.CATEGORY);
        }

        public final setShortcutName MediaBrowserCompat$CustomActionResultReceiver() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C32409(String str, setShortcutName setshortcutname) {
            super((byte) 0);
            onGetStartedClick.write((Object) str, "groupLabel");
            onGetStartedClick.write((Object) setshortcutname, "type");
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.IconCompatParcelizer = setshortcutname;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32409)) {
                return false;
            }
            C32409 r3 = (C32409) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            setShortcutName setshortcutname = this.IconCompatParcelizer;
            if (setshortcutname != null) {
                i = setshortcutname.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlDocumentCategoryDisplay(groupLabel=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", type=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.CrashlyticsController$FileNameContainsFilter */
    public final class FileNameContainsFilter implements Parcelable {
        public static final Parcelable.Creator CREATOR = new IconCompatParcelizer();
        public final String IconCompatParcelizer;
        public final zzfe.zzc MediaBrowserCompat$ItemReceiver;
        public final zzfy.zzd read;
        public final String write;

        /* renamed from: o.CrashlyticsController$FileNameContainsFilter$IconCompatParcelizer */
        public static final class IconCompatParcelizer implements Parcelable.Creator {
            public final Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "in");
                return new FileNameContainsFilter((zzfy.zzd) Enum.valueOf(zzfy.zzd.class, parcel.readString()), (zzfe.zzc) Enum.valueOf(zzfe.zzc.class, parcel.readString()), parcel.readString(), parcel.readString());
            }

            public final Object[] newArray(int i) {
                return new FileNameContainsFilter[i];
            }
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FileNameContainsFilter)) {
                return false;
            }
            FileNameContainsFilter fileNameContainsFilter = (FileNameContainsFilter) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fileNameContainsFilter.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fileNameContainsFilter.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fileNameContainsFilter.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fileNameContainsFilter.write);
        }

        public final int hashCode() {
            zzfy.zzd zzd = this.read;
            int i = 0;
            int hashCode = zzd != null ? zzd.hashCode() : 0;
            zzfe.zzc zzc = this.MediaBrowserCompat$ItemReceiver;
            int hashCode2 = zzc != null ? zzc.hashCode() : 0;
            String str = this.IconCompatParcelizer;
            int hashCode3 = str != null ? str.hashCode() : 0;
            String str2 = this.write;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlSelectedSubmissionDocument(documentStatus=");
            sb.append(this.read);
            sb.append(", documentCode=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", documentType=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", documentDesc=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.read.name());
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver.name());
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.write);
        }

        public FileNameContainsFilter(zzfy.zzd zzd, zzfe.zzc zzc, String str, String str2) {
            onGetStartedClick.write((Object) zzd, "documentStatus");
            onGetStartedClick.write((Object) zzc, "documentCode");
            onGetStartedClick.write((Object) str, "documentType");
            onGetStartedClick.write((Object) str2, "documentDesc");
            this.read = zzd;
            this.MediaBrowserCompat$ItemReceiver = zzc;
            this.IconCompatParcelizer = str;
            this.write = str2;
        }
    }

    public /* synthetic */ CrashlyticsController(CrashlyticsController$MediaBrowserCompat$ItemReceiver crashlyticsController$MediaBrowserCompat$ItemReceiver, byte b) {
        this(crashlyticsController$MediaBrowserCompat$ItemReceiver);
    }

    private CrashlyticsController(CrashlyticsController$MediaBrowserCompat$ItemReceiver crashlyticsController$MediaBrowserCompat$ItemReceiver) {
        this.MediaBrowserCompat$ItemReceiver = crashlyticsController$MediaBrowserCompat$ItemReceiver.write;
        this.MediaBrowserCompat$CustomActionResultReceiver = crashlyticsController$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
    }

    /* renamed from: o.CrashlyticsController$InvalidPartFileFilter */
    public final class InvalidPartFileFilter extends getNativeReportFiles {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String read;
        public final String write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public InvalidPartFileFilter(String str, String str2, String str3, String str4, String str5) {
            super((byte) 0);
            onGetStartedClick.write((Object) str, "sumAssured");
            onGetStartedClick.write((Object) str2, "paymentPlan");
            onGetStartedClick.write((Object) str3, "premiumAmount");
            onGetStartedClick.write((Object) str4, "effectiveDate");
            onGetStartedClick.write((Object) str5, "endDate");
            this.read = str;
            this.IconCompatParcelizer = str2;
            this.MediaBrowserCompat$ItemReceiver = str3;
            this.write = str4;
            this.MediaBrowserCompat$CustomActionResultReceiver = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvalidPartFileFilter)) {
                return false;
            }
            InvalidPartFileFilter invalidPartFileFilter = (InvalidPartFileFilter) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) invalidPartFileFilter.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) invalidPartFileFilter.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) invalidPartFileFilter.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) invalidPartFileFilter.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) invalidPartFileFilter.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.write;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DefaultPolicyDetailDisplay(sumAssured=");
            sb.append(this.read);
            sb.append(", paymentPlan=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", premiumAmount=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", effectiveDate=");
            sb.append(this.write);
            sb.append(", endDate=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }
    }

    protected CrashlyticsController(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
    }

    /* renamed from: o.CrashlyticsController$LogFileDirectoryProvider */
    public final class LogFileDirectoryProvider extends SendReportRunnable {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$SearchResultReceiver;
        public final String MediaMetadataCompat;
        public final String RatingCompat;
        public final String read;
        public final String write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LogFileDirectoryProvider(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            super((byte) 0);
            onGetStartedClick.write((Object) str, "policyRenewal");
            onGetStartedClick.write((Object) str2, "insuranceType");
            onGetStartedClick.write((Object) str3, "carRepairType");
            onGetStartedClick.write((Object) str4, "renewalSumAssured");
            onGetStartedClick.write((Object) str5, "premiumAmount");
            onGetStartedClick.write((Object) str6, "dueDate");
            onGetStartedClick.write((Object) str7, "dueAmount");
            onGetStartedClick.write((Object) str8, "description");
            this.MediaBrowserCompat$SearchResultReceiver = str;
            this.IconCompatParcelizer = str2;
            this.MediaBrowserCompat$ItemReceiver = str3;
            this.MediaMetadataCompat = str4;
            this.RatingCompat = str5;
            this.write = str6;
            this.read = str7;
            this.MediaBrowserCompat$CustomActionResultReceiver = str8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LogFileDirectoryProvider)) {
                return false;
            }
            LogFileDirectoryProvider logFileDirectoryProvider = (LogFileDirectoryProvider) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) logFileDirectoryProvider.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) logFileDirectoryProvider.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) logFileDirectoryProvider.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) logFileDirectoryProvider.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) logFileDirectoryProvider.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) logFileDirectoryProvider.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) logFileDirectoryProvider.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) logFileDirectoryProvider.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$SearchResultReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaMetadataCompat;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.RatingCompat;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.write;
            int hashCode6 = str6 != null ? str6.hashCode() : 0;
            String str7 = this.read;
            int hashCode7 = str7 != null ? str7.hashCode() : 0;
            String str8 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str8 != null) {
                i = str8.hashCode();
            }
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CarPaymentDetailDisplay(policyRenewal=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", insuranceType=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", carRepairType=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", renewalSumAssured=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", premiumAmount=");
            sb.append(this.RatingCompat);
            sb.append(", dueDate=");
            sb.append(this.write);
            sb.append(", dueAmount=");
            sb.append(this.read);
            sb.append(", description=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.CrashlyticsController$8 */
    public abstract class C32378 {
        public abstract setShortcutName MediaBrowserCompat$CustomActionResultReceiver();

        private C32378() {
        }

        public /* synthetic */ C32378(byte b) {
            this();
        }
    }

    /* renamed from: o.CrashlyticsController$ReportUploaderHandlingExceptionCheck */
    public final class ReportUploaderHandlingExceptionCheck extends getNativeReportFiles {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$MediaItem;
        public final String MediaDescriptionCompat;
        public final String read;
        public final String write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ReportUploaderHandlingExceptionCheck(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            super((byte) 0);
            onGetStartedClick.write((Object) str, "label");
            onGetStartedClick.write((Object) str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            onGetStartedClick.write((Object) str3, "sumAssured");
            onGetStartedClick.write((Object) str4, "paymentPlan");
            onGetStartedClick.write((Object) str5, "premiumAmount");
            onGetStartedClick.write((Object) str6, "effectiveDate");
            onGetStartedClick.write((Object) str7, "endDate");
            this.read = str;
            this.MediaDescriptionCompat = str2;
            this.MediaBrowserCompat$MediaItem = str3;
            this.MediaBrowserCompat$ItemReceiver = str4;
            this.IconCompatParcelizer = str5;
            this.write = str6;
            this.MediaBrowserCompat$CustomActionResultReceiver = str7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReportUploaderHandlingExceptionCheck)) {
                return false;
            }
            ReportUploaderHandlingExceptionCheck reportUploaderHandlingExceptionCheck = (ReportUploaderHandlingExceptionCheck) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) reportUploaderHandlingExceptionCheck.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) reportUploaderHandlingExceptionCheck.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) reportUploaderHandlingExceptionCheck.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) reportUploaderHandlingExceptionCheck.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) reportUploaderHandlingExceptionCheck.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) reportUploaderHandlingExceptionCheck.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) reportUploaderHandlingExceptionCheck.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaDescriptionCompat;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$MediaItem;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.IconCompatParcelizer;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.write;
            int hashCode6 = str6 != null ? str6.hashCode() : 0;
            String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str7 != null) {
                i = str7.hashCode();
            }
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PolicyDetailWithHeaderDisplay(label=");
            sb.append(this.read);
            sb.append(", value=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", sumAssured=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", paymentPlan=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", premiumAmount=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", effectiveDate=");
            sb.append(this.write);
            sb.append(", endDate=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.CrashlyticsController$11 */
    public final class C321911 implements loadInBackground {
        public static final CrashlyticsController$11$MediaBrowserCompat$ItemReceiver CREATOR = new CrashlyticsController$11$MediaBrowserCompat$ItemReceiver((byte) 0);
        public final double IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final double MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$MediaItem;
        public final double read;
        public final String write;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C321911)) {
                return false;
            }
            C321911 r5 = (C321911) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) r5.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r5.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r5.write) && Double.compare(this.IconCompatParcelizer, r5.IconCompatParcelizer) == 0 && Double.compare(this.read, r5.read) == 0 && Double.compare(this.MediaBrowserCompat$ItemReceiver, r5.MediaBrowserCompat$ItemReceiver) == 0;
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$MediaItem;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.write;
            if (str3 != null) {
                i = str3.hashCode();
            }
            long doubleToLongBits = Double.doubleToLongBits(this.IconCompatParcelizer);
            long doubleToLongBits2 = Double.doubleToLongBits(this.read);
            int i2 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
            long doubleToLongBits3 = Double.doubleToLongBits(this.MediaBrowserCompat$ItemReceiver);
            return (((((((((hashCode * 31) + hashCode2) * 31) + i) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + i2) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlUpsellOfferDisplay(title=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", description=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", icon=");
            sb.append(this.write);
            sb.append(", minimum=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", maximum=");
            sb.append(this.read);
            sb.append(", stepSize=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public C321911(String str, String str2, String str3, double d, double d2, double d3) {
            onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
            onGetStartedClick.write((Object) str2, "description");
            onGetStartedClick.write((Object) str3, "icon");
            this.MediaBrowserCompat$MediaItem = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
            this.write = str3;
            this.IconCompatParcelizer = d;
            this.read = d2;
            this.MediaBrowserCompat$ItemReceiver = d3;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C321911(android.os.Parcel r14) {
            /*
                r13 = this;
                java.lang.String r0 = "parcel"
                p040o.onGetStartedClick.write((java.lang.Object) r14, (java.lang.String) r0)
                java.lang.String r0 = "$this$readStringNonNull"
                p040o.onGetStartedClick.write((java.lang.Object) r14, (java.lang.String) r0)
                java.lang.String r1 = r14.readString()
                java.lang.String r2 = ""
                if (r1 != 0) goto L_0x0014
                r4 = r2
                goto L_0x0015
            L_0x0014:
                r4 = r1
            L_0x0015:
                p040o.onGetStartedClick.write((java.lang.Object) r14, (java.lang.String) r0)
                java.lang.String r1 = r14.readString()
                if (r1 != 0) goto L_0x0020
                r5 = r2
                goto L_0x0021
            L_0x0020:
                r5 = r1
            L_0x0021:
                p040o.onGetStartedClick.write((java.lang.Object) r14, (java.lang.String) r0)
                java.lang.String r0 = r14.readString()
                if (r0 != 0) goto L_0x002c
                r6 = r2
                goto L_0x002d
            L_0x002c:
                r6 = r0
            L_0x002d:
                double r7 = r14.readDouble()
                double r9 = r14.readDouble()
                double r11 = r14.readDouble()
                r3 = r13
                r3.<init>(r4, r5, r6, r7, r9, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.CrashlyticsController.C321911.<init>(android.os.Parcel):void");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.MediaBrowserCompat$MediaItem);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.write);
            parcel.writeDouble(this.IconCompatParcelizer);
            parcel.writeDouble(this.read);
            parcel.writeDouble(this.MediaBrowserCompat$ItemReceiver);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CrashlyticsController crashlyticsController = (CrashlyticsController) obj;
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str == null ? crashlyticsController.MediaBrowserCompat$ItemReceiver != null : !str.equals(crashlyticsController.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str3 = crashlyticsController.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashSalesheetEmptyDisplay{emptyText='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append(", emptyDescription='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}

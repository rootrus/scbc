package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.Comparator;
import java.util.List;
import p040o.LottieDrawable;

/* renamed from: o.PerformanceTracker */
public final class PerformanceTracker extends setCurrentItemInternal {
    @SerializedName("summary")
    public final List<LottieDrawable.C36224> IconCompatParcelizer;
    @SerializedName("successful")
    public final List<LottieDrawable.C36224> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("emailRemark")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("disclaimer")
    public final addFailureListener read;
    @SerializedName("uuid")
    public final String write;

    /* renamed from: o.PerformanceTracker$FrameListener */
    public class FrameListener {
        @SerializedName("uuid")
        public String IconCompatParcelizer;
        @SerializedName("refId")
        public String read;
        @SerializedName("updatedDate")
        public String write;
    }

    /* renamed from: o.PerformanceTracker$1 */
    public final class C37281 {
        @SerializedName("email")
        public final String IconCompatParcelizer;
        @SerializedName("uuid")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("emailNotificationFlag")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("emailVerificationFlag")
        public final String read;
        @SerializedName("refId")
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37281)) {
                return false;
            }
            C37281 r3 = (C37281) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.read;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.write;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpdateEmailProfileEntity(email=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", emailNotificationFlag=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", emailVerificationFlag=");
            sb.append(this.read);
            sb.append(", uuid=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", refId=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerformanceTracker)) {
            return false;
        }
        PerformanceTracker performanceTracker = (PerformanceTracker) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) performanceTracker.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) performanceTracker.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) performanceTracker.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) performanceTracker.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) performanceTracker.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<LottieDrawable.C36224> list = this.IconCompatParcelizer;
        int hashCode2 = list != null ? list.hashCode() : 0;
        addFailureListener addfailurelistener = this.read;
        int hashCode3 = addfailurelistener != null ? addfailurelistener.hashCode() : 0;
        List<LottieDrawable.C36224> list2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = list2 != null ? list2.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashSummaryEntity(uuid=");
        sb.append(this.write);
        sb.append(", summary=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", disclaimer=");
        sb.append(this.read);
        sb.append(", successful=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", emailRemark=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: o.PerformanceTracker$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<LottieDrawable.C36224, setDataCollectionEnabled> {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            LottieDrawable.C36224 r4 = (LottieDrawable.C36224) obj;
            onGetStartedClick.write((Object) r4, "it");
            C5290xc2e3dd44 setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver = new C5290xc2e3dd44((byte) 0);
            setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = r4.MediaBrowserCompat$CustomActionResultReceiver;
            setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver.read = r4.MediaBrowserCompat$ItemReceiver;
            setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver.write = r4.read;
            setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$SearchResultReceiver = r4.MediaBrowserCompat$MediaItem;
            setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver = r4.write;
            setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver = r4.IconCompatParcelizer;
            return new setDataCollectionEnabled(setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver, (byte) 0);
        }
    }

    /* renamed from: o.PerformanceTracker$read */
    public static final class read<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Comparable valueOf = Integer.valueOf(((LottieDrawable.C36224) t).MediaBrowserCompat$CustomActionResultReceiver);
            Comparable valueOf2 = Integer.valueOf(((LottieDrawable.C36224) t2).MediaBrowserCompat$CustomActionResultReceiver);
            if (valueOf == valueOf2) {
                return 0;
            }
            if (valueOf == null) {
                return -1;
            }
            if (valueOf2 == null) {
                return 1;
            }
            return valueOf.compareTo(valueOf2);
        }
    }
}

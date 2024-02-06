package p040o;

import com.google.android.gms.common.Scopes;
import java.util.List;
import p040o.CrashlyticsController;
import p040o.zzct;

/* renamed from: o.getSessionIdFromSessionFile */
public final class getSessionIdFromSessionFile {
    public final boolean IconCompatParcelizer;
    public final zzct.zza MediaBrowserCompat$CustomActionResultReceiver;
    public final List<read> MediaBrowserCompat$ItemReceiver;
    public final List<read> MediaBrowserCompat$MediaItem;
    public final String read;
    public final CrashlyticsController.C32171 write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSessionIdFromSessionFile)) {
            return false;
        }
        getSessionIdFromSessionFile getsessionidfromsessionfile = (getSessionIdFromSessionFile) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getsessionidfromsessionfile.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) getsessionidfromsessionfile.MediaBrowserCompat$MediaItem) && this.IconCompatParcelizer == getsessionidfromsessionfile.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getsessionidfromsessionfile.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getsessionidfromsessionfile.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getsessionidfromsessionfile.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        List<read> list = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<read> list2 = this.MediaBrowserCompat$MediaItem;
        int hashCode2 = list2 != null ? list2.hashCode() : 0;
        boolean z = this.IconCompatParcelizer;
        if (z) {
            z = true;
        }
        CrashlyticsController.C32171 r4 = this.write;
        int hashCode3 = r4 != null ? r4.hashCode() : 0;
        String str = this.read;
        int hashCode4 = str != null ? str.hashCode() : 0;
        zzct.zza zza = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (zza != null) {
            i = zza.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + (z ? 1 : 0)) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlAccountSetupDisplay(receivingAccounts=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", repaymentAccounts=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", isRepaymentMethodAuto=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", hmlRepaymentDateDisplay=");
        sb.append(this.write);
        sb.append(", email=");
        sb.append(this.read);
        sb.append(", customerType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    private getSessionIdFromSessionFile(List<read> list, List<read> list2, boolean z, CrashlyticsController.C32171 r4, String str, zzct.zza zza) {
        onGetStartedClick.write((Object) list, "receivingAccounts");
        onGetStartedClick.write((Object) list2, "repaymentAccounts");
        onGetStartedClick.write((Object) r4, "hmlRepaymentDateDisplay");
        onGetStartedClick.write((Object) str, Scopes.EMAIL);
        onGetStartedClick.write((Object) zza, "customerType");
        this.MediaBrowserCompat$ItemReceiver = list;
        this.MediaBrowserCompat$MediaItem = list2;
        this.IconCompatParcelizer = true;
        this.write = r4;
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = zza;
    }

    public /* synthetic */ getSessionIdFromSessionFile(List list, List list2, CrashlyticsController.C32171 r10, String str, zzct.zza zza) {
        this(list, list2, true, r10, str, zza);
    }

    /* renamed from: o.getSessionIdFromSessionFile$read */
    public static final class read {
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        private final String read;
        private final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read read2 = (read) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) read2.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) read2.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) read2.write);
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.write;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public read(String str, String str2, String str3) {
            onGetStartedClick.write((Object) str, "accountName");
            onGetStartedClick.write((Object) str2, "accountNumber");
            onGetStartedClick.write((Object) str3, "accountFormatted");
            this.read = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
            this.write = str3;
        }

        public final String toString() {
            return this.write;
        }
    }
}

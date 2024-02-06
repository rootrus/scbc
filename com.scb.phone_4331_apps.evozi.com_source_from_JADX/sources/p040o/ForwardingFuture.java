package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.Utils;

/* renamed from: o.ForwardingFuture */
public abstract class ForwardingFuture implements Parcelable {
    public static final Parcelable.Creator<ForwardingFuture> CREATOR = new Parcelable.Creator<ForwardingFuture>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            switch (C33964.write[CrashlyticsReportJsonTransform$$Lambda$1.values()[parcel.readInt()].ordinal()]) {
                case 1:
                case 2:
                    return capSessionCount.CREATOR.createFromParcel(parcel);
                case 3:
                case 4:
                    return callTask.CREATOR.createFromParcel(parcel);
                case 5:
                    return awaitEvenIfOnMainThread.CREATOR.createFromParcel(parcel);
                case 6:
                case 7:
                case 8:
                    return race.CREATOR.createFromParcel(parcel);
                case 9:
                    return capFileCount.CREATOR.createFromParcel(parcel);
                case 10:
                    return UserMetadata.CREATOR.createFromParcel(parcel);
                case 11:
                    return removeAllReports.CREATOR.createFromParcel(parcel);
                case 12:
                    return recursiveDelete.CREATOR.createFromParcel(parcel);
                case 13:
                    return getCustomKeys.CREATOR.createFromParcel(parcel);
                case 14:
                case 15:
                    return (ForwardingFuture) Utils.C39301.CREATOR.createFromParcel(parcel);
                case 16:
                    return SessionReportingCoordinator$$Lambda$1.CREATOR.createFromParcel(parcel);
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Not supported ordinal:");
                    sb.append(parcel.readInt());
                    throw new UnsupportedOperationException(sb.toString());
            }
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ForwardingFuture[i];
        }
    };
    public CrashlyticsReportJsonTransform$$Lambda$1 write;

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public abstract void write(Parcel parcel, int i);

    /* renamed from: o.ForwardingFuture$SimpleForwardingFuture */
    public class SimpleForwardingFuture implements Parcelable {
        public static final Parcelable.Creator<SimpleForwardingFuture> CREATOR = new Parcelable.Creator<SimpleForwardingFuture>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SimpleForwardingFuture(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SimpleForwardingFuture[i];
            }
        };
        public String IconCompatParcelizer;
        private String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;

        public int describeContents() {
            return 0;
        }

        public SimpleForwardingFuture(String str, String str2, String str3) {
            this.MediaBrowserCompat$ItemReceiver = str;
            this.IconCompatParcelizer = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        }

        protected SimpleForwardingFuture(Parcel parcel) {
            this.MediaBrowserCompat$ItemReceiver = parcel.readString();
            this.IconCompatParcelizer = parcel.readString();
            this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SimpleForwardingFuture simpleForwardingFuture = (SimpleForwardingFuture) obj;
            String str = this.MediaBrowserCompat$ItemReceiver;
            if (str == null ? simpleForwardingFuture.MediaBrowserCompat$ItemReceiver != null : !str.equals(simpleForwardingFuture.MediaBrowserCompat$ItemReceiver)) {
                return false;
            }
            String str2 = this.IconCompatParcelizer;
            if (str2 == null ? simpleForwardingFuture.IconCompatParcelizer != null : !str2.equals(simpleForwardingFuture.IconCompatParcelizer)) {
                return false;
            }
            String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            String str4 = simpleForwardingFuture.MediaBrowserCompat$CustomActionResultReceiver;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public ForwardingFuture(CrashlyticsReportJsonTransform$$Lambda$1 crashlyticsReportJsonTransform$$Lambda$1) {
        this.write = crashlyticsReportJsonTransform$$Lambda$1;
    }

    public ForwardingFuture(Parcel parcel) {
        this.write = CrashlyticsReportJsonTransform$$Lambda$1.values()[parcel.readInt()];
    }

    /* renamed from: o.ForwardingFuture$4 */
    static /* synthetic */ class C33964 {
        static final /* synthetic */ int[] write;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.CrashlyticsReportJsonTransform$$Lambda$1[] r0 = p040o.CrashlyticsReportJsonTransform$$Lambda$1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                write = r0
                o.CrashlyticsReportJsonTransform$$Lambda$1 r1 = p040o.CrashlyticsReportJsonTransform$$Lambda$1.SUCCESS_HEADER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x001d }
                o.CrashlyticsReportJsonTransform$$Lambda$1 r1 = p040o.CrashlyticsReportJsonTransform$$Lambda$1.REVAMP_SUCCESS_HEADER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.CrashlyticsReportJsonTransform$$Lambda$1 r1 = p040o.CrashlyticsReportJsonTransform$$Lambda$1.SEPARATOR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.CrashlyticsReportJsonTransform$$Lambda$1 r1 = p040o.CrashlyticsReportJsonTransform$$Lambda$1.REVAMP_SEPARATOR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x003e }
                o.CrashlyticsReportJsonTransform$$Lambda$1 r1 = p040o.CrashlyticsReportJsonTransform$$Lambda$1.ICON     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.CrashlyticsReportJsonTransform$$Lambda$1 r1 = p040o.CrashlyticsReportJsonTransform$$Lambda$1.SIMPLE_SUB_ITEM     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0054 }
                o.CrashlyticsReportJsonTransform$$Lambda$1 r1 = p040o.CrashlyticsReportJsonTransform$$Lambda$1.SIMPLE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0060 }
                o.CrashlyticsReportJsonTransform$$Lambda$1 r1 = p040o.CrashlyticsReportJsonTransform$$Lambda$1.REVAMP_SIMPLE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x006c }
                o.CrashlyticsReportJsonTransform$$Lambda$1 r1 = p040o.CrashlyticsReportJsonTransform$$Lambda$1.SIMPLE_BOTTOM     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0078 }
                o.CrashlyticsReportJsonTransform$$Lambda$1 r1 = p040o.CrashlyticsReportJsonTransform$$Lambda$1.PHOTO_DETAIL     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0084 }
                o.CrashlyticsReportJsonTransform$$Lambda$1 r1 = p040o.CrashlyticsReportJsonTransform$$Lambda$1.CARD     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0090 }
                o.CrashlyticsReportJsonTransform$$Lambda$1 r1 = p040o.CrashlyticsReportJsonTransform$$Lambda$1.REMARK     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x009c }
                o.CrashlyticsReportJsonTransform$$Lambda$1 r1 = p040o.CrashlyticsReportJsonTransform$$Lambda$1.COMPLEX_INTEREST     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x00a8 }
                o.CrashlyticsReportJsonTransform$$Lambda$1 r1 = p040o.CrashlyticsReportJsonTransform$$Lambda$1.HEADER_TITLE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x00b4 }
                o.CrashlyticsReportJsonTransform$$Lambda$1 r1 = p040o.CrashlyticsReportJsonTransform$$Lambda$1.TITLE     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x00c0 }
                o.CrashlyticsReportJsonTransform$$Lambda$1 r1 = p040o.CrashlyticsReportJsonTransform$$Lambda$1.ADDITIONAL_META_DATA     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.ForwardingFuture.C33964.<clinit>():void");
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.write.ordinal());
        write(parcel, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this.write != ((ForwardingFuture) obj).write) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        CrashlyticsReportJsonTransform$$Lambda$1 crashlyticsReportJsonTransform$$Lambda$1 = this.write;
        if (crashlyticsReportJsonTransform$$Lambda$1 != null) {
            return crashlyticsReportJsonTransform$$Lambda$1.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BaseItemDisplay{itemType=");
        sb.append(this.write);
        sb.append('}');
        return sb.toString();
    }
}

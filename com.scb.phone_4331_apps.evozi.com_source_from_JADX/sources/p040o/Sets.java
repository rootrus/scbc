package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.cache.DiskLruCache;
import p040o.Iterables;
import p040o.MinMaxPriorityQueue;
import p040o.SignedBytes;
import p040o.SingletonImmutableList;

/* renamed from: o.Sets */
public final class Sets extends constrainedListMultimap {

    /* renamed from: o.Sets$CartesianSet */
    public final class CartesianSet extends SignedBytes.LexicographicalComparator {
        public final String IconCompatParcelizer;
        private final C37723 read;

        /* renamed from: o.Sets$CartesianSet$Axis */
        public final class Axis {
            public final PowerSet write;

            @HmlPinActivity
            public Axis(InvertibleFunction invertibleFunction, PowerSet powerSet) {
                onGetStartedClick.write((Object) invertibleFunction, "merchantInfoDisplayMapper");
                onGetStartedClick.write((Object) powerSet, "sourceOfFundPaymentInfoDisplayMapper");
                this.write = powerSet;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public CartesianSet(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str, C37723 r5, InvertibleFunction invertibleFunction) {
            super(resources, sharedPreferences, str);
            onGetStartedClick.write((Object) resources, "resources");
            onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
            onGetStartedClick.write((Object) str, "baseAssetsURL");
            onGetStartedClick.write((Object) r5, "paymentInfoDisplayMapper");
            onGetStartedClick.write((Object) invertibleFunction, "merchantInfoDisplayMapper");
            this.IconCompatParcelizer = str;
            this.read = r5;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public Sets(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    /* renamed from: o.Sets$TransformedSet */
    public final class TransformedSet extends constrainedSetMultimap<GeofencingRequest, logException> {
        public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
            int i;
            int[] iArr;
            GeofencingRequest geofencingRequest = (GeofencingRequest) obj;
            String format = String.format("%s (%s%%)", new Object[]{read(Double.valueOf(geofencingRequest.f2714x50fd9e4a)), read(Double.valueOf(geofencingRequest.MediaSessionCompat$ResultReceiverWrapper))});
            logException write = logException.write();
            write.PlaybackStateCompat$CustomAction = Integer.valueOf(geofencingRequest.MediaSessionCompat$QueueItem);
            write.MediaSessionCompat$QueueItem = write(Double.valueOf(geofencingRequest.f2714x50fd9e4a));
            write.MediaSessionCompat$Token = write(Double.valueOf(geofencingRequest.MediaSessionCompat$ResultReceiverWrapper));
            write.Keep = format;
            write.PlaybackStateCompat = geofencingRequest.ParcelableVolumeInfo;
            write.ParcelableVolumeInfo = geofencingRequest.ParcelableVolumeInfo.equals(zzvs.POSITIVE.toString()) ? "+" : "";
            write.f2889x50fd9e4a = MediaBrowserCompat$CustomActionResultReceiver(geofencingRequest.ParcelableVolumeInfo);
            double d = geofencingRequest.f2714x50fd9e4a;
            if (d > 0.0d) {
                i = Iterables.C35273.read.light_green;
            } else if (d < 0.0d) {
                i = Iterables.C35273.read.light_red;
            } else {
                i = Iterables.C35273.read.fake_black;
            }
            write.MediaSessionCompat$ResultReceiverWrapper = i;
            String str = geofencingRequest.ParcelableVolumeInfo;
            int i2 = Iterables$3$MediaBrowserCompat$SearchResultReceiver.TextFakeBlack16Regular;
            if (str.equals(zzvs.POSITIVE.toString())) {
                i2 = Iterables$3$MediaBrowserCompat$SearchResultReceiver.TextGreen16Regular;
            } else if (str.equals(zzvs.NEGATIVE.toString())) {
                i2 = Iterables$3$MediaBrowserCompat$SearchResultReceiver.TextRed16Regular;
            }
            write.AlertController$RecycleListView = i2;
            write.AppCompatDialogFragment = write(Double.valueOf(geofencingRequest.MediaSessionCompat$Token));
            write.setContentView = MediaBrowserCompat$ItemReceiver(Double.valueOf(geofencingRequest.AlertController$RecycleListView));
            write.RatingCompat = geofencingRequest.MediaMetadataCompat;
            write.MediaBrowserCompat$MediaItem = geofencingRequest.MediaBrowserCompat$SearchResultReceiver;
            write.MediaBrowserCompat$SearchResultReceiver = geofencingRequest.write;
            write.read = geofencingRequest.MediaBrowserCompat$ItemReceiver;
            write.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver(Double.valueOf(geofencingRequest.MediaBrowserCompat$CustomActionResultReceiver));
            write.MediaBrowserCompat$CustomActionResultReceiver = write(Double.valueOf(geofencingRequest.IconCompatParcelizer));
            write.MediaDescriptionCompat = MediaBrowserCompat$ItemReceiver(Double.valueOf(geofencingRequest.MediaBrowserCompat$MediaItem));
            write.MediaMetadataCompat = geofencingRequest.RatingCompat;
            write.MediaBrowserCompat$ItemReceiver = DiskLruCache.VERSION_1.equals(geofencingRequest.read);
            String str2 = geofencingRequest.RatingCompat;
            String str3 = geofencingRequest.read;
            if (DiskLruCache.VERSION_1.equals(str2) && DiskLruCache.VERSION_1.equals(str3)) {
                iArr = new int[]{Iterables$3$MediaBrowserCompat$MediaItem.ltf_summary, Iterables$3$MediaBrowserCompat$MediaItem.dividend};
            } else if (!DiskLruCache.VERSION_1.equals(str2) || !"0".equals(str3)) {
                iArr = (!"0".equals(str2) || !DiskLruCache.VERSION_1.equals(str3)) ? new int[0] : new int[]{Iterables$3$MediaBrowserCompat$MediaItem.dividend};
            } else {
                iArr = new int[]{Iterables$3$MediaBrowserCompat$MediaItem.ltf_summary};
            }
            write.setHasDecor = iArr;
            return write;
        }

        @HmlPinActivity
        public TransformedSet(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
        }
    }

    /* renamed from: o.Sets$FilteredSet */
    public final class FilteredSet extends SignedBytes.LexicographicalComparator {
        private final invert IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public FilteredSet(invert invert, Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
            super(resources, sharedPreferences, str);
            onGetStartedClick.write((Object) invert, "policyInfoDisplayMapper");
            onGetStartedClick.write((Object) resources, "resources");
            onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
            onGetStartedClick.write((Object) str, "baseAssetsURL");
            this.IconCompatParcelizer = invert;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.util.Collection} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.util.List} */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b8, code lost:
            if (((r2 == null || p040o.GoodToKnowActivity.read(r2)) ? 0 : r3) != 0) goto L_0x00d1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cc, code lost:
            if (((r2 == null || p040o.GoodToKnowActivity.read(r2)) ? 0 : r3) != 0) goto L_0x00d1;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x009b  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00d6  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0196  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x019c  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x01a3  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x01c7  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x01cc  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p040o.CrashlyticsCore IconCompatParcelizer(int r34, p040o.setNotificationResponsiveness r35) {
            /*
                r33 = this;
                r0 = r33
                r1 = r35
                java.lang.String r2 = "insuranceInfo"
                p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r2)
                r3 = 1
                if (r34 != 0) goto L_0x000e
                r6 = r3
                goto L_0x000f
            L_0x000e:
                r6 = 0
            L_0x000f:
                java.lang.String r4 = r1.MediaBrowserCompat$CustomActionResultReceiver
                java.lang.String r5 = "-"
                java.lang.String r7 = p040o.AlertController$RecycleListView.read.read((java.lang.String) r4, (java.lang.String) r5)
                java.lang.String r4 = r1.write
                java.lang.String r8 = r0.mo26549c_(r4)
                java.lang.String r4 = "transformAssetUrl(insuranceInfo.partnerIconUrl)"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r8, (java.lang.String) r4)
                java.util.List<o.fromIntent> r4 = r1.IconCompatParcelizer
                if (r4 == 0) goto L_0x021b
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r10 = new java.util.ArrayList
                r11 = 10
                java.lang.String r12 = "$this$collectionSizeOrDefault"
                p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r12)
                boolean r12 = r4 instanceof java.util.Collection
                if (r12 == 0) goto L_0x003c
                r11 = r4
                java.util.Collection r11 = (java.util.Collection) r11
                int r11 = r11.size()
            L_0x003c:
                r10.<init>(r11)
                java.util.Collection r10 = (java.util.Collection) r10
                java.util.Iterator r4 = r4.iterator()
            L_0x0045:
                boolean r11 = r4.hasNext()
                if (r11 == 0) goto L_0x01ee
                java.lang.Object r11 = r4.next()
                o.fromIntent r11 = (p040o.fromIntent) r11
                o.invert r12 = r0.IconCompatParcelizer
                java.lang.String r13 = r1.write
                if (r13 != 0) goto L_0x0059
                java.lang.String r13 = ""
            L_0x0059:
                java.lang.String r15 = r1.read
                java.lang.String r14 = "policyInfo"
                p040o.onGetStartedClick.write((java.lang.Object) r11, (java.lang.String) r14)
                java.lang.String r14 = "partnerIconUrl"
                p040o.onGetStartedClick.write((java.lang.Object) r13, (java.lang.String) r14)
                java.lang.String r14 = "dataSource"
                p040o.onGetStartedClick.write((java.lang.Object) r15, (java.lang.String) r14)
                java.lang.Double r14 = r11.AppCompatActivity
                if (r14 != 0) goto L_0x008d
                java.lang.String r14 = r11.MediaSessionCompat$ResultReceiverWrapper
                if (r14 == 0) goto L_0x007c
                java.lang.CharSequence r14 = (java.lang.CharSequence) r14
                boolean r14 = p040o.GoodToKnowActivity.read(r14)
                if (r14 != 0) goto L_0x007c
                r14 = r3
                goto L_0x007d
            L_0x007c:
                r14 = 0
            L_0x007d:
                if (r14 != 0) goto L_0x008d
                java.lang.Double r14 = r11.MediaSessionCompat$QueueItem
                if (r14 != 0) goto L_0x008d
                org.threeten.bp.OffsetDateTime r14 = r11.MediaBrowserCompat$SearchResultReceiver
                if (r14 != 0) goto L_0x008d
                org.threeten.bp.OffsetDateTime r14 = r11.MediaBrowserCompat$MediaItem
                if (r14 != 0) goto L_0x008d
                r14 = 0
                goto L_0x008e
            L_0x008d:
                r14 = r3
            L_0x008e:
                o.GeofencingClient r2 = r11.f2822x50fd9e4a
                int[] r16 = p040o.getForIndex.MediaBrowserCompat$CustomActionResultReceiver
                int r2 = r2.ordinal()
                r2 = r16[r2]
                r9 = 2
                if (r2 == r3) goto L_0x00bb
                if (r2 == r9) goto L_0x00a7
                r9 = 3
                if (r2 != r9) goto L_0x00a1
                goto L_0x00d2
            L_0x00a1:
                kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
                r1.<init>()
                throw r1
            L_0x00a7:
                if (r14 != 0) goto L_0x00d1
                java.lang.String r2 = r11.MediaBrowserCompat$ItemReceiver
                if (r2 == 0) goto L_0x00b7
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r2 = p040o.GoodToKnowActivity.read(r2)
                if (r2 != 0) goto L_0x00b7
                r2 = r3
                goto L_0x00b8
            L_0x00b7:
                r2 = 0
            L_0x00b8:
                if (r2 == 0) goto L_0x00cf
                goto L_0x00d1
            L_0x00bb:
                if (r14 != 0) goto L_0x00d1
                java.lang.String r2 = r11.read
                if (r2 == 0) goto L_0x00cb
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r2 = p040o.GoodToKnowActivity.read(r2)
                if (r2 != 0) goto L_0x00cb
                r2 = r3
                goto L_0x00cc
            L_0x00cb:
                r2 = 0
            L_0x00cc:
                if (r2 == 0) goto L_0x00cf
                goto L_0x00d1
            L_0x00cf:
                r14 = 0
                goto L_0x00d2
            L_0x00d1:
                r14 = r3
            L_0x00d2:
                java.lang.String r2 = "dd MMM yyyy"
                if (r14 == 0) goto L_0x0196
                java.lang.Double r9 = r11.AppCompatActivity
                if (r9 == 0) goto L_0x00e9
                java.lang.Number r9 = (java.lang.Number) r9
                double r18 = r9.doubleValue()
                java.lang.Double r9 = java.lang.Double.valueOf(r18)
                java.lang.String r9 = p040o.invert.write((java.lang.Double) r9)
                goto L_0x00ea
            L_0x00e9:
                r9 = 0
            L_0x00ea:
                java.lang.String r28 = p040o.AlertController$RecycleListView.read.read((java.lang.String) r9, (java.lang.String) r5)
                java.lang.String r9 = r11.MediaSessionCompat$ResultReceiverWrapper
                java.lang.String r29 = p040o.AlertController$RecycleListView.read.read((java.lang.String) r9, (java.lang.String) r5)
                java.lang.Double r9 = r11.MediaSessionCompat$QueueItem
                if (r9 == 0) goto L_0x0107
                java.lang.Number r9 = (java.lang.Number) r9
                double r18 = r9.doubleValue()
                java.lang.Double r9 = java.lang.Double.valueOf(r18)
                java.lang.String r9 = p040o.invert.write((java.lang.Double) r9)
                goto L_0x0108
            L_0x0107:
                r9 = 0
            L_0x0108:
                java.lang.String r30 = p040o.AlertController$RecycleListView.read.read((java.lang.String) r9, (java.lang.String) r5)
                org.threeten.bp.OffsetDateTime r9 = r11.MediaBrowserCompat$SearchResultReceiver
                if (r9 == 0) goto L_0x0115
                java.lang.String r9 = r12.IconCompatParcelizer((java.lang.String) r2, (org.threeten.p041bp.OffsetDateTime) r9)
                goto L_0x0116
            L_0x0115:
                r9 = 0
            L_0x0116:
                java.lang.String r31 = p040o.AlertController$RecycleListView.read.read((java.lang.String) r9, (java.lang.String) r5)
                org.threeten.bp.OffsetDateTime r9 = r11.MediaBrowserCompat$MediaItem
                if (r9 == 0) goto L_0x0123
                java.lang.String r9 = r12.IconCompatParcelizer((java.lang.String) r2, (org.threeten.p041bp.OffsetDateTime) r9)
                goto L_0x0124
            L_0x0123:
                r9 = 0
            L_0x0124:
                java.lang.String r32 = p040o.AlertController$RecycleListView.read.read((java.lang.String) r9, (java.lang.String) r5)
                o.GeofencingClient r9 = r11.f2822x50fd9e4a
                int[] r14 = p040o.getForIndex.read
                int r9 = r9.ordinal()
                r9 = r14[r9]
                if (r9 == r3) goto L_0x0174
                r14 = 2
                if (r9 == r14) goto L_0x0154
                r14 = 3
                if (r9 != r14) goto L_0x014e
                o.CrashlyticsController$InvalidPartFileFilter r9 = new o.CrashlyticsController$InvalidPartFileFilter
                r18 = r9
                r19 = r28
                r20 = r29
                r21 = r30
                r22 = r31
                r23 = r32
                r18.<init>(r19, r20, r21, r22, r23)
                o.getNativeReportFiles r9 = (p040o.getNativeReportFiles) r9
                goto L_0x0193
            L_0x014e:
                kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
                r1.<init>()
                throw r1
            L_0x0154:
                int r9 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.auto_my_insurance_insured_location
                android.content.res.Resources r14 = r12.MediaBrowserCompat$CustomActionResultReceiver
                java.lang.String r9 = r14.getString(r9)
                java.lang.String r14 = "getString(R.string.auto_…surance_insured_location)"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r9, (java.lang.String) r14)
                java.lang.String r14 = r11.MediaBrowserCompat$ItemReceiver
                java.lang.String r27 = p040o.AlertController$RecycleListView.read.read((java.lang.String) r14, (java.lang.String) r5)
                o.CrashlyticsController$ReportUploaderHandlingExceptionCheck r14 = new o.CrashlyticsController$ReportUploaderHandlingExceptionCheck
                r25 = r14
                r26 = r9
                r25.<init>(r26, r27, r28, r29, r30, r31, r32)
                r9 = r14
                o.getNativeReportFiles r9 = (p040o.getNativeReportFiles) r9
                goto L_0x0193
            L_0x0174:
                int r9 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.auto_my_insurance_car_license_no
                android.content.res.Resources r14 = r12.MediaBrowserCompat$CustomActionResultReceiver
                java.lang.String r9 = r14.getString(r9)
                java.lang.String r14 = "getString(R.string.auto_…insurance_car_license_no)"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r9, (java.lang.String) r14)
                java.lang.String r14 = r11.read
                java.lang.String r27 = p040o.AlertController$RecycleListView.read.read((java.lang.String) r14, (java.lang.String) r5)
                o.CrashlyticsController$ReportUploaderHandlingExceptionCheck r14 = new o.CrashlyticsController$ReportUploaderHandlingExceptionCheck
                r25 = r14
                r26 = r9
                r25.<init>(r26, r27, r28, r29, r30, r31, r32)
                r9 = r14
                o.getNativeReportFiles r9 = (p040o.getNativeReportFiles) r9
            L_0x0193:
                r21 = r9
                goto L_0x0198
            L_0x0196:
                r21 = 0
            L_0x0198:
                boolean r9 = r11.MediaDescriptionCompat
                if (r9 == 0) goto L_0x01a3
                o.CrashlyticsController$SendReportRunnable r9 = r12.MediaBrowserCompat$ItemReceiver(r11)
                r22 = r9
                goto L_0x01a5
            L_0x01a3:
                r22 = 0
            L_0x01a5:
                java.lang.String r9 = r11.AlertController$RecycleListView
                java.lang.String r9 = r12.mo26549c_(r9)
                java.lang.String r14 = "transformAssetUrl(policyInfo.productTypeIconUrl)"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r9, (java.lang.String) r14)
                java.lang.String r13 = r12.mo26549c_(r13)
                java.lang.String r14 = "transformAssetUrl(partnerIconUrl)"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r13, (java.lang.String) r14)
                java.lang.String r14 = r11.PlaybackStateCompat
                java.lang.String r17 = p040o.AlertController$RecycleListView.read.read((java.lang.String) r14, (java.lang.String) r5)
                java.lang.String r14 = r11.ParcelableVolumeInfo
                java.lang.String r3 = r11.MediaSessionCompat$Token
                org.threeten.bp.OffsetDateTime r0 = r11.MediaBrowserCompat$SearchResultReceiver
                if (r0 == 0) goto L_0x01cc
                java.lang.String r0 = r12.IconCompatParcelizer((java.lang.String) r2, (org.threeten.p041bp.OffsetDateTime) r0)
                goto L_0x01cd
            L_0x01cc:
                r0 = 0
            L_0x01cd:
                java.lang.String r20 = p040o.AlertController$RecycleListView.read.read((java.lang.String) r0, (java.lang.String) r5)
                java.lang.String r0 = r11.RatingCompat
                o.CrashlyticsController$SessionPartFileFilter r2 = new o.CrashlyticsController$SessionPartFileFilter
                r11 = r14
                r14 = r2
                r12 = r15
                r15 = r9
                r16 = r13
                r18 = r11
                r19 = r3
                r23 = r12
                r24 = r0
                r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                r10.add(r2)
                r3 = 1
                r0 = r33
                goto L_0x0045
            L_0x01ee:
                java.util.List r10 = (java.util.List) r10
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Collection r0 = (java.util.Collection) r0
                java.util.Iterator r1 = r10.iterator()
            L_0x01fd:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0217
                java.lang.Object r2 = r1.next()
                r3 = r2
                o.CrashlyticsController$SessionPartFileFilter r3 = (p040o.CrashlyticsController.SessionPartFileFilter) r3
                o.getNativeReportFiles r3 = r3.write
                if (r3 == 0) goto L_0x0210
                r3 = 1
                goto L_0x0211
            L_0x0210:
                r3 = 0
            L_0x0211:
                if (r3 == 0) goto L_0x01fd
                r0.add(r2)
                goto L_0x01fd
            L_0x0217:
                r9 = r0
                java.util.List r9 = (java.util.List) r9
                goto L_0x021c
            L_0x021b:
                r9 = 0
            L_0x021c:
                if (r9 != 0) goto L_0x0223
                o.HmlNationalIdActivity r0 = p040o.HmlNationalIdActivity.IconCompatParcelizer
                java.util.List r0 = (java.util.List) r0
                r9 = r0
            L_0x0223:
                o.CrashlyticsCore r0 = new o.CrashlyticsCore
                r4 = r0
                r5 = r34
                r4.<init>(r5, r6, r7, r8, r9)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.Sets.FilteredSet.IconCompatParcelizer(int, o.setNotificationResponsiveness):o.CrashlyticsCore");
        }
    }

    /* renamed from: o.Sets$SetView */
    public final class SetView extends constrainedSetMultimap<getGeofenceTransition, doBackgroundInitializationAsync> {
        private final TransformedSet IconCompatParcelizer;

        @HmlPinActivity
        public SetView(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
            this.IconCompatParcelizer = new TransformedSet(resources, sharedPreferences);
        }

        /* renamed from: write */
        public final doBackgroundInitializationAsync MediaBrowserCompat$ItemReceiver(getGeofenceTransition getgeofencetransition) {
            int i;
            Resources resources;
            doBackgroundInitializationAsync read = doBackgroundInitializationAsync.read();
            read.ParcelableVolumeInfo = Integer.valueOf(getgeofencetransition.f2835x50fd9e4a);
            read.IconCompatParcelizer = getgeofencetransition.write;
            read.MediaMetadataCompat = getICheckDeserializerRtti.MediaDescriptionCompat(getgeofencetransition.write);
            read.MediaBrowserCompat$SearchResultReceiver = write(Double.valueOf(getgeofencetransition.MediaBrowserCompat$SearchResultReceiver));
            read.RatingCompat = write(Double.valueOf(getgeofencetransition.MediaMetadataCompat));
            read.MediaDescriptionCompat = getgeofencetransition.MediaDescriptionCompat;
            read.MediaSessionCompat$QueueItem = getgeofencetransition.RatingCompat;
            read.MediaSessionCompat$ResultReceiverWrapper = String.valueOf(getgeofencetransition.MediaBrowserCompat$MediaItem);
            if (getgeofencetransition.MediaSessionCompat$Token == 1) {
                resources = this.MediaBrowserCompat$CustomActionResultReceiver;
                i = Iterables$3$MediaBrowserCompat$MediaItem.investment_details_client_tax;
            } else {
                resources = this.MediaBrowserCompat$CustomActionResultReceiver;
                i = Iterables$3$MediaBrowserCompat$MediaItem.investment_details_client_no_tax;
            }
            read.f2816x50fd9e4a = resources.getString(i);
            read.MediaSessionCompat$Token = write(Double.valueOf(getgeofencetransition.ParcelableVolumeInfo));
            read.MediaBrowserCompat$ItemReceiver = getgeofencetransition.IconCompatParcelizer;
            read.MediaBrowserCompat$CustomActionResultReceiver = getgeofencetransition.read;
            read.read = getgeofencetransition.MediaBrowserCompat$ItemReceiver;
            read.MediaBrowserCompat$MediaItem = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(getgeofencetransition.MediaBrowserCompat$CustomActionResultReceiver);
            return read;
        }
    }

    /* renamed from: o.Sets$SetFromMap */
    public final class SetFromMap extends constrainedSortedSetMultimap<getTriggeringLocation, markInitializationComplete> {
        private final keyIteratorImpl IconCompatParcelizer;
        private final MinMaxPriorityQueue.Builder MediaBrowserCompat$ItemReceiver;
        private final SingletonImmutableList.C37921 MediaBrowserCompat$SearchResultReceiver;
        private final SingletonImmutableMap MediaDescriptionCompat;
        private final SortedLists MediaMetadataCompat;
        private final SetView read;

        @HmlPinActivity
        public SetFromMap(Resources resources, SharedPreferences sharedPreferences, SortedLists sortedLists, SingletonImmutableList.C37921 r4, SetView setView, SingletonImmutableMap singletonImmutableMap, keyIteratorImpl keyiteratorimpl, MinMaxPriorityQueue.Builder builder) {
            super(resources, sharedPreferences);
            this.MediaMetadataCompat = sortedLists;
            this.MediaBrowserCompat$SearchResultReceiver = r4;
            this.read = setView;
            this.MediaDescriptionCompat = singletonImmutableMap;
            this.IconCompatParcelizer = keyiteratorimpl;
            this.MediaBrowserCompat$ItemReceiver = builder;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.util.Collection} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.util.List<o.Utils$4>} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: MediaBrowserCompat$CustomActionResultReceiver */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p040o.markInitializationComplete MediaBrowserCompat$ItemReceiver(p040o.getTriggeringLocation r17, boolean r18) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                r2 = r18
                o.markInitializationComplete r3 = p040o.markInitializationComplete.write()
                o.SortedLists r4 = r0.MediaMetadataCompat
                o.getGeofences r5 = r1.read
                o.CrashlyticsCore$5 r4 = r4.MediaBrowserCompat$ItemReceiver(r5)
                r3.RatingCompat = r4
                o.SingletonImmutableList$1 r4 = r0.MediaBrowserCompat$SearchResultReceiver
                o.getInitialTrigger r5 = r1.write
                o.CrashlyticsCore$1 r4 = r4.MediaBrowserCompat$ItemReceiver(r5)
                r3.MediaMetadataCompat = r4
                o.Sets$SetView r4 = r0.read
                java.util.List<o.getGeofenceTransition> r5 = r1.MediaBrowserCompat$CustomActionResultReceiver
                java.util.List r4 = r4.MediaBrowserCompat$ItemReceiver(r5)
                r3.MediaBrowserCompat$ItemReceiver = r4
                o.SingletonImmutableMap r4 = r0.MediaDescriptionCompat
                java.util.List<o.GeofencingRequest$Builder> r5 = r1.MediaBrowserCompat$MediaItem
                o.constrainedMap r6 = new o.constrainedMap
                r6.<init>(r4, r2)
                java.util.List r4 = p040o.constrainedSortedSetMultimap.MediaBrowserCompat$ItemReceiver(r5, r6)
                r3.MediaDescriptionCompat = r4
                o.SingletonImmutableMap r4 = r0.MediaDescriptionCompat
                java.util.List<o.GeofencingRequest$Builder> r5 = r1.MediaBrowserCompat$ItemReceiver
                o.constrainedMap r6 = new o.constrainedMap
                r6.<init>(r4, r2)
                java.util.List r2 = p040o.constrainedSortedSetMultimap.MediaBrowserCompat$ItemReceiver(r5, r6)
                r3.MediaBrowserCompat$CustomActionResultReceiver = r2
                o.keyIteratorImpl r2 = r0.IconCompatParcelizer
                java.util.List<o.getGeofenceTransition> r4 = r1.MediaBrowserCompat$CustomActionResultReceiver
                java.util.List r2 = r2.MediaBrowserCompat$ItemReceiver(r4)
                r3.IconCompatParcelizer = r2
                o.MinMaxPriorityQueue$Builder r2 = r0.MediaBrowserCompat$ItemReceiver
                java.util.List<o.getEndCap> r1 = r1.IconCompatParcelizer
                boolean r4 = r16.write()
                if (r1 == 0) goto L_0x00fb
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r6 = new java.util.ArrayList
                r7 = 10
                java.lang.String r8 = "$this$collectionSizeOrDefault"
                p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r8)
                boolean r8 = r1 instanceof java.util.Collection
                if (r8 == 0) goto L_0x0070
                r7 = r1
                java.util.Collection r7 = (java.util.Collection) r7
                int r7 = r7.size()
            L_0x0070:
                r6.<init>(r7)
                java.util.Collection r6 = (java.util.Collection) r6
                java.util.Iterator r1 = r1.iterator()
            L_0x0079:
                boolean r7 = r1.hasNext()
                if (r7 == 0) goto L_0x00f7
                java.lang.Object r7 = r1.next()
                o.getEndCap r7 = (p040o.getEndCap) r7
                int r11 = r7.MediaMetadataCompat
                int r9 = r7.MediaBrowserCompat$ItemReceiver
                java.lang.String r10 = r7.IconCompatParcelizer
                java.lang.String r8 = r7.MediaBrowserCompat$MediaItem
                java.lang.String r8 = r2.mo26549c_(r8)
                if (r4 != 0) goto L_0x0094
                r8 = 0
            L_0x0094:
                java.lang.String r8 = (java.lang.String) r8
                if (r8 != 0) goto L_0x00a3
                java.lang.String r8 = r7.RatingCompat
                java.lang.String r8 = r2.mo26549c_(r8)
                java.lang.String r12 = "transformAssetUrl(ad.imageUrlEN)"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r8, (java.lang.String) r12)
            L_0x00a3:
                r12 = r8
                java.lang.String r8 = r7.MediaDescriptionCompat
                java.lang.String r13 = "FakeWhite"
                boolean r8 = r13.equalsIgnoreCase(r8)
                if (r8 == 0) goto L_0x00b1
                int r8 = p040o.Iterables.C35273.read.fake_white
                goto L_0x00b3
            L_0x00b1:
                int r8 = p040o.Iterables.C35273.read.fake_black
            L_0x00b3:
                r13 = r8
                java.lang.String r8 = r7.MediaBrowserCompat$CustomActionResultReceiver
                if (r4 != 0) goto L_0x00b9
                r8 = 0
            L_0x00b9:
                java.lang.String r8 = (java.lang.String) r8
                if (r8 != 0) goto L_0x00bf
                java.lang.String r8 = r7.write
            L_0x00bf:
                r14 = r8
                o.setMockLocation r7 = r7.read
                java.lang.String r8 = r7.MediaBrowserCompat$SearchResultReceiver
                if (r4 != 0) goto L_0x00c7
                r8 = 0
            L_0x00c7:
                java.lang.String r8 = (java.lang.String) r8
                if (r8 != 0) goto L_0x00cd
                java.lang.String r8 = r7.MediaBrowserCompat$MediaItem
            L_0x00cd:
                java.lang.String r15 = r7.IconCompatParcelizer
                if (r4 != 0) goto L_0x00d2
                r15 = 0
            L_0x00d2:
                java.lang.String r15 = (java.lang.String) r15
                if (r15 != 0) goto L_0x00d8
                java.lang.String r15 = r7.write
            L_0x00d8:
                java.lang.String r5 = r7.MediaBrowserCompat$ItemReceiver
                if (r4 != 0) goto L_0x00dd
                r5 = 0
            L_0x00dd:
                java.lang.String r5 = (java.lang.String) r5
                if (r5 != 0) goto L_0x00e3
                java.lang.String r5 = r7.read
            L_0x00e3:
                java.lang.String r7 = r7.MediaBrowserCompat$CustomActionResultReceiver
                o.Utils$3 r0 = new o.Utils$3
                r0.<init>(r8, r15, r5, r7)
                o.Utils$4 r5 = new o.Utils$4
                r8 = r5
                r15 = r0
                r8.<init>(r9, r10, r11, r12, r13, r14, r15)
                r6.add(r5)
                r0 = r16
                goto L_0x0079
            L_0x00f7:
                r5 = r6
                java.util.List r5 = (java.util.List) r5
                goto L_0x00fc
            L_0x00fb:
                r5 = 0
            L_0x00fc:
                r3.read = r5
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.Sets.SetFromMap.MediaBrowserCompat$ItemReceiver(o.getTriggeringLocation, boolean):o.markInitializationComplete");
        }
    }

    /* renamed from: o.Sets$PowerSet */
    public final class PowerSet {

        /* renamed from: o.Sets$PowerSet$BitFilteredSetIterator */
        public final class BitFilteredSetIterator extends constrainedListMultimap {
            private static final Map<Integer, Integer> IconCompatParcelizer;
            private static final Map<Integer, Integer> read;

            static {
                HashMap hashMap = new HashMap();
                hashMap.put(1, Integer.valueOf(Iterables$3$MediaBrowserCompat$MediaItem.weekly_monday));
                hashMap.put(2, Integer.valueOf(Iterables$3$MediaBrowserCompat$MediaItem.weekly_tuesday));
                hashMap.put(3, Integer.valueOf(Iterables$3$MediaBrowserCompat$MediaItem.weekly_wednesday));
                hashMap.put(4, Integer.valueOf(Iterables$3$MediaBrowserCompat$MediaItem.weekly_thursday));
                hashMap.put(5, Integer.valueOf(Iterables$3$MediaBrowserCompat$MediaItem.weekly_friday));
                IconCompatParcelizer = Collections.unmodifiableMap(hashMap);
                HashMap hashMap2 = new HashMap();
                hashMap2.put(1, Integer.valueOf(Iterables$3$MediaBrowserCompat$MediaItem.calendar_january));
                hashMap2.put(2, Integer.valueOf(Iterables$3$MediaBrowserCompat$MediaItem.calendar_february));
                hashMap2.put(3, Integer.valueOf(Iterables$3$MediaBrowserCompat$MediaItem.calendar_march));
                hashMap2.put(4, Integer.valueOf(Iterables$3$MediaBrowserCompat$MediaItem.calendar_april));
                hashMap2.put(5, Integer.valueOf(Iterables$3$MediaBrowserCompat$MediaItem.calendar_may));
                hashMap2.put(6, Integer.valueOf(Iterables$3$MediaBrowserCompat$MediaItem.calendar_june));
                hashMap2.put(7, Integer.valueOf(Iterables$3$MediaBrowserCompat$MediaItem.calendar_july));
                hashMap2.put(8, Integer.valueOf(Iterables$3$MediaBrowserCompat$MediaItem.calendar_august));
                hashMap2.put(9, Integer.valueOf(Iterables$3$MediaBrowserCompat$MediaItem.calendar_september));
                hashMap2.put(10, Integer.valueOf(Iterables$3$MediaBrowserCompat$MediaItem.calendar_october));
                hashMap2.put(11, Integer.valueOf(Iterables$3$MediaBrowserCompat$MediaItem.calendar_november));
                hashMap2.put(12, Integer.valueOf(Iterables$3$MediaBrowserCompat$MediaItem.calendar_december));
                read = Collections.unmodifiableMap(hashMap2);
            }

            @HmlPinActivity
            public BitFilteredSetIterator(Resources resources, SharedPreferences sharedPreferences) {
                super(resources, sharedPreferences);
            }

            /* JADX WARNING: Removed duplicated region for block: B:17:0x0033  */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.String MediaDescriptionCompat(java.lang.String r5) {
                /*
                    r4 = this;
                    int r0 = r5.hashCode()
                    r1 = 1
                    r2 = 2
                    r3 = 77
                    if (r0 == r3) goto L_0x0026
                    r3 = 79
                    if (r0 == r3) goto L_0x001c
                    r3 = 87
                    if (r0 != r3) goto L_0x0030
                    java.lang.String r0 = "W"
                    boolean r5 = r5.equals(r0)
                    if (r5 == 0) goto L_0x0030
                    r5 = r1
                    goto L_0x0031
                L_0x001c:
                    java.lang.String r0 = "O"
                    boolean r5 = r5.equals(r0)
                    if (r5 == 0) goto L_0x0030
                    r5 = 0
                    goto L_0x0031
                L_0x0026:
                    java.lang.String r0 = "M"
                    boolean r5 = r5.equals(r0)
                    if (r5 == 0) goto L_0x0030
                    r5 = r2
                    goto L_0x0031
                L_0x0030:
                    r5 = -1
                L_0x0031:
                    if (r5 == 0) goto L_0x004c
                    if (r5 == r1) goto L_0x0043
                    if (r5 == r2) goto L_0x003a
                    java.lang.String r5 = ""
                    return r5
                L_0x003a:
                    int r5 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.schedule_review_effective_date_monthly
                    android.content.res.Resources r0 = r4.MediaBrowserCompat$CustomActionResultReceiver
                    java.lang.String r5 = r0.getString(r5)
                    return r5
                L_0x0043:
                    int r5 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.schedule_review_effective_date_weekly
                    android.content.res.Resources r0 = r4.MediaBrowserCompat$CustomActionResultReceiver
                    java.lang.String r5 = r0.getString(r5)
                    return r5
                L_0x004c:
                    int r5 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.schedule_review_effective_date_once
                    android.content.res.Resources r0 = r4.MediaBrowserCompat$CustomActionResultReceiver
                    java.lang.String r5 = r0.getString(r5)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p040o.Sets.PowerSet.BitFilteredSetIterator.MediaDescriptionCompat(java.lang.String):java.lang.String");
            }

            private String MediaBrowserCompat$ItemReceiver(List<String> list) {
                StringBuilder sb = new StringBuilder(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.purchase_schedule_months_of));
                for (String next : list) {
                    sb.append(" ");
                    sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.getString(read.get(Integer.valueOf(Integer.parseInt(next))).intValue()));
                    if ("en".equalsIgnoreCase(read()) && list.indexOf(next) != list.size() - 1) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }

            /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
            /* JADX WARNING: Removed duplicated region for block: B:49:0x00cb  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.String read(p040o.LocationAvailability r10) {
                /*
                    r9 = this;
                    java.lang.String r0 = r10.MediaBrowserCompat$CustomActionResultReceiver
                    int r1 = r0.hashCode()
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    r5 = 77
                    if (r1 == r5) goto L_0x0029
                    r5 = 79
                    if (r1 == r5) goto L_0x001f
                    r5 = 87
                    if (r1 != r5) goto L_0x0033
                    java.lang.String r1 = "W"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0033
                    r0 = r4
                    goto L_0x0034
                L_0x001f:
                    java.lang.String r1 = "O"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0033
                    r0 = r2
                    goto L_0x0034
                L_0x0029:
                    java.lang.String r1 = "M"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0033
                    r0 = r3
                    goto L_0x0034
                L_0x0033:
                    r0 = -1
                L_0x0034:
                    if (r0 == 0) goto L_0x00cb
                    if (r0 == r4) goto L_0x00ae
                    java.lang.String r1 = ""
                    if (r0 == r3) goto L_0x003d
                    return r1
                L_0x003d:
                    java.util.List<java.lang.String> r0 = r10.MediaBrowserCompat$ItemReceiver
                    if (r0 == 0) goto L_0x00ad
                    java.util.List<java.lang.String> r0 = r10.MediaBrowserCompat$ItemReceiver
                    boolean r0 = r0.isEmpty()
                    if (r0 != 0) goto L_0x00ad
                    int r0 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.purchase_schedule_monthly
                    android.content.res.Resources r5 = r9.MediaBrowserCompat$CustomActionResultReceiver
                    java.lang.String r0 = r5.getString(r0)
                    java.lang.Object[] r5 = new java.lang.Object[r3]
                    java.lang.String r6 = r10.IconCompatParcelizer
                    java.lang.String r7 = r9.read()
                    java.lang.String r8 = "en"
                    boolean r7 = r8.equalsIgnoreCase(r7)
                    if (r7 == 0) goto L_0x0088
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    r7.append(r6)
                    int r6 = java.lang.Integer.parseInt(r6)
                    if (r6 == r4) goto L_0x007f
                    if (r6 == r3) goto L_0x007c
                    r3 = 3
                    if (r6 == r3) goto L_0x0079
                    if (r6 <= 0) goto L_0x0081
                    java.lang.String r1 = "th"
                    goto L_0x0081
                L_0x0079:
                    java.lang.String r1 = "rd"
                    goto L_0x0081
                L_0x007c:
                    java.lang.String r1 = "nd"
                    goto L_0x0081
                L_0x007f:
                    java.lang.String r1 = "st"
                L_0x0081:
                    r7.append(r1)
                    java.lang.String r6 = r7.toString()
                L_0x0088:
                    r5[r2] = r6
                    java.util.List<java.lang.String> r1 = r10.MediaBrowserCompat$ItemReceiver
                    int r1 = r1.size()
                    r3 = 12
                    if (r1 != r3) goto L_0x0095
                    r2 = r4
                L_0x0095:
                    if (r2 == 0) goto L_0x00a0
                    int r10 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.purchase_schedule_all_months
                    android.content.res.Resources r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                    java.lang.String r10 = r1.getString(r10)
                    goto L_0x00a6
                L_0x00a0:
                    java.util.List<java.lang.String> r10 = r10.MediaBrowserCompat$ItemReceiver
                    java.lang.String r10 = r9.MediaBrowserCompat$ItemReceiver(r10)
                L_0x00a6:
                    r5[r4] = r10
                    java.lang.String r10 = java.lang.String.format(r0, r5)
                    return r10
                L_0x00ad:
                    return r1
                L_0x00ae:
                    java.util.Map<java.lang.Integer, java.lang.Integer> r0 = IconCompatParcelizer
                    java.lang.String r10 = r10.read
                    int r10 = java.lang.Integer.parseInt(r10)
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                    java.lang.Object r10 = r0.get(r10)
                    java.lang.Integer r10 = (java.lang.Integer) r10
                    int r10 = r10.intValue()
                    android.content.res.Resources r0 = r9.MediaBrowserCompat$CustomActionResultReceiver
                    java.lang.String r10 = r0.getString(r10)
                    return r10
                L_0x00cb:
                    android.content.res.Resources r0 = r9.MediaBrowserCompat$CustomActionResultReceiver
                    java.lang.String r10 = r10.write
                    java.lang.String r10 = p040o.CheckCaptureActivity.MediaBrowserCompat$ItemReceiver((android.content.res.Resources) r0, (java.lang.String) r10)
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: p040o.Sets.PowerSet.BitFilteredSetIterator.read(o.LocationAvailability):java.lang.String");
            }
        }
    }

    /* renamed from: o.Sets$InvertibleFunction */
    public final class InvertibleFunction {
        public static processInstanceComponents write(setLoiteringDelay setloiteringdelay) {
            onGetStartedClick.write((Object) setloiteringdelay, "merchantInfo");
            return new processInstanceComponents(setloiteringdelay.read, setloiteringdelay.IconCompatParcelizer, setloiteringdelay.write, setloiteringdelay.MediaBrowserCompat$CustomActionResultReceiver, setloiteringdelay.MediaDescriptionCompat, setloiteringdelay.MediaBrowserCompat$ItemReceiver);
        }
    }
}

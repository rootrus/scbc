package p040o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import p040o.AppCompatButton;
import p040o.Futures;
import p040o.HmlWorkAddressActivity;
import p040o.Iterables;
import p040o.SignedBytes;
import p040o.setupDialog;
import p040o.zzag;

/* renamed from: o.MapConstraints */
public final class MapConstraints extends Iterables.C35339 {
    public final FinalizableSoftReference MediaBrowserCompat$CustomActionResultReceiver;

    /* renamed from: o.MapConstraints$ConstrainedAsMapEntries */
    public final class ConstrainedAsMapEntries {
    }

    /* renamed from: o.MapConstraints$ConstrainedEntrySet */
    public final /* synthetic */ class ConstrainedEntrySet {
        public static final /* synthetic */ int[] MediaBrowserCompat$CustomActionResultReceiver;

        static {
            int[] iArr = new int[zzvm$MediaBrowserCompat$CustomActionResultReceiver.values().length];
            MediaBrowserCompat$CustomActionResultReceiver = iArr;
            iArr[zzvm$MediaBrowserCompat$CustomActionResultReceiver.IMAGE.ordinal()] = 1;
            MediaBrowserCompat$CustomActionResultReceiver[zzvm$MediaBrowserCompat$CustomActionResultReceiver.TEXT.ordinal()] = 2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public MapConstraints(FinalizableSoftReference finalizableSoftReference) {
        super((byte) 0);
        onGetStartedClick.write((Object) finalizableSoftReference, "touchPointLivenessCheckCase");
        this.MediaBrowserCompat$CustomActionResultReceiver = finalizableSoftReference;
    }

    /* renamed from: o.MapConstraints$ConstrainedMap */
    public final class ConstrainedMap extends SignedBytes.LexicographicalComparator {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public ConstrainedMap(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
            super(resources, sharedPreferences, str);
            onGetStartedClick.write((Object) resources, "resources");
            onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
            onGetStartedClick.write((Object) str, "baseAssetsURL");
        }

        public final immediateFuture MediaBrowserCompat$ItemReceiver(zzvm zzvm, boolean z) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            makeChecked makechecked;
            String str6;
            String str7;
            String str8;
            onGetStartedClick.write((Object) zzvm, "adInfo");
            String str9 = zzvm.MediaBrowserCompat$ItemReceiver;
            String str10 = zzvm.write;
            zzag.zza zza = zzvm.MediaDescriptionCompat;
            if (z) {
                str = zza.read;
            } else {
                str = zza.MediaBrowserCompat$ItemReceiver;
            }
            String c_ = mo26549c_(str);
            onGetStartedClick.IconCompatParcelizer((Object) c_, "transformAssetUrl(adInfo.imageUrl.getValue(isEn))");
            zzag.zza zza2 = zzvm.IconCompatParcelizer;
            if (z) {
                str2 = zza2.read;
            } else {
                str2 = zza2.MediaBrowserCompat$ItemReceiver;
            }
            String str11 = str2;
            onGetStartedClick.IconCompatParcelizer((Object) str11, "adInfo.deeplinkUrl.getValue(isEn)");
            zzag.zza zza3 = zzvm.MediaMetadataCompat;
            if (zza3 != null) {
                if (z) {
                    str8 = zza3.read;
                } else {
                    str8 = zza3.MediaBrowserCompat$ItemReceiver;
                }
                str3 = str8;
            } else {
                str3 = null;
            }
            zzag.zza zza4 = zzvm.read;
            if (zza4 != null) {
                if (z) {
                    str7 = zza4.read;
                } else {
                    str7 = zza4.MediaBrowserCompat$ItemReceiver;
                }
                str4 = str7;
            } else {
                str4 = null;
            }
            zzag.zza zza5 = zzvm.MediaBrowserCompat$CustomActionResultReceiver;
            if (zza5 != null) {
                if (z) {
                    str6 = zza5.read;
                } else {
                    str6 = zza5.MediaBrowserCompat$ItemReceiver;
                }
                str5 = str6;
            } else {
                str5 = null;
            }
            int i = ConstrainedEntrySet.MediaBrowserCompat$CustomActionResultReceiver[zzvm.MediaBrowserCompat$MediaItem.ordinal()];
            if (i == 1) {
                makechecked = makeChecked.IMAGE;
            } else if (i == 2) {
                makechecked = makeChecked.TEXT;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return new immediateFuture(str9, str10, c_, str11, str3, str4, str5, makechecked);
        }
    }

    /* renamed from: o.MapConstraints$NotNullMapConstraint */
    public final class NotNullMapConstraint extends constrainedSetMultimap<PlaceBufferResponse, SessionReportingCoordinator$$Lambda$2> {
        private final SignedBytes.LexicographicalComparator IconCompatParcelizer;

        @HmlPinActivity
        NotNullMapConstraint(Resources resources, SignedBytes.LexicographicalComparator lexicographicalComparator, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
            this.IconCompatParcelizer = lexicographicalComparator;
        }

        private static String IconCompatParcelizer(String str, String str2) {
            String str3 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str).doubleValue() > 0.0d ? "+" : "";
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(str);
            sb.append(" (");
            sb.append(str3);
            sb.append(str2);
            sb.append("%)");
            return sb.toString();
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
        /* renamed from: MediaBrowserCompat$CustomActionResultReceiver */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p040o.SessionReportingCoordinator$$Lambda$2 MediaBrowserCompat$ItemReceiver(p040o.PlaceBufferResponse r21) {
            /*
                r20 = this;
                r0 = r20
                r1 = r21
                o.Place$ExtendedDetails r2 = r1.MediaBrowserCompat$CustomActionResultReceiver
                java.lang.String r3 = "dd MMM yyyy"
                r4 = 0
                r5 = 0
                r6 = 0
                if (r2 == 0) goto L_0x0091
                java.lang.String r9 = r2.MediaBrowserCompat$CustomActionResultReceiver
                o.SignedBytes$LexicographicalComparator r8 = r0.IconCompatParcelizer
                java.lang.String r10 = r2.read
                java.lang.String r10 = r8.mo26549c_(r10)
                java.lang.String r8 = r2.IconCompatParcelizer
                java.lang.Double r8 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((java.lang.String) r8)
                double r11 = r8.doubleValue()
                int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r8 <= 0) goto L_0x002a
                int r8 = p040o.Iterables$3$MediaBrowserCompat$ItemReceiver.ic_arrow_up
            L_0x0028:
                r11 = r8
                goto L_0x0032
            L_0x002a:
                int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r8 >= 0) goto L_0x0031
                int r8 = p040o.Iterables$3$MediaBrowserCompat$ItemReceiver.ic_arrow_down
                goto L_0x0028
            L_0x0031:
                r11 = r4
            L_0x0032:
                java.lang.String r8 = r2.MediaBrowserCompat$MediaItem
                if (r8 == 0) goto L_0x0044
                boolean r12 = r8.isEmpty()
                if (r12 != 0) goto L_0x0044
                java.math.BigDecimal r8 = p040o.getICheckDeserializerRtti.ParcelableVolumeInfo(r8)
                java.lang.String r8 = p040o.getICheckDeserializerRtti.IconCompatParcelizer((java.math.BigDecimal) r8)
            L_0x0044:
                r12 = r8
                java.lang.String r8 = r2.IconCompatParcelizer
                if (r8 == 0) goto L_0x0057
                boolean r13 = r8.isEmpty()
                if (r13 != 0) goto L_0x0057
                java.math.BigDecimal r8 = p040o.getICheckDeserializerRtti.ParcelableVolumeInfo(r8)
                java.lang.String r8 = p040o.getICheckDeserializerRtti.IconCompatParcelizer((java.math.BigDecimal) r8)
            L_0x0057:
                java.lang.String r13 = r2.MediaDescriptionCompat
                java.lang.String r13 = IconCompatParcelizer(r8, r13)
                java.lang.String r8 = r2.IconCompatParcelizer
                java.lang.Double r8 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((java.lang.String) r8)
                double r14 = r8.doubleValue()
                int r8 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
                if (r8 <= 0) goto L_0x006f
                int r8 = p040o.Iterables.C35273.read.light_green
            L_0x006d:
                r14 = r8
                goto L_0x0079
            L_0x006f:
                int r8 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
                if (r8 >= 0) goto L_0x0076
                int r8 = p040o.Iterables.C35273.read.light_red
                goto L_0x006d
            L_0x0076:
                int r8 = p040o.Iterables.C35273.read.fake_black
                goto L_0x006d
            L_0x0079:
                org.threeten.bp.OffsetDateTime r8 = r2.write
                java.lang.String r15 = r0.IconCompatParcelizer((java.lang.String) r3, (org.threeten.p041bp.OffsetDateTime) r8)
                o.sendReports r19 = new o.sendReports
                r16 = 0
                r17 = 0
                java.lang.String r2 = r2.MediaBrowserCompat$ItemReceiver
                r8 = r19
                r18 = r2
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                r2 = r19
                goto L_0x0092
            L_0x0091:
                r2 = r5
            L_0x0092:
                o.SessionReportingCoordinator$$Lambda$2 r8 = new o.SessionReportingCoordinator$$Lambda$2
                o.PlaceDetectionApi r1 = r1.IconCompatParcelizer
                if (r1 == 0) goto L_0x0118
                java.lang.String r10 = r1.MediaBrowserCompat$CustomActionResultReceiver
                o.SignedBytes$LexicographicalComparator r5 = r0.IconCompatParcelizer
                java.lang.String r9 = r1.MediaBrowserCompat$ItemReceiver
                java.lang.String r11 = r5.mo26549c_(r9)
                java.lang.String r5 = r1.MediaDescriptionCompat
                java.lang.Double r5 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((java.lang.String) r5)
                double r12 = r5.doubleValue()
                int r5 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
                if (r5 <= 0) goto L_0x00b4
                int r4 = p040o.Iterables$3$MediaBrowserCompat$ItemReceiver.ic_arrow_up
            L_0x00b2:
                r12 = r4
                goto L_0x00bb
            L_0x00b4:
                int r5 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
                if (r5 >= 0) goto L_0x00b2
                int r4 = p040o.Iterables$3$MediaBrowserCompat$ItemReceiver.ic_arrow_down
                goto L_0x00b2
            L_0x00bb:
                java.lang.String r4 = r1.MediaBrowserCompat$SearchResultReceiver
                if (r4 == 0) goto L_0x00cd
                boolean r5 = r4.isEmpty()
                if (r5 != 0) goto L_0x00cd
                java.math.BigDecimal r4 = p040o.getICheckDeserializerRtti.ParcelableVolumeInfo(r4)
                java.lang.String r4 = p040o.getICheckDeserializerRtti.IconCompatParcelizer((java.math.BigDecimal) r4)
            L_0x00cd:
                r13 = r4
                java.lang.String r4 = r1.MediaDescriptionCompat
                if (r4 == 0) goto L_0x00e0
                boolean r5 = r4.isEmpty()
                if (r5 != 0) goto L_0x00e0
                java.math.BigDecimal r4 = p040o.getICheckDeserializerRtti.ParcelableVolumeInfo(r4)
                java.lang.String r4 = p040o.getICheckDeserializerRtti.IconCompatParcelizer((java.math.BigDecimal) r4)
            L_0x00e0:
                java.lang.String r5 = r1.MediaMetadataCompat
                java.lang.String r14 = IconCompatParcelizer(r4, r5)
                java.lang.String r4 = r1.MediaDescriptionCompat
                java.lang.Double r4 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((java.lang.String) r4)
                double r4 = r4.doubleValue()
                int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r9 <= 0) goto L_0x00f8
                int r4 = p040o.Iterables.C35273.read.light_green
            L_0x00f6:
                r15 = r4
                goto L_0x0102
            L_0x00f8:
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 >= 0) goto L_0x00ff
                int r4 = p040o.Iterables.C35273.read.light_red
                goto L_0x00f6
            L_0x00ff:
                int r4 = p040o.Iterables.C35273.read.fake_black
                goto L_0x00f6
            L_0x0102:
                org.threeten.bp.OffsetDateTime r4 = r1.read
                java.lang.String r16 = r0.IconCompatParcelizer((java.lang.String) r3, (org.threeten.p041bp.OffsetDateTime) r4)
                o.sendReports r5 = new o.sendReports
                r17 = 1
                boolean r3 = r1.IconCompatParcelizer
                java.lang.String r1 = r1.write
                r9 = r5
                r18 = r3
                r19 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            L_0x0118:
                r8.<init>(r2, r5)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.MapConstraints.NotNullMapConstraint.MediaBrowserCompat$ItemReceiver(o.PlaceBufferResponse):o.SessionReportingCoordinator$$Lambda$2");
        }
    }

    /* renamed from: o.MapConstraints$ConstrainedListMultimap */
    public final class ConstrainedListMultimap implements OPRStatusRewardsLandingActivity_ViewBinding<ConstrainedMultimap.C36361> {
        public static ConstrainedMultimap.C36361 MediaBrowserCompat$CustomActionResultReceiver(Resources resources, SharedPreferences sharedPreferences, String str) {
            return new SignedBytes.LexicographicalComparator(resources, sharedPreferences, str) {
                /* JADX WARNING: Removed duplicated region for block: B:104:0x01dd  */
                /* JADX WARNING: Removed duplicated region for block: B:105:0x01df  */
                /* JADX WARNING: Removed duplicated region for block: B:108:0x01e4  */
                /* JADX WARNING: Removed duplicated region for block: B:125:0x020e  */
                /* JADX WARNING: Removed duplicated region for block: B:126:0x0210  */
                /* JADX WARNING: Removed duplicated region for block: B:133:0x0225  */
                /* JADX WARNING: Removed duplicated region for block: B:134:0x0227  */
                /* JADX WARNING: Removed duplicated region for block: B:137:0x022c  */
                /* JADX WARNING: Removed duplicated region for block: B:154:0x0257  */
                /* JADX WARNING: Removed duplicated region for block: B:155:0x0259  */
                /* JADX WARNING: Removed duplicated region for block: B:162:0x026e  */
                /* JADX WARNING: Removed duplicated region for block: B:163:0x0270  */
                /* JADX WARNING: Removed duplicated region for block: B:170:0x0285  */
                /* JADX WARNING: Removed duplicated region for block: B:171:0x0287  */
                /* JADX WARNING: Removed duplicated region for block: B:181:0x02ac  */
                /* JADX WARNING: Removed duplicated region for block: B:96:0x01c6  */
                /* JADX WARNING: Removed duplicated region for block: B:97:0x01c8  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final p040o.chain MediaBrowserCompat$CustomActionResultReceiver(p040o.zzsf r9) {
                    /*
                        r8 = this;
                        o.chain r0 = p040o.chain.MediaBrowserCompat$ItemReceiver()
                        o.zzvj r1 = r9.IconCompatParcelizer()
                        if (r1 == 0) goto L_0x0011
                        o.zzvj r1 = r9.IconCompatParcelizer()
                        java.lang.String r1 = r1.MediaBrowserCompat$ItemReceiver
                        goto L_0x0013
                    L_0x0011:
                        java.lang.String r1 = "error"
                    L_0x0013:
                        java.lang.String r2 = "1000"
                        boolean r1 = r2.equals(r1)
                        r0.write = r1
                        java.lang.String r1 = r9.read
                        r0.MediaDescriptionCompat = r1
                        org.threeten.bp.OffsetDateTime r1 = r9.setCheckable
                        java.lang.String r2 = "-"
                        java.lang.String r3 = "dd MMM"
                        if (r1 != 0) goto L_0x0029
                        r1 = r2
                        goto L_0x002f
                    L_0x0029:
                        org.threeten.bp.OffsetDateTime r1 = r9.setCheckable
                        java.lang.String r1 = r8.IconCompatParcelizer((java.lang.String) r3, (org.threeten.p041bp.OffsetDateTime) r1)
                    L_0x002f:
                        r0.MenuItemImpl = r1
                        org.threeten.bp.OffsetDateTime r1 = r9.MediaSessionCompat$Token
                        if (r1 == 0) goto L_0x003a
                        org.threeten.bp.OffsetDateTime r1 = r9.MediaSessionCompat$Token
                        r8.IconCompatParcelizer((java.lang.String) r3, (org.threeten.p041bp.OffsetDateTime) r1)
                    L_0x003a:
                        java.lang.Double r1 = r9.AppCompatActivity
                        java.lang.String r1 = write((java.lang.Double) r1)
                        r0.MenuItemWrapperICS$CollapsibleActionViewWrapper = r1
                        java.lang.Double r1 = r9.MediaSessionCompat$ResultReceiverWrapper
                        java.lang.String r1 = write((java.lang.Double) r1)
                        r0.PlaybackStateCompat = r1
                        java.lang.String r1 = r9.AppCompatDelegateImpl$ListMenuDecorView
                        r0.setPopupCallback = r1
                        java.lang.Double r1 = r9.write
                        java.lang.String r1 = write((java.lang.Double) r1)
                        r0.MediaBrowserCompat$CustomActionResultReceiver = r1
                        java.lang.Double r1 = r9.MediaSessionCompat$QueueItem
                        java.lang.String r1 = write((java.lang.Double) r1)
                        r0.Keep = r1
                        java.lang.Double r1 = r9.ParcelableVolumeInfo
                        java.lang.String r1 = write((java.lang.Double) r1)
                        r0.setHasDecor = r1
                        java.lang.Double r1 = r9.setHasDecor
                        java.lang.String r1 = write((java.lang.Double) r1)
                        r0.setIcon = r1
                        java.lang.Double r1 = r9.ParcelableVolumeInfo
                        java.lang.Double r4 = r9.MediaSessionCompat$QueueItem
                        java.lang.Integer r1 = MediaBrowserCompat$ItemReceiver((java.lang.Double) r1, (java.lang.Double) r4)
                        int r1 = r1.intValue()
                        r0.PlaybackStateCompat$CustomAction = r1
                        java.lang.String r1 = r9.AlertController$RecycleListView
                        r4 = 0
                        r5 = 1
                        if (r1 == 0) goto L_0x008a
                        int r1 = r1.length()
                        if (r1 == 0) goto L_0x008a
                        r1 = r4
                        goto L_0x008b
                    L_0x008a:
                        r1 = r5
                    L_0x008b:
                        if (r1 != 0) goto L_0x0090
                        java.lang.String r1 = r9.AlertController$RecycleListView
                        goto L_0x0092
                    L_0x0090:
                        java.lang.String r1 = r9.setContentView
                    L_0x0092:
                        r0.AppCompatViewInflater = r1
                        java.lang.String r1 = r9.AlertController$RecycleListView
                        if (r1 == 0) goto L_0x00a0
                        int r1 = r1.length()
                        if (r1 == 0) goto L_0x00a0
                        r1 = r4
                        goto L_0x00a1
                    L_0x00a0:
                        r1 = r5
                    L_0x00a1:
                        if (r1 != 0) goto L_0x00a6
                        java.lang.String r1 = r9.AlertController$RecycleListView
                        goto L_0x00a8
                    L_0x00a6:
                        java.lang.String r1 = ""
                    L_0x00a8:
                        r0.setCheckable = r1
                        o.zzvz r1 = r9.PlaybackStateCompat
                        o.zzvz r6 = p040o.zzvz.PARTIAL
                        if (r1 == r6) goto L_0x00b3
                        int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.amount_due
                        goto L_0x00b5
                    L_0x00b3:
                        int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.remaining_due
                    L_0x00b5:
                        android.content.res.Resources r6 = r8.MediaBrowserCompat$CustomActionResultReceiver
                        java.lang.String r1 = r6.getString(r1)
                        r0.setChecked = r1
                        o.zzvz r1 = r9.PlaybackStateCompat
                        o.zzvz r6 = p040o.zzvz.PAID
                        if (r1 == r6) goto L_0x00cc
                        o.zzvz r1 = r9.PlaybackStateCompat
                        o.zzvz r6 = p040o.zzvz.OVERPAID
                        if (r1 == r6) goto L_0x00cc
                        int r1 = p040o.Iterables$3$MediaBrowserCompat$ItemReceiver.ic_bill_credit_card
                        goto L_0x00ce
                    L_0x00cc:
                        int r1 = p040o.Iterables$3$MediaBrowserCompat$ItemReceiver.ic_check_circle_black_48dp
                    L_0x00ce:
                        r0.AppCompatDelegateImpl$ListMenuDecorView = r1
                        o.zzvz r1 = r9.PlaybackStateCompat
                        o.zzvz r6 = p040o.zzvz.PAID
                        if (r1 == r6) goto L_0x00de
                        o.zzvz r1 = r9.PlaybackStateCompat
                        o.zzvz r6 = p040o.zzvz.OVERPAID
                        if (r1 == r6) goto L_0x00de
                        r1 = r4
                        goto L_0x00df
                    L_0x00de:
                        r1 = r5
                    L_0x00df:
                        r0.setExpandedFormat = r1
                        java.lang.String r1 = r9.MediaMetadataCompat
                        if (r1 == 0) goto L_0x00ea
                        java.lang.String r1 = r9.MediaMetadataCompat
                        java.lang.String r6 = r9.MediaMetadataCompat
                        goto L_0x00ee
                    L_0x00ea:
                        java.lang.String r1 = r9.read
                        java.lang.String r6 = r9.read
                    L_0x00ee:
                        int r6 = r6.length()
                        r7 = 4
                        int r6 = r6 - r7
                        java.lang.String r1 = r1.substring(r6)
                        r0.f2806x50fd9e4a = r1
                        java.lang.String r1 = r9.MediaMetadataCompat
                        if (r1 == 0) goto L_0x0101
                        java.lang.String r1 = r9.MediaMetadataCompat
                        goto L_0x0103
                    L_0x0101:
                        java.lang.String r1 = r9.read
                    L_0x0103:
                        java.lang.String r1 = r1.substring(r4, r7)
                        r0.MediaBrowserCompat$SearchResultReceiver = r1
                        java.lang.String r1 = r9.MediaMetadataCompat
                        if (r1 == 0) goto L_0x0110
                        java.lang.String r1 = r9.MediaMetadataCompat
                        goto L_0x0112
                    L_0x0110:
                        java.lang.String r1 = r9.read
                    L_0x0112:
                        r6 = 6
                        java.lang.String r1 = r1.substring(r7, r6)
                        r0.MediaSessionCompat$QueueItem = r1
                        java.lang.String r1 = r9.read
                        java.lang.String r6 = r9.MediaMetadataCompat
                        java.lang.String r1 = p040o.getICheckDeserializerRtti.IconCompatParcelizer(r1, r6)
                        r0.MediaSessionCompat$Token = r1
                        java.lang.String r1 = r9.MediaBrowserCompat$MediaItem
                        java.lang.String r1 = r8.mo26549c_(r1)
                        r0.MediaSessionCompat$ResultReceiverWrapper = r1
                        java.lang.String r1 = r9.PlaybackStateCompat$CustomAction
                        r0.setShortcut = r1
                        java.lang.String r1 = r9.MediaBrowserCompat$ItemReceiver
                        r0.MediaMetadataCompat = r1
                        int r1 = r9.AppCompatDialogFragment
                        if (r5 == r1) goto L_0x0139
                        r1 = r4
                        goto L_0x013a
                    L_0x0139:
                        r1 = r5
                    L_0x013a:
                        r0.ActionMenuItemView = r1
                        java.lang.String r1 = r9.MediaBrowserCompat$SearchResultReceiver
                        if (r1 == 0) goto L_0x0143
                        java.lang.String r1 = r9.MediaBrowserCompat$SearchResultReceiver
                        goto L_0x0145
                    L_0x0143:
                        java.lang.String r1 = "NORMAL"
                    L_0x0145:
                        r0.ParcelableVolumeInfo = r1
                        java.lang.String r1 = r9.AppCompatViewInflater
                        r0.ActionBarContainer = r1
                        java.lang.String r1 = r9.setContentView
                        r0.setItemInvoker = r1
                        double r6 = r9.ActionMenuItemView
                        java.lang.Double r1 = java.lang.Double.valueOf(r6)
                        java.lang.String r1 = write((java.lang.Double) r1)
                        r0.setTabContainer = r1
                        java.lang.String r1 = r9.f3000x50fd9e4a
                        r0.AppCompatActivity = r1
                        java.lang.String r1 = r9.Keep
                        r0.setPadding = r1
                        java.lang.String r1 = r9.MediaDescriptionCompat
                        r0.AlertController$RecycleListView = r1
                        int r1 = r9.setPopupCallback
                        r0.setSplitBackground = r1
                        java.lang.Double r1 = r9.setExpandedFormat
                        java.lang.String r1 = write((java.lang.Double) r1)
                        r0.setStackedBackground = r1
                        org.threeten.bp.OffsetDateTime r1 = r9.setChecked
                        if (r1 == 0) goto L_0x0180
                        org.threeten.bp.OffsetDateTime r1 = r9.setChecked
                        java.lang.String r6 = "dd MMM yyyy"
                        java.lang.String r1 = r8.IconCompatParcelizer((java.lang.String) r6, (org.threeten.p041bp.OffsetDateTime) r1)
                        goto L_0x0181
                    L_0x0180:
                        r1 = 0
                    L_0x0181:
                        r0.setPrimaryBackground = r1
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        if (r1 == 0) goto L_0x0197
                        boolean r6 = r1.isEmpty()
                        if (r6 != 0) goto L_0x0197
                        java.lang.String r6 = "DEEJUNG_INSTALLMENT"
                        boolean r1 = r1.contains(r6)
                        if (r1 == 0) goto L_0x0197
                        r1 = r5
                        goto L_0x0198
                    L_0x0197:
                        r1 = r4
                    L_0x0198:
                        java.lang.String r6 = "DEEJUNG_INSTALLMENT_DISABLED"
                        if (r1 != 0) goto L_0x01b3
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        if (r1 == 0) goto L_0x01ae
                        boolean r7 = r1.isEmpty()
                        if (r7 != 0) goto L_0x01ae
                        boolean r1 = r1.contains(r6)
                        if (r1 == 0) goto L_0x01ae
                        r1 = r5
                        goto L_0x01af
                    L_0x01ae:
                        r1 = r4
                    L_0x01af:
                        if (r1 != 0) goto L_0x01b3
                        r1 = r4
                        goto L_0x01b4
                    L_0x01b3:
                        r1 = r5
                    L_0x01b4:
                        r0.setForceShowIcon = r1
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        if (r1 == 0) goto L_0x01c8
                        boolean r7 = r1.isEmpty()
                        if (r7 != 0) goto L_0x01c8
                        boolean r1 = r1.contains(r6)
                        if (r1 == 0) goto L_0x01c8
                        r1 = r5
                        goto L_0x01c9
                    L_0x01c8:
                        r1 = r4
                    L_0x01c9:
                        r0.setContentView = r1
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        if (r1 == 0) goto L_0x01df
                        boolean r6 = r1.isEmpty()
                        if (r6 != 0) goto L_0x01df
                        java.lang.String r6 = "DEEJUNG_TRANSFER"
                        boolean r1 = r1.contains(r6)
                        if (r1 == 0) goto L_0x01df
                        r1 = r5
                        goto L_0x01e0
                    L_0x01df:
                        r1 = r4
                    L_0x01e0:
                        java.lang.String r6 = "DEEJUNG_TRANSFER_DISABLED"
                        if (r1 != 0) goto L_0x01fb
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        if (r1 == 0) goto L_0x01f6
                        boolean r7 = r1.isEmpty()
                        if (r7 != 0) goto L_0x01f6
                        boolean r1 = r1.contains(r6)
                        if (r1 == 0) goto L_0x01f6
                        r1 = r5
                        goto L_0x01f7
                    L_0x01f6:
                        r1 = r4
                    L_0x01f7:
                        if (r1 != 0) goto L_0x01fb
                        r1 = r4
                        goto L_0x01fc
                    L_0x01fb:
                        r1 = r5
                    L_0x01fc:
                        r0.ListMenuItemView = r1
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        if (r1 == 0) goto L_0x0210
                        boolean r7 = r1.isEmpty()
                        if (r7 != 0) goto L_0x0210
                        boolean r1 = r1.contains(r6)
                        if (r1 == 0) goto L_0x0210
                        r1 = r5
                        goto L_0x0211
                    L_0x0210:
                        r1 = r4
                    L_0x0211:
                        r0.setBackgroundResource = r1
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        if (r1 == 0) goto L_0x0227
                        boolean r6 = r1.isEmpty()
                        if (r6 != 0) goto L_0x0227
                        java.lang.String r6 = "TEMP_CREDIT_LIMIT"
                        boolean r1 = r1.contains(r6)
                        if (r1 == 0) goto L_0x0227
                        r1 = r5
                        goto L_0x0228
                    L_0x0227:
                        r1 = r4
                    L_0x0228:
                        java.lang.String r6 = "TEMP_CREDIT_LIMIT_DISABLED"
                        if (r1 != 0) goto L_0x0244
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        if (r1 == 0) goto L_0x023e
                        boolean r7 = r1.isEmpty()
                        if (r7 != 0) goto L_0x023e
                        boolean r1 = r1.contains(r6)
                        if (r1 == 0) goto L_0x023e
                        r1 = r5
                        goto L_0x023f
                    L_0x023e:
                        r1 = r4
                    L_0x023f:
                        if (r1 == 0) goto L_0x0242
                        goto L_0x0244
                    L_0x0242:
                        r1 = r4
                        goto L_0x0245
                    L_0x0244:
                        r1 = r5
                    L_0x0245:
                        r0.setVisibility = r1
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        if (r1 == 0) goto L_0x0259
                        boolean r7 = r1.isEmpty()
                        if (r7 != 0) goto L_0x0259
                        boolean r1 = r1.contains(r6)
                        if (r1 == 0) goto L_0x0259
                        r1 = r5
                        goto L_0x025a
                    L_0x0259:
                        r1 = r4
                    L_0x025a:
                        r0.AppCompatDialogFragment = r1
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        if (r1 == 0) goto L_0x0270
                        boolean r6 = r1.isEmpty()
                        if (r6 != 0) goto L_0x0270
                        java.lang.String r6 = "E_STATEMENT_EMAIL"
                        boolean r1 = r1.contains(r6)
                        if (r1 == 0) goto L_0x0270
                        r1 = r5
                        goto L_0x0271
                    L_0x0270:
                        r1 = r4
                    L_0x0271:
                        r0.setTitle = r1
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        if (r1 == 0) goto L_0x0287
                        boolean r6 = r1.isEmpty()
                        if (r6 != 0) goto L_0x0287
                        java.lang.String r6 = "E_STATEMENT_CHANNEL"
                        boolean r1 = r1.contains(r6)
                        if (r1 == 0) goto L_0x0287
                        r1 = r5
                        goto L_0x0288
                    L_0x0287:
                        r1 = r4
                    L_0x0288:
                        r0.setContentHeight = r1
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        if (r1 == 0) goto L_0x029d
                        boolean r6 = r1.isEmpty()
                        if (r6 != 0) goto L_0x029d
                        java.lang.String r6 = "REWARD_REDEMPTION"
                        boolean r1 = r1.contains(r6)
                        if (r1 == 0) goto L_0x029d
                        r4 = r5
                    L_0x029d:
                        r0.ExpandedMenuView = r4
                        java.lang.String r1 = r9.RatingCompat
                        r0.MediaBrowserCompat$MediaItem = r1
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        r0.read = r1
                        org.threeten.bp.OffsetDateTime r1 = r9.setBackgroundResource
                        if (r1 != 0) goto L_0x02ac
                        goto L_0x02b2
                    L_0x02ac:
                        org.threeten.bp.OffsetDateTime r9 = r9.setBackgroundResource
                        java.lang.String r2 = r8.IconCompatParcelizer((java.lang.String) r3, (org.threeten.p041bp.OffsetDateTime) r9)
                    L_0x02b2:
                        r0.AbsActionBarView = r2
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p040o.MapConstraints.ConstrainedMultimap.C36361.MediaBrowserCompat$CustomActionResultReceiver(o.zzsf):o.chain");
                }

                public final List<chain> MediaBrowserCompat$ItemReceiver(List<zzsf> list) {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (zzsf MediaBrowserCompat$CustomActionResultReceiver : list) {
                        arrayList.add(MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver));
                    }
                    return arrayList;
                }
            };
        }

        public final /* synthetic */ Object get() {
            HmlReviewDocumentActivity hmlReviewDocumentActivity = null;
            return new SignedBytes.LexicographicalComparator((Resources) hmlReviewDocumentActivity.get(), (SharedPreferences) hmlReviewDocumentActivity.get(), (String) hmlReviewDocumentActivity.get()) {
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final p040o.chain MediaBrowserCompat$CustomActionResultReceiver(p040o.zzsf r9) {
                    /*
                        r8 = this;
                        o.chain r0 = p040o.chain.MediaBrowserCompat$ItemReceiver()
                        o.zzvj r1 = r9.IconCompatParcelizer()
                        if (r1 == 0) goto L_0x0011
                        o.zzvj r1 = r9.IconCompatParcelizer()
                        java.lang.String r1 = r1.MediaBrowserCompat$ItemReceiver
                        goto L_0x0013
                    L_0x0011:
                        java.lang.String r1 = "error"
                    L_0x0013:
                        java.lang.String r2 = "1000"
                        boolean r1 = r2.equals(r1)
                        r0.write = r1
                        java.lang.String r1 = r9.read
                        r0.MediaDescriptionCompat = r1
                        org.threeten.bp.OffsetDateTime r1 = r9.setCheckable
                        java.lang.String r2 = "-"
                        java.lang.String r3 = "dd MMM"
                        if (r1 != 0) goto L_0x0029
                        r1 = r2
                        goto L_0x002f
                    L_0x0029:
                        org.threeten.bp.OffsetDateTime r1 = r9.setCheckable
                        java.lang.String r1 = r8.IconCompatParcelizer((java.lang.String) r3, (org.threeten.p041bp.OffsetDateTime) r1)
                    L_0x002f:
                        r0.MenuItemImpl = r1
                        org.threeten.bp.OffsetDateTime r1 = r9.MediaSessionCompat$Token
                        if (r1 == 0) goto L_0x003a
                        org.threeten.bp.OffsetDateTime r1 = r9.MediaSessionCompat$Token
                        r8.IconCompatParcelizer((java.lang.String) r3, (org.threeten.p041bp.OffsetDateTime) r1)
                    L_0x003a:
                        java.lang.Double r1 = r9.AppCompatActivity
                        java.lang.String r1 = write((java.lang.Double) r1)
                        r0.MenuItemWrapperICS$CollapsibleActionViewWrapper = r1
                        java.lang.Double r1 = r9.MediaSessionCompat$ResultReceiverWrapper
                        java.lang.String r1 = write((java.lang.Double) r1)
                        r0.PlaybackStateCompat = r1
                        java.lang.String r1 = r9.AppCompatDelegateImpl$ListMenuDecorView
                        r0.setPopupCallback = r1
                        java.lang.Double r1 = r9.write
                        java.lang.String r1 = write((java.lang.Double) r1)
                        r0.MediaBrowserCompat$CustomActionResultReceiver = r1
                        java.lang.Double r1 = r9.MediaSessionCompat$QueueItem
                        java.lang.String r1 = write((java.lang.Double) r1)
                        r0.Keep = r1
                        java.lang.Double r1 = r9.ParcelableVolumeInfo
                        java.lang.String r1 = write((java.lang.Double) r1)
                        r0.setHasDecor = r1
                        java.lang.Double r1 = r9.setHasDecor
                        java.lang.String r1 = write((java.lang.Double) r1)
                        r0.setIcon = r1
                        java.lang.Double r1 = r9.ParcelableVolumeInfo
                        java.lang.Double r4 = r9.MediaSessionCompat$QueueItem
                        java.lang.Integer r1 = MediaBrowserCompat$ItemReceiver((java.lang.Double) r1, (java.lang.Double) r4)
                        int r1 = r1.intValue()
                        r0.PlaybackStateCompat$CustomAction = r1
                        java.lang.String r1 = r9.AlertController$RecycleListView
                        r4 = 0
                        r5 = 1
                        if (r1 == 0) goto L_0x008a
                        int r1 = r1.length()
                        if (r1 == 0) goto L_0x008a
                        r1 = r4
                        goto L_0x008b
                    L_0x008a:
                        r1 = r5
                    L_0x008b:
                        if (r1 != 0) goto L_0x0090
                        java.lang.String r1 = r9.AlertController$RecycleListView
                        goto L_0x0092
                    L_0x0090:
                        java.lang.String r1 = r9.setContentView
                    L_0x0092:
                        r0.AppCompatViewInflater = r1
                        java.lang.String r1 = r9.AlertController$RecycleListView
                        if (r1 == 0) goto L_0x00a0
                        int r1 = r1.length()
                        if (r1 == 0) goto L_0x00a0
                        r1 = r4
                        goto L_0x00a1
                    L_0x00a0:
                        r1 = r5
                    L_0x00a1:
                        if (r1 != 0) goto L_0x00a6
                        java.lang.String r1 = r9.AlertController$RecycleListView
                        goto L_0x00a8
                    L_0x00a6:
                        java.lang.String r1 = ""
                    L_0x00a8:
                        r0.setCheckable = r1
                        o.zzvz r1 = r9.PlaybackStateCompat
                        o.zzvz r6 = p040o.zzvz.PARTIAL
                        if (r1 == r6) goto L_0x00b3
                        int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.amount_due
                        goto L_0x00b5
                    L_0x00b3:
                        int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.remaining_due
                    L_0x00b5:
                        android.content.res.Resources r6 = r8.MediaBrowserCompat$CustomActionResultReceiver
                        java.lang.String r1 = r6.getString(r1)
                        r0.setChecked = r1
                        o.zzvz r1 = r9.PlaybackStateCompat
                        o.zzvz r6 = p040o.zzvz.PAID
                        if (r1 == r6) goto L_0x00cc
                        o.zzvz r1 = r9.PlaybackStateCompat
                        o.zzvz r6 = p040o.zzvz.OVERPAID
                        if (r1 == r6) goto L_0x00cc
                        int r1 = p040o.Iterables$3$MediaBrowserCompat$ItemReceiver.ic_bill_credit_card
                        goto L_0x00ce
                    L_0x00cc:
                        int r1 = p040o.Iterables$3$MediaBrowserCompat$ItemReceiver.ic_check_circle_black_48dp
                    L_0x00ce:
                        r0.AppCompatDelegateImpl$ListMenuDecorView = r1
                        o.zzvz r1 = r9.PlaybackStateCompat
                        o.zzvz r6 = p040o.zzvz.PAID
                        if (r1 == r6) goto L_0x00de
                        o.zzvz r1 = r9.PlaybackStateCompat
                        o.zzvz r6 = p040o.zzvz.OVERPAID
                        if (r1 == r6) goto L_0x00de
                        r1 = r4
                        goto L_0x00df
                    L_0x00de:
                        r1 = r5
                    L_0x00df:
                        r0.setExpandedFormat = r1
                        java.lang.String r1 = r9.MediaMetadataCompat
                        if (r1 == 0) goto L_0x00ea
                        java.lang.String r1 = r9.MediaMetadataCompat
                        java.lang.String r6 = r9.MediaMetadataCompat
                        goto L_0x00ee
                    L_0x00ea:
                        java.lang.String r1 = r9.read
                        java.lang.String r6 = r9.read
                    L_0x00ee:
                        int r6 = r6.length()
                        r7 = 4
                        int r6 = r6 - r7
                        java.lang.String r1 = r1.substring(r6)
                        r0.f2806x50fd9e4a = r1
                        java.lang.String r1 = r9.MediaMetadataCompat
                        if (r1 == 0) goto L_0x0101
                        java.lang.String r1 = r9.MediaMetadataCompat
                        goto L_0x0103
                    L_0x0101:
                        java.lang.String r1 = r9.read
                    L_0x0103:
                        java.lang.String r1 = r1.substring(r4, r7)
                        r0.MediaBrowserCompat$SearchResultReceiver = r1
                        java.lang.String r1 = r9.MediaMetadataCompat
                        if (r1 == 0) goto L_0x0110
                        java.lang.String r1 = r9.MediaMetadataCompat
                        goto L_0x0112
                    L_0x0110:
                        java.lang.String r1 = r9.read
                    L_0x0112:
                        r6 = 6
                        java.lang.String r1 = r1.substring(r7, r6)
                        r0.MediaSessionCompat$QueueItem = r1
                        java.lang.String r1 = r9.read
                        java.lang.String r6 = r9.MediaMetadataCompat
                        java.lang.String r1 = p040o.getICheckDeserializerRtti.IconCompatParcelizer(r1, r6)
                        r0.MediaSessionCompat$Token = r1
                        java.lang.String r1 = r9.MediaBrowserCompat$MediaItem
                        java.lang.String r1 = r8.mo26549c_(r1)
                        r0.MediaSessionCompat$ResultReceiverWrapper = r1
                        java.lang.String r1 = r9.PlaybackStateCompat$CustomAction
                        r0.setShortcut = r1
                        java.lang.String r1 = r9.MediaBrowserCompat$ItemReceiver
                        r0.MediaMetadataCompat = r1
                        int r1 = r9.AppCompatDialogFragment
                        if (r5 == r1) goto L_0x0139
                        r1 = r4
                        goto L_0x013a
                    L_0x0139:
                        r1 = r5
                    L_0x013a:
                        r0.ActionMenuItemView = r1
                        java.lang.String r1 = r9.MediaBrowserCompat$SearchResultReceiver
                        if (r1 == 0) goto L_0x0143
                        java.lang.String r1 = r9.MediaBrowserCompat$SearchResultReceiver
                        goto L_0x0145
                    L_0x0143:
                        java.lang.String r1 = "NORMAL"
                    L_0x0145:
                        r0.ParcelableVolumeInfo = r1
                        java.lang.String r1 = r9.AppCompatViewInflater
                        r0.ActionBarContainer = r1
                        java.lang.String r1 = r9.setContentView
                        r0.setItemInvoker = r1
                        double r6 = r9.ActionMenuItemView
                        java.lang.Double r1 = java.lang.Double.valueOf(r6)
                        java.lang.String r1 = write((java.lang.Double) r1)
                        r0.setTabContainer = r1
                        java.lang.String r1 = r9.f3000x50fd9e4a
                        r0.AppCompatActivity = r1
                        java.lang.String r1 = r9.Keep
                        r0.setPadding = r1
                        java.lang.String r1 = r9.MediaDescriptionCompat
                        r0.AlertController$RecycleListView = r1
                        int r1 = r9.setPopupCallback
                        r0.setSplitBackground = r1
                        java.lang.Double r1 = r9.setExpandedFormat
                        java.lang.String r1 = write((java.lang.Double) r1)
                        r0.setStackedBackground = r1
                        org.threeten.bp.OffsetDateTime r1 = r9.setChecked
                        if (r1 == 0) goto L_0x0180
                        org.threeten.bp.OffsetDateTime r1 = r9.setChecked
                        java.lang.String r6 = "dd MMM yyyy"
                        java.lang.String r1 = r8.IconCompatParcelizer((java.lang.String) r6, (org.threeten.p041bp.OffsetDateTime) r1)
                        goto L_0x0181
                    L_0x0180:
                        r1 = 0
                    L_0x0181:
                        r0.setPrimaryBackground = r1
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        if (r1 == 0) goto L_0x0197
                        boolean r6 = r1.isEmpty()
                        if (r6 != 0) goto L_0x0197
                        java.lang.String r6 = "DEEJUNG_INSTALLMENT"
                        boolean r1 = r1.contains(r6)
                        if (r1 == 0) goto L_0x0197
                        r1 = r5
                        goto L_0x0198
                    L_0x0197:
                        r1 = r4
                    L_0x0198:
                        java.lang.String r6 = "DEEJUNG_INSTALLMENT_DISABLED"
                        if (r1 != 0) goto L_0x01b3
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        if (r1 == 0) goto L_0x01ae
                        boolean r7 = r1.isEmpty()
                        if (r7 != 0) goto L_0x01ae
                        boolean r1 = r1.contains(r6)
                        if (r1 == 0) goto L_0x01ae
                        r1 = r5
                        goto L_0x01af
                    L_0x01ae:
                        r1 = r4
                    L_0x01af:
                        if (r1 != 0) goto L_0x01b3
                        r1 = r4
                        goto L_0x01b4
                    L_0x01b3:
                        r1 = r5
                    L_0x01b4:
                        r0.setForceShowIcon = r1
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        if (r1 == 0) goto L_0x01c8
                        boolean r7 = r1.isEmpty()
                        if (r7 != 0) goto L_0x01c8
                        boolean r1 = r1.contains(r6)
                        if (r1 == 0) goto L_0x01c8
                        r1 = r5
                        goto L_0x01c9
                    L_0x01c8:
                        r1 = r4
                    L_0x01c9:
                        r0.setContentView = r1
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        if (r1 == 0) goto L_0x01df
                        boolean r6 = r1.isEmpty()
                        if (r6 != 0) goto L_0x01df
                        java.lang.String r6 = "DEEJUNG_TRANSFER"
                        boolean r1 = r1.contains(r6)
                        if (r1 == 0) goto L_0x01df
                        r1 = r5
                        goto L_0x01e0
                    L_0x01df:
                        r1 = r4
                    L_0x01e0:
                        java.lang.String r6 = "DEEJUNG_TRANSFER_DISABLED"
                        if (r1 != 0) goto L_0x01fb
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        if (r1 == 0) goto L_0x01f6
                        boolean r7 = r1.isEmpty()
                        if (r7 != 0) goto L_0x01f6
                        boolean r1 = r1.contains(r6)
                        if (r1 == 0) goto L_0x01f6
                        r1 = r5
                        goto L_0x01f7
                    L_0x01f6:
                        r1 = r4
                    L_0x01f7:
                        if (r1 != 0) goto L_0x01fb
                        r1 = r4
                        goto L_0x01fc
                    L_0x01fb:
                        r1 = r5
                    L_0x01fc:
                        r0.ListMenuItemView = r1
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        if (r1 == 0) goto L_0x0210
                        boolean r7 = r1.isEmpty()
                        if (r7 != 0) goto L_0x0210
                        boolean r1 = r1.contains(r6)
                        if (r1 == 0) goto L_0x0210
                        r1 = r5
                        goto L_0x0211
                    L_0x0210:
                        r1 = r4
                    L_0x0211:
                        r0.setBackgroundResource = r1
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        if (r1 == 0) goto L_0x0227
                        boolean r6 = r1.isEmpty()
                        if (r6 != 0) goto L_0x0227
                        java.lang.String r6 = "TEMP_CREDIT_LIMIT"
                        boolean r1 = r1.contains(r6)
                        if (r1 == 0) goto L_0x0227
                        r1 = r5
                        goto L_0x0228
                    L_0x0227:
                        r1 = r4
                    L_0x0228:
                        java.lang.String r6 = "TEMP_CREDIT_LIMIT_DISABLED"
                        if (r1 != 0) goto L_0x0244
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        if (r1 == 0) goto L_0x023e
                        boolean r7 = r1.isEmpty()
                        if (r7 != 0) goto L_0x023e
                        boolean r1 = r1.contains(r6)
                        if (r1 == 0) goto L_0x023e
                        r1 = r5
                        goto L_0x023f
                    L_0x023e:
                        r1 = r4
                    L_0x023f:
                        if (r1 == 0) goto L_0x0242
                        goto L_0x0244
                    L_0x0242:
                        r1 = r4
                        goto L_0x0245
                    L_0x0244:
                        r1 = r5
                    L_0x0245:
                        r0.setVisibility = r1
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        if (r1 == 0) goto L_0x0259
                        boolean r7 = r1.isEmpty()
                        if (r7 != 0) goto L_0x0259
                        boolean r1 = r1.contains(r6)
                        if (r1 == 0) goto L_0x0259
                        r1 = r5
                        goto L_0x025a
                    L_0x0259:
                        r1 = r4
                    L_0x025a:
                        r0.AppCompatDialogFragment = r1
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        if (r1 == 0) goto L_0x0270
                        boolean r6 = r1.isEmpty()
                        if (r6 != 0) goto L_0x0270
                        java.lang.String r6 = "E_STATEMENT_EMAIL"
                        boolean r1 = r1.contains(r6)
                        if (r1 == 0) goto L_0x0270
                        r1 = r5
                        goto L_0x0271
                    L_0x0270:
                        r1 = r4
                    L_0x0271:
                        r0.setTitle = r1
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        if (r1 == 0) goto L_0x0287
                        boolean r6 = r1.isEmpty()
                        if (r6 != 0) goto L_0x0287
                        java.lang.String r6 = "E_STATEMENT_CHANNEL"
                        boolean r1 = r1.contains(r6)
                        if (r1 == 0) goto L_0x0287
                        r1 = r5
                        goto L_0x0288
                    L_0x0287:
                        r1 = r4
                    L_0x0288:
                        r0.setContentHeight = r1
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        if (r1 == 0) goto L_0x029d
                        boolean r6 = r1.isEmpty()
                        if (r6 != 0) goto L_0x029d
                        java.lang.String r6 = "REWARD_REDEMPTION"
                        boolean r1 = r1.contains(r6)
                        if (r1 == 0) goto L_0x029d
                        r4 = r5
                    L_0x029d:
                        r0.ExpandedMenuView = r4
                        java.lang.String r1 = r9.RatingCompat
                        r0.MediaBrowserCompat$MediaItem = r1
                        java.util.ArrayList<java.lang.String> r1 = r9.MediaBrowserCompat$CustomActionResultReceiver
                        r0.read = r1
                        org.threeten.bp.OffsetDateTime r1 = r9.setBackgroundResource
                        if (r1 != 0) goto L_0x02ac
                        goto L_0x02b2
                    L_0x02ac:
                        org.threeten.bp.OffsetDateTime r9 = r9.setBackgroundResource
                        java.lang.String r2 = r8.IconCompatParcelizer((java.lang.String) r3, (org.threeten.p041bp.OffsetDateTime) r9)
                    L_0x02b2:
                        r0.AbsActionBarView = r2
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p040o.MapConstraints.ConstrainedMultimap.C36361.MediaBrowserCompat$CustomActionResultReceiver(o.zzsf):o.chain");
                }

                public final List<chain> MediaBrowserCompat$ItemReceiver(List<zzsf> list) {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (zzsf MediaBrowserCompat$CustomActionResultReceiver : list) {
                        arrayList.add(MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver));
                    }
                    return arrayList;
                }
            };
        }
    }

    /* renamed from: o.MapConstraints$ConstrainedSortedSetMultimap */
    public final class ConstrainedSortedSetMultimap implements OPRStatusRewardsLandingActivity_ViewBinding<NotNullMapConstraint> {
        public static NotNullMapConstraint MediaBrowserCompat$CustomActionResultReceiver(Resources resources, SignedBytes.LexicographicalComparator lexicographicalComparator, SharedPreferences sharedPreferences) {
            return new NotNullMapConstraint(resources, lexicographicalComparator, sharedPreferences);
        }

        public final /* synthetic */ Object get() {
            HmlReviewDocumentActivity hmlReviewDocumentActivity = null;
            return new NotNullMapConstraint((Resources) hmlReviewDocumentActivity.get(), (SignedBytes.LexicographicalComparator) hmlReviewDocumentActivity.get(), (SharedPreferences) hmlReviewDocumentActivity.get());
        }
    }

    /* renamed from: o.MapConstraints$InverseConstraint */
    public final class InverseConstraint implements OPRStatusRewardsLandingActivity_ViewBinding<ConstrainedSetMultimap> {
        public static ConstrainedSetMultimap read(Resources resources, SharedPreferences sharedPreferences, entriesInCommon entriesincommon) {
            return new ConstrainedSetMultimap(resources, sharedPreferences, entriesincommon);
        }

        public final /* synthetic */ Object get() {
            HmlReviewDocumentActivity hmlReviewDocumentActivity = null;
            return new ConstrainedSetMultimap((Resources) hmlReviewDocumentActivity.get(), (SharedPreferences) hmlReviewDocumentActivity.get(), (entriesInCommon) hmlReviewDocumentActivity.get());
        }
    }

    /* renamed from: o.MapConstraints$ConstrainedSetMultimap */
    public final class ConstrainedSetMultimap extends constrainedSortedSetMultimap<write, immediateCheckedFuture> {
        private final entriesInCommon read;

        @HmlPinActivity
        ConstrainedSetMultimap(Resources resources, SharedPreferences sharedPreferences, entriesInCommon entriesincommon) {
            super(resources, sharedPreferences);
            this.read = entriesincommon;
        }

        /* renamed from: o.MapConstraints$ConstrainedSetMultimap$write */
        public class write implements proxyGetICheckDetector, AppCompatButton.read {
            final RectF read = new RectF();

            public void MediaBrowserCompat$ItemReceiver(CheckCaptureModule_GetICheckDetectorFactory checkCaptureModule_GetICheckDetectorFactory) {
            }

            private AppCompatButton IconCompatParcelizer(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
                return new AppCompatButton(context.getResources(), colorStateList, f, f2, f3);
            }

            private AppCompatButton IconCompatParcelizer(CheckCaptureModule_GetICheckDetectorFactory checkCaptureModule_GetICheckDetectorFactory) {
                return (AppCompatButton) checkCaptureModule_GetICheckDetectorFactory.IconCompatParcelizer();
            }

            public float MediaBrowserCompat$CustomActionResultReceiver(CheckCaptureModule_GetICheckDetectorFactory checkCaptureModule_GetICheckDetectorFactory) {
                AppCompatButton IconCompatParcelizer = IconCompatParcelizer(checkCaptureModule_GetICheckDetectorFactory);
                float f = IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
                return (Math.max(f, IconCompatParcelizer.write + ((float) IconCompatParcelizer.IconCompatParcelizer) + ((f * 1.5f) / 2.0f)) * 2.0f) + (((IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver * 1.5f) + ((float) IconCompatParcelizer.IconCompatParcelizer)) * 2.0f);
            }

            public float read(CheckCaptureModule_GetICheckDetectorFactory checkCaptureModule_GetICheckDetectorFactory) {
                AppCompatButton IconCompatParcelizer = IconCompatParcelizer(checkCaptureModule_GetICheckDetectorFactory);
                float f = IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
                return (Math.max(f, IconCompatParcelizer.write + ((float) IconCompatParcelizer.IconCompatParcelizer) + (f / 2.0f)) * 2.0f) + ((IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver + ((float) IconCompatParcelizer.IconCompatParcelizer)) * 2.0f);
            }

            public void write() {
                AppCompatButton.MediaBrowserCompat$CustomActionResultReceiver = this;
            }

            public void MediaBrowserCompat$CustomActionResultReceiver(CheckCaptureModule_GetICheckDetectorFactory checkCaptureModule_GetICheckDetectorFactory, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
                AppCompatButton IconCompatParcelizer = IconCompatParcelizer(context, colorStateList, f, f2, f3);
                IconCompatParcelizer.read = checkCaptureModule_GetICheckDetectorFactory.read();
                IconCompatParcelizer.invalidateSelf();
                checkCaptureModule_GetICheckDetectorFactory.IconCompatParcelizer(IconCompatParcelizer);
                MediaBrowserCompat$SearchResultReceiver(checkCaptureModule_GetICheckDetectorFactory);
            }

            public void MediaDescriptionCompat(CheckCaptureModule_GetICheckDetectorFactory checkCaptureModule_GetICheckDetectorFactory) {
                AppCompatButton IconCompatParcelizer = IconCompatParcelizer(checkCaptureModule_GetICheckDetectorFactory);
                IconCompatParcelizer.read = checkCaptureModule_GetICheckDetectorFactory.read();
                IconCompatParcelizer.invalidateSelf();
                MediaBrowserCompat$SearchResultReceiver(checkCaptureModule_GetICheckDetectorFactory);
            }

            public void MediaBrowserCompat$CustomActionResultReceiver(CheckCaptureModule_GetICheckDetectorFactory checkCaptureModule_GetICheckDetectorFactory, ColorStateList colorStateList) {
                AppCompatButton IconCompatParcelizer = IconCompatParcelizer(checkCaptureModule_GetICheckDetectorFactory);
                IconCompatParcelizer.read(colorStateList);
                IconCompatParcelizer.invalidateSelf();
            }

            public void read(CheckCaptureModule_GetICheckDetectorFactory checkCaptureModule_GetICheckDetectorFactory, float f) {
                AppCompatButton IconCompatParcelizer = IconCompatParcelizer(checkCaptureModule_GetICheckDetectorFactory);
                IconCompatParcelizer.read(f, IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver);
            }

            public void write(CheckCaptureModule_GetICheckDetectorFactory checkCaptureModule_GetICheckDetectorFactory, float f) {
                AppCompatButton IconCompatParcelizer = IconCompatParcelizer(checkCaptureModule_GetICheckDetectorFactory);
                IconCompatParcelizer.read(IconCompatParcelizer.MediaMetadataCompat, f);
                MediaBrowserCompat$SearchResultReceiver(checkCaptureModule_GetICheckDetectorFactory);
            }

            public void IconCompatParcelizer(CheckCaptureModule_GetICheckDetectorFactory checkCaptureModule_GetICheckDetectorFactory, float f) {
                AppCompatButton IconCompatParcelizer = IconCompatParcelizer(checkCaptureModule_GetICheckDetectorFactory);
                if (f >= BitmapDescriptorFactory.HUE_RED) {
                    float f2 = (float) ((int) (f + 0.5f));
                    if (IconCompatParcelizer.write != f2) {
                        IconCompatParcelizer.write = f2;
                        IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = true;
                        IconCompatParcelizer.invalidateSelf();
                    }
                    MediaBrowserCompat$SearchResultReceiver(checkCaptureModule_GetICheckDetectorFactory);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid radius ");
                sb.append(f);
                sb.append(". Must be >= 0");
                throw new IllegalArgumentException(sb.toString());
            }

            public void MediaBrowserCompat$SearchResultReceiver(CheckCaptureModule_GetICheckDetectorFactory checkCaptureModule_GetICheckDetectorFactory) {
                Rect rect = new Rect();
                IconCompatParcelizer(checkCaptureModule_GetICheckDetectorFactory).getPadding(rect);
                checkCaptureModule_GetICheckDetectorFactory.write((int) Math.ceil((double) read(checkCaptureModule_GetICheckDetectorFactory)), (int) Math.ceil((double) MediaBrowserCompat$CustomActionResultReceiver(checkCaptureModule_GetICheckDetectorFactory)));
                checkCaptureModule_GetICheckDetectorFactory.read(rect.left, rect.top, rect.right, rect.bottom);
            }

            public void read(Canvas canvas, RectF rectF, float f, Paint paint) {
                Canvas canvas2 = canvas;
                RectF rectF2 = rectF;
                float f2 = f * 2.0f;
                float width = (rectF.width() - f2) - 1.0f;
                float height = rectF.height();
                if (f >= 1.0f) {
                    float f3 = f + 0.5f;
                    float f4 = -f3;
                    this.read.set(f4, f4, f3, f3);
                    int save = canvas.save();
                    canvas2.translate(rectF2.left + f3, rectF2.top + f3);
                    Canvas canvas3 = canvas;
                    canvas3.drawArc(this.read, 180.0f, 90.0f, true, paint);
                    canvas2.translate(width, BitmapDescriptorFactory.HUE_RED);
                    canvas2.rotate(90.0f);
                    Paint paint2 = paint;
                    canvas3.drawArc(this.read, 180.0f, 90.0f, true, paint2);
                    canvas2.translate((height - f2) - 1.0f, BitmapDescriptorFactory.HUE_RED);
                    canvas2.rotate(90.0f);
                    canvas3.drawArc(this.read, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(width, BitmapDescriptorFactory.HUE_RED);
                    canvas2.rotate(90.0f);
                    canvas3.drawArc(this.read, 180.0f, 90.0f, true, paint2);
                    canvas2.restoreToCount(save);
                    canvas.drawRect((rectF2.left + f3) - 1.0f, rectF2.top, (rectF2.right - f3) + 1.0f, rectF2.top + f3, paint2);
                    canvas.drawRect((rectF2.left + f3) - 1.0f, rectF2.bottom - f3, (rectF2.right - f3) + 1.0f, rectF2.bottom, paint2);
                }
                canvas.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:101:0x01b5  */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x01cd  */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x0215  */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x021c  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0075  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00ae  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00b3  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00c0  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00ce  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x00d0  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00d3  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0115  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0131  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0138  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x0193  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x019f  */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x01a8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p040o.immediateCheckedFuture IconCompatParcelizer(java.util.List<p040o.zzup> r23, p040o.zzvo r24, boolean r25) {
            /*
                r22 = this;
                r0 = r22
                r1 = r23
                r2 = r24
                java.lang.String r3 = r2.write
                r6 = 0
                if (r1 == 0) goto L_0x0055
                if (r3 != 0) goto L_0x000e
                goto L_0x0055
            L_0x000e:
                o.show r7 = new o.show
                r7.<init>(r1)
                o.MapConstraints$ConstrainedBiMap r1 = new o.MapConstraints$ConstrainedBiMap
                r1.<init>(r3)
                o.show r3 = new o.show
                o.AppCompatSeekBar r8 = r7.write
                o.getNextTransition r9 = new o.getNextTransition
                java.util.Iterator<? extends T> r7 = r7.IconCompatParcelizer
                r9.<init>(r7, r1)
                r3.<init>(r8, r9)
                java.util.Iterator<? extends T> r1 = r3.IconCompatParcelizer
                boolean r1 = r1.hasNext()
                if (r1 == 0) goto L_0x0039
                java.util.Iterator<? extends T> r1 = r3.IconCompatParcelizer
                java.lang.Object r1 = r1.next()
                o.isSupportFragmentClass r1 = p040o.isSupportFragmentClass.read(r1)
                goto L_0x003d
            L_0x0039:
                o.isSupportFragmentClass r1 = p040o.isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver()
            L_0x003d:
                T r3 = r1.IconCompatParcelizer
                if (r3 == 0) goto L_0x0043
                r3 = 1
                goto L_0x0044
            L_0x0043:
                r3 = r6
            L_0x0044:
                if (r3 == 0) goto L_0x0055
                T r1 = r1.IconCompatParcelizer
                if (r1 == 0) goto L_0x004d
                o.zzup r1 = (p040o.zzup) r1
                goto L_0x0056
            L_0x004d:
                java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
                java.lang.String r2 = "No value present"
                r1.<init>(r2)
                throw r1
            L_0x0055:
                r1 = 0
            L_0x0056:
                if (r1 != 0) goto L_0x005a
                r1 = 0
                goto L_0x005c
            L_0x005a:
                java.lang.String r1 = r1.MediaBrowserCompat$ItemReceiver
            L_0x005c:
                java.util.List<java.lang.String> r3 = r2.MediaDescriptionCompat
                if (r3 != 0) goto L_0x0064
                java.util.List r3 = java.util.Collections.emptyList()
            L_0x0064:
                java.lang.String r7 = "DISPLAY_BALANCE"
                boolean r7 = r3.contains(r7)
                java.lang.String r8 = ""
                if (r7 == 0) goto L_0x0075
                java.lang.Double r7 = r2.RatingCompat
                java.lang.String r7 = write((java.lang.Double) r7)
                goto L_0x0076
            L_0x0075:
                r7 = r8
            L_0x0076:
                o.getShortName r9 = r2.f3002x50fd9e4a
                o.getShortName r10 = p040o.getShortName.TYPE_SAVING
                if (r9 == r10) goto L_0x0082
                o.getShortName r10 = p040o.getShortName.TYPE_CURRENT
                if (r9 == r10) goto L_0x0082
                r9 = r6
                goto L_0x0083
            L_0x0082:
                r9 = 1
            L_0x0083:
                if (r9 == 0) goto L_0x008f
                java.lang.String r9 = "DISPLAY_TRANSACTIONS"
                boolean r9 = r3.contains(r9)
                if (r9 != 0) goto L_0x008f
                r9 = r6
                goto L_0x0090
            L_0x008f:
                r9 = 1
            L_0x0090:
                java.lang.String r10 = "MUTUALFUND_SOURCE"
                boolean r10 = r3.contains(r10)
                java.lang.String r11 = "EXPORT_STATEMENT"
                boolean r11 = r3.contains(r11)
                java.lang.String r12 = "DISPLAY_CLOSEACCT_INFO"
                boolean r12 = r3.contains(r12)
                java.util.List<o.zzvp> r13 = r2.AlertController$RecycleListView
                if (r13 == 0) goto L_0x00b0
                java.util.List<o.zzvp> r13 = r2.AlertController$RecycleListView
                boolean r13 = r13.isEmpty()
                if (r13 != 0) goto L_0x00b0
                r13 = 1
                goto L_0x00b1
            L_0x00b0:
                r13 = r6
            L_0x00b1:
                if (r13 == 0) goto L_0x00c0
                java.util.List<o.zzvp> r14 = r2.AlertController$RecycleListView
                java.lang.Object r14 = r14.get(r6)
                o.zzvp r14 = (p040o.zzvp) r14
                java.lang.String r15 = r14.write
                java.lang.String r14 = r14.read
                goto L_0x00c2
            L_0x00c0:
                r14 = r8
                r15 = r14
            L_0x00c2:
                java.util.List<o.zzsh> r4 = r2.ParcelableVolumeInfo
                if (r4 == 0) goto L_0x00d0
                java.util.List<o.zzsh> r4 = r2.ParcelableVolumeInfo
                boolean r4 = r4.isEmpty()
                if (r4 != 0) goto L_0x00d0
                r4 = 1
                goto L_0x00d1
            L_0x00d0:
                r4 = r6
            L_0x00d1:
                if (r4 == 0) goto L_0x0103
                java.util.List<o.zzsh> r4 = r2.ParcelableVolumeInfo
                java.lang.Object r4 = r4.get(r6)
                o.zzsh r4 = (p040o.zzsh) r4
                java.lang.String r4 = r4.read
                if (r4 == 0) goto L_0x00e7
                int r4 = r4.length()
                if (r4 == 0) goto L_0x00e7
                r4 = r6
                goto L_0x00e8
            L_0x00e7:
                r4 = 1
            L_0x00e8:
                if (r4 != 0) goto L_0x0103
                java.util.List<o.zzsh> r4 = r2.ParcelableVolumeInfo
                java.lang.Object r4 = r4.get(r6)
                o.zzsh r4 = (p040o.zzsh) r4
                java.lang.String r4 = r4.MediaBrowserCompat$ItemReceiver
                if (r4 == 0) goto L_0x00fe
                int r4 = r4.length()
                if (r4 == 0) goto L_0x00fe
                r4 = r6
                goto L_0x00ff
            L_0x00fe:
                r4 = 1
            L_0x00ff:
                if (r4 != 0) goto L_0x0103
                r4 = 1
                goto L_0x0104
            L_0x0103:
                r4 = r6
            L_0x0104:
                if (r4 == 0) goto L_0x0115
                java.util.List<o.zzsh> r5 = r2.ParcelableVolumeInfo
                java.lang.Object r5 = r5.get(r6)
                o.zzsh r5 = (p040o.zzsh) r5
                java.lang.String r6 = r5.read
                java.lang.String r5 = r5.MediaBrowserCompat$ItemReceiver
                r23 = r8
                goto L_0x011a
            L_0x0115:
                r23 = r8
                r5 = r23
                r6 = r5
            L_0x011a:
                java.util.List<o.zzvq> r8 = r2.setHasDecor
                if (r8 == 0) goto L_0x0131
                java.util.List<o.zzvq> r8 = r2.setHasDecor
                r19 = r14
                o.show r14 = new o.show
                r14.<init>(r8)
                o.MapConstraints$ConstrainedEntries$1 r8 = p040o.MapConstraints.ConstrainedEntries.C36351.MediaBrowserCompat$CustomActionResultReceiver
                boolean r8 = r14.MediaBrowserCompat$ItemReceiver(r8)
                if (r8 == 0) goto L_0x0133
                r8 = 1
                goto L_0x0134
            L_0x0131:
                r19 = r14
            L_0x0133:
                r8 = 0
            L_0x0134:
                java.lang.String r14 = "1000"
                if (r8 == 0) goto L_0x0193
                r17 = r8
                o.zzsg r8 = r2.read
                if (r8 == 0) goto L_0x018e
                o.zzsg r8 = r2.read
                o.zzrm r8 = r8.RatingCompat
                if (r8 == 0) goto L_0x018e
                o.zzsg r8 = r2.read
                o.zzrm r8 = r8.RatingCompat
                java.lang.String r8 = r8.MediaBrowserCompat$CustomActionResultReceiver
                if (r8 == 0) goto L_0x018e
                o.zzsg r8 = r2.read
                r18 = r15
                o.zzrm r15 = r8.RatingCompat
                java.lang.String r15 = r15.MediaBrowserCompat$CustomActionResultReceiver
                boolean r15 = r15.equals(r14)
                if (r15 == 0) goto L_0x0185
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                r20 = r5
                android.content.res.Resources r5 = r0.MediaBrowserCompat$CustomActionResultReceiver
                r21 = r6
                int r6 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.speedy_cash_available
                java.lang.String r5 = r5.getString(r6)
                r15.append(r5)
                java.lang.String r5 = " "
                r15.append(r5)
                java.lang.Double r5 = r8.MediaBrowserCompat$CustomActionResultReceiver
                double r5 = r5.doubleValue()
                java.lang.String r5 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((double) r5)
                r15.append(r5)
                java.lang.String r8 = r15.toString()
                goto L_0x019d
            L_0x0185:
                r20 = r5
                r21 = r6
                o.zzrm r5 = r8.RatingCompat
                java.lang.String r8 = r5.read
                goto L_0x019d
            L_0x018e:
                r20 = r5
                r21 = r6
                goto L_0x0199
            L_0x0193:
                r20 = r5
                r21 = r6
                r17 = r8
            L_0x0199:
                r18 = r15
                r8 = r23
            L_0x019d:
                if (r9 == 0) goto L_0x01a8
                o.entriesInCommon r5 = r0.read
                java.util.List<o.zzvx> r6 = r2.PlaybackStateCompat$CustomAction
                java.util.List r5 = r5.MediaBrowserCompat$ItemReceiver(r6)
                goto L_0x01ad
            L_0x01a8:
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
            L_0x01ad:
                java.lang.String r6 = "DISPLAY_HELPMSG"
                boolean r15 = r3.contains(r6)
                if (r15 == 0) goto L_0x01cd
                int r15 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.custom_error_contact_call_center_title
                r23 = r8
                android.content.res.Resources r8 = r0.MediaBrowserCompat$CustomActionResultReceiver
                java.lang.String r8 = r8.getString(r15)
                int r15 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.custom_error_contact_call_center
                r16 = r8
                android.content.res.Resources r8 = r0.MediaBrowserCompat$CustomActionResultReceiver
                java.lang.String r8 = r8.getString(r15)
                r15 = r8
                r8 = r16
                goto L_0x01d1
            L_0x01cd:
                r23 = r8
                r8 = 0
                r15 = 0
            L_0x01d1:
                o.immediateCheckedFuture r0 = p040o.immediateCheckedFuture.MediaBrowserCompat$CustomActionResultReceiver()
                r16 = r13
                java.lang.String r13 = r2.write
                r0.AppCompatViewInflater = r13
                r0.MediaDescriptionCompat = r7
                r0.PlaybackStateCompat = r1
                java.lang.String r1 = r2.write
                r7 = r25
                java.lang.String r1 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r1, (boolean) r7)
                r0.MediaBrowserCompat$ItemReceiver = r1
                o.getShortName r1 = r2.f3002x50fd9e4a
                r0.setBackgroundResource = r1
                java.lang.String r1 = r2.PlaybackStateCompat
                r0.AppCompatDialogFragment = r1
                java.lang.String r1 = r2.MediaSessionCompat$Token
                r0.AppCompatActivity = r1
                java.lang.String r1 = r2.MediaSessionCompat$QueueItem
                r0.AppCompatDelegateImpl$ListMenuDecorView = r1
                java.lang.String r1 = r2.MediaSessionCompat$ResultReceiverWrapper
                r0.setContentView = r1
                o.setDimensions r1 = r2.MediaBrowserCompat$CustomActionResultReceiver
                r0.IconCompatParcelizer = r1
                java.lang.String r1 = r2.MediaBrowserCompat$MediaItem
                r0.MediaMetadataCompat = r1
                r0.setHasDecor = r5
                r0.MediaBrowserCompat$SearchResultReceiver = r9
                r0.Keep = r8
                r0.MediaSessionCompat$ResultReceiverWrapper = r15
                r0.MediaBrowserCompat$CustomActionResultReceiver = r10
                o.zzvj r1 = r24.IconCompatParcelizer()
                if (r1 == 0) goto L_0x021c
                o.zzvj r1 = r24.IconCompatParcelizer()
                java.lang.String r1 = r1.MediaBrowserCompat$ItemReceiver
                goto L_0x021e
            L_0x021c:
                java.lang.String r1 = "error"
            L_0x021e:
                boolean r1 = r14.equals(r1)
                r0.write = r1
                boolean r1 = r3.contains(r6)
                r0.PlaybackStateCompat$CustomAction = r1
                r0.RatingCompat = r11
                r0.AlertController$RecycleListView = r12
                java.util.List<java.lang.String> r1 = r2.MediaDescriptionCompat
                r0.MediaBrowserCompat$MediaItem = r1
                java.lang.String r1 = r2.write
                r0.setPopupCallback = r1
                java.lang.String r1 = r2.MediaBrowserCompat$ItemReceiver
                r0.read = r1
                r0.setCheckable = r4
                r5 = r16
                r0.setChecked = r5
                r6 = r21
                r0.ParcelableVolumeInfo = r6
                r5 = r20
                r0.f2865x50fd9e4a = r5
                r15 = r18
                r0.MediaSessionCompat$QueueItem = r15
                r14 = r19
                r0.MediaSessionCompat$Token = r14
                r1 = r17
                r0.setExpandedFormat = r1
                r8 = r23
                r0.ActionMenuItemView = r8
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.MapConstraints.ConstrainedSetMultimap.IconCompatParcelizer(java.util.List, o.zzvo, boolean):o.immediateCheckedFuture");
        }

        public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj, boolean z) {
            return IconCompatParcelizer((List<zzup>) null, (zzvo) null, z);
        }

        public final List<immediateCheckedFuture> read(List<zzvo> list, List<zzup> list2, boolean z) {
            show show = new show(list);
            return (List) new show(show.write, new getSharedElementEnterTransition(show.IconCompatParcelizer, new findFragmentByWho(list2, z) {
                private final /* synthetic */ List IconCompatParcelizer;
                private final /* synthetic */ boolean read;

                {
                    this.IconCompatParcelizer = r2;
                    this.read = r3;
                }

                public final Object IconCompatParcelizer(Object obj) {
                    return ConstrainedSetMultimap.this.IconCompatParcelizer(this.IconCompatParcelizer, (zzvo) obj, this.read);
                }
            })).write(new setupDialog.IconCompatParcelizer(new getArguments<List<T>>() {
                /*  JADX ERROR: Method generation error
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.1.read():java.lang.Object, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    */
                /*  JADX ERROR: Method generation error: Method args not loaded: o.setupDialog.1.read():java.lang.Object, class status: UNLOADED
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.1.read():java.lang.Object, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    */
                public final /* synthetic */ java.lang.Object read(
/*
Method generation error in method: o.setupDialog.1.read():java.lang.Object, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.1.read():java.lang.Object, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            }, new ensureAnimationInfo<List<T>, T>() {
                /*  JADX ERROR: Method generation error
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    */
                /*  JADX ERROR: Method generation error: Method args not loaded: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    */
                public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(
/*
Method generation error in method: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            }));
        }
    }

    /* renamed from: o.MapConstraints$ConstrainedBiMap */
    public final /* synthetic */ class ConstrainedBiMap implements getAllowReturnTransitionOverlap {
        private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ ConstrainedBiMap(String str) {
            this.MediaBrowserCompat$ItemReceiver = str;
        }

        public final boolean write(Object obj) {
            return this.MediaBrowserCompat$ItemReceiver.equals(((zzup) obj).MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* renamed from: o.MapConstraints$ConstrainedMultimap */
    public final /* synthetic */ class ConstrainedMultimap implements findFragmentByWho {
        private final /* synthetic */ MapDifference read;

        public /* synthetic */ ConstrainedMultimap(MapDifference mapDifference) {
            this.read = mapDifference;
        }

        public final Object IconCompatParcelizer(Object obj) {
            double d;
            String str;
            MapDifference mapDifference = this.read;
            HmlWorkAddressActivity.read read2 = (HmlWorkAddressActivity.read) obj;
            double d2 = 0.0d;
            if (read2.IconCompatParcelizer != null) {
                d = read2.IconCompatParcelizer.doubleValue();
            } else {
                d = 0.0d;
            }
            String write = MapDifference.write(Double.valueOf(d));
            String str2 = "";
            if (read2.MediaBrowserCompat$ItemReceiver != null) {
                str = mapDifference.IconCompatParcelizer("dd MMM yyyy", read2.MediaBrowserCompat$ItemReceiver);
            } else {
                str = str2;
            }
            if (read2.read != null) {
                d2 = read2.read.doubleValue();
            }
            String write2 = MapDifference.write(Double.valueOf(d2));
            String string = mapDifference.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.percentage_format);
            Object[] objArr = new Object[2];
            if (read2.write != null) {
                Double valueOf = Double.valueOf(read2.write.doubleValue());
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
                currencyInstance.setMinimumFractionDigits(2);
                currencyInstance.setMaximumFractionDigits(2);
                str2 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance).format(valueOf);
            }
            objArr[0] = str2;
            objArr[1] = mapDifference.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.percentage);
            return new makeListenable(write, str, write2, String.format(string, objArr));
        }
    }

    /* renamed from: o.MapConstraints$ConstrainedAsMapValues */
    public final /* synthetic */ class ConstrainedAsMapValues implements findFragmentByWho {
        private final /* synthetic */ MapDifference write;

        public /* synthetic */ ConstrainedAsMapValues(MapDifference mapDifference) {
            this.write = mapDifference;
        }

        public final Object IconCompatParcelizer(Object obj) {
            String str;
            double d;
            String str2;
            String str3;
            String str4;
            MapDifference mapDifference = this.write;
            onNextClicked onnextclicked = (onNextClicked) obj;
            String str5 = onnextclicked.MediaDescriptionCompat;
            int i = onnextclicked.RatingCompat;
            String string = mapDifference.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.sme_loan_end_date);
            Object[] objArr = new Object[1];
            if (onnextclicked.write != null) {
                str = mapDifference.IconCompatParcelizer("dd MMM yyyy", onnextclicked.write);
            } else {
                str = "";
            }
            char c = 0;
            objArr[0] = str;
            String format = String.format(string, objArr);
            double d2 = 0.0d;
            if (onnextclicked.MediaBrowserCompat$MediaItem != null) {
                d = onnextclicked.MediaBrowserCompat$MediaItem.doubleValue();
            } else {
                d = 0.0d;
            }
            String write2 = MapDifference.write(Double.valueOf(d));
            if (onnextclicked.read != null) {
                d2 = onnextclicked.read.doubleValue();
            }
            String write3 = MapDifference.write(Double.valueOf(d2));
            if (onnextclicked.IconCompatParcelizer != null) {
                str2 = mapDifference.IconCompatParcelizer("dd MMM yyyy", onnextclicked.IconCompatParcelizer);
            } else {
                str2 = "";
            }
            String string2 = mapDifference.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.percentage_format);
            Object[] objArr2 = new Object[2];
            if (onnextclicked.MediaBrowserCompat$ItemReceiver != null) {
                Double valueOf = Double.valueOf(onnextclicked.MediaBrowserCompat$ItemReceiver.doubleValue());
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
                currencyInstance.setMinimumFractionDigits(2);
                currencyInstance.setMaximumFractionDigits(2);
                str3 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance).format(valueOf);
                c = 0;
            } else {
                str3 = "";
            }
            objArr2[c] = str3;
            objArr2[1] = mapDifference.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.percentage);
            String format2 = String.format(string2, objArr2);
            if (onnextclicked.MediaMetadataCompat != null) {
                str4 = mapDifference.IconCompatParcelizer("dd MMM yyyy", onnextclicked.MediaMetadataCompat);
            } else {
                str4 = "";
            }
            return new Futures.C34115(str5, i, format, write2, write3, str2, format2, str4, onnextclicked.MediaBrowserCompat$CustomActionResultReceiver, onnextclicked.MediaBrowserCompat$SearchResultReceiver);
        }
    }

    /* renamed from: o.MapConstraints$ConstrainedEntries */
    public final /* synthetic */ class ConstrainedEntries implements findFragmentByWho {
        private final /* synthetic */ MapDifference read;

        public /* synthetic */ ConstrainedEntries(MapDifference mapDifference) {
            this.read = mapDifference;
        }

        public final Object IconCompatParcelizer(Object obj) {
            double d;
            String str;
            String str2;
            double d2;
            MapDifference mapDifference = this.read;
            HmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver = (HmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver) obj;
            int i = hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper;
            String str3 = hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
            if (hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat != null) {
                d = hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat.doubleValue();
            } else {
                d = 0.0d;
            }
            String write = MapDifference.write(Double.valueOf(d));
            String string = mapDifference.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.sme_loan_end_date);
            Object[] objArr = new Object[1];
            String str4 = "";
            if (hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem != null) {
                str = mapDifference.IconCompatParcelizer("dd MMM yyyy", hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem);
            } else {
                str = str4;
            }
            objArr[0] = str;
            String format = String.format(string, objArr);
            String str5 = hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.write;
            String str6 = hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaMetadataCompat;
            String MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, false);
            String str7 = hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver;
            if (hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem != null) {
                str2 = mapDifference.IconCompatParcelizer("dd MMM yyyy", hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem);
            } else {
                str2 = str4;
            }
            if (hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo != null) {
                d2 = hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo.doubleValue();
            } else {
                d2 = 0.0d;
            }
            String write2 = MapDifference.write(Double.valueOf(d2));
            List<Out> MediaBrowserCompat$ItemReceiver = MapDifference.MediaBrowserCompat$ItemReceiver(hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, new ConstrainedMultimap(mapDifference));
            String string2 = mapDifference.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.percentage_format);
            Object[] objArr2 = new Object[2];
            if (hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.RatingCompat != null) {
                Double valueOf = Double.valueOf(hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.RatingCompat.doubleValue());
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
                currencyInstance.setMinimumFractionDigits(2);
                currencyInstance.setMaximumFractionDigits(2);
                str4 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance).format(valueOf);
            }
            objArr2[0] = str4;
            objArr2[1] = mapDifference.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.percentage);
            return new Futures.ChainingListenableFuture.C34131(i, str3, write, format, str5, str6, MediaBrowserCompat$CustomActionResultReceiver, str7, str2, write2, MediaBrowserCompat$ItemReceiver, String.format(string2, objArr2), hmlSimulatorTutorialActivity$MediaBrowserCompat$ItemReceiver.read);
        }
    }
}

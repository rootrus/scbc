package p040o;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p039io.realm.CompactOnLaunchCallback;
import p039io.realm.exceptions.RealmException;
import p039io.realm.exceptions.RealmFileException;
import p039io.realm.internal.OsRealmConfig;

/* renamed from: o.HmlNTBAdditionalDocumentActivity */
public class HmlNTBAdditionalDocumentActivity {
    private static Boolean Keep;
    private static HmlNTBRepaymentMethodAboutActivity PlaybackStateCompat$CustomAction;
    /* access modifiers changed from: private */
    public static final Object setHasDecor;
    public final String IconCompatParcelizer;
    public final OsRealmConfig.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    final String MediaBrowserCompat$ItemReceiver = null;
    public final byte[] MediaBrowserCompat$MediaItem = null;
    final HmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    final HmlNTBRepaymentMethodAboutActivity f2550x50fd9e4a;
    final HmlNTBApplyLoanEntryActivity MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    final File MediaSessionCompat$QueueItem;
    final String MediaSessionCompat$ResultReceiverWrapper;
    public final long MediaSessionCompat$Token;
    final HmlSelectedOfferReviewActivity ParcelableVolumeInfo;
    public final boolean RatingCompat;
    public final boolean read;
    public final CompactOnLaunchCallback write;

    static {
        Object RatingCompat2 = HmlLaserIdAboutActivity.RatingCompat();
        setHasDecor = RatingCompat2;
        if (RatingCompat2 != null) {
            HmlNTBRepaymentMethodAboutActivity MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(RatingCompat2.getClass().getCanonicalName());
            if (MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver()) {
                PlaybackStateCompat$CustomAction = MediaBrowserCompat$ItemReceiver2;
                return;
            }
            throw new ExceptionInInitializerError("RealmTransformer doesn't seem to be applied. Please update the project configuration to use the Realm Gradle plugin. See https://realm.io/news/android-installation-change/");
        }
        PlaybackStateCompat$CustomAction = null;
    }

    protected HmlNTBAdditionalDocumentActivity(File file, String str, String str2, String str3, byte[] bArr, long j, HmlNTBApplyLoanEntryActivity hmlNTBApplyLoanEntryActivity, boolean z, OsRealmConfig.IconCompatParcelizer iconCompatParcelizer, HmlNTBRepaymentMethodAboutActivity hmlNTBRepaymentMethodAboutActivity, HmlSelectedOfferReviewActivity hmlSelectedOfferReviewActivity, HmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver hmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver, boolean z2, CompactOnLaunchCallback compactOnLaunchCallback) {
        this.MediaSessionCompat$QueueItem = file;
        this.MediaSessionCompat$ResultReceiverWrapper = str;
        this.IconCompatParcelizer = str2;
        this.MediaSessionCompat$Token = j;
        this.MediaDescriptionCompat = hmlNTBApplyLoanEntryActivity;
        this.read = false;
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
        this.f2550x50fd9e4a = hmlNTBRepaymentMethodAboutActivity;
        this.ParcelableVolumeInfo = hmlSelectedOfferReviewActivity;
        this.MediaBrowserCompat$SearchResultReceiver = null;
        this.MediaMetadataCompat = false;
        this.write = null;
        this.RatingCompat = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HmlNTBAdditionalDocumentActivity hmlNTBAdditionalDocumentActivity = (HmlNTBAdditionalDocumentActivity) obj;
        if (this.MediaSessionCompat$Token != hmlNTBAdditionalDocumentActivity.MediaSessionCompat$Token || this.read != hmlNTBAdditionalDocumentActivity.read || this.MediaMetadataCompat != hmlNTBAdditionalDocumentActivity.MediaMetadataCompat) {
            return false;
        }
        File file = this.MediaSessionCompat$QueueItem;
        if (file == null ? hmlNTBAdditionalDocumentActivity.MediaSessionCompat$QueueItem != null : !file.equals(hmlNTBAdditionalDocumentActivity.MediaSessionCompat$QueueItem)) {
            return false;
        }
        String str = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str == null ? hmlNTBAdditionalDocumentActivity.MediaSessionCompat$ResultReceiverWrapper != null : !str.equals(hmlNTBAdditionalDocumentActivity.MediaSessionCompat$ResultReceiverWrapper)) {
            return false;
        }
        if (!this.IconCompatParcelizer.equals(hmlNTBAdditionalDocumentActivity.IconCompatParcelizer)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 == null ? hmlNTBAdditionalDocumentActivity.MediaBrowserCompat$ItemReceiver != null : !str2.equals(hmlNTBAdditionalDocumentActivity.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        if (!Arrays.equals(this.MediaBrowserCompat$MediaItem, hmlNTBAdditionalDocumentActivity.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        HmlNTBApplyLoanEntryActivity hmlNTBApplyLoanEntryActivity = this.MediaDescriptionCompat;
        if (hmlNTBApplyLoanEntryActivity == null ? hmlNTBAdditionalDocumentActivity.MediaDescriptionCompat != null : !hmlNTBApplyLoanEntryActivity.equals(hmlNTBAdditionalDocumentActivity.MediaDescriptionCompat)) {
            return false;
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver != hmlNTBAdditionalDocumentActivity.MediaBrowserCompat$CustomActionResultReceiver || !this.f2550x50fd9e4a.equals(hmlNTBAdditionalDocumentActivity.f2550x50fd9e4a)) {
            return false;
        }
        HmlSelectedOfferReviewActivity hmlSelectedOfferReviewActivity = this.ParcelableVolumeInfo;
        if (hmlSelectedOfferReviewActivity == null ? hmlNTBAdditionalDocumentActivity.ParcelableVolumeInfo != null : !hmlSelectedOfferReviewActivity.equals(hmlNTBAdditionalDocumentActivity.ParcelableVolumeInfo)) {
            return false;
        }
        HmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver hmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$SearchResultReceiver;
        if (hmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver == null ? hmlNTBAdditionalDocumentActivity.MediaBrowserCompat$SearchResultReceiver != null : !hmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver.equals(hmlNTBAdditionalDocumentActivity.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        CompactOnLaunchCallback compactOnLaunchCallback = this.write;
        CompactOnLaunchCallback compactOnLaunchCallback2 = hmlNTBAdditionalDocumentActivity.write;
        if (compactOnLaunchCallback != null) {
            return compactOnLaunchCallback.equals(compactOnLaunchCallback2);
        }
        if (compactOnLaunchCallback2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        File file = this.MediaSessionCompat$QueueItem;
        int i = 0;
        int hashCode = file != null ? file.hashCode() : 0;
        String str = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode2 = str != null ? str.hashCode() : 0;
        int hashCode3 = this.IconCompatParcelizer.hashCode();
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str2 != null ? str2.hashCode() : 0;
        int hashCode5 = Arrays.hashCode(this.MediaBrowserCompat$MediaItem);
        long j = this.MediaSessionCompat$Token;
        int i2 = (int) (j ^ (j >>> 32));
        HmlNTBApplyLoanEntryActivity hmlNTBApplyLoanEntryActivity = this.MediaDescriptionCompat;
        int hashCode6 = hmlNTBApplyLoanEntryActivity != null ? hmlNTBApplyLoanEntryActivity.hashCode() : 0;
        boolean z = this.read;
        int hashCode7 = this.MediaBrowserCompat$CustomActionResultReceiver.hashCode();
        int hashCode8 = this.f2550x50fd9e4a.hashCode();
        HmlSelectedOfferReviewActivity hmlSelectedOfferReviewActivity = this.ParcelableVolumeInfo;
        int hashCode9 = hmlSelectedOfferReviewActivity != null ? hmlSelectedOfferReviewActivity.hashCode() : 0;
        HmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver hmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode10 = hmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver != null ? hmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver.hashCode() : 0;
        boolean z2 = this.MediaMetadataCompat;
        CompactOnLaunchCallback compactOnLaunchCallback = this.write;
        if (compactOnLaunchCallback != null) {
            i = compactOnLaunchCallback.hashCode();
        }
        return ((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i2) * 31) + hashCode6) * 31) + (z ? 1 : 0)) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (z2 ? 1 : 0)) * 31) + i) * 31;
    }

    protected static HmlNTBRepaymentMethodAboutActivity read(Set<Object> set, Set<Class<? extends HmlNTBCaptureDocumentActivity>> set2) {
        if (set2.size() > 0) {
            return new HmlNTBVerificationMethodsActivity(PlaybackStateCompat$CustomAction, set2);
        }
        if (set.size() == 1) {
            return MediaBrowserCompat$ItemReceiver(set.iterator().next().getClass().getCanonicalName());
        }
        HmlNTBRepaymentMethodAboutActivity[] hmlNTBRepaymentMethodAboutActivityArr = new HmlNTBRepaymentMethodAboutActivity[set.size()];
        int i = 0;
        for (Object obj : set) {
            hmlNTBRepaymentMethodAboutActivityArr[i] = MediaBrowserCompat$ItemReceiver(obj.getClass().getCanonicalName());
            i++;
        }
        return new HmlNTBSummaryActivity(hmlNTBRepaymentMethodAboutActivityArr);
    }

    private static HmlNTBRepaymentMethodAboutActivity MediaBrowserCompat$ItemReceiver(String str) {
        String[] split = str.split("\\.");
        String str2 = split[split.length - 1];
        String format = String.format(Locale.US, "io.realm.%s%s", new Object[]{str2, "Mediator"});
        try {
            Constructor constructor = Class.forName(format).getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            return (HmlNTBRepaymentMethodAboutActivity) constructor.newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find ");
            sb.append(format);
            throw new RealmException(sb.toString(), e);
        } catch (InvocationTargetException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not create an instance of ");
            sb2.append(format);
            throw new RealmException(sb2.toString(), e2);
        } catch (InstantiationException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Could not create an instance of ");
            sb3.append(format);
            throw new RealmException(sb3.toString(), e3);
        } catch (IllegalAccessException e4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Could not create an instance of ");
            sb4.append(format);
            throw new RealmException(sb4.toString(), e4);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("realmDirectory: ");
        File file = this.MediaSessionCompat$QueueItem;
        sb.append(file != null ? file.toString() : "");
        sb.append("\n");
        sb.append("realmFileName : ");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append("\n");
        sb.append("canonicalPath: ");
        sb.append(this.IconCompatParcelizer);
        sb.append("\n");
        sb.append("key: ");
        sb.append("[length: ");
        sb.append(this.MediaBrowserCompat$MediaItem == null ? 0 : 64);
        sb.append("]");
        sb.append("\n");
        sb.append("schemaVersion: ");
        sb.append(Long.toString(this.MediaSessionCompat$Token));
        sb.append("\n");
        sb.append("migration: ");
        sb.append(this.MediaDescriptionCompat);
        sb.append("\n");
        sb.append("deleteRealmIfMigrationNeeded: ");
        sb.append(this.read);
        sb.append("\n");
        sb.append("durability: ");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append("\n");
        sb.append("schemaMediator: ");
        sb.append(this.f2550x50fd9e4a);
        sb.append("\n");
        sb.append("readOnly: ");
        sb.append(this.MediaMetadataCompat);
        sb.append("\n");
        sb.append("compactOnLaunch: ");
        sb.append(this.write);
        return sb.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean read() {
        /*
            java.lang.Class<o.HmlNTBAdditionalDocumentActivity> r0 = p040o.HmlNTBAdditionalDocumentActivity.class
            monitor-enter(r0)
            java.lang.Boolean r1 = Keep     // Catch:{ all -> 0x001d }
            if (r1 != 0) goto L_0x0015
            java.lang.String r1 = "o.DebitCardRequestReviewActivity"
            java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0011 }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x0011 }
            Keep = r1     // Catch:{ ClassNotFoundException -> 0x0011 }
            goto L_0x0015
        L_0x0011:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x001d }
            Keep = r1     // Catch:{ all -> 0x001d }
        L_0x0015:
            java.lang.Boolean r1 = Keep     // Catch:{ all -> 0x001d }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x001d }
            monitor-exit(r0)
            return r1
        L_0x001d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.HmlNTBAdditionalDocumentActivity.read():boolean");
    }

    protected static String MediaBrowserCompat$CustomActionResultReceiver(File file) {
        try {
            return file.getCanonicalPath();
        } catch (IOException e) {
            RealmFileException.IconCompatParcelizer iconCompatParcelizer = RealmFileException.IconCompatParcelizer.ACCESS_ERROR;
            StringBuilder sb = new StringBuilder();
            sb.append("Could not resolve the canonical path to the Realm file: ");
            sb.append(file.getAbsolutePath());
            throw new RealmFileException(iconCompatParcelizer, sb.toString(), e);
        }
    }

    /* renamed from: o.HmlNTBAdditionalDocumentActivity$IconCompatParcelizer */
    public static class IconCompatParcelizer {
        private OsRealmConfig.IconCompatParcelizer IconCompatParcelizer;
        private HashSet<Class<? extends HmlNTBCaptureDocumentActivity>> MediaBrowserCompat$CustomActionResultReceiver;
        public HmlNTBApplyLoanEntryActivity MediaBrowserCompat$ItemReceiver;
        private HmlSelectedOfferReviewActivity MediaBrowserCompat$MediaItem;
        private String MediaDescriptionCompat;
        private HashSet<Object> RatingCompat;
        public long read;
        private File write;

        public IconCompatParcelizer() {
            this(HmlEtbConfirmationOtpActivity.MediaBrowserCompat$ItemReceiver);
        }

        IconCompatParcelizer(Context context) {
            this.RatingCompat = new HashSet<>();
            this.MediaBrowserCompat$CustomActionResultReceiver = new HashSet<>();
            if (context != null) {
                HmlNTBPinConsentActivity.IconCompatParcelizer(context);
                this.write = context.getFilesDir();
                this.MediaDescriptionCompat = "default.realm";
                this.read = 0;
                this.MediaBrowserCompat$ItemReceiver = null;
                this.IconCompatParcelizer = OsRealmConfig.IconCompatParcelizer.FULL;
                if (HmlNTBAdditionalDocumentActivity.setHasDecor != null) {
                    this.RatingCompat.add(HmlNTBAdditionalDocumentActivity.setHasDecor);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Call `Realm.init(Context)` before creating a RealmConfiguration");
        }

        public final HmlNTBAdditionalDocumentActivity read() {
            if (this.MediaBrowserCompat$MediaItem == null && HmlNTBAdditionalDocumentActivity.read()) {
                this.MediaBrowserCompat$MediaItem = new HmlOccupationInfoActivity();
            }
            return new HmlNTBAdditionalDocumentActivity(this.write, this.MediaDescriptionCompat, HmlNTBAdditionalDocumentActivity.MediaBrowserCompat$CustomActionResultReceiver(new File(this.write, this.MediaDescriptionCompat)), (String) null, (byte[]) null, this.read, this.MediaBrowserCompat$ItemReceiver, false, this.IconCompatParcelizer, HmlNTBAdditionalDocumentActivity.read(this.RatingCompat, this.MediaBrowserCompat$CustomActionResultReceiver), this.MediaBrowserCompat$MediaItem, (HmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver) null, false, (CompactOnLaunchCallback) null);
        }
    }
}

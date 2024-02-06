package p039io.realm.internal;

import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p039io.realm.internal.OsRealmConfig;
import p039io.realm.internal.OsResults;
import p040o.HmlNTBAdditionalDocumentActivity;
import p040o.HmlNTBLandingActivity;
import p040o.HmlNTBMonthlyIncomeAboutActivity;
import p040o.HmlNTBOperatingAccountActivity;
import p040o.HmlNTBPinDisabledActivity;
import p040o.HmlNTBPinDisabledActivity_ViewBinding;
import p040o.HmlNTBReviewDocumentActivity;
import p040o.HmlNTBSelectedOfferReviewActivity;

/* renamed from: io.realm.internal.OsSharedRealm */
public final class OsSharedRealm implements Closeable, HmlNTBMonthlyIncomeAboutActivity {
    private static final long MediaBrowserCompat$MediaItem = nativeGetFinalizerPtr();
    private static final List<OsSharedRealm> MediaBrowserCompat$SearchResultReceiver = new CopyOnWriteArrayList();
    private static volatile File MediaDescriptionCompat;
    public final HmlNTBOperatingAccountActivity IconCompatParcelizer;
    public final List<WeakReference<OsResults.IconCompatParcelizer>> MediaBrowserCompat$CustomActionResultReceiver = new ArrayList();
    public final List<WeakReference<HmlNTBPinDisabledActivity>> MediaBrowserCompat$ItemReceiver = new CopyOnWriteArrayList();
    private RealmNotifier MediaMetadataCompat;
    private final List<OsSharedRealm> MediaSessionCompat$QueueItem = new ArrayList();
    public final OsSchemaInfo RatingCompat;
    public final long read;
    public final HmlNTBLandingActivity write;

    /* renamed from: io.realm.internal.OsSharedRealm$InitializationCallback */
    public interface InitializationCallback {
    }

    /* renamed from: io.realm.internal.OsSharedRealm$MigrationCallback */
    public interface MigrationCallback {
    }

    /* renamed from: io.realm.internal.OsSharedRealm$SchemaChangedCallback */
    public interface SchemaChangedCallback {
    }

    public static native void nativeBeginTransaction(long j);

    private static native void nativeCloseSharedRealm(long j);

    public static native void nativeCommitTransaction(long j);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetSchemaInfo(long j);

    private static native long nativeGetSharedRealm(long j, RealmNotifier realmNotifier);

    public static native long nativeGetTable(long j, String str);

    public static native boolean nativeHasTable(long j, String str);

    private static native void nativeInit(String str);

    public static native boolean nativeIsClosed(long j);

    public static native boolean nativeIsInTransaction(long j);

    public static native void nativeRegisterSchemaChangedCallback(long j, SchemaChangedCallback schemaChangedCallback);

    private static native void nativeSetAutoRefresh(long j, boolean z);

    private OsSharedRealm(OsRealmConfig osRealmConfig) {
        HmlNTBSelectedOfferReviewActivity hmlNTBSelectedOfferReviewActivity = new HmlNTBSelectedOfferReviewActivity();
        HmlNTBReviewDocumentActivity hmlNTBReviewDocumentActivity = new HmlNTBReviewDocumentActivity(this, hmlNTBSelectedOfferReviewActivity);
        this.IconCompatParcelizer = osRealmConfig.MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$SearchResultReceiver.add(this);
        try {
            this.read = nativeGetSharedRealm(osRealmConfig.IconCompatParcelizer, hmlNTBReviewDocumentActivity);
            this.MediaSessionCompat$QueueItem.clear();
            MediaBrowserCompat$SearchResultReceiver.remove(this);
            this.RatingCompat = new OsSchemaInfo(nativeGetSchemaInfo(this.read));
            new NativeObjectReference(this.IconCompatParcelizer, this, HmlNTBOperatingAccountActivity.read);
            this.write = hmlNTBSelectedOfferReviewActivity;
            this.MediaMetadataCompat = hmlNTBReviewDocumentActivity;
            nativeSetAutoRefresh(this.read, hmlNTBSelectedOfferReviewActivity.read());
        } catch (Throwable th) {
            this.MediaSessionCompat$QueueItem.clear();
            MediaBrowserCompat$SearchResultReceiver.remove(this);
            throw th;
        }
    }

    public static OsSharedRealm IconCompatParcelizer(HmlNTBAdditionalDocumentActivity hmlNTBAdditionalDocumentActivity) {
        OsRealmConfig IconCompatParcelizer2 = new OsRealmConfig.write(hmlNTBAdditionalDocumentActivity).IconCompatParcelizer();
        HmlNTBPinDisabledActivity_ViewBinding.MediaBrowserCompat$ItemReceiver();
        return new OsSharedRealm(IconCompatParcelizer2);
    }

    public static OsSharedRealm read(OsRealmConfig.write write2) {
        OsRealmConfig IconCompatParcelizer2 = write2.IconCompatParcelizer();
        HmlNTBPinDisabledActivity_ViewBinding.MediaBrowserCompat$ItemReceiver();
        return new OsSharedRealm(IconCompatParcelizer2);
    }

    public static void IconCompatParcelizer(File file) {
        if (MediaDescriptionCompat == null) {
            String absolutePath = file.getAbsolutePath();
            if (file.isDirectory() || file.mkdirs() || file.isDirectory()) {
                if (!absolutePath.endsWith("/")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(absolutePath);
                    sb.append("/");
                    absolutePath = sb.toString();
                }
                nativeInit(absolutePath);
                MediaDescriptionCompat = file;
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("failed to create temporary directory: ");
            sb2.append(absolutePath);
            throw new IOException(sb2.toString());
        }
    }

    public final void close() {
        RealmNotifier realmNotifier = this.MediaMetadataCompat;
        if (realmNotifier != null) {
            realmNotifier.close();
        }
        synchronized (this.IconCompatParcelizer) {
            nativeCloseSharedRealm(this.read);
        }
    }

    public final long MediaBrowserCompat$ItemReceiver() {
        return this.read;
    }

    public final long read() {
        return MediaBrowserCompat$MediaItem;
    }
}

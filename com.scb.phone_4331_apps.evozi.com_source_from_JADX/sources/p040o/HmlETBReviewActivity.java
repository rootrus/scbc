package p040o;

import java.lang.ref.WeakReference;
import p039io.realm.internal.OsObjectStore;
import p039io.realm.internal.OsResults;
import p039io.realm.internal.OsSchemaInfo;
import p039io.realm.internal.OsSharedRealm;
import p040o.HmlMonthlyIncomeAboutActivity;

/* renamed from: o.HmlETBReviewActivity */
public class HmlETBReviewActivity extends HmlEtbConfirmationOtpActivity {
    private final HmlNTBCompanyNameActivity MediaBrowserCompat$MediaItem = new HmlETBSuccessActivity(this);

    public final /* bridge */ /* synthetic */ boolean IconCompatParcelizer() {
        return super.IconCompatParcelizer();
    }

    public final /* bridge */ /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver() {
        return super.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final /* bridge */ /* synthetic */ boolean MediaBrowserCompat$SearchResultReceiver() {
        return super.MediaBrowserCompat$SearchResultReceiver();
    }

    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    public final /* bridge */ /* synthetic */ HmlNTBAdditionalDocumentActivity write() {
        return super.write();
    }

    private HmlETBReviewActivity(final HmlMonthlyIncomeAboutActivity hmlMonthlyIncomeAboutActivity) {
        super(hmlMonthlyIncomeAboutActivity, (OsSchemaInfo) null);
        HmlMonthlyIncomeAboutActivity.IconCompatParcelizer(hmlMonthlyIncomeAboutActivity.MediaBrowserCompat$CustomActionResultReceiver, (HmlMonthlyIncomeAboutActivity.IconCompatParcelizer) new HmlMonthlyIncomeAboutActivity.IconCompatParcelizer() {
            public final void MediaBrowserCompat$ItemReceiver(int i) {
                if (i <= 0 && !hmlMonthlyIncomeAboutActivity.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat && OsObjectStore.MediaBrowserCompat$CustomActionResultReceiver(HmlETBReviewActivity.this.write) == -1) {
                    OsSharedRealm osSharedRealm = HmlETBReviewActivity.this.write;
                    for (WeakReference<OsResults.IconCompatParcelizer> weakReference : osSharedRealm.MediaBrowserCompat$CustomActionResultReceiver) {
                        OsResults.IconCompatParcelizer iconCompatParcelizer = (OsResults.IconCompatParcelizer) weakReference.get();
                        if (iconCompatParcelizer != null) {
                            OsResults osResults = iconCompatParcelizer.read;
                            if (!osResults.read) {
                                OsResults osResults2 = new OsResults(osResults.MediaBrowserCompat$ItemReceiver, osResults.IconCompatParcelizer, OsResults.nativeCreateSnapshot(osResults.MediaBrowserCompat$CustomActionResultReceiver));
                                osResults2.read = true;
                                osResults = osResults2;
                            }
                            iconCompatParcelizer.read = osResults;
                        }
                    }
                    osSharedRealm.MediaBrowserCompat$CustomActionResultReceiver.clear();
                    for (WeakReference<HmlNTBPinDisabledActivity> weakReference2 : osSharedRealm.MediaBrowserCompat$ItemReceiver) {
                        if (((HmlNTBPinDisabledActivity) weakReference2.get()) != null) {
                            throw new IllegalStateException("The query has been executed. This 'PendingRow' is not valid anymore.");
                        }
                    }
                    osSharedRealm.MediaBrowserCompat$ItemReceiver.clear();
                    OsSharedRealm.nativeBeginTransaction(osSharedRealm.read);
                    if (OsObjectStore.MediaBrowserCompat$CustomActionResultReceiver(HmlETBReviewActivity.this.write) == -1) {
                        OsObjectStore.write(HmlETBReviewActivity.this.write);
                    }
                    OsSharedRealm.nativeCommitTransaction(HmlETBReviewActivity.this.write.read);
                }
            }
        });
    }

    public static HmlETBReviewActivity read(HmlNTBAdditionalDocumentActivity hmlNTBAdditionalDocumentActivity) {
        if (hmlNTBAdditionalDocumentActivity != null) {
            return (HmlETBReviewActivity) HmlMonthlyIncomeAboutActivity.MediaBrowserCompat$ItemReceiver(hmlNTBAdditionalDocumentActivity, HmlETBReviewActivity.class);
        }
        throw new IllegalArgumentException("A non-null RealmConfiguration must be provided");
    }

    static HmlETBReviewActivity write(HmlMonthlyIncomeAboutActivity hmlMonthlyIncomeAboutActivity) {
        return new HmlETBReviewActivity(hmlMonthlyIncomeAboutActivity);
    }

    public final HmlNTBCompanyNameActivity read() {
        return this.MediaBrowserCompat$MediaItem;
    }
}

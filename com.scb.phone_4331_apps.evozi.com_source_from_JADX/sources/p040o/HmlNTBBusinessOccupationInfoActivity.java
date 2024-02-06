package p040o;

import p039io.realm.DynamicRealmObject;
import p039io.realm.internal.OsObject;
import p039io.realm.internal.OsObject$MediaBrowserCompat$ItemReceiver;
import p039io.realm.internal.OsSharedRealm;
import p039io.realm.internal.Row;
import p039io.realm.internal.Table;
import p039io.realm.internal.UncheckedRow;
import p039io.realm.log.RealmLog;
import p040o.HmlIssuerInputActivity;

/* renamed from: o.HmlNTBBusinessOccupationInfoActivity */
public abstract class HmlNTBBusinessOccupationInfoActivity implements HmlNTBCaptureDocumentActivity {
    public static <E extends HmlNTBCaptureDocumentActivity> void deleteFromRealm(E e) {
        if (e instanceof HmlNTBReviewActivity) {
            HmlNTBReviewActivity hmlNTBReviewActivity = (HmlNTBReviewActivity) e;
            if (hmlNTBReviewActivity.aR_().MediaMetadataCompat == null) {
                throw new IllegalStateException("Object malformed: missing object in Realm. Make sure to instantiate RealmObjects with Realm.createObject()");
            } else if (hmlNTBReviewActivity.aR_().MediaBrowserCompat$ItemReceiver != null) {
                hmlNTBReviewActivity.aR_().MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
                Row row = hmlNTBReviewActivity.aR_().MediaMetadataCompat;
                Table table = row.getTable();
                long index = row.getIndex();
                OsSharedRealm osSharedRealm = table.write;
                if (osSharedRealm != null && !OsSharedRealm.nativeIsInTransaction(osSharedRealm.read)) {
                    Table.MediaBrowserCompat$CustomActionResultReceiver();
                }
                table.nativeMoveLastOver(table.IconCompatParcelizer, index);
                hmlNTBReviewActivity.aR_().MediaMetadataCompat = HmlNTBLoanSetupActivity.INSTANCE;
            } else {
                throw new IllegalStateException("Object malformed: missing Realm. Make sure to instantiate RealmObjects with Realm.createObject()");
            }
        } else {
            throw new IllegalArgumentException("Object not managed by Realm, so it cannot be removed.");
        }
    }

    public static <E extends HmlNTBCaptureDocumentActivity> boolean isValid(E e) {
        if (e instanceof HmlNTBReviewActivity) {
            Row row = ((HmlNTBReviewActivity) e).aR_().MediaMetadataCompat;
            if (row == null || !row.isAttached()) {
                return false;
            }
            return true;
        } else if (e != null) {
            return true;
        } else {
            return false;
        }
    }

    public static <E extends HmlNTBCaptureDocumentActivity> boolean isLoaded(E e) {
        if (!(e instanceof HmlNTBReviewActivity)) {
            return true;
        }
        HmlNTBReviewActivity hmlNTBReviewActivity = (HmlNTBReviewActivity) e;
        hmlNTBReviewActivity.aR_().MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
        return !(hmlNTBReviewActivity.aR_().MediaMetadataCompat instanceof HmlNTBPinDisabledActivity);
    }

    public static <E extends HmlNTBCaptureDocumentActivity> boolean isManaged(E e) {
        return e instanceof HmlNTBReviewActivity;
    }

    public HmlLaserIdAboutActivity getRealm() {
        return getRealm(this);
    }

    public static HmlLaserIdAboutActivity getRealm(HmlNTBCaptureDocumentActivity hmlNTBCaptureDocumentActivity) {
        if (hmlNTBCaptureDocumentActivity == null) {
            throw new IllegalArgumentException("'model' is null.");
        } else if (hmlNTBCaptureDocumentActivity instanceof DynamicRealmObject) {
            throw new IllegalStateException("the object is an instance of DynamicRealmObject. Use DynamicRealmObject.getDynamicRealm() instead.");
        } else if (!(hmlNTBCaptureDocumentActivity instanceof HmlNTBReviewActivity)) {
            return null;
        } else {
            HmlEtbConfirmationOtpActivity hmlEtbConfirmationOtpActivity = ((HmlNTBReviewActivity) hmlNTBCaptureDocumentActivity).aR_().MediaBrowserCompat$ItemReceiver;
            hmlEtbConfirmationOtpActivity.MediaBrowserCompat$ItemReceiver();
            if (isValid(hmlNTBCaptureDocumentActivity)) {
                return (HmlLaserIdAboutActivity) hmlEtbConfirmationOtpActivity;
            }
            throw new IllegalStateException("the object is already deleted.");
        }
    }

    public static <E extends HmlNTBCaptureDocumentActivity> boolean load(E e) {
        if (isLoaded(e)) {
            return true;
        }
        if (!(e instanceof HmlNTBReviewActivity)) {
            return false;
        }
        if (!(((HmlNTBReviewActivity) e).aR_().MediaMetadataCompat instanceof HmlNTBPinDisabledActivity)) {
            return true;
        }
        throw new IllegalStateException("The query has been executed. This 'PendingRow' is not valid anymore.");
    }

    public static <E extends HmlNTBCaptureDocumentActivity> void addChangeListener(E e, HmlNTBApplicationOutcomeActivity<E> hmlNTBApplicationOutcomeActivity) {
        if (e == null) {
            throw new IllegalArgumentException("Object should not be null");
        } else if (hmlNTBApplicationOutcomeActivity == null) {
            throw new IllegalArgumentException("Listener should not be null");
        } else if (e instanceof HmlNTBReviewActivity) {
            HmlNTBReviewActivity hmlNTBReviewActivity = (HmlNTBReviewActivity) e;
            HmlEtbConfirmationOtpActivity hmlEtbConfirmationOtpActivity = hmlNTBReviewActivity.aR_().MediaBrowserCompat$ItemReceiver;
            hmlEtbConfirmationOtpActivity.MediaBrowserCompat$ItemReceiver();
            hmlEtbConfirmationOtpActivity.write.write.IconCompatParcelizer("Listeners cannot be used on current thread.");
            HmlIssuerInputActivity aR_ = hmlNTBReviewActivity.aR_();
            Row row = aR_.MediaMetadataCompat;
            if (row instanceof HmlNTBPinDisabledActivity) {
                aR_.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(new OsObject$MediaBrowserCompat$ItemReceiver(aR_.read, hmlNTBApplicationOutcomeActivity));
            } else if (row instanceof UncheckedRow) {
                if (aR_.MediaBrowserCompat$ItemReceiver.write != null && !OsSharedRealm.nativeIsClosed(aR_.MediaBrowserCompat$ItemReceiver.write.read) && aR_.MediaMetadataCompat.isAttached() && aR_.write == null) {
                    OsObject osObject = new OsObject(aR_.MediaBrowserCompat$ItemReceiver.write, (UncheckedRow) aR_.MediaMetadataCompat);
                    aR_.write = osObject;
                    onButtonClicked<OsObject$MediaBrowserCompat$ItemReceiver> onbuttonclicked = aR_.IconCompatParcelizer;
                    if (osObject.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.isEmpty()) {
                        osObject.MediaBrowserCompat$ItemReceiver = onbuttonclicked;
                        if (!onbuttonclicked.MediaBrowserCompat$ItemReceiver.isEmpty()) {
                            osObject.nativeStartListening(osObject.write);
                        }
                        aR_.IconCompatParcelizer = null;
                    } else {
                        throw new IllegalStateException("'observerPairs' is not empty. Listeners have been added before.");
                    }
                }
                OsObject osObject2 = aR_.write;
                if (osObject2 != null) {
                    E e2 = aR_.read;
                    if (osObject2.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.isEmpty()) {
                        osObject2.nativeStartListening(osObject2.write);
                    }
                    osObject2.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(new OsObject$MediaBrowserCompat$ItemReceiver(e2, hmlNTBApplicationOutcomeActivity));
                }
            }
        } else {
            throw new IllegalArgumentException("Cannot add listener from this unmanaged RealmObject (created outside of Realm)");
        }
    }

    public static <E extends HmlNTBCaptureDocumentActivity> void addChangeListener(E e, HmlNTBAccountConsentActivity<E> hmlNTBAccountConsentActivity) {
        addChangeListener(e, new HmlIssuerInputActivity.IconCompatParcelizer(hmlNTBAccountConsentActivity));
    }

    public static <E extends HmlNTBCaptureDocumentActivity> void removeChangeListener(E e, HmlNTBApplicationOutcomeActivity hmlNTBApplicationOutcomeActivity) {
        if (e == null) {
            throw new IllegalArgumentException("Object should not be null");
        } else if (hmlNTBApplicationOutcomeActivity == null) {
            throw new IllegalArgumentException("Listener should not be null");
        } else if (e instanceof HmlNTBReviewActivity) {
            HmlNTBReviewActivity hmlNTBReviewActivity = (HmlNTBReviewActivity) e;
            HmlEtbConfirmationOtpActivity hmlEtbConfirmationOtpActivity = hmlNTBReviewActivity.aR_().MediaBrowserCompat$ItemReceiver;
            if (hmlEtbConfirmationOtpActivity.IconCompatParcelizer()) {
                RealmLog.IconCompatParcelizer("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", hmlEtbConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
            }
            HmlIssuerInputActivity aR_ = hmlNTBReviewActivity.aR_();
            OsObject osObject = aR_.write;
            if (osObject != null) {
                osObject.MediaBrowserCompat$ItemReceiver.write(aR_.read, hmlNTBApplicationOutcomeActivity);
                if (osObject.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.isEmpty()) {
                    osObject.nativeStopListening(osObject.write);
                    return;
                }
                return;
            }
            aR_.IconCompatParcelizer.write(aR_.read, hmlNTBApplicationOutcomeActivity);
        } else {
            throw new IllegalArgumentException("Cannot remove listener from this unmanaged RealmObject (created outside of Realm)");
        }
    }

    public static <E extends HmlNTBCaptureDocumentActivity> void removeChangeListener(E e, HmlNTBAccountConsentActivity<E> hmlNTBAccountConsentActivity) {
        removeChangeListener(e, (HmlNTBApplicationOutcomeActivity) new HmlIssuerInputActivity.IconCompatParcelizer(hmlNTBAccountConsentActivity));
    }

    public static <E extends HmlNTBCaptureDocumentActivity> void removeAllChangeListeners(E e) {
        if (e instanceof HmlNTBReviewActivity) {
            HmlNTBReviewActivity hmlNTBReviewActivity = (HmlNTBReviewActivity) e;
            HmlEtbConfirmationOtpActivity hmlEtbConfirmationOtpActivity = hmlNTBReviewActivity.aR_().MediaBrowserCompat$ItemReceiver;
            if (hmlEtbConfirmationOtpActivity.IconCompatParcelizer()) {
                RealmLog.IconCompatParcelizer("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", hmlEtbConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
            }
            HmlIssuerInputActivity aR_ = hmlNTBReviewActivity.aR_();
            OsObject osObject = aR_.write;
            if (osObject != null) {
                E e2 = aR_.read;
                onButtonClicked<OsObject$MediaBrowserCompat$ItemReceiver> onbuttonclicked = osObject.MediaBrowserCompat$ItemReceiver;
                for (T t : onbuttonclicked.MediaBrowserCompat$ItemReceiver) {
                    T t2 = t.MediaBrowserCompat$ItemReceiver.get();
                    if (t2 == null || t2 == e2) {
                        onbuttonclicked.MediaBrowserCompat$ItemReceiver.remove(t);
                    }
                }
                if (osObject.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.isEmpty()) {
                    osObject.nativeStopListening(osObject.write);
                    return;
                }
                return;
            }
            onButtonClicked<OsObject$MediaBrowserCompat$ItemReceiver> onbuttonclicked2 = aR_.IconCompatParcelizer;
            onbuttonclicked2.read = true;
            onbuttonclicked2.MediaBrowserCompat$ItemReceiver.clear();
            return;
        }
        throw new IllegalArgumentException("Cannot remove listeners from this unmanaged RealmObject (created outside of Realm)");
    }

    public static <E extends HmlNTBCaptureDocumentActivity> DebitCardRequestReviewActivity<E> asFlowable(E e) {
        if (e instanceof HmlNTBReviewActivity) {
            HmlEtbConfirmationOtpActivity hmlEtbConfirmationOtpActivity = ((HmlNTBReviewActivity) e).aR_().MediaBrowserCompat$ItemReceiver;
            if (hmlEtbConfirmationOtpActivity instanceof HmlLaserIdAboutActivity) {
                HmlSelectedOfferReviewActivity hmlSelectedOfferReviewActivity = hmlEtbConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo;
                if (hmlSelectedOfferReviewActivity != null) {
                    return hmlSelectedOfferReviewActivity.MediaBrowserCompat$ItemReceiver((HmlLaserIdAboutActivity) hmlEtbConfirmationOtpActivity, e);
                }
                throw new UnsupportedOperationException("RxJava seems to be missing from the classpath. Remember to add it as a compile dependency. See https://realm.io/docs/java/latest/#rxjava for more details.");
            } else if (hmlEtbConfirmationOtpActivity instanceof HmlETBReviewActivity) {
                HmlETBReviewActivity hmlETBReviewActivity = (HmlETBReviewActivity) hmlEtbConfirmationOtpActivity;
                DynamicRealmObject dynamicRealmObject = (DynamicRealmObject) e;
                HmlSelectedOfferReviewActivity hmlSelectedOfferReviewActivity2 = hmlEtbConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo;
                if (hmlSelectedOfferReviewActivity2 != null) {
                    return hmlSelectedOfferReviewActivity2.write(hmlETBReviewActivity, dynamicRealmObject);
                }
                throw new UnsupportedOperationException("RxJava seems to be missing from the classpath. Remember to add it as a compile dependency. See https://realm.io/docs/java/latest/#rxjava for more details.");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(hmlEtbConfirmationOtpActivity.getClass());
                sb.append(" does not support RxJava. See https://realm.io/docs/java/latest/#rxjava for more details.");
                throw new UnsupportedOperationException(sb.toString());
            }
        } else {
            throw new IllegalArgumentException("Cannot create Observables from unmanaged RealmObjects");
        }
    }

    public static <E extends HmlNTBCaptureDocumentActivity> DebitCardResetOtpActivity<HmlNoDepositAccountActivity<E>> asChangesetObservable(E e) {
        if (e instanceof HmlNTBReviewActivity) {
            HmlEtbConfirmationOtpActivity hmlEtbConfirmationOtpActivity = ((HmlNTBReviewActivity) e).aR_().MediaBrowserCompat$ItemReceiver;
            if (hmlEtbConfirmationOtpActivity instanceof HmlLaserIdAboutActivity) {
                HmlSelectedOfferReviewActivity hmlSelectedOfferReviewActivity = hmlEtbConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo;
                if (hmlSelectedOfferReviewActivity != null) {
                    return hmlSelectedOfferReviewActivity.write((HmlLaserIdAboutActivity) hmlEtbConfirmationOtpActivity, e);
                }
                throw new UnsupportedOperationException("RxJava seems to be missing from the classpath. Remember to add it as a compile dependency. See https://realm.io/docs/java/latest/#rxjava for more details.");
            } else if (hmlEtbConfirmationOtpActivity instanceof HmlETBReviewActivity) {
                HmlETBReviewActivity hmlETBReviewActivity = (HmlETBReviewActivity) hmlEtbConfirmationOtpActivity;
                DynamicRealmObject dynamicRealmObject = (DynamicRealmObject) e;
                HmlSelectedOfferReviewActivity hmlSelectedOfferReviewActivity2 = hmlEtbConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo;
                if (hmlSelectedOfferReviewActivity2 != null) {
                    return hmlSelectedOfferReviewActivity2.MediaBrowserCompat$ItemReceiver(hmlETBReviewActivity, dynamicRealmObject);
                }
                throw new UnsupportedOperationException("RxJava seems to be missing from the classpath. Remember to add it as a compile dependency. See https://realm.io/docs/java/latest/#rxjava for more details.");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(hmlEtbConfirmationOtpActivity.getClass());
                sb.append(" does not support RxJava. See https://realm.io/docs/java/latest/#rxjava for more details.");
                throw new UnsupportedOperationException(sb.toString());
            }
        } else {
            throw new IllegalArgumentException("Cannot create Observables from unmanaged RealmObjects");
        }
    }
}

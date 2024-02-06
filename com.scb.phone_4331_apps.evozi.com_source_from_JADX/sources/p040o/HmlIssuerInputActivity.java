package p040o;

import p039io.realm.internal.OsObject;
import p039io.realm.internal.OsObject$MediaBrowserCompat$ItemReceiver;
import p039io.realm.internal.Row;
import p040o.HmlNTBCaptureDocumentActivity;

/* renamed from: o.HmlIssuerInputActivity */
public final class HmlIssuerInputActivity<E extends HmlNTBCaptureDocumentActivity> {
    onButtonClicked<OsObject$MediaBrowserCompat$ItemReceiver> IconCompatParcelizer = new onButtonClicked<>();
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public HmlEtbConfirmationOtpActivity MediaBrowserCompat$ItemReceiver;
    public boolean MediaDescriptionCompat = true;
    public Row MediaMetadataCompat;
    E read;
    OsObject write;

    /* renamed from: o.HmlIssuerInputActivity$IconCompatParcelizer */
    static class IconCompatParcelizer<T extends HmlNTBCaptureDocumentActivity> implements HmlNTBApplicationOutcomeActivity<T> {
        private final HmlNTBAccountConsentActivity<T> MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(HmlNTBAccountConsentActivity<T> hmlNTBAccountConsentActivity) {
            if (hmlNTBAccountConsentActivity != null) {
                this.MediaBrowserCompat$ItemReceiver = hmlNTBAccountConsentActivity;
                return;
            }
            throw new IllegalArgumentException("Listener should not be null");
        }

        public final boolean equals(Object obj) {
            return (obj instanceof IconCompatParcelizer) && this.MediaBrowserCompat$ItemReceiver == ((IconCompatParcelizer) obj).MediaBrowserCompat$ItemReceiver;
        }

        public final int hashCode() {
            return this.MediaBrowserCompat$ItemReceiver.hashCode();
        }
    }

    public HmlIssuerInputActivity() {
    }

    public HmlIssuerInputActivity(E e) {
        this.read = e;
    }
}

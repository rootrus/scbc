package p040o;

import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import p040o.CredentialRequest;
import p040o.resetAnalyticsData;

/* renamed from: o.zzco */
public final /* synthetic */ class zzco implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ CredentialRequest.Builder write;

    public /* synthetic */ zzco(CredentialRequest.Builder builder) {
        this.write = builder;
    }

    public final Object write(Object obj) {
        CredentialRequest.Builder builder = this.write;
        notifyListeners notifylisteners = (notifyListeners) obj;
        if (notifylisteners.read == null || notifylisteners.read.MediaBrowserCompat$CustomActionResultReceiver == null || notifylisteners.read.read == null || notifylisteners.read.MediaBrowserCompat$ItemReceiver == null) {
            throw new EntityMappingException("EasycashReferralVerificationEntity: some field is null", (Throwable) null);
        } else if (notifylisteners.write != null) {
            resetAnalyticsData.read read = new resetAnalyticsData.read();
            read.read = builder.IconCompatParcelizer(notifylisteners.write);
            read.MediaBrowserCompat$CustomActionResultReceiver = CredentialRequest.Builder.MediaBrowserCompat$ItemReceiver(notifylisteners.read);
            return new resetAnalyticsData(read, (byte) 0);
        } else {
            throw new EntityMappingException("EasycashConsentDocumentEntity: is null", (Throwable) null);
        }
    }
}

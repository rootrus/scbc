package p040o;

import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import p040o.Api;

/* renamed from: o.StandardTable$Row$RowEntrySet$MediaBrowserCompat$ItemReceiver */
public final class StandardTable$Row$RowEntrySet$MediaBrowserCompat$ItemReceiver implements findFragmentByWho {
    private final /* synthetic */ Api.AnyClientKey read;

    private StandardTable$Row$RowEntrySet$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ StandardTable$Row$RowEntrySet$MediaBrowserCompat$ItemReceiver(Api.AnyClientKey anyClientKey) {
        this.read = anyClientKey;
    }

    public final Object IconCompatParcelizer(Object obj) {
        LottieTask lottieTask = (LottieTask) obj;
        if (lottieTask == null) {
            throw new EntityMappingException("EasycashConsentDocumentEntity: data is null", (Throwable) null);
        } else if (lottieTask.write == null) {
            throw new EntityMappingException("EasycashConsentDocumentEntity: data.consentDocuments.content is null", (Throwable) null);
        } else if (lottieTask.read != null) {
            return new BillerAdapter$ItemViewHolder(lottieTask.write, lottieTask.read, lottieTask.IconCompatParcelizer);
        } else {
            throw new EntityMappingException("EasycashConsentDocumentEntity: data.consentDocuments.consentType is null", (Throwable) null);
        }
    }
}

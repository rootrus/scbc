package p040o;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: o.FragmentBuilder_BindScheduleBulkTransferFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6763x7d82b342 extends HmlDocumentSubmissionTutorialsActivity {
    int MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ FragmentBuilder_BindScheduleBulkTransferFragment MediaBrowserCompat$ItemReceiver;
    /* synthetic */ Object write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6763x7d82b342(FragmentBuilder_BindScheduleBulkTransferFragment fragmentBuilder_BindScheduleBulkTransferFragment, HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity) {
        super(hmlNTBPromptPayNotFoundActivity);
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindScheduleBulkTransferFragment;
    }

    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.MediaBrowserCompat$CustomActionResultReceiver |= PKIFailureInfo.systemUnavail;
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this);
    }
}

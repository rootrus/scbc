package p040o;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: o.FragmentBuilder_BindScheduleBulkTransferFragment$MediaBrowserCompat$ItemReceiver */
final class C6764x377d6d91 extends HmlDocumentSubmissionTutorialsActivity {
    int MediaBrowserCompat$CustomActionResultReceiver;
    /* synthetic */ Object read;
    private /* synthetic */ FragmentBuilder_BindScheduleBulkTransferFragment write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6764x377d6d91(FragmentBuilder_BindScheduleBulkTransferFragment fragmentBuilder_BindScheduleBulkTransferFragment, HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity) {
        super(hmlNTBPromptPayNotFoundActivity);
        this.write = fragmentBuilder_BindScheduleBulkTransferFragment;
    }

    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.MediaBrowserCompat$CustomActionResultReceiver |= PKIFailureInfo.systemUnavail;
        return this.write.IconCompatParcelizer((HmlNTBPromptPayNotFoundActivity<? super Boolean>) this);
    }
}

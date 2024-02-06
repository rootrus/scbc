package retrofit2;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.HmlDocumentSubmissionTutorialsActivity;
import p040o.HmlNTBPromptPayNotFoundActivity;

final class KotlinExtensions$yieldAndThrow$1 extends HmlDocumentSubmissionTutorialsActivity {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    KotlinExtensions$yieldAndThrow$1(HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity) {
        super(hmlNTBPromptPayNotFoundActivity);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return KotlinExtensions.yieldAndThrow((Exception) null, this);
    }
}

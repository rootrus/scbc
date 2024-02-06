package p040o;

import com.thunderhead.android.domain.authentication.ClientCredentials;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: o.FragmentBuilder_BindNTBLifestyleLandingFragment$MediaBrowserCompat$SearchResultReceiver */
final class C6581x44fc22b extends HmlDocumentSubmissionTutorialsActivity {
    /* synthetic */ Object IconCompatParcelizer;
    private /* synthetic */ FragmentBuilder_BindNTBLifestyleLandingFragment MediaBrowserCompat$ItemReceiver;
    int read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6581x44fc22b(FragmentBuilder_BindNTBLifestyleLandingFragment fragmentBuilder_BindNTBLifestyleLandingFragment, HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity) {
        super(hmlNTBPromptPayNotFoundActivity);
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindNTBLifestyleLandingFragment;
    }

    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.read |= PKIFailureInfo.systemUnavail;
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer((List<ClientCredentials>) null, this);
    }
}

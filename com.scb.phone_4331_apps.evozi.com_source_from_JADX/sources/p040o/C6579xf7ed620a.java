package p040o;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: o.FragmentBuilder_BindNTBLifestyleLandingFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6579xf7ed620a extends HmlDocumentSubmissionTutorialsActivity {
    Object IconCompatParcelizer;
    Object MediaBrowserCompat$CustomActionResultReceiver;
    Object MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ FragmentBuilder_BindNTBLifestyleLandingFragment MediaBrowserCompat$MediaItem;
    /* synthetic */ Object MediaDescriptionCompat;
    Object read;
    int write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6579xf7ed620a(FragmentBuilder_BindNTBLifestyleLandingFragment fragmentBuilder_BindNTBLifestyleLandingFragment, HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity) {
        super(hmlNTBPromptPayNotFoundActivity);
        this.MediaBrowserCompat$MediaItem = fragmentBuilder_BindNTBLifestyleLandingFragment;
    }

    public final Object invokeSuspend(Object obj) {
        this.MediaDescriptionCompat = obj;
        this.write |= PKIFailureInfo.systemUnavail;
        return this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver((C6578x4a06f497) null, this);
    }
}

package p040o;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: o.FragmentBuilder_BindNsipPartnerPaymentSuccessFragment$MediaBrowserCompat$ItemReceiver */
final class C6593x9788d434 extends HmlDocumentSubmissionTutorialsActivity {
    Object IconCompatParcelizer;
    Object MediaBrowserCompat$CustomActionResultReceiver;
    Object MediaBrowserCompat$ItemReceiver;
    Object MediaBrowserCompat$MediaItem;
    Object MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    /* synthetic */ Object f3147x50fd9e4a;
    int MediaDescriptionCompat;
    Object MediaMetadataCompat;
    private /* synthetic */ FragmentBuilder_BindNsipPartnerPaymentSuccessFragment MediaSessionCompat$Token;
    Object RatingCompat;
    Object read;
    Object write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6593x9788d434(FragmentBuilder_BindNsipPartnerPaymentSuccessFragment fragmentBuilder_BindNsipPartnerPaymentSuccessFragment, HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity) {
        super(hmlNTBPromptPayNotFoundActivity);
        this.MediaSessionCompat$Token = fragmentBuilder_BindNsipPartnerPaymentSuccessFragment;
    }

    public final Object invokeSuspend(Object obj) {
        this.f3147x50fd9e4a = obj;
        this.MediaDescriptionCompat |= PKIFailureInfo.systemUnavail;
        return this.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver((C6578x4a06f497) null, this);
    }
}

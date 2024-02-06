package p040o;

/* renamed from: o.zac */
public final class zac extends FragmentBuilder_BindSummaryFragment {
    public final GoogleSignInOptions MediaBrowserCompat$CustomActionResultReceiver;

    @HmlPinActivity
    public zac(isExpired isexpired, getGrantedScopes getgrantedscopes, GoogleSignInOptions googleSignInOptions) {
        onGetStartedClick.write((Object) isexpired, "billPaymentEntityMapper");
        onGetStartedClick.write((Object) getgrantedscopes, "creditCardFullAmountEntityMapper");
        onGetStartedClick.write((Object) googleSignInOptions, "merchantMetaDataEntityMapper");
        this.MediaBrowserCompat$CustomActionResultReceiver = googleSignInOptions;
    }
}

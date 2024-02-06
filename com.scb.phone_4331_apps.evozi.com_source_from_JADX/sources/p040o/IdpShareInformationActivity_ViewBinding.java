package p040o;

/* renamed from: o.IdpShareInformationActivity_ViewBinding */
public final class IdpShareInformationActivity_ViewBinding implements MwCasaOtpActivity {
    private final HmlPromptPayVerificationActivity IconCompatParcelizer;

    public IdpShareInformationActivity_ViewBinding(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        this.IconCompatParcelizer = hmlPromptPayVerificationActivity;
    }

    public final HmlPromptPayVerificationActivity MediaBrowserCompat$CustomActionResultReceiver() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CoroutineScope(coroutineContext=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}

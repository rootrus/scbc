package p040o;

import android.hardware.biometrics.BiometricPrompt;

/* renamed from: o.FragmentBuilder_BindDeejungTransferConfirmationHeaderFragment */
public final class FragmentBuilder_BindDeejungTransferConfirmationHeaderFragment extends BiometricPrompt.AuthenticationCallback {
    private final KtaJsonCheck_MembersInjector read;

    public FragmentBuilder_BindDeejungTransferConfirmationHeaderFragment(KtaJsonCheck_MembersInjector ktaJsonCheck_MembersInjector) {
        this.read = ktaJsonCheck_MembersInjector;
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        super.onAuthenticationSucceeded(authenticationResult);
        this.read.MediaDescriptionCompat();
    }

    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        super.onAuthenticationHelp(i, charSequence);
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        super.onAuthenticationError(i, charSequence);
        this.read.MediaBrowserCompat$ItemReceiver();
    }

    public final void onAuthenticationFailed() {
        super.onAuthenticationFailed();
        this.read.write();
    }
}

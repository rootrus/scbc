package p040o;

import p040o.LottieTask;
import p040o.setDefaultEventParameters;

/* renamed from: o.executor$MediaBrowserCompat$ItemReceiver */
public final class executor$MediaBrowserCompat$ItemReceiver implements findFragmentByWho {
    private final /* synthetic */ CredentialRequestResponse MediaBrowserCompat$ItemReceiver;

    private executor$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ executor$MediaBrowserCompat$ItemReceiver(CredentialRequestResponse credentialRequestResponse) {
        this.MediaBrowserCompat$ItemReceiver = credentialRequestResponse;
    }

    public final Object IconCompatParcelizer(Object obj) {
        LottieTask.C36291 r3 = (LottieTask.C36291) obj;
        setDefaultEventParameters.read read = new setDefaultEventParameters.read();
        read.IconCompatParcelizer = r3.MediaBrowserCompat$CustomActionResultReceiver;
        read.read = r3.write;
        read.MediaBrowserCompat$CustomActionResultReceiver = r3.IconCompatParcelizer;
        return new setDefaultEventParameters(read, (byte) 0);
    }
}

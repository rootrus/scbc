package com.google.firebase.installations;

final /* synthetic */ class FirebaseInstallations$$Lambda$5 implements Runnable {
    private final FirebaseInstallations arg$1;
    private final boolean arg$2;

    private FirebaseInstallations$$Lambda$5(FirebaseInstallations firebaseInstallations, boolean z) {
        this.arg$1 = firebaseInstallations;
        this.arg$2 = z;
    }

    public static Runnable lambdaFactory$(FirebaseInstallations firebaseInstallations, boolean z) {
        return new FirebaseInstallations$$Lambda$5(firebaseInstallations, z);
    }

    public final void run() {
        this.arg$1.doNetworkCall(this.arg$2);
    }
}

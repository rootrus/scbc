package p040o;

import android.os.IBinder;

/* renamed from: o.setDrawerLockMode */
class setDrawerLockMode implements CheckExtractActivity_MembersInjector {
    private final IBinder IconCompatParcelizer;

    setDrawerLockMode(IBinder iBinder) {
        this.IconCompatParcelizer = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof setDrawerLockMode) && ((setDrawerLockMode) obj).IconCompatParcelizer.equals(this.IconCompatParcelizer);
    }

    public int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }
}

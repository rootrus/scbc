package p040o;

/* renamed from: o.FatcaHelpActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver */
final class C6482x3bd2da75 extends IdpShareInformationActivity<Object> {
    public final FatcaHelpActivity_ViewBinding<?> IconCompatParcelizer;
    private final long MediaBrowserCompat$CustomActionResultReceiver = TouchPointInputCidActivity.MediaBrowserCompat$ItemReceiver.incrementAndGet(BaseTouchPointBreadcrumbActivity.write);
    private WalletAdapter$WalletHolder_ViewBinding MediaBrowserCompat$ItemReceiver;

    public C6482x3bd2da75(FatcaHelpActivity_ViewBinding<?> fatcaHelpActivity_ViewBinding, WalletAdapter$WalletHolder_ViewBinding walletAdapter$WalletHolder_ViewBinding) {
        onGetStartedClick.write((Object) fatcaHelpActivity_ViewBinding, "impl");
        onGetStartedClick.write((Object) walletAdapter$WalletHolder_ViewBinding, "desc");
        this.IconCompatParcelizer = fatcaHelpActivity_ViewBinding;
        this.MediaBrowserCompat$ItemReceiver = walletAdapter$WalletHolder_ViewBinding;
        WalletAdapter$WalletHolder_ViewBinding walletAdapter$WalletHolder_ViewBinding2 = this.MediaBrowserCompat$ItemReceiver;
        IdpShareInformationActivity<?> idpShareInformationActivity = this;
        onGetStartedClick.write((Object) idpShareInformationActivity, "<set-?>");
        walletAdapter$WalletHolder_ViewBinding2.write = idpShareInformationActivity;
    }

    public final long MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AtomicSelectOp(sequence=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(')');
        return sb.toString();
    }

    public final void read(Object obj, Object obj2) {
        boolean z = obj2 == null;
        if (FatcaHelpActivity_ViewBinding.write.compareAndSet(this.IconCompatParcelizer, this, z ? null : this.IconCompatParcelizer) && z) {
            this.IconCompatParcelizer.m3504x50fd9e4a();
        }
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this, obj2);
    }

    public final Object MediaBrowserCompat$ItemReceiver(Object obj) {
        Object obj2;
        if (obj == null) {
            FatcaHelpActivity_ViewBinding<?> fatcaHelpActivity_ViewBinding = this.IconCompatParcelizer;
            while (true) {
                Object obj3 = fatcaHelpActivity_ViewBinding._state;
                obj2 = null;
                if (obj3 != this) {
                    if (!(obj3 instanceof BaseNtbInstructionActivity)) {
                        FatcaHelpActivity_ViewBinding<?> fatcaHelpActivity_ViewBinding2 = this.IconCompatParcelizer;
                        if (obj3 != fatcaHelpActivity_ViewBinding2) {
                            obj2 = BaseTouchPointBreadcrumbActivity.IconCompatParcelizer();
                            break;
                        } else if (FatcaHelpActivity_ViewBinding.write.compareAndSet(fatcaHelpActivity_ViewBinding2, this.IconCompatParcelizer, this)) {
                            break;
                        }
                    } else {
                        ((BaseNtbInstructionActivity) obj3).MediaBrowserCompat$CustomActionResultReceiver((Object) this.IconCompatParcelizer);
                    }
                } else {
                    break;
                }
            }
            if (obj2 != null) {
                return obj2;
            }
        }
        try {
            return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this);
        } catch (Throwable th) {
            if (obj == null) {
                FatcaHelpActivity_ViewBinding.write.compareAndSet(this.IconCompatParcelizer, this, this.IconCompatParcelizer);
            }
            throw th;
        }
    }
}

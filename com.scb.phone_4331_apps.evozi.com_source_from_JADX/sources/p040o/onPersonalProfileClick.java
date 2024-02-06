package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.onPersonalProfileClick */
public final class onPersonalProfileClick<T> extends BScanCNotificationDeepLinkActivity<T> {
    private BondDeepLinkActivity<T> write;

    public onPersonalProfileClick(BondDeepLinkActivity<T> bondDeepLinkActivity) {
        this.write = bondDeepLinkActivity;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity) {
        C7327x9e07984b onpersonalprofileclick_mediabrowsercompat_customactionresultreceiver = new C7327x9e07984b(activateChequeDeepLinkActivity);
        activateChequeDeepLinkActivity.onSubscribe(onpersonalprofileclick_mediabrowsercompat_customactionresultreceiver);
        try {
            this.write.read(onpersonalprofileclick_mediabrowsercompat_customactionresultreceiver);
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            if (!onpersonalprofileclick_mediabrowsercompat_customactionresultreceiver.read(th)) {
                AlertController$RecycleListView.read.read(th);
            }
        }
    }
}

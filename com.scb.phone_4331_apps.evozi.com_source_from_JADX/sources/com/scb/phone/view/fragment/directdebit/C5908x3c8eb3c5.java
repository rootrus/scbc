package com.scb.phone.view.fragment.directdebit;

/* renamed from: com.scb.phone.view.fragment.directdebit.DirectDebitInputBillerListFragment$MediaBrowserCompat$ItemReceiver */
final class C5908x3c8eb3c5 implements Runnable {
    private /* synthetic */ DirectDebitInputBillerListFragment IconCompatParcelizer;

    C5908x3c8eb3c5(DirectDebitInputBillerListFragment directDebitInputBillerListFragment) {
        this.IconCompatParcelizer = directDebitInputBillerListFragment;
    }

    public final void run() {
        if (this.IconCompatParcelizer.getActivity() != null) {
            DirectDebitInputBillerListFragment.read(this.IconCompatParcelizer).MediaMetadataCompat();
        }
    }
}

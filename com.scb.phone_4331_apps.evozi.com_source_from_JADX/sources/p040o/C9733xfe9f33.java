package p040o;

import p040o.FastPaySettingActivity_ViewBinding;

/* renamed from: o.FastPaySettingActivity_ViewBinding$read$MediaBrowserCompat$CustomActionResultReceiver */
final class C9733xfe9f33 implements Runnable {
    private /* synthetic */ FastPaySettingActivity_ViewBinding.read MediaBrowserCompat$CustomActionResultReceiver;

    C9733xfe9f33(FastPaySettingActivity_ViewBinding.read read) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read;
    }

    public final void run() {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.dispose();
    }
}

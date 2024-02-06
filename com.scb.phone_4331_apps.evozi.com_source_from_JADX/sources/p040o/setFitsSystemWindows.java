package p040o;

import android.view.View;

/* renamed from: o.setFitsSystemWindows */
public final class setFitsSystemWindows {
    private C1489xd441f23d MediaBrowserCompat$ItemReceiver = new C1489xd441f23d();
    final IconCompatParcelizer read;

    /* renamed from: o.setFitsSystemWindows$IconCompatParcelizer */
    public interface IconCompatParcelizer {
        int IconCompatParcelizer();

        View IconCompatParcelizer(int i);

        int MediaBrowserCompat$CustomActionResultReceiver(View view);

        int MediaBrowserCompat$ItemReceiver();

        int write(View view);
    }

    public setFitsSystemWindows(IconCompatParcelizer iconCompatParcelizer) {
        this.read = iconCompatParcelizer;
    }

    public final View MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, int i3, int i4) {
        int IconCompatParcelizer2 = this.read.IconCompatParcelizer();
        int MediaBrowserCompat$ItemReceiver2 = this.read.MediaBrowserCompat$ItemReceiver();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View IconCompatParcelizer3 = this.read.IconCompatParcelizer(i);
            int MediaBrowserCompat$CustomActionResultReceiver = this.read.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer3);
            int write = this.read.write(IconCompatParcelizer3);
            C1489xd441f23d setfitssystemwindows_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver;
            setfitssystemwindows_mediabrowsercompat_customactionresultreceiver.read = IconCompatParcelizer2;
            setfitssystemwindows_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver2;
            setfitssystemwindows_mediabrowsercompat_customactionresultreceiver.write = MediaBrowserCompat$CustomActionResultReceiver;
            setfitssystemwindows_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver = write;
            if (i3 != 0) {
                this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = 0;
                this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver |= i3;
                if (this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver()) {
                    return IconCompatParcelizer3;
                }
            }
            if (i4 != 0) {
                this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = 0;
                this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver |= i4;
                if (this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver()) {
                    view = IconCompatParcelizer3;
                }
            }
            i += i5;
        }
        return view;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(View view) {
        C1489xd441f23d setfitssystemwindows_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver;
        int IconCompatParcelizer2 = this.read.IconCompatParcelizer();
        int MediaBrowserCompat$ItemReceiver2 = this.read.MediaBrowserCompat$ItemReceiver();
        int MediaBrowserCompat$CustomActionResultReceiver = this.read.MediaBrowserCompat$CustomActionResultReceiver(view);
        int write = this.read.write(view);
        setfitssystemwindows_mediabrowsercompat_customactionresultreceiver.read = IconCompatParcelizer2;
        setfitssystemwindows_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver2;
        setfitssystemwindows_mediabrowsercompat_customactionresultreceiver.write = MediaBrowserCompat$CustomActionResultReceiver;
        setfitssystemwindows_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver = write;
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = 0;
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver |= 24579;
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
    }
}

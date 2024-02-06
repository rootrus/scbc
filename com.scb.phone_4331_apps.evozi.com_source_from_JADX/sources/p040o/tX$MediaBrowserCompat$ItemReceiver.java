package p040o;

import java.util.List;

/* renamed from: o.tX$MediaBrowserCompat$ItemReceiver */
public interface tX$MediaBrowserCompat$ItemReceiver {
    void IconCompatParcelizer(getModel getmodel);

    void IconCompatParcelizer(boolean z, boolean z2);

    void MediaBrowserCompat$CustomActionResultReceiver();

    void MediaBrowserCompat$CustomActionResultReceiver(getModelClass getmodelclass, isSimulator issimulator, int i);

    void MediaBrowserCompat$ItemReceiver();

    void MediaBrowserCompat$ItemReceiver(List<isSimulator> list);

    void onDestroy();

    void read(int i);

    void read(getModel getmodel);

    void read(isSimulator issimulator);

    void write(String str, String str2, int i);

    void write(getCustomAttributes getcustomattributes);

    void write(isSimulator issimulator, int i);

    void write(tX$MediaBrowserCompat$CustomActionResultReceiver tx_mediabrowsercompat_customactionresultreceiver);

    boolean write(List<String> list);
}

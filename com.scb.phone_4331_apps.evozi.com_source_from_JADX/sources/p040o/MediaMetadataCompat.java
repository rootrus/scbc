package p040o;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import android.support.p044v4.media.session.MediaSessionCompat;
import android.support.p044v4.media.session.ParcelableVolumeInfo;
import android.support.p044v4.media.session.PlaybackStateCompat;
import java.util.List;

/* renamed from: o.MediaMetadataCompat */
public interface MediaMetadataCompat extends IInterface {
    void IconCompatParcelizer(android.support.p044v4.media.MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

    void IconCompatParcelizer(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;

    void IconCompatParcelizer(boolean z) throws RemoteException;

    void MediaBrowserCompat$CustomActionResultReceiver() throws RemoteException;

    void MediaBrowserCompat$ItemReceiver(int i) throws RemoteException;

    void MediaBrowserCompat$ItemReceiver(PlaybackStateCompat playbackStateCompat) throws RemoteException;

    void read(Bundle bundle) throws RemoteException;

    void read(CharSequence charSequence) throws RemoteException;

    void read(String str, Bundle bundle) throws RemoteException;

    void read(List<MediaSessionCompat.QueueItem> list) throws RemoteException;

    void read(boolean z) throws RemoteException;

    void write() throws RemoteException;

    void write(int i) throws RemoteException;
}

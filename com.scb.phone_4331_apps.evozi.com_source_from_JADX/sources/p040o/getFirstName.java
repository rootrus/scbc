package p040o;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;
import p040o.Component;

/* renamed from: o.getFirstName */
public interface getFirstName extends IInterface {

    /* renamed from: o.getFirstName$IconCompatParcelizer */
    public interface IconCompatParcelizer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void IconCompatParcelizer(float f);

        void IconCompatParcelizer(String str);

        void IconCompatParcelizer(boolean z);

        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$CustomActionResultReceiver(double d);

        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$ItemReceiver(boolean z);

        void MediaBrowserCompat$MediaItem();

        void MediaBrowserCompat$MediaItem(String str);

        void MediaBrowserCompat$SearchResultReceiver();

        void MediaBrowserCompat$SearchResultReceiver(String str);

        void MediaDescriptionCompat();

        void MediaDescriptionCompat(String str);

        void MediaMetadataCompat();

        void MediaMetadataCompat(String str);

        void MediaSessionCompat$QueueItem();

        void RatingCompat();

        void read();

        void read(String str);

        void read(boolean z);

        void write();

        void write(String str);
    }

    /* renamed from: o.getFirstName$MediaDescriptionCompat */
    public interface MediaDescriptionCompat extends CheckCaptureModule_GetICheckDeserializerRttiFactory, IdCaptureActivity {
        void IconCompatParcelizer();

        void IconCompatParcelizer(List<isAlwaysEager> list);

        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$CustomActionResultReceiver(int i);

        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$ItemReceiver(isAlwaysEager isalwayseager);

        void MediaBrowserCompat$MediaItem();

        void MediaBrowserCompat$SearchResultReceiver();

        void MediaMetadataCompat();

        void RatingCompat();

        void read();

        void write();
    }

    /* renamed from: o.getFirstName$read */
    public interface read extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void IconCompatParcelizer(lambda$intoSet$2 lambda_intoset_2);

        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$ItemReceiver(boolean z);

        void MediaBrowserCompat$MediaItem();

        void read();

        void write();
    }

    /* renamed from: o.getFirstName$write */
    public interface write extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void IconCompatParcelizer(String str);

        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$MediaItem(String str);

        void MediaBrowserCompat$SearchResultReceiver(String str);

        void MediaDescriptionCompat(String str);

        void MediaMetadataCompat(String str);

        void MediaSessionCompat$QueueItem(String str);

        void MediaSessionCompat$Token(String str);

        void RatingCompat(String str);

        void read();

        void read(String str);

        void read(Component.C31841 r1, Component$$Lambda$3 component$$Lambda$3);

        void write();

        void write(String str);

        void write(Component.C31841 r1, Component$$Lambda$3 component$$Lambda$3);
    }

    void read(Bundle bundle) throws RemoteException;

    void write(Bundle bundle) throws RemoteException;
}

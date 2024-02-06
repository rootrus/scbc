package p040o;

import android.graphics.Color;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.addI8;

/* renamed from: o.getPackedSize */
public abstract class getPackedSize<T extends addI8> implements subByte2<T> {
    public subShort4 IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    private float MediaBrowserCompat$MediaItem;
    private FieldPacker$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private boolean f2591x50fd9e4a;
    private String MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private float MediaSessionCompat$QueueItem;
    private List<Integer> MediaSessionCompat$ResultReceiverWrapper;
    private transient addU16 MediaSessionCompat$Token;
    private Typeface ParcelableVolumeInfo;
    private float RatingCompat;
    public List<Integer> read;
    private addToPack$MediaBrowserCompat$ItemReceiver write;

    public getPackedSize() {
        this.read = null;
        this.MediaSessionCompat$ResultReceiverWrapper = null;
        this.MediaDescriptionCompat = "DataSet";
        this.write = addToPack$MediaBrowserCompat$ItemReceiver.LEFT;
        this.MediaMetadataCompat = true;
        this.MediaBrowserCompat$SearchResultReceiver = FieldPacker$MediaBrowserCompat$ItemReceiver.DEFAULT;
        this.RatingCompat = Float.NaN;
        this.MediaBrowserCompat$MediaItem = Float.NaN;
        this.MediaBrowserCompat$ItemReceiver = true;
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
        this.IconCompatParcelizer = new subShort4();
        this.MediaSessionCompat$QueueItem = 17.0f;
        this.f2591x50fd9e4a = true;
        this.read = new ArrayList();
        this.MediaSessionCompat$ResultReceiverWrapper = new ArrayList();
        this.read.add(Integer.valueOf(Color.rgb(CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA, 234, 255)));
        this.MediaSessionCompat$ResultReceiverWrapper.add(-16777216);
    }

    public getPackedSize(String str) {
        this();
        this.MediaDescriptionCompat = str;
    }

    public final List<Integer> MediaBrowserCompat$CustomActionResultReceiver() {
        return this.read;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        List<Integer> list = this.read;
        return list.get(i % list.size()).intValue();
    }

    public final String MediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo18473x50fd9e4a() {
        return this.MediaMetadataCompat;
    }

    public final void MediaBrowserCompat$ItemReceiver(addU16 addu16) {
        if (addu16 != null) {
            this.MediaSessionCompat$Token = addu16;
        }
    }

    public final boolean MediaSessionCompat$QueueItem() {
        return this.MediaSessionCompat$Token == null;
    }

    public final void write(int i) {
        this.MediaSessionCompat$ResultReceiverWrapper.clear();
        this.MediaSessionCompat$ResultReceiverWrapper.add(-1);
    }

    public final void read(Typeface typeface) {
        this.ParcelableVolumeInfo = typeface;
    }

    public final void read(float f) {
        this.MediaSessionCompat$QueueItem = subShort3.read(16.0f);
    }

    public final int read(int i) {
        List<Integer> list = this.MediaSessionCompat$ResultReceiverWrapper;
        return list.get(i % list.size()).intValue();
    }

    public final Typeface MediaBrowserCompat$SearchResultReceiver() {
        return this.ParcelableVolumeInfo;
    }

    public final float MediaMetadataCompat() {
        return this.MediaSessionCompat$QueueItem;
    }

    public final FieldPacker$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public final float write() {
        return this.RatingCompat;
    }

    public final float read() {
        return this.MediaBrowserCompat$MediaItem;
    }

    public final boolean ParcelableVolumeInfo() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final boolean MediaSessionCompat$Token() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final subShort4 MediaBrowserCompat$MediaItem() {
        return this.IconCompatParcelizer;
    }

    public final boolean MediaSessionCompat$ResultReceiverWrapper() {
        return this.f2591x50fd9e4a;
    }

    public final addToPack$MediaBrowserCompat$ItemReceiver IconCompatParcelizer() {
        return this.write;
    }

    public final addU16 RatingCompat() {
        if (this.MediaSessionCompat$Token == null) {
            return subShort3.MediaBrowserCompat$CustomActionResultReceiver();
        }
        return this.MediaSessionCompat$Token;
    }
}

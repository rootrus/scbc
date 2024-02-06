package p040o;

import com.scb.phone.domain.interactor.ReviewInfoCase;
import p040o.ByteStreams;
import p040o.Iterables;
import p040o.KtaJsonCheck;

/* renamed from: o.cp */
public class C4212cp extends writeUInt64NoTag<KtaJsonCheck.MediaMetadataCompat> {
    public final ReviewInfoCase IconCompatParcelizer;
    public final getInput MediaBrowserCompat$ItemReceiver;
    public final Iterables.C352212 read;
    public getProjection write;

    @HmlPinActivity
    public C4212cp(RegularImmutableBiMap regularImmutableBiMap, ReviewInfoCase reviewInfoCase, getInput getinput, ByteStreams.ByteArrayDataInputStream byteArrayDataInputStream, readBytes readbytes, newDataInput newdatainput, getDigest getdigest, skipFully skipfully, length length, newInputStreamSupplier newinputstreamsupplier, ByteStreams.C31353 r11, Iterables.C352212 r12) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = reviewInfoCase;
        this.MediaBrowserCompat$ItemReceiver = getinput;
        getinput.MediaBrowserCompat$SearchResultReceiver = byteArrayDataInputStream;
        this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat = readbytes;
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = newdatainput;
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = getdigest;
        this.MediaBrowserCompat$ItemReceiver.RatingCompat = skipfully;
        this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat = length;
        this.MediaBrowserCompat$ItemReceiver.read = newinputstreamsupplier;
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem = r11;
        this.read = r12;
    }
}

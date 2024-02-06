package p040o;

import java.util.List;
import p040o.CharMatcher;
import p040o.Sets;
import p040o.getHorizontalStreaks;

/* renamed from: o.getDestination */
public abstract class getDestination<V extends getHorizontalStreaks> extends writeUInt64NoTag<V> {
    private Sets.PowerSet.BitFilteredSetIterator IconCompatParcelizer;
    private final CharMatcher.C31612 MediaBrowserCompat$ItemReceiver;
    public LocationAvailability read;
    final SingletonImmutableSet write;

    /* access modifiers changed from: protected */
    public abstract LocationCallback MediaBrowserCompat$CustomActionResultReceiver();

    /* access modifiers changed from: protected */
    public abstract List<String> MediaBrowserCompat$ItemReceiver();

    /* access modifiers changed from: protected */
    public abstract void write();

    public getDestination(RegularImmutableBiMap regularImmutableBiMap, SingletonImmutableSet singletonImmutableSet, Sets.PowerSet.BitFilteredSetIterator bitFilteredSetIterator, CharMatcher.C31612 r4) {
        super(regularImmutableBiMap);
        this.write = singletonImmutableSet;
        this.IconCompatParcelizer = bitFilteredSetIterator;
        this.MediaBrowserCompat$ItemReceiver = r4;
    }

    public final /* synthetic */ void write(getHorizontalStreaks gethorizontalstreaks) {
        gethorizontalstreaks.write(this.IconCompatParcelizer.MediaDescriptionCompat(this.read.MediaBrowserCompat$CustomActionResultReceiver), this.IconCompatParcelizer.read(this.read));
    }

    public void IconCompatParcelizer() {
        setDocumentClassIndexField setdocumentclassindexfield = setDocumentClassIndexField.read;
        if (this.RatingCompat != null) {
            setdocumentclassindexfield.IconCompatParcelizer(this.RatingCompat);
        }
        write();
    }

    public final /* synthetic */ void read(getHorizontalStreaks gethorizontalstreaks) {
        gethorizontalstreaks.write(this.IconCompatParcelizer.MediaDescriptionCompat(this.read.MediaBrowserCompat$CustomActionResultReceiver), this.IconCompatParcelizer.read(this.read));
    }

    public void onDestroy() {
        super.onDestroy();
        CharMatcher.C31612 r0 = this.MediaBrowserCompat$ItemReceiver;
        if (!r0.MediaBrowserCompat$MediaItem.isDisposed()) {
            r0.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    public final void IconCompatParcelizer(isProximityOn isproximityon) {
        C3597xa9335a5d write2 = LocationAvailability.write();
        write2.read = "O";
        write2.IconCompatParcelizer = isproximityon.read;
        boolean z = false;
        this.read = new LocationAvailability(write2, (byte) 0);
        isDocumentClassIndexField isdocumentclassindexfield = new isDocumentClassIndexField(this);
        if (this.RatingCompat != null) {
            z = true;
        }
        if (z) {
            isdocumentclassindexfield.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void write(isProximityOn isproximityon) {
        boolean z = true;
        if (isproximityon.MediaMetadataCompat) {
            this.read = null;
            setUserName setusername = setUserName.read;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setusername.IconCompatParcelizer(this.RatingCompat);
            }
            IconCompatParcelizer();
            return;
        }
        C3597xa9335a5d write2 = LocationAvailability.write();
        write2.read = isproximityon.write;
        write2.IconCompatParcelizer = isproximityon.read;
        write2.MediaBrowserCompat$CustomActionResultReceiver = isproximityon.MediaBrowserCompat$CustomActionResultReceiver;
        write2.MediaBrowserCompat$ItemReceiver = isproximityon.MediaBrowserCompat$ItemReceiver;
        write2.write = isproximityon.IconCompatParcelizer;
        this.read = new LocationAvailability(write2, (byte) 0);
        getIsBatchClassIndexFieldString getisbatchclassindexfieldstring = new getIsBatchClassIndexFieldString(this);
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getisbatchclassindexfieldstring.IconCompatParcelizer(this.RatingCompat);
        }
        IconCompatParcelizer();
    }

    public final void read() {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(new ForwardingMultimap(MediaBrowserCompat$ItemReceiver()));
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new getDestination$MediaBrowserCompat$CustomActionResultReceiver(this));
    }
}

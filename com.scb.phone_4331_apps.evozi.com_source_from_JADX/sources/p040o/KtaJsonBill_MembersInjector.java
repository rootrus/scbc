package p040o;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import p040o.AppMeasurementSdk;
import p040o.getTopLeftCornerWidth;
import p040o.zzag;

/* renamed from: o.KtaJsonBill_MembersInjector */
public class KtaJsonBill_MembersInjector extends writeUInt64NoTag<getTopLeftCornerWidth.ExpandedMenuView> {
    final zzag.zzb IconCompatParcelizer;
    final Shorts MediaBrowserCompat$ItemReceiver;
    final onInfoWindowLongClick MediaBrowserCompat$MediaItem;
    public final ForwardingBlockingQueue MediaDescriptionCompat;
    public final AppMeasurementSdk.OnEventListener MediaMetadataCompat;
    final notifyStopped read;
    public List<parseFile> write = new ArrayList();

    @HmlPinActivity
    public KtaJsonBill_MembersInjector(notifyStopped notifystopped, ForwardingBlockingQueue forwardingBlockingQueue, RegularImmutableBiMap regularImmutableBiMap, AppMeasurementSdk.OnEventListener onEventListener, Shorts shorts) {
        super(regularImmutableBiMap);
        this.read = notifystopped;
        this.MediaDescriptionCompat = forwardingBlockingQueue;
        this.MediaMetadataCompat = onEventListener;
        this.MediaBrowserCompat$MediaItem = onEventListener.read.write();
        this.IconCompatParcelizer = onEventListener.IconCompatParcelizer.AlertController$RecycleListView();
        this.MediaBrowserCompat$ItemReceiver = shorts;
    }

    public void onDestroy() {
        super.onDestroy();
        AppMeasurementSdk.OnEventListener onEventListener = this.MediaMetadataCompat;
        if (!onEventListener.MediaBrowserCompat$MediaItem.isDisposed()) {
            onEventListener.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean write() {
        return this.MediaBrowserCompat$MediaItem != null && IGoogleMapDelegate.OWN.equals(getICheckDeserializerRtti.MediaSessionCompat$Token(this.MediaBrowserCompat$MediaItem.ActionMenuItemView));
    }

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer() {
        if (this.MediaBrowserCompat$MediaItem != null) {
            if (IGoogleMapDelegate.OWN.equals(getICheckDeserializerRtti.MediaSessionCompat$Token(this.MediaBrowserCompat$MediaItem.ActionMenuItemView)) || IGoogleMapDelegate.SCB.equals(getICheckDeserializerRtti.MediaSessionCompat$Token(this.MediaBrowserCompat$MediaItem.ActionMenuItemView)) || IGoogleMapDelegate.OTHER.equals(getICheckDeserializerRtti.MediaSessionCompat$Token(this.MediaBrowserCompat$MediaItem.ActionMenuItemView))) {
                return true;
            }
            return false;
        } else if (this.IconCompatParcelizer == null) {
            return false;
        } else {
            return true;
        }
    }

    static /* synthetic */ boolean IconCompatParcelizer(boolean z, StreetViewPanoramaFragment streetViewPanoramaFragment) {
        if (!z || "000".equalsIgnoreCase(streetViewPanoramaFragment.MediaBrowserCompat$CustomActionResultReceiver) || "014".equalsIgnoreCase(streetViewPanoramaFragment.MediaBrowserCompat$CustomActionResultReceiver)) {
            return true;
        }
        return false;
    }

    static /* synthetic */ void IconCompatParcelizer(isSupportFragmentClass issupportfragmentclass, String str, getTopLeftCornerWidth.ExpandedMenuView expandedMenuView) {
        T t = issupportfragmentclass.IconCompatParcelizer;
        if (t != null) {
            expandedMenuView.MediaBrowserCompat$ItemReceiver((parseOs) t, str);
            return;
        }
        throw new NoSuchElementException("No value present");
    }

    static /* synthetic */ void read(isSupportFragmentClass issupportfragmentclass, getTopLeftCornerWidth.ExpandedMenuView expandedMenuView) {
        T t = issupportfragmentclass.IconCompatParcelizer;
        if (t != null) {
            expandedMenuView.write((parseFile) t);
            return;
        }
        throw new NoSuchElementException("No value present");
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(isSupportFragmentClass issupportfragmentclass, getTopLeftCornerWidth.ExpandedMenuView expandedMenuView) {
        T t = issupportfragmentclass.IconCompatParcelizer;
        if (t != null) {
            expandedMenuView.write((parseFile) t);
            return;
        }
        throw new NoSuchElementException("No value present");
    }
}

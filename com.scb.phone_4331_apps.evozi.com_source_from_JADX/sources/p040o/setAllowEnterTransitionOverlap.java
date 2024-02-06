package p040o;

/* renamed from: o.setAllowEnterTransitionOverlap */
public final class setAllowEnterTransitionOverlap extends AudioAttributesCompat<isStateSaved, performOptionsMenuClosed<?>> implements restoreChildFragmentState {
    private restoreChildFragmentState$MediaBrowserCompat$ItemReceiver write;

    public final /* synthetic */ performOptionsMenuClosed IconCompatParcelizer(isStateSaved isstatesaved) {
        return (performOptionsMenuClosed) super.write(isstatesaved);
    }

    public final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        performOptionsMenuClosed performoptionsmenuclosed = (performOptionsMenuClosed) obj;
        if (performoptionsmenuclosed == null) {
            return super.MediaBrowserCompat$CustomActionResultReceiver(null);
        }
        return performoptionsmenuclosed.read();
    }

    public final /* synthetic */ performOptionsMenuClosed MediaBrowserCompat$ItemReceiver(isStateSaved isstatesaved, performOptionsMenuClosed performoptionsmenuclosed) {
        return (performOptionsMenuClosed) super.read(isstatesaved, performoptionsmenuclosed);
    }

    public final /* synthetic */ void write(Object obj, Object obj2) {
        performOptionsMenuClosed performoptionsmenuclosed = (performOptionsMenuClosed) obj2;
        restoreChildFragmentState$MediaBrowserCompat$ItemReceiver restorechildfragmentstate_mediabrowsercompat_itemreceiver = this.write;
        if (restorechildfragmentstate_mediabrowsercompat_itemreceiver != null && performoptionsmenuclosed != null) {
            restorechildfragmentstate_mediabrowsercompat_itemreceiver.IconCompatParcelizer(performoptionsmenuclosed);
        }
    }

    public setAllowEnterTransitionOverlap(long j) {
        super(j);
    }

    public final void MediaBrowserCompat$ItemReceiver(restoreChildFragmentState$MediaBrowserCompat$ItemReceiver restorechildfragmentstate_mediabrowsercompat_itemreceiver) {
        this.write = restorechildfragmentstate_mediabrowsercompat_itemreceiver;
    }

    public final void write(int i) {
        if (i >= 40) {
            MediaBrowserCompat$ItemReceiver();
        } else if (i >= 20 || i == 15) {
            write(IconCompatParcelizer() / 2);
        }
    }
}

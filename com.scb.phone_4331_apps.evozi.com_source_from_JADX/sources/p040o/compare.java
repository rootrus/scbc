package p040o;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.compare */
public abstract class compare extends seperateArgsAndBindings {
    private getReturn IconCompatParcelizer;
    private setArg MediaBrowserCompat$CustomActionResultReceiver;
    private setGlobal MediaBrowserCompat$ItemReceiver;
    private getGlobal write;

    /* access modifiers changed from: protected */
    public abstract void MediaMetadataCompat();

    protected compare() {
        MediaMetadataCompat();
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null || this.write == null || this.IconCompatParcelizer == null || this.MediaBrowserCompat$ItemReceiver == null) {
            throw new IllegalStateException("setup incomplete");
        }
    }

    public final boolean IconCompatParcelizer(RecyclerView.setContentView setcontentview) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcontentview);
    }

    public final boolean write(RecyclerView.setContentView setcontentview) {
        return this.write.MediaBrowserCompat$CustomActionResultReceiver(setcontentview);
    }

    public final boolean MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview, int i, int i2, int i3, int i4) {
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(setcontentview, i, i2, i3, i4);
    }

    public boolean write(RecyclerView.setContentView setcontentview, RecyclerView.setContentView setcontentview2, int i, int i2, int i3, int i4) {
        return setcontentview == setcontentview2 ? this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(setcontentview, i, i2, i3, i4) : this.IconCompatParcelizer.write(setcontentview, setcontentview2, i, i2, i3, i4);
    }

    public final boolean read() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver() || this.write.MediaBrowserCompat$ItemReceiver() || this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver() || this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
    }

    public final void write() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
        this.write.IconCompatParcelizer();
        this.IconCompatParcelizer.IconCompatParcelizer();
        if (read()) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
            this.write.MediaBrowserCompat$CustomActionResultReceiver();
            this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
            this.MediaBrowserCompat$CustomActionResultReceiver.read();
            this.MediaBrowserCompat$ItemReceiver.read();
            this.write.read();
            this.IconCompatParcelizer.read();
            MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final boolean MediaBrowserCompat$MediaItem() {
        return super.MediaBrowserCompat$MediaItem();
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver(setArg setarg) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setarg;
    }

    /* access modifiers changed from: protected */
    public final void write(getGlobal getglobal) {
        this.write = getglobal;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(getReturn getreturn) {
        this.IconCompatParcelizer = getreturn;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(setGlobal setglobal) {
        this.MediaBrowserCompat$ItemReceiver = setglobal;
    }

    /* access modifiers changed from: protected */
    public void RatingCompat() {
        MediaDescriptionCompat();
    }

    /* access modifiers changed from: protected */
    public final void MediaDescriptionCompat() {
        long j;
        long j2;
        long j3;
        boolean z = true;
        boolean z2 = !this.MediaBrowserCompat$CustomActionResultReceiver.write.isEmpty();
        boolean z3 = !this.MediaBrowserCompat$ItemReceiver.write.isEmpty();
        boolean z4 = !this.IconCompatParcelizer.write.isEmpty();
        boolean z5 = !this.write.write.isEmpty();
        long j4 = 0;
        if (z2) {
            j = this.MediaSessionCompat$Token;
        } else {
            j = 0;
        }
        if (z3) {
            j2 = this.f25x50fd9e4a;
        } else {
            j2 = 0;
        }
        if (z4) {
            j3 = this.MediaBrowserCompat$SearchResultReceiver;
        } else {
            j3 = 0;
        }
        if (z2) {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(false, 0);
        }
        if (z3) {
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(z2, j);
        }
        if (z4) {
            this.IconCompatParcelizer.IconCompatParcelizer(z2, j);
        }
        if (z5) {
            if (!z2 && !z3 && !z4) {
                z = false;
            }
            long max = Math.max(j2, j3);
            if (z) {
                j4 = j + max;
            }
            this.write.IconCompatParcelizer(z, j4);
        }
    }

    public final void read(RecyclerView.setContentView setcontentview) {
        SwitchCompat.write(setcontentview.write).read();
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem(setcontentview);
        this.IconCompatParcelizer.MediaBrowserCompat$MediaItem(setcontentview);
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem(setcontentview);
        this.write.MediaBrowserCompat$MediaItem(setcontentview);
        this.MediaBrowserCompat$ItemReceiver.write(setcontentview);
        this.IconCompatParcelizer.write(setcontentview);
        this.MediaBrowserCompat$CustomActionResultReceiver.write(setcontentview);
        this.write.write(setcontentview);
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat(setcontentview);
        this.write.MediaMetadataCompat(setcontentview);
        this.IconCompatParcelizer.MediaMetadataCompat(setcontentview);
        this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat(setcontentview);
        super.MediaBrowserCompat$MediaItem();
    }

    public final void IconCompatParcelizer() {
        boolean z = true;
        if (!(!this.MediaBrowserCompat$CustomActionResultReceiver.write.isEmpty()) && !(!this.MediaBrowserCompat$ItemReceiver.write.isEmpty()) && !(!this.IconCompatParcelizer.write.isEmpty()) && !(!this.write.write.isEmpty())) {
            z = false;
        }
        if (z) {
            RatingCompat();
        }
    }
}

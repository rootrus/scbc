package p040o;

import android.content.res.Resources;
import java.util.List;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.Multisets;

/* renamed from: o.getBitsPerChannel */
public class getBitsPerChannel extends writeUInt64NoTag<CheckExtractActivity_MembersInjector.MenuItemImpl> {
    public onShutter IconCompatParcelizer;
    public boolean MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final setRequestedFps f2826x50fd9e4a;
    public boolean MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public setMaxGapFrames MediaSessionCompat$QueueItem;
    /* access modifiers changed from: private */
    public final Resources MediaSessionCompat$ResultReceiverWrapper;
    /* access modifiers changed from: private */
    public final Multisets.SetMultiset.EntrySet MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    /* access modifiers changed from: private */
    public final toLongArray PlaybackStateCompat$CustomAction;
    public List<performUpdateApp> read;
    public final arbitrary write;

    @HmlPinActivity
    public getBitsPerChannel(RegularImmutableBiMap regularImmutableBiMap, setRequestedFps setrequestedfps, setMaxGapFrames setmaxgapframes, onShutter onshutter, Multisets.UnmodifiableMultiset unmodifiableMultiset, arbitrary arbitrary, Multisets.SetMultiset.EntrySet entrySet, Resources resources, toLongArray tolongarray) {
        super(regularImmutableBiMap);
        this.f2826x50fd9e4a = setrequestedfps;
        this.MediaSessionCompat$QueueItem = setmaxgapframes;
        this.IconCompatParcelizer = onshutter;
        this.write = arbitrary;
        this.MediaSessionCompat$Token = entrySet;
        this.MediaSessionCompat$ResultReceiverWrapper = resources;
        this.PlaybackStateCompat$CustomAction = tolongarray;
    }

    public String MediaBrowserCompat$CustomActionResultReceiver(String str) {
        try {
            if (Double.valueOf(str.replace(",", "")).doubleValue() > 0.0d) {
                return this.ParcelableVolumeInfo;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: o.getBitsPerChannel$write */
    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<onCircleClick> {
        private write() {
        }

        public /* synthetic */ write(getBitsPerChannel getbitsperchannel, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            getBitsPerChannel.MediaBrowserCompat$ItemReceiver(getBitsPerChannel.this);
            getBitsPerChannel getbitsperchannel = getBitsPerChannel.this;
            setImageQuickAnalysisFeedBack setimagequickanalysisfeedback = new setImageQuickAnalysisFeedBack(this, (onCircleClick) obj);
            if (getbitsperchannel.RatingCompat != null) {
                setimagequickanalysisfeedback.IconCompatParcelizer(getbitsperchannel.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            getBitsPerChannel.this.MediaBrowserCompat$ItemReceiver(getBitsPerChannel.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new setImagePitch(this)));
        }
    }

    public void onDestroy() {
        onShutter onshutter = this.IconCompatParcelizer;
        if (!onshutter.MediaBrowserCompat$MediaItem.isDisposed()) {
            onshutter.MediaBrowserCompat$MediaItem.dispose();
        }
        setRequestedFps setrequestedfps = this.f2826x50fd9e4a;
        if (!setrequestedfps.MediaBrowserCompat$MediaItem.isDisposed()) {
            setrequestedfps.MediaBrowserCompat$MediaItem.dispose();
        }
        setMaxGapFrames setmaxgapframes = this.MediaSessionCompat$QueueItem;
        if (!setmaxgapframes.MediaBrowserCompat$MediaItem.isDisposed()) {
            setmaxgapframes.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    static /* synthetic */ void IconCompatParcelizer(getBitsPerChannel getbitsperchannel) {
        if (getbitsperchannel.RatingCompat != null) {
            getbitsperchannel.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getBitsPerChannel getbitsperchannel) {
        if (getbitsperchannel.RatingCompat != null) {
            getbitsperchannel.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(getBitsPerChannel getbitsperchannel) {
        if (getbitsperchannel.RatingCompat != null) {
            getbitsperchannel.RatingCompat.aj_();
        }
    }
}

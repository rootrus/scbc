package com.scb.phone.view.fragment.hml;

import com.scb.phone.view.fragment.easycash.loaninformation.EasycashFeaturesMCMCInformationFragment;
import com.scb.phone.view.fragment.etb.ETBProductDetailFragment;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.GoogleMap;
import p040o.TouchPointInstructionActivity;

public final class HmlOutcomeResubmissionFragment$MediaBrowserCompat$ItemReceiver {
    public boolean IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    public List<ETBProductDetailFragment.read> MediaBrowserCompat$ItemReceiver;
    private String MediaBrowserCompat$MediaItem;
    private EasycashFeaturesMCMCInformationFragment.write MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private GoogleMap.OnMarkerDragListener f3087x50fd9e4a;
    private boolean MediaDescriptionCompat;
    private String MediaMetadataCompat;
    private boolean MediaSessionCompat$QueueItem;
    private boolean MediaSessionCompat$ResultReceiverWrapper;
    private boolean MediaSessionCompat$Token;
    private boolean ParcelableVolumeInfo;
    private boolean RatingCompat;
    public TouchPointInstructionActivity read;
    private boolean write;

    private HmlOutcomeResubmissionFragment$MediaBrowserCompat$ItemReceiver() {
    }

    public HmlOutcomeResubmissionFragment$MediaBrowserCompat$ItemReceiver(TouchPointInstructionActivity touchPointInstructionActivity, GoogleMap.OnMarkerDragListener onMarkerDragListener, boolean z, EasycashFeaturesMCMCInformationFragment.write write2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.read = touchPointInstructionActivity;
        this.f3087x50fd9e4a = onMarkerDragListener;
        this.write = z;
        this.MediaBrowserCompat$SearchResultReceiver = write2;
        this.MediaSessionCompat$ResultReceiverWrapper = z2;
        this.MediaSessionCompat$QueueItem = z3;
        this.MediaBrowserCompat$MediaItem = onMarkerDragListener.MediaBrowserCompat$SearchResultReceiver;
        this.MediaMetadataCompat = onMarkerDragListener.RatingCompat;
        this.ParcelableVolumeInfo = z4;
        this.MediaDescriptionCompat = z5;
        this.RatingCompat = z6;
        this.MediaBrowserCompat$CustomActionResultReceiver = z7;
        this.MediaSessionCompat$Token = z8;
        this.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver();
    }

    private List<ETBProductDetailFragment.read> MediaBrowserCompat$CustomActionResultReceiver() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.ParcelableVolumeInfo ? new int[]{0, 1, 2, 3, 4, 7, 8, 9, 10, 12, 15, 16, 17, 18} : new int[]{0, 25, 1, 2, 24, 3, 4, 5, 26, 22, 6, 7, 8, 20, 19, 21, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 23}) {
            ETBProductDetailFragment.read read2 = new ETBProductDetailFragment.read(i);
            if ((read2.read != 11 || this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver) && ((read2.read != 6 || this.MediaSessionCompat$QueueItem) && (read2.read != 24 || this.MediaDescriptionCompat))) {
                boolean z = this.ParcelableVolumeInfo;
                if (i == 0) {
                    read2.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$MediaItem;
                    read2.MediaBrowserCompat$CustomActionResultReceiver = this.f3087x50fd9e4a.MediaDescriptionCompat;
                } else if (i == 8) {
                    read2.write = this.write;
                } else if (i != 19) {
                    if (i == 10) {
                        read2.write = this.MediaSessionCompat$ResultReceiverWrapper;
                    } else if (i == 11 && !z) {
                        read2.write = this.MediaBrowserCompat$SearchResultReceiver.read;
                    }
                } else if (!z) {
                    read2.IconCompatParcelizer = this.MediaMetadataCompat;
                    this.IconCompatParcelizer = DiskLruCache.VERSION_1.equals(read2.IconCompatParcelizer);
                }
                int i2 = read2.read;
                if (i2 != 22) {
                    if (i2 != 25) {
                        if (i2 != 26) {
                            arrayList.add(read2);
                        } else if (this.MediaSessionCompat$Token) {
                            arrayList.add(read2);
                        }
                    } else if (this.MediaBrowserCompat$CustomActionResultReceiver) {
                        arrayList.add(read2);
                    }
                } else if (this.RatingCompat) {
                    arrayList.add(read2);
                }
            }
        }
        return arrayList;
    }
}

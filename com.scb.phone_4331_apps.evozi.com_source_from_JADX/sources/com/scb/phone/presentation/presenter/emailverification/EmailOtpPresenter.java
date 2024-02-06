package com.scb.phone.presentation.presenter.emailverification;

import okhttp3.internal.cache.DiskLruCache;
import p040o.CollapsingToolbarLayout;
import p040o.GoogleMap;
import p040o.HmlPinActivity;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.NavigationMenuItemView;
import p040o.RegularImmutableBiMap;
import p040o.access$2200;
import p040o.access$2300;
import p040o.array;
import p040o.getEulerY;
import p040o.getUsable;
import p040o.isGlareDetected;
import p040o.isMissingBorders;
import p040o.isOverlySkewed;
import p040o.isOversaturated;
import p040o.isUndersaturated;
import p040o.setBlurry;
import p040o.setLowContrastBackground;
import p040o.strokeJointType;
import p040o.writeUInt64NoTag;
import p040o.zzbc;
import p040o.zzdy;

public class EmailOtpPresenter extends writeUInt64NoTag<getUsable.IconCompatParcelizer> {
    public final NavigationMenuItemView IconCompatParcelizer;
    public final strokeJointType MediaBrowserCompat$ItemReceiver;
    public long MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public Boolean MediaMetadataCompat;
    /* access modifiers changed from: private */
    public final array MediaSessionCompat$Token;
    @HmlPinActivity
    public getEulerY getUserProfileUseCase;
    public String read;
    public final CollapsingToolbarLayout write;

    @HmlPinActivity
    public EmailOtpPresenter(strokeJointType strokejointtype, RegularImmutableBiMap regularImmutableBiMap, CollapsingToolbarLayout collapsingToolbarLayout, NavigationMenuItemView navigationMenuItemView, array array) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = strokejointtype;
        this.write = collapsingToolbarLayout;
        this.IconCompatParcelizer = navigationMenuItemView;
        this.MediaSessionCompat$Token = array;
    }

    public void onDestroy() {
        NavigationMenuItemView navigationMenuItemView = this.IconCompatParcelizer;
        if (!navigationMenuItemView.MediaBrowserCompat$MediaItem.isDisposed()) {
            navigationMenuItemView.MediaBrowserCompat$MediaItem.dispose();
        }
        CollapsingToolbarLayout collapsingToolbarLayout = this.write;
        if (!collapsingToolbarLayout.MediaBrowserCompat$MediaItem.isDisposed()) {
            collapsingToolbarLayout.MediaBrowserCompat$MediaItem.dispose();
        }
        strokeJointType strokejointtype = this.MediaBrowserCompat$ItemReceiver;
        if (!strokejointtype.MediaBrowserCompat$MediaItem.isDisposed()) {
            strokejointtype.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzdy.zzb> {
        private read() {
        }

        public /* synthetic */ read(EmailOtpPresenter emailOtpPresenter, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            zzdy.zzb zzb = (zzdy.zzb) obj;
            boolean z = true;
            if (EmailOtpPresenter.this.RatingCompat != null) {
                String unused = EmailOtpPresenter.this.MediaDescriptionCompat = zzb.IconCompatParcelizer;
                String unused2 = EmailOtpPresenter.this.MediaBrowserCompat$SearchResultReceiver = zzb.write;
                EmailOtpPresenter emailOtpPresenter = EmailOtpPresenter.this;
                isGlareDetected isglaredetected = new isGlareDetected(this, zzb);
                if (emailOtpPresenter.RatingCompat != null) {
                    isglaredetected.IconCompatParcelizer(emailOtpPresenter.RatingCompat);
                }
                EmailOtpPresenter emailOtpPresenter2 = EmailOtpPresenter.this;
                isMissingBorders ismissingborders = new isMissingBorders(this);
                if (emailOtpPresenter2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    ismissingborders.IconCompatParcelizer(emailOtpPresenter2.RatingCompat);
                }
            }
        }

        public final void onComplete() {
            if (EmailOtpPresenter.this.RatingCompat != null) {
                EmailOtpPresenter.MediaSessionCompat$QueueItem(EmailOtpPresenter.this);
            }
        }

        public final void onError(Throwable th) {
            boolean z = true;
            if (EmailOtpPresenter.this.RatingCompat != null) {
                EmailOtpPresenter.m3131x50fd9e4a(EmailOtpPresenter.this);
                access$2200 MediaBrowserCompat$ItemReceiver = EmailOtpPresenter.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
                if (MediaBrowserCompat$ItemReceiver != null) {
                    EmailOtpPresenter emailOtpPresenter = EmailOtpPresenter.this;
                    isOverlySkewed isoverlyskewed = new isOverlySkewed(MediaBrowserCompat$ItemReceiver);
                    if (emailOtpPresenter.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        isoverlyskewed.IconCompatParcelizer(emailOtpPresenter.RatingCompat);
                    }
                }
            }
        }
    }

    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzbc.zze> {
        private write() {
        }

        public /* synthetic */ write(EmailOtpPresenter emailOtpPresenter, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            zzbc.zze zze = (zzbc.zze) obj;
            boolean z = true;
            if (EmailOtpPresenter.this.RatingCompat != null) {
                EmailOtpPresenter.MediaBrowserCompat$CustomActionResultReceiver(EmailOtpPresenter.this);
                EmailOtpPresenter emailOtpPresenter = EmailOtpPresenter.this;
                setLowContrastBackground setlowcontrastbackground = new setLowContrastBackground(this, zze);
                if (emailOtpPresenter.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    setlowcontrastbackground.IconCompatParcelizer(emailOtpPresenter.RatingCompat);
                }
            }
        }

        public final void onComplete() {
            if (EmailOtpPresenter.this.RatingCompat != null) {
                EmailOtpPresenter.read(EmailOtpPresenter.this);
            }
        }

        public final void onError(Throwable th) {
            boolean z = true;
            if (EmailOtpPresenter.this.RatingCompat != null) {
                EmailOtpPresenter.write(EmailOtpPresenter.this);
                access$2200 MediaBrowserCompat$ItemReceiver = EmailOtpPresenter.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
                if (MediaBrowserCompat$ItemReceiver != null) {
                    EmailOtpPresenter emailOtpPresenter = EmailOtpPresenter.this;
                    isUndersaturated isundersaturated = new isUndersaturated(MediaBrowserCompat$ItemReceiver);
                    if (emailOtpPresenter.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        isundersaturated.IconCompatParcelizer(emailOtpPresenter.RatingCompat);
                    }
                }
            }
        }
    }

    public final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Void> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(EmailOtpPresenter emailOtpPresenter, byte b) {
            this();
        }

        public final void onComplete() {
            super.onComplete();
            EmailOtpPresenter emailOtpPresenter = EmailOtpPresenter.this;
            setBlurry setblurry = new setBlurry(this);
            if (emailOtpPresenter.RatingCompat != null) {
                setblurry.IconCompatParcelizer(emailOtpPresenter.RatingCompat);
            }
            EmailOtpPresenter.MediaBrowserCompat$SearchResultReceiver(EmailOtpPresenter.this);
        }

        public final void onError(Throwable th) {
            boolean z = true;
            if (EmailOtpPresenter.this.RatingCompat != null) {
                EmailOtpPresenter.MediaBrowserCompat$MediaItem(EmailOtpPresenter.this);
                access$2200 MediaBrowserCompat$ItemReceiver = EmailOtpPresenter.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
                if (MediaBrowserCompat$ItemReceiver != null) {
                    EmailOtpPresenter emailOtpPresenter = EmailOtpPresenter.this;
                    isOversaturated isoversaturated = new isOversaturated(MediaBrowserCompat$ItemReceiver);
                    if (emailOtpPresenter.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        isoversaturated.IconCompatParcelizer(emailOtpPresenter.RatingCompat);
                    }
                }
            }
        }
    }

    static /* synthetic */ void read(EmailOtpPresenter emailOtpPresenter) {
        if (emailOtpPresenter.RatingCompat != null) {
            emailOtpPresenter.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(EmailOtpPresenter emailOtpPresenter) {
        if (emailOtpPresenter.RatingCompat != null) {
            emailOtpPresenter.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(EmailOtpPresenter emailOtpPresenter) {
        strokeJointType strokejointtype = emailOtpPresenter.MediaBrowserCompat$ItemReceiver;
        GoogleMap.OnMarkerDragListener MediaBrowserCompat$MediaItem2 = strokejointtype.write.MediaBrowserCompat$MediaItem();
        MediaBrowserCompat$MediaItem2.MediaBrowserCompat$SearchResultReceiver = DiskLruCache.VERSION_1;
        strokejointtype.write.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$MediaItem2);
    }

    static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(EmailOtpPresenter emailOtpPresenter) {
        if (emailOtpPresenter.RatingCompat != null) {
            emailOtpPresenter.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$MediaItem(EmailOtpPresenter emailOtpPresenter) {
        if (emailOtpPresenter.RatingCompat != null) {
            emailOtpPresenter.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void RatingCompat(EmailOtpPresenter emailOtpPresenter) {
        if (emailOtpPresenter.RatingCompat != null) {
            emailOtpPresenter.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaMetadataCompat(EmailOtpPresenter emailOtpPresenter) {
        if (emailOtpPresenter.RatingCompat != null) {
            emailOtpPresenter.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaSessionCompat$QueueItem(EmailOtpPresenter emailOtpPresenter) {
        if (emailOtpPresenter.RatingCompat != null) {
            emailOtpPresenter.RatingCompat.aj_();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    static /* synthetic */ void m3131x50fd9e4a(EmailOtpPresenter emailOtpPresenter) {
        if (emailOtpPresenter.RatingCompat != null) {
            emailOtpPresenter.RatingCompat.aj_();
        }
    }
}

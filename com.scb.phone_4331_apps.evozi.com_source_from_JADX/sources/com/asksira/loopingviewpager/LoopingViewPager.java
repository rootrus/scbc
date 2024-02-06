package com.asksira.loopingviewpager;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.C7127x978d72f1;
import p040o.getText;
import p040o.onActivityCreated;

public class LoopingViewPager extends ViewPager {
    public Runnable IconCompatParcelizer = new Runnable() {
        public final void run() {
            if (LoopingViewPager.this.getAdapter() != null && LoopingViewPager.this.MediaBrowserCompat$CustomActionResultReceiver && LoopingViewPager.this.getAdapter().getCount() >= 2) {
                if (LoopingViewPager.this.read || LoopingViewPager.this.getAdapter().getCount() - 1 != LoopingViewPager.this.MediaDescriptionCompat) {
                    LoopingViewPager.MediaBrowserCompat$CustomActionResultReceiver(LoopingViewPager.this);
                } else {
                    int unused = LoopingViewPager.this.MediaDescriptionCompat = 0;
                }
                LoopingViewPager loopingViewPager = LoopingViewPager.this;
                loopingViewPager.setCurrentItem(loopingViewPager.MediaDescriptionCompat, true);
            }
        }
    };
    protected boolean MediaBrowserCompat$CustomActionResultReceiver = false;
    public int MediaBrowserCompat$ItemReceiver = 5000;
    /* access modifiers changed from: private */
    public boolean MediaBrowserCompat$MediaItem = true;
    /* access modifiers changed from: private */
    public LoopingViewPager$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public int f42x50fd9e4a = 0;
    /* access modifiers changed from: private */
    public int MediaDescriptionCompat = 0;
    /* access modifiers changed from: private */
    public boolean MediaMetadataCompat = false;
    /* access modifiers changed from: private */
    public int MediaSessionCompat$QueueItem = 0;
    private boolean MediaSessionCompat$Token = true;
    /* access modifiers changed from: private */
    public int ParcelableVolumeInfo = 0;
    private float RatingCompat;
    protected boolean read = true;
    public Handler write = new Handler();

    static /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver(LoopingViewPager loopingViewPager) {
        int i = loopingViewPager.MediaDescriptionCompat;
        loopingViewPager.MediaDescriptionCompat = i + 1;
        return i;
    }

    public LoopingViewPager(Context context) {
        super(context);
        addOnPageChangeListener(new ViewPager.MediaMetadataCompat() {
            private float write;

            public final void onPageScrolled(int i, float f, int i2) {
                float f2;
                float f3;
                if (LoopingViewPager.this.MediaBrowserCompat$SearchResultReceiver != null) {
                    float f4 = (float) i;
                    if (f4 + f >= this.write) {
                        boolean unused = LoopingViewPager.this.MediaBrowserCompat$MediaItem = true;
                    } else {
                        boolean unused2 = LoopingViewPager.this.MediaBrowserCompat$MediaItem = false;
                    }
                    if (f == BitmapDescriptorFactory.HUE_RED) {
                        this.write = f4;
                    }
                    LoopingViewPager loopingViewPager = LoopingViewPager.this;
                    int MediaBrowserCompat$ItemReceiver2 = loopingViewPager.MediaBrowserCompat$ItemReceiver(loopingViewPager.MediaBrowserCompat$MediaItem);
                    if (LoopingViewPager.this.ParcelableVolumeInfo == 2 && Math.abs(LoopingViewPager.this.MediaDescriptionCompat - LoopingViewPager.this.MediaSessionCompat$QueueItem) > 1) {
                        int abs = Math.abs(LoopingViewPager.this.MediaDescriptionCompat - LoopingViewPager.this.MediaSessionCompat$QueueItem);
                        if (LoopingViewPager.this.MediaBrowserCompat$MediaItem) {
                            f3 = (float) abs;
                            f2 = ((float) (i - LoopingViewPager.this.MediaSessionCompat$QueueItem)) / f3;
                        } else {
                            f3 = (float) abs;
                            f2 = ((float) (LoopingViewPager.this.MediaSessionCompat$QueueItem - (i + 1))) / f3;
                            f = 1.0f - f;
                        }
                        f = (f / f3) + f2;
                    } else if (!LoopingViewPager.this.MediaBrowserCompat$MediaItem) {
                        f = 1.0f - f;
                    }
                    if (f != BitmapDescriptorFactory.HUE_RED && f <= 1.0f) {
                        if (!LoopingViewPager.this.MediaMetadataCompat) {
                            if (LoopingViewPager.this.ParcelableVolumeInfo == 1) {
                                if (LoopingViewPager.this.MediaBrowserCompat$MediaItem && Math.abs(MediaBrowserCompat$ItemReceiver2 - LoopingViewPager.this.MediaDescriptionCompat) == 2) {
                                    return;
                                }
                                if (!LoopingViewPager.this.MediaBrowserCompat$MediaItem && MediaBrowserCompat$ItemReceiver2 == LoopingViewPager.this.MediaDescriptionCompat) {
                                    return;
                                }
                            }
                            LoopingViewPager$MediaBrowserCompat$CustomActionResultReceiver unused3 = LoopingViewPager.this.MediaBrowserCompat$SearchResultReceiver;
                        } else if (LoopingViewPager.this.ParcelableVolumeInfo == 1) {
                            LoopingViewPager$MediaBrowserCompat$CustomActionResultReceiver unused4 = LoopingViewPager.this.MediaBrowserCompat$SearchResultReceiver;
                        }
                    }
                }
            }

            public final void onPageSelected(int i) {
                LoopingViewPager loopingViewPager = LoopingViewPager.this;
                int unused = loopingViewPager.MediaSessionCompat$QueueItem = loopingViewPager.MediaDescriptionCompat;
                int unused2 = LoopingViewPager.this.MediaDescriptionCompat = i;
                if (LoopingViewPager.this.MediaBrowserCompat$SearchResultReceiver != null) {
                    LoopingViewPager$MediaBrowserCompat$CustomActionResultReceiver unused3 = LoopingViewPager.this.MediaBrowserCompat$SearchResultReceiver;
                    LoopingViewPager.this.write();
                }
                LoopingViewPager.this.write.removeCallbacks(LoopingViewPager.this.IconCompatParcelizer);
                LoopingViewPager.this.write.postDelayed(LoopingViewPager.this.IconCompatParcelizer, (long) LoopingViewPager.this.MediaBrowserCompat$ItemReceiver);
            }

            public final void onPageScrollStateChanged(int i) {
                int count;
                if (!LoopingViewPager.this.MediaMetadataCompat && LoopingViewPager.this.ParcelableVolumeInfo == 2 && i == 1 && LoopingViewPager.this.MediaBrowserCompat$SearchResultReceiver != null) {
                    LoopingViewPager$MediaBrowserCompat$CustomActionResultReceiver unused = LoopingViewPager.this.MediaBrowserCompat$SearchResultReceiver;
                    LoopingViewPager loopingViewPager = LoopingViewPager.this;
                    loopingViewPager.MediaBrowserCompat$ItemReceiver(loopingViewPager.MediaBrowserCompat$MediaItem);
                }
                LoopingViewPager loopingViewPager2 = LoopingViewPager.this;
                int unused2 = loopingViewPager2.f42x50fd9e4a = loopingViewPager2.ParcelableVolumeInfo;
                int unused3 = LoopingViewPager.this.ParcelableVolumeInfo = i;
                if (i == 0) {
                    if (LoopingViewPager.this.read) {
                        if (LoopingViewPager.this.getAdapter() != null && (count = LoopingViewPager.this.getAdapter().getCount()) >= 2) {
                            int currentItem = LoopingViewPager.this.getCurrentItem();
                            if (currentItem == 0) {
                                LoopingViewPager.this.setCurrentItem(count - 2, false);
                            } else if (currentItem == count - 1) {
                                LoopingViewPager.this.setCurrentItem(1, false);
                            }
                        } else {
                            return;
                        }
                    }
                    if (LoopingViewPager.this.MediaBrowserCompat$SearchResultReceiver != null) {
                        LoopingViewPager$MediaBrowserCompat$CustomActionResultReceiver unused4 = LoopingViewPager.this.MediaBrowserCompat$SearchResultReceiver;
                        LoopingViewPager.this.write();
                    }
                }
            }
        });
        if (this.read) {
            setCurrentItem(1, false);
        }
    }

    /* JADX INFO: finally extract failed */
    public LoopingViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C7127x978d72f1.LoopingViewPager, 0, 0);
        try {
            this.read = obtainStyledAttributes.getBoolean(C7127x978d72f1.LoopingViewPager_isInfinite, false);
            this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getBoolean(C7127x978d72f1.LoopingViewPager_autoScroll, false);
            this.MediaSessionCompat$Token = obtainStyledAttributes.getBoolean(C7127x978d72f1.LoopingViewPager_wrap_content, true);
            this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getInt(C7127x978d72f1.LoopingViewPager_scrollInterval, 5000);
            this.RatingCompat = obtainStyledAttributes.getFloat(C7127x978d72f1.LoopingViewPager_viewpagerAspectRatio, BitmapDescriptorFactory.HUE_RED);
            obtainStyledAttributes.recycle();
            addOnPageChangeListener(new ViewPager.MediaMetadataCompat() {
                private float write;

                public final void onPageScrolled(int i, float f, int i2) {
                    float f2;
                    float f3;
                    if (LoopingViewPager.this.MediaBrowserCompat$SearchResultReceiver != null) {
                        float f4 = (float) i;
                        if (f4 + f >= this.write) {
                            boolean unused = LoopingViewPager.this.MediaBrowserCompat$MediaItem = true;
                        } else {
                            boolean unused2 = LoopingViewPager.this.MediaBrowserCompat$MediaItem = false;
                        }
                        if (f == BitmapDescriptorFactory.HUE_RED) {
                            this.write = f4;
                        }
                        LoopingViewPager loopingViewPager = LoopingViewPager.this;
                        int MediaBrowserCompat$ItemReceiver2 = loopingViewPager.MediaBrowserCompat$ItemReceiver(loopingViewPager.MediaBrowserCompat$MediaItem);
                        if (LoopingViewPager.this.ParcelableVolumeInfo == 2 && Math.abs(LoopingViewPager.this.MediaDescriptionCompat - LoopingViewPager.this.MediaSessionCompat$QueueItem) > 1) {
                            int abs = Math.abs(LoopingViewPager.this.MediaDescriptionCompat - LoopingViewPager.this.MediaSessionCompat$QueueItem);
                            if (LoopingViewPager.this.MediaBrowserCompat$MediaItem) {
                                f3 = (float) abs;
                                f2 = ((float) (i - LoopingViewPager.this.MediaSessionCompat$QueueItem)) / f3;
                            } else {
                                f3 = (float) abs;
                                f2 = ((float) (LoopingViewPager.this.MediaSessionCompat$QueueItem - (i + 1))) / f3;
                                f = 1.0f - f;
                            }
                            f = (f / f3) + f2;
                        } else if (!LoopingViewPager.this.MediaBrowserCompat$MediaItem) {
                            f = 1.0f - f;
                        }
                        if (f != BitmapDescriptorFactory.HUE_RED && f <= 1.0f) {
                            if (!LoopingViewPager.this.MediaMetadataCompat) {
                                if (LoopingViewPager.this.ParcelableVolumeInfo == 1) {
                                    if (LoopingViewPager.this.MediaBrowserCompat$MediaItem && Math.abs(MediaBrowserCompat$ItemReceiver2 - LoopingViewPager.this.MediaDescriptionCompat) == 2) {
                                        return;
                                    }
                                    if (!LoopingViewPager.this.MediaBrowserCompat$MediaItem && MediaBrowserCompat$ItemReceiver2 == LoopingViewPager.this.MediaDescriptionCompat) {
                                        return;
                                    }
                                }
                                LoopingViewPager$MediaBrowserCompat$CustomActionResultReceiver unused3 = LoopingViewPager.this.MediaBrowserCompat$SearchResultReceiver;
                            } else if (LoopingViewPager.this.ParcelableVolumeInfo == 1) {
                                LoopingViewPager$MediaBrowserCompat$CustomActionResultReceiver unused4 = LoopingViewPager.this.MediaBrowserCompat$SearchResultReceiver;
                            }
                        }
                    }
                }

                public final void onPageSelected(int i) {
                    LoopingViewPager loopingViewPager = LoopingViewPager.this;
                    int unused = loopingViewPager.MediaSessionCompat$QueueItem = loopingViewPager.MediaDescriptionCompat;
                    int unused2 = LoopingViewPager.this.MediaDescriptionCompat = i;
                    if (LoopingViewPager.this.MediaBrowserCompat$SearchResultReceiver != null) {
                        LoopingViewPager$MediaBrowserCompat$CustomActionResultReceiver unused3 = LoopingViewPager.this.MediaBrowserCompat$SearchResultReceiver;
                        LoopingViewPager.this.write();
                    }
                    LoopingViewPager.this.write.removeCallbacks(LoopingViewPager.this.IconCompatParcelizer);
                    LoopingViewPager.this.write.postDelayed(LoopingViewPager.this.IconCompatParcelizer, (long) LoopingViewPager.this.MediaBrowserCompat$ItemReceiver);
                }

                public final void onPageScrollStateChanged(int i) {
                    int count;
                    if (!LoopingViewPager.this.MediaMetadataCompat && LoopingViewPager.this.ParcelableVolumeInfo == 2 && i == 1 && LoopingViewPager.this.MediaBrowserCompat$SearchResultReceiver != null) {
                        LoopingViewPager$MediaBrowserCompat$CustomActionResultReceiver unused = LoopingViewPager.this.MediaBrowserCompat$SearchResultReceiver;
                        LoopingViewPager loopingViewPager = LoopingViewPager.this;
                        loopingViewPager.MediaBrowserCompat$ItemReceiver(loopingViewPager.MediaBrowserCompat$MediaItem);
                    }
                    LoopingViewPager loopingViewPager2 = LoopingViewPager.this;
                    int unused2 = loopingViewPager2.f42x50fd9e4a = loopingViewPager2.ParcelableVolumeInfo;
                    int unused3 = LoopingViewPager.this.ParcelableVolumeInfo = i;
                    if (i == 0) {
                        if (LoopingViewPager.this.read) {
                            if (LoopingViewPager.this.getAdapter() != null && (count = LoopingViewPager.this.getAdapter().getCount()) >= 2) {
                                int currentItem = LoopingViewPager.this.getCurrentItem();
                                if (currentItem == 0) {
                                    LoopingViewPager.this.setCurrentItem(count - 2, false);
                                } else if (currentItem == count - 1) {
                                    LoopingViewPager.this.setCurrentItem(1, false);
                                }
                            } else {
                                return;
                            }
                        }
                        if (LoopingViewPager.this.MediaBrowserCompat$SearchResultReceiver != null) {
                            LoopingViewPager$MediaBrowserCompat$CustomActionResultReceiver unused4 = LoopingViewPager.this.MediaBrowserCompat$SearchResultReceiver;
                            LoopingViewPager.this.write();
                        }
                    }
                }
            });
            if (this.read) {
                setCurrentItem(1, false);
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void onMeasure(int i, int i2) {
        int mode;
        int size = View.MeasureSpec.getSize(i);
        if (this.RatingCompat > BitmapDescriptorFactory.HUE_RED) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(((float) View.MeasureSpec.getSize(i)) / this.RatingCompat), 1073741824));
            return;
        }
        if (this.MediaSessionCompat$Token && ((mode = View.MeasureSpec.getMode(i2)) == 0 || mode == Integer.MIN_VALUE)) {
            super.onMeasure(i, i2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824);
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i3) {
                    i3 = measuredHeight;
                }
            }
            i2 = View.MeasureSpec.makeMeasureSpec(i3 + getPaddingTop() + getPaddingBottom(), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setAdapter(onActivityCreated onactivitycreated) {
        super.setAdapter(onactivitycreated);
        if (this.read) {
            setCurrentItem(1, false);
        }
    }

    public final int write() {
        int i;
        if (!this.read) {
            return this.MediaDescriptionCompat;
        }
        if (!(getAdapter() instanceof getText)) {
            return this.MediaDescriptionCompat;
        }
        int i2 = this.MediaDescriptionCompat;
        if (i2 == 0) {
            i = ((getText) getAdapter()).IconCompatParcelizer();
        } else if (i2 == ((getText) getAdapter()).write() + 1) {
            return 0;
        } else {
            i = this.MediaDescriptionCompat;
        }
        return i - 1;
    }

    public final int MediaBrowserCompat$ItemReceiver(boolean z) {
        int i = this.ParcelableVolumeInfo;
        if (i == 2 || i == 0 || (this.f42x50fd9e4a == 2 && i == 1)) {
            return write();
        }
        int i2 = z ? 1 : -1;
        if (!this.read) {
            return this.MediaDescriptionCompat + i2;
        }
        if (!(getAdapter() instanceof getText)) {
            return this.MediaDescriptionCompat + i2;
        }
        if (this.MediaDescriptionCompat == 1 && !z) {
            return ((getText) getAdapter()).write() - 1;
        }
        if (this.MediaDescriptionCompat != ((getText) getAdapter()).write() || !z) {
            return (this.MediaDescriptionCompat + i2) - 1;
        }
        return 0;
    }

    public void setIndicatorSmart(boolean z) {
        this.MediaMetadataCompat = z;
    }

    public void setIndicatorPageChangeListener(LoopingViewPager$MediaBrowserCompat$CustomActionResultReceiver loopingViewPager$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaBrowserCompat$SearchResultReceiver = loopingViewPager$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public void setInterval(int i) {
        this.MediaBrowserCompat$ItemReceiver = i;
        this.write.removeCallbacks(this.IconCompatParcelizer);
        this.write.postDelayed(this.IconCompatParcelizer, (long) this.MediaBrowserCompat$ItemReceiver);
    }
}

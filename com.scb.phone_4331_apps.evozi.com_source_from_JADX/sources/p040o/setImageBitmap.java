package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import p040o.setImageResource;
import p040o.setSupportImageTintList;

/* renamed from: o.setImageBitmap */
public final class setImageBitmap extends setImageResource {
    public float ActionBarOverlayLayout = -1.0f;
    public int IconCompatParcelizer = -1;
    private setSupportImageTintList setActionBarVisibilityCallback = this.setPrimaryBackground;
    private int setOverlayMode;
    public int write = -1;

    public final boolean write() {
        return true;
    }

    public setImageBitmap() {
        this.setOverlayMode = 0;
        this.MediaBrowserCompat$CustomActionResultReceiver.clear();
        this.MediaBrowserCompat$CustomActionResultReceiver.add(this.setActionBarVisibilityCallback);
        int length = this.setContentView.length;
        for (int i = 0; i < length; i++) {
            this.setContentView[i] = this.setActionBarVisibilityCallback;
        }
    }

    public final void RatingCompat(int i) {
        if (this.setOverlayMode != i) {
            this.setOverlayMode = i;
            this.MediaBrowserCompat$CustomActionResultReceiver.clear();
            if (this.setOverlayMode == 1) {
                this.setActionBarVisibilityCallback = this.AppCompatDialogFragment;
            } else {
                this.setActionBarVisibilityCallback = this.setPrimaryBackground;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.add(this.setActionBarVisibilityCallback);
            int length = this.setContentView.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.setContentView[i2] = this.setActionBarVisibilityCallback;
            }
        }
    }

    /* renamed from: o.setImageBitmap$2 */
    static /* synthetic */ class C14942 {
        static final /* synthetic */ int[] write;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.setSupportImageTintList$read[] r0 = p040o.setSupportImageTintList.read.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                write = r0
                o.setSupportImageTintList$read r1 = p040o.setSupportImageTintList.read.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x001d }
                o.setSupportImageTintList$read r1 = p040o.setSupportImageTintList.read.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.setSupportImageTintList$read r1 = p040o.setSupportImageTintList.read.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.setSupportImageTintList$read r1 = p040o.setSupportImageTintList.read.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x003e }
                o.setSupportImageTintList$read r1 = p040o.setSupportImageTintList.read.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.setSupportImageTintList$read r1 = p040o.setSupportImageTintList.read.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0054 }
                o.setSupportImageTintList$read r1 = p040o.setSupportImageTintList.read.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0060 }
                o.setSupportImageTintList$read r1 = p040o.setSupportImageTintList.read.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x006c }
                o.setSupportImageTintList$read r1 = p040o.setSupportImageTintList.read.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.setImageBitmap.C14942.<clinit>():void");
        }
    }

    public final setSupportImageTintList write(setSupportImageTintList.read read) {
        switch (C14942.write[read.ordinal()]) {
            case 1:
            case 2:
                if (this.setOverlayMode == 1) {
                    return this.setActionBarVisibilityCallback;
                }
                break;
            case 3:
            case 4:
                if (this.setOverlayMode == 0) {
                    return this.setActionBarVisibilityCallback;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(read.name());
    }

    public final ArrayList<setSupportImageTintList> IconCompatParcelizer() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final void MediaBrowserCompat$ItemReceiver(AppCompatCheckedTextView appCompatCheckedTextView) {
        setImageDrawable setimagedrawable = (setImageDrawable) this.AbsActionBarView;
        if (setimagedrawable != null) {
            setSupportImageTintList write2 = setimagedrawable.write(setSupportImageTintList.read.LEFT);
            setSupportImageTintList write3 = setimagedrawable.write(setSupportImageTintList.read.RIGHT);
            boolean z = true;
            boolean z2 = this.AbsActionBarView != null && this.AbsActionBarView.AppCompatDelegateImpl$ListMenuDecorView[0] == setImageResource.read.WRAP_CONTENT;
            if (this.setOverlayMode == 0) {
                write2 = setimagedrawable.write(setSupportImageTintList.read.TOP);
                write3 = setimagedrawable.write(setSupportImageTintList.read.BOTTOM);
                if (this.AbsActionBarView == null || this.AbsActionBarView.AppCompatDelegateImpl$ListMenuDecorView[1] != setImageResource.read.WRAP_CONTENT) {
                    z = false;
                }
            } else {
                z = z2;
            }
            if (this.write != -1) {
                setCheckMarkDrawable MediaBrowserCompat$CustomActionResultReceiver = appCompatCheckedTextView.MediaBrowserCompat$CustomActionResultReceiver((Object) this.setActionBarVisibilityCallback);
                appCompatCheckedTextView.write(MediaBrowserCompat$CustomActionResultReceiver, appCompatCheckedTextView.MediaBrowserCompat$CustomActionResultReceiver((Object) write2), this.write, 6);
                if (z) {
                    appCompatCheckedTextView.read(appCompatCheckedTextView.MediaBrowserCompat$CustomActionResultReceiver((Object) write3), MediaBrowserCompat$CustomActionResultReceiver, 0, 5);
                }
            } else if (this.IconCompatParcelizer != -1) {
                setCheckMarkDrawable MediaBrowserCompat$CustomActionResultReceiver2 = appCompatCheckedTextView.MediaBrowserCompat$CustomActionResultReceiver((Object) this.setActionBarVisibilityCallback);
                setCheckMarkDrawable MediaBrowserCompat$CustomActionResultReceiver3 = appCompatCheckedTextView.MediaBrowserCompat$CustomActionResultReceiver((Object) write3);
                appCompatCheckedTextView.write(MediaBrowserCompat$CustomActionResultReceiver2, MediaBrowserCompat$CustomActionResultReceiver3, -this.IconCompatParcelizer, 6);
                if (z) {
                    appCompatCheckedTextView.read(MediaBrowserCompat$CustomActionResultReceiver2, appCompatCheckedTextView.MediaBrowserCompat$CustomActionResultReceiver((Object) write2), 0, 5);
                    appCompatCheckedTextView.read(MediaBrowserCompat$CustomActionResultReceiver3, MediaBrowserCompat$CustomActionResultReceiver2, 0, 5);
                }
            } else if (this.ActionBarOverlayLayout != -1.0f) {
                setCheckMarkDrawable MediaBrowserCompat$CustomActionResultReceiver4 = appCompatCheckedTextView.MediaBrowserCompat$CustomActionResultReceiver((Object) this.setActionBarVisibilityCallback);
                setCheckMarkDrawable MediaBrowserCompat$CustomActionResultReceiver5 = appCompatCheckedTextView.MediaBrowserCompat$CustomActionResultReceiver((Object) write2);
                setCheckMarkDrawable MediaBrowserCompat$CustomActionResultReceiver6 = appCompatCheckedTextView.MediaBrowserCompat$CustomActionResultReceiver((Object) write3);
                float f = this.ActionBarOverlayLayout;
                setTextSize MediaBrowserCompat$CustomActionResultReceiver7 = appCompatCheckedTextView.MediaBrowserCompat$CustomActionResultReceiver();
                MediaBrowserCompat$CustomActionResultReceiver7.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver4, -1.0f);
                MediaBrowserCompat$CustomActionResultReceiver7.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver5, 1.0f - f);
                MediaBrowserCompat$CustomActionResultReceiver7.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver6, f);
                appCompatCheckedTextView.read(MediaBrowserCompat$CustomActionResultReceiver7);
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        setImageResource setimageresource = this.AbsActionBarView;
        if (setimageresource != null) {
            if (this.setOverlayMode == 1) {
                AppCompatImageView appCompatImageView = this.setPrimaryBackground.write;
                AppCompatImageView appCompatImageView2 = setimageresource.setPrimaryBackground.write;
                appCompatImageView.MediaSessionCompat$Token = 1;
                appCompatImageView.f2535x50fd9e4a = appCompatImageView2;
                appCompatImageView.RatingCompat = BitmapDescriptorFactory.HUE_RED;
                appCompatImageView2.write.add(appCompatImageView);
                AppCompatImageView appCompatImageView3 = this.MediaBrowserCompat$MediaItem.write;
                AppCompatImageView appCompatImageView4 = setimageresource.setPrimaryBackground.write;
                appCompatImageView3.MediaSessionCompat$Token = 1;
                appCompatImageView3.f2535x50fd9e4a = appCompatImageView4;
                appCompatImageView3.RatingCompat = BitmapDescriptorFactory.HUE_RED;
                appCompatImageView4.write.add(appCompatImageView3);
                if (this.write != -1) {
                    AppCompatImageView appCompatImageView5 = this.AppCompatDialogFragment.write;
                    AppCompatImageView appCompatImageView6 = setimageresource.AppCompatDialogFragment.write;
                    int i2 = this.write;
                    appCompatImageView5.MediaSessionCompat$Token = 1;
                    appCompatImageView5.f2535x50fd9e4a = appCompatImageView6;
                    appCompatImageView5.RatingCompat = (float) i2;
                    appCompatImageView6.write.add(appCompatImageView5);
                    AppCompatImageView appCompatImageView7 = this.setSplitBackground.write;
                    AppCompatImageView appCompatImageView8 = setimageresource.AppCompatDialogFragment.write;
                    int i3 = this.write;
                    appCompatImageView7.MediaSessionCompat$Token = 1;
                    appCompatImageView7.f2535x50fd9e4a = appCompatImageView8;
                    appCompatImageView7.RatingCompat = (float) i3;
                    appCompatImageView8.write.add(appCompatImageView7);
                } else if (this.IconCompatParcelizer != -1) {
                    AppCompatImageView appCompatImageView9 = this.AppCompatDialogFragment.write;
                    AppCompatImageView appCompatImageView10 = setimageresource.setSplitBackground.write;
                    appCompatImageView9.MediaSessionCompat$Token = 1;
                    appCompatImageView9.f2535x50fd9e4a = appCompatImageView10;
                    appCompatImageView9.RatingCompat = (float) (-this.IconCompatParcelizer);
                    appCompatImageView10.write.add(appCompatImageView9);
                    AppCompatImageView appCompatImageView11 = this.setSplitBackground.write;
                    AppCompatImageView appCompatImageView12 = setimageresource.setSplitBackground.write;
                    appCompatImageView11.MediaSessionCompat$Token = 1;
                    appCompatImageView11.f2535x50fd9e4a = appCompatImageView12;
                    appCompatImageView11.RatingCompat = (float) (-this.IconCompatParcelizer);
                    appCompatImageView12.write.add(appCompatImageView11);
                } else if (this.ActionBarOverlayLayout != -1.0f && setimageresource.AppCompatDelegateImpl$ListMenuDecorView[0] == setImageResource.read.FIXED) {
                    AppCompatImageView appCompatImageView13 = this.AppCompatDialogFragment.write;
                    AppCompatImageView appCompatImageView14 = setimageresource.AppCompatDialogFragment.write;
                    appCompatImageView13.MediaSessionCompat$Token = 1;
                    appCompatImageView13.f2535x50fd9e4a = appCompatImageView14;
                    float f = (float) ((int) (((float) setimageresource.ActionBarContextView) * this.ActionBarOverlayLayout));
                    appCompatImageView13.RatingCompat = f;
                    appCompatImageView14.write.add(appCompatImageView13);
                    AppCompatImageView appCompatImageView15 = this.setSplitBackground.write;
                    AppCompatImageView appCompatImageView16 = setimageresource.AppCompatDialogFragment.write;
                    appCompatImageView15.MediaSessionCompat$Token = 1;
                    appCompatImageView15.f2535x50fd9e4a = appCompatImageView16;
                    appCompatImageView15.RatingCompat = f;
                    appCompatImageView16.write.add(appCompatImageView15);
                }
            } else {
                AppCompatImageView appCompatImageView17 = this.AppCompatDialogFragment.write;
                AppCompatImageView appCompatImageView18 = setimageresource.AppCompatDialogFragment.write;
                appCompatImageView17.MediaSessionCompat$Token = 1;
                appCompatImageView17.f2535x50fd9e4a = appCompatImageView18;
                appCompatImageView17.RatingCompat = BitmapDescriptorFactory.HUE_RED;
                appCompatImageView18.write.add(appCompatImageView17);
                AppCompatImageView appCompatImageView19 = this.setSplitBackground.write;
                AppCompatImageView appCompatImageView20 = setimageresource.AppCompatDialogFragment.write;
                appCompatImageView19.MediaSessionCompat$Token = 1;
                appCompatImageView19.f2535x50fd9e4a = appCompatImageView20;
                appCompatImageView19.RatingCompat = BitmapDescriptorFactory.HUE_RED;
                appCompatImageView20.write.add(appCompatImageView19);
                if (this.write != -1) {
                    AppCompatImageView appCompatImageView21 = this.setPrimaryBackground.write;
                    AppCompatImageView appCompatImageView22 = setimageresource.setPrimaryBackground.write;
                    int i4 = this.write;
                    appCompatImageView21.MediaSessionCompat$Token = 1;
                    appCompatImageView21.f2535x50fd9e4a = appCompatImageView22;
                    appCompatImageView21.RatingCompat = (float) i4;
                    appCompatImageView22.write.add(appCompatImageView21);
                    AppCompatImageView appCompatImageView23 = this.MediaBrowserCompat$MediaItem.write;
                    AppCompatImageView appCompatImageView24 = setimageresource.setPrimaryBackground.write;
                    int i5 = this.write;
                    appCompatImageView23.MediaSessionCompat$Token = 1;
                    appCompatImageView23.f2535x50fd9e4a = appCompatImageView24;
                    appCompatImageView23.RatingCompat = (float) i5;
                    appCompatImageView24.write.add(appCompatImageView23);
                } else if (this.IconCompatParcelizer != -1) {
                    AppCompatImageView appCompatImageView25 = this.setPrimaryBackground.write;
                    AppCompatImageView appCompatImageView26 = setimageresource.MediaBrowserCompat$MediaItem.write;
                    appCompatImageView25.MediaSessionCompat$Token = 1;
                    appCompatImageView25.f2535x50fd9e4a = appCompatImageView26;
                    appCompatImageView25.RatingCompat = (float) (-this.IconCompatParcelizer);
                    appCompatImageView26.write.add(appCompatImageView25);
                    AppCompatImageView appCompatImageView27 = this.MediaBrowserCompat$MediaItem.write;
                    AppCompatImageView appCompatImageView28 = setimageresource.MediaBrowserCompat$MediaItem.write;
                    appCompatImageView27.MediaSessionCompat$Token = 1;
                    appCompatImageView27.f2535x50fd9e4a = appCompatImageView28;
                    appCompatImageView27.RatingCompat = (float) (-this.IconCompatParcelizer);
                    appCompatImageView28.write.add(appCompatImageView27);
                } else if (this.ActionBarOverlayLayout != -1.0f && setimageresource.AppCompatDelegateImpl$ListMenuDecorView[1] == setImageResource.read.FIXED) {
                    AppCompatImageView appCompatImageView29 = this.setPrimaryBackground.write;
                    AppCompatImageView appCompatImageView30 = setimageresource.setPrimaryBackground.write;
                    appCompatImageView29.MediaSessionCompat$Token = 1;
                    appCompatImageView29.f2535x50fd9e4a = appCompatImageView30;
                    float f2 = (float) ((int) (((float) setimageresource.PlaybackStateCompat) * this.ActionBarOverlayLayout));
                    appCompatImageView29.RatingCompat = f2;
                    appCompatImageView30.write.add(appCompatImageView29);
                    AppCompatImageView appCompatImageView31 = this.MediaBrowserCompat$MediaItem.write;
                    AppCompatImageView appCompatImageView32 = setimageresource.setPrimaryBackground.write;
                    appCompatImageView31.MediaSessionCompat$Token = 1;
                    appCompatImageView31.f2535x50fd9e4a = appCompatImageView32;
                    appCompatImageView31.RatingCompat = f2;
                    appCompatImageView32.write.add(appCompatImageView31);
                }
            }
        }
    }

    public final void MediaSessionCompat$Token() {
        int i;
        int i2;
        if (this.AbsActionBarView != null) {
            setCheckMarkDrawable setcheckmarkdrawable = this.setActionBarVisibilityCallback.MediaBrowserCompat$ItemReceiver;
            int i3 = setcheckmarkdrawable != null ? (int) (setcheckmarkdrawable.IconCompatParcelizer + 0.5f) : 0;
            if (this.setOverlayMode == 1) {
                this.setHasNonEmbeddedTabs = i3;
                this.setActionBarHideOffset = 0;
                setImageResource setimageresource = this.AbsActionBarView;
                if (setimageresource.setTitleOptional == 8) {
                    i2 = 0;
                } else {
                    i2 = setimageresource.PlaybackStateCompat;
                }
                MediaBrowserCompat$CustomActionResultReceiver(i2);
                IconCompatParcelizer(0);
                return;
            }
            this.setHasNonEmbeddedTabs = 0;
            this.setActionBarHideOffset = i3;
            setImageResource setimageresource2 = this.AbsActionBarView;
            if (setimageresource2.setTitleOptional == 8) {
                i = 0;
            } else {
                i = setimageresource2.ActionBarContextView;
            }
            IconCompatParcelizer(i);
            MediaBrowserCompat$CustomActionResultReceiver(0);
        }
    }
}

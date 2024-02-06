package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.setSupportImageTintList;

/* renamed from: o.AppCompatImageView */
public final class AppCompatImageView extends AppCompatAutoCompleteTextView$MediaBrowserCompat$ItemReceiver {
    public setSupportImageTintList MediaBrowserCompat$CustomActionResultReceiver;
    setSupportImageTintMode MediaBrowserCompat$ItemReceiver = null;
    public AppCompatImageView MediaBrowserCompat$MediaItem;
    public float MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    AppCompatImageView f2535x50fd9e4a;
    setSupportImageTintMode MediaDescriptionCompat = null;
    AppCompatImageView MediaMetadataCompat;
    int MediaSessionCompat$Token = 0;
    float RatingCompat;
    int read = 1;

    private static String IconCompatParcelizer(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public AppCompatImageView(setSupportImageTintList setsupportimagetintlist) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setsupportimagetintlist;
    }

    public final String toString() {
        if (this.IconCompatParcelizer != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("{ ");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(" UNRESOLVED} type: ");
            sb.append(IconCompatParcelizer(this.MediaSessionCompat$Token));
            return sb.toString();
        } else if (this.MediaBrowserCompat$MediaItem == this) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb2.append(", RESOLVED: ");
            sb2.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb2.append("]  type: ");
            sb2.append(IconCompatParcelizer(this.MediaSessionCompat$Token));
            return sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("[");
            sb3.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb3.append(", RESOLVED: ");
            sb3.append(this.MediaBrowserCompat$MediaItem);
            sb3.append(":");
            sb3.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb3.append("] type: ");
            sb3.append(IconCompatParcelizer(this.MediaSessionCompat$Token));
            return sb3.toString();
        }
    }

    public final void IconCompatParcelizer(AppCompatImageView appCompatImageView, float f) {
        if (this.IconCompatParcelizer == 0 || !(this.MediaBrowserCompat$MediaItem == appCompatImageView || this.MediaBrowserCompat$SearchResultReceiver == f)) {
            this.MediaBrowserCompat$MediaItem = appCompatImageView;
            this.MediaBrowserCompat$SearchResultReceiver = f;
            if (this.IconCompatParcelizer == 1) {
                read();
            }
            write();
        }
    }

    public final void IconCompatParcelizer() {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        AppCompatImageView appCompatImageView3;
        AppCompatImageView appCompatImageView4;
        AppCompatImageView appCompatImageView5;
        AppCompatImageView appCompatImageView6;
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        int i2;
        AppCompatImageView appCompatImageView7;
        boolean z = true;
        if (this.IconCompatParcelizer != 1 && this.MediaSessionCompat$Token != 4) {
            setSupportImageTintMode setsupportimagetintmode = this.MediaBrowserCompat$ItemReceiver;
            if (setsupportimagetintmode != null) {
                if (setsupportimagetintmode.IconCompatParcelizer == 1) {
                    this.RatingCompat = ((float) this.read) * this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
                } else {
                    return;
                }
            }
            setSupportImageTintMode setsupportimagetintmode2 = this.MediaDescriptionCompat;
            if (setsupportimagetintmode2 != null && setsupportimagetintmode2.IconCompatParcelizer != 1) {
                return;
            }
            if (this.MediaSessionCompat$Token == 1 && ((appCompatImageView7 = this.f2535x50fd9e4a) == null || appCompatImageView7.IconCompatParcelizer == 1)) {
                AppCompatImageView appCompatImageView8 = this.f2535x50fd9e4a;
                if (appCompatImageView8 == null) {
                    this.MediaBrowserCompat$MediaItem = this;
                    this.MediaBrowserCompat$SearchResultReceiver = this.RatingCompat;
                } else {
                    this.MediaBrowserCompat$MediaItem = appCompatImageView8.MediaBrowserCompat$MediaItem;
                    this.MediaBrowserCompat$SearchResultReceiver = appCompatImageView8.MediaBrowserCompat$SearchResultReceiver + this.RatingCompat;
                }
                write();
            } else if (this.MediaSessionCompat$Token == 2 && (appCompatImageView4 = this.f2535x50fd9e4a) != null && appCompatImageView4.IconCompatParcelizer == 1 && (appCompatImageView5 = this.MediaMetadataCompat) != null && (appCompatImageView6 = appCompatImageView5.f2535x50fd9e4a) != null && appCompatImageView6.IconCompatParcelizer == 1) {
                this.MediaBrowserCompat$MediaItem = this.f2535x50fd9e4a.MediaBrowserCompat$MediaItem;
                AppCompatImageView appCompatImageView9 = this.MediaMetadataCompat;
                appCompatImageView9.MediaBrowserCompat$MediaItem = appCompatImageView9.f2535x50fd9e4a.MediaBrowserCompat$MediaItem;
                int i3 = 0;
                if (!(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver == setSupportImageTintList.read.RIGHT || this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver == setSupportImageTintList.read.BOTTOM)) {
                    z = false;
                }
                if (z) {
                    f2 = this.f2535x50fd9e4a.MediaBrowserCompat$SearchResultReceiver;
                    f = this.MediaMetadataCompat.f2535x50fd9e4a.MediaBrowserCompat$SearchResultReceiver;
                } else {
                    f2 = this.MediaMetadataCompat.f2535x50fd9e4a.MediaBrowserCompat$SearchResultReceiver;
                    f = this.f2535x50fd9e4a.MediaBrowserCompat$SearchResultReceiver;
                }
                float f5 = f2 - f;
                if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver == setSupportImageTintList.read.LEFT || this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver == setSupportImageTintList.read.RIGHT) {
                    setImageResource setimageresource = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
                    if (setimageresource.setTitleOptional == 8) {
                        i = 0;
                    } else {
                        i = setimageresource.ActionBarContextView;
                    }
                    f4 = f5 - ((float) i);
                    f3 = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.setHasDecor;
                } else {
                    setImageResource setimageresource2 = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
                    if (setimageresource2.setTitleOptional == 8) {
                        i2 = 0;
                    } else {
                        i2 = setimageresource2.PlaybackStateCompat;
                    }
                    f4 = f5 - ((float) i2);
                    f3 = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.setTabContainer;
                }
                int read2 = this.MediaBrowserCompat$CustomActionResultReceiver.read();
                int read3 = this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.read();
                if (this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat == this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat) {
                    f3 = 0.5f;
                    read3 = 0;
                } else {
                    i3 = read2;
                }
                float f6 = (float) i3;
                float f7 = (float) read3;
                float f8 = (f4 - f6) - f7;
                if (z) {
                    AppCompatImageView appCompatImageView10 = this.MediaMetadataCompat;
                    appCompatImageView10.MediaBrowserCompat$SearchResultReceiver = appCompatImageView10.f2535x50fd9e4a.MediaBrowserCompat$SearchResultReceiver + f7 + (f8 * f3);
                    this.MediaBrowserCompat$SearchResultReceiver = (this.f2535x50fd9e4a.MediaBrowserCompat$SearchResultReceiver - f6) - (f8 * (1.0f - f3));
                } else {
                    this.MediaBrowserCompat$SearchResultReceiver = this.f2535x50fd9e4a.MediaBrowserCompat$SearchResultReceiver + f6 + (f8 * f3);
                    AppCompatImageView appCompatImageView11 = this.MediaMetadataCompat;
                    appCompatImageView11.MediaBrowserCompat$SearchResultReceiver = (appCompatImageView11.f2535x50fd9e4a.MediaBrowserCompat$SearchResultReceiver - f7) - (f8 * (1.0f - f3));
                }
                write();
                this.MediaMetadataCompat.write();
            } else if (this.MediaSessionCompat$Token == 3 && (appCompatImageView = this.f2535x50fd9e4a) != null && appCompatImageView.IconCompatParcelizer == 1 && (appCompatImageView2 = this.MediaMetadataCompat) != null && (appCompatImageView3 = appCompatImageView2.f2535x50fd9e4a) != null && appCompatImageView3.IconCompatParcelizer == 1) {
                AppCompatImageView appCompatImageView12 = this.f2535x50fd9e4a;
                this.MediaBrowserCompat$MediaItem = appCompatImageView12.MediaBrowserCompat$MediaItem;
                AppCompatImageView appCompatImageView13 = this.MediaMetadataCompat;
                AppCompatImageView appCompatImageView14 = appCompatImageView13.f2535x50fd9e4a;
                appCompatImageView13.MediaBrowserCompat$MediaItem = appCompatImageView14.MediaBrowserCompat$MediaItem;
                this.MediaBrowserCompat$SearchResultReceiver = appCompatImageView12.MediaBrowserCompat$SearchResultReceiver + this.RatingCompat;
                appCompatImageView13.MediaBrowserCompat$SearchResultReceiver = appCompatImageView14.MediaBrowserCompat$SearchResultReceiver + appCompatImageView13.RatingCompat;
                write();
                this.MediaMetadataCompat.write();
            } else if (this.MediaSessionCompat$Token == 5) {
                this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        super.MediaBrowserCompat$ItemReceiver();
        this.f2535x50fd9e4a = null;
        this.RatingCompat = BitmapDescriptorFactory.HUE_RED;
        this.MediaBrowserCompat$ItemReceiver = null;
        this.read = 1;
        this.MediaDescriptionCompat = null;
        this.MediaBrowserCompat$MediaItem = null;
        this.MediaBrowserCompat$SearchResultReceiver = BitmapDescriptorFactory.HUE_RED;
        this.MediaMetadataCompat = null;
        this.MediaSessionCompat$Token = 0;
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(AppCompatCheckedTextView appCompatCheckedTextView) {
        setCheckMarkDrawable setcheckmarkdrawable = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        AppCompatImageView appCompatImageView = this.MediaBrowserCompat$MediaItem;
        if (appCompatImageView == null) {
            appCompatCheckedTextView.MediaBrowserCompat$ItemReceiver(setcheckmarkdrawable, (int) (this.MediaBrowserCompat$SearchResultReceiver + 0.5f));
        } else {
            appCompatCheckedTextView.write(setcheckmarkdrawable, appCompatCheckedTextView.MediaBrowserCompat$CustomActionResultReceiver((Object) appCompatImageView.MediaBrowserCompat$CustomActionResultReceiver), (int) (this.MediaBrowserCompat$SearchResultReceiver + 0.5f), 6);
        }
    }
}

package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import p040o.setImageResource;

/* renamed from: o.setSupportButtonTintMode */
public final class setSupportButtonTintMode extends setImageURI {
    public boolean IconCompatParcelizer = true;
    private ArrayList<AppCompatImageView> setLogo = new ArrayList<>(4);
    public int write = 0;

    public final boolean write() {
        return true;
    }

    public final void read() {
        super.read();
        this.setLogo.clear();
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        if (this.AbsActionBarView != null) {
            if ((((setImageDrawable) this.AbsActionBarView).setMenuPrepared & 2) == 2) {
                int i2 = this.write;
                if (i2 == 0) {
                    appCompatImageView = this.AppCompatDialogFragment.write;
                } else if (i2 == 1) {
                    appCompatImageView = this.setSplitBackground.write;
                } else if (i2 == 2) {
                    appCompatImageView = this.setPrimaryBackground.write;
                } else if (i2 == 3) {
                    appCompatImageView = this.MediaBrowserCompat$MediaItem.write;
                } else {
                    return;
                }
                appCompatImageView.MediaSessionCompat$Token = 5;
                int i3 = this.write;
                if (i3 == 0 || i3 == 1) {
                    this.setPrimaryBackground.write.IconCompatParcelizer((AppCompatImageView) null, BitmapDescriptorFactory.HUE_RED);
                    this.MediaBrowserCompat$MediaItem.write.IconCompatParcelizer((AppCompatImageView) null, BitmapDescriptorFactory.HUE_RED);
                } else {
                    this.AppCompatDialogFragment.write.IconCompatParcelizer((AppCompatImageView) null, BitmapDescriptorFactory.HUE_RED);
                    this.setSplitBackground.write.IconCompatParcelizer((AppCompatImageView) null, BitmapDescriptorFactory.HUE_RED);
                }
                this.setLogo.clear();
                for (int i4 = 0; i4 < this.ActionBarOverlayLayout; i4++) {
                    setImageResource setimageresource = this.setActionBarVisibilityCallback[i4];
                    if (this.IconCompatParcelizer || setimageresource.write()) {
                        int i5 = this.write;
                        if (i5 == 0) {
                            appCompatImageView2 = setimageresource.AppCompatDialogFragment.write;
                        } else if (i5 == 1) {
                            appCompatImageView2 = setimageresource.setSplitBackground.write;
                        } else if (i5 == 2) {
                            appCompatImageView2 = setimageresource.setPrimaryBackground.write;
                        } else if (i5 != 3) {
                            appCompatImageView2 = null;
                        } else {
                            appCompatImageView2 = setimageresource.MediaBrowserCompat$MediaItem.write;
                        }
                        if (appCompatImageView2 != null) {
                            this.setLogo.add(appCompatImageView2);
                            appCompatImageView2.write.add(appCompatImageView);
                        }
                    }
                }
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        AppCompatImageView appCompatImageView;
        int i = this.write;
        float f = Float.MAX_VALUE;
        if (i != 0) {
            if (i == 1) {
                appCompatImageView = this.setSplitBackground.write;
            } else if (i == 2) {
                appCompatImageView = this.setPrimaryBackground.write;
            } else if (i == 3) {
                appCompatImageView = this.MediaBrowserCompat$MediaItem.write;
            } else {
                return;
            }
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            appCompatImageView = this.AppCompatDialogFragment.write;
        }
        int size = this.setLogo.size();
        AppCompatImageView appCompatImageView2 = null;
        int i2 = 0;
        while (i2 < size) {
            AppCompatImageView appCompatImageView3 = this.setLogo.get(i2);
            if (appCompatImageView3.IconCompatParcelizer == 1) {
                int i3 = this.write;
                if (i3 == 0 || i3 == 2) {
                    if (appCompatImageView3.MediaBrowserCompat$SearchResultReceiver < f) {
                        f = appCompatImageView3.MediaBrowserCompat$SearchResultReceiver;
                        appCompatImageView2 = appCompatImageView3.MediaBrowserCompat$MediaItem;
                    }
                } else if (appCompatImageView3.MediaBrowserCompat$SearchResultReceiver > f) {
                    f = appCompatImageView3.MediaBrowserCompat$SearchResultReceiver;
                    appCompatImageView2 = appCompatImageView3.MediaBrowserCompat$MediaItem;
                }
                i2++;
            } else {
                return;
            }
        }
        appCompatImageView.MediaBrowserCompat$MediaItem = appCompatImageView2;
        appCompatImageView.MediaBrowserCompat$SearchResultReceiver = f;
        appCompatImageView.write();
        int i4 = this.write;
        if (i4 == 0) {
            this.setSplitBackground.write.IconCompatParcelizer(appCompatImageView2, f);
        } else if (i4 == 1) {
            this.AppCompatDialogFragment.write.IconCompatParcelizer(appCompatImageView2, f);
        } else if (i4 == 2) {
            this.MediaBrowserCompat$MediaItem.write.IconCompatParcelizer(appCompatImageView2, f);
        } else if (i4 == 3) {
            this.setPrimaryBackground.write.IconCompatParcelizer(appCompatImageView2, f);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(AppCompatCheckedTextView appCompatCheckedTextView) {
        boolean z;
        int i;
        int i2;
        this.setContentView[0] = this.AppCompatDialogFragment;
        this.setContentView[2] = this.setPrimaryBackground;
        this.setContentView[1] = this.setSplitBackground;
        this.setContentView[3] = this.MediaBrowserCompat$MediaItem;
        for (int i3 = 0; i3 < this.setContentView.length; i3++) {
            this.setContentView[i3].MediaBrowserCompat$ItemReceiver = appCompatCheckedTextView.MediaBrowserCompat$CustomActionResultReceiver((Object) this.setContentView[i3]);
        }
        int i4 = this.write;
        if (i4 >= 0 && i4 < 4) {
            setSupportImageTintList setsupportimagetintlist = this.setContentView[this.write];
            int i5 = 0;
            while (true) {
                if (i5 >= this.ActionBarOverlayLayout) {
                    z = false;
                    break;
                }
                setImageResource setimageresource = this.setActionBarVisibilityCallback[i5];
                if ((this.IconCompatParcelizer || setimageresource.write()) && ((((i = this.write) == 0 || i == 1) && setimageresource.AppCompatDelegateImpl$ListMenuDecorView[0] == setImageResource.read.MATCH_CONSTRAINT) || (((i2 = this.write) == 2 || i2 == 3) && setimageresource.AppCompatDelegateImpl$ListMenuDecorView[1] == setImageResource.read.MATCH_CONSTRAINT))) {
                    z = true;
                } else {
                    i5++;
                }
            }
            z = true;
            int i6 = this.write;
            if (i6 == 0 || i6 == 1 ? this.AbsActionBarView.AppCompatDelegateImpl$ListMenuDecorView[0] == setImageResource.read.WRAP_CONTENT : this.AbsActionBarView.AppCompatDelegateImpl$ListMenuDecorView[1] == setImageResource.read.WRAP_CONTENT) {
                z = false;
            }
            for (int i7 = 0; i7 < this.ActionBarOverlayLayout; i7++) {
                setImageResource setimageresource2 = this.setActionBarVisibilityCallback[i7];
                if (this.IconCompatParcelizer || setimageresource2.write()) {
                    setCheckMarkDrawable MediaBrowserCompat$CustomActionResultReceiver = appCompatCheckedTextView.MediaBrowserCompat$CustomActionResultReceiver((Object) setimageresource2.setContentView[this.write]);
                    setimageresource2.setContentView[this.write].MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver;
                    int i8 = this.write;
                    if (i8 == 0 || i8 == 2) {
                        setCheckMarkDrawable setcheckmarkdrawable = setsupportimagetintlist.MediaBrowserCompat$ItemReceiver;
                        setTextSize MediaBrowserCompat$CustomActionResultReceiver2 = appCompatCheckedTextView.MediaBrowserCompat$CustomActionResultReceiver();
                        setCheckMarkDrawable IconCompatParcelizer2 = appCompatCheckedTextView.IconCompatParcelizer();
                        IconCompatParcelizer2.MediaBrowserCompat$MediaItem = 0;
                        MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer(setcheckmarkdrawable, MediaBrowserCompat$CustomActionResultReceiver, IconCompatParcelizer2, 0);
                        if (z) {
                            MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(appCompatCheckedTextView.MediaBrowserCompat$ItemReceiver(1, (String) null), (float) ((int) (-MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2))));
                        }
                        appCompatCheckedTextView.read(MediaBrowserCompat$CustomActionResultReceiver2);
                    } else {
                        setCheckMarkDrawable setcheckmarkdrawable2 = setsupportimagetintlist.MediaBrowserCompat$ItemReceiver;
                        setTextSize MediaBrowserCompat$CustomActionResultReceiver3 = appCompatCheckedTextView.MediaBrowserCompat$CustomActionResultReceiver();
                        setCheckMarkDrawable IconCompatParcelizer3 = appCompatCheckedTextView.IconCompatParcelizer();
                        IconCompatParcelizer3.MediaBrowserCompat$MediaItem = 0;
                        MediaBrowserCompat$CustomActionResultReceiver3.read(setcheckmarkdrawable2, MediaBrowserCompat$CustomActionResultReceiver, IconCompatParcelizer3, 0);
                        if (z) {
                            MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(appCompatCheckedTextView.MediaBrowserCompat$ItemReceiver(1, (String) null), (float) ((int) (-MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer3))));
                        }
                        appCompatCheckedTextView.read(MediaBrowserCompat$CustomActionResultReceiver3);
                    }
                }
            }
            int i9 = this.write;
            if (i9 == 0) {
                appCompatCheckedTextView.write(this.setSplitBackground.MediaBrowserCompat$ItemReceiver, this.AppCompatDialogFragment.MediaBrowserCompat$ItemReceiver, 0, 6);
                if (!z) {
                    appCompatCheckedTextView.write(this.AppCompatDialogFragment.MediaBrowserCompat$ItemReceiver, this.AbsActionBarView.setSplitBackground.MediaBrowserCompat$ItemReceiver, 0, 5);
                }
            } else if (i9 == 1) {
                appCompatCheckedTextView.write(this.AppCompatDialogFragment.MediaBrowserCompat$ItemReceiver, this.setSplitBackground.MediaBrowserCompat$ItemReceiver, 0, 6);
                if (!z) {
                    appCompatCheckedTextView.write(this.AppCompatDialogFragment.MediaBrowserCompat$ItemReceiver, this.AbsActionBarView.AppCompatDialogFragment.MediaBrowserCompat$ItemReceiver, 0, 5);
                }
            } else if (i9 == 2) {
                appCompatCheckedTextView.write(this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver, this.setPrimaryBackground.MediaBrowserCompat$ItemReceiver, 0, 6);
                if (!z) {
                    appCompatCheckedTextView.write(this.setPrimaryBackground.MediaBrowserCompat$ItemReceiver, this.AbsActionBarView.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver, 0, 5);
                }
            } else if (i9 == 3) {
                appCompatCheckedTextView.write(this.setPrimaryBackground.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver, 0, 6);
                if (!z) {
                    appCompatCheckedTextView.write(this.setPrimaryBackground.MediaBrowserCompat$ItemReceiver, this.AbsActionBarView.setPrimaryBackground.MediaBrowserCompat$ItemReceiver, 0, 5);
                }
            }
        }
    }
}

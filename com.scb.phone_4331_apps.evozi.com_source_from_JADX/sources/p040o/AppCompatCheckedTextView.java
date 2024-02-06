package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* renamed from: o.AppCompatCheckedTextView */
public final class AppCompatCheckedTextView {
    private static int RatingCompat = 1000;
    public boolean IconCompatParcelizer;
    public int MediaBrowserCompat$CustomActionResultReceiver;
    public setTextSize[] MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem;
    private int MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private int f2534x50fd9e4a;
    private boolean[] MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private int MediaSessionCompat$QueueItem;
    private final write MediaSessionCompat$ResultReceiverWrapper;
    private setCheckMarkDrawable[] MediaSessionCompat$Token;
    private int ParcelableVolumeInfo;
    public write read;
    public final AppCompatAutoCompleteTextView write;

    /* renamed from: o.AppCompatCheckedTextView$write */
    interface write {
        void IconCompatParcelizer();

        setCheckMarkDrawable read();

        void read(write write);

        setCheckMarkDrawable write(boolean[] zArr);

        void write(setCheckMarkDrawable setcheckmarkdrawable);
    }

    public AppCompatCheckedTextView() {
        this.f2534x50fd9e4a = 0;
        this.MediaBrowserCompat$MediaItem = 32;
        this.MediaMetadataCompat = 32;
        this.MediaBrowserCompat$ItemReceiver = null;
        this.IconCompatParcelizer = false;
        this.MediaDescriptionCompat = new boolean[32];
        this.ParcelableVolumeInfo = 1;
        this.MediaBrowserCompat$CustomActionResultReceiver = 0;
        this.MediaBrowserCompat$SearchResultReceiver = 32;
        this.MediaSessionCompat$Token = new setCheckMarkDrawable[RatingCompat];
        this.MediaSessionCompat$QueueItem = 0;
        this.MediaBrowserCompat$ItemReceiver = new setTextSize[32];
        MediaBrowserCompat$MediaItem();
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = new AppCompatAutoCompleteTextView();
        this.write = appCompatAutoCompleteTextView;
        this.read = new AppCompatEditText(appCompatAutoCompleteTextView);
        this.MediaSessionCompat$ResultReceiverWrapper = new setTextSize(this.write);
    }

    private void MediaDescriptionCompat() {
        int i = this.MediaBrowserCompat$MediaItem << 1;
        this.MediaBrowserCompat$MediaItem = i;
        this.MediaBrowserCompat$ItemReceiver = (setTextSize[]) Arrays.copyOf(this.MediaBrowserCompat$ItemReceiver, i);
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = this.write;
        appCompatAutoCompleteTextView.MediaBrowserCompat$ItemReceiver = (setCheckMarkDrawable[]) Arrays.copyOf(appCompatAutoCompleteTextView.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$MediaItem);
        int i2 = this.MediaBrowserCompat$MediaItem;
        this.MediaDescriptionCompat = new boolean[i2];
        this.MediaMetadataCompat = i2;
        this.MediaBrowserCompat$SearchResultReceiver = i2;
    }

    private void MediaBrowserCompat$MediaItem() {
        int i = 0;
        while (true) {
            setTextSize[] settextsizeArr = this.MediaBrowserCompat$ItemReceiver;
            if (i < settextsizeArr.length) {
                setTextSize settextsize = settextsizeArr[i];
                if (settextsize != null) {
                    this.write.IconCompatParcelizer.write(settextsize);
                }
                this.MediaBrowserCompat$ItemReceiver[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    public final void read() {
        for (setCheckMarkDrawable setcheckmarkdrawable : this.write.MediaBrowserCompat$ItemReceiver) {
            if (setcheckmarkdrawable != null) {
                setcheckmarkdrawable.write();
            }
        }
        this.write.write.MediaBrowserCompat$CustomActionResultReceiver(this.MediaSessionCompat$Token, this.MediaSessionCompat$QueueItem);
        this.MediaSessionCompat$QueueItem = 0;
        Arrays.fill(this.write.MediaBrowserCompat$ItemReceiver, (Object) null);
        this.f2534x50fd9e4a = 0;
        this.read.IconCompatParcelizer();
        this.ParcelableVolumeInfo = 1;
        MediaBrowserCompat$MediaItem();
        this.MediaBrowserCompat$CustomActionResultReceiver = 0;
    }

    public final setCheckMarkDrawable MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        setCheckMarkDrawable setcheckmarkdrawable = null;
        if (obj == null) {
            return null;
        }
        if (this.ParcelableVolumeInfo + 1 >= this.MediaMetadataCompat) {
            MediaDescriptionCompat();
        }
        if (obj instanceof setSupportImageTintList) {
            setSupportImageTintList setsupportimagetintlist = (setSupportImageTintList) obj;
            setcheckmarkdrawable = setsupportimagetintlist.MediaBrowserCompat$ItemReceiver;
            if (setcheckmarkdrawable == null) {
                setCheckMarkDrawable setcheckmarkdrawable2 = setsupportimagetintlist.MediaBrowserCompat$ItemReceiver;
                if (setcheckmarkdrawable2 == null) {
                    setsupportimagetintlist.MediaBrowserCompat$ItemReceiver = new setCheckMarkDrawable(setCheckMarkDrawable$MediaBrowserCompat$ItemReceiver.UNRESTRICTED);
                } else {
                    setcheckmarkdrawable2.write();
                }
                setcheckmarkdrawable = setsupportimagetintlist.MediaBrowserCompat$ItemReceiver;
            }
            if (setcheckmarkdrawable.MediaBrowserCompat$ItemReceiver == -1 || setcheckmarkdrawable.MediaBrowserCompat$ItemReceiver > this.f2534x50fd9e4a || this.write.MediaBrowserCompat$ItemReceiver[setcheckmarkdrawable.MediaBrowserCompat$ItemReceiver] == null) {
                if (setcheckmarkdrawable.MediaBrowserCompat$ItemReceiver != -1) {
                    setcheckmarkdrawable.write();
                }
                int i = this.f2534x50fd9e4a + 1;
                this.f2534x50fd9e4a = i;
                this.ParcelableVolumeInfo++;
                setcheckmarkdrawable.MediaBrowserCompat$ItemReceiver = i;
                setcheckmarkdrawable.write = setCheckMarkDrawable$MediaBrowserCompat$ItemReceiver.UNRESTRICTED;
                this.write.MediaBrowserCompat$ItemReceiver[this.f2534x50fd9e4a] = setcheckmarkdrawable;
            }
        }
        return setcheckmarkdrawable;
    }

    public final setTextSize MediaBrowserCompat$CustomActionResultReceiver() {
        setTextSize read2 = this.write.IconCompatParcelizer.read();
        if (read2 == null) {
            read2 = new setTextSize(this.write);
        } else {
            read2.IconCompatParcelizer = null;
            read2.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
            read2.MediaBrowserCompat$ItemReceiver = BitmapDescriptorFactory.HUE_RED;
            read2.read = false;
        }
        setCheckMarkDrawable.MediaBrowserCompat$CustomActionResultReceiver++;
        return read2;
    }

    public final setCheckMarkDrawable IconCompatParcelizer() {
        if (this.ParcelableVolumeInfo + 1 >= this.MediaMetadataCompat) {
            MediaDescriptionCompat();
        }
        setCheckMarkDrawable MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(setCheckMarkDrawable$MediaBrowserCompat$ItemReceiver.SLACK);
        int i = this.f2534x50fd9e4a + 1;
        this.f2534x50fd9e4a = i;
        this.ParcelableVolumeInfo++;
        MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver = i;
        this.write.MediaBrowserCompat$ItemReceiver[this.f2534x50fd9e4a] = MediaBrowserCompat$ItemReceiver2;
        return MediaBrowserCompat$ItemReceiver2;
    }

    private setCheckMarkDrawable RatingCompat() {
        if (this.ParcelableVolumeInfo + 1 >= this.MediaMetadataCompat) {
            MediaDescriptionCompat();
        }
        setCheckMarkDrawable MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(setCheckMarkDrawable$MediaBrowserCompat$ItemReceiver.SLACK);
        int i = this.f2534x50fd9e4a + 1;
        this.f2534x50fd9e4a = i;
        this.ParcelableVolumeInfo++;
        MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver = i;
        this.write.MediaBrowserCompat$ItemReceiver[this.f2534x50fd9e4a] = MediaBrowserCompat$ItemReceiver2;
        return MediaBrowserCompat$ItemReceiver2;
    }

    public final setCheckMarkDrawable MediaBrowserCompat$ItemReceiver(int i, String str) {
        if (this.ParcelableVolumeInfo + 1 >= this.MediaMetadataCompat) {
            MediaDescriptionCompat();
        }
        setCheckMarkDrawable MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(setCheckMarkDrawable$MediaBrowserCompat$ItemReceiver.ERROR);
        int i2 = this.f2534x50fd9e4a + 1;
        this.f2534x50fd9e4a = i2;
        this.ParcelableVolumeInfo++;
        MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver = i2;
        MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$MediaItem = i;
        this.write.MediaBrowserCompat$ItemReceiver[this.f2534x50fd9e4a] = MediaBrowserCompat$ItemReceiver2;
        this.read.write(MediaBrowserCompat$ItemReceiver2);
        return MediaBrowserCompat$ItemReceiver2;
    }

    private setCheckMarkDrawable MediaBrowserCompat$ItemReceiver(setCheckMarkDrawable$MediaBrowserCompat$ItemReceiver setcheckmarkdrawable_mediabrowsercompat_itemreceiver) {
        setCheckMarkDrawable read2 = this.write.write.read();
        if (read2 == null) {
            read2 = new setCheckMarkDrawable(setcheckmarkdrawable_mediabrowsercompat_itemreceiver);
            read2.write = setcheckmarkdrawable_mediabrowsercompat_itemreceiver;
        } else {
            read2.write();
            read2.write = setcheckmarkdrawable_mediabrowsercompat_itemreceiver;
        }
        int i = this.MediaSessionCompat$QueueItem;
        int i2 = RatingCompat;
        if (i >= i2) {
            int i3 = i2 << 1;
            RatingCompat = i3;
            this.MediaSessionCompat$Token = (setCheckMarkDrawable[]) Arrays.copyOf(this.MediaSessionCompat$Token, i3);
        }
        setCheckMarkDrawable[] setcheckmarkdrawableArr = this.MediaSessionCompat$Token;
        int i4 = this.MediaSessionCompat$QueueItem;
        this.MediaSessionCompat$QueueItem = i4 + 1;
        setcheckmarkdrawableArr[i4] = read2;
        return read2;
    }

    public final void IconCompatParcelizer(setTextSize settextsize) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver > 0) {
            C1134xe5b94a38 alertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver = settextsize.MediaBrowserCompat$CustomActionResultReceiver;
            setTextSize[] settextsizeArr = this.MediaBrowserCompat$ItemReceiver;
            int i = alertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver;
            loop0:
            while (true) {
                int i2 = 0;
                int i3 = 0;
                while (i != -1 && i3 < alertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver) {
                    setCheckMarkDrawable setcheckmarkdrawable = alertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver[alertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver.write[i]];
                    if (setcheckmarkdrawable.read != -1) {
                        float f = alertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver.read[i];
                        alertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(setcheckmarkdrawable, true);
                        setTextSize settextsize2 = settextsizeArr[setcheckmarkdrawable.read];
                        if (!settextsize2.read) {
                            C1134xe5b94a38 alertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver2 = settextsize2.MediaBrowserCompat$CustomActionResultReceiver;
                            int i4 = alertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver2.MediaBrowserCompat$SearchResultReceiver;
                            while (i4 != -1 && i2 < alertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver) {
                                alertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(alertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver[alertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver2.write[i4]], alertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver2.read[i4] * f, true);
                                i4 = alertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver2.MediaBrowserCompat$ItemReceiver[i4];
                                i2++;
                            }
                        }
                        settextsize.MediaBrowserCompat$ItemReceiver += settextsize2.MediaBrowserCompat$ItemReceiver * f;
                        settextsize2.IconCompatParcelizer.IconCompatParcelizer(settextsize);
                        i = alertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver;
                    } else {
                        i = alertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver[i];
                        i3++;
                    }
                }
            }
            if (settextsize.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver == 0) {
                settextsize.read = true;
            }
        }
    }

    public final void read(setTextSize settextsize) {
        setCheckMarkDrawable MediaBrowserCompat$CustomActionResultReceiver2;
        if (settextsize != null) {
            boolean z = true;
            if (this.MediaBrowserCompat$CustomActionResultReceiver + 1 >= this.MediaBrowserCompat$SearchResultReceiver || this.ParcelableVolumeInfo + 1 >= this.MediaMetadataCompat) {
                MediaDescriptionCompat();
            }
            boolean z2 = false;
            if (!settextsize.read) {
                IconCompatParcelizer(settextsize);
                if (!settextsize.MediaBrowserCompat$CustomActionResultReceiver()) {
                    float f = settextsize.MediaBrowserCompat$ItemReceiver;
                    if (f < BitmapDescriptorFactory.HUE_RED) {
                        settextsize.MediaBrowserCompat$ItemReceiver = -f;
                        settextsize.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
                    }
                    if (settextsize.MediaBrowserCompat$ItemReceiver(this)) {
                        setCheckMarkDrawable RatingCompat2 = RatingCompat();
                        settextsize.IconCompatParcelizer = RatingCompat2;
                        MediaBrowserCompat$CustomActionResultReceiver(settextsize);
                        this.MediaSessionCompat$ResultReceiverWrapper.read(settextsize);
                        MediaBrowserCompat$CustomActionResultReceiver(this.MediaSessionCompat$ResultReceiverWrapper);
                        if (RatingCompat2.read == -1) {
                            if (settextsize.IconCompatParcelizer == RatingCompat2 && (MediaBrowserCompat$CustomActionResultReceiver2 = settextsize.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver((boolean[]) null, RatingCompat2)) != null) {
                                settextsize.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver2);
                            }
                            if (!settextsize.read) {
                                settextsize.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(settextsize);
                            }
                            this.MediaBrowserCompat$CustomActionResultReceiver--;
                        }
                    } else {
                        z = false;
                    }
                    if (settextsize.write()) {
                        z2 = z;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!z2) {
                MediaBrowserCompat$CustomActionResultReceiver(settextsize);
            }
        }
    }

    private final void MediaBrowserCompat$CustomActionResultReceiver(setTextSize settextsize) {
        if (this.MediaBrowserCompat$ItemReceiver[this.MediaBrowserCompat$CustomActionResultReceiver] != null) {
            this.write.IconCompatParcelizer.write(this.MediaBrowserCompat$ItemReceiver[this.MediaBrowserCompat$CustomActionResultReceiver]);
        }
        this.MediaBrowserCompat$ItemReceiver[this.MediaBrowserCompat$CustomActionResultReceiver] = settextsize;
        settextsize.IconCompatParcelizer.read = this.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver++;
        settextsize.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(settextsize);
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(write write2) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.ParcelableVolumeInfo; i2++) {
            this.MediaDescriptionCompat[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= (this.ParcelableVolumeInfo << 1)) {
                return i3;
            }
            if (write2.read() != null) {
                this.MediaDescriptionCompat[write2.read().MediaBrowserCompat$ItemReceiver] = true;
            }
            setCheckMarkDrawable write3 = write2.write(this.MediaDescriptionCompat);
            if (write3 != null) {
                if (this.MediaDescriptionCompat[write3.MediaBrowserCompat$ItemReceiver]) {
                    return i3;
                }
                this.MediaDescriptionCompat[write3.MediaBrowserCompat$ItemReceiver] = true;
            }
            if (write3 != null) {
                float f = Float.MAX_VALUE;
                int i4 = i;
                int i5 = -1;
                while (i4 < this.MediaBrowserCompat$CustomActionResultReceiver) {
                    setTextSize settextsize = this.MediaBrowserCompat$ItemReceiver[i4];
                    if (settextsize.IconCompatParcelizer.write != setCheckMarkDrawable$MediaBrowserCompat$ItemReceiver.UNRESTRICTED && !settextsize.read) {
                        C1134xe5b94a38 alertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver = settextsize.MediaBrowserCompat$CustomActionResultReceiver;
                        int i6 = alertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver;
                        if (i6 != -1) {
                            int i7 = i;
                            while (true) {
                                if (i6 == -1 || i7 >= alertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver) {
                                    break;
                                } else if (alertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver.write[i6] == write3.MediaBrowserCompat$ItemReceiver) {
                                    z = true;
                                    break;
                                } else {
                                    i6 = alertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver[i6];
                                    i7++;
                                }
                            }
                        }
                        z = false;
                        if (z) {
                            float MediaBrowserCompat$CustomActionResultReceiver2 = settextsize.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(write3);
                            if (MediaBrowserCompat$CustomActionResultReceiver2 < BitmapDescriptorFactory.HUE_RED) {
                                float f2 = (-settextsize.MediaBrowserCompat$ItemReceiver) / MediaBrowserCompat$CustomActionResultReceiver2;
                                if (f2 < f) {
                                    i5 = i4;
                                    f = f2;
                                }
                            }
                        }
                    }
                    i4++;
                    i = 0;
                }
                if (i5 >= 0) {
                    setTextSize settextsize2 = this.MediaBrowserCompat$ItemReceiver[i5];
                    settextsize2.IconCompatParcelizer.read = -1;
                    settextsize2.IconCompatParcelizer(write3);
                    settextsize2.IconCompatParcelizer.read = i5;
                    settextsize2.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(settextsize2);
                    i = 0;
                }
            }
            z2 = true;
            i = 0;
        }
        return i3;
    }

    public final int write() throws Exception {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            f = BitmapDescriptorFactory.HUE_RED;
            if (i < i2) {
                if (this.MediaBrowserCompat$ItemReceiver[i].IconCompatParcelizer.write != setCheckMarkDrawable$MediaBrowserCompat$ItemReceiver.UNRESTRICTED && this.MediaBrowserCompat$ItemReceiver[i].MediaBrowserCompat$ItemReceiver < BitmapDescriptorFactory.HUE_RED) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            float f2 = Float.MAX_VALUE;
            int i4 = -1;
            int i5 = -1;
            int i6 = 0;
            int i7 = 0;
            while (i6 < this.MediaBrowserCompat$CustomActionResultReceiver) {
                setTextSize settextsize = this.MediaBrowserCompat$ItemReceiver[i6];
                if (settextsize.IconCompatParcelizer.write != setCheckMarkDrawable$MediaBrowserCompat$ItemReceiver.UNRESTRICTED && !settextsize.read && settextsize.MediaBrowserCompat$ItemReceiver < f) {
                    int i8 = 1;
                    while (i8 < this.ParcelableVolumeInfo) {
                        setCheckMarkDrawable setcheckmarkdrawable = this.write.MediaBrowserCompat$ItemReceiver[i8];
                        float MediaBrowserCompat$CustomActionResultReceiver2 = settextsize.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(setcheckmarkdrawable);
                        if (MediaBrowserCompat$CustomActionResultReceiver2 > f) {
                            for (int i9 = 0; i9 < 7; i9++) {
                                float f3 = setcheckmarkdrawable.MediaDescriptionCompat[i9] / MediaBrowserCompat$CustomActionResultReceiver2;
                                if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                    i7 = i9;
                                    f2 = f3;
                                    i4 = i6;
                                    i5 = i8;
                                }
                            }
                        }
                        i8++;
                        f = BitmapDescriptorFactory.HUE_RED;
                    }
                }
                i6++;
                f = BitmapDescriptorFactory.HUE_RED;
            }
            if (i4 != -1) {
                setTextSize settextsize2 = this.MediaBrowserCompat$ItemReceiver[i4];
                settextsize2.IconCompatParcelizer.read = -1;
                settextsize2.IconCompatParcelizer(this.write.MediaBrowserCompat$ItemReceiver[i5]);
                settextsize2.IconCompatParcelizer.read = i4;
                settextsize2.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(settextsize2);
            } else {
                z2 = true;
            }
            if (i3 > this.ParcelableVolumeInfo / 2) {
                z2 = true;
            }
            f = BitmapDescriptorFactory.HUE_RED;
        }
        return i3;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        for (int i = 0; i < this.MediaBrowserCompat$CustomActionResultReceiver; i++) {
            setTextSize settextsize = this.MediaBrowserCompat$ItemReceiver[i];
            settextsize.IconCompatParcelizer.IconCompatParcelizer = settextsize.MediaBrowserCompat$ItemReceiver;
        }
    }

    public final void read(setCheckMarkDrawable setcheckmarkdrawable, setCheckMarkDrawable setcheckmarkdrawable2, int i, int i2) {
        setTextSize MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        setCheckMarkDrawable IconCompatParcelizer2 = IconCompatParcelizer();
        IconCompatParcelizer2.MediaBrowserCompat$MediaItem = 0;
        MediaBrowserCompat$CustomActionResultReceiver2.read(setcheckmarkdrawable, setcheckmarkdrawable2, IconCompatParcelizer2, i);
        if (i2 != 6) {
            MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver(i2, (String) null), (float) ((int) (-MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2))));
        }
        read(MediaBrowserCompat$CustomActionResultReceiver2);
    }

    public final void IconCompatParcelizer(setCheckMarkDrawable setcheckmarkdrawable, setCheckMarkDrawable setcheckmarkdrawable2, int i, int i2) {
        setTextSize MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        setCheckMarkDrawable IconCompatParcelizer2 = IconCompatParcelizer();
        IconCompatParcelizer2.MediaBrowserCompat$MediaItem = 0;
        MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer(setcheckmarkdrawable, setcheckmarkdrawable2, IconCompatParcelizer2, i);
        if (i2 != 6) {
            MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver(i2, (String) null), (float) ((int) (-MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2))));
        }
        read(MediaBrowserCompat$CustomActionResultReceiver2);
    }

    public final void write(setCheckMarkDrawable setcheckmarkdrawable, setCheckMarkDrawable setcheckmarkdrawable2, int i, float f, setCheckMarkDrawable setcheckmarkdrawable3, setCheckMarkDrawable setcheckmarkdrawable4, int i2, int i3) {
        int i4 = i3;
        setTextSize MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver(setcheckmarkdrawable, setcheckmarkdrawable2, i, f, setcheckmarkdrawable3, setcheckmarkdrawable4, i2);
        if (i4 != 6) {
            MediaBrowserCompat$CustomActionResultReceiver2.write(this, i4);
        }
        read(MediaBrowserCompat$CustomActionResultReceiver2);
    }

    public final setTextSize write(setCheckMarkDrawable setcheckmarkdrawable, setCheckMarkDrawable setcheckmarkdrawable2, int i, int i2) {
        setTextSize MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer(setcheckmarkdrawable, setcheckmarkdrawable2, i);
        if (i2 != 6) {
            MediaBrowserCompat$CustomActionResultReceiver2.write(this, i2);
        }
        read(MediaBrowserCompat$CustomActionResultReceiver2);
        return MediaBrowserCompat$CustomActionResultReceiver2;
    }

    public final void MediaBrowserCompat$ItemReceiver(setCheckMarkDrawable setcheckmarkdrawable, int i) {
        int i2 = setcheckmarkdrawable.read;
        if (setcheckmarkdrawable.read != -1) {
            setTextSize settextsize = this.MediaBrowserCompat$ItemReceiver[i2];
            if (settextsize.read) {
                settextsize.MediaBrowserCompat$ItemReceiver = (float) i;
            } else if (settextsize.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver == 0) {
                settextsize.read = true;
                settextsize.MediaBrowserCompat$ItemReceiver = (float) i;
            } else {
                setTextSize MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
                if (i < 0) {
                    MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver = (float) (-i);
                    MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable, 1.0f);
                } else {
                    MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver = (float) i;
                    MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable, -1.0f);
                }
                read(MediaBrowserCompat$CustomActionResultReceiver2);
            }
        } else {
            setTextSize MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver3.IconCompatParcelizer = setcheckmarkdrawable;
            float f = (float) i;
            setcheckmarkdrawable.IconCompatParcelizer = f;
            MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$ItemReceiver = f;
            MediaBrowserCompat$CustomActionResultReceiver3.read = true;
            read(MediaBrowserCompat$CustomActionResultReceiver3);
        }
    }
}

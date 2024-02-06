package p040o;

/* renamed from: o.DSYMV */
public final class DSYMV {
    public float IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public SGBMV MediaBrowserCompat$ItemReceiver;
    private DSYMM MediaDescriptionCompat;
    private DSYMM$MediaBrowserCompat$ItemReceiver read;
    private FragmentBuilder_BindOthersTabFragment write;

    public DSYMV(FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment, DSYMM$MediaBrowserCompat$ItemReceiver dSYMM$MediaBrowserCompat$ItemReceiver) {
        this.MediaDescriptionCompat = new DSYMM(dSYMM$MediaBrowserCompat$ItemReceiver);
        this.read = dSYMM$MediaBrowserCompat$ItemReceiver;
        this.write = fragmentBuilder_BindOthersTabFragment;
    }

    /* renamed from: o.DSYMV$3 */
    static /* synthetic */ class C11703 {
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.DTRMM[] r0 = p040o.DTRMM.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$ItemReceiver = r0
                o.DTRMM r1 = p040o.DTRMM.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.DTRMM r1 = p040o.DTRMM.COLOR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.DTRMM r1 = p040o.DTRMM.SCALE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.DTRMM r1 = p040o.DTRMM.WORM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x003e }
                o.DTRMM r1 = p040o.DTRMM.FILL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.DTRMM r1 = p040o.DTRMM.SLIDE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0054 }
                o.DTRMM r1 = p040o.DTRMM.THIN_WORM     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0060 }
                o.DTRMM r1 = p040o.DTRMM.DROP     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x006c }
                o.DTRMM r1 = p040o.DTRMM.SWAP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0078 }
                o.DTRMM r1 = p040o.DTRMM.SCALE_DOWN     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.DSYMV.C11703.<clinit>():void");
        }
    }

    public final void IconCompatParcelizer() {
        FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment = this.write;
        if (fragmentBuilder_BindOthersTabFragment.write == null) {
            fragmentBuilder_BindOthersTabFragment.write = DTRMM.NONE;
        }
        switch (C11703.MediaBrowserCompat$ItemReceiver[fragmentBuilder_BindOthersTabFragment.write.ordinal()]) {
            case 1:
                this.read.MediaBrowserCompat$ItemReceiver((inject_base64Decoder) null);
                return;
            case 2:
                write();
                return;
            case 3:
                read();
                return;
            case 4:
                MediaBrowserCompat$SearchResultReceiver();
                return;
            case 5:
                MediaBrowserCompat$ItemReceiver();
                return;
            case 6:
                MediaDescriptionCompat();
                return;
            case 7:
                MediaBrowserCompat$MediaItem();
                return;
            case 8:
                MediaBrowserCompat$CustomActionResultReceiver();
                return;
            case 9:
                MediaMetadataCompat();
                return;
            case 10:
                RatingCompat();
                return;
            default:
                return;
        }
    }

    private void write() {
        int i = this.write.AlertController$RecycleListView;
        int i2 = this.write.AppCompatDelegateImpl$ListMenuDecorView;
        long j = this.write.MediaBrowserCompat$ItemReceiver;
        DSYMM dsymm = this.MediaDescriptionCompat;
        if (dsymm.MediaBrowserCompat$ItemReceiver == null) {
            dsymm.MediaBrowserCompat$ItemReceiver = new SSPMV(dsymm.MediaBrowserCompat$MediaItem);
        }
        SGBMV MediaBrowserCompat$ItemReceiver2 = dsymm.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(i2, i).MediaBrowserCompat$ItemReceiver(j);
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer(this.IconCompatParcelizer);
        } else {
            MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver();
        }
        this.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver2;
    }

    private void read() {
        int i = this.write.AlertController$RecycleListView;
        int i2 = this.write.AppCompatDelegateImpl$ListMenuDecorView;
        int i3 = this.write.PlaybackStateCompat;
        float f = this.write.setHasDecor;
        long j = this.write.MediaBrowserCompat$ItemReceiver;
        DSYMM dsymm = this.MediaDescriptionCompat;
        if (dsymm.write == null) {
            dsymm.write = new SGER(dsymm.MediaBrowserCompat$MediaItem);
        }
        SGBMV MediaBrowserCompat$ItemReceiver2 = dsymm.write.MediaBrowserCompat$CustomActionResultReceiver(i2, i, i3, f).MediaBrowserCompat$ItemReceiver(j);
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer(this.IconCompatParcelizer);
        } else {
            MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver();
        }
        this.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver2;
    }

    private void MediaBrowserCompat$SearchResultReceiver() {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.write.MediaMetadataCompat) {
            i = this.write.AppCompatDialogFragment;
        } else {
            i = this.write.MediaBrowserCompat$MediaItem;
        }
        if (this.write.MediaMetadataCompat) {
            i2 = this.write.AppCompatActivity;
        } else {
            i2 = this.write.AppCompatDialogFragment;
        }
        FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment = this.write;
        boolean z = false;
        if (fragmentBuilder_BindOthersTabFragment == null) {
            i3 = 0;
        } else {
            if (fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token == null) {
                fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token = SSYR2.HORIZONTAL;
            }
            if (fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token == SSYR2.HORIZONTAL) {
                i3 = FragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindOthersTabFragment, i);
            } else {
                i3 = FragmentBuilder_BindOnboardingSelectAccountFragment.read(fragmentBuilder_BindOthersTabFragment, i);
            }
        }
        FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment2 = this.write;
        if (fragmentBuilder_BindOthersTabFragment2 == null) {
            i4 = 0;
        } else {
            if (fragmentBuilder_BindOthersTabFragment2.MediaSessionCompat$Token == null) {
                fragmentBuilder_BindOthersTabFragment2.MediaSessionCompat$Token = SSYR2.HORIZONTAL;
            }
            if (fragmentBuilder_BindOthersTabFragment2.MediaSessionCompat$Token == SSYR2.HORIZONTAL) {
                i4 = FragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindOthersTabFragment2, i2);
            } else {
                i4 = FragmentBuilder_BindOnboardingSelectAccountFragment.read(fragmentBuilder_BindOthersTabFragment2, i2);
            }
        }
        if (i2 > i) {
            z = true;
        }
        int i5 = this.write.PlaybackStateCompat;
        long j = this.write.MediaBrowserCompat$ItemReceiver;
        DSYMM dsymm = this.MediaDescriptionCompat;
        if (dsymm.RatingCompat == null) {
            dsymm.RatingCompat = new SSPR(dsymm.MediaBrowserCompat$MediaItem);
        }
        SSPR read2 = dsymm.RatingCompat.IconCompatParcelizer(i3, i4, i5, z).MediaBrowserCompat$ItemReceiver(j);
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            read2.IconCompatParcelizer(this.IconCompatParcelizer);
        } else {
            read2.MediaBrowserCompat$ItemReceiver();
        }
        this.MediaBrowserCompat$ItemReceiver = read2;
    }

    private void MediaDescriptionCompat() {
        int i;
        int i2;
        int i3;
        if (this.write.MediaMetadataCompat) {
            i = this.write.AppCompatDialogFragment;
        } else {
            i = this.write.MediaBrowserCompat$MediaItem;
        }
        if (this.write.MediaMetadataCompat) {
            i2 = this.write.AppCompatActivity;
        } else {
            i2 = this.write.AppCompatDialogFragment;
        }
        FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment = this.write;
        int i4 = 0;
        if (fragmentBuilder_BindOthersTabFragment == null) {
            i3 = 0;
        } else {
            if (fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token == null) {
                fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token = SSYR2.HORIZONTAL;
            }
            if (fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token == SSYR2.HORIZONTAL) {
                i3 = FragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindOthersTabFragment, i);
            } else {
                i3 = FragmentBuilder_BindOnboardingSelectAccountFragment.read(fragmentBuilder_BindOthersTabFragment, i);
            }
        }
        FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment2 = this.write;
        if (fragmentBuilder_BindOthersTabFragment2 != null) {
            if (fragmentBuilder_BindOthersTabFragment2.MediaSessionCompat$Token == null) {
                fragmentBuilder_BindOthersTabFragment2.MediaSessionCompat$Token = SSYR2.HORIZONTAL;
            }
            if (fragmentBuilder_BindOthersTabFragment2.MediaSessionCompat$Token == SSYR2.HORIZONTAL) {
                i4 = FragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindOthersTabFragment2, i2);
            } else {
                i4 = FragmentBuilder_BindOnboardingSelectAccountFragment.read(fragmentBuilder_BindOthersTabFragment2, i2);
            }
        }
        long j = this.write.MediaBrowserCompat$ItemReceiver;
        DSYMM dsymm = this.MediaDescriptionCompat;
        if (dsymm.MediaBrowserCompat$SearchResultReceiver == null) {
            dsymm.MediaBrowserCompat$SearchResultReceiver = new SSYMM(dsymm.MediaBrowserCompat$MediaItem);
        }
        SGBMV MediaBrowserCompat$ItemReceiver2 = dsymm.MediaBrowserCompat$SearchResultReceiver.read(i3, i4).MediaBrowserCompat$ItemReceiver(j);
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer(this.IconCompatParcelizer);
        } else {
            MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver();
        }
        this.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver2;
    }

    private void MediaBrowserCompat$ItemReceiver() {
        int i = this.write.AlertController$RecycleListView;
        int i2 = this.write.AppCompatDelegateImpl$ListMenuDecorView;
        int i3 = this.write.PlaybackStateCompat;
        int i4 = this.write.setContentView;
        long j = this.write.MediaBrowserCompat$ItemReceiver;
        DSYMM dsymm = this.MediaDescriptionCompat;
        if (dsymm.MediaBrowserCompat$CustomActionResultReceiver == null) {
            dsymm.MediaBrowserCompat$CustomActionResultReceiver = new SGEMM(dsymm.MediaBrowserCompat$MediaItem);
        }
        SGBMV MediaBrowserCompat$ItemReceiver2 = dsymm.MediaBrowserCompat$CustomActionResultReceiver.write(i2, i, i3, i4).MediaBrowserCompat$ItemReceiver(j);
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer(this.IconCompatParcelizer);
        } else {
            MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver();
        }
        this.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver2;
    }

    private void MediaBrowserCompat$MediaItem() {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.write.MediaMetadataCompat) {
            i = this.write.AppCompatDialogFragment;
        } else {
            i = this.write.MediaBrowserCompat$MediaItem;
        }
        if (this.write.MediaMetadataCompat) {
            i2 = this.write.AppCompatActivity;
        } else {
            i2 = this.write.AppCompatDialogFragment;
        }
        FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment = this.write;
        boolean z = false;
        if (fragmentBuilder_BindOthersTabFragment == null) {
            i3 = 0;
        } else {
            if (fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token == null) {
                fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token = SSYR2.HORIZONTAL;
            }
            if (fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token == SSYR2.HORIZONTAL) {
                i3 = FragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindOthersTabFragment, i);
            } else {
                i3 = FragmentBuilder_BindOnboardingSelectAccountFragment.read(fragmentBuilder_BindOthersTabFragment, i);
            }
        }
        FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment2 = this.write;
        if (fragmentBuilder_BindOthersTabFragment2 == null) {
            i4 = 0;
        } else {
            if (fragmentBuilder_BindOthersTabFragment2.MediaSessionCompat$Token == null) {
                fragmentBuilder_BindOthersTabFragment2.MediaSessionCompat$Token = SSYR2.HORIZONTAL;
            }
            if (fragmentBuilder_BindOthersTabFragment2.MediaSessionCompat$Token == SSYR2.HORIZONTAL) {
                i4 = FragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindOthersTabFragment2, i2);
            } else {
                i4 = FragmentBuilder_BindOnboardingSelectAccountFragment.read(fragmentBuilder_BindOthersTabFragment2, i2);
            }
        }
        if (i2 > i) {
            z = true;
        }
        int i5 = this.write.PlaybackStateCompat;
        long j = this.write.MediaBrowserCompat$ItemReceiver;
        DSYMM dsymm = this.MediaDescriptionCompat;
        if (dsymm.MediaDescriptionCompat == null) {
            dsymm.MediaDescriptionCompat = new SSYMV(dsymm.MediaBrowserCompat$MediaItem);
        }
        SSPR read2 = dsymm.MediaDescriptionCompat.IconCompatParcelizer(i3, i4, i5, z).MediaBrowserCompat$ItemReceiver(j);
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            read2.IconCompatParcelizer(this.IconCompatParcelizer);
        } else {
            read2.MediaBrowserCompat$ItemReceiver();
        }
        this.MediaBrowserCompat$ItemReceiver = read2;
    }

    private void MediaBrowserCompat$CustomActionResultReceiver() {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.write.MediaMetadataCompat) {
            i = this.write.AppCompatDialogFragment;
        } else {
            i = this.write.MediaBrowserCompat$MediaItem;
        }
        if (this.write.MediaMetadataCompat) {
            i2 = this.write.AppCompatActivity;
        } else {
            i2 = this.write.AppCompatDialogFragment;
        }
        FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment = this.write;
        int i5 = 0;
        if (fragmentBuilder_BindOthersTabFragment == null) {
            i3 = 0;
        } else {
            if (fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token == null) {
                fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token = SSYR2.HORIZONTAL;
            }
            if (fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token == SSYR2.HORIZONTAL) {
                i4 = FragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindOthersTabFragment, i);
            } else {
                i4 = FragmentBuilder_BindOnboardingSelectAccountFragment.read(fragmentBuilder_BindOthersTabFragment, i);
            }
            i3 = i4;
        }
        FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment2 = this.write;
        if (fragmentBuilder_BindOthersTabFragment2 != null) {
            if (fragmentBuilder_BindOthersTabFragment2.MediaSessionCompat$Token == null) {
                fragmentBuilder_BindOthersTabFragment2.MediaSessionCompat$Token = SSYR2.HORIZONTAL;
            }
            if (fragmentBuilder_BindOthersTabFragment2.MediaSessionCompat$Token == SSYR2.HORIZONTAL) {
                i5 = FragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindOthersTabFragment2, i2);
            } else {
                i5 = FragmentBuilder_BindOnboardingSelectAccountFragment.read(fragmentBuilder_BindOthersTabFragment2, i2);
            }
        }
        int i6 = i5;
        int i7 = this.write.Keep;
        int i8 = this.write.MediaSessionCompat$QueueItem;
        FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment3 = this.write;
        if (fragmentBuilder_BindOthersTabFragment3.MediaSessionCompat$Token == null) {
            fragmentBuilder_BindOthersTabFragment3.MediaSessionCompat$Token = SSYR2.HORIZONTAL;
        }
        if (fragmentBuilder_BindOthersTabFragment3.MediaSessionCompat$Token != SSYR2.HORIZONTAL) {
            i7 = i8;
        }
        int i9 = this.write.PlaybackStateCompat;
        long j = this.write.MediaBrowserCompat$ItemReceiver;
        DSYMM dsymm = this.MediaDescriptionCompat;
        if (dsymm.IconCompatParcelizer == null) {
            dsymm.IconCompatParcelizer = new SGEMV(dsymm.MediaBrowserCompat$MediaItem);
        }
        SGEMV write2 = dsymm.IconCompatParcelizer.IconCompatParcelizer(j).write(i3, i6, (i9 * 3) + i7, i9 + i7, i9);
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            write2.IconCompatParcelizer(this.IconCompatParcelizer);
        } else {
            write2.MediaBrowserCompat$ItemReceiver();
        }
        this.MediaBrowserCompat$ItemReceiver = write2;
    }

    private void MediaMetadataCompat() {
        int i;
        int i2;
        int i3;
        if (this.write.MediaMetadataCompat) {
            i = this.write.AppCompatDialogFragment;
        } else {
            i = this.write.MediaBrowserCompat$MediaItem;
        }
        if (this.write.MediaMetadataCompat) {
            i2 = this.write.AppCompatActivity;
        } else {
            i2 = this.write.AppCompatDialogFragment;
        }
        FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment = this.write;
        int i4 = 0;
        if (fragmentBuilder_BindOthersTabFragment == null) {
            i3 = 0;
        } else {
            if (fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token == null) {
                fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token = SSYR2.HORIZONTAL;
            }
            if (fragmentBuilder_BindOthersTabFragment.MediaSessionCompat$Token == SSYR2.HORIZONTAL) {
                i3 = FragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindOthersTabFragment, i);
            } else {
                i3 = FragmentBuilder_BindOnboardingSelectAccountFragment.read(fragmentBuilder_BindOthersTabFragment, i);
            }
        }
        FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment2 = this.write;
        if (fragmentBuilder_BindOthersTabFragment2 != null) {
            if (fragmentBuilder_BindOthersTabFragment2.MediaSessionCompat$Token == null) {
                fragmentBuilder_BindOthersTabFragment2.MediaSessionCompat$Token = SSYR2.HORIZONTAL;
            }
            if (fragmentBuilder_BindOthersTabFragment2.MediaSessionCompat$Token == SSYR2.HORIZONTAL) {
                i4 = FragmentBuilder_BindOnboardingSelectAccountFragment.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindOthersTabFragment2, i2);
            } else {
                i4 = FragmentBuilder_BindOnboardingSelectAccountFragment.read(fragmentBuilder_BindOthersTabFragment2, i2);
            }
        }
        long j = this.write.MediaBrowserCompat$ItemReceiver;
        DSYMM dsymm = this.MediaDescriptionCompat;
        if (dsymm.MediaMetadataCompat == null) {
            dsymm.MediaMetadataCompat = new SSYR(dsymm.MediaBrowserCompat$MediaItem);
        }
        SGBMV MediaBrowserCompat$ItemReceiver2 = dsymm.MediaMetadataCompat.write(i3, i4).MediaBrowserCompat$ItemReceiver(j);
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer(this.IconCompatParcelizer);
        } else {
            MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver();
        }
        this.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver2;
    }

    private void RatingCompat() {
        int i = this.write.AlertController$RecycleListView;
        int i2 = this.write.AppCompatDelegateImpl$ListMenuDecorView;
        int i3 = this.write.PlaybackStateCompat;
        float f = this.write.setHasDecor;
        long j = this.write.MediaBrowserCompat$ItemReceiver;
        DSYMM dsymm = this.MediaDescriptionCompat;
        if (dsymm.read == null) {
            dsymm.read = new SSBMV(dsymm.MediaBrowserCompat$MediaItem);
        }
        SGBMV MediaBrowserCompat$ItemReceiver2 = dsymm.read.MediaBrowserCompat$CustomActionResultReceiver(i2, i, i3, f).MediaBrowserCompat$ItemReceiver(j);
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer(this.IconCompatParcelizer);
        } else {
            MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver();
        }
        this.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver2;
    }
}

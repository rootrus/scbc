package p040o;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.List;
import p040o.onResume;
import p040o.setAccessibilityDelegateCompat;
import p040o.setClipToPadding;
import p040o.setOnCloseListener;

/* renamed from: o.performContextItemSelected */
final class performContextItemSelected<R> implements onResume.read, Runnable, Comparable<performContextItemSelected<?>>, setAccessibilityDelegateCompat.write {
    private final setOnCloseListener.read<performContextItemSelected<?>> ActionMenuItemView;
    MediaDescriptionCompat AlertController$RecycleListView;
    private onCreateOptionsMenu<?> AppCompatActivity;
    private isPostponed AppCompatDelegateImpl$ListMenuDecorView;
    private Object AppCompatDialogFragment;
    private final List<Throwable> AppCompatViewInflater = new ArrayList();
    final peekChildFragmentManager<R> IconCompatParcelizer = new peekChildFragmentManager<>();
    isStateSaved Keep;
    isStateSaved MediaBrowserCompat$CustomActionResultReceiver;
    volatile onResume MediaBrowserCompat$ItemReceiver;
    performCreate MediaBrowserCompat$MediaItem;
    getView MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    hasOptionsMenu f2617x50fd9e4a;
    volatile boolean MediaDescriptionCompat;
    int MediaMetadataCompat;
    int MediaSessionCompat$QueueItem;
    boolean MediaSessionCompat$ResultReceiverWrapper;
    onActivityResult MediaSessionCompat$Token;
    performGetLayoutInflater ParcelableVolumeInfo;
    int PlaybackStateCompat;
    final write PlaybackStateCompat$CustomAction = new write();
    final IconCompatParcelizer RatingCompat;
    C1412x63fe9c89<R> read;
    private volatile boolean setBackgroundResource;
    private final setClipToPadding setCheckable = new setClipToPadding.write();
    private long setChecked;
    private Thread setContentView;
    private C1413xba8287ea setExpandedFormat;
    private isStateSaved setHasDecor;
    final performContextItemSelected$MediaBrowserCompat$ItemReceiver<?> write = new performContextItemSelected$MediaBrowserCompat$ItemReceiver<>();

    /* renamed from: o.performContextItemSelected$IconCompatParcelizer */
    interface IconCompatParcelizer {
        postponeEnterTransition write();
    }

    /* renamed from: o.performContextItemSelected$MediaDescriptionCompat */
    enum MediaDescriptionCompat {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    public final /* synthetic */ int compareTo(Object obj) {
        performContextItemSelected performcontextitemselected = (performContextItemSelected) obj;
        int ordinal = this.f2617x50fd9e4a.ordinal() - performcontextitemselected.f2617x50fd9e4a.ordinal();
        return ordinal == 0 ? this.MediaSessionCompat$QueueItem - performcontextitemselected.MediaSessionCompat$QueueItem : ordinal;
    }

    performContextItemSelected(IconCompatParcelizer iconCompatParcelizer, setOnCloseListener.read<performContextItemSelected<?>> read2) {
        this.RatingCompat = iconCompatParcelizer;
        this.ActionMenuItemView = read2;
    }

    /* access modifiers changed from: package-private */
    public final void write() {
        write write2 = this.PlaybackStateCompat$CustomAction;
        synchronized (write2) {
            write2.MediaBrowserCompat$CustomActionResultReceiver = false;
            write2.read = false;
            write2.MediaBrowserCompat$ItemReceiver = false;
        }
        performContextItemSelected$MediaBrowserCompat$ItemReceiver<?> performcontextitemselected_mediabrowsercompat_itemreceiver = this.write;
        performcontextitemselected_mediabrowsercompat_itemreceiver.IconCompatParcelizer = null;
        performcontextitemselected_mediabrowsercompat_itemreceiver.read = null;
        performcontextitemselected_mediabrowsercompat_itemreceiver.write = null;
        this.IconCompatParcelizer.write();
        this.setBackgroundResource = false;
        this.MediaBrowserCompat$SearchResultReceiver = null;
        this.Keep = null;
        this.MediaSessionCompat$Token = null;
        this.f2617x50fd9e4a = null;
        this.ParcelableVolumeInfo = null;
        this.read = null;
        this.setExpandedFormat = null;
        this.MediaBrowserCompat$ItemReceiver = null;
        this.setContentView = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.AppCompatDialogFragment = null;
        this.AppCompatDelegateImpl$ListMenuDecorView = null;
        this.AppCompatActivity = null;
        this.setChecked = 0;
        this.MediaDescriptionCompat = false;
        this.AppCompatViewInflater.clear();
        this.ActionMenuItemView.MediaBrowserCompat$CustomActionResultReceiver(this);
    }

    public final void run() {
        onCreateOptionsMenu<?> oncreateoptionsmenu = this.AppCompatActivity;
        try {
            if (this.MediaDescriptionCompat) {
                MediaDescriptionCompat();
                if (oncreateoptionsmenu != null) {
                    oncreateoptionsmenu.read();
                    return;
                }
                return;
            }
            int i = C14113.read[this.AlertController$RecycleListView.ordinal()];
            if (i == 1) {
                this.setExpandedFormat = read(C1413xba8287ea.INITIALIZE);
                this.MediaBrowserCompat$ItemReceiver = read();
                MediaMetadataCompat();
            } else if (i == 2) {
                MediaMetadataCompat();
            } else if (i == 3) {
                IconCompatParcelizer();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized run reason: ");
                sb.append(this.AlertController$RecycleListView);
                throw new IllegalStateException(sb.toString());
            }
            if (oncreateoptionsmenu != null) {
                oncreateoptionsmenu.read();
            }
        } catch (onOptionsMenuClosed e) {
            throw e;
        } catch (Throwable th) {
            if (oncreateoptionsmenu != null) {
                oncreateoptionsmenu.read();
            }
            throw th;
        }
    }

    private onResume read() {
        int i = C14113.MediaBrowserCompat$ItemReceiver[this.setExpandedFormat.ordinal()];
        if (i == 1) {
            return new performMultiWindowModeChanged(this.IconCompatParcelizer, this);
        }
        if (i == 2) {
            return new onViewStateRestored(this.IconCompatParcelizer, this);
        }
        if (i == 3) {
            return new performPictureInPictureModeChanged(this.IconCompatParcelizer, this);
        }
        if (i == 4) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unrecognized stage: ");
        sb.append(this.setExpandedFormat);
        throw new IllegalStateException(sb.toString());
    }

    private void MediaMetadataCompat() {
        this.setContentView = Thread.currentThread();
        this.setChecked = AudioAttributesCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        boolean z = false;
        while (!this.MediaDescriptionCompat && this.MediaBrowserCompat$ItemReceiver != null && !(z = this.MediaBrowserCompat$ItemReceiver.write())) {
            this.setExpandedFormat = read(this.setExpandedFormat);
            this.MediaBrowserCompat$ItemReceiver = read();
            if (this.setExpandedFormat == C1413xba8287ea.SOURCE) {
                this.AlertController$RecycleListView = MediaDescriptionCompat.SWITCH_TO_SOURCE_SERVICE;
                this.read.IconCompatParcelizer((performContextItemSelected<?>) this);
                return;
            }
        }
        if ((this.setExpandedFormat == C1413xba8287ea.FINISHED || this.MediaDescriptionCompat) && !z) {
            MediaDescriptionCompat();
        }
    }

    private void MediaDescriptionCompat() {
        MediaBrowserCompat$SearchResultReceiver();
        this.read.IconCompatParcelizer(new GlideException("Failed to load resource", (List<Throwable>) new ArrayList(this.AppCompatViewInflater)));
        if (this.PlaybackStateCompat$CustomAction.write()) {
            write();
        }
    }

    private void MediaBrowserCompat$SearchResultReceiver() {
        Throwable th;
        this.setCheckable.write();
        if (this.setBackgroundResource) {
            if (this.AppCompatViewInflater.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.AppCompatViewInflater;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.setBackgroundResource = true;
    }

    /* access modifiers changed from: package-private */
    public final C1413xba8287ea read(C1413xba8287ea performcontextitemselected_mediabrowsercompat_searchresultreceiver) {
        int i = C14113.MediaBrowserCompat$ItemReceiver[performcontextitemselected_mediabrowsercompat_searchresultreceiver.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.MediaSessionCompat$ResultReceiverWrapper ? C1413xba8287ea.FINISHED : C1413xba8287ea.SOURCE;
            }
            if (i == 3 || i == 4) {
                return C1413xba8287ea.FINISHED;
            }
            if (i != 5) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized stage: ");
                sb.append(performcontextitemselected_mediabrowsercompat_searchresultreceiver);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver()) {
                return C1413xba8287ea.RESOURCE_CACHE;
            } else {
                return read(C1413xba8287ea.RESOURCE_CACHE);
            }
        } else if (this.MediaBrowserCompat$MediaItem.IconCompatParcelizer()) {
            return C1413xba8287ea.DATA_CACHE;
        } else {
            return read(C1413xba8287ea.DATA_CACHE);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.AlertController$RecycleListView = MediaDescriptionCompat.SWITCH_TO_SOURCE_SERVICE;
        this.read.IconCompatParcelizer((performContextItemSelected<?>) this);
    }

    public final void read(isStateSaved isstatesaved, Object obj, onCreateOptionsMenu<?> oncreateoptionsmenu, isPostponed ispostponed, isStateSaved isstatesaved2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = isstatesaved;
        this.AppCompatDialogFragment = obj;
        this.AppCompatActivity = oncreateoptionsmenu;
        this.AppCompatDelegateImpl$ListMenuDecorView = ispostponed;
        this.setHasDecor = isstatesaved2;
        if (Thread.currentThread() != this.setContentView) {
            this.AlertController$RecycleListView = MediaDescriptionCompat.DECODE_DATA;
            this.read.IconCompatParcelizer((performContextItemSelected<?>) this);
            return;
        }
        IconCompatParcelizer();
    }

    public final void write(isStateSaved isstatesaved, Exception exc, onCreateOptionsMenu<?> oncreateoptionsmenu, isPostponed ispostponed) {
        oncreateoptionsmenu.read();
        GlideException glideException = new GlideException("Fetching data failed", (Throwable) exc);
        Class<?> write2 = oncreateoptionsmenu.write();
        glideException.write = isstatesaved;
        glideException.MediaBrowserCompat$CustomActionResultReceiver = ispostponed;
        glideException.read = write2;
        this.AppCompatViewInflater.add(glideException);
        if (Thread.currentThread() != this.setContentView) {
            this.AlertController$RecycleListView = MediaDescriptionCompat.SWITCH_TO_SOURCE_SERVICE;
            this.read.IconCompatParcelizer((performContextItemSelected<?>) this);
            return;
        }
        MediaMetadataCompat();
    }

    private void IconCompatParcelizer() {
        performOptionsMenuClosed<R> performoptionsmenuclosed;
        performContextItemSelected$MediaBrowserCompat$ItemReceiver<?> performcontextitemselected_mediabrowsercompat_itemreceiver;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.setChecked;
            StringBuilder sb = new StringBuilder();
            sb.append("data: ");
            sb.append(this.AppCompatDialogFragment);
            sb.append(", cache key: ");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", fetcher: ");
            sb.append(this.AppCompatActivity);
            write("Retrieved data", j, sb.toString());
        }
        performDestroyView<R> performdestroyview = null;
        try {
            performoptionsmenuclosed = MediaBrowserCompat$ItemReceiver(this.AppCompatActivity, this.AppCompatDialogFragment, this.AppCompatDelegateImpl$ListMenuDecorView);
        } catch (GlideException e) {
            isStateSaved isstatesaved = this.setHasDecor;
            isPostponed ispostponed = this.AppCompatDelegateImpl$ListMenuDecorView;
            e.write = isstatesaved;
            e.MediaBrowserCompat$CustomActionResultReceiver = ispostponed;
            e.read = null;
            this.AppCompatViewInflater.add(e);
            performoptionsmenuclosed = null;
        }
        if (performoptionsmenuclosed != null) {
            isPostponed ispostponed2 = this.AppCompatDelegateImpl$ListMenuDecorView;
            if (performoptionsmenuclosed instanceof performDestroy) {
                ((performDestroy) performoptionsmenuclosed).MediaBrowserCompat$ItemReceiver();
            }
            boolean z = true;
            if (this.write.write != null) {
                performdestroyview = performDestroyView.read(performoptionsmenuclosed);
                performoptionsmenuclosed = performdestroyview;
            }
            MediaBrowserCompat$SearchResultReceiver();
            this.read.IconCompatParcelizer(performoptionsmenuclosed, ispostponed2);
            this.setExpandedFormat = C1413xba8287ea.ENCODE;
            try {
                if (this.write.write == null) {
                    z = false;
                }
                if (z) {
                    performcontextitemselected_mediabrowsercompat_itemreceiver = this.write;
                    this.RatingCompat.write().write(performcontextitemselected_mediabrowsercompat_itemreceiver.IconCompatParcelizer, new onViewCreated(performcontextitemselected_mediabrowsercompat_itemreceiver.read, performcontextitemselected_mediabrowsercompat_itemreceiver.write, this.MediaSessionCompat$Token));
                    performcontextitemselected_mediabrowsercompat_itemreceiver.write.RatingCompat();
                }
                if (performdestroyview != null) {
                    performdestroyview.RatingCompat();
                }
                if (this.PlaybackStateCompat$CustomAction.read()) {
                    write();
                }
            } catch (Throwable th) {
                if (performdestroyview != null) {
                    performdestroyview.RatingCompat();
                }
                throw th;
            }
        } else {
            MediaMetadataCompat();
        }
    }

    private <Data> performOptionsMenuClosed<R> MediaBrowserCompat$ItemReceiver(onCreateOptionsMenu<?> oncreateoptionsmenu, Data data, isPostponed ispostponed) throws GlideException {
        if (data == null) {
            oncreateoptionsmenu.read();
            return null;
        }
        try {
            long MediaBrowserCompat$ItemReceiver2 = AudioAttributesCompatParcelizer.MediaBrowserCompat$ItemReceiver();
            peekChildFragmentManager<R> peekchildfragmentmanager = this.IconCompatParcelizer;
            performOptionsMenuClosed<R> IconCompatParcelizer2 = IconCompatParcelizer(data, ispostponed, peekchildfragmentmanager.write.MediaMetadataCompat.read(data.getClass(), peekchildfragmentmanager.MediaBrowserCompat$SearchResultReceiver, peekchildfragmentmanager.ParcelableVolumeInfo));
            if (Log.isLoggable("DecodeJob", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Decoded result ");
                sb.append(IconCompatParcelizer2);
                write(sb.toString(), MediaBrowserCompat$ItemReceiver2, (String) null);
            }
            return IconCompatParcelizer2;
        } finally {
            oncreateoptionsmenu.read();
        }
    }

    private void write(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(AudioAttributesCompatParcelizer.write(j));
        sb.append(", load key: ");
        sb.append(this.ParcelableVolumeInfo);
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(", ");
            sb2.append(str2);
            str3 = sb2.toString();
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    public final setClipToPadding MediaBrowserCompat$ItemReceiver() {
        return this.setCheckable;
    }

    /* renamed from: o.performContextItemSelected$3 */
    static /* synthetic */ class C14113 {
        static final /* synthetic */ int[] MediaBrowserCompat$CustomActionResultReceiver;
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;
        static final /* synthetic */ int[] read;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                o.isRemoving[] r0 = p040o.isRemoving.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$CustomActionResultReceiver = r0
                r1 = 1
                o.isRemoving r2 = p040o.isRemoving.SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.isRemoving r3 = p040o.isRemoving.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                o.performContextItemSelected$MediaBrowserCompat$SearchResultReceiver[] r2 = p040o.C1413xba8287ea.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                MediaBrowserCompat$ItemReceiver = r2
                o.performContextItemSelected$MediaBrowserCompat$SearchResultReceiver r3 = p040o.C1413xba8287ea.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0038 }
                o.performContextItemSelected$MediaBrowserCompat$SearchResultReceiver r3 = p040o.C1413xba8287ea.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0043 }
                o.performContextItemSelected$MediaBrowserCompat$SearchResultReceiver r4 = p040o.C1413xba8287ea.SOURCE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x004e }
                o.performContextItemSelected$MediaBrowserCompat$SearchResultReceiver r4 = p040o.C1413xba8287ea.FINISHED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0059 }
                o.performContextItemSelected$MediaBrowserCompat$SearchResultReceiver r4 = p040o.C1413xba8287ea.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                o.performContextItemSelected$MediaDescriptionCompat[] r3 = p040o.performContextItemSelected.MediaDescriptionCompat.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                read = r3
                o.performContextItemSelected$MediaDescriptionCompat r4 = p040o.performContextItemSelected.MediaDescriptionCompat.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x006a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = read     // Catch:{ NoSuchFieldError -> 0x0074 }
                o.performContextItemSelected$MediaDescriptionCompat r3 = p040o.performContextItemSelected.MediaDescriptionCompat.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x007e }
                o.performContextItemSelected$MediaDescriptionCompat r1 = p040o.performContextItemSelected.MediaDescriptionCompat.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.performContextItemSelected.C14113.<clinit>():void");
        }
    }

    /* renamed from: o.performContextItemSelected$read */
    final class read<Z> implements performCreateView$MediaBrowserCompat$CustomActionResultReceiver<Z> {
        private final isPostponed write;

        read(isPostponed ispostponed) {
            this.write = ispostponed;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: o.performActivityCreated} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: o.performOptionsItemSelected} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: o.performOptionsItemSelected} */
        /* JADX WARNING: type inference failed for: r1v4, types: [o.isStateSaved] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p040o.performOptionsMenuClosed<Z> read(p040o.performOptionsMenuClosed<Z> r14) {
            /*
                r13 = this;
                o.performContextItemSelected r0 = p040o.performContextItemSelected.this
                o.isPostponed r1 = r13.write
                java.lang.Object r2 = r14.write()
                java.lang.Class r10 = r2.getClass()
                o.isPostponed r2 = p040o.isPostponed.RESOURCE_DISK_CACHE
                r3 = 0
                if (r1 == r2) goto L_0x0024
                o.peekChildFragmentManager<R> r2 = r0.IconCompatParcelizer
                o.onCreateAnimation r2 = r2.MediaBrowserCompat$ItemReceiver(r10)
                o.getView r4 = r0.MediaBrowserCompat$SearchResultReceiver
                int r5 = r0.PlaybackStateCompat
                int r6 = r0.MediaMetadataCompat
                o.performOptionsMenuClosed r4 = r2.MediaBrowserCompat$ItemReceiver(r4, r14, r5, r6)
                r9 = r2
                r2 = r4
                goto L_0x0026
            L_0x0024:
                r2 = r14
                r9 = r3
            L_0x0026:
                boolean r4 = r14.equals(r2)
                if (r4 != 0) goto L_0x002f
                r14.MediaBrowserCompat$CustomActionResultReceiver()
            L_0x002f:
                o.peekChildFragmentManager<R> r14 = r0.IconCompatParcelizer
                o.getView r14 = r14.write
                com.bumptech.glide.Registry r14 = r14.MediaMetadataCompat
                o.cancelLoad r14 = r14.MediaBrowserCompat$MediaItem
                java.lang.Class r4 = r2.IconCompatParcelizer()
                o.onContextItemSelected r14 = r14.MediaBrowserCompat$ItemReceiver(r4)
                r4 = 0
                r5 = 1
                if (r14 == 0) goto L_0x0045
                r14 = r5
                goto L_0x0046
            L_0x0045:
                r14 = r4
            L_0x0046:
                if (r14 == 0) goto L_0x006b
                o.peekChildFragmentManager<R> r14 = r0.IconCompatParcelizer
                o.getView r14 = r14.write
                com.bumptech.glide.Registry r14 = r14.MediaMetadataCompat
                o.cancelLoad r14 = r14.MediaBrowserCompat$MediaItem
                java.lang.Class r3 = r2.IconCompatParcelizer()
                o.onContextItemSelected r3 = r14.MediaBrowserCompat$ItemReceiver(r3)
                if (r3 == 0) goto L_0x0061
                o.onActivityResult r14 = r0.MediaSessionCompat$Token
                o.isRemoving r14 = r3.IconCompatParcelizer(r14)
                goto L_0x006d
            L_0x0061:
                com.bumptech.glide.Registry$NoResultEncoderAvailableException r14 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
                java.lang.Class r0 = r2.IconCompatParcelizer()
                r14.<init>(r0)
                throw r14
            L_0x006b:
                o.isRemoving r14 = p040o.isRemoving.NONE
            L_0x006d:
                r12 = r3
                o.peekChildFragmentManager<R> r3 = r0.IconCompatParcelizer
                o.isStateSaved r6 = r0.MediaBrowserCompat$CustomActionResultReceiver
                java.util.List r3 = r3.IconCompatParcelizer()
                int r7 = r3.size()
                r8 = r4
            L_0x007b:
                if (r8 >= r7) goto L_0x0090
                java.lang.Object r11 = r3.get(r8)
                o.setSharedElementEnterTransition$MediaBrowserCompat$CustomActionResultReceiver r11 = (p040o.C1536x6a517a85) r11
                o.isStateSaved r11 = r11.read
                boolean r11 = r11.equals(r6)
                if (r11 == 0) goto L_0x008d
                r4 = r5
                goto L_0x0090
            L_0x008d:
                int r8 = r8 + 1
                goto L_0x007b
            L_0x0090:
                o.performCreate r3 = r0.MediaBrowserCompat$MediaItem
                r4 = r4 ^ r5
                boolean r1 = r3.IconCompatParcelizer(r4, r1, r14)
                if (r1 == 0) goto L_0x00fa
                if (r12 == 0) goto L_0x00ec
                int[] r1 = p040o.performContextItemSelected.C14113.MediaBrowserCompat$CustomActionResultReceiver
                int r3 = r14.ordinal()
                r1 = r1[r3]
                if (r1 == r5) goto L_0x00d6
                r3 = 2
                if (r1 != r3) goto L_0x00bf
                o.peekChildFragmentManager<R> r14 = r0.IconCompatParcelizer
                o.performOptionsItemSelected r1 = new o.performOptionsItemSelected
                o.getView r14 = r14.write
                o.CheckParameters$CheckCountry r4 = r14.write
                o.isStateSaved r5 = r0.MediaBrowserCompat$CustomActionResultReceiver
                o.isStateSaved r6 = r0.Keep
                int r7 = r0.PlaybackStateCompat
                int r8 = r0.MediaMetadataCompat
                o.onActivityResult r11 = r0.MediaSessionCompat$Token
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                goto L_0x00df
            L_0x00bf:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unknown strategy: "
                r0.append(r1)
                r0.append(r14)
                java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r14.<init>(r0)
                throw r14
            L_0x00d6:
                o.performActivityCreated r1 = new o.performActivityCreated
                o.isStateSaved r14 = r0.MediaBrowserCompat$CustomActionResultReceiver
                o.isStateSaved r3 = r0.Keep
                r1.<init>(r14, r3)
            L_0x00df:
                o.performDestroyView r2 = p040o.performDestroyView.read(r2)
                o.performContextItemSelected$MediaBrowserCompat$ItemReceiver<?> r14 = r0.write
                r14.IconCompatParcelizer = r1
                r14.read = r12
                r14.write = r2
                goto L_0x00fa
            L_0x00ec:
                com.bumptech.glide.Registry$NoResultEncoderAvailableException r14 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
                java.lang.Object r0 = r2.write()
                java.lang.Class r0 = r0.getClass()
                r14.<init>(r0)
                throw r14
            L_0x00fa:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.performContextItemSelected.read.read(o.performOptionsMenuClosed):o.performOptionsMenuClosed");
        }
    }

    /* renamed from: o.performContextItemSelected$write */
    static class write {
        boolean MediaBrowserCompat$CustomActionResultReceiver;
        boolean MediaBrowserCompat$ItemReceiver;
        boolean read;

        write() {
        }

        /* access modifiers changed from: package-private */
        public final boolean IconCompatParcelizer(boolean z) {
            boolean write;
            synchronized (this) {
                this.read = true;
                write = write(false);
            }
            return write;
        }

        /* access modifiers changed from: package-private */
        public final boolean read() {
            boolean write;
            synchronized (this) {
                this.MediaBrowserCompat$CustomActionResultReceiver = true;
                write = write(false);
            }
            return write;
        }

        /* access modifiers changed from: package-private */
        public final boolean write() {
            boolean write;
            synchronized (this) {
                this.MediaBrowserCompat$ItemReceiver = true;
                write = write(false);
            }
            return write;
        }

        private boolean write(boolean z) {
            return (this.MediaBrowserCompat$ItemReceiver || z || this.MediaBrowserCompat$CustomActionResultReceiver) && this.read;
        }
    }

    private <Data, ResourceType> performOptionsMenuClosed<R> IconCompatParcelizer(Data data, isPostponed ispostponed, performLowMemory<Data, ResourceType, R> performlowmemory) throws GlideException {
        onActivityResult onactivityresult = this.MediaSessionCompat$Token;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = ispostponed == isPostponed.RESOURCE_DISK_CACHE || this.IconCompatParcelizer.IconCompatParcelizer;
            noteStateNotSaved<Boolean> notestatenotsaved = onMenuItemSelected.MediaBrowserCompat$CustomActionResultReceiver;
            Boolean bool = (Boolean) (onactivityresult.MediaBrowserCompat$CustomActionResultReceiver.containsKey(notestatenotsaved) ? onactivityresult.MediaBrowserCompat$CustomActionResultReceiver.get(notestatenotsaved) : notestatenotsaved.read);
            if (bool == null || (bool.booleanValue() && !z)) {
                onactivityresult = new onActivityResult();
                onactivityresult.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver);
                onactivityresult.MediaBrowserCompat$CustomActionResultReceiver.put(onMenuItemSelected.MediaBrowserCompat$CustomActionResultReceiver, Boolean.valueOf(z));
            }
        }
        onActivityResult onactivityresult2 = onactivityresult;
        onCreateContextMenu write2 = this.MediaBrowserCompat$SearchResultReceiver.MediaMetadataCompat.read.write(data);
        try {
            return performlowmemory.write(write2, onactivityresult2, this.PlaybackStateCompat, this.MediaMetadataCompat, new read(ispostponed));
        } finally {
            write2.IconCompatParcelizer();
        }
    }
}

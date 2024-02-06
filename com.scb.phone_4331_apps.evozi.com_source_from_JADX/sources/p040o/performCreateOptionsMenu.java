package p040o;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.performContextItemSelected;
import p040o.performDetach;
import p040o.setOnCloseListener;
import p040o.setPaddingRelative;

/* renamed from: o.performCreateOptionsMenu */
public final class performCreateOptionsMenu implements injectRttiCheckDeserializer, restoreChildFragmentState$MediaBrowserCompat$ItemReceiver, performDetach.write {
    private static final boolean read = Log.isLoggable("Engine", 2);
    private final performCreateOptionsMenu$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
    private final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    private final restoreChildFragmentState MediaBrowserCompat$ItemReceiver;
    private final read MediaBrowserCompat$MediaItem;
    private final setQuery MediaBrowserCompat$SearchResultReceiver;
    private final performPause MediaMetadataCompat;
    private final onPause write;

    public performCreateOptionsMenu(restoreChildFragmentState restorechildfragmentstate, C1421x860ecb24 postponeentertransition_mediabrowsercompat_customactionresultreceiver, setAnimatingAway setanimatingaway, setAnimatingAway setanimatingaway2, setAnimatingAway setanimatingaway3, setAnimatingAway setanimatingaway4, boolean z) {
        this(restorechildfragmentstate, postponeentertransition_mediabrowsercompat_customactionresultreceiver, setanimatingaway, setanimatingaway2, setanimatingaway3, setanimatingaway4, false, (byte) 0);
    }

    private performCreateOptionsMenu(restoreChildFragmentState restorechildfragmentstate, C1421x860ecb24 postponeentertransition_mediabrowsercompat_customactionresultreceiver, setAnimatingAway setanimatingaway, setAnimatingAway setanimatingaway2, setAnimatingAway setanimatingaway3, setAnimatingAway setanimatingaway4, boolean z, byte b) {
        this.MediaBrowserCompat$ItemReceiver = restorechildfragmentstate;
        this.MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer(postponeentertransition_mediabrowsercompat_customactionresultreceiver);
        onPause onpause = new onPause(z);
        this.write = onpause;
        synchronized (this) {
            synchronized (onpause) {
                onpause.MediaBrowserCompat$ItemReceiver = this;
            }
        }
        this.MediaBrowserCompat$SearchResultReceiver = new setQuery();
        this.MediaBrowserCompat$MediaItem = new read(setanimatingaway, setanimatingaway2, setanimatingaway3, setanimatingaway4, this, this);
        this.IconCompatParcelizer = new performCreateOptionsMenu$MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaMetadataCompat = new performPause();
        restorechildfragmentstate.MediaBrowserCompat$ItemReceiver(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004d A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> p040o.performCreateOptionsMenu.write MediaBrowserCompat$CustomActionResultReceiver(p040o.getView r25, java.lang.Object r26, p040o.isStateSaved r27, int r28, int r29, java.lang.Class<?> r30, java.lang.Class<R> r31, p040o.hasOptionsMenu r32, p040o.performCreate r33, java.util.Map<java.lang.Class<?>, p040o.onCreateAnimation<?>> r34, boolean r35, boolean r36, p040o.onActivityResult r37, boolean r38, boolean r39, boolean r40, boolean r41, p040o.KtaJsonCheck r42, java.util.concurrent.Executor r43) {
        /*
            r24 = this;
            r15 = r24
            boolean r0 = read
            if (r0 == 0) goto L_0x000b
            long r0 = p040o.AudioAttributesCompatParcelizer.MediaBrowserCompat$ItemReceiver()
            goto L_0x000d
        L_0x000b:
            r0 = 0
        L_0x000d:
            r13 = r0
            o.performGetLayoutInflater r12 = new o.performGetLayoutInflater
            r0 = r12
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r34
            r6 = r30
            r7 = r31
            r8 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            monitor-enter(r24)
            r0 = 0
            if (r38 == 0) goto L_0x004a
            o.performDetach r1 = r15.read((p040o.isStateSaved) r12)     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0038
            boolean r2 = read     // Catch:{ all -> 0x0048 }
            if (r2 == 0) goto L_0x004b
            java.lang.String r2 = "Loaded resource from active resources"
            MediaBrowserCompat$CustomActionResultReceiver(r2, r13, r12)     // Catch:{ all -> 0x0048 }
            goto L_0x004b
        L_0x0038:
            o.performDetach r1 = r15.MediaBrowserCompat$ItemReceiver(r12)     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x004a
            boolean r2 = read     // Catch:{ all -> 0x0048 }
            if (r2 == 0) goto L_0x004b
            java.lang.String r2 = "Loaded resource from cache"
            MediaBrowserCompat$CustomActionResultReceiver(r2, r13, r12)     // Catch:{ all -> 0x0048 }
            goto L_0x004b
        L_0x0048:
            r0 = move-exception
            goto L_0x0080
        L_0x004a:
            r1 = r0
        L_0x004b:
            if (r1 != 0) goto L_0x0082
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r33
            r11 = r34
            r0 = r12
            r12 = r35
            r22 = r13
            r13 = r36
            r14 = r37
            r15 = r38
            r16 = r39
            r17 = r40
            r18 = r41
            r19 = r42
            r20 = r43
            r21 = r0
            o.performCreateOptionsMenu$write r0 = r1.MediaBrowserCompat$CustomActionResultReceiver(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0048 }
            monitor-exit(r24)     // Catch:{ all -> 0x0048 }
            return r0
        L_0x0080:
            monitor-exit(r24)
            throw r0
        L_0x0082:
            monitor-exit(r24)
            o.isPostponed r2 = p040o.isPostponed.MEMORY_CACHE
            r3 = r42
            r3.read(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.performCreateOptionsMenu.MediaBrowserCompat$CustomActionResultReceiver(o.getView, java.lang.Object, o.isStateSaved, int, int, java.lang.Class, java.lang.Class, o.hasOptionsMenu, o.performCreate, java.util.Map, boolean, boolean, o.onActivityResult, boolean, boolean, boolean, boolean, o.KtaJsonCheck, java.util.concurrent.Executor):o.performCreateOptionsMenu$write");
    }

    private <R> write MediaBrowserCompat$CustomActionResultReceiver(getView getview, Object obj, isStateSaved isstatesaved, int i, int i2, Class<?> cls, Class<R> cls2, hasOptionsMenu hasoptionsmenu, performCreate performcreate, Map<Class<?>, onCreateAnimation<?>> map, boolean z, boolean z2, onActivityResult onactivityresult, boolean z3, boolean z4, boolean z5, boolean z6, KtaJsonCheck ktaJsonCheck, Executor executor, performGetLayoutInflater performgetlayoutinflater, long j) {
        Map<isStateSaved, performConfigurationChanged<?>> map2;
        Map<isStateSaved, performConfigurationChanged<?>> map3;
        getView getview2 = getview;
        isStateSaved isstatesaved2 = isstatesaved;
        int i3 = i;
        int i4 = i2;
        hasOptionsMenu hasoptionsmenu2 = hasoptionsmenu;
        performCreate performcreate2 = performcreate;
        onActivityResult onactivityresult2 = onactivityresult;
        boolean z7 = z6;
        KtaJsonCheck ktaJsonCheck2 = ktaJsonCheck;
        Executor executor2 = executor;
        performGetLayoutInflater performgetlayoutinflater2 = performgetlayoutinflater;
        long j2 = j;
        setQuery setquery = this.MediaBrowserCompat$SearchResultReceiver;
        if (z7) {
            map2 = setquery.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            map2 = setquery.IconCompatParcelizer;
        }
        performConfigurationChanged performconfigurationchanged = map2.get(performgetlayoutinflater2);
        if (performconfigurationchanged != null) {
            performconfigurationchanged.MediaBrowserCompat$ItemReceiver(ktaJsonCheck2, executor2);
            if (read) {
                MediaBrowserCompat$CustomActionResultReceiver("Added to existing load", j2, performgetlayoutinflater2);
            }
            return new write(ktaJsonCheck2, performconfigurationchanged);
        }
        performConfigurationChanged read2 = this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver.read();
        if (read2 != null) {
            performGetLayoutInflater performgetlayoutinflater3 = performgetlayoutinflater2;
            performConfigurationChanged read3 = read2.read(performgetlayoutinflater, z3, z4, z5, z6);
            performCreateOptionsMenu$MediaBrowserCompat$ItemReceiver performcreateoptionsmenu_mediabrowsercompat_itemreceiver = this.IconCompatParcelizer;
            performContextItemSelected<R> read4 = performcreateoptionsmenu_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver.read();
            if (read4 != null) {
                performContextItemSelected<R> performcontextitemselected = read4;
                int i5 = performcreateoptionsmenu_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
                performcreateoptionsmenu_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver = i5 + 1;
                peekChildFragmentManager<R> peekchildfragmentmanager = performcontextitemselected.IconCompatParcelizer;
                performContextItemSelected.IconCompatParcelizer iconCompatParcelizer = performcontextitemselected.RatingCompat;
                peekchildfragmentmanager.write = getview2;
                peekchildfragmentmanager.MediaMetadataCompat = obj;
                peekchildfragmentmanager.f2615x50fd9e4a = isstatesaved2;
                peekchildfragmentmanager.MediaSessionCompat$Token = i3;
                peekchildfragmentmanager.MediaBrowserCompat$CustomActionResultReceiver = i4;
                peekchildfragmentmanager.read = performcreate2;
                peekchildfragmentmanager.MediaBrowserCompat$SearchResultReceiver = cls;
                peekchildfragmentmanager.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
                peekchildfragmentmanager.ParcelableVolumeInfo = cls2;
                peekchildfragmentmanager.RatingCompat = hasoptionsmenu2;
                peekchildfragmentmanager.MediaDescriptionCompat = onactivityresult2;
                peekchildfragmentmanager.MediaSessionCompat$ResultReceiverWrapper = map;
                peekchildfragmentmanager.MediaBrowserCompat$MediaItem = z;
                peekchildfragmentmanager.IconCompatParcelizer = z2;
                performcontextitemselected.MediaBrowserCompat$SearchResultReceiver = getview2;
                performcontextitemselected.Keep = isstatesaved2;
                performcontextitemselected.f2617x50fd9e4a = hasoptionsmenu2;
                performcontextitemselected.ParcelableVolumeInfo = performgetlayoutinflater3;
                performcontextitemselected.PlaybackStateCompat = i3;
                performcontextitemselected.MediaMetadataCompat = i4;
                performcontextitemselected.MediaBrowserCompat$MediaItem = performcreate2;
                performcontextitemselected.MediaSessionCompat$ResultReceiverWrapper = z7;
                performcontextitemselected.MediaSessionCompat$Token = onactivityresult2;
                performcontextitemselected.read = read3;
                performcontextitemselected.MediaSessionCompat$QueueItem = i5;
                performcontextitemselected.AlertController$RecycleListView = performContextItemSelected.MediaDescriptionCompat.INITIALIZE;
                setQuery setquery2 = this.MediaBrowserCompat$SearchResultReceiver;
                if (read3.RatingCompat) {
                    map3 = setquery2.MediaBrowserCompat$CustomActionResultReceiver;
                } else {
                    map3 = setquery2.IconCompatParcelizer;
                }
                map3.put(performgetlayoutinflater3, read3);
                KtaJsonCheck ktaJsonCheck3 = ktaJsonCheck;
                performGetLayoutInflater performgetlayoutinflater4 = performgetlayoutinflater3;
                read3.MediaBrowserCompat$ItemReceiver(ktaJsonCheck3, executor);
                synchronized (read3) {
                    read3.IconCompatParcelizer = performcontextitemselected;
                    C1413xba8287ea read5 = performcontextitemselected.read(C1413xba8287ea.INITIALIZE);
                    (read5 == C1413xba8287ea.RESOURCE_CACHE || read5 == C1413xba8287ea.DATA_CACHE ? read3.MediaBrowserCompat$CustomActionResultReceiver : read3.IconCompatParcelizer()).execute(performcontextitemselected);
                }
                if (read) {
                    MediaBrowserCompat$CustomActionResultReceiver("Started new load", j, performgetlayoutinflater4);
                }
                return new write(ktaJsonCheck3, read3);
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(String str, long j, isStateSaved isstatesaved) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(AudioAttributesCompatParcelizer.write(j));
        sb.append("ms, key: ");
        sb.append(isstatesaved);
        Log.v("Engine", sb.toString());
    }

    private performDetach<?> read(isStateSaved isstatesaved) {
        performDetach<?> MediaBrowserCompat$CustomActionResultReceiver2 = this.write.MediaBrowserCompat$CustomActionResultReceiver(isstatesaved);
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver();
        }
        return MediaBrowserCompat$CustomActionResultReceiver2;
    }

    public static void read(performOptionsMenuClosed<?> performoptionsmenuclosed) {
        if (performoptionsmenuclosed instanceof performDetach) {
            ((performDetach) performoptionsmenuclosed).MediaMetadataCompat();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    public final void read(performConfigurationChanged<?> performconfigurationchanged, isStateSaved isstatesaved) {
        synchronized (this) {
            this.MediaBrowserCompat$SearchResultReceiver.write(isstatesaved, performconfigurationchanged);
        }
    }

    public final void IconCompatParcelizer(performOptionsMenuClosed<?> performoptionsmenuclosed) {
        this.MediaMetadataCompat.IconCompatParcelizer(performoptionsmenuclosed);
    }

    public final void MediaBrowserCompat$ItemReceiver(isStateSaved isstatesaved, performDetach<?> performdetach) {
        onPause onpause = this.write;
        synchronized (onpause) {
            onPause$MediaBrowserCompat$CustomActionResultReceiver remove = onpause.MediaBrowserCompat$CustomActionResultReceiver.remove(isstatesaved);
            if (remove != null) {
                remove.IconCompatParcelizer = null;
                remove.clear();
            }
        }
        if (performdetach.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(isstatesaved, performdetach);
        } else {
            this.MediaMetadataCompat.IconCompatParcelizer(performdetach);
        }
    }

    /* renamed from: o.performCreateOptionsMenu$write */
    public class write {
        public final performConfigurationChanged<?> IconCompatParcelizer;
        public final KtaJsonCheck read;

        write(KtaJsonCheck ktaJsonCheck, performConfigurationChanged<?> performconfigurationchanged) {
            this.read = ktaJsonCheck;
            this.IconCompatParcelizer = performconfigurationchanged;
        }
    }

    /* renamed from: o.performCreateOptionsMenu$IconCompatParcelizer */
    static class IconCompatParcelizer implements performContextItemSelected.IconCompatParcelizer {
        private final C1421x860ecb24 MediaBrowserCompat$CustomActionResultReceiver;
        private volatile postponeEnterTransition write;

        IconCompatParcelizer(C1421x860ecb24 postponeentertransition_mediabrowsercompat_customactionresultreceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = postponeentertransition_mediabrowsercompat_customactionresultreceiver;
        }

        public final postponeEnterTransition write() {
            if (this.write == null) {
                synchronized (this) {
                    if (this.write == null) {
                        this.write = this.MediaBrowserCompat$CustomActionResultReceiver.write();
                    }
                    if (this.write == null) {
                        this.write = new setPaddingRelative.write();
                    }
                }
            }
            return this.write;
        }
    }

    /* renamed from: o.performCreateOptionsMenu$read */
    static class read {
        final setAnimatingAway IconCompatParcelizer;
        final setOnCloseListener.read<performConfigurationChanged<?>> MediaBrowserCompat$CustomActionResultReceiver = setAccessibilityDelegateCompat.MediaBrowserCompat$ItemReceiver(CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA, new C1446x798357e0<performConfigurationChanged<?>>() {
            public final /* synthetic */ Object read() {
                return new performConfigurationChanged(read.this.IconCompatParcelizer, read.this.MediaBrowserCompat$MediaItem, read.this.MediaMetadataCompat, read.this.MediaBrowserCompat$ItemReceiver, read.this.write, read.this.read, read.this.MediaBrowserCompat$CustomActionResultReceiver);
            }
        });
        final setAnimatingAway MediaBrowserCompat$ItemReceiver;
        final setAnimatingAway MediaBrowserCompat$MediaItem;
        final setAnimatingAway MediaMetadataCompat;
        final performDetach.write read;
        final injectRttiCheckDeserializer write;

        read(setAnimatingAway setanimatingaway, setAnimatingAway setanimatingaway2, setAnimatingAway setanimatingaway3, setAnimatingAway setanimatingaway4, injectRttiCheckDeserializer injectrtticheckdeserializer, performDetach.write write2) {
            this.IconCompatParcelizer = setanimatingaway;
            this.MediaBrowserCompat$MediaItem = setanimatingaway2;
            this.MediaMetadataCompat = setanimatingaway3;
            this.MediaBrowserCompat$ItemReceiver = setanimatingaway4;
            this.write = injectrtticheckdeserializer;
            this.read = write2;
        }
    }

    private performDetach<?> MediaBrowserCompat$ItemReceiver(isStateSaved isstatesaved) {
        performDetach<?> performdetach;
        performOptionsMenuClosed<?> IconCompatParcelizer2 = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(isstatesaved);
        if (IconCompatParcelizer2 == null) {
            performdetach = null;
        } else if (IconCompatParcelizer2 instanceof performDetach) {
            performdetach = (performDetach) IconCompatParcelizer2;
        } else {
            performdetach = new performDetach<>(IconCompatParcelizer2, true, true, isstatesaved, this);
        }
        if (performdetach != null) {
            performdetach.MediaBrowserCompat$ItemReceiver();
            this.write.read(isstatesaved, performdetach);
        }
        return performdetach;
    }

    public final void MediaBrowserCompat$ItemReceiver(performConfigurationChanged<?> performconfigurationchanged, isStateSaved isstatesaved, performDetach<?> performdetach) {
        synchronized (this) {
            if (performdetach != null) {
                if (performdetach.MediaBrowserCompat$CustomActionResultReceiver) {
                    this.write.read(isstatesaved, performdetach);
                }
            }
            this.MediaBrowserCompat$SearchResultReceiver.write(isstatesaved, performconfigurationchanged);
        }
    }
}

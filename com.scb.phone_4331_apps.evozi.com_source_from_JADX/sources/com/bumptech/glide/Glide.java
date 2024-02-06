package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p040o.C1538x3679a2de;
import p040o.C1591xfee12cfc;
import p040o.C1597xcf73814e;
import p040o.CheckParameters;
import p040o.CheckParameters_MembersInjector;
import p040o.CompositeGeneratedAdaptersObserver;
import p040o.ConstraintHelper;
import p040o.Fragment$InstantiationException;
import p040o.FullLifecycleObserverAdapter;
import p040o.LinearLayoutManager;
import p040o.SingleGeneratedAdapterObserver;
import p040o.allocateRequestIndex;
import p040o.cancelLoadInBackground;
import p040o.completeWakefulIntent;
import p040o.deliverCancellation;
import p040o.dispatchFragmentsOnCreateView;
import p040o.findFragmentById;
import p040o.findFragmentByTag;
import p040o.getAllowReturnTransitionOverlap;
import p040o.getSupportFragmentManager;
import p040o.getUsable;
import p040o.getUserVisibleHint;
import p040o.getView;
import p040o.hashCode;
import p040o.initState;
import p040o.isHidden;
import p040o.isHideReplaced;
import p040o.isLoadInBackgroundCanceled;
import p040o.isReset;
import p040o.isVisible;
import p040o.markFragmentsCreated;
import p040o.markState;
import p040o.onAbandon;
import p040o.onBackPressed;
import p040o.onDestroyView;
import p040o.onMenuItemSelected;
import p040o.onMultiWindowModeChanged;
import p040o.onRetainNonConfigurationInstance;
import p040o.performCreateOptionsMenu;
import p040o.registerForContextMenu;
import p040o.requireActivity;
import p040o.restoreChildFragmentState;
import p040o.restoreViewState;
import p040o.setAlignmentMode;
import p040o.setAllowEnterTransitionOverlap;
import p040o.setAllowReturnTransitionOverlap;
import p040o.setAnimatingAway;
import p040o.setArguments;
import p040o.setColumnCount;
import p040o.setColumnOrderPreserved;
import p040o.setEnterTransition$MediaBrowserCompat$ItemReceiver;
import p040o.setExitSharedElementCallback$MediaBrowserCompat$ItemReceiver;
import p040o.setExitTransition;
import p040o.setExitTransition$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setHasOptionsMenu;
import p040o.setHideReplaced;
import p040o.setInitialSavedState;
import p040o.setNextTransition;
import p040o.setPaddingRelative;
import p040o.setSharedElementReturnTransition;
import p040o.setStateAfterAnimating;
import p040o.setTargetFragment;
import p040o.setTargetFragment$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setTargetFragment$MediaBrowserCompat$ItemReceiver;
import p040o.setUpdateThrottle;
import p040o.setUseDefaultMargins;
import p040o.setUserVisibleHint;
import p040o.setupDialog;
import p040o.startActivity$MediaBrowserCompat$ItemReceiver;
import p040o.startActivityForResult;
import p040o.startActivityFromFragment;
import p040o.startIntentSenderForResult;
import p040o.startIntentSenderForResult$MediaBrowserCompat$ItemReceiver;
import p040o.startIntentSenderFromFragment;
import p040o.startPostponedEnterTransition;
import p040o.startWakefulService;
import p040o.superDispatchKeyEvent;
import p040o.supportInvalidateOptionsMenu;

public class Glide implements ComponentCallbacks2 {
    private static volatile boolean MediaDescriptionCompat;
    private static volatile Glide MediaMetadataCompat;
    public final getUsable IconCompatParcelizer;
    public final CheckParameters_MembersInjector MediaBrowserCompat$CustomActionResultReceiver;
    public final List<hashCode> MediaBrowserCompat$ItemReceiver = new ArrayList();
    private final restoreChildFragmentState MediaBrowserCompat$MediaItem;
    public final Registry MediaBrowserCompat$SearchResultReceiver;
    public final isLoadInBackgroundCanceled RatingCompat;
    public final getView read;
    public final CheckParameters.CheckCountry write;

    public interface IconCompatParcelizer {
        isReset read();
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public static Glide IconCompatParcelizer(Context context) {
        if (MediaMetadataCompat == null) {
            GeneratedAppGlideModule write2 = write(context.getApplicationContext());
            synchronized (Glide.class) {
                if (MediaMetadataCompat == null) {
                    if (!MediaDescriptionCompat) {
                        MediaDescriptionCompat = true;
                        getUserVisibleHint getuservisiblehint = new getUserVisibleHint();
                        Context applicationContext = context.getApplicationContext();
                        Collections.emptyList();
                        List<setUpdateThrottle> IconCompatParcelizer2 = new onDestroyView.write(applicationContext).IconCompatParcelizer();
                        if (write2 != null && !write2.MediaBrowserCompat$ItemReceiver().isEmpty()) {
                            Set<Class<?>> MediaBrowserCompat$ItemReceiver2 = write2.MediaBrowserCompat$ItemReceiver();
                            Iterator<setUpdateThrottle> it = IconCompatParcelizer2.iterator();
                            while (it.hasNext()) {
                                setUpdateThrottle next = it.next();
                                if (MediaBrowserCompat$ItemReceiver2.contains(next.getClass())) {
                                    if (Log.isLoggable("Glide", 3)) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("AppGlideModule excludes manifest GlideModule: ");
                                        sb.append(next);
                                        Log.d("Glide", sb.toString());
                                    }
                                    it.remove();
                                }
                            }
                        }
                        if (Log.isLoggable("Glide", 3)) {
                            for (setUpdateThrottle setupdatethrottle : IconCompatParcelizer2) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Discovered GlideModule from manifest: ");
                                sb2.append(setupdatethrottle.getClass());
                                Log.d("Glide", sb2.toString());
                            }
                        }
                        getuservisiblehint.MediaSessionCompat$QueueItem = null;
                        Iterator<setUpdateThrottle> it2 = IconCompatParcelizer2.iterator();
                        while (it2.hasNext()) {
                            it2.next();
                        }
                        if (getuservisiblehint.MediaSessionCompat$ResultReceiverWrapper == null) {
                            getuservisiblehint.MediaSessionCompat$ResultReceiverWrapper = setAnimatingAway.MediaBrowserCompat$ItemReceiver();
                        }
                        if (getuservisiblehint.MediaMetadataCompat == null) {
                            getuservisiblehint.MediaMetadataCompat = setAnimatingAway.read();
                        }
                        if (getuservisiblehint.MediaBrowserCompat$CustomActionResultReceiver == null) {
                            getuservisiblehint.MediaBrowserCompat$CustomActionResultReceiver = setAnimatingAway.write();
                        }
                        if (getuservisiblehint.ParcelableVolumeInfo == null) {
                            getuservisiblehint.ParcelableVolumeInfo = new setAllowReturnTransitionOverlap(new setAllowReturnTransitionOverlap.IconCompatParcelizer(applicationContext));
                        }
                        if (getuservisiblehint.write == null) {
                            getuservisiblehint.write = new superDispatchKeyEvent.read();
                        }
                        if (getuservisiblehint.IconCompatParcelizer == null) {
                            int i = getuservisiblehint.ParcelableVolumeInfo.IconCompatParcelizer;
                            if (i > 0) {
                                getuservisiblehint.IconCompatParcelizer = new requireActivity((long) i);
                            } else {
                                getuservisiblehint.IconCompatParcelizer = new setPaddingRelative();
                            }
                        }
                        if (getuservisiblehint.MediaBrowserCompat$ItemReceiver == null) {
                            getuservisiblehint.MediaBrowserCompat$ItemReceiver = new registerForContextMenu(getuservisiblehint.ParcelableVolumeInfo.write);
                        }
                        if (getuservisiblehint.f2600x50fd9e4a == null) {
                            getuservisiblehint.f2600x50fd9e4a = new setAllowEnterTransitionOverlap((long) getuservisiblehint.ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver);
                        }
                        if (getuservisiblehint.MediaBrowserCompat$SearchResultReceiver == null) {
                            getuservisiblehint.MediaBrowserCompat$SearchResultReceiver = new restoreViewState(applicationContext);
                        }
                        if (getuservisiblehint.MediaBrowserCompat$MediaItem == null) {
                            getuservisiblehint.MediaBrowserCompat$MediaItem = new performCreateOptionsMenu(getuservisiblehint.f2600x50fd9e4a, getuservisiblehint.MediaBrowserCompat$SearchResultReceiver, getuservisiblehint.MediaMetadataCompat, getuservisiblehint.MediaSessionCompat$ResultReceiverWrapper, setAnimatingAway.MediaBrowserCompat$CustomActionResultReceiver(), getuservisiblehint.MediaBrowserCompat$CustomActionResultReceiver, false);
                        }
                        List<deliverCancellation<Object>> list = getuservisiblehint.read;
                        if (list == null) {
                            getuservisiblehint.read = Collections.emptyList();
                        } else {
                            getuservisiblehint.read = Collections.unmodifiableList(list);
                        }
                        Context context2 = applicationContext;
                        Glide glide = r3;
                        Context context3 = applicationContext;
                        Glide glide2 = new Glide(context2, getuservisiblehint.MediaBrowserCompat$MediaItem, getuservisiblehint.f2600x50fd9e4a, getuservisiblehint.IconCompatParcelizer, getuservisiblehint.MediaBrowserCompat$ItemReceiver, new isLoadInBackgroundCanceled((isLoadInBackgroundCanceled.read) null), getuservisiblehint.write, getuservisiblehint.MediaSessionCompat$Token, getuservisiblehint.MediaDescriptionCompat, getuservisiblehint.RatingCompat, getuservisiblehint.read, false, false);
                        Iterator<setUpdateThrottle> it3 = IconCompatParcelizer2.iterator();
                        while (it3.hasNext()) {
                            it3.next();
                        }
                        Glide glide3 = glide;
                        context3.registerComponentCallbacks(glide3);
                        MediaMetadataCompat = glide3;
                        MediaDescriptionCompat = false;
                    } else {
                        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
                    }
                }
            }
        }
        return MediaMetadataCompat;
    }

    private static GeneratedAppGlideModule write(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context.getApplicationContext()});
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (InstantiationException e) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
        } catch (NoSuchMethodException e3) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
        }
    }

    private Glide(Context context, performCreateOptionsMenu performcreateoptionsmenu, restoreChildFragmentState restorechildfragmentstate, CheckParameters_MembersInjector checkParameters_MembersInjector, CheckParameters.CheckCountry checkCountry, isLoadInBackgroundCanceled isloadinbackgroundcanceled, getUsable getusable, int i, IconCompatParcelizer iconCompatParcelizer, Map<Class<?>, isHideReplaced<?, ?>> map, List<deliverCancellation<Object>> list, boolean z, boolean z2) {
        Context context2 = context;
        CheckParameters_MembersInjector checkParameters_MembersInjector2 = checkParameters_MembersInjector;
        CheckParameters.CheckCountry checkCountry2 = checkCountry;
        Class<byte[]> cls = byte[].class;
        initState initstate = initState.NORMAL;
        this.MediaBrowserCompat$CustomActionResultReceiver = checkParameters_MembersInjector2;
        this.write = checkCountry2;
        this.MediaBrowserCompat$MediaItem = restorechildfragmentstate;
        this.RatingCompat = isloadinbackgroundcanceled;
        this.IconCompatParcelizer = getusable;
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.MediaBrowserCompat$SearchResultReceiver = registry;
        onBackPressed onbackpressed = new onBackPressed();
        setupDialog setupdialog = registry.MediaBrowserCompat$ItemReceiver;
        synchronized (setupdialog) {
            setupdialog.MediaBrowserCompat$ItemReceiver.add(onbackpressed);
        }
        if (Build.VERSION.SDK_INT >= 27) {
            Registry registry2 = this.MediaBrowserCompat$SearchResultReceiver;
            ConstraintHelper constraintHelper = new ConstraintHelper();
            setupDialog setupdialog2 = registry2.MediaBrowserCompat$ItemReceiver;
            synchronized (setupdialog2) {
                setupdialog2.MediaBrowserCompat$ItemReceiver.add(constraintHelper);
            }
        }
        List<ImageHeaderParser> write2 = this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver.write();
        if (!write2.isEmpty()) {
            setColumnCount setcolumncount = new setColumnCount(context2, write2, checkParameters_MembersInjector2, checkCountry2);
            isVisible<ParcelFileDescriptor, Bitmap> read2 = supportInvalidateOptionsMenu.read(checkParameters_MembersInjector);
            List<ImageHeaderParser> write3 = this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver.write();
            if (!write3.isEmpty()) {
                onMenuItemSelected onmenuitemselected = new onMenuItemSelected(write3, resources.getDisplayMetrics(), checkParameters_MembersInjector2, checkCountry2);
                getSupportFragmentManager getsupportfragmentmanager = new getSupportFragmentManager(onmenuitemselected);
                onRetainNonConfigurationInstance onretainnonconfigurationinstance = new onRetainNonConfigurationInstance(onmenuitemselected, checkCountry2);
                findFragmentById findfragmentbyid = new findFragmentById(context2);
                setTargetFragment.IconCompatParcelizer iconCompatParcelizer2 = new setTargetFragment.IconCompatParcelizer(resources);
                setTargetFragment.read read3 = new setTargetFragment.read(resources);
                setTargetFragment$MediaBrowserCompat$ItemReceiver settargetfragment_mediabrowsercompat_itemreceiver = new setTargetFragment$MediaBrowserCompat$ItemReceiver(resources);
                setTargetFragment$MediaBrowserCompat$CustomActionResultReceiver settargetfragment_mediabrowsercompat_customactionresultreceiver = new setTargetFragment$MediaBrowserCompat$CustomActionResultReceiver(resources);
                Class<byte[]> cls2 = cls;
                markState markstate = new markState(checkCountry2);
                completeWakefulIntent completewakefulintent = new completeWakefulIntent();
                SingleGeneratedAdapterObserver singleGeneratedAdapterObserver = new SingleGeneratedAdapterObserver();
                ContentResolver contentResolver = context.getContentResolver();
                setTargetFragment$MediaBrowserCompat$CustomActionResultReceiver settargetfragment_mediabrowsercompat_customactionresultreceiver2 = settargetfragment_mediabrowsercompat_customactionresultreceiver;
                Class<InputStream> cls3 = InputStream.class;
                setTargetFragment.read read4 = read3;
                Class<AssetFileDescriptor> cls4 = AssetFileDescriptor.class;
                Class<Bitmap> cls5 = Bitmap.class;
                setTargetFragment$MediaBrowserCompat$ItemReceiver settargetfragment_mediabrowsercompat_itemreceiver2 = settargetfragment_mediabrowsercompat_itemreceiver;
                Class<Bitmap> cls6 = Bitmap.class;
                Class<Bitmap> cls7 = Bitmap.class;
                Registry MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(ByteBuffer.class, new setHideReplaced()).MediaBrowserCompat$ItemReceiver(cls3, new setSharedElementReturnTransition(checkCountry2)).MediaBrowserCompat$CustomActionResultReceiver("Bitmap", ByteBuffer.class, Bitmap.class, getsupportfragmentmanager).MediaBrowserCompat$CustomActionResultReceiver("Bitmap", InputStream.class, Bitmap.class, onretainnonconfigurationinstance).MediaBrowserCompat$CustomActionResultReceiver("Bitmap", ParcelFileDescriptor.class, Bitmap.class, read2).MediaBrowserCompat$CustomActionResultReceiver("Bitmap", cls4, cls5, supportInvalidateOptionsMenu.write(checkParameters_MembersInjector)).read(Bitmap.class, Bitmap.class, setUserVisibleHint.write.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$CustomActionResultReceiver("Bitmap", cls6, cls7, new startIntentSenderFromFragment()).MediaBrowserCompat$ItemReceiver(Bitmap.class, markstate).MediaBrowserCompat$CustomActionResultReceiver("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new Fragment$InstantiationException(resources, getsupportfragmentmanager)).MediaBrowserCompat$CustomActionResultReceiver("BitmapDrawable", InputStream.class, BitmapDrawable.class, new Fragment$InstantiationException(resources, onretainnonconfigurationinstance)).MediaBrowserCompat$CustomActionResultReceiver("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new Fragment$InstantiationException(resources, read2)).MediaBrowserCompat$ItemReceiver(BitmapDrawable.class, new dispatchFragmentsOnCreateView(checkParameters_MembersInjector2, markstate));
                startWakefulService startwakefulservice = new startWakefulService(write2, setcolumncount, checkCountry2);
                Class<isHidden> cls8 = isHidden.class;
                Class<isHidden> cls9 = isHidden.class;
                Class<isHidden> cls10 = isHidden.class;
                Class<Bitmap> cls11 = Bitmap.class;
                Registry MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver("Gif", InputStream.class, setUseDefaultMargins.class, startwakefulservice).MediaBrowserCompat$CustomActionResultReceiver("Gif", ByteBuffer.class, setUseDefaultMargins.class, setcolumncount).MediaBrowserCompat$ItemReceiver(setUseDefaultMargins.class, new setColumnOrderPreserved()).read(cls8, cls9, setUserVisibleHint.write.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$CustomActionResultReceiver("Bitmap", cls10, cls11, new FullLifecycleObserverAdapter(checkParameters_MembersInjector2));
                MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver("legacy_append", Uri.class, Drawable.class, findfragmentbyid);
                MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver("legacy_append", Uri.class, Bitmap.class, new startActivityFromFragment(findfragmentbyid, checkParameters_MembersInjector2));
                Class<File> cls12 = File.class;
                Class<InputStream> cls13 = InputStream.class;
                Registry read5 = MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver(new C1591xfee12cfc()).read(File.class, ByteBuffer.class, new setEnterTransition$MediaBrowserCompat$ItemReceiver()).read(cls12, cls13, new setHasOptionsMenu.IconCompatParcelizer());
                read5.MediaBrowserCompat$CustomActionResultReceiver("legacy_append", File.class, File.class, new setAlignmentMode());
                setTargetFragment$MediaBrowserCompat$ItemReceiver settargetfragment_mediabrowsercompat_itemreceiver3 = settargetfragment_mediabrowsercompat_itemreceiver2;
                setTargetFragment.read read6 = read4;
                setTargetFragment$MediaBrowserCompat$CustomActionResultReceiver settargetfragment_mediabrowsercompat_customactionresultreceiver3 = settargetfragment_mediabrowsercompat_customactionresultreceiver2;
                Class<String> cls14 = String.class;
                Class<InputStream> cls15 = InputStream.class;
                Class<Uri> cls16 = Uri.class;
                Class<InputStream> cls17 = InputStream.class;
                Class<String> cls18 = String.class;
                Class<InputStream> cls19 = InputStream.class;
                Class<String> cls20 = String.class;
                Class<ParcelFileDescriptor> cls21 = ParcelFileDescriptor.class;
                Class<String> cls22 = String.class;
                Class<AssetFileDescriptor> cls23 = AssetFileDescriptor.class;
                Class<Uri> cls24 = Uri.class;
                Class<InputStream> cls25 = InputStream.class;
                Context context3 = context;
                completeWakefulIntent completewakefulintent2 = completewakefulintent;
                Class<Uri> cls26 = Uri.class;
                Class<InputStream> cls27 = InputStream.class;
                Registry read7 = read5.read(File.class, ParcelFileDescriptor.class, new setHasOptionsMenu.read()).read(File.class, File.class, setUserVisibleHint.write.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(new onMultiWindowModeChanged.IconCompatParcelizer(checkCountry2)).read(Integer.TYPE, InputStream.class, iconCompatParcelizer2).read(Integer.TYPE, ParcelFileDescriptor.class, settargetfragment_mediabrowsercompat_itemreceiver3).read(Integer.class, InputStream.class, iconCompatParcelizer2).read(Integer.class, ParcelFileDescriptor.class, settargetfragment_mediabrowsercompat_itemreceiver3).read(Integer.class, Uri.class, read6).read(Integer.TYPE, AssetFileDescriptor.class, settargetfragment_mediabrowsercompat_customactionresultreceiver3).read(Integer.class, AssetFileDescriptor.class, settargetfragment_mediabrowsercompat_customactionresultreceiver3).read(Integer.TYPE, Uri.class, read6).read(cls14, cls15, new setExitSharedElementCallback$MediaBrowserCompat$ItemReceiver()).read(cls16, cls17, new setExitSharedElementCallback$MediaBrowserCompat$ItemReceiver()).read(cls18, cls19, new C1538x3679a2de()).read(cls20, cls21, new setStateAfterAnimating.read()).read(cls22, cls23, new setStateAfterAnimating.IconCompatParcelizer()).read(cls24, cls25, new C1597xcf73814e()).read(Uri.class, InputStream.class, new setArguments.IconCompatParcelizer(context.getAssets())).read(Uri.class, ParcelFileDescriptor.class, new setArguments.write(context.getAssets())).read(Uri.class, InputStream.class, new startPostponedEnterTransition.write(context3)).read(cls26, cls27, new allocateRequestIndex.IconCompatParcelizer(context3));
                ContentResolver contentResolver2 = contentResolver;
                Class<Uri> cls28 = Uri.class;
                Class<ParcelFileDescriptor> cls29 = ParcelFileDescriptor.class;
                Registry read8 = read7.read(Uri.class, InputStream.class, new startIntentSenderForResult.write(contentResolver2)).read(cls28, cls29, new startIntentSenderForResult$MediaBrowserCompat$ItemReceiver(contentResolver2));
                startIntentSenderForResult.IconCompatParcelizer iconCompatParcelizer3 = new startIntentSenderForResult.IconCompatParcelizer(contentResolver2);
                Class<URL> cls30 = URL.class;
                Class<InputStream> cls31 = InputStream.class;
                Class<Uri> cls32 = Uri.class;
                Class<File> cls33 = File.class;
                Class<setInitialSavedState> cls34 = setInitialSavedState.class;
                Class<InputStream> cls35 = InputStream.class;
                Class<ByteBuffer> cls36 = ByteBuffer.class;
                Class<byte[]> cls37 = cls2;
                Class<InputStream> cls38 = InputStream.class;
                Registry read9 = read8.read(Uri.class, AssetFileDescriptor.class, iconCompatParcelizer3).read(Uri.class, InputStream.class, new startActivityForResult.write()).read(cls30, cls31, new markFragmentsCreated.write()).read(cls32, cls33, new setNextTransition.write(context3)).read(cls34, cls35, new startActivity$MediaBrowserCompat$ItemReceiver()).read(cls37, cls36, new setExitTransition.read()).read(cls37, cls38, new setExitTransition$MediaBrowserCompat$CustomActionResultReceiver()).read(Uri.class, Uri.class, setUserVisibleHint.write.MediaBrowserCompat$CustomActionResultReceiver()).read(Drawable.class, Drawable.class, setUserVisibleHint.write.MediaBrowserCompat$CustomActionResultReceiver());
                read9.MediaBrowserCompat$CustomActionResultReceiver("legacy_append", Drawable.class, Drawable.class, new findFragmentByTag());
                SingleGeneratedAdapterObserver singleGeneratedAdapterObserver2 = singleGeneratedAdapterObserver;
                read9.MediaBrowserCompat$CustomActionResultReceiver(Bitmap.class, BitmapDrawable.class, new CompositeGeneratedAdaptersObserver(resources)).MediaBrowserCompat$CustomActionResultReceiver(Bitmap.class, cls37, completewakefulintent2).MediaBrowserCompat$CustomActionResultReceiver(Drawable.class, cls37, new cancelLoadInBackground(checkParameters_MembersInjector2, completewakefulintent2, singleGeneratedAdapterObserver2)).MediaBrowserCompat$CustomActionResultReceiver(setUseDefaultMargins.class, cls37, singleGeneratedAdapterObserver2);
                CheckParameters.CheckCountry checkCountry3 = checkCountry;
                this.read = new getView(context3, checkCountry3, this.MediaBrowserCompat$SearchResultReceiver, new getAllowReturnTransitionOverlap.read(), iconCompatParcelizer, map, list, performcreateoptionsmenu, false, i);
                return;
            }
            throw new Registry.NoImageHeaderParserException();
        }
        throw new Registry.NoImageHeaderParserException();
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [androidx.fragment.app.Fragment] */
    /* JADX WARNING: type inference failed for: r3v10, types: [androidx.fragment.app.Fragment] */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x007e, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x007e, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00ee, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ee, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040o.hashCode MediaBrowserCompat$CustomActionResultReceiver(android.view.View r6) {
        /*
            android.content.Context r0 = r6.getContext()
            if (r0 == 0) goto L_0x0142
            com.bumptech.glide.Glide r0 = IconCompatParcelizer((android.content.Context) r0)
            o.isLoadInBackgroundCanceled r0 = r0.RatingCompat
            boolean r1 = p040o.LinearLayoutManager.write()
            if (r1 == 0) goto L_0x001f
            android.content.Context r6 = r6.getContext()
            android.content.Context r6 = r6.getApplicationContext()
            o.hashCode r6 = r0.read((android.content.Context) r6)
            return r6
        L_0x001f:
            if (r6 == 0) goto L_0x013a
            android.content.Context r1 = r6.getContext()
            if (r1 == 0) goto L_0x0132
            android.content.Context r1 = r6.getContext()
            android.app.Activity r1 = p040o.isLoadInBackgroundCanceled.MediaBrowserCompat$ItemReceiver(r1)
            if (r1 != 0) goto L_0x003e
            android.content.Context r6 = r6.getContext()
            android.content.Context r6 = r6.getApplicationContext()
            o.hashCode r6 = r0.read((android.content.Context) r6)
            return r6
        L_0x003e:
            boolean r2 = r1 instanceof androidx.fragment.app.FragmentActivity
            r3 = 0
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            if (r2 == 0) goto L_0x00bc
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            o.setTextAppearance<android.view.View, androidx.fragment.app.Fragment> r2 = r0.IconCompatParcelizer
            r2.clear()
            o.setTitleMarginStart r2 = r1.getSupportFragmentManager()
            java.util.List r2 = r2.MediaBrowserCompat$CustomActionResultReceiver()
            o.setTextAppearance<android.view.View, androidx.fragment.app.Fragment> r5 = r0.IconCompatParcelizer
            p040o.isLoadInBackgroundCanceled.MediaBrowserCompat$CustomActionResultReceiver(r2, r5)
            android.view.View r2 = r1.findViewById(r4)
        L_0x005e:
            boolean r4 = r6.equals(r2)
            if (r4 != 0) goto L_0x007e
            o.setTextAppearance<android.view.View, androidx.fragment.app.Fragment> r3 = r0.IconCompatParcelizer
            java.lang.Object r3 = r3.get(r6)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L_0x006f
            goto L_0x007e
        L_0x006f:
            android.view.ViewParent r4 = r6.getParent()
            boolean r4 = r4 instanceof android.view.View
            if (r4 == 0) goto L_0x007e
            android.view.ViewParent r6 = r6.getParent()
            android.view.View r6 = (android.view.View) r6
            goto L_0x005e
        L_0x007e:
            o.setTextAppearance<android.view.View, androidx.fragment.app.Fragment> r6 = r0.IconCompatParcelizer
            r6.clear()
            if (r3 == 0) goto L_0x00b7
            android.content.Context r6 = r3.getContext()
            if (r6 == 0) goto L_0x00af
            boolean r6 = p040o.LinearLayoutManager.write()
            if (r6 == 0) goto L_0x009e
            android.content.Context r6 = r3.getContext()
            android.content.Context r6 = r6.getApplicationContext()
            o.hashCode r6 = r0.read((android.content.Context) r6)
            goto L_0x00bb
        L_0x009e:
            o.setTitleMarginStart r6 = r3.getChildFragmentManager()
            android.content.Context r1 = r3.getContext()
            boolean r2 = r3.isVisible()
            o.hashCode r6 = r0.read(r1, r6, r3, r2)
            goto L_0x00bb
        L_0x00af:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "You cannot start a load on a fragment before it is attached or after it is destroyed"
            r6.<init>(r0)
            throw r6
        L_0x00b7:
            o.hashCode r6 = r0.write((androidx.fragment.app.FragmentActivity) r1)
        L_0x00bb:
            return r6
        L_0x00bc:
            o.setTextAppearance<android.view.View, android.app.Fragment> r2 = r0.write
            r2.clear()
            android.app.FragmentManager r2 = r1.getFragmentManager()
            o.setTextAppearance<android.view.View, android.app.Fragment> r5 = r0.write
            r0.MediaBrowserCompat$ItemReceiver(r2, r5)
            android.view.View r2 = r1.findViewById(r4)
        L_0x00ce:
            boolean r4 = r6.equals(r2)
            if (r4 != 0) goto L_0x00ee
            o.setTextAppearance<android.view.View, android.app.Fragment> r3 = r0.write
            java.lang.Object r3 = r3.get(r6)
            android.app.Fragment r3 = (android.app.Fragment) r3
            if (r3 == 0) goto L_0x00df
            goto L_0x00ee
        L_0x00df:
            android.view.ViewParent r4 = r6.getParent()
            boolean r4 = r4 instanceof android.view.View
            if (r4 == 0) goto L_0x00ee
            android.view.ViewParent r6 = r6.getParent()
            android.view.View r6 = (android.view.View) r6
            goto L_0x00ce
        L_0x00ee:
            o.setTextAppearance<android.view.View, android.app.Fragment> r6 = r0.write
            r6.clear()
            if (r3 != 0) goto L_0x00fa
            o.hashCode r6 = r0.read((android.app.Activity) r1)
            return r6
        L_0x00fa:
            android.app.Activity r6 = r3.getActivity()
            if (r6 == 0) goto L_0x012a
            boolean r6 = p040o.LinearLayoutManager.write()
            if (r6 != 0) goto L_0x011d
            int r6 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r6 < r1) goto L_0x011d
            android.app.FragmentManager r6 = r3.getChildFragmentManager()
            android.app.Activity r1 = r3.getActivity()
            boolean r2 = r3.isVisible()
            o.hashCode r6 = r0.MediaBrowserCompat$ItemReceiver(r1, r6, r3, r2)
            return r6
        L_0x011d:
            android.app.Activity r6 = r3.getActivity()
            android.content.Context r6 = r6.getApplicationContext()
            o.hashCode r6 = r0.read((android.content.Context) r6)
            return r6
        L_0x012a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "You cannot start a load on a fragment before it is attached"
            r6.<init>(r0)
            throw r6
        L_0x0132:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "Unable to obtain a request manager for a view without a Context"
            r6.<init>(r0)
            throw r6
        L_0x013a:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "Argument must not be null"
            r6.<init>(r0)
            throw r6
        L_0x0142:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Glide.MediaBrowserCompat$CustomActionResultReceiver(android.view.View):o.hashCode");
    }

    public final boolean IconCompatParcelizer(onAbandon<?> onabandon) {
        synchronized (this.MediaBrowserCompat$ItemReceiver) {
            for (hashCode MediaBrowserCompat$ItemReceiver2 : this.MediaBrowserCompat$ItemReceiver) {
                if (MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver(onabandon)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static hashCode MediaBrowserCompat$ItemReceiver(Context context) {
        if (context != null) {
            return IconCompatParcelizer(context).RatingCompat.read(context);
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    public static hashCode MediaBrowserCompat$CustomActionResultReceiver(FragmentActivity fragmentActivity) {
        if (fragmentActivity != null) {
            return IconCompatParcelizer((Context) fragmentActivity).RatingCompat.write(fragmentActivity);
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    public void onLowMemory() {
        LinearLayoutManager.IconCompatParcelizer();
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver();
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
        this.write.write();
    }

    public void onTrimMemory(int i) {
        LinearLayoutManager.IconCompatParcelizer();
        for (hashCode onTrimMemory : this.MediaBrowserCompat$ItemReceiver) {
            onTrimMemory.onTrimMemory(i);
        }
        this.MediaBrowserCompat$MediaItem.write(i);
        this.MediaBrowserCompat$CustomActionResultReceiver.read(i);
        this.write.MediaBrowserCompat$ItemReceiver(i);
    }
}

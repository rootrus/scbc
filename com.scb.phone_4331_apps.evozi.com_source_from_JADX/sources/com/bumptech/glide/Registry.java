package com.bumptech.glide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p040o.LiveData$LifecycleBoundObserver;
import p040o.ReflectiveGenericLifecycleObserver;
import p040o.cancelLoad;
import p040o.getActivity$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getAnimator$MediaBrowserCompat$ItemReceiver;
import p040o.isInLayout;
import p040o.isVisible;
import p040o.onCancelLoad;
import p040o.onCanceled;
import p040o.onContextItemSelected;
import p040o.onCreateContextMenu;
import p040o.onDestroyOptionsMenu;
import p040o.onForceLoad;
import p040o.performCreateView;
import p040o.performLowMemory;
import p040o.setAccessibilityDelegateCompat;
import p040o.setOnCloseListener;
import p040o.setOnStartEnterTransitionListener;
import p040o.setReenterTransition;
import p040o.setSharedElementEnterTransition;
import p040o.setupDialog;
import p040o.shouldShowRequestPermissionRationale;

public final class Registry {
    public final setOnStartEnterTransitionListener IconCompatParcelizer;
    public final onForceLoad MediaBrowserCompat$CustomActionResultReceiver;
    public final setupDialog MediaBrowserCompat$ItemReceiver;
    public final cancelLoad MediaBrowserCompat$MediaItem;
    private final setOnCloseListener.read<List<Throwable>> MediaBrowserCompat$SearchResultReceiver;
    public final LiveData$LifecycleBoundObserver MediaDescriptionCompat;
    private final onCancelLoad MediaMetadataCompat = new onCancelLoad();
    public final getActivity$MediaBrowserCompat$CustomActionResultReceiver RatingCompat = new getActivity$MediaBrowserCompat$CustomActionResultReceiver();
    public final onDestroyOptionsMenu read;
    public final onCanceled write;

    public Registry() {
        setOnCloseListener.read<List<Throwable>> write2 = setAccessibilityDelegateCompat.write();
        this.MediaBrowserCompat$SearchResultReceiver = write2;
        this.IconCompatParcelizer = new setOnStartEnterTransitionListener(write2);
        this.MediaBrowserCompat$CustomActionResultReceiver = new onForceLoad();
        this.write = new onCanceled();
        this.MediaBrowserCompat$MediaItem = new cancelLoad();
        this.read = new onDestroyOptionsMenu();
        this.MediaDescriptionCompat = new LiveData$LifecycleBoundObserver();
        this.MediaBrowserCompat$ItemReceiver = new setupDialog();
        List asList = Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"});
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.addAll(asList);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.write.MediaBrowserCompat$CustomActionResultReceiver(arrayList);
    }

    public final <Data> Registry MediaBrowserCompat$ItemReceiver(Class<Data> cls, isInLayout<Data> isinlayout) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(cls, isinlayout);
        return this;
    }

    public final <Data, TResource> Registry MediaBrowserCompat$CustomActionResultReceiver(String str, Class<Data> cls, Class<TResource> cls2, isVisible<Data, TResource> isvisible) {
        this.write.read(str, isvisible, cls, cls2);
        return this;
    }

    public final <TResource> Registry MediaBrowserCompat$ItemReceiver(Class<TResource> cls, onContextItemSelected<TResource> oncontextitemselected) {
        this.MediaBrowserCompat$MediaItem.read(cls, oncontextitemselected);
        return this;
    }

    public final Registry MediaBrowserCompat$ItemReceiver(onCreateContextMenu.read<?> read2) {
        onDestroyOptionsMenu ondestroyoptionsmenu = this.read;
        synchronized (ondestroyoptionsmenu) {
            ondestroyoptionsmenu.write.put(read2.MediaBrowserCompat$ItemReceiver(), read2);
        }
        return this;
    }

    public final <TResource, Transcode> Registry MediaBrowserCompat$CustomActionResultReceiver(Class<TResource> cls, Class<Transcode> cls2, ReflectiveGenericLifecycleObserver<TResource, Transcode> reflectiveGenericLifecycleObserver) {
        this.MediaDescriptionCompat.IconCompatParcelizer(cls, cls2, reflectiveGenericLifecycleObserver);
        return this;
    }

    public final <Model, Data> Registry read(Class<Model> cls, Class<Data> cls2, setReenterTransition<Model, Data> setreentertransition) {
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.IconCompatParcelizer;
        synchronized (setonstartentertransitionlistener) {
            shouldShowRequestPermissionRationale shouldshowrequestpermissionrationale = setonstartentertransitionlistener.write;
            synchronized (shouldshowrequestpermissionrationale) {
                shouldShowRequestPermissionRationale.write write2 = new shouldShowRequestPermissionRationale.write(cls, cls2, setreentertransition);
                List<shouldShowRequestPermissionRationale.write<?, ?>> list = shouldshowrequestpermissionrationale.IconCompatParcelizer;
                list.add(list.size(), write2);
            }
            setonstartentertransitionlistener.MediaBrowserCompat$ItemReceiver.read.clear();
        }
        return this;
    }

    public final <Data, TResource, Transcode> performLowMemory<Data, TResource, Transcode> read(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        Class<Data> cls4 = cls;
        Class<TResource> cls5 = cls2;
        Class<Transcode> cls6 = cls3;
        performLowMemory<Data, TResource, Transcode> MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver(cls4, cls5, cls6);
        if (onCancelLoad.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver2)) {
            return null;
        }
        if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
            ArrayList arrayList = new ArrayList();
            for (Class next : this.write.MediaBrowserCompat$ItemReceiver(cls4, cls5)) {
                for (Class next2 : this.MediaDescriptionCompat.read(next, cls6)) {
                    performCreateView performcreateview = r2;
                    performCreateView performcreateview2 = new performCreateView(cls, next, next2, this.write.read(cls4, next), this.MediaDescriptionCompat.write(next, next2), this.MediaBrowserCompat$SearchResultReceiver);
                    arrayList.add(performcreateview);
                }
            }
            if (arrayList.isEmpty()) {
                MediaBrowserCompat$CustomActionResultReceiver2 = null;
            } else {
                MediaBrowserCompat$CustomActionResultReceiver2 = new performLowMemory<>(cls, cls2, cls3, arrayList, this.MediaBrowserCompat$SearchResultReceiver);
            }
            onCancelLoad oncancelload = this.MediaMetadataCompat;
            synchronized (oncancelload.MediaBrowserCompat$ItemReceiver) {
                oncancelload.MediaBrowserCompat$ItemReceiver.put(new getAnimator$MediaBrowserCompat$ItemReceiver(cls4, cls5, cls6), MediaBrowserCompat$CustomActionResultReceiver2 == null ? onCancelLoad.MediaBrowserCompat$CustomActionResultReceiver : MediaBrowserCompat$CustomActionResultReceiver2);
            }
        }
        return MediaBrowserCompat$CustomActionResultReceiver2;
    }

    public final <Model> List<setSharedElementEnterTransition<Model, ?>> read(Model model) {
        List<setSharedElementEnterTransition<A, ?>> IconCompatParcelizer2 = this.IconCompatParcelizer.IconCompatParcelizer(model.getClass());
        int size = IconCompatParcelizer2.size();
        List<setSharedElementEnterTransition<Model, ?>> emptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            setSharedElementEnterTransition setsharedelemententertransition = IconCompatParcelizer2.get(i);
            if (setsharedelemententertransition.write(model)) {
                if (z) {
                    emptyList = new ArrayList<>(size - i);
                    z = false;
                }
                emptyList.add(setsharedelemententertransition);
            }
        }
        if (!emptyList.isEmpty()) {
            return emptyList;
        }
        throw new NoModelLoaderAvailableException(model);
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public NoModelLoaderAvailableException(java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to find any ModelLoaders for model: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Registry.NoModelLoaderAvailableException.<init>(java.lang.Object):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public NoModelLoaderAvailableException(java.lang.Class<?> r3, java.lang.Class<?> r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to find any ModelLoaders for model: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = " and data: "
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Registry.NoModelLoaderAvailableException.<init>(java.lang.Class, java.lang.Class):void");
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public NoResultEncoderAvailableException(java.lang.Class<?> r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to find result encoder for resource class: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary."
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Registry.NoResultEncoderAvailableException.<init>(java.lang.Class):void");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public NoSourceEncoderAvailableException(java.lang.Class<?> r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to find source encoder for data class: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Registry.NoSourceEncoderAvailableException.<init>(java.lang.Class):void");
        }
    }

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }
}

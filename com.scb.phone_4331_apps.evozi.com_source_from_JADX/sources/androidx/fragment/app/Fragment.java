package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.LiveData;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import p040o.AlertController$RecycleListView;
import p040o.AppCompatCheckBox;
import p040o.CheckCaptureModule_GetLookAndFeelParametersFactory;
import p040o.ViewStubCompat;
import p040o.entryRemoved;
import p040o.get;
import p040o.maxSize;
import p040o.remove;
import p040o.setLayoutInflater;
import p040o.setLayoutResource;
import p040o.setOnSearchClickListener;
import p040o.setPrompt;
import p040o.setRadius;
import p040o.setTitleMarginStart;
import p040o.setTitleMarginTop;
import p040o.sizeOf;
import p040o.trimToSize;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, maxSize, CheckCaptureModule_GetLookAndFeelParametersFactory {
    static final int ACTIVITY_CREATED = 2;
    static final int CREATED = 1;
    static final int INITIALIZING = 0;
    static final int RESUMED = 4;
    static final int STARTED = 3;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    private static final AppCompatCheckBox<String, Class<?>> sClassMap = new AppCompatCheckBox<>();
    public boolean mAdded;
    read mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mCalled;
    public setLayoutResource mChildFragmentManager;
    public setLayoutInflater mChildNonConfig;
    public ViewGroup mContainer;
    public int mContainerId;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public setLayoutResource mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public setTitleMarginTop mHost;
    public boolean mInLayout;
    public int mIndex = -1;
    public View mInnerView;
    public boolean mIsCreated;
    public boolean mIsNewlyAdded;
    LayoutInflater mLayoutInflater;
    get mLifecycleRegistry = new get(this);
    public boolean mMenuVisible = true;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public float mPostponedAlpha;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetaining;
    public Bundle mSavedFragmentState;
    public Boolean mSavedUserVisibleHint;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState = 0;
    public String mTag;
    public Fragment mTarget;
    public int mTargetIndex = -1;
    public int mTargetRequestCode;
    public boolean mUserVisibleHint = true;
    public View mView;
    public maxSize mViewLifecycleOwner;
    public remove<maxSize> mViewLifecycleOwnerLiveData = new remove<>();
    get mViewLifecycleRegistry;
    public trimToSize mViewModelStore;
    String mWho;

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public entryRemoved getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public maxSize getViewLifecycleOwner() {
        maxSize maxsize = this.mViewLifecycleOwner;
        if (maxsize != null) {
            return maxsize;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<maxSize> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    public trimToSize getViewModelStore() {
        if (getContext() != null) {
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new trimToSize();
            }
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public static class IconCompatParcelizer implements Parcelable {
        public static final Parcelable.Creator<IconCompatParcelizer> CREATOR = new Parcelable.ClassLoaderCreator<IconCompatParcelizer>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new IconCompatParcelizer(parcel, (ClassLoader) null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new IconCompatParcelizer(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new IconCompatParcelizer[i];
            }
        };
        final Bundle IconCompatParcelizer;

        public int describeContents() {
            return 0;
        }

        public IconCompatParcelizer(Bundle bundle) {
            this.IconCompatParcelizer = bundle;
        }

        IconCompatParcelizer(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.IconCompatParcelizer = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.IconCompatParcelizer);
        }
    }

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, (Bundle) null);
    }

    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Class<?> cls = sClassMap.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                sClassMap.put(str, cls);
            }
            Fragment fragment = (Fragment) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (ClassNotFoundException e) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    public static boolean isSupportFragmentClass(Context context, String str) {
        try {
            Class<?> cls = sClassMap.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                sClassMap.put(str, cls);
            }
            return Fragment.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mInnerView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new setRadius("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.mView != null) {
            this.mViewLifecycleRegistry.write(entryRemoved.write.ON_CREATE);
        }
    }

    public final void setIndex(int i, Fragment fragment) {
        this.mIndex = i;
        if (fragment != null) {
            this.mWho = fragment.mWho + ":" + this.mIndex;
            return;
        }
        this.mWho = "android:fragment:" + this.mIndex;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Object) this, sb);
        if (this.mIndex >= 0) {
            sb.append(" #");
            sb.append(this.mIndex);
        }
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" ");
            sb.append(this.mTag);
        }
        sb.append('}');
        return sb.toString();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final String getTag() {
        return this.mTag;
    }

    public void setArguments(Bundle bundle) {
        if (this.mIndex < 0 || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active and state has been saved");
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final boolean isStateSaved() {
        setLayoutResource setlayoutresource = this.mFragmentManager;
        if (setlayoutresource == null) {
            return false;
        }
        return setlayoutresource.MediaBrowserCompat$ItemReceiver();
    }

    public void setInitialSavedState(IconCompatParcelizer iconCompatParcelizer) {
        if (this.mIndex < 0) {
            this.mSavedFragmentState = (iconCompatParcelizer == null || iconCompatParcelizer.IconCompatParcelizer == null) ? null : iconCompatParcelizer.IconCompatParcelizer;
            return;
        }
        throw new IllegalStateException("Fragment already active");
    }

    public void setTargetFragment(Fragment fragment, int i) {
        setTitleMarginStart fragmentManager = getFragmentManager();
        setTitleMarginStart fragmentManager2 = fragment != null ? fragment.getFragmentManager() : null;
        if (fragmentManager == null || fragmentManager2 == null || fragmentManager == fragmentManager2) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (fragment2 != this) {
                    fragment2 = fragment2.getTargetFragment();
                } else {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            this.mTarget = fragment;
            this.mTargetRequestCode = i;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
    }

    public final Fragment getTargetFragment() {
        return this.mTarget;
    }

    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public Context getContext() {
        setTitleMarginTop settitlemargintop = this.mHost;
        if (settitlemargintop == null) {
            return null;
        }
        return settitlemargintop.MediaBrowserCompat$SearchResultReceiver();
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final FragmentActivity getActivity() {
        setTitleMarginTop settitlemargintop = this.mHost;
        if (settitlemargintop == null) {
            return null;
        }
        return (FragmentActivity) settitlemargintop.RatingCompat();
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Object getHost() {
        setTitleMarginTop settitlemargintop = this.mHost;
        if (settitlemargintop == null) {
            return null;
        }
        return settitlemargintop.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final setTitleMarginStart getFragmentManager() {
        return this.mFragmentManager;
    }

    public final setTitleMarginStart requireFragmentManager() {
        setTitleMarginStart fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final setTitleMarginStart getChildFragmentManager() {
        if (this.mChildFragmentManager == null) {
            instantiateChildFragmentManager();
            int i = this.mState;
            if (i >= 4) {
                this.mChildFragmentManager.ParcelableVolumeInfo();
            } else if (i >= 3) {
                this.mChildFragmentManager.MediaSessionCompat$Token();
            } else if (i >= 2) {
                this.mChildFragmentManager.MediaBrowserCompat$MediaItem();
            } else if (i >= 1) {
                this.mChildFragmentManager.MediaBrowserCompat$SearchResultReceiver();
            }
        }
        return this.mChildFragmentManager;
    }

    public setTitleMarginStart peekChildFragmentManager() {
        return this.mChildFragmentManager;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isResumed() {
        return this.mState >= 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.mView;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isVisible() {
        /*
            r1 = this;
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r1.isHidden()
            if (r0 != 0) goto L_0x0020
            android.view.View r0 = r1.mView
            if (r0 == 0) goto L_0x0020
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L_0x0020
            android.view.View r0 = r1.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.isVisible():boolean");
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final boolean isMenuVisible() {
        return this.mMenuVisible;
    }

    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
    }

    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.MediaBrowserCompat$MediaItem();
            }
        }
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.MediaBrowserCompat$MediaItem();
            }
        }
    }

    public void setUserVisibleHint(boolean z) {
        if (!this.mUserVisibleHint && z && this.mState < 3 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            this.mFragmentManager.MediaBrowserCompat$MediaItem(this);
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 3 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @Deprecated
    public sizeOf getLoaderManager() {
        return sizeOf.MediaBrowserCompat$ItemReceiver(this);
    }

    public void startActivity(Intent intent) {
        startActivity(intent, (Bundle) null);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        setTitleMarginTop settitlemargintop = this.mHost;
        if (settitlemargintop != null) {
            settitlemargintop.write(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, (Bundle) null);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        setTitleMarginTop settitlemargintop = this.mHost;
        if (settitlemargintop != null) {
            settitlemargintop.write(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        setTitleMarginTop settitlemargintop = this.mHost;
        if (settitlemargintop != null) {
            settitlemargintop.read(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final void requestPermissions(String[] strArr, int i) {
        setTitleMarginTop settitlemargintop = this.mHost;
        if (settitlemargintop != null) {
            settitlemargintop.MediaBrowserCompat$ItemReceiver(this, strArr, i);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        setTitleMarginTop settitlemargintop = this.mHost;
        if (settitlemargintop != null) {
            return settitlemargintop.MediaBrowserCompat$ItemReceiver(str);
        }
        return false;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater((Bundle) null) : layoutInflater;
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        setTitleMarginTop settitlemargintop = this.mHost;
        if (settitlemargintop != null) {
            LayoutInflater read2 = settitlemargintop.read();
            getChildFragmentManager();
            setOnSearchClickListener.write(read2, this.mChildFragmentManager.setHasDecor());
            return read2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        setTitleMarginTop settitlemargintop = this.mHost;
        Activity RatingCompat = settitlemargintop == null ? null : settitlemargintop.RatingCompat();
        if (RatingCompat != null) {
            this.mCalled = false;
            onInflate(RatingCompat, attributeSet, bundle);
        }
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        setTitleMarginTop settitlemargintop = this.mHost;
        Activity RatingCompat = settitlemargintop == null ? null : settitlemargintop.RatingCompat();
        if (RatingCompat != null) {
            this.mCalled = false;
            onAttach(RatingCompat);
        }
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        setLayoutResource setlayoutresource = this.mChildFragmentManager;
        if (setlayoutresource != null && !setlayoutresource.read(1)) {
            this.mChildFragmentManager.MediaBrowserCompat$SearchResultReceiver();
        }
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            if (this.mChildFragmentManager == null) {
                instantiateChildFragmentManager();
            }
            this.mChildFragmentManager.read(parcelable, this.mChildNonConfig);
            this.mChildNonConfig = null;
            this.mChildFragmentManager.MediaBrowserCompat$SearchResultReceiver();
        }
    }

    public View getView() {
        return this.mView;
    }

    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDestroy() {
        boolean z = true;
        this.mCalled = true;
        FragmentActivity activity = getActivity();
        if (activity == null || !activity.isChangingConfigurations()) {
            z = false;
        }
        trimToSize trimtosize = this.mViewModelStore;
        if (trimtosize != null && !z) {
            trimtosize.write();
        }
    }

    public void initState() {
        this.mIndex = -1;
        this.mWho = null;
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = null;
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
        this.mRetaining = false;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        getActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
    }

    public void setEnterSharedElementCallback(setPrompt setprompt) {
        ensureAnimationInfo().MediaBrowserCompat$MediaItem = setprompt;
    }

    public void setExitSharedElementCallback(setPrompt setprompt) {
        ensureAnimationInfo().MediaMetadataCompat = setprompt;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().MediaBrowserCompat$CustomActionResultReceiver = obj;
    }

    public Object getEnterTransition() {
        read read2 = this.mAnimationInfo;
        if (read2 == null) {
            return null;
        }
        return read2.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().MediaSessionCompat$ResultReceiverWrapper = obj;
    }

    public Object getReturnTransition() {
        read read2 = this.mAnimationInfo;
        if (read2 == null) {
            return null;
        }
        return read2.MediaSessionCompat$ResultReceiverWrapper == USE_DEFAULT_TRANSITION ? getEnterTransition() : this.mAnimationInfo.MediaSessionCompat$ResultReceiverWrapper;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().MediaDescriptionCompat = obj;
    }

    public Object getExitTransition() {
        read read2 = this.mAnimationInfo;
        if (read2 == null) {
            return null;
        }
        return read2.MediaDescriptionCompat;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f18x50fd9e4a = obj;
    }

    public Object getReenterTransition() {
        read read2 = this.mAnimationInfo;
        if (read2 == null) {
            return null;
        }
        return read2.f18x50fd9e4a == USE_DEFAULT_TRANSITION ? getExitTransition() : this.mAnimationInfo.f18x50fd9e4a;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().Keep = obj;
    }

    public Object getSharedElementEnterTransition() {
        read read2 = this.mAnimationInfo;
        if (read2 == null) {
            return null;
        }
        return read2.Keep;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().PlaybackStateCompat$CustomAction = obj;
    }

    public Object getSharedElementReturnTransition() {
        read read2 = this.mAnimationInfo;
        if (read2 == null) {
            return null;
        }
        return read2.PlaybackStateCompat$CustomAction == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : this.mAnimationInfo.PlaybackStateCompat$CustomAction;
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().IconCompatParcelizer = Boolean.valueOf(z);
    }

    public boolean getAllowEnterTransitionOverlap() {
        read read2 = this.mAnimationInfo;
        if (read2 == null || read2.IconCompatParcelizer == null) {
            return true;
        }
        return this.mAnimationInfo.IconCompatParcelizer.booleanValue();
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().read = Boolean.valueOf(z);
    }

    public boolean getAllowReturnTransitionOverlap() {
        read read2 = this.mAnimationInfo;
        if (read2 == null || read2.read == null) {
            return true;
        }
        return this.mAnimationInfo.read.booleanValue();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().RatingCompat = true;
    }

    public void startPostponedEnterTransition() {
        setLayoutResource setlayoutresource = this.mFragmentManager;
        if (setlayoutresource == null || setlayoutresource.MediaDescriptionCompat == null) {
            ensureAnimationInfo().RatingCompat = false;
        } else if (Looper.myLooper() != this.mFragmentManager.MediaDescriptionCompat.MediaDescriptionCompat().getLooper()) {
            this.mFragmentManager.MediaDescriptionCompat.MediaDescriptionCompat().postAtFrontOfQueue(new Runnable() {
                public final void run() {
                    Fragment.this.callStartTransitionListener();
                }
            });
        } else {
            callStartTransitionListener();
        }
    }

    /* access modifiers changed from: package-private */
    public void callStartTransitionListener() {
        read read2 = this.mAnimationInfo;
        Fragment$MediaBrowserCompat$ItemReceiver fragment$MediaBrowserCompat$ItemReceiver = null;
        if (read2 != null) {
            read2.RatingCompat = false;
            Fragment$MediaBrowserCompat$ItemReceiver fragment$MediaBrowserCompat$ItemReceiver2 = this.mAnimationInfo.AlertController$RecycleListView;
            this.mAnimationInfo.AlertController$RecycleListView = null;
            fragment$MediaBrowserCompat$ItemReceiver = fragment$MediaBrowserCompat$ItemReceiver2;
        }
        if (fragment$MediaBrowserCompat$ItemReceiver != null) {
            fragment$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mIndex=");
        printWriter.print(this.mIndex);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mRetaining=");
        printWriter.print(this.mRetaining);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mTarget != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.mTarget);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        if (getNextAnim() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(getNextAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (this.mInnerView != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(getStateAfterAnimating());
        }
        if (getContext() != null) {
            sizeOf.MediaBrowserCompat$ItemReceiver(this).MediaBrowserCompat$CustomActionResultReceiver(str, fileDescriptor, printWriter, strArr);
        }
        if (this.mChildFragmentManager != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.mChildFragmentManager + ":");
            setLayoutResource setlayoutresource = this.mChildFragmentManager;
            setlayoutresource.read(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        setLayoutResource setlayoutresource = this.mChildFragmentManager;
        if (setlayoutresource != null) {
            return setlayoutresource.MediaBrowserCompat$CustomActionResultReceiver(str);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void instantiateChildFragmentManager() {
        if (this.mHost != null) {
            setLayoutResource setlayoutresource = new setLayoutResource();
            this.mChildFragmentManager = setlayoutresource;
            setlayoutresource.MediaBrowserCompat$CustomActionResultReceiver(this.mHost, (ViewStubCompat) new ViewStubCompat() {
                public final View read(int i) {
                    if (Fragment.this.mView != null) {
                        return Fragment.this.mView.findViewById(i);
                    }
                    throw new IllegalStateException("Fragment does not have a view");
                }

                public final boolean IconCompatParcelizer() {
                    return Fragment.this.mView != null;
                }

                public final Fragment IconCompatParcelizer(Context context, String str, Bundle bundle) {
                    return Fragment.this.mHost.IconCompatParcelizer(context, str, bundle);
                }
            }, this);
            return;
        }
        throw new IllegalStateException("Fragment has not been attached yet.");
    }

    public void performCreate(Bundle bundle) {
        setLayoutResource setlayoutresource = this.mChildFragmentManager;
        if (setlayoutresource != null) {
            setlayoutresource.PlaybackStateCompat();
        }
        this.mState = 1;
        this.mCalled = false;
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.write(entryRemoved.write.ON_CREATE);
            return;
        }
        throw new setRadius("Fragment " + this + " did not call through to super.onCreate()");
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setLayoutResource setlayoutresource = this.mChildFragmentManager;
        if (setlayoutresource != null) {
            setlayoutresource.PlaybackStateCompat();
        }
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new maxSize() {
            public final entryRemoved getLifecycle() {
                if (Fragment.this.mViewLifecycleRegistry == null) {
                    Fragment fragment = Fragment.this;
                    fragment.mViewLifecycleRegistry = new get(fragment.mViewLifecycleOwner);
                }
                return Fragment.this.mViewLifecycleRegistry;
            }
        };
        this.mViewLifecycleRegistry = null;
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.getLifecycle();
            this.mViewLifecycleOwnerLiveData.MediaBrowserCompat$CustomActionResultReceiver(this.mViewLifecycleOwner);
        } else if (this.mViewLifecycleRegistry == null) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void performActivityCreated(Bundle bundle) {
        setLayoutResource setlayoutresource = this.mChildFragmentManager;
        if (setlayoutresource != null) {
            setlayoutresource.PlaybackStateCompat();
        }
        this.mState = 2;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            setLayoutResource setlayoutresource2 = this.mChildFragmentManager;
            if (setlayoutresource2 != null) {
                setlayoutresource2.MediaBrowserCompat$MediaItem();
                return;
            }
            return;
        }
        throw new setRadius("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public void performStart() {
        setLayoutResource setlayoutresource = this.mChildFragmentManager;
        if (setlayoutresource != null) {
            setlayoutresource.PlaybackStateCompat();
            this.mChildFragmentManager.PlaybackStateCompat$CustomAction();
        }
        this.mState = 3;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            setLayoutResource setlayoutresource2 = this.mChildFragmentManager;
            if (setlayoutresource2 != null) {
                setlayoutresource2.MediaSessionCompat$Token();
            }
            this.mLifecycleRegistry.write(entryRemoved.write.ON_START);
            if (this.mView != null) {
                this.mViewLifecycleRegistry.write(entryRemoved.write.ON_START);
                return;
            }
            return;
        }
        throw new setRadius("Fragment " + this + " did not call through to super.onStart()");
    }

    public void performResume() {
        setLayoutResource setlayoutresource = this.mChildFragmentManager;
        if (setlayoutresource != null) {
            setlayoutresource.PlaybackStateCompat();
            this.mChildFragmentManager.PlaybackStateCompat$CustomAction();
        }
        this.mState = 4;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            setLayoutResource setlayoutresource2 = this.mChildFragmentManager;
            if (setlayoutresource2 != null) {
                setlayoutresource2.ParcelableVolumeInfo();
                this.mChildFragmentManager.PlaybackStateCompat$CustomAction();
            }
            this.mLifecycleRegistry.write(entryRemoved.write.ON_RESUME);
            if (this.mView != null) {
                this.mViewLifecycleRegistry.write(entryRemoved.write.ON_RESUME);
                return;
            }
            return;
        }
        throw new setRadius("Fragment " + this + " did not call through to super.onResume()");
    }

    public void noteStateNotSaved() {
        setLayoutResource setlayoutresource = this.mChildFragmentManager;
        if (setlayoutresource != null) {
            setlayoutresource.PlaybackStateCompat();
        }
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        setLayoutResource setlayoutresource = this.mChildFragmentManager;
        if (setlayoutresource != null) {
            setlayoutresource.write(z);
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        setLayoutResource setlayoutresource = this.mChildFragmentManager;
        if (setlayoutresource != null) {
            setlayoutresource.IconCompatParcelizer(z);
        }
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        setLayoutResource setlayoutresource = this.mChildFragmentManager;
        if (setlayoutresource != null) {
            setlayoutresource.read(configuration);
        }
    }

    public void performLowMemory() {
        onLowMemory();
        setLayoutResource setlayoutresource = this.mChildFragmentManager;
        if (setlayoutresource != null) {
            setlayoutresource.MediaSessionCompat$QueueItem();
        }
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        setLayoutResource setlayoutresource = this.mChildFragmentManager;
        return setlayoutresource != null ? z | setlayoutresource.MediaBrowserCompat$CustomActionResultReceiver(menu, menuInflater) : z;
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        setLayoutResource setlayoutresource = this.mChildFragmentManager;
        return setlayoutresource != null ? z | setlayoutresource.MediaBrowserCompat$CustomActionResultReceiver(menu) : z;
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        setLayoutResource setlayoutresource = this.mChildFragmentManager;
        if (setlayoutresource == null || !setlayoutresource.IconCompatParcelizer(menuItem)) {
            return false;
        }
        return true;
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        setLayoutResource setlayoutresource = this.mChildFragmentManager;
        if (setlayoutresource == null || !setlayoutresource.MediaBrowserCompat$ItemReceiver(menuItem)) {
            return false;
        }
        return true;
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            setLayoutResource setlayoutresource = this.mChildFragmentManager;
            if (setlayoutresource != null) {
                setlayoutresource.MediaBrowserCompat$ItemReceiver(menu);
            }
        }
    }

    public void performSaveInstanceState(Bundle bundle) {
        Parcelable AlertController$RecycleListView;
        onSaveInstanceState(bundle);
        setLayoutResource setlayoutresource = this.mChildFragmentManager;
        if (setlayoutresource != null && (AlertController$RecycleListView = setlayoutresource.AlertController$RecycleListView()) != null) {
            bundle.putParcelable("android:support:fragments", AlertController$RecycleListView);
        }
    }

    public void performPause() {
        if (this.mView != null) {
            this.mViewLifecycleRegistry.write(entryRemoved.write.ON_PAUSE);
        }
        this.mLifecycleRegistry.write(entryRemoved.write.ON_PAUSE);
        setLayoutResource setlayoutresource = this.mChildFragmentManager;
        if (setlayoutresource != null) {
            setlayoutresource.MediaSessionCompat$ResultReceiverWrapper();
        }
        this.mState = 3;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new setRadius("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    public void performStop() {
        if (this.mView != null) {
            this.mViewLifecycleRegistry.write(entryRemoved.write.ON_STOP);
        }
        this.mLifecycleRegistry.write(entryRemoved.write.ON_STOP);
        setLayoutResource setlayoutresource = this.mChildFragmentManager;
        if (setlayoutresource != null) {
            setlayoutresource.Keep();
        }
        this.mState = 2;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new setRadius("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public void performDestroyView() {
        if (this.mView != null) {
            this.mViewLifecycleRegistry.write(entryRemoved.write.ON_DESTROY);
        }
        setLayoutResource setlayoutresource = this.mChildFragmentManager;
        if (setlayoutresource != null) {
            setlayoutresource.mo20066x50fd9e4a();
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            sizeOf.MediaBrowserCompat$ItemReceiver(this).IconCompatParcelizer();
            this.mPerformedCreateView = false;
            return;
        }
        throw new setRadius("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public void performDestroy() {
        this.mLifecycleRegistry.write(entryRemoved.write.ON_DESTROY);
        setLayoutResource setlayoutresource = this.mChildFragmentManager;
        if (setlayoutresource != null) {
            setlayoutresource.MediaDescriptionCompat();
        }
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            this.mChildFragmentManager = null;
            return;
        }
        throw new setRadius("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public void performDetach() {
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            setLayoutResource setlayoutresource = this.mChildFragmentManager;
            if (setlayoutresource == null) {
                return;
            }
            if (this.mRetaining) {
                setlayoutresource.MediaDescriptionCompat();
                this.mChildFragmentManager = null;
                return;
            }
            throw new IllegalStateException("Child FragmentManager of " + this + " was not " + " destroyed and this fragment is not retaining instance");
        }
        throw new setRadius("Fragment " + this + " did not call through to super.onDetach()");
    }

    public void setOnStartEnterTransitionListener(Fragment$MediaBrowserCompat$ItemReceiver fragment$MediaBrowserCompat$ItemReceiver) {
        ensureAnimationInfo();
        if (fragment$MediaBrowserCompat$ItemReceiver != this.mAnimationInfo.AlertController$RecycleListView) {
            if (fragment$MediaBrowserCompat$ItemReceiver == null || this.mAnimationInfo.AlertController$RecycleListView == null) {
                if (this.mAnimationInfo.RatingCompat) {
                    this.mAnimationInfo.AlertController$RecycleListView = fragment$MediaBrowserCompat$ItemReceiver;
                }
                if (fragment$MediaBrowserCompat$ItemReceiver != null) {
                    fragment$MediaBrowserCompat$ItemReceiver.write();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    private read ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new read();
        }
        return this.mAnimationInfo;
    }

    public int getNextAnim() {
        read read2 = this.mAnimationInfo;
        if (read2 == null) {
            return 0;
        }
        return read2.ParcelableVolumeInfo;
    }

    public void setNextAnim(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo().ParcelableVolumeInfo = i;
        }
    }

    public int getNextTransition() {
        read read2 = this.mAnimationInfo;
        if (read2 == null) {
            return 0;
        }
        return read2.MediaSessionCompat$QueueItem;
    }

    public void setNextTransition(int i, int i2) {
        if (this.mAnimationInfo != null || i != 0 || i2 != 0) {
            ensureAnimationInfo();
            this.mAnimationInfo.MediaSessionCompat$QueueItem = i;
            this.mAnimationInfo.MediaSessionCompat$Token = i2;
        }
    }

    public int getNextTransitionStyle() {
        read read2 = this.mAnimationInfo;
        if (read2 == null) {
            return 0;
        }
        return read2.MediaSessionCompat$Token;
    }

    public setPrompt getEnterTransitionCallback() {
        read read2 = this.mAnimationInfo;
        if (read2 == null) {
            return null;
        }
        return read2.MediaBrowserCompat$MediaItem;
    }

    public setPrompt getExitTransitionCallback() {
        read read2 = this.mAnimationInfo;
        if (read2 == null) {
            return null;
        }
        return read2.MediaMetadataCompat;
    }

    public View getAnimatingAway() {
        read read2 = this.mAnimationInfo;
        if (read2 == null) {
            return null;
        }
        return read2.write;
    }

    public void setAnimatingAway(View view) {
        ensureAnimationInfo().write = view;
    }

    public void setAnimator(Animator animator) {
        ensureAnimationInfo().MediaBrowserCompat$ItemReceiver = animator;
    }

    public Animator getAnimator() {
        read read2 = this.mAnimationInfo;
        if (read2 == null) {
            return null;
        }
        return read2.MediaBrowserCompat$ItemReceiver;
    }

    public int getStateAfterAnimating() {
        read read2 = this.mAnimationInfo;
        if (read2 == null) {
            return 0;
        }
        return read2.PlaybackStateCompat;
    }

    public void setStateAfterAnimating(int i) {
        ensureAnimationInfo().PlaybackStateCompat = i;
    }

    public boolean isPostponed() {
        read read2 = this.mAnimationInfo;
        if (read2 == null) {
            return false;
        }
        return read2.RatingCompat;
    }

    public boolean isHideReplaced() {
        read read2 = this.mAnimationInfo;
        if (read2 == null) {
            return false;
        }
        return read2.MediaBrowserCompat$SearchResultReceiver;
    }

    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().MediaBrowserCompat$SearchResultReceiver = z;
    }

    static class read {
        Fragment$MediaBrowserCompat$ItemReceiver AlertController$RecycleListView;
        Boolean IconCompatParcelizer;
        Object Keep = null;
        Object MediaBrowserCompat$CustomActionResultReceiver = null;
        Animator MediaBrowserCompat$ItemReceiver;
        setPrompt MediaBrowserCompat$MediaItem = null;
        boolean MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        Object f18x50fd9e4a = Fragment.USE_DEFAULT_TRANSITION;
        Object MediaDescriptionCompat = null;
        setPrompt MediaMetadataCompat = null;
        int MediaSessionCompat$QueueItem;
        Object MediaSessionCompat$ResultReceiverWrapper = Fragment.USE_DEFAULT_TRANSITION;
        int MediaSessionCompat$Token;
        int ParcelableVolumeInfo;
        int PlaybackStateCompat;
        Object PlaybackStateCompat$CustomAction = Fragment.USE_DEFAULT_TRANSITION;
        boolean RatingCompat;
        Boolean read;
        View write;

        read() {
        }
    }
}

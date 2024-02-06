package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.core.app.ComponentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import okhttp3.internal.http2.Settings;
import p040o.AppCompatRatingBar;
import p040o.AppCompatRatingBar$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.AppCompatRatingBar$MediaBrowserCompat$ItemReceiver;
import p040o.CheckCaptureModule_GetLookAndFeelParametersFactory;
import p040o.ViewStubCompat;
import p040o.entryRemoved;
import p040o.setButtonDrawable;
import p040o.setLayoutInflater;
import p040o.setLayoutResource;
import p040o.setPrompt;
import p040o.setTitleMarginStart;
import p040o.setTitleMarginTop;
import p040o.setTitleTextAppearance;
import p040o.sizeOf;
import p040o.trimToSize;

public class FragmentActivity extends ComponentActivity implements CheckCaptureModule_GetLookAndFeelParametersFactory, AppCompatRatingBar$MediaBrowserCompat$ItemReceiver, AppCompatRatingBar.IconCompatParcelizer {
    static final String ALLOCATED_REQUEST_INDICIES_TAG = "android:support:request_indicies";
    static final String FRAGMENTS_TAG = "android:support:fragments";
    static final int MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS = 65534;
    static final int MSG_RESUME_PENDING = 2;
    static final String NEXT_CANDIDATE_REQUEST_INDEX_TAG = "android:support:next_request_index";
    static final String REQUEST_FRAGMENT_WHO_TAG = "android:support:request_fragment_who";
    private static final String TAG = "FragmentActivity";
    boolean mCreated;
    final setTitleTextAppearance mFragments = setTitleTextAppearance.MediaBrowserCompat$ItemReceiver(new read());
    public final Handler mHandler = new Handler() {
        public final void handleMessage(Message message) {
            if (message.what != 2) {
                super.handleMessage(message);
                return;
            }
            FragmentActivity.this.onResumeFragments();
            FragmentActivity.this.mFragments.IconCompatParcelizer.write.PlaybackStateCompat$CustomAction();
        }
    };
    int mNextCandidateRequestIndex;
    setButtonDrawable<String> mPendingFragmentActivityResults;
    boolean mRequestedPermissionsFromFragment;
    boolean mResumed;
    boolean mStartedActivityFromFragment;
    boolean mStartedIntentSenderFromFragment;
    boolean mStopped = true;
    private trimToSize mViewModelStore;

    public void onAttachFragment(Fragment fragment) {
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    static final class write {
        Object IconCompatParcelizer;
        setLayoutInflater MediaBrowserCompat$CustomActionResultReceiver;
        trimToSize write;

        write() {
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.IconCompatParcelizer.write.PlaybackStateCompat();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String MediaBrowserCompat$CustomActionResultReceiver = this.mPendingFragmentActivityResults.MediaBrowserCompat$CustomActionResultReceiver(i4);
            this.mPendingFragmentActivityResults.write(i4);
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                Log.w(TAG, "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment MediaBrowserCompat$CustomActionResultReceiver2 = this.mFragments.IconCompatParcelizer.write.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver);
            if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Activity result no fragment exists for who: ");
                sb.append(MediaBrowserCompat$CustomActionResultReceiver);
                Log.w(TAG, sb.toString());
                return;
            }
            MediaBrowserCompat$CustomActionResultReceiver2.onActivityResult(i & Settings.DEFAULT_INITIAL_WINDOW_SIZE, i2, intent);
            return;
        }
        AppCompatRatingBar$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver = AppCompatRatingBar.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver == null || !MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        setLayoutResource setlayoutresource = this.mFragments.IconCompatParcelizer.write;
        boolean MediaBrowserCompat$ItemReceiver = setlayoutresource.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver && Build.VERSION.SDK_INT <= 25) {
            return;
        }
        if (MediaBrowserCompat$ItemReceiver || !setlayoutresource.MediaMetadataCompat()) {
            super.onBackPressed();
        }
    }

    public void supportFinishAfterTransition() {
        AppCompatRatingBar.MediaBrowserCompat$CustomActionResultReceiver(this);
    }

    public void setEnterSharedElementCallback(setPrompt setprompt) {
        AppCompatRatingBar.MediaBrowserCompat$ItemReceiver(this, setprompt);
    }

    public void setExitSharedElementCallback(setPrompt setprompt) {
        AppCompatRatingBar.read(this, setprompt);
    }

    public void supportPostponeEnterTransition() {
        AppCompatRatingBar.IconCompatParcelizer(this);
    }

    public void supportStartPostponedEnterTransition() {
        AppCompatRatingBar.read(this);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.IconCompatParcelizer.write.write(z);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.IconCompatParcelizer.write.IconCompatParcelizer(z);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.IconCompatParcelizer.write.PlaybackStateCompat();
        this.mFragments.IconCompatParcelizer.write.read(configuration);
    }

    public trimToSize getViewModelStore() {
        if (getApplication() != null) {
            if (this.mViewModelStore == null) {
                write write2 = (write) getLastNonConfigurationInstance();
                if (write2 != null) {
                    this.mViewModelStore = write2.write;
                }
                if (this.mViewModelStore == null) {
                    this.mViewModelStore = new trimToSize();
                }
            }
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public entryRemoved getLifecycle() {
        return super.getLifecycle();
    }

    /* JADX INFO: finally extract failed */
    public void onCreate(Bundle bundle) {
        setTitleTextAppearance settitletextappearance = this.mFragments;
        setLayoutResource setlayoutresource = settitletextappearance.IconCompatParcelizer.write;
        setTitleMarginTop<?> settitlemargintop = settitletextappearance.IconCompatParcelizer;
        setLayoutInflater setlayoutinflater = null;
        setlayoutresource.MediaBrowserCompat$CustomActionResultReceiver((setTitleMarginTop) settitlemargintop, (ViewStubCompat) settitlemargintop, (Fragment) null);
        super.onCreate(bundle);
        write write2 = (write) getLastNonConfigurationInstance();
        if (!(write2 == null || write2.write == null || this.mViewModelStore != null)) {
            this.mViewModelStore = write2.write;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable(FRAGMENTS_TAG);
            setTitleTextAppearance settitletextappearance2 = this.mFragments;
            if (write2 != null) {
                setlayoutinflater = write2.MediaBrowserCompat$CustomActionResultReceiver;
            }
            settitletextappearance2.IconCompatParcelizer.write.read(parcelable, setlayoutinflater);
            if (bundle.containsKey(NEXT_CANDIDATE_REQUEST_INDEX_TAG)) {
                this.mNextCandidateRequestIndex = bundle.getInt(NEXT_CANDIDATE_REQUEST_INDEX_TAG);
                int[] intArray = bundle.getIntArray(ALLOCATED_REQUEST_INDICIES_TAG);
                String[] stringArray = bundle.getStringArray(REQUEST_FRAGMENT_WHO_TAG);
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w(TAG, "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.mPendingFragmentActivityResults = new setButtonDrawable<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.mPendingFragmentActivityResults.read(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.mPendingFragmentActivityResults == null) {
            this.mPendingFragmentActivityResults = new setButtonDrawable<>();
            this.mNextCandidateRequestIndex = 0;
        }
        setLayoutResource setlayoutresource2 = this.mFragments.IconCompatParcelizer.write;
        setlayoutresource2.f2634x50fd9e4a = false;
        setlayoutresource2.MediaSessionCompat$ResultReceiverWrapper = false;
        try {
            setlayoutresource2.RatingCompat = true;
            setlayoutresource2.MediaBrowserCompat$ItemReceiver(1, false);
            setlayoutresource2.RatingCompat = false;
            setlayoutresource2.PlaybackStateCompat$CustomAction();
        } catch (Throwable th) {
            setlayoutresource2.RatingCompat = false;
            throw th;
        }
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        setTitleTextAppearance settitletextappearance = this.mFragments;
        return onCreatePanelMenu | settitletextappearance.IconCompatParcelizer.write.MediaBrowserCompat$CustomActionResultReceiver(menu, getMenuInflater());
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView((View) null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    /* access modifiers changed from: package-private */
    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.IconCompatParcelizer.write.onCreateView(view, str, context, attributeSet);
    }

    /* JADX INFO: finally extract failed */
    public void onDestroy() {
        super.onDestroy();
        if (this.mViewModelStore != null && !isChangingConfigurations()) {
            this.mViewModelStore.write();
        }
        setLayoutResource setlayoutresource = this.mFragments.IconCompatParcelizer.write;
        setlayoutresource.MediaMetadataCompat = true;
        setlayoutresource.PlaybackStateCompat$CustomAction();
        try {
            setlayoutresource.RatingCompat = true;
            setlayoutresource.MediaBrowserCompat$ItemReceiver(0, false);
            setlayoutresource.RatingCompat = false;
            setlayoutresource.PlaybackStateCompat$CustomAction();
            setlayoutresource.MediaDescriptionCompat = null;
            setlayoutresource.read = null;
            setlayoutresource.MediaBrowserCompat$MediaItem = null;
        } catch (Throwable th) {
            setlayoutresource.RatingCompat = false;
            throw th;
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.IconCompatParcelizer.write.MediaSessionCompat$QueueItem();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.IconCompatParcelizer.write.IconCompatParcelizer(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.mFragments.IconCompatParcelizer.write.MediaBrowserCompat$ItemReceiver(menuItem);
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.mFragments.IconCompatParcelizer.write.MediaBrowserCompat$ItemReceiver(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* JADX INFO: finally extract failed */
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        if (this.mHandler.hasMessages(2)) {
            this.mHandler.removeMessages(2);
            onResumeFragments();
        }
        setLayoutResource setlayoutresource = this.mFragments.IconCompatParcelizer.write;
        try {
            setlayoutresource.RatingCompat = true;
            setlayoutresource.MediaBrowserCompat$ItemReceiver(3, false);
            setlayoutresource.RatingCompat = false;
            setlayoutresource.PlaybackStateCompat$CustomAction();
        } catch (Throwable th) {
            setlayoutresource.RatingCompat = false;
            throw th;
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.IconCompatParcelizer.write.PlaybackStateCompat();
    }

    public void onStateNotSaved() {
        this.mFragments.IconCompatParcelizer.write.PlaybackStateCompat();
    }

    public void onResume() {
        super.onResume();
        this.mHandler.sendEmptyMessage(2);
        this.mResumed = true;
        this.mFragments.IconCompatParcelizer.write.PlaybackStateCompat$CustomAction();
    }

    public void onPostResume() {
        super.onPostResume();
        this.mHandler.removeMessages(2);
        onResumeFragments();
        this.mFragments.IconCompatParcelizer.write.PlaybackStateCompat$CustomAction();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public void onResumeFragments() {
        setLayoutResource setlayoutresource = this.mFragments.IconCompatParcelizer.write;
        setlayoutresource.f2634x50fd9e4a = false;
        setlayoutresource.MediaSessionCompat$ResultReceiverWrapper = false;
        try {
            setlayoutresource.RatingCompat = true;
            setlayoutresource.MediaBrowserCompat$ItemReceiver(4, false);
            setlayoutresource.RatingCompat = false;
            setlayoutresource.PlaybackStateCompat$CustomAction();
        } catch (Throwable th) {
            setlayoutresource.RatingCompat = false;
            throw th;
        }
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return (i != 0 || menu == null) ? super.onPreparePanel(i, view, menu) : onPrepareOptionsPanel(view, menu) | this.mFragments.IconCompatParcelizer.write.MediaBrowserCompat$CustomActionResultReceiver(menu);
    }

    /* access modifiers changed from: protected */
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public final Object onRetainNonConfigurationInstance() {
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        setLayoutResource setlayoutresource = this.mFragments.IconCompatParcelizer.write;
        setLayoutResource.write(setlayoutresource.MediaSessionCompat$QueueItem);
        setLayoutInflater setlayoutinflater = setlayoutresource.MediaSessionCompat$QueueItem;
        if (setlayoutinflater == null && this.mViewModelStore == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        write write2 = new write();
        write2.IconCompatParcelizer = onRetainCustomNonConfigurationInstance;
        write2.write = this.mViewModelStore;
        write2.MediaBrowserCompat$CustomActionResultReceiver = setlayoutinflater;
        return write2;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        markFragmentsCreated();
        Parcelable AlertController$RecycleListView = this.mFragments.IconCompatParcelizer.write.AlertController$RecycleListView();
        if (AlertController$RecycleListView != null) {
            bundle.putParcelable(FRAGMENTS_TAG, AlertController$RecycleListView);
        }
        if (this.mPendingFragmentActivityResults.MediaBrowserCompat$CustomActionResultReceiver() > 0) {
            bundle.putInt(NEXT_CANDIDATE_REQUEST_INDEX_TAG, this.mNextCandidateRequestIndex);
            int[] iArr = new int[this.mPendingFragmentActivityResults.MediaBrowserCompat$CustomActionResultReceiver()];
            String[] strArr = new String[this.mPendingFragmentActivityResults.MediaBrowserCompat$CustomActionResultReceiver()];
            for (int i = 0; i < this.mPendingFragmentActivityResults.MediaBrowserCompat$CustomActionResultReceiver(); i++) {
                iArr[i] = this.mPendingFragmentActivityResults.IconCompatParcelizer(i);
                strArr[i] = this.mPendingFragmentActivityResults.MediaBrowserCompat$SearchResultReceiver(i);
            }
            bundle.putIntArray(ALLOCATED_REQUEST_INDICIES_TAG, iArr);
            bundle.putStringArray(REQUEST_FRAGMENT_WHO_TAG, strArr);
        }
    }

    /* JADX INFO: finally extract failed */
    public void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            setLayoutResource setlayoutresource = this.mFragments.IconCompatParcelizer.write;
            setlayoutresource.f2634x50fd9e4a = false;
            setlayoutresource.MediaSessionCompat$ResultReceiverWrapper = false;
            try {
                setlayoutresource.RatingCompat = true;
                setlayoutresource.MediaBrowserCompat$ItemReceiver(2, false);
                setlayoutresource.RatingCompat = false;
                setlayoutresource.PlaybackStateCompat$CustomAction();
            } catch (Throwable th) {
                setlayoutresource.RatingCompat = false;
                throw th;
            }
        }
        this.mFragments.IconCompatParcelizer.write.PlaybackStateCompat();
        this.mFragments.IconCompatParcelizer.write.PlaybackStateCompat$CustomAction();
        setLayoutResource setlayoutresource2 = this.mFragments.IconCompatParcelizer.write;
        setlayoutresource2.f2634x50fd9e4a = false;
        setlayoutresource2.MediaSessionCompat$ResultReceiverWrapper = false;
        try {
            setlayoutresource2.RatingCompat = true;
            setlayoutresource2.MediaBrowserCompat$ItemReceiver(3, false);
            setlayoutresource2.RatingCompat = false;
            setlayoutresource2.PlaybackStateCompat$CustomAction();
        } catch (Throwable th2) {
            setlayoutresource2.RatingCompat = false;
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        setLayoutResource setlayoutresource = this.mFragments.IconCompatParcelizer.write;
        setlayoutresource.MediaSessionCompat$ResultReceiverWrapper = true;
        try {
            setlayoutresource.RatingCompat = true;
            setlayoutresource.MediaBrowserCompat$ItemReceiver(2, false);
            setlayoutresource.RatingCompat = false;
            setlayoutresource.PlaybackStateCompat$CustomAction();
        } catch (Throwable th) {
            setlayoutresource.RatingCompat = false;
            throw th;
        }
    }

    public Object getLastCustomNonConfigurationInstance() {
        write write2 = (write) getLastNonConfigurationInstance();
        if (write2 != null) {
            return write2.IconCompatParcelizer;
        }
        return null;
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("  ");
        String obj = sb.toString();
        printWriter.print(obj);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            sizeOf.MediaBrowserCompat$ItemReceiver(this).MediaBrowserCompat$CustomActionResultReceiver(obj, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.IconCompatParcelizer.write.read(str, fileDescriptor, printWriter, strArr);
    }

    public setTitleMarginStart getSupportFragmentManager() {
        return this.mFragments.IconCompatParcelizer.write;
    }

    @Deprecated
    public sizeOf getSupportLoaderManager() {
        return sizeOf.MediaBrowserCompat$ItemReceiver(this);
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    static void checkForValidRequestCode(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    public final void validateRequestPermissionsRequestCode(int i) {
        if (!this.mRequestedPermissionsFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.IconCompatParcelizer.write.PlaybackStateCompat();
        int i2 = (i >> 16) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String MediaBrowserCompat$CustomActionResultReceiver = this.mPendingFragmentActivityResults.MediaBrowserCompat$CustomActionResultReceiver(i3);
            this.mPendingFragmentActivityResults.write(i3);
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                Log.w(TAG, "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment MediaBrowserCompat$CustomActionResultReceiver2 = this.mFragments.IconCompatParcelizer.write.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver);
            if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Activity result no fragment exists for who: ");
                sb.append(MediaBrowserCompat$CustomActionResultReceiver);
                Log.w(TAG, sb.toString());
                return;
            }
            MediaBrowserCompat$CustomActionResultReceiver2.onRequestPermissionsResult(i & Settings.DEFAULT_INITIAL_WINDOW_SIZE, strArr, iArr);
        }
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        this.mStartedActivityFromFragment = true;
        if (i == -1) {
            try {
                AppCompatRatingBar.MediaBrowserCompat$CustomActionResultReceiver(this, intent, -1, bundle);
            } finally {
                this.mStartedActivityFromFragment = false;
            }
        } else {
            checkForValidRequestCode(i);
            AppCompatRatingBar.MediaBrowserCompat$CustomActionResultReceiver(this, intent, ((allocateRequestIndex(fragment) + 1) << 16) + (i & Settings.DEFAULT_INITIAL_WINDOW_SIZE), bundle);
            this.mStartedActivityFromFragment = false;
        }
    }

    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        int i5 = i;
        this.mStartedIntentSenderFromFragment = true;
        if (i5 == -1) {
            try {
                AppCompatRatingBar.MediaBrowserCompat$CustomActionResultReceiver(this, intentSender, i, intent, i2, i3, i4, bundle);
            } finally {
                this.mStartedIntentSenderFromFragment = false;
            }
        } else {
            checkForValidRequestCode(i);
            AppCompatRatingBar.MediaBrowserCompat$CustomActionResultReceiver(this, intentSender, ((allocateRequestIndex(fragment) + 1) << 16) + (i5 & Settings.DEFAULT_INITIAL_WINDOW_SIZE), intent, i2, i3, i4, bundle);
            this.mStartedIntentSenderFromFragment = false;
        }
    }

    private int allocateRequestIndex(Fragment fragment) {
        if (this.mPendingFragmentActivityResults.MediaBrowserCompat$CustomActionResultReceiver() < MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS) {
            while (this.mPendingFragmentActivityResults.MediaBrowserCompat$ItemReceiver(this.mNextCandidateRequestIndex) >= 0) {
                this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS;
            }
            int i = this.mNextCandidateRequestIndex;
            this.mPendingFragmentActivityResults.read(i, fragment.mWho);
            this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % MAX_NUM_PENDING_FRAGMENT_ACTIVITY_RESULTS;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void requestPermissionsFromFragment(Fragment fragment, String[] strArr, int i) {
        if (i == -1) {
            AppCompatRatingBar.write(this, strArr, i);
            return;
        }
        checkForValidRequestCode(i);
        try {
            this.mRequestedPermissionsFromFragment = true;
            AppCompatRatingBar.write(this, strArr, ((allocateRequestIndex(fragment) + 1) << 16) + (i & Settings.DEFAULT_INITIAL_WINDOW_SIZE));
            this.mRequestedPermissionsFromFragment = false;
        } catch (Throwable th) {
            this.mRequestedPermissionsFromFragment = false;
            throw th;
        }
    }

    class read extends setTitleMarginTop<FragmentActivity> {
        public read() {
            super(FragmentActivity.this);
        }

        public final void IconCompatParcelizer(String str, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, (FileDescriptor) null, printWriter, strArr);
        }

        public final boolean MediaMetadataCompat() {
            return !FragmentActivity.this.isFinishing();
        }

        public final LayoutInflater read() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        public final void MediaBrowserCompat$MediaItem() {
            FragmentActivity.this.supportInvalidateOptionsMenu();
        }

        public final void write(Fragment fragment, Intent intent, int i, Bundle bundle) {
            FragmentActivity.this.startActivityFromFragment(fragment, intent, i, bundle);
        }

        public final void read(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
            FragmentActivity.this.startIntentSenderFromFragment(fragment, intentSender, i, intent, i2, i3, i4, bundle);
        }

        public final void MediaBrowserCompat$ItemReceiver(Fragment fragment, String[] strArr, int i) {
            FragmentActivity.this.requestPermissionsFromFragment(fragment, strArr, i);
        }

        public final boolean MediaBrowserCompat$ItemReceiver(String str) {
            return AppCompatRatingBar.write(FragmentActivity.this, str);
        }

        public final boolean MediaBrowserCompat$ItemReceiver() {
            return FragmentActivity.this.getWindow() != null;
        }

        public final int write() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        public final void write(Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        public final View read(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        public final boolean IconCompatParcelizer() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public final /* bridge */ /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver() {
            return FragmentActivity.this;
        }
    }

    private void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), entryRemoved.read.CREATED));
    }

    private static boolean markState(setTitleMarginStart settitlemarginstart, entryRemoved.read read2) {
        boolean z = false;
        for (Fragment next : settitlemarginstart.MediaBrowserCompat$CustomActionResultReceiver()) {
            if (next != null) {
                if (next.getLifecycle().read().compareTo(entryRemoved.read.STARTED) >= 0) {
                    next.mLifecycleRegistry.write(read2);
                    z = true;
                }
                setTitleMarginStart peekChildFragmentManager = next.peekChildFragmentManager();
                if (peekChildFragmentManager != null) {
                    z |= markState(peekChildFragmentManager, read2);
                }
            }
        }
        return z;
    }
}

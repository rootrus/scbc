package p040o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.R;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import okhttp3.internal.cache.DiskLruCache;
import p040o.setLayoutResource;
import p040o.setTitleMarginStart;

/* renamed from: o.setTitleMarginEnd */
final class setTitleMarginEnd extends CardView implements setTitleMarginStart.write, setLayoutResource.MediaMetadataCompat {
    private boolean AlertController$RecycleListView;
    boolean IconCompatParcelizer;
    int Keep;
    int MediaBrowserCompat$CustomActionResultReceiver;
    int MediaBrowserCompat$ItemReceiver;
    String MediaBrowserCompat$MediaItem;
    int MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    int f2646x50fd9e4a;
    int MediaDescriptionCompat = -1;
    final setLayoutResource MediaMetadataCompat;
    boolean MediaSessionCompat$QueueItem = false;
    int MediaSessionCompat$ResultReceiverWrapper;
    ArrayList<String> MediaSessionCompat$Token;
    ArrayList<write> ParcelableVolumeInfo = new ArrayList<>();
    int PlaybackStateCompat;
    ArrayList<String> PlaybackStateCompat$CustomAction;
    int RatingCompat;
    CharSequence read;
    private boolean setHasDecor = true;
    CharSequence write;

    /* renamed from: o.setTitleMarginEnd$write */
    static final class write {
        int IconCompatParcelizer;
        Fragment MediaBrowserCompat$CustomActionResultReceiver;
        int MediaBrowserCompat$ItemReceiver;
        int MediaMetadataCompat;
        int read;
        int write;

        write() {
        }

        write(int i, Fragment fragment) {
            this.read = i;
            this.MediaBrowserCompat$CustomActionResultReceiver = fragment;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.MediaDescriptionCompat >= 0) {
            sb.append(" #");
            sb.append(this.MediaDescriptionCompat);
        }
        if (this.MediaBrowserCompat$MediaItem != null) {
            sb.append(" ");
            sb.append(this.MediaBrowserCompat$MediaItem);
        }
        sb.append("}");
        return sb.toString();
    }

    public setTitleMarginEnd(setLayoutResource setlayoutresource) {
        this.MediaMetadataCompat = setlayoutresource;
    }

    /* access modifiers changed from: package-private */
    public final void read(write write2) {
        this.ParcelableVolumeInfo.add(write2);
        write2.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$SearchResultReceiver;
        write2.IconCompatParcelizer = this.RatingCompat;
        write2.write = this.f2646x50fd9e4a;
        write2.MediaMetadataCompat = this.MediaSessionCompat$ResultReceiverWrapper;
    }

    public final CardView read(Fragment fragment, String str) {
        MediaBrowserCompat$CustomActionResultReceiver(0, fragment, str, 1);
        return this;
    }

    public final CardView MediaBrowserCompat$CustomActionResultReceiver(int i, Fragment fragment) {
        MediaBrowserCompat$CustomActionResultReceiver(i, fragment, (String) null, 1);
        return this;
    }

    public final CardView write(int i, Fragment fragment, String str) {
        MediaBrowserCompat$CustomActionResultReceiver(i, fragment, str, 1);
        return this;
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(cls.getCanonicalName());
            sb.append(" must be a public static class to be  properly recreated from");
            sb.append(" instance state.");
            throw new IllegalStateException(sb.toString());
        }
        fragment.mFragmentManager = this.MediaMetadataCompat;
        if (str != null) {
            if (fragment.mTag == null || str.equals(fragment.mTag)) {
                fragment.mTag = str;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(": was ");
                sb2.append(fragment.mTag);
                sb2.append(" now ");
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (i != 0) {
            if (i == -1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Can't add fragment ");
                sb3.append(fragment);
                sb3.append(" with tag ");
                sb3.append(str);
                sb3.append(" to container view with no id");
                throw new IllegalArgumentException(sb3.toString());
            } else if (fragment.mFragmentId == 0 || fragment.mFragmentId == i) {
                fragment.mFragmentId = i;
                fragment.mContainerId = i;
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Can't change container ID of fragment ");
                sb4.append(fragment);
                sb4.append(": was ");
                sb4.append(fragment.mFragmentId);
                sb4.append(" now ");
                sb4.append(i);
                throw new IllegalStateException(sb4.toString());
            }
        }
        read(new write(i2, fragment));
    }

    public final CardView IconCompatParcelizer(int i, Fragment fragment, String str) {
        if (i != 0) {
            MediaBrowserCompat$CustomActionResultReceiver(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public final CardView write(Fragment fragment) {
        read(new write(3, fragment));
        return this;
    }

    public final CardView MediaBrowserCompat$ItemReceiver(Fragment fragment) {
        read(new write(4, fragment));
        return this;
    }

    public final CardView IconCompatParcelizer(Fragment fragment) {
        read(new write(5, fragment));
        return this;
    }

    public final CardView MediaBrowserCompat$CustomActionResultReceiver(Fragment fragment) {
        read(new write(6, fragment));
        return this;
    }

    public final CardView read(Fragment fragment) {
        read(new write(7, fragment));
        return this;
    }

    public final CardView MediaBrowserCompat$SearchResultReceiver() {
        this.MediaBrowserCompat$SearchResultReceiver = R.anim.f64172130771984;
        this.RatingCompat = R.anim.f64162130771983;
        this.f2646x50fd9e4a = R.anim.f64172130771984;
        this.MediaSessionCompat$ResultReceiverWrapper = R.anim.f64162130771983;
        return this;
    }

    public final CardView MediaBrowserCompat$CustomActionResultReceiver(String str) {
        if (this.setHasDecor) {
            this.IconCompatParcelizer = true;
            this.MediaBrowserCompat$MediaItem = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (this.IconCompatParcelizer) {
            boolean z = setLayoutResource.IconCompatParcelizer;
            int size = this.ParcelableVolumeInfo.size();
            for (int i2 = 0; i2 < size; i2++) {
                write write2 = this.ParcelableVolumeInfo.get(i2);
                if (write2.MediaBrowserCompat$CustomActionResultReceiver != null) {
                    write2.MediaBrowserCompat$CustomActionResultReceiver.mBackStackNesting += i;
                    boolean z2 = setLayoutResource.IconCompatParcelizer;
                }
            }
        }
    }

    public final int write() {
        return read(false);
    }

    public final int IconCompatParcelizer() {
        return read(true);
    }

    private int read(boolean z) {
        if (!this.AlertController$RecycleListView) {
            boolean z2 = setLayoutResource.IconCompatParcelizer;
            this.AlertController$RecycleListView = true;
            if (this.IconCompatParcelizer) {
                this.MediaDescriptionCompat = this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver(this);
            } else {
                this.MediaDescriptionCompat = -1;
            }
            this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver((setLayoutResource.MediaMetadataCompat) this, z);
            return this.MediaDescriptionCompat;
        }
        throw new IllegalStateException("commit already called");
    }

    public final boolean MediaBrowserCompat$ItemReceiver(ArrayList<setTitleMarginEnd> arrayList, ArrayList<Boolean> arrayList2) {
        boolean z = setLayoutResource.IconCompatParcelizer;
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.IconCompatParcelizer) {
            return true;
        }
        setLayoutResource setlayoutresource = this.MediaMetadataCompat;
        if (setlayoutresource.MediaBrowserCompat$CustomActionResultReceiver == null) {
            setlayoutresource.MediaBrowserCompat$CustomActionResultReceiver = new ArrayList<>();
        }
        setlayoutresource.MediaBrowserCompat$CustomActionResultReceiver.add(this);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean read(int i) {
        int size = this.ParcelableVolumeInfo.size();
        for (int i2 = 0; i2 < size; i2++) {
            write write2 = this.ParcelableVolumeInfo.get(i2);
            int i3 = write2.MediaBrowserCompat$CustomActionResultReceiver != null ? write2.MediaBrowserCompat$CustomActionResultReceiver.mContainerId : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean MediaBrowserCompat$CustomActionResultReceiver(ArrayList<setTitleMarginEnd> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.ParcelableVolumeInfo.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            write write2 = this.ParcelableVolumeInfo.get(i4);
            int i5 = write2.MediaBrowserCompat$CustomActionResultReceiver != null ? write2.MediaBrowserCompat$CustomActionResultReceiver.mContainerId : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    setTitleMarginEnd settitlemarginend = arrayList.get(i6);
                    int size2 = settitlemarginend.ParcelableVolumeInfo.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        write write3 = settitlemarginend.ParcelableVolumeInfo.get(i7);
                        if ((write3.MediaBrowserCompat$CustomActionResultReceiver != null ? write3.MediaBrowserCompat$CustomActionResultReceiver.mContainerId : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void read() {
        int size = this.ParcelableVolumeInfo.size();
        for (int i = 0; i < size; i++) {
            write write2 = this.ParcelableVolumeInfo.get(i);
            Fragment fragment = write2.MediaBrowserCompat$CustomActionResultReceiver;
            if (fragment != null) {
                fragment.setNextTransition(this.Keep, this.PlaybackStateCompat);
            }
            switch (write2.read) {
                case 1:
                    fragment.setNextAnim(write2.MediaBrowserCompat$ItemReceiver);
                    this.MediaMetadataCompat.write(fragment, false);
                    break;
                case 3:
                    fragment.setNextAnim(write2.IconCompatParcelizer);
                    this.MediaMetadataCompat.MediaDescriptionCompat(fragment);
                    break;
                case 4:
                    fragment.setNextAnim(write2.IconCompatParcelizer);
                    setLayoutResource.MediaBrowserCompat$ItemReceiver(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(write2.MediaBrowserCompat$ItemReceiver);
                    setLayoutResource.RatingCompat(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(write2.IconCompatParcelizer);
                    this.MediaMetadataCompat.read(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(write2.MediaBrowserCompat$ItemReceiver);
                    this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver(fragment);
                    break;
                case 8:
                    this.MediaMetadataCompat.MediaBrowserCompat$SearchResultReceiver(fragment);
                    break;
                case 9:
                    this.MediaMetadataCompat.MediaBrowserCompat$SearchResultReceiver((Fragment) null);
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cmd: ");
                    sb.append(write2.read);
                    throw new IllegalArgumentException(sb.toString());
            }
            if (!(this.MediaSessionCompat$QueueItem || write2.read == 1 || fragment == null)) {
                this.MediaMetadataCompat.MediaMetadataCompat(fragment);
            }
        }
        if (!this.MediaSessionCompat$QueueItem) {
            setLayoutResource setlayoutresource = this.MediaMetadataCompat;
            setlayoutresource.MediaBrowserCompat$ItemReceiver(setlayoutresource.write, true);
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        for (int size = this.ParcelableVolumeInfo.size() - 1; size >= 0; size--) {
            write write2 = this.ParcelableVolumeInfo.get(size);
            Fragment fragment = write2.MediaBrowserCompat$CustomActionResultReceiver;
            if (fragment != null) {
                fragment.setNextTransition(setLayoutResource.IconCompatParcelizer(this.Keep), this.PlaybackStateCompat);
            }
            switch (write2.read) {
                case 1:
                    fragment.setNextAnim(write2.MediaMetadataCompat);
                    this.MediaMetadataCompat.MediaDescriptionCompat(fragment);
                    break;
                case 3:
                    fragment.setNextAnim(write2.write);
                    this.MediaMetadataCompat.write(fragment, false);
                    break;
                case 4:
                    fragment.setNextAnim(write2.write);
                    setLayoutResource.RatingCompat(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(write2.MediaMetadataCompat);
                    setLayoutResource.MediaBrowserCompat$ItemReceiver(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(write2.write);
                    this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(write2.MediaMetadataCompat);
                    this.MediaMetadataCompat.read(fragment);
                    break;
                case 8:
                    this.MediaMetadataCompat.MediaBrowserCompat$SearchResultReceiver((Fragment) null);
                    break;
                case 9:
                    this.MediaMetadataCompat.MediaBrowserCompat$SearchResultReceiver(fragment);
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cmd: ");
                    sb.append(write2.read);
                    throw new IllegalArgumentException(sb.toString());
            }
            if (!(this.MediaSessionCompat$QueueItem || write2.read == 3 || fragment == null)) {
                this.MediaMetadataCompat.MediaMetadataCompat(fragment);
            }
        }
        if (!this.MediaSessionCompat$QueueItem && z) {
            setLayoutResource setlayoutresource = this.MediaMetadataCompat;
            setlayoutresource.MediaBrowserCompat$ItemReceiver(setlayoutresource.write, true);
        }
    }

    /* access modifiers changed from: package-private */
    public final Fragment MediaBrowserCompat$ItemReceiver(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.ParcelableVolumeInfo.size()) {
            write write2 = this.ParcelableVolumeInfo.get(i);
            int i2 = write2.read;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = write2.MediaBrowserCompat$CustomActionResultReceiver;
                    int i3 = fragment3.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.mContainerId == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.ParcelableVolumeInfo.add(i, new write(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                write write3 = new write(3, fragment4);
                                write3.MediaBrowserCompat$ItemReceiver = write2.MediaBrowserCompat$ItemReceiver;
                                write3.write = write2.write;
                                write3.IconCompatParcelizer = write2.IconCompatParcelizer;
                                write3.MediaMetadataCompat = write2.MediaMetadataCompat;
                                this.ParcelableVolumeInfo.add(i, write3);
                                arrayList2.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.ParcelableVolumeInfo.remove(i);
                        i--;
                    } else {
                        write2.read = 1;
                        arrayList2.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(write2.MediaBrowserCompat$CustomActionResultReceiver);
                    if (write2.MediaBrowserCompat$CustomActionResultReceiver == fragment2) {
                        this.ParcelableVolumeInfo.add(i, new write(9, write2.MediaBrowserCompat$CustomActionResultReceiver));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.ParcelableVolumeInfo.add(i, new write(9, fragment2));
                        i++;
                        fragment2 = write2.MediaBrowserCompat$CustomActionResultReceiver;
                    }
                }
                i++;
            }
            arrayList2.add(write2.MediaBrowserCompat$CustomActionResultReceiver);
            i++;
        }
        return fragment2;
    }

    /* access modifiers changed from: package-private */
    public final Fragment write(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int i = 0; i < this.ParcelableVolumeInfo.size(); i++) {
            write write2 = this.ParcelableVolumeInfo.get(i);
            int i2 = write2.read;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = write2.MediaBrowserCompat$CustomActionResultReceiver;
                            break;
                    }
                }
                arrayList.add(write2.MediaBrowserCompat$CustomActionResultReceiver);
            }
            arrayList.remove(write2.MediaBrowserCompat$CustomActionResultReceiver);
        }
        return fragment;
    }

    /* access modifiers changed from: package-private */
    public final void write(Fragment$MediaBrowserCompat$ItemReceiver fragment$MediaBrowserCompat$ItemReceiver) {
        for (int i = 0; i < this.ParcelableVolumeInfo.size(); i++) {
            write write2 = this.ParcelableVolumeInfo.get(i);
            if (MediaBrowserCompat$CustomActionResultReceiver(write2)) {
                write2.MediaBrowserCompat$CustomActionResultReceiver.setOnStartEnterTransitionListener(fragment$MediaBrowserCompat$ItemReceiver);
            }
        }
    }

    static boolean MediaBrowserCompat$CustomActionResultReceiver(write write2) {
        Fragment fragment = write2.MediaBrowserCompat$CustomActionResultReceiver;
        return fragment != null && fragment.mAdded && fragment.mView != null && !fragment.mDetached && !fragment.mHidden && fragment.isPostponed();
    }

    public final String MediaDescriptionCompat() {
        return this.MediaBrowserCompat$MediaItem;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (!this.IconCompatParcelizer) {
            this.setHasDecor = false;
            this.MediaMetadataCompat.read((setLayoutResource.MediaMetadataCompat) this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (!this.IconCompatParcelizer) {
            this.setHasDecor = false;
            this.MediaMetadataCompat.read((setLayoutResource.MediaMetadataCompat) this, true);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, PrintWriter printWriter) {
        String str2;
        printWriter.print(str);
        printWriter.print("mName=");
        printWriter.print(this.MediaBrowserCompat$MediaItem);
        printWriter.print(" mIndex=");
        printWriter.print(this.MediaDescriptionCompat);
        printWriter.print(" mCommitted=");
        printWriter.println(this.AlertController$RecycleListView);
        if (this.Keep != 0) {
            printWriter.print(str);
            printWriter.print("mTransition=#");
            printWriter.print(Integer.toHexString(this.Keep));
            printWriter.print(" mTransitionStyle=#");
            printWriter.println(Integer.toHexString(this.PlaybackStateCompat));
        }
        if (!(this.MediaBrowserCompat$SearchResultReceiver == 0 && this.RatingCompat == 0)) {
            printWriter.print(str);
            printWriter.print("mEnterAnim=#");
            printWriter.print(Integer.toHexString(this.MediaBrowserCompat$SearchResultReceiver));
            printWriter.print(" mExitAnim=#");
            printWriter.println(Integer.toHexString(this.RatingCompat));
        }
        if (!(this.f2646x50fd9e4a == 0 && this.MediaSessionCompat$ResultReceiverWrapper == 0)) {
            printWriter.print(str);
            printWriter.print("mPopEnterAnim=#");
            printWriter.print(Integer.toHexString(this.f2646x50fd9e4a));
            printWriter.print(" mPopExitAnim=#");
            printWriter.println(Integer.toHexString(this.MediaSessionCompat$ResultReceiverWrapper));
        }
        if (!(this.MediaBrowserCompat$CustomActionResultReceiver == 0 && this.write == null)) {
            printWriter.print(str);
            printWriter.print("mBreadCrumbTitleRes=#");
            printWriter.print(Integer.toHexString(this.MediaBrowserCompat$CustomActionResultReceiver));
            printWriter.print(" mBreadCrumbTitleText=");
            printWriter.println(this.write);
        }
        if (!(this.MediaBrowserCompat$ItemReceiver == 0 && this.read == null)) {
            printWriter.print(str);
            printWriter.print("mBreadCrumbShortTitleRes=#");
            printWriter.print(Integer.toHexString(this.MediaBrowserCompat$ItemReceiver));
            printWriter.print(" mBreadCrumbShortTitleText=");
            printWriter.println(this.read);
        }
        if (!this.ParcelableVolumeInfo.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.ParcelableVolumeInfo.size();
            for (int i = 0; i < size; i++) {
                write write2 = this.ParcelableVolumeInfo.get(i);
                switch (write2.read) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = DiskLruCache.REMOVE;
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("cmd=");
                        sb.append(write2.read);
                        str2 = sb.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(write2.MediaBrowserCompat$CustomActionResultReceiver);
                if (!(write2.MediaBrowserCompat$ItemReceiver == 0 && write2.IconCompatParcelizer == 0)) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(write2.MediaBrowserCompat$ItemReceiver));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(write2.IconCompatParcelizer));
                }
                if (write2.write != 0 || write2.MediaMetadataCompat != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(write2.write));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(write2.MediaMetadataCompat));
                }
            }
        }
    }

    public final CardView MediaBrowserCompat$ItemReceiver(int i, Fragment fragment) {
        if (i != 0) {
            MediaBrowserCompat$CustomActionResultReceiver(i, fragment, (String) null, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }
}

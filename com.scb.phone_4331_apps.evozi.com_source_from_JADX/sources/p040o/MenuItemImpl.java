package p040o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.internal.http2.Settings;
import p040o.SearchView;

/* renamed from: o.MenuItemImpl */
public class MenuItemImpl implements setHorizontalGravity {
    private static final int[] PlaybackStateCompat = {1, 4, 5, 3, 2, 0};
    private boolean AlertController$RecycleListView = false;
    private final Resources AppCompatActivity;
    private ArrayList<androidx.appcompat.view.menu.MenuItemImpl> AppCompatDelegateImpl$ListMenuDecorView = new ArrayList<>();
    private boolean AppCompatDialogFragment;
    public ArrayList<androidx.appcompat.view.menu.MenuItemImpl> IconCompatParcelizer;
    public boolean Keep = false;
    public MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver = 0;
    Drawable MediaBrowserCompat$MediaItem;
    View MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public CopyOnWriteArrayList<WeakReference<setStackedBackground>> f2552x50fd9e4a = new CopyOnWriteArrayList<>();
    public boolean MediaDescriptionCompat;
    CharSequence MediaMetadataCompat;
    public ArrayList<androidx.appcompat.view.menu.MenuItemImpl> MediaSessionCompat$QueueItem;
    public boolean MediaSessionCompat$ResultReceiverWrapper;
    public boolean MediaSessionCompat$Token = false;
    public ArrayList<androidx.appcompat.view.menu.MenuItemImpl> ParcelableVolumeInfo;
    public boolean PlaybackStateCompat$CustomAction = false;
    public boolean RatingCompat;
    androidx.appcompat.view.menu.MenuItemImpl read;
    private ArrayList<androidx.appcompat.view.menu.MenuItemImpl> setBackgroundResource;
    private boolean setContentView;
    private boolean setHasDecor = false;
    public final Context write;

    /* renamed from: o.MenuItemImpl$write */
    public interface write {
        boolean MediaBrowserCompat$ItemReceiver(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl);
    }

    /* access modifiers changed from: protected */
    public String IconCompatParcelizer() {
        return "android:menu:actionviewstates";
    }

    public MenuItemImpl write() {
        return this;
    }

    public MenuItemImpl(Context context) {
        boolean z = false;
        this.write = context;
        this.AppCompatActivity = context.getResources();
        this.MediaSessionCompat$QueueItem = new ArrayList<>();
        this.setBackgroundResource = new ArrayList<>();
        this.RatingCompat = true;
        this.IconCompatParcelizer = new ArrayList<>();
        this.ParcelableVolumeInfo = new ArrayList<>();
        this.MediaDescriptionCompat = true;
        if (this.AppCompatActivity.getConfiguration().keyboard != 1 && SearchView.SearchAutoComplete.write(ViewConfiguration.get(this.write), this.write)) {
            z = true;
        }
        this.setContentView = z;
    }

    public final void write(setStackedBackground setstackedbackground) {
        Iterator<WeakReference<setStackedBackground>> it = this.f2552x50fd9e4a.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            setStackedBackground setstackedbackground2 = (setStackedBackground) next.get();
            if (setstackedbackground2 == null || setstackedbackground2 == setstackedbackground) {
                this.f2552x50fd9e4a.remove(next);
            }
        }
    }

    private boolean MediaBrowserCompat$ItemReceiver(setCustomView setcustomview, setStackedBackground setstackedbackground) {
        boolean z = false;
        if (this.f2552x50fd9e4a.isEmpty()) {
            return false;
        }
        if (setstackedbackground != null) {
            z = setstackedbackground.MediaBrowserCompat$CustomActionResultReceiver(setcustomview);
        }
        Iterator<WeakReference<setStackedBackground>> it = this.f2552x50fd9e4a.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            setStackedBackground setstackedbackground2 = (setStackedBackground) next.get();
            if (setstackedbackground2 == null) {
                this.f2552x50fd9e4a.remove(next);
            } else if (!z) {
                z = setstackedbackground2.MediaBrowserCompat$CustomActionResultReceiver(setcustomview);
            }
        }
        return z;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((setCustomView) item.getSubMenu()).MediaBrowserCompat$CustomActionResultReceiver(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(IconCompatParcelizer(), sparseArray);
        }
    }

    public final void read(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(IconCompatParcelizer());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((setCustomView) item.getSubMenu()).read(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver menuItemImpl$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = menuItemImpl$MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* access modifiers changed from: protected */
    public final MenuItem MediaBrowserCompat$ItemReceiver(int i, int i2, int i3, CharSequence charSequence) {
        int MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(i3);
        androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = new androidx.appcompat.view.menu.MenuItemImpl(this, i, i2, i3, MediaBrowserCompat$CustomActionResultReceiver2, charSequence, this.MediaBrowserCompat$ItemReceiver);
        ArrayList<androidx.appcompat.view.menu.MenuItemImpl> arrayList = this.MediaSessionCompat$QueueItem;
        arrayList.add(MediaBrowserCompat$CustomActionResultReceiver(arrayList, MediaBrowserCompat$CustomActionResultReceiver2), menuItemImpl);
        IconCompatParcelizer(true);
        return menuItemImpl;
    }

    public MenuItem add(CharSequence charSequence) {
        return MediaBrowserCompat$ItemReceiver(0, 0, 0, charSequence);
    }

    public MenuItem add(int i) {
        return MediaBrowserCompat$ItemReceiver(0, 0, 0, this.AppCompatActivity.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return MediaBrowserCompat$ItemReceiver(i, i2, i3, charSequence);
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return MediaBrowserCompat$ItemReceiver(i, i2, i3, this.AppCompatActivity.getString(i4));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.AppCompatActivity.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = (androidx.appcompat.view.menu.MenuItemImpl) MediaBrowserCompat$ItemReceiver(i, i2, i3, charSequence);
        setCustomView setcustomview = new setCustomView(this.write, this, menuItemImpl);
        menuItemImpl.MediaSessionCompat$ResultReceiverWrapper = setcustomview;
        setcustomview.setHeaderTitle(menuItemImpl.getTitle());
        return setcustomview;
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.AppCompatActivity.getString(i4));
    }

    public void setGroupDividerEnabled(boolean z) {
        this.setHasDecor = z;
    }

    public boolean read() {
        return this.setHasDecor;
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.write.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    private void MediaBrowserCompat$ItemReceiver(int i, boolean z) {
        if (i >= 0 && i < this.MediaSessionCompat$QueueItem.size()) {
            this.MediaSessionCompat$QueueItem.remove(i);
            if (z) {
                IconCompatParcelizer(true);
            }
        }
    }

    public void clear() {
        androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = this.read;
        if (menuItemImpl != null) {
            MediaBrowserCompat$ItemReceiver(menuItemImpl);
        }
        this.MediaSessionCompat$QueueItem.clear();
        IconCompatParcelizer(true);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.MediaSessionCompat$QueueItem.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = this.MediaSessionCompat$QueueItem.get(i2);
            if (menuItemImpl.getGroupId() == i) {
                menuItemImpl.MediaBrowserCompat$ItemReceiver = (menuItemImpl.MediaBrowserCompat$ItemReceiver & -5) | (z2 ? 4 : 0);
                menuItemImpl.setCheckable(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.MediaSessionCompat$QueueItem.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = this.MediaSessionCompat$QueueItem.get(i2);
            if (menuItemImpl.getGroupId() == i && menuItemImpl.MediaBrowserCompat$CustomActionResultReceiver(z)) {
                z2 = true;
            }
        }
        if (z2) {
            IconCompatParcelizer(true);
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.MediaSessionCompat$QueueItem.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = this.MediaSessionCompat$QueueItem.get(i2);
            if (menuItemImpl.getGroupId() == i) {
                menuItemImpl.setEnabled(z);
            }
        }
    }

    public boolean hasVisibleItems() {
        if (this.MediaSessionCompat$ResultReceiverWrapper) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.MediaSessionCompat$QueueItem.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = this.MediaSessionCompat$QueueItem.get(i2);
            if (menuItemImpl.getItemId() == i) {
                return menuItemImpl;
            }
            if (menuItemImpl.hasSubMenu() && (findItem = menuItemImpl.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public int size() {
        return this.MediaSessionCompat$QueueItem.size();
    }

    public MenuItem getItem(int i) {
        return this.MediaSessionCompat$QueueItem.get(i);
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return IconCompatParcelizer(i, keyEvent) != null;
    }

    public void setQwertyMode(boolean z) {
        this.AppCompatDialogFragment = z;
        IconCompatParcelizer(false);
    }

    private static int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = PlaybackStateCompat;
            if (i2 < iArr.length) {
                return (i & Settings.DEFAULT_INITIAL_WINDOW_SIZE) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public boolean RatingCompat() {
        return this.AppCompatDialogFragment;
    }

    public boolean MediaBrowserCompat$MediaItem() {
        return this.setContentView;
    }

    public boolean MediaBrowserCompat$CustomActionResultReceiver(MenuItemImpl menuItemImpl, MenuItem menuItem) {
        MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver menuItemImpl$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        return menuItemImpl$MediaBrowserCompat$CustomActionResultReceiver != null && menuItemImpl$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(menuItemImpl, menuItem);
    }

    private static int MediaBrowserCompat$CustomActionResultReceiver(ArrayList<androidx.appcompat.view.menu.MenuItemImpl> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).MediaBrowserCompat$CustomActionResultReceiver <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        androidx.appcompat.view.menu.MenuItemImpl IconCompatParcelizer2 = IconCompatParcelizer(i, keyEvent);
        if (IconCompatParcelizer2 != null) {
            z = MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2, (setStackedBackground) null, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            read(true);
        }
        return z;
    }

    private void read(List<androidx.appcompat.view.menu.MenuItemImpl> list, int i, KeyEvent keyEvent) {
        boolean RatingCompat2 = RatingCompat();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.MediaSessionCompat$QueueItem.size();
            for (int i2 = 0; i2 < size; i2++) {
                androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = this.MediaSessionCompat$QueueItem.get(i2);
                if (menuItemImpl.hasSubMenu()) {
                    ((MenuItemImpl) menuItemImpl.getSubMenu()).read(list, i, keyEvent);
                }
                char alphabeticShortcut = RatingCompat2 ? menuItemImpl.getAlphabeticShortcut() : menuItemImpl.getNumericShortcut();
                if (((modifiers & 69647) == ((RatingCompat2 ? menuItemImpl.getAlphabeticModifiers() : menuItemImpl.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (RatingCompat2 && alphabeticShortcut == 8 && i == 67)) && menuItemImpl.isEnabled())) {
                    list.add(menuItemImpl);
                }
            }
        }
    }

    private androidx.appcompat.view.menu.MenuItemImpl IconCompatParcelizer(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<androidx.appcompat.view.menu.MenuItemImpl> arrayList = this.AppCompatDelegateImpl$ListMenuDecorView;
        arrayList.clear();
        read(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean RatingCompat2 = RatingCompat();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = arrayList.get(i2);
            if (RatingCompat2) {
                c = menuItemImpl.getAlphabeticShortcut();
            } else {
                c = menuItemImpl.getNumericShortcut();
            }
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (RatingCompat2 && c == 8 && i == 67))) {
                return menuItemImpl;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return MediaBrowserCompat$ItemReceiver(findItem(i), (setStackedBackground) null, i2);
    }

    public final boolean MediaBrowserCompat$ItemReceiver(MenuItem menuItem, setStackedBackground setstackedbackground, int i) {
        androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = (androidx.appcompat.view.menu.MenuItemImpl) menuItem;
        if (menuItemImpl == null || !menuItemImpl.isEnabled()) {
            return false;
        }
        boolean IconCompatParcelizer2 = menuItemImpl.IconCompatParcelizer();
        setMaxWidth setmaxwidth = menuItemImpl.IconCompatParcelizer;
        boolean z = setmaxwidth != null && setmaxwidth.MediaBrowserCompat$CustomActionResultReceiver();
        if (menuItemImpl.MediaBrowserCompat$ItemReceiver()) {
            IconCompatParcelizer2 |= menuItemImpl.expandActionView();
            if (IconCompatParcelizer2) {
                read(true);
            }
        } else if (menuItemImpl.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                read(false);
            }
            if (!menuItemImpl.hasSubMenu()) {
                setCustomView setcustomview = new setCustomView(this.write, this, menuItemImpl);
                menuItemImpl.MediaSessionCompat$ResultReceiverWrapper = setcustomview;
                setcustomview.setHeaderTitle(menuItemImpl.getTitle());
            }
            setCustomView setcustomview2 = (setCustomView) menuItemImpl.getSubMenu();
            if (z) {
                setmaxwidth.read(setcustomview2);
            }
            IconCompatParcelizer2 |= MediaBrowserCompat$ItemReceiver(setcustomview2, setstackedbackground);
            if (!IconCompatParcelizer2) {
                read(true);
            }
        } else if ((i & 1) == 0) {
            read(true);
        }
        return IconCompatParcelizer2;
    }

    public final void read(boolean z) {
        if (!this.AlertController$RecycleListView) {
            this.AlertController$RecycleListView = true;
            Iterator<WeakReference<setStackedBackground>> it = this.f2552x50fd9e4a.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                setStackedBackground setstackedbackground = (setStackedBackground) next.get();
                if (setstackedbackground == null) {
                    this.f2552x50fd9e4a.remove(next);
                } else {
                    setstackedbackground.MediaBrowserCompat$ItemReceiver(this, z);
                }
            }
            this.AlertController$RecycleListView = false;
        }
    }

    public void close() {
        read(true);
    }

    public void IconCompatParcelizer(boolean z) {
        if (!this.PlaybackStateCompat$CustomAction) {
            if (z) {
                this.RatingCompat = true;
                this.MediaDescriptionCompat = true;
            }
            if (!this.f2552x50fd9e4a.isEmpty()) {
                if (!this.PlaybackStateCompat$CustomAction) {
                    this.PlaybackStateCompat$CustomAction = true;
                    this.MediaSessionCompat$Token = false;
                    this.Keep = false;
                }
                Iterator<WeakReference<setStackedBackground>> it = this.f2552x50fd9e4a.iterator();
                while (it.hasNext()) {
                    WeakReference next = it.next();
                    setStackedBackground setstackedbackground = (setStackedBackground) next.get();
                    if (setstackedbackground == null) {
                        this.f2552x50fd9e4a.remove(next);
                    } else {
                        setstackedbackground.write(z);
                    }
                }
                this.PlaybackStateCompat$CustomAction = false;
                if (this.MediaSessionCompat$Token) {
                    this.MediaSessionCompat$Token = false;
                    IconCompatParcelizer(this.Keep);
                    return;
                }
                return;
            }
            return;
        }
        this.MediaSessionCompat$Token = true;
        if (z) {
            this.Keep = true;
        }
    }

    public final ArrayList<androidx.appcompat.view.menu.MenuItemImpl> MediaBrowserCompat$ItemReceiver() {
        if (!this.RatingCompat) {
            return this.setBackgroundResource;
        }
        this.setBackgroundResource.clear();
        int size = this.MediaSessionCompat$QueueItem.size();
        for (int i = 0; i < size; i++) {
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = this.MediaSessionCompat$QueueItem.get(i);
            if (menuItemImpl.isVisible()) {
                this.setBackgroundResource.add(menuItemImpl);
            }
        }
        this.RatingCompat = false;
        this.MediaDescriptionCompat = true;
        return this.setBackgroundResource;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        ArrayList<androidx.appcompat.view.menu.MenuItemImpl> MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
        if (this.MediaDescriptionCompat) {
            Iterator<WeakReference<setStackedBackground>> it = this.f2552x50fd9e4a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                setStackedBackground setstackedbackground = (setStackedBackground) next.get();
                if (setstackedbackground == null) {
                    this.f2552x50fd9e4a.remove(next);
                } else {
                    z |= setstackedbackground.read();
                }
            }
            if (z) {
                this.IconCompatParcelizer.clear();
                this.ParcelableVolumeInfo.clear();
                int size = MediaBrowserCompat$ItemReceiver2.size();
                for (int i = 0; i < size; i++) {
                    androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = MediaBrowserCompat$ItemReceiver2.get(i);
                    if ((menuItemImpl.MediaBrowserCompat$ItemReceiver & 32) == 32) {
                        this.IconCompatParcelizer.add(menuItemImpl);
                    } else {
                        this.ParcelableVolumeInfo.add(menuItemImpl);
                    }
                }
            } else {
                this.IconCompatParcelizer.clear();
                this.ParcelableVolumeInfo.clear();
                this.ParcelableVolumeInfo.addAll(MediaBrowserCompat$ItemReceiver());
            }
            this.MediaDescriptionCompat = false;
        }
    }

    public void clearHeader() {
        this.MediaBrowserCompat$MediaItem = null;
        this.MediaMetadataCompat = null;
        this.MediaBrowserCompat$SearchResultReceiver = null;
        IconCompatParcelizer(false);
    }

    /* access modifiers changed from: protected */
    public final MenuItemImpl write(CharSequence charSequence) {
        write(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public final MenuItemImpl MediaBrowserCompat$ItemReceiver(int i) {
        write(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public final MenuItemImpl read(Drawable drawable) {
        write(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public final MenuItemImpl write(int i) {
        write(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public final MenuItemImpl read(View view) {
        write(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public boolean read(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        if (this.f2552x50fd9e4a.isEmpty()) {
            return false;
        }
        if (!this.PlaybackStateCompat$CustomAction) {
            this.PlaybackStateCompat$CustomAction = true;
            this.MediaSessionCompat$Token = false;
            this.Keep = false;
        }
        Iterator<WeakReference<setStackedBackground>> it = this.f2552x50fd9e4a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            WeakReference next = it.next();
            setStackedBackground setstackedbackground = (setStackedBackground) next.get();
            if (setstackedbackground == null) {
                this.f2552x50fd9e4a.remove(next);
            } else {
                z = setstackedbackground.MediaBrowserCompat$ItemReceiver(menuItemImpl);
                if (z) {
                    break;
                }
            }
        }
        this.PlaybackStateCompat$CustomAction = false;
        if (this.MediaSessionCompat$Token) {
            this.MediaSessionCompat$Token = false;
            IconCompatParcelizer(this.Keep);
        }
        if (z) {
            this.read = menuItemImpl;
        }
        return z;
    }

    public boolean MediaBrowserCompat$ItemReceiver(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        if (this.f2552x50fd9e4a.isEmpty() || this.read != menuItemImpl) {
            return false;
        }
        if (!this.PlaybackStateCompat$CustomAction) {
            this.PlaybackStateCompat$CustomAction = true;
            this.MediaSessionCompat$Token = false;
            this.Keep = false;
        }
        Iterator<WeakReference<setStackedBackground>> it = this.f2552x50fd9e4a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            WeakReference next = it.next();
            setStackedBackground setstackedbackground = (setStackedBackground) next.get();
            if (setstackedbackground == null) {
                this.f2552x50fd9e4a.remove(next);
            } else {
                z = setstackedbackground.write(menuItemImpl);
                if (z) {
                    break;
                }
            }
        }
        this.PlaybackStateCompat$CustomAction = false;
        if (this.MediaSessionCompat$Token) {
            this.MediaSessionCompat$Token = false;
            IconCompatParcelizer(this.Keep);
        }
        if (z) {
            this.read = null;
        }
        return z;
    }

    private void write(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.AppCompatActivity;
        if (view != null) {
            this.MediaBrowserCompat$SearchResultReceiver = view;
            this.MediaMetadataCompat = null;
            this.MediaBrowserCompat$MediaItem = null;
        } else {
            if (i > 0) {
                this.MediaMetadataCompat = resources.getText(i);
            } else if (charSequence != null) {
                this.MediaMetadataCompat = charSequence;
            }
            if (i2 > 0) {
                this.MediaBrowserCompat$MediaItem = setLastBaselineToBottomHeight.write(this.write, i2);
            } else if (drawable != null) {
                this.MediaBrowserCompat$MediaItem = drawable;
            }
            this.MediaBrowserCompat$SearchResultReceiver = null;
        }
        IconCompatParcelizer(false);
    }

    public void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.MediaSessionCompat$QueueItem.get(i2).getGroupId() == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.MediaSessionCompat$QueueItem.size();
            for (int i3 = 0; i3 < size2 - i2 && this.MediaSessionCompat$QueueItem.get(i2).getGroupId() == i; i3++) {
                MediaBrowserCompat$ItemReceiver(i2, false);
            }
            IconCompatParcelizer(true);
        }
    }

    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.MediaSessionCompat$QueueItem.get(i2).getItemId() == i) {
                break;
            } else {
                i2++;
            }
        }
        MediaBrowserCompat$ItemReceiver(i2, true);
    }

    public final void MediaBrowserCompat$ItemReceiver(Bundle bundle) {
        Parcelable RatingCompat2;
        if (!this.f2552x50fd9e4a.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator<WeakReference<setStackedBackground>> it = this.f2552x50fd9e4a.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                setStackedBackground setstackedbackground = (setStackedBackground) next.get();
                if (setstackedbackground == null) {
                    this.f2552x50fd9e4a.remove(next);
                } else {
                    int i_ = setstackedbackground.mo795i_();
                    if (i_ > 0 && (RatingCompat2 = setstackedbackground.RatingCompat()) != null) {
                        sparseArray.put(i_, RatingCompat2);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }
}

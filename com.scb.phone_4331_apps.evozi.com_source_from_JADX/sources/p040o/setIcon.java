package p040o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import okhttp3.internal.http2.Settings;
import org.xmlpull.p042v1.XmlPullParser;
import org.xmlpull.p042v1.XmlPullParserException;

/* renamed from: o.setIcon */
public final class setIcon extends MenuInflater {
    static final Class<?>[] IconCompatParcelizer;
    private static Class<?>[] read;
    Context MediaBrowserCompat$CustomActionResultReceiver;
    final Object[] MediaBrowserCompat$ItemReceiver;
    private Object RatingCompat;
    final Object[] write;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            IconCompatParcelizer = r0
            read = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setIcon.<clinit>():void");
    }

    public setIcon(Context context) {
        super(context);
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
        Object[] objArr = {context};
        this.write = objArr;
        this.MediaBrowserCompat$ItemReceiver = objArr;
    }

    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof setHorizontalGravity)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.MediaBrowserCompat$CustomActionResultReceiver.getResources().getLayout(i);
            MediaBrowserCompat$CustomActionResultReceiver(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        AttributeSet attributeSet2 = attributeSet;
        read read2 = new read(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expecting menu, got ");
                    sb.append(name);
                    throw new RuntimeException(sb.toString());
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlPullParser xmlPullParser2 = xmlPullParser;
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            XmlPullParser xmlPullParser3 = xmlPullParser;
                            str = null;
                            z2 = false;
                            eventType = xmlPullParser.next();
                        } else if (name2.equals("group")) {
                            read2.write = 0;
                            read2.read = 0;
                            read2.MediaBrowserCompat$ItemReceiver = 0;
                            read2.MediaBrowserCompat$CustomActionResultReceiver = 0;
                            read2.RatingCompat = true;
                            read2.IconCompatParcelizer = true;
                        } else if (name2.equals("item")) {
                            if (!read2.MediaSessionCompat$Token) {
                                if (read2.MediaBrowserCompat$SearchResultReceiver == null || !read2.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()) {
                                    read2.MediaSessionCompat$Token = true;
                                    read2.MediaBrowserCompat$CustomActionResultReceiver(read2.setIcon.add(read2.write, read2.AppCompatDelegateImpl$ListMenuDecorView, read2.MediaSessionCompat$ResultReceiverWrapper, read2.setChecked));
                                } else {
                                    read2.read();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            XmlPullParser xmlPullParser4 = xmlPullParser;
                            z = true;
                            eventType = xmlPullParser.next();
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = setIcon.this.MediaBrowserCompat$CustomActionResultReceiver.obtainStyledAttributes(attributeSet2, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuGroup);
                        read2.write = obtainStyledAttributes.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuGroup_android_id, 0);
                        read2.read = obtainStyledAttributes.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuGroup_android_menuCategory, 0);
                        read2.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuGroup_android_orderInCategory, 0);
                        read2.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuGroup_android_checkableBehavior, 0);
                        read2.RatingCompat = obtainStyledAttributes.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuGroup_android_visible, true);
                        read2.IconCompatParcelizer = obtainStyledAttributes.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuGroup_android_enabled, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        TypedArray obtainStyledAttributes2 = setIcon.this.MediaBrowserCompat$CustomActionResultReceiver.obtainStyledAttributes(attributeSet2, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem);
                        read2.AppCompatDelegateImpl$ListMenuDecorView = obtainStyledAttributes2.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_android_id, 0);
                        read2.MediaSessionCompat$ResultReceiverWrapper = (obtainStyledAttributes2.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_android_menuCategory, read2.read) & -65536) | (obtainStyledAttributes2.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_android_orderInCategory, read2.MediaBrowserCompat$ItemReceiver) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        read2.setChecked = obtainStyledAttributes2.getText(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_android_title);
                        read2.ActionMenuItemView = obtainStyledAttributes2.getText(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_android_titleCondensed);
                        read2.setHasDecor = obtainStyledAttributes2.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_android_icon, 0);
                        String string = obtainStyledAttributes2.getString(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_android_alphabeticShortcut);
                        read2.MediaSessionCompat$QueueItem = string == null ? 0 : string.charAt(0);
                        read2.ParcelableVolumeInfo = obtainStyledAttributes2.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_alphabeticModifiers, 4096);
                        String string2 = obtainStyledAttributes2.getString(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_android_numericShortcut);
                        read2.setBackgroundResource = string2 == null ? 0 : string2.charAt(0);
                        read2.setContentView = obtainStyledAttributes2.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_numericModifiers, 4096);
                        if (obtainStyledAttributes2.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_android_checkable)) {
                            read2.f2632x50fd9e4a = obtainStyledAttributes2.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_android_checkable, false) ? 1 : 0;
                        } else {
                            read2.f2632x50fd9e4a = read2.MediaBrowserCompat$CustomActionResultReceiver;
                        }
                        read2.Keep = obtainStyledAttributes2.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_android_checked, false);
                        read2.setExpandedFormat = obtainStyledAttributes2.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_android_visible, read2.RatingCompat);
                        read2.PlaybackStateCompat$CustomAction = obtainStyledAttributes2.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_android_enabled, read2.IconCompatParcelizer);
                        read2.AppCompatViewInflater = obtainStyledAttributes2.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_showAsAction, -1);
                        read2.AppCompatActivity = obtainStyledAttributes2.getString(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_android_onClick);
                        read2.MediaBrowserCompat$MediaItem = obtainStyledAttributes2.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_actionLayout, 0);
                        read2.MediaMetadataCompat = obtainStyledAttributes2.getString(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_actionViewClass);
                        String string3 = obtainStyledAttributes2.getString(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_actionProviderClass);
                        read2.MediaDescriptionCompat = string3;
                        boolean z3 = string3 != null;
                        if (z3 && read2.MediaBrowserCompat$MediaItem == 0 && read2.MediaMetadataCompat == null) {
                            read2.MediaBrowserCompat$SearchResultReceiver = (setMaxWidth) read2.MediaBrowserCompat$ItemReceiver(read2.MediaDescriptionCompat, read, setIcon.this.MediaBrowserCompat$ItemReceiver);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            read2.MediaBrowserCompat$SearchResultReceiver = null;
                        }
                        read2.AlertController$RecycleListView = obtainStyledAttributes2.getText(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_contentDescription);
                        read2.setCheckable = obtainStyledAttributes2.getText(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_tooltipText);
                        if (obtainStyledAttributes2.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_iconTintMode)) {
                            read2.AppCompatDialogFragment = setWindowTitle.write(obtainStyledAttributes2.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_iconTintMode, -1), read2.AppCompatDialogFragment);
                        } else {
                            read2.AppCompatDialogFragment = null;
                        }
                        if (obtainStyledAttributes2.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_iconTint)) {
                            read2.PlaybackStateCompat = obtainStyledAttributes2.getColorStateList(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuItem_iconTint);
                        } else {
                            read2.PlaybackStateCompat = null;
                        }
                        obtainStyledAttributes2.recycle();
                        read2.MediaSessionCompat$Token = false;
                    } else {
                        if (name3.equals("menu")) {
                            MediaBrowserCompat$CustomActionResultReceiver(xmlPullParser, attributeSet2, read2.read());
                        } else {
                            XmlPullParser xmlPullParser5 = xmlPullParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser.next();
                    }
                }
                XmlPullParser xmlPullParser6 = xmlPullParser;
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Object IconCompatParcelizer() {
        if (this.RatingCompat == null) {
            Object obj = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
                obj = ((ContextWrapper) obj).getBaseContext();
                if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
                    obj = MediaBrowserCompat$CustomActionResultReceiver(((ContextWrapper) obj).getBaseContext());
                }
            }
            this.RatingCompat = obj;
        }
        return this.RatingCompat;
    }

    private Object MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? MediaBrowserCompat$CustomActionResultReceiver(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: o.setIcon$write */
    static class write implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] write = {MenuItem.class};
        private Method MediaBrowserCompat$CustomActionResultReceiver;
        private Object MediaBrowserCompat$ItemReceiver;

        public write(Object obj, String str) {
            this.MediaBrowserCompat$ItemReceiver = obj;
            Class<?> cls = obj.getClass();
            try {
                this.MediaBrowserCompat$CustomActionResultReceiver = cls.getMethod(str, write);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't resolve menu item onClick handler ");
                sb.append(str);
                sb.append(" in class ");
                sb.append(cls.getName());
                InflateException inflateException = new InflateException(sb.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.MediaBrowserCompat$CustomActionResultReceiver.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.MediaBrowserCompat$CustomActionResultReceiver.invoke(this.MediaBrowserCompat$ItemReceiver, new Object[]{menuItem})).booleanValue();
                }
                this.MediaBrowserCompat$CustomActionResultReceiver.invoke(this.MediaBrowserCompat$ItemReceiver, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: o.setIcon$read */
    class read {
        CharSequence ActionMenuItemView;
        CharSequence AlertController$RecycleListView;
        String AppCompatActivity;
        int AppCompatDelegateImpl$ListMenuDecorView;
        PorterDuff.Mode AppCompatDialogFragment = null;
        int AppCompatViewInflater;
        boolean IconCompatParcelizer;
        boolean Keep;
        int MediaBrowserCompat$CustomActionResultReceiver;
        int MediaBrowserCompat$ItemReceiver;
        int MediaBrowserCompat$MediaItem;
        setMaxWidth MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        int f2632x50fd9e4a;
        String MediaDescriptionCompat;
        String MediaMetadataCompat;
        char MediaSessionCompat$QueueItem;
        int MediaSessionCompat$ResultReceiverWrapper;
        boolean MediaSessionCompat$Token;
        int ParcelableVolumeInfo;
        ColorStateList PlaybackStateCompat = null;
        boolean PlaybackStateCompat$CustomAction;
        boolean RatingCompat;
        int read;
        char setBackgroundResource;
        CharSequence setCheckable;
        CharSequence setChecked;
        int setContentView;
        boolean setExpandedFormat;
        int setHasDecor;
        Menu setIcon;
        int write;

        public read(Menu menu) {
            this.setIcon = menu;
            this.write = 0;
            this.read = 0;
            this.MediaBrowserCompat$ItemReceiver = 0;
            this.MediaBrowserCompat$CustomActionResultReceiver = 0;
            this.RatingCompat = true;
            this.IconCompatParcelizer = true;
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.Keep).setVisible(this.setExpandedFormat).setEnabled(this.PlaybackStateCompat$CustomAction).setCheckable(this.f2632x50fd9e4a > 0).setTitleCondensed(this.ActionMenuItemView).setIcon(this.setHasDecor);
            int i = this.AppCompatViewInflater;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.AppCompatActivity != null) {
                if (!setIcon.this.MediaBrowserCompat$CustomActionResultReceiver.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new write(setIcon.this.IconCompatParcelizer(), this.AppCompatActivity));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z2 = menuItem instanceof MenuItemImpl;
            if (this.f2632x50fd9e4a >= 2) {
                if (z2) {
                    MenuItemImpl menuItemImpl = (MenuItemImpl) menuItem;
                    menuItemImpl.MediaBrowserCompat$ItemReceiver = (menuItemImpl.MediaBrowserCompat$ItemReceiver & -5) | 4;
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    ((MenuItemWrapperICS) menuItem).MediaBrowserCompat$ItemReceiver(true);
                }
            }
            String str = this.MediaMetadataCompat;
            if (str != null) {
                menuItem.setActionView((View) MediaBrowserCompat$ItemReceiver(str, setIcon.IconCompatParcelizer, setIcon.this.write));
                z = true;
            }
            int i2 = this.MediaBrowserCompat$MediaItem;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            setMaxWidth setmaxwidth = this.MediaBrowserCompat$SearchResultReceiver;
            if (setmaxwidth != null) {
                setOnQueryTextFocusChangeListener.write(menuItem, setmaxwidth);
            }
            setOnQueryTextFocusChangeListener.MediaBrowserCompat$CustomActionResultReceiver(menuItem, this.AlertController$RecycleListView);
            setOnQueryTextFocusChangeListener.MediaBrowserCompat$ItemReceiver(menuItem, this.setCheckable);
            setOnQueryTextFocusChangeListener.read(menuItem, this.MediaSessionCompat$QueueItem, this.ParcelableVolumeInfo);
            setOnQueryTextFocusChangeListener.write(menuItem, this.setBackgroundResource, this.setContentView);
            PorterDuff.Mode mode = this.AppCompatDialogFragment;
            if (mode != null) {
                setOnQueryTextFocusChangeListener.MediaBrowserCompat$CustomActionResultReceiver(menuItem, mode);
            }
            ColorStateList colorStateList = this.PlaybackStateCompat;
            if (colorStateList != null) {
                setOnQueryTextFocusChangeListener.IconCompatParcelizer(menuItem, colorStateList);
            }
        }

        public final SubMenu read() {
            this.MediaSessionCompat$Token = true;
            SubMenu addSubMenu = this.setIcon.addSubMenu(this.write, this.AppCompatDelegateImpl$ListMenuDecorView, this.MediaSessionCompat$ResultReceiverWrapper, this.setChecked);
            MediaBrowserCompat$CustomActionResultReceiver(addSubMenu.getItem());
            return addSubMenu;
        }

        /* access modifiers changed from: package-private */
        public final <T> T MediaBrowserCompat$ItemReceiver(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = setIcon.this.MediaBrowserCompat$CustomActionResultReceiver.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot instantiate class: ");
                sb.append(str);
                Log.w("SupportMenuInflater", sb.toString(), e);
                return null;
            }
        }
    }
}

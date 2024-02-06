package p040o;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: o.setTextOn */
public class setTextOn {
    private final AccessibilityNodeInfo IconCompatParcelizer;
    public int MediaBrowserCompat$CustomActionResultReceiver = -1;

    private static String MediaBrowserCompat$ItemReceiver(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    /* renamed from: o.setTextOn$read */
    public static class read {
        final Object read;

        public static read MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, boolean z, int i3) {
            if (Build.VERSION.SDK_INT >= 21) {
                return new read(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
            }
            if (Build.VERSION.SDK_INT >= 19) {
                return new read(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
            }
            return new read((Object) null);
        }

        read(Object obj) {
            this.read = obj;
        }
    }

    /* renamed from: o.setTextOn$IconCompatParcelizer */
    public static class IconCompatParcelizer {
        final Object IconCompatParcelizer;

        public static IconCompatParcelizer write(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            if (Build.VERSION.SDK_INT >= 21) {
                return new IconCompatParcelizer(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            }
            if (Build.VERSION.SDK_INT >= 19) {
                return new IconCompatParcelizer(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new IconCompatParcelizer((Object) null);
        }

        IconCompatParcelizer(Object obj) {
            this.IconCompatParcelizer = obj;
        }
    }

    private setTextOn(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.IconCompatParcelizer = accessibilityNodeInfo;
    }

    public static setTextOn MediaBrowserCompat$CustomActionResultReceiver(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new setTextOn(accessibilityNodeInfo);
    }

    public AccessibilityNodeInfo AppCompatDelegateImpl$ListMenuDecorView() {
        return this.IconCompatParcelizer;
    }

    public static setTextOn read(setTextOn settexton) {
        return MediaBrowserCompat$CustomActionResultReceiver(AccessibilityNodeInfo.obtain(settexton.IconCompatParcelizer));
    }

    public void IconCompatParcelizer(View view) {
        this.IconCompatParcelizer.setSource(view);
    }

    public void write(View view) {
        this.IconCompatParcelizer.addChild(view);
    }

    public int MediaBrowserCompat$CustomActionResultReceiver() {
        return this.IconCompatParcelizer.getActions();
    }

    public void read(int i) {
        this.IconCompatParcelizer.addAction(i);
    }

    public boolean write(setTextOn$MediaBrowserCompat$CustomActionResultReceiver settexton_mediabrowsercompat_customactionresultreceiver) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.IconCompatParcelizer.removeAction((AccessibilityNodeInfo.AccessibilityAction) settexton_mediabrowsercompat_customactionresultreceiver.setIcon);
        }
        return false;
    }

    public void MediaBrowserCompat$ItemReceiver(View view) {
        this.IconCompatParcelizer.setParent(view);
    }

    public void MediaBrowserCompat$ItemReceiver(Rect rect) {
        this.IconCompatParcelizer.getBoundsInParent(rect);
    }

    public void read(Rect rect) {
        this.IconCompatParcelizer.setBoundsInParent(rect);
    }

    public void write(Rect rect) {
        this.IconCompatParcelizer.getBoundsInScreen(rect);
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(Rect rect) {
        this.IconCompatParcelizer.setBoundsInScreen(rect);
    }

    public boolean MediaBrowserCompat$MediaItem() {
        return this.IconCompatParcelizer.isCheckable();
    }

    public void read(boolean z) {
        this.IconCompatParcelizer.setCheckable(z);
    }

    public boolean MediaBrowserCompat$SearchResultReceiver() {
        return this.IconCompatParcelizer.isChecked();
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.IconCompatParcelizer.setChecked(z);
    }

    public boolean MediaSessionCompat$QueueItem() {
        return this.IconCompatParcelizer.isFocusable();
    }

    public void MediaBrowserCompat$SearchResultReceiver(boolean z) {
        this.IconCompatParcelizer.setFocusable(z);
    }

    public boolean MediaSessionCompat$ResultReceiverWrapper() {
        return this.IconCompatParcelizer.isFocused();
    }

    public void MediaMetadataCompat(boolean z) {
        this.IconCompatParcelizer.setFocused(z);
    }

    public boolean Keep() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.IconCompatParcelizer.isVisibleToUser();
        }
        return false;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public void mo20608x50fd9e4a(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.IconCompatParcelizer.setVisibleToUser(z);
        }
    }

    public boolean RatingCompat() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.IconCompatParcelizer.isAccessibilityFocused();
        }
        return false;
    }

    public void IconCompatParcelizer(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.IconCompatParcelizer.setAccessibilityFocused(z);
        }
    }

    public boolean PlaybackStateCompat() {
        return this.IconCompatParcelizer.isSelected();
    }

    public void MediaSessionCompat$QueueItem(boolean z) {
        this.IconCompatParcelizer.setSelected(z);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public boolean mo20609x50fd9e4a() {
        return this.IconCompatParcelizer.isClickable();
    }

    public void MediaBrowserCompat$ItemReceiver(boolean z) {
        this.IconCompatParcelizer.setClickable(z);
    }

    public boolean ParcelableVolumeInfo() {
        return this.IconCompatParcelizer.isLongClickable();
    }

    public void ParcelableVolumeInfo(boolean z) {
        this.IconCompatParcelizer.setLongClickable(z);
    }

    public boolean MediaSessionCompat$Token() {
        return this.IconCompatParcelizer.isEnabled();
    }

    public void RatingCompat(boolean z) {
        this.IconCompatParcelizer.setEnabled(z);
    }

    public boolean PlaybackStateCompat$CustomAction() {
        return this.IconCompatParcelizer.isPassword();
    }

    public boolean setHasDecor() {
        return this.IconCompatParcelizer.isScrollable();
    }

    public void MediaSessionCompat$ResultReceiverWrapper(boolean z) {
        this.IconCompatParcelizer.setScrollable(z);
    }

    public CharSequence MediaBrowserCompat$ItemReceiver() {
        return this.IconCompatParcelizer.getPackageName();
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(CharSequence charSequence) {
        this.IconCompatParcelizer.setPackageName(charSequence);
    }

    public CharSequence read() {
        return this.IconCompatParcelizer.getClassName();
    }

    public void write(CharSequence charSequence) {
        this.IconCompatParcelizer.setClassName(charSequence);
    }

    public CharSequence MediaMetadataCompat() {
        return this.IconCompatParcelizer.getText();
    }

    public void MediaBrowserCompat$SearchResultReceiver(CharSequence charSequence) {
        this.IconCompatParcelizer.setText(charSequence);
    }

    public CharSequence write() {
        return this.IconCompatParcelizer.getContentDescription();
    }

    public void read(CharSequence charSequence) {
        this.IconCompatParcelizer.setContentDescription(charSequence);
    }

    public void AlertController$RecycleListView() {
        this.IconCompatParcelizer.recycle();
    }

    public String MediaDescriptionCompat() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.IconCompatParcelizer.getViewIdResourceName();
        }
        return null;
    }

    public void read(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.IconCompatParcelizer.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((read) obj).read);
        }
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.IconCompatParcelizer.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((IconCompatParcelizer) obj).IconCompatParcelizer);
        }
    }

    public void MediaDescriptionCompat(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.IconCompatParcelizer.setContentInvalid(z);
        }
    }

    public void IconCompatParcelizer(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.IconCompatParcelizer.setHintText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.IconCompatParcelizer.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void MediaBrowserCompat$ItemReceiver(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.IconCompatParcelizer.setError(charSequence);
        }
    }

    public void write(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.IconCompatParcelizer.setCanOpenPopup(z);
        }
    }

    public Bundle IconCompatParcelizer() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.IconCompatParcelizer.getExtras();
        }
        return new Bundle();
    }

    public void MediaBrowserCompat$MediaItem(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.IconCompatParcelizer.setDismissable(z);
        }
    }

    public void MediaSessionCompat$Token(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.IconCompatParcelizer.setShowingHintText(z);
        } else {
            IconCompatParcelizer(4, z);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.IconCompatParcelizer;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setTextOn settexton = (setTextOn) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.IconCompatParcelizer;
        if (accessibilityNodeInfo == null) {
            if (settexton.IconCompatParcelizer != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(settexton.IconCompatParcelizer)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        MediaBrowserCompat$ItemReceiver(rect);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("; boundsInParent: ");
        sb2.append(rect);
        sb.append(sb2.toString());
        write(rect);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("; boundsInScreen: ");
        sb3.append(rect);
        sb.append(sb3.toString());
        sb.append("; packageName: ");
        sb.append(MediaBrowserCompat$ItemReceiver());
        sb.append("; className: ");
        sb.append(read());
        sb.append("; text: ");
        sb.append(MediaMetadataCompat());
        sb.append("; contentDescription: ");
        sb.append(write());
        sb.append("; viewId: ");
        sb.append(MediaDescriptionCompat());
        sb.append("; checkable: ");
        sb.append(MediaBrowserCompat$MediaItem());
        sb.append("; checked: ");
        sb.append(MediaBrowserCompat$SearchResultReceiver());
        sb.append("; focusable: ");
        sb.append(MediaSessionCompat$QueueItem());
        sb.append("; focused: ");
        sb.append(MediaSessionCompat$ResultReceiverWrapper());
        sb.append("; selected: ");
        sb.append(PlaybackStateCompat());
        sb.append("; clickable: ");
        sb.append(mo20609x50fd9e4a());
        sb.append("; longClickable: ");
        sb.append(ParcelableVolumeInfo());
        sb.append("; enabled: ");
        sb.append(MediaSessionCompat$Token());
        sb.append("; password: ");
        sb.append(PlaybackStateCompat$CustomAction());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("; scrollable: ");
        sb4.append(setHasDecor());
        sb.append(sb4.toString());
        sb.append("; [");
        int MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        while (MediaBrowserCompat$CustomActionResultReceiver2 != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(MediaBrowserCompat$CustomActionResultReceiver2);
            MediaBrowserCompat$CustomActionResultReceiver2 &= ~numberOfTrailingZeros;
            sb.append(MediaBrowserCompat$ItemReceiver(numberOfTrailingZeros));
            if (MediaBrowserCompat$CustomActionResultReceiver2 != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private void IconCompatParcelizer(int i, boolean z) {
        Bundle IconCompatParcelizer2 = IconCompatParcelizer();
        if (IconCompatParcelizer2 != null) {
            int i2 = 0;
            int i3 = IconCompatParcelizer2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0);
            if (z) {
                i2 = i;
            }
            IconCompatParcelizer2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", ((~i) & i3) | i2);
        }
    }
}

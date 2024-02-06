package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import java.util.ArrayList;
import p040o.ActionMenuPresenter$OverflowMenuButton;
import p040o.ActivityChooserView;
import p040o.AlertController$RecycleListView;
import p040o.AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver;
import p040o.CheckCaptureModule;
import p040o.MenuItemImpl;
import p040o.MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setBaselineAligned;
import p040o.setCustomView;
import p040o.setMaxWidth;
import p040o.setPrimaryBackground;
import p040o.setSplitBackground;
import p040o.setStackedBackground$MediaBrowserCompat$ItemReceiver;
import p040o.setTabContainer;
import p040o.setTitleMarginStart$MediaBrowserCompat$ItemReceiver;

public class ActionMenuPresenter extends setTitleMarginStart$MediaBrowserCompat$ItemReceiver implements setMaxWidth.IconCompatParcelizer {
    private int AlertController$RecycleListView;
    private int AppCompatActivity;
    boolean IconCompatParcelizer;
    private final SparseBooleanArray Keep = new SparseBooleanArray();
    write MediaBrowserCompat$CustomActionResultReceiver;
    int MediaBrowserCompat$ItemReceiver;
    public read MediaBrowserCompat$MediaItem;
    boolean MediaBrowserCompat$SearchResultReceiver;
    final IconCompatParcelizer MediaDescriptionCompat = new IconCompatParcelizer();
    Drawable MediaMetadataCompat;
    boolean ParcelableVolumeInfo;
    boolean RatingCompat;
    public ActionMenuPresenter$MediaBrowserCompat$ItemReceiver read;
    private View setBackgroundResource;
    private C0021xd87b00a0 setContentView;
    private int setHasDecor;
    OverflowMenuButton write;

    public ActionMenuPresenter(Context context) {
        super(context, AlertController$RecycleListView.MediaMetadataCompat.abc_action_menu_layout, AlertController$RecycleListView.MediaMetadataCompat.abc_action_menu_item_layout);
    }

    public final void IconCompatParcelizer(Context context, MenuItemImpl menuItemImpl) {
        super.IconCompatParcelizer(context, menuItemImpl);
        Resources resources = context.getResources();
        AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver alertController$RecycleListView$MediaBrowserCompat$ItemReceiver = new AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver(context);
        if (!this.ParcelableVolumeInfo) {
            boolean z = true;
            if (Build.VERSION.SDK_INT < 19) {
                z = true ^ ViewConfiguration.get(alertController$RecycleListView$MediaBrowserCompat$ItemReceiver.read).hasPermanentMenuKey();
            }
            this.MediaBrowserCompat$SearchResultReceiver = z;
        }
        this.AppCompatActivity = alertController$RecycleListView$MediaBrowserCompat$ItemReceiver.read.getResources().getDisplayMetrics().widthPixels / 2;
        this.setHasDecor = alertController$RecycleListView$MediaBrowserCompat$ItemReceiver.write();
        int i = this.AppCompatActivity;
        if (this.MediaBrowserCompat$SearchResultReceiver) {
            if (this.write == null) {
                OverflowMenuButton overflowMenuButton = new OverflowMenuButton(this.PlaybackStateCompat$CustomAction);
                this.write = overflowMenuButton;
                if (this.RatingCompat) {
                    overflowMenuButton.setImageDrawable(this.MediaMetadataCompat);
                    this.MediaMetadataCompat = null;
                    this.RatingCompat = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.write.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.write.getMeasuredWidth();
        } else {
            this.write = null;
        }
        this.AlertController$RecycleListView = i;
        float f = resources.getDisplayMetrics().density;
        this.setBackgroundResource = null;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.setHasDecor = new AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver(this.MediaSessionCompat$QueueItem).write();
        if (this.f2647x50fd9e4a != null) {
            this.f2647x50fd9e4a.IconCompatParcelizer(true);
        }
    }

    public final setTabContainer MediaBrowserCompat$ItemReceiver(ViewGroup viewGroup) {
        setTabContainer settabcontainer = this.PlaybackStateCompat;
        setTabContainer MediaBrowserCompat$ItemReceiver2 = super.MediaBrowserCompat$ItemReceiver(viewGroup);
        if (settabcontainer != MediaBrowserCompat$ItemReceiver2) {
            ((ActionMenuView) MediaBrowserCompat$ItemReceiver2).setPresenter(this);
        }
        return MediaBrowserCompat$ItemReceiver2;
    }

    public final View MediaBrowserCompat$ItemReceiver(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        View actionView = menuItemImpl.getActionView();
        if (actionView == null || menuItemImpl.MediaBrowserCompat$ItemReceiver()) {
            actionView = super.MediaBrowserCompat$ItemReceiver(menuItemImpl, view, viewGroup);
        }
        actionView.setVisibility(menuItemImpl.isActionViewExpanded() ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.write(layoutParams));
        }
        return actionView;
    }

    public final void read(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl, setTabContainer.read read2) {
        read2.read(menuItemImpl);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) read2;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.PlaybackStateCompat);
        if (this.setContentView == null) {
            this.setContentView = new C0021xd87b00a0(this);
        }
        actionMenuItemView.setPopupCallback(this.setContentView);
    }

    public final void write(boolean z) {
        ArrayList<androidx.appcompat.view.menu.MenuItemImpl> arrayList;
        super.write(z);
        ((View) this.PlaybackStateCompat).requestLayout();
        boolean z2 = false;
        if (this.f2647x50fd9e4a != null) {
            MenuItemImpl menuItemImpl = this.f2647x50fd9e4a;
            menuItemImpl.MediaBrowserCompat$CustomActionResultReceiver();
            ArrayList<androidx.appcompat.view.menu.MenuItemImpl> arrayList2 = menuItemImpl.IconCompatParcelizer;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                setMaxWidth setmaxwidth = arrayList2.get(i).IconCompatParcelizer;
                if (setmaxwidth != null) {
                    setmaxwidth.MediaBrowserCompat$ItemReceiver(this);
                }
            }
        }
        if (this.f2647x50fd9e4a != null) {
            MenuItemImpl menuItemImpl2 = this.f2647x50fd9e4a;
            menuItemImpl2.MediaBrowserCompat$CustomActionResultReceiver();
            arrayList = menuItemImpl2.ParcelableVolumeInfo;
        } else {
            arrayList = null;
        }
        if (this.MediaBrowserCompat$SearchResultReceiver && arrayList != null) {
            int size2 = arrayList.size();
            if (size2 == 1) {
                z2 = !arrayList.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.write == null) {
                this.write = new OverflowMenuButton(this.PlaybackStateCompat$CustomAction);
            }
            ViewGroup viewGroup = (ViewGroup) this.write.getParent();
            if (viewGroup != this.PlaybackStateCompat) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.write);
                }
                ((ActionMenuView) this.PlaybackStateCompat).addView(this.write, ActionMenuView.read());
            }
        } else {
            OverflowMenuButton overflowMenuButton = this.write;
            if (overflowMenuButton != null && overflowMenuButton.getParent() == this.PlaybackStateCompat) {
                ((ViewGroup) this.PlaybackStateCompat).removeView(this.write);
            }
        }
        ((ActionMenuView) this.PlaybackStateCompat).setOverflowReserved(this.MediaBrowserCompat$SearchResultReceiver);
    }

    public final boolean MediaBrowserCompat$ItemReceiver(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.write) {
            return false;
        }
        return super.MediaBrowserCompat$ItemReceiver(viewGroup, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean MediaBrowserCompat$CustomActionResultReceiver(p040o.setCustomView r8) {
        /*
            r7 = this;
            boolean r0 = r8.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = r8
        L_0x0009:
            o.MenuItemImpl r2 = r0.PlaybackStateCompat
            o.MenuItemImpl r3 = r7.f2647x50fd9e4a
            if (r2 == r3) goto L_0x0014
            o.MenuItemImpl r0 = r0.PlaybackStateCompat
            o.setCustomView r0 = (p040o.setCustomView) r0
            goto L_0x0009
        L_0x0014:
            android.view.MenuItem r0 = r0.getItem()
            o.setTabContainer r2 = r7.PlaybackStateCompat
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 == 0) goto L_0x003a
            int r3 = r2.getChildCount()
            r4 = r1
        L_0x0023:
            if (r4 >= r3) goto L_0x003a
            android.view.View r5 = r2.getChildAt(r4)
            boolean r6 = r5 instanceof p040o.setTabContainer.read
            if (r6 == 0) goto L_0x0037
            r6 = r5
            o.setTabContainer$read r6 = (p040o.setTabContainer.read) r6
            androidx.appcompat.view.menu.MenuItemImpl r6 = r6.IconCompatParcelizer()
            if (r6 != r0) goto L_0x0037
            goto L_0x003b
        L_0x0037:
            int r4 = r4 + 1
            goto L_0x0023
        L_0x003a:
            r5 = 0
        L_0x003b:
            if (r5 != 0) goto L_0x003e
            return r1
        L_0x003e:
            android.view.MenuItem r0 = r8.getItem()
            int r0 = r0.getItemId()
            r7.MediaBrowserCompat$ItemReceiver = r0
            int r0 = r8.size()
            r2 = r1
        L_0x004d:
            r3 = 1
            if (r2 >= r0) goto L_0x0065
            android.view.MenuItem r4 = r8.getItem(r2)
            boolean r6 = r4.isVisible()
            if (r6 == 0) goto L_0x0062
            android.graphics.drawable.Drawable r4 = r4.getIcon()
            if (r4 == 0) goto L_0x0062
            r1 = r3
            goto L_0x0065
        L_0x0062:
            int r2 = r2 + 1
            goto L_0x004d
        L_0x0065:
            androidx.appcompat.widget.ActionMenuPresenter$MediaBrowserCompat$ItemReceiver r0 = new androidx.appcompat.widget.ActionMenuPresenter$MediaBrowserCompat$ItemReceiver
            android.content.Context r2 = r7.MediaSessionCompat$QueueItem
            r0.<init>(r7, r2, r8, r5)
            r7.read = r0
            r0.read = r1
            o.setPrimaryBackground r0 = r0.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x0077
            r0.read((boolean) r1)
        L_0x0077:
            androidx.appcompat.widget.ActionMenuPresenter$MediaBrowserCompat$ItemReceiver r0 = r7.read
            r0.IconCompatParcelizer()
            super.MediaBrowserCompat$CustomActionResultReceiver(r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuPresenter.MediaBrowserCompat$CustomActionResultReceiver(o.setCustomView):boolean");
    }

    public final boolean MediaBrowserCompat$MediaItem() {
        if (!this.MediaBrowserCompat$SearchResultReceiver || IconCompatParcelizer() || this.f2647x50fd9e4a == null || this.PlaybackStateCompat == null || this.MediaBrowserCompat$MediaItem != null) {
            return false;
        }
        MenuItemImpl menuItemImpl = this.f2647x50fd9e4a;
        menuItemImpl.MediaBrowserCompat$CustomActionResultReceiver();
        if (menuItemImpl.ParcelableVolumeInfo.isEmpty()) {
            return false;
        }
        this.MediaBrowserCompat$MediaItem = new read(new write(this.MediaSessionCompat$QueueItem, this.f2647x50fd9e4a, this.write));
        ((View) this.PlaybackStateCompat).post(this.MediaBrowserCompat$MediaItem);
        super.MediaBrowserCompat$CustomActionResultReceiver((setCustomView) null);
        return true;
    }

    public final boolean write() {
        if (this.MediaBrowserCompat$MediaItem == null || this.PlaybackStateCompat == null) {
            write write2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (write2 == null) {
                return false;
            }
            write2.read();
            return true;
        }
        ((View) this.PlaybackStateCompat).removeCallbacks(this.MediaBrowserCompat$MediaItem);
        this.MediaBrowserCompat$MediaItem = null;
        return true;
    }

    public final boolean IconCompatParcelizer() {
        write write2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (write2 != null) {
            setPrimaryBackground setprimarybackground = write2.MediaBrowserCompat$ItemReceiver;
            if (setprimarybackground != null && setprimarybackground.MediaBrowserCompat$CustomActionResultReceiver()) {
                return true;
            }
        }
        return false;
    }

    public final boolean read() {
        int i;
        ArrayList<androidx.appcompat.view.menu.MenuItemImpl> arrayList;
        int i2;
        boolean z;
        boolean z2 = false;
        if (this.f2647x50fd9e4a != null) {
            arrayList = this.f2647x50fd9e4a.MediaBrowserCompat$ItemReceiver();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i3 = this.setHasDecor;
        int i4 = this.AlertController$RecycleListView;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.PlaybackStateCompat;
        int i5 = 0;
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = arrayList.get(i5);
            if ((menuItemImpl.MediaMetadataCompat & 2) == 2) {
                i7++;
            } else {
                if ((menuItemImpl.MediaMetadataCompat & 1) == 1) {
                    i6++;
                } else {
                    z3 = true;
                }
            }
            if (this.IconCompatParcelizer && menuItemImpl.isActionViewExpanded()) {
                i3 = 0;
            }
            i5++;
        }
        if (this.MediaBrowserCompat$SearchResultReceiver && (z3 || i6 + i7 > i3)) {
            i3--;
        }
        int i8 = i3 - i7;
        SparseBooleanArray sparseBooleanArray = this.Keep;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < i) {
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl2 = arrayList.get(i9);
            if ((menuItemImpl2.MediaMetadataCompat & i2) == i2 ? z : z2) {
                View MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(menuItemImpl2, this.setBackgroundResource, viewGroup);
                if (this.setBackgroundResource == null) {
                    this.setBackgroundResource = MediaBrowserCompat$ItemReceiver2;
                }
                MediaBrowserCompat$ItemReceiver2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = MediaBrowserCompat$ItemReceiver2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                int groupId = menuItemImpl2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, z);
                }
                menuItemImpl2.MediaBrowserCompat$ItemReceiver |= 32;
            } else {
                if ((menuItemImpl2.MediaMetadataCompat & z) != z ? z2 : z) {
                    int groupId2 = menuItemImpl2.getGroupId();
                    boolean z4 = sparseBooleanArray.get(groupId2);
                    boolean z5 = ((i8 > 0 || z4) && i4 > 0) ? z : z2;
                    if (z5) {
                        View MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver(menuItemImpl2, this.setBackgroundResource, viewGroup);
                        if (this.setBackgroundResource == null) {
                            this.setBackgroundResource = MediaBrowserCompat$ItemReceiver3;
                        }
                        MediaBrowserCompat$ItemReceiver3.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = MediaBrowserCompat$ItemReceiver3.getMeasuredWidth();
                        i4 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i4 + i10 > 0 ? z : false;
                    }
                    if (z5 && groupId2 != 0) {
                        sparseBooleanArray.put(groupId2, z);
                    } else if (z4) {
                        sparseBooleanArray.put(groupId2, false);
                        for (int i11 = 0; i11 < i9; i11++) {
                            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl3 = arrayList.get(i11);
                            if (menuItemImpl3.getGroupId() == groupId2) {
                                if ((menuItemImpl3.MediaBrowserCompat$ItemReceiver & 32) == 32) {
                                    i8++;
                                }
                                menuItemImpl3.MediaBrowserCompat$ItemReceiver &= -33;
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    if (z5) {
                        menuItemImpl2.MediaBrowserCompat$ItemReceiver |= 32;
                    } else {
                        menuItemImpl2.MediaBrowserCompat$ItemReceiver &= -33;
                    }
                } else {
                    menuItemImpl2.MediaBrowserCompat$ItemReceiver &= -33;
                }
            }
            i9++;
            z2 = false;
            i2 = 2;
            z = true;
        }
        return z;
    }

    public final Parcelable RatingCompat() {
        MediaMetadataCompat mediaMetadataCompat = new MediaMetadataCompat();
        mediaMetadataCompat.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$ItemReceiver;
        return mediaMetadataCompat;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Parcelable parcelable) {
        MenuItem findItem;
        if (parcelable instanceof MediaMetadataCompat) {
            MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) parcelable;
            if (mediaMetadataCompat.MediaBrowserCompat$ItemReceiver > 0 && (findItem = this.f2647x50fd9e4a.findItem(mediaMetadataCompat.MediaBrowserCompat$ItemReceiver)) != null) {
                MediaBrowserCompat$CustomActionResultReceiver((setCustomView) findItem.getSubMenu());
            }
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        if (z) {
            super.MediaBrowserCompat$CustomActionResultReceiver((setCustomView) null);
        } else if (this.f2647x50fd9e4a != null) {
            this.f2647x50fd9e4a.read(false);
        }
    }

    static class MediaMetadataCompat implements Parcelable {
        public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new Parcelable.Creator<MediaMetadataCompat>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new MediaMetadataCompat(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new MediaMetadataCompat[i];
            }
        };
        public int MediaBrowserCompat$ItemReceiver;

        public final int describeContents() {
            return 0;
        }

        MediaMetadataCompat() {
        }

        MediaMetadataCompat(Parcel parcel) {
            this.MediaBrowserCompat$ItemReceiver = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.MediaBrowserCompat$ItemReceiver);
        }
    }

    class OverflowMenuButton extends AppCompatImageView implements ActionMenuView$MediaBrowserCompat$ItemReceiver {
        private final float[] MediaBrowserCompat$ItemReceiver = new float[2];

        public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
            return false;
        }

        public final boolean write() {
            return false;
        }

        public OverflowMenuButton(Context context) {
            super(context, (AttributeSet) null, AlertController$RecycleListView.read.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            ActivityChooserView.MediaBrowserCompat$ItemReceiver(this, getContentDescription());
            setOnTouchListener(new ActionMenuPresenter$OverflowMenuButton(this, ActionMenuPresenter.this) {
                public final CheckCaptureModule.C6375a MediaBrowserCompat$CustomActionResultReceiver() {
                    if (ActionMenuPresenter.this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                        return null;
                    }
                    write write2 = ActionMenuPresenter.this.MediaBrowserCompat$CustomActionResultReceiver;
                    if (write2.MediaBrowserCompat$ItemReceiver == null) {
                        write2.MediaBrowserCompat$ItemReceiver = write2.write();
                    }
                    return write2.MediaBrowserCompat$ItemReceiver;
                }

                public final boolean read() {
                    ActionMenuPresenter.this.MediaBrowserCompat$MediaItem();
                    return true;
                }

                public final boolean write() {
                    if (ActionMenuPresenter.this.MediaBrowserCompat$MediaItem != null) {
                        return false;
                    }
                    ActionMenuPresenter.this.write();
                    return true;
                }
            });
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.MediaBrowserCompat$MediaItem();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                setBaselineAligned.MediaBrowserCompat$ItemReceiver(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    class write extends setSplitBackground {
        public write(Context context, MenuItemImpl menuItemImpl, View view) {
            super(context, menuItemImpl, view, true, AlertController$RecycleListView.read.actionOverflowMenuStyle);
            this.IconCompatParcelizer = 8388613;
            IconCompatParcelizer iconCompatParcelizer = ActionMenuPresenter.this.MediaDescriptionCompat;
            this.MediaBrowserCompat$MediaItem = iconCompatParcelizer;
            setPrimaryBackground setprimarybackground = this.MediaBrowserCompat$ItemReceiver;
            if (setprimarybackground != null) {
                setprimarybackground.MediaBrowserCompat$ItemReceiver((setStackedBackground$MediaBrowserCompat$ItemReceiver) iconCompatParcelizer);
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            if (ActionMenuPresenter.this.f2647x50fd9e4a != null) {
                ActionMenuPresenter.this.f2647x50fd9e4a.close();
            }
            ActionMenuPresenter.this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    class IconCompatParcelizer implements setStackedBackground$MediaBrowserCompat$ItemReceiver {
        IconCompatParcelizer() {
        }

        public final boolean MediaBrowserCompat$CustomActionResultReceiver(MenuItemImpl menuItemImpl) {
            if (menuItemImpl == null) {
                return false;
            }
            ActionMenuPresenter.this.MediaBrowserCompat$ItemReceiver = ((setCustomView) menuItemImpl).getItem().getItemId();
            setStackedBackground$MediaBrowserCompat$ItemReceiver setstackedbackground_mediabrowsercompat_itemreceiver = ActionMenuPresenter.this.MediaSessionCompat$Token;
            if (setstackedbackground_mediabrowsercompat_itemreceiver != null) {
                return setstackedbackground_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver(menuItemImpl);
            }
            return false;
        }

        public final void read(MenuItemImpl menuItemImpl, boolean z) {
            if (menuItemImpl instanceof setCustomView) {
                menuItemImpl.write().read(false);
            }
            setStackedBackground$MediaBrowserCompat$ItemReceiver setstackedbackground_mediabrowsercompat_itemreceiver = ActionMenuPresenter.this.MediaSessionCompat$Token;
            if (setstackedbackground_mediabrowsercompat_itemreceiver != null) {
                setstackedbackground_mediabrowsercompat_itemreceiver.read(menuItemImpl, z);
            }
        }
    }

    class read implements Runnable {
        private write MediaBrowserCompat$ItemReceiver;

        public read(write write) {
            this.MediaBrowserCompat$ItemReceiver = write;
        }

        public final void run() {
            MenuItemImpl MediaBrowserCompat$ItemReceiver2;
            MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver menuItemImpl$MediaBrowserCompat$CustomActionResultReceiver;
            if (!(ActionMenuPresenter.this.f2647x50fd9e4a == null || (menuItemImpl$MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver) == null)) {
                menuItemImpl$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((MediaBrowserCompat$ItemReceiver2 = ActionMenuPresenter.this.f2647x50fd9e4a));
            }
            View view = (View) ActionMenuPresenter.this.PlaybackStateCompat;
            if (!(view == null || view.getWindowToken() == null)) {
                write write = this.MediaBrowserCompat$ItemReceiver;
                setPrimaryBackground setprimarybackground = write.MediaBrowserCompat$ItemReceiver;
                boolean z = true;
                if (!(setprimarybackground != null && setprimarybackground.MediaBrowserCompat$CustomActionResultReceiver())) {
                    if (write.MediaBrowserCompat$CustomActionResultReceiver == null) {
                        z = false;
                    } else {
                        write.write(0, 0, false, false);
                    }
                }
                if (z) {
                    ActionMenuPresenter.this.MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver;
                }
            }
            ActionMenuPresenter.this.MediaBrowserCompat$MediaItem = null;
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl, boolean z) {
        write();
        ActionMenuPresenter$MediaBrowserCompat$ItemReceiver actionMenuPresenter$MediaBrowserCompat$ItemReceiver = this.read;
        if (actionMenuPresenter$MediaBrowserCompat$ItemReceiver != null) {
            actionMenuPresenter$MediaBrowserCompat$ItemReceiver.read();
        }
        super.MediaBrowserCompat$ItemReceiver(menuItemImpl, z);
    }

    public final boolean read(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
        return (menuItemImpl.MediaBrowserCompat$ItemReceiver & 32) == 32;
    }
}

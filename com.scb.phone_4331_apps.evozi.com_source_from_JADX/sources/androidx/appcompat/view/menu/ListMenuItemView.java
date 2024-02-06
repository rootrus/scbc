package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import p040o.AlertController$RecycleListView;
import p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem;
import p040o.SwitchCompat;
import p040o.setTabContainer;

public class ListMenuItemView extends LinearLayout implements setTabContainer.read, AbsListView.SelectionBoundsAdjuster {
    private TextView AlertController$RecycleListView;
    public MenuItemImpl IconCompatParcelizer;
    private Drawable MediaBrowserCompat$CustomActionResultReceiver;
    private CheckBox MediaBrowserCompat$ItemReceiver;
    private ImageView MediaBrowserCompat$MediaItem;
    private boolean MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private TextView f4x50fd9e4a;
    private LayoutInflater MediaDescriptionCompat;
    private ImageView MediaMetadataCompat;
    private Drawable MediaSessionCompat$QueueItem;
    private int MediaSessionCompat$ResultReceiverWrapper;
    private RadioButton MediaSessionCompat$Token;
    private ImageView ParcelableVolumeInfo;
    private boolean RatingCompat;
    private LinearLayout read;
    private Context setHasDecor;
    private boolean write;

    public final boolean read() {
        return false;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AlertController$RecycleListView.read.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        Context context2 = getContext();
        AlertController$RecycleListView.MediaDescriptionCompat mediaDescriptionCompat = new AlertController$RecycleListView.MediaDescriptionCompat(context2, context2.obtainStyledAttributes(attributeSet, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuView, i, 0));
        this.MediaBrowserCompat$CustomActionResultReceiver = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuView_android_itemBackground);
        this.MediaSessionCompat$ResultReceiverWrapper = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuView_android_itemTextAppearance, -1);
        this.RatingCompat = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuView_preserveIconSpacing, false);
        this.setHasDecor = context;
        this.MediaSessionCompat$QueueItem = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, AlertController$RecycleListView.read.dropDownListViewStyle, 0);
        this.MediaBrowserCompat$SearchResultReceiver = obtainStyledAttributes.hasValue(0);
        mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.recycle();
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        SwitchCompat.IconCompatParcelizer((View) this, this.MediaBrowserCompat$CustomActionResultReceiver);
        TextView textView = (TextView) findViewById(AlertController$RecycleListView.MediaDescriptionCompat.title);
        this.AlertController$RecycleListView = textView;
        int i = this.MediaSessionCompat$ResultReceiverWrapper;
        if (i != -1) {
            textView.setTextAppearance(this.setHasDecor, i);
        }
        this.f4x50fd9e4a = (TextView) findViewById(AlertController$RecycleListView.MediaDescriptionCompat.shortcut);
        ImageView imageView = (ImageView) findViewById(AlertController$RecycleListView.MediaDescriptionCompat.submenuarrow);
        this.ParcelableVolumeInfo = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.MediaSessionCompat$QueueItem);
        }
        this.MediaMetadataCompat = (ImageView) findViewById(AlertController$RecycleListView.MediaDescriptionCompat.group_divider);
        this.read = (LinearLayout) findViewById(AlertController$RecycleListView.MediaDescriptionCompat.content);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read(androidx.appcompat.view.menu.MenuItemImpl r5) {
        /*
            r4 = this;
            r4.IconCompatParcelizer = r5
            boolean r0 = r5.isVisible()
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L_0x000d
            r0 = r2
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            r4.setVisibility(r0)
            boolean r0 = r4.read()
            if (r0 == 0) goto L_0x001c
            java.lang.CharSequence r0 = r5.getTitleCondensed()
            goto L_0x0020
        L_0x001c:
            java.lang.CharSequence r0 = r5.getTitle()
        L_0x0020:
            r4.setTitle(r0)
            boolean r0 = r5.isCheckable()
            r4.setCheckable(r0)
            o.MenuItemImpl r0 = r5.write
            boolean r0 = r0.MediaBrowserCompat$MediaItem()
            if (r0 == 0) goto L_0x0043
            o.MenuItemImpl r0 = r5.write
            boolean r0 = r0.RatingCompat()
            if (r0 == 0) goto L_0x003d
            char r0 = r5.MediaDescriptionCompat
            goto L_0x003f
        L_0x003d:
            char r0 = r5.RatingCompat
        L_0x003f:
            if (r0 == 0) goto L_0x0043
            r0 = 1
            goto L_0x0044
        L_0x0043:
            r0 = r2
        L_0x0044:
            o.MenuItemImpl r3 = r5.write
            boolean r3 = r3.RatingCompat()
            if (r3 == 0) goto L_0x004f
            char r3 = r5.MediaDescriptionCompat
            goto L_0x0051
        L_0x004f:
            char r3 = r5.RatingCompat
        L_0x0051:
            r4.setShortcut(r0, r3)
            android.graphics.drawable.Drawable r0 = r5.getIcon()
            r4.setIcon(r0)
            boolean r0 = r5.isEnabled()
            r4.setEnabled(r0)
            boolean r0 = r5.hasSubMenu()
            android.widget.ImageView r3 = r4.ParcelableVolumeInfo
            if (r3 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x006d
            r1 = r2
        L_0x006d:
            r3.setVisibility(r1)
        L_0x0070:
            java.lang.CharSequence r5 = r5.getContentDescription()
            r4.setContentDescription(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.read(androidx.appcompat.view.menu.MenuItemImpl):void");
    }

    public void setForceShowIcon(boolean z) {
        this.write = z;
        this.RatingCompat = z;
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.AlertController$RecycleListView.setText(charSequence);
            if (this.AlertController$RecycleListView.getVisibility() != 0) {
                this.AlertController$RecycleListView.setVisibility(0);
            }
        } else if (this.AlertController$RecycleListView.getVisibility() != 8) {
            this.AlertController$RecycleListView.setVisibility(8);
        }
    }

    public final MenuItemImpl IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public void setCheckable(boolean z) {
        View view;
        CompoundButton compoundButton;
        if (z || this.MediaSessionCompat$Token != null || this.MediaBrowserCompat$ItemReceiver != null) {
            if ((this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver & 4) != 0) {
                if (this.MediaSessionCompat$Token == null) {
                    write();
                }
                compoundButton = this.MediaSessionCompat$Token;
                view = this.MediaBrowserCompat$ItemReceiver;
            } else {
                if (this.MediaBrowserCompat$ItemReceiver == null) {
                    MediaBrowserCompat$ItemReceiver();
                }
                compoundButton = this.MediaBrowserCompat$ItemReceiver;
                view = this.MediaSessionCompat$Token;
            }
            if (z) {
                compoundButton.setChecked(this.IconCompatParcelizer.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.MediaBrowserCompat$ItemReceiver;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.MediaSessionCompat$Token;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver & 4) != 0) {
            if (this.MediaSessionCompat$Token == null) {
                write();
            }
            compoundButton = this.MediaSessionCompat$Token;
        } else {
            if (this.MediaBrowserCompat$ItemReceiver == null) {
                MediaBrowserCompat$ItemReceiver();
            }
            compoundButton = this.MediaBrowserCompat$ItemReceiver;
        }
        compoundButton.setChecked(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r9 == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setShortcut(boolean r9, char r10) {
        /*
            r8 = this;
            r10 = 1
            r0 = 0
            r1 = 8
            if (r9 == 0) goto L_0x0025
            androidx.appcompat.view.menu.MenuItemImpl r9 = r8.IconCompatParcelizer
            o.MenuItemImpl r2 = r9.write
            boolean r2 = r2.MediaBrowserCompat$MediaItem()
            if (r2 == 0) goto L_0x0021
            o.MenuItemImpl r2 = r9.write
            boolean r2 = r2.RatingCompat()
            if (r2 == 0) goto L_0x001b
            char r9 = r9.MediaDescriptionCompat
            goto L_0x001d
        L_0x001b:
            char r9 = r9.RatingCompat
        L_0x001d:
            if (r9 == 0) goto L_0x0021
            r9 = r10
            goto L_0x0022
        L_0x0021:
            r9 = r0
        L_0x0022:
            if (r9 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r0 = r1
        L_0x0026:
            if (r0 != 0) goto L_0x00de
            android.widget.TextView r9 = r8.f4x50fd9e4a
            androidx.appcompat.view.menu.MenuItemImpl r2 = r8.IconCompatParcelizer
            o.MenuItemImpl r3 = r2.write
            boolean r3 = r3.RatingCompat()
            if (r3 == 0) goto L_0x0037
            char r3 = r2.MediaDescriptionCompat
            goto L_0x0039
        L_0x0037:
            char r3 = r2.RatingCompat
        L_0x0039:
            if (r3 != 0) goto L_0x003f
            java.lang.String r10 = ""
            goto L_0x00db
        L_0x003f:
            o.MenuItemImpl r4 = r2.write
            android.content.Context r4 = r4.write
            android.content.res.Resources r4 = r4.getResources()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            o.MenuItemImpl r6 = r2.write
            android.content.Context r6 = r6.write
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L_0x0063
            int r6 = p040o.AlertController$RecycleListView.RatingCompat.abc_prepend_shortcut_label
            java.lang.String r6 = r4.getString(r6)
            r5.append(r6)
        L_0x0063:
            o.MenuItemImpl r6 = r2.write
            boolean r6 = r6.RatingCompat()
            if (r6 == 0) goto L_0x006e
            int r2 = r2.MediaBrowserCompat$MediaItem
            goto L_0x0070
        L_0x006e:
            int r2 = r2.MediaBrowserCompat$SearchResultReceiver
        L_0x0070:
            int r6 = p040o.AlertController$RecycleListView.RatingCompat.abc_menu_meta_shortcut_label
            java.lang.String r6 = r4.getString(r6)
            r7 = 65536(0x10000, float:9.18355E-41)
            androidx.appcompat.view.menu.MenuItemImpl.MediaBrowserCompat$CustomActionResultReceiver(r5, r2, r7, r6)
            int r6 = p040o.AlertController$RecycleListView.RatingCompat.abc_menu_ctrl_shortcut_label
            java.lang.String r6 = r4.getString(r6)
            r7 = 4096(0x1000, float:5.74E-42)
            androidx.appcompat.view.menu.MenuItemImpl.MediaBrowserCompat$CustomActionResultReceiver(r5, r2, r7, r6)
            int r6 = p040o.AlertController$RecycleListView.RatingCompat.abc_menu_alt_shortcut_label
            java.lang.String r6 = r4.getString(r6)
            r7 = 2
            androidx.appcompat.view.menu.MenuItemImpl.MediaBrowserCompat$CustomActionResultReceiver(r5, r2, r7, r6)
            int r6 = p040o.AlertController$RecycleListView.RatingCompat.abc_menu_shift_shortcut_label
            java.lang.String r6 = r4.getString(r6)
            androidx.appcompat.view.menu.MenuItemImpl.MediaBrowserCompat$CustomActionResultReceiver(r5, r2, r10, r6)
            int r10 = p040o.AlertController$RecycleListView.RatingCompat.abc_menu_sym_shortcut_label
            java.lang.String r10 = r4.getString(r10)
            r6 = 4
            androidx.appcompat.view.menu.MenuItemImpl.MediaBrowserCompat$CustomActionResultReceiver(r5, r2, r6, r10)
            int r10 = p040o.AlertController$RecycleListView.RatingCompat.abc_menu_function_shortcut_label
            java.lang.String r10 = r4.getString(r10)
            androidx.appcompat.view.menu.MenuItemImpl.MediaBrowserCompat$CustomActionResultReceiver(r5, r2, r1, r10)
            if (r3 == r1) goto L_0x00ce
            r10 = 10
            if (r3 == r10) goto L_0x00c4
            r10 = 32
            if (r3 == r10) goto L_0x00ba
            r5.append(r3)
            goto L_0x00d7
        L_0x00ba:
            int r10 = p040o.AlertController$RecycleListView.RatingCompat.abc_menu_space_shortcut_label
            java.lang.String r10 = r4.getString(r10)
            r5.append(r10)
            goto L_0x00d7
        L_0x00c4:
            int r10 = p040o.AlertController$RecycleListView.RatingCompat.abc_menu_enter_shortcut_label
            java.lang.String r10 = r4.getString(r10)
            r5.append(r10)
            goto L_0x00d7
        L_0x00ce:
            int r10 = p040o.AlertController$RecycleListView.RatingCompat.abc_menu_delete_shortcut_label
            java.lang.String r10 = r4.getString(r10)
            r5.append(r10)
        L_0x00d7:
            java.lang.String r10 = r5.toString()
        L_0x00db:
            r9.setText(r10)
        L_0x00de:
            android.widget.TextView r9 = r8.f4x50fd9e4a
            int r9 = r9.getVisibility()
            if (r9 == r0) goto L_0x00eb
            android.widget.TextView r9 = r8.f4x50fd9e4a
            r9.setVisibility(r0)
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.setShortcut(boolean, char):void");
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.write;
        if (!z && !this.RatingCompat) {
            return;
        }
        if (this.MediaBrowserCompat$MediaItem != null || drawable != null || this.RatingCompat) {
            if (this.MediaBrowserCompat$MediaItem == null) {
                if (this.MediaDescriptionCompat == null) {
                    this.MediaDescriptionCompat = LayoutInflater.from(getContext());
                }
                ImageView imageView = (ImageView) this.MediaDescriptionCompat.inflate(AlertController$RecycleListView.MediaMetadataCompat.abc_list_menu_item_icon, this, false);
                this.MediaBrowserCompat$MediaItem = imageView;
                LinearLayout linearLayout = this.read;
                if (linearLayout != null) {
                    linearLayout.addView(imageView, 0);
                } else {
                    addView(imageView, 0);
                }
            }
            if (drawable != null || this.RatingCompat) {
                ImageView imageView2 = this.MediaBrowserCompat$MediaItem;
                if (!z) {
                    drawable = null;
                }
                imageView2.setImageDrawable(drawable);
                if (this.MediaBrowserCompat$MediaItem.getVisibility() != 0) {
                    this.MediaBrowserCompat$MediaItem.setVisibility(0);
                    return;
                }
                return;
            }
            this.MediaBrowserCompat$MediaItem.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.MediaBrowserCompat$MediaItem != null && this.RatingCompat) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.MediaBrowserCompat$MediaItem.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.MediaMetadataCompat;
        if (imageView != null) {
            imageView.setVisibility((this.MediaBrowserCompat$SearchResultReceiver || !z) ? 8 : 0);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.MediaMetadataCompat;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.MediaMetadataCompat.getLayoutParams();
            rect.top += this.MediaMetadataCompat.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    private void MediaBrowserCompat$ItemReceiver() {
        if (this.MediaDescriptionCompat == null) {
            this.MediaDescriptionCompat = LayoutInflater.from(getContext());
        }
        CheckBox checkBox = (CheckBox) this.MediaDescriptionCompat.inflate(AlertController$RecycleListView.MediaMetadataCompat.abc_list_menu_item_checkbox, this, false);
        this.MediaBrowserCompat$ItemReceiver = checkBox;
        LinearLayout linearLayout = this.read;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    private void write() {
        if (this.MediaDescriptionCompat == null) {
            this.MediaDescriptionCompat = LayoutInflater.from(getContext());
        }
        RadioButton radioButton = (RadioButton) this.MediaDescriptionCompat.inflate(AlertController$RecycleListView.MediaMetadataCompat.abc_list_menu_item_radio, this, false);
        this.MediaSessionCompat$Token = radioButton;
        LinearLayout linearLayout = this.read;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.ActionMenuView;
import p040o.AlertController$RecycleListView;
import p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem;
import p040o.AppCompatDelegateImpl$ListMenuDecorView;
import p040o.Keep;
import p040o.MenuItemImpl;
import p040o.MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.SwitchCompat;
import p040o.setCustomView;
import p040o.setDefaultActionButtonContentDescription;
import p040o.setIcon;
import p040o.setOnQueryTextListener;
import p040o.setOnSuggestionListener;
import p040o.setPadding;
import p040o.setStackedBackground;
import p040o.setStackedBackground$MediaBrowserCompat$ItemReceiver;

public class Toolbar extends ViewGroup {
    private final ActionMenuView.OnMenuItemClickListener ActionMenuItemView;
    private int AlertController$RecycleListView;
    private boolean AppCompatActivity;
    private boolean AppCompatDelegateImpl$ListMenuDecorView;
    private AlertController$RecycleListView.IconCompatParcelizer AppCompatDialogFragment;
    private int AppCompatViewInflater;
    private int ExpandedMenuView;
    int IconCompatParcelizer;
    public CharSequence Keep;
    private final ArrayList<View> ListMenuItemView;
    View MediaBrowserCompat$CustomActionResultReceiver;
    ImageButton MediaBrowserCompat$ItemReceiver;
    final ArrayList<View> MediaBrowserCompat$MediaItem;
    public read MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public int f11x50fd9e4a;
    IconCompatParcelizer MediaDescriptionCompat;
    public ActionMenuView MediaMetadataCompat;
    public CharSequence MediaSessionCompat$QueueItem;
    public int MediaSessionCompat$ResultReceiverWrapper;
    public int MediaSessionCompat$Token;
    public int ParcelableVolumeInfo;
    private setStackedBackground$MediaBrowserCompat$ItemReceiver PlaybackStateCompat;
    private boolean PlaybackStateCompat$CustomAction;
    public ImageButton RatingCompat;
    Drawable read;
    private int setBackgroundResource;
    private ImageView setCheckable;
    private MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver setChecked;
    private int setContentView;
    private ActionMenuPresenter setExpandedFormat;
    private final int[] setForceShowIcon;
    private TextView setGroupDividerEnabled;
    public ActionMenuView.OnMenuItemClickListener setHasDecor;
    private int setIcon;
    private int setItemInvoker;
    private final Runnable setPadding;
    private Context setPopupCallback;
    private int setShortcut;
    private int setTitle;
    private TextView setVisibility;
    CharSequence write;

    public interface IconCompatParcelizer {
        boolean read(MenuItem menuItem);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return MediaBrowserCompat$CustomActionResultReceiver(layoutParams);
    }

    public Toolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AlertController$RecycleListView.read.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.setBackgroundResource = 8388627;
        this.ListMenuItemView = new ArrayList<>();
        this.MediaBrowserCompat$MediaItem = new ArrayList<>();
        this.setForceShowIcon = new int[2];
        this.ActionMenuItemView = new ActionMenuView.OnMenuItemClickListener() {
            public final boolean onMenuItemClick(MenuItem menuItem) {
                if (Toolbar.this.MediaDescriptionCompat != null) {
                    return Toolbar.this.MediaDescriptionCompat.read(menuItem);
                }
                return false;
            }
        };
        this.setPadding = new Runnable() {
            public final void run() {
                Toolbar.this.IconCompatParcelizer();
            }
        };
        Context context2 = getContext();
        AlertController$RecycleListView.MediaDescriptionCompat mediaDescriptionCompat = new AlertController$RecycleListView.MediaDescriptionCompat(context2, context2.obtainStyledAttributes(attributeSet, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar, i, 0));
        this.setTitle = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_titleTextAppearance, 0);
        this.setItemInvoker = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_subtitleTextAppearance, 0);
        this.setBackgroundResource = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getInteger(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_android_gravity, this.setBackgroundResource);
        this.IconCompatParcelizer = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getInteger(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_buttonGravity, 48);
        int dimensionPixelOffset = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDimensionPixelOffset(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_titleMargin, 0);
        if (mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_titleMargins)) {
            dimensionPixelOffset = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDimensionPixelOffset(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_titleMargins, dimensionPixelOffset);
        }
        this.f11x50fd9e4a = dimensionPixelOffset;
        this.MediaSessionCompat$Token = dimensionPixelOffset;
        this.ParcelableVolumeInfo = dimensionPixelOffset;
        this.MediaSessionCompat$ResultReceiverWrapper = dimensionPixelOffset;
        int dimensionPixelOffset2 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDimensionPixelOffset(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_titleMarginStart, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.MediaSessionCompat$ResultReceiverWrapper = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDimensionPixelOffset(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_titleMarginEnd, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.ParcelableVolumeInfo = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDimensionPixelOffset(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_titleMarginTop, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.MediaSessionCompat$Token = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDimensionPixelOffset(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_titleMarginBottom, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f11x50fd9e4a = dimensionPixelOffset5;
        }
        this.AppCompatViewInflater = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDimensionPixelSize(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_maxButtonHeight, -1);
        int dimensionPixelOffset6 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDimensionPixelOffset(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_contentInsetStart, PKIFailureInfo.systemUnavail);
        int dimensionPixelOffset7 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDimensionPixelOffset(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_contentInsetEnd, PKIFailureInfo.systemUnavail);
        int dimensionPixelSize = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDimensionPixelSize(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_contentInsetLeft, 0);
        int dimensionPixelSize2 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDimensionPixelSize(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_contentInsetRight, 0);
        if (this.AppCompatDialogFragment == null) {
            this.AppCompatDialogFragment = new AlertController$RecycleListView.IconCompatParcelizer();
        }
        this.AppCompatDialogFragment.MediaBrowserCompat$CustomActionResultReceiver(dimensionPixelSize, dimensionPixelSize2);
        if (!(dimensionPixelOffset6 == Integer.MIN_VALUE && dimensionPixelOffset7 == Integer.MIN_VALUE)) {
            this.AppCompatDialogFragment.read(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.setContentView = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDimensionPixelOffset(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_contentInsetStartWithNavigation, PKIFailureInfo.systemUnavail);
        this.AlertController$RecycleListView = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDimensionPixelOffset(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_contentInsetEndWithActions, PKIFailureInfo.systemUnavail);
        this.read = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_collapseIcon);
        this.write = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getText(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_collapseContentDescription);
        CharSequence text = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getText(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_title);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getText(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_subtitle);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.setPopupCallback = getContext();
        setPopupTheme(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_popupTheme, 0));
        Drawable MediaBrowserCompat$ItemReceiver2 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_navigationIcon);
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            setNavigationIcon(MediaBrowserCompat$ItemReceiver2);
        }
        CharSequence text3 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getText(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable MediaBrowserCompat$ItemReceiver3 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_logo);
        if (MediaBrowserCompat$ItemReceiver3 != null) {
            setLogo(MediaBrowserCompat$ItemReceiver3);
        }
        CharSequence text4 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getText(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_titleTextColor)) {
            setTitleTextColor(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getColor(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_titleTextColor, -1));
        }
        if (mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getColor(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.Toolbar_subtitleTextColor, -1));
        }
        mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.recycle();
    }

    public void setPopupTheme(int i) {
        if (this.setShortcut != i) {
            this.setShortcut = i;
            if (i == 0) {
                this.setPopupCallback = getContext();
            } else {
                this.setPopupCallback = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.MediaSessionCompat$ResultReceiverWrapper = i;
        this.MediaSessionCompat$Token = i2;
        this.ParcelableVolumeInfo = i3;
        this.f11x50fd9e4a = i4;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.MediaSessionCompat$ResultReceiverWrapper = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.MediaSessionCompat$Token = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.ParcelableVolumeInfo = i;
        requestLayout();
    }

    public void setTitleMarginBottom(int i) {
        this.f11x50fd9e4a = i;
        requestLayout();
    }

    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        if (this.AppCompatDialogFragment == null) {
            this.AppCompatDialogFragment = new AlertController$RecycleListView.IconCompatParcelizer();
        }
        AlertController$RecycleListView.IconCompatParcelizer iconCompatParcelizer = this.AppCompatDialogFragment;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != iconCompatParcelizer.write) {
            iconCompatParcelizer.write = z;
            if (!iconCompatParcelizer.read) {
                iconCompatParcelizer.RatingCompat = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                iconCompatParcelizer.MediaMetadataCompat = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            } else if (z) {
                int i2 = iconCompatParcelizer.IconCompatParcelizer;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                }
                iconCompatParcelizer.RatingCompat = i2;
                int i3 = iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                }
                iconCompatParcelizer.MediaMetadataCompat = i3;
            } else {
                int i4 = iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                }
                iconCompatParcelizer.RatingCompat = i4;
                int i5 = iconCompatParcelizer.IconCompatParcelizer;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                }
                iconCompatParcelizer.MediaMetadataCompat = i5;
            }
        }
    }

    public void setLogo(int i) {
        setLogo(AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(getContext(), i));
    }

    /* renamed from: r_ */
    public final boolean mo758r_() {
        ActionMenuView actionMenuView = this.MediaMetadataCompat;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.read;
            if (actionMenuPresenter != null && actionMenuPresenter.IconCompatParcelizer()) {
                return true;
            }
        }
        return false;
    }

    public final boolean IconCompatParcelizer() {
        ActionMenuView actionMenuView = this.MediaMetadataCompat;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.read;
            if (actionMenuPresenter != null && actionMenuPresenter.MediaBrowserCompat$MediaItem()) {
                return true;
            }
        }
        return false;
    }

    public void setMenu(MenuItemImpl menuItemImpl, ActionMenuPresenter actionMenuPresenter) {
        if (menuItemImpl != null || this.MediaMetadataCompat != null) {
            MediaBrowserCompat$SearchResultReceiver();
            MenuItemImpl menuItemImpl2 = this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver;
            if (menuItemImpl2 != menuItemImpl) {
                if (menuItemImpl2 != null) {
                    menuItemImpl2.write((setStackedBackground) this.setExpandedFormat);
                    menuItemImpl2.write((setStackedBackground) this.MediaBrowserCompat$SearchResultReceiver);
                }
                if (this.MediaBrowserCompat$SearchResultReceiver == null) {
                    this.MediaBrowserCompat$SearchResultReceiver = new read();
                }
                actionMenuPresenter.IconCompatParcelizer = true;
                if (menuItemImpl != null) {
                    Context context = this.setPopupCallback;
                    menuItemImpl.f2552x50fd9e4a.add(new WeakReference(actionMenuPresenter));
                    actionMenuPresenter.IconCompatParcelizer(context, menuItemImpl);
                    menuItemImpl.MediaDescriptionCompat = true;
                    read read2 = this.MediaBrowserCompat$SearchResultReceiver;
                    Context context2 = this.setPopupCallback;
                    menuItemImpl.f2552x50fd9e4a.add(new WeakReference(read2));
                    read2.IconCompatParcelizer(context2, menuItemImpl);
                    menuItemImpl.MediaDescriptionCompat = true;
                } else {
                    actionMenuPresenter.IconCompatParcelizer(this.setPopupCallback, (MenuItemImpl) null);
                    this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(this.setPopupCallback, (MenuItemImpl) null);
                    actionMenuPresenter.write(true);
                    this.MediaBrowserCompat$SearchResultReceiver.write(true);
                }
                this.MediaMetadataCompat.setPopupTheme(this.setShortcut);
                this.MediaMetadataCompat.setPresenter(actionMenuPresenter);
                this.setExpandedFormat = actionMenuPresenter;
            }
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.setCheckable == null) {
            this.setCheckable = new AppCompatImageView(getContext());
        }
        ImageView imageView = this.setCheckable;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        boolean z = false;
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.setVisibility == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.setVisibility = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.setVisibility.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.setTitle;
                if (i != 0) {
                    this.setVisibility.setTextAppearance(context, i);
                }
                int i2 = this.ExpandedMenuView;
                if (i2 != 0) {
                    this.setVisibility.setTextColor(i2);
                }
            }
            TextView textView = this.setVisibility;
            if (textView.getParent() == this || this.MediaBrowserCompat$MediaItem.contains(textView)) {
                z = true;
            }
            if (!z) {
                MediaBrowserCompat$CustomActionResultReceiver(this.setVisibility, true);
            }
        } else {
            TextView textView2 = this.setVisibility;
            if (textView2 != null) {
                if (textView2.getParent() == this || this.MediaBrowserCompat$MediaItem.contains(textView2)) {
                    z = true;
                }
                if (z) {
                    removeView(this.setVisibility);
                    this.MediaBrowserCompat$MediaItem.remove(this.setVisibility);
                }
            }
        }
        TextView textView3 = this.setVisibility;
        if (textView3 != null) {
            textView3.setText(charSequence);
        }
        this.Keep = charSequence;
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean z = false;
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.setGroupDividerEnabled == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.setGroupDividerEnabled = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.setGroupDividerEnabled.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.setItemInvoker;
                if (i != 0) {
                    this.setGroupDividerEnabled.setTextAppearance(context, i);
                }
                int i2 = this.setIcon;
                if (i2 != 0) {
                    this.setGroupDividerEnabled.setTextColor(i2);
                }
            }
            TextView textView = this.setGroupDividerEnabled;
            if (textView.getParent() == this || this.MediaBrowserCompat$MediaItem.contains(textView)) {
                z = true;
            }
            if (!z) {
                MediaBrowserCompat$CustomActionResultReceiver(this.setGroupDividerEnabled, true);
            }
        } else {
            TextView textView2 = this.setGroupDividerEnabled;
            if (textView2 != null) {
                if (textView2.getParent() == this || this.MediaBrowserCompat$MediaItem.contains(textView2)) {
                    z = true;
                }
                if (z) {
                    removeView(this.setGroupDividerEnabled);
                    this.MediaBrowserCompat$MediaItem.remove(this.setGroupDividerEnabled);
                }
            }
        }
        TextView textView3 = this.setGroupDividerEnabled;
        if (textView3 != null) {
            textView3.setText(charSequence);
        }
        this.MediaSessionCompat$QueueItem = charSequence;
    }

    public void setTitleTextAppearance(Context context, int i) {
        this.setTitle = i;
        TextView textView = this.setVisibility;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextAppearance(Context context, int i) {
        this.setItemInvoker = i;
        TextView textView = this.setGroupDividerEnabled;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        this.ExpandedMenuView = i;
        TextView textView = this.setVisibility;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setSubtitleTextColor(int i) {
        this.setIcon = i;
        TextView textView = this.setGroupDividerEnabled;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            MediaMetadataCompat();
        }
        ImageButton imageButton = this.RatingCompat;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        boolean z = false;
        if (drawable != null) {
            MediaMetadataCompat();
            ImageButton imageButton = this.RatingCompat;
            if (imageButton.getParent() == this || this.MediaBrowserCompat$MediaItem.contains(imageButton)) {
                z = true;
            }
            if (!z) {
                MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat, true);
            }
        } else {
            ImageButton imageButton2 = this.RatingCompat;
            if (imageButton2 != null) {
                if (imageButton2.getParent() == this || this.MediaBrowserCompat$MediaItem.contains(imageButton2)) {
                    z = true;
                }
                if (z) {
                    removeView(this.RatingCompat);
                    this.MediaBrowserCompat$MediaItem.remove(this.RatingCompat);
                }
            }
        }
        ImageButton imageButton3 = this.RatingCompat;
        if (imageButton3 != null) {
            imageButton3.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        MediaMetadataCompat();
        this.RatingCompat.setOnClickListener(onClickListener);
    }

    public final Menu MediaBrowserCompat$CustomActionResultReceiver() {
        read();
        return this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver();
    }

    public void setOverflowIcon(Drawable drawable) {
        read();
        this.MediaMetadataCompat.setOverflowIcon(drawable);
    }

    private void read() {
        MediaBrowserCompat$SearchResultReceiver();
        if (this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver == null) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver();
            if (this.MediaBrowserCompat$SearchResultReceiver == null) {
                this.MediaBrowserCompat$SearchResultReceiver = new read();
            }
            this.MediaMetadataCompat.setExpandedActionViewsExclusive(true);
            read read2 = this.MediaBrowserCompat$SearchResultReceiver;
            Context context = this.setPopupCallback;
            menuItemImpl.f2552x50fd9e4a.add(new WeakReference(read2));
            read2.IconCompatParcelizer(context, menuItemImpl);
            menuItemImpl.MediaDescriptionCompat = true;
        }
    }

    private void MediaBrowserCompat$SearchResultReceiver() {
        if (this.MediaMetadataCompat == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.MediaMetadataCompat = actionMenuView;
            actionMenuView.setPopupTheme(this.setShortcut);
            this.MediaMetadataCompat.setOnMenuItemClickListener(this.ActionMenuItemView);
            this.MediaMetadataCompat.setMenuCallbacks(this.PlaybackStateCompat, this.setChecked);
            write write2 = new write();
            write2.write = 8388613 | (this.IconCompatParcelizer & 112);
            this.MediaMetadataCompat.setLayoutParams(write2);
            MediaBrowserCompat$CustomActionResultReceiver(this.MediaMetadataCompat, false);
        }
    }

    public void setOnMenuItemClickListener(IconCompatParcelizer iconCompatParcelizer) {
        this.MediaDescriptionCompat = iconCompatParcelizer;
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = PKIFailureInfo.systemUnavail;
        }
        if (i != this.setContentView) {
            this.setContentView = i;
            ImageButton imageButton = this.RatingCompat;
            if ((imageButton != null ? imageButton.getDrawable() : null) != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = PKIFailureInfo.systemUnavail;
        }
        if (i != this.AlertController$RecycleListView) {
            this.AlertController$RecycleListView = i;
            ImageButton imageButton = this.RatingCompat;
            if ((imageButton != null ? imageButton.getDrawable() : null) != null) {
                requestLayout();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.MediaBrowserCompat$ItemReceiver;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int RatingCompat() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.MediaMetadataCompat
            r1 = 0
            if (r0 == 0) goto L_0x0011
            o.MenuItemImpl r0 = r0.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x002e
            o.AlertController$RecycleListView$IconCompatParcelizer r0 = r3.AppCompatDialogFragment
            if (r0 == 0) goto L_0x0022
            boolean r2 = r0.write
            if (r2 == 0) goto L_0x001f
            int r0 = r0.RatingCompat
            goto L_0x0023
        L_0x001f:
            int r0 = r0.MediaMetadataCompat
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            int r2 = r3.AlertController$RecycleListView
            int r1 = java.lang.Math.max(r2, r1)
            int r1 = java.lang.Math.max(r0, r1)
            goto L_0x003c
        L_0x002e:
            o.AlertController$RecycleListView$IconCompatParcelizer r0 = r3.AppCompatDialogFragment
            if (r0 == 0) goto L_0x003c
            boolean r1 = r0.write
            if (r1 == 0) goto L_0x0039
            int r0 = r0.RatingCompat
            goto L_0x003b
        L_0x0039:
            int r0 = r0.MediaMetadataCompat
        L_0x003b:
            r1 = r0
        L_0x003c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.RatingCompat():int");
    }

    private void MediaMetadataCompat() {
        if (this.RatingCompat == null) {
            this.RatingCompat = new AppCompatImageButton(getContext(), (AttributeSet) null, AlertController$RecycleListView.read.toolbarNavigationButtonStyle);
            write write2 = new write();
            write2.write = 8388611 | (this.IconCompatParcelizer & 112);
            this.RatingCompat.setLayoutParams(write2);
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(View view, boolean z) {
        write write2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            write2 = new write();
        } else if (!checkLayoutParams(layoutParams)) {
            write2 = MediaBrowserCompat$CustomActionResultReceiver(layoutParams);
        } else {
            write2 = (write) layoutParams;
        }
        write2.MediaBrowserCompat$ItemReceiver = 1;
        if (!z || this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            addView(view, write2);
            return;
        }
        view.setLayoutParams(write2);
        this.MediaBrowserCompat$MediaItem.add(view);
    }

    public Parcelable onSaveInstanceState() {
        Toolbar$MediaBrowserCompat$ItemReceiver toolbar$MediaBrowserCompat$ItemReceiver = new Toolbar$MediaBrowserCompat$ItemReceiver(super.onSaveInstanceState());
        read read2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (!(read2 == null || read2.MediaBrowserCompat$CustomActionResultReceiver == null)) {
            toolbar$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.getItemId();
        }
        toolbar$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = mo758r_();
        return toolbar$MediaBrowserCompat$ItemReceiver;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItemImpl menuItemImpl;
        MenuItem findItem;
        if (!(parcelable instanceof Toolbar$MediaBrowserCompat$ItemReceiver)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Toolbar$MediaBrowserCompat$ItemReceiver toolbar$MediaBrowserCompat$ItemReceiver = (Toolbar$MediaBrowserCompat$ItemReceiver) parcelable;
        super.onRestoreInstanceState(toolbar$MediaBrowserCompat$ItemReceiver.write);
        ActionMenuView actionMenuView = this.MediaMetadataCompat;
        if (actionMenuView != null) {
            menuItemImpl = actionMenuView.MediaBrowserCompat$ItemReceiver;
        } else {
            menuItemImpl = null;
        }
        if (!(toolbar$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver == 0 || this.MediaBrowserCompat$SearchResultReceiver == null || menuItemImpl == null || (findItem = menuItemImpl.findItem(toolbar$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver)) == null)) {
            findItem.expandActionView();
        }
        if (toolbar$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer) {
            removeCallbacks(this.setPadding);
            post(this.setPadding);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.setPadding);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.AppCompatDelegateImpl$ListMenuDecorView = false;
        }
        if (!this.AppCompatDelegateImpl$ListMenuDecorView) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.AppCompatDelegateImpl$ListMenuDecorView = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.AppCompatDelegateImpl$ListMenuDecorView = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.AppCompatActivity = false;
        }
        if (!this.AppCompatActivity) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.AppCompatActivity = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.AppCompatActivity = false;
        }
        return true;
    }

    private void IconCompatParcelizer(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i5 = marginLayoutParams.leftMargin;
        int childMeasureSpec = getChildMeasureSpec(i, paddingLeft + paddingRight + i5 + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i6 = marginLayoutParams.topMargin;
        int childMeasureSpec2 = getChildMeasureSpec(i3, paddingTop + paddingBottom + i6 + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private int MediaBrowserCompat$ItemReceiver(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = marginLayoutParams.topMargin;
        view.measure(childMeasureSpec, getChildMeasureSpec(i3, paddingTop + paddingBottom + i7 + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.setForceShowIcon;
        boolean z = true;
        int i11 = 0;
        if (setDefaultActionButtonContentDescription.MediaBrowserCompat$ItemReceiver(this)) {
            c2 = 1;
            c = 0;
        } else {
            c = 1;
            c2 = 0;
        }
        ImageButton imageButton = this.RatingCompat;
        if ((imageButton == null || imageButton.getParent() != this || imageButton.getVisibility() == 8) ? false : true) {
            IconCompatParcelizer(this.RatingCompat, i, 0, i2, this.AppCompatViewInflater);
            int measuredWidth = this.RatingCompat.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.RatingCompat.getLayoutParams();
            i5 = measuredWidth + setOnSuggestionListener.IconCompatParcelizer(marginLayoutParams) + setOnSuggestionListener.MediaBrowserCompat$CustomActionResultReceiver(marginLayoutParams);
            int measuredHeight = this.RatingCompat.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.RatingCompat.getLayoutParams();
            i4 = Math.max(0, measuredHeight + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin);
            i3 = View.combineMeasuredStates(0, this.RatingCompat.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        ImageButton imageButton2 = this.MediaBrowserCompat$ItemReceiver;
        if ((imageButton2 == null || imageButton2.getParent() != this || imageButton2.getVisibility() == 8) ? false : true) {
            IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, i, 0, i2, this.AppCompatViewInflater);
            int measuredWidth2 = this.MediaBrowserCompat$ItemReceiver.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.MediaBrowserCompat$ItemReceiver.getLayoutParams();
            i5 = measuredWidth2 + setOnSuggestionListener.IconCompatParcelizer(marginLayoutParams3) + setOnSuggestionListener.MediaBrowserCompat$CustomActionResultReceiver(marginLayoutParams3);
            int measuredHeight2 = this.MediaBrowserCompat$ItemReceiver.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.MediaBrowserCompat$ItemReceiver.getLayoutParams();
            i4 = Math.max(i4, measuredHeight2 + marginLayoutParams4.topMargin + marginLayoutParams4.bottomMargin);
            i3 = View.combineMeasuredStates(i3, this.MediaBrowserCompat$ItemReceiver.getMeasuredState());
        }
        int MediaBrowserCompat$MediaItem2 = MediaBrowserCompat$MediaItem();
        int max = Math.max(MediaBrowserCompat$MediaItem2, i5) + 0;
        iArr[c2] = Math.max(0, MediaBrowserCompat$MediaItem2 - i5);
        ActionMenuView actionMenuView = this.MediaMetadataCompat;
        if ((actionMenuView == null || actionMenuView.getParent() != this || actionMenuView.getVisibility() == 8) ? false : true) {
            IconCompatParcelizer(this.MediaMetadataCompat, i, max, i2, this.AppCompatViewInflater);
            int measuredWidth3 = this.MediaMetadataCompat.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) this.MediaMetadataCompat.getLayoutParams();
            i6 = measuredWidth3 + setOnSuggestionListener.IconCompatParcelizer(marginLayoutParams5) + setOnSuggestionListener.MediaBrowserCompat$CustomActionResultReceiver(marginLayoutParams5);
            int measuredHeight3 = this.MediaMetadataCompat.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) this.MediaMetadataCompat.getLayoutParams();
            i4 = Math.max(i4, measuredHeight3 + marginLayoutParams6.topMargin + marginLayoutParams6.bottomMargin);
            i3 = View.combineMeasuredStates(i3, this.MediaMetadataCompat.getMeasuredState());
        } else {
            i6 = 0;
        }
        int RatingCompat2 = RatingCompat();
        int max2 = max + Math.max(RatingCompat2, i6);
        iArr[c] = Math.max(0, RatingCompat2 - i6);
        View view = this.MediaBrowserCompat$CustomActionResultReceiver;
        if ((view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true) {
            max2 += MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, i, max2, i2, 0, iArr);
            int measuredHeight4 = this.MediaBrowserCompat$CustomActionResultReceiver.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) this.MediaBrowserCompat$CustomActionResultReceiver.getLayoutParams();
            i4 = Math.max(i4, measuredHeight4 + marginLayoutParams7.topMargin + marginLayoutParams7.bottomMargin);
            i3 = View.combineMeasuredStates(i3, this.MediaBrowserCompat$CustomActionResultReceiver.getMeasuredState());
        }
        ImageView imageView = this.setCheckable;
        if ((imageView == null || imageView.getParent() != this || imageView.getVisibility() == 8) ? false : true) {
            max2 += MediaBrowserCompat$ItemReceiver(this.setCheckable, i, max2, i2, 0, iArr);
            int measuredHeight5 = this.setCheckable.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) this.setCheckable.getLayoutParams();
            i4 = Math.max(i4, measuredHeight5 + marginLayoutParams8.topMargin + marginLayoutParams8.bottomMargin);
            i3 = View.combineMeasuredStates(i3, this.setCheckable.getMeasuredState());
        }
        int childCount = getChildCount();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            if (((write) childAt.getLayoutParams()).MediaBrowserCompat$ItemReceiver == 0) {
                if ((childAt == null || childAt.getParent() != this || childAt.getVisibility() == 8) ? false : true) {
                    i10 = i12;
                    max2 += MediaBrowserCompat$ItemReceiver(childAt, i, max2, i2, 0, iArr);
                    int measuredHeight6 = childAt.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams9 = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                    i4 = Math.max(i4, measuredHeight6 + marginLayoutParams9.topMargin + marginLayoutParams9.bottomMargin);
                    i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
                    i12 = i10 + 1;
                }
            }
            i10 = i12;
            i12 = i10 + 1;
        }
        int i13 = this.MediaSessionCompat$Token + this.f11x50fd9e4a;
        int i14 = this.MediaSessionCompat$ResultReceiverWrapper + this.ParcelableVolumeInfo;
        TextView textView = this.setVisibility;
        if ((textView == null || textView.getParent() != this || textView.getVisibility() == 8) ? false : true) {
            MediaBrowserCompat$ItemReceiver(this.setVisibility, i, max2 + i14, i2, i13, iArr);
            int measuredWidth4 = this.setVisibility.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams10 = (ViewGroup.MarginLayoutParams) this.setVisibility.getLayoutParams();
            int IconCompatParcelizer2 = setOnSuggestionListener.IconCompatParcelizer(marginLayoutParams10) + setOnSuggestionListener.MediaBrowserCompat$CustomActionResultReceiver(marginLayoutParams10);
            int measuredHeight7 = this.setVisibility.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams11 = (ViewGroup.MarginLayoutParams) this.setVisibility.getLayoutParams();
            i7 = measuredHeight7 + marginLayoutParams11.topMargin + marginLayoutParams11.bottomMargin;
            i9 = View.combineMeasuredStates(i3, this.setVisibility.getMeasuredState());
            i8 = measuredWidth4 + IconCompatParcelizer2;
        } else {
            i7 = 0;
            i9 = i3;
            i8 = 0;
        }
        TextView textView2 = this.setGroupDividerEnabled;
        if ((textView2 == null || textView2.getParent() != this || textView2.getVisibility() == 8) ? false : true) {
            i8 = Math.max(i8, MediaBrowserCompat$ItemReceiver(this.setGroupDividerEnabled, i, max2 + i14, i2, i7 + i13, iArr));
            int measuredHeight8 = this.setGroupDividerEnabled.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams12 = (ViewGroup.MarginLayoutParams) this.setGroupDividerEnabled.getLayoutParams();
            i7 += measuredHeight8 + marginLayoutParams12.topMargin + marginLayoutParams12.bottomMargin;
            i9 = View.combineMeasuredStates(i9, this.setGroupDividerEnabled.getMeasuredState());
        } else {
            int i15 = i9;
        }
        int max3 = Math.max(i4, i7);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(max2 + i8 + paddingLeft + paddingRight, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(max3 + paddingTop + paddingBottom, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (this.PlaybackStateCompat$CustomAction) {
            int childCount2 = getChildCount();
            int i16 = 0;
            while (true) {
                if (i16 < childCount2) {
                    View childAt2 = getChildAt(i16);
                    if (((childAt2 == null || childAt2.getParent() != this || childAt2.getVisibility() == 8) ? false : true) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            i11 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i11);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0198 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x031d A[LOOP:0: B:160:0x031b->B:161:0x031d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x033f A[LOOP:1: B:163:0x033d->B:164:0x033f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0363 A[LOOP:2: B:166:0x0361->B:167:0x0363, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03b3 A[LOOP:3: B:174:0x03b1->B:175:0x03b3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x017c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = p040o.SwitchCompat.m3079x50fd9e4a(r18)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = r2
            goto L_0x000d
        L_0x000c:
            r1 = r3
        L_0x000d:
            int r4 = r18.getWidth()
            int r5 = r18.getHeight()
            int r6 = r18.getPaddingLeft()
            int r7 = r18.getPaddingRight()
            int r8 = r18.getPaddingTop()
            int r9 = r18.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.setForceShowIcon
            r11[r2] = r3
            r11[r3] = r3
            int r12 = p040o.SwitchCompat.MediaSessionCompat$ResultReceiverWrapper(r18)
            if (r12 < 0) goto L_0x003a
            int r13 = r23 - r21
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = r3
        L_0x003b:
            android.widget.ImageButton r13 = r0.RatingCompat
            r14 = 8
            if (r13 == 0) goto L_0x004f
            android.view.ViewParent r15 = r13.getParent()
            if (r15 != r0) goto L_0x004f
            int r13 = r13.getVisibility()
            if (r13 == r14) goto L_0x004f
            r13 = r2
            goto L_0x0050
        L_0x004f:
            r13 = r3
        L_0x0050:
            if (r13 == 0) goto L_0x0064
            if (r1 == 0) goto L_0x005d
            android.widget.ImageButton r13 = r0.RatingCompat
            int r13 = r0.MediaBrowserCompat$ItemReceiver(r13, r10, r11, r12)
            r15 = r13
            r13 = r6
            goto L_0x0066
        L_0x005d:
            android.widget.ImageButton r13 = r0.RatingCompat
            int r13 = r0.write(r13, r6, r11, r12)
            goto L_0x0065
        L_0x0064:
            r13 = r6
        L_0x0065:
            r15 = r10
        L_0x0066:
            android.widget.ImageButton r3 = r0.MediaBrowserCompat$ItemReceiver
            if (r3 == 0) goto L_0x0078
            android.view.ViewParent r2 = r3.getParent()
            if (r2 != r0) goto L_0x0078
            int r2 = r3.getVisibility()
            if (r2 == r14) goto L_0x0078
            r2 = 1
            goto L_0x0079
        L_0x0078:
            r2 = 0
        L_0x0079:
            if (r2 == 0) goto L_0x008a
            if (r1 == 0) goto L_0x0084
            android.widget.ImageButton r2 = r0.MediaBrowserCompat$ItemReceiver
            int r15 = r0.MediaBrowserCompat$ItemReceiver(r2, r15, r11, r12)
            goto L_0x008a
        L_0x0084:
            android.widget.ImageButton r2 = r0.MediaBrowserCompat$ItemReceiver
            int r13 = r0.write(r2, r13, r11, r12)
        L_0x008a:
            androidx.appcompat.widget.ActionMenuView r2 = r0.MediaMetadataCompat
            if (r2 == 0) goto L_0x009c
            android.view.ViewParent r3 = r2.getParent()
            if (r3 != r0) goto L_0x009c
            int r2 = r2.getVisibility()
            if (r2 == r14) goto L_0x009c
            r2 = 1
            goto L_0x009d
        L_0x009c:
            r2 = 0
        L_0x009d:
            if (r2 == 0) goto L_0x00ae
            if (r1 == 0) goto L_0x00a8
            androidx.appcompat.widget.ActionMenuView r2 = r0.MediaMetadataCompat
            int r13 = r0.write(r2, r13, r11, r12)
            goto L_0x00ae
        L_0x00a8:
            androidx.appcompat.widget.ActionMenuView r2 = r0.MediaMetadataCompat
            int r15 = r0.MediaBrowserCompat$ItemReceiver(r2, r15, r11, r12)
        L_0x00ae:
            int r2 = p040o.SwitchCompat.m3079x50fd9e4a(r18)
            r3 = 1
            if (r2 != r3) goto L_0x00ba
            int r2 = r18.RatingCompat()
            goto L_0x00be
        L_0x00ba:
            int r2 = r18.MediaBrowserCompat$MediaItem()
        L_0x00be:
            int r14 = p040o.SwitchCompat.m3079x50fd9e4a(r18)
            if (r14 != r3) goto L_0x00c9
            int r14 = r18.MediaBrowserCompat$MediaItem()
            goto L_0x00cd
        L_0x00c9:
            int r14 = r18.RatingCompat()
        L_0x00cd:
            int r3 = r2 - r13
            r22 = r7
            r7 = 0
            int r3 = java.lang.Math.max(r7, r3)
            r11[r7] = r3
            int r3 = r10 - r15
            int r3 = r14 - r3
            int r3 = java.lang.Math.max(r7, r3)
            r7 = 1
            r11[r7] = r3
            int r2 = java.lang.Math.max(r13, r2)
            int r10 = r10 - r14
            int r3 = java.lang.Math.min(r15, r10)
            android.view.View r7 = r0.MediaBrowserCompat$CustomActionResultReceiver
            if (r7 == 0) goto L_0x0100
            android.view.ViewParent r10 = r7.getParent()
            if (r10 != r0) goto L_0x0100
            int r7 = r7.getVisibility()
            r10 = 8
            if (r7 == r10) goto L_0x0100
            r7 = 1
            goto L_0x0101
        L_0x0100:
            r7 = 0
        L_0x0101:
            if (r7 == 0) goto L_0x0112
            if (r1 == 0) goto L_0x010c
            android.view.View r7 = r0.MediaBrowserCompat$CustomActionResultReceiver
            int r3 = r0.MediaBrowserCompat$ItemReceiver(r7, r3, r11, r12)
            goto L_0x0112
        L_0x010c:
            android.view.View r7 = r0.MediaBrowserCompat$CustomActionResultReceiver
            int r2 = r0.write(r7, r2, r11, r12)
        L_0x0112:
            android.widget.ImageView r7 = r0.setCheckable
            if (r7 == 0) goto L_0x0126
            android.view.ViewParent r10 = r7.getParent()
            if (r10 != r0) goto L_0x0126
            int r7 = r7.getVisibility()
            r10 = 8
            if (r7 == r10) goto L_0x0126
            r7 = 1
            goto L_0x0127
        L_0x0126:
            r7 = 0
        L_0x0127:
            if (r7 == 0) goto L_0x0138
            if (r1 == 0) goto L_0x0132
            android.widget.ImageView r7 = r0.setCheckable
            int r3 = r0.MediaBrowserCompat$ItemReceiver(r7, r3, r11, r12)
            goto L_0x0138
        L_0x0132:
            android.widget.ImageView r7 = r0.setCheckable
            int r2 = r0.write(r7, r2, r11, r12)
        L_0x0138:
            android.widget.TextView r7 = r0.setVisibility
            if (r7 == 0) goto L_0x014c
            android.view.ViewParent r10 = r7.getParent()
            if (r10 != r0) goto L_0x014c
            int r7 = r7.getVisibility()
            r10 = 8
            if (r7 == r10) goto L_0x014e
            r7 = 1
            goto L_0x014f
        L_0x014c:
            r10 = 8
        L_0x014e:
            r7 = 0
        L_0x014f:
            android.widget.TextView r13 = r0.setGroupDividerEnabled
            if (r13 == 0) goto L_0x0161
            android.view.ViewParent r14 = r13.getParent()
            if (r14 != r0) goto L_0x0161
            int r13 = r13.getVisibility()
            if (r13 == r10) goto L_0x0161
            r10 = 1
            goto L_0x0162
        L_0x0161:
            r10 = 0
        L_0x0162:
            if (r7 == 0) goto L_0x0179
            android.widget.TextView r13 = r0.setVisibility
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            androidx.appcompat.widget.Toolbar$write r13 = (androidx.appcompat.widget.Toolbar.write) r13
            int r14 = r13.topMargin
            android.widget.TextView r15 = r0.setVisibility
            int r15 = r15.getMeasuredHeight()
            int r14 = r14 + r15
            int r13 = r13.bottomMargin
            int r13 = r13 + r14
            goto L_0x017a
        L_0x0179:
            r13 = 0
        L_0x017a:
            if (r10 == 0) goto L_0x0194
            android.widget.TextView r14 = r0.setGroupDividerEnabled
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            androidx.appcompat.widget.Toolbar$write r14 = (androidx.appcompat.widget.Toolbar.write) r14
            int r15 = r14.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.setGroupDividerEnabled
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r14.bottomMargin
            int r15 = r15 + r4
            int r13 = r13 + r15
            goto L_0x0196
        L_0x0194:
            r16 = r4
        L_0x0196:
            if (r7 != 0) goto L_0x01a2
            if (r10 != 0) goto L_0x01a2
            r23 = r2
            r17 = r6
            r21 = r12
            goto L_0x029d
        L_0x01a2:
            if (r7 == 0) goto L_0x01a7
            android.widget.TextView r4 = r0.setVisibility
            goto L_0x01a9
        L_0x01a7:
            android.widget.TextView r4 = r0.setGroupDividerEnabled
        L_0x01a9:
            if (r10 == 0) goto L_0x01ae
            android.widget.TextView r14 = r0.setGroupDividerEnabled
            goto L_0x01b0
        L_0x01ae:
            android.widget.TextView r14 = r0.setVisibility
        L_0x01b0:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$write r4 = (androidx.appcompat.widget.Toolbar.write) r4
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            androidx.appcompat.widget.Toolbar$write r14 = (androidx.appcompat.widget.Toolbar.write) r14
            if (r7 == 0) goto L_0x01c6
            android.widget.TextView r15 = r0.setVisibility
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x01d0
        L_0x01c6:
            if (r10 == 0) goto L_0x01d4
            android.widget.TextView r15 = r0.setGroupDividerEnabled
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x01d4
        L_0x01d0:
            r17 = r6
            r15 = 1
            goto L_0x01d7
        L_0x01d4:
            r17 = r6
            r15 = 0
        L_0x01d7:
            int r6 = r0.setBackgroundResource
            r6 = r6 & 112(0x70, float:1.57E-43)
            r21 = r12
            r12 = 48
            if (r6 == r12) goto L_0x0220
            r12 = 80
            if (r6 == r12) goto L_0x0214
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r13
            int r6 = r6 / 2
            int r12 = r4.topMargin
            r23 = r2
            int r2 = r0.MediaSessionCompat$Token
            int r12 = r12 + r2
            if (r6 >= r12) goto L_0x01fb
            int r2 = r4.topMargin
            int r4 = r0.MediaSessionCompat$Token
            int r6 = r2 + r4
            goto L_0x0212
        L_0x01fb:
            int r5 = r5 - r9
            int r5 = r5 - r13
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r4 = r0.f11x50fd9e4a
            int r2 = r2 + r4
            if (r5 >= r2) goto L_0x0212
            int r2 = r14.bottomMargin
            int r4 = r0.f11x50fd9e4a
            int r2 = r2 + r4
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0212:
            int r8 = r8 + r6
            goto L_0x022d
        L_0x0214:
            r23 = r2
            int r5 = r5 - r9
            int r2 = r14.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f11x50fd9e4a
            int r5 = r5 - r2
            int r8 = r5 - r13
            goto L_0x022d
        L_0x0220:
            r23 = r2
            int r2 = r18.getPaddingTop()
            int r4 = r4.topMargin
            int r2 = r2 + r4
            int r4 = r0.MediaSessionCompat$Token
            int r8 = r2 + r4
        L_0x022d:
            if (r1 == 0) goto L_0x02a1
            if (r15 == 0) goto L_0x0234
            int r1 = r0.MediaSessionCompat$ResultReceiverWrapper
            goto L_0x0235
        L_0x0234:
            r1 = 0
        L_0x0235:
            r2 = 1
            r4 = r11[r2]
            int r1 = r1 - r4
            r4 = 0
            int r5 = java.lang.Math.max(r4, r1)
            int r3 = r3 - r5
            int r1 = -r1
            int r1 = java.lang.Math.max(r4, r1)
            r11[r2] = r1
            if (r7 == 0) goto L_0x026c
            android.widget.TextView r1 = r0.setVisibility
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$write r1 = (androidx.appcompat.widget.Toolbar.write) r1
            android.widget.TextView r2 = r0.setVisibility
            int r2 = r2.getMeasuredWidth()
            int r2 = r3 - r2
            android.widget.TextView r4 = r0.setVisibility
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.setVisibility
            r5.layout(r2, r8, r3, r4)
            int r5 = r0.ParcelableVolumeInfo
            int r2 = r2 - r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x026d
        L_0x026c:
            r2 = r3
        L_0x026d:
            if (r10 == 0) goto L_0x0295
            android.widget.TextView r1 = r0.setGroupDividerEnabled
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$write r1 = (androidx.appcompat.widget.Toolbar.write) r1
            int r4 = r1.topMargin
            int r8 = r8 + r4
            android.widget.TextView r4 = r0.setGroupDividerEnabled
            int r4 = r4.getMeasuredWidth()
            android.widget.TextView r5 = r0.setGroupDividerEnabled
            int r5 = r5.getMeasuredHeight()
            android.widget.TextView r6 = r0.setGroupDividerEnabled
            int r4 = r3 - r4
            int r5 = r5 + r8
            r6.layout(r4, r8, r3, r5)
            int r4 = r0.ParcelableVolumeInfo
            int r4 = r3 - r4
            int r1 = r1.bottomMargin
            goto L_0x0296
        L_0x0295:
            r4 = r3
        L_0x0296:
            if (r15 == 0) goto L_0x029d
            int r1 = java.lang.Math.min(r2, r4)
            r3 = r1
        L_0x029d:
            r2 = r23
            goto L_0x030d
        L_0x02a1:
            if (r15 == 0) goto L_0x02a6
            int r1 = r0.MediaSessionCompat$ResultReceiverWrapper
            goto L_0x02a7
        L_0x02a6:
            r1 = 0
        L_0x02a7:
            r2 = 0
            r4 = r11[r2]
            int r1 = r1 - r4
            int r4 = java.lang.Math.max(r2, r1)
            int r4 = r23 + r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r7 == 0) goto L_0x02dd
            android.widget.TextView r1 = r0.setVisibility
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$write r1 = (androidx.appcompat.widget.Toolbar.write) r1
            android.widget.TextView r2 = r0.setVisibility
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r4
            android.widget.TextView r5 = r0.setVisibility
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.setVisibility
            r6.layout(r4, r8, r2, r5)
            int r6 = r0.ParcelableVolumeInfo
            int r2 = r2 + r6
            int r1 = r1.bottomMargin
            int r8 = r5 + r1
            goto L_0x02de
        L_0x02dd:
            r2 = r4
        L_0x02de:
            if (r10 == 0) goto L_0x0304
            android.widget.TextView r1 = r0.setGroupDividerEnabled
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$write r1 = (androidx.appcompat.widget.Toolbar.write) r1
            int r5 = r1.topMargin
            int r8 = r8 + r5
            android.widget.TextView r5 = r0.setGroupDividerEnabled
            int r5 = r5.getMeasuredWidth()
            int r5 = r5 + r4
            android.widget.TextView r6 = r0.setGroupDividerEnabled
            int r6 = r6.getMeasuredHeight()
            android.widget.TextView r7 = r0.setGroupDividerEnabled
            int r6 = r6 + r8
            r7.layout(r4, r8, r5, r6)
            int r6 = r0.ParcelableVolumeInfo
            int r5 = r5 + r6
            int r1 = r1.bottomMargin
            goto L_0x0305
        L_0x0304:
            r5 = r4
        L_0x0305:
            if (r15 == 0) goto L_0x030c
            int r2 = java.lang.Math.max(r2, r5)
            goto L_0x030d
        L_0x030c:
            r2 = r4
        L_0x030d:
            java.util.ArrayList<android.view.View> r1 = r0.ListMenuItemView
            r4 = 3
            r0.MediaBrowserCompat$ItemReceiver(r1, r4)
            java.util.ArrayList<android.view.View> r1 = r0.ListMenuItemView
            int r1 = r1.size()
            r4 = r2
            r2 = 0
        L_0x031b:
            if (r2 >= r1) goto L_0x032e
            java.util.ArrayList<android.view.View> r5 = r0.ListMenuItemView
            java.lang.Object r5 = r5.get(r2)
            android.view.View r5 = (android.view.View) r5
            r12 = r21
            int r4 = r0.write(r5, r4, r11, r12)
            int r2 = r2 + 1
            goto L_0x031b
        L_0x032e:
            r12 = r21
            java.util.ArrayList<android.view.View> r1 = r0.ListMenuItemView
            r2 = 5
            r0.MediaBrowserCompat$ItemReceiver(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.ListMenuItemView
            int r1 = r1.size()
            r2 = 0
        L_0x033d:
            if (r2 >= r1) goto L_0x034e
            java.util.ArrayList<android.view.View> r5 = r0.ListMenuItemView
            java.lang.Object r5 = r5.get(r2)
            android.view.View r5 = (android.view.View) r5
            int r3 = r0.MediaBrowserCompat$ItemReceiver(r5, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x033d
        L_0x034e:
            java.util.ArrayList<android.view.View> r1 = r0.ListMenuItemView
            r2 = 1
            r0.MediaBrowserCompat$ItemReceiver(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.ListMenuItemView
            r5 = 0
            r6 = r11[r5]
            r2 = r11[r2]
            int r5 = r1.size()
            r7 = 0
            r8 = 0
        L_0x0361:
            if (r7 >= r5) goto L_0x0394
            java.lang.Object r9 = r1.get(r7)
            android.view.View r9 = (android.view.View) r9
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            androidx.appcompat.widget.Toolbar$write r10 = (androidx.appcompat.widget.Toolbar.write) r10
            int r13 = r10.leftMargin
            int r13 = r13 - r6
            int r6 = r10.rightMargin
            int r6 = r6 - r2
            r2 = 0
            int r10 = java.lang.Math.max(r2, r13)
            int r14 = java.lang.Math.max(r2, r6)
            int r13 = -r13
            int r13 = java.lang.Math.max(r2, r13)
            int r6 = -r6
            int r6 = java.lang.Math.max(r2, r6)
            int r9 = r9.getMeasuredWidth()
            int r10 = r10 + r9
            int r10 = r10 + r14
            int r8 = r8 + r10
            int r7 = r7 + 1
            r2 = r6
            r6 = r13
            goto L_0x0361
        L_0x0394:
            r2 = 0
            int r1 = r16 - r17
            int r1 = r1 - r22
            int r1 = r1 / 2
            int r6 = r17 + r1
            int r1 = r8 / 2
            int r6 = r6 - r1
            int r8 = r8 + r6
            if (r6 < r4) goto L_0x03aa
            if (r8 <= r3) goto L_0x03a9
            int r8 = r8 - r3
            int r4 = r6 - r8
            goto L_0x03aa
        L_0x03a9:
            r4 = r6
        L_0x03aa:
            java.util.ArrayList<android.view.View> r1 = r0.ListMenuItemView
            int r1 = r1.size()
            r3 = r2
        L_0x03b1:
            if (r3 >= r1) goto L_0x03c2
            java.util.ArrayList<android.view.View> r2 = r0.ListMenuItemView
            java.lang.Object r2 = r2.get(r3)
            android.view.View r2 = (android.view.View) r2
            int r4 = r0.write(r2, r4, r11, r12)
            int r3 = r3 + 1
            goto L_0x03b1
        L_0x03c2:
            java.util.ArrayList<android.view.View> r1 = r0.ListMenuItemView
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    private int write(View view, int i, int[] iArr, int i2) {
        write write2 = (write) view.getLayoutParams();
        int i3 = write2.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int read2 = read(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, read2, max + measuredWidth, view.getMeasuredHeight() + read2);
        return max + measuredWidth + write2.rightMargin;
    }

    private int MediaBrowserCompat$ItemReceiver(View view, int i, int[] iArr, int i2) {
        write write2 = (write) view.getLayoutParams();
        int i3 = write2.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int read2 = read(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, read2, max, view.getMeasuredHeight() + read2);
        return max - (measuredWidth + write2.leftMargin);
    }

    private int read(View view, int i) {
        write write2 = (write) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = write2.write & 112;
        if (!(i3 == 16 || i3 == 48 || i3 == 80)) {
            i3 = this.setBackgroundResource & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - write2.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (i4 < write2.topMargin) {
            i4 = write2.topMargin;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            if (i5 < write2.bottomMargin) {
                i4 = Math.max(0, i4 - (write2.bottomMargin - i5));
            }
        }
        return paddingTop + i4;
    }

    private void MediaBrowserCompat$ItemReceiver(List<View> list, int i) {
        boolean z = SwitchCompat.m3079x50fd9e4a(this) == 1;
        int childCount = getChildCount();
        int MediaBrowserCompat$CustomActionResultReceiver2 = setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(i, SwitchCompat.m3079x50fd9e4a(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                write write2 = (write) childAt.getLayoutParams();
                if (write2.MediaBrowserCompat$ItemReceiver == 0) {
                    if (((childAt == null || childAt.getParent() != this || childAt.getVisibility() == 8) ? false : true) && MediaBrowserCompat$ItemReceiver(write2.write) == MediaBrowserCompat$CustomActionResultReceiver2) {
                        list.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            write write3 = (write) childAt2.getLayoutParams();
            if (write3.MediaBrowserCompat$ItemReceiver == 0) {
                if (((childAt2 == null || childAt2.getParent() != this || childAt2.getVisibility() == 8) ? false : true) && MediaBrowserCompat$ItemReceiver(write3.write) == MediaBrowserCompat$CustomActionResultReceiver2) {
                    list.add(childAt2);
                }
            }
        }
    }

    private int MediaBrowserCompat$ItemReceiver(int i) {
        int MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = SwitchCompat.m3079x50fd9e4a(this);
        int MediaBrowserCompat$CustomActionResultReceiver2 = setOnQueryTextListener.MediaBrowserCompat$CustomActionResultReceiver(i, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver) & 7;
        if (MediaBrowserCompat$CustomActionResultReceiver2 == 1 || MediaBrowserCompat$CustomActionResultReceiver2 == 3 || MediaBrowserCompat$CustomActionResultReceiver2 == 5) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        return MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver == 1 ? 5 : 3;
    }

    private static write MediaBrowserCompat$CustomActionResultReceiver(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof write) {
            return new write((write) layoutParams);
        }
        if (layoutParams instanceof Keep.IconCompatParcelizer) {
            return new write((Keep.IconCompatParcelizer) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new write((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new write(layoutParams);
    }

    protected static write MediaBrowserCompat$ItemReceiver() {
        return new write();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof write);
    }

    public void setCollapsible(boolean z) {
        this.PlaybackStateCompat$CustomAction = z;
        requestLayout();
    }

    public void setMenuCallbacks(setStackedBackground$MediaBrowserCompat$ItemReceiver setstackedbackground_mediabrowsercompat_itemreceiver, MenuItemImpl$MediaBrowserCompat$CustomActionResultReceiver menuItemImpl$MediaBrowserCompat$CustomActionResultReceiver) {
        this.PlaybackStateCompat = setstackedbackground_mediabrowsercompat_itemreceiver;
        this.setChecked = menuItemImpl$MediaBrowserCompat$CustomActionResultReceiver;
        ActionMenuView actionMenuView = this.MediaMetadataCompat;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(setstackedbackground_mediabrowsercompat_itemreceiver, menuItemImpl$MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public static class write extends Keep.IconCompatParcelizer {
        int MediaBrowserCompat$ItemReceiver = 0;

        public write(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public write() {
            super(-2, -2);
            this.write = 8388627;
        }

        public write(write write) {
            super((Keep.IconCompatParcelizer) write);
            this.MediaBrowserCompat$ItemReceiver = write.MediaBrowserCompat$ItemReceiver;
        }

        public write(Keep.IconCompatParcelizer iconCompatParcelizer) {
            super(iconCompatParcelizer);
        }

        public write(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public write(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public class read implements setStackedBackground {
        private MenuItemImpl IconCompatParcelizer;
        public androidx.appcompat.view.menu.MenuItemImpl MediaBrowserCompat$CustomActionResultReceiver;

        public final void MediaBrowserCompat$CustomActionResultReceiver(Parcelable parcelable) {
        }

        public final boolean MediaBrowserCompat$CustomActionResultReceiver(setCustomView setcustomview) {
            return false;
        }

        public final void MediaBrowserCompat$ItemReceiver(MenuItemImpl menuItemImpl, boolean z) {
        }

        public final void MediaBrowserCompat$ItemReceiver(setStackedBackground$MediaBrowserCompat$ItemReceiver setstackedbackground_mediabrowsercompat_itemreceiver) {
        }

        public final Parcelable RatingCompat() {
            return null;
        }

        /* renamed from: i_ */
        public final int mo795i_() {
            return 0;
        }

        public final boolean read() {
            return false;
        }

        read() {
        }

        public final void IconCompatParcelizer(Context context, MenuItemImpl menuItemImpl) {
            androidx.appcompat.view.menu.MenuItemImpl menuItemImpl2;
            MenuItemImpl menuItemImpl3 = this.IconCompatParcelizer;
            if (!(menuItemImpl3 == null || (menuItemImpl2 = this.MediaBrowserCompat$CustomActionResultReceiver) == null)) {
                menuItemImpl3.MediaBrowserCompat$ItemReceiver(menuItemImpl2);
            }
            this.IconCompatParcelizer = menuItemImpl;
        }

        public final void write(boolean z) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                MenuItemImpl menuItemImpl = this.IconCompatParcelizer;
                boolean z2 = false;
                if (menuItemImpl != null) {
                    int size = menuItemImpl.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.IconCompatParcelizer.getItem(i) == this.MediaBrowserCompat$CustomActionResultReceiver) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    write(this.MediaBrowserCompat$CustomActionResultReceiver);
                }
            }
        }

        public final boolean MediaBrowserCompat$ItemReceiver(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
            Toolbar toolbar = Toolbar.this;
            if (toolbar.MediaBrowserCompat$ItemReceiver == null) {
                AppCompatImageButton appCompatImageButton = new AppCompatImageButton(toolbar.getContext(), (AttributeSet) null, AlertController$RecycleListView.read.toolbarNavigationButtonStyle);
                toolbar.MediaBrowserCompat$ItemReceiver = appCompatImageButton;
                appCompatImageButton.setImageDrawable(toolbar.read);
                toolbar.MediaBrowserCompat$ItemReceiver.setContentDescription(toolbar.write);
                write write = new write();
                write.write = (toolbar.IconCompatParcelizer & 112) | 8388611;
                write.MediaBrowserCompat$ItemReceiver = 2;
                toolbar.MediaBrowserCompat$ItemReceiver.setLayoutParams(write);
                toolbar.MediaBrowserCompat$ItemReceiver.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        read read2 = Toolbar.this.MediaBrowserCompat$SearchResultReceiver;
                        androidx.appcompat.view.menu.MenuItemImpl menuItemImpl = read2 == null ? null : read2.MediaBrowserCompat$CustomActionResultReceiver;
                        if (menuItemImpl != null) {
                            menuItemImpl.collapseActionView();
                        }
                    }
                });
            }
            ViewParent parent = Toolbar.this.MediaBrowserCompat$ItemReceiver.getParent();
            Toolbar toolbar2 = Toolbar.this;
            if (parent != toolbar2) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar2.MediaBrowserCompat$ItemReceiver);
                }
                Toolbar toolbar3 = Toolbar.this;
                toolbar3.addView(toolbar3.MediaBrowserCompat$ItemReceiver);
            }
            Toolbar.this.MediaBrowserCompat$CustomActionResultReceiver = menuItemImpl.getActionView();
            this.MediaBrowserCompat$CustomActionResultReceiver = menuItemImpl;
            ViewParent parent2 = Toolbar.this.MediaBrowserCompat$CustomActionResultReceiver.getParent();
            Toolbar toolbar4 = Toolbar.this;
            if (parent2 != toolbar4) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar4.MediaBrowserCompat$CustomActionResultReceiver);
                }
                write MediaBrowserCompat$ItemReceiver2 = Toolbar.MediaBrowserCompat$ItemReceiver();
                MediaBrowserCompat$ItemReceiver2.write = (Toolbar.this.IconCompatParcelizer & 112) | 8388611;
                MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver = 2;
                Toolbar.this.MediaBrowserCompat$CustomActionResultReceiver.setLayoutParams(MediaBrowserCompat$ItemReceiver2);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.MediaBrowserCompat$CustomActionResultReceiver);
            }
            Toolbar toolbar6 = Toolbar.this;
            for (int childCount = toolbar6.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = toolbar6.getChildAt(childCount);
                if (!(((write) childAt.getLayoutParams()).MediaBrowserCompat$ItemReceiver == 2 || childAt == toolbar6.MediaMetadataCompat)) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.MediaBrowserCompat$MediaItem.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            menuItemImpl.read = true;
            menuItemImpl.write.IconCompatParcelizer(false);
            if (Toolbar.this.MediaBrowserCompat$CustomActionResultReceiver instanceof setPadding) {
                ((setPadding) Toolbar.this.MediaBrowserCompat$CustomActionResultReceiver).write();
            }
            return true;
        }

        public final boolean write(androidx.appcompat.view.menu.MenuItemImpl menuItemImpl) {
            if (Toolbar.this.MediaBrowserCompat$CustomActionResultReceiver instanceof setPadding) {
                ((setPadding) Toolbar.this.MediaBrowserCompat$CustomActionResultReceiver).IconCompatParcelizer();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.MediaBrowserCompat$CustomActionResultReceiver);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.MediaBrowserCompat$ItemReceiver);
            Toolbar.this.MediaBrowserCompat$CustomActionResultReceiver = null;
            Toolbar toolbar3 = Toolbar.this;
            for (int size = toolbar3.MediaBrowserCompat$MediaItem.size() - 1; size >= 0; size--) {
                toolbar3.addView(toolbar3.MediaBrowserCompat$MediaItem.get(size));
            }
            toolbar3.MediaBrowserCompat$MediaItem.clear();
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            Toolbar.this.requestLayout();
            menuItemImpl.read = false;
            menuItemImpl.write.IconCompatParcelizer(false);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new write();
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new write(getContext(), attributeSet);
    }

    private int MediaBrowserCompat$MediaItem() {
        ImageButton imageButton = this.RatingCompat;
        if ((imageButton != null ? imageButton.getDrawable() : null) != null) {
            AlertController$RecycleListView.IconCompatParcelizer iconCompatParcelizer = this.AppCompatDialogFragment;
            return Math.max(iconCompatParcelizer != null ? iconCompatParcelizer.write ? iconCompatParcelizer.MediaMetadataCompat : iconCompatParcelizer.RatingCompat : 0, Math.max(this.setContentView, 0));
        }
        AlertController$RecycleListView.IconCompatParcelizer iconCompatParcelizer2 = this.AppCompatDialogFragment;
        if (iconCompatParcelizer2 == null) {
            return 0;
        }
        return iconCompatParcelizer2.write ? iconCompatParcelizer2.MediaMetadataCompat : iconCompatParcelizer2.RatingCompat;
    }

    public final void IconCompatParcelizer(int i) {
        setIcon seticon = new setIcon(getContext());
        read();
        seticon.inflate(i, this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver());
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        if (this.AppCompatDialogFragment == null) {
            this.AppCompatDialogFragment = new AlertController$RecycleListView.IconCompatParcelizer();
        }
        this.AppCompatDialogFragment.MediaBrowserCompat$CustomActionResultReceiver(i, i2);
    }

    public void setContentInsetsRelative(int i, int i2) {
        if (this.AppCompatDialogFragment == null) {
            this.AppCompatDialogFragment = new AlertController$RecycleListView.IconCompatParcelizer();
        }
        this.AppCompatDialogFragment.read(i, i2);
    }

    public void setLogo(Drawable drawable) {
        boolean z = false;
        if (drawable != null) {
            if (this.setCheckable == null) {
                this.setCheckable = new AppCompatImageView(getContext());
            }
            ImageView imageView = this.setCheckable;
            if (imageView.getParent() == this || this.MediaBrowserCompat$MediaItem.contains(imageView)) {
                z = true;
            }
            if (!z) {
                MediaBrowserCompat$CustomActionResultReceiver(this.setCheckable, true);
            }
        } else {
            ImageView imageView2 = this.setCheckable;
            if (imageView2 != null) {
                if (imageView2.getParent() == this || this.MediaBrowserCompat$MediaItem.contains(imageView2)) {
                    z = true;
                }
                if (z) {
                    removeView(this.setCheckable);
                    this.MediaBrowserCompat$MediaItem.remove(this.setCheckable);
                }
            }
        }
        ImageView imageView3 = this.setCheckable;
        if (imageView3 != null) {
            imageView3.setImageDrawable(drawable);
        }
    }
}

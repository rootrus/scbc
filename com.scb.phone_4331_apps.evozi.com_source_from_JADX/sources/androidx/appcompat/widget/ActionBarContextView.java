package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.ActionMenuItemView;
import p040o.AlertController$RecycleListView;
import p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem;
import p040o.MenuItemImpl;
import p040o.SwitchCompat;
import p040o.setDefaultActionButtonContentDescription;
import p040o.setSwitchPadding;

public class ActionBarContextView extends AbsActionBarView {
    public CharSequence MediaBrowserCompat$MediaItem;
    public CharSequence MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private LinearLayout f6x50fd9e4a;
    public boolean MediaDescriptionCompat;
    private View MediaMetadataCompat;
    private TextView MediaSessionCompat$QueueItem;
    private int MediaSessionCompat$ResultReceiverWrapper;
    private View MediaSessionCompat$Token;
    private int ParcelableVolumeInfo;
    private int PlaybackStateCompat;
    private TextView setHasDecor;

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final /* bridge */ /* synthetic */ setSwitchPadding IconCompatParcelizer(int i, long j) {
        return super.IconCompatParcelizer(i, j);
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AlertController$RecycleListView.read.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AlertController$RecycleListView.MediaDescriptionCompat mediaDescriptionCompat = new AlertController$RecycleListView.MediaDescriptionCompat(context, context.obtainStyledAttributes(attributeSet, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionMode, i, 0));
        SwitchCompat.IconCompatParcelizer((View) this, mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionMode_background));
        this.PlaybackStateCompat = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionMode_titleTextStyle, 0);
        this.MediaSessionCompat$ResultReceiverWrapper = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionMode_subtitleTextStyle, 0);
        this.write = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getLayoutDimension(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionMode_height, 0);
        this.ParcelableVolumeInfo = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActionMode_closeItemLayout, AlertController$RecycleListView.MediaMetadataCompat.abc_action_mode_close_item_material);
        mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.recycle();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer.write();
            ActionMenuPresenter$MediaBrowserCompat$ItemReceiver actionMenuPresenter$MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.read;
            if (actionMenuPresenter$MediaBrowserCompat$ItemReceiver != null) {
                actionMenuPresenter$MediaBrowserCompat$ItemReceiver.read();
            }
        }
    }

    public void setContentHeight(int i) {
        this.write = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.MediaSessionCompat$Token;
        if (view2 != null) {
            removeView(view2);
        }
        this.MediaSessionCompat$Token = view;
        if (!(view == null || (linearLayout = this.f6x50fd9e4a) == null)) {
            removeView(linearLayout);
            this.f6x50fd9e4a = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setTitle(CharSequence charSequence) {
        this.MediaBrowserCompat$SearchResultReceiver = charSequence;
        MediaBrowserCompat$ItemReceiver();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.MediaBrowserCompat$MediaItem = charSequence;
        MediaBrowserCompat$ItemReceiver();
    }

    private void MediaBrowserCompat$ItemReceiver() {
        if (this.f6x50fd9e4a == null) {
            LayoutInflater.from(getContext()).inflate(AlertController$RecycleListView.MediaMetadataCompat.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f6x50fd9e4a = linearLayout;
            this.setHasDecor = (TextView) linearLayout.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.action_bar_title);
            this.MediaSessionCompat$QueueItem = (TextView) this.f6x50fd9e4a.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.action_bar_subtitle);
            if (this.PlaybackStateCompat != 0) {
                this.setHasDecor.setTextAppearance(getContext(), this.PlaybackStateCompat);
            }
            if (this.MediaSessionCompat$ResultReceiverWrapper != 0) {
                this.MediaSessionCompat$QueueItem.setTextAppearance(getContext(), this.MediaSessionCompat$ResultReceiverWrapper);
            }
        }
        this.setHasDecor.setText(this.MediaBrowserCompat$SearchResultReceiver);
        this.MediaSessionCompat$QueueItem.setText(this.MediaBrowserCompat$MediaItem);
        boolean isEmpty = TextUtils.isEmpty(this.MediaBrowserCompat$SearchResultReceiver);
        boolean z = !TextUtils.isEmpty(this.MediaBrowserCompat$MediaItem);
        int i = 8;
        this.MediaSessionCompat$QueueItem.setVisibility(z ? 0 : 8);
        LinearLayout linearLayout2 = this.f6x50fd9e4a;
        if ((!isEmpty) || z) {
            i = 0;
        }
        linearLayout2.setVisibility(i);
        if (this.f6x50fd9e4a.getParent() == null) {
            addView(this.f6x50fd9e4a);
        }
    }

    public final void IconCompatParcelizer(final ActionMenuItemView actionMenuItemView) {
        View view = this.MediaMetadataCompat;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.ParcelableVolumeInfo, this, false);
            this.MediaMetadataCompat = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.MediaMetadataCompat);
        }
        this.MediaMetadataCompat.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.action_mode_close_button).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                actionMenuItemView.read();
            }
        });
        MenuItemImpl menuItemImpl = (MenuItemImpl) actionMenuItemView.MediaBrowserCompat$CustomActionResultReceiver();
        if (this.IconCompatParcelizer != null) {
            ActionMenuPresenter actionMenuPresenter = this.IconCompatParcelizer;
            actionMenuPresenter.write();
            ActionMenuPresenter$MediaBrowserCompat$ItemReceiver actionMenuPresenter$MediaBrowserCompat$ItemReceiver = actionMenuPresenter.read;
            if (actionMenuPresenter$MediaBrowserCompat$ItemReceiver != null) {
                actionMenuPresenter$MediaBrowserCompat$ItemReceiver.read();
            }
        }
        this.IconCompatParcelizer = new ActionMenuPresenter(getContext());
        ActionMenuPresenter actionMenuPresenter2 = this.IconCompatParcelizer;
        actionMenuPresenter2.MediaBrowserCompat$SearchResultReceiver = true;
        actionMenuPresenter2.ParcelableVolumeInfo = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        ActionMenuPresenter actionMenuPresenter3 = this.IconCompatParcelizer;
        Context context = this.MediaBrowserCompat$ItemReceiver;
        menuItemImpl.f2552x50fd9e4a.add(new WeakReference(actionMenuPresenter3));
        actionMenuPresenter3.IconCompatParcelizer(context, menuItemImpl);
        menuItemImpl.MediaDescriptionCompat = true;
        this.read = (ActionMenuView) this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver((ViewGroup) this);
        SwitchCompat.IconCompatParcelizer((View) this.read, (Drawable) null);
        addView(this.read, layoutParams);
    }

    public final void IconCompatParcelizer() {
        if (this.MediaMetadataCompat == null) {
            removeAllViews();
            this.MediaSessionCompat$Token = null;
            this.read = null;
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        removeAllViews();
        this.MediaSessionCompat$Token = null;
        this.read = null;
    }

    public final boolean write() {
        if (this.IconCompatParcelizer != null) {
            return this.IconCompatParcelizer.MediaBrowserCompat$MediaItem();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used ");
            sb.append("with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            if (this.write > 0) {
                i3 = this.write;
            } else {
                i3 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i3 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, PKIFailureInfo.systemUnavail);
            View view = this.MediaMetadataCompat;
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, PKIFailureInfo.systemUnavail), makeMeasureSpec);
                int max = Math.max(0, paddingLeft - view.getMeasuredWidth());
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.MediaMetadataCompat.getLayoutParams();
                paddingLeft = max - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            if (this.read != null && this.read.getParent() == this) {
                ActionMenuView actionMenuView = this.read;
                actionMenuView.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, PKIFailureInfo.systemUnavail), makeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - actionMenuView.getMeasuredWidth());
            }
            LinearLayout linearLayout = this.f6x50fd9e4a;
            if (linearLayout != null && this.MediaSessionCompat$Token == null) {
                if (this.MediaDescriptionCompat) {
                    this.f6x50fd9e4a.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f6x50fd9e4a.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f6x50fd9e4a.setVisibility(z ? 0 : 8);
                } else {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, PKIFailureInfo.systemUnavail), makeMeasureSpec);
                    paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
                }
            }
            View view2 = this.MediaSessionCompat$Token;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i4 = Integer.MIN_VALUE;
                }
                if (layoutParams.height >= 0) {
                    i5 = Math.min(layoutParams.height, i5);
                }
                this.MediaSessionCompat$Token.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i5, i4));
            }
            if (this.write <= 0) {
                int childCount = getChildCount();
                int i7 = 0;
                for (int i8 = 0; i8 < childCount; i8++) {
                    int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i7) {
                        i7 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i7);
                return;
            }
            setMeasuredDimension(size, i3);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append(" can only be used ");
            sb2.append("with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean MediaBrowserCompat$ItemReceiver = setDefaultActionButtonContentDescription.MediaBrowserCompat$ItemReceiver(this);
        int paddingRight = MediaBrowserCompat$ItemReceiver ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.MediaMetadataCompat;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.MediaMetadataCompat.getLayoutParams();
            int i5 = MediaBrowserCompat$ItemReceiver ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = MediaBrowserCompat$ItemReceiver ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = MediaBrowserCompat$ItemReceiver ? paddingRight - i5 : paddingRight + i5;
            int MediaBrowserCompat$ItemReceiver2 = i7 + MediaBrowserCompat$ItemReceiver(this.MediaMetadataCompat, i7, paddingTop, paddingTop2, MediaBrowserCompat$ItemReceiver);
            paddingRight = MediaBrowserCompat$ItemReceiver ? MediaBrowserCompat$ItemReceiver2 - i6 : MediaBrowserCompat$ItemReceiver2 + i6;
        }
        LinearLayout linearLayout = this.f6x50fd9e4a;
        if (!(linearLayout == null || this.MediaSessionCompat$Token != null || linearLayout.getVisibility() == 8)) {
            paddingRight += MediaBrowserCompat$ItemReceiver(this.f6x50fd9e4a, paddingRight, paddingTop, paddingTop2, MediaBrowserCompat$ItemReceiver);
        }
        View view2 = this.MediaSessionCompat$Token;
        if (view2 != null) {
            MediaBrowserCompat$ItemReceiver(view2, paddingRight, paddingTop, paddingTop2, MediaBrowserCompat$ItemReceiver);
        }
        int paddingLeft = MediaBrowserCompat$ItemReceiver ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.read != null) {
            MediaBrowserCompat$ItemReceiver(this.read, paddingLeft, paddingTop, paddingTop2, !MediaBrowserCompat$ItemReceiver);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.MediaBrowserCompat$SearchResultReceiver);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.MediaDescriptionCompat) {
            requestLayout();
        }
        this.MediaDescriptionCompat = z;
    }
}

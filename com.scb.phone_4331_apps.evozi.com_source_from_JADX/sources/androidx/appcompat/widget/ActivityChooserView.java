package androidx.appcompat.widget;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.gms.common.api.Api;
import p040o.ActionMenuPresenter$OverflowMenuButton;
import p040o.AlertController$RecycleListView;
import p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem;
import p040o.CheckCaptureModule;
import p040o.setMaxWidth;
import p040o.setSubtitle;
import p040o.setTextOn;
import p040o.setUiOptions;

public class ActivityChooserView extends ViewGroup {
    private final int AlertController$RecycleListView;
    final Drawable IconCompatParcelizer;
    private final ViewTreeObserver.OnGlobalLayoutListener Keep;
    final FrameLayout MediaBrowserCompat$CustomActionResultReceiver;
    int MediaBrowserCompat$ItemReceiver;
    final FrameLayout MediaBrowserCompat$MediaItem;
    boolean MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final C5516x31ade9e f3008x50fd9e4a;
    int MediaDescriptionCompat;
    final DataSetObserver MediaMetadataCompat;
    setMaxWidth MediaSessionCompat$QueueItem;
    private final ImageView MediaSessionCompat$ResultReceiverWrapper;
    PopupWindow.OnDismissListener MediaSessionCompat$Token;
    private boolean ParcelableVolumeInfo;
    private setUiOptions PlaybackStateCompat;
    final ImageView RatingCompat;
    final View read;
    final IconCompatParcelizer write;

    public ActivityChooserView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaMetadataCompat = new DataSetObserver() {
            public final void onChanged() {
                super.onChanged();
                ActivityChooserView.this.write.notifyDataSetChanged();
            }

            public final void onInvalidated() {
                super.onInvalidated();
                ActivityChooserView.this.write.notifyDataSetInvalidated();
            }
        };
        this.Keep = new ViewTreeObserver.OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                if (!ActivityChooserView.this.MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$CustomActionResultReceiver()) {
                    return;
                }
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.MediaBrowserCompat$ItemReceiver().IconCompatParcelizer();
                    return;
                }
                ActivityChooserView.this.MediaBrowserCompat$ItemReceiver().MediaDescriptionCompat();
                if (ActivityChooserView.this.MediaSessionCompat$QueueItem != null) {
                    ActivityChooserView.this.MediaSessionCompat$QueueItem.write(true);
                }
            }
        };
        this.MediaDescriptionCompat = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActivityChooserView, i, 0);
        this.MediaDescriptionCompat = obtainStyledAttributes.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(AlertController$RecycleListView.MediaMetadataCompat.abc_activity_chooser_view, this, true);
        this.f3008x50fd9e4a = new C5516x31ade9e(this);
        View findViewById = findViewById(AlertController$RecycleListView.MediaDescriptionCompat.activity_chooser_view_content);
        this.read = findViewById;
        this.IconCompatParcelizer = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(AlertController$RecycleListView.MediaDescriptionCompat.default_activity_button);
        this.MediaBrowserCompat$CustomActionResultReceiver = frameLayout;
        frameLayout.setOnClickListener(this.f3008x50fd9e4a);
        this.MediaBrowserCompat$CustomActionResultReceiver.setOnLongClickListener(this.f3008x50fd9e4a);
        this.RatingCompat = (ImageView) this.MediaBrowserCompat$CustomActionResultReceiver.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.image);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(AlertController$RecycleListView.MediaDescriptionCompat.expand_activities_button);
        frameLayout2.setOnClickListener(this.f3008x50fd9e4a);
        frameLayout2.setAccessibilityDelegate(new View.AccessibilityDelegate() {
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                setTextOn.MediaBrowserCompat$CustomActionResultReceiver(accessibilityNodeInfo).write(true);
            }
        });
        frameLayout2.setOnTouchListener(new ActionMenuPresenter$OverflowMenuButton(frameLayout2) {
            public final CheckCaptureModule.C6375a MediaBrowserCompat$CustomActionResultReceiver() {
                return ActivityChooserView.this.MediaBrowserCompat$ItemReceiver();
            }

            public final boolean read() {
                ActivityChooserView.this.MediaBrowserCompat$CustomActionResultReceiver();
                return true;
            }

            public final boolean write() {
                ActivityChooserView.this.read();
                return true;
            }
        });
        this.MediaBrowserCompat$MediaItem = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.image);
        this.MediaSessionCompat$ResultReceiverWrapper = imageView;
        imageView.setImageDrawable(drawable);
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
        this.write = iconCompatParcelizer;
        iconCompatParcelizer.registerDataSetObserver(new DataSetObserver() {
            public final void onChanged() {
                super.onChanged();
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (activityChooserView.write.getCount() > 0) {
                    activityChooserView.MediaBrowserCompat$MediaItem.setEnabled(true);
                } else {
                    activityChooserView.MediaBrowserCompat$MediaItem.setEnabled(false);
                }
                int MediaBrowserCompat$CustomActionResultReceiver2 = activityChooserView.write.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
                int read = activityChooserView.write.MediaBrowserCompat$ItemReceiver.read();
                if (MediaBrowserCompat$CustomActionResultReceiver2 == 1 || (MediaBrowserCompat$CustomActionResultReceiver2 > 1 && read > 0)) {
                    activityChooserView.MediaBrowserCompat$CustomActionResultReceiver.setVisibility(0);
                    ResolveInfo write = activityChooserView.write.MediaBrowserCompat$ItemReceiver.write();
                    PackageManager packageManager = activityChooserView.getContext().getPackageManager();
                    activityChooserView.RatingCompat.setImageDrawable(write.loadIcon(packageManager));
                    if (activityChooserView.MediaBrowserCompat$ItemReceiver != 0) {
                        CharSequence loadLabel = write.loadLabel(packageManager);
                        activityChooserView.MediaBrowserCompat$CustomActionResultReceiver.setContentDescription(activityChooserView.getContext().getString(activityChooserView.MediaBrowserCompat$ItemReceiver, new Object[]{loadLabel}));
                    }
                } else {
                    activityChooserView.MediaBrowserCompat$CustomActionResultReceiver.setVisibility(8);
                }
                if (activityChooserView.MediaBrowserCompat$CustomActionResultReceiver.getVisibility() == 0) {
                    activityChooserView.read.setBackgroundDrawable(activityChooserView.IconCompatParcelizer);
                } else {
                    activityChooserView.read.setBackgroundDrawable((Drawable) null);
                }
            }
        });
        Resources resources = context.getResources();
        this.AlertController$RecycleListView = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AlertController$RecycleListView.IconCompatParcelizer.abc_config_prefDialogWidth));
    }

    public void setActivityChooserModel(setSubtitle setsubtitle) {
        IconCompatParcelizer iconCompatParcelizer = this.write;
        setSubtitle setsubtitle2 = ActivityChooserView.this.write.MediaBrowserCompat$ItemReceiver;
        if (setsubtitle2 != null && ActivityChooserView.this.isShown()) {
            setsubtitle2.unregisterObserver(ActivityChooserView.this.MediaMetadataCompat);
        }
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = setsubtitle;
        if (setsubtitle != null && ActivityChooserView.this.isShown()) {
            setsubtitle.registerObserver(ActivityChooserView.this.MediaMetadataCompat);
        }
        iconCompatParcelizer.notifyDataSetChanged();
        if (MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$CustomActionResultReceiver()) {
            read();
            MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.MediaSessionCompat$ResultReceiverWrapper.setImageDrawable(drawable);
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.MediaSessionCompat$ResultReceiverWrapper.setContentDescription(getContext().getString(i));
    }

    public void setProvider(setMaxWidth setmaxwidth) {
        this.MediaSessionCompat$QueueItem = setmaxwidth;
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (this.write.MediaBrowserCompat$ItemReceiver != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.Keep);
            boolean z = this.MediaBrowserCompat$CustomActionResultReceiver.getVisibility() == 0;
            int MediaBrowserCompat$CustomActionResultReceiver2 = this.write.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
            if (i == Integer.MAX_VALUE || MediaBrowserCompat$CustomActionResultReceiver2 <= i + (z ? 1 : 0)) {
                IconCompatParcelizer iconCompatParcelizer = this.write;
                if (iconCompatParcelizer.IconCompatParcelizer) {
                    iconCompatParcelizer.IconCompatParcelizer = false;
                    iconCompatParcelizer.notifyDataSetChanged();
                }
                IconCompatParcelizer iconCompatParcelizer2 = this.write;
                if (iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver != i) {
                    iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = i;
                    iconCompatParcelizer2.notifyDataSetChanged();
                }
            } else {
                IconCompatParcelizer iconCompatParcelizer3 = this.write;
                if (!iconCompatParcelizer3.IconCompatParcelizer) {
                    iconCompatParcelizer3.IconCompatParcelizer = true;
                    iconCompatParcelizer3.notifyDataSetChanged();
                }
                IconCompatParcelizer iconCompatParcelizer4 = this.write;
                int i2 = i - 1;
                if (iconCompatParcelizer4.MediaBrowserCompat$CustomActionResultReceiver != i2) {
                    iconCompatParcelizer4.MediaBrowserCompat$CustomActionResultReceiver = i2;
                    iconCompatParcelizer4.notifyDataSetChanged();
                }
            }
            setUiOptions MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
            if (!MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver()) {
                if (this.MediaBrowserCompat$SearchResultReceiver || !z) {
                    IconCompatParcelizer iconCompatParcelizer5 = this.write;
                    if (!(iconCompatParcelizer5.read && iconCompatParcelizer5.write == z)) {
                        iconCompatParcelizer5.read = true;
                        iconCompatParcelizer5.write = z;
                        iconCompatParcelizer5.notifyDataSetChanged();
                    }
                } else {
                    IconCompatParcelizer iconCompatParcelizer6 = this.write;
                    if (iconCompatParcelizer6.read || iconCompatParcelizer6.write) {
                        iconCompatParcelizer6.read = false;
                        iconCompatParcelizer6.write = false;
                        iconCompatParcelizer6.notifyDataSetChanged();
                    }
                }
                MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer(Math.min(this.write.read(), this.AlertController$RecycleListView));
                MediaBrowserCompat$ItemReceiver2.MediaDescriptionCompat();
                setMaxWidth setmaxwidth = this.MediaSessionCompat$QueueItem;
                if (setmaxwidth != null) {
                    setmaxwidth.write(true);
                }
                MediaBrowserCompat$ItemReceiver2.write().setContentDescription(getContext().getString(AlertController$RecycleListView.RatingCompat.abc_activitychooserview_choose_application));
                MediaBrowserCompat$ItemReceiver2.write().setSelector(new ColorDrawable(0));
                return;
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSubtitle setsubtitle = this.write.MediaBrowserCompat$ItemReceiver;
        if (setsubtitle != null) {
            setsubtitle.registerObserver(this.MediaMetadataCompat);
        }
        this.ParcelableVolumeInfo = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setSubtitle setsubtitle = this.write.MediaBrowserCompat$ItemReceiver;
        if (setsubtitle != null) {
            setsubtitle.unregisterObserver(this.MediaMetadataCompat);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.Keep);
        }
        if (MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$CustomActionResultReceiver()) {
            read();
        }
        this.ParcelableVolumeInfo = false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        View view = this.read;
        if (this.MediaBrowserCompat$CustomActionResultReceiver.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.read.layout(0, 0, i3 - i, i4 - i2);
        if (!MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$CustomActionResultReceiver()) {
            read();
        }
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.MediaSessionCompat$Token = onDismissListener;
    }

    public void setInitialActivityCount(int i) {
        this.MediaDescriptionCompat = i;
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    /* access modifiers changed from: package-private */
    public final setUiOptions MediaBrowserCompat$ItemReceiver() {
        if (this.PlaybackStateCompat == null) {
            setUiOptions setuioptions = new setUiOptions(getContext());
            this.PlaybackStateCompat = setuioptions;
            setuioptions.MediaBrowserCompat$CustomActionResultReceiver((ListAdapter) this.write);
            this.PlaybackStateCompat.IconCompatParcelizer((View) this);
            this.PlaybackStateCompat.write(true);
            this.PlaybackStateCompat.IconCompatParcelizer((AdapterView.OnItemClickListener) this.f3008x50fd9e4a);
            this.PlaybackStateCompat.IconCompatParcelizer((PopupWindow.OnDismissListener) this.f3008x50fd9e4a);
        }
        return this.PlaybackStateCompat;
    }

    class IconCompatParcelizer extends BaseAdapter {
        boolean IconCompatParcelizer;
        int MediaBrowserCompat$CustomActionResultReceiver = 4;
        setSubtitle MediaBrowserCompat$ItemReceiver;
        boolean read;
        boolean write;

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getViewTypeCount() {
            return 3;
        }

        IconCompatParcelizer() {
        }

        public final int getItemViewType(int i) {
            return (!this.IconCompatParcelizer || i != getCount() - 1) ? 0 : 1;
        }

        public final int getCount() {
            int MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
            if (!this.read && this.MediaBrowserCompat$ItemReceiver.write() != null) {
                MediaBrowserCompat$CustomActionResultReceiver2--;
            }
            int min = Math.min(MediaBrowserCompat$CustomActionResultReceiver2, this.MediaBrowserCompat$CustomActionResultReceiver);
            return this.IconCompatParcelizer ? min + 1 : min;
        }

        public final Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (!this.read && this.MediaBrowserCompat$ItemReceiver.write() != null) {
                    i++;
                }
                return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(i);
            } else if (itemViewType == 1) {
                return null;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (view == null || view.getId() != AlertController$RecycleListView.MediaDescriptionCompat.list_item) {
                    view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(AlertController$RecycleListView.MediaMetadataCompat.abc_activity_chooser_view_list_item, viewGroup, false);
                }
                PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                ((ImageView) view.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.title)).setText(resolveInfo.loadLabel(packageManager));
                if (!this.read || i != 0 || !this.write) {
                    view.setActivated(false);
                } else {
                    view.setActivated(true);
                }
                return view;
            } else if (itemViewType != 1) {
                throw new IllegalArgumentException();
            } else if (view != null && view.getId() == 1) {
                return view;
            } else {
                View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(AlertController$RecycleListView.MediaMetadataCompat.abc_activity_chooser_view_list_item, viewGroup, false);
                inflate.setId(1);
                ((TextView) inflate.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.title)).setText(ActivityChooserView.this.getContext().getString(AlertController$RecycleListView.RatingCompat.abc_activity_chooser_view_see_all));
                return inflate;
            }
        }

        public final int read() {
            int i = this.MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int i2 = 0;
            View view = null;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, (ViewGroup) null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
            return i2;
        }
    }

    public static class InnerLayout extends LinearLayout {
        private static final int[] IconCompatParcelizer = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            AlertController$RecycleListView.MediaDescriptionCompat mediaDescriptionCompat = new AlertController$RecycleListView.MediaDescriptionCompat(context, context.obtainStyledAttributes(attributeSet, IconCompatParcelizer));
            setBackgroundDrawable(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(0));
            mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.recycle();
        }
    }

    public final boolean read() {
        if (!MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$CustomActionResultReceiver()) {
            return true;
        }
        MediaBrowserCompat$ItemReceiver().IconCompatParcelizer();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.Keep);
        return true;
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        if (MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$CustomActionResultReceiver() || !this.ParcelableVolumeInfo) {
            return false;
        }
        this.MediaBrowserCompat$SearchResultReceiver = false;
        MediaBrowserCompat$CustomActionResultReceiver(this.MediaDescriptionCompat);
        return true;
    }
}

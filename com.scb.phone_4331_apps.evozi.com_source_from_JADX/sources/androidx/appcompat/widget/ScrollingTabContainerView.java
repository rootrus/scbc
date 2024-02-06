package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import p040o.ActivityChooserView;
import p040o.AlertController$RecycleListView;
import p040o.AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver;
import p040o.Keep$MediaBrowserCompat$ItemReceiver;

public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    Runnable IconCompatParcelizer;
    protected final C5517x149ad733 MediaBrowserCompat$CustomActionResultReceiver = new C5517x149ad733(this);
    int MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem;
    private boolean MediaDescriptionCompat;
    private Spinner MediaMetadataCompat;
    private int RatingCompat;
    private read mTabClickListener;
    LinearLayoutCompat read;
    int write;

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    static {
        new DecelerateInterpolator();
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        setHorizontalScrollBarEnabled(false);
        AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver alertController$RecycleListView$MediaBrowserCompat$ItemReceiver = new AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver(context);
        setContentHeight(alertController$RecycleListView$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver());
        this.MediaBrowserCompat$MediaItem = alertController$RecycleListView$MediaBrowserCompat$ItemReceiver.read.getResources().getDimensionPixelSize(AlertController$RecycleListView.IconCompatParcelizer.abc_action_bar_stacked_tab_max_width);
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), (AttributeSet) null, AlertController$RecycleListView.read.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.write(-2, -1));
        this.read = linearLayoutCompat;
        addView(linearLayoutCompat, new ViewGroup.LayoutParams(-2, -1));
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = false;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.read.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.MediaBrowserCompat$ItemReceiver = -1;
        } else {
            if (childCount > 2) {
                this.MediaBrowserCompat$ItemReceiver = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.MediaBrowserCompat$ItemReceiver = View.MeasureSpec.getSize(i) / 2;
            }
            this.MediaBrowserCompat$ItemReceiver = Math.min(this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$MediaItem);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.write, 1073741824);
        if (!z2 && this.MediaDescriptionCompat) {
            this.read.measure(0, makeMeasureSpec);
            if (this.read.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                Spinner spinner = this.MediaMetadataCompat;
                if (spinner != null && spinner.getParent() == this) {
                    z = true;
                }
                if (!z) {
                    if (this.MediaMetadataCompat == null) {
                        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), (AttributeSet) null, AlertController$RecycleListView.read.actionDropDownStyle);
                        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.write(-2, -1));
                        appCompatSpinner.setOnItemSelectedListener(this);
                        this.MediaMetadataCompat = appCompatSpinner;
                    }
                    removeView(this.read);
                    addView(this.MediaMetadataCompat, new ViewGroup.LayoutParams(-2, -1));
                    if (this.MediaMetadataCompat.getAdapter() == null) {
                        this.MediaMetadataCompat.setAdapter(new IconCompatParcelizer());
                    }
                    Runnable runnable = this.IconCompatParcelizer;
                    if (runnable != null) {
                        removeCallbacks(runnable);
                        this.IconCompatParcelizer = null;
                    }
                    this.MediaMetadataCompat.setSelection(this.RatingCompat);
                }
            } else {
                read();
            }
        } else {
            read();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z2 && measuredWidth != measuredWidth2) {
            setTabSelected(this.RatingCompat);
        }
    }

    public void setAllowCollapse(boolean z) {
        this.MediaDescriptionCompat = z;
    }

    public void setTabSelected(int i) {
        this.RatingCompat = i;
        int childCount = this.read.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.read.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                final View childAt2 = this.read.getChildAt(i);
                Runnable runnable = this.IconCompatParcelizer;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                C00264 r4 = new Runnable() {
                    public final void run() {
                        ScrollingTabContainerView.this.smoothScrollTo(childAt2.getLeft() - ((ScrollingTabContainerView.this.getWidth() - childAt2.getWidth()) / 2), 0);
                        ScrollingTabContainerView.this.IconCompatParcelizer = null;
                    }
                };
                this.IconCompatParcelizer = r4;
                post(r4);
            }
            i2++;
        }
        Spinner spinner = this.MediaMetadataCompat;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }

    public void setContentHeight(int i) {
        this.write = i;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver alertController$RecycleListView$MediaBrowserCompat$ItemReceiver = new AlertController$RecycleListView$MediaBrowserCompat$ItemReceiver(getContext());
        setContentHeight(alertController$RecycleListView$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver());
        this.MediaBrowserCompat$MediaItem = alertController$RecycleListView$MediaBrowserCompat$ItemReceiver.read.getResources().getDimensionPixelSize(AlertController$RecycleListView.IconCompatParcelizer.abc_action_bar_stacked_tab_max_width);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.IconCompatParcelizer;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.IconCompatParcelizer;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    class TabView extends LinearLayout {
        Keep$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
        private ImageView MediaBrowserCompat$ItemReceiver;
        private TextView MediaDescriptionCompat;
        private final int[] read;
        private View write;

        public TabView(Context context, Keep$MediaBrowserCompat$ItemReceiver keep$MediaBrowserCompat$ItemReceiver, boolean z) {
            super(context, (AttributeSet) null, AlertController$RecycleListView.read.actionBarTabStyle);
            int[] iArr = {16842964};
            this.read = iArr;
            this.IconCompatParcelizer = keep$MediaBrowserCompat$ItemReceiver;
            AlertController$RecycleListView.MediaDescriptionCompat mediaDescriptionCompat = new AlertController$RecycleListView.MediaDescriptionCompat(context, context.obtainStyledAttributes((AttributeSet) null, iArr, AlertController$RecycleListView.read.actionBarTabStyle, 0));
            if (mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.hasValue(0)) {
                setBackgroundDrawable(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(0));
            }
            mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.recycle();
            setGravity(8388627);
            IconCompatParcelizer();
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(Keep$MediaBrowserCompat$ItemReceiver.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(Keep$MediaBrowserCompat$ItemReceiver.class.getName());
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (ScrollingTabContainerView.this.MediaBrowserCompat$ItemReceiver > 0 && getMeasuredWidth() > ScrollingTabContainerView.this.MediaBrowserCompat$ItemReceiver) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(ScrollingTabContainerView.this.MediaBrowserCompat$ItemReceiver, 1073741824), i2);
            }
        }

        public final void IconCompatParcelizer() {
            Keep$MediaBrowserCompat$ItemReceiver keep$MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer;
            View read2 = keep$MediaBrowserCompat$ItemReceiver.read();
            CharSequence charSequence = null;
            if (read2 != null) {
                ViewParent parent = read2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(read2);
                    }
                    addView(read2);
                }
                this.write = read2;
                TextView textView = this.MediaDescriptionCompat;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.MediaBrowserCompat$ItemReceiver;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.MediaBrowserCompat$ItemReceiver.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.write;
            if (view != null) {
                removeView(view);
                this.write = null;
            }
            Drawable write2 = keep$MediaBrowserCompat$ItemReceiver.write();
            CharSequence IconCompatParcelizer2 = keep$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
            if (write2 != null) {
                if (this.MediaBrowserCompat$ItemReceiver == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.MediaBrowserCompat$ItemReceiver = appCompatImageView;
                }
                this.MediaBrowserCompat$ItemReceiver.setImageDrawable(write2);
                this.MediaBrowserCompat$ItemReceiver.setVisibility(0);
            } else {
                ImageView imageView2 = this.MediaBrowserCompat$ItemReceiver;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.MediaBrowserCompat$ItemReceiver.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(IconCompatParcelizer2);
            if (z) {
                if (this.MediaDescriptionCompat == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null, AlertController$RecycleListView.read.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.MediaDescriptionCompat = appCompatTextView;
                }
                this.MediaDescriptionCompat.setText(IconCompatParcelizer2);
                this.MediaDescriptionCompat.setVisibility(0);
            } else {
                TextView textView2 = this.MediaDescriptionCompat;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.MediaDescriptionCompat.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.MediaBrowserCompat$ItemReceiver;
            if (imageView3 != null) {
                imageView3.setContentDescription(keep$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver());
            }
            if (!z) {
                charSequence = keep$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
            }
            ActivityChooserView.MediaBrowserCompat$ItemReceiver(this, charSequence);
        }
    }

    class IconCompatParcelizer extends BaseAdapter {
        public final long getItemId(int i) {
            return (long) i;
        }

        IconCompatParcelizer() {
        }

        public final int getCount() {
            return ScrollingTabContainerView.this.read.getChildCount();
        }

        public final Object getItem(int i) {
            return ((TabView) ScrollingTabContainerView.this.read.getChildAt(i)).IconCompatParcelizer;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
                TabView tabView = new TabView(scrollingTabContainerView.getContext(), (Keep$MediaBrowserCompat$ItemReceiver) getItem(i), true);
                tabView.setBackgroundDrawable((Drawable) null);
                tabView.setLayoutParams(new AbsListView.LayoutParams(-1, scrollingTabContainerView.write));
                return tabView;
            }
            TabView tabView2 = (TabView) view;
            tabView2.IconCompatParcelizer = (Keep$MediaBrowserCompat$ItemReceiver) getItem(i);
            tabView2.IconCompatParcelizer();
            return view;
        }
    }

    class read implements View.OnClickListener {
        final /* synthetic */ ScrollingTabContainerView IconCompatParcelizer;

        public void onClick(View view) {
            int childCount = this.IconCompatParcelizer.read.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.IconCompatParcelizer.read.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    private boolean read() {
        Spinner spinner = this.MediaMetadataCompat;
        if (!(spinner != null && spinner.getParent() == this)) {
            return false;
        }
        removeView(this.MediaMetadataCompat);
        addView(this.read, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.MediaMetadataCompat.getSelectedItemPosition());
        return false;
    }
}

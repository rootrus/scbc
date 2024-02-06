package p040o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.common.api.Api;
import p040o.AlertController$RecycleListView;
import p040o.SearchView;

/* renamed from: o.setPopupTheme */
class setPopupTheme implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static setPopupTheme IconCompatParcelizer;
    private static setPopupTheme read;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    private boolean MediaBrowserCompat$MediaItem;
    private final int MediaBrowserCompat$SearchResultReceiver;
    private AlertController$RecycleListView.MediaMetadataCompat MediaDescriptionCompat;
    private final Runnable MediaMetadataCompat = new Runnable() {
        public void run() {
            setPopupTheme.this.write();
        }
    };
    private final CharSequence MediaSessionCompat$Token;
    private final Runnable RatingCompat = new Runnable() {
        public void run() {
            setPopupTheme.this.write(false);
        }
    };
    private final View write;

    public void onViewAttachedToWindow(View view) {
    }

    public static void read(View view, CharSequence charSequence) {
        setPopupTheme setpopuptheme = read;
        if (setpopuptheme != null && setpopuptheme.write == view) {
            MediaBrowserCompat$ItemReceiver((setPopupTheme) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPopupTheme setpopuptheme2 = IconCompatParcelizer;
            if (setpopuptheme2 != null && setpopuptheme2.write == view) {
                setpopuptheme2.write();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new setPopupTheme(view, charSequence);
    }

    private setPopupTheme(View view, CharSequence charSequence) {
        this.write = view;
        this.MediaSessionCompat$Token = charSequence;
        this.MediaBrowserCompat$SearchResultReceiver = SearchView.SearchAutoComplete.write(ViewConfiguration.get(view.getContext()));
        MediaBrowserCompat$ItemReceiver();
        this.write.setOnLongClickListener(this);
        this.write.setOnHoverListener(this);
    }

    public boolean onLongClick(View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = view.getWidth() / 2;
        this.MediaBrowserCompat$ItemReceiver = view.getHeight() / 2;
        write(true);
        return true;
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.MediaDescriptionCompat != null && this.MediaBrowserCompat$MediaItem) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.write.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                MediaBrowserCompat$ItemReceiver();
                write();
            }
        } else if (this.write.isEnabled() && this.MediaDescriptionCompat == null && MediaBrowserCompat$CustomActionResultReceiver(motionEvent)) {
            MediaBrowserCompat$ItemReceiver(this);
        }
        return false;
    }

    public void onViewDetachedFromWindow(View view) {
        write();
    }

    /* access modifiers changed from: package-private */
    public void write(boolean z) {
        int i;
        int i2;
        long j;
        int i3;
        long j2;
        if (SwitchCompat.setExpandedFormat(this.write)) {
            MediaBrowserCompat$ItemReceiver((setPopupTheme) null);
            setPopupTheme setpopuptheme = IconCompatParcelizer;
            if (setpopuptheme != null) {
                setpopuptheme.write();
            }
            IconCompatParcelizer = this;
            this.MediaBrowserCompat$MediaItem = z;
            AlertController$RecycleListView.MediaMetadataCompat mediaMetadataCompat = new AlertController$RecycleListView.MediaMetadataCompat(this.write.getContext());
            this.MediaDescriptionCompat = mediaMetadataCompat;
            View view = this.write;
            int i4 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i5 = this.MediaBrowserCompat$ItemReceiver;
            boolean z2 = this.MediaBrowserCompat$MediaItem;
            CharSequence charSequence = this.MediaSessionCompat$Token;
            if (mediaMetadataCompat.MediaBrowserCompat$ItemReceiver.getParent() != null) {
                mediaMetadataCompat.MediaBrowserCompat$ItemReceiver();
            }
            mediaMetadataCompat.read.setText(charSequence);
            WindowManager.LayoutParams layoutParams = mediaMetadataCompat.write;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = mediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.getResources().getDimensionPixelOffset(AlertController$RecycleListView.IconCompatParcelizer.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i4 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = mediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.getResources().getDimensionPixelOffset(AlertController$RecycleListView.IconCompatParcelizer.tooltip_precise_anchor_extra_offset);
                i = i5 + dimensionPixelOffset2;
                i2 = i5 - dimensionPixelOffset2;
            } else {
                i = view.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = mediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.getResources().getDimensionPixelOffset(z2 ? AlertController$RecycleListView.IconCompatParcelizer.tooltip_y_offset_touch : AlertController$RecycleListView.IconCompatParcelizer.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(mediaMetadataCompat.MediaBrowserCompat$MediaItem);
                if (mediaMetadataCompat.MediaBrowserCompat$MediaItem.left < 0 && mediaMetadataCompat.MediaBrowserCompat$MediaItem.top < 0) {
                    Resources resources = mediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    mediaMetadataCompat.MediaBrowserCompat$MediaItem.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(mediaMetadataCompat.MediaDescriptionCompat);
                view.getLocationOnScreen(mediaMetadataCompat.IconCompatParcelizer);
                int[] iArr = mediaMetadataCompat.IconCompatParcelizer;
                int i6 = iArr[0];
                int[] iArr2 = mediaMetadataCompat.MediaDescriptionCompat;
                iArr[0] = i6 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i4) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                mediaMetadataCompat.MediaBrowserCompat$ItemReceiver.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = mediaMetadataCompat.MediaBrowserCompat$ItemReceiver.getMeasuredHeight();
                int[] iArr3 = mediaMetadataCompat.IconCompatParcelizer;
                int i7 = ((iArr3[1] + i2) - dimensionPixelOffset3) - measuredHeight;
                int i8 = iArr3[1] + i + dimensionPixelOffset3;
                if (z2) {
                    if (i7 < 0) {
                        layoutParams.y = i8;
                    }
                } else if (measuredHeight + i8 <= mediaMetadataCompat.MediaBrowserCompat$MediaItem.height()) {
                    layoutParams.y = i8;
                }
                layoutParams.y = i7;
            }
            ((WindowManager) mediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.getSystemService("window")).addView(mediaMetadataCompat.MediaBrowserCompat$ItemReceiver, mediaMetadataCompat.write);
            this.write.addOnAttachStateChangeListener(this);
            if (this.MediaBrowserCompat$MediaItem) {
                j = 2500;
            } else {
                if ((SwitchCompat.PlaybackStateCompat(this.write) & 1) == 1) {
                    j2 = 3000;
                    i3 = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = 15000;
                    i3 = ViewConfiguration.getLongPressTimeout();
                }
                j = j2 - ((long) i3);
            }
            this.write.removeCallbacks(this.MediaMetadataCompat);
            this.write.postDelayed(this.MediaMetadataCompat, j);
        }
    }

    /* access modifiers changed from: package-private */
    public void write() {
        if (IconCompatParcelizer == this) {
            IconCompatParcelizer = null;
            AlertController$RecycleListView.MediaMetadataCompat mediaMetadataCompat = this.MediaDescriptionCompat;
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat.MediaBrowserCompat$ItemReceiver();
                this.MediaDescriptionCompat = null;
                MediaBrowserCompat$ItemReceiver();
                this.write.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (read == this) {
            MediaBrowserCompat$ItemReceiver((setPopupTheme) null);
        }
        this.write.removeCallbacks(this.MediaMetadataCompat);
    }

    private static void MediaBrowserCompat$ItemReceiver(setPopupTheme setpopuptheme) {
        setPopupTheme setpopuptheme2 = read;
        if (setpopuptheme2 != null) {
            setpopuptheme2.IconCompatParcelizer();
        }
        read = setpopuptheme;
        if (setpopuptheme != null) {
            setpopuptheme.read();
        }
    }

    private void read() {
        this.write.postDelayed(this.RatingCompat, (long) ViewConfiguration.getLongPressTimeout());
    }

    private void IconCompatParcelizer() {
        this.write.removeCallbacks(this.RatingCompat);
    }

    private boolean MediaBrowserCompat$CustomActionResultReceiver(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.MediaBrowserCompat$CustomActionResultReceiver) <= this.MediaBrowserCompat$SearchResultReceiver && Math.abs(y - this.MediaBrowserCompat$ItemReceiver) <= this.MediaBrowserCompat$SearchResultReceiver) {
            return false;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = x;
        this.MediaBrowserCompat$ItemReceiver = y;
        return true;
    }

    private void MediaBrowserCompat$ItemReceiver() {
        this.MediaBrowserCompat$CustomActionResultReceiver = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.MediaBrowserCompat$ItemReceiver = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }
}

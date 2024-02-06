package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import p040o.AlertController$RecycleListView;
import p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem;
import p040o.setBackgroundResource;

public final class AlertController implements View.OnClickListener {
    public final Window ActionMenuItemView;
    public TextView AlertController$RecycleListView;
    public TextView AppCompatActivity;
    public int AppCompatDelegateImpl$ListMenuDecorView;
    public View AppCompatDialogFragment;
    public final View.OnClickListener IconCompatParcelizer = this;
    public int Keep;
    public int MediaBrowserCompat$CustomActionResultReceiver;
    public ListAdapter MediaBrowserCompat$ItemReceiver;
    public Button MediaBrowserCompat$MediaItem;
    public int MediaBrowserCompat$SearchResultReceiver = -1;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final setBackgroundResource f0x50fd9e4a;
    int MediaDescriptionCompat;
    public Button MediaMetadataCompat;
    public View MediaSessionCompat$QueueItem;
    public ImageView MediaSessionCompat$ResultReceiverWrapper;
    public int MediaSessionCompat$Token = 0;
    public Drawable ParcelableVolumeInfo;
    public NestedScrollView PlaybackStateCompat;
    public int PlaybackStateCompat$CustomAction;
    public final Context RatingCompat;
    public Button read;
    public CharSequence setBackgroundResource;
    private Handler setCheckable;
    public boolean setChecked = false;
    public boolean setContentView;
    public ListView setHasDecor;
    final int write;

    public AlertController(Context context, setBackgroundResource setbackgroundresource, Window window) {
        this.RatingCompat = context;
        this.f0x50fd9e4a = setbackgroundresource;
        this.ActionMenuItemView = window;
        this.setCheckable = new AlertController$MediaBrowserCompat$CustomActionResultReceiver(setbackgroundresource);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AlertDialog, AlertController$RecycleListView.read.alertDialogStyle, 0);
        this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AlertDialog_android_layout, 0);
        this.MediaDescriptionCompat = obtainStyledAttributes.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AlertDialog_buttonPanelSideLayout, 0);
        this.Keep = obtainStyledAttributes.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AlertDialog_listLayout, 0);
        obtainStyledAttributes.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AlertDialog_multiChoiceItemLayout, 0);
        obtainStyledAttributes.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AlertDialog_singleChoiceItemLayout, 0);
        this.PlaybackStateCompat$CustomAction = obtainStyledAttributes.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AlertDialog_listItemLayout, 0);
        this.setContentView = obtainStyledAttributes.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AlertDialog_showTitle, true);
        this.write = obtainStyledAttributes.getDimensionPixelSize(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        setbackgroundresource.write(1);
    }

    public static boolean MediaBrowserCompat$CustomActionResultReceiver(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (MediaBrowserCompat$CustomActionResultReceiver(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup IconCompatParcelizer(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    static void MediaBrowserCompat$ItemReceiver(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    public static class RecycleListView extends ListView {
        private final int MediaBrowserCompat$CustomActionResultReceiver;
        private final int MediaBrowserCompat$ItemReceiver;

        public RecycleListView(Context context) {
            this(context, (AttributeSet) null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.RecycleListView);
            this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getDimensionPixelOffset(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.RecycleListView_paddingBottomNoButtons, -1);
            this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getDimensionPixelOffset(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.RecycleListView_paddingTopNoTitle, -1);
        }

        public void setHasDecor(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.MediaBrowserCompat$CustomActionResultReceiver, getPaddingRight(), z2 ? getPaddingBottom() : this.MediaBrowserCompat$ItemReceiver);
            }
        }
    }

    public static class read {
        public final Context IconCompatParcelizer;
        public ListAdapter MediaBrowserCompat$CustomActionResultReceiver;
        public int MediaBrowserCompat$ItemReceiver = -1;
        public final LayoutInflater MediaBrowserCompat$MediaItem;
        public Drawable MediaBrowserCompat$SearchResultReceiver;
        public DialogInterface.OnKeyListener MediaDescriptionCompat;
        public DialogInterface.OnClickListener MediaMetadataCompat;
        public View MediaSessionCompat$QueueItem;
        public CharSequence RatingCompat;
        public View read;
        public boolean write;

        public read(Context context) {
            this.IconCompatParcelizer = context;
            this.write = true;
            this.MediaBrowserCompat$MediaItem = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    public final void onClick(View view) {
        this.setCheckable.obtainMessage(1, this.f0x50fd9e4a).sendToTarget();
    }
}

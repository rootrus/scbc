package p040o;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.C0065xe743b54a;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import org.bouncycastle.asn1.x509.DisplayText;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.ScriptGroup;
import p040o.zzgk;

/* renamed from: o.ScriptIntrinsic3DLUT */
public final class ScriptIntrinsic3DLUT {
    private static Interpolator ListMenuItemView = new DecelerateInterpolator();
    private static Interpolator setTitle = new C6553x91db41c((byte) 0);
    private int AbsActionBarView;
    private int ActionBarContainer;
    private int ActionBarContextView = DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE;
    int ActionMenuItemView;
    public boolean AlertController$RecycleListView = true;
    public RecyclerView.ParcelableVolumeInfo AppCompatActivity = new RecyclerView.ParcelableVolumeInfo() {
        public final void MediaBrowserCompat$ItemReceiver(RecyclerView recyclerView, int i) {
            ScriptIntrinsic3DLUT scriptIntrinsic3DLUT = ScriptIntrinsic3DLUT.this;
            if (i == 1) {
                scriptIntrinsic3DLUT.write(true);
            }
        }

        public final void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
            ScriptIntrinsic3DLUT scriptIntrinsic3DLUT = ScriptIntrinsic3DLUT.this;
            if (scriptIntrinsic3DLUT.f2556x50fd9e4a) {
                scriptIntrinsic3DLUT.write = i;
                scriptIntrinsic3DLUT.read = i2;
                return;
            }
            if (scriptIntrinsic3DLUT.MediaSessionCompat$QueueItem != null && !scriptIntrinsic3DLUT.ParcelableVolumeInfo.hasMessages(2)) {
                SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver((View) scriptIntrinsic3DLUT.setShortcut, scriptIntrinsic3DLUT.RatingCompat, 500);
            }
        }
    };
    public int AppCompatDelegateImpl$ListMenuDecorView = 0;
    int AppCompatDialogFragment;
    int AppCompatViewInflater;
    public addReference ExpandedMenuView;
    public boolean IconCompatParcelizer;
    int Keep;
    boolean MediaBrowserCompat$CustomActionResultReceiver;
    boolean MediaBrowserCompat$ItemReceiver;
    public FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.write MediaBrowserCompat$MediaItem = new FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.write();
    getKernelID MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    boolean f2556x50fd9e4a;
    float MediaDescriptionCompat = 1.0f;
    public float MediaMetadataCompat;
    zzgk.IconCompatParcelizer MediaSessionCompat$QueueItem;
    RecyclerView.setContentView MediaSessionCompat$ResultReceiverWrapper;
    public getFieldID MediaSessionCompat$Token;
    private int MenuItemImpl = 0;
    private int MenuItemWrapperICS$CollapsibleActionViewWrapper;
    public C1277x72464c4d ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    int PlaybackStateCompat$CustomAction;
    final Runnable RatingCompat = new Runnable() {
        public final void run() {
            if (ScriptIntrinsic3DLUT.this.MediaSessionCompat$ResultReceiverWrapper != null) {
                ScriptIntrinsic3DLUT scriptIntrinsic3DLUT = ScriptIntrinsic3DLUT.this;
                scriptIntrinsic3DLUT.MediaBrowserCompat$ItemReceiver(scriptIntrinsic3DLUT.setShortcut);
            }
        }
    };
    int read;
    private final Rect setActionBarHideOffset = new Rect();
    public C0065xe743b54a setBackgroundResource = new C0065xe743b54a() {
        /* JADX WARNING: Removed duplicated region for block: B:41:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean IconCompatParcelizer(androidx.recyclerview.widget.RecyclerView r11, android.view.MotionEvent r12) {
            /*
                r10 = this;
                o.ScriptIntrinsic3DLUT r0 = p040o.ScriptIntrinsic3DLUT.this
                int r1 = r12.getActionMasked()
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L_0x003e
                if (r1 == r4) goto L_0x0038
                if (r1 == r2) goto L_0x0014
                r11 = 3
                if (r1 == r11) goto L_0x0038
                goto L_0x00e3
            L_0x0014:
                o.zzgk$IconCompatParcelizer r1 = r0.MediaSessionCompat$QueueItem
                if (r1 == 0) goto L_0x0022
                o.ScriptIntrinsic3DLUT$MediaBrowserCompat$CustomActionResultReceiver r1 = r0.ParcelableVolumeInfo
                boolean r1 = r1.hasMessages(r2)
                if (r1 != 0) goto L_0x0022
                r1 = r4
                goto L_0x0023
            L_0x0022:
                r1 = r3
            L_0x0023:
                if (r1 == 0) goto L_0x0029
                r0.MediaBrowserCompat$ItemReceiver((androidx.recyclerview.widget.RecyclerView) r11, (android.view.MotionEvent) r12)
                goto L_0x0035
            L_0x0029:
                boolean r1 = r0.AlertController$RecycleListView
                if (r1 == 0) goto L_0x0032
                boolean r11 = r0.MediaBrowserCompat$ItemReceiver(r11, r12, r4)
                goto L_0x0033
            L_0x0032:
                r11 = r3
            L_0x0033:
                if (r11 == 0) goto L_0x00e3
            L_0x0035:
                r3 = r4
                goto L_0x00e3
            L_0x0038:
                boolean r3 = r0.MediaBrowserCompat$ItemReceiver((int) r1, (boolean) r4)
                goto L_0x00e3
            L_0x003e:
                o.zzgk$IconCompatParcelizer r1 = r0.MediaSessionCompat$QueueItem
                if (r1 == 0) goto L_0x004c
                o.ScriptIntrinsic3DLUT$MediaBrowserCompat$CustomActionResultReceiver r1 = r0.ParcelableVolumeInfo
                boolean r1 = r1.hasMessages(r2)
                if (r1 != 0) goto L_0x004c
                r1 = r4
                goto L_0x004d
            L_0x004c:
                r1 = r3
            L_0x004d:
                if (r1 != 0) goto L_0x00e3
                float r1 = r12.getX()
                float r2 = r12.getY()
                android.view.View r1 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.write((android.view.ViewGroup) r11, (float) r1, (float) r2)
                r2 = 0
                if (r1 == 0) goto L_0x0063
                androidx.recyclerview.widget.RecyclerView$setContentView r11 = r11.MediaBrowserCompat$MediaItem((android.view.View) r1)
                goto L_0x0064
            L_0x0063:
                r11 = r2
            L_0x0064:
                boolean r1 = r11 instanceof p040o.ScriptGroup.Input
                if (r1 == 0) goto L_0x0078
                int r1 = r0.MediaBrowserCompat$CustomActionResultReceiver((androidx.recyclerview.widget.RecyclerView.setContentView) r11)
                o.addReference r5 = r0.ExpandedMenuView
                if (r1 < 0) goto L_0x0078
                int r5 = r5.IconCompatParcelizer()
                if (r1 >= r5) goto L_0x0078
                r1 = r4
                goto L_0x0079
            L_0x0078:
                r1 = r3
            L_0x0079:
                if (r1 == 0) goto L_0x00e3
                float r1 = r12.getX()
                r5 = 1056964608(0x3f000000, float:0.5)
                float r1 = r1 + r5
                int r1 = (int) r1
                float r6 = r12.getY()
                float r6 = r6 + r5
                int r5 = (int) r6
                boolean r6 = r0.MediaBrowserCompat$CustomActionResultReceiver((androidx.recyclerview.widget.RecyclerView.setContentView) r11, (int) r1, (int) r5)
                if (r6 == 0) goto L_0x00e3
                androidx.recyclerview.widget.RecyclerView r6 = r0.setShortcut
                androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r6 = r6.AppCompatActivity
                int r6 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.write(r6)
                androidx.recyclerview.widget.RecyclerView r7 = r0.setShortcut
                int r7 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(r7)
                r0.AppCompatDialogFragment = r1
                r0.PlaybackStateCompat$CustomAction = r1
                r0.setExpandedFormat = r5
                r0.Keep = r5
                long r8 = r11.MediaBrowserCompat$ItemReceiver
                r0.setHasDecor = r8
                if (r6 == 0) goto L_0x00b1
                if (r6 != r4) goto L_0x00af
                if (r7 > r4) goto L_0x00b1
            L_0x00af:
                r11 = r3
                goto L_0x00b2
            L_0x00b1:
                r11 = r4
            L_0x00b2:
                r0.MediaBrowserCompat$ItemReceiver = r11
                if (r6 == r4) goto L_0x00bd
                if (r6 != 0) goto L_0x00bb
                if (r7 <= r4) goto L_0x00bb
                goto L_0x00bd
            L_0x00bb:
                r11 = r3
                goto L_0x00be
            L_0x00bd:
                r11 = r4
            L_0x00be:
                r0.MediaBrowserCompat$CustomActionResultReceiver = r11
                boolean r11 = r0.PlaybackStateCompat
                if (r11 == 0) goto L_0x00e3
                o.ScriptIntrinsic3DLUT$MediaBrowserCompat$CustomActionResultReceiver r11 = r0.ParcelableVolumeInfo
                int r0 = r0.setCheckable
                r11.removeMessages(r4)
                android.view.MotionEvent r1 = r11.MediaBrowserCompat$CustomActionResultReceiver
                if (r1 == 0) goto L_0x00d4
                r1.recycle()
                r11.MediaBrowserCompat$CustomActionResultReceiver = r2
            L_0x00d4:
                android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r12)
                r11.MediaBrowserCompat$CustomActionResultReceiver = r1
                long r1 = r12.getDownTime()
                long r5 = (long) r0
                long r1 = r1 + r5
                r11.sendEmptyMessageAtTime(r4, r1)
            L_0x00e3:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.ScriptIntrinsic3DLUT.C12753.IconCompatParcelizer(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView recyclerView, MotionEvent motionEvent) {
            ScriptIntrinsic3DLUT scriptIntrinsic3DLUT = ScriptIntrinsic3DLUT.this;
            int actionMasked = motionEvent.getActionMasked();
            if (scriptIntrinsic3DLUT.MediaSessionCompat$QueueItem != null && !scriptIntrinsic3DLUT.ParcelableVolumeInfo.hasMessages(2)) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        scriptIntrinsic3DLUT.MediaBrowserCompat$ItemReceiver(recyclerView, motionEvent);
                        return;
                    } else if (actionMasked != 3) {
                        return;
                    }
                }
                scriptIntrinsic3DLUT.MediaBrowserCompat$ItemReceiver(actionMasked, true);
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
            ScriptIntrinsic3DLUT scriptIntrinsic3DLUT = ScriptIntrinsic3DLUT.this;
            if (z) {
                scriptIntrinsic3DLUT.write(true);
            }
        }
    };
    public int setCheckable = ViewConfiguration.getLongPressTimeout();
    NestedScrollView setChecked;
    private Object setContentHeight;
    public IconCompatParcelizer setContentView;
    private int setCustomView;
    int setExpandedFormat;
    public int setForceShowIcon;
    public Interpolator setGroupDividerEnabled = setTitle;
    long setHasDecor = -1;
    private ScriptIntrinsic setHasNonEmbeddedTabs;
    private read setHideOnContentScrollEnabled = new read();
    validateGEMV setIcon;
    int setItemInvoker = 0;
    public int setPadding;
    public ScriptIntrinsic3DLUT$MediaBrowserCompat$ItemReceiver setPopupCallback = new ScriptIntrinsic3DLUT$MediaBrowserCompat$ItemReceiver(this);
    private int setPrimaryBackground;
    public RecyclerView setShortcut;
    private int setSplitBackground;
    private int setStackedBackground;
    private ScriptIntrinsic setSubtitle;
    private int setTabContainer;
    private write setTitleOptional = new write();
    private Interpolator setTransitioning = ListMenuItemView;
    private int setVisibility;
    int write;

    /* renamed from: o.ScriptIntrinsic3DLUT$IconCompatParcelizer */
    public interface IconCompatParcelizer {
    }

    /* renamed from: o.ScriptIntrinsic3DLUT$read */
    static class read {
        public int MediaBrowserCompat$ItemReceiver;
        public RecyclerView.setContentView write;

        read() {
        }
    }

    /* renamed from: o.ScriptIntrinsic3DLUT$write */
    static class write {
        public int IconCompatParcelizer;
        public int MediaBrowserCompat$CustomActionResultReceiver;
        public boolean MediaBrowserCompat$ItemReceiver;
        public int MediaBrowserCompat$MediaItem;
        public RecyclerView MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public ScriptIntrinsic f2557x50fd9e4a;
        public int MediaDescriptionCompat;
        public ScriptIntrinsic MediaMetadataCompat;
        public boolean MediaSessionCompat$Token;
        public int RatingCompat;
        public RecyclerView.setContentView read;
        public zzgk.IconCompatParcelizer write;

        write() {
        }

        public final void write(RecyclerView recyclerView, RecyclerView.setContentView setcontentview, zzgk.IconCompatParcelizer iconCompatParcelizer, int i, int i2, ScriptIntrinsic scriptIntrinsic, ScriptIntrinsic scriptIntrinsic2, boolean z) {
            this.MediaBrowserCompat$SearchResultReceiver = recyclerView;
            this.write = iconCompatParcelizer;
            this.read = setcontentview;
            this.IconCompatParcelizer = i;
            this.MediaBrowserCompat$CustomActionResultReceiver = i2;
            this.f2557x50fd9e4a = scriptIntrinsic;
            this.MediaMetadataCompat = scriptIntrinsic2;
            this.MediaBrowserCompat$ItemReceiver = z;
            int IconCompatParcelizer2 = FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.IconCompatParcelizer(recyclerView.AppCompatActivity);
            this.RatingCompat = IconCompatParcelizer2;
            boolean z2 = true;
            if (FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.IconCompatParcelizer(IconCompatParcelizer2) != 1) {
                z2 = false;
            }
            this.MediaSessionCompat$Token = z2;
            this.MediaDescriptionCompat = i - iconCompatParcelizer.write;
            int i3 = i2 - iconCompatParcelizer.IconCompatParcelizer;
            this.MediaBrowserCompat$MediaItem = i3;
            if (this.MediaSessionCompat$Token) {
                int max = Math.max(this.MediaDescriptionCompat, recyclerView.getPaddingLeft());
                this.MediaDescriptionCompat = max;
                this.MediaDescriptionCompat = Math.min(max, Math.max(0, (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.write.MediaBrowserCompat$MediaItem));
                return;
            }
            int max2 = Math.max(i3, recyclerView.getPaddingTop());
            this.MediaBrowserCompat$MediaItem = max2;
            this.MediaBrowserCompat$MediaItem = Math.min(max2, Math.max(0, (recyclerView.getHeight() - recyclerView.getPaddingBottom()) - this.write.MediaBrowserCompat$ItemReceiver));
        }
    }

    public final void write(boolean z) {
        boolean z2 = false;
        MediaBrowserCompat$ItemReceiver(3, false);
        if (z) {
            read(false);
            return;
        }
        if (this.MediaSessionCompat$QueueItem != null && !this.ParcelableVolumeInfo.hasMessages(2)) {
            z2 = true;
        }
        if (z2) {
            C1277x72464c4d scriptIntrinsic3DLUT$MediaBrowserCompat$CustomActionResultReceiver = this.ParcelableVolumeInfo;
            if (!scriptIntrinsic3DLUT$MediaBrowserCompat$CustomActionResultReceiver.hasMessages(2)) {
                scriptIntrinsic3DLUT$MediaBrowserCompat$CustomActionResultReceiver.sendEmptyMessage(2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean MediaBrowserCompat$ItemReceiver(RecyclerView recyclerView, MotionEvent motionEvent, boolean z) {
        RecyclerView.setContentView setcontentview;
        int i;
        ScriptIntrinsic scriptIntrinsic;
        zzge$zzh$zza$MediaBrowserCompat$ItemReceiver zzge_zzh_zza_mediabrowsercompat_itemreceiver;
        RecyclerView.MediaMetadataCompat mediaMetadataCompat;
        ScriptIntrinsic3DLUT scriptIntrinsic3DLUT;
        RecyclerView recyclerView2;
        if (this.MediaSessionCompat$QueueItem != null) {
            return false;
        }
        int x = (int) (motionEvent.getX() + 0.5f);
        int y = (int) (motionEvent.getY() + 0.5f);
        this.AppCompatDialogFragment = x;
        this.setExpandedFormat = y;
        if (this.setHasDecor == -1) {
            return false;
        }
        if (z && ((!this.MediaBrowserCompat$ItemReceiver || Math.abs(x - this.PlaybackStateCompat$CustomAction) <= this.setForceShowIcon) && (!this.MediaBrowserCompat$CustomActionResultReceiver || Math.abs(y - this.Keep) <= this.setForceShowIcon))) {
            return false;
        }
        View write2 = FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.write((ViewGroup) recyclerView, (float) this.PlaybackStateCompat$CustomAction, (float) this.Keep);
        if (write2 != null) {
            setcontentview = recyclerView.MediaBrowserCompat$MediaItem(write2);
        } else {
            setcontentview = null;
        }
        if (setcontentview == null || !MediaBrowserCompat$CustomActionResultReceiver(setcontentview, x, y)) {
            return false;
        }
        RecyclerView.IconCompatParcelizer iconCompatParcelizer = this.setShortcut.MediaDescriptionCompat;
        FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment = new FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment();
        addReference addreference = this.ExpandedMenuView;
        RecyclerView recyclerView3 = setcontentview.MediaMetadataCompat;
        if (recyclerView3 == null) {
            i = -1;
        } else {
            i = recyclerView3.MediaBrowserCompat$CustomActionResultReceiver(setcontentview);
        }
        int MediaBrowserCompat$ItemReceiver2 = AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer, (RecyclerView.IconCompatParcelizer) addreference, (Object) null, i, fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment);
        ScriptGroup.C1272IO io = (ScriptGroup.C1272IO) AlertController$RecycleListView.read((RecyclerView.IconCompatParcelizer) this.ExpandedMenuView, ScriptGroup.C1272IO.class, MediaBrowserCompat$ItemReceiver2);
        if (io == null) {
            scriptIntrinsic = null;
        } else {
            scriptIntrinsic = io.write(MediaBrowserCompat$ItemReceiver2);
        }
        if (scriptIntrinsic == null) {
            scriptIntrinsic = new ScriptIntrinsic(0, Math.max(0, this.ExpandedMenuView.IconCompatParcelizer() - 1));
        }
        int max = Math.max(0, this.ExpandedMenuView.IconCompatParcelizer() - 1);
        if (scriptIntrinsic.MediaBrowserCompat$ItemReceiver > scriptIntrinsic.MediaBrowserCompat$CustomActionResultReceiver) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid wrappedAdapterRange specified --- start > wrappedAdapterRange (wrappedAdapterRange = ");
            sb.append(scriptIntrinsic);
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        } else if (scriptIntrinsic.MediaBrowserCompat$ItemReceiver < 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid wrappedAdapterRange specified --- start < 0 (wrappedAdapterRange = ");
            sb2.append(scriptIntrinsic);
            sb2.append(")");
            throw new IllegalStateException(sb2.toString());
        } else if (scriptIntrinsic.MediaBrowserCompat$CustomActionResultReceiver <= max) {
            if (MediaBrowserCompat$ItemReceiver2 >= scriptIntrinsic.MediaBrowserCompat$ItemReceiver && MediaBrowserCompat$ItemReceiver2 <= scriptIntrinsic.MediaBrowserCompat$CustomActionResultReceiver) {
                if (!fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.isEmpty()) {
                    List<zzge$zzh$zza$MediaBrowserCompat$ItemReceiver> list = fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer;
                    zzge_zzh_zza_mediabrowsercompat_itemreceiver = list.get(list.size() - 1);
                } else {
                    zzge_zzh_zza_mediabrowsercompat_itemreceiver = null;
                }
                Object obj = zzge_zzh_zza_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
                if (recyclerView != null) {
                    mediaMetadataCompat = recyclerView.AlertController$RecycleListView;
                } else {
                    mediaMetadataCompat = null;
                }
                if (mediaMetadataCompat != null) {
                    mediaMetadataCompat.read(setcontentview);
                }
                C1277x72464c4d scriptIntrinsic3DLUT$MediaBrowserCompat$CustomActionResultReceiver = this.ParcelableVolumeInfo;
                scriptIntrinsic3DLUT$MediaBrowserCompat$CustomActionResultReceiver.removeMessages(1);
                MotionEvent motionEvent2 = scriptIntrinsic3DLUT$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                    scriptIntrinsic3DLUT$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = null;
                }
                this.MediaSessionCompat$QueueItem = new zzgk.IconCompatParcelizer(setcontentview, this.AppCompatDialogFragment, this.setExpandedFormat);
                this.MediaSessionCompat$ResultReceiverWrapper = setcontentview;
                this.setSubtitle = scriptIntrinsic;
                RecyclerView.IconCompatParcelizer iconCompatParcelizer2 = this.setShortcut.MediaDescriptionCompat;
                this.setHasNonEmbeddedTabs = new ScriptIntrinsic(AlertController$RecycleListView.write(fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment, (RecyclerView.IconCompatParcelizer) this.ExpandedMenuView, iconCompatParcelizer2, scriptIntrinsic.MediaBrowserCompat$ItemReceiver), AlertController$RecycleListView.write(fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment, (RecyclerView.IconCompatParcelizer) this.ExpandedMenuView, iconCompatParcelizer2, scriptIntrinsic.MediaBrowserCompat$CustomActionResultReceiver));
                NestedScrollView MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver((View) this.setShortcut);
                if (MediaBrowserCompat$CustomActionResultReceiver2 == null || this.setShortcut.isNestedScrollingEnabled()) {
                    this.setChecked = null;
                } else {
                    this.setChecked = MediaBrowserCompat$CustomActionResultReceiver2;
                }
                this.setCustomView = recyclerView.getOverScrollMode();
                recyclerView.setOverScrollMode(2);
                this.AppCompatDialogFragment = (int) (motionEvent.getX() + 0.5f);
                this.setExpandedFormat = (int) (motionEvent.getY() + 0.5f);
                NestedScrollView nestedScrollView = this.setChecked;
                this.ActionMenuItemView = nestedScrollView != null ? nestedScrollView.getScrollX() : 0;
                NestedScrollView nestedScrollView2 = this.setChecked;
                this.AppCompatViewInflater = nestedScrollView2 != null ? nestedScrollView2.getScrollY() : 0;
                int i2 = this.setExpandedFormat;
                this.setVisibility = i2;
                this.setTabContainer = i2;
                this.setStackedBackground = i2;
                int i3 = this.AppCompatDialogFragment;
                this.AbsActionBarView = i3;
                this.MenuItemWrapperICS$CollapsibleActionViewWrapper = i3;
                this.setPrimaryBackground = i3;
                this.setItemInvoker = 0;
                this.MenuItemImpl = this.AppCompatDelegateImpl$ListMenuDecorView;
                this.setContentHeight = obj;
                this.setShortcut.getParent().requestDisallowInterceptTouchEvent(true);
                ScriptIntrinsic3DLUT$MediaBrowserCompat$ItemReceiver scriptIntrinsic3DLUT$MediaBrowserCompat$ItemReceiver = this.setPopupCallback;
                if (!(scriptIntrinsic3DLUT$MediaBrowserCompat$ItemReceiver.write || (scriptIntrinsic3DLUT = scriptIntrinsic3DLUT$MediaBrowserCompat$ItemReceiver.read.get()) == null || (recyclerView2 = scriptIntrinsic3DLUT.setShortcut) == null)) {
                    SwitchCompat.MediaBrowserCompat$ItemReceiver((View) recyclerView2, (Runnable) scriptIntrinsic3DLUT$MediaBrowserCompat$ItemReceiver);
                    scriptIntrinsic3DLUT$MediaBrowserCompat$ItemReceiver.write = true;
                }
                this.ExpandedMenuView.MediaBrowserCompat$CustomActionResultReceiver(this.MediaSessionCompat$QueueItem, setcontentview, this.setSubtitle, MediaBrowserCompat$ItemReceiver2, this.MenuItemImpl);
                this.ExpandedMenuView.MediaBrowserCompat$CustomActionResultReceiver(setcontentview, MediaBrowserCompat$ItemReceiver2);
                getKernelID getkernelid = new getKernelID(this.setShortcut, setcontentview, this.setHasNonEmbeddedTabs);
                this.MediaBrowserCompat$SearchResultReceiver = getkernelid;
                getkernelid.MediaMetadataCompat = null;
                getKernelID getkernelid2 = this.MediaBrowserCompat$SearchResultReceiver;
                FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.write write3 = this.MediaBrowserCompat$MediaItem;
                getkernelid2.f2589x50fd9e4a = (long) write3.MediaBrowserCompat$ItemReceiver;
                getkernelid2.ParcelableVolumeInfo = write3.MediaBrowserCompat$CustomActionResultReceiver;
                getkernelid2.MediaBrowserCompat$MediaItem = null;
                getkernelid2.MediaSessionCompat$Token = BitmapDescriptorFactory.HUE_RED;
                getkernelid2.MediaBrowserCompat$SearchResultReceiver = null;
                getkernelid2.MediaSessionCompat$QueueItem = write3.read;
                getkernelid2.read = null;
                this.MediaBrowserCompat$SearchResultReceiver.read(this.MediaSessionCompat$QueueItem, this.AppCompatDialogFragment, this.setExpandedFormat);
                int IconCompatParcelizer2 = FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.IconCompatParcelizer(this.setShortcut.AppCompatActivity);
                if (!this.IconCompatParcelizer) {
                    if (IconCompatParcelizer2 == 1 || IconCompatParcelizer2 == 0) {
                        validateGEMV validategemv = new validateGEMV(this.setShortcut, setcontentview, this.MediaSessionCompat$QueueItem);
                        this.setIcon = validategemv;
                        validategemv.MediaBrowserCompat$SearchResultReceiver = this.setGroupDividerEnabled;
                        this.setIcon.IconCompatParcelizer();
                        validateGEMV validategemv2 = this.setIcon;
                        int i4 = this.MediaBrowserCompat$SearchResultReceiver.Keep;
                        int i5 = this.MediaBrowserCompat$SearchResultReceiver.setBackgroundResource;
                        validategemv2.MediaDescriptionCompat = i4;
                        validategemv2.MediaBrowserCompat$MediaItem = i5;
                    }
                }
                getFieldID getfieldid = this.MediaSessionCompat$Token;
                if (getfieldid != null) {
                    getfieldid.MediaBrowserCompat$ItemReceiver();
                }
                addReference addreference2 = this.ExpandedMenuView;
                addreference2.write = true;
                addreference2.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(addreference2.MediaBrowserCompat$MediaItem);
                addreference2.write = false;
                return true;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Invalid wrappedAdapterRange specified --- does not contain drag target item (wrappedAdapterRange = ");
            sb3.append(scriptIntrinsic);
            sb3.append(", position = ");
            sb3.append(MediaBrowserCompat$ItemReceiver2);
            sb3.append(")");
            throw new IllegalStateException(sb3.toString());
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Invalid wrappedAdapterRange specified --- end >= count (wrappedAdapterRange = ");
            sb4.append(scriptIntrinsic);
            sb4.append(")");
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.AppCompatDialogFragment = (int) (motionEvent.getX() + 0.5f);
        this.setExpandedFormat = (int) (motionEvent.getY() + 0.5f);
        NestedScrollView nestedScrollView = this.setChecked;
        this.ActionMenuItemView = nestedScrollView != null ? nestedScrollView.getScrollX() : 0;
        NestedScrollView nestedScrollView2 = this.setChecked;
        this.AppCompatViewInflater = nestedScrollView2 != null ? nestedScrollView2.getScrollY() : 0;
        this.MenuItemWrapperICS$CollapsibleActionViewWrapper = Math.min(this.MenuItemWrapperICS$CollapsibleActionViewWrapper, this.AppCompatDialogFragment);
        this.setTabContainer = Math.min(this.setTabContainer, this.setExpandedFormat);
        this.AbsActionBarView = Math.max(this.AbsActionBarView, this.AppCompatDialogFragment);
        this.setVisibility = Math.max(this.setVisibility, this.setExpandedFormat);
        int write2 = FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.write(this.setShortcut.AppCompatActivity);
        if (write2 == 0) {
            int i = this.AppCompatDialogFragment;
            NestedScrollView nestedScrollView3 = this.setChecked;
            if (nestedScrollView3 != null) {
                i += nestedScrollView3.getScrollX() - this.ActionMenuItemView;
            }
            int i2 = this.setPrimaryBackground;
            int i3 = this.MenuItemWrapperICS$CollapsibleActionViewWrapper;
            int i4 = this.setPadding;
            if (i2 - i3 > i4 || this.AbsActionBarView - i > i4) {
                this.setItemInvoker |= 4;
            }
            int i5 = this.AbsActionBarView;
            int i6 = this.setPrimaryBackground;
            int i7 = this.setPadding;
            if (i5 - i6 > i7 || i - this.MenuItemWrapperICS$CollapsibleActionViewWrapper > i7) {
                this.setItemInvoker |= 8;
            }
        } else if (write2 == 1) {
            int i8 = this.setExpandedFormat;
            NestedScrollView nestedScrollView4 = this.setChecked;
            if (nestedScrollView4 != null) {
                i8 += nestedScrollView4.getScrollY() - this.AppCompatViewInflater;
            }
            int i9 = this.setStackedBackground;
            int i10 = this.setTabContainer;
            int i11 = this.setPadding;
            if (i9 - i10 > i11 || this.setVisibility - i8 > i11) {
                this.setItemInvoker = 1 | this.setItemInvoker;
            }
            int i12 = this.setVisibility;
            int i13 = this.setStackedBackground;
            int i14 = this.setPadding;
            if (i12 - i13 > i14 || i8 - this.setTabContainer > i14) {
                this.setItemInvoker |= 2;
            }
        }
        getKernelID getkernelid = this.MediaBrowserCompat$SearchResultReceiver;
        int i15 = this.AppCompatDialogFragment;
        NestedScrollView nestedScrollView5 = this.setChecked;
        if (nestedScrollView5 != null) {
            i15 += nestedScrollView5.getScrollX() - this.ActionMenuItemView;
        }
        int i16 = this.setExpandedFormat;
        NestedScrollView nestedScrollView6 = this.setChecked;
        if (nestedScrollView6 != null) {
            i16 += nestedScrollView6.getScrollY() - this.AppCompatViewInflater;
        }
        if (getkernelid.MediaBrowserCompat$ItemReceiver(i15, i16, false)) {
            validateGEMV validategemv = this.setIcon;
            if (validategemv != null) {
                int i17 = this.MediaBrowserCompat$SearchResultReceiver.Keep;
                int i18 = this.MediaBrowserCompat$SearchResultReceiver.setBackgroundResource;
                validategemv.MediaDescriptionCompat = i17;
                validategemv.MediaBrowserCompat$MediaItem = i18;
            }
            MediaBrowserCompat$ItemReceiver(recyclerView);
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(RecyclerView recyclerView) {
        RecyclerView.setContentView setcontentview = this.MediaSessionCompat$ResultReceiverWrapper;
        write write2 = this.setTitleOptional;
        zzgk.IconCompatParcelizer iconCompatParcelizer = this.MediaSessionCompat$QueueItem;
        int i = this.AppCompatDialogFragment;
        NestedScrollView nestedScrollView = this.setChecked;
        if (nestedScrollView != null) {
            i += nestedScrollView.getScrollX() - this.ActionMenuItemView;
        }
        int i2 = i;
        int i3 = this.setExpandedFormat;
        NestedScrollView nestedScrollView2 = this.setChecked;
        if (nestedScrollView2 != null) {
            i3 += nestedScrollView2.getScrollY() - this.AppCompatViewInflater;
        }
        write2.write(recyclerView, setcontentview, iconCompatParcelizer, i2, i3, this.setSubtitle, this.setHasNonEmbeddedTabs, this.IconCompatParcelizer);
        int i4 = this.ExpandedMenuView.MediaBrowserCompat$MediaItem;
        int i5 = this.ExpandedMenuView.MediaBrowserCompat$SearchResultReceiver;
        boolean z = false;
        read read2 = read(this.setHideOnContentScrollEnabled, write2, false);
        if (read2.MediaBrowserCompat$ItemReceiver != -1) {
            z = !this.IconCompatParcelizer;
            if (!z) {
                z = this.ExpandedMenuView.MediaBrowserCompat$ItemReceiver.read(i4, read2.MediaBrowserCompat$ItemReceiver);
            }
            if (!z) {
                read2 = read(this.setHideOnContentScrollEnabled, write2, true);
                if (read2.MediaBrowserCompat$ItemReceiver != -1) {
                    z = this.ExpandedMenuView.MediaBrowserCompat$ItemReceiver.read(i4, read2.MediaBrowserCompat$ItemReceiver);
                }
            }
        }
        if (!z || read2.write != null) {
            if (z) {
                read(recyclerView, i5, setcontentview, read2.write);
            }
            validateGEMV validategemv = this.setIcon;
            if (validategemv != null) {
                validategemv.write(z ? read2.write : null);
            }
            if (z) {
                this.ParcelableVolumeInfo.sendEmptyMessage(3);
            }
            read2.write = null;
            read2.MediaBrowserCompat$ItemReceiver = -1;
            write2.MediaBrowserCompat$SearchResultReceiver = null;
            write2.write = null;
            write2.read = null;
            return;
        }
        throw new IllegalStateException("bug check");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x018b, code lost:
        if (r13 != false) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0196, code lost:
        if (r13 != false) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01a6, code lost:
        if (r13 != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01b1, code lost:
        if (r13 != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c5, code lost:
        if ((r8 & (r19 ? 8 : 2)) == 0) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d3, code lost:
        if ((r8 & (r19 ? 4 : 1)) != 0) goto L_0x00d7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$ItemReceiver(androidx.recyclerview.widget.RecyclerView r18, boolean r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r19 == 0) goto L_0x000b
            int r2 = r18.getWidth()
            goto L_0x000f
        L_0x000b:
            int r2 = r18.getHeight()
        L_0x000f:
            if (r2 != 0) goto L_0x0012
            return
        L_0x0012:
            r3 = 1065353216(0x3f800000, float:1.0)
            float r4 = (float) r2
            float r3 = r3 / r4
            if (r19 == 0) goto L_0x0027
            int r4 = r0.AppCompatDialogFragment
            androidx.core.widget.NestedScrollView r5 = r0.setChecked
            if (r5 == 0) goto L_0x0034
            int r5 = r5.getScrollX()
            int r6 = r0.ActionMenuItemView
        L_0x0024:
            int r5 = r5 - r6
            int r4 = r4 + r5
            goto L_0x0034
        L_0x0027:
            int r4 = r0.setExpandedFormat
            androidx.core.widget.NestedScrollView r5 = r0.setChecked
            if (r5 == 0) goto L_0x0034
            int r5 = r5.getScrollY()
            int r6 = r0.AppCompatViewInflater
            goto L_0x0024
        L_0x0034:
            float r4 = (float) r4
            float r4 = r4 * r3
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 - r5
            float r6 = java.lang.Math.abs(r4)
            r7 = 1050253722(0x3e99999a, float:0.3)
            float r6 = r5 - r6
            float r7 = r7 - r6
            r6 = 0
            float r7 = java.lang.Math.max(r6, r7)
            int r8 = r0.setItemInvoker
            o.getKernelID r9 = r0.MediaBrowserCompat$SearchResultReceiver
            float r4 = java.lang.Math.signum(r4)
            int r4 = (int) r4
            float r10 = r0.MediaDescriptionCompat
            r11 = 1103626240(0x41c80000, float:25.0)
            float r10 = r10 * r11
            float r11 = r0.MediaMetadataCompat
            float r10 = r10 * r11
            r11 = 1079334229(0x40555555, float:3.3333333)
            float r7 = r7 * r11
            float r10 = r10 * r7
            float r10 = r10 + r5
            int r7 = (int) r10
            int r4 = r4 * r7
            o.ScriptIntrinsic r7 = r0.setHasNonEmbeddedTabs
            androidx.recyclerview.widget.RecyclerView r10 = r0.setShortcut
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r10 = r10.AppCompatActivity
            boolean r11 = r10 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r12 = -1
            r13 = 1
            r14 = 0
            if (r11 == 0) goto L_0x0080
            androidx.recyclerview.widget.LinearLayoutManager r10 = (androidx.recyclerview.widget.LinearLayoutManager) r10
            int r11 = r10.MediaSessionCompat$ResultReceiverWrapper()
            android.view.View r10 = r10.read((int) r14, (int) r11, (boolean) r13, (boolean) r14)
            if (r10 != 0) goto L_0x007b
            goto L_0x0080
        L_0x007b:
            int r10 = androidx.recyclerview.widget.LinearLayoutManager.MediaMetadataCompat((android.view.View) r10)
            goto L_0x0081
        L_0x0080:
            r10 = r12
        L_0x0081:
            androidx.recyclerview.widget.RecyclerView r11 = r0.setShortcut
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r11 = r11.AppCompatActivity
            boolean r15 = r11 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r15 == 0) goto L_0x0090
            androidx.recyclerview.widget.LinearLayoutManager r11 = (androidx.recyclerview.widget.LinearLayoutManager) r11
            int r11 = r11.RatingCompat()
            goto L_0x0091
        L_0x0090:
            r11 = r12
        L_0x0091:
            if (r10 == r12) goto L_0x00a3
            int r15 = r7.MediaBrowserCompat$ItemReceiver
            if (r10 > r15) goto L_0x0099
            r15 = r13
            goto L_0x009a
        L_0x0099:
            r15 = r14
        L_0x009a:
            int r6 = r7.MediaBrowserCompat$ItemReceiver
            int r6 = r6 - r13
            if (r10 > r6) goto L_0x00a1
            r6 = r13
            goto L_0x00a5
        L_0x00a1:
            r6 = r14
            goto L_0x00a5
        L_0x00a3:
            r6 = r14
            r15 = r6
        L_0x00a5:
            if (r11 == r12) goto L_0x00b7
            int r12 = r7.MediaBrowserCompat$CustomActionResultReceiver
            if (r11 < r12) goto L_0x00ad
            r12 = r13
            goto L_0x00ae
        L_0x00ad:
            r12 = r14
        L_0x00ae:
            int r7 = r7.MediaBrowserCompat$CustomActionResultReceiver
            int r7 = r7 + r13
            if (r11 < r7) goto L_0x00b5
            r7 = r13
            goto L_0x00b9
        L_0x00b5:
            r7 = r14
            goto L_0x00b9
        L_0x00b7:
            r7 = r14
            r12 = r7
        L_0x00b9:
            r5 = 2
            if (r4 <= 0) goto L_0x00c8
            if (r19 == 0) goto L_0x00c1
            r16 = 8
            goto L_0x00c3
        L_0x00c1:
            r16 = r5
        L_0x00c3:
            r8 = r8 & r16
            if (r8 != 0) goto L_0x00d7
            goto L_0x00d6
        L_0x00c8:
            if (r4 >= 0) goto L_0x00d7
            if (r19 == 0) goto L_0x00cf
            r16 = 4
            goto L_0x00d1
        L_0x00cf:
            r16 = r13
        L_0x00d1:
            r8 = r8 & r16
            if (r8 == 0) goto L_0x00d6
            goto L_0x00d7
        L_0x00d6:
            r4 = r14
        L_0x00d7:
            if (r6 != 0) goto L_0x00db
            if (r4 < 0) goto L_0x00df
        L_0x00db:
            if (r7 != 0) goto L_0x012e
            if (r4 <= 0) goto L_0x012e
        L_0x00df:
            o.validateGEMV r6 = r0.setIcon
            if (r6 == 0) goto L_0x00ee
            if (r1 == 0) goto L_0x00e8
            androidx.recyclerview.widget.RecyclerView$MediaMetadataCompat r1 = r1.AlertController$RecycleListView
            goto L_0x00e9
        L_0x00e8:
            r1 = 0
        L_0x00e9:
            if (r1 == 0) goto L_0x00ee
            r1.write()
        L_0x00ee:
            if (r19 == 0) goto L_0x00fe
            r0.write = r14
            r0.f2556x50fd9e4a = r13
            androidx.recyclerview.widget.RecyclerView r1 = r0.setShortcut
            r1.scrollBy(r4, r14)
            r0.f2556x50fd9e4a = r14
            int r1 = r0.write
            goto L_0x010b
        L_0x00fe:
            r0.read = r14
            r0.f2556x50fd9e4a = r13
            androidx.recyclerview.widget.RecyclerView r1 = r0.setShortcut
            r1.scrollBy(r14, r4)
            r0.f2556x50fd9e4a = r14
            int r1 = r0.read
        L_0x010b:
            if (r4 >= 0) goto L_0x0116
            r6 = r15 ^ 1
            boolean r7 = r9.MediaDescriptionCompat
            if (r7 == r6) goto L_0x011e
            r9.MediaDescriptionCompat = r6
            goto L_0x011e
        L_0x0116:
            r6 = r12 ^ 1
            boolean r7 = r9.MediaDescriptionCompat
            if (r7 == r6) goto L_0x011e
            r9.MediaDescriptionCompat = r6
        L_0x011e:
            r9.write((boolean) r13)
            o.validateGEMV r6 = r0.setIcon
            if (r6 == 0) goto L_0x0135
            int r7 = r9.Keep
            int r8 = r9.setBackgroundResource
            r6.MediaDescriptionCompat = r7
            r6.MediaBrowserCompat$MediaItem = r8
            goto L_0x0135
        L_0x012e:
            boolean r1 = r9.MediaDescriptionCompat
            if (r1 == 0) goto L_0x0134
            r9.MediaDescriptionCompat = r14
        L_0x0134:
            r1 = r14
        L_0x0135:
            o.getFieldID r6 = r0.MediaSessionCompat$Token
            if (r6 == 0) goto L_0x0218
            int r6 = r0.setCustomView
            if (r6 == r5) goto L_0x01bb
            if (r1 == 0) goto L_0x0141
            r6 = r13
            goto L_0x0142
        L_0x0141:
            r6 = r14
        L_0x0142:
            if (r19 == 0) goto L_0x0147
            int r7 = r9.Keep
            goto L_0x0149
        L_0x0147:
            int r7 = r9.setBackgroundResource
        L_0x0149:
            if (r19 == 0) goto L_0x0152
            int r8 = r9.Keep
            o.zzgk$IconCompatParcelizer r12 = r9.RatingCompat
            int r12 = r12.MediaBrowserCompat$MediaItem
            goto L_0x0158
        L_0x0152:
            int r8 = r9.setBackgroundResource
            o.zzgk$IconCompatParcelizer r12 = r9.RatingCompat
            int r12 = r12.MediaBrowserCompat$ItemReceiver
        L_0x0158:
            int r8 = r8 + r12
            int r12 = r7 + r8
            int r12 = r12 / r5
            if (r10 != 0) goto L_0x0163
            if (r11 != 0) goto L_0x0163
            if (r4 < 0) goto L_0x0168
            goto L_0x0167
        L_0x0163:
            int r2 = r2 / r5
            if (r12 >= r2) goto L_0x0167
            goto L_0x0168
        L_0x0167:
            r7 = r8
        L_0x0168:
            float r2 = (float) r7
            float r2 = r2 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 - r3
            float r3 = java.lang.Math.abs(r2)
            r5 = 1053609165(0x3ecccccd, float:0.4)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x01bb
            if (r4 == 0) goto L_0x01bb
            if (r6 != 0) goto L_0x01bb
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x019c
            if (r19 == 0) goto L_0x018e
            int r2 = r9.Keep
            int r3 = r9.AlertController$RecycleListView
            if (r2 != r3) goto L_0x018a
            goto L_0x018b
        L_0x018a:
            r13 = r14
        L_0x018b:
            if (r13 == 0) goto L_0x01bb
            goto L_0x0198
        L_0x018e:
            int r2 = r9.setBackgroundResource
            int r3 = r9.setHasDecor
            if (r2 != r3) goto L_0x0195
            goto L_0x0196
        L_0x0195:
            r13 = r14
        L_0x0196:
            if (r13 == 0) goto L_0x01bb
        L_0x0198:
            float r2 = r0.MediaMetadataCompat
            float r2 = -r2
            goto L_0x01b5
        L_0x019c:
            if (r19 == 0) goto L_0x01a9
            int r2 = r9.Keep
            int r3 = r9.PlaybackStateCompat
            if (r2 != r3) goto L_0x01a5
            goto L_0x01a6
        L_0x01a5:
            r13 = r14
        L_0x01a6:
            if (r13 == 0) goto L_0x01bb
            goto L_0x01b3
        L_0x01a9:
            int r2 = r9.setBackgroundResource
            int r3 = r9.PlaybackStateCompat$CustomAction
            if (r2 != r3) goto L_0x01b0
            goto L_0x01b1
        L_0x01b0:
            r13 = r14
        L_0x01b1:
            if (r13 == 0) goto L_0x01bb
        L_0x01b3:
            float r2 = r0.MediaMetadataCompat
        L_0x01b5:
            r3 = 1000593162(0x3ba3d70a, float:0.005)
            float r3 = r3 * r2
            r2 = 0
            goto L_0x01bd
        L_0x01bb:
            r2 = 0
            r3 = 0
        L_0x01bd:
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0213
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x01ec
            o.getFieldID r2 = r0.MediaSessionCompat$Token
            androidx.recyclerview.widget.RecyclerView r4 = r2.IconCompatParcelizer
            android.widget.EdgeEffect r5 = r2.write
            if (r5 != 0) goto L_0x01d8
            android.widget.EdgeEffect r5 = new android.widget.EdgeEffect
            android.content.Context r6 = r4.getContext()
            r5.<init>(r6)
            r2.write = r5
        L_0x01d8:
            android.widget.EdgeEffect r5 = r2.write
            int r6 = r2.MediaBrowserCompat$CustomActionResultReceiver
            p040o.getFieldID.write(r4, r5, r6)
            android.widget.EdgeEffect r4 = r2.write
            r5 = 1056964608(0x3f000000, float:0.5)
            p040o.Toolbar.IconCompatParcelizer(r4, r3, r5)
            androidx.recyclerview.widget.RecyclerView r2 = r2.IconCompatParcelizer
            p040o.SwitchCompat.setItemInvoker(r2)
            goto L_0x0218
        L_0x01ec:
            o.getFieldID r2 = r0.MediaSessionCompat$Token
            androidx.recyclerview.widget.RecyclerView r4 = r2.IconCompatParcelizer
            android.widget.EdgeEffect r5 = r2.MediaBrowserCompat$ItemReceiver
            if (r5 != 0) goto L_0x01ff
            android.widget.EdgeEffect r5 = new android.widget.EdgeEffect
            android.content.Context r6 = r4.getContext()
            r5.<init>(r6)
            r2.MediaBrowserCompat$ItemReceiver = r5
        L_0x01ff:
            android.widget.EdgeEffect r5 = r2.MediaBrowserCompat$ItemReceiver
            int r6 = r2.read
            p040o.getFieldID.write(r4, r5, r6)
            android.widget.EdgeEffect r4 = r2.MediaBrowserCompat$ItemReceiver
            r5 = 1056964608(0x3f000000, float:0.5)
            p040o.Toolbar.IconCompatParcelizer(r4, r3, r5)
            androidx.recyclerview.widget.RecyclerView r2 = r2.IconCompatParcelizer
            p040o.SwitchCompat.setItemInvoker(r2)
            goto L_0x0218
        L_0x0213:
            o.getFieldID r2 = r0.MediaSessionCompat$Token
            r2.write()
        L_0x0218:
            androidx.recyclerview.widget.RecyclerView r2 = r0.setShortcut
            java.lang.Runnable r3 = r0.RatingCompat
            p040o.SwitchCompat.MediaBrowserCompat$ItemReceiver((android.view.View) r2, (java.lang.Runnable) r3)
            if (r1 == 0) goto L_0x022e
            if (r19 == 0) goto L_0x0229
            int r2 = r0.setSplitBackground
            int r2 = r2 + r1
            r0.setSplitBackground = r2
            return
        L_0x0229:
            int r2 = r0.ActionBarContainer
            int r2 = r2 + r1
            r0.ActionBarContainer = r2
        L_0x022e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ScriptIntrinsic3DLUT.MediaBrowserCompat$ItemReceiver(androidx.recyclerview.widget.RecyclerView, boolean):void");
    }

    private static NestedScrollView MediaBrowserCompat$CustomActionResultReceiver(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof NestedScrollView) {
                return (NestedScrollView) parent;
            }
        }
        return null;
    }

    static boolean MediaBrowserCompat$CustomActionResultReceiver(View view, View view2, Rect rect) {
        ViewParent parent;
        do {
            parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ((ViewGroup) parent).offsetDescendantRectToMyCoords(view, rect);
            view = (View) parent;
        } while (parent != view2);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void read(androidx.recyclerview.widget.RecyclerView r19, int r20, androidx.recyclerview.widget.RecyclerView.setContentView r21, androidx.recyclerview.widget.RecyclerView.setContentView r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            android.view.View r5 = r4.write
            android.graphics.Rect r6 = r0.setActionBarHideOffset
            android.graphics.Rect r5 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.MediaBrowserCompat$ItemReceiver(r5, r6)
            int r6 = r0.MediaBrowserCompat$CustomActionResultReceiver((androidx.recyclerview.widget.RecyclerView.setContentView) r4)
            int r7 = r2 - r6
            int r7 = java.lang.Math.abs(r7)
            r8 = -1
            if (r2 == r8) goto L_0x023f
            if (r6 == r8) goto L_0x023f
            o.addReference r9 = r0.ExpandedMenuView
            long r9 = r9.MediaBrowserCompat$ItemReceiver((int) r2)
            r11 = -1
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r14 = 8
            if (r13 != 0) goto L_0x0031
            r9 = r11
            goto L_0x0033
        L_0x0031:
            long r9 = r9 << r14
            long r9 = r9 >> r14
        L_0x0033:
            o.zzgk$IconCompatParcelizer r13 = r0.MediaSessionCompat$QueueItem
            r16 = r9
            long r8 = r13.MediaBrowserCompat$CustomActionResultReceiver
            int r10 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x003e
            goto L_0x0041
        L_0x003e:
            long r8 = r8 << r14
            long r11 = r8 >> r14
        L_0x0041:
            int r8 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r8 == 0) goto L_0x0046
            return
        L_0x0046:
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r8 = r1.AppCompatActivity
            int r8 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.IconCompatParcelizer((androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver) r8)
            r9 = 1
            if (r8 == r9) goto L_0x0054
            if (r8 != 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r8 = 0
            goto L_0x0055
        L_0x0054:
            r8 = r9
        L_0x0055:
            if (r8 == 0) goto L_0x005d
            boolean r8 = r0.IconCompatParcelizer
            if (r8 != 0) goto L_0x005d
            r8 = r9
            goto L_0x005e
        L_0x005d:
            r8 = 0
        L_0x005e:
            if (r7 != 0) goto L_0x0063
        L_0x0060:
            r10 = 0
            goto L_0x011f
        L_0x0063:
            if (r7 != r9) goto L_0x011e
            if (r3 == 0) goto L_0x011e
            if (r8 == 0) goto L_0x011e
            android.view.View r7 = r3.write
            android.view.View r8 = r4.write
            o.zzgk$IconCompatParcelizer r11 = r0.MediaSessionCompat$QueueItem
            android.graphics.Rect r11 = r11.MediaBrowserCompat$SearchResultReceiver
            boolean r12 = r0.MediaBrowserCompat$ItemReceiver
            r13 = 1056964608(0x3f000000, float:0.5)
            if (r12 == 0) goto L_0x00c8
            int r12 = r7.getLeft()
            int r14 = r11.left
            int r12 = r12 - r14
            int r14 = r8.getLeft()
            int r15 = r5.left
            int r14 = r14 - r15
            int r12 = java.lang.Math.min(r12, r14)
            int r14 = r7.getRight()
            int r15 = r11.right
            int r14 = r14 + r15
            int r15 = r8.getRight()
            int r10 = r5.right
            int r15 = r15 + r10
            int r10 = java.lang.Math.max(r14, r15)
            float r14 = (float) r12
            int r10 = r10 - r12
            float r10 = (float) r10
            float r10 = r10 * r13
            float r14 = r14 + r10
            int r10 = r0.AppCompatDialogFragment
            androidx.core.widget.NestedScrollView r12 = r0.setChecked
            if (r12 == 0) goto L_0x00ae
            int r12 = r12.getScrollX()
            int r15 = r0.ActionMenuItemView
            int r12 = r12 - r15
            int r10 = r10 + r12
        L_0x00ae:
            o.zzgk$IconCompatParcelizer r12 = r0.MediaSessionCompat$QueueItem
            int r12 = r12.write
            int r10 = r10 - r12
            float r10 = (float) r10
            o.zzgk$IconCompatParcelizer r12 = r0.MediaSessionCompat$QueueItem
            int r12 = r12.MediaBrowserCompat$MediaItem
            float r12 = (float) r12
            float r12 = r12 * r13
            float r10 = r10 + r12
            if (r6 >= r2) goto L_0x00c2
            int r10 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r10 >= 0) goto L_0x00c8
            goto L_0x00c6
        L_0x00c2:
            int r10 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r10 <= 0) goto L_0x00c8
        L_0x00c6:
            r10 = r9
            goto L_0x00c9
        L_0x00c8:
            r10 = 0
        L_0x00c9:
            if (r10 != 0) goto L_0x011f
            boolean r10 = r0.MediaBrowserCompat$CustomActionResultReceiver
            if (r10 == 0) goto L_0x0060
            int r10 = r7.getTop()
            int r12 = r11.top
            int r10 = r10 - r12
            int r12 = r8.getTop()
            int r14 = r5.top
            int r12 = r12 - r14
            int r10 = java.lang.Math.min(r10, r12)
            int r7 = r7.getBottom()
            int r11 = r11.bottom
            int r7 = r7 + r11
            int r8 = r8.getBottom()
            int r5 = r5.bottom
            int r8 = r8 + r5
            int r5 = java.lang.Math.max(r7, r8)
            float r7 = (float) r10
            int r5 = r5 - r10
            float r5 = (float) r5
            float r5 = r5 * r13
            float r7 = r7 + r5
            int r5 = r0.setExpandedFormat
            androidx.core.widget.NestedScrollView r8 = r0.setChecked
            if (r8 == 0) goto L_0x0106
            int r8 = r8.getScrollY()
            int r10 = r0.AppCompatViewInflater
            int r8 = r8 - r10
            int r5 = r5 + r8
        L_0x0106:
            o.zzgk$IconCompatParcelizer r8 = r0.MediaSessionCompat$QueueItem
            int r8 = r8.IconCompatParcelizer
            int r5 = r5 - r8
            float r5 = (float) r5
            o.zzgk$IconCompatParcelizer r8 = r0.MediaSessionCompat$QueueItem
            int r8 = r8.MediaBrowserCompat$ItemReceiver
            float r8 = (float) r8
            float r8 = r8 * r13
            float r5 = r5 + r8
            if (r6 >= r2) goto L_0x011a
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x0060
            goto L_0x011e
        L_0x011a:
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0060
        L_0x011e:
            r10 = r9
        L_0x011f:
            if (r10 == 0) goto L_0x023f
            androidx.recyclerview.widget.RecyclerView r5 = r0.setShortcut
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r5 = r5.AppCompatActivity
            androidx.recyclerview.widget.RecyclerView r7 = r0.setShortcut
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r7 = r7.AppCompatActivity
            int r7 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.IconCompatParcelizer((androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver) r7)
            int r8 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.IconCompatParcelizer((int) r7)
            if (r8 == r9) goto L_0x0135
            r8 = 0
            goto L_0x0136
        L_0x0135:
            r8 = r9
        L_0x0136:
            androidx.recyclerview.widget.RecyclerView r10 = r0.setShortcut
            r11 = 0
            int r10 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.read(r10, r11)
            if (r3 == 0) goto L_0x0142
            android.view.View r12 = r3.write
            goto L_0x0143
        L_0x0142:
            r12 = 0
        L_0x0143:
            android.view.View r13 = r4.write
            r14 = -1
            if (r10 == r14) goto L_0x014d
            android.view.View r5 = r5.MediaBrowserCompat$CustomActionResultReceiver((int) r10)
            goto L_0x014e
        L_0x014d:
            r5 = 0
        L_0x014e:
            if (r3 == 0) goto L_0x015e
            int r15 = r3.ParcelableVolumeInfo
            if (r15 != r14) goto L_0x0159
            int r3 = r3.MediaSessionCompat$QueueItem
            r16 = r3
            goto L_0x015b
        L_0x0159:
            r16 = r15
        L_0x015b:
            r3 = r16
            goto L_0x015f
        L_0x015e:
            r3 = r14
        L_0x015f:
            int r15 = r4.ParcelableVolumeInfo
            if (r15 != r14) goto L_0x0165
            int r15 = r4.MediaSessionCompat$QueueItem
        L_0x0165:
            java.lang.Integer r4 = IconCompatParcelizer(r12, r8)
            java.lang.Integer r13 = IconCompatParcelizer(r13, r8)
            java.lang.Integer r5 = IconCompatParcelizer(r5, r8)
            o.addReference r14 = r0.ExpandedMenuView
            int r11 = r14.MediaBrowserCompat$MediaItem
            int r9 = r14.MediaBrowserCompat$SearchResultReceiver
            int r0 = r14.MediaSessionCompat$Token
            int r0 = p040o.addReference.MediaBrowserCompat$ItemReceiver(r2, r11, r9, r0)
            int r9 = r14.MediaBrowserCompat$MediaItem
            if (r0 != r9) goto L_0x0204
            r14.MediaBrowserCompat$SearchResultReceiver = r6
            int r0 = r14.MediaSessionCompat$Token
            if (r0 != 0) goto L_0x0198
            r0 = 1
            if (r7 == r0) goto L_0x018f
            if (r7 != 0) goto L_0x018d
            goto L_0x018f
        L_0x018d:
            r9 = 0
            goto L_0x0190
        L_0x018f:
            r9 = r0
        L_0x0190:
            if (r9 == 0) goto L_0x0198
            androidx.recyclerview.widget.RecyclerView$write r0 = r14.IconCompatParcelizer
            r0.IconCompatParcelizer(r2, r6)
            goto L_0x019d
        L_0x0198:
            androidx.recyclerview.widget.RecyclerView$write r0 = r14.IconCompatParcelizer
            r0.write()
        L_0x019d:
            if (r10 != r3) goto L_0x01c4
            if (r5 == 0) goto L_0x01c4
            if (r13 == 0) goto L_0x01c4
            int r0 = r13.intValue()
            int r2 = r5.intValue()
            int r0 = r0 - r2
            int r0 = -r0
            if (r8 == 0) goto L_0x01b4
            r2 = 0
            r1.scrollBy(r2, r0)
            goto L_0x01b8
        L_0x01b4:
            r2 = 0
            r1.scrollBy(r0, r2)
        L_0x01b8:
            if (r1 == 0) goto L_0x01bd
            androidx.recyclerview.widget.RecyclerView$MediaMetadataCompat r11 = r1.AlertController$RecycleListView
            goto L_0x01be
        L_0x01bd:
            r11 = 0
        L_0x01be:
            if (r11 == 0) goto L_0x01c3
            r11.write()
        L_0x01c3:
            return
        L_0x01c4:
            if (r10 != r15) goto L_0x023f
            if (r12 == 0) goto L_0x023f
            if (r4 == 0) goto L_0x023f
            boolean r0 = r4.equals(r13)
            if (r0 != 0) goto L_0x023f
            android.view.ViewGroup$LayoutParams r0 = r12.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            if (r8 == 0) goto L_0x01e2
            int r2 = androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver((android.view.View) r12)
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r0 = r0.bottomMargin
            goto L_0x01eb
        L_0x01e2:
            int r2 = androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver((android.view.View) r12)
            int r3 = r0.leftMargin
            int r2 = r2 + r3
            int r0 = r0.rightMargin
        L_0x01eb:
            int r2 = r2 + r0
            int r0 = -r2
            if (r8 == 0) goto L_0x01f4
            r2 = 0
            r1.scrollBy(r2, r0)
            goto L_0x01f8
        L_0x01f4:
            r2 = 0
            r1.scrollBy(r0, r2)
        L_0x01f8:
            if (r1 == 0) goto L_0x01fd
            androidx.recyclerview.widget.RecyclerView$MediaMetadataCompat r11 = r1.AlertController$RecycleListView
            goto L_0x01fe
        L_0x01fd:
            r11 = 0
        L_0x01fe:
            if (r11 == 0) goto L_0x023f
            r11.write()
            goto L_0x023f
        L_0x0204:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "onMoveItem() - may be a bug or has duplicate IDs  --- mDraggingItemInitialPosition = "
            r1.append(r3)
            int r3 = r14.MediaBrowserCompat$MediaItem
            r1.append(r3)
            java.lang.String r3 = ", mDraggingItemCurrentPosition = "
            r1.append(r3)
            int r3 = r14.MediaBrowserCompat$SearchResultReceiver
            r1.append(r3)
            java.lang.String r3 = ", origFromPosition = "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = ", fromPosition = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", toPosition = "
            r1.append(r0)
            r1.append(r6)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x023f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ScriptIntrinsic3DLUT.read(androidx.recyclerview.widget.RecyclerView, int, androidx.recyclerview.widget.RecyclerView$setContentView, androidx.recyclerview.widget.RecyclerView$setContentView):void");
    }

    private static Integer IconCompatParcelizer(View view, boolean z) {
        if (view == null) {
            return null;
        }
        return Integer.valueOf(z ? view.getTop() : view.getLeft());
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview) {
        int i = -1;
        if (setcontentview == null) {
            return -1;
        }
        RecyclerView.IconCompatParcelizer iconCompatParcelizer = this.setShortcut.MediaDescriptionCompat;
        addReference addreference = this.ExpandedMenuView;
        Object obj = this.setContentHeight;
        RecyclerView recyclerView = setcontentview.MediaMetadataCompat;
        if (recyclerView != null) {
            i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver(setcontentview);
        }
        return AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer, (RecyclerView.IconCompatParcelizer) addreference, obj, i, (FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment) null);
    }

    /* access modifiers changed from: package-private */
    public final boolean MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i, int i2) {
        int i3;
        boolean z;
        RecyclerView recyclerView = setcontentview.MediaMetadataCompat;
        int i4 = -1;
        if (recyclerView == null) {
            i3 = -1;
        } else {
            i3 = recyclerView.MediaBrowserCompat$CustomActionResultReceiver(setcontentview);
        }
        int MediaBrowserCompat$ItemReceiver2 = AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.setShortcut.MediaDescriptionCompat, (RecyclerView.IconCompatParcelizer) this.ExpandedMenuView, (Object) null, i3, (FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment) null);
        if (MediaBrowserCompat$ItemReceiver2 == -1) {
            return false;
        }
        View view = setcontentview.write;
        view.getTranslationX();
        view.getTranslationY();
        view.getLeft();
        view.getTop();
        ScriptGroup.C1272IO io = (ScriptGroup.C1272IO) AlertController$RecycleListView.read((RecyclerView.IconCompatParcelizer) this.ExpandedMenuView, ScriptGroup.C1272IO.class, MediaBrowserCompat$ItemReceiver2);
        if (io == null) {
            z = false;
        } else {
            z = io.IconCompatParcelizer(setcontentview, MediaBrowserCompat$ItemReceiver2);
        }
        if (!z) {
            return false;
        }
        RecyclerView recyclerView2 = setcontentview.MediaMetadataCompat;
        if (recyclerView2 != null) {
            i4 = recyclerView2.MediaBrowserCompat$CustomActionResultReceiver(setcontentview);
        }
        if (i4 == i3) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r2.read.MediaBrowserCompat$ItemReceiver == r2.write.MediaBrowserCompat$CustomActionResultReceiver) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x02c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p040o.ScriptIntrinsic3DLUT.read read(p040o.ScriptIntrinsic3DLUT.read r19, p040o.ScriptIntrinsic3DLUT.write r20, boolean r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = 0
            r1.write = r3
            r4 = -1
            r1.MediaBrowserCompat$ItemReceiver = r4
            androidx.recyclerview.widget.RecyclerView$setContentView r5 = r2.read
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x003c
            androidx.recyclerview.widget.RecyclerView$setContentView r5 = r2.read
            if (r5 != 0) goto L_0x0018
            r5 = r4
            goto L_0x002e
        L_0x0018:
            androidx.recyclerview.widget.RecyclerView r8 = r0.setShortcut
            androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer r8 = r8.MediaDescriptionCompat
            o.addReference r9 = r0.ExpandedMenuView
            java.lang.Object r10 = r0.setContentHeight
            androidx.recyclerview.widget.RecyclerView r11 = r5.MediaMetadataCompat
            if (r11 != 0) goto L_0x0026
            r5 = r4
            goto L_0x002a
        L_0x0026:
            int r5 = r11.MediaBrowserCompat$CustomActionResultReceiver((androidx.recyclerview.widget.RecyclerView.setContentView) r5)
        L_0x002a:
            int r5 = p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer) r8, (androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer) r9, (java.lang.Object) r10, (int) r5, (p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment) r3)
        L_0x002e:
            if (r5 == r4) goto L_0x004e
            androidx.recyclerview.widget.RecyclerView$setContentView r5 = r2.read
            long r8 = r5.MediaBrowserCompat$ItemReceiver
            o.zzgk$IconCompatParcelizer r5 = r2.write
            long r10 = r5.MediaBrowserCompat$CustomActionResultReceiver
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x004e
        L_0x003c:
            int r5 = r2.RatingCompat
            if (r5 == 0) goto L_0x01c8
            if (r5 == r7) goto L_0x01c8
            r8 = 2
            if (r5 == r8) goto L_0x00f1
            r9 = 3
            if (r5 == r9) goto L_0x00f1
            r9 = 4
            if (r5 == r9) goto L_0x0051
            r9 = 5
            if (r5 == r9) goto L_0x0051
        L_0x004e:
            r8 = r3
            goto L_0x00ee
        L_0x0051:
            if (r21 == 0) goto L_0x0054
        L_0x0053:
            goto L_0x004e
        L_0x0054:
            androidx.recyclerview.widget.RecyclerView$setContentView r5 = r2.read
            if (r5 != 0) goto L_0x0059
            goto L_0x0053
        L_0x0059:
            int r5 = r2.MediaDescriptionCompat
            int r9 = r2.MediaDescriptionCompat
            o.zzgk$IconCompatParcelizer r10 = r2.write
            int r10 = r10.MediaBrowserCompat$MediaItem
            int r10 = r10 / r8
            int r9 = r9 + r10
            int r9 = r9 - r7
            int r10 = r2.MediaDescriptionCompat
            o.zzgk$IconCompatParcelizer r11 = r2.write
            int r11 = r11.MediaBrowserCompat$MediaItem
            int r12 = r2.MediaBrowserCompat$MediaItem
            int r13 = r2.MediaBrowserCompat$MediaItem
            o.zzgk$IconCompatParcelizer r14 = r2.write
            int r14 = r14.MediaBrowserCompat$ItemReceiver
            int r14 = r14 / r8
            int r13 = r13 + r14
            int r13 = r13 - r7
            int r14 = r2.MediaBrowserCompat$MediaItem
            o.zzgk$IconCompatParcelizer r15 = r2.write
            int r15 = r15.MediaBrowserCompat$ItemReceiver
            boolean r3 = r2.MediaSessionCompat$Token
            if (r3 == 0) goto L_0x00b1
            androidx.recyclerview.widget.RecyclerView r3 = r2.MediaBrowserCompat$SearchResultReceiver
            int r5 = r5 + r7
            float r5 = (float) r5
            float r12 = (float) r13
            android.view.View r5 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.write((android.view.ViewGroup) r3, (float) r5, (float) r12)
            if (r5 == 0) goto L_0x008f
            androidx.recyclerview.widget.RecyclerView$setContentView r3 = r3.MediaBrowserCompat$MediaItem((android.view.View) r5)
            goto L_0x0090
        L_0x008f:
            r3 = 0
        L_0x0090:
            androidx.recyclerview.widget.RecyclerView r5 = r2.MediaBrowserCompat$SearchResultReceiver
            int r10 = r10 + r11
            int r10 = r10 - r8
            float r8 = (float) r10
            android.view.View r8 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.write((android.view.ViewGroup) r5, (float) r8, (float) r12)
            if (r8 == 0) goto L_0x00a0
            androidx.recyclerview.widget.RecyclerView$setContentView r5 = r5.MediaBrowserCompat$MediaItem((android.view.View) r8)
            goto L_0x00a1
        L_0x00a0:
            r5 = 0
        L_0x00a1:
            androidx.recyclerview.widget.RecyclerView r8 = r2.MediaBrowserCompat$SearchResultReceiver
            float r9 = (float) r9
            android.view.View r9 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.write((android.view.ViewGroup) r8, (float) r9, (float) r12)
            if (r9 == 0) goto L_0x00af
            androidx.recyclerview.widget.RecyclerView$setContentView r8 = r8.MediaBrowserCompat$MediaItem((android.view.View) r9)
            goto L_0x00e4
        L_0x00af:
            r8 = 0
            goto L_0x00e4
        L_0x00b1:
            androidx.recyclerview.widget.RecyclerView r3 = r2.MediaBrowserCompat$SearchResultReceiver
            float r5 = (float) r9
            int r12 = r12 + r7
            float r9 = (float) r12
            android.view.View r9 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.write((android.view.ViewGroup) r3, (float) r5, (float) r9)
            if (r9 == 0) goto L_0x00c1
            androidx.recyclerview.widget.RecyclerView$setContentView r3 = r3.MediaBrowserCompat$MediaItem((android.view.View) r9)
            goto L_0x00c2
        L_0x00c1:
            r3 = 0
        L_0x00c2:
            androidx.recyclerview.widget.RecyclerView r9 = r2.MediaBrowserCompat$SearchResultReceiver
            float r10 = (float) r13
            android.view.View r10 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.write((android.view.ViewGroup) r9, (float) r5, (float) r10)
            if (r10 == 0) goto L_0x00d0
            androidx.recyclerview.widget.RecyclerView$setContentView r9 = r9.MediaBrowserCompat$MediaItem((android.view.View) r10)
            goto L_0x00d1
        L_0x00d0:
            r9 = 0
        L_0x00d1:
            androidx.recyclerview.widget.RecyclerView r10 = r2.MediaBrowserCompat$SearchResultReceiver
            int r14 = r14 + r15
            int r14 = r14 - r8
            float r8 = (float) r14
            android.view.View r5 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.write((android.view.ViewGroup) r10, (float) r5, (float) r8)
            if (r5 == 0) goto L_0x00e2
            androidx.recyclerview.widget.RecyclerView$setContentView r5 = r10.MediaBrowserCompat$MediaItem((android.view.View) r5)
            r8 = r5
            goto L_0x00e3
        L_0x00e2:
            r8 = 0
        L_0x00e3:
            r5 = r9
        L_0x00e4:
            androidx.recyclerview.widget.RecyclerView$setContentView r9 = r2.read
            if (r8 == r9) goto L_0x00ed
            if (r8 == r3) goto L_0x00ee
            if (r8 != r5) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            r8 = 0
        L_0x00ee:
            r6 = r4
            goto L_0x0285
        L_0x00f1:
            if (r21 == 0) goto L_0x00f7
            r6 = r4
        L_0x00f4:
            r8 = 0
            goto L_0x0285
        L_0x00f7:
            androidx.recyclerview.widget.RecyclerView r3 = r2.MediaBrowserCompat$SearchResultReceiver
            int r5 = r2.IconCompatParcelizer
            float r5 = (float) r5
            int r9 = r2.MediaBrowserCompat$CustomActionResultReceiver
            float r9 = (float) r9
            android.view.View r5 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.write((android.view.ViewGroup) r3, (float) r5, (float) r9)
            if (r5 == 0) goto L_0x010a
            androidx.recyclerview.widget.RecyclerView$setContentView r3 = r3.MediaBrowserCompat$MediaItem((android.view.View) r5)
            goto L_0x010b
        L_0x010a:
            r3 = 0
        L_0x010b:
            if (r3 != 0) goto L_0x01c4
            androidx.recyclerview.widget.RecyclerView r3 = r2.MediaBrowserCompat$SearchResultReceiver
            int r3 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(r3)
            androidx.recyclerview.widget.RecyclerView r5 = r2.MediaBrowserCompat$SearchResultReceiver
            int r5 = r5.getHeight()
            androidx.recyclerview.widget.RecyclerView r9 = r2.MediaBrowserCompat$SearchResultReceiver
            int r9 = r9.getWidth()
            boolean r10 = r2.MediaSessionCompat$Token
            if (r10 == 0) goto L_0x012a
            androidx.recyclerview.widget.RecyclerView r10 = r2.MediaBrowserCompat$SearchResultReceiver
            int r10 = r10.getPaddingLeft()
            goto L_0x012b
        L_0x012a:
            r10 = r6
        L_0x012b:
            boolean r11 = r2.MediaSessionCompat$Token
            if (r11 != 0) goto L_0x0136
            androidx.recyclerview.widget.RecyclerView r11 = r2.MediaBrowserCompat$SearchResultReceiver
            int r11 = r11.getPaddingTop()
            goto L_0x0137
        L_0x0136:
            r11 = r6
        L_0x0137:
            boolean r12 = r2.MediaSessionCompat$Token
            if (r12 == 0) goto L_0x0142
            androidx.recyclerview.widget.RecyclerView r12 = r2.MediaBrowserCompat$SearchResultReceiver
            int r12 = r12.getPaddingRight()
            goto L_0x0143
        L_0x0142:
            r12 = r6
        L_0x0143:
            boolean r13 = r2.MediaSessionCompat$Token
            if (r13 != 0) goto L_0x014e
            androidx.recyclerview.widget.RecyclerView r13 = r2.MediaBrowserCompat$SearchResultReceiver
            int r13 = r13.getPaddingBottom()
            goto L_0x014f
        L_0x014e:
            r13 = r6
        L_0x014f:
            int r9 = r9 - r10
            int r9 = r9 - r12
            int r9 = r9 / r3
            int r5 = r5 - r11
            int r5 = r5 - r13
            int r5 = r5 / r3
            int r12 = r2.IconCompatParcelizer
            int r13 = r2.MediaBrowserCompat$CustomActionResultReceiver
            o.ScriptIntrinsic r14 = r2.MediaMetadataCompat
            int r14 = r14.MediaBrowserCompat$ItemReceiver
            o.ScriptIntrinsic r15 = r2.MediaMetadataCompat
            int r15 = r15.MediaBrowserCompat$CustomActionResultReceiver
            boolean r4 = r2.MediaSessionCompat$Token
            if (r4 == 0) goto L_0x016a
            int r4 = r12 - r10
            float r4 = (float) r4
            float r8 = (float) r9
            goto L_0x016e
        L_0x016a:
            int r4 = r13 - r11
            float r4 = (float) r4
            float r8 = (float) r5
        L_0x016e:
            float r4 = r4 / r8
            int r4 = (int) r4
            int r4 = java.lang.Math.max(r4, r6)
            int r3 = r3 - r7
            int r3 = java.lang.Math.min(r4, r3)
        L_0x0179:
            if (r3 < 0) goto L_0x01c1
            boolean r4 = r2.MediaSessionCompat$Token
            if (r4 == 0) goto L_0x0188
            int r4 = r9 * r3
            int r4 = r4 + r10
            r8 = 2
            int r16 = r9 / 2
            int r4 = r4 + r16
            goto L_0x018a
        L_0x0188:
            r8 = 2
            r4 = r12
        L_0x018a:
            boolean r6 = r2.MediaSessionCompat$Token
            if (r6 != 0) goto L_0x0196
            int r6 = r5 * r3
            int r6 = r6 + r11
            int r17 = r5 / 2
            int r6 = r6 + r17
            goto L_0x0197
        L_0x0196:
            r6 = r13
        L_0x0197:
            androidx.recyclerview.widget.RecyclerView r8 = r2.MediaBrowserCompat$SearchResultReceiver
            float r4 = (float) r4
            float r6 = (float) r6
            android.view.View r4 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.write((android.view.ViewGroup) r8, (float) r4, (float) r6)
            if (r4 == 0) goto L_0x01a6
            androidx.recyclerview.widget.RecyclerView$setContentView r4 = r8.MediaBrowserCompat$MediaItem((android.view.View) r4)
            goto L_0x01a7
        L_0x01a6:
            r4 = 0
        L_0x01a7:
            if (r4 == 0) goto L_0x01bc
            androidx.recyclerview.widget.RecyclerView r3 = r4.MediaMetadataCompat
            if (r3 != 0) goto L_0x01af
            r3 = -1
            goto L_0x01b3
        L_0x01af:
            int r3 = r3.MediaBrowserCompat$CustomActionResultReceiver((androidx.recyclerview.widget.RecyclerView.setContentView) r4)
        L_0x01b3:
            r6 = -1
            if (r3 == r6) goto L_0x01c2
            if (r3 < r14) goto L_0x01c2
            if (r3 > r15) goto L_0x01c2
            r3 = r4
            goto L_0x01c5
        L_0x01bc:
            r6 = -1
            int r3 = r3 + -1
            r6 = 0
            goto L_0x0179
        L_0x01c1:
            r6 = -1
        L_0x01c2:
            r3 = 0
            goto L_0x01c5
        L_0x01c4:
            r6 = r4
        L_0x01c5:
            r8 = r3
            goto L_0x0285
        L_0x01c8:
            r6 = r4
            androidx.recyclerview.widget.RecyclerView$setContentView r3 = r2.read
            if (r3 != 0) goto L_0x01cf
            goto L_0x00f4
        L_0x01cf:
            boolean r3 = r2.MediaBrowserCompat$ItemReceiver
            if (r3 != 0) goto L_0x0220
            if (r21 != 0) goto L_0x0220
            androidx.recyclerview.widget.RecyclerView$setContentView r3 = r2.read
            androidx.recyclerview.widget.RecyclerView r4 = r3.MediaMetadataCompat
            if (r4 != 0) goto L_0x01dd
            r3 = r6
            goto L_0x01e1
        L_0x01dd:
            int r3 = r4.MediaBrowserCompat$CustomActionResultReceiver((androidx.recyclerview.widget.RecyclerView.setContentView) r3)
        L_0x01e1:
            boolean r4 = r2.MediaSessionCompat$Token
            if (r4 == 0) goto L_0x01ee
            androidx.recyclerview.widget.RecyclerView$setContentView r4 = r2.read
            android.view.View r4 = r4.write
            int r4 = r4.getTop()
            goto L_0x01f6
        L_0x01ee:
            androidx.recyclerview.widget.RecyclerView$setContentView r4 = r2.read
            android.view.View r4 = r4.write
            int r4 = r4.getLeft()
        L_0x01f6:
            boolean r5 = r2.MediaSessionCompat$Token
            if (r5 == 0) goto L_0x01fd
            int r5 = r2.MediaBrowserCompat$MediaItem
            goto L_0x01ff
        L_0x01fd:
            int r5 = r2.MediaDescriptionCompat
        L_0x01ff:
            if (r5 >= r4) goto L_0x020b
            if (r3 <= 0) goto L_0x01c2
            androidx.recyclerview.widget.RecyclerView r4 = r2.MediaBrowserCompat$SearchResultReceiver
            int r3 = r3 - r7
            androidx.recyclerview.widget.RecyclerView$setContentView r3 = r4.write((int) r3)
            goto L_0x01c5
        L_0x020b:
            if (r5 <= r4) goto L_0x01c2
            androidx.recyclerview.widget.RecyclerView r4 = r2.MediaBrowserCompat$SearchResultReceiver
            androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer r4 = r4.MediaDescriptionCompat
            int r4 = r4.IconCompatParcelizer()
            int r4 = r4 - r7
            if (r3 >= r4) goto L_0x01c2
            androidx.recyclerview.widget.RecyclerView r4 = r2.MediaBrowserCompat$SearchResultReceiver
            int r3 = r3 + r7
            androidx.recyclerview.widget.RecyclerView$setContentView r3 = r4.write((int) r3)
            goto L_0x01c5
        L_0x0220:
            androidx.recyclerview.widget.RecyclerView$setContentView r3 = r2.read
            android.view.View r3 = r3.write
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            r4 = 1090519040(0x41000000, float:8.0)
            float r3 = r3 * r4
            o.zzgk$IconCompatParcelizer r4 = r2.write
            int r4 = r4.MediaBrowserCompat$MediaItem
            float r4 = (float) r4
            r5 = 1045220557(0x3e4ccccd, float:0.2)
            float r4 = r4 * r5
            float r4 = java.lang.Math.min(r4, r3)
            o.zzgk$IconCompatParcelizer r8 = r2.write
            int r8 = r8.MediaBrowserCompat$ItemReceiver
            float r8 = (float) r8
            float r8 = r8 * r5
            float r3 = java.lang.Math.min(r8, r3)
            int r5 = r2.MediaDescriptionCompat
            float r5 = (float) r5
            o.zzgk$IconCompatParcelizer r8 = r2.write
            int r8 = r8.MediaBrowserCompat$MediaItem
            float r8 = (float) r8
            r9 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r9
            float r5 = r5 + r8
            int r8 = r2.MediaBrowserCompat$MediaItem
            float r8 = (float) r8
            o.zzgk$IconCompatParcelizer r10 = r2.write
            int r10 = r10.MediaBrowserCompat$ItemReceiver
            float r10 = (float) r10
            float r10 = r10 * r9
            float r8 = r8 + r10
            androidx.recyclerview.widget.RecyclerView r9 = r2.MediaBrowserCompat$SearchResultReceiver
            float r10 = r5 - r4
            float r11 = r8 - r3
            android.view.View r10 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.write((android.view.ViewGroup) r9, (float) r10, (float) r11)
            if (r10 == 0) goto L_0x026f
            androidx.recyclerview.widget.RecyclerView$setContentView r9 = r9.MediaBrowserCompat$MediaItem((android.view.View) r10)
            goto L_0x0270
        L_0x026f:
            r9 = 0
        L_0x0270:
            androidx.recyclerview.widget.RecyclerView r10 = r2.MediaBrowserCompat$SearchResultReceiver
            float r5 = r5 + r4
            float r8 = r8 + r3
            android.view.View r3 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.write((android.view.ViewGroup) r10, (float) r5, (float) r8)
            if (r3 == 0) goto L_0x027f
            androidx.recyclerview.widget.RecyclerView$setContentView r3 = r10.MediaBrowserCompat$MediaItem((android.view.View) r3)
            goto L_0x0280
        L_0x027f:
            r3 = 0
        L_0x0280:
            if (r9 != r3) goto L_0x01c2
            r3 = r9
            goto L_0x01c5
        L_0x0285:
            androidx.recyclerview.widget.RecyclerView$setContentView r3 = r2.read
            if (r8 != r3) goto L_0x028a
            r8 = 0
        L_0x028a:
            if (r8 != 0) goto L_0x028f
            r3 = r6
            r10 = 0
            goto L_0x02a6
        L_0x028f:
            androidx.recyclerview.widget.RecyclerView r3 = r0.setShortcut
            androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer r3 = r3.MediaDescriptionCompat
            o.addReference r4 = r0.ExpandedMenuView
            java.lang.Object r5 = r0.setContentHeight
            androidx.recyclerview.widget.RecyclerView r9 = r8.MediaMetadataCompat
            if (r9 != 0) goto L_0x029d
            r9 = r6
            goto L_0x02a1
        L_0x029d:
            int r9 = r9.MediaBrowserCompat$CustomActionResultReceiver((androidx.recyclerview.widget.RecyclerView.setContentView) r8)
        L_0x02a1:
            r10 = 0
            int r3 = p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer) r3, (androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer) r4, (java.lang.Object) r5, (int) r9, (p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment) r10)
        L_0x02a6:
            if (r8 == 0) goto L_0x02be
            o.ScriptIntrinsic r4 = r2.f2557x50fd9e4a
            if (r4 == 0) goto L_0x02be
            o.ScriptIntrinsic r2 = r2.f2557x50fd9e4a
            int r4 = r2.MediaBrowserCompat$ItemReceiver
            if (r3 < r4) goto L_0x02b9
            int r2 = r2.MediaBrowserCompat$CustomActionResultReceiver
            if (r3 > r2) goto L_0x02b9
            r16 = r7
            goto L_0x02bb
        L_0x02b9:
            r16 = 0
        L_0x02bb:
            if (r16 != 0) goto L_0x02be
            r8 = r10
        L_0x02be:
            r1.write = r8
            if (r8 == 0) goto L_0x02c4
            r4 = r3
            goto L_0x02c5
        L_0x02c4:
            r4 = r6
        L_0x02c5:
            r1.MediaBrowserCompat$ItemReceiver = r4
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ScriptIntrinsic3DLUT.read(o.ScriptIntrinsic3DLUT$read, o.ScriptIntrinsic3DLUT$write, boolean):o.ScriptIntrinsic3DLUT$read");
    }

    private void read(boolean z) {
        if (this.MediaSessionCompat$QueueItem != null && !this.ParcelableVolumeInfo.hasMessages(2)) {
            C1277x72464c4d scriptIntrinsic3DLUT$MediaBrowserCompat$CustomActionResultReceiver = this.ParcelableVolumeInfo;
            if (scriptIntrinsic3DLUT$MediaBrowserCompat$CustomActionResultReceiver != null) {
                scriptIntrinsic3DLUT$MediaBrowserCompat$CustomActionResultReceiver.removeMessages(2);
                this.ParcelableVolumeInfo.removeMessages(3);
            }
            RecyclerView recyclerView = this.setShortcut;
            if (!(recyclerView == null || this.MediaSessionCompat$ResultReceiverWrapper == null)) {
                recyclerView.setOverScrollMode(this.setCustomView);
            }
            getKernelID getkernelid = this.MediaBrowserCompat$SearchResultReceiver;
            if (getkernelid != null) {
                getkernelid.IconCompatParcelizer = this.ActionBarContextView;
                this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = this.setTransitioning;
                this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
            }
            validateGEMV validategemv = this.setIcon;
            if (validategemv != null) {
                validategemv.IconCompatParcelizer = this.ActionBarContextView;
                this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = this.setTransitioning;
                this.setIcon.write();
            }
            getFieldID getfieldid = this.MediaSessionCompat$Token;
            if (getfieldid != null) {
                getfieldid.write();
            }
            ScriptIntrinsic3DLUT$MediaBrowserCompat$ItemReceiver scriptIntrinsic3DLUT$MediaBrowserCompat$ItemReceiver = this.setPopupCallback;
            if (scriptIntrinsic3DLUT$MediaBrowserCompat$ItemReceiver != null && scriptIntrinsic3DLUT$MediaBrowserCompat$ItemReceiver.write) {
                scriptIntrinsic3DLUT$MediaBrowserCompat$ItemReceiver.write = false;
            }
            RecyclerView recyclerView2 = this.setShortcut;
            if (!(recyclerView2 == null || recyclerView2.getParent() == null)) {
                this.setShortcut.getParent().requestDisallowInterceptTouchEvent(false);
            }
            RecyclerView recyclerView3 = this.setShortcut;
            if (recyclerView3 != null) {
                recyclerView3.invalidate();
            }
            this.setSubtitle = null;
            this.setHasNonEmbeddedTabs = null;
            this.MediaBrowserCompat$SearchResultReceiver = null;
            this.setIcon = null;
            this.MediaSessionCompat$ResultReceiverWrapper = null;
            this.MediaSessionCompat$QueueItem = null;
            this.setContentHeight = null;
            this.setChecked = null;
            this.AppCompatDialogFragment = 0;
            this.setExpandedFormat = 0;
            this.ActionMenuItemView = 0;
            this.AppCompatViewInflater = 0;
            this.setPrimaryBackground = 0;
            this.setStackedBackground = 0;
            this.MenuItemWrapperICS$CollapsibleActionViewWrapper = 0;
            this.setTabContainer = 0;
            this.AbsActionBarView = 0;
            this.setVisibility = 0;
            this.setSplitBackground = 0;
            this.ActionBarContainer = 0;
            this.MediaBrowserCompat$ItemReceiver = false;
            this.MediaBrowserCompat$CustomActionResultReceiver = false;
            addReference addreference = this.ExpandedMenuView;
            if (addreference != null) {
                int i = addreference.MediaBrowserCompat$MediaItem;
                int i2 = this.ExpandedMenuView.MediaBrowserCompat$SearchResultReceiver;
                addReference addreference2 = this.ExpandedMenuView;
                ScriptGroup.C1272IO io = addreference2.MediaBrowserCompat$ItemReceiver;
                addreference2.MediaBrowserCompat$MediaItem = -1;
                addreference2.MediaBrowserCompat$SearchResultReceiver = -1;
                addreference2.MediaDescriptionCompat = null;
                addreference2.RatingCompat = null;
                addreference2.MediaMetadataCompat = null;
                addreference2.MediaBrowserCompat$ItemReceiver = null;
                if (z && i2 != i) {
                    io.write(i, i2);
                }
                io.read(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean MediaBrowserCompat$ItemReceiver(int i, boolean z) {
        boolean z2 = true;
        boolean z3 = i == 1;
        boolean z4 = this.MediaSessionCompat$QueueItem != null && !this.ParcelableVolumeInfo.hasMessages(2);
        C1277x72464c4d scriptIntrinsic3DLUT$MediaBrowserCompat$CustomActionResultReceiver = this.ParcelableVolumeInfo;
        if (scriptIntrinsic3DLUT$MediaBrowserCompat$CustomActionResultReceiver != null) {
            scriptIntrinsic3DLUT$MediaBrowserCompat$CustomActionResultReceiver.removeMessages(1);
            MotionEvent motionEvent = scriptIntrinsic3DLUT$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            if (motionEvent != null) {
                motionEvent.recycle();
                scriptIntrinsic3DLUT$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = null;
            }
        }
        this.PlaybackStateCompat$CustomAction = 0;
        this.Keep = 0;
        this.AppCompatDialogFragment = 0;
        this.setExpandedFormat = 0;
        this.setPrimaryBackground = 0;
        this.setStackedBackground = 0;
        this.MenuItemWrapperICS$CollapsibleActionViewWrapper = 0;
        this.setTabContainer = 0;
        this.AbsActionBarView = 0;
        this.setVisibility = 0;
        this.setSplitBackground = 0;
        this.ActionBarContainer = 0;
        this.setHasDecor = -1;
        this.MediaBrowserCompat$ItemReceiver = false;
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
        if (z) {
            if (this.MediaSessionCompat$QueueItem == null || this.ParcelableVolumeInfo.hasMessages(2)) {
                z2 = false;
            }
            if (z2) {
                read(z3);
            }
        }
        return z4;
    }
}

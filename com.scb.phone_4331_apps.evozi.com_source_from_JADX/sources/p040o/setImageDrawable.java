package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import p040o.setExpandActivityOverflowButtonContentDescription;
import p040o.setImageResource;
import p040o.setSupportImageTintList;

/* renamed from: o.setImageDrawable */
public final class setImageDrawable extends drawableStateChanged {
    public setExpandActivityOverflowButtonContentDescription.C14854[] ActionBarOverlayLayout = new setExpandActivityOverflowButtonContentDescription.C14854[4];
    public int ActionMenuPresenter$OverflowMenuButton = 0;
    public int ActionMenuView = 0;
    public boolean IconCompatParcelizer = false;
    public int setActionBarVisibilityCallback = 0;
    public boolean setLogo = false;
    public setExpandActivityOverflowButtonContentDescription.C14854[] setMenu = new setExpandActivityOverflowButtonContentDescription.C14854[4];
    private AppCompatCheckedTextView setMenuCallbacks = new AppCompatCheckedTextView();
    public int setMenuPrepared = 7;
    public int setOnMenuItemClickListener = 0;
    private getSupportBackgroundTintList setOverflowIcon;
    public boolean setOverlayMode = false;
    public boolean setShowingForActionMode = false;
    public boolean setUiOptions = false;
    public boolean setWindowCallback = false;
    public List<setExpandActivityOverflowButtonContentDescription.C14841> setWindowTitle = new ArrayList();
    public boolean write = false;

    public final void MediaBrowserCompat$MediaItem() {
        this.setMenuCallbacks.read();
        this.setWindowTitle.clear();
        this.setOverlayMode = false;
        super.MediaBrowserCompat$MediaItem();
    }

    private void read(AppCompatCheckedTextView appCompatCheckedTextView, boolean[] zArr) {
        int i;
        int i2;
        zArr[2] = false;
        MediaSessionCompat$Token();
        int size = this.setExpandedActionViewsExclusive.size();
        for (int i3 = 0; i3 < size; i3++) {
            setImageResource setimageresource = this.setExpandedActionViewsExclusive.get(i3);
            setimageresource.MediaSessionCompat$Token();
            if (setimageresource.AppCompatDelegateImpl$ListMenuDecorView[0] == setImageResource.read.MATCH_CONSTRAINT) {
                if (setimageresource.setTitleOptional == 8) {
                    i2 = 0;
                } else {
                    i2 = setimageresource.ActionBarContextView;
                }
                if (i2 < setimageresource.setHideOnContentScrollEnabled) {
                    zArr[2] = true;
                }
            }
            if (setimageresource.AppCompatDelegateImpl$ListMenuDecorView[1] == setImageResource.read.MATCH_CONSTRAINT) {
                if (setimageresource.setTitleOptional == 8) {
                    i = 0;
                } else {
                    i = setimageresource.PlaybackStateCompat;
                }
                if (i < setimageresource.setTransitioning) {
                    zArr[2] = true;
                }
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        super.MediaBrowserCompat$ItemReceiver(i);
        int size = this.setExpandedActionViewsExclusive.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.setExpandedActionViewsExclusive.get(i2).MediaBrowserCompat$ItemReceiver(i);
        }
    }

    /* JADX WARNING: type inference failed for: r2v19, types: [boolean] */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: type inference failed for: r2v23 */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0419  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0473  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0475  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0479 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0490 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0490 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaSessionCompat$QueueItem() {
        /*
            r24 = this;
            r1 = r24
            int r2 = r1.setHasNonEmbeddedTabs
            int r3 = r1.setActionBarHideOffset
            int r0 = r1.setTitleOptional
            r4 = 8
            r5 = 0
            if (r0 != r4) goto L_0x000f
            r0 = r5
            goto L_0x0011
        L_0x000f:
            int r0 = r1.ActionBarContextView
        L_0x0011:
            int r6 = java.lang.Math.max(r5, r0)
            int r0 = r1.setTitleOptional
            if (r0 != r4) goto L_0x001b
            r0 = r5
            goto L_0x001d
        L_0x001b:
            int r0 = r1.PlaybackStateCompat
        L_0x001d:
            int r7 = java.lang.Math.max(r5, r0)
            r1.setUiOptions = r5
            r1.IconCompatParcelizer = r5
            o.setImageResource r0 = r1.AbsActionBarView
            if (r0 == 0) goto L_0x00a5
            o.getSupportBackgroundTintList r0 = r1.setOverflowIcon
            if (r0 != 0) goto L_0x0034
            o.getSupportBackgroundTintList r0 = new o.getSupportBackgroundTintList
            r0.<init>(r1)
            r1.setOverflowIcon = r0
        L_0x0034:
            o.getSupportBackgroundTintList r0 = r1.setOverflowIcon
            int r8 = r1.setHasNonEmbeddedTabs
            r0.read = r8
            int r8 = r1.setActionBarHideOffset
            r0.write = r8
            int r8 = r1.setTitleOptional
            if (r8 != r4) goto L_0x0044
            r8 = r5
            goto L_0x0046
        L_0x0044:
            int r8 = r1.ActionBarContextView
        L_0x0046:
            r0.MediaBrowserCompat$CustomActionResultReceiver = r8
            int r8 = r1.setTitleOptional
            if (r8 != r4) goto L_0x004e
            r8 = r5
            goto L_0x0050
        L_0x004e:
            int r8 = r1.PlaybackStateCompat
        L_0x0050:
            r0.IconCompatParcelizer = r8
            java.util.ArrayList<o.getSupportBackgroundTintList$MediaBrowserCompat$ItemReceiver> r8 = r0.MediaBrowserCompat$ItemReceiver
            int r8 = r8.size()
            r9 = r5
        L_0x0059:
            if (r9 >= r8) goto L_0x0096
            java.util.ArrayList<o.getSupportBackgroundTintList$MediaBrowserCompat$ItemReceiver> r10 = r0.MediaBrowserCompat$ItemReceiver
            java.lang.Object r10 = r10.get(r9)
            o.getSupportBackgroundTintList$MediaBrowserCompat$ItemReceiver r10 = (p040o.getSupportBackgroundTintList$MediaBrowserCompat$ItemReceiver) r10
            o.setSupportImageTintList r11 = r10.MediaBrowserCompat$ItemReceiver
            o.setSupportImageTintList$read r11 = r11.MediaBrowserCompat$SearchResultReceiver
            o.setSupportImageTintList r11 = r1.write((p040o.setSupportImageTintList.read) r11)
            r10.MediaBrowserCompat$ItemReceiver = r11
            if (r11 == 0) goto L_0x0088
            o.setSupportImageTintList r11 = r11.RatingCompat
            r10.MediaBrowserCompat$CustomActionResultReceiver = r11
            o.setSupportImageTintList r11 = r10.MediaBrowserCompat$ItemReceiver
            int r11 = r11.read()
            r10.IconCompatParcelizer = r11
            o.setSupportImageTintList r11 = r10.MediaBrowserCompat$ItemReceiver
            o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver r11 = r11.MediaMetadataCompat
            r10.write = r11
            o.setSupportImageTintList r11 = r10.MediaBrowserCompat$ItemReceiver
            int r11 = r11.read
            r10.read = r11
            goto L_0x0093
        L_0x0088:
            r11 = 0
            r10.MediaBrowserCompat$CustomActionResultReceiver = r11
            r10.IconCompatParcelizer = r5
            o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver r11 = p040o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver.STRONG
            r10.write = r11
            r10.read = r5
        L_0x0093:
            int r9 = r9 + 1
            goto L_0x0059
        L_0x0096:
            r1.setHasNonEmbeddedTabs = r5
            r1.setActionBarHideOffset = r5
            r24.mo20004x50fd9e4a()
            o.AppCompatCheckedTextView r0 = r1.setMenuCallbacks
            o.AppCompatAutoCompleteTextView r0 = r0.write
            r1.read((p040o.AppCompatAutoCompleteTextView) r0)
            goto L_0x00a9
        L_0x00a5:
            r1.setHasNonEmbeddedTabs = r5
            r1.setActionBarHideOffset = r5
        L_0x00a9:
            int r0 = r1.setMenuPrepared
            r8 = 32
            r9 = 1
            if (r0 == 0) goto L_0x00dc
            r0 = r0 & r4
            if (r0 != r4) goto L_0x00b5
            r0 = r9
            goto L_0x00b6
        L_0x00b5:
            r0 = r5
        L_0x00b6:
            if (r0 != 0) goto L_0x00bb
            r24.PlaybackStateCompat$CustomAction()
        L_0x00bb:
            int r0 = r1.setMenuPrepared
            r0 = r0 & r8
            if (r0 != r8) goto L_0x00c2
            r0 = r9
            goto L_0x00c3
        L_0x00c2:
            r0 = r5
        L_0x00c3:
            if (r0 != 0) goto L_0x00d7
            int r0 = r1.setMenuPrepared
            r0 = r0 & r4
            if (r0 != r4) goto L_0x00cc
            r0 = r9
            goto L_0x00cd
        L_0x00cc:
            r0 = r5
        L_0x00cd:
            if (r0 != 0) goto L_0x00d4
            int r0 = r1.setMenuPrepared
            r1.MediaBrowserCompat$ItemReceiver((int) r0)
        L_0x00d4:
            r24.setHasDecor()
        L_0x00d7:
            o.AppCompatCheckedTextView r0 = r1.setMenuCallbacks
            r0.IconCompatParcelizer = r9
            goto L_0x00e0
        L_0x00dc:
            o.AppCompatCheckedTextView r0 = r1.setMenuCallbacks
            r0.IconCompatParcelizer = r5
        L_0x00e0:
            o.setImageResource$read[] r0 = r1.AppCompatDelegateImpl$ListMenuDecorView
            r10 = r0[r9]
            o.setImageResource$read[] r0 = r1.AppCompatDelegateImpl$ListMenuDecorView
            r11 = r0[r5]
            r1.setActionBarVisibilityCallback = r5
            r1.ActionMenuView = r5
            java.util.List<o.setExpandActivityOverflowButtonContentDescription$1> r0 = r1.setWindowTitle
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0105
            java.util.List<o.setExpandActivityOverflowButtonContentDescription$1> r0 = r1.setWindowTitle
            r0.clear()
            java.util.List<o.setExpandActivityOverflowButtonContentDescription$1> r0 = r1.setWindowTitle
            o.setExpandActivityOverflowButtonContentDescription$1 r12 = new o.setExpandActivityOverflowButtonContentDescription$1
            java.util.ArrayList<o.setImageResource> r13 = r1.setExpandedActionViewsExclusive
            r12.<init>(r13, r5)
            r0.add(r5, r12)
        L_0x0105:
            java.util.List<o.setExpandActivityOverflowButtonContentDescription$1> r0 = r1.setWindowTitle
            int r12 = r0.size()
            java.util.ArrayList<o.setImageResource> r13 = r1.setExpandedActionViewsExclusive
            o.setImageResource$read[] r0 = r1.AppCompatDelegateImpl$ListMenuDecorView
            r0 = r0[r5]
            o.setImageResource$read r14 = p040o.setImageResource.read.WRAP_CONTENT
            if (r0 == r14) goto L_0x011f
            o.setImageResource$read[] r0 = r1.AppCompatDelegateImpl$ListMenuDecorView
            r0 = r0[r9]
            o.setImageResource$read r14 = p040o.setImageResource.read.WRAP_CONTENT
            if (r0 == r14) goto L_0x011f
            r14 = r5
            goto L_0x0120
        L_0x011f:
            r14 = r9
        L_0x0120:
            r0 = r5
            r15 = r0
        L_0x0122:
            if (r15 >= r12) goto L_0x04ca
            boolean r4 = r1.setOverlayMode
            if (r4 != 0) goto L_0x04ca
            java.util.List<o.setExpandActivityOverflowButtonContentDescription$1> r4 = r1.setWindowTitle
            java.lang.Object r4 = r4.get(r15)
            o.setExpandActivityOverflowButtonContentDescription$1 r4 = (p040o.setExpandActivityOverflowButtonContentDescription.C14841) r4
            boolean r4 = r4.MediaBrowserCompat$ItemReceiver
            if (r4 != 0) goto L_0x04b4
            int r4 = r1.setMenuPrepared
            r4 = r4 & r8
            if (r4 != r8) goto L_0x013b
            r4 = r9
            goto L_0x013c
        L_0x013b:
            r4 = r5
        L_0x013c:
            if (r4 == 0) goto L_0x01af
            o.setImageResource$read[] r4 = r1.AppCompatDelegateImpl$ListMenuDecorView
            r4 = r4[r5]
            o.setImageResource$read r8 = p040o.setImageResource.read.FIXED
            if (r4 != r8) goto L_0x019f
            o.setImageResource$read[] r4 = r1.AppCompatDelegateImpl$ListMenuDecorView
            r4 = r4[r9]
            o.setImageResource$read r8 = p040o.setImageResource.read.FIXED
            if (r4 != r8) goto L_0x019f
            java.util.List<o.setExpandActivityOverflowButtonContentDescription$1> r4 = r1.setWindowTitle
            java.lang.Object r4 = r4.get(r15)
            o.setExpandActivityOverflowButtonContentDescription$1 r4 = (p040o.setExpandActivityOverflowButtonContentDescription.C14841) r4
            java.util.List<o.setImageResource> r8 = r4.MediaBrowserCompat$MediaItem
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0161
            java.util.List<o.setImageResource> r4 = r4.MediaBrowserCompat$MediaItem
            goto L_0x019a
        L_0x0161:
            java.util.List<o.setImageResource> r8 = r4.write
            int r8 = r8.size()
            r9 = r5
        L_0x0168:
            if (r9 >= r8) goto L_0x0185
            java.util.List<o.setImageResource> r5 = r4.write
            java.lang.Object r5 = r5.get(r9)
            o.setImageResource r5 = (p040o.setImageResource) r5
            r18 = r8
            boolean r8 = r5.setGroupDividerEnabled
            if (r8 != 0) goto L_0x017f
            java.util.List<o.setImageResource> r8 = r4.MediaBrowserCompat$MediaItem
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r4.IconCompatParcelizer(r8, r5)
        L_0x017f:
            int r9 = r9 + 1
            r8 = r18
            r5 = 0
            goto L_0x0168
        L_0x0185:
            java.util.List<o.setImageResource> r5 = r4.RatingCompat
            r5.clear()
            java.util.List<o.setImageResource> r5 = r4.RatingCompat
            java.util.List<o.setImageResource> r8 = r4.write
            r5.addAll(r8)
            java.util.List<o.setImageResource> r5 = r4.RatingCompat
            java.util.List<o.setImageResource> r8 = r4.MediaBrowserCompat$MediaItem
            r5.removeAll(r8)
            java.util.List<o.setImageResource> r4 = r4.MediaBrowserCompat$MediaItem
        L_0x019a:
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r1.setExpandedActionViewsExclusive = r4
            goto L_0x01ad
        L_0x019f:
            java.util.List<o.setExpandActivityOverflowButtonContentDescription$1> r4 = r1.setWindowTitle
            java.lang.Object r4 = r4.get(r15)
            o.setExpandActivityOverflowButtonContentDescription$1 r4 = (p040o.setExpandActivityOverflowButtonContentDescription.C14841) r4
            java.util.List<o.setImageResource> r4 = r4.write
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r1.setExpandedActionViewsExclusive = r4
        L_0x01ad:
            r4 = 0
            goto L_0x01b0
        L_0x01af:
            r4 = r5
        L_0x01b0:
            r1.setActionBarVisibilityCallback = r4
            r1.ActionMenuView = r4
            java.util.ArrayList<o.setImageResource> r4 = r1.setExpandedActionViewsExclusive
            int r4 = r4.size()
            r5 = 0
        L_0x01bb:
            if (r5 >= r4) goto L_0x01d1
            java.util.ArrayList<o.setImageResource> r8 = r1.setExpandedActionViewsExclusive
            java.lang.Object r8 = r8.get(r5)
            o.setImageResource r8 = (p040o.setImageResource) r8
            boolean r9 = r8 instanceof p040o.drawableStateChanged
            if (r9 == 0) goto L_0x01ce
            o.drawableStateChanged r8 = (p040o.drawableStateChanged) r8
            r8.MediaSessionCompat$QueueItem()
        L_0x01ce:
            int r5 = r5 + 1
            goto L_0x01bb
        L_0x01d1:
            r5 = r0
            r0 = 0
        L_0x01d3:
            r8 = 1
        L_0x01d4:
            if (r8 == 0) goto L_0x049e
            r18 = r5
            r9 = 1
            int r5 = r0 + 1
            o.AppCompatCheckedTextView r0 = r1.setMenuCallbacks     // Catch:{ Exception -> 0x02e4 }
            r0.read()     // Catch:{ Exception -> 0x02e4 }
            r9 = 0
            r1.setActionBarVisibilityCallback = r9     // Catch:{ Exception -> 0x02e4 }
            r1.ActionMenuView = r9     // Catch:{ Exception -> 0x02e4 }
            o.AppCompatCheckedTextView r0 = r1.setMenuCallbacks     // Catch:{ Exception -> 0x02e4 }
            r1.IconCompatParcelizer((p040o.AppCompatCheckedTextView) r0)     // Catch:{ Exception -> 0x02e4 }
            r0 = 0
        L_0x01eb:
            if (r0 >= r4) goto L_0x0206
            java.util.ArrayList<o.setImageResource> r9 = r1.setExpandedActionViewsExclusive     // Catch:{ Exception -> 0x0201 }
            java.lang.Object r9 = r9.get(r0)     // Catch:{ Exception -> 0x0201 }
            o.setImageResource r9 = (p040o.setImageResource) r9     // Catch:{ Exception -> 0x0201 }
            r19 = r8
            o.AppCompatCheckedTextView r8 = r1.setMenuCallbacks     // Catch:{ Exception -> 0x02dc }
            r9.IconCompatParcelizer((p040o.AppCompatCheckedTextView) r8)     // Catch:{ Exception -> 0x02dc }
            int r0 = r0 + 1
            r8 = r19
            goto L_0x01eb
        L_0x0201:
            r0 = move-exception
            r19 = r8
            goto L_0x02dd
        L_0x0206:
            r19 = r8
            o.AppCompatCheckedTextView r0 = r1.setMenuCallbacks     // Catch:{ Exception -> 0x02dc }
            r1.MediaBrowserCompat$ItemReceiver((p040o.AppCompatCheckedTextView) r0)     // Catch:{ Exception -> 0x02dc }
            java.util.ArrayList<o.setImageResource> r8 = r1.setExpandedActionViewsExclusive     // Catch:{ Exception -> 0x02dc }
            int r8 = r8.size()     // Catch:{ Exception -> 0x02dc }
            r9 = 0
        L_0x0214:
            if (r9 >= r8) goto L_0x027b
            r20 = r8
            java.util.ArrayList<o.setImageResource> r8 = r1.setExpandedActionViewsExclusive     // Catch:{ Exception -> 0x02dc }
            java.lang.Object r8 = r8.get(r9)     // Catch:{ Exception -> 0x02dc }
            o.setImageResource r8 = (p040o.setImageResource) r8     // Catch:{ Exception -> 0x02dc }
            r21 = r12
            boolean r12 = r8 instanceof p040o.setImageDrawable     // Catch:{ Exception -> 0x0274 }
            if (r12 == 0) goto L_0x025f
            o.setImageResource$read[] r12 = r8.AppCompatDelegateImpl$ListMenuDecorView     // Catch:{ Exception -> 0x0274 }
            r17 = 0
            r12 = r12[r17]     // Catch:{ Exception -> 0x0274 }
            r22 = r3
            o.setImageResource$read[] r3 = r8.AppCompatDelegateImpl$ListMenuDecorView     // Catch:{ Exception -> 0x025a }
            r16 = 1
            r3 = r3[r16]     // Catch:{ Exception -> 0x025a }
            r23 = r2
            o.setImageResource$read r2 = p040o.setImageResource.read.WRAP_CONTENT     // Catch:{ Exception -> 0x02da }
            if (r12 != r2) goto L_0x023f
            o.setImageResource$read r2 = p040o.setImageResource.read.FIXED     // Catch:{ Exception -> 0x02da }
            r8.IconCompatParcelizer((p040o.setImageResource.read) r2)     // Catch:{ Exception -> 0x02da }
        L_0x023f:
            o.setImageResource$read r2 = p040o.setImageResource.read.WRAP_CONTENT     // Catch:{ Exception -> 0x02da }
            if (r3 != r2) goto L_0x0248
            o.setImageResource$read r2 = p040o.setImageResource.read.FIXED     // Catch:{ Exception -> 0x02da }
            r8.MediaBrowserCompat$ItemReceiver((p040o.setImageResource.read) r2)     // Catch:{ Exception -> 0x02da }
        L_0x0248:
            r8.MediaBrowserCompat$ItemReceiver((p040o.AppCompatCheckedTextView) r0)     // Catch:{ Exception -> 0x02da }
            o.setImageResource$read r2 = p040o.setImageResource.read.WRAP_CONTENT     // Catch:{ Exception -> 0x02da }
            if (r12 != r2) goto L_0x0252
            r8.IconCompatParcelizer((p040o.setImageResource.read) r12)     // Catch:{ Exception -> 0x02da }
        L_0x0252:
            o.setImageResource$read r2 = p040o.setImageResource.read.WRAP_CONTENT     // Catch:{ Exception -> 0x02da }
            if (r3 != r2) goto L_0x0269
            r8.MediaBrowserCompat$ItemReceiver((p040o.setImageResource.read) r3)     // Catch:{ Exception -> 0x02da }
            goto L_0x0269
        L_0x025a:
            r0 = move-exception
            r23 = r2
            goto L_0x02ec
        L_0x025f:
            r23 = r2
            r22 = r3
            p040o.getSupportBackgroundTintMode.IconCompatParcelizer(r1, r0, r8)     // Catch:{ Exception -> 0x02da }
            r8.MediaBrowserCompat$ItemReceiver((p040o.AppCompatCheckedTextView) r0)     // Catch:{ Exception -> 0x02da }
        L_0x0269:
            int r9 = r9 + 1
            r8 = r20
            r12 = r21
            r3 = r22
            r2 = r23
            goto L_0x0214
        L_0x0274:
            r0 = move-exception
            r23 = r2
            r22 = r3
            goto L_0x02ec
        L_0x027b:
            r23 = r2
            r22 = r3
            r21 = r12
            int r2 = r1.setActionBarVisibilityCallback     // Catch:{ Exception -> 0x02da }
            if (r2 <= 0) goto L_0x0289
            r2 = 0
            p040o.AlertController$RecycleListView.read.read((p040o.setImageDrawable) r1, (p040o.AppCompatCheckedTextView) r0, (int) r2)     // Catch:{ Exception -> 0x02da }
        L_0x0289:
            int r2 = r1.ActionMenuView     // Catch:{ Exception -> 0x02da }
            if (r2 <= 0) goto L_0x0291
            r2 = 1
            p040o.AlertController$RecycleListView.read.read((p040o.setImageDrawable) r1, (p040o.AppCompatCheckedTextView) r0, (int) r2)     // Catch:{ Exception -> 0x02da }
        L_0x0291:
            o.AppCompatCheckedTextView r0 = r1.setMenuCallbacks     // Catch:{ Exception -> 0x02d6 }
            boolean r2 = r0.IconCompatParcelizer     // Catch:{ Exception -> 0x02d6 }
            if (r2 == 0) goto L_0x02c2
            r2 = 0
        L_0x0298:
            int r3 = r0.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x02d6 }
            if (r2 >= r3) goto L_0x02a9
            o.setTextSize[] r3 = r0.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x02d6 }
            r3 = r3[r2]     // Catch:{ Exception -> 0x02d6 }
            boolean r3 = r3.read     // Catch:{ Exception -> 0x02d6 }
            if (r3 != 0) goto L_0x02a6
            r2 = 0
            goto L_0x02aa
        L_0x02a6:
            int r2 = r2 + 1
            goto L_0x0298
        L_0x02a9:
            r2 = 1
        L_0x02aa:
            if (r2 != 0) goto L_0x02be
            o.AppCompatCheckedTextView$write r2 = r0.read     // Catch:{ Exception -> 0x02d6 }
            r3 = r2
            o.setTextSize r3 = (p040o.setTextSize) r3     // Catch:{ Exception -> 0x02d6 }
            r0.IconCompatParcelizer(r3)     // Catch:{ Exception -> 0x02d6 }
            r0.write()     // Catch:{ Exception -> 0x02d6 }
            r0.MediaBrowserCompat$CustomActionResultReceiver((p040o.AppCompatCheckedTextView.write) r2)     // Catch:{ Exception -> 0x02d6 }
            r0.MediaBrowserCompat$ItemReceiver()     // Catch:{ Exception -> 0x02d6 }
            goto L_0x02d3
        L_0x02be:
            r0.MediaBrowserCompat$ItemReceiver()     // Catch:{ Exception -> 0x02d6 }
            goto L_0x02d3
        L_0x02c2:
            o.AppCompatCheckedTextView$write r2 = r0.read     // Catch:{ Exception -> 0x02d6 }
            r3 = r2
            o.setTextSize r3 = (p040o.setTextSize) r3     // Catch:{ Exception -> 0x02d6 }
            r0.IconCompatParcelizer(r3)     // Catch:{ Exception -> 0x02d6 }
            r0.write()     // Catch:{ Exception -> 0x02d6 }
            r0.MediaBrowserCompat$CustomActionResultReceiver((p040o.AppCompatCheckedTextView.write) r2)     // Catch:{ Exception -> 0x02d6 }
            r0.MediaBrowserCompat$ItemReceiver()     // Catch:{ Exception -> 0x02d6 }
        L_0x02d3:
            r19 = 1
            goto L_0x0305
        L_0x02d6:
            r0 = move-exception
            r19 = 1
            goto L_0x02ec
        L_0x02da:
            r0 = move-exception
            goto L_0x02ec
        L_0x02dc:
            r0 = move-exception
        L_0x02dd:
            r23 = r2
            r22 = r3
        L_0x02e1:
            r21 = r12
            goto L_0x02ec
        L_0x02e4:
            r0 = move-exception
            r23 = r2
            r22 = r3
            r19 = r8
            goto L_0x02e1
        L_0x02ec:
            r0.printStackTrace()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "EXCEPTION : "
            r3.append(r8)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.println(r0)
        L_0x0305:
            r0 = 2
            if (r19 == 0) goto L_0x0310
            o.AppCompatCheckedTextView r2 = r1.setMenuCallbacks
            boolean[] r3 = p040o.getSupportBackgroundTintMode.MediaBrowserCompat$CustomActionResultReceiver
            r1.read(r2, r3)
            goto L_0x035a
        L_0x0310:
            r24.MediaSessionCompat$Token()
            r2 = 0
        L_0x0314:
            if (r2 >= r4) goto L_0x035a
            java.util.ArrayList<o.setImageResource> r3 = r1.setExpandedActionViewsExclusive
            java.lang.Object r3 = r3.get(r2)
            o.setImageResource r3 = (p040o.setImageResource) r3
            o.setImageResource$read[] r8 = r3.AppCompatDelegateImpl$ListMenuDecorView
            r9 = 0
            r8 = r8[r9]
            o.setImageResource$read r9 = p040o.setImageResource.read.MATCH_CONSTRAINT
            if (r8 != r9) goto L_0x033b
            int r8 = r3.setTitleOptional
            r9 = 8
            if (r8 != r9) goto L_0x032f
            r8 = 0
            goto L_0x0331
        L_0x032f:
            int r8 = r3.ActionBarContextView
        L_0x0331:
            int r9 = r3.setHideOnContentScrollEnabled
            if (r8 >= r9) goto L_0x033b
            boolean[] r2 = p040o.getSupportBackgroundTintMode.MediaBrowserCompat$CustomActionResultReceiver
            r8 = 1
            r2[r0] = r8
            goto L_0x035a
        L_0x033b:
            r8 = 1
            o.setImageResource$read[] r9 = r3.AppCompatDelegateImpl$ListMenuDecorView
            r9 = r9[r8]
            o.setImageResource$read r12 = p040o.setImageResource.read.MATCH_CONSTRAINT
            if (r9 != r12) goto L_0x0357
            int r9 = r3.setTitleOptional
            r12 = 8
            if (r9 != r12) goto L_0x034c
            r9 = 0
            goto L_0x034e
        L_0x034c:
            int r9 = r3.PlaybackStateCompat
        L_0x034e:
            int r3 = r3.setTransitioning
            if (r9 >= r3) goto L_0x0357
            boolean[] r2 = p040o.getSupportBackgroundTintMode.MediaBrowserCompat$CustomActionResultReceiver
            r2[r0] = r8
            goto L_0x035a
        L_0x0357:
            int r2 = r2 + 1
            goto L_0x0314
        L_0x035a:
            if (r14 == 0) goto L_0x03e5
            r2 = 8
            if (r5 >= r2) goto L_0x03e5
            boolean[] r3 = p040o.getSupportBackgroundTintMode.MediaBrowserCompat$CustomActionResultReceiver
            boolean r0 = r3[r0]
            if (r0 == 0) goto L_0x03e5
            r0 = 0
            r3 = 0
            r8 = 0
        L_0x0369:
            if (r0 >= r4) goto L_0x039a
            java.util.ArrayList<o.setImageResource> r9 = r1.setExpandedActionViewsExclusive
            java.lang.Object r9 = r9.get(r0)
            o.setImageResource r9 = (p040o.setImageResource) r9
            int r12 = r9.setHasNonEmbeddedTabs
            r19 = r4
            int r4 = r9.setTitleOptional
            if (r4 != r2) goto L_0x037d
            r4 = 0
            goto L_0x037f
        L_0x037d:
            int r4 = r9.ActionBarContextView
        L_0x037f:
            int r12 = r12 + r4
            int r3 = java.lang.Math.max(r3, r12)
            int r4 = r9.setActionBarHideOffset
            int r12 = r9.setTitleOptional
            if (r12 != r2) goto L_0x038c
            r2 = 0
            goto L_0x038e
        L_0x038c:
            int r2 = r9.PlaybackStateCompat
        L_0x038e:
            int r4 = r4 + r2
            int r8 = java.lang.Math.max(r8, r4)
            int r0 = r0 + 1
            r4 = r19
            r2 = 8
            goto L_0x0369
        L_0x039a:
            r19 = r4
            int r0 = r1.setPopupCallback
            int r0 = java.lang.Math.max(r0, r3)
            int r2 = r1.setItemInvoker
            int r2 = java.lang.Math.max(r2, r8)
            o.setImageResource$read r3 = p040o.setImageResource.read.WRAP_CONTENT
            if (r11 != r3) goto L_0x03c6
            int r3 = r1.setTitleOptional
            r4 = 8
            if (r3 != r4) goto L_0x03b4
            r3 = 0
            goto L_0x03b6
        L_0x03b4:
            int r3 = r1.ActionBarContextView
        L_0x03b6:
            if (r3 >= r0) goto L_0x03c6
            r1.IconCompatParcelizer((int) r0)
            o.setImageResource$read[] r0 = r1.AppCompatDelegateImpl$ListMenuDecorView
            o.setImageResource$read r3 = p040o.setImageResource.read.WRAP_CONTENT
            r4 = 0
            r0[r4] = r3
            r0 = 1
            r18 = 1
            goto L_0x03c7
        L_0x03c6:
            r0 = 0
        L_0x03c7:
            o.setImageResource$read r3 = p040o.setImageResource.read.WRAP_CONTENT
            if (r10 != r3) goto L_0x03e8
            int r3 = r1.setTitleOptional
            r4 = 8
            if (r3 != r4) goto L_0x03d3
            r3 = 0
            goto L_0x03d5
        L_0x03d3:
            int r3 = r1.PlaybackStateCompat
        L_0x03d5:
            if (r3 >= r2) goto L_0x03e8
            r1.MediaBrowserCompat$CustomActionResultReceiver((int) r2)
            o.setImageResource$read[] r0 = r1.AppCompatDelegateImpl$ListMenuDecorView
            o.setImageResource$read r2 = p040o.setImageResource.read.WRAP_CONTENT
            r3 = 1
            r0[r3] = r2
            r0 = 1
            r18 = 1
            goto L_0x03e8
        L_0x03e5:
            r19 = r4
            r0 = 0
        L_0x03e8:
            int r2 = r1.setPopupCallback
            int r3 = r1.setTitleOptional
            r4 = 8
            if (r3 != r4) goto L_0x03f2
            r3 = 0
            goto L_0x03f4
        L_0x03f2:
            int r3 = r1.ActionBarContextView
        L_0x03f4:
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r1.setTitleOptional
            if (r3 != r4) goto L_0x03fe
            r3 = 0
            goto L_0x0400
        L_0x03fe:
            int r3 = r1.ActionBarContextView
        L_0x0400:
            if (r2 <= r3) goto L_0x040f
            r1.IconCompatParcelizer((int) r2)
            o.setImageResource$read[] r0 = r1.AppCompatDelegateImpl$ListMenuDecorView
            o.setImageResource$read r2 = p040o.setImageResource.read.FIXED
            r3 = 0
            r0[r3] = r2
            r0 = 1
            r18 = 1
        L_0x040f:
            int r2 = r1.setItemInvoker
            int r3 = r1.setTitleOptional
            r4 = 8
            if (r3 != r4) goto L_0x0419
            r3 = 0
            goto L_0x041b
        L_0x0419:
            int r3 = r1.PlaybackStateCompat
        L_0x041b:
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r1.setTitleOptional
            if (r3 != r4) goto L_0x0425
            r3 = 0
            goto L_0x0427
        L_0x0425:
            int r3 = r1.PlaybackStateCompat
        L_0x0427:
            if (r2 <= r3) goto L_0x0437
            r1.MediaBrowserCompat$CustomActionResultReceiver((int) r2)
            o.setImageResource$read[] r0 = r1.AppCompatDelegateImpl$ListMenuDecorView
            o.setImageResource$read r2 = p040o.setImageResource.read.FIXED
            r3 = 1
            r0[r3] = r2
            r9 = 1
            r18 = 1
            goto L_0x0438
        L_0x0437:
            r9 = r0
        L_0x0438:
            if (r18 != 0) goto L_0x0490
            o.setImageResource$read[] r0 = r1.AppCompatDelegateImpl$ListMenuDecorView
            r2 = 0
            r0 = r0[r2]
            o.setImageResource$read r2 = p040o.setImageResource.read.WRAP_CONTENT
            if (r0 != r2) goto L_0x0462
            if (r6 <= 0) goto L_0x0462
            int r0 = r1.setTitleOptional
            r2 = 8
            if (r0 != r2) goto L_0x044d
            r0 = 0
            goto L_0x044f
        L_0x044d:
            int r0 = r1.ActionBarContextView
        L_0x044f:
            if (r0 <= r6) goto L_0x0462
            r2 = 1
            r1.setUiOptions = r2
            o.setImageResource$read[] r0 = r1.AppCompatDelegateImpl$ListMenuDecorView
            o.setImageResource$read r3 = p040o.setImageResource.read.FIXED
            r4 = 0
            r0[r4] = r3
            r1.IconCompatParcelizer((int) r6)
            r9 = r2
            r18 = r9
            goto L_0x0463
        L_0x0462:
            r2 = 1
        L_0x0463:
            o.setImageResource$read[] r0 = r1.AppCompatDelegateImpl$ListMenuDecorView
            r0 = r0[r2]
            o.setImageResource$read r3 = p040o.setImageResource.read.WRAP_CONTENT
            if (r0 != r3) goto L_0x0490
            if (r7 <= 0) goto L_0x0490
            int r0 = r1.setTitleOptional
            r3 = 8
            if (r0 != r3) goto L_0x0475
            r4 = 0
            goto L_0x0477
        L_0x0475:
            int r4 = r1.PlaybackStateCompat
        L_0x0477:
            if (r4 <= r7) goto L_0x0490
            r1.IconCompatParcelizer = r2
            o.setImageResource$read[] r0 = r1.AppCompatDelegateImpl$ListMenuDecorView
            o.setImageResource$read r3 = p040o.setImageResource.read.FIXED
            r0[r2] = r3
            r1.MediaBrowserCompat$CustomActionResultReceiver((int) r7)
            r0 = r5
            r4 = r19
            r12 = r21
            r3 = r22
            r2 = r23
            r5 = 1
            goto L_0x01d3
        L_0x0490:
            r8 = r9
            r0 = r5
            r5 = r18
            r4 = r19
            r12 = r21
            r3 = r22
            r2 = r23
            goto L_0x01d4
        L_0x049e:
            r23 = r2
            r22 = r3
            r18 = r5
            r21 = r12
            java.util.List<o.setExpandActivityOverflowButtonContentDescription$1> r0 = r1.setWindowTitle
            java.lang.Object r0 = r0.get(r15)
            o.setExpandActivityOverflowButtonContentDescription$1 r0 = (p040o.setExpandActivityOverflowButtonContentDescription.C14841) r0
            r0.read()
            r0 = r18
            goto L_0x04ba
        L_0x04b4:
            r23 = r2
            r22 = r3
            r21 = r12
        L_0x04ba:
            int r15 = r15 + 1
            r12 = r21
            r3 = r22
            r2 = r23
            r4 = 8
            r5 = 0
            r8 = 32
            r9 = 1
            goto L_0x0122
        L_0x04ca:
            r23 = r2
            r22 = r3
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            r1.setExpandedActionViewsExclusive = r13
            o.setImageResource r2 = r1.AbsActionBarView
            if (r2 == 0) goto L_0x0500
            int r2 = r1.setPopupCallback
            int r3 = r1.setTitleOptional
            r4 = 8
            if (r3 != r4) goto L_0x04e0
            r3 = 0
            goto L_0x04e2
        L_0x04e0:
            int r3 = r1.ActionBarContextView
        L_0x04e2:
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r1.setItemInvoker
            int r5 = r1.setTitleOptional
            if (r5 != r4) goto L_0x04ee
            r4 = 0
            goto L_0x04f0
        L_0x04ee:
            int r4 = r1.PlaybackStateCompat
        L_0x04f0:
            int r3 = java.lang.Math.max(r3, r4)
            o.getSupportBackgroundTintList r4 = r1.setOverflowIcon
            r4.read(r1)
            r1.IconCompatParcelizer((int) r2)
            r1.MediaBrowserCompat$CustomActionResultReceiver((int) r3)
            goto L_0x0508
        L_0x0500:
            r2 = r23
            r1.setHasNonEmbeddedTabs = r2
            r2 = r22
            r1.setActionBarHideOffset = r2
        L_0x0508:
            if (r0 == 0) goto L_0x0514
            o.setImageResource$read[] r0 = r1.AppCompatDelegateImpl$ListMenuDecorView
            r2 = 0
            r0[r2] = r11
            o.setImageResource$read[] r0 = r1.AppCompatDelegateImpl$ListMenuDecorView
            r2 = 1
            r0[r2] = r10
        L_0x0514:
            o.AppCompatCheckedTextView r0 = r1.setMenuCallbacks
            o.AppCompatAutoCompleteTextView r0 = r0.write
            r1.read((p040o.AppCompatAutoCompleteTextView) r0)
            o.setImageDrawable r0 = r24.PlaybackStateCompat()
            if (r1 != r0) goto L_0x0524
            r24.MediaSessionCompat$ResultReceiverWrapper()
        L_0x0524:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setImageDrawable.MediaSessionCompat$QueueItem():void");
    }

    public final void ParcelableVolumeInfo() {
        PlaybackStateCompat$CustomAction();
        MediaBrowserCompat$ItemReceiver(this.setMenuPrepared);
    }

    public final void setHasDecor() {
        AppCompatImageView appCompatImageView = write(setSupportImageTintList.read.LEFT).write;
        AppCompatImageView appCompatImageView2 = write(setSupportImageTintList.read.TOP).write;
        appCompatImageView.IconCompatParcelizer((AppCompatImageView) null, BitmapDescriptorFactory.HUE_RED);
        appCompatImageView2.IconCompatParcelizer((AppCompatImageView) null, BitmapDescriptorFactory.HUE_RED);
    }

    private void PlaybackStateCompat$CustomAction() {
        int size = this.setExpandedActionViewsExclusive.size();
        read();
        for (int i = 0; i < size; i++) {
            this.setExpandedActionViewsExclusive.get(i).read();
        }
    }
}

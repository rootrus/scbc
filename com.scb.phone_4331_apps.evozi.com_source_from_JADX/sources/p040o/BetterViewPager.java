package p040o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import org.xmlpull.p042v1.XmlPullParser;
import p039io.beid.beidk.p058ui.camera.GraphicOverlay;
import p040o.AppCompatMultiAutoCompleteTextView;
import p040o.ComponentActivity;

/* renamed from: o.BetterViewPager */
public abstract class BetterViewPager implements Cloneable {
    private static ThreadLocal<setTextAppearance<Animator, read>> MediaDescriptionCompat = new ThreadLocal<>();
    private static final int[] MediaMetadataCompat = {2, 1, 3, 4};
    private static final putExtraData RatingCompat = new putExtraData() {
        public final Path IconCompatParcelizer(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    };
    private int AlertController$RecycleListView = 0;
    private boolean AppCompatActivity = false;
    private ArrayList<setChildrenDrawingOrderEnabledCompat> AppCompatDelegateImpl$ListMenuDecorView;
    private long AppCompatDialogFragment = -1;
    OperationCanceledException IconCompatParcelizer = null;
    private String Keep = getClass().getName();
    long MediaBrowserCompat$CustomActionResultReceiver = -1;
    ArrayList<Animator> MediaBrowserCompat$ItemReceiver = new ArrayList<>();
    private ArrayList<Animator> MediaBrowserCompat$MediaItem = new ArrayList<>();
    ArrayList<View> MediaBrowserCompat$SearchResultReceiver = new ArrayList<>();

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private boolean f2537x50fd9e4a = false;
    private write MediaSessionCompat$QueueItem;
    private ArrayList<setChildrenDrawingOrderEnabledCompat> MediaSessionCompat$ResultReceiverWrapper;
    private AppCompatMultiAutoCompleteTextView.IconCompatParcelizer MediaSessionCompat$Token = new AppCompatMultiAutoCompleteTextView.IconCompatParcelizer();
    private TimeInterpolator ParcelableVolumeInfo = null;
    private putExtraData PlaybackStateCompat = RatingCompat;
    private int[] PlaybackStateCompat$CustomAction = MediaMetadataCompat;
    GraphicOverlay.read read;
    private AppCompatMultiAutoCompleteTextView.IconCompatParcelizer setContentView = new AppCompatMultiAutoCompleteTextView.IconCompatParcelizer();
    private ArrayList<BetterViewPager$MediaBrowserCompat$ItemReceiver> setHasDecor = null;
    ArrayList<Integer> write = new ArrayList<>();

    /* renamed from: o.BetterViewPager$write */
    public static abstract class write {
    }

    public abstract void MediaBrowserCompat$CustomActionResultReceiver(setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat);

    public String[] MediaBrowserCompat$ItemReceiver() {
        return null;
    }

    public Animator read(ViewGroup viewGroup, setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat, setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat2) {
        return null;
    }

    public abstract void read(setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat);

    public BetterViewPager() {
    }

    public BetterViewPager(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, onSaveInstanceState.IconCompatParcelizer);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long read2 = (long) AlertController$RecycleListView.read(obtainStyledAttributes, (XmlPullParser) xmlResourceParser, "duration", 1, -1);
        if (read2 >= 0) {
            write(read2);
        }
        long read3 = (long) AlertController$RecycleListView.read(obtainStyledAttributes, (XmlPullParser) xmlResourceParser, "startDelay", 2, -1);
        if (read3 > 0) {
            MediaBrowserCompat$CustomActionResultReceiver(read3);
        }
        int MediaBrowserCompat$CustomActionResultReceiver2 = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(obtainStyledAttributes, (XmlPullParser) xmlResourceParser, "interpolator", 0);
        if (MediaBrowserCompat$CustomActionResultReceiver2 > 0) {
            IconCompatParcelizer((TimeInterpolator) AnimationUtils.loadInterpolator(context, MediaBrowserCompat$CustomActionResultReceiver2));
        }
        String MediaBrowserCompat$ItemReceiver2 = AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(obtainStyledAttributes, (XmlPullParser) xmlResourceParser, "matchOrder", 3);
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            read(write(MediaBrowserCompat$ItemReceiver2));
        }
        obtainStyledAttributes.recycle();
    }

    private static int[] write(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if (Name.MARK.equalsIgnoreCase(trim)) {
                iArr[i] = 3;
            } else if ("instance".equalsIgnoreCase(trim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i] = 2;
            } else if ("itemId".equalsIgnoreCase(trim)) {
                iArr[i] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[(iArr.length - 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown match type in matchOrder: '");
                sb.append(trim);
                sb.append("'");
                throw new InflateException(sb.toString());
            }
            i++;
        }
        return iArr;
    }

    public BetterViewPager write(long j) {
        this.MediaBrowserCompat$CustomActionResultReceiver = j;
        return this;
    }

    public BetterViewPager MediaBrowserCompat$CustomActionResultReceiver(long j) {
        this.AppCompatDialogFragment = j;
        return this;
    }

    public final long MediaDescriptionCompat() {
        return this.AppCompatDialogFragment;
    }

    public BetterViewPager IconCompatParcelizer(TimeInterpolator timeInterpolator) {
        this.ParcelableVolumeInfo = timeInterpolator;
        return this;
    }

    public final TimeInterpolator IconCompatParcelizer() {
        return this.ParcelableVolumeInfo;
    }

    private void read(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.PlaybackStateCompat$CustomAction = MediaMetadataCompat;
            return;
        }
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i];
            boolean z = true;
            if (i2 > 0 && i2 <= 4) {
                int i3 = iArr[i];
                int i4 = 0;
                while (true) {
                    if (i4 >= i) {
                        z = false;
                        break;
                    } else if (iArr[i4] == i3) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (!z) {
                    i++;
                } else {
                    throw new IllegalArgumentException("matches contains a duplicate value");
                }
            } else {
                throw new IllegalArgumentException("matches contains invalid value");
            }
        }
        this.PlaybackStateCompat$CustomAction = (int[]) iArr.clone();
    }

    private void read(AppCompatMultiAutoCompleteTextView.IconCompatParcelizer iconCompatParcelizer, AppCompatMultiAutoCompleteTextView.IconCompatParcelizer iconCompatParcelizer2) {
        setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat;
        View view;
        View view2;
        AppCompatMultiAutoCompleteTextView.IconCompatParcelizer iconCompatParcelizer3 = iconCompatParcelizer;
        AppCompatMultiAutoCompleteTextView.IconCompatParcelizer iconCompatParcelizer4 = iconCompatParcelizer2;
        setTextAppearance settextappearance = new setTextAppearance((AppCompatCheckBox) iconCompatParcelizer3.MediaBrowserCompat$ItemReceiver);
        setTextAppearance settextappearance2 = new setTextAppearance((AppCompatCheckBox) iconCompatParcelizer4.MediaBrowserCompat$ItemReceiver);
        int i = 0;
        while (true) {
            int[] iArr = this.PlaybackStateCompat$CustomAction;
            if (i >= iArr.length) {
                break;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                for (int size = settextappearance.size() - 1; size >= 0; size--) {
                    View view3 = (View) settextappearance.read[size << 1];
                    if (!(view3 == null || !IconCompatParcelizer(view3) || (setchildrendrawingorderenabledcompat = (setChildrenDrawingOrderEnabledCompat) settextappearance2.remove(view3)) == null || setchildrendrawingorderenabledcompat.MediaBrowserCompat$CustomActionResultReceiver == null || !IconCompatParcelizer(setchildrendrawingorderenabledcompat.MediaBrowserCompat$CustomActionResultReceiver))) {
                        this.AppCompatDelegateImpl$ListMenuDecorView.add((setChildrenDrawingOrderEnabledCompat) settextappearance.write(size));
                        this.MediaSessionCompat$ResultReceiverWrapper.add(setchildrendrawingorderenabledcompat);
                    }
                }
            } else if (i2 == 2) {
                setTextAppearance<String, View> settextappearance3 = iconCompatParcelizer3.read;
                setTextAppearance<String, View> settextappearance4 = iconCompatParcelizer4.read;
                int size2 = settextappearance3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    int i4 = i3 << 1;
                    View view4 = (View) settextappearance3.read[i4 + 1];
                    if (view4 != null && IconCompatParcelizer(view4) && (view = settextappearance4.get(settextappearance3.read[i4])) != null && IconCompatParcelizer(view)) {
                        setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat2 = (setChildrenDrawingOrderEnabledCompat) settextappearance.get(view4);
                        setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat3 = (setChildrenDrawingOrderEnabledCompat) settextappearance2.get(view);
                        if (!(setchildrendrawingorderenabledcompat2 == null || setchildrendrawingorderenabledcompat3 == null)) {
                            this.AppCompatDelegateImpl$ListMenuDecorView.add(setchildrendrawingorderenabledcompat2);
                            this.MediaSessionCompat$ResultReceiverWrapper.add(setchildrendrawingorderenabledcompat3);
                            settextappearance.remove(view4);
                            settextappearance2.remove(view);
                        }
                    }
                }
            } else if (i2 == 3) {
                SparseArray<View> sparseArray = iconCompatParcelizer3.write;
                SparseArray<View> sparseArray2 = iconCompatParcelizer4.write;
                int size3 = sparseArray.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    View valueAt = sparseArray.valueAt(i5);
                    if (valueAt != null && IconCompatParcelizer(valueAt) && (view2 = sparseArray2.get(sparseArray.keyAt(i5))) != null && IconCompatParcelizer(view2)) {
                        setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat4 = (setChildrenDrawingOrderEnabledCompat) settextappearance.get(valueAt);
                        setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat5 = (setChildrenDrawingOrderEnabledCompat) settextappearance2.get(view2);
                        if (!(setchildrendrawingorderenabledcompat4 == null || setchildrendrawingorderenabledcompat5 == null)) {
                            this.AppCompatDelegateImpl$ListMenuDecorView.add(setchildrendrawingorderenabledcompat4);
                            this.MediaSessionCompat$ResultReceiverWrapper.add(setchildrendrawingorderenabledcompat5);
                            settextappearance.remove(valueAt);
                            settextappearance2.remove(view2);
                        }
                    }
                }
            } else if (i2 == 4) {
                setAutoSizeTextTypeWithDefaults<View> setautosizetexttypewithdefaults = iconCompatParcelizer3.MediaBrowserCompat$CustomActionResultReceiver;
                setAutoSizeTextTypeWithDefaults<View> setautosizetexttypewithdefaults2 = iconCompatParcelizer4.MediaBrowserCompat$CustomActionResultReceiver;
                if (setautosizetexttypewithdefaults.MediaBrowserCompat$CustomActionResultReceiver) {
                    setautosizetexttypewithdefaults.write();
                }
                int i6 = setautosizetexttypewithdefaults.IconCompatParcelizer;
                for (int i7 = 0; i7 < i6; i7++) {
                    if (setautosizetexttypewithdefaults.MediaBrowserCompat$CustomActionResultReceiver) {
                        setautosizetexttypewithdefaults.write();
                    }
                    View view5 = (View) setautosizetexttypewithdefaults.MediaBrowserCompat$ItemReceiver[i7];
                    if (view5 != null && IconCompatParcelizer(view5)) {
                        if (setautosizetexttypewithdefaults.MediaBrowserCompat$CustomActionResultReceiver) {
                            setautosizetexttypewithdefaults.write();
                        }
                        View MediaBrowserCompat$ItemReceiver2 = setautosizetexttypewithdefaults2.MediaBrowserCompat$ItemReceiver(setautosizetexttypewithdefaults.write[i7], null);
                        if (MediaBrowserCompat$ItemReceiver2 != null && IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2)) {
                            setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat6 = (setChildrenDrawingOrderEnabledCompat) settextappearance.get(view5);
                            setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat7 = (setChildrenDrawingOrderEnabledCompat) settextappearance2.get(MediaBrowserCompat$ItemReceiver2);
                            if (!(setchildrendrawingorderenabledcompat6 == null || setchildrendrawingorderenabledcompat7 == null)) {
                                this.AppCompatDelegateImpl$ListMenuDecorView.add(setchildrendrawingorderenabledcompat6);
                                this.MediaSessionCompat$ResultReceiverWrapper.add(setchildrendrawingorderenabledcompat7);
                                settextappearance.remove(view5);
                                settextappearance2.remove(MediaBrowserCompat$ItemReceiver2);
                            }
                        }
                    }
                }
            }
            i++;
        }
        for (int i8 = 0; i8 < settextappearance.size(); i8++) {
            setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat8 = (setChildrenDrawingOrderEnabledCompat) settextappearance.read[(i8 << 1) + 1];
            if (IconCompatParcelizer(setchildrendrawingorderenabledcompat8.MediaBrowserCompat$CustomActionResultReceiver)) {
                this.AppCompatDelegateImpl$ListMenuDecorView.add(setchildrendrawingorderenabledcompat8);
                this.MediaSessionCompat$ResultReceiverWrapper.add((Object) null);
            }
        }
        for (int i9 = 0; i9 < settextappearance2.size(); i9++) {
            setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat9 = (setChildrenDrawingOrderEnabledCompat) settextappearance2.read[(i9 << 1) + 1];
            if (IconCompatParcelizer(setchildrendrawingorderenabledcompat9.MediaBrowserCompat$CustomActionResultReceiver)) {
                this.MediaSessionCompat$ResultReceiverWrapper.add(setchildrendrawingorderenabledcompat9);
                this.AppCompatDelegateImpl$ListMenuDecorView.add((Object) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x011b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void IconCompatParcelizer(android.view.ViewGroup r21, p040o.AppCompatMultiAutoCompleteTextView.IconCompatParcelizer r22, p040o.AppCompatMultiAutoCompleteTextView.IconCompatParcelizer r23, java.util.ArrayList<p040o.setChildrenDrawingOrderEnabledCompat> r24, java.util.ArrayList<p040o.setChildrenDrawingOrderEnabledCompat> r25) {
        /*
            r20 = this;
            r6 = r20
            o.setTextAppearance r7 = MediaMetadataCompat()
            android.util.SparseIntArray r8 = new android.util.SparseIntArray
            r8.<init>()
            int r9 = r24.size()
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 0
        L_0x0015:
            if (r11 >= r9) goto L_0x0121
            r12 = r24
            java.lang.Object r2 = r12.get(r11)
            o.setChildrenDrawingOrderEnabledCompat r2 = (p040o.setChildrenDrawingOrderEnabledCompat) r2
            r13 = r25
            java.lang.Object r3 = r13.get(r11)
            o.setChildrenDrawingOrderEnabledCompat r3 = (p040o.setChildrenDrawingOrderEnabledCompat) r3
            if (r2 == 0) goto L_0x0032
            java.util.ArrayList<o.BetterViewPager> r5 = r2.IconCompatParcelizer
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x0032
            r2 = 0
        L_0x0032:
            if (r3 == 0) goto L_0x003d
            java.util.ArrayList<o.BetterViewPager> r5 = r3.IconCompatParcelizer
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x003d
            r3 = 0
        L_0x003d:
            if (r2 != 0) goto L_0x0047
            if (r3 != 0) goto L_0x0047
        L_0x0041:
            r14 = r21
        L_0x0043:
            r18 = r9
            goto L_0x011b
        L_0x0047:
            if (r2 == 0) goto L_0x0053
            if (r3 == 0) goto L_0x0053
            boolean r5 = r6.write(r2, r3)
            if (r5 != 0) goto L_0x0053
            r5 = 0
            goto L_0x0054
        L_0x0053:
            r5 = 1
        L_0x0054:
            if (r5 == 0) goto L_0x0041
            r14 = r21
            android.animation.Animator r5 = r6.read(r14, r2, r3)
            if (r5 == 0) goto L_0x0043
            if (r3 == 0) goto L_0x00e0
            android.view.View r2 = r3.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String[] r3 = r20.MediaBrowserCompat$ItemReceiver()
            if (r2 == 0) goto L_0x00db
            if (r3 == 0) goto L_0x00db
            int r15 = r3.length
            if (r15 <= 0) goto L_0x00db
            o.setChildrenDrawingOrderEnabledCompat r15 = new o.setChildrenDrawingOrderEnabledCompat
            r15.<init>()
            r15.MediaBrowserCompat$CustomActionResultReceiver = r2
            r10 = r23
            o.setTextAppearance<android.view.View, o.setChildrenDrawingOrderEnabledCompat> r4 = r10.MediaBrowserCompat$ItemReceiver
            java.lang.Object r4 = r4.get(r2)
            o.setChildrenDrawingOrderEnabledCompat r4 = (p040o.setChildrenDrawingOrderEnabledCompat) r4
            r17 = r5
            r18 = r9
            if (r4 == 0) goto L_0x00a2
            r5 = 0
        L_0x0085:
            int r9 = r3.length
            if (r5 >= r9) goto L_0x00a2
            java.util.Map<java.lang.String, java.lang.Object> r9 = r15.MediaBrowserCompat$ItemReceiver
            r10 = r3[r5]
            java.util.Map<java.lang.String, java.lang.Object> r12 = r4.MediaBrowserCompat$ItemReceiver
            r19 = r4
            r4 = r3[r5]
            java.lang.Object r4 = r12.get(r4)
            r9.put(r10, r4)
            int r5 = r5 + 1
            r10 = r23
            r12 = r24
            r4 = r19
            goto L_0x0085
        L_0x00a2:
            int r3 = r7.size()
            r4 = 0
        L_0x00a7:
            if (r4 >= r3) goto L_0x00d7
            java.lang.Object[] r5 = r7.read
            int r9 = r4 << 1
            r5 = r5[r9]
            android.animation.Animator r5 = (android.animation.Animator) r5
            java.lang.Object r5 = r7.get(r5)
            o.BetterViewPager$read r5 = (p040o.BetterViewPager.read) r5
            o.setChildrenDrawingOrderEnabledCompat r9 = r5.MediaBrowserCompat$ItemReceiver
            if (r9 == 0) goto L_0x00d4
            android.view.View r9 = r5.IconCompatParcelizer
            if (r9 != r2) goto L_0x00d4
            java.lang.String r9 = r5.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r10 = r6.Keep
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x00d4
            o.setChildrenDrawingOrderEnabledCompat r5 = r5.MediaBrowserCompat$ItemReceiver
            boolean r5 = r5.equals(r15)
            if (r5 == 0) goto L_0x00d4
            r5 = r15
            r9 = 0
            goto L_0x00e9
        L_0x00d4:
            int r4 = r4 + 1
            goto L_0x00a7
        L_0x00d7:
            r5 = r15
            r9 = r17
            goto L_0x00e9
        L_0x00db:
            r17 = r5
            r18 = r9
            goto L_0x00e6
        L_0x00e0:
            r17 = r5
            r18 = r9
            android.view.View r2 = r2.MediaBrowserCompat$CustomActionResultReceiver
        L_0x00e6:
            r9 = r17
            r5 = 0
        L_0x00e9:
            if (r9 == 0) goto L_0x011b
            io.beid.beidk.ui.camera.GraphicOverlay$read r3 = r6.read
            if (r3 == 0) goto L_0x0101
            long r3 = r3.IconCompatParcelizer()
            java.util.ArrayList<android.animation.Animator> r10 = r6.MediaBrowserCompat$MediaItem
            int r10 = r10.size()
            int r12 = (int) r3
            r8.put(r10, r12)
            long r0 = java.lang.Math.min(r3, r0)
        L_0x0101:
            r15 = r0
            java.lang.String r3 = r6.Keep
            o.BetterViewPager$read r10 = new o.BetterViewPager$read
            o.CheckExtractActivity_MembersInjector r4 = p040o.setFillViewport.MediaBrowserCompat$ItemReceiver(r21)
            r0 = r10
            r1 = r2
            r2 = r3
            r3 = r20
            r0.<init>(r1, r2, r3, r4, r5)
            r7.put(r9, r10)
            java.util.ArrayList<android.animation.Animator> r0 = r6.MediaBrowserCompat$MediaItem
            r0.add(r9)
            r0 = r15
        L_0x011b:
            int r11 = r11 + 1
            r9 = r18
            goto L_0x0015
        L_0x0121:
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x014b
            r10 = 0
        L_0x0128:
            int r2 = r8.size()
            if (r10 >= r2) goto L_0x014b
            int r2 = r8.keyAt(r10)
            java.util.ArrayList<android.animation.Animator> r3 = r6.MediaBrowserCompat$MediaItem
            java.lang.Object r2 = r3.get(r2)
            android.animation.Animator r2 = (android.animation.Animator) r2
            int r3 = r8.valueAt(r10)
            long r3 = (long) r3
            long r11 = r2.getStartDelay()
            long r3 = r3 - r0
            long r3 = r3 + r11
            r2.setStartDelay(r3)
            int r10 = r10 + 1
            goto L_0x0128
        L_0x014b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.BetterViewPager.IconCompatParcelizer(android.view.ViewGroup, o.AppCompatMultiAutoCompleteTextView$IconCompatParcelizer, o.AppCompatMultiAutoCompleteTextView$IconCompatParcelizer, java.util.ArrayList, java.util.ArrayList):void");
    }

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer(View view) {
        int id = view.getId();
        if ((this.write.size() != 0 || this.MediaBrowserCompat$SearchResultReceiver.size() != 0) && !this.write.contains(Integer.valueOf(id)) && !this.MediaBrowserCompat$SearchResultReceiver.contains(view)) {
            return false;
        }
        return true;
    }

    private static setTextAppearance<Animator, read> MediaMetadataCompat() {
        setTextAppearance<Animator, read> settextappearance = MediaDescriptionCompat.get();
        if (settextappearance != null) {
            return settextappearance;
        }
        setTextAppearance<Animator, read> settextappearance2 = new setTextAppearance<>();
        MediaDescriptionCompat.set(settextappearance2);
        return settextappearance2;
    }

    /* access modifiers changed from: protected */
    public void MediaBrowserCompat$SearchResultReceiver() {
        MediaBrowserCompat$MediaItem();
        final setTextAppearance<Animator, read> MediaMetadataCompat2 = MediaMetadataCompat();
        Iterator<Animator> it = this.MediaBrowserCompat$MediaItem.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (MediaMetadataCompat2.containsKey(next)) {
                MediaBrowserCompat$MediaItem();
                if (next != null) {
                    next.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationStart(Animator animator) {
                            BetterViewPager.this.MediaBrowserCompat$ItemReceiver.add(animator);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            MediaMetadataCompat2.remove(animator);
                            BetterViewPager.this.MediaBrowserCompat$ItemReceiver.remove(animator);
                        }
                    });
                    if (next == null) {
                        read();
                    } else {
                        long j = this.MediaBrowserCompat$CustomActionResultReceiver;
                        if (j >= 0) {
                            next.setDuration(j);
                        }
                        long j2 = this.AppCompatDialogFragment;
                        if (j2 >= 0) {
                            next.setStartDelay(j2);
                        }
                        TimeInterpolator timeInterpolator = this.ParcelableVolumeInfo;
                        if (timeInterpolator != null) {
                            next.setInterpolator(timeInterpolator);
                        }
                        next.addListener(new AnimatorListenerAdapter() {
                            public final void onAnimationEnd(Animator animator) {
                                BetterViewPager.this.read();
                                animator.removeListener(this);
                            }
                        });
                        next.start();
                    }
                }
            }
        }
        this.MediaBrowserCompat$MediaItem.clear();
        read();
    }

    public BetterViewPager write(View view) {
        this.MediaBrowserCompat$SearchResultReceiver.add(view);
        return this;
    }

    public BetterViewPager MediaBrowserCompat$ItemReceiver(View view) {
        this.MediaBrowserCompat$SearchResultReceiver.remove(view);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void read(ViewGroup viewGroup, boolean z) {
        write(z);
        if (this.write.size() > 0 || this.MediaBrowserCompat$SearchResultReceiver.size() > 0) {
            for (int i = 0; i < this.write.size(); i++) {
                View findViewById = viewGroup.findViewById(this.write.get(i).intValue());
                if (findViewById != null) {
                    setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat = new setChildrenDrawingOrderEnabledCompat();
                    setchildrendrawingorderenabledcompat.MediaBrowserCompat$CustomActionResultReceiver = findViewById;
                    if (z) {
                        read(setchildrendrawingorderenabledcompat);
                    } else {
                        MediaBrowserCompat$CustomActionResultReceiver(setchildrendrawingorderenabledcompat);
                    }
                    setchildrendrawingorderenabledcompat.IconCompatParcelizer.add(this);
                    write(setchildrendrawingorderenabledcompat);
                    if (z) {
                        MediaBrowserCompat$CustomActionResultReceiver(this.setContentView, findViewById, setchildrendrawingorderenabledcompat);
                    } else {
                        MediaBrowserCompat$CustomActionResultReceiver(this.MediaSessionCompat$Token, findViewById, setchildrendrawingorderenabledcompat);
                    }
                }
            }
            for (int i2 = 0; i2 < this.MediaBrowserCompat$SearchResultReceiver.size(); i2++) {
                View view = this.MediaBrowserCompat$SearchResultReceiver.get(i2);
                setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat2 = new setChildrenDrawingOrderEnabledCompat();
                setchildrendrawingorderenabledcompat2.MediaBrowserCompat$CustomActionResultReceiver = view;
                if (z) {
                    read(setchildrendrawingorderenabledcompat2);
                } else {
                    MediaBrowserCompat$CustomActionResultReceiver(setchildrendrawingorderenabledcompat2);
                }
                setchildrendrawingorderenabledcompat2.IconCompatParcelizer.add(this);
                write(setchildrendrawingorderenabledcompat2);
                if (z) {
                    MediaBrowserCompat$CustomActionResultReceiver(this.setContentView, view, setchildrendrawingorderenabledcompat2);
                } else {
                    MediaBrowserCompat$CustomActionResultReceiver(this.MediaSessionCompat$Token, view, setchildrendrawingorderenabledcompat2);
                }
            }
            return;
        }
        MediaBrowserCompat$CustomActionResultReceiver(viewGroup, z);
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(AppCompatMultiAutoCompleteTextView.IconCompatParcelizer iconCompatParcelizer, View view, setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat) {
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.put(view, setchildrendrawingorderenabledcompat);
        int id = view.getId();
        if (id >= 0) {
            if (iconCompatParcelizer.write.indexOfKey(id) >= 0) {
                iconCompatParcelizer.write.put(id, (Object) null);
            } else {
                iconCompatParcelizer.write.put(id, view);
            }
        }
        String Keep2 = SwitchCompat.Keep(view);
        if (Keep2 != null) {
            if (iconCompatParcelizer.read.containsKey(Keep2)) {
                iconCompatParcelizer.read.put(Keep2, null);
            } else {
                iconCompatParcelizer.read.put(Keep2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                setAutoSizeTextTypeWithDefaults<View> setautosizetexttypewithdefaults = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                if (setautosizetexttypewithdefaults.MediaBrowserCompat$CustomActionResultReceiver) {
                    setautosizetexttypewithdefaults.write();
                }
                if (setAutoSizeTextTypeUniformWithPresetSizes.MediaBrowserCompat$ItemReceiver(setautosizetexttypewithdefaults.write, setautosizetexttypewithdefaults.IconCompatParcelizer, itemIdAtPosition) >= 0) {
                    View MediaBrowserCompat$ItemReceiver2 = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(itemIdAtPosition, null);
                    if (MediaBrowserCompat$ItemReceiver2 != null) {
                        SwitchCompat.write(MediaBrowserCompat$ItemReceiver2, false);
                        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.read(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                SwitchCompat.write(view, true);
                iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.read(itemIdAtPosition, view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void write(boolean z) {
        if (z) {
            this.setContentView.MediaBrowserCompat$ItemReceiver.clear();
            this.setContentView.write.clear();
            this.setContentView.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
            return;
        }
        this.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver.clear();
        this.MediaSessionCompat$Token.write.clear();
        this.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat = new setChildrenDrawingOrderEnabledCompat();
                setchildrendrawingorderenabledcompat.MediaBrowserCompat$CustomActionResultReceiver = view;
                if (z) {
                    read(setchildrendrawingorderenabledcompat);
                } else {
                    MediaBrowserCompat$CustomActionResultReceiver(setchildrendrawingorderenabledcompat);
                }
                setchildrendrawingorderenabledcompat.IconCompatParcelizer.add(this);
                write(setchildrendrawingorderenabledcompat);
                if (z) {
                    MediaBrowserCompat$CustomActionResultReceiver(this.setContentView, view, setchildrendrawingorderenabledcompat);
                } else {
                    MediaBrowserCompat$CustomActionResultReceiver(this.MediaSessionCompat$Token, view, setchildrendrawingorderenabledcompat);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    MediaBrowserCompat$CustomActionResultReceiver(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    public final setChildrenDrawingOrderEnabledCompat IconCompatParcelizer(View view, boolean z) {
        OperationCanceledException operationCanceledException = this;
        while (true) {
            OperationCanceledException operationCanceledException2 = operationCanceledException.IconCompatParcelizer;
            if (operationCanceledException2 == null) {
                break;
            }
            operationCanceledException = operationCanceledException2;
        }
        return (z ? operationCanceledException.setContentView : operationCanceledException.MediaSessionCompat$Token).MediaBrowserCompat$ItemReceiver.get(view);
    }

    /* access modifiers changed from: package-private */
    public final setChildrenDrawingOrderEnabledCompat MediaBrowserCompat$ItemReceiver(View view, boolean z) {
        OperationCanceledException operationCanceledException = this;
        while (true) {
            OperationCanceledException operationCanceledException2 = operationCanceledException.IconCompatParcelizer;
            if (operationCanceledException2 == null) {
                break;
            }
            operationCanceledException = operationCanceledException2;
        }
        ArrayList<setChildrenDrawingOrderEnabledCompat> arrayList = z ? operationCanceledException.AppCompatDelegateImpl$ListMenuDecorView : operationCanceledException.MediaSessionCompat$ResultReceiverWrapper;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat = arrayList.get(i);
            if (setchildrendrawingorderenabledcompat == null) {
                return null;
            }
            if (setchildrendrawingorderenabledcompat.MediaBrowserCompat$CustomActionResultReceiver == view) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? operationCanceledException.MediaSessionCompat$ResultReceiverWrapper : operationCanceledException.AppCompatDelegateImpl$ListMenuDecorView).get(i);
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(View view) {
        int i;
        if (!this.f2537x50fd9e4a) {
            setTextAppearance<Animator, read> MediaMetadataCompat2 = MediaMetadataCompat();
            int size = MediaMetadataCompat2.size();
            CheckExtractActivity_MembersInjector MediaBrowserCompat$ItemReceiver2 = setFillViewport.MediaBrowserCompat$ItemReceiver(view);
            while (true) {
                size--;
                i = 0;
                if (size < 0) {
                    break;
                }
                int i2 = size << 1;
                read read2 = (read) MediaMetadataCompat2.read[i2 + 1];
                if (read2.IconCompatParcelizer != null && MediaBrowserCompat$ItemReceiver2.equals(read2.write)) {
                    Animator animator = (Animator) MediaMetadataCompat2.read[i2];
                    if (Build.VERSION.SDK_INT >= 19) {
                        animator.pause();
                    } else {
                        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
                        if (listeners != null) {
                            int size2 = listeners.size();
                            while (i < size2) {
                                Animator.AnimatorListener animatorListener = listeners.get(i);
                                if (animatorListener instanceof ComponentActivity.IconCompatParcelizer) {
                                    ((ComponentActivity.IconCompatParcelizer) animatorListener).onAnimationPause(animator);
                                }
                                i++;
                            }
                        }
                    }
                }
            }
            ArrayList<BetterViewPager$MediaBrowserCompat$ItemReceiver> arrayList = this.setHasDecor;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.setHasDecor.clone();
                int size3 = arrayList2.size();
                while (i < size3) {
                    ((BetterViewPager$MediaBrowserCompat$ItemReceiver) arrayList2.get(i)).MediaBrowserCompat$CustomActionResultReceiver();
                    i++;
                }
            }
            this.AppCompatActivity = true;
        }
    }

    public void read(View view) {
        if (this.AppCompatActivity) {
            if (!this.f2537x50fd9e4a) {
                setTextAppearance<Animator, read> MediaMetadataCompat2 = MediaMetadataCompat();
                int size = MediaMetadataCompat2.size();
                CheckExtractActivity_MembersInjector MediaBrowserCompat$ItemReceiver2 = setFillViewport.MediaBrowserCompat$ItemReceiver(view);
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    int i = size << 1;
                    read read2 = (read) MediaMetadataCompat2.read[i + 1];
                    if (read2.IconCompatParcelizer != null && MediaBrowserCompat$ItemReceiver2.equals(read2.write)) {
                        Animator animator = (Animator) MediaMetadataCompat2.read[i];
                        if (Build.VERSION.SDK_INT >= 19) {
                            animator.resume();
                        } else {
                            ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
                            if (listeners != null) {
                                int size2 = listeners.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    Animator.AnimatorListener animatorListener = listeners.get(i2);
                                    if (animatorListener instanceof ComponentActivity.IconCompatParcelizer) {
                                        ((ComponentActivity.IconCompatParcelizer) animatorListener).onAnimationResume(animator);
                                    }
                                }
                            }
                        }
                    }
                }
                ArrayList<BetterViewPager$MediaBrowserCompat$ItemReceiver> arrayList = this.setHasDecor;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.setHasDecor.clone();
                    int size3 = arrayList2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ((BetterViewPager$MediaBrowserCompat$ItemReceiver) arrayList2.get(i3)).MediaBrowserCompat$ItemReceiver();
                    }
                }
            }
            this.AppCompatActivity = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void write(ViewGroup viewGroup) {
        read read2;
        this.AppCompatDelegateImpl$ListMenuDecorView = new ArrayList<>();
        this.MediaSessionCompat$ResultReceiverWrapper = new ArrayList<>();
        read(this.setContentView, this.MediaSessionCompat$Token);
        setTextAppearance<Animator, read> MediaMetadataCompat2 = MediaMetadataCompat();
        int size = MediaMetadataCompat2.size();
        CheckExtractActivity_MembersInjector MediaBrowserCompat$ItemReceiver2 = setFillViewport.MediaBrowserCompat$ItemReceiver(viewGroup);
        while (true) {
            size--;
            if (size >= 0) {
                Animator animator = (Animator) MediaMetadataCompat2.read[size << 1];
                if (!(animator == null || (read2 = MediaMetadataCompat2.get(animator)) == null || read2.IconCompatParcelizer == null || !MediaBrowserCompat$ItemReceiver2.equals(read2.write))) {
                    setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat = read2.MediaBrowserCompat$ItemReceiver;
                    View view = read2.IconCompatParcelizer;
                    boolean z = true;
                    setChildrenDrawingOrderEnabledCompat IconCompatParcelizer2 = IconCompatParcelizer(view, true);
                    setChildrenDrawingOrderEnabledCompat MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver(view, true);
                    if ((IconCompatParcelizer2 == null && MediaBrowserCompat$ItemReceiver3 == null) || !read2.read.write(setchildrendrawingorderenabledcompat, MediaBrowserCompat$ItemReceiver3)) {
                        z = false;
                    }
                    if (z) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            MediaMetadataCompat2.remove(animator);
                        }
                    }
                }
            } else {
                IconCompatParcelizer(viewGroup, this.setContentView, this.MediaSessionCompat$Token, this.AppCompatDelegateImpl$ListMenuDecorView, this.MediaSessionCompat$ResultReceiverWrapper);
                MediaBrowserCompat$SearchResultReceiver();
                return;
            }
        }
    }

    public boolean write(setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat, setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat2) {
        if (setchildrendrawingorderenabledcompat == null || setchildrendrawingorderenabledcompat2 == null) {
            return false;
        }
        String[] MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            int length = MediaBrowserCompat$ItemReceiver2.length;
            int i = 0;
            while (i < length) {
                if (!MediaBrowserCompat$ItemReceiver(setchildrendrawingorderenabledcompat, setchildrendrawingorderenabledcompat2, MediaBrowserCompat$ItemReceiver2[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String MediaBrowserCompat$ItemReceiver3 : setchildrendrawingorderenabledcompat.MediaBrowserCompat$ItemReceiver.keySet()) {
            if (MediaBrowserCompat$ItemReceiver(setchildrendrawingorderenabledcompat, setchildrendrawingorderenabledcompat2, MediaBrowserCompat$ItemReceiver3)) {
            }
        }
        return false;
        return true;
    }

    private static boolean MediaBrowserCompat$ItemReceiver(setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat, setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat2, String str) {
        Object obj = setchildrendrawingorderenabledcompat.MediaBrowserCompat$ItemReceiver.get(str);
        Object obj2 = setchildrendrawingorderenabledcompat2.MediaBrowserCompat$ItemReceiver.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$MediaItem() {
        if (this.AlertController$RecycleListView == 0) {
            ArrayList<BetterViewPager$MediaBrowserCompat$ItemReceiver> arrayList = this.setHasDecor;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.setHasDecor.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((BetterViewPager$MediaBrowserCompat$ItemReceiver) arrayList2.get(i)).read();
                }
            }
            this.f2537x50fd9e4a = false;
        }
        this.AlertController$RecycleListView++;
    }

    /* access modifiers changed from: protected */
    public final void read() {
        int i = this.AlertController$RecycleListView - 1;
        this.AlertController$RecycleListView = i;
        if (i == 0) {
            ArrayList<BetterViewPager$MediaBrowserCompat$ItemReceiver> arrayList = this.setHasDecor;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.setHasDecor.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((BetterViewPager$MediaBrowserCompat$ItemReceiver) arrayList2.get(i2)).write(this);
                }
            }
            int i3 = 0;
            while (true) {
                setAutoSizeTextTypeWithDefaults<View> setautosizetexttypewithdefaults = this.setContentView.MediaBrowserCompat$CustomActionResultReceiver;
                if (setautosizetexttypewithdefaults.MediaBrowserCompat$CustomActionResultReceiver) {
                    setautosizetexttypewithdefaults.write();
                }
                if (i3 >= setautosizetexttypewithdefaults.IconCompatParcelizer) {
                    break;
                }
                setAutoSizeTextTypeWithDefaults<View> setautosizetexttypewithdefaults2 = this.setContentView.MediaBrowserCompat$CustomActionResultReceiver;
                if (setautosizetexttypewithdefaults2.MediaBrowserCompat$CustomActionResultReceiver) {
                    setautosizetexttypewithdefaults2.write();
                }
                View view = (View) setautosizetexttypewithdefaults2.MediaBrowserCompat$ItemReceiver[i3];
                if (view != null) {
                    SwitchCompat.write(view, false);
                }
                i3++;
            }
            int i4 = 0;
            while (true) {
                setAutoSizeTextTypeWithDefaults<View> setautosizetexttypewithdefaults3 = this.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver;
                if (setautosizetexttypewithdefaults3.MediaBrowserCompat$CustomActionResultReceiver) {
                    setautosizetexttypewithdefaults3.write();
                }
                if (i4 < setautosizetexttypewithdefaults3.IconCompatParcelizer) {
                    setAutoSizeTextTypeWithDefaults<View> setautosizetexttypewithdefaults4 = this.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver;
                    if (setautosizetexttypewithdefaults4.MediaBrowserCompat$CustomActionResultReceiver) {
                        setautosizetexttypewithdefaults4.write();
                    }
                    View view2 = (View) setautosizetexttypewithdefaults4.MediaBrowserCompat$ItemReceiver[i4];
                    if (view2 != null) {
                        SwitchCompat.write(view2, false);
                    }
                    i4++;
                } else {
                    this.f2537x50fd9e4a = true;
                    return;
                }
            }
        }
    }

    public BetterViewPager IconCompatParcelizer(BetterViewPager$MediaBrowserCompat$ItemReceiver betterViewPager$MediaBrowserCompat$ItemReceiver) {
        if (this.setHasDecor == null) {
            this.setHasDecor = new ArrayList<>();
        }
        this.setHasDecor.add(betterViewPager$MediaBrowserCompat$ItemReceiver);
        return this;
    }

    public BetterViewPager read(BetterViewPager$MediaBrowserCompat$ItemReceiver betterViewPager$MediaBrowserCompat$ItemReceiver) {
        ArrayList<BetterViewPager$MediaBrowserCompat$ItemReceiver> arrayList = this.setHasDecor;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(betterViewPager$MediaBrowserCompat$ItemReceiver);
        if (this.setHasDecor.size() == 0) {
            this.setHasDecor = null;
        }
        return this;
    }

    public void MediaBrowserCompat$ItemReceiver(putExtraData putextradata) {
        if (putextradata == null) {
            this.PlaybackStateCompat = RatingCompat;
        } else {
            this.PlaybackStateCompat = putextradata;
        }
    }

    public final putExtraData RatingCompat() {
        return this.PlaybackStateCompat;
    }

    public void write(write write2) {
        this.MediaSessionCompat$QueueItem = write2;
    }

    public final write MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaSessionCompat$QueueItem;
    }

    public void read(GraphicOverlay.read read2) {
        this.read = read2;
    }

    /* access modifiers changed from: package-private */
    public void write(setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat) {
        String[] MediaBrowserCompat$ItemReceiver2;
        if (this.read != null && !setchildrendrawingorderenabledcompat.MediaBrowserCompat$ItemReceiver.isEmpty() && (MediaBrowserCompat$ItemReceiver2 = this.read.MediaBrowserCompat$ItemReceiver()) != null) {
            int i = 0;
            while (i < MediaBrowserCompat$ItemReceiver2.length && setchildrendrawingorderenabledcompat.MediaBrowserCompat$ItemReceiver.containsKey(MediaBrowserCompat$ItemReceiver2[i])) {
                i++;
            }
        }
    }

    public String toString() {
        return IconCompatParcelizer("");
    }

    /* renamed from: write */
    public BetterViewPager clone() {
        try {
            BetterViewPager betterViewPager = (BetterViewPager) super.clone();
            betterViewPager.MediaBrowserCompat$MediaItem = new ArrayList<>();
            betterViewPager.setContentView = new AppCompatMultiAutoCompleteTextView.IconCompatParcelizer();
            betterViewPager.MediaSessionCompat$Token = new AppCompatMultiAutoCompleteTextView.IconCompatParcelizer();
            betterViewPager.AppCompatDelegateImpl$ListMenuDecorView = null;
            betterViewPager.MediaSessionCompat$ResultReceiverWrapper = null;
            return betterViewPager;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public String IconCompatParcelizer(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        String obj = sb.toString();
        if (this.MediaBrowserCompat$CustomActionResultReceiver != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append("dur(");
            sb2.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb2.append(") ");
            obj = sb2.toString();
        }
        if (this.AppCompatDialogFragment != -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append("dly(");
            sb3.append(this.AppCompatDialogFragment);
            sb3.append(") ");
            obj = sb3.toString();
        }
        if (this.ParcelableVolumeInfo != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(obj);
            sb4.append("interp(");
            sb4.append(this.ParcelableVolumeInfo);
            sb4.append(") ");
            obj = sb4.toString();
        }
        if (this.write.size() <= 0 && this.MediaBrowserCompat$SearchResultReceiver.size() <= 0) {
            return obj;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(obj);
        sb5.append("tgts(");
        String obj2 = sb5.toString();
        if (this.write.size() > 0) {
            for (int i = 0; i < this.write.size(); i++) {
                if (i > 0) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(obj2);
                    sb6.append(", ");
                    obj2 = sb6.toString();
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append(obj2);
                sb7.append(this.write.get(i));
                obj2 = sb7.toString();
            }
        }
        if (this.MediaBrowserCompat$SearchResultReceiver.size() > 0) {
            for (int i2 = 0; i2 < this.MediaBrowserCompat$SearchResultReceiver.size(); i2++) {
                if (i2 > 0) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(obj2);
                    sb8.append(", ");
                    obj2 = sb8.toString();
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(obj2);
                sb9.append(this.MediaBrowserCompat$SearchResultReceiver.get(i2));
                obj2 = sb9.toString();
            }
        }
        StringBuilder sb10 = new StringBuilder();
        sb10.append(obj2);
        sb10.append(")");
        return sb10.toString();
    }

    /* renamed from: o.BetterViewPager$read */
    static class read {
        View IconCompatParcelizer;
        String MediaBrowserCompat$CustomActionResultReceiver;
        setChildrenDrawingOrderEnabledCompat MediaBrowserCompat$ItemReceiver;
        BetterViewPager read;
        CheckExtractActivity_MembersInjector write;

        read(View view, String str, BetterViewPager betterViewPager, CheckExtractActivity_MembersInjector checkExtractActivity_MembersInjector, setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat) {
            this.IconCompatParcelizer = view;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.MediaBrowserCompat$ItemReceiver = setchildrendrawingorderenabledcompat;
            this.write = checkExtractActivity_MembersInjector;
            this.read = betterViewPager;
        }
    }
}

package p040o;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: o.setCardBackgroundColor */
final class setCardBackgroundColor {
    private static final setContentPadding MediaBrowserCompat$CustomActionResultReceiver = (Build.VERSION.SDK_INT >= 21 ? new setMaxCardElevation() : null);
    private static final setContentPadding MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver();
    private static final int[] read = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    private static setContentPadding MediaBrowserCompat$ItemReceiver() {
        try {
            return (setContentPadding) Class.forName("o.setStatusBarBackgroundResource").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e1, code lost:
        if (r8 != null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0192, code lost:
        r3 = r18;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void IconCompatParcelizer(p040o.setLayoutResource r30, java.util.ArrayList<p040o.setTitleMarginEnd> r31, java.util.ArrayList<java.lang.Boolean> r32, int r33, int r34, boolean r35) {
        /*
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r34
            r4 = r35
            int r5 = r0.write
            if (r5 > 0) goto L_0x000f
            return
        L_0x000f:
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            r6 = r33
        L_0x0016:
            if (r6 >= r3) goto L_0x0034
            java.lang.Object r7 = r1.get(r6)
            o.setTitleMarginEnd r7 = (p040o.setTitleMarginEnd) r7
            java.lang.Object r8 = r2.get(r6)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x002e
            IconCompatParcelizer(r7, r5, r4)
            goto L_0x0031
        L_0x002e:
            MediaBrowserCompat$CustomActionResultReceiver(r7, r5, r4)
        L_0x0031:
            int r6 = r6 + 1
            goto L_0x0016
        L_0x0034:
            int r6 = r5.size()
            if (r6 == 0) goto L_0x026d
            android.view.View r6 = new android.view.View
            o.setTitleMarginTop r7 = r0.MediaDescriptionCompat
            android.content.Context r7 = r7.IconCompatParcelizer
            r6.<init>(r7)
            int r15 = r5.size()
            r13 = 0
        L_0x0048:
            if (r13 >= r15) goto L_0x026d
            int r7 = r5.keyAt(r13)
            r12 = r33
            o.setTextAppearance r11 = write(r7, r1, r2, r12, r3)
            java.lang.Object r8 = r5.valueAt(r13)
            r10 = r8
            o.setCardBackgroundColor$write r10 = (p040o.setCardBackgroundColor.write) r10
            r16 = 0
            if (r4 == 0) goto L_0x0171
            o.ViewStubCompat r8 = r0.read
            boolean r8 = r8.IconCompatParcelizer()
            if (r8 == 0) goto L_0x0071
            o.ViewStubCompat r8 = r0.read
            android.view.View r7 = r8.read(r7)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r9 = r7
            goto L_0x0073
        L_0x0071:
            r9 = r16
        L_0x0073:
            if (r9 == 0) goto L_0x0166
            androidx.fragment.app.Fragment r8 = r10.IconCompatParcelizer
            androidx.fragment.app.Fragment r7 = r10.write
            o.setContentPadding r1 = MediaBrowserCompat$CustomActionResultReceiver(r7, r8)
            if (r1 == 0) goto L_0x0166
            boolean r2 = r10.MediaBrowserCompat$ItemReceiver
            boolean r14 = r10.read
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r8 != 0) goto L_0x0094
            r25 = r5
            r5 = r16
            goto L_0x00a7
        L_0x0094:
            if (r2 == 0) goto L_0x009b
            java.lang.Object r18 = r8.getReenterTransition()
            goto L_0x009f
        L_0x009b:
            java.lang.Object r18 = r8.getEnterTransition()
        L_0x009f:
            r25 = r5
            r5 = r18
            java.lang.Object r5 = r1.MediaBrowserCompat$CustomActionResultReceiver(r5)
        L_0x00a7:
            if (r7 != 0) goto L_0x00ad
        L_0x00a9:
            r0 = r7
            r14 = r16
            goto L_0x00bd
        L_0x00ad:
            if (r14 == 0) goto L_0x00b4
            java.lang.Object r14 = r7.getReturnTransition()
            goto L_0x00b8
        L_0x00b4:
            java.lang.Object r14 = r7.getExitTransition()
        L_0x00b8:
            java.lang.Object r16 = r1.MediaBrowserCompat$CustomActionResultReceiver(r14)
            goto L_0x00a9
        L_0x00bd:
            r7 = r1
            r22 = r2
            r2 = r8
            r8 = r9
            r26 = r9
            r9 = r6
            r18 = r10
            r10 = r11
            r27 = r11
            r11 = r18
            r12 = r4
            r28 = r13
            r13 = r3
            r16 = r14
            r14 = r5
            r29 = r15
            r15 = r16
            java.lang.Object r7 = MediaBrowserCompat$CustomActionResultReceiver(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r5 != 0) goto L_0x00e4
            if (r7 != 0) goto L_0x00e4
            r8 = r16
            if (r8 == 0) goto L_0x016c
            goto L_0x00e6
        L_0x00e4:
            r8 = r16
        L_0x00e6:
            java.util.ArrayList r9 = read(r1, r8, r0, r4, r6)
            java.util.ArrayList r10 = read(r1, r5, r2, r3, r6)
            r11 = 4
            MediaBrowserCompat$ItemReceiver(r10, r11)
            r17 = r1
            r18 = r5
            r19 = r8
            r20 = r7
            r21 = r2
            java.lang.Object r2 = MediaBrowserCompat$CustomActionResultReceiver(r17, r18, r19, r20, r21, r22)
            if (r2 == 0) goto L_0x016c
            if (r0 == 0) goto L_0x0133
            if (r8 == 0) goto L_0x0133
            boolean r11 = r0.mAdded
            if (r11 == 0) goto L_0x0133
            boolean r11 = r0.mHidden
            if (r11 == 0) goto L_0x0133
            boolean r11 = r0.mHiddenChanged
            if (r11 == 0) goto L_0x0133
            r11 = 1
            r0.setHideReplaced(r11)
            android.view.View r11 = r0.getView()
            r1.read((java.lang.Object) r8, (android.view.View) r11, (java.util.ArrayList<android.view.View>) r9)
            android.view.ViewGroup r0 = r0.mContainer
            o.setCardBackgroundColor$4 r11 = new o.setCardBackgroundColor$4
            r11.<init>(r9)
            o.setBackgroundDrawable$MediaBrowserCompat$CustomActionResultReceiver r12 = new o.setBackgroundDrawable$MediaBrowserCompat$CustomActionResultReceiver
            r12.<init>(r0, r11)
            android.view.ViewTreeObserver r11 = r0.getViewTreeObserver()
            r11.addOnPreDrawListener(r12)
            r0.addOnAttachStateChangeListener(r12)
        L_0x0133:
            java.util.ArrayList r0 = r1.write((java.util.ArrayList<android.view.View>) r3)
            r17 = r1
            r18 = r2
            r19 = r5
            r20 = r10
            r21 = r8
            r22 = r9
            r23 = r7
            r24 = r3
            r17.write(r18, r19, r20, r21, r22, r23, r24)
            r5 = r26
            r1.MediaBrowserCompat$ItemReceiver((android.view.ViewGroup) r5, (java.lang.Object) r2)
            r16 = r1
            r17 = r5
            r18 = r4
            r19 = r3
            r20 = r0
            r21 = r27
            r16.IconCompatParcelizer(r17, r18, r19, r20, r21)
            r0 = 0
            MediaBrowserCompat$ItemReceiver(r10, r0)
            r1.read((java.lang.Object) r7, (java.util.ArrayList<android.view.View>) r4, (java.util.ArrayList<android.view.View>) r3)
            goto L_0x016d
        L_0x0166:
            r25 = r5
            r28 = r13
            r29 = r15
        L_0x016c:
            r0 = 0
        L_0x016d:
            r1 = r30
            goto L_0x025c
        L_0x0171:
            r1 = r0
            r25 = r5
            r18 = r10
            r27 = r11
            r28 = r13
            r29 = r15
            r0 = 0
            o.ViewStubCompat r2 = r1.read
            boolean r2 = r2.IconCompatParcelizer()
            if (r2 == 0) goto L_0x018e
            o.ViewStubCompat r2 = r1.read
            android.view.View r2 = r2.read(r7)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L_0x0190
        L_0x018e:
            r2 = r16
        L_0x0190:
            if (r2 == 0) goto L_0x025c
            r3 = r18
            androidx.fragment.app.Fragment r4 = r3.IconCompatParcelizer
            androidx.fragment.app.Fragment r5 = r3.write
            o.setContentPadding r15 = MediaBrowserCompat$CustomActionResultReceiver(r5, r4)
            if (r15 == 0) goto L_0x025c
            boolean r7 = r3.MediaBrowserCompat$ItemReceiver
            boolean r8 = r3.read
            if (r4 != 0) goto L_0x01a7
            r14 = r16
            goto L_0x01b7
        L_0x01a7:
            if (r7 == 0) goto L_0x01ae
            java.lang.Object r7 = r4.getReenterTransition()
            goto L_0x01b2
        L_0x01ae:
            java.lang.Object r7 = r4.getEnterTransition()
        L_0x01b2:
            java.lang.Object r7 = r15.MediaBrowserCompat$CustomActionResultReceiver(r7)
            r14 = r7
        L_0x01b7:
            if (r5 != 0) goto L_0x01bc
            r13 = r16
            goto L_0x01cc
        L_0x01bc:
            if (r8 == 0) goto L_0x01c3
            java.lang.Object r7 = r5.getReturnTransition()
            goto L_0x01c7
        L_0x01c3:
            java.lang.Object r7 = r5.getExitTransition()
        L_0x01c7:
            java.lang.Object r7 = r15.MediaBrowserCompat$CustomActionResultReceiver(r7)
            r13 = r7
        L_0x01cc:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r7 = r15
            r8 = r2
            r9 = r6
            r10 = r27
            r17 = r11
            r11 = r3
            r18 = r12
            r19 = r13
            r13 = r17
            r20 = r14
            r0 = r15
            r15 = r19
            java.lang.Object r13 = IconCompatParcelizer(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r15 = r20
            if (r15 != 0) goto L_0x01f8
            if (r13 != 0) goto L_0x01f8
            r7 = r19
            if (r7 == 0) goto L_0x025c
            goto L_0x01fa
        L_0x01f8:
            r7 = r19
        L_0x01fa:
            r8 = r18
            java.util.ArrayList r5 = read(r0, r7, r5, r8, r6)
            if (r5 == 0) goto L_0x020b
            boolean r8 = r5.isEmpty()
            if (r8 == 0) goto L_0x0209
            goto L_0x020b
        L_0x0209:
            r16 = r7
        L_0x020b:
            r0.read((java.lang.Object) r15, (android.view.View) r6)
            boolean r12 = r3.MediaBrowserCompat$ItemReceiver
            r7 = r0
            r8 = r15
            r9 = r16
            r10 = r13
            r11 = r4
            java.lang.Object r3 = MediaBrowserCompat$CustomActionResultReceiver(r7, r8, r9, r10, r11, r12)
            if (r3 == 0) goto L_0x025c
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            r7 = r0
            r8 = r3
            r9 = r15
            r10 = r18
            r11 = r16
            r12 = r5
            r14 = r17
            r7.write(r8, r9, r10, r11, r12, r13, r14)
            o.setCardBackgroundColor$2 r14 = new o.setCardBackgroundColor$2
            r7 = r14
            r8 = r15
            r9 = r0
            r10 = r6
            r11 = r4
            r12 = r17
            r13 = r18
            r4 = r14
            r14 = r5
            r15 = r16
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            o.setBackgroundDrawable$MediaBrowserCompat$CustomActionResultReceiver r5 = new o.setBackgroundDrawable$MediaBrowserCompat$CustomActionResultReceiver
            r5.<init>(r2, r4)
            android.view.ViewTreeObserver r4 = r2.getViewTreeObserver()
            r4.addOnPreDrawListener(r5)
            r2.addOnAttachStateChangeListener(r5)
            r5 = r17
            r4 = r27
            r0.write(r2, r5, r4)
            r0.MediaBrowserCompat$ItemReceiver((android.view.ViewGroup) r2, (java.lang.Object) r3)
            r0.MediaBrowserCompat$ItemReceiver((android.view.ViewGroup) r2, (java.util.ArrayList<android.view.View>) r5, (java.util.Map<java.lang.String, java.lang.String>) r4)
        L_0x025c:
            int r13 = r28 + 1
            r2 = r32
            r3 = r34
            r4 = r35
            r0 = r1
            r5 = r25
            r15 = r29
            r1 = r31
            goto L_0x0048
        L_0x026d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setCardBackgroundColor.IconCompatParcelizer(o.setLayoutResource, java.util.ArrayList, java.util.ArrayList, int, int, boolean):void");
    }

    private static setTextAppearance<String, String> write(int i, ArrayList<setTitleMarginEnd> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        setTextAppearance<String, String> settextappearance = new setTextAppearance<>();
        while (true) {
            i3--;
            if (i3 < i2) {
                return settextappearance;
            }
            setTitleMarginEnd settitlemarginend = arrayList.get(i3);
            if (settitlemarginend.read(i)) {
                boolean booleanValue = arrayList2.get(i3).booleanValue();
                if (settitlemarginend.MediaSessionCompat$Token != null) {
                    int size = settitlemarginend.MediaSessionCompat$Token.size();
                    if (booleanValue) {
                        arrayList3 = settitlemarginend.MediaSessionCompat$Token;
                        arrayList4 = settitlemarginend.PlaybackStateCompat$CustomAction;
                    } else {
                        ArrayList<String> arrayList5 = settitlemarginend.MediaSessionCompat$Token;
                        arrayList3 = settitlemarginend.PlaybackStateCompat$CustomAction;
                        arrayList4 = arrayList5;
                    }
                    for (int i4 = 0; i4 < size; i4++) {
                        String str = arrayList4.get(i4);
                        String str2 = arrayList3.get(i4);
                        String remove = settextappearance.remove(str2);
                        if (remove != null) {
                            settextappearance.put(str, remove);
                        } else {
                            settextappearance.put(str, str2);
                        }
                    }
                }
            }
        }
    }

    private static setContentPadding MediaBrowserCompat$CustomActionResultReceiver(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        setContentPadding setcontentpadding = MediaBrowserCompat$CustomActionResultReceiver;
        if (setcontentpadding != null && IconCompatParcelizer(setcontentpadding, (List<Object>) arrayList)) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        setContentPadding setcontentpadding2 = MediaBrowserCompat$ItemReceiver;
        if (setcontentpadding2 != null && IconCompatParcelizer(setcontentpadding2, (List<Object>) arrayList)) {
            return MediaBrowserCompat$ItemReceiver;
        }
        if (MediaBrowserCompat$CustomActionResultReceiver == null && MediaBrowserCompat$ItemReceiver == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    private static boolean IconCompatParcelizer(setContentPadding setcontentpadding, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!setcontentpadding.MediaBrowserCompat$ItemReceiver(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static Object read(setContentPadding setcontentpadding, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            obj = fragment2.getSharedElementReturnTransition();
        } else {
            obj = fragment.getSharedElementEnterTransition();
        }
        return setcontentpadding.write(setcontentpadding.MediaBrowserCompat$CustomActionResultReceiver(obj));
    }

    private static Object MediaBrowserCompat$CustomActionResultReceiver(setContentPadding setcontentpadding, ViewGroup viewGroup, View view, setTextAppearance<String, String> settextappearance, write write2, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        final Rect rect;
        final View view2;
        setContentPadding setcontentpadding2 = setcontentpadding;
        ViewGroup viewGroup2 = viewGroup;
        View view3 = view;
        setTextAppearance<String, String> settextappearance2 = settextappearance;
        write write3 = write2;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj5 = obj;
        Fragment fragment = write3.IconCompatParcelizer;
        Fragment fragment2 = write3.write;
        if (fragment != null) {
            fragment.getView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = write3.MediaBrowserCompat$ItemReceiver;
        if (settextappearance.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = read(setcontentpadding2, fragment, fragment2, z);
        }
        setTextAppearance<String, View> IconCompatParcelizer = IconCompatParcelizer(setcontentpadding2, settextappearance2, obj3, write3);
        setTextAppearance<String, View> MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(setcontentpadding2, settextappearance2, obj3, write3);
        if (settextappearance.isEmpty()) {
            if (IconCompatParcelizer != null) {
                IconCompatParcelizer.clear();
            }
            if (MediaBrowserCompat$ItemReceiver2 != null) {
                MediaBrowserCompat$ItemReceiver2.clear();
            }
            obj4 = null;
        } else {
            write(arrayList3, IconCompatParcelizer, settextappearance.keySet());
            write(arrayList4, MediaBrowserCompat$ItemReceiver2, settextappearance.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        read(fragment, fragment2, z, IconCompatParcelizer);
        if (obj4 != null) {
            arrayList4.add(view3);
            setcontentpadding2.MediaBrowserCompat$ItemReceiver(obj4, view3, arrayList3);
            IconCompatParcelizer(setcontentpadding, obj4, obj2, IconCompatParcelizer, write3.read, write3.MediaBrowserCompat$CustomActionResultReceiver);
            Rect rect2 = new Rect();
            View IconCompatParcelizer2 = IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2, write3, obj5, z);
            if (IconCompatParcelizer2 != null) {
                setcontentpadding2.read(obj5, rect2);
            }
            rect = rect2;
            view2 = IconCompatParcelizer2;
        } else {
            view2 = null;
            rect = null;
        }
        final Fragment fragment3 = fragment;
        final Fragment fragment4 = fragment2;
        final boolean z2 = z;
        final setTextAppearance<String, View> settextappearance3 = MediaBrowserCompat$ItemReceiver2;
        final setContentPadding setcontentpadding3 = setcontentpadding;
        C1454x8d0f0ffb setbackgrounddrawable_mediabrowsercompat_customactionresultreceiver = new C1454x8d0f0ffb(viewGroup2, new Runnable() {
            public final void run() {
                setCardBackgroundColor.read(fragment3, fragment4, z2, (setTextAppearance<String, View>) settextappearance3);
                View view = view2;
                if (view != null) {
                    setcontentpadding3.write(view, rect);
                }
            }
        });
        viewGroup.getViewTreeObserver().addOnPreDrawListener(setbackgrounddrawable_mediabrowsercompat_customactionresultreceiver);
        viewGroup2.addOnAttachStateChangeListener(setbackgrounddrawable_mediabrowsercompat_customactionresultreceiver);
        return obj4;
    }

    private static void write(ArrayList<View> arrayList, setTextAppearance<String, View> settextappearance, Collection<String> collection) {
        for (int size = settextappearance.size() - 1; size >= 0; size--) {
            View view = (View) settextappearance.read[(size << 1) + 1];
            if (collection.contains(SwitchCompat.Keep(view))) {
                arrayList.add(view);
            }
        }
    }

    private static Object IconCompatParcelizer(setContentPadding setcontentpadding, ViewGroup viewGroup, View view, setTextAppearance<String, String> settextappearance, write write2, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        setTextAppearance<String, String> settextappearance2;
        Object obj3;
        Object obj4;
        Rect rect;
        setContentPadding setcontentpadding2 = setcontentpadding;
        ViewGroup viewGroup2 = viewGroup;
        write write3 = write2;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = write3.IconCompatParcelizer;
        Fragment fragment2 = write3.write;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = write3.MediaBrowserCompat$ItemReceiver;
        if (settextappearance.isEmpty()) {
            settextappearance2 = settextappearance;
            obj3 = null;
        } else {
            obj3 = read(setcontentpadding2, fragment, fragment2, z);
            settextappearance2 = settextappearance;
        }
        setTextAppearance<String, View> IconCompatParcelizer = IconCompatParcelizer(setcontentpadding2, settextappearance2, obj3, write3);
        if (settextappearance.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(IconCompatParcelizer.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        read(fragment, fragment2, z, IconCompatParcelizer);
        if (obj4 != null) {
            Rect rect2 = new Rect();
            setcontentpadding2.MediaBrowserCompat$ItemReceiver(obj4, view, arrayList3);
            boolean z2 = write3.read;
            setTitleMarginEnd settitlemarginend = write3.MediaBrowserCompat$CustomActionResultReceiver;
            Rect rect3 = rect2;
            IconCompatParcelizer(setcontentpadding, obj4, obj2, IconCompatParcelizer, z2, settitlemarginend);
            if (obj5 != null) {
                setcontentpadding2.read(obj5, rect3);
            }
            rect = rect3;
        } else {
            rect = null;
        }
        final setContentPadding setcontentpadding3 = setcontentpadding;
        final setTextAppearance<String, String> settextappearance3 = settextappearance;
        final Object obj6 = obj4;
        final write write4 = write2;
        final ArrayList<View> arrayList4 = arrayList2;
        final View view2 = view;
        C14613 r14 = r0;
        final Fragment fragment3 = fragment;
        final Fragment fragment4 = fragment2;
        final boolean z3 = z;
        final ArrayList<View> arrayList5 = arrayList;
        final Object obj7 = obj;
        final Rect rect4 = rect;
        C14613 r0 = new Runnable() {
            public final void run() {
                setTextAppearance<String, View> MediaBrowserCompat$ItemReceiver2 = setCardBackgroundColor.MediaBrowserCompat$ItemReceiver(setcontentpadding3, settextappearance3, obj6, write4);
                if (MediaBrowserCompat$ItemReceiver2 != null) {
                    arrayList4.addAll(MediaBrowserCompat$ItemReceiver2.values());
                    arrayList4.add(view2);
                }
                setCardBackgroundColor.read(fragment3, fragment4, z3, MediaBrowserCompat$ItemReceiver2);
                Object obj = obj6;
                if (obj != null) {
                    setcontentpadding3.read(obj, (ArrayList<View>) arrayList5, (ArrayList<View>) arrayList4);
                    View IconCompatParcelizer2 = setCardBackgroundColor.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2, write4, obj7, z3);
                    if (IconCompatParcelizer2 != null) {
                        setcontentpadding3.write(IconCompatParcelizer2, rect4);
                    }
                }
            }
        };
        C1454x8d0f0ffb setbackgrounddrawable_mediabrowsercompat_customactionresultreceiver = new C1454x8d0f0ffb(viewGroup2, r14);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(setbackgrounddrawable_mediabrowsercompat_customactionresultreceiver);
        viewGroup2.addOnAttachStateChangeListener(setbackgrounddrawable_mediabrowsercompat_customactionresultreceiver);
        return obj4;
    }

    private static setTextAppearance<String, View> IconCompatParcelizer(setContentPadding setcontentpadding, setTextAppearance<String, String> settextappearance, Object obj, write write2) {
        setPrompt setprompt;
        ArrayList<String> arrayList;
        if (settextappearance.isEmpty() || obj == null) {
            settextappearance.clear();
            return null;
        }
        Fragment fragment = write2.write;
        setTextAppearance<String, View> settextappearance2 = new setTextAppearance<>();
        setcontentpadding.MediaBrowserCompat$ItemReceiver((Map<String, View>) settextappearance2, fragment.getView());
        setTitleMarginEnd settitlemarginend = write2.MediaBrowserCompat$CustomActionResultReceiver;
        if (write2.read) {
            setprompt = fragment.getEnterTransitionCallback();
            arrayList = settitlemarginend.PlaybackStateCompat$CustomAction;
        } else {
            setprompt = fragment.getExitTransitionCallback();
            arrayList = settitlemarginend.MediaSessionCompat$Token;
        }
        setSupportButtonTintList.write(settextappearance2, arrayList);
        if (setprompt != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = settextappearance2.get(str);
                if (view == null) {
                    settextappearance.remove(str);
                } else if (!str.equals(SwitchCompat.Keep(view))) {
                    settextappearance.put(SwitchCompat.Keep(view), settextappearance.remove(str));
                }
            }
        } else {
            setSupportButtonTintList.write(settextappearance, settextappearance2.keySet());
        }
        return settextappearance2;
    }

    static setTextAppearance<String, View> MediaBrowserCompat$ItemReceiver(setContentPadding setcontentpadding, setTextAppearance<String, String> settextappearance, Object obj, write write2) {
        setPrompt setprompt;
        ArrayList<String> arrayList;
        String IconCompatParcelizer;
        Fragment fragment = write2.IconCompatParcelizer;
        View view = fragment.getView();
        if (settextappearance.isEmpty() || obj == null || view == null) {
            settextappearance.clear();
            return null;
        }
        setTextAppearance<String, View> settextappearance2 = new setTextAppearance<>();
        setcontentpadding.MediaBrowserCompat$ItemReceiver((Map<String, View>) settextappearance2, view);
        setTitleMarginEnd settitlemarginend = write2.MediaMetadataCompat;
        if (write2.MediaBrowserCompat$ItemReceiver) {
            setprompt = fragment.getExitTransitionCallback();
            arrayList = settitlemarginend.MediaSessionCompat$Token;
        } else {
            setprompt = fragment.getEnterTransitionCallback();
            arrayList = settitlemarginend.PlaybackStateCompat$CustomAction;
        }
        if (arrayList != null) {
            setSupportButtonTintList.write(settextappearance2, arrayList);
            setSupportButtonTintList.write(settextappearance2, settextappearance.values());
        }
        if (setprompt != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view2 = settextappearance2.get(str);
                if (view2 == null) {
                    String IconCompatParcelizer2 = IconCompatParcelizer(settextappearance, str);
                    if (IconCompatParcelizer2 != null) {
                        settextappearance.remove(IconCompatParcelizer2);
                    }
                } else if (!str.equals(SwitchCompat.Keep(view2)) && (IconCompatParcelizer = IconCompatParcelizer(settextappearance, str)) != null) {
                    settextappearance.put(IconCompatParcelizer, SwitchCompat.Keep(view2));
                }
            }
        } else {
            for (int size2 = settextappearance.size() - 1; size2 >= 0; size2--) {
                if (!settextappearance2.containsKey((String) settextappearance.read[(size2 << 1) + 1])) {
                    settextappearance.write(size2);
                }
            }
        }
        return settextappearance2;
    }

    private static String IconCompatParcelizer(setTextAppearance<String, String> settextappearance, String str) {
        int size = settextappearance.size();
        for (int i = 0; i < size; i++) {
            int i2 = i << 1;
            if (str.equals(settextappearance.read[i2 + 1])) {
                return (String) settextappearance.read[i2];
            }
        }
        return null;
    }

    static View IconCompatParcelizer(setTextAppearance<String, View> settextappearance, write write2, Object obj, boolean z) {
        String str;
        setTitleMarginEnd settitlemarginend = write2.MediaMetadataCompat;
        if (obj == null || settextappearance == null || settitlemarginend.MediaSessionCompat$Token == null || settitlemarginend.MediaSessionCompat$Token.isEmpty()) {
            return null;
        }
        if (z) {
            str = settitlemarginend.MediaSessionCompat$Token.get(0);
        } else {
            str = settitlemarginend.PlaybackStateCompat$CustomAction.get(0);
        }
        return settextappearance.get(str);
    }

    private static void IconCompatParcelizer(setContentPadding setcontentpadding, Object obj, Object obj2, setTextAppearance<String, View> settextappearance, boolean z, setTitleMarginEnd settitlemarginend) {
        String str;
        if (settitlemarginend.MediaSessionCompat$Token != null && !settitlemarginend.MediaSessionCompat$Token.isEmpty()) {
            if (z) {
                str = settitlemarginend.PlaybackStateCompat$CustomAction.get(0);
            } else {
                str = settitlemarginend.MediaSessionCompat$Token.get(0);
            }
            View view = settextappearance.get(str);
            setcontentpadding.write(obj, view);
            if (obj2 != null) {
                setcontentpadding.write(obj2, view);
            }
        }
    }

    static void read(Fragment fragment, Fragment fragment2, boolean z, setTextAppearance<String, View> settextappearance) {
        setPrompt setprompt;
        int i;
        if (z) {
            setprompt = fragment2.getEnterTransitionCallback();
        } else {
            setprompt = fragment.getEnterTransitionCallback();
        }
        if (setprompt != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (settextappearance == null) {
                i = 0;
            } else {
                i = settextappearance.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 << 1;
                arrayList2.add(settextappearance.read[i3]);
                arrayList.add(settextappearance.read[i3 + 1]);
            }
        }
    }

    static ArrayList<View> read(setContentPadding setcontentpadding, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            setcontentpadding.read(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        setcontentpadding.IconCompatParcelizer(obj, arrayList2);
        return arrayList2;
    }

    static void MediaBrowserCompat$ItemReceiver(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    private static Object MediaBrowserCompat$CustomActionResultReceiver(setContentPadding setcontentpadding, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2;
        if (obj == null || obj2 == null || fragment == null) {
            z2 = true;
        } else {
            z2 = z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        }
        if (z2) {
            return setcontentpadding.IconCompatParcelizer(obj2, obj, obj3);
        }
        return setcontentpadding.MediaBrowserCompat$ItemReceiver(obj2, obj, obj3);
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(setTitleMarginEnd settitlemarginend, SparseArray<write> sparseArray, boolean z) {
        int size = settitlemarginend.ParcelableVolumeInfo.size();
        for (int i = 0; i < size; i++) {
            MediaBrowserCompat$ItemReceiver(settitlemarginend, settitlemarginend.ParcelableVolumeInfo.get(i), sparseArray, false, z);
        }
    }

    private static void IconCompatParcelizer(setTitleMarginEnd settitlemarginend, SparseArray<write> sparseArray, boolean z) {
        if (settitlemarginend.MediaMetadataCompat.read.IconCompatParcelizer()) {
            for (int size = settitlemarginend.ParcelableVolumeInfo.size() - 1; size >= 0; size--) {
                MediaBrowserCompat$ItemReceiver(settitlemarginend, settitlemarginend.ParcelableVolumeInfo.get(size), sparseArray, true, z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0039, code lost:
        if (r6.mAdded != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x007a, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x008c, code lost:
        if (r6.mHidden == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008e, code lost:
        r12 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void MediaBrowserCompat$ItemReceiver(p040o.setTitleMarginEnd r11, p040o.setTitleMarginEnd.write r12, android.util.SparseArray<p040o.setCardBackgroundColor.write> r13, boolean r14, boolean r15) {
        /*
            androidx.fragment.app.Fragment r6 = r12.MediaBrowserCompat$CustomActionResultReceiver
            if (r6 != 0) goto L_0x0005
            return
        L_0x0005:
            int r7 = r6.mContainerId
            if (r7 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r14 == 0) goto L_0x0013
            int[] r0 = read
            int r12 = r12.read
            r12 = r0[r12]
            goto L_0x0015
        L_0x0013:
            int r12 = r12.read
        L_0x0015:
            r0 = 1
            r1 = 0
            if (r12 == r0) goto L_0x0081
            r2 = 3
            if (r12 == r2) goto L_0x0058
            r2 = 4
            if (r12 == r2) goto L_0x0040
            r2 = 5
            if (r12 == r2) goto L_0x002d
            r2 = 6
            if (r12 == r2) goto L_0x0058
            r2 = 7
            if (r12 == r2) goto L_0x0081
            r12 = r1
            r0 = r12
            r8 = r0
            goto L_0x0094
        L_0x002d:
            if (r15 == 0) goto L_0x003c
            boolean r12 = r6.mHiddenChanged
            if (r12 == 0) goto L_0x0090
            boolean r12 = r6.mHidden
            if (r12 != 0) goto L_0x0090
            boolean r12 = r6.mAdded
            if (r12 == 0) goto L_0x0090
            goto L_0x008e
        L_0x003c:
            boolean r12 = r6.mHidden
            goto L_0x0091
        L_0x0040:
            if (r15 == 0) goto L_0x004f
            boolean r12 = r6.mHiddenChanged
            if (r12 == 0) goto L_0x007c
            boolean r12 = r6.mAdded
            if (r12 == 0) goto L_0x007c
            boolean r12 = r6.mHidden
            if (r12 == 0) goto L_0x007c
            goto L_0x007a
        L_0x004f:
            boolean r12 = r6.mAdded
            if (r12 == 0) goto L_0x007c
            boolean r12 = r6.mHidden
            if (r12 != 0) goto L_0x007c
            goto L_0x007a
        L_0x0058:
            if (r15 == 0) goto L_0x0072
            boolean r12 = r6.mAdded
            if (r12 != 0) goto L_0x007c
            android.view.View r12 = r6.mView
            if (r12 == 0) goto L_0x007c
            android.view.View r12 = r6.mView
            int r12 = r12.getVisibility()
            if (r12 != 0) goto L_0x007c
            float r12 = r6.mPostponedAlpha
            r2 = 0
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 < 0) goto L_0x007c
            goto L_0x007a
        L_0x0072:
            boolean r12 = r6.mAdded
            if (r12 == 0) goto L_0x007c
            boolean r12 = r6.mHidden
            if (r12 != 0) goto L_0x007c
        L_0x007a:
            r12 = r0
            goto L_0x007d
        L_0x007c:
            r12 = r1
        L_0x007d:
            r8 = r12
            r12 = r0
            r0 = r1
            goto L_0x0094
        L_0x0081:
            if (r15 == 0) goto L_0x0086
            boolean r12 = r6.mIsNewlyAdded
            goto L_0x0091
        L_0x0086:
            boolean r12 = r6.mAdded
            if (r12 != 0) goto L_0x0090
            boolean r12 = r6.mHidden
            if (r12 != 0) goto L_0x0090
        L_0x008e:
            r12 = r0
            goto L_0x0091
        L_0x0090:
            r12 = r1
        L_0x0091:
            r8 = r1
            r1 = r12
            r12 = r8
        L_0x0094:
            java.lang.Object r2 = r13.get(r7)
            o.setCardBackgroundColor$write r2 = (p040o.setCardBackgroundColor.write) r2
            if (r1 == 0) goto L_0x00ac
            if (r2 != 0) goto L_0x00a6
            o.setCardBackgroundColor$write r2 = new o.setCardBackgroundColor$write
            r2.<init>()
            r13.put(r7, r2)
        L_0x00a6:
            r2.IconCompatParcelizer = r6
            r2.MediaBrowserCompat$ItemReceiver = r14
            r2.MediaMetadataCompat = r11
        L_0x00ac:
            r9 = r2
            r10 = 0
            if (r15 != 0) goto L_0x00d3
            if (r0 == 0) goto L_0x00d3
            if (r9 == 0) goto L_0x00ba
            androidx.fragment.app.Fragment r0 = r9.write
            if (r0 != r6) goto L_0x00ba
            r9.write = r10
        L_0x00ba:
            o.setLayoutResource r0 = r11.MediaMetadataCompat
            int r1 = r6.mState
            if (r1 > 0) goto L_0x00d3
            int r1 = r0.write
            if (r1 <= 0) goto L_0x00d3
            boolean r1 = r11.MediaSessionCompat$QueueItem
            if (r1 != 0) goto L_0x00d3
            r0.IconCompatParcelizer((androidx.fragment.app.Fragment) r6)
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r6
            r0.IconCompatParcelizer((androidx.fragment.app.Fragment) r1, (int) r2, (int) r3, (int) r4, (boolean) r5)
        L_0x00d3:
            if (r8 == 0) goto L_0x00ec
            if (r9 == 0) goto L_0x00db
            androidx.fragment.app.Fragment r0 = r9.write
            if (r0 != 0) goto L_0x00ec
        L_0x00db:
            if (r9 != 0) goto L_0x00e6
            o.setCardBackgroundColor$write r0 = new o.setCardBackgroundColor$write
            r0.<init>()
            r13.put(r7, r0)
            r9 = r0
        L_0x00e6:
            r9.write = r6
            r9.read = r14
            r9.MediaBrowserCompat$CustomActionResultReceiver = r11
        L_0x00ec:
            if (r15 != 0) goto L_0x00f8
            if (r12 == 0) goto L_0x00f8
            if (r9 == 0) goto L_0x00f8
            androidx.fragment.app.Fragment r11 = r9.IconCompatParcelizer
            if (r11 != r6) goto L_0x00f8
            r9.IconCompatParcelizer = r10
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setCardBackgroundColor.MediaBrowserCompat$ItemReceiver(o.setTitleMarginEnd, o.setTitleMarginEnd$write, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: o.setCardBackgroundColor$write */
    static class write {
        public Fragment IconCompatParcelizer;
        public setTitleMarginEnd MediaBrowserCompat$CustomActionResultReceiver;
        public boolean MediaBrowserCompat$ItemReceiver;
        public setTitleMarginEnd MediaMetadataCompat;
        public boolean read;
        public Fragment write;

        write() {
        }
    }
}

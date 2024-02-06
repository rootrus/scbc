package p040o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import org.xmlpull.p042v1.XmlPullParser;

/* renamed from: o.getExtraData */
public final class getExtraData extends BetterViewPager {
    private static final Property<getExtraData$MediaBrowserCompat$CustomActionResultReceiver, PointF> MediaBrowserCompat$MediaItem = new Property<getExtraData$MediaBrowserCompat$CustomActionResultReceiver, PointF>(PointF.class, "bottomRight") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            getExtraData$MediaBrowserCompat$CustomActionResultReceiver getextradata_mediabrowsercompat_customactionresultreceiver = (getExtraData$MediaBrowserCompat$CustomActionResultReceiver) obj;
            PointF pointF = (PointF) obj2;
            getextradata_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver = Math.round(pointF.x);
            getextradata_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = Math.round(pointF.y);
            int i = getextradata_mediabrowsercompat_customactionresultreceiver.write + 1;
            getextradata_mediabrowsercompat_customactionresultreceiver.write = i;
            if (getextradata_mediabrowsercompat_customactionresultreceiver.MediaDescriptionCompat == i) {
                getextradata_mediabrowsercompat_customactionresultreceiver.write();
            }
        }
    };

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private static final String[] f2585x50fd9e4a = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<View, PointF> MediaDescriptionCompat = new Property<View, PointF>(PointF.class, "position") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            setFillViewport.MediaBrowserCompat$CustomActionResultReceiver(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    };
    private static final Property<View, PointF> MediaMetadataCompat = new Property<View, PointF>(PointF.class, "topLeft") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            setFillViewport.MediaBrowserCompat$CustomActionResultReceiver(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    };
    private static onCreate MediaSessionCompat$QueueItem = new onCreate();
    private static final Property<getExtraData$MediaBrowserCompat$CustomActionResultReceiver, PointF> MediaSessionCompat$Token = new Property<getExtraData$MediaBrowserCompat$CustomActionResultReceiver, PointF>(PointF.class, "topLeft") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            getExtraData$MediaBrowserCompat$CustomActionResultReceiver getextradata_mediabrowsercompat_customactionresultreceiver = (getExtraData$MediaBrowserCompat$CustomActionResultReceiver) obj;
            PointF pointF = (PointF) obj2;
            getextradata_mediabrowsercompat_customactionresultreceiver.read = Math.round(pointF.x);
            getextradata_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver = Math.round(pointF.y);
            int i = getextradata_mediabrowsercompat_customactionresultreceiver.MediaDescriptionCompat + 1;
            getextradata_mediabrowsercompat_customactionresultreceiver.MediaDescriptionCompat = i;
            if (i == getextradata_mediabrowsercompat_customactionresultreceiver.write) {
                getextradata_mediabrowsercompat_customactionresultreceiver.write();
            }
        }
    };
    private static final Property<View, PointF> RatingCompat = new Property<View, PointF>(PointF.class, "bottomRight") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            setFillViewport.MediaBrowserCompat$CustomActionResultReceiver(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    };
    private boolean ParcelableVolumeInfo = false;

    static {
        new Property<Drawable, PointF>(PointF.class, "boundsOrigin") {
            private Rect MediaBrowserCompat$CustomActionResultReceiver = new Rect();

            public final /* synthetic */ Object get(Object obj) {
                ((Drawable) obj).copyBounds(this.MediaBrowserCompat$CustomActionResultReceiver);
                return new PointF((float) this.MediaBrowserCompat$CustomActionResultReceiver.left, (float) this.MediaBrowserCompat$CustomActionResultReceiver.top);
            }

            public final /* synthetic */ void set(Object obj, Object obj2) {
                Drawable drawable = (Drawable) obj;
                PointF pointF = (PointF) obj2;
                drawable.copyBounds(this.MediaBrowserCompat$CustomActionResultReceiver);
                this.MediaBrowserCompat$CustomActionResultReceiver.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
                drawable.setBounds(this.MediaBrowserCompat$CustomActionResultReceiver);
            }
        };
    }

    public getExtraData() {
    }

    public getExtraData(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, onSaveInstanceState.MediaBrowserCompat$ItemReceiver);
        boolean read = AlertController$RecycleListView.read(obtainStyledAttributes, (XmlPullParser) (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        this.ParcelableVolumeInfo = read;
    }

    public final String[] MediaBrowserCompat$ItemReceiver() {
        return f2585x50fd9e4a;
    }

    private void MediaBrowserCompat$ItemReceiver(setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat) {
        View view = setchildrendrawingorderenabledcompat.MediaBrowserCompat$CustomActionResultReceiver;
        if (SwitchCompat.setCheckable(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            setchildrendrawingorderenabledcompat.MediaBrowserCompat$ItemReceiver.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            setchildrendrawingorderenabledcompat.MediaBrowserCompat$ItemReceiver.put("android:changeBounds:parent", setchildrendrawingorderenabledcompat.MediaBrowserCompat$CustomActionResultReceiver.getParent());
            if (this.ParcelableVolumeInfo) {
                setchildrendrawingorderenabledcompat.MediaBrowserCompat$ItemReceiver.put("android:changeBounds:clip", SwitchCompat.IconCompatParcelizer(view));
            }
        }
    }

    public final void read(setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat) {
        MediaBrowserCompat$ItemReceiver(setchildrendrawingorderenabledcompat);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat) {
        MediaBrowserCompat$ItemReceiver(setchildrendrawingorderenabledcompat);
    }

    public final Animator read(ViewGroup viewGroup, setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat, setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat2) {
        int i;
        boolean z;
        View view;
        Animator animator;
        ObjectAnimator objectAnimator;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator2;
        setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat3 = setchildrendrawingorderenabledcompat;
        setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat4 = setchildrendrawingorderenabledcompat2;
        if (setchildrendrawingorderenabledcompat3 == null || setchildrendrawingorderenabledcompat4 == null) {
            return null;
        }
        Map<String, Object> map = setchildrendrawingorderenabledcompat3.MediaBrowserCompat$ItemReceiver;
        Map<String, Object> map2 = setchildrendrawingorderenabledcompat4.MediaBrowserCompat$ItemReceiver;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = setchildrendrawingorderenabledcompat4.MediaBrowserCompat$CustomActionResultReceiver;
        Rect rect2 = (Rect) setchildrendrawingorderenabledcompat3.MediaBrowserCompat$ItemReceiver.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) setchildrendrawingorderenabledcompat4.MediaBrowserCompat$ItemReceiver.get("android:changeBounds:bounds");
        int i3 = rect2.left;
        int i4 = rect3.left;
        int i5 = rect2.top;
        int i6 = rect3.top;
        int i7 = rect2.right;
        int i8 = rect3.right;
        int i9 = rect2.bottom;
        int i10 = rect3.bottom;
        int i11 = i7 - i3;
        int i12 = i9 - i5;
        int i13 = i8 - i4;
        int i14 = i10 - i6;
        View view3 = view2;
        Rect rect4 = (Rect) setchildrendrawingorderenabledcompat3.MediaBrowserCompat$ItemReceiver.get("android:changeBounds:clip");
        Rect rect5 = (Rect) setchildrendrawingorderenabledcompat4.MediaBrowserCompat$ItemReceiver.get("android:changeBounds:clip");
        if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
            i = 0;
        } else {
            i = (i3 == i4 && i5 == i6) ? 0 : 1;
            if (!(i7 == i8 && i9 == i10)) {
                i++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i++;
        }
        int i15 = i;
        if (i15 <= 0) {
            return null;
        }
        Rect rect6 = rect5;
        Rect rect7 = rect4;
        if (!this.ParcelableVolumeInfo) {
            view = view3;
            setFillViewport.MediaBrowserCompat$CustomActionResultReceiver(view, i3, i5, i7, i9);
            if (i15 == 2) {
                if (i11 == i13 && i12 == i14) {
                    animator = AlertController$RecycleListView.IconCompatParcelizer(view, MediaDescriptionCompat, RatingCompat().IconCompatParcelizer((float) i3, (float) i5, (float) i4, (float) i6));
                } else {
                    final getExtraData$MediaBrowserCompat$CustomActionResultReceiver getextradata_mediabrowsercompat_customactionresultreceiver = new getExtraData$MediaBrowserCompat$CustomActionResultReceiver(view);
                    ObjectAnimator IconCompatParcelizer = AlertController$RecycleListView.IconCompatParcelizer(getextradata_mediabrowsercompat_customactionresultreceiver, MediaSessionCompat$Token, RatingCompat().IconCompatParcelizer((float) i3, (float) i5, (float) i4, (float) i6));
                    ObjectAnimator IconCompatParcelizer2 = AlertController$RecycleListView.IconCompatParcelizer(getextradata_mediabrowsercompat_customactionresultreceiver, MediaBrowserCompat$MediaItem, RatingCompat().IconCompatParcelizer((float) i7, (float) i9, (float) i8, (float) i10));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(new Animator[]{IconCompatParcelizer, IconCompatParcelizer2});
                    animatorSet.addListener(new AnimatorListenerAdapter() {
                        private getExtraData$MediaBrowserCompat$CustomActionResultReceiver mViewBounds = getextradata_mediabrowsercompat_customactionresultreceiver;
                    });
                    animator = animatorSet;
                }
            } else if (i3 == i4 && i5 == i6) {
                animator = AlertController$RecycleListView.IconCompatParcelizer(view, RatingCompat, RatingCompat().IconCompatParcelizer((float) i7, (float) i9, (float) i8, (float) i10));
            } else {
                animator = AlertController$RecycleListView.IconCompatParcelizer(view, MediaMetadataCompat, RatingCompat().IconCompatParcelizer((float) i3, (float) i5, (float) i4, (float) i6));
            }
            z = true;
        } else {
            view = view3;
            setFillViewport.MediaBrowserCompat$CustomActionResultReceiver(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
            if (i3 == i4 && i5 == i6) {
                objectAnimator = null;
            } else {
                objectAnimator = AlertController$RecycleListView.IconCompatParcelizer(view, MediaDescriptionCompat, RatingCompat().IconCompatParcelizer((float) i3, (float) i5, (float) i4, (float) i6));
            }
            if (rect7 == null) {
                i2 = 0;
                rect = new Rect(0, 0, i11, i12);
            } else {
                i2 = 0;
                rect = rect7;
            }
            Rect rect8 = rect6 == null ? new Rect(i2, i2, i13, i14) : rect6;
            if (!rect.equals(rect8)) {
                SwitchCompat.MediaBrowserCompat$ItemReceiver(view, rect);
                onCreate oncreate = MediaSessionCompat$QueueItem;
                Object[] objArr = new Object[2];
                objArr[i2] = rect;
                objArr[1] = rect8;
                ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", oncreate, objArr);
                final View view4 = view;
                final Rect rect9 = rect6;
                final int i16 = i4;
                final int i17 = i6;
                final int i18 = i8;
                z = true;
                final int i19 = i10;
                ofObject.addListener(new AnimatorListenerAdapter() {
                    private boolean MediaBrowserCompat$SearchResultReceiver;

                    public final void onAnimationCancel(Animator animator) {
                        this.MediaBrowserCompat$SearchResultReceiver = true;
                    }

                    public final void onAnimationEnd(Animator animator) {
                        if (!this.MediaBrowserCompat$SearchResultReceiver) {
                            SwitchCompat.MediaBrowserCompat$ItemReceiver(view4, rect9);
                            setFillViewport.MediaBrowserCompat$CustomActionResultReceiver(view4, i16, i17, i18, i19);
                        }
                    }
                });
                objectAnimator2 = ofObject;
            } else {
                z = true;
                objectAnimator2 = null;
            }
            animator = CoreComponentFactory.read(objectAnimator, objectAnimator2);
        }
        if (view.getParent() instanceof ViewGroup) {
            final ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            if (Build.VERSION.SDK_INT >= 18) {
                setNestedScrollingEnabled.MediaBrowserCompat$CustomActionResultReceiver(viewGroup4, z);
            } else {
                setOnScrollChangeListener.read(viewGroup4, z);
            }
            IconCompatParcelizer((BetterViewPager$MediaBrowserCompat$ItemReceiver) new AppCompatMultiAutoCompleteTextView() {
                public final void write(BetterViewPager betterViewPager) {
                    ViewGroup viewGroup = viewGroup4;
                    if (Build.VERSION.SDK_INT >= 18) {
                        setNestedScrollingEnabled.MediaBrowserCompat$CustomActionResultReceiver(viewGroup, false);
                    } else {
                        setOnScrollChangeListener.read(viewGroup, false);
                    }
                    betterViewPager.read((BetterViewPager$MediaBrowserCompat$ItemReceiver) this);
                }

                public final void MediaBrowserCompat$CustomActionResultReceiver() {
                    ViewGroup viewGroup = viewGroup4;
                    if (Build.VERSION.SDK_INT >= 18) {
                        setNestedScrollingEnabled.MediaBrowserCompat$CustomActionResultReceiver(viewGroup, false);
                    } else {
                        setOnScrollChangeListener.read(viewGroup, false);
                    }
                }

                public final void MediaBrowserCompat$ItemReceiver() {
                    ViewGroup viewGroup = viewGroup4;
                    if (Build.VERSION.SDK_INT >= 18) {
                        setNestedScrollingEnabled.MediaBrowserCompat$CustomActionResultReceiver(viewGroup, true);
                    } else {
                        setOnScrollChangeListener.read(viewGroup, true);
                    }
                }
            });
        }
        return animator;
    }
}

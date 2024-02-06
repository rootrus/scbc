package com.androidadvance.topsnackbar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p040o.SwitchCompat;
import p040o.onDestroyView;
import p040o.onDestroyView$MediaBrowserCompat$ItemReceiver;
import p040o.onDetach;
import p040o.setLastBaselineToBottomHeight;
import p040o.setShowsDialog;
import p040o.setSwitchMinWidth;
import p040o.setSwitchTypeface;
import p040o.setTitleMargin;

public final class TSnackbar {
    /* access modifiers changed from: private */
    public static final Handler MediaBrowserCompat$MediaItem = new Handler(Looper.getMainLooper(), new Handler.Callback() {
        public final boolean handleMessage(Message message) {
            int i;
            int i2 = message.what;
            boolean z = false;
            if (i2 == 0) {
                TSnackbar tSnackbar = (TSnackbar) message.obj;
                if (tSnackbar.RatingCompat.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams = tSnackbar.RatingCompat.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.read) {
                        write write = new write();
                        write.IconCompatParcelizer = Math.min(Math.max(BitmapDescriptorFactory.HUE_RED, 0.1f), 1.0f);
                        write.write = Math.min(Math.max(BitmapDescriptorFactory.HUE_RED, 0.6f), 1.0f);
                        write.MediaBrowserCompat$CustomActionResultReceiver = 0;
                        write.read = new SwipeDismissBehavior.write() {
                            public final void read(View view) {
                                TSnackbar.MediaBrowserCompat$CustomActionResultReceiver(TSnackbar.this, 0);
                            }

                            public final void write(int i) {
                                if (i == 0) {
                                    if (setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver == null) {
                                        setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver = new setShowsDialog();
                                    }
                                    setShowsDialog setshowsdialog = setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver;
                                    setShowsDialog.write MediaBrowserCompat$CustomActionResultReceiver = TSnackbar.this.MediaBrowserCompat$ItemReceiver;
                                    synchronized (setshowsdialog.read) {
                                        if (setshowsdialog.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver)) {
                                            setshowsdialog.MediaBrowserCompat$ItemReceiver(setshowsdialog.MediaBrowserCompat$ItemReceiver);
                                        }
                                    }
                                } else if (i == 1 || i == 2) {
                                    if (setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver == null) {
                                        setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver = new setShowsDialog();
                                    }
                                    setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver.write(TSnackbar.this.MediaBrowserCompat$ItemReceiver);
                                }
                            }
                        };
                        CoordinatorLayout.read read = (CoordinatorLayout.read) layoutParams;
                        if (read.MediaDescriptionCompat != write) {
                            read.MediaDescriptionCompat = write;
                            read.RatingCompat = true;
                            write.IconCompatParcelizer(read);
                        }
                    }
                    tSnackbar.MediaBrowserCompat$CustomActionResultReceiver.addView(tSnackbar.RatingCompat);
                }
                tSnackbar.RatingCompat.MediaBrowserCompat$ItemReceiver = new Object() {
                    public final void MediaBrowserCompat$ItemReceiver() {
                        TSnackbar tSnackbar = TSnackbar.this;
                        if (setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver == null) {
                            setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver = new setShowsDialog();
                        }
                        if (setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver.read(tSnackbar.MediaBrowserCompat$ItemReceiver)) {
                            TSnackbar.MediaBrowserCompat$MediaItem.post(this);
                        }
                    }

                    public final void run() {
                        TSnackbar.this.read(3);
                    }
                };
                if (SwitchCompat.setCheckable(tSnackbar.RatingCompat)) {
                    tSnackbar.write();
                } else {
                    tSnackbar.RatingCompat.write = new SnackbarLayout.read() {
                        public final void MediaBrowserCompat$CustomActionResultReceiver() {
                            TSnackbar.this.write();
                            TSnackbar.this.RatingCompat.write = null;
                        }
                    };
                }
                return true;
            } else if (i2 != 1) {
                return false;
            } else {
                TSnackbar tSnackbar2 = (TSnackbar) message.obj;
                int i3 = message.arg1;
                if (tSnackbar2.RatingCompat.getVisibility() == 0) {
                    ViewGroup.LayoutParams layoutParams2 = tSnackbar2.RatingCompat.getLayoutParams();
                    if (layoutParams2 instanceof CoordinatorLayout.read) {
                        CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver = ((CoordinatorLayout.read) layoutParams2).MediaDescriptionCompat;
                        if (coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver instanceof SwipeDismissBehavior) {
                            setTitleMargin settitlemargin = ((SwipeDismissBehavior) coordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver).MediaBrowserCompat$MediaItem;
                            if (settitlemargin != null) {
                                i = settitlemargin.read;
                            } else {
                                i = 0;
                            }
                            if (i != 0) {
                                z = true;
                            }
                        }
                    }
                    if (!z) {
                        if (Build.VERSION.SDK_INT >= 14) {
                            SwitchCompat.write(tSnackbar2.RatingCompat).MediaMetadataCompat((float) (-tSnackbar2.RatingCompat.getHeight())).MediaBrowserCompat$CustomActionResultReceiver(onDetach.IconCompatParcelizer).MediaBrowserCompat$ItemReceiver(250).read((setSwitchTypeface) new setSwitchMinWidth(i3) {
                                private /* synthetic */ int MediaBrowserCompat$ItemReceiver;

                                {
                                    this.MediaBrowserCompat$ItemReceiver = r2;
                                }

                                public final void write(View view) {
                                    SnackbarLayout write = TSnackbar.this.RatingCompat;
                                    SwitchCompat.MediaBrowserCompat$ItemReceiver((View) write.MediaBrowserCompat$CustomActionResultReceiver, 1.0f);
                                    SwitchCompat.write(write.MediaBrowserCompat$CustomActionResultReceiver).IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED).MediaBrowserCompat$ItemReceiver(180).MediaBrowserCompat$CustomActionResultReceiver(0).write();
                                    if (write.IconCompatParcelizer.getVisibility() == 0) {
                                        SwitchCompat.MediaBrowserCompat$ItemReceiver((View) write.IconCompatParcelizer, 1.0f);
                                        SwitchCompat.write(write.IconCompatParcelizer).IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED).MediaBrowserCompat$ItemReceiver(180).MediaBrowserCompat$CustomActionResultReceiver(0).write();
                                    }
                                }

                                public final void MediaBrowserCompat$ItemReceiver(View view) {
                                    TSnackbar.this.read(this.MediaBrowserCompat$ItemReceiver);
                                }
                            }).write();
                        } else {
                            Animation loadAnimation = AnimationUtils.loadAnimation(tSnackbar2.RatingCompat.getContext(), onDestroyView.IconCompatParcelizer.top_out);
                            loadAnimation.setInterpolator(onDetach.IconCompatParcelizer);
                            loadAnimation.setDuration(250);
                            loadAnimation.setAnimationListener(new Animation.AnimationListener(i3) {
                                private /* synthetic */ int MediaBrowserCompat$ItemReceiver;

                                public final void onAnimationRepeat(Animation animation) {
                                }

                                public final void onAnimationStart(Animation animation) {
                                }

                                {
                                    this.MediaBrowserCompat$ItemReceiver = r2;
                                }

                                public final void onAnimationEnd(Animation animation) {
                                    TSnackbar.this.read(this.MediaBrowserCompat$ItemReceiver);
                                }
                            });
                            tSnackbar2.RatingCompat.startAnimation(loadAnimation);
                        }
                        return true;
                    }
                }
                tSnackbar2.read(i3);
                return true;
            }
        }
    });
    public IconCompatParcelizer IconCompatParcelizer;
    final ViewGroup MediaBrowserCompat$CustomActionResultReceiver;
    public final setShowsDialog.write MediaBrowserCompat$ItemReceiver = new setShowsDialog.write() {
        public final void write() {
            TSnackbar.MediaBrowserCompat$MediaItem.sendMessage(TSnackbar.MediaBrowserCompat$MediaItem.obtainMessage(0, TSnackbar.this));
        }

        public final void read(int i) {
            TSnackbar.MediaBrowserCompat$MediaItem.sendMessage(TSnackbar.MediaBrowserCompat$MediaItem.obtainMessage(1, i, 0, TSnackbar.this));
        }
    };
    public final SnackbarLayout RatingCompat;
    public int read;
    public final Context write;

    public static abstract class IconCompatParcelizer {
        public void read(TSnackbar tSnackbar, int i) {
        }
    }

    private TSnackbar(ViewGroup viewGroup) {
        this.MediaBrowserCompat$CustomActionResultReceiver = viewGroup;
        Context context = viewGroup.getContext();
        this.write = context;
        this.RatingCompat = (SnackbarLayout) LayoutInflater.from(context).inflate(onDestroyView.write.tsnackbar_layout, this.MediaBrowserCompat$CustomActionResultReceiver, false);
    }

    public static TSnackbar write(View view, CharSequence charSequence, int i) {
        TSnackbar tSnackbar = new TSnackbar(MediaBrowserCompat$CustomActionResultReceiver(view));
        tSnackbar.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver.setText(charSequence);
        tSnackbar.read = i;
        return tSnackbar;
    }

    private static ViewGroup MediaBrowserCompat$CustomActionResultReceiver(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    public final TSnackbar MediaBrowserCompat$ItemReceiver(int i) {
        TextView textView = this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver;
        Drawable write2 = setLastBaselineToBottomHeight.write(this.write, i);
        if (write2 != null) {
            Drawable IconCompatParcelizer2 = IconCompatParcelizer(write2, (int) ((((float) this.write.getResources().getDisplayMetrics().densityDpi) / 160.0f) * 24.0f));
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            textView.setCompoundDrawables(IconCompatParcelizer2, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
            return this;
        }
        throw new IllegalArgumentException("resource_id is not a valid drawable!");
    }

    private Drawable IconCompatParcelizer(Drawable drawable, int i) {
        boolean z;
        Bitmap bitmap;
        if (!(drawable.getIntrinsicWidth() == i && drawable.getIntrinsicHeight() == i) && ((z = drawable instanceof BitmapDrawable))) {
            Resources resources = this.write.getResources();
            if (z) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else if (drawable instanceof VectorDrawable) {
                VectorDrawable vectorDrawable = (VectorDrawable) drawable;
                Bitmap createBitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                vectorDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                vectorDrawable.draw(canvas);
                bitmap = createBitmap;
            } else {
                throw new IllegalArgumentException("unsupported drawable type");
            }
            drawable = new BitmapDrawable(resources, Bitmap.createScaledBitmap(bitmap, i, i, true));
        }
        drawable.setBounds(0, 0, i, i);
        return drawable;
    }

    public final TSnackbar read(CharSequence charSequence, final View.OnClickListener onClickListener) {
        Button button = this.RatingCompat.IconCompatParcelizer;
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            button.setVisibility(8);
            button.setOnClickListener((View.OnClickListener) null);
        } else {
            button.setVisibility(0);
            button.setText(charSequence);
            button.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    onClickListener.onClick(view);
                    TSnackbar.MediaBrowserCompat$CustomActionResultReceiver(TSnackbar.this, 1);
                }
            });
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void write() {
        if (Build.VERSION.SDK_INT >= 14) {
            SnackbarLayout snackbarLayout = this.RatingCompat;
            SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver((View) snackbarLayout, (float) (-snackbarLayout.getHeight()));
            SwitchCompat.write(this.RatingCompat).MediaMetadataCompat(BitmapDescriptorFactory.HUE_RED).MediaBrowserCompat$CustomActionResultReceiver(onDetach.IconCompatParcelizer).MediaBrowserCompat$ItemReceiver(250).read((setSwitchTypeface) new setSwitchMinWidth() {
                public final void write(View view) {
                    SnackbarLayout write = TSnackbar.this.RatingCompat;
                    SwitchCompat.MediaBrowserCompat$ItemReceiver((View) write.MediaBrowserCompat$CustomActionResultReceiver, (float) BitmapDescriptorFactory.HUE_RED);
                    SwitchCompat.write(write.MediaBrowserCompat$CustomActionResultReceiver).IconCompatParcelizer(1.0f).MediaBrowserCompat$ItemReceiver(180).MediaBrowserCompat$CustomActionResultReceiver(70).write();
                    if (write.IconCompatParcelizer.getVisibility() == 0) {
                        SwitchCompat.MediaBrowserCompat$ItemReceiver((View) write.IconCompatParcelizer, (float) BitmapDescriptorFactory.HUE_RED);
                        SwitchCompat.write(write.IconCompatParcelizer).IconCompatParcelizer(1.0f).MediaBrowserCompat$ItemReceiver(180).MediaBrowserCompat$CustomActionResultReceiver(70).write();
                    }
                }

                public final void MediaBrowserCompat$ItemReceiver(View view) {
                    if (TSnackbar.this.IconCompatParcelizer != null) {
                        IconCompatParcelizer unused = TSnackbar.this.IconCompatParcelizer;
                    }
                    if (setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver == null) {
                        setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver = new setShowsDialog();
                    }
                    setShowsDialog setshowsdialog = setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver;
                    setShowsDialog.write MediaBrowserCompat$CustomActionResultReceiver2 = TSnackbar.this.MediaBrowserCompat$ItemReceiver;
                    synchronized (setshowsdialog.read) {
                        if (setshowsdialog.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver2)) {
                            setshowsdialog.MediaBrowserCompat$ItemReceiver(setshowsdialog.MediaBrowserCompat$ItemReceiver);
                        }
                    }
                }
            }).write();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.RatingCompat.getContext(), onDestroyView.IconCompatParcelizer.top_in);
        loadAnimation.setInterpolator(onDetach.IconCompatParcelizer);
        loadAnimation.setDuration(250);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                if (TSnackbar.this.IconCompatParcelizer != null) {
                    IconCompatParcelizer unused = TSnackbar.this.IconCompatParcelizer;
                }
                if (setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver == null) {
                    setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver = new setShowsDialog();
                }
                setShowsDialog setshowsdialog = setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver;
                setShowsDialog.write MediaBrowserCompat$CustomActionResultReceiver = TSnackbar.this.MediaBrowserCompat$ItemReceiver;
                synchronized (setshowsdialog.read) {
                    if (setshowsdialog.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver)) {
                        setshowsdialog.MediaBrowserCompat$ItemReceiver(setshowsdialog.MediaBrowserCompat$ItemReceiver);
                    }
                }
            }
        });
        this.RatingCompat.startAnimation(loadAnimation);
    }

    public static class SnackbarLayout extends LinearLayout {
        Button IconCompatParcelizer;
        public TextView MediaBrowserCompat$CustomActionResultReceiver;
        C0147xf2991647 MediaBrowserCompat$ItemReceiver;
        /* access modifiers changed from: private */
        public int MediaBrowserCompat$MediaItem;
        private int read;
        read write;

        interface read {
            void MediaBrowserCompat$CustomActionResultReceiver();
        }

        public SnackbarLayout(Context context) {
            this(context, (AttributeSet) null);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, onDestroyView$MediaBrowserCompat$ItemReceiver.SnackbarLayout);
            this.MediaBrowserCompat$MediaItem = obtainStyledAttributes.getDimensionPixelSize(onDestroyView$MediaBrowserCompat$ItemReceiver.SnackbarLayout_android_maxWidth, -1);
            this.read = obtainStyledAttributes.getDimensionPixelSize(onDestroyView$MediaBrowserCompat$ItemReceiver.SnackbarLayout_maxActionInlineWidth, -1);
            if (obtainStyledAttributes.hasValue(onDestroyView$MediaBrowserCompat$ItemReceiver.SnackbarLayout_elevation)) {
                SwitchCompat.IconCompatParcelizer((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(onDestroyView$MediaBrowserCompat$ItemReceiver.SnackbarLayout_elevation, 0));
            }
            obtainStyledAttributes.recycle();
            setClickable(true);
            LayoutInflater.from(context).inflate(onDestroyView.write.tsnackbar_layout_include, this);
            SwitchCompat.IconCompatParcelizer((View) this, 1);
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            this.MediaBrowserCompat$CustomActionResultReceiver = (TextView) findViewById(onDestroyView.read.snackbar_text);
            this.IconCompatParcelizer = (Button) findViewById(onDestroyView.read.snackbar_action);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
            if (IconCompatParcelizer(1, r0, r0 - r1) != false) goto L_0x005f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
            if (IconCompatParcelizer(0, r0, r0) != false) goto L_0x005f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMeasure(int r8, int r9) {
            /*
                r7 = this;
                super.onMeasure(r8, r9)
                int r0 = r7.MediaBrowserCompat$MediaItem
                if (r0 <= 0) goto L_0x0018
                int r0 = r7.getMeasuredWidth()
                int r1 = r7.MediaBrowserCompat$MediaItem
                if (r0 <= r1) goto L_0x0018
                r8 = 1073741824(0x40000000, float:2.0)
                int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
                super.onMeasure(r8, r9)
            L_0x0018:
                android.content.res.Resources r0 = r7.getResources()
                int r1 = p040o.onDestroyView$MediaBrowserCompat$CustomActionResultReceiver.design_snackbar_padding_vertical_2lines
                int r0 = r0.getDimensionPixelSize(r1)
                android.content.res.Resources r1 = r7.getResources()
                int r2 = p040o.onDestroyView$MediaBrowserCompat$CustomActionResultReceiver.design_snackbar_padding_vertical
                int r1 = r1.getDimensionPixelSize(r2)
                android.widget.TextView r2 = r7.MediaBrowserCompat$CustomActionResultReceiver
                android.text.Layout r2 = r2.getLayout()
                int r2 = r2.getLineCount()
                r3 = 0
                r4 = 1
                if (r2 <= r4) goto L_0x003c
                r2 = r4
                goto L_0x003d
            L_0x003c:
                r2 = r3
            L_0x003d:
                if (r2 == 0) goto L_0x0056
                int r5 = r7.read
                if (r5 <= 0) goto L_0x0056
                android.widget.Button r5 = r7.IconCompatParcelizer
                int r5 = r5.getMeasuredWidth()
                int r6 = r7.read
                if (r5 <= r6) goto L_0x0056
                int r1 = r0 - r1
                boolean r0 = r7.IconCompatParcelizer(r4, r0, r1)
                if (r0 == 0) goto L_0x0060
                goto L_0x005f
            L_0x0056:
                if (r2 != 0) goto L_0x0059
                r0 = r1
            L_0x0059:
                boolean r0 = r7.IconCompatParcelizer(r3, r0, r0)
                if (r0 == 0) goto L_0x0060
            L_0x005f:
                r3 = r4
            L_0x0060:
                if (r3 == 0) goto L_0x0065
                super.onMeasure(r8, r9)
            L_0x0065:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.androidadvance.topsnackbar.TSnackbar.SnackbarLayout.onMeasure(int, int):void");
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            read read2;
            super.onLayout(z, i, i2, i3, i4);
            if (z && (read2 = this.write) != null) {
                read2.MediaBrowserCompat$CustomActionResultReceiver();
            }
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            C0147xf2991647 tSnackbar$SnackbarLayout$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver;
            if (tSnackbar$SnackbarLayout$MediaBrowserCompat$CustomActionResultReceiver != null) {
                tSnackbar$SnackbarLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
            }
        }

        private boolean IconCompatParcelizer(int i, int i2, int i3) {
            boolean z;
            if (i != getOrientation()) {
                setOrientation(i);
                z = true;
            } else {
                z = false;
            }
            if (this.MediaBrowserCompat$CustomActionResultReceiver.getPaddingTop() == i2 && this.MediaBrowserCompat$CustomActionResultReceiver.getPaddingBottom() == i3) {
                return z;
            }
            TextView textView = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (SwitchCompat.setPadding(textView)) {
                SwitchCompat.MediaBrowserCompat$ItemReceiver(textView, SwitchCompat.MediaSessionCompat$QueueItem(textView), i2, SwitchCompat.ParcelableVolumeInfo(textView), i3);
                return true;
            }
            textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
            return true;
        }
    }

    final class write extends SwipeDismissBehavior<SnackbarLayout> {
        write() {
        }

        public final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            SnackbarLayout snackbarLayout = (SnackbarLayout) view;
            if (coordinatorLayout.MediaBrowserCompat$ItemReceiver(snackbarLayout, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    if (setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver == null) {
                        setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver = new setShowsDialog();
                    }
                    setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver.write(TSnackbar.this.MediaBrowserCompat$ItemReceiver);
                } else if (actionMasked == 1 || actionMasked == 3) {
                    if (setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver == null) {
                        setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver = new setShowsDialog();
                    }
                    setShowsDialog setshowsdialog = setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver;
                    setShowsDialog.write MediaBrowserCompat$CustomActionResultReceiver = TSnackbar.this.MediaBrowserCompat$ItemReceiver;
                    synchronized (setshowsdialog.read) {
                        if (setshowsdialog.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver)) {
                            setshowsdialog.MediaBrowserCompat$ItemReceiver(setshowsdialog.MediaBrowserCompat$ItemReceiver);
                        }
                    }
                }
            }
            return super.MediaBrowserCompat$CustomActionResultReceiver(coordinatorLayout, snackbarLayout, motionEvent);
        }

        public final boolean MediaBrowserCompat$ItemReceiver(View view) {
            return view instanceof SnackbarLayout;
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(TSnackbar tSnackbar, int i) {
        setShowsDialog.write write2;
        if (setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver == null) {
            setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver = new setShowsDialog();
        }
        setShowsDialog setshowsdialog = setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver;
        setShowsDialog.write write3 = tSnackbar.MediaBrowserCompat$ItemReceiver;
        synchronized (setshowsdialog.read) {
            if (setshowsdialog.MediaBrowserCompat$ItemReceiver(write3)) {
                setShowsDialog.write write4 = setshowsdialog.MediaBrowserCompat$ItemReceiver.read.get();
                if (write4 != null) {
                    write4.read(i);
                }
            } else if (setshowsdialog.MediaBrowserCompat$CustomActionResultReceiver(write3) && (write2 = setshowsdialog.write.read.get()) != null) {
                write2.read(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void read(int i) {
        if (setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver == null) {
            setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver = new setShowsDialog();
        }
        setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
        IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.read(this, i);
        }
        ViewParent parent = this.RatingCompat.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.RatingCompat);
        }
    }
}

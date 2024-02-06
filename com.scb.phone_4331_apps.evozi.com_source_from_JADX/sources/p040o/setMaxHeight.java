package p040o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.setMaxHeight */
public final class setMaxHeight extends CoordinatorLayout {
    private static TimeInterpolator ParcelableVolumeInfo;
    private ArrayList<setMaxHeight$MediaBrowserCompat$CustomActionResultReceiver> AlertController$RecycleListView = new ArrayList<>();
    ArrayList<RecyclerView.setContentView> IconCompatParcelizer = new ArrayList<>();
    private ArrayList<RecyclerView.setContentView> Keep = new ArrayList<>();
    ArrayList<RecyclerView.setContentView> MediaBrowserCompat$CustomActionResultReceiver = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.setContentView>> MediaBrowserCompat$ItemReceiver = new ArrayList<>();
    ArrayList<ArrayList<setMaxHeight$MediaBrowserCompat$CustomActionResultReceiver>> MediaBrowserCompat$MediaItem = new ArrayList<>();
    ArrayList<RecyclerView.setContentView> MediaMetadataCompat = new ArrayList<>();
    private ArrayList<RecyclerView.setContentView> MediaSessionCompat$QueueItem = new ArrayList<>();
    ArrayList<RecyclerView.setContentView> read = new ArrayList<>();
    private ArrayList<IconCompatParcelizer> setHasDecor = new ArrayList<>();
    ArrayList<ArrayList<IconCompatParcelizer>> write = new ArrayList<>();

    /* renamed from: o.setMaxHeight$IconCompatParcelizer */
    static class IconCompatParcelizer {
        public RecyclerView.setContentView IconCompatParcelizer;
        public RecyclerView.setContentView MediaBrowserCompat$CustomActionResultReceiver;
        public int MediaBrowserCompat$ItemReceiver;
        public int MediaBrowserCompat$SearchResultReceiver;
        public int read;
        public int write;

        private IconCompatParcelizer(RecyclerView.setContentView setcontentview, RecyclerView.setContentView setcontentview2) {
            this.IconCompatParcelizer = setcontentview;
            this.MediaBrowserCompat$CustomActionResultReceiver = setcontentview2;
        }

        IconCompatParcelizer(RecyclerView.setContentView setcontentview, RecyclerView.setContentView setcontentview2, int i, int i2, int i3, int i4) {
            this(setcontentview, setcontentview2);
            this.write = i;
            this.MediaBrowserCompat$ItemReceiver = i2;
            this.read = i3;
            this.MediaBrowserCompat$SearchResultReceiver = i4;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ChangeInfo{oldHolder=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", newHolder=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", fromX=");
            sb.append(this.write);
            sb.append(", fromY=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", toX=");
            sb.append(this.read);
            sb.append(", toY=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append('}');
            return sb.toString();
        }
    }

    public final void IconCompatParcelizer() {
        long j;
        long j2;
        boolean z = !this.Keep.isEmpty();
        boolean z2 = !this.AlertController$RecycleListView.isEmpty();
        boolean z3 = !this.setHasDecor.isEmpty();
        boolean z4 = !this.MediaSessionCompat$QueueItem.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.setContentView> it = this.Keep.iterator();
            while (it.hasNext()) {
                final RecyclerView.setContentView next = it.next();
                final View view = next.write;
                final ViewPropertyAnimator animate = view.animate();
                this.MediaMetadataCompat.add(next);
                animate.setDuration(this.MediaSessionCompat$Token).alpha(BitmapDescriptorFactory.HUE_RED).setListener(new AnimatorListenerAdapter() {
                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationEnd(Animator animator) {
                        animate.setListener((Animator.AnimatorListener) null);
                        view.setAlpha(1.0f);
                        setMaxHeight setmaxheight = setMaxHeight.this;
                        RecyclerView.setContentView setcontentview = next;
                        RecyclerView.MediaMetadataCompat.read read = setmaxheight.MediaDescriptionCompat;
                        if (read != null) {
                            read.write(setcontentview);
                        }
                        setMaxHeight.this.MediaMetadataCompat.remove(next);
                        setMaxHeight setmaxheight2 = setMaxHeight.this;
                        if (!setmaxheight2.read()) {
                            setmaxheight2.MediaBrowserCompat$CustomActionResultReceiver();
                        }
                    }
                }).start();
            }
            this.Keep.clear();
            if (z2) {
                final ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.AlertController$RecycleListView);
                this.MediaBrowserCompat$MediaItem.add(arrayList);
                this.AlertController$RecycleListView.clear();
                C15103 r6 = new Runnable() {
                    public final void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            setMaxHeight$MediaBrowserCompat$CustomActionResultReceiver setmaxheight_mediabrowsercompat_customactionresultreceiver = (setMaxHeight$MediaBrowserCompat$CustomActionResultReceiver) it.next();
                            setMaxHeight setmaxheight = setMaxHeight.this;
                            RecyclerView.setContentView setcontentview = setmaxheight_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
                            int i = setmaxheight_mediabrowsercompat_customactionresultreceiver.read;
                            int i2 = setmaxheight_mediabrowsercompat_customactionresultreceiver.write;
                            int i3 = setmaxheight_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
                            int i4 = setmaxheight_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
                            View view = setcontentview.write;
                            int i5 = i3 - i;
                            int i6 = i4 - i2;
                            if (i5 != 0) {
                                view.animate().translationX(BitmapDescriptorFactory.HUE_RED);
                            }
                            if (i6 != 0) {
                                view.animate().translationY(BitmapDescriptorFactory.HUE_RED);
                            }
                            ViewPropertyAnimator animate = view.animate();
                            setmaxheight.MediaBrowserCompat$CustomActionResultReceiver.add(setcontentview);
                            animate.setDuration(setmaxheight.f25x50fd9e4a).setListener(new AnimatorListenerAdapter(setcontentview, i5, view, i6, animate) {
                                final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer;
                                final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
                                final /* synthetic */ int MediaBrowserCompat$ItemReceiver;
                                final /* synthetic */ View MediaBrowserCompat$SearchResultReceiver;
                                final /* synthetic */ ViewPropertyAnimator write;

                                public final void onAnimationStart(Animator animator) {
                                }

                                {
                                    this.IconCompatParcelizer = r2;
                                    this.MediaBrowserCompat$CustomActionResultReceiver = r3;
                                    this.MediaBrowserCompat$SearchResultReceiver = r4;
                                    this.MediaBrowserCompat$ItemReceiver = r5;
                                    this.write = r6;
                                }

                                public final void onAnimationCancel(Animator animator) {
                                    if (this.MediaBrowserCompat$CustomActionResultReceiver != 0) {
                                        this.MediaBrowserCompat$SearchResultReceiver.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                                    }
                                    if (this.MediaBrowserCompat$ItemReceiver != 0) {
                                        this.MediaBrowserCompat$SearchResultReceiver.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                                    }
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    this.write.setListener((Animator.AnimatorListener) null);
                                    setMaxHeight setmaxheight = setMaxHeight.this;
                                    RecyclerView.setContentView setcontentview = this.IconCompatParcelizer;
                                    RecyclerView.MediaMetadataCompat.read read2 = setmaxheight.MediaDescriptionCompat;
                                    if (read2 != null) {
                                        read2.write(setcontentview);
                                    }
                                    setMaxHeight.this.MediaBrowserCompat$CustomActionResultReceiver.remove(this.IconCompatParcelizer);
                                    setMaxHeight setmaxheight2 = setMaxHeight.this;
                                    if (!setmaxheight2.read()) {
                                        setmaxheight2.MediaBrowserCompat$CustomActionResultReceiver();
                                    }
                                }
                            }).start();
                        }
                        arrayList.clear();
                        setMaxHeight.this.MediaBrowserCompat$MediaItem.remove(arrayList);
                    }
                };
                if (z) {
                    SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver(((setMaxHeight$MediaBrowserCompat$CustomActionResultReceiver) arrayList.get(0)).MediaBrowserCompat$CustomActionResultReceiver.write, (Runnable) r6, this.MediaSessionCompat$Token);
                } else {
                    r6.run();
                }
            }
            if (z3) {
                final ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.setHasDecor);
                this.write.add(arrayList2);
                this.setHasDecor.clear();
                C15071 r62 = new Runnable() {
                    public final void run() {
                        View view;
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) it.next();
                            setMaxHeight setmaxheight = setMaxHeight.this;
                            RecyclerView.setContentView setcontentview = iconCompatParcelizer.IconCompatParcelizer;
                            View view2 = null;
                            if (setcontentview == null) {
                                view = null;
                            } else {
                                view = setcontentview.write;
                            }
                            RecyclerView.setContentView setcontentview2 = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                            if (setcontentview2 != null) {
                                view2 = setcontentview2.write;
                            }
                            if (view != null) {
                                ViewPropertyAnimator duration = view.animate().setDuration(setmaxheight.MediaBrowserCompat$SearchResultReceiver);
                                setmaxheight.IconCompatParcelizer.add(iconCompatParcelizer.IconCompatParcelizer);
                                duration.translationX((float) (iconCompatParcelizer.read - iconCompatParcelizer.write));
                                duration.translationY((float) (iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver - iconCompatParcelizer.MediaBrowserCompat$ItemReceiver));
                                duration.alpha(BitmapDescriptorFactory.HUE_RED).setListener(new AnimatorListenerAdapter(iconCompatParcelizer, duration, view) {
                                    final /* synthetic */ IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
                                    final /* synthetic */ ViewPropertyAnimator MediaBrowserCompat$ItemReceiver;
                                    final /* synthetic */ View write;

                                    public final void onAnimationStart(Animator animator) {
                                    }

                                    {
                                        this.MediaBrowserCompat$CustomActionResultReceiver = r2;
                                        this.MediaBrowserCompat$ItemReceiver = r3;
                                        this.write = r4;
                                    }

                                    public final void onAnimationEnd(Animator animator) {
                                        this.MediaBrowserCompat$ItemReceiver.setListener((Animator.AnimatorListener) null);
                                        this.write.setAlpha(1.0f);
                                        this.write.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                                        this.write.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                                        setMaxHeight setmaxheight = setMaxHeight.this;
                                        RecyclerView.setContentView setcontentview = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
                                        RecyclerView.MediaMetadataCompat.read read = setmaxheight.MediaDescriptionCompat;
                                        if (read != null) {
                                            read.write(setcontentview);
                                        }
                                        setMaxHeight.this.IconCompatParcelizer.remove(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
                                        setMaxHeight setmaxheight2 = setMaxHeight.this;
                                        if (!setmaxheight2.read()) {
                                            setmaxheight2.MediaBrowserCompat$CustomActionResultReceiver();
                                        }
                                    }
                                }).start();
                            }
                            if (view2 != null) {
                                ViewPropertyAnimator animate = view2.animate();
                                setmaxheight.IconCompatParcelizer.add(iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
                                animate.translationX(BitmapDescriptorFactory.HUE_RED).translationY(BitmapDescriptorFactory.HUE_RED).setDuration(setmaxheight.MediaBrowserCompat$SearchResultReceiver).alpha(1.0f).setListener(new AnimatorListenerAdapter(iconCompatParcelizer, animate, view2) {
                                    final /* synthetic */ IconCompatParcelizer IconCompatParcelizer;
                                    final /* synthetic */ ViewPropertyAnimator MediaBrowserCompat$CustomActionResultReceiver;
                                    final /* synthetic */ View MediaBrowserCompat$ItemReceiver;

                                    public final void onAnimationStart(Animator animator) {
                                    }

                                    {
                                        this.IconCompatParcelizer = r2;
                                        this.MediaBrowserCompat$CustomActionResultReceiver = r3;
                                        this.MediaBrowserCompat$ItemReceiver = r4;
                                    }

                                    public final void onAnimationEnd(Animator animator) {
                                        this.MediaBrowserCompat$CustomActionResultReceiver.setListener((Animator.AnimatorListener) null);
                                        this.MediaBrowserCompat$ItemReceiver.setAlpha(1.0f);
                                        this.MediaBrowserCompat$ItemReceiver.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                                        this.MediaBrowserCompat$ItemReceiver.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                                        setMaxHeight setmaxheight = setMaxHeight.this;
                                        RecyclerView.setContentView setcontentview = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                                        RecyclerView.MediaMetadataCompat.read read = setmaxheight.MediaDescriptionCompat;
                                        if (read != null) {
                                            read.write(setcontentview);
                                        }
                                        setMaxHeight.this.IconCompatParcelizer.remove(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
                                        setMaxHeight setmaxheight2 = setMaxHeight.this;
                                        if (!setmaxheight2.read()) {
                                            setmaxheight2.MediaBrowserCompat$CustomActionResultReceiver();
                                        }
                                    }
                                }).start();
                            }
                        }
                        arrayList2.clear();
                        setMaxHeight.this.write.remove(arrayList2);
                    }
                };
                if (z) {
                    SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver(((IconCompatParcelizer) arrayList2.get(0)).IconCompatParcelizer.write, (Runnable) r62, this.MediaSessionCompat$Token);
                } else {
                    r62.run();
                }
            }
            if (z4) {
                final ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.MediaSessionCompat$QueueItem);
                this.MediaBrowserCompat$ItemReceiver.add(arrayList3);
                this.MediaSessionCompat$QueueItem.clear();
                C15114 r5 = new Runnable() {
                    public final void run() {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            RecyclerView.setContentView setcontentview = (RecyclerView.setContentView) it.next();
                            setMaxHeight setmaxheight = setMaxHeight.this;
                            View view = setcontentview.write;
                            ViewPropertyAnimator animate = view.animate();
                            setmaxheight.read.add(setcontentview);
                            animate.alpha(1.0f).setDuration(setmaxheight.RatingCompat).setListener(new AnimatorListenerAdapter(setcontentview, view, animate) {
                                final /* synthetic */ View IconCompatParcelizer;
                                final /* synthetic */ ViewPropertyAnimator MediaBrowserCompat$ItemReceiver;
                                final /* synthetic */ RecyclerView.setContentView read;

                                public final void onAnimationStart(Animator animator) {
                                }

                                {
                                    this.read = r2;
                                    this.IconCompatParcelizer = r3;
                                    this.MediaBrowserCompat$ItemReceiver = r4;
                                }

                                public final void onAnimationCancel(Animator animator) {
                                    this.IconCompatParcelizer.setAlpha(1.0f);
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    this.MediaBrowserCompat$ItemReceiver.setListener((Animator.AnimatorListener) null);
                                    setMaxHeight setmaxheight = setMaxHeight.this;
                                    RecyclerView.setContentView setcontentview = this.read;
                                    RecyclerView.MediaMetadataCompat.read read2 = setmaxheight.MediaDescriptionCompat;
                                    if (read2 != null) {
                                        read2.write(setcontentview);
                                    }
                                    setMaxHeight.this.read.remove(this.read);
                                    setMaxHeight setmaxheight2 = setMaxHeight.this;
                                    if (!setmaxheight2.read()) {
                                        setmaxheight2.MediaBrowserCompat$CustomActionResultReceiver();
                                    }
                                }
                            }).start();
                        }
                        arrayList3.clear();
                        setMaxHeight.this.MediaBrowserCompat$ItemReceiver.remove(arrayList3);
                    }
                };
                if (z || z2 || z3) {
                    long j3 = 0;
                    if (z) {
                        j = this.MediaSessionCompat$Token;
                    } else {
                        j = 0;
                    }
                    if (z2) {
                        j2 = this.f25x50fd9e4a;
                    } else {
                        j2 = 0;
                    }
                    if (z3) {
                        j3 = this.MediaBrowserCompat$SearchResultReceiver;
                    }
                    SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver(((RecyclerView.setContentView) arrayList3.get(0)).write, (Runnable) r5, j + Math.max(j2, j3));
                    return;
                }
                r5.run();
            }
        }
    }

    public final boolean IconCompatParcelizer(RecyclerView.setContentView setcontentview) {
        MediaMetadataCompat(setcontentview);
        this.Keep.add(setcontentview);
        return true;
    }

    public final boolean write(RecyclerView.setContentView setcontentview) {
        MediaMetadataCompat(setcontentview);
        setcontentview.write.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.MediaSessionCompat$QueueItem.add(setcontentview);
        return true;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview, int i, int i2, int i3, int i4) {
        View view = setcontentview.write;
        int translationX = i + ((int) setcontentview.write.getTranslationX());
        int translationY = i2 + ((int) setcontentview.write.getTranslationY());
        MediaMetadataCompat(setcontentview);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            RecyclerView.MediaMetadataCompat.read read2 = this.MediaDescriptionCompat;
            if (read2 == null) {
                return false;
            }
            read2.write(setcontentview);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.AlertController$RecycleListView.add(new setMaxHeight$MediaBrowserCompat$CustomActionResultReceiver(setcontentview, translationX, translationY, i3, i4));
        return true;
    }

    public final boolean write(RecyclerView.setContentView setcontentview, RecyclerView.setContentView setcontentview2, int i, int i2, int i3, int i4) {
        if (setcontentview == setcontentview2) {
            return MediaBrowserCompat$ItemReceiver(setcontentview, i, i2, i3, i4);
        }
        float translationX = setcontentview.write.getTranslationX();
        float translationY = setcontentview.write.getTranslationY();
        float alpha = setcontentview.write.getAlpha();
        MediaMetadataCompat(setcontentview);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        setcontentview.write.setTranslationX(translationX);
        setcontentview.write.setTranslationY(translationY);
        setcontentview.write.setAlpha(alpha);
        if (setcontentview2 != null) {
            MediaMetadataCompat(setcontentview2);
            setcontentview2.write.setTranslationX((float) (-i5));
            setcontentview2.write.setTranslationY((float) (-i6));
            setcontentview2.write.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
        this.setHasDecor.add(new IconCompatParcelizer(setcontentview, setcontentview2, i, i2, i3, i4));
        return true;
    }

    private void MediaBrowserCompat$ItemReceiver(List<IconCompatParcelizer> list, RecyclerView.setContentView setcontentview) {
        for (int size = list.size() - 1; size >= 0; size--) {
            IconCompatParcelizer iconCompatParcelizer = list.get(size);
            if (IconCompatParcelizer(iconCompatParcelizer, setcontentview) && iconCompatParcelizer.IconCompatParcelizer == null && iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver == null) {
                list.remove(iconCompatParcelizer);
            }
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer iconCompatParcelizer) {
        if (iconCompatParcelizer.IconCompatParcelizer != null) {
            IconCompatParcelizer(iconCompatParcelizer, iconCompatParcelizer.IconCompatParcelizer);
        }
        if (iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver != null) {
            IconCompatParcelizer(iconCompatParcelizer, iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    private boolean IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, RecyclerView.setContentView setcontentview) {
        if (iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver == setcontentview) {
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = null;
        } else if (iconCompatParcelizer.IconCompatParcelizer != setcontentview) {
            return false;
        } else {
            iconCompatParcelizer.IconCompatParcelizer = null;
        }
        setcontentview.write.setAlpha(1.0f);
        setcontentview.write.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        setcontentview.write.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        RecyclerView.MediaMetadataCompat.read read2 = this.MediaDescriptionCompat;
        if (read2 == null) {
            return true;
        }
        read2.write(setcontentview);
        return true;
    }

    public final void read(RecyclerView.setContentView setcontentview) {
        View view = setcontentview.write;
        view.animate().cancel();
        int size = this.AlertController$RecycleListView.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.AlertController$RecycleListView.get(size).MediaBrowserCompat$CustomActionResultReceiver == setcontentview) {
                view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                RecyclerView.MediaMetadataCompat.read read2 = this.MediaDescriptionCompat;
                if (read2 != null) {
                    read2.write(setcontentview);
                }
                this.AlertController$RecycleListView.remove(size);
            }
        }
        MediaBrowserCompat$ItemReceiver(this.setHasDecor, setcontentview);
        if (this.Keep.remove(setcontentview)) {
            view.setAlpha(1.0f);
            RecyclerView.MediaMetadataCompat.read read3 = this.MediaDescriptionCompat;
            if (read3 != null) {
                read3.write(setcontentview);
            }
        }
        if (this.MediaSessionCompat$QueueItem.remove(setcontentview)) {
            view.setAlpha(1.0f);
            RecyclerView.MediaMetadataCompat.read read4 = this.MediaDescriptionCompat;
            if (read4 != null) {
                read4.write(setcontentview);
            }
        }
        for (int size2 = this.write.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.write.get(size2);
            MediaBrowserCompat$ItemReceiver(arrayList, setcontentview);
            if (arrayList.isEmpty()) {
                this.write.remove(size2);
            }
        }
        for (int size3 = this.MediaBrowserCompat$MediaItem.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.MediaBrowserCompat$MediaItem.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((setMaxHeight$MediaBrowserCompat$CustomActionResultReceiver) arrayList2.get(size4)).MediaBrowserCompat$CustomActionResultReceiver == setcontentview) {
                    view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    RecyclerView.MediaMetadataCompat.read read5 = this.MediaDescriptionCompat;
                    if (read5 != null) {
                        read5.write(setcontentview);
                    }
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.MediaBrowserCompat$MediaItem.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.MediaBrowserCompat$ItemReceiver.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.MediaBrowserCompat$ItemReceiver.get(size5);
            if (arrayList3.remove(setcontentview)) {
                view.setAlpha(1.0f);
                RecyclerView.MediaMetadataCompat.read read6 = this.MediaDescriptionCompat;
                if (read6 != null) {
                    read6.write(setcontentview);
                }
                if (arrayList3.isEmpty()) {
                    this.MediaBrowserCompat$ItemReceiver.remove(size5);
                }
            }
        }
        this.MediaMetadataCompat.remove(setcontentview);
        this.read.remove(setcontentview);
        this.IconCompatParcelizer.remove(setcontentview);
        this.MediaBrowserCompat$CustomActionResultReceiver.remove(setcontentview);
        if (!read()) {
            MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    private void MediaMetadataCompat(RecyclerView.setContentView setcontentview) {
        if (ParcelableVolumeInfo == null) {
            ParcelableVolumeInfo = new ValueAnimator().getInterpolator();
        }
        setcontentview.write.animate().setInterpolator(ParcelableVolumeInfo);
        read(setcontentview);
    }

    public final boolean read() {
        return !this.MediaSessionCompat$QueueItem.isEmpty() || !this.setHasDecor.isEmpty() || !this.AlertController$RecycleListView.isEmpty() || !this.Keep.isEmpty() || !this.MediaBrowserCompat$CustomActionResultReceiver.isEmpty() || !this.MediaMetadataCompat.isEmpty() || !this.read.isEmpty() || !this.IconCompatParcelizer.isEmpty() || !this.MediaBrowserCompat$MediaItem.isEmpty() || !this.MediaBrowserCompat$ItemReceiver.isEmpty() || !this.write.isEmpty();
    }

    public final void write() {
        int size = this.AlertController$RecycleListView.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            setMaxHeight$MediaBrowserCompat$CustomActionResultReceiver setmaxheight_mediabrowsercompat_customactionresultreceiver = this.AlertController$RecycleListView.get(size);
            View view = setmaxheight_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.write;
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            RecyclerView.setContentView setcontentview = setmaxheight_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
            RecyclerView.MediaMetadataCompat.read read2 = this.MediaDescriptionCompat;
            if (read2 != null) {
                read2.write(setcontentview);
            }
            this.AlertController$RecycleListView.remove(size);
        }
        for (int size2 = this.Keep.size() - 1; size2 >= 0; size2--) {
            RecyclerView.setContentView setcontentview2 = this.Keep.get(size2);
            RecyclerView.MediaMetadataCompat.read read3 = this.MediaDescriptionCompat;
            if (read3 != null) {
                read3.write(setcontentview2);
            }
            this.Keep.remove(size2);
        }
        int size3 = this.MediaSessionCompat$QueueItem.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.setContentView setcontentview3 = this.MediaSessionCompat$QueueItem.get(size3);
            setcontentview3.write.setAlpha(1.0f);
            RecyclerView.MediaMetadataCompat.read read4 = this.MediaDescriptionCompat;
            if (read4 != null) {
                read4.write(setcontentview3);
            }
            this.MediaSessionCompat$QueueItem.remove(size3);
        }
        for (int size4 = this.setHasDecor.size() - 1; size4 >= 0; size4--) {
            MediaBrowserCompat$CustomActionResultReceiver(this.setHasDecor.get(size4));
        }
        this.setHasDecor.clear();
        if (read()) {
            for (int size5 = this.MediaBrowserCompat$MediaItem.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.MediaBrowserCompat$MediaItem.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    setMaxHeight$MediaBrowserCompat$CustomActionResultReceiver setmaxheight_mediabrowsercompat_customactionresultreceiver2 = (setMaxHeight$MediaBrowserCompat$CustomActionResultReceiver) arrayList.get(size6);
                    View view2 = setmaxheight_mediabrowsercompat_customactionresultreceiver2.MediaBrowserCompat$CustomActionResultReceiver.write;
                    view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    view2.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    RecyclerView.setContentView setcontentview4 = setmaxheight_mediabrowsercompat_customactionresultreceiver2.MediaBrowserCompat$CustomActionResultReceiver;
                    RecyclerView.MediaMetadataCompat.read read5 = this.MediaDescriptionCompat;
                    if (read5 != null) {
                        read5.write(setcontentview4);
                    }
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.MediaBrowserCompat$MediaItem.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.MediaBrowserCompat$ItemReceiver.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.MediaBrowserCompat$ItemReceiver.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.setContentView setcontentview5 = (RecyclerView.setContentView) arrayList2.get(size8);
                    setcontentview5.write.setAlpha(1.0f);
                    RecyclerView.MediaMetadataCompat.read read6 = this.MediaDescriptionCompat;
                    if (read6 != null) {
                        read6.write(setcontentview5);
                    }
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.MediaBrowserCompat$ItemReceiver.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.write.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.write.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    MediaBrowserCompat$CustomActionResultReceiver((IconCompatParcelizer) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.write.remove(arrayList3);
                    }
                }
            }
            read((List<RecyclerView.setContentView>) this.MediaMetadataCompat);
            read((List<RecyclerView.setContentView>) this.MediaBrowserCompat$CustomActionResultReceiver);
            read((List<RecyclerView.setContentView>) this.read);
            read((List<RecyclerView.setContentView>) this.IconCompatParcelizer);
            MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    private static void read(List<RecyclerView.setContentView> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).write.animate().cancel();
        }
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, List<Object> list) {
        return !list.isEmpty() || super.MediaBrowserCompat$CustomActionResultReceiver(setcontentview, list);
    }
}

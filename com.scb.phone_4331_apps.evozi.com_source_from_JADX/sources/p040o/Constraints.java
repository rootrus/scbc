package p040o;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.C0065xe743b54a;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.Constraints */
public final class Constraints extends RecyclerView.RatingCompat implements C0065xe743b54a {
    private static final int[] AlertController$RecycleListView = {16842919};
    private static final int[] Keep = new int[0];
    private final RecyclerView.ParcelableVolumeInfo ActionMenuItemView = new RecyclerView.ParcelableVolumeInfo() {
        public final void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
            Constraints constraints = Constraints.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = constraints.MediaBrowserCompat$MediaItem.computeVerticalScrollRange();
            int i3 = constraints.RatingCompat;
            constraints.read = computeVerticalScrollRange - i3 > 0 && i3 >= constraints.MediaDescriptionCompat;
            int computeHorizontalScrollRange = constraints.MediaBrowserCompat$MediaItem.computeHorizontalScrollRange();
            int i4 = constraints.MediaMetadataCompat;
            boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= constraints.MediaDescriptionCompat;
            constraints.MediaBrowserCompat$CustomActionResultReceiver = z;
            if (constraints.read || z) {
                if (constraints.read) {
                    float f = (float) i3;
                    constraints.MediaSessionCompat$QueueItem = (int) ((f * (((float) computeVerticalScrollOffset) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                    constraints.ParcelableVolumeInfo = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
                }
                if (constraints.MediaBrowserCompat$CustomActionResultReceiver) {
                    float f2 = (float) computeHorizontalScrollOffset;
                    float f3 = (float) i4;
                    constraints.MediaBrowserCompat$ItemReceiver = (int) ((f3 * (f2 + (f3 / 2.0f))) / ((float) computeHorizontalScrollRange));
                    constraints.IconCompatParcelizer = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
                }
                int i5 = constraints.f3128x50fd9e4a;
                if (i5 == 0 || i5 == 1) {
                    constraints.read(1);
                }
            } else if (constraints.f3128x50fd9e4a != 0) {
                constraints.read(0);
            }
        }
    };
    private final Drawable AppCompatActivity;
    private final int[] AppCompatDelegateImpl$ListMenuDecorView = new int[2];
    private final StateListDrawable AppCompatDialogFragment;
    private final int[] AppCompatViewInflater = new int[2];
    int IconCompatParcelizer;
    boolean MediaBrowserCompat$CustomActionResultReceiver = false;
    int MediaBrowserCompat$ItemReceiver;
    RecyclerView MediaBrowserCompat$MediaItem;
    final ValueAnimator MediaBrowserCompat$SearchResultReceiver = ValueAnimator.ofFloat(new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    int f3128x50fd9e4a = 0;
    final int MediaDescriptionCompat;
    int MediaMetadataCompat = 0;
    int MediaSessionCompat$QueueItem;
    final Drawable MediaSessionCompat$ResultReceiverWrapper;
    final StateListDrawable MediaSessionCompat$Token;
    int ParcelableVolumeInfo;
    private float PlaybackStateCompat;
    private int PlaybackStateCompat$CustomAction = 0;
    int RatingCompat = 0;
    boolean read = false;
    private final int setBackgroundResource;
    private float setCheckable;
    private final int setChecked;
    private final int setContentView;
    private final int setExpandedFormat;
    private final Runnable setHasDecor = new Runnable() {
        public final void run() {
            Constraints constraints = Constraints.this;
            int i = constraints.write;
            if (i == 1) {
                constraints.MediaBrowserCompat$SearchResultReceiver.cancel();
            } else if (i != 2) {
                return;
            }
            constraints.write = 3;
            ValueAnimator valueAnimator = constraints.MediaBrowserCompat$SearchResultReceiver;
            valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
            constraints.MediaBrowserCompat$SearchResultReceiver.setDuration(500);
            constraints.MediaBrowserCompat$SearchResultReceiver.start();
        }
    };
    private final int setPadding;
    int write = 0;

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
    }

    /* renamed from: o.Constraints$ConstrainedList */
    public final class ConstrainedList {
        @SerializedName("cycles")
        private final List<String> IconCompatParcelizer;

        public ConstrainedList(List<String> list) {
            onGetStartedClick.write((Object) list, "cycles");
            this.IconCompatParcelizer = list;
        }
    }

    /* renamed from: o.Constraints$ConstrainedRandomAccessList */
    public final class ConstrainedRandomAccessList {
        @SerializedName("refId")
        private final String IconCompatParcelizer;
        @SerializedName("itemCode")
        private final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("relationId")
        private final int write;

        public ConstrainedRandomAccessList(String str, int i, String str2) {
            onGetStartedClick.write((Object) str, "refId");
            onGetStartedClick.write((Object) str2, "itemCode");
            this.IconCompatParcelizer = str;
            this.write = i;
            this.MediaBrowserCompat$ItemReceiver = str2;
        }
    }

    /* renamed from: o.Constraints$ConstrainedMultiset */
    public class ConstrainedMultiset {
        @SerializedName("rate")
        private String IconCompatParcelizer;
        @SerializedName("term")
        private String MediaBrowserCompat$CustomActionResultReceiver;

        public ConstrainedMultiset(String str, String str2) {
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.IconCompatParcelizer = str2;
        }
    }

    /* renamed from: o.Constraints$ConstrainedCollection */
    public class ConstrainedCollection {
        @SerializedName("cardRefNo")
        private String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("maskedCardNo")
        private String read;
        @SerializedName("cardName")
        private String write;

        public ConstrainedCollection(String str, String str2, String str3) {
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.write = str2;
            this.read = str3;
        }
    }

    /* renamed from: o.Constraints$NotNullConstraint */
    public class NotNullConstraint {
        @SerializedName("mileageInfo")
        private nullifyEvictable MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("productsToRedeem")
        private List<ConstrainedSet> MediaBrowserCompat$ItemReceiver;
        @SerializedName("customerInfo")
        private ConstrainedCollection read;

        public NotNullConstraint(ConstrainedCollection constrainedCollection, List<ConstrainedSet> list) {
            this.read = constrainedCollection;
            this.MediaBrowserCompat$ItemReceiver = list;
        }

        public NotNullConstraint(ConstrainedCollection constrainedCollection, List<ConstrainedSet> list, nullifyEvictable nullifyevictable) {
            this.read = constrainedCollection;
            this.MediaBrowserCompat$ItemReceiver = list;
            this.MediaBrowserCompat$CustomActionResultReceiver = nullifyevictable;
        }
    }

    /* renamed from: o.Constraints$ConstrainedSet */
    public class ConstrainedSet {
        @SerializedName("code")
        private String IconCompatParcelizer;
        @SerializedName("itemName")
        private String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("quantity")
        private int MediaBrowserCompat$ItemReceiver;
        @SerializedName("redeemMode")
        private CustomConcurrentHashMap MediaBrowserCompat$MediaItem;
        @SerializedName("point")
        private Long read;
        @SerializedName("payAmount")
        private Long write;

        public ConstrainedSet(String str, int i, CustomConcurrentHashMap customConcurrentHashMap, String str2, Long l, Long l2) {
            this.IconCompatParcelizer = str;
            this.MediaBrowserCompat$ItemReceiver = i;
            this.MediaBrowserCompat$MediaItem = customConcurrentHashMap;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
            this.read = l;
            this.write = l2;
        }
    }

    /* renamed from: o.Constraints$ConstrainedListIterator */
    public class ConstrainedListIterator {
        @SerializedName("sequenceNo")
        public String IconCompatParcelizer;
        @SerializedName("refNo")
        public String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("cycleNumber")
        public String MediaBrowserCompat$ItemReceiver;
        @SerializedName("transactionAmt")
        public String MediaMetadataCompat;
        @SerializedName("transactionDate")
        public String RatingCompat;
        @SerializedName("postDate")
        public String read;
        @SerializedName("merchName")
        public String write;

        private ConstrainedListIterator() {
        }

        public static ConstrainedListIterator MediaBrowserCompat$CustomActionResultReceiver() {
            return new ConstrainedListIterator();
        }
    }

    /* renamed from: o.Constraints$ConstrainedSortedSet */
    public class ConstrainedSortedSet {
        @SerializedName("cardCode")
        public String IconCompatParcelizer;
        @SerializedName("relationId")
        public Integer MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("pointsHigh")
        public Integer MediaBrowserCompat$ItemReceiver;
        @SerializedName("searchName")
        public String MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("sortOption")
        public zzvg MediaDescriptionCompat;
        @SerializedName("relationType")
        public readString read;
        @SerializedName("page")
        public int write;

        public ConstrainedSortedSet(Integer num, int i) {
            this.MediaBrowserCompat$CustomActionResultReceiver = num;
            this.write = i;
            this.MediaDescriptionCompat = null;
            this.MediaBrowserCompat$ItemReceiver = null;
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$SearchResultReceiver = null;
            this.read = readString.ALL;
        }

        public ConstrainedSortedSet(Integer num, int i, zzvg zzvg, Integer num2, String str, String str2, readString readstring) {
            this.MediaBrowserCompat$CustomActionResultReceiver = num;
            this.write = i;
            this.MediaDescriptionCompat = zzvg;
            this.MediaBrowserCompat$ItemReceiver = num2;
            this.IconCompatParcelizer = str;
            this.MediaBrowserCompat$SearchResultReceiver = str2;
            this.read = readstring;
        }
    }

    public Constraints(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.MediaSessionCompat$Token = stateListDrawable;
        this.MediaSessionCompat$ResultReceiverWrapper = drawable;
        this.AppCompatDialogFragment = stateListDrawable2;
        this.AppCompatActivity = drawable2;
        this.setExpandedFormat = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.setPadding = Math.max(i, drawable.getIntrinsicWidth());
        this.setBackgroundResource = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.setContentView = Math.max(i, drawable2.getIntrinsicWidth());
        this.MediaDescriptionCompat = i2;
        this.setChecked = i3;
        this.MediaSessionCompat$Token.setAlpha(255);
        this.MediaSessionCompat$ResultReceiverWrapper.setAlpha(255);
        this.MediaBrowserCompat$SearchResultReceiver.addListener(new Constraints$MediaBrowserCompat$CustomActionResultReceiver(this));
        this.MediaBrowserCompat$SearchResultReceiver.addUpdateListener(new read());
        RecyclerView recyclerView2 = this.MediaBrowserCompat$MediaItem;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.IconCompatParcelizer((RecyclerView.RatingCompat) this);
                RecyclerView recyclerView3 = this.MediaBrowserCompat$MediaItem;
                recyclerView3.mOnItemTouchListeners.remove(this);
                if (recyclerView3.RatingCompat == this) {
                    recyclerView3.RatingCompat = null;
                }
                RecyclerView recyclerView4 = this.MediaBrowserCompat$MediaItem;
                RecyclerView.ParcelableVolumeInfo parcelableVolumeInfo = this.ActionMenuItemView;
                List<RecyclerView.ParcelableVolumeInfo> list = recyclerView4.setGroupDividerEnabled;
                if (list != null) {
                    list.remove(parcelableVolumeInfo);
                }
                this.MediaBrowserCompat$MediaItem.removeCallbacks(this.setHasDecor);
            }
            this.MediaBrowserCompat$MediaItem = recyclerView;
            recyclerView.IconCompatParcelizer((RecyclerView.RatingCompat) this, -1);
            this.MediaBrowserCompat$MediaItem.mOnItemTouchListeners.add(this);
            RecyclerView recyclerView5 = this.MediaBrowserCompat$MediaItem;
            RecyclerView.ParcelableVolumeInfo parcelableVolumeInfo2 = this.ActionMenuItemView;
            if (recyclerView5.setGroupDividerEnabled == null) {
                recyclerView5.setGroupDividerEnabled = new ArrayList();
            }
            recyclerView5.setGroupDividerEnabled.add(parcelableVolumeInfo2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void read(int i) {
        if (i == 2 && this.f3128x50fd9e4a != 2) {
            this.MediaSessionCompat$Token.setState(AlertController$RecycleListView);
            this.MediaBrowserCompat$MediaItem.removeCallbacks(this.setHasDecor);
        }
        if (i == 0) {
            this.MediaBrowserCompat$MediaItem.invalidate();
        } else {
            IconCompatParcelizer();
        }
        if (this.f3128x50fd9e4a == 2 && i != 2) {
            this.MediaSessionCompat$Token.setState(Keep);
            this.MediaBrowserCompat$MediaItem.removeCallbacks(this.setHasDecor);
            this.MediaBrowserCompat$MediaItem.postDelayed(this.setHasDecor, 1200);
        } else if (i == 1) {
            this.MediaBrowserCompat$MediaItem.removeCallbacks(this.setHasDecor);
            this.MediaBrowserCompat$MediaItem.postDelayed(this.setHasDecor, 1500);
        }
        this.f3128x50fd9e4a = i;
    }

    private void IconCompatParcelizer() {
        int i = this.write;
        if (i != 0) {
            if (i == 3) {
                this.MediaBrowserCompat$SearchResultReceiver.cancel();
            } else {
                return;
            }
        }
        this.write = 1;
        ValueAnimator valueAnimator = this.MediaBrowserCompat$SearchResultReceiver;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.MediaBrowserCompat$SearchResultReceiver.setDuration(500);
        this.MediaBrowserCompat$SearchResultReceiver.setStartDelay(0);
        this.MediaBrowserCompat$SearchResultReceiver.start();
    }

    public final void IconCompatParcelizer(Canvas canvas, RecyclerView recyclerView) {
        if (this.MediaMetadataCompat != this.MediaBrowserCompat$MediaItem.getWidth() || this.RatingCompat != this.MediaBrowserCompat$MediaItem.getHeight()) {
            this.MediaMetadataCompat = this.MediaBrowserCompat$MediaItem.getWidth();
            this.RatingCompat = this.MediaBrowserCompat$MediaItem.getHeight();
            read(0);
        } else if (this.write != 0) {
            if (this.read) {
                int i = this.MediaMetadataCompat;
                int i2 = this.setExpandedFormat;
                int i3 = i - i2;
                int i4 = this.MediaSessionCompat$QueueItem;
                int i5 = this.ParcelableVolumeInfo;
                int i6 = i4 - (i5 / 2);
                this.MediaSessionCompat$Token.setBounds(0, 0, i2, i5);
                this.MediaSessionCompat$ResultReceiverWrapper.setBounds(0, 0, this.setPadding, this.RatingCompat);
                boolean z = true;
                if (SwitchCompat.m3079x50fd9e4a(this.MediaBrowserCompat$MediaItem) != 1) {
                    z = false;
                }
                if (z) {
                    this.MediaSessionCompat$ResultReceiverWrapper.draw(canvas);
                    canvas.translate((float) this.setExpandedFormat, (float) i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.MediaSessionCompat$Token.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate((float) (-this.setExpandedFormat), (float) (-i6));
                } else {
                    canvas.translate((float) i3, BitmapDescriptorFactory.HUE_RED);
                    this.MediaSessionCompat$ResultReceiverWrapper.draw(canvas);
                    canvas.translate(BitmapDescriptorFactory.HUE_RED, (float) i6);
                    this.MediaSessionCompat$Token.draw(canvas);
                    canvas.translate((float) (-i3), (float) (-i6));
                }
            }
            if (this.MediaBrowserCompat$CustomActionResultReceiver) {
                int i7 = this.RatingCompat;
                int i8 = this.setBackgroundResource;
                int i9 = i7 - i8;
                int i10 = this.MediaBrowserCompat$ItemReceiver;
                int i11 = this.IconCompatParcelizer;
                int i12 = i10 - (i11 / 2);
                this.AppCompatDialogFragment.setBounds(0, 0, i11, i8);
                this.AppCompatActivity.setBounds(0, 0, this.MediaMetadataCompat, this.setContentView);
                canvas.translate(BitmapDescriptorFactory.HUE_RED, (float) i9);
                this.AppCompatActivity.draw(canvas);
                canvas.translate((float) i12, BitmapDescriptorFactory.HUE_RED);
                this.AppCompatDialogFragment.draw(canvas);
                canvas.translate((float) (-i12), (float) (-i9));
            }
        }
    }

    public final boolean IconCompatParcelizer(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f3128x50fd9e4a;
        if (i == 1) {
            boolean IconCompatParcelizer2 = IconCompatParcelizer(motionEvent.getX(), motionEvent.getY());
            boolean read2 = read(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!IconCompatParcelizer2 && !read2) {
                return false;
            }
            if (read2) {
                this.PlaybackStateCompat$CustomAction = 1;
                this.PlaybackStateCompat = (float) ((int) motionEvent.getX());
            } else if (IconCompatParcelizer2) {
                this.PlaybackStateCompat$CustomAction = 2;
                this.setCheckable = (float) ((int) motionEvent.getY());
            }
            read(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f3128x50fd9e4a != 0) {
            if (motionEvent.getAction() == 0) {
                boolean IconCompatParcelizer2 = IconCompatParcelizer(motionEvent.getX(), motionEvent.getY());
                boolean read2 = read(motionEvent.getX(), motionEvent.getY());
                if (IconCompatParcelizer2 || read2) {
                    if (read2) {
                        this.PlaybackStateCompat$CustomAction = 1;
                        this.PlaybackStateCompat = (float) ((int) motionEvent.getX());
                    } else if (IconCompatParcelizer2) {
                        this.PlaybackStateCompat$CustomAction = 2;
                        this.setCheckable = (float) ((int) motionEvent.getY());
                    }
                    read(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f3128x50fd9e4a == 2) {
                this.setCheckable = BitmapDescriptorFactory.HUE_RED;
                this.PlaybackStateCompat = BitmapDescriptorFactory.HUE_RED;
                read(1);
                this.PlaybackStateCompat$CustomAction = 0;
            } else if (motionEvent.getAction() == 2 && this.f3128x50fd9e4a == 2) {
                IconCompatParcelizer();
                if (this.PlaybackStateCompat$CustomAction == 1) {
                    float x = motionEvent.getX();
                    int[] iArr = this.AppCompatDelegateImpl$ListMenuDecorView;
                    int i = this.setChecked;
                    iArr[0] = i;
                    iArr[1] = this.MediaMetadataCompat - i;
                    float max = Math.max((float) iArr[0], Math.min((float) iArr[1], x));
                    if (Math.abs(((float) this.MediaBrowserCompat$ItemReceiver) - max) >= 2.0f) {
                        int MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(this.PlaybackStateCompat, max, iArr, this.MediaBrowserCompat$MediaItem.computeHorizontalScrollRange(), this.MediaBrowserCompat$MediaItem.computeHorizontalScrollOffset(), this.MediaMetadataCompat);
                        if (MediaBrowserCompat$CustomActionResultReceiver2 != 0) {
                            this.MediaBrowserCompat$MediaItem.scrollBy(MediaBrowserCompat$CustomActionResultReceiver2, 0);
                        }
                        this.PlaybackStateCompat = max;
                    }
                }
                if (this.PlaybackStateCompat$CustomAction == 2) {
                    float y = motionEvent.getY();
                    int[] iArr2 = this.AppCompatViewInflater;
                    int i2 = this.setChecked;
                    iArr2[0] = i2;
                    iArr2[1] = this.RatingCompat - i2;
                    float max2 = Math.max((float) iArr2[0], Math.min((float) iArr2[1], y));
                    if (Math.abs(((float) this.MediaSessionCompat$QueueItem) - max2) >= 2.0f) {
                        int MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver(this.setCheckable, max2, iArr2, this.MediaBrowserCompat$MediaItem.computeVerticalScrollRange(), this.MediaBrowserCompat$MediaItem.computeVerticalScrollOffset(), this.RatingCompat);
                        if (MediaBrowserCompat$CustomActionResultReceiver3 != 0) {
                            this.MediaBrowserCompat$MediaItem.scrollBy(0, MediaBrowserCompat$CustomActionResultReceiver3);
                        }
                        this.setCheckable = max2;
                    }
                }
            }
        }
    }

    private static int MediaBrowserCompat$CustomActionResultReceiver(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    private boolean read(float f, float f2) {
        if (f2 >= ((float) (this.RatingCompat - this.setBackgroundResource))) {
            int i = this.MediaBrowserCompat$ItemReceiver;
            int i2 = this.IconCompatParcelizer / 2;
            return f >= ((float) (i - i2)) && f <= ((float) (i + i2));
        }
    }

    /* renamed from: o.Constraints$read */
    class read implements ValueAnimator.AnimatorUpdateListener {
        read() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            Constraints.this.MediaSessionCompat$Token.setAlpha(floatValue);
            Constraints.this.MediaSessionCompat$ResultReceiverWrapper.setAlpha(floatValue);
            Constraints.this.MediaBrowserCompat$MediaItem.invalidate();
        }
    }

    private boolean IconCompatParcelizer(float f, float f2) {
        if (SwitchCompat.m3079x50fd9e4a(this.MediaBrowserCompat$MediaItem) == 1) {
            if (f > ((float) (this.setExpandedFormat / 2))) {
                return false;
            }
        } else if (f < ((float) (this.MediaMetadataCompat - this.setExpandedFormat))) {
            return false;
        }
        int i = this.MediaSessionCompat$QueueItem;
        int i2 = this.ParcelableVolumeInfo / 2;
        return f2 >= ((float) (i - i2)) && f2 <= ((float) (i + i2));
    }
}

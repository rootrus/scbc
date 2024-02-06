package androidx.gridlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Pair;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import androidx.legacy.widget.Space;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.SwitchCompat;
import p040o.setPaddingRelative;
import p040o.setSplitTrack;

public class GridLayout extends ViewGroup {
    private static Printer AlertController$RecycleListView = new Printer() {
        public final void println(String str) {
        }
    };
    private static GridLayout$MediaBrowserCompat$ItemReceiver AppCompatActivity;
    private static final int AppCompatDelegateImpl$ListMenuDecorView = setPaddingRelative.IconCompatParcelizer.GridLayout_useDefaultMargins;
    private static final int AppCompatDialogFragment = setPaddingRelative.IconCompatParcelizer.GridLayout_rowOrderPreserved;
    public static final GridLayout$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
    private static final int Keep = setPaddingRelative.IconCompatParcelizer.GridLayout_rowCount;
    static final GridLayout$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = new GridLayout$MediaBrowserCompat$ItemReceiver() {
        /* access modifiers changed from: package-private */
        public final int MediaBrowserCompat$CustomActionResultReceiver(View view, int i) {
            return PKIFailureInfo.systemUnavail;
        }

        /* access modifiers changed from: package-private */
        public final String MediaBrowserCompat$ItemReceiver() {
            return "UNDEFINED";
        }

        public final int read(View view, int i, int i2) {
            return PKIFailureInfo.systemUnavail;
        }
    };
    public static final GridLayout$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver = new GridLayout$MediaBrowserCompat$ItemReceiver() {
        /* access modifiers changed from: package-private */
        public final int MediaBrowserCompat$CustomActionResultReceiver(View view, int i) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public final String MediaBrowserCompat$ItemReceiver() {
            return "FILL";
        }

        public final int read(View view, int i, int i2) {
            return PKIFailureInfo.systemUnavail;
        }

        public final int write(int i, int i2) {
            return i2;
        }
    };
    private static GridLayout$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$SearchResultReceiver = new GridLayout$MediaBrowserCompat$ItemReceiver() {
        /* access modifiers changed from: package-private */
        public final int MediaBrowserCompat$CustomActionResultReceiver(View view, int i) {
            return i >> 1;
        }

        /* access modifiers changed from: package-private */
        public final String MediaBrowserCompat$ItemReceiver() {
            return "CENTER";
        }

        public final int read(View view, int i, int i2) {
            return i >> 1;
        }
    };

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private static final GridLayout$MediaBrowserCompat$ItemReceiver f19x50fd9e4a = new GridLayout$MediaBrowserCompat$ItemReceiver() {
        /* access modifiers changed from: package-private */
        public final int MediaBrowserCompat$CustomActionResultReceiver(View view, int i) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public final String MediaBrowserCompat$ItemReceiver() {
            return "LEADING";
        }

        public final int read(View view, int i, int i2) {
            return 0;
        }
    };
    private static GridLayout$MediaBrowserCompat$ItemReceiver MediaDescriptionCompat;
    private static final int MediaMetadataCompat = setPaddingRelative.IconCompatParcelizer.GridLayout_alignmentMode;
    private static final int MediaSessionCompat$QueueItem = setPaddingRelative.IconCompatParcelizer.GridLayout_columnCount;
    private static final int MediaSessionCompat$ResultReceiverWrapper = setPaddingRelative.IconCompatParcelizer.GridLayout_columnOrderPreserved;
    private static GridLayout$MediaBrowserCompat$ItemReceiver MediaSessionCompat$Token;
    private static GridLayout$MediaBrowserCompat$ItemReceiver ParcelableVolumeInfo;
    private static final int PlaybackStateCompat = setPaddingRelative.IconCompatParcelizer.GridLayout_orientation;
    private static GridLayout$MediaBrowserCompat$ItemReceiver PlaybackStateCompat$CustomAction;
    private static Printer setHasDecor = new LogPrinter(3, GridLayout.class.getName());
    public static final GridLayout$MediaBrowserCompat$ItemReceiver write = new GridLayout$MediaBrowserCompat$ItemReceiver() {
        /* access modifiers changed from: package-private */
        public final int MediaBrowserCompat$CustomActionResultReceiver(View view, int i) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public final String MediaBrowserCompat$ItemReceiver() {
            return "BASELINE";
        }

        public final int read(View view, int i, int i2) {
            if (view.getVisibility() == 8) {
                return 0;
            }
            int baseline = view.getBaseline();
            return baseline == -1 ? PKIFailureInfo.systemUnavail : baseline;
        }

        public final read IconCompatParcelizer() {
            return new read() {
                private int MediaBrowserCompat$CustomActionResultReceiver;

                /* access modifiers changed from: protected */
                public final void MediaBrowserCompat$CustomActionResultReceiver() {
                    super.MediaBrowserCompat$CustomActionResultReceiver();
                    this.MediaBrowserCompat$CustomActionResultReceiver = PKIFailureInfo.systemUnavail;
                }

                /* access modifiers changed from: protected */
                public final void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
                    super.MediaBrowserCompat$CustomActionResultReceiver(i, i2);
                    this.MediaBrowserCompat$CustomActionResultReceiver = Math.max(this.MediaBrowserCompat$CustomActionResultReceiver, i + i2);
                }

                /* access modifiers changed from: protected */
                public final int MediaBrowserCompat$ItemReceiver(boolean z) {
                    return Math.max(super.MediaBrowserCompat$ItemReceiver(z), this.MediaBrowserCompat$CustomActionResultReceiver);
                }

                /* access modifiers changed from: protected */
                public final int MediaBrowserCompat$ItemReceiver(GridLayout gridLayout, View view, GridLayout$MediaBrowserCompat$ItemReceiver gridLayout$MediaBrowserCompat$ItemReceiver, int i, boolean z) {
                    return Math.max(0, super.MediaBrowserCompat$ItemReceiver(gridLayout, view, gridLayout$MediaBrowserCompat$ItemReceiver, i, z));
                }
            };
        }
    };
    private int ActionMenuItemView;
    Printer MediaBrowserCompat$MediaItem;
    final GridLayout$MediaBrowserCompat$CustomActionResultReceiver RatingCompat;
    final GridLayout$MediaBrowserCompat$CustomActionResultReceiver read;
    private int setBackgroundResource;
    private int setChecked;
    private int setContentView;
    private boolean setExpandedFormat;

    static boolean IconCompatParcelizer(int i) {
        return (i & 2) != 0;
    }

    static {
        final C00474 r0 = new GridLayout$MediaBrowserCompat$ItemReceiver() {
            /* access modifiers changed from: package-private */
            public final int MediaBrowserCompat$CustomActionResultReceiver(View view, int i) {
                return i;
            }

            /* access modifiers changed from: package-private */
            public final String MediaBrowserCompat$ItemReceiver() {
                return "TRAILING";
            }

            public final int read(View view, int i, int i2) {
                return i;
            }
        };
        final GridLayout$MediaBrowserCompat$ItemReceiver gridLayout$MediaBrowserCompat$ItemReceiver = f19x50fd9e4a;
        AppCompatActivity = gridLayout$MediaBrowserCompat$ItemReceiver;
        MediaDescriptionCompat = r0;
        IconCompatParcelizer = gridLayout$MediaBrowserCompat$ItemReceiver;
        ParcelableVolumeInfo = r0;
        MediaSessionCompat$Token = new GridLayout$MediaBrowserCompat$ItemReceiver() {
            /* access modifiers changed from: package-private */
            public final int MediaBrowserCompat$CustomActionResultReceiver(View view, int i) {
                boolean z = true;
                if (SwitchCompat.m3079x50fd9e4a(view) != 1) {
                    z = false;
                }
                return (!z ? r0 : r1).MediaBrowserCompat$CustomActionResultReceiver(view, i);
            }

            public final int read(View view, int i, int i2) {
                boolean z = true;
                if (SwitchCompat.m3079x50fd9e4a(view) != 1) {
                    z = false;
                }
                return (!z ? r0 : r1).read(view, i, i2);
            }

            /* access modifiers changed from: package-private */
            public final String MediaBrowserCompat$ItemReceiver() {
                StringBuilder sb = new StringBuilder();
                sb.append("SWITCHING[L:");
                sb.append(r0.MediaBrowserCompat$ItemReceiver());
                sb.append(", R:");
                sb.append(r1.MediaBrowserCompat$ItemReceiver());
                sb.append("]");
                return sb.toString();
            }
        };
        final GridLayout$MediaBrowserCompat$ItemReceiver gridLayout$MediaBrowserCompat$ItemReceiver2 = ParcelableVolumeInfo;
        final GridLayout$MediaBrowserCompat$ItemReceiver gridLayout$MediaBrowserCompat$ItemReceiver3 = IconCompatParcelizer;
        PlaybackStateCompat$CustomAction = new GridLayout$MediaBrowserCompat$ItemReceiver() {
            /* access modifiers changed from: package-private */
            public final int MediaBrowserCompat$CustomActionResultReceiver(View view, int i) {
                boolean z = true;
                if (SwitchCompat.m3079x50fd9e4a(view) != 1) {
                    z = false;
                }
                return (!z ? gridLayout$MediaBrowserCompat$ItemReceiver2 : gridLayout$MediaBrowserCompat$ItemReceiver3).MediaBrowserCompat$CustomActionResultReceiver(view, i);
            }

            public final int read(View view, int i, int i2) {
                boolean z = true;
                if (SwitchCompat.m3079x50fd9e4a(view) != 1) {
                    z = false;
                }
                return (!z ? gridLayout$MediaBrowserCompat$ItemReceiver2 : gridLayout$MediaBrowserCompat$ItemReceiver3).read(view, i, i2);
            }

            /* access modifiers changed from: package-private */
            public final String MediaBrowserCompat$ItemReceiver() {
                StringBuilder sb = new StringBuilder();
                sb.append("SWITCHING[L:");
                sb.append(gridLayout$MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver());
                sb.append(", R:");
                sb.append(gridLayout$MediaBrowserCompat$ItemReceiver3.MediaBrowserCompat$ItemReceiver());
                sb.append("]");
                return sb.toString();
            }
        };
    }

    public GridLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.read = new GridLayout$MediaBrowserCompat$CustomActionResultReceiver(this, true);
        this.RatingCompat = new GridLayout$MediaBrowserCompat$CustomActionResultReceiver(this, false);
        this.ActionMenuItemView = 0;
        this.setExpandedFormat = false;
        this.setBackgroundResource = 1;
        this.setChecked = 0;
        this.MediaBrowserCompat$MediaItem = setHasDecor;
        this.setContentView = context.getResources().getDimensionPixelOffset(setPaddingRelative.write.default_gap);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setPaddingRelative.IconCompatParcelizer.GridLayout);
        try {
            setRowCount(obtainStyledAttributes.getInt(Keep, PKIFailureInfo.systemUnavail));
            setColumnCount(obtainStyledAttributes.getInt(MediaSessionCompat$QueueItem, PKIFailureInfo.systemUnavail));
            setOrientation(obtainStyledAttributes.getInt(PlaybackStateCompat, 0));
            setUseDefaultMargins(obtainStyledAttributes.getBoolean(AppCompatDelegateImpl$ListMenuDecorView, false));
            setAlignmentMode(obtainStyledAttributes.getInt(MediaMetadataCompat, 1));
            setRowOrderPreserved(obtainStyledAttributes.getBoolean(AppCompatDialogFragment, true));
            setColumnOrderPreserved(obtainStyledAttributes.getBoolean(MediaSessionCompat$ResultReceiverWrapper, true));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public GridLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GridLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setOrientation(int i) {
        if (this.ActionMenuItemView != i) {
            this.ActionMenuItemView = i;
            MediaBrowserCompat$CustomActionResultReceiver();
            requestLayout();
        }
    }

    public void setRowCount(int i) {
        this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(i);
        MediaBrowserCompat$CustomActionResultReceiver();
        requestLayout();
    }

    public void setColumnCount(int i) {
        this.read.MediaBrowserCompat$CustomActionResultReceiver(i);
        MediaBrowserCompat$CustomActionResultReceiver();
        requestLayout();
    }

    public void setUseDefaultMargins(boolean z) {
        this.setExpandedFormat = z;
        requestLayout();
    }

    public void setAlignmentMode(int i) {
        this.setBackgroundResource = i;
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z) {
        GridLayout$MediaBrowserCompat$CustomActionResultReceiver gridLayout$MediaBrowserCompat$CustomActionResultReceiver = this.RatingCompat;
        gridLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = z;
        gridLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z) {
        GridLayout$MediaBrowserCompat$CustomActionResultReceiver gridLayout$MediaBrowserCompat$CustomActionResultReceiver = this.read;
        gridLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = z;
        gridLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver();
        requestLayout();
    }

    public void setPrinter(Printer printer) {
        if (printer == null) {
            printer = AlertController$RecycleListView;
        }
        this.MediaBrowserCompat$MediaItem = printer;
    }

    static int MediaBrowserCompat$ItemReceiver(int[] iArr) {
        int i = -1;
        for (int max : iArr) {
            i = Math.max(i, max);
        }
        return i;
    }

    static <T> T[] IconCompatParcelizer(T[] tArr, T[] tArr2) {
        T[] tArr3 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), tArr.length + tArr2.length);
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    static GridLayout$MediaBrowserCompat$ItemReceiver write(int i, boolean z) {
        int i2 = (i & (z ? 7 : 112)) >> (z ? 0 : 4);
        if (i2 == 1) {
            return MediaBrowserCompat$SearchResultReceiver;
        }
        if (i2 == 3) {
            return z ? MediaSessionCompat$Token : AppCompatActivity;
        }
        if (i2 == 5) {
            return z ? PlaybackStateCompat$CustomAction : MediaDescriptionCompat;
        }
        if (i2 == 7) {
            return MediaBrowserCompat$ItemReceiver;
        }
        if (i2 == 8388611) {
            return IconCompatParcelizer;
        }
        if (i2 != 8388613) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        return ParcelableVolumeInfo;
    }

    private int MediaBrowserCompat$CustomActionResultReceiver(View view, GridLayout$MediaBrowserCompat$MediaItem gridLayout$MediaBrowserCompat$MediaItem, boolean z, boolean z2) {
        if (!this.setExpandedFormat) {
            return 0;
        }
        MediaMetadataCompat mediaMetadataCompat = z ? gridLayout$MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver : gridLayout$MediaBrowserCompat$MediaItem.write;
        GridLayout$MediaBrowserCompat$CustomActionResultReceiver gridLayout$MediaBrowserCompat$CustomActionResultReceiver = z ? this.read : this.RatingCompat;
        RatingCompat ratingCompat = mediaMetadataCompat.read;
        if (z) {
            if (SwitchCompat.m3079x50fd9e4a(this) == 1) {
                z2 = !z2;
            }
        }
        if (z2) {
            int i = ratingCompat.read;
        } else {
            gridLayout$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
        }
        if (view.getClass() == Space.class || view.getClass() == android.widget.Space.class) {
            return 0;
        }
        return this.setContentView / 2;
    }

    /* access modifiers changed from: package-private */
    public int MediaBrowserCompat$CustomActionResultReceiver(View view, boolean z, boolean z2) {
        GridLayout$MediaBrowserCompat$CustomActionResultReceiver gridLayout$MediaBrowserCompat$CustomActionResultReceiver;
        int[] iArr;
        if (this.setBackgroundResource == 1) {
            return MediaBrowserCompat$ItemReceiver(view, z, z2);
        }
        if (z) {
            gridLayout$MediaBrowserCompat$CustomActionResultReceiver = this.read;
        } else {
            gridLayout$MediaBrowserCompat$CustomActionResultReceiver = this.RatingCompat;
        }
        if (z2) {
            if (gridLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver == null) {
                gridLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = new int[(Math.max(gridLayout$MediaBrowserCompat$CustomActionResultReceiver.write, gridLayout$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer()) + 1)];
            }
            if (!gridLayout$MediaBrowserCompat$CustomActionResultReceiver.read) {
                gridLayout$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(true);
                gridLayout$MediaBrowserCompat$CustomActionResultReceiver.read = true;
            }
            iArr = gridLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        } else {
            if (gridLayout$MediaBrowserCompat$CustomActionResultReceiver.RatingCompat == null) {
                gridLayout$MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = new int[(Math.max(gridLayout$MediaBrowserCompat$CustomActionResultReceiver.write, gridLayout$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer()) + 1)];
            }
            if (!gridLayout$MediaBrowserCompat$CustomActionResultReceiver.f20x50fd9e4a) {
                gridLayout$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(false);
                gridLayout$MediaBrowserCompat$CustomActionResultReceiver.f20x50fd9e4a = true;
            }
            iArr = gridLayout$MediaBrowserCompat$CustomActionResultReceiver.RatingCompat;
        }
        GridLayout$MediaBrowserCompat$MediaItem gridLayout$MediaBrowserCompat$MediaItem = (GridLayout$MediaBrowserCompat$MediaItem) view.getLayoutParams();
        RatingCompat ratingCompat = (z ? gridLayout$MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver : gridLayout$MediaBrowserCompat$MediaItem.write).read;
        return iArr[z2 ? ratingCompat.read : ratingCompat.MediaBrowserCompat$CustomActionResultReceiver];
    }

    private void MediaBrowserCompat$CustomActionResultReceiver() {
        this.setChecked = 0;
        GridLayout$MediaBrowserCompat$CustomActionResultReceiver gridLayout$MediaBrowserCompat$CustomActionResultReceiver = this.read;
        if (gridLayout$MediaBrowserCompat$CustomActionResultReceiver != null) {
            gridLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }
        GridLayout$MediaBrowserCompat$CustomActionResultReceiver gridLayout$MediaBrowserCompat$CustomActionResultReceiver2 = this.RatingCompat;
        if (gridLayout$MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            gridLayout$MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver();
        }
        GridLayout$MediaBrowserCompat$CustomActionResultReceiver gridLayout$MediaBrowserCompat$CustomActionResultReceiver3 = this.read;
        if (gridLayout$MediaBrowserCompat$CustomActionResultReceiver3 != null && this.RatingCompat != null) {
            gridLayout$MediaBrowserCompat$CustomActionResultReceiver3.MediaDescriptionCompat();
            this.RatingCompat.MediaDescriptionCompat();
        }
    }

    static GridLayout$MediaBrowserCompat$MediaItem IconCompatParcelizer(View view) {
        return (GridLayout$MediaBrowserCompat$MediaItem) view.getLayoutParams();
    }

    static void IconCompatParcelizer(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(". ");
        throw new IllegalArgumentException(sb.toString());
    }

    private void write(GridLayout$MediaBrowserCompat$MediaItem gridLayout$MediaBrowserCompat$MediaItem, boolean z) {
        String str = z ? "column" : "row";
        RatingCompat ratingCompat = (z ? gridLayout$MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver : gridLayout$MediaBrowserCompat$MediaItem.write).read;
        if (ratingCompat.read != Integer.MIN_VALUE && ratingCompat.read < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" indices must be positive");
            IconCompatParcelizer(sb.toString());
        }
        int i = (z ? this.read : this.RatingCompat).write;
        if (i != Integer.MIN_VALUE) {
            if (ratingCompat.MediaBrowserCompat$CustomActionResultReceiver > i) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" indices (start + span) mustn't exceed the ");
                sb2.append(str);
                sb2.append(" count");
                IconCompatParcelizer(sb2.toString());
            }
            if (ratingCompat.MediaBrowserCompat$CustomActionResultReceiver - ratingCompat.read > i) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" span mustn't exceed the ");
                sb3.append(str);
                sb3.append(" count");
                IconCompatParcelizer(sb3.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof GridLayout$MediaBrowserCompat$MediaItem)) {
            return false;
        }
        GridLayout$MediaBrowserCompat$MediaItem gridLayout$MediaBrowserCompat$MediaItem = (GridLayout$MediaBrowserCompat$MediaItem) layoutParams;
        write(gridLayout$MediaBrowserCompat$MediaItem, true);
        write(gridLayout$MediaBrowserCompat$MediaItem, false);
        return true;
    }

    private int read() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                i = (i * 31) + ((GridLayout$MediaBrowserCompat$MediaItem) childAt.getLayoutParams()).hashCode();
            }
        }
        return i;
    }

    private void IconCompatParcelizer() {
        boolean z;
        while (true) {
            int i = this.setChecked;
            if (i == 0) {
                boolean z2 = this.ActionMenuItemView == 0;
                GridLayout$MediaBrowserCompat$CustomActionResultReceiver gridLayout$MediaBrowserCompat$CustomActionResultReceiver = z2 ? this.read : this.RatingCompat;
                int i2 = gridLayout$MediaBrowserCompat$CustomActionResultReceiver.write != Integer.MIN_VALUE ? gridLayout$MediaBrowserCompat$CustomActionResultReceiver.write : 0;
                int[] iArr = new int[i2];
                int childCount = getChildCount();
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < childCount; i5++) {
                    GridLayout$MediaBrowserCompat$MediaItem gridLayout$MediaBrowserCompat$MediaItem = (GridLayout$MediaBrowserCompat$MediaItem) getChildAt(i5).getLayoutParams();
                    MediaMetadataCompat mediaMetadataCompat = z2 ? gridLayout$MediaBrowserCompat$MediaItem.write : gridLayout$MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver;
                    RatingCompat ratingCompat = mediaMetadataCompat.read;
                    boolean z3 = mediaMetadataCompat.MediaBrowserCompat$ItemReceiver;
                    int i6 = ratingCompat.MediaBrowserCompat$CustomActionResultReceiver - ratingCompat.read;
                    if (z3) {
                        i3 = ratingCompat.read;
                    }
                    MediaMetadataCompat mediaMetadataCompat2 = z2 ? gridLayout$MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver : gridLayout$MediaBrowserCompat$MediaItem.write;
                    RatingCompat ratingCompat2 = mediaMetadataCompat2.read;
                    boolean z4 = mediaMetadataCompat2.MediaBrowserCompat$ItemReceiver;
                    int i7 = ratingCompat2.MediaBrowserCompat$CustomActionResultReceiver - ratingCompat2.read;
                    if (i2 != 0) {
                        i7 = Math.min(i7, i2 - (z4 ? Math.min(ratingCompat2.read, i2) : 0));
                    }
                    if (z4) {
                        i4 = ratingCompat2.read;
                    }
                    if (i2 != 0) {
                        if (!z3 || !z4) {
                            while (true) {
                                int i8 = i4 + i7;
                                if (i8 <= i2) {
                                    int i9 = i4;
                                    while (true) {
                                        if (i9 >= i8) {
                                            z = true;
                                            break;
                                        } else if (iArr[i9] > i3) {
                                            break;
                                        } else {
                                            i9++;
                                        }
                                    }
                                }
                                z = false;
                                if (z) {
                                    break;
                                } else if (z4) {
                                    i3++;
                                } else if (i8 <= i2) {
                                    i4++;
                                } else {
                                    i3++;
                                    i4 = 0;
                                }
                            }
                        }
                        Arrays.fill(iArr, Math.min(i4, i2), Math.min(i4 + i7, i2), i3 + i6);
                    }
                    if (z2) {
                        RatingCompat ratingCompat3 = new RatingCompat(i3, i6 + i3);
                        MediaMetadataCompat mediaMetadataCompat3 = gridLayout$MediaBrowserCompat$MediaItem.write;
                        gridLayout$MediaBrowserCompat$MediaItem.write = new MediaMetadataCompat(mediaMetadataCompat3.MediaBrowserCompat$ItemReceiver, ratingCompat3, mediaMetadataCompat3.MediaBrowserCompat$CustomActionResultReceiver, mediaMetadataCompat3.write);
                        RatingCompat ratingCompat4 = new RatingCompat(i4, i7 + i4);
                        MediaMetadataCompat mediaMetadataCompat4 = gridLayout$MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver;
                        gridLayout$MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver = new MediaMetadataCompat(mediaMetadataCompat4.MediaBrowserCompat$ItemReceiver, ratingCompat4, mediaMetadataCompat4.MediaBrowserCompat$CustomActionResultReceiver, mediaMetadataCompat4.write);
                    } else {
                        RatingCompat ratingCompat5 = new RatingCompat(i4, i7 + i4);
                        MediaMetadataCompat mediaMetadataCompat5 = gridLayout$MediaBrowserCompat$MediaItem.write;
                        gridLayout$MediaBrowserCompat$MediaItem.write = new MediaMetadataCompat(mediaMetadataCompat5.MediaBrowserCompat$ItemReceiver, ratingCompat5, mediaMetadataCompat5.MediaBrowserCompat$CustomActionResultReceiver, mediaMetadataCompat5.write);
                        RatingCompat ratingCompat6 = new RatingCompat(i3, i6 + i3);
                        MediaMetadataCompat mediaMetadataCompat6 = gridLayout$MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver;
                        gridLayout$MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver = new MediaMetadataCompat(mediaMetadataCompat6.MediaBrowserCompat$ItemReceiver, ratingCompat6, mediaMetadataCompat6.MediaBrowserCompat$CustomActionResultReceiver, mediaMetadataCompat6.write);
                    }
                    i4 += i7;
                }
                this.setChecked = read();
                return;
            } else if (i != read()) {
                this.MediaBrowserCompat$MediaItem.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
                MediaBrowserCompat$CustomActionResultReceiver();
            } else {
                return;
            }
        }
    }

    private void MediaBrowserCompat$ItemReceiver(int i, int i2, boolean z) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                GridLayout$MediaBrowserCompat$MediaItem gridLayout$MediaBrowserCompat$MediaItem = (GridLayout$MediaBrowserCompat$MediaItem) childAt.getLayoutParams();
                if (z) {
                    IconCompatParcelizer(childAt, i, i2, gridLayout$MediaBrowserCompat$MediaItem.width, gridLayout$MediaBrowserCompat$MediaItem.height);
                } else {
                    boolean z2 = this.ActionMenuItemView == 0;
                    MediaMetadataCompat mediaMetadataCompat = z2 ? gridLayout$MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver : gridLayout$MediaBrowserCompat$MediaItem.write;
                    if (mediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver(z2) == MediaBrowserCompat$ItemReceiver) {
                        RatingCompat ratingCompat = mediaMetadataCompat.read;
                        int[] write2 = (z2 ? this.read : this.RatingCompat).write();
                        int MediaBrowserCompat$CustomActionResultReceiver2 = (write2[ratingCompat.MediaBrowserCompat$CustomActionResultReceiver] - write2[ratingCompat.read]) - (MediaBrowserCompat$CustomActionResultReceiver(childAt, z2, true) + MediaBrowserCompat$CustomActionResultReceiver(childAt, z2, false));
                        if (z2) {
                            IconCompatParcelizer(childAt, i, i2, MediaBrowserCompat$CustomActionResultReceiver2, gridLayout$MediaBrowserCompat$MediaItem.height);
                        } else {
                            IconCompatParcelizer(childAt, i, i2, gridLayout$MediaBrowserCompat$MediaItem.width, MediaBrowserCompat$CustomActionResultReceiver2);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        IconCompatParcelizer();
        GridLayout$MediaBrowserCompat$CustomActionResultReceiver gridLayout$MediaBrowserCompat$CustomActionResultReceiver = this.read;
        if (!(gridLayout$MediaBrowserCompat$CustomActionResultReceiver == null || this.RatingCompat == null)) {
            gridLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat();
            this.RatingCompat.MediaDescriptionCompat();
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingLeft) + i), View.MeasureSpec.getMode(i));
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingTop) + i2), View.MeasureSpec.getMode(i2));
        MediaBrowserCompat$ItemReceiver(makeMeasureSpec, makeMeasureSpec2, true);
        if (this.ActionMenuItemView == 0) {
            i3 = this.read.read(makeMeasureSpec);
            MediaBrowserCompat$ItemReceiver(makeMeasureSpec, makeMeasureSpec2, false);
            i4 = this.RatingCompat.read(makeMeasureSpec2);
        } else {
            int read2 = this.RatingCompat.read(makeMeasureSpec2);
            MediaBrowserCompat$ItemReceiver(makeMeasureSpec, makeMeasureSpec2, false);
            int i5 = read2;
            i3 = this.read.read(makeMeasureSpec);
            i4 = i5;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i3 + paddingLeft, getSuggestedMinimumWidth()), i, 0), View.resolveSizeAndState(Math.max(i4 + paddingTop, getSuggestedMinimumHeight()), i2, 0));
    }

    public void requestLayout() {
        super.requestLayout();
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int[] iArr;
        boolean z2;
        View view;
        GridLayout gridLayout = this;
        IconCompatParcelizer();
        int i5 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        GridLayout$MediaBrowserCompat$CustomActionResultReceiver gridLayout$MediaBrowserCompat$CustomActionResultReceiver = gridLayout.read;
        int i6 = (i5 - paddingLeft) - paddingRight;
        gridLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver = i6;
        gridLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver = -i6;
        boolean z3 = false;
        gridLayout$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = false;
        gridLayout$MediaBrowserCompat$CustomActionResultReceiver.write();
        GridLayout$MediaBrowserCompat$CustomActionResultReceiver gridLayout$MediaBrowserCompat$CustomActionResultReceiver2 = gridLayout.RatingCompat;
        int i7 = ((i4 - i2) - paddingTop) - paddingBottom;
        gridLayout$MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver = i7;
        gridLayout$MediaBrowserCompat$CustomActionResultReceiver2.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver = -i7;
        gridLayout$MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer = false;
        gridLayout$MediaBrowserCompat$CustomActionResultReceiver2.write();
        int[] write2 = gridLayout.read.write();
        int[] write3 = gridLayout.RatingCompat.write();
        int childCount = getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = gridLayout.getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                GridLayout$MediaBrowserCompat$MediaItem gridLayout$MediaBrowserCompat$MediaItem = (GridLayout$MediaBrowserCompat$MediaItem) childAt.getLayoutParams();
                MediaMetadataCompat mediaMetadataCompat = gridLayout$MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver;
                MediaMetadataCompat mediaMetadataCompat2 = gridLayout$MediaBrowserCompat$MediaItem.write;
                RatingCompat ratingCompat = mediaMetadataCompat.read;
                RatingCompat ratingCompat2 = mediaMetadataCompat2.read;
                int i9 = write2[ratingCompat.read];
                int i10 = write3[ratingCompat2.read];
                int i11 = write2[ratingCompat.MediaBrowserCompat$CustomActionResultReceiver] - i9;
                int i12 = write3[ratingCompat2.MediaBrowserCompat$CustomActionResultReceiver] - i10;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                GridLayout$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver2 = mediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver(true);
                GridLayout$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver3 = mediaMetadataCompat2.MediaBrowserCompat$CustomActionResultReceiver(z3);
                MediaDescriptionCompat<MediaMetadataCompat, read> MediaBrowserCompat$ItemReceiver2 = gridLayout.read.MediaBrowserCompat$ItemReceiver();
                read read2 = (read) MediaBrowserCompat$ItemReceiver2.read[MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer[i8]];
                MediaDescriptionCompat<MediaMetadataCompat, read> MediaBrowserCompat$ItemReceiver3 = gridLayout.RatingCompat.MediaBrowserCompat$ItemReceiver();
                read read3 = (read) MediaBrowserCompat$ItemReceiver3.read[MediaBrowserCompat$ItemReceiver3.IconCompatParcelizer[i8]];
                iArr = write2;
                int MediaBrowserCompat$CustomActionResultReceiver4 = MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver(childAt, i11 - read2.MediaBrowserCompat$ItemReceiver(true));
                GridLayout$MediaBrowserCompat$ItemReceiver gridLayout$MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver2;
                int MediaBrowserCompat$CustomActionResultReceiver5 = MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$CustomActionResultReceiver(childAt, i12 - read3.MediaBrowserCompat$ItemReceiver(true));
                int MediaBrowserCompat$CustomActionResultReceiver6 = gridLayout.MediaBrowserCompat$CustomActionResultReceiver(childAt, true, true);
                int MediaBrowserCompat$CustomActionResultReceiver7 = gridLayout.MediaBrowserCompat$CustomActionResultReceiver(childAt, false, true);
                int MediaBrowserCompat$CustomActionResultReceiver8 = gridLayout.MediaBrowserCompat$CustomActionResultReceiver(childAt, true, false);
                int i13 = MediaBrowserCompat$CustomActionResultReceiver6 + MediaBrowserCompat$CustomActionResultReceiver8;
                int MediaBrowserCompat$CustomActionResultReceiver9 = MediaBrowserCompat$CustomActionResultReceiver7 + gridLayout.MediaBrowserCompat$CustomActionResultReceiver(childAt, false, false);
                GridLayout$MediaBrowserCompat$ItemReceiver gridLayout$MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$CustomActionResultReceiver3;
                read read4 = read2;
                GridLayout$MediaBrowserCompat$ItemReceiver gridLayout$MediaBrowserCompat$ItemReceiver3 = gridLayout$MediaBrowserCompat$ItemReceiver;
                z2 = false;
                View view2 = childAt;
                int MediaBrowserCompat$ItemReceiver4 = read4.MediaBrowserCompat$ItemReceiver(this, childAt, gridLayout$MediaBrowserCompat$ItemReceiver, measuredWidth + i13, true);
                int i14 = measuredHeight;
                GridLayout$MediaBrowserCompat$ItemReceiver gridLayout$MediaBrowserCompat$ItemReceiver4 = gridLayout$MediaBrowserCompat$ItemReceiver2;
                int MediaBrowserCompat$ItemReceiver5 = read3.MediaBrowserCompat$ItemReceiver(this, view2, gridLayout$MediaBrowserCompat$ItemReceiver4, i14 + MediaBrowserCompat$CustomActionResultReceiver9, false);
                int write4 = gridLayout$MediaBrowserCompat$ItemReceiver.write(measuredWidth, i11 - i13);
                int write5 = gridLayout$MediaBrowserCompat$ItemReceiver4.write(i14, i12 - MediaBrowserCompat$CustomActionResultReceiver9);
                int i15 = i9 + MediaBrowserCompat$CustomActionResultReceiver4 + MediaBrowserCompat$ItemReceiver4;
                boolean z4 = true;
                if (SwitchCompat.m3079x50fd9e4a(this) != 1) {
                    z4 = false;
                }
                int i16 = !z4 ? paddingLeft + MediaBrowserCompat$CustomActionResultReceiver6 + i15 : (((i5 - write4) - paddingRight) - MediaBrowserCompat$CustomActionResultReceiver8) - i15;
                int i17 = paddingTop + i10 + MediaBrowserCompat$CustomActionResultReceiver5 + MediaBrowserCompat$ItemReceiver5 + MediaBrowserCompat$CustomActionResultReceiver7;
                if (write4 == view2.getMeasuredWidth() && write5 == view2.getMeasuredHeight()) {
                    view = view2;
                } else {
                    view = view2;
                    view.measure(View.MeasureSpec.makeMeasureSpec(write4, 1073741824), View.MeasureSpec.makeMeasureSpec(write5, 1073741824));
                }
                view.layout(i16, i17, write4 + i16, write5 + i17);
            } else {
                z2 = z3;
                iArr = write2;
            }
            i8++;
            gridLayout = this;
            write2 = iArr;
            z3 = z2;
        }
    }

    static final class IconCompatParcelizer {
        public final GridLayout$MediaBrowserCompat$SearchResultReceiver IconCompatParcelizer;
        public final RatingCompat MediaBrowserCompat$CustomActionResultReceiver;
        public boolean write = true;

        public IconCompatParcelizer(RatingCompat ratingCompat, GridLayout$MediaBrowserCompat$SearchResultReceiver gridLayout$MediaBrowserCompat$SearchResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = ratingCompat;
            this.IconCompatParcelizer = gridLayout$MediaBrowserCompat$SearchResultReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(" ");
            sb.append(!this.write ? "+>" : "->");
            sb.append(" ");
            sb.append(this.IconCompatParcelizer);
            return sb.toString();
        }
    }

    static final class write<K, V> extends ArrayList<Pair<K, V>> {
        private final Class<V> MediaBrowserCompat$CustomActionResultReceiver;
        private final Class<K> read;

        write(Class<K> cls, Class<V> cls2) {
            this.read = cls;
            this.MediaBrowserCompat$CustomActionResultReceiver = cls2;
        }

        public final MediaDescriptionCompat<K, V> MediaBrowserCompat$ItemReceiver() {
            int size = size();
            Object[] objArr = (Object[]) Array.newInstance(this.read, size);
            Object[] objArr2 = (Object[]) Array.newInstance(this.MediaBrowserCompat$CustomActionResultReceiver, size);
            for (int i = 0; i < size; i++) {
                objArr[i] = ((Pair) get(i)).first;
                objArr2[i] = ((Pair) get(i)).second;
            }
            return new MediaDescriptionCompat<>(objArr, objArr2);
        }
    }

    static final class MediaDescriptionCompat<K, V> {
        public final int[] IconCompatParcelizer;
        public final V[] read;
        public final K[] write;

        MediaDescriptionCompat(K[] kArr, V[] vArr) {
            int[] write2 = write(kArr);
            this.IconCompatParcelizer = write2;
            this.write = read(kArr, write2);
            this.read = read(vArr, this.IconCompatParcelizer);
        }

        private static <K> int[] write(K[] kArr) {
            int length = kArr.length;
            int[] iArr = new int[length];
            HashMap hashMap = new HashMap();
            for (int i = 0; i < length; i++) {
                K k = kArr[i];
                Integer num = (Integer) hashMap.get(k);
                if (num == null) {
                    num = Integer.valueOf(hashMap.size());
                    hashMap.put(k, num);
                }
                iArr[i] = num.intValue();
            }
            return iArr;
        }

        private static <K> K[] read(K[] kArr, int[] iArr) {
            int length = kArr.length;
            K[] kArr2 = (Object[]) Array.newInstance(kArr.getClass().getComponentType(), GridLayout.MediaBrowserCompat$ItemReceiver(iArr) + 1);
            for (int i = 0; i < length; i++) {
                kArr2[iArr[i]] = kArr[i];
            }
            return kArr2;
        }
    }

    static class read {
        private int IconCompatParcelizer;
        private int read;
        private int write;

        read() {
            MediaBrowserCompat$CustomActionResultReceiver();
        }

        /* access modifiers changed from: protected */
        public void MediaBrowserCompat$CustomActionResultReceiver() {
            this.read = PKIFailureInfo.systemUnavail;
            this.write = PKIFailureInfo.systemUnavail;
            this.IconCompatParcelizer = 2;
        }

        /* access modifiers changed from: protected */
        public void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
            this.read = Math.max(this.read, i);
            this.write = Math.max(this.write, i2);
        }

        /* access modifiers changed from: protected */
        public int MediaBrowserCompat$ItemReceiver(boolean z) {
            if (z || !GridLayout.IconCompatParcelizer(this.IconCompatParcelizer)) {
                return this.read + this.write;
            }
            return 100000;
        }

        /* access modifiers changed from: protected */
        public int MediaBrowserCompat$ItemReceiver(GridLayout gridLayout, View view, GridLayout$MediaBrowserCompat$ItemReceiver gridLayout$MediaBrowserCompat$ItemReceiver, int i, boolean z) {
            return this.read - gridLayout$MediaBrowserCompat$ItemReceiver.read(view, i, setSplitTrack.read(gridLayout));
        }

        /* access modifiers changed from: protected */
        public final void IconCompatParcelizer(GridLayout gridLayout, View view, MediaMetadataCompat mediaMetadataCompat, GridLayout$MediaBrowserCompat$CustomActionResultReceiver gridLayout$MediaBrowserCompat$CustomActionResultReceiver, int i) {
            this.IconCompatParcelizer &= (mediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver == GridLayout.MediaBrowserCompat$CustomActionResultReceiver && mediaMetadataCompat.write == BitmapDescriptorFactory.HUE_RED) ? 0 : 2;
            int read2 = mediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver(gridLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver).read(view, i, setSplitTrack.read(gridLayout));
            MediaBrowserCompat$CustomActionResultReceiver(read2, i - read2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Bounds{before=");
            sb.append(this.read);
            sb.append(", after=");
            sb.append(this.write);
            sb.append('}');
            return sb.toString();
        }
    }

    static final class RatingCompat {
        public final int MediaBrowserCompat$CustomActionResultReceiver;
        public final int read;

        public RatingCompat(int i, int i2) {
            this.read = i;
            this.MediaBrowserCompat$CustomActionResultReceiver = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            RatingCompat ratingCompat = (RatingCompat) obj;
            return this.MediaBrowserCompat$CustomActionResultReceiver == ratingCompat.MediaBrowserCompat$CustomActionResultReceiver && this.read == ratingCompat.read;
        }

        public final int hashCode() {
            return (this.read * 31) + this.MediaBrowserCompat$CustomActionResultReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.read);
            sb.append(", ");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append("]");
            return sb.toString();
        }
    }

    public static class MediaMetadataCompat {
        static final MediaMetadataCompat IconCompatParcelizer = GridLayout.MediaBrowserCompat$ItemReceiver();
        final GridLayout$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
        final boolean MediaBrowserCompat$ItemReceiver;
        final RatingCompat read;
        final float write;

        MediaMetadataCompat(boolean z, RatingCompat ratingCompat, GridLayout$MediaBrowserCompat$ItemReceiver gridLayout$MediaBrowserCompat$ItemReceiver, float f) {
            this.MediaBrowserCompat$ItemReceiver = z;
            this.read = ratingCompat;
            this.MediaBrowserCompat$CustomActionResultReceiver = gridLayout$MediaBrowserCompat$ItemReceiver;
            this.write = f;
        }

        MediaMetadataCompat(boolean z, int i, int i2, GridLayout$MediaBrowserCompat$ItemReceiver gridLayout$MediaBrowserCompat$ItemReceiver, float f) {
            this(z, new RatingCompat(i, i2 + i), gridLayout$MediaBrowserCompat$ItemReceiver, f);
        }

        public final GridLayout$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver != GridLayout.MediaBrowserCompat$CustomActionResultReceiver) {
                return this.MediaBrowserCompat$CustomActionResultReceiver;
            }
            if (this.write == BitmapDescriptorFactory.HUE_RED) {
                return z ? GridLayout.IconCompatParcelizer : GridLayout.write;
            }
            return GridLayout.MediaBrowserCompat$ItemReceiver;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) obj;
            return this.MediaBrowserCompat$CustomActionResultReceiver.equals(mediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver) && this.read.equals(mediaMetadataCompat.read);
        }

        public int hashCode() {
            return (this.read.hashCode() * 31) + this.MediaBrowserCompat$CustomActionResultReceiver.hashCode();
        }
    }

    public static MediaMetadataCompat MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, GridLayout$MediaBrowserCompat$ItemReceiver gridLayout$MediaBrowserCompat$ItemReceiver, float f) {
        return new MediaMetadataCompat(i != Integer.MIN_VALUE, i, i2, gridLayout$MediaBrowserCompat$ItemReceiver, f);
    }

    private void IconCompatParcelizer(View view, int i, int i2, int i3, int i4) {
        view.measure(getChildMeasureSpec(i, MediaBrowserCompat$CustomActionResultReceiver(view, true, true) + MediaBrowserCompat$CustomActionResultReceiver(view, true, false), i3), getChildMeasureSpec(i2, MediaBrowserCompat$CustomActionResultReceiver(view, false, true) + MediaBrowserCompat$CustomActionResultReceiver(view, false, false), i4));
    }

    public static MediaMetadataCompat MediaBrowserCompat$ItemReceiver() {
        return new MediaMetadataCompat(false, PKIFailureInfo.systemUnavail, 1, MediaBrowserCompat$CustomActionResultReceiver, BitmapDescriptorFactory.HUE_RED);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new GridLayout$MediaBrowserCompat$MediaItem();
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new GridLayout$MediaBrowserCompat$MediaItem(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof GridLayout$MediaBrowserCompat$MediaItem) {
            return new GridLayout$MediaBrowserCompat$MediaItem((GridLayout$MediaBrowserCompat$MediaItem) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new GridLayout$MediaBrowserCompat$MediaItem((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new GridLayout$MediaBrowserCompat$MediaItem(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$ItemReceiver(View view, boolean z, boolean z2) {
        GridLayout$MediaBrowserCompat$MediaItem gridLayout$MediaBrowserCompat$MediaItem = (GridLayout$MediaBrowserCompat$MediaItem) view.getLayoutParams();
        int i = z ? z2 ? gridLayout$MediaBrowserCompat$MediaItem.leftMargin : gridLayout$MediaBrowserCompat$MediaItem.rightMargin : z2 ? gridLayout$MediaBrowserCompat$MediaItem.topMargin : gridLayout$MediaBrowserCompat$MediaItem.bottomMargin;
        return i == Integer.MIN_VALUE ? MediaBrowserCompat$CustomActionResultReceiver(view, gridLayout$MediaBrowserCompat$MediaItem, z, z2) : i;
    }
}

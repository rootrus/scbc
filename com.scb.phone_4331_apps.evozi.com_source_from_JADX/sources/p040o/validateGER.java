package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.C0065xe743b54a;
import androidx.recyclerview.widget.RecyclerView;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;

/* renamed from: o.validateGER */
public class validateGER implements write, C0065xe743b54a {
    int IconCompatParcelizer;
    public write MediaBrowserCompat$CustomActionResultReceiver;
    public validateGER$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;
    private C0065xe743b54a MediaBrowserCompat$MediaItem = this;
    private IconCompatParcelizer MediaBrowserCompat$SearchResultReceiver;
    public validateHERK MediaDescriptionCompat;
    long MediaMetadataCompat = -1;
    int RatingCompat;
    RecyclerView read;
    int write;

    /* renamed from: o.validateGER$write */
    public interface write {
        void MediaBrowserCompat$ItemReceiver(int i);
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
    }

    public validateGER(Parcelable parcelable) {
        if (parcelable instanceof IconCompatParcelizer) {
            this.MediaBrowserCompat$SearchResultReceiver = (IconCompatParcelizer) parcelable;
        }
    }

    public final void write() {
        C0065xe743b54a recyclerView$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
        RecyclerView recyclerView = this.read;
        if (!(recyclerView == null || (recyclerView$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.MediaBrowserCompat$MediaItem) == null)) {
            recyclerView.mOnItemTouchListeners.remove(recyclerView$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
            if (recyclerView.RatingCompat == recyclerView$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver) {
                recyclerView.RatingCompat = null;
            }
        }
        this.MediaBrowserCompat$MediaItem = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.MediaBrowserCompat$ItemReceiver = null;
        this.read = null;
        this.MediaBrowserCompat$SearchResultReceiver = null;
    }

    public final Parcelable read() {
        FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat mediaDescriptionCompat;
        validateHERK validateherk = this.MediaDescriptionCompat;
        long[] jArr = null;
        if (!(validateherk == null || (mediaDescriptionCompat = validateherk.MediaDescriptionCompat) == null)) {
            jArr = mediaDescriptionCompat.IconCompatParcelizer();
        }
        return new IconCompatParcelizer(jArr);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        validateHERK validateherk = this.MediaDescriptionCompat;
        if (validateherk != null) {
            boolean z = true;
            if (!(validateherk.MediaDescriptionCompat.RatingCompat == 0)) {
                FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat mediaDescriptionCompat = validateherk.MediaDescriptionCompat;
                if (!(mediaDescriptionCompat.RatingCompat == 0) && mediaDescriptionCompat.write != 0) {
                    z = false;
                }
                if (!z) {
                    validateherk.MediaDescriptionCompat.read(validateherk.MediaBrowserCompat$ItemReceiver, 2, false);
                    validateherk.IconCompatParcelizer.write();
                }
            }
        }
    }

    public final boolean IconCompatParcelizer(int i) {
        validateHERK validateherk = this.MediaDescriptionCompat;
        if (validateherk != null) {
            if ((validateherk.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver[i] & 2147483648L) != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o.validateGER$IconCompatParcelizer */
    public static class IconCompatParcelizer implements Parcelable {
        public static final Parcelable.Creator<IconCompatParcelizer> CREATOR = new Parcelable.Creator<IconCompatParcelizer>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new IconCompatParcelizer(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new IconCompatParcelizer[i];
            }
        };
        final long[] write;

        public final int describeContents() {
            return 0;
        }

        public IconCompatParcelizer(long[] jArr) {
            this.write = jArr;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLongArray(this.write);
        }

        IconCompatParcelizer(Parcel parcel) {
            this.write = parcel.createLongArray();
        }
    }

    public final void IconCompatParcelizer(RecyclerView recyclerView) {
        if (this.MediaBrowserCompat$MediaItem == null) {
            throw new IllegalStateException("Accessing released object");
        } else if (this.read == null) {
            this.read = recyclerView;
            recyclerView.mOnItemTouchListeners.add(this.MediaBrowserCompat$MediaItem);
            this.RatingCompat = ViewConfiguration.get(this.read.getContext()).getScaledTouchSlop();
        } else {
            throw new IllegalStateException("RecyclerView instance has already been set");
        }
    }

    public final RecyclerView.IconCompatParcelizer MediaBrowserCompat$ItemReceiver(RecyclerView.IconCompatParcelizer iconCompatParcelizer) {
        if (!iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver) {
            throw new IllegalArgumentException("The passed adapter does not support stable IDs");
        } else if (this.MediaDescriptionCompat == null) {
            IconCompatParcelizer iconCompatParcelizer2 = this.MediaBrowserCompat$SearchResultReceiver;
            long[] jArr = iconCompatParcelizer2 != null ? iconCompatParcelizer2.write : null;
            this.MediaBrowserCompat$SearchResultReceiver = null;
            validateHERK validateherk = new validateHERK(this, iconCompatParcelizer, jArr);
            this.MediaDescriptionCompat = validateherk;
            validateherk.MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaDescriptionCompat.RatingCompat = this.MediaBrowserCompat$ItemReceiver;
            this.MediaBrowserCompat$ItemReceiver = null;
            return this.MediaDescriptionCompat;
        } else {
            throw new IllegalStateException("already have a wrapped adapter");
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        validateHERK validateherk;
        int MediaBrowserCompat$ItemReceiver2 = this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
        for (int i2 = 0; i2 < MediaBrowserCompat$ItemReceiver2; i2++) {
            if (!(i2 == i || (validateherk = this.MediaDescriptionCompat) == null)) {
                boolean MediaBrowserCompat$ItemReceiver3 = validateherk.MediaBrowserCompat$ItemReceiver(i2, false, (Object) null);
            }
        }
    }

    public boolean IconCompatParcelizer(RecyclerView recyclerView, MotionEvent motionEvent) {
        RecyclerView.setContentView setcontentview;
        int i;
        if (this.MediaDescriptionCompat != null) {
            int actionMasked = motionEvent.getActionMasked();
            RecyclerView.setContentView setcontentview2 = null;
            if (actionMasked == 0) {
                View write2 = recyclerView.write(motionEvent.getX(), motionEvent.getY());
                if (write2 != null) {
                    setcontentview2 = recyclerView.MediaBrowserCompat$MediaItem(write2);
                }
                this.write = (int) (motionEvent.getX() + 0.5f);
                this.IconCompatParcelizer = (int) (motionEvent.getY() + 0.5f);
                if (setcontentview2 instanceof validateGERU) {
                    this.MediaMetadataCompat = setcontentview2.MediaBrowserCompat$ItemReceiver;
                } else {
                    this.MediaMetadataCompat = -1;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                long j = this.MediaMetadataCompat;
                int i2 = this.write;
                int i3 = this.IconCompatParcelizer;
                this.MediaMetadataCompat = -1;
                this.write = 0;
                this.IconCompatParcelizer = 0;
                if (j != -1 && motionEvent.getActionMasked() == 1) {
                    if (!(this.read.ActionMenuItemView > 0)) {
                        int y = (int) (motionEvent.getY() + 0.5f);
                        if (Math.abs(((int) (motionEvent.getX() + 0.5f)) - i2) < this.RatingCompat && Math.abs(y - i3) < this.RatingCompat) {
                            View write3 = recyclerView.write(motionEvent.getX(), motionEvent.getY());
                            if (write3 != null) {
                                setcontentview = recyclerView.MediaBrowserCompat$MediaItem(write3);
                            } else {
                                setcontentview = null;
                            }
                            if (setcontentview != null && setcontentview.MediaBrowserCompat$ItemReceiver == j) {
                                RecyclerView.IconCompatParcelizer iconCompatParcelizer = this.read.MediaDescriptionCompat;
                                int i4 = setcontentview.ParcelableVolumeInfo;
                                if (i4 == -1) {
                                    i4 = setcontentview.MediaSessionCompat$QueueItem;
                                }
                                RecyclerView recyclerView2 = setcontentview.MediaMetadataCompat;
                                if (recyclerView2 == null) {
                                    i = -1;
                                } else {
                                    i = recyclerView2.MediaBrowserCompat$CustomActionResultReceiver(setcontentview);
                                }
                                if (i4 != i) {
                                    i4 = -1;
                                }
                                int MediaBrowserCompat$ItemReceiver2 = AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer, (RecyclerView.IconCompatParcelizer) this.MediaDescriptionCompat, (Object) null, i4, (FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment) null);
                                if (MediaBrowserCompat$ItemReceiver2 != -1) {
                                    View view = setcontentview.write;
                                    view.getTranslationX();
                                    view.getTranslationY();
                                    view.getLeft();
                                    view.getTop();
                                    validateHERK validateherk = this.MediaDescriptionCompat;
                                    if (validateherk.MediaBrowserCompat$ItemReceiver != null) {
                                        long MediaBrowserCompat$CustomActionResultReceiver2 = validateherk.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2);
                                        int i5 = (int) MediaBrowserCompat$CustomActionResultReceiver2;
                                        if (((int) (MediaBrowserCompat$CustomActionResultReceiver2 >>> 32)) == -1) {
                                            boolean z = !((validateherk.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver[i5] & 2147483648L) != 0);
                                            if (validateherk.MediaBrowserCompat$ItemReceiver.mo20940a_(setcontentview)) {
                                                if (z) {
                                                    validateherk.read(i5, true, (Object) null);
                                                } else {
                                                    validateherk.MediaBrowserCompat$ItemReceiver(i5, true, (Object) null);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}

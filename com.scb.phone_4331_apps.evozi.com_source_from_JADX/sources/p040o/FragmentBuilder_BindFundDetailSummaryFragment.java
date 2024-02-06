package p040o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.TypedValue;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scb.phone.R;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import p040o.FragmentBuilder_BindFixedTransferInputFormFragment;

/* renamed from: o.FragmentBuilder_BindFundDetailSummaryFragment */
public final class FragmentBuilder_BindFundDetailSummaryFragment {
    private static final AtomicInteger MediaBrowserCompat$ItemReceiver = new AtomicInteger();
    private Drawable IconCompatParcelizer;
    public final FragmentBuilder_BindFixedTransferInputFormFragment.read MediaBrowserCompat$CustomActionResultReceiver;
    private Drawable MediaBrowserCompat$MediaItem;
    private int MediaBrowserCompat$SearchResultReceiver;
    private final Picasso MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private boolean MediaSessionCompat$Token;
    private int RatingCompat;
    public boolean read;
    public boolean write;

    public FragmentBuilder_BindFundDetailSummaryFragment(Picasso picasso, Uri uri, int i) {
        this.MediaSessionCompat$Token = true;
        this.MediaDescriptionCompat = picasso;
        this.MediaBrowserCompat$CustomActionResultReceiver = new FragmentBuilder_BindFixedTransferInputFormFragment.read(uri, i, picasso.MediaBrowserCompat$CustomActionResultReceiver);
    }

    FragmentBuilder_BindFundDetailSummaryFragment() {
        this.MediaSessionCompat$Token = true;
        this.MediaDescriptionCompat = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = new FragmentBuilder_BindFixedTransferInputFormFragment.read((Uri) null, 0, (Bitmap.Config) null);
    }

    public final FragmentBuilder_BindFundDetailSummaryFragment IconCompatParcelizer(int i) {
        if (!this.MediaSessionCompat$Token) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        } else if (i == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        } else if (this.MediaBrowserCompat$MediaItem == null) {
            this.MediaBrowserCompat$SearchResultReceiver = i;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    public final FragmentBuilder_BindFundDetailSummaryFragment write(Drawable drawable) {
        if (!this.MediaSessionCompat$Token) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        } else if (this.MediaBrowserCompat$SearchResultReceiver == 0) {
            this.MediaBrowserCompat$MediaItem = drawable;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    public final FragmentBuilder_BindFundDetailSummaryFragment MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Error image resource invalid.");
        } else if (this.IconCompatParcelizer == null) {
            this.MediaMetadataCompat = i;
            return this;
        } else {
            throw new IllegalStateException("Error image already set.");
        }
    }

    public final FragmentBuilder_BindFundDetailSummaryFragment IconCompatParcelizer(Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Error image may not be null.");
        } else if (this.MediaMetadataCompat == 0) {
            this.IconCompatParcelizer = drawable;
            return this;
        } else {
            throw new IllegalStateException("Error image already set.");
        }
    }

    public final FragmentBuilder_BindFundDetailSummaryFragment write() {
        Resources resources = this.MediaDescriptionCompat.IconCompatParcelizer.getResources();
        this.MediaBrowserCompat$CustomActionResultReceiver.read(resources.getDimensionPixelSize(R.dimen.f72252131165342), resources.getDimensionPixelSize(R.dimen.f72252131165342));
        return this;
    }

    public final FragmentBuilder_BindFundDetailSummaryFragment IconCompatParcelizer(FragmentBuilder_BindFatcaQuestionnaireFragment fragmentBuilder_BindFatcaQuestionnaireFragment, FragmentBuilder_BindFatcaQuestionnaireFragment... fragmentBuilder_BindFatcaQuestionnaireFragmentArr) {
        if (fragmentBuilder_BindFatcaQuestionnaireFragment != null) {
            this.RatingCompat = fragmentBuilder_BindFatcaQuestionnaireFragment.index | this.RatingCompat;
            if (fragmentBuilder_BindFatcaQuestionnaireFragmentArr.length > 0) {
                int length = fragmentBuilder_BindFatcaQuestionnaireFragmentArr.length;
                int i = 0;
                while (i < length) {
                    FragmentBuilder_BindFatcaQuestionnaireFragment fragmentBuilder_BindFatcaQuestionnaireFragment2 = fragmentBuilder_BindFatcaQuestionnaireFragmentArr[i];
                    if (fragmentBuilder_BindFatcaQuestionnaireFragment2 != null) {
                        this.RatingCompat = fragmentBuilder_BindFatcaQuestionnaireFragment2.index | this.RatingCompat;
                        i++;
                    } else {
                        throw new IllegalArgumentException("Memory policy cannot be null.");
                    }
                }
            }
            return this;
        }
        throw new IllegalArgumentException("Memory policy cannot be null.");
    }

    public final Bitmap MediaBrowserCompat$CustomActionResultReceiver() throws IOException {
        long nanoTime = System.nanoTime();
        FragmentBuilder_BindFundRedeemSearchListFragment.write();
        if (!this.write) {
            FragmentBuilder_BindFixedTransferInputFormFragment.read read2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (!((read2.MediaBrowserCompat$SearchResultReceiver == null && read2.RatingCompat == 0) ? false : true)) {
                return null;
            }
            FragmentBuilder_BindFixedTransferInputFormFragment read3 = read(nanoTime);
            FragmentBuilder_BindFastPayInputFragment fragmentBuilder_BindFastPayInputFragment = new FragmentBuilder_BindFastPayInputFragment(this.MediaDescriptionCompat, read3, this.RatingCompat, 0, (Object) null, FragmentBuilder_BindFundRedeemSearchListFragment.write(read3, new StringBuilder()));
            Picasso picasso = this.MediaDescriptionCompat;
            return FragmentBuilder_BindEbillSubscriptionReviewFragment.MediaBrowserCompat$CustomActionResultReceiver(picasso, picasso.MediaBrowserCompat$ItemReceiver, this.MediaDescriptionCompat.read, this.MediaDescriptionCompat.MediaSessionCompat$QueueItem, fragmentBuilder_BindFastPayInputFragment).write();
        }
        throw new IllegalStateException("Fit cannot be used with get.");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindFundRedeemLandingFragment fragmentBuilder_BindFundRedeemLandingFragment) {
        Bitmap MediaBrowserCompat$CustomActionResultReceiver2;
        long nanoTime = System.nanoTime();
        FragmentBuilder_BindFundRedeemSearchListFragment.read();
        if (fragmentBuilder_BindFundRedeemLandingFragment == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.write) {
            FragmentBuilder_BindFixedTransferInputFormFragment.read read2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            Drawable drawable = null;
            if (!((read2.MediaBrowserCompat$SearchResultReceiver == null && read2.RatingCompat == 0) ? false : true)) {
                Picasso picasso = this.MediaDescriptionCompat;
                if (fragmentBuilder_BindFundRedeemLandingFragment != null) {
                    picasso.write((Object) fragmentBuilder_BindFundRedeemLandingFragment);
                    if (this.MediaSessionCompat$Token) {
                        drawable = read();
                    }
                    fragmentBuilder_BindFundRedeemLandingFragment.MediaBrowserCompat$CustomActionResultReceiver(drawable);
                    return;
                }
                throw new IllegalArgumentException("target cannot be null.");
            }
            FragmentBuilder_BindFixedTransferInputFormFragment read3 = read(nanoTime);
            String IconCompatParcelizer2 = FragmentBuilder_BindFundRedeemSearchListFragment.IconCompatParcelizer(read3);
            if (!FragmentBuilder_BindFatcaQuestionnaireFragment.MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat) || (MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2)) == null) {
                if (this.MediaSessionCompat$Token) {
                    drawable = read();
                }
                fragmentBuilder_BindFundRedeemLandingFragment.MediaBrowserCompat$CustomActionResultReceiver(drawable);
                this.MediaDescriptionCompat.read(new FragmentBuilder_BindFundRedeemReviewFragment(this.MediaDescriptionCompat, fragmentBuilder_BindFundRedeemLandingFragment, read3, this.RatingCompat, 0, this.IconCompatParcelizer, IconCompatParcelizer2, (Object) null, this.MediaMetadataCompat));
                return;
            }
            Picasso picasso2 = this.MediaDescriptionCompat;
            if (fragmentBuilder_BindFundRedeemLandingFragment != null) {
                picasso2.write((Object) fragmentBuilder_BindFundRedeemLandingFragment);
                Picasso.read read4 = Picasso.read.MEMORY;
                fragmentBuilder_BindFundRedeemLandingFragment.read(MediaBrowserCompat$CustomActionResultReceiver2);
                return;
            }
            throw new IllegalArgumentException("target cannot be null.");
        } else {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
    }

    public final void read(ImageView imageView, FragmentBuilder_BindEkycFragment fragmentBuilder_BindEkycFragment) {
        Bitmap MediaBrowserCompat$CustomActionResultReceiver2;
        ImageView imageView2 = imageView;
        FragmentBuilder_BindEkycFragment fragmentBuilder_BindEkycFragment2 = fragmentBuilder_BindEkycFragment;
        long nanoTime = System.nanoTime();
        FragmentBuilder_BindFundRedeemSearchListFragment.read();
        if (imageView2 != null) {
            FragmentBuilder_BindFixedTransferInputFormFragment.read read2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            boolean z = false;
            if (!((read2.MediaBrowserCompat$SearchResultReceiver == null && read2.RatingCompat == 0) ? false : true)) {
                Picasso picasso = this.MediaDescriptionCompat;
                if (imageView2 != null) {
                    picasso.write((Object) imageView2);
                    if (this.MediaSessionCompat$Token) {
                        FragmentBuilder_BindFundActionsSearchFragment.write(imageView2, read());
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("view cannot be null.");
            }
            if (this.write) {
                FragmentBuilder_BindFixedTransferInputFormFragment.read read3 = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (!(read3.MediaMetadataCompat == 0 && read3.MediaBrowserCompat$MediaItem == 0)) {
                    z = true;
                }
                if (!z) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.MediaSessionCompat$Token) {
                            FragmentBuilder_BindFundActionsSearchFragment.write(imageView2, read());
                        }
                        Picasso picasso2 = this.MediaDescriptionCompat;
                        FragmentBuilder_BindEnterProxyFragment fragmentBuilder_BindEnterProxyFragment = new FragmentBuilder_BindEnterProxyFragment(this, imageView2, fragmentBuilder_BindEkycFragment2);
                        if (picasso2.ParcelableVolumeInfo.containsKey(imageView2)) {
                            picasso2.write((Object) imageView2);
                        }
                        picasso2.ParcelableVolumeInfo.put(imageView2, fragmentBuilder_BindEnterProxyFragment);
                        return;
                    }
                    this.MediaBrowserCompat$CustomActionResultReceiver.read(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            FragmentBuilder_BindFixedTransferInputFormFragment read4 = read(nanoTime);
            String IconCompatParcelizer2 = FragmentBuilder_BindFundRedeemSearchListFragment.IconCompatParcelizer(read4);
            if (!FragmentBuilder_BindFatcaQuestionnaireFragment.MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat) || (MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2)) == null) {
                if (this.MediaSessionCompat$Token) {
                    FragmentBuilder_BindFundActionsSearchFragment.write(imageView2, read());
                }
                this.MediaDescriptionCompat.read(new FragmentBuilder_BindErrorFragment(this.MediaDescriptionCompat, imageView, read4, this.RatingCompat, 0, this.MediaMetadataCompat, this.IconCompatParcelizer, IconCompatParcelizer2, (Object) null, fragmentBuilder_BindEkycFragment, this.read));
                return;
            }
            Picasso picasso3 = this.MediaDescriptionCompat;
            if (imageView2 != null) {
                picasso3.write((Object) imageView2);
                FragmentBuilder_BindFundActionsSearchFragment.MediaBrowserCompat$ItemReceiver(imageView, this.MediaDescriptionCompat.IconCompatParcelizer, MediaBrowserCompat$CustomActionResultReceiver2, Picasso.read.MEMORY, this.read, this.MediaDescriptionCompat.MediaMetadataCompat);
                if (this.MediaDescriptionCompat.RatingCompat) {
                    String MediaBrowserCompat$ItemReceiver2 = read4.MediaBrowserCompat$ItemReceiver();
                    StringBuilder sb = new StringBuilder();
                    sb.append("from ");
                    sb.append(Picasso.read.MEMORY);
                    FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Main", "completed", MediaBrowserCompat$ItemReceiver2, sb.toString());
                }
                if (fragmentBuilder_BindEkycFragment2 != null) {
                    fragmentBuilder_BindEkycFragment.MediaBrowserCompat$ItemReceiver();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("view cannot be null.");
        }
        throw new IllegalArgumentException("Target must not be null.");
    }

    private Drawable read() {
        if (this.MediaBrowserCompat$SearchResultReceiver == 0) {
            return this.MediaBrowserCompat$MediaItem;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return this.MediaDescriptionCompat.IconCompatParcelizer.getDrawable(this.MediaBrowserCompat$SearchResultReceiver);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return this.MediaDescriptionCompat.IconCompatParcelizer.getResources().getDrawable(this.MediaBrowserCompat$SearchResultReceiver);
        }
        TypedValue typedValue = new TypedValue();
        this.MediaDescriptionCompat.IconCompatParcelizer.getResources().getValue(this.MediaBrowserCompat$SearchResultReceiver, typedValue, true);
        return this.MediaDescriptionCompat.IconCompatParcelizer.getResources().getDrawable(typedValue.resourceId);
    }

    private FragmentBuilder_BindFixedTransferInputFormFragment read(long j) {
        long j2 = j;
        int andIncrement = MediaBrowserCompat$ItemReceiver.getAndIncrement();
        FragmentBuilder_BindFixedTransferInputFormFragment.read read2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (read2.MediaBrowserCompat$ItemReceiver && read2.IconCompatParcelizer) {
            throw new IllegalStateException("Center crop and center inside can not be used together.");
        } else if (read2.IconCompatParcelizer && read2.MediaMetadataCompat == 0 && read2.MediaBrowserCompat$MediaItem == 0) {
            throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
        } else if (read2.MediaBrowserCompat$ItemReceiver && read2.MediaMetadataCompat == 0 && read2.MediaBrowserCompat$MediaItem == 0) {
            throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
        } else {
            if (read2.MediaBrowserCompat$CustomActionResultReceiver == null) {
                read2.MediaBrowserCompat$CustomActionResultReceiver = Picasso.IconCompatParcelizer.NORMAL;
            }
            FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment = new FragmentBuilder_BindFixedTransferInputFormFragment(read2.MediaBrowserCompat$SearchResultReceiver, read2.RatingCompat, (String) null, read2.MediaDescriptionCompat, read2.MediaMetadataCompat, read2.MediaBrowserCompat$MediaItem, read2.IconCompatParcelizer, read2.MediaBrowserCompat$ItemReceiver, read2.read, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, false, read2.write, read2.MediaBrowserCompat$CustomActionResultReceiver, (byte) 0);
            fragmentBuilder_BindFixedTransferInputFormFragment.MediaBrowserCompat$MediaItem = andIncrement;
            fragmentBuilder_BindFixedTransferInputFormFragment.MediaSessionCompat$Token = j2;
            boolean z = this.MediaDescriptionCompat.RatingCompat;
            if (z) {
                FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Main", "created", fragmentBuilder_BindFixedTransferInputFormFragment.MediaBrowserCompat$ItemReceiver(), fragmentBuilder_BindFixedTransferInputFormFragment.toString());
            }
            Picasso picasso = this.MediaDescriptionCompat;
            FragmentBuilder_BindFixedTransferInputFormFragment write2 = picasso.MediaDescriptionCompat.write(fragmentBuilder_BindFixedTransferInputFormFragment);
            if (write2 != null) {
                if (write2 != fragmentBuilder_BindFixedTransferInputFormFragment) {
                    write2.MediaBrowserCompat$MediaItem = andIncrement;
                    write2.MediaSessionCompat$Token = j2;
                    if (z) {
                        String write3 = write2.write();
                        StringBuilder sb = new StringBuilder();
                        sb.append("into ");
                        sb.append(write2);
                        FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Main", "changed", write3, sb.toString());
                    }
                }
                return write2;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Request transformer ");
            sb2.append(picasso.MediaDescriptionCompat.getClass().getCanonicalName());
            sb2.append(" returned null for ");
            sb2.append(fragmentBuilder_BindFixedTransferInputFormFragment);
            throw new IllegalStateException(sb2.toString());
        }
    }
}

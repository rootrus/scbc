package p040o;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.media.Image;
import android.net.Uri;
import android.os.Environment;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bumptech.glide.Glide;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.kmc.ken.engines.ImageProcessor;
import com.kofax.kmc.ken.engines.data.BasicSettingsProfile;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.ken.engines.data.ImagePerfectionProfile;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.scb.phone.R;
import com.scb.phone.view.custom.ImageTextView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso$MediaBrowserCompat$CustomActionResultReceiver;
import com.squareup.picasso.Picasso$MediaBrowserCompat$ItemReceiver;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.beyka.tiffbitmapfactory.CompressionScheme;
import org.beyka.tiffbitmapfactory.ResolutionUnit;
import org.beyka.tiffbitmapfactory.TiffBitmapFactory;
import org.beyka.tiffbitmapfactory.TiffSaver;
import p040o.FragmentBuilder_BindFixedTransferInputFormFragment;
import p040o.HmlSetNTBPinSuccessActivity;
import p040o.zzag;

/* renamed from: o.FragmentBuilder_BindDepositSelectorFragment */
public class FragmentBuilder_BindDepositSelectorFragment {
    private FragmentBuilder_BindDepositSelectorFragment() {
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context, Drawable drawable, ImageView imageView, String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            str = "http://url.with.error";
        }
        FragmentBuilder_BindFundDetailSummaryFragment write = Picasso.read().write(str);
        write.MediaBrowserCompat$CustomActionResultReceiver.read(new FragmentBuilder_BindEStatementsSuccessfulFragment(i, i2, context.getResources().getDimensionPixelSize(R.dimen.f74422131165882)));
        FragmentBuilder_BindFundDetailSummaryFragment IconCompatParcelizer = write.write(drawable).IconCompatParcelizer(drawable);
        IconCompatParcelizer.write = true;
        IconCompatParcelizer.read(imageView, (FragmentBuilder_BindEkycFragment) null);
    }

    public static void write(Context context, Drawable drawable, ImageView imageView, String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            str = "http://url.with.error";
        }
        FragmentBuilder_BindFundDetailSummaryFragment write = Picasso.read().write(str).write(drawable);
        write.MediaBrowserCompat$CustomActionResultReceiver.read(new FragmentBuilder_BindETBMarketConductDetailFragment(i, i2, context.getResources().getDimensionPixelSize(R.dimen.f74422131165882)));
        FragmentBuilder_BindFundDetailSummaryFragment IconCompatParcelizer = write.IconCompatParcelizer(drawable);
        IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.read(imageView.getLayoutParams().width, imageView.getLayoutParams().height);
        FragmentBuilder_BindFixedTransferInputFormFragment.read read = IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        if (!read.IconCompatParcelizer) {
            read.MediaBrowserCompat$ItemReceiver = true;
            IconCompatParcelizer.read(imageView, (FragmentBuilder_BindEkycFragment) null);
            return;
        }
        throw new IllegalStateException("Center inside can not be used after calling centerCrop");
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Drawable drawable, ImageView imageView, int i, int i2) {
        Picasso read = Picasso.read();
        if (i != 0) {
            FragmentBuilder_BindFundDetailSummaryFragment fragmentBuilder_BindFundDetailSummaryFragment = new FragmentBuilder_BindFundDetailSummaryFragment(read, (Uri) null, i);
            fragmentBuilder_BindFundDetailSummaryFragment.MediaBrowserCompat$CustomActionResultReceiver.read(new FragmentBuilder_BindEStatementsSuccessfulFragment(i2));
            FragmentBuilder_BindFundDetailSummaryFragment IconCompatParcelizer = fragmentBuilder_BindFundDetailSummaryFragment.write(drawable).IconCompatParcelizer(drawable);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                IconCompatParcelizer.write = true;
                IconCompatParcelizer.read(imageView, (FragmentBuilder_BindEkycFragment) null);
                return;
            }
            try {
                imageView.setImageBitmap(IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver());
            } catch (IOException e) {
                onCheckBoxClick.MediaBrowserCompat$ItemReceiver(e, "setCircularDrawableToImageView", new Object[0]);
            }
        } else {
            throw new IllegalArgumentException("Resource ID must not be zero.");
        }
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(ImageView imageView, String str, int i) {
        MediaBrowserCompat$CustomActionResultReceiver(imageView, str, i, (FragmentBuilder_BindEkycFragment) null);
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(ImageView imageView, String str, int i, FragmentBuilder_BindEkycFragment fragmentBuilder_BindEkycFragment) {
        if (TextUtils.isEmpty(str)) {
            str = "http://url.with.error";
        }
        FragmentBuilder_BindFundDetailSummaryFragment write = Picasso.read().write(str);
        write.MediaBrowserCompat$CustomActionResultReceiver.read(new FragmentBuilder_BindEStatementsSuccessfulFragment(i));
        write.write = true;
        write.read(imageView, fragmentBuilder_BindEkycFragment);
    }

    public static void MediaBrowserCompat$ItemReceiver(Drawable drawable, ImageView imageView, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            str = "http://url.with.error";
        }
        FragmentBuilder_BindFundDetailSummaryFragment write = Picasso.read().write(str);
        write.MediaBrowserCompat$CustomActionResultReceiver.read(new FragmentBuilder_BindEStatementsSuccessfulFragment(i));
        write.write = true;
        write.write(drawable).IconCompatParcelizer(drawable).read(imageView, (FragmentBuilder_BindEkycFragment) null);
    }

    public static void read(int i, ImageView imageView, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "http://url.with.error";
        }
        FragmentBuilder_BindETBProductDetailFragment fragmentBuilder_BindETBProductDetailFragment = new FragmentBuilder_BindETBProductDetailFragment();
        FragmentBuilder_BindFundDetailSummaryFragment write = Picasso.read().write(str);
        write.MediaBrowserCompat$CustomActionResultReceiver.read(fragmentBuilder_BindETBProductDetailFragment);
        FragmentBuilder_BindFundDetailSummaryFragment MediaBrowserCompat$CustomActionResultReceiver = write.IconCompatParcelizer(i).MediaBrowserCompat$CustomActionResultReceiver(i);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            MediaBrowserCompat$CustomActionResultReceiver.write = true;
            MediaBrowserCompat$CustomActionResultReceiver.read(imageView, (FragmentBuilder_BindEkycFragment) null);
            return;
        }
        try {
            imageView.setImageBitmap(MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver());
        } catch (IOException e) {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver(e, "setCircularDrawableToImageView", new Object[0]);
        }
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context, int i, ImageView imageView, String str, int i2, int i3) {
        if (TextUtils.isEmpty(str)) {
            str = "http://url.with.error";
        }
        FragmentBuilder_BindFundDetailSummaryFragment MediaBrowserCompat$CustomActionResultReceiver = Picasso.read().write(str).IconCompatParcelizer(i).MediaBrowserCompat$CustomActionResultReceiver(i);
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.read(imageView.getLayoutParams().width, imageView.getLayoutParams().height);
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.read(new FragmentBuilder_BindEStatementsSuccessfulFragment(i2, i3, context.getResources().getDimensionPixelSize(R.dimen.f74422131165882)));
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            MediaBrowserCompat$CustomActionResultReceiver.read(imageView, (FragmentBuilder_BindEkycFragment) null);
            return;
        }
        try {
            imageView.setImageBitmap(MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver());
        } catch (IOException e) {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver(e, "setCircularDrawableToImageView", new Object[0]);
        }
    }

    public static void read(Context context, int i, ImageTextView imageTextView, String str, int i2, int i3) {
        synchronized (FragmentBuilder_BindDepositSelectorFragment.class) {
            if (TextUtils.isEmpty(str)) {
                str = "http://url.with.error";
            }
            FragmentBuilder_BindFundDetailSummaryFragment MediaBrowserCompat$CustomActionResultReceiver = Picasso.read().write(str).IconCompatParcelizer(i).MediaBrowserCompat$CustomActionResultReceiver(i);
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.read(imageTextView.read, imageTextView.IconCompatParcelizer);
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.read(new FragmentBuilder_BindEStatementsSuccessfulFragment(i2, i3, context.getResources().getDimensionPixelSize(R.dimen.f74422131165882)));
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver(imageTextView));
            } else {
                try {
                    imageTextView.setDrawableBitmap(MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver());
                } catch (IOException e) {
                    imageTextView.setDrawable(setLastBaselineToBottomHeight.write(context, i));
                    onCheckBoxClick.MediaBrowserCompat$ItemReceiver(e, "setCircularDrawableToImageTextView in background", new Object[0]);
                }
            }
        }
        return;
    }

    public static void IconCompatParcelizer(ImageTextView imageTextView, String str) {
        synchronized (FragmentBuilder_BindDepositSelectorFragment.class) {
            if (TextUtils.isEmpty(str)) {
                str = "http://url.with.error";
            }
            FragmentBuilder_BindFundDetailSummaryFragment write = Picasso.read().write(str);
            write.MediaBrowserCompat$CustomActionResultReceiver.read(imageTextView.read, imageTextView.IconCompatParcelizer);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                write.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver(imageTextView));
            } else {
                try {
                    imageTextView.setDrawableBitmap(write.MediaBrowserCompat$CustomActionResultReceiver());
                } catch (IOException e) {
                    onCheckBoxClick.MediaBrowserCompat$ItemReceiver(e, "setDrawableToImageTextView", new Object[0]);
                }
            }
        }
        return;
    }

    private static FragmentBuilder_BindFundRedeemLandingFragment MediaBrowserCompat$CustomActionResultReceiver(final ImageTextView imageTextView) {
        FragmentBuilder_BindFundRedeemLandingFragment r1;
        synchronized (FragmentBuilder_BindDepositSelectorFragment.class) {
            r1 = new FragmentBuilder_BindFundRedeemLandingFragment() {
                public final void read(Bitmap bitmap) {
                    synchronized (this) {
                        imageTextView.setDrawableBitmap(bitmap);
                    }
                }

                public final void write(Drawable drawable) {
                    synchronized (this) {
                        imageTextView.setDrawable(drawable);
                    }
                }

                public final void MediaBrowserCompat$CustomActionResultReceiver(Drawable drawable) {
                    synchronized (this) {
                        imageTextView.setDrawable(drawable);
                    }
                }
            };
            if (imageTextView.getTag() instanceof FragmentBuilder_BindFundRedeemLandingFragment) {
                r1 = (FragmentBuilder_BindFundRedeemLandingFragment) imageTextView.getTag();
            }
            if (imageTextView.getTag() == null) {
                imageTextView.setTag(r1);
            }
        }
        return r1;
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(File file, ImageView imageView) {
        FragmentBuilder_BindFundDetailSummaryFragment fragmentBuilder_BindFundDetailSummaryFragment = new FragmentBuilder_BindFundDetailSummaryFragment(Picasso.read(), Uri.fromFile(file), 0);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            fragmentBuilder_BindFundDetailSummaryFragment.read(imageView, (FragmentBuilder_BindEkycFragment) null);
            return;
        }
        try {
            imageView.setImageBitmap(fragmentBuilder_BindFundDetailSummaryFragment.MediaBrowserCompat$CustomActionResultReceiver());
        } catch (IOException e) {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver(e, "setFileToImageView", new Object[0]);
        }
    }

    public static Bitmap write(File file) {
        try {
            return new FragmentBuilder_BindFundDetailSummaryFragment(Picasso.read(), Uri.fromFile(file), 0).MediaBrowserCompat$CustomActionResultReceiver();
        } catch (IOException e) {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver(e, "loadBitmapFromFile", new Object[0]);
            return null;
        }
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Drawable drawable, ImageView imageView, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "http://url.with.error";
        }
        FragmentBuilder_BindFundDetailSummaryFragment IconCompatParcelizer = Picasso.read().write(str).write(drawable).IconCompatParcelizer(drawable);
        IconCompatParcelizer.write = true;
        IconCompatParcelizer.read(imageView, (FragmentBuilder_BindEkycFragment) null);
    }

    public static void MediaMetadataCompat(ImageView imageView, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "http://url.with.error";
        }
        Picasso.read().write(str).IconCompatParcelizer(FragmentBuilder_BindFatcaQuestionnaireFragment.NO_STORE, new FragmentBuilder_BindFatcaQuestionnaireFragment[0]).read(imageView, (FragmentBuilder_BindEkycFragment) null);
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(int i, ImageView imageView, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "http://url.with.error";
        }
        Picasso.read().write(str).IconCompatParcelizer(i).IconCompatParcelizer(FragmentBuilder_BindFatcaQuestionnaireFragment.NO_STORE, new FragmentBuilder_BindFatcaQuestionnaireFragment[0]).read(imageView, (FragmentBuilder_BindEkycFragment) null);
    }

    public static void MediaBrowserCompat$ItemReceiver(int i, ImageView imageView, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "http://url.with.error";
        }
        FragmentBuilder_BindFundDetailSummaryFragment MediaBrowserCompat$CustomActionResultReceiver = Picasso.read().write(str).IconCompatParcelizer(i).MediaBrowserCompat$CustomActionResultReceiver(i);
        MediaBrowserCompat$CustomActionResultReceiver.write = true;
        MediaBrowserCompat$CustomActionResultReceiver.read(imageView, (FragmentBuilder_BindEkycFragment) null);
    }

    public static void MediaBrowserCompat$ItemReceiver(Context context, int i, ImageView imageView, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "http://url.with.error";
        }
        Glide.MediaBrowserCompat$ItemReceiver(context).MediaBrowserCompat$ItemReceiver(str).MediaBrowserCompat$ItemReceiver((abandon<?>) new isReset().IconCompatParcelizer(i)).MediaBrowserCompat$ItemReceiver(imageView);
    }

    public static void read(ImageView imageView, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "http://url.with.error";
        }
        FragmentBuilder_BindFundDetailSummaryFragment write = Picasso.read().write(str);
        write.write = true;
        write.read(imageView, (FragmentBuilder_BindEkycFragment) null);
    }

    public static void MediaBrowserCompat$ItemReceiver(ImageView imageView, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "http://url.with.error";
        }
        Picasso.read().write(str).read(imageView, (FragmentBuilder_BindEkycFragment) null);
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(ImageView imageView, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "http://url.with.error";
        }
        FragmentBuilder_BindFundDetailSummaryFragment write = Picasso.read().write(str);
        write.MediaBrowserCompat$CustomActionResultReceiver.read(imageView.getLayoutParams().width, imageView.getLayoutParams().height);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            write.read(imageView, (FragmentBuilder_BindEkycFragment) null);
            return;
        }
        try {
            imageView.setImageBitmap(write.MediaBrowserCompat$CustomActionResultReceiver());
        } catch (IOException e) {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver(e, "setCircularDrawableToImageView", new Object[0]);
        }
    }

    public static void MediaBrowserCompat$SearchResultReceiver(ImageView imageView, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "http://url.with.error";
        }
        FragmentBuilder_BindFundDetailSummaryFragment write = Picasso.read().write(str);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            write.read(imageView, (FragmentBuilder_BindEkycFragment) null);
            return;
        }
        try {
            imageView.setImageBitmap(write.MediaBrowserCompat$CustomActionResultReceiver());
        } catch (IOException e) {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver(e, "setDrawableToImageViewWithoutCustomSize", new Object[0]);
        }
    }

    public static void write(Drawable drawable, ImageView imageView, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "http://url.with.error";
        }
        FragmentBuilder_BindFundDetailSummaryFragment IconCompatParcelizer = Picasso.read().write(str).write(drawable).IconCompatParcelizer(drawable);
        IconCompatParcelizer.write = true;
        FragmentBuilder_BindFixedTransferInputFormFragment.read read = IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        if (!read.IconCompatParcelizer) {
            read.MediaBrowserCompat$ItemReceiver = true;
            IconCompatParcelizer.read(imageView, (FragmentBuilder_BindEkycFragment) null);
            return;
        }
        throw new IllegalStateException("Center inside can not be used after calling centerCrop");
    }

    public static void IconCompatParcelizer(ImageView imageView, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "http://url.with.error";
        }
        FragmentBuilder_BindFundDetailSummaryFragment write = Picasso.read().write(str);
        write.write = true;
        FragmentBuilder_BindFixedTransferInputFormFragment.read read = write.MediaBrowserCompat$CustomActionResultReceiver;
        if (!read.IconCompatParcelizer) {
            read.MediaBrowserCompat$ItemReceiver = true;
            write.read(imageView, (FragmentBuilder_BindEkycFragment) null);
            return;
        }
        throw new IllegalStateException("Center inside can not be used after calling centerCrop");
    }

    public static void write(String str, FragmentBuilder_BindFundRedeemLandingFragment fragmentBuilder_BindFundRedeemLandingFragment) {
        if (TextUtils.isEmpty(str)) {
            str = "http://url.with.error";
        }
        Picasso.read().write(str).MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindFundRedeemLandingFragment);
    }

    public static void MediaBrowserCompat$ItemReceiver(ImageView imageView, String str, FragmentBuilder_BindEkycFragment fragmentBuilder_BindEkycFragment) {
        if (TextUtils.isEmpty(str)) {
            str = "http://url.with.error";
        }
        FragmentBuilder_BindFundDetailSummaryFragment write = Picasso.read().write(str);
        write.write = true;
        Bitmap.Config config = Bitmap.Config.RGB_565;
        FragmentBuilder_BindFixedTransferInputFormFragment.read read = write.MediaBrowserCompat$CustomActionResultReceiver;
        if (config != null) {
            read.write = config;
            FragmentBuilder_BindFixedTransferInputFormFragment.read read2 = write.MediaBrowserCompat$CustomActionResultReceiver;
            if (!read2.MediaBrowserCompat$ItemReceiver) {
                read2.IconCompatParcelizer = true;
                read2.read = 17;
                write.read(imageView, fragmentBuilder_BindEkycFragment);
                return;
            }
            throw new IllegalStateException("Center crop can not be used after calling centerInside");
        }
        throw new IllegalArgumentException("config == null");
    }

    public static void IconCompatParcelizer(File file, ImageView imageView, Drawable drawable) {
        FragmentBuilder_BindFundDetailSummaryFragment fragmentBuilder_BindFundDetailSummaryFragment;
        Picasso read = Picasso.read();
        if (file == null) {
            fragmentBuilder_BindFundDetailSummaryFragment = new FragmentBuilder_BindFundDetailSummaryFragment(read, (Uri) null, 0);
        } else {
            fragmentBuilder_BindFundDetailSummaryFragment = new FragmentBuilder_BindFundDetailSummaryFragment(read, Uri.fromFile(file), 0);
        }
        fragmentBuilder_BindFundDetailSummaryFragment.write = true;
        Bitmap.Config config = Bitmap.Config.RGB_565;
        FragmentBuilder_BindFixedTransferInputFormFragment.read read2 = fragmentBuilder_BindFundDetailSummaryFragment.MediaBrowserCompat$CustomActionResultReceiver;
        if (config != null) {
            read2.write = config;
            FragmentBuilder_BindFixedTransferInputFormFragment.read read3 = fragmentBuilder_BindFundDetailSummaryFragment.MediaBrowserCompat$CustomActionResultReceiver;
            if (!read3.MediaBrowserCompat$ItemReceiver) {
                read3.IconCompatParcelizer = true;
                read3.read = 17;
                fragmentBuilder_BindFundDetailSummaryFragment.IconCompatParcelizer(drawable).read(imageView, (FragmentBuilder_BindEkycFragment) null);
                return;
            }
            throw new IllegalStateException("Center crop can not be used after calling centerInside");
        }
        throw new IllegalArgumentException("config == null");
    }

    public static void MediaBrowserCompat$ItemReceiver(File file, FragmentBuilder_BindFundRedeemLandingFragment fragmentBuilder_BindFundRedeemLandingFragment) {
        FragmentBuilder_BindFundDetailSummaryFragment fragmentBuilder_BindFundDetailSummaryFragment;
        Picasso read = Picasso.read();
        if (file == null) {
            fragmentBuilder_BindFundDetailSummaryFragment = new FragmentBuilder_BindFundDetailSummaryFragment(read, (Uri) null, 0);
        } else {
            fragmentBuilder_BindFundDetailSummaryFragment = new FragmentBuilder_BindFundDetailSummaryFragment(read, Uri.fromFile(file), 0);
        }
        fragmentBuilder_BindFundDetailSummaryFragment.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindFundRedeemLandingFragment);
    }

    public static void read(Context context, RelativeLayout relativeLayout, ImageView imageView) {
        try {
            HmlSetNTBPinSuccessActivity.write MediaBrowserCompat$ItemReceiver = HmlSetNTBPinSuccessActivity.MediaBrowserCompat$ItemReceiver(context);
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = 15;
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = 1;
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = true;
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = setLastBaselineToBottomHeight.read(context, R.color.f66122131099767);
            new HmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver.write, relativeLayout, MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, (C6897xeb950f47) null).IconCompatParcelizer(imageView);
            imageView.setVisibility(0);
        } catch (OutOfMemoryError e) {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver(e, "setTutorialOverlayImageFromRelative", new Object[0]);
        } catch (NullPointerException e2) {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver(e2, "setTutorialOverlayImageFromRelative", new Object[0]);
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(Context context, RelativeLayout relativeLayout, ImageView imageView) {
        try {
            HmlSetNTBPinSuccessActivity.write MediaBrowserCompat$ItemReceiver = HmlSetNTBPinSuccessActivity.MediaBrowserCompat$ItemReceiver(context);
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = 15;
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = 1;
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = true;
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = setLastBaselineToBottomHeight.read(context, R.color.f66112131099766);
            new HmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver.write, relativeLayout, MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, (C6897xeb950f47) null).IconCompatParcelizer(imageView);
            imageView.setVisibility(0);
        } catch (OutOfMemoryError e) {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver(e, "setTutorialOverlayImageFromRelative", new Object[0]);
        } catch (NullPointerException e2) {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver(e2, "setTutorialOverlayImageFromRelative", new Object[0]);
        }
    }

    public static void write(Context context, RelativeLayout relativeLayout, ImageView imageView) {
        try {
            HmlSetNTBPinSuccessActivity.write MediaBrowserCompat$ItemReceiver = HmlSetNTBPinSuccessActivity.MediaBrowserCompat$ItemReceiver(context);
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = 15;
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = 1;
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = setLastBaselineToBottomHeight.read(context, R.color.f71052131100261);
            new HmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver.write, relativeLayout, MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, (C6897xeb950f47) null).IconCompatParcelizer(imageView);
            imageView.setVisibility(0);
        } catch (OutOfMemoryError e) {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver(e, "setLifestyleTutorialOverlayImageFromRelative", new Object[0]);
        } catch (NullPointerException e2) {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver(e2, "setLifestyleTutorialOverlayImageFromRelative", new Object[0]);
        }
    }

    public static File IconCompatParcelizer(Context context, boolean z) throws IOException {
        File file;
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
        StringBuilder sb = new StringBuilder();
        sb.append("IMAGE_");
        sb.append(format);
        sb.append("_");
        String obj = sb.toString();
        if (z) {
            file = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        } else {
            file = context.getFilesDir();
        }
        return File.createTempFile(obj, ".jpg", file);
    }

    public static String read(Context context, Uri uri) {
        String str = null;
        if (context == null) {
            return null;
        }
        String[] strArr = {"_data"};
        Cursor query = context.getContentResolver().query(uri, strArr, (String) null, (String[]) null, (String) null);
        if (query != null) {
            query.moveToFirst();
            try {
                str = query.getString(query.getColumnIndex(strArr[0]));
            } finally {
                query.close();
            }
        }
        return str;
    }

    public static int write(String str) {
        return (int) new File(str).length();
    }

    public static String read(String str) {
        return new File(str).getName();
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(String str, ImageView imageView) {
        read(str, imageView, (Picasso$MediaBrowserCompat$CustomActionResultReceiver) null);
    }

    public static void read(String str, ImageView imageView, Picasso$MediaBrowserCompat$CustomActionResultReceiver picasso$MediaBrowserCompat$CustomActionResultReceiver) {
        Uri fromParts = Uri.fromParts("base64", str, (String) null);
        Picasso$MediaBrowserCompat$ItemReceiver picasso$MediaBrowserCompat$ItemReceiver = new Picasso$MediaBrowserCompat$ItemReceiver(imageView.getContext());
        if (picasso$MediaBrowserCompat$CustomActionResultReceiver != null) {
            picasso$MediaBrowserCompat$ItemReceiver.write(picasso$MediaBrowserCompat$CustomActionResultReceiver);
        }
        new FragmentBuilder_BindFundDetailSummaryFragment(picasso$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new FragmentBuilder_BindDeejungTransferInstallmentsReviewFragment()).MediaBrowserCompat$ItemReceiver(), fromParts, 0).IconCompatParcelizer(FragmentBuilder_BindFatcaQuestionnaireFragment.NO_CACHE, FragmentBuilder_BindFatcaQuestionnaireFragment.NO_STORE).read(imageView, (FragmentBuilder_BindEkycFragment) null);
    }

    public static String read(Context context, String str) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(Uri.parse(str));
            Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            decodeStream.compress(Bitmap.CompressFormat.JPEG, 75, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            decodeStream.recycle();
            openInputStream.close();
            return Base64.encodeToString(byteArray, 2);
        } catch (IOException | NullPointerException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
            return "";
        }
    }

    public static BScanCNotificationDeepLinkActivity<File> write(File file, byte[] bArr) {
        BScanCNotificationDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver = BScanCNotificationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(new FragmentBuilder_BindDeejungInstallmentsConfirmationFragment(bArr, file));
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver = HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver, "scheduler is null");
        BaseHmlPersonalInfoActivity baseHmlPersonalInfoActivity = new BaseHmlPersonalInfoActivity(MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$ItemReceiver);
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver2 = BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver2, "scheduler is null");
        return new HelpActivity(baseHmlPersonalInfoActivity, MediaBrowserCompat$ItemReceiver2);
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr, File file, AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity) throws Exception {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        } catch (Exception e) {
            onCheckBoxClick.IconCompatParcelizer(e);
            addAccountConsentDeepLinkActivity.IconCompatParcelizer(e);
            bitmap = null;
        }
        if (bitmap != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("temp_");
            sb.append(System.currentTimeMillis());
            sb.append(".jpg");
            try {
                File file2 = new File(file, sb.toString());
                if (!file2.exists()) {
                    file2.getParentFile().mkdirs();
                    file2.createNewFile();
                }
                read(file2, bitmap);
                addAccountConsentDeepLinkActivity.MediaBrowserCompat$ItemReceiver(file2);
            } catch (IOException | NullPointerException e2) {
                onCheckBoxClick.IconCompatParcelizer(e2);
                addAccountConsentDeepLinkActivity.IconCompatParcelizer(e2);
            }
        }
    }

    private static void read(File file, Bitmap bitmap) throws Exception {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } finally {
            bitmap.recycle();
        }
    }

    public static BScanCNotificationDeepLinkActivity<String> write(Context context, Bitmap bitmap) {
        return BScanCNotificationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(new FragmentBuilder_BindDebitCardSuccessfulActivationFragment(context, bitmap));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c A[Catch:{ IOException -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030 A[Catch:{ IOException -> 0x0039 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void read(android.content.Context r2, android.graphics.Bitmap r3, p040o.AddAccountConsentDeepLinkActivity r4) throws java.lang.Exception {
        /*
            java.lang.String r0 = "mounted"
            java.lang.String r1 = android.os.Environment.getExternalStorageState()     // Catch:{ IOException -> 0x0039 }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0039 }
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = "mounted_ro"
            java.lang.String r1 = android.os.Environment.getExternalStorageState()     // Catch:{ IOException -> 0x0039 }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0039 }
            if (r0 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r0 = 0
            goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            java.io.File r2 = IconCompatParcelizer((android.content.Context) r2, (boolean) r0)     // Catch:{ IOException -> 0x0039 }
            java.lang.String r0 = r2.getPath()     // Catch:{ IOException -> 0x0039 }
            read((java.io.File) r2, (android.graphics.Bitmap) r3)     // Catch:{ IOException -> 0x0039 }
            r3.recycle()     // Catch:{ IOException -> 0x0039 }
            if (r0 == 0) goto L_0x0030
            r4.MediaBrowserCompat$ItemReceiver(r0)     // Catch:{ IOException -> 0x0039 }
            return
        L_0x0030:
            java.lang.Throwable r2 = new java.lang.Throwable     // Catch:{ IOException -> 0x0039 }
            r2.<init>()     // Catch:{ IOException -> 0x0039 }
            r4.IconCompatParcelizer(r2)     // Catch:{ IOException -> 0x0039 }
            return
        L_0x0039:
            r2 = move-exception
            r4.IconCompatParcelizer(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindDepositSelectorFragment.read(android.content.Context, android.graphics.Bitmap, o.AddAccountConsentDeepLinkActivity):void");
    }

    public static BScanCNotificationDeepLinkActivity<String> read(Context context, Bitmap bitmap) {
        return BScanCNotificationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(new FragmentBuilder_BindDeejungInstallmentTransactionFragment(context, bitmap));
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(Context context, Bitmap bitmap, AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity) throws Exception {
        TiffSaver.SaveOptions saveOptions = new TiffSaver.SaveOptions();
        saveOptions.compressionScheme = CompressionScheme.CCITTFAX4;
        saveOptions.resUnit = ResolutionUnit.INCH;
        saveOptions.xResolution = 300.0f;
        saveOptions.yResolution = 300.0f;
        String MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(context);
        boolean saveBitmap = TiffSaver.saveBitmap(MediaBrowserCompat$ItemReceiver, bitmap, saveOptions);
        bitmap.recycle();
        if (saveBitmap) {
            addAccountConsentDeepLinkActivity.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver);
        } else {
            addAccountConsentDeepLinkActivity.IconCompatParcelizer(new Throwable());
        }
    }

    public static BScanCNotificationDeepLinkActivity<File> IconCompatParcelizer(String str, int i) {
        BScanCNotificationDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver = BScanCNotificationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(new FragmentBuilder_BindDebitCardSaleSheetFragment(str, i));
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver = HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver, "scheduler is null");
        BaseHmlPersonalInfoActivity baseHmlPersonalInfoActivity = new BaseHmlPersonalInfoActivity(MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$ItemReceiver);
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver2 = BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver2, "scheduler is null");
        return new HelpActivity(baseHmlPersonalInfoActivity, MediaBrowserCompat$ItemReceiver2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void write(java.lang.String r4, int r5, p040o.AddAccountConsentDeepLinkActivity r6) throws java.lang.Exception {
        /*
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inJustDecodeBounds = r1
            android.graphics.BitmapFactory.decodeFile(r4, r0)
            r1 = 1280(0x500, float:1.794E-42)
            int r5 = java.lang.Math.min(r5, r1)     // Catch:{ OutOfMemoryError -> 0x0061, Exception -> 0x005c }
            float r5 = (float) r5     // Catch:{ OutOfMemoryError -> 0x0061, Exception -> 0x005c }
            android.graphics.Bitmap r5 = read((java.lang.String) r4, (android.graphics.BitmapFactory.Options) r0, (float) r5)     // Catch:{ OutOfMemoryError -> 0x0061, Exception -> 0x005c }
            java.io.File r0 = new java.io.File     // Catch:{ OutOfMemoryError -> 0x0061, Exception -> 0x005c }
            r0.<init>(r4)     // Catch:{ OutOfMemoryError -> 0x0061, Exception -> 0x005c }
            boolean r1 = r0.exists()     // Catch:{ OutOfMemoryError -> 0x0061, Exception -> 0x005c }
            if (r1 != 0) goto L_0x002b
            java.io.File r1 = r0.getParentFile()     // Catch:{ OutOfMemoryError -> 0x0061, Exception -> 0x005c }
            r1.mkdirs()     // Catch:{ OutOfMemoryError -> 0x0061, Exception -> 0x005c }
            r0.createNewFile()     // Catch:{ OutOfMemoryError -> 0x0061, Exception -> 0x005c }
        L_0x002b:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ OutOfMemoryError -> 0x0061, Exception -> 0x005c }
            r1.<init>()     // Catch:{ OutOfMemoryError -> 0x0061, Exception -> 0x005c }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ OutOfMemoryError -> 0x0061, Exception -> 0x005c }
            r3 = 80
            r5.compress(r2, r3, r1)     // Catch:{ OutOfMemoryError -> 0x0061, Exception -> 0x005c }
            byte[] r1 = r1.toByteArray()     // Catch:{ OutOfMemoryError -> 0x0061, Exception -> 0x005c }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ OutOfMemoryError -> 0x0061, Exception -> 0x005c }
            r2.<init>(r0)     // Catch:{ OutOfMemoryError -> 0x0061, Exception -> 0x005c }
            r2.write(r1)     // Catch:{ all -> 0x0050 }
            r2.flush()     // Catch:{ all -> 0x0050 }
            r2.close()     // Catch:{ OutOfMemoryError -> 0x0061, Exception -> 0x005c }
            r5.recycle()     // Catch:{ OutOfMemoryError -> 0x0061, Exception -> 0x005c }
            r6.MediaBrowserCompat$ItemReceiver(r0)     // Catch:{ OutOfMemoryError -> 0x0061, Exception -> 0x005c }
            return
        L_0x0050:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0057 }
            goto L_0x005b
        L_0x0057:
            r1 = move-exception
            r5.addSuppressed(r1)     // Catch:{ OutOfMemoryError -> 0x0061, Exception -> 0x005c }
        L_0x005b:
            throw r0     // Catch:{ OutOfMemoryError -> 0x0061, Exception -> 0x005c }
        L_0x005c:
            r4 = move-exception
            r6.IconCompatParcelizer(r4)
            return
        L_0x0061:
            r5 = move-exception
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "OutOfMemoryError occurs during compressing image"
            p040o.onCheckBoxClick.IconCompatParcelizer(r5, r1, r0)
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            r6.MediaBrowserCompat$ItemReceiver(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindDepositSelectorFragment.write(java.lang.String, int, o.AddAccountConsentDeepLinkActivity):void");
    }

    private static Bitmap read(String str, BitmapFactory.Options options, float f) throws IOException {
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = IconCompatParcelizer(options, f);
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options2);
        float min = Math.min(f / ((float) decodeFile.getWidth()), f / ((float) decodeFile.getHeight()));
        if (min < 1.0f) {
            decodeFile = Bitmap.createScaledBitmap(decodeFile, Math.round(((float) decodeFile.getWidth()) * min), Math.round(min * ((float) decodeFile.getHeight())), true);
        }
        return read(str, decodeFile);
    }

    private static int IconCompatParcelizer(BitmapFactory.Options options, float f) {
        int i = options.outHeight;
        int i2 = options.outWidth;
        int i3 = 1;
        if (((float) i) > f || ((float) i2) > f) {
            int i4 = i / 2;
            int i5 = i2 / 2;
            while (((float) (i4 / i3)) >= f && ((float) (i5 / i3)) >= f) {
                i3 <<= 1;
            }
        }
        return i3;
    }

    private static Bitmap read(String str, Bitmap bitmap) throws IOException {
        int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 0);
        return MediaBrowserCompat$ItemReceiver(bitmap, attributeInt != 3 ? attributeInt != 6 ? attributeInt != 8 ? BitmapDescriptorFactory.HUE_RED : 270.0f : 90.0f : 180.0f);
    }

    private static Bitmap MediaBrowserCompat$ItemReceiver(Bitmap bitmap, float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        bitmap.recycle();
        return createBitmap;
    }

    public static BScanCNotificationDeepLinkActivity<String> write(String str, int i) {
        BScanCNotificationDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver = BScanCNotificationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(new FragmentBuilder_BindDebitCardActivationInputFragment(str, i));
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver = HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver, "scheduler is null");
        BaseHmlPersonalInfoActivity baseHmlPersonalInfoActivity = new BaseHmlPersonalInfoActivity(MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$ItemReceiver);
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver2 = BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver2, "scheduler is null");
        return new HelpActivity(baseHmlPersonalInfoActivity, MediaBrowserCompat$ItemReceiver2);
    }

    static /* synthetic */ void IconCompatParcelizer(String str, int i, AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity) throws Exception {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            Bitmap read = read(str, options, (float) Math.min(i, 1280));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            read.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            read.recycle();
            addAccountConsentDeepLinkActivity.MediaBrowserCompat$ItemReceiver(Base64.encodeToString(byteArray, 2));
        } catch (Exception e) {
            addAccountConsentDeepLinkActivity.IconCompatParcelizer(e);
        }
    }

    public static BScanCNotificationDeepLinkActivity<Boolean> write(ContentResolver contentResolver, Resources resources, Image image, Uri uri, float f, int i) {
        try {
            ByteBuffer buffer = image.getPlanes()[0].getBuffer();
            byte[] bArr = new byte[buffer.remaining()];
            buffer.get(bArr);
            return BScanCNotificationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(new FragmentBuilder_BindDebitProductCatalogFragment(contentResolver, uri, resources, bArr, f, i));
        } catch (Exception e) {
            return BScanCNotificationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver((Throwable) e);
        } finally {
            image.close();
        }
    }

    public static BScanCNotificationDeepLinkActivity<Boolean> read(ContentResolver contentResolver, Resources resources, byte[] bArr, Uri uri, float f, int i) {
        return BScanCNotificationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(new FragmentBuilder_BindDebitProductCatalogFragment(contentResolver, uri, resources, bArr, f, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a6, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a7, code lost:
        if (r9 != null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b1, code lost:
        throw r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void write(android.content.ContentResolver r9, android.net.Uri r10, android.content.res.Resources r11, byte[] r12, float r13, int r14, p040o.AddAccountConsentDeepLinkActivity r15) throws java.lang.Exception {
        /*
            r0 = 1
            r1 = 0
            java.io.OutputStream r9 = r9.openOutputStream(r10)     // Catch:{ NullPointerException -> 0x00b4, FileNotFoundException -> 0x00b2 }
            android.graphics.BitmapFactory$Options r10 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x00a4 }
            r10.<init>()     // Catch:{ all -> 0x00a4 }
            r10.inJustDecodeBounds = r0     // Catch:{ all -> 0x00a4 }
            int r2 = r12.length     // Catch:{ all -> 0x00a4 }
            android.graphics.BitmapFactory.decodeByteArray(r12, r1, r2, r10)     // Catch:{ all -> 0x00a4 }
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()     // Catch:{ all -> 0x00a4 }
            int r11 = r11.widthPixels     // Catch:{ all -> 0x00a4 }
            r2 = 1280(0x500, float:1.794E-42)
            int r11 = java.lang.Math.max(r11, r2)     // Catch:{ all -> 0x00a4 }
            float r11 = (float) r11     // Catch:{ all -> 0x00a4 }
            int r11 = IconCompatParcelizer((android.graphics.BitmapFactory.Options) r10, (float) r11)     // Catch:{ all -> 0x00a4 }
            r10.inSampleSize = r11     // Catch:{ all -> 0x00a4 }
            r10.inJustDecodeBounds = r1     // Catch:{ all -> 0x00a4 }
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ all -> 0x00a4 }
            r10.inPreferredConfig = r11     // Catch:{ all -> 0x00a4 }
            r10.inDither = r0     // Catch:{ all -> 0x00a4 }
            int r11 = r12.length     // Catch:{ all -> 0x00a4 }
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeByteArray(r12, r1, r11, r10)     // Catch:{ all -> 0x00a4 }
            android.graphics.Matrix r7 = new android.graphics.Matrix     // Catch:{ all -> 0x00a4 }
            r7.<init>()     // Catch:{ all -> 0x00a4 }
            float r11 = (float) r14     // Catch:{ all -> 0x00a4 }
            r7.postRotate(r11)     // Catch:{ all -> 0x00a4 }
            r11 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0065
            int r11 = r10.getWidth()     // Catch:{ all -> 0x00a4 }
            float r11 = (float) r11     // Catch:{ all -> 0x00a4 }
            float r11 = r11 * r13
            int r11 = (int) r11     // Catch:{ all -> 0x00a4 }
            int r12 = r10.getHeight()     // Catch:{ all -> 0x00a4 }
            float r12 = (float) r12     // Catch:{ all -> 0x00a4 }
            float r12 = r12 * r13
            int r12 = (int) r12     // Catch:{ all -> 0x00a4 }
            int r13 = r10.getWidth()     // Catch:{ all -> 0x00a4 }
            int r13 = r13 - r11
            float r13 = (float) r13     // Catch:{ all -> 0x00a4 }
            r14 = 1073741824(0x40000000, float:2.0)
            float r13 = r13 / r14
            int r13 = (int) r13     // Catch:{ all -> 0x00a4 }
            int r2 = r10.getHeight()     // Catch:{ all -> 0x00a4 }
            int r2 = r2 - r12
            float r2 = (float) r2     // Catch:{ all -> 0x00a4 }
            float r2 = r2 / r14
            int r14 = (int) r2     // Catch:{ all -> 0x00a4 }
            r5 = r11
            r6 = r12
            r3 = r13
            r4 = r14
            goto L_0x0071
        L_0x0065:
            int r11 = r10.getWidth()     // Catch:{ all -> 0x00a4 }
            int r12 = r10.getHeight()     // Catch:{ all -> 0x00a4 }
            r5 = r11
            r6 = r12
            r3 = r1
            r4 = r3
        L_0x0071:
            r8 = 1
            r2 = r10
            android.graphics.Bitmap r11 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00a4 }
            if (r11 == r10) goto L_0x007e
            r10.recycle()     // Catch:{ all -> 0x00a4 }
            r12 = r0
            goto L_0x007f
        L_0x007e:
            r12 = r1
        L_0x007f:
            java.io.ByteArrayOutputStream r13 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00a4 }
            r13.<init>()     // Catch:{ all -> 0x00a4 }
            android.graphics.Bitmap$CompressFormat r14 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x00a4 }
            r2 = 100
            r11.compress(r14, r2, r13)     // Catch:{ all -> 0x00a4 }
            byte[] r13 = r13.toByteArray()     // Catch:{ all -> 0x00a4 }
            if (r12 != 0) goto L_0x0094
            r10.recycle()     // Catch:{ all -> 0x00a4 }
        L_0x0094:
            r11.recycle()     // Catch:{ all -> 0x00a4 }
            r9.write(r13)     // Catch:{ all -> 0x00a4 }
            if (r9 == 0) goto L_0x00b9
            r9.close()     // Catch:{ NullPointerException -> 0x00a2, FileNotFoundException -> 0x00a0 }
            goto L_0x00b9
        L_0x00a0:
            r9 = move-exception
            goto L_0x00b6
        L_0x00a2:
            r9 = move-exception
            goto L_0x00b6
        L_0x00a4:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x00a6 }
        L_0x00a6:
            r11 = move-exception
            if (r9 == 0) goto L_0x00b1
            r9.close()     // Catch:{ all -> 0x00ad }
            goto L_0x00b1
        L_0x00ad:
            r9 = move-exception
            r10.addSuppressed(r9)     // Catch:{ NullPointerException -> 0x00b4, FileNotFoundException -> 0x00b2 }
        L_0x00b1:
            throw r11     // Catch:{ NullPointerException -> 0x00b4, FileNotFoundException -> 0x00b2 }
        L_0x00b2:
            r9 = move-exception
            goto L_0x00b5
        L_0x00b4:
            r9 = move-exception
        L_0x00b5:
            r0 = r1
        L_0x00b6:
            r15.IconCompatParcelizer(r9)
        L_0x00b9:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            r15.MediaBrowserCompat$ItemReceiver(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindDepositSelectorFragment.write(android.content.ContentResolver, android.net.Uri, android.content.res.Resources, byte[], float, int, o.AddAccountConsentDeepLinkActivity):void");
    }

    public static BScanCNotificationDeepLinkActivity<com.kofax.kmc.ken.engines.data.Image> MediaBrowserCompat$CustomActionResultReceiver(String str) {
        BScanCNotificationDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver = BScanCNotificationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(new FragmentBuilder_BindDeejungTransferLandingBottomFragment(str));
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver = HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver, "scheduler is null");
        BaseHmlPersonalInfoActivity baseHmlPersonalInfoActivity = new BaseHmlPersonalInfoActivity(MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$ItemReceiver);
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver2 = BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver2, "scheduler is null");
        return new HelpActivity(baseHmlPersonalInfoActivity, MediaBrowserCompat$ItemReceiver2);
    }

    static /* synthetic */ void write(String str, AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity) throws Exception {
        File file = new File(str);
        if (file.length() == 0) {
            addAccountConsentDeepLinkActivity.IconCompatParcelizer(new Throwable("O bytes file"));
            return;
        }
        com.kofax.kmc.ken.engines.data.Image image = new com.kofax.kmc.ken.engines.data.Image(file, RatingCompat(str));
        ImageProcessor imageProcessor = new ImageProcessor();
        imageProcessor.addAnalysisCompleteEventListener(new FragmentBuilder_BindDealsBuySuccessFragment(image, addAccountConsentDeepLinkActivity));
        imageProcessor.doQuickAnalysis(image, false);
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(com.kofax.kmc.ken.engines.data.Image image, AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity, ImageProcessor.AnalysisCompleteEvent analysisCompleteEvent) {
        image.imageClearBitmap();
        addAccountConsentDeepLinkActivity.MediaBrowserCompat$ItemReceiver(analysisCompleteEvent.getImage());
    }

    public static BScanCNotificationDeepLinkActivity<zzvb> read(Context context, String str, String str2) {
        BScanCNotificationDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver = BScanCNotificationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(new FragmentBuilder_BindDebitCardRewardTabFragment(str, str2, context));
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver = HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver, "scheduler is null");
        BaseHmlPersonalInfoActivity baseHmlPersonalInfoActivity = new BaseHmlPersonalInfoActivity(MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$ItemReceiver);
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver2 = BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver2, "scheduler is null");
        return new HelpActivity(baseHmlPersonalInfoActivity, MediaBrowserCompat$ItemReceiver2);
    }

    static /* synthetic */ void IconCompatParcelizer(String str, String str2, Context context, AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity) throws Exception {
        String str3;
        com.kofax.kmc.ken.engines.data.Image image = new com.kofax.kmc.ken.engines.data.Image(new File(str), RatingCompat(str));
        ImageProcessor imageProcessor = new ImageProcessor();
        ImagePerfectionProfile imagePerfectionProfile = new ImagePerfectionProfile();
        if (zzag.zzd.SALARY_TYPE.type.equalsIgnoreCase(str2)) {
            str3 = "_DoNoPageDetection__DocDimLarge_11.69_DocDimSmall_8.27__DoEdgeCleanup__DoSharpen_3_DoScaleBWImageToDPI_300_DoEnhancedBinarization__Do90DegreeRotation_4_DoIlluminationCorrection__LoadInlineSetting_[intelligent_brightness_enabled=1]_LoadInlineSetting_[CBinarize.Do_Adv_Clarity.Bool=1]_LoadInlineSetting_[CBinarize.Cleanup_Slider_Pos.Int=2]_LoadInlineSetting_[intelligent_contrast_enabled=1]_LoadInlineSetting_[CBinarize.Contrast_Slider_Pos.Int=2]_DoBackgroundSmothing__DoHoleFill_";
        } else {
            str3 = zzag.zzd.CID_TYPE.type.equalsIgnoreCase(str2) ? "_DeviceType_0__DoNoPageDetection__DocDimLarge_8.56_DocDimSmall_5.4__DoScaleImageToDPI_150_Do90DegreeRotation_9__LoadInlineSetting_[CSkewDetect.correct_illumination.Bool=0]" : "_DeviceType_0_DoEdgeCleanup__DoSharpen_3_DoScaleImageToDPI_150_Do90DegreeRotation_4";
        }
        imagePerfectionProfile.setIpOperations(str3);
        imageProcessor.setImagePerfectionProfile(imagePerfectionProfile);
        imageProcessor.addImageOutEventListener(new FragmentBuilder_BindDeejungAboutFragment(context, str, addAccountConsentDeepLinkActivity, image));
        try {
            imageProcessor.processImage(image);
        } catch (KmcException unused) {
            image.imageClearBitmap();
            try {
                image.imageClearFileBuffer();
            } catch (KmcException unused2) {
            }
            IconCompatParcelizer(context, str, (AddAccountConsentDeepLinkActivity<zzvb>) addAccountConsentDeepLinkActivity);
        }
    }

    public static BScanCNotificationDeepLinkActivity<String> MediaBrowserCompat$ItemReceiver(Context context, String str) {
        BScanCNotificationDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver = BScanCNotificationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(new FragmentBuilder_BindDeejungLandingFragment(str, context));
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver = HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver, "scheduler is null");
        BaseHmlPersonalInfoActivity baseHmlPersonalInfoActivity = new BaseHmlPersonalInfoActivity(MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$ItemReceiver);
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver2 = BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver2, "scheduler is null");
        return new HelpActivity(baseHmlPersonalInfoActivity, MediaBrowserCompat$ItemReceiver2);
    }

    static /* synthetic */ void read(String str, Context context, AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity) throws Exception {
        com.kofax.kmc.ken.engines.data.Image image = new com.kofax.kmc.ken.engines.data.Image(new File(str), RatingCompat(str));
        ImageProcessor imageProcessor = new ImageProcessor();
        ImagePerfectionProfile imagePerfectionProfile = new ImagePerfectionProfile();
        imagePerfectionProfile.setIpOperations("_DoNoPageDetection__DocDimLarge_11.69_DocDimSmall_8.27__DoEdgeCleanup__DoSharpen_3_DoScaleBWImageToDPI_300_DoEnhancedBinarization__Do90DegreeRotation_4_DoIlluminationCorrection__LoadInlineSetting_[intelligent_brightness_enabled=1]_LoadInlineSetting_[CBinarize.Do_Adv_Clarity.Bool=1]_LoadInlineSetting_[CBinarize.Cleanup_Slider_Pos.Int=2]_LoadInlineSetting_[intelligent_contrast_enabled=1]_LoadInlineSetting_[CBinarize.Contrast_Slider_Pos.Int=2]_DoBackgroundSmothing__DoHoleFill_");
        imageProcessor.setImagePerfectionProfile(imagePerfectionProfile);
        imageProcessor.setProcessedImageMimeType(Image.ImageMimeType.MIMETYPE_TIFF);
        imageProcessor.setProcessedImageRepresentation(Image.ImageRep.IMAGE_REP_FILE);
        imageProcessor.setProcessedImageFilePath(MediaBrowserCompat$ItemReceiver(context));
        imageProcessor.addImageOutEventListener(new FragmentBuilder_BindDebitCardTransactionTabFragment(image, addAccountConsentDeepLinkActivity));
        try {
            imageProcessor.processImage(image);
        } catch (KmcException e) {
            image.imageClearBitmap();
            try {
                image.imageClearFileBuffer();
            } catch (KmcException unused) {
            }
            addAccountConsentDeepLinkActivity.IconCompatParcelizer(e);
        }
    }

    static /* synthetic */ void read(com.kofax.kmc.ken.engines.data.Image image, AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity, ImageProcessor.ImageOutEvent imageOutEvent) {
        image.imageClearBitmap();
        try {
            image.imageClearFileBuffer();
        } catch (KmcException unused) {
        }
        if (imageOutEvent.getImage() == null || imageOutEvent.getImage().getImageFilePath() == null) {
            addAccountConsentDeepLinkActivity.IconCompatParcelizer(new Throwable());
        } else {
            addAccountConsentDeepLinkActivity.MediaBrowserCompat$ItemReceiver(imageOutEvent.getImage().getImageFilePath());
        }
    }

    private static String MediaBrowserCompat$ItemReceiver(Context context) {
        File file;
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
        StringBuilder sb = new StringBuilder();
        sb.append("TIFF_");
        sb.append(format);
        sb.append(".tif");
        String obj = sb.toString();
        if ("mounted".equals(Environment.getExternalStorageState()) || "mounted_ro".equals(Environment.getExternalStorageState())) {
            file = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        } else {
            file = context.getFilesDir();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file);
        sb2.append("/");
        sb2.append(obj);
        return sb2.toString();
    }

    public static BScanCNotificationDeepLinkActivity<zzvb> MediaBrowserCompat$CustomActionResultReceiver(Context context, com.kofax.kmc.ken.engines.data.Image image, String str, BoundingTetragon boundingTetragon) {
        BScanCNotificationDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver = BScanCNotificationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(new FragmentBuilder_BindDebitCardRequestSuccessFragment(boundingTetragon, context, str, image));
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver = HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver, "scheduler is null");
        BaseHmlPersonalInfoActivity baseHmlPersonalInfoActivity = new BaseHmlPersonalInfoActivity(MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$ItemReceiver);
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver2 = BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver2, "scheduler is null");
        return new HelpActivity(baseHmlPersonalInfoActivity, MediaBrowserCompat$ItemReceiver2);
    }

    static /* synthetic */ void IconCompatParcelizer(BoundingTetragon boundingTetragon, Context context, String str, com.kofax.kmc.ken.engines.data.Image image, AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity) throws Exception {
        ImageProcessor imageProcessor = new ImageProcessor();
        BasicSettingsProfile basicSettingsProfile = new BasicSettingsProfile();
        basicSettingsProfile.setCroppingTetragon(boundingTetragon);
        basicSettingsProfile.setCropType(BasicSettingsProfile.CropType.CROP_TETRAGON);
        imageProcessor.setBasicSettingsProfile(basicSettingsProfile);
        imageProcessor.addImageOutEventListener(new FragmentBuilder_BindDebitCardMarketConductFragment(context, str, addAccountConsentDeepLinkActivity, image));
        try {
            imageProcessor.processImage(image);
        } catch (KmcException unused) {
            image.imageClearBitmap();
            try {
                image.imageClearFileBuffer();
            } catch (KmcException unused2) {
            }
            IconCompatParcelizer(context, (AddAccountConsentDeepLinkActivity<zzvb>) addAccountConsentDeepLinkActivity, new zzvb(str, (String) null, (String) null, (String) null));
        }
    }

    public static BScanCNotificationDeepLinkActivity<Bitmap> MediaBrowserCompat$SearchResultReceiver(String str) {
        BScanCNotificationDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver = BScanCNotificationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(new FragmentBuilder_BindDebitWithdrawalLimitFragment(str));
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver = HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver, "scheduler is null");
        BaseHmlPersonalInfoActivity baseHmlPersonalInfoActivity = new BaseHmlPersonalInfoActivity(MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$ItemReceiver);
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver2 = BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver2, "scheduler is null");
        return new HelpActivity(baseHmlPersonalInfoActivity, MediaBrowserCompat$ItemReceiver2);
    }

    static /* synthetic */ void IconCompatParcelizer(String str, AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity) throws Exception {
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 0);
        addAccountConsentDeepLinkActivity.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver(decodeFile, attributeInt != 3 ? attributeInt != 6 ? attributeInt != 8 ? BitmapDescriptorFactory.HUE_RED : 270.0f : 90.0f : 180.0f));
    }

    public static BScanCNotificationDeepLinkActivity<Bitmap> write(String str, int i, int i2, long j) {
        BScanCNotificationDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver = BScanCNotificationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(new FragmentBuilder_BindDeejungPlanDetailFragment(i2, str, j, i));
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver = HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver, "scheduler is null");
        BaseHmlPersonalInfoActivity baseHmlPersonalInfoActivity = new BaseHmlPersonalInfoActivity(MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$ItemReceiver);
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver2 = BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver2, "scheduler is null");
        return new HelpActivity(baseHmlPersonalInfoActivity, MediaBrowserCompat$ItemReceiver2);
    }

    static /* synthetic */ void IconCompatParcelizer(int i, String str, long j, int i2, AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity) throws Exception {
        Bitmap bitmap;
        try {
            TiffBitmapFactory.Options options = new TiffBitmapFactory.Options();
            if (i > 256) {
                bitmap = TiffBitmapFactory.decodePath(str);
            } else {
                options.inAvailableMemory = j;
                bitmap = TiffBitmapFactory.decodePath(str, options);
            }
            Bitmap MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(bitmap, (float) i2);
            if (MediaBrowserCompat$ItemReceiver != null) {
                addAccountConsentDeepLinkActivity.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver);
            } else {
                addAccountConsentDeepLinkActivity.IconCompatParcelizer(new Exception("Bitmap rotation failed"));
            }
        } catch (Exception e) {
            addAccountConsentDeepLinkActivity.IconCompatParcelizer(e);
        }
    }

    /* access modifiers changed from: private */
    public static void MediaBrowserCompat$ItemReceiver(Context context, String str, AddAccountConsentDeepLinkActivity<zzvb> addAccountConsentDeepLinkActivity, com.kofax.kmc.ken.engines.data.Image image, ImageProcessor.ImageOutEvent imageOutEvent) {
        image.imageClearBitmap();
        try {
            image.imageClearFileBuffer();
        } catch (KmcException unused) {
        }
        if (imageOutEvent.getImage() != null) {
            try {
                IconCompatParcelizer(context, addAccountConsentDeepLinkActivity, new zzvb(write(imageOutEvent, context), (String) null, (String) null, (String) null));
            } catch (KmcException | IOException unused2) {
                IconCompatParcelizer(context, addAccountConsentDeepLinkActivity, new zzvb(str, (String) null, (String) null, (String) null));
            }
        } else {
            IconCompatParcelizer(context, addAccountConsentDeepLinkActivity, new zzvb(str, (String) null, (String) null, (String) null));
        }
    }

    private static String write(ImageProcessor.ImageOutEvent imageOutEvent, Context context) throws IOException, KmcException {
        File IconCompatParcelizer = IconCompatParcelizer(context, "mounted".equals(Environment.getExternalStorageState()) || "mounted_ro".equals(Environment.getExternalStorageState()));
        FileOutputStream fileOutputStream = new FileOutputStream(IconCompatParcelizer);
        imageOutEvent.getImage().getImageBitmap().compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        imageOutEvent.getImage().imageClearBitmap();
        imageOutEvent.getImage().imageClearFileBuffer();
        fileOutputStream.flush();
        fileOutputStream.close();
        return IconCompatParcelizer.getPath();
    }

    public static BScanCNotificationDeepLinkActivity<zzvb> MediaBrowserCompat$CustomActionResultReceiver(Context context, String str, boolean z) {
        BScanCNotificationDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver = BScanCNotificationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(new FragmentBuilder_BindDebitCardRequestInputFragment(z, str, context));
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver = HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver, "scheduler is null");
        BaseHmlPersonalInfoActivity baseHmlPersonalInfoActivity = new BaseHmlPersonalInfoActivity(MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$ItemReceiver);
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver2 = BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver2, "scheduler is null");
        return new HelpActivity(baseHmlPersonalInfoActivity, MediaBrowserCompat$ItemReceiver2);
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(boolean z, String str, Context context, AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity) throws Exception {
        zzvb zzvb;
        if (z) {
            zzvb = MediaMetadataCompat(str);
        } else {
            zzvb = new zzvb(str, (String) null, (String) null, (String) null);
        }
        IconCompatParcelizer(context, (AddAccountConsentDeepLinkActivity<zzvb>) addAccountConsentDeepLinkActivity, zzvb);
    }

    private static void IconCompatParcelizer(Context context, String str, AddAccountConsentDeepLinkActivity<zzvb> addAccountConsentDeepLinkActivity) {
        IconCompatParcelizer(context, addAccountConsentDeepLinkActivity, new zzvb(str, (String) null, (String) null, (String) null));
    }

    private static zzvb MediaMetadataCompat(String str) {
        String str2;
        String str3;
        float[] fArr = new float[2];
        String str4 = null;
        try {
            ExifInterface exifInterface = new ExifInterface(str);
            exifInterface.getLatLong(fArr);
            String attribute = exifInterface.getAttribute("DateTime");
            try {
                str2 = fArr[0] != BitmapDescriptorFactory.HUE_RED ? String.valueOf(fArr[0]) : null;
                try {
                    if (fArr[1] != BitmapDescriptorFactory.HUE_RED) {
                        str4 = String.valueOf(fArr[1]);
                    }
                } catch (Exception unused) {
                }
                str3 = str4;
            } catch (Exception unused2) {
                str3 = null;
                str2 = null;
            }
            str4 = attribute;
        } catch (Exception unused3) {
            str3 = null;
            str2 = null;
        }
        return new zzvb(str, str4, str2, str3);
    }

    private static File write(Context context, String str) {
        Bitmap decodeFile = BitmapFactory.decodeFile(str, new BitmapFactory.Options());
        boolean z = "mounted".equals(Environment.getExternalStorageState()) || "mounted_ro".equals(Environment.getExternalStorageState());
        try {
            new ExifInterface(str).getLatLong(new float[2]);
            File IconCompatParcelizer = IconCompatParcelizer(context, z);
            FileOutputStream fileOutputStream = new FileOutputStream(IconCompatParcelizer);
            decodeFile.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            decodeFile.recycle();
            return IconCompatParcelizer;
        } catch (IOException unused) {
            return null;
        }
    }

    public static boolean MediaBrowserCompat$ItemReceiver(String str) {
        return new File(str).length() < 9437184;
    }

    public static Image.ImageMimeType RatingCompat(String str) {
        int lastIndexOf = str.lastIndexOf(46) + 1;
        String substring = lastIndexOf < str.length() ? str.substring(lastIndexOf) : "";
        char c = 65535;
        int hashCode = substring.hashCode();
        if (hashCode != 105441) {
            if (hashCode != 111145) {
                if (hashCode == 114833 && substring.equals("tif")) {
                    c = 0;
                }
            } else if (substring.equals("png")) {
                c = 1;
            }
        } else if (substring.equals("jpg")) {
            c = 2;
        }
        if (c == 0) {
            return Image.ImageMimeType.MIMETYPE_TIFF;
        }
        if (c != 1) {
            return Image.ImageMimeType.MIMETYPE_JPEG;
        }
        return Image.ImageMimeType.MIMETYPE_PNG;
    }

    public static boolean MediaBrowserCompat$MediaItem(String str) {
        int lastIndexOf = str.lastIndexOf(46) + 1;
        return (lastIndexOf < str.length() ? str.substring(lastIndexOf) : "").equalsIgnoreCase("tif");
    }

    public static BScanCNotificationDeepLinkActivity<Bitmap> IconCompatParcelizer(String str) {
        BScanCNotificationDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver = BScanCNotificationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(new FragmentBuilder_BindDeejungInstallmentsReviewFragment(str));
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver = HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver, "scheduler is null");
        BaseHmlPersonalInfoActivity baseHmlPersonalInfoActivity = new BaseHmlPersonalInfoActivity(MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$ItemReceiver);
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver2 = BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver2, "scheduler is null");
        return new HelpActivity(baseHmlPersonalInfoActivity, MediaBrowserCompat$ItemReceiver2);
    }

    static /* synthetic */ void read(String str, AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity) throws Exception {
        File file = new File(str);
        TiffBitmapFactory.Options options = new TiffBitmapFactory.Options();
        options.inJustDecodeBounds = true;
        TiffBitmapFactory.decodeFile(file, options);
        if (options.outDirectoryCount > 0) {
            options.inDirectoryNumber = 0;
            TiffBitmapFactory.decodeFile(file, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            addAccountConsentDeepLinkActivity.MediaBrowserCompat$ItemReceiver(TiffBitmapFactory.decodeFile(file, options));
            return;
        }
        addAccountConsentDeepLinkActivity.IconCompatParcelizer(new Throwable());
    }

    public static void write(ImageView imageView, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "http://url.with.error";
        }
        FragmentBuilder_BindFundDetailSummaryFragment MediaBrowserCompat$CustomActionResultReceiver = Picasso.read().write(str).IconCompatParcelizer((int) R.drawable.reward_img_placeholder).MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.reward_img_placeholder);
        MediaBrowserCompat$CustomActionResultReceiver.write = true;
        FragmentBuilder_BindFixedTransferInputFormFragment.read read = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        if (!read.MediaBrowserCompat$ItemReceiver) {
            read.IconCompatParcelizer = true;
            read.read = 17;
            MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(FragmentBuilder_BindFatcaQuestionnaireFragment.NO_CACHE, new FragmentBuilder_BindFatcaQuestionnaireFragment[0]).read(imageView, (FragmentBuilder_BindEkycFragment) null);
            return;
        }
        throw new IllegalStateException("Center crop can not be used after calling centerInside");
    }

    public static void write(String str, ImageView imageView) {
        if (TextUtils.isEmpty(str)) {
            str = "http://url.with.error";
        }
        FragmentBuilder_BindFundDetailSummaryFragment MediaBrowserCompat$CustomActionResultReceiver = Picasso.read().write(str).IconCompatParcelizer((int) R.drawable.default_card).MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.default_card_without_logo);
        MediaBrowserCompat$CustomActionResultReceiver.write = true;
        MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(FragmentBuilder_BindFatcaQuestionnaireFragment.NO_STORE, new FragmentBuilder_BindFatcaQuestionnaireFragment[0]).read(imageView, (FragmentBuilder_BindEkycFragment) null);
    }

    private static void IconCompatParcelizer(Context context, AddAccountConsentDeepLinkActivity<zzvb> addAccountConsentDeepLinkActivity, zzvb zzvb) {
        File file;
        String str = zzvb.read;
        File file2 = new File(str);
        int lastIndexOf = str.lastIndexOf(46) + 1;
        if ((lastIndexOf < str.length() ? str.substring(lastIndexOf) : "").equalsIgnoreCase("heic")) {
            file2 = write(context, str);
        }
        while (file != null && file.length() > 9437184) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 2;
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            try {
                File IconCompatParcelizer = IconCompatParcelizer(context, "mounted".equals(Environment.getExternalStorageState()) || "mounted_ro".equals(Environment.getExternalStorageState()));
                FileOutputStream fileOutputStream = new FileOutputStream(IconCompatParcelizer);
                decodeFile.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                decodeFile.recycle();
                file = IconCompatParcelizer;
            } catch (IOException unused) {
                file = null;
            }
        }
        if (file != null) {
            String path = file.getPath();
            String str2 = zzvb.MediaBrowserCompat$CustomActionResultReceiver;
            String str3 = zzvb.write;
            String str4 = zzvb.IconCompatParcelizer;
            onGetStartedClick.write((Object) path, "path");
            addAccountConsentDeepLinkActivity.MediaBrowserCompat$ItemReceiver(new zzvb(path, str2, str3, str4));
            return;
        }
        addAccountConsentDeepLinkActivity.IconCompatParcelizer(new Throwable());
    }

    public static BScanCNotificationDeepLinkActivity<zzvb> IconCompatParcelizer(Context context, String str) {
        BScanCNotificationDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver = BScanCNotificationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(new FragmentBuilder_BindDebitCardRequestInputFragment(false, str, context));
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver = HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver, "scheduler is null");
        BaseHmlPersonalInfoActivity baseHmlPersonalInfoActivity = new BaseHmlPersonalInfoActivity(MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$ItemReceiver);
        BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver2 = BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
        HmlLatestPersonalInformationDeepLinkActivity.write(MediaBrowserCompat$ItemReceiver2, "scheduler is null");
        return new HelpActivity(baseHmlPersonalInfoActivity, MediaBrowserCompat$ItemReceiver2);
    }
}

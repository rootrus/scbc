package p040o;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.squareup.picasso.Picasso;
import java.io.IOException;

/* renamed from: o.FragmentBuilder_BindFavouriteTargetFragment */
public final class FragmentBuilder_BindFavouriteTargetFragment extends FragmentBuilder_BindEkycTermsAndConditionsFragment {
    private static final String[] MediaBrowserCompat$ItemReceiver = {"orientation"};

    public FragmentBuilder_BindFavouriteTargetFragment(Context context) {
        super(context);
    }

    public final boolean write(FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment) {
        Uri uri = fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public final C6534x586e8bf0 write(FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment, int i) throws IOException {
        write write2;
        Bitmap bitmap;
        FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment2 = fragmentBuilder_BindFixedTransferInputFormFragment;
        ContentResolver contentResolver = this.IconCompatParcelizer.getContentResolver();
        int read = read(contentResolver, fragmentBuilder_BindFixedTransferInputFormFragment2.AlertController$RecycleListView);
        String type = contentResolver.getType(fragmentBuilder_BindFixedTransferInputFormFragment2.AlertController$RecycleListView);
        boolean z = false;
        boolean z2 = type != null && type.startsWith("video/");
        if (!(fragmentBuilder_BindFixedTransferInputFormFragment2.PlaybackStateCompat$CustomAction == 0 && fragmentBuilder_BindFixedTransferInputFormFragment2.setHasDecor == 0)) {
            z = true;
        }
        if (z) {
            int i2 = fragmentBuilder_BindFixedTransferInputFormFragment2.PlaybackStateCompat$CustomAction;
            int i3 = fragmentBuilder_BindFixedTransferInputFormFragment2.setHasDecor;
            if (i2 <= write.MICRO.width && i3 <= write.MICRO.height) {
                write2 = write.MICRO;
            } else if (i2 > write.MINI.width || i3 > write.MINI.height) {
                write2 = write.FULL;
            } else {
                write2 = write.MINI;
            }
            write write3 = write2;
            if (!z2 && write3 == write.FULL) {
                return new C6534x586e8bf0((Bitmap) null, onSubmit.IconCompatParcelizer(this.IconCompatParcelizer.getContentResolver().openInputStream(fragmentBuilder_BindFixedTransferInputFormFragment2.AlertController$RecycleListView)), Picasso.read.DISK, read);
            }
            long parseId = ContentUris.parseId(fragmentBuilder_BindFixedTransferInputFormFragment2.AlertController$RecycleListView);
            BitmapFactory.Options read2 = read(fragmentBuilder_BindFixedTransferInputFormFragment);
            read2.inJustDecodeBounds = true;
            BitmapFactory.Options options = read2;
            IconCompatParcelizer(fragmentBuilder_BindFixedTransferInputFormFragment2.PlaybackStateCompat$CustomAction, fragmentBuilder_BindFixedTransferInputFormFragment2.setHasDecor, write3.width, write3.height, read2, fragmentBuilder_BindFixedTransferInputFormFragment);
            if (z2) {
                bitmap = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, write3 == write.FULL ? 1 : write3.androidKind, options);
            } else {
                bitmap = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, write3.androidKind, options);
            }
            if (bitmap != null) {
                return new C6534x586e8bf0(bitmap, (HowToAddAccountStep2Activity) null, Picasso.read.DISK, read);
            }
        }
        return new C6534x586e8bf0((Bitmap) null, onSubmit.IconCompatParcelizer(this.IconCompatParcelizer.getContentResolver().openInputStream(fragmentBuilder_BindFixedTransferInputFormFragment2.AlertController$RecycleListView)), Picasso.read.DISK, read);
    }

    private static int read(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        try {
            Cursor query = contentResolver.query(uri, MediaBrowserCompat$ItemReceiver, (String) null, (String[]) null, (String) null);
            if (query != null) {
                if (query.moveToFirst()) {
                    int i = query.getInt(0);
                    if (query != null) {
                        query.close();
                    }
                    return i;
                }
            }
            if (query != null) {
                query.close();
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: o.FragmentBuilder_BindFavouriteTargetFragment$write */
    enum write {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        
        final int androidKind;
        final int height;
        final int width;

        private write(int i, int i2, int i3) {
            this.androidKind = i;
            this.width = i2;
            this.height = i3;
        }
    }
}

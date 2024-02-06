package p040o;

import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p040o.CloseAccountSelectMainAccountActivity;

/* renamed from: o.CloseAccountSuccessActivity */
public class CloseAccountSuccessActivity extends Service {
    private CloseAccountSelectMainAccountActivity.read MediaBrowserCompat$ItemReceiver = new CloseAccountSelectMainAccountActivity.read() {
        private SparseArray<InputStream> MediaBrowserCompat$CustomActionResultReceiver = new SparseArray<>();
        private SparseArray<ByteArrayOutputStream> MediaBrowserCompat$ItemReceiver = new SparseArray<>();
        private byte[] read;
        private Bitmap write;

        private static Bitmap IconCompatParcelizer(Bitmap bitmap, float f) {
            if (bitmap == null) {
                return null;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(f);
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        }

        public final String IconCompatParcelizer() throws RemoteException {
            if (this.write == null) {
                return null;
            }
            try {
                if (this.read == null) {
                    Log.d(getClass().getName(), "getBase64String: mBytes is null, reading new");
                    this.read = CloseAccountReviewActivity.MediaBrowserCompat$ItemReceiver(this.write, Bitmap.CompressFormat.JPEG, 60);
                    String name = getClass().getName();
                    StringBuilder sb = new StringBuilder();
                    sb.append("getBase64String: mBytes = ");
                    sb.append(this.read);
                    Log.d(name, sb.toString());
                }
                String read2 = AlertController$RecycleListView.read(this.read);
                String name2 = getClass().getName();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("getBase64String: base64 = ");
                sb2.append(read2);
                Log.d(name2, sb2.toString());
                return read2;
            } catch (Exception e) {
                Log.e(getClass().getName(), "getBase64String -> ", e);
                throw new RemoteException(e.getMessage());
            }
        }

        public final void IconCompatParcelizer(float f) throws RemoteException {
            this.write = IconCompatParcelizer(this.write, f);
        }

        public final void IconCompatParcelizer(int i) throws RemoteException {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("closeByteStream: ");
                sb.append(i);
                Log.d("BitmapService", sb.toString());
                ByteArrayOutputStream byteArrayOutputStream = this.MediaBrowserCompat$ItemReceiver.get(i);
                if (byteArrayOutputStream != null) {
                    this.MediaBrowserCompat$CustomActionResultReceiver.put(i, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                    this.MediaBrowserCompat$ItemReceiver.get(i).flush();
                    this.MediaBrowserCompat$ItemReceiver.get(i).close();
                    this.MediaBrowserCompat$ItemReceiver.setValueAt(i, (Object) null);
                }
            } catch (Exception e) {
                Log.e(getClass().getName(), "closeByteStream -> ", e);
                throw new RemoteException(e.getMessage());
            }
        }

        public final int MediaBrowserCompat$ItemReceiver() {
            return Process.myPid();
        }

        public final Bitmap MediaBrowserCompat$SearchResultReceiver() throws RemoteException {
            return this.write;
        }

        public final int read(int i) throws RemoteException {
            int size = this.MediaBrowserCompat$ItemReceiver.size();
            this.MediaBrowserCompat$ItemReceiver.put(size, new ByteArrayOutputStream(i));
            return size;
        }

        public final void read() throws RemoteException {
            this.write = null;
            this.read = null;
        }

        public final void read(int i, byte[] bArr) throws RemoteException {
            try {
                this.MediaBrowserCompat$ItemReceiver.get(i).write(bArr);
            } catch (Exception e) {
                Log.e(getClass().getName(), "putBytes -> ", e);
                throw new RemoteException(e.getMessage());
            }
        }

        public final boolean write() throws RemoteException {
            Bitmap bitmap = this.write;
            return bitmap != null && bitmap.getWidth() > this.write.getHeight();
        }

        private Bitmap write(InputStream inputStream, ChequeAnnouncementActivity_ViewBinding chequeAnnouncementActivity_ViewBinding) throws IOException, InterruptedException {
            String str;
            StringBuilder sb;
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, (Rect) null, (BitmapFactory.Options) null);
            BitmapFactory.Options options = new BitmapFactory.Options();
            if (decodeStream == null) {
                return null;
            }
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("_readBitmapFromInputStream: input bitmap width: ");
            sb2.append(decodeStream.getWidth());
            Log.d(name, sb2.toString());
            String name2 = getClass().getName();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("_readBitmapFromInputStream: input bitmap height: ");
            sb3.append(decodeStream.getHeight());
            Log.d(name2, sb3.toString());
            if (chequeAnnouncementActivity_ViewBinding != null) {
                String name3 = getClass().getName();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("_readBitmapFromInputStream: should crop ");
                sb4.append(chequeAnnouncementActivity_ViewBinding.read);
                Log.d(name3, sb4.toString());
                boolean z = true;
                if (chequeAnnouncementActivity_ViewBinding.read != null && chequeAnnouncementActivity_ViewBinding.read.left + chequeAnnouncementActivity_ViewBinding.read.width() <= decodeStream.getWidth() && chequeAnnouncementActivity_ViewBinding.read.top + chequeAnnouncementActivity_ViewBinding.read.height() <= decodeStream.getHeight()) {
                    Rect rect = chequeAnnouncementActivity_ViewBinding.read;
                    decodeStream = Bitmap.createBitmap(decodeStream, rect.left, rect.top, rect.width(), rect.height());
                    String name4 = getClass().getName();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("_readBitmapFromInputStream: crop out ");
                    sb5.append(decodeStream);
                    Log.d(name4, sb5.toString());
                    String name5 = getClass().getName();
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("_readBitmapFromInputStream: size = ");
                    sb6.append(decodeStream.getAllocationByteCount());
                    Log.d(name5, sb6.toString());
                }
                if (chequeAnnouncementActivity_ViewBinding.MediaBrowserCompat$ItemReceiver <= 0 || Math.max(decodeStream.getWidth(), decodeStream.getHeight()) <= chequeAnnouncementActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) {
                    z = false;
                }
                if (z) {
                    float max = ((float) chequeAnnouncementActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) / ((float) Math.max(decodeStream.getWidth(), decodeStream.getHeight()));
                    String name6 = getClass().getName();
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("_readBitmapFromInputStream: inSampleSize = ");
                    sb7.append(options.inSampleSize);
                    Log.d(name6, sb7.toString());
                    Float valueOf = Float.valueOf(max);
                    decodeStream = Bitmap.createScaledBitmap(decodeStream, Math.round(((float) decodeStream.getWidth()) * valueOf.floatValue()), Math.round(((float) decodeStream.getHeight()) * valueOf.floatValue()), false);
                }
                if (decodeStream.getWidth() > decodeStream.getHeight() && chequeAnnouncementActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver == ChequeAnnouncementActivity_ViewBinding.IconCompatParcelizer) {
                    decodeStream = IconCompatParcelizer(decodeStream, -90.0f);
                    str = getClass().getName();
                    sb = new StringBuilder();
                } else if (decodeStream.getWidth() < decodeStream.getHeight() && chequeAnnouncementActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver == ChequeAnnouncementActivity_ViewBinding.write) {
                    decodeStream = IconCompatParcelizer(decodeStream, 90.0f);
                    str = getClass().getName();
                    sb = new StringBuilder();
                }
                sb.append("_readBitmapFromInputStream: rotate bitmap = ");
                sb.append(decodeStream);
                Log.d(str, sb.toString());
            }
            return decodeStream;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(ParcelFileDescriptor parcelFileDescriptor, ChequeAnnouncementActivity_ViewBinding chequeAnnouncementActivity_ViewBinding) throws RemoteException {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Log.d(getClass().getName(), "readFromFileDescriptor: pipeTo outputStream");
                AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((InputStream) new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), (OutputStream) byteArrayOutputStream);
                String name = getClass().getName();
                StringBuilder sb = new StringBuilder();
                sb.append("readFromFileDescriptor: outputStream size = ");
                sb.append(byteArrayOutputStream.size());
                Log.d(name, sb.toString());
                Log.d(getClass().getName(), "readFromFileDescriptor: convert to inputStream");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                String name2 = getClass().getName();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("readFromFileDescriptor: inputStream size = ");
                sb2.append(byteArrayInputStream);
                Log.d(name2, sb2.toString());
                this.write = write((InputStream) byteArrayInputStream, chequeAnnouncementActivity_ViewBinding);
            } catch (Exception e) {
                Log.e(getClass().getName(), "readFromFileDescriptor -> ", e);
                throw new RemoteException(e.getMessage());
            }
        }

        public final byte[] write(int i, ChequeAnnouncementActivity_ViewBinding chequeAnnouncementActivity_ViewBinding) throws RemoteException {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("readCompressByteArrayFromStreamId: ");
                sb.append(i);
                Log.d("BitmapService", sb.toString());
                InputStream inputStream = this.MediaBrowserCompat$CustomActionResultReceiver.get(i);
                if (inputStream == null) {
                    return null;
                }
                inputStream.reset();
                return CloseAccountReviewActivity.MediaBrowserCompat$ItemReceiver(write(inputStream, chequeAnnouncementActivity_ViewBinding), Bitmap.CompressFormat.JPEG, 60);
            } catch (Exception e) {
                Log.e(getClass().getName(), "readCompressByteArrayFromStreamId -> ", e);
                throw new RemoteException(e.getMessage());
            }
        }

        public final ParcelFileDescriptor MediaBrowserCompat$CustomActionResultReceiver(int i, ChequeAnnouncementActivity_ViewBinding chequeAnnouncementActivity_ViewBinding) throws RemoteException {
            try {
                byte[] write2 = write(i, chequeAnnouncementActivity_ViewBinding);
                if (write2 == null) {
                    return null;
                }
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(write2);
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((InputStream) byteArrayInputStream, (OutputStream) new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]));
                return parcelFileDescriptor;
            } catch (Exception e) {
                Log.e(getClass().getName(), "readCompressDescriptorFromStreamId -> ", e);
                throw new RemoteException(e.getMessage());
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(int i) throws RemoteException {
            int max;
            Bitmap bitmap = this.write;
            if (bitmap != null && (max = Math.max(bitmap.getWidth(), this.write.getHeight())) >= i) {
                Bitmap bitmap2 = this.write;
                Float valueOf = Float.valueOf(((float) max) / ((float) i));
                this.write = Bitmap.createScaledBitmap(bitmap2, Math.round(((float) bitmap2.getWidth()) * valueOf.floatValue()), Math.round(((float) bitmap2.getHeight()) * valueOf.floatValue()), false);
            }
        }

        public final byte[] MediaBrowserCompat$CustomActionResultReceiver() throws RemoteException {
            Bitmap bitmap = this.write;
            if (bitmap == null) {
                return null;
            }
            try {
                this.read = CloseAccountReviewActivity.MediaBrowserCompat$ItemReceiver(bitmap, Bitmap.CompressFormat.JPEG, 60);
                String name = getClass().getName();
                StringBuilder sb = new StringBuilder();
                sb.append("getByteArray: bytes = ");
                sb.append(this.read.length);
                Log.d(name, sb.toString());
                return this.read;
            } catch (Exception e) {
                Log.e(getClass().getName(), "getByteArray", e);
                throw new RemoteException(e.getMessage());
            }
        }

        public final ParcelFileDescriptor RatingCompat() throws RemoteException {
            try {
                if (this.write == null) {
                    return null;
                }
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(MediaBrowserCompat$CustomActionResultReceiver());
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((InputStream) byteArrayInputStream, (OutputStream) new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]));
                return parcelFileDescriptor;
            } catch (Exception e) {
                Log.e(getClass().getName(), "writeToFileDescriptor -> ", e);
                throw new RemoteException(e.getMessage());
            }
        }
    };

    public IBinder onBind(Intent intent) {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public void onCreate() {
        super.onCreate();
    }
}

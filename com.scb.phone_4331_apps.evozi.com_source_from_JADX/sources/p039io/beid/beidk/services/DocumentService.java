package p039io.beid.beidk.services;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import p040o.AppCompatRatingBar;
import p040o.AppCompatTextView;

/* renamed from: io.beid.beidk.services.DocumentService */
public class DocumentService {
    public boolean isCameraPermissionGranted(Activity activity) {
        return AppCompatRatingBar.MediaBrowserCompat$ItemReceiver(activity, "android.permission.CAMERA") == 0;
    }

    public void requestCameraPermission(Activity activity, int i) {
        Log.i(getClass().getName(), "Camera permission is not granted. Requesting permission");
        AppCompatRatingBar.write(activity, new String[]{"android.permission.CAMERA"}, i);
    }

    public String dispatchTakePictureIntent(Activity activity, int i, String str) throws IOException {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(activity.getPackageManager()) != null) {
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            StringBuilder sb = new StringBuilder();
            sb.append("JPEG_");
            sb.append(format);
            sb.append("_");
            File createTempFile = File.createTempFile(sb.toString(), ".jpg", activity.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
            Uri IconCompatParcelizer = AppCompatTextView.IconCompatParcelizer(activity, str, createTempFile);
            String absolutePath = createTempFile.getAbsolutePath();
            intent.putExtra("output", IconCompatParcelizer);
            AppCompatRatingBar.MediaBrowserCompat$CustomActionResultReceiver(activity, intent, i, (Bundle) null);
            return absolutePath;
        }
        Log.e("BeID SDK", "There is no camera activity to capture image");
        return "";
    }
}

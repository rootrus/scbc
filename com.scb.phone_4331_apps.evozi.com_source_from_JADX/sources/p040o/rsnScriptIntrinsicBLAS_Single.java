package p040o;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.util.Log;
import java.io.IOException;

/* renamed from: o.rsnScriptIntrinsicBLAS_Single */
public final class rsnScriptIntrinsicBLAS_Single {
    /* access modifiers changed from: private */
    public static final String write = rsnScriptIntrinsicBLAS_Single.class.getSimpleName();
    public boolean IconCompatParcelizer = true;
    private final Context read;

    public rsnScriptIntrinsicBLAS_Single(Activity activity) {
        activity.setVolumeControlStream(3);
        this.read = activity.getApplicationContext();
    }

    public final MediaPlayer MediaBrowserCompat$CustomActionResultReceiver() {
        AssetFileDescriptor openRawResourceFd;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public final void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                String write = rsnScriptIntrinsicBLAS_Single.write;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to beep ");
                sb.append(i);
                sb.append(", ");
                sb.append(i2);
                Log.w(write, sb.toString());
                mediaPlayer.stop();
                mediaPlayer.release();
                return true;
            }
        });
        try {
            openRawResourceFd = this.read.getResources().openRawResourceFd(rsnScriptInvokeV$MediaBrowserCompat$ItemReceiver.zxing_beep);
            mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            openRawResourceFd.close();
            mediaPlayer.setVolume(0.1f, 0.1f);
            mediaPlayer.prepare();
            mediaPlayer.start();
            return mediaPlayer;
        } catch (IOException e) {
            Log.w(write, e);
            mediaPlayer.release();
            return null;
        } catch (Throwable th) {
            openRawResourceFd.close();
            throw th;
        }
    }
}

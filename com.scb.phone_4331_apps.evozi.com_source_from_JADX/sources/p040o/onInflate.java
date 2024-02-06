package p040o;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p040o.onCreateOptionsMenu;

/* renamed from: o.onInflate */
public final class onInflate implements onCreateOptionsMenu<InputStream> {
    private static onInflate$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver = new onInflate$MediaBrowserCompat$CustomActionResultReceiver();
    private InputStream IconCompatParcelizer;
    private final setInitialSavedState MediaBrowserCompat$CustomActionResultReceiver;
    private HttpURLConnection MediaBrowserCompat$MediaItem;
    private final int RatingCompat;
    private final onInflate$MediaBrowserCompat$ItemReceiver read;
    private volatile boolean write;

    public onInflate(setInitialSavedState setinitialsavedstate, int i) {
        this(setinitialsavedstate, i, MediaBrowserCompat$ItemReceiver);
    }

    private onInflate(setInitialSavedState setinitialsavedstate, int i, onInflate$MediaBrowserCompat$ItemReceiver oninflate_mediabrowsercompat_itemreceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setinitialsavedstate;
        this.RatingCompat = i;
        this.read = oninflate_mediabrowsercompat_itemreceiver;
    }

    public final void IconCompatParcelizer(hasOptionsMenu hasoptionsmenu, onCreateOptionsMenu.IconCompatParcelizer<? super InputStream> iconCompatParcelizer) {
        StringBuilder sb;
        long MediaBrowserCompat$ItemReceiver2 = AudioAttributesCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        try {
            setInitialSavedState setinitialsavedstate = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (setinitialsavedstate.read == null) {
                if (TextUtils.isEmpty(setinitialsavedstate.MediaBrowserCompat$CustomActionResultReceiver)) {
                    String str = setinitialsavedstate.IconCompatParcelizer;
                    if (TextUtils.isEmpty(str)) {
                        URL url = setinitialsavedstate.RatingCompat;
                        if (url != null) {
                            str = url.toString();
                        } else {
                            throw new NullPointerException("Argument must not be null");
                        }
                    }
                    setinitialsavedstate.MediaBrowserCompat$CustomActionResultReceiver = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
                }
                setinitialsavedstate.read = new URL(setinitialsavedstate.MediaBrowserCompat$CustomActionResultReceiver);
            }
            iconCompatParcelizer.read(write(setinitialsavedstate.read, 0, (URL) null, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(AudioAttributesCompatParcelizer.write(MediaBrowserCompat$ItemReceiver2));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(e);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(AudioAttributesCompatParcelizer.write(MediaBrowserCompat$ItemReceiver2));
                Log.v("HttpUrlFetcher", sb2.toString());
            }
            throw th;
        }
    }

    private InputStream write(URL url, int i, URL url2, Map<String, String> map) throws IOException {
        while (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.MediaBrowserCompat$MediaItem = this.read.MediaBrowserCompat$CustomActionResultReceiver(url);
            for (Map.Entry next : map.entrySet()) {
                this.MediaBrowserCompat$MediaItem.addRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            this.MediaBrowserCompat$MediaItem.setConnectTimeout(this.RatingCompat);
            this.MediaBrowserCompat$MediaItem.setReadTimeout(this.RatingCompat);
            boolean z = false;
            this.MediaBrowserCompat$MediaItem.setUseCaches(false);
            this.MediaBrowserCompat$MediaItem.setDoInput(true);
            this.MediaBrowserCompat$MediaItem.setInstanceFollowRedirects(false);
            this.MediaBrowserCompat$MediaItem.connect();
            this.IconCompatParcelizer = this.MediaBrowserCompat$MediaItem.getInputStream();
            if (this.write) {
                return null;
            }
            int responseCode = this.MediaBrowserCompat$MediaItem.getResponseCode();
            int i2 = responseCode / 100;
            if (i2 == 2) {
                HttpURLConnection httpURLConnection = this.MediaBrowserCompat$MediaItem;
                if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                    this.IconCompatParcelizer = new AudioAttributesImplApi21Parcelizer(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
                } else {
                    if (Log.isLoggable("HttpUrlFetcher", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Got non empty content encoding: ");
                        sb.append(httpURLConnection.getContentEncoding());
                        Log.d("HttpUrlFetcher", sb.toString());
                    }
                    this.IconCompatParcelizer = httpURLConnection.getInputStream();
                }
                return this.IconCompatParcelizer;
            }
            if (i2 == 3) {
                z = true;
            }
            if (z) {
                String headerField = this.MediaBrowserCompat$MediaItem.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    read();
                    i++;
                    url2 = url;
                    url = url3;
                } else {
                    throw new HttpException("Received empty or null redirect url");
                }
            } else if (responseCode == -1) {
                throw new HttpException(responseCode);
            } else {
                throw new HttpException(this.MediaBrowserCompat$MediaItem.getResponseMessage(), responseCode);
            }
        }
        throw new HttpException("Too many (> 5) redirects!");
    }

    public final void read() {
        InputStream inputStream = this.IconCompatParcelizer;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.MediaBrowserCompat$MediaItem;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.MediaBrowserCompat$MediaItem = null;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.write = true;
    }

    public final Class<InputStream> write() {
        return InputStream.class;
    }

    public final isPostponed MediaBrowserCompat$ItemReceiver() {
        return isPostponed.REMOTE;
    }
}

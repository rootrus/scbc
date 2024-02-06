package p040o;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p040o.AlertController$RecycleListView;

/* renamed from: o.setMenuCallbacks */
public final class setMenuCallbacks extends setSubtitleTextColor implements View.OnClickListener {
    private int AlertController$RecycleListView = -1;
    private int MediaBrowserCompat$MediaItem = -1;
    private final Context MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final SearchManager f3173x50fd9e4a = ((SearchManager) this.MediaBrowserCompat$CustomActionResultReceiver.getSystemService("search"));
    private final WeakHashMap<String, Drawable.ConstantState> MediaDescriptionCompat;
    private int MediaMetadataCompat = -1;
    private int MediaSessionCompat$QueueItem = -1;
    private int MediaSessionCompat$ResultReceiverWrapper = -1;
    private final SearchView MediaSessionCompat$Token;
    private final SearchableInfo ParcelableVolumeInfo;
    private ColorStateList PlaybackStateCompat$CustomAction;
    private int RatingCompat = -1;
    private final int read;
    public int write = 1;

    public final boolean hasStableIds() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078 A[Catch:{ RuntimeException -> 0x007c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.Cursor write(java.lang.CharSequence r11) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            if (r11 != 0) goto L_0x0006
            r11 = r0
            goto L_0x000a
        L_0x0006:
            java.lang.String r11 = r11.toString()
        L_0x000a:
            androidx.appcompat.widget.SearchView r1 = r10.MediaSessionCompat$Token
            int r1 = r1.getVisibility()
            r2 = 0
            if (r1 != 0) goto L_0x0084
            androidx.appcompat.widget.SearchView r1 = r10.MediaSessionCompat$Token
            int r1 = r1.getWindowVisibility()
            if (r1 != 0) goto L_0x0084
            android.app.SearchableInfo r1 = r10.ParcelableVolumeInfo     // Catch:{ RuntimeException -> 0x007c }
            if (r1 != 0) goto L_0x0021
        L_0x001f:
            r11 = r2
            goto L_0x0076
        L_0x0021:
            java.lang.String r3 = r1.getSuggestAuthority()     // Catch:{ RuntimeException -> 0x007c }
            if (r3 != 0) goto L_0x0028
            goto L_0x001f
        L_0x0028:
            android.net.Uri$Builder r4 = new android.net.Uri$Builder     // Catch:{ RuntimeException -> 0x007c }
            r4.<init>()     // Catch:{ RuntimeException -> 0x007c }
            java.lang.String r5 = "content"
            android.net.Uri$Builder r4 = r4.scheme(r5)     // Catch:{ RuntimeException -> 0x007c }
            android.net.Uri$Builder r3 = r4.authority(r3)     // Catch:{ RuntimeException -> 0x007c }
            android.net.Uri$Builder r3 = r3.query(r0)     // Catch:{ RuntimeException -> 0x007c }
            android.net.Uri$Builder r0 = r3.fragment(r0)     // Catch:{ RuntimeException -> 0x007c }
            java.lang.String r3 = r1.getSuggestPath()     // Catch:{ RuntimeException -> 0x007c }
            if (r3 == 0) goto L_0x0048
            r0.appendEncodedPath(r3)     // Catch:{ RuntimeException -> 0x007c }
        L_0x0048:
            java.lang.String r3 = "search_suggest_query"
            r0.appendPath(r3)     // Catch:{ RuntimeException -> 0x007c }
            java.lang.String r7 = r1.getSuggestSelection()     // Catch:{ RuntimeException -> 0x007c }
            if (r7 == 0) goto L_0x005b
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ RuntimeException -> 0x007c }
            r3 = 0
            r1[r3] = r11     // Catch:{ RuntimeException -> 0x007c }
            r8 = r1
            goto L_0x005f
        L_0x005b:
            r0.appendPath(r11)     // Catch:{ RuntimeException -> 0x007c }
            r8 = r2
        L_0x005f:
            java.lang.String r11 = "limit"
            java.lang.String r1 = "50"
            r0.appendQueryParameter(r11, r1)     // Catch:{ RuntimeException -> 0x007c }
            android.net.Uri r5 = r0.build()     // Catch:{ RuntimeException -> 0x007c }
            android.content.Context r11 = r10.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ RuntimeException -> 0x007c }
            android.content.ContentResolver r4 = r11.getContentResolver()     // Catch:{ RuntimeException -> 0x007c }
            r6 = 0
            r9 = 0
            android.database.Cursor r11 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ RuntimeException -> 0x007c }
        L_0x0076:
            if (r11 == 0) goto L_0x0084
            r11.getCount()     // Catch:{ RuntimeException -> 0x007c }
            return r11
        L_0x007c:
            r11 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r1 = "Search suggestions query threw an exception."
            android.util.Log.w(r0, r1, r11)
        L_0x0084:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setMenuCallbacks.write(java.lang.CharSequence):android.database.Cursor");
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor read2 = read();
        Bundle extras = read2 != null ? read2.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor read2 = read();
        Bundle extras = read2 != null ? read2.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    public final void IconCompatParcelizer(Cursor cursor) {
        try {
            super.IconCompatParcelizer(cursor);
            if (cursor != null) {
                this.MediaSessionCompat$QueueItem = cursor.getColumnIndex("suggest_text_1");
                this.MediaSessionCompat$ResultReceiverWrapper = cursor.getColumnIndex("suggest_text_2");
                this.AlertController$RecycleListView = cursor.getColumnIndex("suggest_text_2_url");
                this.RatingCompat = cursor.getColumnIndex("suggest_icon_1");
                this.MediaMetadataCompat = cursor.getColumnIndex("suggest_icon_2");
                this.MediaBrowserCompat$MediaItem = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    public final View write(Context context, Cursor cursor, ViewGroup viewGroup) {
        View write2 = super.write(context, cursor, viewGroup);
        write2.setTag(new read(write2));
        ((ImageView) write2.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.edit_query)).setImageResource(this.read);
        return write2;
    }

    /* renamed from: o.setMenuCallbacks$read */
    static final class read {
        public final TextView IconCompatParcelizer;
        public final ImageView MediaBrowserCompat$CustomActionResultReceiver;
        public final TextView MediaBrowserCompat$ItemReceiver;
        public final ImageView read;
        public final ImageView write;

        public read(View view) {
            this.MediaBrowserCompat$ItemReceiver = (TextView) view.findViewById(16908308);
            this.IconCompatParcelizer = (TextView) view.findViewById(16908309);
            this.MediaBrowserCompat$CustomActionResultReceiver = (ImageView) view.findViewById(16908295);
            this.write = (ImageView) view.findViewById(16908296);
            this.read = (ImageView) view.findViewById(AlertController$RecycleListView.MediaDescriptionCompat.edit_query);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v26, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$ItemReceiver(android.view.View r19, android.database.Cursor r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            java.lang.Object r2 = r19.getTag()
            o.setMenuCallbacks$read r2 = (p040o.setMenuCallbacks.read) r2
            int r3 = r0.MediaBrowserCompat$MediaItem
            r4 = -1
            r5 = 0
            if (r3 == r4) goto L_0x0015
            int r3 = r1.getInt(r3)
            goto L_0x0016
        L_0x0015:
            r3 = r5
        L_0x0016:
            android.widget.TextView r6 = r2.MediaBrowserCompat$ItemReceiver
            r7 = 8
            if (r6 == 0) goto L_0x0034
            int r6 = r0.MediaSessionCompat$QueueItem
            java.lang.String r6 = MediaBrowserCompat$ItemReceiver((android.database.Cursor) r1, (int) r6)
            android.widget.TextView r8 = r2.MediaBrowserCompat$ItemReceiver
            r8.setText(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0031
            r8.setVisibility(r7)
            goto L_0x0034
        L_0x0031:
            r8.setVisibility(r5)
        L_0x0034:
            android.widget.TextView r6 = r2.IconCompatParcelizer
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L_0x00c0
            int r6 = r0.AlertController$RecycleListView
            java.lang.String r6 = MediaBrowserCompat$ItemReceiver((android.database.Cursor) r1, (int) r6)
            if (r6 == 0) goto L_0x0085
            android.content.res.ColorStateList r10 = r0.PlaybackStateCompat$CustomAction
            if (r10 != 0) goto L_0x0064
            android.util.TypedValue r10 = new android.util.TypedValue
            r10.<init>()
            android.content.Context r11 = r0.MediaBrowserCompat$CustomActionResultReceiver
            android.content.res.Resources$Theme r11 = r11.getTheme()
            int r12 = p040o.AlertController$RecycleListView.read.textColorSearchUrl
            r11.resolveAttribute(r12, r10, r9)
            android.content.Context r11 = r0.MediaBrowserCompat$CustomActionResultReceiver
            android.content.res.Resources r11 = r11.getResources()
            int r10 = r10.resourceId
            android.content.res.ColorStateList r10 = r11.getColorStateList(r10)
            r0.PlaybackStateCompat$CustomAction = r10
        L_0x0064:
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r6)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            r12 = 0
            r13 = 0
            r14 = 0
            android.content.res.ColorStateList r11 = r0.PlaybackStateCompat$CustomAction
            r16 = 0
            r17 = r11
            r11 = r15
            r4 = r15
            r15 = r17
            r11.<init>(r12, r13, r14, r15, r16)
            int r6 = r6.length()
            r11 = 33
            r10.setSpan(r4, r5, r6, r11)
            goto L_0x008b
        L_0x0085:
            int r4 = r0.MediaSessionCompat$ResultReceiverWrapper
            java.lang.String r10 = MediaBrowserCompat$ItemReceiver((android.database.Cursor) r1, (int) r4)
        L_0x008b:
            boolean r4 = android.text.TextUtils.isEmpty(r10)
            if (r4 == 0) goto L_0x00a0
            android.widget.TextView r4 = r2.MediaBrowserCompat$ItemReceiver
            if (r4 == 0) goto L_0x00ae
            android.widget.TextView r4 = r2.MediaBrowserCompat$ItemReceiver
            r4.setSingleLine(r5)
            android.widget.TextView r4 = r2.MediaBrowserCompat$ItemReceiver
            r4.setMaxLines(r8)
            goto L_0x00ae
        L_0x00a0:
            android.widget.TextView r4 = r2.MediaBrowserCompat$ItemReceiver
            if (r4 == 0) goto L_0x00ae
            android.widget.TextView r4 = r2.MediaBrowserCompat$ItemReceiver
            r4.setSingleLine(r9)
            android.widget.TextView r4 = r2.MediaBrowserCompat$ItemReceiver
            r4.setMaxLines(r9)
        L_0x00ae:
            android.widget.TextView r4 = r2.IconCompatParcelizer
            r4.setText(r10)
            boolean r6 = android.text.TextUtils.isEmpty(r10)
            if (r6 == 0) goto L_0x00bd
            r4.setVisibility(r7)
            goto L_0x00c0
        L_0x00bd:
            r4.setVisibility(r5)
        L_0x00c0:
            android.widget.ImageView r4 = r2.MediaBrowserCompat$CustomActionResultReceiver
            r6 = 0
            if (r4 == 0) goto L_0x0124
            android.widget.ImageView r4 = r2.MediaBrowserCompat$CustomActionResultReceiver
            int r10 = r0.RatingCompat
            r11 = -1
            if (r10 != r11) goto L_0x00ce
            r10 = r6
            goto L_0x0120
        L_0x00ce:
            java.lang.String r10 = r1.getString(r10)
            android.graphics.drawable.Drawable r10 = r0.IconCompatParcelizer((java.lang.String) r10)
            if (r10 == 0) goto L_0x00d9
            goto L_0x0120
        L_0x00d9:
            android.app.SearchableInfo r10 = r0.ParcelableVolumeInfo
            android.content.ComponentName r10 = r10.getSearchActivity()
            java.lang.String r11 = r10.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r12 = r0.MediaDescriptionCompat
            boolean r12 = r12.containsKey(r11)
            if (r12 == 0) goto L_0x0102
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r10 = r0.MediaDescriptionCompat
            java.lang.Object r10 = r10.get(r11)
            android.graphics.drawable.Drawable$ConstantState r10 = (android.graphics.drawable.Drawable.ConstantState) r10
            if (r10 != 0) goto L_0x00f7
            r10 = r6
            goto L_0x0113
        L_0x00f7:
            android.content.Context r11 = r0.MediaBrowserCompat$SearchResultReceiver
            android.content.res.Resources r11 = r11.getResources()
            android.graphics.drawable.Drawable r10 = r10.newDrawable(r11)
            goto L_0x0113
        L_0x0102:
            android.graphics.drawable.Drawable r10 = r0.MediaBrowserCompat$ItemReceiver((android.content.ComponentName) r10)
            if (r10 != 0) goto L_0x010a
            r12 = r6
            goto L_0x010e
        L_0x010a:
            android.graphics.drawable.Drawable$ConstantState r12 = r10.getConstantState()
        L_0x010e:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r13 = r0.MediaDescriptionCompat
            r13.put(r11, r12)
        L_0x0113:
            if (r10 == 0) goto L_0x0116
            goto L_0x0120
        L_0x0116:
            android.content.Context r10 = r0.MediaBrowserCompat$CustomActionResultReceiver
            android.content.pm.PackageManager r10 = r10.getPackageManager()
            android.graphics.drawable.Drawable r10 = r10.getDefaultActivityIcon()
        L_0x0120:
            r11 = 4
            MediaBrowserCompat$CustomActionResultReceiver(r4, r10, r11)
        L_0x0124:
            android.widget.ImageView r4 = r2.write
            if (r4 == 0) goto L_0x013b
            android.widget.ImageView r4 = r2.write
            int r10 = r0.MediaMetadataCompat
            r11 = -1
            if (r10 != r11) goto L_0x0130
            goto L_0x0138
        L_0x0130:
            java.lang.String r1 = r1.getString(r10)
            android.graphics.drawable.Drawable r6 = r0.IconCompatParcelizer((java.lang.String) r1)
        L_0x0138:
            MediaBrowserCompat$CustomActionResultReceiver(r4, r6, r7)
        L_0x013b:
            int r1 = r0.write
            if (r1 == r8) goto L_0x014b
            if (r1 != r9) goto L_0x0145
            r1 = r3 & 1
            if (r1 != 0) goto L_0x014b
        L_0x0145:
            android.widget.ImageView r1 = r2.read
            r1.setVisibility(r7)
            return
        L_0x014b:
            android.widget.ImageView r1 = r2.read
            r1.setVisibility(r5)
            android.widget.ImageView r1 = r2.read
            android.widget.TextView r3 = r2.MediaBrowserCompat$ItemReceiver
            java.lang.CharSequence r3 = r3.getText()
            r1.setTag(r3)
            android.widget.ImageView r1 = r2.read
            r1.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setMenuCallbacks.MediaBrowserCompat$ItemReceiver(android.view.View, android.database.Cursor):void");
    }

    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.MediaSessionCompat$Token.read((CharSequence) tag);
        }
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View write2 = write(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, viewGroup);
            if (write2 != null) {
                ((read) write2.getTag()).MediaBrowserCompat$ItemReceiver.setText(e.toString());
            }
            return write2;
        }
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View read2 = read(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, viewGroup);
            if (read2 != null) {
                ((read) read2.getTag()).MediaBrowserCompat$ItemReceiver.setText(e.toString());
            }
            return read2;
        }
    }

    private Drawable IconCompatParcelizer(String str) {
        Drawable drawable;
        Drawable drawable2 = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                StringBuilder sb = new StringBuilder();
                sb.append("android.resource://");
                sb.append(this.MediaBrowserCompat$SearchResultReceiver.getPackageName());
                sb.append("/");
                sb.append(parseInt);
                String obj = sb.toString();
                Drawable.ConstantState constantState = this.MediaDescriptionCompat.get(obj);
                if (constantState == null) {
                    drawable = null;
                } else {
                    drawable = constantState.newDrawable();
                }
                if (drawable != null) {
                    return drawable;
                }
                Drawable write2 = setLastBaselineToBottomHeight.write(this.MediaBrowserCompat$SearchResultReceiver, parseInt);
                if (write2 != null) {
                    this.MediaDescriptionCompat.put(obj, write2.getConstantState());
                }
                return write2;
            } catch (NumberFormatException unused) {
                Drawable.ConstantState constantState2 = this.MediaDescriptionCompat.get(str);
                if (constantState2 != null) {
                    drawable2 = constantState2.newDrawable();
                }
                if (drawable2 != null) {
                    return drawable2;
                }
                drawable2 = IconCompatParcelizer(Uri.parse(str));
                if (drawable2 != null) {
                    this.MediaDescriptionCompat.put(str, drawable2.getConstantState());
                }
            } catch (Resources.NotFoundException unused2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Icon resource not found: ");
                sb2.append(str);
                Log.w("SuggestionsAdapter", sb2.toString());
                return null;
            }
        }
        return drawable2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("Resource does not exist: ");
        r3.append(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        throw new java.io.FileNotFoundException(r3.toString());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable IconCompatParcelizer(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Error closing icon stream for "
            java.lang.String r1 = "SuggestionsAdapter"
            r2 = 0
            java.lang.String r3 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "android.resource"
            boolean r3 = r4.equals(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x002d
            android.graphics.drawable.Drawable r7 = r6.write((android.net.Uri) r7)     // Catch:{ NotFoundException -> 0x0016 }
            return r7
        L_0x0016:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x002d:
            android.content.Context r3 = r6.MediaBrowserCompat$SearchResultReceiver     // Catch:{ FileNotFoundException -> 0x0085 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.io.InputStream r3 = r3.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x006e
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r3, r2)     // Catch:{ all -> 0x0055 }
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0054
        L_0x0041:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0054:
            return r4
        L_0x0055:
            r4 = move-exception
            r3.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x006d
        L_0x005a:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006d:
            throw r4     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r0.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r1, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setMenuCallbacks.IconCompatParcelizer(android.net.Uri):android.graphics.drawable.Drawable");
    }

    private Drawable MediaBrowserCompat$ItemReceiver(ComponentName componentName) {
        PackageManager packageManager = this.MediaBrowserCompat$CustomActionResultReceiver.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid icon resource ");
            sb.append(iconResource);
            sb.append(" for ");
            sb.append(componentName.flattenToShortString());
            Log.w("SuggestionsAdapter", sb.toString());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    public static String read(Cursor cursor, String str) {
        return MediaBrowserCompat$ItemReceiver(cursor, cursor.getColumnIndex(str));
    }

    private static String MediaBrowserCompat$ItemReceiver(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    private Drawable write(Uri uri) throws FileNotFoundException {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.MediaBrowserCompat$CustomActionResultReceiver.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Single path segment is not a resource ID: ");
                            sb.append(uri);
                            throw new FileNotFoundException(sb.toString());
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("More than two path segments: ");
                        sb2.append(uri);
                        throw new FileNotFoundException(sb2.toString());
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("No resource found for: ");
                    sb3.append(uri);
                    throw new FileNotFoundException(sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("No path: ");
                sb4.append(uri);
                throw new FileNotFoundException(sb4.toString());
            } catch (PackageManager.NameNotFoundException unused2) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("No package found for authority: ");
                sb5.append(uri);
                throw new FileNotFoundException(sb5.toString());
            }
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("No authority: ");
            sb6.append(uri);
            throw new FileNotFoundException(sb6.toString());
        }
    }

    public setMenuCallbacks(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.MediaSessionCompat$Token);
        this.MediaSessionCompat$Token = searchView;
        this.ParcelableVolumeInfo = searchableInfo;
        this.read = searchView.ParcelableVolumeInfo;
        this.MediaBrowserCompat$SearchResultReceiver = context;
        this.MediaDescriptionCompat = weakHashMap;
    }

    public final CharSequence MediaBrowserCompat$ItemReceiver(Cursor cursor) {
        String MediaBrowserCompat$ItemReceiver;
        String MediaBrowserCompat$ItemReceiver2;
        if (cursor == null) {
            return null;
        }
        String MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (MediaBrowserCompat$ItemReceiver3 != null) {
            return MediaBrowserCompat$ItemReceiver3;
        }
        if (this.ParcelableVolumeInfo.shouldRewriteQueryFromData() && (MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        if (!this.ParcelableVolumeInfo.shouldRewriteQueryFromText() || (MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return MediaBrowserCompat$ItemReceiver;
    }
}

package p040o;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: o.ScrollingTabContainerView */
public final class ScrollingTabContainerView {
    private static Method IconCompatParcelizer;
    private static Method read;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                read = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        } else {
            try {
                Class<?> cls = Class.forName("libcore.icu.ICU");
                if (cls != null) {
                    IconCompatParcelizer = cls.getMethod("getScript", new Class[]{String.class});
                    read = cls.getMethod("addLikelySubtags", new Class[]{String.class});
                }
            } catch (Exception e2) {
                IconCompatParcelizer = null;
                read = null;
                Log.w("ICUCompat", e2);
            }
        }
    }

    public static String write(Locale locale) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return ((Locale) read.invoke((Object) null, new Object[]{locale})).getScript();
            } catch (InvocationTargetException e) {
                Log.w("ICUCompat", e);
                return locale.getScript();
            } catch (IllegalAccessException e2) {
                Log.w("ICUCompat", e2);
                return locale.getScript();
            }
        } else {
            String MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(locale);
            if (MediaBrowserCompat$ItemReceiver != null) {
                return read(MediaBrowserCompat$ItemReceiver);
            }
            return null;
        }
    }

    private static String read(String str) {
        try {
            if (IconCompatParcelizer != null) {
                return (String) IconCompatParcelizer.invoke((Object) null, new Object[]{str});
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return null;
    }

    /* renamed from: o.ScrollingTabContainerView$TabView */
    public final class TabView {
        public static final setAppSearchData IconCompatParcelizer = RatingCompat.IconCompatParcelizer;
        public static final setAppSearchData MediaBrowserCompat$CustomActionResultReceiver = new C1283x41a30058((write) null, false);
        public static final setAppSearchData MediaBrowserCompat$ItemReceiver = new C1283x41a30058(read.MediaBrowserCompat$CustomActionResultReceiver, false);
        public static final setAppSearchData MediaBrowserCompat$MediaItem = new C1283x41a30058((write) null, true);
        public static final setAppSearchData read = new C1283x41a30058(C1282x5f105dc9.MediaBrowserCompat$CustomActionResultReceiver, true);
        public static final setAppSearchData write = new C1283x41a30058(C1282x5f105dc9.MediaBrowserCompat$CustomActionResultReceiver, false);

        /* renamed from: o.ScrollingTabContainerView$TabView$write */
        interface write {
            int MediaBrowserCompat$ItemReceiver(CharSequence charSequence, int i, int i2);
        }

        static int MediaBrowserCompat$CustomActionResultReceiver(int i) {
            if (i != 0) {
                return (i == 1 || i == 2) ? 0 : 2;
            }
            return 1;
        }

        static int read(int i) {
            if (i != 0) {
                if (i == 1 || i == 2) {
                    return 0;
                }
                switch (i) {
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                        return 0;
                    default:
                        return 2;
                }
            }
            return 1;
        }

        /* renamed from: o.ScrollingTabContainerView$TabView$IconCompatParcelizer */
        static abstract class IconCompatParcelizer implements setAppSearchData {
            private final write write;

            /* access modifiers changed from: protected */
            public abstract boolean MediaBrowserCompat$CustomActionResultReceiver();

            IconCompatParcelizer(write write2) {
                this.write = write2;
            }

            public boolean MediaBrowserCompat$ItemReceiver(CharSequence charSequence, int i, int i2) {
                if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                    throw new IllegalArgumentException();
                } else if (this.write == null) {
                    return MediaBrowserCompat$CustomActionResultReceiver();
                } else {
                    return MediaBrowserCompat$CustomActionResultReceiver(charSequence, i, i2);
                }
            }

            private boolean MediaBrowserCompat$CustomActionResultReceiver(CharSequence charSequence, int i, int i2) {
                int MediaBrowserCompat$ItemReceiver = this.write.MediaBrowserCompat$ItemReceiver(charSequence, i, i2);
                if (MediaBrowserCompat$ItemReceiver == 0) {
                    return true;
                }
                if (MediaBrowserCompat$ItemReceiver != 1) {
                    return MediaBrowserCompat$CustomActionResultReceiver();
                }
                return false;
            }
        }

        /* renamed from: o.ScrollingTabContainerView$TabView$read */
        static class read implements write {
            static final read MediaBrowserCompat$CustomActionResultReceiver = new read(true);
            static final read write = new read(false);
            private final boolean MediaBrowserCompat$ItemReceiver;

            public int MediaBrowserCompat$ItemReceiver(CharSequence charSequence, int i, int i2) {
                boolean z = false;
                for (int i3 = i; i3 < i2 + i; i3++) {
                    int MediaBrowserCompat$CustomActionResultReceiver2 = TabView.MediaBrowserCompat$CustomActionResultReceiver(Character.getDirectionality(charSequence.charAt(i3)));
                    if (MediaBrowserCompat$CustomActionResultReceiver2 != 0) {
                        if (MediaBrowserCompat$CustomActionResultReceiver2 != 1) {
                            continue;
                        } else if (!this.MediaBrowserCompat$ItemReceiver) {
                            return 1;
                        }
                    } else if (this.MediaBrowserCompat$ItemReceiver) {
                        return 0;
                    }
                    z = true;
                }
                if (z) {
                    return this.MediaBrowserCompat$ItemReceiver ? 1 : 0;
                }
                return 2;
            }

            private read(boolean z) {
                this.MediaBrowserCompat$ItemReceiver = z;
            }
        }

        /* renamed from: o.ScrollingTabContainerView$TabView$RatingCompat */
        static class RatingCompat extends IconCompatParcelizer {
            static final RatingCompat IconCompatParcelizer = new RatingCompat();

            RatingCompat() {
                super((write) null);
            }

            /* access modifiers changed from: protected */
            public boolean MediaBrowserCompat$CustomActionResultReceiver() {
                return setSelected.MediaBrowserCompat$ItemReceiver(Locale.getDefault()) == 1;
            }
        }
    }

    private static String MediaBrowserCompat$ItemReceiver(Locale locale) {
        String obj = locale.toString();
        try {
            if (read != null) {
                return (String) read.invoke((Object) null, new Object[]{obj});
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return obj;
    }
}

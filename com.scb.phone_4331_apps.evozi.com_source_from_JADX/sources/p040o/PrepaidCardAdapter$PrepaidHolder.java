package p040o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: o.PrepaidCardAdapter$PrepaidHolder */
public final class PrepaidCardAdapter$PrepaidHolder implements Serializable {
    private static final PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem AlertController$RecycleListView = new read(13);
    private static final PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem IconCompatParcelizer = new read() {
        /* access modifiers changed from: package-private */
        public final int read(PrepaidCardAdapter$PrepaidHolder prepaidCardAdapter$PrepaidHolder, int i) {
            return i < 100 ? PrepaidCardAdapter$PrepaidHolder.MediaBrowserCompat$ItemReceiver(prepaidCardAdapter$PrepaidHolder, i) : i;
        }
    };
    private static final PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem MediaBrowserCompat$CustomActionResultReceiver = new read(5);
    private static final PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem MediaBrowserCompat$ItemReceiver = new read(6);
    private static final PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem MediaBrowserCompat$MediaItem = new read() {
        /* access modifiers changed from: package-private */
        public final int read(PrepaidCardAdapter$PrepaidHolder prepaidCardAdapter$PrepaidHolder, int i) {
            if (i == 12) {
                return 0;
            }
            return i;
        }
    };
    private static final PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem MediaBrowserCompat$SearchResultReceiver = new read(11);
    /* access modifiers changed from: private */

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public static final Comparator<String> f3159x50fd9e4a = new Comparator<String>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((String) obj2).compareTo((String) obj);
        }
    };
    private static final PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem MediaDescriptionCompat = new read() {
        /* access modifiers changed from: package-private */
        public final int read(PrepaidCardAdapter$PrepaidHolder prepaidCardAdapter$PrepaidHolder, int i) {
            if (i == 24) {
                return 0;
            }
            return i;
        }
    };
    private static final PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem MediaMetadataCompat = new read(10);
    private static final PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem MediaSessionCompat$QueueItem = new read(12);
    private static final PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem MediaSessionCompat$ResultReceiverWrapper = new read(1);
    private static final PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem MediaSessionCompat$Token = new read() {
        /* access modifiers changed from: package-private */
        public final int read(PrepaidCardAdapter$PrepaidHolder prepaidCardAdapter$PrepaidHolder, int i) {
            return i - 1;
        }
    };
    private static final PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem ParcelableVolumeInfo = new read(14);
    private static final PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem PlaybackStateCompat = new read(3);
    private static final PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem PlaybackStateCompat$CustomAction = new read(4);
    private static Locale RatingCompat = new Locale("ja", "JP", "JP");
    private static final PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem read = new read(8);
    private static final ConcurrentMap<Locale, PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem>[] setHasDecor = new ConcurrentMap[17];
    private static final PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem write = new read() {
        /* access modifiers changed from: package-private */
        public final int read(PrepaidCardAdapter$PrepaidHolder prepaidCardAdapter$PrepaidHolder, int i) {
            if (i == 7) {
                return 1;
            }
            return 1 + i;
        }
    };
    private transient List<C7000xf123db75> AppCompatActivity;
    private final int AppCompatDelegateImpl$ListMenuDecorView;
    /* access modifiers changed from: private */
    public final String AppCompatDialogFragment;
    private final int Keep;
    private final TimeZone setBackgroundResource;
    private final Locale setContentView;

    static /* synthetic */ boolean IconCompatParcelizer(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    protected PrepaidCardAdapter$PrepaidHolder(String str, TimeZone timeZone, Locale locale, Date date) {
        int i;
        this.AppCompatDialogFragment = str;
        this.setBackgroundResource = timeZone;
        this.setContentView = locale;
        Calendar instance = Calendar.getInstance(timeZone, locale);
        if (locale.equals(RatingCompat)) {
            i = 0;
        } else {
            instance.setTime(new Date());
            i = instance.get(1) - 80;
        }
        int i2 = (i / 100) * 100;
        this.Keep = i2;
        this.AppCompatDelegateImpl$ListMenuDecorView = i - i2;
        MediaBrowserCompat$ItemReceiver(instance);
    }

    private void MediaBrowserCompat$ItemReceiver(Calendar calendar) {
        C7000xf123db75 prepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$SearchResultReceiver;
        this.AppCompatActivity = new ArrayList();
        MediaMetadataCompat mediaMetadataCompat = new MediaMetadataCompat(calendar);
        while (true) {
            if (mediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver >= PrepaidCardAdapter$PrepaidHolder.this.AppCompatDialogFragment.length()) {
                prepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$SearchResultReceiver = null;
            } else {
                char charAt = PrepaidCardAdapter$PrepaidHolder.this.AppCompatDialogFragment.charAt(mediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver);
                if (IconCompatParcelizer(charAt)) {
                    prepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$SearchResultReceiver = mediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver(charAt);
                } else {
                    prepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$SearchResultReceiver = mediaMetadataCompat.write();
                }
            }
            if (prepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$SearchResultReceiver != null) {
                this.AppCompatActivity.add(prepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$SearchResultReceiver);
            } else {
                return;
            }
        }
    }

    /* renamed from: o.PrepaidCardAdapter$PrepaidHolder$MediaMetadataCompat */
    class MediaMetadataCompat {
        private final Calendar IconCompatParcelizer;
        int MediaBrowserCompat$CustomActionResultReceiver;

        MediaMetadataCompat(Calendar calendar) {
            this.IconCompatParcelizer = calendar;
        }

        /* access modifiers changed from: package-private */
        public final C7000xf123db75 MediaBrowserCompat$CustomActionResultReceiver(char c) {
            int i = this.MediaBrowserCompat$CustomActionResultReceiver;
            do {
                int i2 = this.MediaBrowserCompat$CustomActionResultReceiver + 1;
                this.MediaBrowserCompat$CustomActionResultReceiver = i2;
                if (i2 >= PrepaidCardAdapter$PrepaidHolder.this.AppCompatDialogFragment.length() || PrepaidCardAdapter$PrepaidHolder.this.AppCompatDialogFragment.charAt(this.MediaBrowserCompat$CustomActionResultReceiver) != c) {
                    int i3 = this.MediaBrowserCompat$CustomActionResultReceiver - i;
                }
                int i22 = this.MediaBrowserCompat$CustomActionResultReceiver + 1;
                this.MediaBrowserCompat$CustomActionResultReceiver = i22;
                break;
            } while (PrepaidCardAdapter$PrepaidHolder.this.AppCompatDialogFragment.charAt(this.MediaBrowserCompat$CustomActionResultReceiver) != c);
            int i32 = this.MediaBrowserCompat$CustomActionResultReceiver - i;
            return new C7000xf123db75(PrepaidCardAdapter$PrepaidHolder.read(PrepaidCardAdapter$PrepaidHolder.this, c, i32, this.IconCompatParcelizer), i32);
        }

        /* access modifiers changed from: package-private */
        public final C7000xf123db75 write() {
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            while (this.MediaBrowserCompat$CustomActionResultReceiver < PrepaidCardAdapter$PrepaidHolder.this.AppCompatDialogFragment.length()) {
                char charAt = PrepaidCardAdapter$PrepaidHolder.this.AppCompatDialogFragment.charAt(this.MediaBrowserCompat$CustomActionResultReceiver);
                if (!z && PrepaidCardAdapter$PrepaidHolder.IconCompatParcelizer(charAt)) {
                    break;
                }
                if (charAt == '\'') {
                    int i = this.MediaBrowserCompat$CustomActionResultReceiver + 1;
                    this.MediaBrowserCompat$CustomActionResultReceiver = i;
                    if (i == PrepaidCardAdapter$PrepaidHolder.this.AppCompatDialogFragment.length() || PrepaidCardAdapter$PrepaidHolder.this.AppCompatDialogFragment.charAt(this.MediaBrowserCompat$CustomActionResultReceiver) != '\'') {
                        z = !z;
                    }
                }
                this.MediaBrowserCompat$CustomActionResultReceiver++;
                sb.append(charAt);
            }
            if (!z) {
                String obj = sb.toString();
                return new C7000xf123db75(new write(obj), obj.length());
            }
            throw new IllegalArgumentException("Unterminated quote");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PrepaidCardAdapter$PrepaidHolder)) {
            return false;
        }
        PrepaidCardAdapter$PrepaidHolder prepaidCardAdapter$PrepaidHolder = (PrepaidCardAdapter$PrepaidHolder) obj;
        if (!this.AppCompatDialogFragment.equals(prepaidCardAdapter$PrepaidHolder.AppCompatDialogFragment) || !this.setBackgroundResource.equals(prepaidCardAdapter$PrepaidHolder.setBackgroundResource) || !this.setContentView.equals(prepaidCardAdapter$PrepaidHolder.setContentView)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.AppCompatDialogFragment.hashCode() + ((this.setBackgroundResource.hashCode() + (this.setContentView.hashCode() * 13)) * 13);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FastDateParser[");
        sb.append(this.AppCompatDialogFragment);
        sb.append(",");
        sb.append(this.setContentView);
        sb.append(",");
        sb.append(this.setBackgroundResource.getID());
        sb.append("]");
        return sb.toString();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        MediaBrowserCompat$ItemReceiver(Calendar.getInstance(this.setBackgroundResource, this.setContentView));
    }

    public final Date MediaBrowserCompat$ItemReceiver(String str) throws ParseException {
        ParsePosition parsePosition = new ParsePosition(0);
        Date read2 = read(str, parsePosition);
        if (read2 != null) {
            return read2;
        }
        if (this.setContentView.equals(RatingCompat)) {
            StringBuilder sb = new StringBuilder();
            sb.append("(The ");
            sb.append(this.setContentView);
            sb.append(" locale does not support dates before 1868 AD)\nUnparseable date: \"");
            sb.append(str);
            throw new ParseException(sb.toString(), parsePosition.getErrorIndex());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unparseable date: ");
        sb2.append(str);
        throw new ParseException(sb2.toString(), parsePosition.getErrorIndex());
    }

    public final Date read(String str, ParsePosition parsePosition) {
        Calendar instance = Calendar.getInstance(this.setBackgroundResource, this.setContentView);
        instance.clear();
        if (MediaBrowserCompat$CustomActionResultReceiver(str, parsePosition, instance)) {
            return instance.getTime();
        }
        return null;
    }

    private boolean MediaBrowserCompat$CustomActionResultReceiver(String str, ParsePosition parsePosition, Calendar calendar) {
        ListIterator<C7000xf123db75> listIterator = this.AppCompatActivity.listIterator();
        while (listIterator.hasNext()) {
            C7000xf123db75 next = listIterator.next();
            if (!next.write.MediaBrowserCompat$ItemReceiver(this, calendar, str, parsePosition, next.MediaBrowserCompat$ItemReceiver(listIterator))) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static StringBuilder read(StringBuilder sb, String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!(charAt == '$' || charAt == '.' || charAt == '?' || charAt == '^' || charAt == '[' || charAt == '\\' || charAt == '{' || charAt == '|')) {
                switch (charAt) {
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                        break;
                }
            }
            sb.append('\\');
            sb.append(charAt);
        }
        if (sb.charAt(sb.length() - 1) == '.') {
            sb.append('?');
        }
        return sb;
    }

    private static ConcurrentMap<Locale, PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem> write(int i) {
        ConcurrentMap<Locale, PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem> concurrentMap;
        synchronized (setHasDecor) {
            if (setHasDecor[i] == null) {
                setHasDecor[i] = new ConcurrentHashMap(3);
            }
            concurrentMap = setHasDecor[i];
        }
        return concurrentMap;
    }

    private PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem read(int i, Calendar calendar) {
        ConcurrentMap<Locale, PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem> write2 = write(i);
        PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem prepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem = (PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem) write2.get(this.setContentView);
        if (prepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem == null) {
            if (i == 15) {
                prepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem = new RatingCompat(this.setContentView);
            } else {
                prepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem = new PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$ItemReceiver(i, calendar, this.setContentView);
            }
            PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem putIfAbsent = write2.putIfAbsent(this.setContentView, prepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return prepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem;
    }

    /* renamed from: o.PrepaidCardAdapter$PrepaidHolder$write */
    static class write extends PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem {
        private final String MediaBrowserCompat$ItemReceiver;

        /* access modifiers changed from: package-private */
        public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
            return false;
        }

        write(String str) {
            super((byte) 0);
            this.MediaBrowserCompat$ItemReceiver = str;
        }

        /* access modifiers changed from: package-private */
        public final boolean MediaBrowserCompat$ItemReceiver(PrepaidCardAdapter$PrepaidHolder prepaidCardAdapter$PrepaidHolder, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            int i2 = 0;
            while (i2 < this.MediaBrowserCompat$ItemReceiver.length()) {
                int index = parsePosition.getIndex() + i2;
                if (index == str.length()) {
                    parsePosition.setErrorIndex(index);
                    return false;
                } else if (this.MediaBrowserCompat$ItemReceiver.charAt(i2) != str.charAt(index)) {
                    parsePosition.setErrorIndex(index);
                    return false;
                } else {
                    i2++;
                }
            }
            parsePosition.setIndex(this.MediaBrowserCompat$ItemReceiver.length() + parsePosition.getIndex());
            return true;
        }
    }

    /* renamed from: o.PrepaidCardAdapter$PrepaidHolder$read */
    static class read extends PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem {
        private final int read;

        /* access modifiers changed from: package-private */
        public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
            return true;
        }

        /* access modifiers changed from: package-private */
        public int read(PrepaidCardAdapter$PrepaidHolder prepaidCardAdapter$PrepaidHolder, int i) {
            return i;
        }

        read(int i) {
            super((byte) 0);
            this.read = i;
        }

        /* access modifiers changed from: package-private */
        public final boolean MediaBrowserCompat$ItemReceiver(PrepaidCardAdapter$PrepaidHolder prepaidCardAdapter$PrepaidHolder, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            int index = parsePosition.getIndex();
            int length = str.length();
            if (i == 0) {
                while (index < length && Character.isWhitespace(str.charAt(index))) {
                    index++;
                }
                parsePosition.setIndex(index);
            } else {
                int i2 = i + index;
                if (length > i2) {
                    length = i2;
                }
            }
            while (index < length && Character.isDigit(str.charAt(index))) {
                index++;
            }
            if (parsePosition.getIndex() == index) {
                parsePosition.setErrorIndex(index);
                return false;
            }
            int parseInt = Integer.parseInt(str.substring(parsePosition.getIndex(), index));
            parsePosition.setIndex(index);
            calendar.set(this.read, read(prepaidCardAdapter$PrepaidHolder, parseInt));
            return true;
        }
    }

    /* renamed from: o.PrepaidCardAdapter$PrepaidHolder$RatingCompat */
    static class RatingCompat extends C6999xbc17dbd4 {
        private final Locale MediaBrowserCompat$CustomActionResultReceiver;
        private final Map<String, C7001xbc5e5929> write = new HashMap();

        RatingCompat(Locale locale) {
            super((byte) 0);
            this.MediaBrowserCompat$CustomActionResultReceiver = locale;
            StringBuilder sb = new StringBuilder();
            sb.append("((?iu)[+-]\\d{4}|GMT[+-]\\d{1,2}:\\d{2}");
            TreeSet<String> treeSet = new TreeSet<>(PrepaidCardAdapter$PrepaidHolder.f3159x50fd9e4a);
            for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
                String str = strArr[0];
                if (!str.equalsIgnoreCase("GMT")) {
                    TimeZone timeZone = TimeZone.getTimeZone(str);
                    C7001xbc5e5929 prepaidCardAdapter$PrepaidHolder$RatingCompat$MediaBrowserCompat$CustomActionResultReceiver = new C7001xbc5e5929(timeZone, false);
                    C7001xbc5e5929 prepaidCardAdapter$PrepaidHolder$RatingCompat$MediaBrowserCompat$CustomActionResultReceiver2 = prepaidCardAdapter$PrepaidHolder$RatingCompat$MediaBrowserCompat$CustomActionResultReceiver;
                    for (int i = 1; i < strArr.length; i++) {
                        if (i == 3) {
                            prepaidCardAdapter$PrepaidHolder$RatingCompat$MediaBrowserCompat$CustomActionResultReceiver2 = new C7001xbc5e5929(timeZone, true);
                        } else if (i == 5) {
                            prepaidCardAdapter$PrepaidHolder$RatingCompat$MediaBrowserCompat$CustomActionResultReceiver2 = prepaidCardAdapter$PrepaidHolder$RatingCompat$MediaBrowserCompat$CustomActionResultReceiver;
                        }
                        if (strArr[i] != null) {
                            String lowerCase = strArr[i].toLowerCase(locale);
                            if (treeSet.add(lowerCase)) {
                                this.write.put(lowerCase, prepaidCardAdapter$PrepaidHolder$RatingCompat$MediaBrowserCompat$CustomActionResultReceiver2);
                            }
                        }
                    }
                }
            }
            for (String MediaBrowserCompat$ItemReceiver : treeSet) {
                sb.append('|');
                StringBuilder unused = PrepaidCardAdapter$PrepaidHolder.read(sb, MediaBrowserCompat$ItemReceiver);
            }
            sb.append(")");
            MediaBrowserCompat$ItemReceiver(sb);
        }

        /* access modifiers changed from: package-private */
        public final void IconCompatParcelizer(Calendar calendar, String str) {
            TimeZone read = onTopUpClick.read(str);
            if (read != null) {
                calendar.setTimeZone(read);
                return;
            }
            String lowerCase = str.toLowerCase(this.MediaBrowserCompat$CustomActionResultReceiver);
            C7001xbc5e5929 prepaidCardAdapter$PrepaidHolder$RatingCompat$MediaBrowserCompat$CustomActionResultReceiver = this.write.get(lowerCase);
            if (prepaidCardAdapter$PrepaidHolder$RatingCompat$MediaBrowserCompat$CustomActionResultReceiver == null) {
                Map<String, C7001xbc5e5929> map = this.write;
                StringBuilder sb = new StringBuilder();
                sb.append(lowerCase);
                sb.append('.');
                prepaidCardAdapter$PrepaidHolder$RatingCompat$MediaBrowserCompat$CustomActionResultReceiver = map.get(sb.toString());
            }
            calendar.set(16, prepaidCardAdapter$PrepaidHolder$RatingCompat$MediaBrowserCompat$CustomActionResultReceiver.read);
            calendar.set(15, prepaidCardAdapter$PrepaidHolder$RatingCompat$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.getRawOffset());
        }
    }

    /* renamed from: o.PrepaidCardAdapter$PrepaidHolder$IconCompatParcelizer */
    static class IconCompatParcelizer extends C6999xbc17dbd4 {
        private static final PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer("(Z|(?:[+-]\\d{2}\\d{2}))");
        /* access modifiers changed from: private */
        public static final PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem read = new IconCompatParcelizer("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");
        private static final PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem write = new IconCompatParcelizer("(Z|(?:[+-]\\d{2}))");

        private IconCompatParcelizer(String str) {
            super((byte) 0);
            IconCompatParcelizer(str);
        }

        /* access modifiers changed from: package-private */
        public final void IconCompatParcelizer(Calendar calendar, String str) {
            calendar.setTimeZone(onTopUpClick.read(str));
        }

        static PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem read(int i) {
            if (i == 1) {
                return write;
            }
            if (i == 2) {
                return MediaBrowserCompat$ItemReceiver;
            }
            if (i == 3) {
                return read;
            }
            throw new IllegalArgumentException("invalid number of X");
        }
    }

    static /* synthetic */ PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem read(PrepaidCardAdapter$PrepaidHolder prepaidCardAdapter$PrepaidHolder, char c, int i, Calendar calendar) {
        if (c != 'y') {
            if (c != 'z') {
                switch (c) {
                    case 'D':
                        return MediaBrowserCompat$ItemReceiver;
                    case 'E':
                        return prepaidCardAdapter$PrepaidHolder.read(7, calendar);
                    case 'F':
                        return read;
                    case 'G':
                        return prepaidCardAdapter$PrepaidHolder.read(0, calendar);
                    case 'H':
                        return MediaBrowserCompat$SearchResultReceiver;
                    default:
                        switch (c) {
                            case 'K':
                                return MediaMetadataCompat;
                            case 'M':
                                return i >= 3 ? prepaidCardAdapter$PrepaidHolder.read(2, calendar) : MediaSessionCompat$Token;
                            case 'S':
                                return ParcelableVolumeInfo;
                            case 'a':
                                return prepaidCardAdapter$PrepaidHolder.read(9, calendar);
                            case 'd':
                                return MediaBrowserCompat$CustomActionResultReceiver;
                            case 'h':
                                return MediaBrowserCompat$MediaItem;
                            case 'k':
                                return MediaDescriptionCompat;
                            case 'm':
                                return MediaSessionCompat$QueueItem;
                            case 's':
                                return AlertController$RecycleListView;
                            case 'u':
                                return write;
                            case 'w':
                                return PlaybackStateCompat;
                            default:
                                switch (c) {
                                    case 'W':
                                        return PlaybackStateCompat$CustomAction;
                                    case 'X':
                                        return IconCompatParcelizer.read(i);
                                    case 'Y':
                                        break;
                                    case 'Z':
                                        if (i == 2) {
                                            return IconCompatParcelizer.read;
                                        }
                                        break;
                                    default:
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("Format '");
                                        sb.append(c);
                                        sb.append("' not supported");
                                        throw new IllegalArgumentException(sb.toString());
                                }
                        }
                }
            }
            return prepaidCardAdapter$PrepaidHolder.read(15, calendar);
        }
        return i > 2 ? MediaSessionCompat$ResultReceiverWrapper : IconCompatParcelizer;
    }

    static /* synthetic */ Map MediaBrowserCompat$ItemReceiver(Calendar calendar, Locale locale, int i, StringBuilder sb) {
        HashMap hashMap = new HashMap();
        Map<String, Integer> displayNames = calendar.getDisplayNames(i, 0, locale);
        TreeSet treeSet = new TreeSet(f3159x50fd9e4a);
        for (Map.Entry next : displayNames.entrySet()) {
            String lowerCase = ((String) next.getKey()).toLowerCase(locale);
            if (treeSet.add(lowerCase)) {
                hashMap.put(lowerCase, (Integer) next.getValue());
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            read(sb, (String) it.next()).append('|');
        }
        return hashMap;
    }

    static /* synthetic */ int MediaBrowserCompat$ItemReceiver(PrepaidCardAdapter$PrepaidHolder prepaidCardAdapter$PrepaidHolder, int i) {
        int i2 = prepaidCardAdapter$PrepaidHolder.Keep + i;
        return i >= prepaidCardAdapter$PrepaidHolder.AppCompatDelegateImpl$ListMenuDecorView ? i2 : i2 + 100;
    }
}

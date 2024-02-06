package p040o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: o.onAllowClick */
public class onAllowClick implements Map<String, SortedSet<String>>, Serializable {
    public TreeMap<String, SortedSet<String>> MediaBrowserCompat$CustomActionResultReceiver = new TreeMap<>();

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.put((String) obj, (SortedSet) obj2);
    }

    public final String write(String str, String str2, boolean z) {
        if (z) {
            str = PartnerConsentActivity_ViewBinding.write(str);
        }
        SortedSet sortedSet = this.MediaBrowserCompat$CustomActionResultReceiver.get(str);
        if (sortedSet == null) {
            sortedSet = new TreeSet();
            this.MediaBrowserCompat$CustomActionResultReceiver.put(str, sortedSet);
        }
        if (str2 != null) {
            if (z) {
                str2 = PartnerConsentActivity_ViewBinding.write(str2);
            }
            sortedSet.add(str2);
        }
        return str2;
    }

    public void putAll(Map<? extends String, ? extends SortedSet<String>> map) {
        this.MediaBrowserCompat$CustomActionResultReceiver.putAll(map);
    }

    public final void IconCompatParcelizer(Map<? extends String, ? extends SortedSet<String>> map, boolean z) {
        if (z) {
            for (String str : map.keySet()) {
                MediaBrowserCompat$CustomActionResultReceiver(str, (SortedSet) map.get(str));
            }
            return;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.putAll(map);
    }

    public final String MediaBrowserCompat$ItemReceiver(Object obj) {
        return IconCompatParcelizer(obj, true);
    }

    public final String IconCompatParcelizer(Object obj, boolean z) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            obj = PartnerConsentActivity_ViewBinding.write((String) obj);
        }
        Set set = this.MediaBrowserCompat$CustomActionResultReceiver.get(obj);
        if (set == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append("=");
            return sb2.toString();
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append("=");
            sb3.append((String) it.next());
            sb.append(sb3.toString());
            if (it.hasNext()) {
                sb.append("&");
            }
        }
        return sb.toString();
    }

    public boolean containsKey(Object obj) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        for (SortedSet<String> contains : this.MediaBrowserCompat$CustomActionResultReceiver.values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        int i = 0;
        for (String str : this.MediaBrowserCompat$CustomActionResultReceiver.keySet()) {
            i += this.MediaBrowserCompat$CustomActionResultReceiver.get(str).size();
        }
        return i;
    }

    public boolean isEmpty() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.isEmpty();
    }

    public void clear() {
        this.MediaBrowserCompat$CustomActionResultReceiver.clear();
    }

    public Set<String> keySet() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.keySet();
    }

    public Collection<SortedSet<String>> values() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.values();
    }

    public Set<Map.Entry<String, SortedSet<String>>> entrySet() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.entrySet();
    }

    public final onAllowClick read() {
        onAllowClick onallowclick = new onAllowClick();
        for (Map.Entry next : entrySet()) {
            String str = (String) next.getKey();
            if (str.startsWith("oauth_") || str.startsWith("x_oauth_")) {
                onallowclick.MediaBrowserCompat$CustomActionResultReceiver.put(str, (SortedSet) next.getValue());
            }
        }
        return onallowclick;
    }

    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.get(obj);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(String str) {
        SortedSet sortedSet = this.MediaBrowserCompat$CustomActionResultReceiver.get(str);
        String str2 = (sortedSet == null || sortedSet.isEmpty()) ? null : (String) sortedSet.first();
        if (str2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("=\"");
        sb.append(str2);
        sb.append("\"");
        return sb.toString();
    }

    private SortedSet<String> MediaBrowserCompat$CustomActionResultReceiver(String str, SortedSet<String> sortedSet) {
        this.MediaBrowserCompat$CustomActionResultReceiver.remove(str);
        for (String write : sortedSet) {
            write(str, write, true);
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver.get(str);
    }

    public /* bridge */ /* synthetic */ Object remove(Object obj) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.remove(obj);
    }
}

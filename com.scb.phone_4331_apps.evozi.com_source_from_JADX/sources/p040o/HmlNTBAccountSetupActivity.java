package p040o;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p039io.realm.OrderedRealmCollection;

/* renamed from: o.HmlNTBAccountSetupActivity */
public class HmlNTBAccountSetupActivity<E> extends AbstractList<E> implements OrderedRealmCollection<E> {
    private List<E> read = new ArrayList();

    public void add(int i, E e) {
        this.read.add(i, e);
        this.modCount++;
    }

    public boolean add(E e) {
        this.read.add(e);
        this.modCount++;
        return true;
    }

    public E set(int i, E e) {
        return this.read.set(i, e);
    }

    public void clear() {
        this.read.clear();
        this.modCount++;
    }

    public E remove(int i) {
        E remove = this.read.remove(i);
        this.modCount++;
        return remove;
    }

    public boolean remove(Object obj) {
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        return super.removeAll(collection);
    }

    public E get(int i) {
        return this.read.get(i);
    }

    public int size() {
        return this.read.size();
    }

    public boolean contains(Object obj) {
        return this.read.contains(obj);
    }

    public Iterator<E> iterator() {
        return super.iterator();
    }

    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public ListIterator<E> listIterator(int i) {
        return super.listIterator(i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RealmList<?>@[");
        int size = size();
        for (int i = 0; i < size; i++) {
            Object obj = get(i);
            if (obj instanceof HmlNTBCaptureDocumentActivity) {
                sb.append(System.identityHashCode(obj));
            } else if (obj instanceof byte[]) {
                sb.append("byte[");
                sb.append(((byte[]) obj).length);
                sb.append("]");
            } else {
                sb.append(obj);
            }
            sb.append(",");
        }
        if (size() > 0) {
            sb.setLength(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }
}

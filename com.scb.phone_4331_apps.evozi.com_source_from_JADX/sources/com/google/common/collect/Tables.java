package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Collections2;
import com.google.common.collect.Table;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class Tables {
    private Tables() {
    }

    public static <R, C, V> Table.Cell<R, C, V> immutableCell(R r, C c, V v) {
        return new ImmutableCell(r, c, v);
    }

    static class ImmutableCell<R, C, V> extends AbstractCell<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final C columnKey;
        final R rowKey;
        final V value;

        ImmutableCell(R r, C c, V v) {
            this.rowKey = r;
            this.columnKey = c;
            this.value = v;
        }

        public R getRowKey() {
            return this.rowKey;
        }

        public C getColumnKey() {
            return this.columnKey;
        }

        public V getValue() {
            return this.value;
        }
    }

    static abstract class AbstractCell<R, C, V> implements Table.Cell<R, C, V> {
        AbstractCell() {
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            if (!Objects.equal(getRowKey(), cell.getRowKey()) || !Objects.equal(getColumnKey(), cell.getColumnKey()) || !Objects.equal(getValue(), cell.getValue())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hashCode(getRowKey(), getColumnKey(), getValue());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append(getRowKey());
            sb.append(",");
            sb.append(getColumnKey());
            sb.append(")=");
            sb.append(getValue());
            return sb.toString();
        }
    }

    public static <R, C, V> Table<C, R, V> transpose(Table<R, C, V> table) {
        return table instanceof TransposeTable ? ((TransposeTable) table).original : new TransposeTable(table);
    }

    static class TransposeTable<C, R, V> implements Table<C, R, V> {
        /* access modifiers changed from: private */
        public static final Function<Table.Cell<?, ?, ?>, Table.Cell<?, ?, ?>> TRANSPOSE_CELL = new Function<Table.Cell<?, ?, ?>, Table.Cell<?, ?, ?>>() {
            public final Table.Cell<?, ?, ?> apply(Table.Cell<?, ?, ?> cell) {
                return Tables.immutableCell(cell.getColumnKey(), cell.getRowKey(), cell.getValue());
            }
        };
        TransposeTable<C, R, V>.CellSet cellSet;
        final Table<R, C, V> original;

        TransposeTable(Table<R, C, V> table) {
            this.original = (Table) Preconditions.checkNotNull(table);
        }

        public void clear() {
            this.original.clear();
        }

        public Map<C, V> column(R r) {
            return this.original.row(r);
        }

        public Set<R> columnKeySet() {
            return this.original.rowKeySet();
        }

        public Map<R, Map<C, V>> columnMap() {
            return this.original.rowMap();
        }

        public boolean contains(Object obj, Object obj2) {
            return this.original.contains(obj2, obj);
        }

        public boolean containsColumn(Object obj) {
            return this.original.containsRow(obj);
        }

        public boolean containsRow(Object obj) {
            return this.original.containsColumn(obj);
        }

        public boolean containsValue(Object obj) {
            return this.original.containsValue(obj);
        }

        public V get(Object obj, Object obj2) {
            return this.original.get(obj2, obj);
        }

        public boolean isEmpty() {
            return this.original.isEmpty();
        }

        public V put(C c, R r, V v) {
            return this.original.put(r, c, v);
        }

        public void putAll(Table<? extends C, ? extends R, ? extends V> table) {
            this.original.putAll(Tables.transpose(table));
        }

        public V remove(Object obj, Object obj2) {
            return this.original.remove(obj2, obj);
        }

        public Map<R, V> row(C c) {
            return this.original.column(c);
        }

        public Set<C> rowKeySet() {
            return this.original.columnKeySet();
        }

        public Map<C, Map<R, V>> rowMap() {
            return this.original.columnMap();
        }

        public int size() {
            return this.original.size();
        }

        public Collection<V> values() {
            return this.original.values();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Table) {
                return cellSet().equals(((Table) obj).cellSet());
            }
            return false;
        }

        public int hashCode() {
            return cellSet().hashCode();
        }

        public String toString() {
            return rowMap().toString();
        }

        public Set<Table.Cell<C, R, V>> cellSet() {
            TransposeTable<C, R, V>.CellSet cellSet2 = this.cellSet;
            if (cellSet2 != null) {
                return cellSet2;
            }
            TransposeTable<C, R, V>.CellSet cellSet3 = new CellSet();
            this.cellSet = cellSet3;
            return cellSet3;
        }

        class CellSet extends Collections2.TransformedCollection<Table.Cell<R, C, V>, Table.Cell<C, R, V>> implements Set<Table.Cell<C, R, V>> {
            CellSet() {
                super(TransposeTable.this.original.cellSet(), TransposeTable.TRANSPOSE_CELL);
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Set)) {
                    return false;
                }
                Set set = (Set) obj;
                if (set.size() != size()) {
                    return false;
                }
                return containsAll(set);
            }

            public int hashCode() {
                return Sets.hashCodeImpl(this);
            }

            public boolean contains(Object obj) {
                if (!(obj instanceof Table.Cell)) {
                    return false;
                }
                Table.Cell cell = (Table.Cell) obj;
                return TransposeTable.this.original.cellSet().contains(Tables.immutableCell(cell.getColumnKey(), cell.getRowKey(), cell.getValue()));
            }

            public boolean remove(Object obj) {
                if (!(obj instanceof Table.Cell)) {
                    return false;
                }
                Table.Cell cell = (Table.Cell) obj;
                return TransposeTable.this.original.cellSet().remove(Tables.immutableCell(cell.getColumnKey(), cell.getRowKey(), cell.getValue()));
            }
        }
    }
}

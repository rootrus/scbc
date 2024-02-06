package com.kofax.kmc.kui.uicontrols.data;

public enum SearchDirection {
    HORIZONTAL(3),
    VERTICAL(12),
    ALL(15);
    
    private int value;

    private SearchDirection(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}

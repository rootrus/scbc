package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.actions.SearchIntents;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p040o.ActivityChooserView;
import p040o.AlertController$RecycleListView;
import p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem;
import p040o.SwitchCompat;
import p040o.setDefaultActionButtonContentDescription;
import p040o.setMenuCallbacks;
import p040o.setNavigationIcon;
import p040o.setPadding;

public class SearchView extends LinearLayoutCompat implements setPadding {
    static final IconCompatParcelizer read = new IconCompatParcelizer();
    private final View AbsActionBarView;
    private final Runnable ActionBarContainer;
    private final View.OnClickListener ActionMenuItemView;
    final Intent AlertController$RecycleListView;
    private final CharSequence AppCompatActivity;
    private int AppCompatDelegateImpl$ListMenuDecorView;
    private boolean AppCompatDialogFragment;
    private final AdapterView.OnItemClickListener AppCompatViewInflater;
    private Rect ExpandedMenuView;
    final ImageView IconCompatParcelizer;
    private final ImageView Keep;
    private boolean ListMenuItemView;
    final View MediaBrowserCompat$CustomActionResultReceiver;
    Bundle MediaBrowserCompat$ItemReceiver;
    boolean MediaBrowserCompat$MediaItem;
    View.OnFocusChangeListener MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    setNavigationIcon f3009x50fd9e4a;
    final View MediaDescriptionCompat;
    final ImageView MediaMetadataCompat;
    final SearchAutoComplete MediaSessionCompat$QueueItem;
    SearchableInfo MediaSessionCompat$ResultReceiverWrapper;
    public final int MediaSessionCompat$Token;
    private int[] MenuItemImpl;
    private int[] MenuItemWrapperICS$CollapsibleActionViewWrapper;
    public final int ParcelableVolumeInfo;
    final ImageView PlaybackStateCompat;
    final Intent PlaybackStateCompat$CustomAction;
    read RatingCompat;
    private int setBackgroundResource;
    private CharSequence setCheckable;
    private SearchView$MediaBrowserCompat$CustomActionResultReceiver setChecked;
    private Rect setContentHeight;
    private boolean setContentView;
    private final TextView.OnEditorActionListener setExpandedFormat;
    private final Drawable setForceShowIcon;
    private final View setGroupDividerEnabled;
    private boolean setHasDecor;
    private write setIcon;
    private final AdapterView.OnItemSelectedListener setItemInvoker;
    private CharSequence setPadding;
    private final WeakHashMap<String, Drawable.ConstantState> setPopupCallback;
    private MediaMetadataCompat setPrimaryBackground;
    private View.OnClickListener setShortcut;
    private CharSequence setSplitBackground;
    private View.OnKeyListener setStackedBackground;
    private boolean setSubtitle;
    private TextWatcher setTabContainer;
    private Runnable setTitle;
    private boolean setVisibility;
    final ImageView write;

    public interface read {
        boolean read();

        boolean write();
    }

    public interface write {
        boolean IconCompatParcelizer();
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AlertController$RecycleListView.read.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ExpandedMenuView = new Rect();
        this.setContentHeight = new Rect();
        this.MenuItemImpl = new int[2];
        this.MenuItemWrapperICS$CollapsibleActionViewWrapper = new int[2];
        this.ActionBarContainer = new Runnable() {
            public final void run() {
                SearchView.this.MediaSessionCompat$QueueItem();
            }
        };
        this.setTitle = new Runnable() {
            public final void run() {
                if (SearchView.this.f3009x50fd9e4a != null && (SearchView.this.f3009x50fd9e4a instanceof setMenuCallbacks)) {
                    SearchView.this.f3009x50fd9e4a.IconCompatParcelizer((Cursor) null);
                }
            }
        };
        this.setPopupCallback = new WeakHashMap<>();
        this.ActionMenuItemView = new View.OnClickListener() {
            public final void onClick(View view) {
                if (view == SearchView.this.MediaMetadataCompat) {
                    SearchView.this.MediaMetadataCompat();
                } else if (view == SearchView.this.IconCompatParcelizer) {
                    SearchView.this.read();
                } else if (view == SearchView.this.write) {
                    SearchView.this.MediaBrowserCompat$SearchResultReceiver();
                } else if (view == SearchView.this.PlaybackStateCompat) {
                    SearchView searchView = SearchView.this;
                    SearchableInfo searchableInfo = searchView.MediaSessionCompat$ResultReceiverWrapper;
                    if (searchableInfo != null) {
                        try {
                            String str = null;
                            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                                Intent intent = new Intent(searchView.AlertController$RecycleListView);
                                ComponentName searchActivity = searchableInfo.getSearchActivity();
                                if (searchActivity != null) {
                                    str = searchActivity.flattenToShortString();
                                }
                                intent.putExtra("calling_package", str);
                                searchView.getContext().startActivity(intent);
                            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                                Intent intent2 = searchView.PlaybackStateCompat$CustomAction;
                                ComponentName searchActivity2 = searchableInfo.getSearchActivity();
                                Intent intent3 = new Intent("android.intent.action.SEARCH");
                                intent3.setComponent(searchActivity2);
                                PendingIntent activity = PendingIntent.getActivity(searchView.getContext(), 0, intent3, 1073741824);
                                Bundle bundle = new Bundle();
                                Bundle bundle2 = searchView.MediaBrowserCompat$ItemReceiver;
                                if (bundle2 != null) {
                                    bundle.putParcelable("app_data", bundle2);
                                }
                                Intent intent4 = new Intent(intent2);
                                int i = 1;
                                Resources resources = searchView.getResources();
                                String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
                                String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
                                String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
                                if (searchableInfo.getVoiceMaxResults() != 0) {
                                    i = searchableInfo.getVoiceMaxResults();
                                }
                                intent4.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
                                intent4.putExtra("android.speech.extra.PROMPT", string2);
                                intent4.putExtra("android.speech.extra.LANGUAGE", string3);
                                intent4.putExtra("android.speech.extra.MAX_RESULTS", i);
                                if (searchActivity2 != null) {
                                    str = searchActivity2.flattenToShortString();
                                }
                                intent4.putExtra("calling_package", str);
                                intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
                                intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
                                searchView.getContext().startActivity(intent4);
                            }
                        } catch (ActivityNotFoundException unused) {
                            Log.w("SearchView", "Could not find voice search activity");
                        }
                    }
                } else if (view == SearchView.this.MediaSessionCompat$QueueItem) {
                    SearchView.this.MediaBrowserCompat$ItemReceiver();
                }
            }
        };
        this.setStackedBackground = new View.OnKeyListener() {
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (SearchView.this.MediaSessionCompat$ResultReceiverWrapper == null) {
                    return false;
                }
                if (SearchView.this.MediaSessionCompat$QueueItem.isPopupShowing() && SearchView.this.MediaSessionCompat$QueueItem.getListSelection() != -1) {
                    return SearchView.this.IconCompatParcelizer(i, keyEvent);
                }
                if ((TextUtils.getTrimmedLength(SearchView.this.MediaSessionCompat$QueueItem.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView = SearchView.this;
                searchView.getContext().startActivity(searchView.MediaBrowserCompat$CustomActionResultReceiver("android.intent.action.SEARCH", (Uri) null, (String) null, searchView.MediaSessionCompat$QueueItem.getText().toString(), 0, (String) null));
                return true;
            }
        };
        this.setExpandedFormat = new TextView.OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                SearchView.this.MediaBrowserCompat$SearchResultReceiver();
                return true;
            }
        };
        this.AppCompatViewInflater = new AdapterView.OnItemClickListener() {
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView.this.write(i);
            }
        };
        this.setItemInvoker = new AdapterView.OnItemSelectedListener() {
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView searchView = SearchView.this;
                read read = searchView.RatingCompat;
                if (read == null || !read.write()) {
                    Editable text = searchView.MediaSessionCompat$QueueItem.getText();
                    Cursor read2 = searchView.f3009x50fd9e4a.read();
                    if (read2 == null) {
                        return;
                    }
                    if (read2.moveToPosition(i)) {
                        CharSequence MediaBrowserCompat$ItemReceiver = searchView.f3009x50fd9e4a.MediaBrowserCompat$ItemReceiver(read2);
                        if (MediaBrowserCompat$ItemReceiver != null) {
                            searchView.read(MediaBrowserCompat$ItemReceiver);
                        } else {
                            searchView.read((CharSequence) text);
                        }
                    } else {
                        searchView.read((CharSequence) text);
                    }
                }
            }
        };
        this.setTabContainer = new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                SearchView.this.IconCompatParcelizer(charSequence);
            }
        };
        AlertController$RecycleListView.MediaDescriptionCompat mediaDescriptionCompat = new AlertController$RecycleListView.MediaDescriptionCompat(context, context.obtainStyledAttributes(attributeSet, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SearchView, i, 0));
        LayoutInflater.from(context).inflate(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SearchView_layout, AlertController$RecycleListView.MediaMetadataCompat.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(AlertController$RecycleListView.MediaDescriptionCompat.search_src_text);
        this.MediaSessionCompat$QueueItem = searchAutoComplete;
        searchAutoComplete.write = this;
        this.setGroupDividerEnabled = findViewById(AlertController$RecycleListView.MediaDescriptionCompat.search_edit_frame);
        this.MediaDescriptionCompat = findViewById(AlertController$RecycleListView.MediaDescriptionCompat.search_plate);
        this.AbsActionBarView = findViewById(AlertController$RecycleListView.MediaDescriptionCompat.submit_area);
        this.MediaMetadataCompat = (ImageView) findViewById(AlertController$RecycleListView.MediaDescriptionCompat.search_button);
        this.write = (ImageView) findViewById(AlertController$RecycleListView.MediaDescriptionCompat.search_go_btn);
        this.IconCompatParcelizer = (ImageView) findViewById(AlertController$RecycleListView.MediaDescriptionCompat.search_close_btn);
        this.PlaybackStateCompat = (ImageView) findViewById(AlertController$RecycleListView.MediaDescriptionCompat.search_voice_btn);
        this.Keep = (ImageView) findViewById(AlertController$RecycleListView.MediaDescriptionCompat.search_mag_icon);
        SwitchCompat.IconCompatParcelizer(this.MediaDescriptionCompat, mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SearchView_queryBackground));
        SwitchCompat.IconCompatParcelizer(this.AbsActionBarView, mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SearchView_submitBackground));
        this.MediaMetadataCompat.setImageDrawable(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SearchView_searchIcon));
        this.write.setImageDrawable(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SearchView_goIcon));
        this.IconCompatParcelizer.setImageDrawable(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SearchView_closeIcon));
        this.PlaybackStateCompat.setImageDrawable(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SearchView_voiceIcon));
        this.Keep.setImageDrawable(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SearchView_searchIcon));
        this.setForceShowIcon = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SearchView_searchHintIcon);
        ActivityChooserView.MediaBrowserCompat$ItemReceiver(this.MediaMetadataCompat, getResources().getString(AlertController$RecycleListView.RatingCompat.abc_searchview_description_search));
        this.MediaSessionCompat$Token = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SearchView_suggestionRowLayout, AlertController$RecycleListView.MediaMetadataCompat.abc_search_dropdown_item_icons_2line);
        this.ParcelableVolumeInfo = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SearchView_commitIcon, 0);
        this.MediaMetadataCompat.setOnClickListener(this.ActionMenuItemView);
        this.IconCompatParcelizer.setOnClickListener(this.ActionMenuItemView);
        this.write.setOnClickListener(this.ActionMenuItemView);
        this.PlaybackStateCompat.setOnClickListener(this.ActionMenuItemView);
        this.MediaSessionCompat$QueueItem.setOnClickListener(this.ActionMenuItemView);
        this.MediaSessionCompat$QueueItem.addTextChangedListener(this.setTabContainer);
        this.MediaSessionCompat$QueueItem.setOnEditorActionListener(this.setExpandedFormat);
        this.MediaSessionCompat$QueueItem.setOnItemClickListener(this.AppCompatViewInflater);
        this.MediaSessionCompat$QueueItem.setOnItemSelectedListener(this.setItemInvoker);
        this.MediaSessionCompat$QueueItem.setOnKeyListener(this.setStackedBackground);
        this.MediaSessionCompat$QueueItem.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                if (SearchView.this.MediaBrowserCompat$SearchResultReceiver != null) {
                    SearchView.this.MediaBrowserCompat$SearchResultReceiver.onFocusChange(SearchView.this, z);
                }
            }
        });
        setIconifiedByDefault(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SearchView_iconifiedByDefault, true));
        int dimensionPixelSize = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDimensionPixelSize(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SearchView_android_maxWidth, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.AppCompatActivity = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getText(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SearchView_defaultQueryHint);
        this.setPadding = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getText(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SearchView_queryHint);
        int i2 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SearchView_android_imeOptions, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SearchView_android_inputType, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.SearchView_android_focusable, true));
        mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.AlertController$RecycleListView = intent;
        intent.addFlags(268435456);
        this.AlertController$RecycleListView.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.PlaybackStateCompat$CustomAction = intent2;
        intent2.addFlags(268435456);
        View findViewById = findViewById(this.MediaSessionCompat$QueueItem.getDropDownAnchor());
        this.MediaBrowserCompat$CustomActionResultReceiver = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    int i9;
                    SearchView searchView = SearchView.this;
                    if (searchView.MediaBrowserCompat$CustomActionResultReceiver.getWidth() > 1) {
                        Resources resources = searchView.getContext().getResources();
                        int paddingLeft = searchView.MediaDescriptionCompat.getPaddingLeft();
                        Rect rect = new Rect();
                        boolean MediaBrowserCompat$ItemReceiver = setDefaultActionButtonContentDescription.MediaBrowserCompat$ItemReceiver(searchView);
                        int dimensionPixelSize = searchView.MediaBrowserCompat$MediaItem ? resources.getDimensionPixelSize(AlertController$RecycleListView.IconCompatParcelizer.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(AlertController$RecycleListView.IconCompatParcelizer.abc_dropdownitem_text_padding_left) : 0;
                        searchView.MediaSessionCompat$QueueItem.getDropDownBackground().getPadding(rect);
                        if (MediaBrowserCompat$ItemReceiver) {
                            i9 = -rect.left;
                        } else {
                            i9 = paddingLeft - (rect.left + dimensionPixelSize);
                        }
                        searchView.MediaSessionCompat$QueueItem.setDropDownHorizontalOffset(i9);
                        searchView.MediaSessionCompat$QueueItem.setDropDownWidth((((searchView.MediaBrowserCompat$CustomActionResultReceiver.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    }
                }
            });
        }
        MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem);
        String MediaSessionCompat$ResultReceiverWrapper2 = MediaSessionCompat$ResultReceiverWrapper();
        this.MediaSessionCompat$QueueItem.setHint(MediaBrowserCompat$ItemReceiver(MediaSessionCompat$ResultReceiverWrapper2 == null ? "" : MediaSessionCompat$ResultReceiverWrapper2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00aa, code lost:
        if (getContext().getPackageManager().resolveActivity(r1, 65536) != null) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.MediaSessionCompat$ResultReceiverWrapper = r7
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L_0x007c
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.MediaSessionCompat$QueueItem
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.MediaSessionCompat$QueueItem
            android.app.SearchableInfo r3 = r6.MediaSessionCompat$ResultReceiverWrapper
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.MediaSessionCompat$ResultReceiverWrapper
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r2) goto L_0x0036
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.MediaSessionCompat$ResultReceiverWrapper
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L_0x0036
            r7 = r7 | r0
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L_0x0036:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.MediaSessionCompat$QueueItem
            r3.setInputType(r7)
            o.setNavigationIcon r7 = r6.f3009x50fd9e4a
            if (r7 == 0) goto L_0x0042
            r7.IconCompatParcelizer(r1)
        L_0x0042:
            android.app.SearchableInfo r7 = r6.MediaSessionCompat$ResultReceiverWrapper
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L_0x006b
            o.setMenuCallbacks r7 = new o.setMenuCallbacks
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.MediaSessionCompat$ResultReceiverWrapper
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.setPopupCallback
            r7.<init>(r3, r6, r4, r5)
            r6.f3009x50fd9e4a = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.MediaSessionCompat$QueueItem
            r3.setAdapter(r7)
            o.setNavigationIcon r7 = r6.f3009x50fd9e4a
            o.setMenuCallbacks r7 = (p040o.setMenuCallbacks) r7
            boolean r3 = r6.ListMenuItemView
            if (r3 == 0) goto L_0x0068
            r3 = 2
            goto L_0x0069
        L_0x0068:
            r3 = r2
        L_0x0069:
            r7.write = r3
        L_0x006b:
            java.lang.CharSequence r7 = r6.MediaSessionCompat$ResultReceiverWrapper()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.MediaSessionCompat$QueueItem
            if (r7 != 0) goto L_0x0075
            java.lang.String r7 = ""
        L_0x0075:
            java.lang.CharSequence r7 = r6.MediaBrowserCompat$ItemReceiver((java.lang.CharSequence) r7)
            r3.setHint(r7)
        L_0x007c:
            android.app.SearchableInfo r7 = r6.MediaSessionCompat$ResultReceiverWrapper
            r3 = 0
            if (r7 == 0) goto L_0x00ad
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L_0x00ad
            android.app.SearchableInfo r7 = r6.MediaSessionCompat$ResultReceiverWrapper
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L_0x0092
            android.content.Intent r1 = r6.AlertController$RecycleListView
            goto L_0x009c
        L_0x0092:
            android.app.SearchableInfo r7 = r6.MediaSessionCompat$ResultReceiverWrapper
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L_0x009c
            android.content.Intent r1 = r6.PlaybackStateCompat$CustomAction
        L_0x009c:
            if (r1 == 0) goto L_0x00ad
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r1, r0)
            if (r7 == 0) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r2 = r3
        L_0x00ae:
            r6.setSubtitle = r2
            if (r2 == 0) goto L_0x00b9
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.MediaSessionCompat$QueueItem
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        L_0x00b9:
            boolean r7 = r6.setContentView
            r6.MediaBrowserCompat$CustomActionResultReceiver(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setAppSearchData(Bundle bundle) {
        this.MediaBrowserCompat$ItemReceiver = bundle;
    }

    public void setImeOptions(int i) {
        this.MediaSessionCompat$QueueItem.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.MediaSessionCompat$QueueItem.setInputType(i);
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.setHasDecor || !isFocusable()) {
            return false;
        }
        if (this.setContentView) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.MediaSessionCompat$QueueItem.requestFocus(i, rect);
        if (requestFocus) {
            MediaBrowserCompat$CustomActionResultReceiver(false);
        }
        return requestFocus;
    }

    public void clearFocus() {
        this.setHasDecor = true;
        super.clearFocus();
        this.MediaSessionCompat$QueueItem.clearFocus();
        this.MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver(false);
        this.setHasDecor = false;
    }

    public void setOnQueryTextListener(write write2) {
        this.setIcon = write2;
    }

    public void setOnCloseListener(SearchView$MediaBrowserCompat$CustomActionResultReceiver searchView$MediaBrowserCompat$CustomActionResultReceiver) {
        this.setChecked = searchView$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.MediaBrowserCompat$SearchResultReceiver = onFocusChangeListener;
    }

    public void setOnSuggestionListener(read read2) {
        this.RatingCompat = read2;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.setShortcut = onClickListener;
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        this.MediaSessionCompat$QueueItem.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.MediaSessionCompat$QueueItem;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.setSplitBackground = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            MediaBrowserCompat$SearchResultReceiver();
        }
    }

    public void setQueryHint(CharSequence charSequence) {
        this.setPadding = charSequence;
        CharSequence MediaSessionCompat$ResultReceiverWrapper2 = MediaSessionCompat$ResultReceiverWrapper();
        SearchAutoComplete searchAutoComplete = this.MediaSessionCompat$QueueItem;
        if (MediaSessionCompat$ResultReceiverWrapper2 == null) {
            MediaSessionCompat$ResultReceiverWrapper2 = "";
        }
        searchAutoComplete.setHint(MediaBrowserCompat$ItemReceiver(MediaSessionCompat$ResultReceiverWrapper2));
    }

    private CharSequence MediaSessionCompat$ResultReceiverWrapper() {
        CharSequence charSequence = this.setPadding;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.MediaSessionCompat$ResultReceiverWrapper;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.AppCompatActivity;
        }
        return getContext().getText(this.MediaSessionCompat$ResultReceiverWrapper.getHintId());
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.MediaBrowserCompat$MediaItem != z) {
            this.MediaBrowserCompat$MediaItem = z;
            MediaBrowserCompat$CustomActionResultReceiver(z);
            CharSequence MediaSessionCompat$ResultReceiverWrapper2 = MediaSessionCompat$ResultReceiverWrapper();
            SearchAutoComplete searchAutoComplete = this.MediaSessionCompat$QueueItem;
            if (MediaSessionCompat$ResultReceiverWrapper2 == null) {
                MediaSessionCompat$ResultReceiverWrapper2 = "";
            }
            searchAutoComplete.setHint(MediaBrowserCompat$ItemReceiver(MediaSessionCompat$ResultReceiverWrapper2));
        }
    }

    public void setIconified(boolean z) {
        if (z) {
            read();
        } else {
            MediaMetadataCompat();
        }
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.setVisibility = z;
        MediaBrowserCompat$CustomActionResultReceiver(this.setContentView);
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.ListMenuItemView = z;
        setNavigationIcon setnavigationicon = this.f3009x50fd9e4a;
        if (setnavigationicon instanceof setMenuCallbacks) {
            ((setMenuCallbacks) setnavigationicon).write = z ? 2 : 1;
        }
    }

    public void setSuggestionsAdapter(setNavigationIcon setnavigationicon) {
        this.f3009x50fd9e4a = setnavigationicon;
        this.MediaSessionCompat$QueueItem.setAdapter(setnavigationicon);
    }

    public void setMaxWidth(int i) {
        this.setBackgroundResource = i;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.MediaSessionCompat$QueueItem;
            Rect rect = this.ExpandedMenuView;
            searchAutoComplete.getLocationInWindow(this.MenuItemImpl);
            getLocationInWindow(this.MenuItemWrapperICS$CollapsibleActionViewWrapper);
            int[] iArr = this.MenuItemImpl;
            int i5 = iArr[1];
            int[] iArr2 = this.MenuItemWrapperICS$CollapsibleActionViewWrapper;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            this.setContentHeight.set(this.ExpandedMenuView.left, 0, this.ExpandedMenuView.right, i4 - i2);
            MediaMetadataCompat mediaMetadataCompat = this.setPrimaryBackground;
            if (mediaMetadataCompat == null) {
                MediaMetadataCompat mediaMetadataCompat2 = new MediaMetadataCompat(this.setContentHeight, this.ExpandedMenuView, this.MediaSessionCompat$QueueItem);
                this.setPrimaryBackground = mediaMetadataCompat2;
                setTouchDelegate(mediaMetadataCompat2);
                return;
            }
            mediaMetadataCompat.write(this.setContentHeight, this.ExpandedMenuView);
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.setContentView = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.MediaSessionCompat$QueueItem.getText());
        this.MediaMetadataCompat.setVisibility(i2);
        write(z2);
        this.setGroupDividerEnabled.setVisibility(z ? 8 : 0);
        if (this.Keep.getDrawable() == null || this.MediaBrowserCompat$MediaItem) {
            i = 8;
        }
        this.Keep.setVisibility(i);
        m3158x50fd9e4a();
        MediaBrowserCompat$ItemReceiver(!z2);
        ParcelableVolumeInfo();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r2.setSubtitle == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void write(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.setVisibility
            r1 = 0
            if (r0 == 0) goto L_0x0021
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.setSubtitle
            if (r0 == 0) goto L_0x0011
        L_0x000b:
            boolean r0 = r2.setContentView
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.setSubtitle
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            android.widget.ImageView r3 = r2.write
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.write(boolean):void");
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private void m3158x50fd9e4a() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.MediaSessionCompat$QueueItem.getText());
        int i = 0;
        if (!z2 && (!this.MediaBrowserCompat$MediaItem || this.AppCompatDialogFragment)) {
            z = false;
        }
        ImageView imageView = this.IconCompatParcelizer;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.IconCompatParcelizer.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaSessionCompat$QueueItem() {
        int[] iArr = this.MediaSessionCompat$QueueItem.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        Drawable background = this.MediaDescriptionCompat.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.AbsActionBarView.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.ActionBarContainer);
        post(this.setTitle);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer(int i, KeyEvent keyEvent) {
        int i2;
        if (this.MediaSessionCompat$ResultReceiverWrapper != null && this.f3009x50fd9e4a != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return write(this.MediaSessionCompat$QueueItem.getListSelection());
            }
            if (i == 21 || i == 22) {
                if (i == 21) {
                    i2 = 0;
                } else {
                    i2 = this.MediaSessionCompat$QueueItem.length();
                }
                this.MediaSessionCompat$QueueItem.setSelection(i2);
                this.MediaSessionCompat$QueueItem.setListSelection(0);
                this.MediaSessionCompat$QueueItem.clearListSelection();
                IconCompatParcelizer iconCompatParcelizer = read;
                SearchAutoComplete searchAutoComplete = this.MediaSessionCompat$QueueItem;
                Method method = iconCompatParcelizer.read;
                if (method != null) {
                    try {
                        method.invoke(searchAutoComplete, new Object[]{Boolean.TRUE});
                    } catch (Exception unused) {
                    }
                }
                return true;
            } else if (i != 19 || this.MediaSessionCompat$QueueItem.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    private CharSequence MediaBrowserCompat$ItemReceiver(CharSequence charSequence) {
        if (!this.MediaBrowserCompat$MediaItem || this.setForceShowIcon == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.MediaSessionCompat$QueueItem.getTextSize()) * 1.25d);
        this.setForceShowIcon.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.setForceShowIcon), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private void MediaBrowserCompat$ItemReceiver(boolean z) {
        int i = 8;
        if (this.setSubtitle && !this.setContentView && z) {
            this.write.setVisibility(8);
            i = 0;
        }
        this.PlaybackStateCompat.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(CharSequence charSequence) {
        Editable text = this.MediaSessionCompat$QueueItem.getText();
        this.setSplitBackground = text;
        boolean z = !TextUtils.isEmpty(text);
        write(z);
        MediaBrowserCompat$ItemReceiver(!z);
        m3158x50fd9e4a();
        ParcelableVolumeInfo();
        if (this.setIcon != null) {
            TextUtils.equals(charSequence, this.setCheckable);
        }
        this.setCheckable = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$SearchResultReceiver() {
        Editable text = this.MediaSessionCompat$QueueItem.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            write write2 = this.setIcon;
            if (write2 == null || !write2.IconCompatParcelizer()) {
                if (this.MediaSessionCompat$ResultReceiverWrapper != null) {
                    getContext().startActivity(MediaBrowserCompat$CustomActionResultReceiver("android.intent.action.SEARCH", (Uri) null, (String) null, text.toString(), 0, (String) null));
                }
                this.MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver(false);
                this.MediaSessionCompat$QueueItem.dismissDropDown();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void read() {
        if (!TextUtils.isEmpty(this.MediaSessionCompat$QueueItem.getText())) {
            this.MediaSessionCompat$QueueItem.setText("");
            this.MediaSessionCompat$QueueItem.requestFocus();
            this.MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver(true);
        } else if (this.MediaBrowserCompat$MediaItem) {
            SearchView$MediaBrowserCompat$CustomActionResultReceiver searchView$MediaBrowserCompat$CustomActionResultReceiver = this.setChecked;
            if (searchView$MediaBrowserCompat$CustomActionResultReceiver == null || !searchView$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer()) {
                clearFocus();
                MediaBrowserCompat$CustomActionResultReceiver(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaMetadataCompat() {
        MediaBrowserCompat$CustomActionResultReceiver(false);
        this.MediaSessionCompat$QueueItem.requestFocus();
        this.MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver(true);
        View.OnClickListener onClickListener = this.setShortcut;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.ActionBarContainer);
    }

    public final void IconCompatParcelizer() {
        setQuery("", false);
        clearFocus();
        MediaBrowserCompat$CustomActionResultReceiver(true);
        this.MediaSessionCompat$QueueItem.setImeOptions(this.AppCompatDelegateImpl$ListMenuDecorView);
        this.AppCompatDialogFragment = false;
    }

    public final void write() {
        if (!this.AppCompatDialogFragment) {
            this.AppCompatDialogFragment = true;
            int imeOptions = this.MediaSessionCompat$QueueItem.getImeOptions();
            this.AppCompatDelegateImpl$ListMenuDecorView = imeOptions;
            this.MediaSessionCompat$QueueItem.setImeOptions(imeOptions | 33554432);
            this.MediaSessionCompat$QueueItem.setText("");
            setIconified(false);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SearchView$MediaBrowserCompat$ItemReceiver searchView$MediaBrowserCompat$ItemReceiver = new SearchView$MediaBrowserCompat$ItemReceiver(super.onSaveInstanceState());
        searchView$MediaBrowserCompat$ItemReceiver.read = this.setContentView;
        return searchView$MediaBrowserCompat$ItemReceiver;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SearchView$MediaBrowserCompat$ItemReceiver)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SearchView$MediaBrowserCompat$ItemReceiver searchView$MediaBrowserCompat$ItemReceiver = (SearchView$MediaBrowserCompat$ItemReceiver) parcelable;
        super.onRestoreInstanceState(searchView$MediaBrowserCompat$ItemReceiver.write);
        MediaBrowserCompat$CustomActionResultReceiver(searchView$MediaBrowserCompat$ItemReceiver.read);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public final boolean write(int i) {
        read read2 = this.RatingCompat;
        if (read2 != null && read2.read()) {
            return false;
        }
        IconCompatParcelizer(i);
        this.MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver(false);
        this.MediaSessionCompat$QueueItem.dismissDropDown();
        return true;
    }

    private boolean IconCompatParcelizer(int i) {
        Cursor read2 = this.f3009x50fd9e4a.read();
        if (read2 == null || !read2.moveToPosition(i)) {
            return false;
        }
        Intent write2 = write(read2, 0, (String) null);
        if (write2 == null) {
            return true;
        }
        try {
            getContext().startActivity(write2);
            return true;
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed launch activity: ");
            sb.append(write2);
            Log.e("SearchView", sb.toString(), e);
            return true;
        }
    }

    public final void read(CharSequence charSequence) {
        this.MediaSessionCompat$QueueItem.setText(charSequence);
        this.MediaSessionCompat$QueueItem.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* access modifiers changed from: package-private */
    public final Intent MediaBrowserCompat$CustomActionResultReceiver(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.setSplitBackground);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.MediaBrowserCompat$ItemReceiver;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.MediaSessionCompat$ResultReceiverWrapper.getSearchActivity());
        return intent;
    }

    private Intent write(Cursor cursor, int i, String str) {
        int i2;
        Uri uri;
        String read2;
        try {
            String read3 = setMenuCallbacks.read(cursor, "suggest_intent_action");
            if (read3 == null) {
                read3 = this.MediaSessionCompat$ResultReceiverWrapper.getSuggestIntentAction();
            }
            if (read3 == null) {
                read3 = "android.intent.action.SEARCH";
            }
            String str2 = read3;
            String read4 = setMenuCallbacks.read(cursor, "suggest_intent_data");
            if (read4 == null) {
                read4 = this.MediaSessionCompat$ResultReceiverWrapper.getSuggestIntentData();
            }
            if (!(read4 == null || (read2 = setMenuCallbacks.read(cursor, "suggest_intent_data_id")) == null)) {
                StringBuilder sb = new StringBuilder();
                sb.append(read4);
                sb.append("/");
                sb.append(Uri.encode(read2));
                read4 = sb.toString();
            }
            if (read4 == null) {
                uri = null;
            } else {
                uri = Uri.parse(read4);
            }
            return MediaBrowserCompat$CustomActionResultReceiver(str2, uri, setMenuCallbacks.read(cursor, "suggest_intent_extra_data"), setMenuCallbacks.read(cursor, "suggest_intent_query"), 0, (String) null);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Search suggestions cursor at row ");
            sb2.append(i2);
            sb2.append(" returned exception.");
            Log.w("SearchView", sb2.toString(), e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver() {
        IconCompatParcelizer iconCompatParcelizer = read;
        SearchAutoComplete searchAutoComplete = this.MediaSessionCompat$QueueItem;
        Method method = iconCompatParcelizer.IconCompatParcelizer;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        IconCompatParcelizer iconCompatParcelizer2 = read;
        SearchAutoComplete searchAutoComplete2 = this.MediaSessionCompat$QueueItem;
        Method method2 = iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    static boolean read(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    static class MediaMetadataCompat extends TouchDelegate {
        private final View IconCompatParcelizer;
        private final int MediaBrowserCompat$CustomActionResultReceiver;
        private boolean MediaBrowserCompat$ItemReceiver;
        private final Rect MediaMetadataCompat = new Rect();
        private final Rect read = new Rect();
        private final Rect write = new Rect();

        public MediaMetadataCompat(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.MediaBrowserCompat$CustomActionResultReceiver = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            write(rect, rect2);
            this.IconCompatParcelizer = view;
        }

        public final void write(Rect rect, Rect rect2) {
            this.MediaMetadataCompat.set(rect);
            this.read.set(rect);
            Rect rect3 = this.read;
            int i = -this.MediaBrowserCompat$CustomActionResultReceiver;
            rect3.inset(i, i);
            this.write.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouchEvent(android.view.MotionEvent r9) {
            /*
                r8 = this;
                float r0 = r9.getX()
                int r0 = (int) r0
                float r1 = r9.getY()
                int r1 = (int) r1
                int r2 = r9.getAction()
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L_0x0032
                if (r2 == r5) goto L_0x001f
                if (r2 == r3) goto L_0x001f
                r6 = 3
                if (r2 != r6) goto L_0x003e
                boolean r2 = r8.MediaBrowserCompat$ItemReceiver
                r8.MediaBrowserCompat$ItemReceiver = r4
                goto L_0x002e
            L_0x001f:
                boolean r2 = r8.MediaBrowserCompat$ItemReceiver
                if (r2 == 0) goto L_0x002e
                android.graphics.Rect r6 = r8.read
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002e
                r5 = r2
                r2 = r4
                goto L_0x0040
            L_0x002e:
                r7 = r5
                r5 = r2
                r2 = r7
                goto L_0x0040
            L_0x0032:
                android.graphics.Rect r2 = r8.MediaMetadataCompat
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003e
                r8.MediaBrowserCompat$ItemReceiver = r5
                r2 = r5
                goto L_0x0040
            L_0x003e:
                r2 = r5
                r5 = r4
            L_0x0040:
                if (r5 == 0) goto L_0x0075
                if (r2 == 0) goto L_0x0060
                android.graphics.Rect r2 = r8.write
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x0060
                android.view.View r0 = r8.IconCompatParcelizer
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r8.IconCompatParcelizer
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r9.setLocation(r0, r1)
                goto L_0x006f
            L_0x0060:
                android.graphics.Rect r2 = r8.write
                int r2 = r2.left
                int r0 = r0 - r2
                float r0 = (float) r0
                android.graphics.Rect r2 = r8.write
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r9.setLocation(r0, r1)
            L_0x006f:
                android.view.View r0 = r8.IconCompatParcelizer
                boolean r4 = r0.dispatchTouchEvent(r9)
            L_0x0075:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.MediaMetadataCompat.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {
        boolean IconCompatParcelizer;
        final Runnable MediaBrowserCompat$ItemReceiver;
        private int read;
        SearchView write;

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        public SearchAutoComplete(Context context) {
            this(context, (AttributeSet) null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, AlertController$RecycleListView.read.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.MediaBrowserCompat$ItemReceiver = new Runnable() {
                public final void run() {
                    SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                    if (searchAutoComplete.IconCompatParcelizer) {
                        ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                        searchAutoComplete.IconCompatParcelizer = false;
                    }
                }
            };
            this.read = getThreshold();
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            setMinWidth((int) TypedValue.applyDimension(1, (float) ((i < 960 || i2 < 720 || configuration.orientation != 2) ? (i >= 600 || (i >= 640 && i2 >= 480)) ? 192 : 160 : 256), displayMetrics));
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.read = i;
        }

        public void onWindowFocusChanged(boolean z) {
            Method method;
            super.onWindowFocusChanged(z);
            if (z && this.write.hasFocus() && getVisibility() == 0) {
                this.IconCompatParcelizer = true;
                if (SearchView.read(getContext()) && (method = SearchView.read.read) != null) {
                    try {
                        method.invoke(this, new Object[]{Boolean.TRUE});
                    } catch (Exception unused) {
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.write.MediaSessionCompat$Token();
        }

        public boolean enoughToFilter() {
            return this.read <= 0 || super.enoughToFilter();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.write.clearFocus();
                        MediaBrowserCompat$ItemReceiver(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.IconCompatParcelizer) {
                removeCallbacks(this.MediaBrowserCompat$ItemReceiver);
                post(this.MediaBrowserCompat$ItemReceiver);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$ItemReceiver(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.IconCompatParcelizer = false;
                removeCallbacks(this.MediaBrowserCompat$ItemReceiver);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.IconCompatParcelizer = false;
                removeCallbacks(this.MediaBrowserCompat$ItemReceiver);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.IconCompatParcelizer = true;
            }
        }
    }

    static class IconCompatParcelizer {
        Method IconCompatParcelizer;
        Method MediaBrowserCompat$CustomActionResultReceiver;
        Method read;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        IconCompatParcelizer() {
            /*
                r5 = this;
                r5.<init>()
                r0 = 0
                r1 = 1
                java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x0014 }
                java.lang.Class<android.widget.AutoCompleteTextView> r3 = android.widget.AutoCompleteTextView.class
                java.lang.String r4 = "doBeforeTextChanged"
                java.lang.reflect.Method r2 = r3.getDeclaredMethod(r4, r2)     // Catch:{ NoSuchMethodException -> 0x0014 }
                r5.IconCompatParcelizer = r2     // Catch:{ NoSuchMethodException -> 0x0014 }
                r2.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x0014 }
            L_0x0014:
                java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x0023 }
                java.lang.Class<android.widget.AutoCompleteTextView> r3 = android.widget.AutoCompleteTextView.class
                java.lang.String r4 = "doAfterTextChanged"
                java.lang.reflect.Method r2 = r3.getDeclaredMethod(r4, r2)     // Catch:{ NoSuchMethodException -> 0x0023 }
                r5.MediaBrowserCompat$CustomActionResultReceiver = r2     // Catch:{ NoSuchMethodException -> 0x0023 }
                r2.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x0023 }
            L_0x0023:
                java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x0036 }
                java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x0036 }
                r2[r0] = r3     // Catch:{ NoSuchMethodException -> 0x0036 }
                java.lang.Class<android.widget.AutoCompleteTextView> r0 = android.widget.AutoCompleteTextView.class
                java.lang.String r3 = "ensureImeVisible"
                java.lang.reflect.Method r0 = r0.getMethod(r3, r2)     // Catch:{ NoSuchMethodException -> 0x0036 }
                r5.read = r0     // Catch:{ NoSuchMethodException -> 0x0036 }
                r0.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x0036 }
            L_0x0036:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.IconCompatParcelizer.<init>():void");
        }
    }

    private void ParcelableVolumeInfo() {
        int i = 0;
        if (!((this.setVisibility || this.setSubtitle) && !this.setContentView) || !(this.write.getVisibility() == 0 || this.PlaybackStateCompat.getVisibility() == 0)) {
            i = 8;
        }
        this.AbsActionBarView.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        if (this.setContentView) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.setBackgroundResource;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getContext().getResources().getDimensionPixelSize(AlertController$RecycleListView.IconCompatParcelizer.abc_search_view_preferred_width), size);
        } else if (mode == 0) {
            size = this.setBackgroundResource;
            if (size <= 0) {
                size = getContext().getResources().getDimensionPixelSize(AlertController$RecycleListView.IconCompatParcelizer.abc_search_view_preferred_width);
            }
        } else if (mode == 1073741824 && (i3 = this.setBackgroundResource) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getContext().getResources().getDimensionPixelSize(AlertController$RecycleListView.IconCompatParcelizer.abc_search_view_preferred_height), size2);
        } else if (mode2 == 0) {
            size2 = getContext().getResources().getDimensionPixelSize(AlertController$RecycleListView.IconCompatParcelizer.abc_search_view_preferred_height);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: package-private */
    public final void MediaSessionCompat$Token() {
        MediaBrowserCompat$CustomActionResultReceiver(this.setContentView);
        post(this.ActionBarContainer);
        if (this.MediaSessionCompat$QueueItem.hasFocus()) {
            MediaBrowserCompat$ItemReceiver();
        }
    }
}

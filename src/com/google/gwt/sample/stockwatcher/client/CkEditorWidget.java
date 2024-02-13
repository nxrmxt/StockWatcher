package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;

public class CkEditorWidget extends Composite {
    //private SimplePanel container = new SimplePanel();

    public CkEditorWidget() {
        initCKEditor();
    }

    private native void initCKEditor() /*-{
        var editor = $wnd.CKEDITOR.appendTo(this.@com.google.gwt.sample.stockwatcher.client.CkEditorWidget::container.getElement()());
        editor.setData('<p>Hello, CKEditor!</p>');
    }-*/;
}

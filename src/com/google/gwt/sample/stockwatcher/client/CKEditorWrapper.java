package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.TakesValue;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CKEditorWrapper extends Composite implements TakesValue<String> {

    TextArea text = new TextArea();
    CheckBox check = new CheckBox();
    VerticalPanel panel = new VerticalPanel();

    protected JavaScriptObject editor;

    public CKEditorWrapper() {
        // panel.add(text);
        // panel.add(check);
        initWidget(text);
        // initWidget(check);
        initCKEditor();

    }

    private native void initCKEditor() /*-{
        var editorContainer = $doc.getElementById("editor-container");
         //var l = .toString()
         //$wnd.alert("Hello World")
         //$wnd.console.log("There is some eroor");
         $wnd.CKEDITOR.replace(editorContainer);  
         //var editorContainer = $doc.getElementById("editor-container");
  
  }-*/;

    @Override
    public native void setValue(String value) /*-{
    this.@com.google.gwt.sample.stockwatcher.client.CKEditorWrapper::editor.setData(value);
  }-*/;

    @Override
    public native String getValue() /*-{
    this.@com.google.gwt.sample.stockwatcher.client.CKEditorWrapper::editor.setData(value);
  }-*/;

}

/*
 * 
 * 
 * private native void initCKEditor() /*-{
 * // Get the existing div element with id "editor-container"
 * var editorContainer = $doc.getElementById("editor-container");
 * 
 * // Initialize CKEditor 5 with basic configuration
 * // (Refer to CKEditor 5 documentation for options)
 * var editor = $wnd.CKEDITOR.create(editorContainer, {
 * toolbar: ['basicEditing', 'paragraph'],
 * // ...other desired configurations
 * });
 * 
 * // Add an event listener for content changes (optional)
 * editor.on('change', function(event) {
 * // Handle content change event if needed
 * });
 * }-
 */;

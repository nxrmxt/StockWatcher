package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.sample.stockwatcher.client.CKEditorWrapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class StockWatcher implements EntryPoint {

  public void onModuleLoad() {
    CKEditorWrapper ckEditorWrapper = new CKEditorWrapper();
    Label myLabel = new Label("This is a label");
    HorizontalPanel panel = new HorizontalPanel();
    panel.add(myLabel);

    // Add CKEditorWrapper to the RootPanel
    RootPanel.get().add(panel);
    RootPanel.get().remove(panel);
    RootPanel.get().add(ckEditorWrapper);

  }
}

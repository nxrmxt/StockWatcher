package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MyButtonWrapper extends VerticalPanel {

    private Button myButton;
    private Label resultLabel;

    public MyButtonWrapper() {
        initialize();
        setupUI();
    }

    private void initialize() {
        // Create a button
        myButton = new Button("Click me!");

        // Create a label to display a message
        resultLabel = new Label();

        // Add a click handler to the button
        myButton.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                // Handle button click
                resultLabel.setText("Button clicked!");
            }
        });
    }

    private void setupUI() {
        // Add the button and label to the wrapper panel
        add(myButton);
        add(resultLabel);
    }

    // Optional: Add methods to interact with the button and label from external
    // code
    public Button getButton() {
        return myButton;
    }

    public Label getResultLabel() {
        return resultLabel;
    }
}
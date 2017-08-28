package com.jcalc.pkg;

import org.junit.Test;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.stage.Stage;

public class MainTest {

	@Test
	public void javaFXTest1() throws InterruptedException {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				new JFXPanel();
				Platform.runLater(new Runnable() {

					@Override
					public void run() {
						new Main().start(new Stage());
					}
				});
			}
		});
		thread.start();
		Thread.sleep(10000);
	}

}
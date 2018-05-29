package org.freeplane.plugin.configurationservice;

import java.awt.event.ActionEvent;

import org.freeplane.core.ui.AFreeplaneAction;
import org.freeplane.features.map.MapModel;
import org.freeplane.features.mode.Controller;
import org.freeplane.view.swing.map.MapView;

class StartConfigurationSessionAction extends AFreeplaneAction {
	private static final String ACTION_NAME = "StartConfigurationSessionAction";
	private static final long serialVersionUID = 1L;
	private static final String mindMapFile = "C:\\neri\\mappementali\\HelloWorld.mm";
	private static int port =0;
	private ConfigurationSession configurationSession;
	
	public StartConfigurationSessionAction(ConfigurationSession configurationSession) {
		super(ACTION_NAME);
		this.configurationSession = configurationSession;
	}

	public void actionPerformed(final ActionEvent e) {
		configurationSession.start(mindMapFile);
	}
}

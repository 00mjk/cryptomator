package org.cryptomator.launcher;

import javax.inject.Singleton;

import org.cryptomator.logging.DebugMode;
import org.cryptomator.ui.controllers.ViewControllerLoader;

import dagger.Component;

@Singleton
@Component(modules = LauncherModule.class)
interface LauncherComponent {

	ViewControllerLoader fxmlLoader();

	DebugMode debugMode();

}

/*
 * Copyright © 2010
 *
 * This file is part of "WS Portal" web application.
 *
 * WS Portal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WS Portal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WS Portal.  If not, see <http://www.gnu.org/licenses/>.
 */
package it.unical.inf.wsportal.client.callback;

import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.MessageBoxEvent;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Response;
import it.unical.inf.wsportal.client.util.Toolkit;

/**
 * 
 * @version 0.1
 * @author Simone Spaccarotella <i><a href="mailto:spa.simone@gmail.com">spa.simone@gmail.com</a></i>,
 *         Carmine Dodaro <i><a href="mailto:carminedodaro@gmail.com">carminedodaro@gmail.com</a></i>
 */
public abstract class Callback implements RequestCallback, Listener<MessageBoxEvent> {

    @Override
    public void onResponseReceived(Request request, Response response) {
    }

    @Override
    public void onError(Request request, Throwable exception) {
        Toolkit.showServerError(exception);
    }

    @Override
    public void handleEvent(MessageBoxEvent be) {
    }
}
